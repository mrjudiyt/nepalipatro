package com.google.android.gms.measurement;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.internal.measurement.zzdd;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.measurement.internal.zzhf;
import com.google.android.gms.measurement.internal.zzie;
import com.google.android.gms.measurement.internal.zzil;
import com.google.android.gms.measurement.internal.zzim;
import com.google.android.gms.measurement.internal.zzjz;
import com.google.android.gms.measurement.internal.zzkf;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@ShowFirstParty
@KeepForSdk
@Deprecated
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.0 */
public class AppMeasurement {
    @ShowFirstParty
    @KeepForSdk
    public static final String CRASH_ORIGIN = "crash";
    @ShowFirstParty
    @KeepForSdk
    public static final String FCM_ORIGIN = "fcm";
    @ShowFirstParty
    @KeepForSdk
    public static final String FIAM_ORIGIN = "fiam";
    private static volatile AppMeasurement zza;
    private final zza zzb;

    @ShowFirstParty
    @KeepForSdk
    /* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.0 */
    public static class ConditionalUserProperty {
        @ShowFirstParty
        @KeepForSdk
        @Keep
        public boolean mActive;
        @ShowFirstParty
        @KeepForSdk
        @Keep
        public String mAppId;
        @ShowFirstParty
        @KeepForSdk
        @Keep
        public long mCreationTimestamp;
        @Keep
        public String mExpiredEventName;
        @Keep
        public Bundle mExpiredEventParams;
        @ShowFirstParty
        @KeepForSdk
        @Keep
        public String mName;
        @ShowFirstParty
        @KeepForSdk
        @Keep
        public String mOrigin;
        @ShowFirstParty
        @KeepForSdk
        @Keep
        public long mTimeToLive;
        @Keep
        public String mTimedOutEventName;
        @Keep
        public Bundle mTimedOutEventParams;
        @ShowFirstParty
        @KeepForSdk
        @Keep
        public String mTriggerEventName;
        @ShowFirstParty
        @KeepForSdk
        @Keep
        public long mTriggerTimeout;
        @Keep
        public String mTriggeredEventName;
        @Keep
        public Bundle mTriggeredEventParams;
        @ShowFirstParty
        @KeepForSdk
        @Keep
        public long mTriggeredTimestamp;
        @ShowFirstParty
        @KeepForSdk
        @Keep
        public Object mValue;

        @KeepForSdk
        public ConditionalUserProperty() {
        }

        ConditionalUserProperty(Bundle bundle) {
            Class cls = Long.class;
            Class cls2 = String.class;
            Preconditions.checkNotNull(bundle);
            this.mAppId = (String) zzie.zza(bundle, "app_id", cls2, null);
            this.mOrigin = (String) zzie.zza(bundle, "origin", cls2, null);
            this.mName = (String) zzie.zza(bundle, "name", cls2, null);
            this.mValue = zzie.zza(bundle, "value", Object.class, null);
            this.mTriggerEventName = (String) zzie.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, cls2, null);
            this.mTriggerTimeout = ((Long) zzie.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, cls, 0L)).longValue();
            this.mTimedOutEventName = (String) zzie.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_NAME, cls2, null);
            this.mTimedOutEventParams = (Bundle) zzie.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_PARAMS, Bundle.class, null);
            this.mTriggeredEventName = (String) zzie.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_NAME, cls2, null);
            this.mTriggeredEventParams = (Bundle) zzie.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_PARAMS, Bundle.class, null);
            this.mTimeToLive = ((Long) zzie.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, cls, 0L)).longValue();
            this.mExpiredEventName = (String) zzie.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME, cls2, null);
            this.mExpiredEventParams = (Bundle) zzie.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS, Bundle.class, null);
            this.mActive = ((Boolean) zzie.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.ACTIVE, Boolean.class, Boolean.FALSE)).booleanValue();
            this.mCreationTimestamp = ((Long) zzie.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, cls, 0L)).longValue();
            this.mTriggeredTimestamp = ((Long) zzie.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP, cls, 0L)).longValue();
        }

        @KeepForSdk
        public ConditionalUserProperty(ConditionalUserProperty conditionalUserProperty) {
            Preconditions.checkNotNull(conditionalUserProperty);
            this.mAppId = conditionalUserProperty.mAppId;
            this.mOrigin = conditionalUserProperty.mOrigin;
            this.mCreationTimestamp = conditionalUserProperty.mCreationTimestamp;
            this.mName = conditionalUserProperty.mName;
            Object obj = conditionalUserProperty.mValue;
            if (obj != null) {
                Object zza = zzkf.zza(obj);
                this.mValue = zza;
                if (zza == null) {
                    this.mValue = conditionalUserProperty.mValue;
                }
            }
            this.mActive = conditionalUserProperty.mActive;
            this.mTriggerEventName = conditionalUserProperty.mTriggerEventName;
            this.mTriggerTimeout = conditionalUserProperty.mTriggerTimeout;
            this.mTimedOutEventName = conditionalUserProperty.mTimedOutEventName;
            if (conditionalUserProperty.mTimedOutEventParams != null) {
                this.mTimedOutEventParams = new Bundle(conditionalUserProperty.mTimedOutEventParams);
            }
            this.mTriggeredEventName = conditionalUserProperty.mTriggeredEventName;
            if (conditionalUserProperty.mTriggeredEventParams != null) {
                this.mTriggeredEventParams = new Bundle(conditionalUserProperty.mTriggeredEventParams);
            }
            this.mTriggeredTimestamp = conditionalUserProperty.mTriggeredTimestamp;
            this.mTimeToLive = conditionalUserProperty.mTimeToLive;
            this.mExpiredEventName = conditionalUserProperty.mExpiredEventName;
            if (conditionalUserProperty.mExpiredEventParams != null) {
                this.mExpiredEventParams = new Bundle(conditionalUserProperty.mExpiredEventParams);
            }
        }
    }

    @ShowFirstParty
    @KeepForSdk
    /* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.0 */
    public interface EventInterceptor extends zzim {
        @ShowFirstParty
        @KeepForSdk
        void interceptEvent(String str, String str2, Bundle bundle, long j10);
    }

    @ShowFirstParty
    @KeepForSdk
    /* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.0 */
    public interface OnEventListener extends zzil {
        @ShowFirstParty
        @KeepForSdk
        void onEvent(String str, String str2, Bundle bundle, long j10);
    }

    /* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.0 */
    private static abstract class zza implements zzjz {
        private zza() {
        }

        /* access modifiers changed from: package-private */
        public abstract Map<String, Object> zza(boolean z10);

        /* access modifiers changed from: package-private */
        public abstract Boolean zzb();

        /* access modifiers changed from: package-private */
        public abstract Double zzc();

        /* access modifiers changed from: package-private */
        public abstract Integer zzd();

        /* access modifiers changed from: package-private */
        public abstract Long zze();

        /* access modifiers changed from: package-private */
        public abstract String zzj();
    }

    private AppMeasurement(zzhf zzhf) {
        this.zzb = new zza(zzhf);
    }

    @ShowFirstParty
    @Keep
    @KeepForSdk
    @Deprecated
    public static AppMeasurement getInstance(Context context) {
        return zza(context, (String) null, (String) null);
    }

    private static AppMeasurement zza(Context context, String str, String str2) {
        if (zza == null) {
            synchronized (AppMeasurement.class) {
                if (zza == null) {
                    zzjz zza2 = zza(context, (Bundle) null);
                    if (zza2 != null) {
                        zza = new AppMeasurement(zza2);
                    } else {
                        zza = new AppMeasurement(zzhf.zza(context, new zzdd(0, 0, true, (String) null, (String) null, (String) null, (Bundle) null, (String) null), (Long) null));
                    }
                }
            }
        }
        return zza;
    }

    @Keep
    public void beginAdUnitExposure(String str) {
        this.zzb.zzb(str);
    }

    @ShowFirstParty
    @KeepForSdk
    @Keep
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        this.zzb.zza(str, str2, bundle);
    }

    @Keep
    public void endAdUnitExposure(String str) {
        this.zzb.zzc(str);
    }

    @Keep
    public long generateEventId() {
        return this.zzb.zza();
    }

    @Keep
    public String getAppInstanceId() {
        return this.zzb.zzf();
    }

    @KeepForSdk
    public Boolean getBoolean() {
        return this.zzb.zzb();
    }

    @ShowFirstParty
    @Keep
    @KeepForSdk
    public List<ConditionalUserProperty> getConditionalUserProperties(String str, String str2) {
        int i10;
        List<Bundle> zza2 = this.zzb.zza(str, str2);
        if (zza2 == null) {
            i10 = 0;
        } else {
            i10 = zza2.size();
        }
        ArrayList arrayList = new ArrayList(i10);
        for (Bundle conditionalUserProperty : zza2) {
            arrayList.add(new ConditionalUserProperty(conditionalUserProperty));
        }
        return arrayList;
    }

    @Keep
    public String getCurrentScreenClass() {
        return this.zzb.zzg();
    }

    @Keep
    public String getCurrentScreenName() {
        return this.zzb.zzh();
    }

    @KeepForSdk
    public Double getDouble() {
        return this.zzb.zzc();
    }

    @Keep
    public String getGmpAppId() {
        return this.zzb.zzi();
    }

    @KeepForSdk
    public Integer getInteger() {
        return this.zzb.zzd();
    }

    @KeepForSdk
    public Long getLong() {
        return this.zzb.zze();
    }

    @ShowFirstParty
    @KeepForSdk
    @Keep
    public int getMaxUserProperties(String str) {
        return this.zzb.zza(str);
    }

    @KeepForSdk
    public String getString() {
        return this.zzb.zzj();
    }

    @ShowFirstParty
    @KeepForSdk
    public Map<String, Object> getUserProperties(boolean z10) {
        return this.zzb.zza(z10);
    }

    @ShowFirstParty
    @Keep
    public void logEventInternal(String str, String str2, Bundle bundle) {
        this.zzb.zzb(str, str2, bundle);
    }

    @ShowFirstParty
    @KeepForSdk
    public void logEventInternalNoInterceptor(String str, String str2, Bundle bundle, long j10) {
        this.zzb.zza(str, str2, bundle, j10);
    }

    @ShowFirstParty
    @KeepForSdk
    public void registerOnMeasurementEventListener(OnEventListener onEventListener) {
        this.zzb.zza((zzil) onEventListener);
    }

    @ShowFirstParty
    @KeepForSdk
    @Keep
    public void setConditionalUserProperty(ConditionalUserProperty conditionalUserProperty) {
        Preconditions.checkNotNull(conditionalUserProperty);
        zza zza2 = this.zzb;
        Bundle bundle = new Bundle();
        String str = conditionalUserProperty.mAppId;
        if (str != null) {
            bundle.putString("app_id", str);
        }
        String str2 = conditionalUserProperty.mOrigin;
        if (str2 != null) {
            bundle.putString("origin", str2);
        }
        String str3 = conditionalUserProperty.mName;
        if (str3 != null) {
            bundle.putString("name", str3);
        }
        Object obj = conditionalUserProperty.mValue;
        if (obj != null) {
            zzie.zza(bundle, obj);
        }
        String str4 = conditionalUserProperty.mTriggerEventName;
        if (str4 != null) {
            bundle.putString(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, str4);
        }
        bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, conditionalUserProperty.mTriggerTimeout);
        String str5 = conditionalUserProperty.mTimedOutEventName;
        if (str5 != null) {
            bundle.putString(AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_NAME, str5);
        }
        Bundle bundle2 = conditionalUserProperty.mTimedOutEventParams;
        if (bundle2 != null) {
            bundle.putBundle(AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_PARAMS, bundle2);
        }
        String str6 = conditionalUserProperty.mTriggeredEventName;
        if (str6 != null) {
            bundle.putString(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_NAME, str6);
        }
        Bundle bundle3 = conditionalUserProperty.mTriggeredEventParams;
        if (bundle3 != null) {
            bundle.putBundle(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_PARAMS, bundle3);
        }
        bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, conditionalUserProperty.mTimeToLive);
        String str7 = conditionalUserProperty.mExpiredEventName;
        if (str7 != null) {
            bundle.putString(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME, str7);
        }
        Bundle bundle4 = conditionalUserProperty.mExpiredEventParams;
        if (bundle4 != null) {
            bundle.putBundle(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS, bundle4);
        }
        bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, conditionalUserProperty.mCreationTimestamp);
        bundle.putBoolean(AppMeasurementSdk.ConditionalUserProperty.ACTIVE, conditionalUserProperty.mActive);
        bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP, conditionalUserProperty.mTriggeredTimestamp);
        zza2.zza(bundle);
    }

    @ShowFirstParty
    @KeepForSdk
    public void setEventInterceptor(EventInterceptor eventInterceptor) {
        this.zzb.zza((zzim) eventInterceptor);
    }

    @ShowFirstParty
    @KeepForSdk
    public void unregisterOnMeasurementEventListener(OnEventListener onEventListener) {
        this.zzb.zzb((zzil) onEventListener);
    }

    /* access modifiers changed from: protected */
    @Keep
    public Map<String, Object> getUserProperties(String str, String str2, boolean z10) {
        return this.zzb.zza(str, str2, z10);
    }

    private AppMeasurement(zzjz zzjz) {
        this.zzb = new zzc(zzjz);
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.google.android.gms.measurement.internal.zzjz zza(android.content.Context r7, android.os.Bundle r8) {
        /*
            r8 = 0
            java.lang.Class<com.google.firebase.analytics.FirebaseAnalytics> r0 = com.google.firebase.analytics.FirebaseAnalytics.class
            java.lang.String r1 = "getScionFrontendApiImplementation"
            r2 = 2
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch:{  }
            java.lang.Class<android.content.Context> r4 = android.content.Context.class
            r5 = 0
            r3[r5] = r4     // Catch:{  }
            java.lang.Class<android.os.Bundle> r4 = android.os.Bundle.class
            r6 = 1
            r3[r6] = r4     // Catch:{  }
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r3)     // Catch:{  }
            java.lang.Object[] r1 = new java.lang.Object[r2]     // Catch:{  }
            r1[r5] = r7     // Catch:{  }
            r1[r6] = r8     // Catch:{  }
            java.lang.Object r7 = r0.invoke(r8, r1)     // Catch:{  }
            com.google.android.gms.measurement.internal.zzjz r7 = (com.google.android.gms.measurement.internal.zzjz) r7     // Catch:{  }
            return r7
        L_0x0023:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.AppMeasurement.zza(android.content.Context, android.os.Bundle):com.google.android.gms.measurement.internal.zzjz");
    }
}
