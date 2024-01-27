package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzgva implements zzgvh {
    private final zzgvh[] zza;

    zzgva(zzgvh... zzgvhArr) {
        this.zza = zzgvhArr;
    }

    public final zzgvg zzb(Class cls) {
        for (int i10 = 0; i10 < 2; i10++) {
            zzgvh zzgvh = this.zza[i10];
            if (zzgvh.zzc(cls)) {
                return zzgvh.zzb(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    public final boolean zzc(Class cls) {
        for (int i10 = 0; i10 < 2; i10++) {
            if (this.zza[i10].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}
