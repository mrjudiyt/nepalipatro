package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzfvc {
    static int zza(int i10) {
        return (i10 < 32 ? 4 : 2) * (i10 + 1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002a, code lost:
        if (r5 != -1) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002c, code lost:
        zze(r11, r1, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0030, code lost:
        r12[r5] = (r12[r5] & r4) | (r7 & r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0038, code lost:
        return r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int zzb(java.lang.Object r8, java.lang.Object r9, int r10, java.lang.Object r11, int[] r12, java.lang.Object[] r13, java.lang.Object[] r14) {
        /*
            int r0 = com.google.android.gms.internal.ads.zzfvk.zzb(r8)
            r1 = r0 & r10
            int r2 = zzc(r11, r1)
            r3 = -1
            if (r2 == 0) goto L_0x003e
            int r4 = ~r10
            r0 = r0 & r4
            r5 = -1
        L_0x0010:
            int r2 = r2 + r3
            r6 = r12[r2]
            r7 = r6 & r10
            r6 = r6 & r4
            if (r6 != r0) goto L_0x0039
            r6 = r13[r2]
            boolean r6 = com.google.android.gms.internal.ads.zzfsr.zza(r8, r6)
            if (r6 == 0) goto L_0x0039
            if (r14 == 0) goto L_0x002a
            r6 = r14[r2]
            boolean r6 = com.google.android.gms.internal.ads.zzfsr.zza(r9, r6)
            if (r6 == 0) goto L_0x0039
        L_0x002a:
            if (r5 != r3) goto L_0x0030
            zze(r11, r1, r7)
            goto L_0x0038
        L_0x0030:
            r8 = r12[r5]
            r8 = r8 & r4
            r9 = r7 & r10
            r8 = r8 | r9
            r12[r5] = r8
        L_0x0038:
            return r2
        L_0x0039:
            if (r7 == 0) goto L_0x003e
            r5 = r2
            r2 = r7
            goto L_0x0010
        L_0x003e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfvc.zzb(java.lang.Object, java.lang.Object, int, java.lang.Object, int[], java.lang.Object[], java.lang.Object[]):int");
    }

    static int zzc(Object obj, int i10) {
        if (obj instanceof byte[]) {
            return ((byte[]) obj)[i10] & 255;
        }
        if (obj instanceof short[]) {
            return (char) ((short[]) obj)[i10];
        }
        return ((int[]) obj)[i10];
    }

    static Object zzd(int i10) {
        if (i10 < 2 || i10 > 1073741824 || Integer.highestOneBit(i10) != i10) {
            throw new IllegalArgumentException("must be power of 2 between 2^1 and 2^30: " + i10);
        } else if (i10 <= 256) {
            return new byte[i10];
        } else {
            return i10 <= 65536 ? new short[i10] : new int[i10];
        }
    }

    static void zze(Object obj, int i10, int i11) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i10] = (byte) i11;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i10] = (short) i11;
        } else {
            ((int[]) obj)[i10] = i11;
        }
    }
}
