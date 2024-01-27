package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzdou implements zzbjz {
    private final zzcys zza;
    private final zzbwi zzb;
    private final String zzc;
    private final String zzd;

    public zzdou(zzcys zzcys, zzfcr zzfcr) {
        this.zza = zzcys;
        this.zzb = zzfcr.zzn;
        this.zzc = zzfcr.zzl;
        this.zzd = zzfcr.zzm;
    }

    public final void zza(zzbwi zzbwi) {
        int i10;
        String str;
        zzbwi zzbwi2 = this.zzb;
        if (zzbwi2 != null) {
            zzbwi = zzbwi2;
        }
        if (zzbwi != null) {
            str = zzbwi.zza;
            i10 = zzbwi.zzb;
        } else {
            i10 = 1;
            str = "";
        }
        this.zza.zzd(new zzbvt(str, i10), this.zzc, this.zzd);
    }

    public final void zzb() {
        this.zza.zze();
    }

    public final void zzc() {
        this.zza.zzf();
    }
}
