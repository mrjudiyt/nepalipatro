package com.facebook.appevents.aam;

import android.app.Activity;
import com.facebook.FacebookSdk;
import com.facebook.internal.AttributionIdentifiers;
import com.facebook.internal.FetchedAppSettings;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.Utility;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import f3.a;
import kotlin.jvm.internal.m;

/* compiled from: MetadataIndexer.kt */
public final class MetadataIndexer {
    public static final MetadataIndexer INSTANCE = new MetadataIndexer();
    private static final String TAG = MetadataIndexer.class.getCanonicalName();
    private static boolean enabled;

    private MetadataIndexer() {
    }

    public static final void enable() {
        Class<MetadataIndexer> cls = MetadataIndexer.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            try {
                FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
                FacebookSdk.getExecutor().execute(a.f14409h);
            } catch (Exception e10) {
                Utility utility = Utility.INSTANCE;
                Utility.logd(TAG, e10);
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: enable$lambda-0  reason: not valid java name */
    public static final void m42enable$lambda0() {
        Class<MetadataIndexer> cls = MetadataIndexer.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            try {
                FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
                if (!AttributionIdentifiers.Companion.isTrackingLimited(FacebookSdk.getApplicationContext())) {
                    INSTANCE.updateRules();
                    enabled = true;
                }
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }

    public static final void onActivityResumed(Activity activity) {
        Class<MetadataIndexer> cls = MetadataIndexer.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            try {
                m.f(activity, "activity");
                try {
                    if (!enabled) {
                        return;
                    }
                    if (!MetadataRule.Companion.getRules().isEmpty()) {
                        MetadataViewObserver.Companion.startTrackingActivity(activity);
                    }
                } catch (Exception unused) {
                }
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }

    private final void updateRules() {
        String rawAamRules;
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                FetchedAppSettingsManager fetchedAppSettingsManager = FetchedAppSettingsManager.INSTANCE;
                FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
                FetchedAppSettings queryAppSettings = FetchedAppSettingsManager.queryAppSettings(FacebookSdk.getApplicationId(), false);
                if (queryAppSettings != null && (rawAamRules = queryAppSettings.getRawAamRules()) != null) {
                    MetadataRule.Companion.updateRules(rawAamRules);
                }
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }
}
