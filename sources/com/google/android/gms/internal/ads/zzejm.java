package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzejm implements zzfsk {
    public final /* synthetic */ zzejq zza;
    public final /* synthetic */ zzcgb zzb;
    public final /* synthetic */ zzfcr zzc;
    public final /* synthetic */ zzdoy zzd;

    public /* synthetic */ zzejm(zzejq zzejq, zzcgb zzcgb, zzfcr zzfcr, zzdoy zzdoy) {
        this.zza = zzejq;
        this.zzb = zzcgb;
        this.zzc = zzfcr;
        this.zzd = zzdoy;
    }

    public final Object apply(Object obj) {
        zzcgb zzcgb = this.zzb;
        if (this.zzc.zzO) {
            zzcgb.zzae();
        }
        zzdoy zzdoy = this.zzd;
        zzcgb.zzY();
        zzcgb.onPause();
        return zzdoy.zzk();
    }
}
