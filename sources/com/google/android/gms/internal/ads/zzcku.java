package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzcku implements zzdtp {
    private final zzcjs zza;
    private final zzcla zzb;
    private Long zzc;
    private String zzd;

    /* synthetic */ zzcku(zzcjs zzcjs, zzcla zzcla, zzckt zzckt) {
        this.zza = zzcjs;
        this.zzb = zzcla;
    }

    public final /* synthetic */ zzdtp zza(String str) {
        Objects.requireNonNull(str);
        this.zzd = str;
        return this;
    }

    public final /* bridge */ /* synthetic */ zzdtp zzb(long j10) {
        this.zzc = Long.valueOf(j10);
        return this;
    }

    public final zzdtq zzc() {
        zzhbk.zzc(this.zzc, Long.class);
        zzhbk.zzc(this.zzd, String.class);
        return new zzckw(this.zza, this.zzb, this.zzc, this.zzd, (zzckv) null);
    }
}
