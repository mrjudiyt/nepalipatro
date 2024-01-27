package io.flutter.plugins.inapppurchase;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.android.billingclient.api.c;
import com.android.billingclient.api.e;
import com.android.billingclient.api.f;
import com.android.billingclient.api.g;
import com.android.billingclient.api.h;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import z1.a;
import z1.d;
import z1.e;
import z1.l;
import z1.m;

class MethodCallHandlerImpl implements MethodChannel.MethodCallHandler, Application.ActivityLifecycleCallbacks {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final String LOAD_PRODUCT_DOC_URL = "https://github.com/flutter/packages/blob/main/packages/in_app_purchase/in_app_purchase/README.md#loading-products-for-sale";
    private static final int PRORATION_MODE_UNKNOWN_SUBSCRIPTION_UPGRADE_DOWNGRADE_POLICY = 0;
    private static final String TAG = "InAppPurchasePlugin";
    private Activity activity;
    private final Context applicationContext;
    private c billingClient;
    private final BillingClientFactory billingClientFactory;
    private final HashMap<String, g> cachedProducts = new HashMap<>();
    final MethodChannel methodChannel;

    static final class MethodNames {
        static final String ACKNOWLEDGE_PURCHASE = "BillingClient#acknowledgePurchase(AcknowledgePurchaseParams, AcknowledgePurchaseResponseListener)";
        static final String CONSUME_PURCHASE_ASYNC = "BillingClient#consumeAsync(ConsumeParams, ConsumeResponseListener)";
        static final String END_CONNECTION = "BillingClient#endConnection()";
        static final String GET_CONNECTION_STATE = "BillingClient#getConnectionState()";
        static final String IS_FEATURE_SUPPORTED = "BillingClient#isFeatureSupported(String)";
        static final String IS_READY = "BillingClient#isReady()";
        static final String LAUNCH_BILLING_FLOW = "BillingClient#launchBillingFlow(Activity, BillingFlowParams)";
        static final String ON_DISCONNECT = "BillingClientStateListener#onBillingServiceDisconnected()";
        static final String QUERY_PRODUCT_DETAILS = "BillingClient#queryProductDetailsAsync(QueryProductDetailsParams, ProductDetailsResponseListener)";
        static final String QUERY_PURCHASES_ASYNC = "BillingClient#queryPurchasesAsync(QueryPurchaseParams, PurchaseResponseListener)";
        static final String QUERY_PURCHASE_HISTORY_ASYNC = "BillingClient#queryPurchaseHistoryAsync(QueryPurchaseHistoryParams, PurchaseHistoryResponseListener)";
        static final String START_CONNECTION = "BillingClient#startConnection(BillingClientStateListener)";

        private MethodNames() {
        }
    }

    static {
        Class<MethodCallHandlerImpl> cls = MethodCallHandlerImpl.class;
    }

    MethodCallHandlerImpl(Activity activity2, Context context, MethodChannel methodChannel2, BillingClientFactory billingClientFactory2) {
        this.billingClientFactory = billingClientFactory2;
        this.applicationContext = context;
        this.activity = activity2;
        this.methodChannel = methodChannel2;
    }

    private void acknowledgePurchase(String str, MethodChannel.Result result) {
        if (!billingClientError(result)) {
            this.billingClient.a(a.b().b(str).a(), new a(result));
        }
    }

    private boolean billingClientError(MethodChannel.Result result) {
        if (this.billingClient != null) {
            return false;
        }
        result.error("UNAVAILABLE", "BillingClient is unset. Try reconnecting.", (Object) null);
        return true;
    }

    private void consumeAsync(String str, MethodChannel.Result result) {
        if (!billingClientError(result)) {
            b bVar = new b(result);
            this.billingClient.b(e.b().b(str).a(), bVar);
        }
    }

    private void endBillingClientConnection() {
        c cVar = this.billingClient;
        if (cVar != null) {
            cVar.c();
            this.billingClient = null;
        }
    }

    private void endConnection(MethodChannel.Result result) {
        endBillingClientConnection();
        result.success((Object) null);
    }

    private void getConnectionState(MethodChannel.Result result) {
        if (!billingClientError(result)) {
            HashMap hashMap = new HashMap();
            hashMap.put("connectionState", Integer.valueOf(this.billingClient.d()));
            result.success(hashMap);
        }
    }

    private void isFeatureSupported(String str, MethodChannel.Result result) {
        if (!billingClientError(result)) {
            result.success(Boolean.valueOf(this.billingClient.e(str).b() == 0));
        }
    }

    private void isReady(MethodChannel.Result result) {
        if (!billingClientError(result)) {
            result.success(Boolean.valueOf(this.billingClient.f()));
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$queryProductDetailsAsync$0(MethodChannel.Result result, f fVar, List list) {
        updateCachedProducts(list);
        HashMap hashMap = new HashMap();
        hashMap.put("billingResult", Translator.fromBillingResult(fVar));
        hashMap.put("productDetailsList", Translator.fromProductDetailsList(list));
        result.success(hashMap);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$queryPurchaseHistoryAsync$3(MethodChannel.Result result, f fVar, List list) {
        HashMap hashMap = new HashMap();
        hashMap.put("billingResult", Translator.fromBillingResult(fVar));
        hashMap.put("purchaseHistoryRecordList", Translator.fromPurchaseHistoryRecordList(list));
        result.success(hashMap);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$queryPurchasesAsync$2(MethodChannel.Result result, f fVar, List list) {
        HashMap hashMap = new HashMap();
        hashMap.put("responseCode", 0);
        hashMap.put("billingResult", Translator.fromBillingResult(fVar));
        hashMap.put("purchasesList", Translator.fromPurchasesList(list));
        result.success(hashMap);
    }

    private void launchBillingFlow(String str, String str2, String str3, String str4, String str5, String str6, int i10, MethodChannel.Result result) {
        boolean z10;
        String str7 = str;
        String str8 = str2;
        String str9 = str3;
        String str10 = str4;
        String str11 = str5;
        String str12 = str6;
        int i11 = i10;
        MethodChannel.Result result2 = result;
        if (!billingClientError(result2)) {
            g gVar = this.cachedProducts.get(str7);
            if (gVar == null) {
                result2.error("NOT_FOUND", "Details for product " + str7 + " are not available. It might because products were not fetched prior to the call. Please fetch the products first. An example of how to fetch the products could be found here: " + LOAD_PRODUCT_DOC_URL, (Object) null);
                return;
            }
            List<g.d> f10 = gVar.f();
            if (f10 != null) {
                Iterator<g.d> it = f10.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z10 = false;
                        break;
                    }
                    g.d next = it.next();
                    if (str8 != null && str8.equals(next.d())) {
                        z10 = true;
                        break;
                    }
                }
                if (!z10) {
                    result2.error("INVALID_OFFER_TOKEN", "Offer token " + str8 + " for product " + str7 + " is not valid. Make sure to only pass offer tokens that belong to the product. To obtain offer tokens for a product, fetch the products. An example of how to fetch the products could be found here: " + LOAD_PRODUCT_DOC_URL, (Object) null);
                    return;
                }
            }
            if (str11 == null && i11 != 0) {
                result2.error("IN_APP_PURCHASE_REQUIRE_OLD_PRODUCT", "launchBillingFlow failed because oldProduct is null. You must provide a valid oldProduct in order to use a proration mode.", (Object) null);
            } else if (str11 != null && !this.cachedProducts.containsKey(str11)) {
                result2.error("IN_APP_PURCHASE_INVALID_OLD_PRODUCT", "Details for product " + str11 + " are not available. It might because products were not fetched prior to the call. Please fetch the products first. An example of how to fetch the products could be found here: " + LOAD_PRODUCT_DOC_URL, (Object) null);
            } else if (this.activity == null) {
                result2.error("ACTIVITY_UNAVAILABLE", "Details for product " + str7 + " are not available. This method must be run with the app in foreground.", (Object) null);
            } else {
                e.b.a a10 = e.b.a();
                a10.c(gVar);
                if (str8 != null) {
                    a10.b(str8);
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(a10.a());
                e.a d10 = com.android.billingclient.api.e.a().d(arrayList);
                if (str9 != null && !str3.isEmpty()) {
                    d10.b(str9);
                }
                if (str10 != null && !str4.isEmpty()) {
                    d10.c(str10);
                }
                e.c.a a11 = e.c.a();
                if (!(str11 == null || str5.isEmpty() || str12 == null)) {
                    a11.b(str12);
                    setReplaceProrationMode(a11, i11);
                    d10.e(a11.a());
                }
                result2.success(Translator.fromBillingResult(this.billingClient.g(this.activity, d10.a())));
            }
        }
    }

    private void queryProductDetailsAsync(List<h.b> list, MethodChannel.Result result) {
        if (!billingClientError(result)) {
            this.billingClient.i(h.a().b(list).a(), new c(this, result));
        }
    }

    private void queryPurchaseHistoryAsync(String str, MethodChannel.Result result) {
        if (!billingClientError(result)) {
            this.billingClient.j(l.a().b(str).a(), new d(result));
        }
    }

    private void queryPurchasesAsync(String str, MethodChannel.Result result) {
        if (!billingClientError(result)) {
            m.a a10 = m.a();
            a10.b(str);
            this.billingClient.k(a10.a(), new e(result));
        }
    }

    private void setReplaceProrationMode(e.c.a aVar, int i10) {
        aVar.e(i10);
    }

    private void startConnection(final int i10, final MethodChannel.Result result) {
        if (this.billingClient == null) {
            this.billingClient = this.billingClientFactory.createBillingClient(this.applicationContext, this.methodChannel);
        }
        this.billingClient.l(new d() {
            private boolean alreadyFinished = false;

            public void onBillingServiceDisconnected() {
                HashMap hashMap = new HashMap();
                hashMap.put("handle", Integer.valueOf(i10));
                MethodCallHandlerImpl.this.methodChannel.invokeMethod("BillingClientStateListener#onBillingServiceDisconnected()", hashMap);
            }

            public void onBillingSetupFinished(f fVar) {
                if (!this.alreadyFinished) {
                    this.alreadyFinished = true;
                    result.success(Translator.fromBillingResult(fVar));
                }
            }
        });
    }

    public void onActivityCreated(Activity activity2, Bundle bundle) {
    }

    public void onActivityDestroyed(Activity activity2) {
        Context context;
        if (this.activity == activity2 && (context = this.applicationContext) != null) {
            ((Application) context).unregisterActivityLifecycleCallbacks(this);
            endBillingClientConnection();
        }
    }

    public void onActivityPaused(Activity activity2) {
    }

    public void onActivityResumed(Activity activity2) {
    }

    public void onActivitySaveInstanceState(Activity activity2, Bundle bundle) {
    }

    public void onActivityStarted(Activity activity2) {
    }

    public void onActivityStopped(Activity activity2) {
    }

    /* access modifiers changed from: package-private */
    public void onDetachedFromActivity() {
        endBillingClientConnection();
    }

    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        String str = methodCall.method;
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1785095395:
                if (str.equals("BillingClient#isReady()")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1633466906:
                if (str.equals("BillingClient#acknowledgePurchase(AcknowledgePurchaseParams, AcknowledgePurchaseResponseListener)")) {
                    c10 = 1;
                    break;
                }
                break;
            case -1308170612:
                if (str.equals("BillingClient#launchBillingFlow(Activity, BillingFlowParams)")) {
                    c10 = 2;
                    break;
                }
                break;
            case -894725853:
                if (str.equals("BillingClient#queryPurchasesAsync(QueryPurchaseParams, PurchaseResponseListener)")) {
                    c10 = 3;
                    break;
                }
                break;
            case -777997521:
                if (str.equals("BillingClient#isFeatureSupported(String)")) {
                    c10 = 4;
                    break;
                }
                break;
            case -632099334:
                if (str.equals("BillingClient#queryPurchaseHistoryAsync(QueryPurchaseHistoryParams, PurchaseHistoryResponseListener)")) {
                    c10 = 5;
                    break;
                }
                break;
            case -147687227:
                if (str.equals("BillingClient#startConnection(BillingClientStateListener)")) {
                    c10 = 6;
                    break;
                }
                break;
            case 621918779:
                if (str.equals("BillingClient#getConnectionState()")) {
                    c10 = 7;
                    break;
                }
                break;
            case 1559416515:
                if (str.equals("BillingClient#consumeAsync(ConsumeParams, ConsumeResponseListener)")) {
                    c10 = 8;
                    break;
                }
                break;
            case 1715043254:
                if (str.equals("BillingClient#queryProductDetailsAsync(QueryProductDetailsParams, ProductDetailsResponseListener)")) {
                    c10 = 9;
                    break;
                }
                break;
            case 1792566365:
                if (str.equals("BillingClient#endConnection()")) {
                    c10 = 10;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                isReady(result);
                return;
            case 1:
                acknowledgePurchase((String) methodCall.argument("purchaseToken"), result);
                return;
            case 2:
                launchBillingFlow((String) methodCall.argument("product"), (String) methodCall.argument("offerToken"), (String) methodCall.argument("accountId"), (String) methodCall.argument("obfuscatedProfileId"), (String) methodCall.argument("oldProduct"), (String) methodCall.argument("purchaseToken"), methodCall.hasArgument("prorationMode") ? ((Integer) methodCall.argument("prorationMode")).intValue() : 0, result);
                return;
            case 3:
                queryPurchasesAsync((String) methodCall.argument("productType"), result);
                return;
            case 4:
                isFeatureSupported((String) methodCall.argument("feature"), result);
                return;
            case 5:
                queryPurchaseHistoryAsync((String) methodCall.argument("productType"), result);
                return;
            case 6:
                startConnection(((Integer) methodCall.argument("handle")).intValue(), result);
                return;
            case 7:
                getConnectionState(result);
                return;
            case 8:
                consumeAsync((String) methodCall.argument("purchaseToken"), result);
                return;
            case 9:
                queryProductDetailsAsync(Translator.toProductList((List) methodCall.argument("productList")), result);
                return;
            case 10:
                endConnection(result);
                return;
            default:
                result.notImplemented();
                return;
        }
    }

    /* access modifiers changed from: package-private */
    public void setActivity(Activity activity2) {
        this.activity = activity2;
    }

    /* access modifiers changed from: protected */
    public void updateCachedProducts(List<g> list) {
        if (list != null) {
            for (g next : list) {
                this.cachedProducts.put(next.d(), next);
            }
        }
    }
}
