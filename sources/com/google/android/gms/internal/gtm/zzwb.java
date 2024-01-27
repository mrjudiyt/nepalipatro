package com.google.android.gms.internal.gtm;

/* compiled from: com.google.android.gms:play-services-analytics-impl@@17.0.1 */
final class zzwb implements zzwi {
    private final zzwi[] zza;

    zzwb(zzwi... zzwiArr) {
        this.zza = zzwiArr;
    }

    public final zzwh zzb(Class<?> cls) {
        zzwi[] zzwiArr = this.zza;
        for (int i10 = 0; i10 < 2; i10++) {
            zzwi zzwi = zzwiArr[i10];
            if (zzwi.zzc(cls)) {
                return zzwi.zzb(cls);
            }
        }
        String name = cls.getName();
        throw new UnsupportedOperationException(name.length() != 0 ? "No factory is available for message type: ".concat(name) : new String("No factory is available for message type: "));
    }

    public final boolean zzc(Class<?> cls) {
        zzwi[] zzwiArr = this.zza;
        for (int i10 = 0; i10 < 2; i10++) {
            if (zzwiArr[i10].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}
