package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzaks {
    public static int zza(byte[] bArr, int i10, int i11) {
        while (i10 < i11 && bArr[i10] != 71) {
            i10++;
        }
        return i10;
    }

    public static long zzb(zzfb zzfb, int i10, int i11) {
        zzfb.zzG(i10);
        if (zzfb.zza() < 5) {
            return -9223372036854775807L;
        }
        int zzf = zzfb.zzf();
        if ((8388608 & zzf) != 0 || ((zzf >> 8) & 8191) != i11 || (zzf & 32) == 0 || zzfb.zzl() < 7 || zzfb.zza() < 7 || (zzfb.zzl() & 16) != 16) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[6];
        zzfb.zzC(bArr, 0, 6);
        long j10 = ((long) bArr[3]) & 255;
        return ((((long) bArr[0]) & 255) << 25) | ((((long) bArr[1]) & 255) << 17) | ((((long) bArr[2]) & 255) << 9) | (j10 + j10) | ((((long) bArr[4]) & 255) >> 7);
    }
}
