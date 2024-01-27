package com.google.android.gms.measurement.api;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.internal.measurement.zzdf;
import com.google.android.gms.measurement.internal.zzil;
import com.google.android.gms.measurement.internal.zzim;
import java.util.List;
import java.util.Map;

@ShowFirstParty
@KeepForSdk
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.5.0 */
public class AppMeasurementSdk {
    private final zzdf zza;

    @KeepForSdk
    /* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.5.0 */
    public static final class ConditionalUserProperty {
        @KeepForSdk
        public static final String ACTIVE = "active";
        @KeepForSdk
        public static final String CREATION_TIMESTAMP = "creation_timestamp";
        @KeepForSdk
        public static final String EXPIRED_EVENT_NAME = "expired_event_name";
        @KeepForSdk
        public static final String EXPIRED_EVENT_PARAMS = "expired_event_params";
        @KeepForSdk
        public static final String NAME = "name";
        @KeepForSdk
        public static final String ORIGIN = "origin";
        @KeepForSdk
        public static final String TIMED_OUT_EVENT_NAME = "timed_out_event_name";
        @KeepForSdk
        public static final String TIMED_OUT_EVENT_PARAMS = "timed_out_event_params";
        @KeepForSdk
        public static final String TIME_TO_LIVE = "time_to_live";
        @KeepForSdk
        public static final String TRIGGERED_EVENT_NAME = "triggered_event_name";
        @KeepForSdk
        public static final String TRIGGERED_EVENT_PARAMS = "triggered_event_params";
        @KeepForSdk
        public static final String TRIGGERED_TIMESTAMP = "triggered_timestamp";
        @KeepForSdk
        public static final String TRIGGER_EVENT_NAME = "trigger_event_name";
        @KeepForSdk
        public static final String TRIGGER_TIMEOUT = "trigger_timeout";
        @KeepForSdk
        public static final String VALUE = "value";

        private ConditionalUserProperty() {
        }
    }

    @ShowFirstParty
    @KeepForSdk
    /* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.5.0 */
    public interface EventInterceptor extends zzim {
        @ShowFirstParty
        @KeepForSdk
        void interceptEvent(String str, String str2, Bundle bundle, long j10);
    }

    @ShowFirstParty
    @KeepForSdk
    /* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.5.0 */
    public interface OnEventListener extends zzil {
        @ShowFirstParty
        @KeepForSdk
        void onEvent(String str, String str2, Bundle bundle, long j10);
    }

    public AppMeasurementSdk(zzdf zzdf) {
        this.zza = zzdf;
    }

    @ShowFirstParty
    @KeepForSdk
    public static AppMeasurementSdk getInstance(Context context) {
        return zzdf.zza(context).zzb();
    }

    @KeepForSdk
    public void beginAdUnitExposure(String str) {
        this.zza.zzb(str);
    }

    @KeepForSdk
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        this.zza.zza(str, str2, bundle);
    }

    @KeepForSdk
    public void endAdUnitExposure(String str) {
        this.zza.zzc(str);
    }

    @KeepForSdk
    public long generateEventId() {
        return this.zza.zza();
    }

    @KeepForSdk
    public String getAppIdOrigin() {
        return this.zza.zzd();
    }

    @KeepForSdk
    public String getAppInstanceId() {
        return this.zza.zzf();
    }

    @KeepForSdk
    public List<Bundle> getConditionalUserProperties(String str, String str2) {
        return this.zza.zza(str, str2);
    }

    @KeepForSdk
    public String getCurrentScreenClass() {
        return this.zza.zzg();
    }

    @KeepForSdk
    public String getCurrentScreenName() {
        return this.zza.zzh();
    }

    @KeepForSdk
    public String getGmpAppId() {
        return this.zza.zzi();
    }

    @KeepForSdk
    public int getMaxUserProperties(String str) {
        return this.zza.zza(str);
    }

    @KeepForSdk
    public Map<String, Object> getUserProperties(String str, String str2, boolean z10) {
        return this.zza.zza(str, str2, z10);
    }

    @KeepForSdk
    public void logEvent(String str, String str2, Bundle bundle) {
        this.zza.zzb(str, str2, bundle);
    }

    @KeepForSdk
    public void logEventNoInterceptor(String str, String str2, Bundle bundle, long j10) {
        this.zza.zza(str, str2, bundle, j10);
    }

    @KeepForSdk
    public void performAction(Bundle bundle) {
        this.zza.zza(bundle, false);
    }

    @KeepForSdk
    public Bundle performActionWithResponse(Bundle bundle) {
        return this.zza.zza(bundle, true);
    }

    @ShowFirstParty
    @KeepForSdk
    public void registerOnMeasurementEventListener(OnEventListener onEventListener) {
        this.zza.zza((zzil) onEventListener);
    }

    @KeepForSdk
    public void setConditionalUserProperty(Bundle bundle) {
        this.zza.zza(bundle);
    }

    @KeepForSdk
    public void setConsent(Bundle bundle) {
        this.zza.zzb(bundle);
    }

    @KeepForSdk
    public void setCurrentScreen(Activity activity, String str, String str2) {
        this.zza.zza(activity, str, str2);
    }

    @ShowFirstParty
    @KeepForSdk
    public void setEventInterceptor(EventInterceptor eventInterceptor) {
        this.zza.zza((zzim) eventInterceptor);
    }

    @KeepForSdk
    public void setMeasurementEnabled(Boolean bool) {
        this.zza.zza(bool);
    }

    @KeepForSdk
    public void setUserProperty(String str, String str2, Object obj) {
        this.zza.zza(str, str2, obj, true);
    }

    @ShowFirstParty
    @KeepForSdk
    public void unregisterOnMeasurementEventListener(OnEventListener onEventListener) {
        this.zza.zzb((zzil) onEventListener);
    }

    public final void zza(boolean z10) {
        this.zza.zza(z10);
    }

    @KeepForSdk
    public static AppMeasurementSdk getInstance(Context context, String str, String str2, String str3, Bundle bundle) {
        return zzdf.zza(context, str, str2, str3, bundle).zzb();
    }

    @KeepForSdk
    public void setMeasurementEnabled(boolean z10) {
        this.zza.zza(Boolean.valueOf(z10));
    }
}
