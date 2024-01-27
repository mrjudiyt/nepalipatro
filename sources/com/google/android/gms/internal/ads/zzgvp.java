package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzgvp {
    private static final zzgvo zza;
    private static final zzgvo zzb = new zzgvo();

    static {
        zzgvo zzgvo;
        try {
            zzgvo = (zzgvo) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            zzgvo = null;
        }
        zza = zzgvo;
    }

    static zzgvo zza() {
        return zza;
    }

    static zzgvo zzb() {
        return zzb;
    }
}
