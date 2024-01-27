package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzefe implements zzfsk {
    public final /* synthetic */ zzeff zza;
    public final /* synthetic */ zzcgb zzb;
    public final /* synthetic */ zzfcr zzc;
    public final /* synthetic */ zzcqg zzd;

    public /* synthetic */ zzefe(zzeff zzeff, zzcgb zzcgb, zzfcr zzfcr, zzcqg zzcqg) {
        this.zza = zzeff;
        this.zzb = zzcgb;
        this.zzc = zzfcr;
        this.zzd = zzcqg;
    }

    public final Object apply(Object obj) {
        zzcgb zzcgb = this.zzb;
        if (this.zzc.zzO) {
            zzcgb.zzae();
        }
        zzcqg zzcqg = this.zzd;
        zzcgb.zzY();
        zzcgb.onPause();
        return zzcqg.zza();
    }
}
