package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzckw implements zzdtq {
    private final Long zza;
    private final String zzb;
    private final zzcjs zzc;
    private final zzcla zzd;
    private final zzckw zze = this;

    /* synthetic */ zzckw(zzcjs zzcjs, zzcla zzcla, Long l10, String str, zzckv zzckv) {
        this.zzc = zzcjs;
        this.zzd = zzcla;
        this.zza = l10;
        this.zzb = str;
    }

    public final zzdua zza() {
        zzcla zzcla = this.zzd;
        return zzdub.zza(this.zza.longValue(), zzcla.zza, zzdtu.zzc(zzcla.zzb), this.zzc, this.zzb);
    }

    public final zzdue zzb() {
        zzcla zzcla = this.zzd;
        return zzduf.zza(this.zza.longValue(), zzcla.zza, zzdtu.zzc(zzcla.zzb), this.zzc, this.zzb);
    }
}
