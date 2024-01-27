package com.facebook.appevents.iap;

import com.facebook.appevents.iap.InAppPurchaseBillingClientWrapper;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;

/* compiled from: InAppPurchaseAutoLogger.kt */
public final class InAppPurchaseAutoLogger {
    private static final String BILLING_CLIENT_PURCHASE_NAME = "com.android.billingclient.api.Purchase";
    public static final InAppPurchaseAutoLogger INSTANCE = new InAppPurchaseAutoLogger();

    private InAppPurchaseAutoLogger() {
    }

    private final void logPurchase() {
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                InAppPurchaseLoggerManager inAppPurchaseLoggerManager = InAppPurchaseLoggerManager.INSTANCE;
                InAppPurchaseBillingClientWrapper.Companion companion = InAppPurchaseBillingClientWrapper.Companion;
                InAppPurchaseLoggerManager.filterPurchaseLogging(companion.getPurchaseDetailsMap(), companion.getSkuDetailsMap());
                companion.getPurchaseDetailsMap().clear();
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0019, code lost:
        r1 = com.facebook.appevents.iap.InAppPurchaseBillingClientWrapper.Companion;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void startIapLogging(android.content.Context r3) {
        /*
            java.lang.Class<com.facebook.appevents.iap.InAppPurchaseAutoLogger> r0 = com.facebook.appevents.iap.InAppPurchaseAutoLogger.class
            boolean r1 = com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(r0)
            if (r1 == 0) goto L_0x0009
            return
        L_0x0009:
            java.lang.String r1 = "context"
            kotlin.jvm.internal.m.f(r3, r1)     // Catch:{ all -> 0x0042 }
            com.facebook.appevents.iap.InAppPurchaseUtils r1 = com.facebook.appevents.iap.InAppPurchaseUtils.INSTANCE     // Catch:{ all -> 0x0042 }
            java.lang.String r1 = "com.android.billingclient.api.Purchase"
            java.lang.Class r1 = com.facebook.appevents.iap.InAppPurchaseUtils.getClass(r1)     // Catch:{ all -> 0x0042 }
            if (r1 != 0) goto L_0x0019
            return
        L_0x0019:
            com.facebook.appevents.iap.InAppPurchaseBillingClientWrapper$Companion r1 = com.facebook.appevents.iap.InAppPurchaseBillingClientWrapper.Companion     // Catch:{ all -> 0x0042 }
            com.facebook.appevents.iap.InAppPurchaseBillingClientWrapper r3 = r1.getOrCreateInstance(r3)     // Catch:{ all -> 0x0042 }
            if (r3 != 0) goto L_0x0022
            return
        L_0x0022:
            java.util.concurrent.atomic.AtomicBoolean r1 = r1.isServiceConnected()     // Catch:{ all -> 0x0042 }
            boolean r1 = r1.get()     // Catch:{ all -> 0x0042 }
            if (r1 == 0) goto L_0x0041
            com.facebook.appevents.iap.InAppPurchaseLoggerManager r1 = com.facebook.appevents.iap.InAppPurchaseLoggerManager.INSTANCE     // Catch:{ all -> 0x0042 }
            boolean r1 = com.facebook.appevents.iap.InAppPurchaseLoggerManager.eligibleQueryPurchaseHistory()     // Catch:{ all -> 0x0042 }
            java.lang.String r2 = "inapp"
            if (r1 == 0) goto L_0x003c
            com.facebook.appevents.iap.c r1 = com.facebook.appevents.iap.c.f5977h     // Catch:{ all -> 0x0042 }
            r3.queryPurchaseHistory(r2, r1)     // Catch:{ all -> 0x0042 }
            goto L_0x0041
        L_0x003c:
            com.facebook.appevents.iap.d r1 = com.facebook.appevents.iap.d.f5978h     // Catch:{ all -> 0x0042 }
            r3.queryPurchase(r2, r1)     // Catch:{ all -> 0x0042 }
        L_0x0041:
            return
        L_0x0042:
            r3 = move-exception
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.appevents.iap.InAppPurchaseAutoLogger.startIapLogging(android.content.Context):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: startIapLogging$lambda-0  reason: not valid java name */
    public static final void m56startIapLogging$lambda0() {
        Class<InAppPurchaseAutoLogger> cls = InAppPurchaseAutoLogger.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            try {
                INSTANCE.logPurchase();
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: startIapLogging$lambda-1  reason: not valid java name */
    public static final void m57startIapLogging$lambda1() {
        Class<InAppPurchaseAutoLogger> cls = InAppPurchaseAutoLogger.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            try {
                INSTANCE.logPurchase();
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }
}
