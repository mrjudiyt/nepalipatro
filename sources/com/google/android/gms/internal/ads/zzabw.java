package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzabw {
    public static zzby zza(zzabn zzabn, boolean z10) {
        zzby zza = new zzace().zza(zzabn, z10 ? null : zzafg.zza);
        if (zza == null || zza.zza() == 0) {
            return null;
        }
        return zza;
    }

    public static zzaby zzb(zzfb zzfb) {
        zzfb.zzH(1);
        int zzn = zzfb.zzn();
        long zzc = (long) zzfb.zzc();
        long j10 = (long) zzn;
        int i10 = zzn / 18;
        long[] jArr = new long[i10];
        long[] jArr2 = new long[i10];
        int i11 = 0;
        while (true) {
            if (i11 >= i10) {
                break;
            }
            long zzs = zzfb.zzs();
            if (zzs == -1) {
                jArr = Arrays.copyOf(jArr, i11);
                jArr2 = Arrays.copyOf(jArr2, i11);
                break;
            }
            jArr[i11] = zzs;
            jArr2[i11] = zzfb.zzs();
            zzfb.zzH(2);
            i11++;
        }
        zzfb.zzH((int) ((zzc + j10) - ((long) zzfb.zzc())));
        return new zzaby(jArr, jArr2);
    }
}
