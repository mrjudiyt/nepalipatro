package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzgvf {
    private static final zzgve zza;
    private static final zzgve zzb = new zzgve();

    static {
        zzgve zzgve;
        try {
            zzgve = (zzgve) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            zzgve = null;
        }
        zza = zzgve;
    }

    static zzgve zza() {
        return zza;
    }

    static zzgve zzb() {
        return zzb;
    }
}
