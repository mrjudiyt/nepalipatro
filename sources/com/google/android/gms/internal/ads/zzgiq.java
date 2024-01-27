package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public abstract class zzgiq {
    private final Class zza;
    private final Class zzb;

    /* synthetic */ zzgiq(Class cls, Class cls2, zzgip zzgip) {
        this.zza = cls;
        this.zzb = cls2;
    }

    public static zzgiq zzb(zzgio zzgio, Class cls, Class cls2) {
        return new zzgin(cls, cls2, zzgio);
    }

    public abstract zzgjh zza(zzgbw zzgbw);

    public final Class zzc() {
        return this.zza;
    }

    public final Class zzd() {
        return this.zzb;
    }
}
