package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public abstract class zzgiu {
    private final Class zza;
    private final Class zzb;

    /* synthetic */ zzgiu(Class cls, Class cls2, zzgit zzgit) {
        this.zza = cls;
        this.zzb = cls2;
    }

    public static zzgiu zzb(zzgis zzgis, Class cls, Class cls2) {
        return new zzgir(cls, cls2, zzgis);
    }

    public abstract Object zza(zzgbe zzgbe);

    public final Class zzc() {
        return this.zza;
    }

    public final Class zzd() {
        return this.zzb;
    }
}
