package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzdf {
    public static final zzn zza = zzde.zza;
    private static final String zzc = Integer.toString(0, 36);
    private static final String zzd = Integer.toString(1, 36);
    private static final String zze = Integer.toString(3, 36);
    private static final String zzf = Integer.toString(4, 36);
    public final int zzb = 1;
    private final zzcx zzg;
    private final int[] zzh;
    private final boolean[] zzi;

    public zzdf(zzcx zzcx, boolean z10, int[] iArr, boolean[] zArr) {
        int i10 = zzcx.zzb;
        this.zzg = zzcx;
        this.zzh = (int[]) iArr.clone();
        this.zzi = (boolean[]) zArr.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzdf.class == obj.getClass()) {
            zzdf zzdf = (zzdf) obj;
            return this.zzg.equals(zzdf.zzg) && Arrays.equals(this.zzh, zzdf.zzh) && Arrays.equals(this.zzi, zzdf.zzi);
        }
    }

    public final int hashCode() {
        return (((this.zzg.hashCode() * 961) + Arrays.hashCode(this.zzh)) * 31) + Arrays.hashCode(this.zzi);
    }

    public final int zza() {
        return this.zzg.zzd;
    }

    public final zzam zzb(int i10) {
        return this.zzg.zzb(0);
    }

    public final boolean zzc() {
        for (boolean z10 : this.zzi) {
            if (z10) {
                return true;
            }
        }
        return false;
    }

    public final boolean zzd(int i10) {
        return this.zzi[0];
    }
}
