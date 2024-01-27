package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzgxg extends zzgxf {
    zzgxg() {
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0047, code lost:
        if (r13[r14] <= -65) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0080, code lost:
        if (r13[r14] <= -65) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001c, code lost:
        if (r13[r14] <= -65) goto L_0x001e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int zza(int r12, byte[] r13, int r14, int r15) {
        /*
            r11 = this;
            r0 = -19
            r1 = -62
            r2 = -16
            r3 = 0
            r4 = -96
            r5 = -32
            r6 = -65
            r7 = -1
            if (r12 == 0) goto L_0x0084
            if (r14 < r15) goto L_0x0013
            return r12
        L_0x0013:
            byte r8 = (byte) r12
            if (r8 >= r5) goto L_0x0022
            if (r8 < r1) goto L_0x0021
            int r12 = r14 + 1
            byte r14 = r13[r14]
            if (r14 > r6) goto L_0x0021
        L_0x001e:
            r14 = r12
            goto L_0x0084
        L_0x0021:
            return r7
        L_0x0022:
            int r9 = r12 >> 8
            int r9 = ~r9
            if (r8 >= r2) goto L_0x004b
            byte r12 = (byte) r9
            if (r12 != 0) goto L_0x0039
            int r12 = r14 + 1
            byte r14 = r13[r14]
            if (r12 >= r15) goto L_0x0034
            r10 = r14
            r14 = r12
            r12 = r10
            goto L_0x0039
        L_0x0034:
            int r12 = com.google.android.gms.internal.ads.zzgxi.zzk(r8, r14)
            return r12
        L_0x0039:
            if (r12 > r6) goto L_0x004a
            if (r8 != r5) goto L_0x003f
            if (r12 < r4) goto L_0x004a
        L_0x003f:
            if (r8 != r0) goto L_0x0043
            if (r12 >= r4) goto L_0x004a
        L_0x0043:
            int r12 = r14 + 1
            byte r14 = r13[r14]
            if (r14 > r6) goto L_0x004a
            goto L_0x001e
        L_0x004a:
            return r7
        L_0x004b:
            byte r9 = (byte) r9
            if (r9 != 0) goto L_0x005c
            int r12 = r14 + 1
            byte r9 = r13[r14]
            if (r12 >= r15) goto L_0x0057
            r14 = r12
            r12 = 0
            goto L_0x005e
        L_0x0057:
            int r12 = com.google.android.gms.internal.ads.zzgxi.zzk(r8, r9)
            return r12
        L_0x005c:
            int r12 = r12 >> 16
        L_0x005e:
            if (r12 != 0) goto L_0x006f
            int r12 = r14 + 1
            byte r14 = r13[r14]
            if (r12 >= r15) goto L_0x006a
            r10 = r14
            r14 = r12
            r12 = r10
            goto L_0x006f
        L_0x006a:
            int r12 = com.google.android.gms.internal.ads.zzgxi.zzl(r8, r9, r14)
            return r12
        L_0x006f:
            if (r9 > r6) goto L_0x0083
            int r8 = r8 << 28
            int r9 = r9 + 112
            int r8 = r8 + r9
            int r8 = r8 >> 30
            if (r8 != 0) goto L_0x0083
            if (r12 > r6) goto L_0x0083
            int r12 = r14 + 1
            byte r14 = r13[r14]
            if (r14 > r6) goto L_0x0083
            goto L_0x001e
        L_0x0083:
            return r7
        L_0x0084:
            if (r14 >= r15) goto L_0x008d
            byte r12 = r13[r14]
            if (r12 < 0) goto L_0x008d
            int r14 = r14 + 1
            goto L_0x0084
        L_0x008d:
            if (r14 < r15) goto L_0x0091
            goto L_0x00ef
        L_0x0091:
            if (r14 < r15) goto L_0x0094
            goto L_0x00ef
        L_0x0094:
            int r12 = r14 + 1
            byte r14 = r13[r14]
            if (r14 >= 0) goto L_0x00f0
            if (r14 >= r5) goto L_0x00aa
            if (r12 < r15) goto L_0x00a0
            r3 = r14
            goto L_0x00ef
        L_0x00a0:
            if (r14 < r1) goto L_0x00a8
            int r14 = r12 + 1
            byte r12 = r13[r12]
            if (r12 <= r6) goto L_0x0091
        L_0x00a8:
            r3 = -1
            goto L_0x00ef
        L_0x00aa:
            if (r14 >= r2) goto L_0x00ca
            int r8 = r15 + -1
            if (r12 < r8) goto L_0x00b5
            int r3 = com.google.android.gms.internal.ads.zzgxi.zzc(r13, r12, r15)
            goto L_0x00ef
        L_0x00b5:
            int r8 = r12 + 1
            byte r12 = r13[r12]
            if (r12 > r6) goto L_0x00a8
            if (r14 != r5) goto L_0x00bf
            if (r12 < r4) goto L_0x00a8
        L_0x00bf:
            if (r14 != r0) goto L_0x00c3
            if (r12 >= r4) goto L_0x00a8
        L_0x00c3:
            int r14 = r8 + 1
            byte r12 = r13[r8]
            if (r12 <= r6) goto L_0x0091
            goto L_0x00a8
        L_0x00ca:
            int r8 = r15 + -2
            if (r12 < r8) goto L_0x00d3
            int r3 = com.google.android.gms.internal.ads.zzgxi.zzc(r13, r12, r15)
            goto L_0x00ef
        L_0x00d3:
            int r8 = r12 + 1
            byte r12 = r13[r12]
            if (r12 > r6) goto L_0x00a8
            int r14 = r14 << 28
            int r12 = r12 + 112
            int r14 = r14 + r12
            int r12 = r14 >> 30
            if (r12 != 0) goto L_0x00a8
            int r12 = r8 + 1
            byte r14 = r13[r8]
            if (r14 > r6) goto L_0x00a8
            int r14 = r12 + 1
            byte r12 = r13[r12]
            if (r12 <= r6) goto L_0x0091
            goto L_0x00a8
        L_0x00ef:
            return r3
        L_0x00f0:
            r14 = r12
            goto L_0x0091
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgxg.zza(int, byte[], int, int):int");
    }

    /* access modifiers changed from: package-private */
    public final String zzb(byte[] bArr, int i10, int i11) {
        int i12;
        int length = bArr.length;
        if ((((length - i10) - i11) | i10 | i11) >= 0) {
            int i13 = i10 + i11;
            char[] cArr = new char[i11];
            int i14 = 0;
            while (r12 < i13) {
                byte b10 = bArr[r12];
                if (!zzgxe.zzd(b10)) {
                    break;
                }
                i10 = r12 + 1;
                cArr[i12] = (char) b10;
                i14 = i12 + 1;
            }
            while (r12 < i13) {
                int i15 = r12 + 1;
                byte b11 = bArr[r12];
                if (zzgxe.zzd(b11)) {
                    int i16 = i12 + 1;
                    cArr[i12] = (char) b11;
                    r12 = i15;
                    while (true) {
                        i12 = i16;
                        if (r12 >= i13) {
                            break;
                        }
                        byte b12 = bArr[r12];
                        if (!zzgxe.zzd(b12)) {
                            break;
                        }
                        r12++;
                        i16 = i12 + 1;
                        cArr[i12] = (char) b12;
                    }
                } else if (zzgxe.zzf(b11)) {
                    if (i15 < i13) {
                        zzgxe.zzc(b11, bArr[i15], cArr, i12);
                        i12++;
                        r12 = i15 + 1;
                    } else {
                        throw zzgul.zzd();
                    }
                } else if (zzgxe.zze(b11)) {
                    if (i15 < i13 - 1) {
                        int i17 = i15 + 1;
                        zzgxe.zzb(b11, bArr[i15], bArr[i17], cArr, i12);
                        i12++;
                        r12 = i17 + 1;
                    } else {
                        throw zzgul.zzd();
                    }
                } else if (i15 < i13 - 2) {
                    int i18 = i15 + 1;
                    byte b13 = bArr[i15];
                    int i19 = i18 + 1;
                    zzgxe.zza(b11, b13, bArr[i18], bArr[i19], cArr, i12);
                    i12 += 2;
                    r12 = i19 + 1;
                } else {
                    throw zzgul.zzd();
                }
            }
            return new String(cArr, 0, i12);
        }
        throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", new Object[]{Integer.valueOf(length), Integer.valueOf(i10), Integer.valueOf(i11)}));
    }
}
