package com.facebook.appevents.iap;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import com.facebook.FacebookSdk;
import com.facebook.internal.FeatureManager;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.m;

/* compiled from: InAppPurchaseManager.kt */
public final class InAppPurchaseManager {
    private static final String GOOGLE_BILLINGCLIENT_VERSION = "com.google.android.play.billingclient.version";
    public static final InAppPurchaseManager INSTANCE = new InAppPurchaseManager();
    private static final AtomicBoolean enabled = new AtomicBoolean(false);

    private InAppPurchaseManager() {
    }

    public static final void enableAutoLogging() {
        Class<InAppPurchaseManager> cls = InAppPurchaseManager.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            try {
                enabled.set(true);
                startTracking();
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }

    public static final void startTracking() {
        Class<InAppPurchaseManager> cls = InAppPurchaseManager.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            try {
                if (enabled.get()) {
                    if (INSTANCE.usingBillingLib2Plus()) {
                        FeatureManager featureManager = FeatureManager.INSTANCE;
                        if (FeatureManager.isEnabled(FeatureManager.Feature.IapLoggingLib2)) {
                            InAppPurchaseAutoLogger inAppPurchaseAutoLogger = InAppPurchaseAutoLogger.INSTANCE;
                            FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
                            InAppPurchaseAutoLogger.startIapLogging(FacebookSdk.getApplicationContext());
                            return;
                        }
                    }
                    InAppPurchaseActivityLifecycleTracker inAppPurchaseActivityLifecycleTracker = InAppPurchaseActivityLifecycleTracker.INSTANCE;
                    InAppPurchaseActivityLifecycleTracker.startIapLogging();
                }
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }

    private final boolean usingBillingLib2Plus() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return false;
        }
        try {
            FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
            Context applicationContext = FacebookSdk.getApplicationContext();
            ApplicationInfo applicationInfo = applicationContext.getPackageManager().getApplicationInfo(applicationContext.getPackageName(), 128);
            m.e(applicationInfo, "context.packageManager.getApplicationInfo(\n              context.packageName, PackageManager.GET_META_DATA)");
            String string = applicationInfo.metaData.getString(GOOGLE_BILLINGCLIENT_VERSION);
            if (string != null && Integer.parseInt((String) q.c0(string, new String[]{"."}, false, 3, 2, (Object) null).get(0)) >= 2) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            return false;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return false;
        }
    }
}
