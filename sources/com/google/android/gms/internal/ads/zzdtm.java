package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.zzt;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzdtm implements AppEventListener, zzdag, zza, zzcxl, zzcyf, zzcyg, zzcyz, zzcxo, zzfhs {
    private final List zza;
    private final zzdta zzb;
    private long zzc;

    public zzdtm(zzdta zzdta, zzchw zzchw) {
        this.zzb = zzdta;
        this.zza = Collections.singletonList(zzchw);
    }

    private final void zzg(Class cls, String str, Object... objArr) {
        this.zzb.zza(this.zza, "Event-".concat(cls.getSimpleName()), str, objArr);
    }

    public final void onAdClicked() {
        zzg(zza.class, "onAdClicked", new Object[0]);
    }

    public final void onAppEvent(String str, String str2) {
        zzg(AppEventListener.class, "onAppEvent", str, str2);
    }

    public final void zza() {
        zzg(zzcxl.class, "onAdClosed", new Object[0]);
    }

    public final void zzb() {
        zzg(zzcxl.class, "onAdLeftApplication", new Object[0]);
    }

    public final void zzbF(zze zze) {
        zzg(zzcxo.class, "onAdFailedToLoad", Integer.valueOf(zze.zza), zze.zzb, zze.zzc);
    }

    public final void zzbG(zzfhl zzfhl, String str) {
        zzg(zzfhk.class, "onTaskCreated", str);
    }

    public final void zzbH(zzfhl zzfhl, String str, Throwable th) {
        zzg(zzfhk.class, "onTaskFailed", str, th.getClass().getSimpleName());
    }

    public final void zzbI(zzfhl zzfhl, String str) {
        zzg(zzfhk.class, "onTaskStarted", str);
    }

    public final void zzbn(Context context) {
        zzg(zzcyg.class, "onDestroy", context);
    }

    public final void zzbp(Context context) {
        zzg(zzcyg.class, "onPause", context);
    }

    public final void zzbq(Context context) {
        zzg(zzcyg.class, "onResume", context);
    }

    public final void zzbr(zzbvg zzbvg) {
        this.zzc = zzt.zzB().elapsedRealtime();
        zzg(zzdag.class, "onAdRequest", new Object[0]);
    }

    public final void zzbs(zzfde zzfde) {
    }

    public final void zzbw(zzbvw zzbvw, String str, String str2) {
        zzg(zzcxl.class, "onRewarded", zzbvw, str, str2);
    }

    public final void zzc() {
        zzg(zzcxl.class, "onAdOpened", new Object[0]);
    }

    public final void zzd(zzfhl zzfhl, String str) {
        zzg(zzfhk.class, "onTaskSucceeded", str);
    }

    public final void zze() {
        zzg(zzcxl.class, "onRewardedVideoCompleted", new Object[0]);
    }

    public final void zzf() {
        zzg(zzcxl.class, "onRewardedVideoStarted", new Object[0]);
    }

    public final void zzq() {
        zzg(zzcyf.class, "onAdImpression", new Object[0]);
    }

    public final void zzr() {
        long elapsedRealtime = zzt.zzB().elapsedRealtime() - this.zzc;
        com.google.android.gms.ads.internal.util.zze.zza("Ad Request Latency : " + elapsedRealtime);
        zzg(zzcyz.class, "onAdLoaded", new Object[0]);
    }
}
