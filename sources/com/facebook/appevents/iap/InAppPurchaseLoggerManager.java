package com.facebook.appevents.iap;

import android.content.SharedPreferences;
import com.facebook.FacebookSdk;
import com.facebook.appevents.internal.AutomaticAnalyticsLogger;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.m;
import org.json.JSONObject;

/* compiled from: InAppPurchaseLoggerManager.kt */
public final class InAppPurchaseLoggerManager {
    private static final int CACHE_CLEAR_TIME_LIMIT_SEC = 604800;
    public static final InAppPurchaseLoggerManager INSTANCE = new InAppPurchaseLoggerManager();
    private static final String LAST_CLEARED_TIME = "LAST_CLEARED_TIME";
    private static final String LAST_QUERY_PURCHASE_HISTORY_TIME = "LAST_QUERY_PURCHASE_HISTORY_TIME";
    private static final String PRODUCT_DETAILS_STORE = "com.facebook.internal.iap.PRODUCT_DETAILS";
    private static final String PURCHASE_DETAILS_SET = "PURCHASE_DETAILS_SET";
    private static final int PURCHASE_IN_CACHE_INTERVAL = 86400;
    private static final String PURCHASE_TIME = "purchaseTime";
    private static final Map<String, Long> cachedPurchaseMap = new ConcurrentHashMap();
    private static final Set<String> cachedPurchaseSet = new CopyOnWriteArraySet();
    private static SharedPreferences sharedPreferences;

    private InAppPurchaseLoggerManager() {
    }

    public static final boolean eligibleQueryPurchaseHistory() {
        Class<InAppPurchaseLoggerManager> cls = InAppPurchaseLoggerManager.class;
        if (CrashShieldHandler.isObjectCrashing(cls)) {
            return false;
        }
        try {
            INSTANCE.readPurchaseCache();
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            SharedPreferences sharedPreferences2 = sharedPreferences;
            if (sharedPreferences2 != null) {
                long j10 = sharedPreferences2.getLong(LAST_QUERY_PURCHASE_HISTORY_TIME, 0);
                if (j10 != 0 && currentTimeMillis - j10 < ((long) PURCHASE_IN_CACHE_INTERVAL)) {
                    return false;
                }
                SharedPreferences sharedPreferences3 = sharedPreferences;
                if (sharedPreferences3 != null) {
                    sharedPreferences3.edit().putLong(LAST_QUERY_PURCHASE_HISTORY_TIME, currentTimeMillis).apply();
                    return true;
                }
                m.x("sharedPreferences");
                throw null;
            }
            m.x("sharedPreferences");
            throw null;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, cls);
            return false;
        }
    }

    public static final void filterPurchaseLogging(Map<String, JSONObject> map, Map<String, ? extends JSONObject> map2) {
        Class<InAppPurchaseLoggerManager> cls = InAppPurchaseLoggerManager.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            try {
                m.f(map, "purchaseDetailsMap");
                m.f(map2, "skuDetailsMap");
                InAppPurchaseLoggerManager inAppPurchaseLoggerManager = INSTANCE;
                inAppPurchaseLoggerManager.readPurchaseCache();
                inAppPurchaseLoggerManager.logPurchases(inAppPurchaseLoggerManager.constructLoggingReadyMap$facebook_core_release(inAppPurchaseLoggerManager.cacheDeDupPurchase$facebook_core_release(map), map2));
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }

    private final void logPurchases(Map<String, String> map) {
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                for (Map.Entry next : map.entrySet()) {
                    String str = (String) next.getKey();
                    String str2 = (String) next.getValue();
                    if (!(str == null || str2 == null)) {
                        AutomaticAnalyticsLogger automaticAnalyticsLogger = AutomaticAnalyticsLogger.INSTANCE;
                        AutomaticAnalyticsLogger.logPurchase(str, str2, false);
                    }
                }
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    private final void readPurchaseCache() {
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
                SharedPreferences sharedPreferences2 = FacebookSdk.getApplicationContext().getSharedPreferences("com.facebook.internal.SKU_DETAILS", 0);
                SharedPreferences sharedPreferences3 = FacebookSdk.getApplicationContext().getSharedPreferences("com.facebook.internal.PURCHASE", 0);
                if (sharedPreferences2.contains(LAST_CLEARED_TIME)) {
                    sharedPreferences2.edit().clear().apply();
                    sharedPreferences3.edit().clear().apply();
                }
                SharedPreferences sharedPreferences4 = FacebookSdk.getApplicationContext().getSharedPreferences(PRODUCT_DETAILS_STORE, 0);
                m.e(sharedPreferences4, "getApplicationContext().getSharedPreferences(PRODUCT_DETAILS_STORE, Context.MODE_PRIVATE)");
                sharedPreferences = sharedPreferences4;
                Set<String> set = cachedPurchaseSet;
                if (sharedPreferences4 != null) {
                    Collection stringSet = sharedPreferences4.getStringSet(PURCHASE_DETAILS_SET, new HashSet());
                    if (stringSet == null) {
                        stringSet = new HashSet();
                    }
                    set.addAll(stringSet);
                    for (String c02 : set) {
                        List c03 = q.c0(c02, new String[]{";"}, false, 2, 2, (Object) null);
                        cachedPurchaseMap.put(c03.get(0), Long.valueOf(Long.parseLong((String) c03.get(1))));
                    }
                    clearOutdatedProductInfoInCache$facebook_core_release();
                    return;
                }
                m.x("sharedPreferences");
                throw null;
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    public final Map<String, JSONObject> cacheDeDupPurchase$facebook_core_release(Map<String, JSONObject> map) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            m.f(map, "purchaseDetailsMap");
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            for (Map.Entry entry : h0.l(map).entrySet()) {
                String str = (String) entry.getKey();
                JSONObject jSONObject = (JSONObject) entry.getValue();
                try {
                    if (jSONObject.has("purchaseToken")) {
                        String string = jSONObject.getString("purchaseToken");
                        if (cachedPurchaseMap.containsKey(string)) {
                            map.remove(str);
                        } else {
                            Set<String> set = cachedPurchaseSet;
                            set.add(string + ';' + currentTimeMillis);
                        }
                    }
                } catch (Exception unused) {
                }
            }
            SharedPreferences sharedPreferences2 = sharedPreferences;
            if (sharedPreferences2 != null) {
                sharedPreferences2.edit().putStringSet(PURCHASE_DETAILS_SET, cachedPurchaseSet).apply();
                return new HashMap(map);
            }
            m.x("sharedPreferences");
            throw null;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    public final void clearOutdatedProductInfoInCache$facebook_core_release() {
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                long currentTimeMillis = System.currentTimeMillis() / 1000;
                SharedPreferences sharedPreferences2 = sharedPreferences;
                if (sharedPreferences2 != null) {
                    long j10 = sharedPreferences2.getLong(LAST_CLEARED_TIME, 0);
                    if (j10 == 0) {
                        SharedPreferences sharedPreferences3 = sharedPreferences;
                        if (sharedPreferences3 != null) {
                            sharedPreferences3.edit().putLong(LAST_CLEARED_TIME, currentTimeMillis).apply();
                        } else {
                            m.x("sharedPreferences");
                            throw null;
                        }
                    } else if (currentTimeMillis - j10 > 604800) {
                        for (Map.Entry entry : h0.l(cachedPurchaseMap).entrySet()) {
                            String str = (String) entry.getKey();
                            long longValue = ((Number) entry.getValue()).longValue();
                            if (currentTimeMillis - longValue > 86400) {
                                Set<String> set = cachedPurchaseSet;
                                set.remove(str + ';' + longValue);
                                cachedPurchaseMap.remove(str);
                            }
                        }
                        SharedPreferences sharedPreferences4 = sharedPreferences;
                        if (sharedPreferences4 != null) {
                            sharedPreferences4.edit().putStringSet(PURCHASE_DETAILS_SET, cachedPurchaseSet).putLong(LAST_CLEARED_TIME, currentTimeMillis).apply();
                        } else {
                            m.x("sharedPreferences");
                            throw null;
                        }
                    }
                } else {
                    m.x("sharedPreferences");
                    throw null;
                }
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    public final Map<String, String> constructLoggingReadyMap$facebook_core_release(Map<String, ? extends JSONObject> map, Map<String, ? extends JSONObject> map2) {
        Map<String, ? extends JSONObject> map3 = map2;
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            m.f(map, "purchaseDetailsMap");
            m.f(map3, "skuDetailsMap");
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry next : map.entrySet()) {
                JSONObject jSONObject = (JSONObject) next.getValue();
                JSONObject jSONObject2 = (JSONObject) map3.get((String) next.getKey());
                if (jSONObject != null && jSONObject.has(PURCHASE_TIME)) {
                    try {
                        if (currentTimeMillis - (jSONObject.getLong(PURCHASE_TIME) / 1000) <= 86400) {
                            if (jSONObject2 != null) {
                                String jSONObject3 = jSONObject.toString();
                                m.e(jSONObject3, "purchaseDetail.toString()");
                                String jSONObject4 = jSONObject2.toString();
                                m.e(jSONObject4, "skuDetail.toString()");
                                linkedHashMap.put(jSONObject3, jSONObject4);
                            }
                        }
                    } catch (Exception unused) {
                    }
                }
            }
            return linkedHashMap;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }
}
