package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzr {
    private int zza;
    private int zzb;
    private int zzc;
    private byte[] zzd;

    public zzr() {
        this.zza = -1;
        this.zzb = -1;
        this.zzc = -1;
    }

    /* synthetic */ zzr(zzs zzs, zzq zzq) {
        this.zza = zzs.zzd;
        this.zzb = zzs.zze;
        this.zzc = zzs.zzf;
        this.zzd = zzs.zzg;
    }

    public final zzr zza(int i10) {
        this.zzb = 1;
        return this;
    }

    public final zzr zzb(int i10) {
        this.zza = 1;
        return this;
    }

    public final zzr zzc(int i10) {
        this.zzc = i10;
        return this;
    }

    public final zzs zzd() {
        return new zzs(this.zza, this.zzb, this.zzc, this.zzd);
    }
}
