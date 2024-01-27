package com.facebook.appevents.iap;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import com.facebook.FacebookSdk;
import com.facebook.appevents.internal.AutomaticAnalyticsLogger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.m;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: InAppPurchaseActivityLifecycleTracker.kt */
public final class InAppPurchaseActivityLifecycleTracker {
    private static final String BILLING_ACTIVITY_NAME = "com.android.billingclient.api.ProxyBillingActivity";
    public static final InAppPurchaseActivityLifecycleTracker INSTANCE = new InAppPurchaseActivityLifecycleTracker();
    private static final String SERVICE_INTERFACE_NAME = "com.android.vending.billing.IInAppBillingService$Stub";
    private static final String TAG = InAppPurchaseActivityLifecycleTracker.class.getCanonicalName();
    private static Application.ActivityLifecycleCallbacks callbacks;
    /* access modifiers changed from: private */
    public static Boolean hasBillingActivity;
    private static Boolean hasBillingService;
    /* access modifiers changed from: private */
    public static Object inAppBillingObj;
    private static Intent intent;
    private static final AtomicBoolean isTracking = new AtomicBoolean(false);
    private static ServiceConnection serviceConnection;

    private InAppPurchaseActivityLifecycleTracker() {
    }

    private final void initializeIfNotInitialized() {
        if (hasBillingService == null) {
            InAppPurchaseUtils inAppPurchaseUtils = InAppPurchaseUtils.INSTANCE;
            boolean z10 = true;
            Boolean valueOf = Boolean.valueOf(InAppPurchaseUtils.getClass(SERVICE_INTERFACE_NAME) != null);
            hasBillingService = valueOf;
            if (!m.a(valueOf, Boolean.FALSE)) {
                if (InAppPurchaseUtils.getClass(BILLING_ACTIVITY_NAME) == null) {
                    z10 = false;
                }
                hasBillingActivity = Boolean.valueOf(z10);
                InAppPurchaseEventManager inAppPurchaseEventManager = InAppPurchaseEventManager.INSTANCE;
                InAppPurchaseEventManager.clearSkuDetailsCache();
                Intent intent2 = new Intent("com.android.vending.billing.InAppBillingService.BIND").setPackage("com.android.vending");
                m.e(intent2, "Intent(\"com.android.vending.billing.InAppBillingService.BIND\")\n            .setPackage(\"com.android.vending\")");
                intent = intent2;
                serviceConnection = new InAppPurchaseActivityLifecycleTracker$initializeIfNotInitialized$1();
                callbacks = new InAppPurchaseActivityLifecycleTracker$initializeIfNotInitialized$2();
            }
        }
    }

    /* access modifiers changed from: private */
    public final void logPurchase(Context context, ArrayList<String> arrayList, boolean z10) {
        if (!arrayList.isEmpty()) {
            HashMap hashMap = new HashMap();
            ArrayList arrayList2 = new ArrayList();
            Iterator<String> it = arrayList.iterator();
            while (it.hasNext()) {
                String next = it.next();
                try {
                    String string = new JSONObject(next).getString("productId");
                    m.e(string, "sku");
                    m.e(next, "purchase");
                    hashMap.put(string, next);
                    arrayList2.add(string);
                } catch (JSONException unused) {
                }
            }
            InAppPurchaseEventManager inAppPurchaseEventManager = InAppPurchaseEventManager.INSTANCE;
            for (Map.Entry next2 : InAppPurchaseEventManager.getSkuDetails(context, arrayList2, inAppBillingObj, z10).entrySet()) {
                String str = (String) next2.getValue();
                String str2 = (String) hashMap.get((String) next2.getKey());
                if (str2 != null) {
                    AutomaticAnalyticsLogger automaticAnalyticsLogger = AutomaticAnalyticsLogger.INSTANCE;
                    AutomaticAnalyticsLogger.logPurchase(str2, str, z10);
                }
            }
        }
    }

    public static final void startIapLogging() {
        InAppPurchaseActivityLifecycleTracker inAppPurchaseActivityLifecycleTracker = INSTANCE;
        inAppPurchaseActivityLifecycleTracker.initializeIfNotInitialized();
        if (!m.a(hasBillingService, Boolean.FALSE)) {
            AutomaticAnalyticsLogger automaticAnalyticsLogger = AutomaticAnalyticsLogger.INSTANCE;
            if (AutomaticAnalyticsLogger.isImplicitPurchaseLoggingEnabled()) {
                inAppPurchaseActivityLifecycleTracker.startTracking();
            }
        }
    }

    private final void startTracking() {
        if (isTracking.compareAndSet(false, true)) {
            FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
            Context applicationContext = FacebookSdk.getApplicationContext();
            if (applicationContext instanceof Application) {
                Application application = (Application) applicationContext;
                Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = callbacks;
                if (activityLifecycleCallbacks != null) {
                    application.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
                    Intent intent2 = intent;
                    if (intent2 != null) {
                        ServiceConnection serviceConnection2 = serviceConnection;
                        if (serviceConnection2 != null) {
                            applicationContext.bindService(intent2, serviceConnection2, 1);
                        } else {
                            m.x("serviceConnection");
                            throw null;
                        }
                    } else {
                        m.x("intent");
                        throw null;
                    }
                } else {
                    m.x("callbacks");
                    throw null;
                }
            }
        }
    }
}
