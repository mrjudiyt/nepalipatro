package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzgve {
    zzgve() {
    }

    public static final boolean zza(Object obj) {
        return !((zzgvd) obj).zze();
    }

    public static final Object zzb(Object obj, Object obj2) {
        zzgvd zzgvd = (zzgvd) obj;
        zzgvd zzgvd2 = (zzgvd) obj2;
        if (!zzgvd2.isEmpty()) {
            if (!zzgvd.zze()) {
                zzgvd = zzgvd.zzb();
            }
            zzgvd.zzd(zzgvd2);
        }
        return zzgvd;
    }
}
