package com.google.android.gms.internal.play_billing;

/* compiled from: com.android.billingclient:billing@@6.0.1 */
final class zzbw implements zzdd {
    private static final zzbw zza = new zzbw();

    private zzbw() {
    }

    public static zzbw zza() {
        return zza;
    }

    public final zzdc zzb(Class cls) {
        Class<zzcb> cls2 = zzcb.class;
        if (cls2.isAssignableFrom(cls)) {
            try {
                return (zzdc) zzcb.zzh(cls.asSubclass(cls2)).zzu(3, (Object) null, (Object) null);
            } catch (Exception e10) {
                throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e10);
            }
        } else {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
    }

    public final boolean zzc(Class cls) {
        return zzcb.class.isAssignableFrom(cls);
    }
}
