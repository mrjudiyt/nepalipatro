package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzgtu implements zzgvh {
    private static final zzgtu zza = new zzgtu();

    private zzgtu() {
    }

    public static zzgtu zza() {
        return zza;
    }

    public final zzgvg zzb(Class cls) {
        Class<zzgtz> cls2 = zzgtz.class;
        if (cls2.isAssignableFrom(cls)) {
            try {
                return (zzgvg) zzgtz.zzaC(cls.asSubclass(cls2)).zzb(3, (Object) null, (Object) null);
            } catch (Exception e10) {
                throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e10);
            }
        } else {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
    }

    public final boolean zzc(Class cls) {
        return zzgtz.class.isAssignableFrom(cls);
    }
}
