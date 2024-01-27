package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzxm {
    private final String[] zza;
    private final int[] zzb;
    private final zzvx[] zzc;
    private final int[] zzd;
    private final int[][][] zze;
    private final zzvx zzf;

    zzxm(String[] strArr, int[] iArr, zzvx[] zzvxArr, int[] iArr2, int[][][] iArr3, zzvx zzvx) {
        this.zza = strArr;
        this.zzb = iArr;
        this.zzc = zzvxArr;
        this.zze = iArr3;
        this.zzd = iArr2;
        this.zzf = zzvx;
    }

    public final int zza(int i10, int i11, boolean z10) {
        int i12 = this.zzc[i10].zzb(i11).zzb;
        int[] iArr = new int[1];
        int i13 = 0;
        int i14 = 0;
        for (char c10 = 0; c10 <= 0; c10 = 1) {
            if ((this.zze[i10][i11][0] & 7) == 4) {
                iArr[i14] = 0;
                i14++;
            }
        }
        int[] copyOf = Arrays.copyOf(iArr, i14);
        String str = null;
        boolean z11 = false;
        int i15 = 0;
        int i16 = 16;
        while (i13 < copyOf.length) {
            String str2 = this.zzc[i10].zzb(i11).zzb(copyOf[i13]).zzm;
            int i17 = i15 + 1;
            if (i15 == 0) {
                str = str2;
            } else {
                z11 |= !zzfk.zzE(str, str2);
            }
            i16 = Math.min(i16, this.zze[i10][i11][i13] & 24);
            i13++;
            i15 = i17;
        }
        return z11 ? Math.min(i16, this.zzd[i10]) : i16;
    }

    public final int zzb(int i10, int i11, int i12) {
        return this.zze[i10][i11][i12];
    }

    public final int zzc(int i10) {
        return this.zzb[i10];
    }

    public final zzvx zzd(int i10) {
        return this.zzc[i10];
    }

    public final zzvx zze() {
        return this.zzf;
    }
}
