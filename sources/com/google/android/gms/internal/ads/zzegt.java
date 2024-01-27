package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzegt implements zzfsk {
    public final /* synthetic */ zzegx zza;
    public final /* synthetic */ zzcgb zzb;
    public final /* synthetic */ zzfcr zzc;
    public final /* synthetic */ zzdfx zzd;

    public /* synthetic */ zzegt(zzegx zzegx, zzcgb zzcgb, zzfcr zzfcr, zzdfx zzdfx) {
        this.zza = zzegx;
        this.zzb = zzcgb;
        this.zzc = zzfcr;
        this.zzd = zzdfx;
    }

    public final Object apply(Object obj) {
        zzcgb zzcgb = this.zzb;
        if (this.zzc.zzO) {
            zzcgb.zzae();
        }
        zzdfx zzdfx = this.zzd;
        zzcgb.zzY();
        zzcgb.onPause();
        return zzdfx.zzg();
    }
}
