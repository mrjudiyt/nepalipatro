package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.measurement.internal.zzie;
import com.google.android.gms.measurement.internal.zzii;
import com.google.android.gms.measurement.internal.zzij;
import com.google.android.gms.measurement.internal.zzkf;
import com.google.common.collect.b0;
import com.google.common.collect.x;
import com.google.firebase.abt.FirebaseABTesting;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.messaging.Constants;
import io.flutter.plugins.firebase.crashlytics.Constants;

/* compiled from: com.google.android.gms:play-services-measurement-api@@21.5.0 */
public final class zzb {
    private static final b0<String> zza = b0.x("_in", "_xa", "_xu", "_aq", "_aa", "_ai", "_ac", FirebaseAnalytics.Event.CAMPAIGN_DETAILS, "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire");
    private static final x<String> zzb = x.z("_e", "_f", "_iap", "_s", "_au", "_ui", "_cd");
    private static final x<String> zzc = x.v("auto", "app", "am");
    private static final x<String> zzd = x.u("_r", "_dbg");
    private static final x<String> zze = new x.a().g(zzij.zza).g(zzij.zzb).h();
    private static final x<String> zzf = x.u("^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$");

    public static Bundle zza(AnalyticsConnector.ConditionalUserProperty conditionalUserProperty) {
        Bundle bundle = new Bundle();
        String str = conditionalUserProperty.origin;
        if (str != null) {
            bundle.putString("origin", str);
        }
        String str2 = conditionalUserProperty.name;
        if (str2 != null) {
            bundle.putString("name", str2);
        }
        Object obj = conditionalUserProperty.value;
        if (obj != null) {
            zzie.zza(bundle, obj);
        }
        String str3 = conditionalUserProperty.triggerEventName;
        if (str3 != null) {
            bundle.putString(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, str3);
        }
        bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, conditionalUserProperty.triggerTimeout);
        String str4 = conditionalUserProperty.timedOutEventName;
        if (str4 != null) {
            bundle.putString(AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_NAME, str4);
        }
        Bundle bundle2 = conditionalUserProperty.timedOutEventParams;
        if (bundle2 != null) {
            bundle.putBundle(AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_PARAMS, bundle2);
        }
        String str5 = conditionalUserProperty.triggeredEventName;
        if (str5 != null) {
            bundle.putString(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_NAME, str5);
        }
        Bundle bundle3 = conditionalUserProperty.triggeredEventParams;
        if (bundle3 != null) {
            bundle.putBundle(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_PARAMS, bundle3);
        }
        bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, conditionalUserProperty.timeToLive);
        String str6 = conditionalUserProperty.expiredEventName;
        if (str6 != null) {
            bundle.putString(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME, str6);
        }
        Bundle bundle4 = conditionalUserProperty.expiredEventParams;
        if (bundle4 != null) {
            bundle.putBundle(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS, bundle4);
        }
        bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, conditionalUserProperty.creationTimestamp);
        bundle.putBoolean(AppMeasurementSdk.ConditionalUserProperty.ACTIVE, conditionalUserProperty.active);
        bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP, conditionalUserProperty.triggeredTimestamp);
        return bundle;
    }

    public static String zzb(String str) {
        String zzb2 = zzii.zzb(str);
        return zzb2 != null ? zzb2 : str;
    }

    public static boolean zzc(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        int codePointAt = str.codePointAt(0);
        if (!Character.isLetter(codePointAt) && codePointAt != 95) {
            return false;
        }
        int length = str.length();
        int charCount = Character.charCount(codePointAt);
        while (charCount < length) {
            int codePointAt2 = str.codePointAt(charCount);
            if (codePointAt2 != 95 && !Character.isLetterOrDigit(codePointAt2)) {
                return false;
            }
            charCount += Character.charCount(codePointAt2);
        }
        return true;
    }

    public static boolean zzd(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        int codePointAt = str.codePointAt(0);
        if (!Character.isLetter(codePointAt)) {
            return false;
        }
        int length = str.length();
        int charCount = Character.charCount(codePointAt);
        while (charCount < length) {
            int codePointAt2 = str.codePointAt(charCount);
            if (codePointAt2 != 95 && !Character.isLetterOrDigit(codePointAt2)) {
                return false;
            }
            charCount += Character.charCount(codePointAt2);
        }
        return true;
    }

    public static boolean zze(String str) {
        return !zza.contains(str);
    }

    public static boolean zzf(String str) {
        return !zzc.contains(str);
    }

    public static boolean zzb(String str, String str2, Bundle bundle) {
        if (!"_cmp".equals(str2)) {
            return true;
        }
        if (!zzf(str) || bundle == null) {
            return false;
        }
        x<String> xVar = zzd;
        int size = xVar.size();
        int i10 = 0;
        while (i10 < size) {
            String str3 = xVar.get(i10);
            i10++;
            if (bundle.containsKey(str3)) {
                return false;
            }
        }
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case 101200:
                if (str.equals("fcm")) {
                    c10 = 0;
                    break;
                }
                break;
            case 101230:
                if (str.equals("fdl")) {
                    c10 = 1;
                    break;
                }
                break;
            case 3142703:
                if (str.equals("fiam")) {
                    c10 = 2;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                bundle.putString("_cis", "fcm_integration");
                return true;
            case 1:
                bundle.putString("_cis", "fdl_integration");
                return true;
            case 2:
                bundle.putString("_cis", "fiam_integration");
                return true;
            default:
                return false;
        }
    }

    public static boolean zzb(AnalyticsConnector.ConditionalUserProperty conditionalUserProperty) {
        String str;
        if (conditionalUserProperty == null || (str = conditionalUserProperty.origin) == null || str.isEmpty()) {
            return false;
        }
        Object obj = conditionalUserProperty.value;
        if ((obj != null && zzkf.zza(obj) == null) || !zzf(str) || !zza(str, conditionalUserProperty.name)) {
            return false;
        }
        String str2 = conditionalUserProperty.expiredEventName;
        if (str2 != null && (!zza(str2, conditionalUserProperty.expiredEventParams) || !zzb(str, conditionalUserProperty.expiredEventName, conditionalUserProperty.expiredEventParams))) {
            return false;
        }
        String str3 = conditionalUserProperty.triggeredEventName;
        if (str3 != null && (!zza(str3, conditionalUserProperty.triggeredEventParams) || !zzb(str, conditionalUserProperty.triggeredEventName, conditionalUserProperty.triggeredEventParams))) {
            return false;
        }
        String str4 = conditionalUserProperty.timedOutEventName;
        if (str4 == null) {
            return true;
        }
        if (zza(str4, conditionalUserProperty.timedOutEventParams) && zzb(str, conditionalUserProperty.timedOutEventName, conditionalUserProperty.timedOutEventParams)) {
            return true;
        }
        return false;
    }

    public static AnalyticsConnector.ConditionalUserProperty zza(Bundle bundle) {
        Class cls = Long.class;
        Class cls2 = String.class;
        Preconditions.checkNotNull(bundle);
        AnalyticsConnector.ConditionalUserProperty conditionalUserProperty = new AnalyticsConnector.ConditionalUserProperty();
        conditionalUserProperty.origin = (String) Preconditions.checkNotNull((String) zzie.zza(bundle, "origin", cls2, null));
        conditionalUserProperty.name = (String) Preconditions.checkNotNull((String) zzie.zza(bundle, "name", cls2, null));
        conditionalUserProperty.value = zzie.zza(bundle, "value", Object.class, null);
        conditionalUserProperty.triggerEventName = (String) zzie.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, cls2, null);
        conditionalUserProperty.triggerTimeout = ((Long) zzie.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, cls, 0L)).longValue();
        conditionalUserProperty.timedOutEventName = (String) zzie.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_NAME, cls2, null);
        conditionalUserProperty.timedOutEventParams = (Bundle) zzie.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_PARAMS, Bundle.class, null);
        conditionalUserProperty.triggeredEventName = (String) zzie.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_NAME, cls2, null);
        conditionalUserProperty.triggeredEventParams = (Bundle) zzie.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_PARAMS, Bundle.class, null);
        conditionalUserProperty.timeToLive = ((Long) zzie.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, cls, 0L)).longValue();
        conditionalUserProperty.expiredEventName = (String) zzie.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME, cls2, null);
        conditionalUserProperty.expiredEventParams = (Bundle) zzie.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS, Bundle.class, null);
        conditionalUserProperty.active = ((Boolean) zzie.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.ACTIVE, Boolean.class, Boolean.FALSE)).booleanValue();
        conditionalUserProperty.creationTimestamp = ((Long) zzie.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, cls, 0L)).longValue();
        conditionalUserProperty.triggeredTimestamp = ((Long) zzie.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP, cls, 0L)).longValue();
        return conditionalUserProperty;
    }

    public static String zza(String str) {
        String zza2 = zzii.zza(str);
        return zza2 != null ? zza2 : str;
    }

    public static void zza(String str, String str2, Bundle bundle) {
        if ("clx".equals(str) && Constants.FIREBASE_APPLICATION_EXCEPTION.equals(str2)) {
            bundle.putLong("_r", 1);
        }
    }

    public static boolean zza(String str, Bundle bundle) {
        if (zzb.contains(str)) {
            return false;
        }
        if (bundle == null) {
            return true;
        }
        x<String> xVar = zzd;
        int size = xVar.size();
        int i10 = 0;
        while (i10 < size) {
            String str2 = xVar.get(i10);
            i10++;
            if (bundle.containsKey(str2)) {
                return false;
            }
        }
        return true;
    }

    public static boolean zza(String str, String str2) {
        if ("_ce1".equals(str2) || "_ce2".equals(str2)) {
            return str.equals("fcm") || str.equals(FirebaseABTesting.OriginService.REMOTE_CONFIG);
        }
        if (Constants.ScionAnalytics.USER_PROPERTY_FIREBASE_LAST_NOTIFICATION.equals(str2)) {
            return str.equals("fcm") || str.equals("fiam");
        }
        if (zze.contains(str2)) {
            return false;
        }
        x<String> xVar = zzf;
        int size = xVar.size();
        int i10 = 0;
        while (i10 < size) {
            String str3 = xVar.get(i10);
            i10++;
            if (str2.matches(str3)) {
                return false;
            }
        }
        return true;
    }
}
