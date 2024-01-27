package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzfy {
    public static final byte[] zza = {0, 0, 0, 1};
    public static final float[] zzb = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};
    private static final Object zzc = new Object();
    private static int[] zzd = new int[10];

    public static int zza(byte[] bArr, int i10, int i11, boolean[] zArr) {
        boolean z10;
        int i12 = i11 - i10;
        boolean z11 = false;
        zzdx.zzf(i12 >= 0);
        if (i12 == 0) {
            return i11;
        }
        if (zArr[0]) {
            zzf(zArr);
            return i10 - 3;
        } else if (i12 > 1 && zArr[1] && bArr[i10] == 1) {
            zzf(zArr);
            return i10 - 2;
        } else if (i12 <= 2 || !zArr[2] || bArr[i10] != 0 || bArr[i10 + 1] != 1) {
            int i13 = i11 - 1;
            int i14 = i10 + 2;
            while (i14 < i13) {
                byte b10 = bArr[i14];
                if ((b10 & 254) == 0) {
                    int i15 = i14 - 2;
                    if (bArr[i15] == 0 && bArr[i14 - 1] == 0 && b10 == 1) {
                        zzf(zArr);
                        return i15;
                    }
                    i14 = i15;
                }
                i14 += 3;
            }
            if (i12 <= 2 ? i12 != 2 ? !zArr[1] || bArr[i13] != 1 : !(zArr[2] && bArr[i11 - 2] == 0 && bArr[i13] == 1) : !(bArr[i11 - 3] == 0 && bArr[i11 - 2] == 0 && bArr[i13] == 1)) {
                z10 = false;
            } else {
                z10 = true;
            }
            zArr[0] = z10;
            zArr[1] = i12 <= 1 ? !(!zArr[2] || bArr[i13] != 0) : bArr[i11 + -2] == 0 && bArr[i13] == 0;
            if (bArr[i13] == 0) {
                z11 = true;
            }
            zArr[2] = z11;
            return i11;
        } else {
            zzf(zArr);
            return i10 - 1;
        }
    }

    public static int zzb(byte[] bArr, int i10) {
        int i11;
        synchronized (zzc) {
            int i12 = 0;
            int i13 = 0;
            while (i12 < i10) {
                while (true) {
                    if (i12 >= i10 - 2) {
                        i12 = i10;
                        break;
                    }
                    int i14 = i12 + 1;
                    if (bArr[i12] == 0 && bArr[i14] == 0 && bArr[i12 + 2] == 3) {
                        break;
                    }
                    i12 = i14;
                }
                if (i12 < i10) {
                    int[] iArr = zzd;
                    int length = iArr.length;
                    if (length <= i13) {
                        zzd = Arrays.copyOf(iArr, length + length);
                    }
                    zzd[i13] = i12;
                    i12 += 3;
                    i13++;
                }
            }
            i11 = i10 - i13;
            int i15 = 0;
            int i16 = 0;
            int i17 = 0;
            while (i15 < i13) {
                try {
                    int i18 = zzd[i15] - i16;
                    System.arraycopy(bArr, i16, bArr, i17, i18);
                    int i19 = i17 + i18;
                    int i20 = i19 + 1;
                    bArr[i19] = 0;
                    i17 = i20 + 1;
                    bArr[i20] = 0;
                    i16 += i18 + 3;
                    i15++;
                } catch (Throwable th) {
                    throw th;
                }
            }
            System.arraycopy(bArr, i16, bArr, i17, i11 - i17);
        }
        return i11;
    }

    /* JADX WARNING: Removed duplicated region for block: B:171:0x0334  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x0343  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00ab  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.ads.zzfv zzc(byte[] r35, int r36, int r37) {
        /*
            com.google.android.gms.internal.ads.zzfz r0 = new com.google.android.gms.internal.ads.zzfz
            r1 = r35
            r2 = r36
            r3 = r37
            r0.<init>(r1, r2, r3)
            r1 = 4
            r0.zze(r1)
            r2 = 3
            int r3 = r0.zza(r2)
            r0.zzd()
            r4 = 2
            int r6 = r0.zza(r4)
            boolean r7 = r0.zzf()
            r5 = 5
            int r8 = r0.zza(r5)
            r10 = 0
            r11 = 0
        L_0x0027:
            r12 = 32
            r13 = 1
            if (r11 >= r12) goto L_0x0038
            boolean r12 = r0.zzf()
            if (r12 == 0) goto L_0x0035
            int r12 = r13 << r11
            r10 = r10 | r12
        L_0x0035:
            int r11 = r11 + 1
            goto L_0x0027
        L_0x0038:
            r11 = 6
            int[] r14 = new int[r11]
            r12 = 0
        L_0x003c:
            r15 = 8
            if (r12 >= r11) goto L_0x0049
            int r15 = r0.zza(r15)
            r14[r12] = r15
            int r12 = r12 + 1
            goto L_0x003c
        L_0x0049:
            int r16 = r0.zza(r15)
            r5 = 0
            r12 = 0
        L_0x004f:
            if (r12 >= r3) goto L_0x0064
            boolean r17 = r0.zzf()
            if (r17 == 0) goto L_0x0059
            int r5 = r5 + 89
        L_0x0059:
            boolean r17 = r0.zzf()
            if (r17 == 0) goto L_0x0061
            int r5 = r5 + 8
        L_0x0061:
            int r12 = r12 + 1
            goto L_0x004f
        L_0x0064:
            r0.zze(r5)
            if (r3 <= 0) goto L_0x006f
            int r5 = 8 - r3
            int r5 = r5 + r5
            r0.zze(r5)
        L_0x006f:
            int r17 = r0.zzc()
            int r5 = r0.zzc()
            if (r5 != r2) goto L_0x007d
            r0.zzd()
            r5 = 3
        L_0x007d:
            int r12 = r0.zzc()
            int r18 = r0.zzc()
            boolean r19 = r0.zzf()
            if (r19 == 0) goto L_0x00b9
            int r19 = r0.zzc()
            int r20 = r0.zzc()
            int r21 = r0.zzc()
            int r22 = r0.zzc()
            if (r5 == r13) goto L_0x00a4
            if (r5 != r4) goto L_0x00a1
            r5 = 2
            goto L_0x00a4
        L_0x00a1:
            r23 = 1
            goto L_0x00a6
        L_0x00a4:
            r23 = 2
        L_0x00a6:
            if (r5 != r13) goto L_0x00ab
            r24 = 2
            goto L_0x00ad
        L_0x00ab:
            r24 = 1
        L_0x00ad:
            int r19 = r19 + r20
            int r23 = r23 * r19
            int r12 = r12 - r23
            int r21 = r21 + r22
            int r24 = r24 * r21
            int r18 = r18 - r24
        L_0x00b9:
            r34 = r12
            r12 = r5
            r5 = r18
            r18 = r34
            int r19 = r0.zzc()
            int r20 = r0.zzc()
            int r21 = r0.zzc()
            boolean r9 = r0.zzf()
            if (r13 == r9) goto L_0x00d4
            r9 = r3
            goto L_0x00d5
        L_0x00d4:
            r9 = 0
        L_0x00d5:
            if (r9 > r3) goto L_0x00e3
            r0.zzc()
            r0.zzc()
            r0.zzc()
            int r9 = r9 + 1
            goto L_0x00d5
        L_0x00e3:
            r0.zzc()
            r0.zzc()
            r0.zzc()
            r0.zzc()
            r0.zzc()
            r0.zzc()
            boolean r3 = r0.zzf()
            if (r3 == 0) goto L_0x0139
            boolean r3 = r0.zzf()
            if (r3 == 0) goto L_0x0139
            r3 = 0
        L_0x0102:
            if (r3 >= r1) goto L_0x0139
            r9 = 0
        L_0x0105:
            if (r9 >= r11) goto L_0x0134
            boolean r22 = r0.zzf()
            if (r22 != 0) goto L_0x0111
            r0.zzc()
            goto L_0x012b
        L_0x0111:
            r11 = 64
            int r22 = r3 + r3
            int r22 = r22 + 4
            int r1 = r13 << r22
            int r1 = java.lang.Math.min(r11, r1)
            if (r3 <= r13) goto L_0x0122
            r0.zzb()
        L_0x0122:
            r11 = 0
        L_0x0123:
            if (r11 >= r1) goto L_0x012b
            r0.zzb()
            int r11 = r11 + 1
            goto L_0x0123
        L_0x012b:
            if (r3 != r2) goto L_0x012f
            r1 = 3
            goto L_0x0130
        L_0x012f:
            r1 = 1
        L_0x0130:
            int r9 = r9 + r1
            r1 = 4
            r11 = 6
            goto L_0x0105
        L_0x0134:
            int r3 = r3 + 1
            r1 = 4
            r11 = 6
            goto L_0x0102
        L_0x0139:
            r0.zze(r4)
            boolean r1 = r0.zzf()
            if (r1 == 0) goto L_0x014e
            r0.zze(r15)
            r0.zzc()
            r0.zzc()
            r0.zzd()
        L_0x014e:
            int r1 = r0.zzc()
            r3 = 0
            int[] r9 = new int[r3]
            int[] r11 = new int[r3]
            r22 = -1
            r2 = -1
            r15 = -1
        L_0x015b:
            if (r3 >= r1) goto L_0x0285
            if (r3 == 0) goto L_0x022b
            boolean r24 = r0.zzf()
            if (r24 == 0) goto L_0x022b
            int r4 = r2 + r15
            boolean r25 = r0.zzf()
            int r26 = r0.zzc()
            int r26 = r26 + 1
            int r25 = r25 + r25
            int r25 = 1 - r25
            int r13 = r4 + 1
            r28 = r1
            boolean[] r1 = new boolean[r13]
            r29 = r14
            r14 = 0
        L_0x017e:
            if (r14 > r4) goto L_0x0194
            boolean r30 = r0.zzf()
            if (r30 != 0) goto L_0x018d
            boolean r30 = r0.zzf()
            r1[r14] = r30
            goto L_0x0191
        L_0x018d:
            r27 = 1
            r1[r14] = r27
        L_0x0191:
            int r14 = r14 + 1
            goto L_0x017e
        L_0x0194:
            int r14 = r15 + -1
            r30 = r14
            int[] r14 = new int[r13]
            int[] r13 = new int[r13]
            r31 = 0
        L_0x019e:
            int r32 = r25 * r26
            if (r30 < 0) goto L_0x01b7
            r33 = r11[r30]
            int r33 = r33 + r32
            if (r33 >= 0) goto L_0x01b4
            int r32 = r2 + r30
            boolean r32 = r1[r32]
            if (r32 == 0) goto L_0x01b4
            int r32 = r31 + 1
            r14[r31] = r33
            r31 = r32
        L_0x01b4:
            int r30 = r30 + -1
            goto L_0x019e
        L_0x01b7:
            if (r32 >= 0) goto L_0x01c3
            boolean r25 = r1[r4]
            if (r25 == 0) goto L_0x01c3
            int r25 = r31 + 1
            r14[r31] = r32
            r31 = r25
        L_0x01c3:
            r26 = r10
            r25 = r12
            r12 = r31
            r10 = 0
        L_0x01ca:
            if (r10 >= r2) goto L_0x01df
            r30 = r9[r10]
            int r30 = r30 + r32
            if (r30 >= 0) goto L_0x01dc
            boolean r31 = r1[r10]
            if (r31 == 0) goto L_0x01dc
            int r31 = r12 + 1
            r14[r12] = r30
            r12 = r31
        L_0x01dc:
            int r10 = r10 + 1
            goto L_0x01ca
        L_0x01df:
            int[] r10 = java.util.Arrays.copyOf(r14, r12)
            int r14 = r2 + -1
            r30 = 0
        L_0x01e7:
            if (r14 < 0) goto L_0x01fc
            r31 = r9[r14]
            int r31 = r31 + r32
            if (r31 <= 0) goto L_0x01f9
            boolean r33 = r1[r14]
            if (r33 == 0) goto L_0x01f9
            int r33 = r30 + 1
            r13[r30] = r31
            r30 = r33
        L_0x01f9:
            int r14 = r14 + -1
            goto L_0x01e7
        L_0x01fc:
            if (r32 <= 0) goto L_0x0208
            boolean r4 = r1[r4]
            if (r4 == 0) goto L_0x0208
            int r4 = r30 + 1
            r13[r30] = r32
            r30 = r4
        L_0x0208:
            r4 = r30
            r9 = 0
        L_0x020b:
            if (r9 >= r15) goto L_0x0222
            r14 = r11[r9]
            int r14 = r14 + r32
            if (r14 <= 0) goto L_0x021f
            int r30 = r2 + r9
            boolean r30 = r1[r30]
            if (r30 == 0) goto L_0x021f
            int r30 = r4 + 1
            r13[r4] = r14
            r4 = r30
        L_0x021f:
            int r9 = r9 + 1
            goto L_0x020b
        L_0x0222:
            int[] r1 = java.util.Arrays.copyOf(r13, r4)
            r11 = r1
            r15 = r4
            r9 = r10
            r2 = r12
            goto L_0x0277
        L_0x022b:
            r28 = r1
            r26 = r10
            r25 = r12
            r29 = r14
            int r1 = r0.zzc()
            int r2 = r0.zzc()
            int[] r4 = new int[r1]
            r9 = 0
        L_0x023e:
            if (r9 >= r1) goto L_0x0257
            if (r9 <= 0) goto L_0x0247
            int r10 = r9 + -1
            r10 = r4[r10]
            goto L_0x0248
        L_0x0247:
            r10 = 0
        L_0x0248:
            int r11 = r0.zzc()
            r12 = 1
            int r11 = r11 + r12
            int r10 = r10 - r11
            r4[r9] = r10
            r0.zzd()
            int r9 = r9 + 1
            goto L_0x023e
        L_0x0257:
            int[] r9 = new int[r2]
            r10 = 0
        L_0x025a:
            if (r10 >= r2) goto L_0x0273
            if (r10 <= 0) goto L_0x0263
            int r11 = r10 + -1
            r11 = r9[r11]
            goto L_0x0264
        L_0x0263:
            r11 = 0
        L_0x0264:
            int r12 = r0.zzc()
            r13 = 1
            int r12 = r12 + r13
            int r11 = r11 + r12
            r9[r10] = r11
            r0.zzd()
            int r10 = r10 + 1
            goto L_0x025a
        L_0x0273:
            r15 = r2
            r11 = r9
            r2 = r1
            r9 = r4
        L_0x0277:
            int r3 = r3 + 1
            r12 = r25
            r10 = r26
            r1 = r28
            r14 = r29
            r4 = 2
            r13 = 1
            goto L_0x015b
        L_0x0285:
            r26 = r10
            r25 = r12
            r29 = r14
            boolean r1 = r0.zzf()
            if (r1 == 0) goto L_0x02a1
            int r1 = r0.zzc()
            r9 = 0
        L_0x0296:
            if (r9 >= r1) goto L_0x02a1
            r2 = 5
            int r3 = r21 + 5
            r0.zze(r3)
            int r9 = r9 + 1
            goto L_0x0296
        L_0x02a1:
            r1 = 2
            r0.zze(r1)
            boolean r2 = r0.zzf()
            r3 = 1065353216(0x3f800000, float:1.0)
            if (r2 == 0) goto L_0x0348
            boolean r2 = r0.zzf()
            if (r2 == 0) goto L_0x02ee
            r2 = 8
            int r4 = r0.zza(r2)
            r2 = 255(0xff, float:3.57E-43)
            if (r4 != r2) goto L_0x02cf
            r2 = 16
            int r4 = r0.zza(r2)
            int r2 = r0.zza(r2)
            if (r4 == 0) goto L_0x02ee
            if (r2 == 0) goto L_0x02ee
            float r3 = (float) r4
            float r2 = (float) r2
            float r3 = r3 / r2
            goto L_0x02ee
        L_0x02cf:
            r2 = 17
            if (r4 >= r2) goto L_0x02d8
            float[] r2 = zzb
            r3 = r2[r4]
            goto L_0x02ee
        L_0x02d8:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r9 = "Unexpected aspect_ratio_idc value: "
            r2.append(r9)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            java.lang.String r4 = "NalUnitUtil"
            com.google.android.gms.internal.ads.zzer.zzf(r4, r2)
        L_0x02ee:
            boolean r2 = r0.zzf()
            if (r2 == 0) goto L_0x02f7
            r0.zzd()
        L_0x02f7:
            boolean r2 = r0.zzf()
            if (r2 == 0) goto L_0x032c
            r2 = 3
            r0.zze(r2)
            boolean r2 = r0.zzf()
            r4 = 1
            if (r4 == r2) goto L_0x0309
            r4 = 2
        L_0x0309:
            boolean r1 = r0.zzf()
            if (r1 == 0) goto L_0x032a
            r1 = 8
            int r2 = r0.zza(r1)
            int r9 = r0.zza(r1)
            r0.zze(r1)
            int r22 = com.google.android.gms.internal.ads.zzs.zza(r2)
            int r1 = com.google.android.gms.internal.ads.zzs.zzb(r9)
            r2 = r1
            r1 = r22
            r22 = r4
            goto L_0x032e
        L_0x032a:
            r22 = r4
        L_0x032c:
            r1 = -1
            r2 = -1
        L_0x032e:
            boolean r4 = r0.zzf()
            if (r4 == 0) goto L_0x033a
            r0.zzc()
            r0.zzc()
        L_0x033a:
            r0.zzd()
            boolean r0 = r0.zzf()
            if (r0 == 0) goto L_0x0344
            int r5 = r5 + r5
        L_0x0344:
            r21 = r2
            r0 = r5
            goto L_0x034c
        L_0x0348:
            r0 = r5
            r1 = -1
            r21 = -1
        L_0x034c:
            com.google.android.gms.internal.ads.zzfv r2 = new com.google.android.gms.internal.ads.zzfv
            r5 = r2
            r9 = r26
            r10 = r25
            r11 = r19
            r12 = r20
            r13 = r29
            r14 = r16
            r15 = r17
            r16 = r18
            r17 = r0
            r18 = r3
            r19 = r1
            r20 = r22
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfy.zzc(byte[], int, int):com.google.android.gms.internal.ads.zzfv");
    }

    public static zzfw zzd(byte[] bArr, int i10, int i11) {
        zzfz zzfz = new zzfz(bArr, 4, i11);
        int zzc2 = zzfz.zzc();
        int zzc3 = zzfz.zzc();
        zzfz.zzd();
        return new zzfw(zzc2, zzc3, zzfz.zzf());
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:0x01d0  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x01d3  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0103  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x014e  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0196  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x019f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.ads.zzfx zze(byte[] r24, int r25, int r26) {
        /*
            com.google.android.gms.internal.ads.zzfz r0 = new com.google.android.gms.internal.ads.zzfz
            r1 = r24
            r2 = r25
            r3 = r26
            r0.<init>(r1, r2, r3)
            r1 = 8
            int r2 = r0.zza(r1)
            int r5 = r0.zza(r1)
            int r6 = r0.zza(r1)
            int r7 = r0.zzc()
            r3 = 138(0x8a, float:1.93E-43)
            r4 = 16
            r8 = 3
            r10 = 1
            r11 = 100
            if (r2 == r11) goto L_0x004f
            r11 = 110(0x6e, float:1.54E-43)
            if (r2 == r11) goto L_0x004f
            r11 = 122(0x7a, float:1.71E-43)
            if (r2 == r11) goto L_0x004f
            r11 = 244(0xf4, float:3.42E-43)
            if (r2 == r11) goto L_0x004f
            r11 = 44
            if (r2 == r11) goto L_0x004f
            r11 = 83
            if (r2 == r11) goto L_0x004f
            r11 = 86
            if (r2 == r11) goto L_0x004f
            r11 = 118(0x76, float:1.65E-43)
            if (r2 == r11) goto L_0x004f
            r11 = 128(0x80, float:1.794E-43)
            if (r2 == r11) goto L_0x004f
            if (r2 != r3) goto L_0x004c
            r2 = 138(0x8a, float:1.93E-43)
            goto L_0x004f
        L_0x004c:
            r3 = 1
            r12 = 0
            goto L_0x00a4
        L_0x004f:
            int r3 = r0.zzc()
            if (r3 != r8) goto L_0x005b
            boolean r11 = r0.zzf()
            r12 = 3
            goto L_0x005d
        L_0x005b:
            r12 = r3
            r11 = 0
        L_0x005d:
            r0.zzc()
            r0.zzc()
            r0.zzd()
            boolean r13 = r0.zzf()
            if (r13 == 0) goto L_0x00a3
            if (r12 == r8) goto L_0x0071
            r12 = 8
            goto L_0x0073
        L_0x0071:
            r12 = 12
        L_0x0073:
            r13 = 0
        L_0x0074:
            if (r13 >= r12) goto L_0x00a3
            boolean r14 = r0.zzf()
            if (r14 == 0) goto L_0x00a0
            r14 = 6
            if (r13 >= r14) goto L_0x0082
            r14 = 16
            goto L_0x0084
        L_0x0082:
            r14 = 64
        L_0x0084:
            r15 = 0
            r16 = 8
            r17 = 8
        L_0x0089:
            if (r15 >= r14) goto L_0x00a0
            if (r16 == 0) goto L_0x0099
            int r16 = r0.zzb()
            int r9 = r17 + r16
            int r9 = r9 + 256
            int r9 = r9 % 256
            r16 = r9
        L_0x0099:
            if (r16 == 0) goto L_0x009d
            r17 = r16
        L_0x009d:
            int r15 = r15 + 1
            goto L_0x0089
        L_0x00a0:
            int r13 = r13 + 1
            goto L_0x0074
        L_0x00a3:
            r12 = r11
        L_0x00a4:
            int r9 = r0.zzc()
            int r14 = r9 + 4
            int r9 = r0.zzc()
            if (r9 != 0) goto L_0x00be
            int r11 = r0.zzc()
            int r11 = r11 + 4
            r26 = r2
            r15 = r9
            r16 = r11
        L_0x00bb:
            r17 = 0
            goto L_0x00ea
        L_0x00be:
            if (r9 != r10) goto L_0x00e4
            boolean r9 = r0.zzf()
            r0.zzb()
            r0.zzb()
            int r11 = r0.zzc()
            r26 = r2
            long r1 = (long) r11
            r15 = r9
            r11 = 0
        L_0x00d3:
            long r8 = (long) r11
            int r16 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r16 >= 0) goto L_0x00de
            r0.zzc()
            int r11 = r11 + 1
            goto L_0x00d3
        L_0x00de:
            r17 = r15
            r15 = 1
            r16 = 0
            goto L_0x00ea
        L_0x00e4:
            r26 = r2
            r15 = r9
            r16 = 0
            goto L_0x00bb
        L_0x00ea:
            int r8 = r0.zzc()
            r0.zzd()
            int r1 = r0.zzc()
            int r1 = r1 + r10
            int r2 = r0.zzc()
            int r2 = r2 + r10
            boolean r18 = r0.zzf()
            int r9 = 2 - r18
            if (r18 != 0) goto L_0x0106
            r0.zzd()
        L_0x0106:
            int r2 = r2 * r9
            r0.zzd()
            int r1 = r1 * 16
            int r2 = r2 * 16
            boolean r11 = r0.zzf()
            r19 = 2
            if (r11 == 0) goto L_0x0146
            int r11 = r0.zzc()
            int r20 = r0.zzc()
            int r21 = r0.zzc()
            int r22 = r0.zzc()
            if (r3 != 0) goto L_0x012c
            r23 = 1
            goto L_0x013b
        L_0x012c:
            r13 = 3
            if (r3 != r13) goto L_0x0132
            r23 = 1
            goto L_0x0134
        L_0x0132:
            r23 = 2
        L_0x0134:
            if (r3 != r10) goto L_0x0138
            r3 = 2
            goto L_0x0139
        L_0x0138:
            r3 = 1
        L_0x0139:
            int r9 = r9 * r3
        L_0x013b:
            int r11 = r11 + r20
            int r11 = r11 * r23
            int r1 = r1 - r11
            int r21 = r21 + r22
            int r21 = r21 * r9
            int r2 = r2 - r21
        L_0x0146:
            r9 = r1
            boolean r1 = r0.zzf()
            r11 = -1
            if (r1 == 0) goto L_0x01d3
            boolean r1 = r0.zzf()
            if (r1 == 0) goto L_0x018e
            r1 = 8
            int r3 = r0.zza(r1)
            r1 = 255(0xff, float:3.57E-43)
            if (r3 != r1) goto L_0x016f
            int r1 = r0.zza(r4)
            int r3 = r0.zza(r4)
            if (r1 == 0) goto L_0x018e
            if (r3 == 0) goto L_0x018e
            float r1 = (float) r1
            float r3 = (float) r3
            float r3 = r1 / r3
            goto L_0x0190
        L_0x016f:
            r1 = 17
            if (r3 >= r1) goto L_0x0178
            float[] r1 = zzb
            r3 = r1[r3]
            goto L_0x0190
        L_0x0178:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r4 = "Unexpected aspect_ratio_idc value: "
            r1.append(r4)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            java.lang.String r3 = "NalUnitUtil"
            com.google.android.gms.internal.ads.zzer.zzf(r3, r1)
        L_0x018e:
            r3 = 1065353216(0x3f800000, float:1.0)
        L_0x0190:
            boolean r1 = r0.zzf()
            if (r1 == 0) goto L_0x0199
            r0.zzd()
        L_0x0199:
            boolean r1 = r0.zzf()
            if (r1 == 0) goto L_0x01d0
            r1 = 3
            r0.zze(r1)
            boolean r1 = r0.zzf()
            if (r10 == r1) goto L_0x01aa
            r10 = 2
        L_0x01aa:
            boolean r1 = r0.zzf()
            if (r1 == 0) goto L_0x01cb
            r1 = 8
            int r4 = r0.zza(r1)
            int r11 = r0.zza(r1)
            r0.zze(r1)
            int r0 = com.google.android.gms.internal.ads.zzs.zza(r4)
            int r1 = com.google.android.gms.internal.ads.zzs.zzb(r11)
            r20 = r1
            r11 = r3
            r19 = r10
            goto L_0x01da
        L_0x01cb:
            r11 = r3
            r19 = r10
            r0 = -1
            goto L_0x01d8
        L_0x01d0:
            r11 = r3
            r0 = -1
            goto L_0x01d6
        L_0x01d3:
            r0 = -1
            r11 = 1065353216(0x3f800000, float:1.0)
        L_0x01d6:
            r19 = -1
        L_0x01d8:
            r20 = -1
        L_0x01da:
            com.google.android.gms.internal.ads.zzfx r1 = new com.google.android.gms.internal.ads.zzfx
            r3 = r1
            r4 = r26
            r10 = r2
            r13 = r18
            r18 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfy.zze(byte[], int, int):com.google.android.gms.internal.ads.zzfx");
    }

    public static void zzf(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }
}
