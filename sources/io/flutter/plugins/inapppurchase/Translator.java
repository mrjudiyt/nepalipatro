package io.flutter.plugins.inapppurchase;

import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.PurchaseHistoryRecord;
import com.android.billingclient.api.a;
import com.android.billingclient.api.f;
import com.android.billingclient.api.g;
import com.android.billingclient.api.h;
import com.facebook.share.internal.ShareConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Currency;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

class Translator {
    Translator() {
    }

    static String currencySymbolFromCode(String str) {
        return Currency.getInstance(str).getSymbol();
    }

    static HashMap<String, Object> fromBillingResult(f fVar) {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("responseCode", Integer.valueOf(fVar.b()));
        hashMap.put("debugMessage", fVar.a());
        return hashMap;
    }

    static HashMap<String, Object> fromOneTimePurchaseOfferDetails(g.a aVar) {
        HashMap<String, Object> hashMap = new HashMap<>();
        if (aVar == null) {
            return hashMap;
        }
        hashMap.put("priceAmountMicros", Long.valueOf(aVar.b()));
        hashMap.put("priceCurrencyCode", aVar.c());
        hashMap.put("formattedPrice", aVar.a());
        return hashMap;
    }

    static HashMap<String, Object> fromPricingPhase(g.b bVar) {
        HashMap<String, Object> hashMap = new HashMap<>();
        if (bVar == null) {
            return hashMap;
        }
        hashMap.put("formattedPrice", bVar.c());
        hashMap.put("priceCurrencyCode", bVar.e());
        hashMap.put("priceAmountMicros", Long.valueOf(bVar.d()));
        hashMap.put("billingCycleCount", Integer.valueOf(bVar.a()));
        hashMap.put("billingPeriod", bVar.b());
        hashMap.put("recurrenceMode", Integer.valueOf(bVar.f()));
        return hashMap;
    }

    static List<HashMap<String, Object>> fromPricingPhases(g.c cVar) {
        ArrayList arrayList = new ArrayList();
        for (g.b fromPricingPhase : cVar.a()) {
            arrayList.add(fromPricingPhase(fromPricingPhase));
        }
        return arrayList;
    }

    static HashMap<String, Object> fromProductDetail(g gVar) {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put(ShareConstants.WEB_DIALOG_PARAM_TITLE, gVar.g());
        hashMap.put("description", gVar.a());
        hashMap.put("productId", gVar.d());
        hashMap.put("productType", gVar.e());
        hashMap.put("name", gVar.b());
        g.a c10 = gVar.c();
        if (c10 != null) {
            hashMap.put("oneTimePurchaseOfferDetails", fromOneTimePurchaseOfferDetails(c10));
        }
        List<g.d> f10 = gVar.f();
        if (f10 != null) {
            hashMap.put("subscriptionOfferDetails", fromSubscriptionOfferDetailsList(f10));
        }
        return hashMap;
    }

    static List<HashMap<String, Object>> fromProductDetailsList(List<g> list) {
        if (list == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (g fromProductDetail : list) {
            arrayList.add(fromProductDetail(fromProductDetail));
        }
        return arrayList;
    }

    static HashMap<String, Object> fromPurchase(Purchase purchase) {
        HashMap<String, Object> hashMap = new HashMap<>();
        List<String> f10 = purchase.f();
        hashMap.put("orderId", purchase.c());
        hashMap.put(RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME, purchase.e());
        hashMap.put("purchaseTime", Long.valueOf(purchase.h()));
        hashMap.put("purchaseToken", purchase.i());
        hashMap.put("signature", purchase.k());
        hashMap.put("products", f10);
        hashMap.put("isAutoRenewing", Boolean.valueOf(purchase.m()));
        hashMap.put("originalJson", purchase.d());
        hashMap.put("developerPayload", purchase.b());
        hashMap.put("isAcknowledged", Boolean.valueOf(purchase.l()));
        hashMap.put("purchaseState", Integer.valueOf(purchase.g()));
        hashMap.put(FirebaseAnalytics.Param.QUANTITY, Integer.valueOf(purchase.j()));
        a a10 = purchase.a();
        if (a10 != null) {
            hashMap.put("obfuscatedAccountId", a10.a());
            hashMap.put("obfuscatedProfileId", a10.b());
        }
        return hashMap;
    }

    static HashMap<String, Object> fromPurchaseHistoryRecord(PurchaseHistoryRecord purchaseHistoryRecord) {
        HashMap<String, Object> hashMap = new HashMap<>();
        List<String> c10 = purchaseHistoryRecord.c();
        hashMap.put("purchaseTime", Long.valueOf(purchaseHistoryRecord.d()));
        hashMap.put("purchaseToken", purchaseHistoryRecord.e());
        hashMap.put("signature", purchaseHistoryRecord.g());
        hashMap.put("products", c10);
        hashMap.put("developerPayload", purchaseHistoryRecord.a());
        hashMap.put("originalJson", purchaseHistoryRecord.b());
        hashMap.put(FirebaseAnalytics.Param.QUANTITY, Integer.valueOf(purchaseHistoryRecord.f()));
        return hashMap;
    }

    static List<HashMap<String, Object>> fromPurchaseHistoryRecordList(List<PurchaseHistoryRecord> list) {
        if (list == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (PurchaseHistoryRecord fromPurchaseHistoryRecord : list) {
            arrayList.add(fromPurchaseHistoryRecord(fromPurchaseHistoryRecord));
        }
        return arrayList;
    }

    static List<HashMap<String, Object>> fromPurchasesList(List<Purchase> list) {
        if (list == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (Purchase fromPurchase : list) {
            arrayList.add(fromPurchase(fromPurchase));
        }
        return arrayList;
    }

    static HashMap<String, Object> fromSubscriptionOfferDetails(g.d dVar) {
        HashMap<String, Object> hashMap = new HashMap<>();
        if (dVar == null) {
            return hashMap;
        }
        hashMap.put("offerId", dVar.b());
        hashMap.put("basePlanId", dVar.a());
        hashMap.put("offerTags", dVar.c());
        hashMap.put("offerIdToken", dVar.d());
        hashMap.put("pricingPhases", fromPricingPhases(dVar.e()));
        return hashMap;
    }

    static List<HashMap<String, Object>> fromSubscriptionOfferDetailsList(List<g.d> list) {
        if (list == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (g.d fromSubscriptionOfferDetails : list) {
            arrayList.add(fromSubscriptionOfferDetails(fromSubscriptionOfferDetails));
        }
        return arrayList;
    }

    static h.b toProduct(Map<String, Object> map) {
        return h.b.a().b((String) map.get("productId")).c((String) map.get("productType")).a();
    }

    static List<h.b> toProductList(List<Object> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<Object> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(toProduct((Map) it.next()));
        }
        return arrayList;
    }
}
