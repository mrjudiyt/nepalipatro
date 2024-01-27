package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzfve extends zzfvh {
    zzfve() {
        super((zzfvg) null);
    }

    static final zzfvh zzf(int i10) {
        return i10 < 0 ? zzfvh.zzb : i10 > 0 ? zzfvh.zzc : zzfvh.zza;
    }

    public final int zza() {
        return 0;
    }

    public final zzfvh zzb(int i10, int i11) {
        return zzf(i10 < i11 ? -1 : i10 > i11 ? 1 : 0);
    }

    public final zzfvh zzc(Object obj, Object obj2, Comparator comparator) {
        return zzf(comparator.compare(obj, obj2));
    }

    public final zzfvh zzd(boolean z10, boolean z11) {
        return zzf(zzfxz.zza(z10, z11));
    }

    public final zzfvh zze(boolean z10, boolean z11) {
        return zzf(zzfxz.zza(false, false));
    }
}
