package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public abstract class zzghp {
    private final zzgrx zza;
    private final Class zzb;

    /* synthetic */ zzghp(zzgrx zzgrx, Class cls, zzgho zzgho) {
        this.zza = zzgrx;
        this.zzb = cls;
    }

    public static zzghp zzb(zzghn zzghn, zzgrx zzgrx, Class cls) {
        return new zzghm(zzgrx, cls, zzghn);
    }

    public abstract zzgbe zza(zzgjh zzgjh, zzgch zzgch);

    public final zzgrx zzc() {
        return this.zza;
    }

    public final Class zzd() {
        return this.zzb;
    }
}
