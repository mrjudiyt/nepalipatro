package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
public final class zzbon extends zzchr {
    private final AppMeasurementSdk zza;

    zzbon(AppMeasurementSdk appMeasurementSdk) {
        this.zza = appMeasurementSdk;
    }

    public final int zzb(String str) {
        return this.zza.getMaxUserProperties(str);
    }

    public final long zzc() {
        return this.zza.generateEventId();
    }

    public final Bundle zzd(Bundle bundle) {
        return this.zza.performActionWithResponse(bundle);
    }

    public final String zze() {
        return this.zza.getAppIdOrigin();
    }

    public final String zzf() {
        return this.zza.getAppInstanceId();
    }

    public final String zzg() {
        return this.zza.getCurrentScreenClass();
    }

    public final String zzh() {
        return this.zza.getCurrentScreenName();
    }

    public final String zzi() {
        return this.zza.getGmpAppId();
    }

    public final List zzj(String str, String str2) {
        return this.zza.getConditionalUserProperties(str, str2);
    }

    public final Map zzk(String str, String str2, boolean z10) {
        return this.zza.getUserProperties(str, str2, z10);
    }

    public final void zzl(String str) {
        this.zza.beginAdUnitExposure(str);
    }

    public final void zzm(String str, String str2, Bundle bundle) {
        this.zza.clearConditionalUserProperty(str, str2, bundle);
    }

    public final void zzn(String str) {
        this.zza.endAdUnitExposure(str);
    }

    public final void zzo(String str, String str2, Bundle bundle) {
        this.zza.logEvent(str, str2, bundle);
    }

    public final void zzp(Bundle bundle) {
        this.zza.performAction(bundle);
    }

    public final void zzq(Bundle bundle) {
        this.zza.setConditionalUserProperty(bundle);
    }

    public final void zzr(Bundle bundle) {
        this.zza.setConsent(bundle);
    }

    public final void zzs(IObjectWrapper iObjectWrapper, String str, String str2) {
        this.zza.setCurrentScreen(iObjectWrapper != null ? (Activity) ObjectWrapper.unwrap(iObjectWrapper) : null, str, str2);
    }

    public final void zzt(String str, String str2, IObjectWrapper iObjectWrapper) {
        this.zza.setUserProperty(str, str2, iObjectWrapper != null ? ObjectWrapper.unwrap(iObjectWrapper) : null);
    }
}
