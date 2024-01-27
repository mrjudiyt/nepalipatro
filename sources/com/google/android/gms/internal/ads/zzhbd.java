package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzhbd implements zzhbc, zzhaw {
    private static final zzhbd zza = new zzhbd((Object) null);
    private final Object zzb;

    private zzhbd(Object obj) {
        this.zzb = obj;
    }

    public static zzhbc zza(Object obj) {
        zzhbk.zza(obj, "instance cannot be null");
        return new zzhbd(obj);
    }

    public static zzhbc zzc(Object obj) {
        return obj == null ? zza : new zzhbd(obj);
    }

    public final Object zzb() {
        return this.zzb;
    }
}
