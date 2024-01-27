package io.flutter.plugins.inapppurchase;

import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.f;
import io.flutter.plugin.common.MethodChannel;
import java.util.HashMap;
import java.util.List;
import z1.k;

class PluginPurchaseListener implements k {
    static final String ON_PURCHASES_UPDATED = "PurchasesUpdatedListener#onPurchasesUpdated(BillingResult, List<Purchase>)";
    private final MethodChannel channel;

    PluginPurchaseListener(MethodChannel methodChannel) {
        this.channel = methodChannel;
    }

    public void onPurchasesUpdated(f fVar, List<Purchase> list) {
        HashMap hashMap = new HashMap();
        hashMap.put("billingResult", Translator.fromBillingResult(fVar));
        hashMap.put("responseCode", Integer.valueOf(fVar.b()));
        hashMap.put("purchasesList", Translator.fromPurchasesList(list));
        this.channel.invokeMethod(ON_PURCHASES_UPDATED, hashMap);
    }
}
