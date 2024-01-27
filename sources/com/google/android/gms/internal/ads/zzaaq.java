package com.google.android.gms.internal.ads;

import com.facebook.ads.AdError;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzaaq {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = {AdError.CACHE_ERROR_CODE, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, 400, 400, 2048};

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0093, code lost:
        if (r11 != 11) goto L_0x00a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0098, code lost:
        if (r11 != 11) goto L_0x00a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x009d, code lost:
        if (r11 != 8) goto L_0x00a0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.ads.zzaap zza(com.google.android.gms.internal.ads.zzfa r11) {
        /*
            r0 = 16
            int r1 = r11.zzd(r0)
            int r0 = r11.zzd(r0)
            r2 = 4
            r3 = 65535(0xffff, float:9.1834E-41)
            if (r0 != r3) goto L_0x0018
            r0 = 24
            int r0 = r11.zzd(r0)
            r3 = 7
            goto L_0x0019
        L_0x0018:
            r3 = 4
        L_0x0019:
            int r0 = r0 + r3
            r3 = 44097(0xac41, float:6.1793E-41)
            if (r1 != r3) goto L_0x0021
            int r0 = r0 + 2
        L_0x0021:
            r7 = r0
            r0 = 2
            int r1 = r11.zzd(r0)
            r3 = 0
            r4 = 3
            if (r1 != r4) goto L_0x003d
            r1 = 0
        L_0x002c:
            int r5 = r11.zzd(r0)
            int r1 = r1 + r5
            boolean r5 = r11.zzn()
            if (r5 != 0) goto L_0x0039
            int r1 = r1 + r4
            goto L_0x003d
        L_0x0039:
            int r1 = r1 + 1
            int r1 = r1 << r0
            goto L_0x002c
        L_0x003d:
            r5 = 10
            int r5 = r11.zzd(r5)
            boolean r6 = r11.zzn()
            if (r6 == 0) goto L_0x0052
            int r6 = r11.zzd(r4)
            if (r6 <= 0) goto L_0x0052
            r11.zzl(r0)
        L_0x0052:
            boolean r6 = r11.zzn()
            r8 = 44100(0xac44, float:6.1797E-41)
            r9 = 48000(0xbb80, float:6.7262E-41)
            r10 = 1
            if (r10 == r6) goto L_0x0063
            r6 = 44100(0xac44, float:6.1797E-41)
            goto L_0x0066
        L_0x0063:
            r6 = 48000(0xbb80, float:6.7262E-41)
        L_0x0066:
            int r11 = r11.zzd(r2)
            if (r6 != r8) goto L_0x0076
            r8 = 13
            if (r11 != r8) goto L_0x0076
            int[] r11 = zzb
            r11 = r11[r8]
            r8 = r11
            goto L_0x00a6
        L_0x0076:
            if (r6 != r9) goto L_0x00a5
            r8 = 14
            if (r11 >= r8) goto L_0x00a5
            int[] r3 = zzb
            r3 = r3[r11]
            int r5 = r5 % 5
            r8 = 8
            if (r5 == r10) goto L_0x009b
            r9 = 11
            if (r5 == r0) goto L_0x0096
            if (r5 == r4) goto L_0x009b
            if (r5 == r2) goto L_0x008f
            goto L_0x00a0
        L_0x008f:
            if (r11 == r4) goto L_0x00a2
            if (r11 == r8) goto L_0x00a2
            if (r11 != r9) goto L_0x00a0
            goto L_0x00a2
        L_0x0096:
            if (r11 == r8) goto L_0x00a2
            if (r11 != r9) goto L_0x00a0
            goto L_0x00a2
        L_0x009b:
            if (r11 == r4) goto L_0x00a2
            if (r11 != r8) goto L_0x00a0
            goto L_0x00a2
        L_0x00a0:
            r8 = r3
            goto L_0x00a6
        L_0x00a2:
            int r3 = r3 + 1
            goto L_0x00a0
        L_0x00a5:
            r8 = 0
        L_0x00a6:
            com.google.android.gms.internal.ads.zzaap r11 = new com.google.android.gms.internal.ads.zzaap
            r5 = 2
            r9 = 0
            r3 = r11
            r4 = r1
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaaq.zza(com.google.android.gms.internal.ads.zzfa):com.google.android.gms.internal.ads.zzaap");
    }

    public static void zzb(int i10, zzfb zzfb) {
        zzfb.zzD(7);
        byte[] zzI = zzfb.zzI();
        zzI[0] = -84;
        zzI[1] = 64;
        zzI[2] = -1;
        zzI[3] = -1;
        zzI[4] = (byte) ((i10 >> 16) & 255);
        zzI[5] = (byte) ((i10 >> 8) & 255);
        zzI[6] = (byte) (i10 & 255);
    }
}
