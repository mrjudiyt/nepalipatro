package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzaip extends zzain {
    private zzaio zza;
    private int zzb;
    private boolean zzc;
    private zzacx zzd;
    private zzacv zze;

    zzaip() {
    }

    /* access modifiers changed from: protected */
    public final long zza(zzfb zzfb) {
        int i10;
        int i11 = 0;
        if ((zzfb.zzI()[0] & 1) == 1) {
            return -1;
        }
        byte b10 = zzfb.zzI()[0];
        zzaio zzaio = this.zza;
        zzdx.zzb(zzaio);
        if (!zzaio.zzd[(b10 >> 1) & (255 >>> (8 - zzaio.zze))].zza) {
            i10 = zzaio.zza.zze;
        } else {
            i10 = zzaio.zza.zzf;
        }
        if (this.zzc) {
            i11 = (this.zzb + i10) / 4;
        }
        if (zzfb.zzb() < zzfb.zzd() + 4) {
            byte[] copyOf = Arrays.copyOf(zzfb.zzI(), zzfb.zzd() + 4);
            zzfb.zzE(copyOf, copyOf.length);
        } else {
            zzfb.zzF(zzfb.zzd() + 4);
        }
        long j10 = (long) i11;
        byte[] zzI = zzfb.zzI();
        zzI[zzfb.zzd() - 4] = (byte) ((int) (j10 & 255));
        zzI[zzfb.zzd() - 3] = (byte) ((int) ((j10 >>> 8) & 255));
        zzI[zzfb.zzd() - 2] = (byte) ((int) ((j10 >>> 16) & 255));
        zzI[zzfb.zzd() - 1] = (byte) ((int) ((j10 >>> 24) & 255));
        this.zzc = true;
        this.zzb = i10;
        return j10;
    }

    /* access modifiers changed from: protected */
    public final void zzb(boolean z10) {
        super.zzb(z10);
        if (z10) {
            this.zza = null;
            this.zzd = null;
            this.zze = null;
        }
        this.zzb = 0;
        this.zzc = false;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x03c9 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x03cb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean zzc(com.google.android.gms.internal.ads.zzfb r26, long r27, com.google.android.gms.internal.ads.zzaik r29) {
        /*
            r25 = this;
            r0 = r25
            r1 = r26
            r2 = r29
            com.google.android.gms.internal.ads.zzaio r3 = r0.zza
            r4 = 0
            if (r3 == 0) goto L_0x0011
            com.google.android.gms.internal.ads.zzam r1 = r2.zza
            java.util.Objects.requireNonNull(r1)
            return r4
        L_0x0011:
            com.google.android.gms.internal.ads.zzacx r6 = r0.zzd
            r5 = 4
            r11 = 1
            if (r6 != 0) goto L_0x0084
            com.google.android.gms.internal.ads.zzacy.zzd(r11, r1, r4)
            int r13 = r26.zzi()
            int r14 = r26.zzl()
            int r15 = r26.zzi()
            int r6 = r26.zzh()
            if (r6 > 0) goto L_0x002f
            r16 = -1
            goto L_0x0031
        L_0x002f:
            r16 = r6
        L_0x0031:
            int r6 = r26.zzh()
            if (r6 > 0) goto L_0x003a
            r17 = -1
            goto L_0x003c
        L_0x003a:
            r17 = r6
        L_0x003c:
            int r6 = r26.zzh()
            if (r6 > 0) goto L_0x0045
            r18 = -1
            goto L_0x0047
        L_0x0045:
            r18 = r6
        L_0x0047:
            int r3 = r26.zzl()
            r6 = r3 & 15
            double r8 = (double) r6
            r11 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r8 = java.lang.Math.pow(r11, r8)
            int r6 = (int) r8
            r3 = r3 & 240(0xf0, float:3.36E-43)
            int r3 = r3 >> r5
            double r8 = (double) r3
            double r8 = java.lang.Math.pow(r11, r8)
            int r3 = (int) r8
            int r5 = r26.zzl()
            r8 = 1
            r5 = r5 & r8
            if (r8 == r5) goto L_0x0069
            r21 = 0
            goto L_0x006b
        L_0x0069:
            r21 = 1
        L_0x006b:
            byte[] r4 = r26.zzI()
            int r1 = r26.zzd()
            byte[] r22 = java.util.Arrays.copyOf(r4, r1)
            com.google.android.gms.internal.ads.zzacx r1 = new com.google.android.gms.internal.ads.zzacx
            r12 = r1
            r19 = r6
            r20 = r3
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r0.zzd = r1
            goto L_0x008f
        L_0x0084:
            com.google.android.gms.internal.ads.zzacv r8 = r0.zze
            if (r8 != 0) goto L_0x0092
            r9 = 1
            com.google.android.gms.internal.ads.zzacv r1 = com.google.android.gms.internal.ads.zzacy.zzc(r1, r9, r9)
            r0.zze = r1
        L_0x008f:
            r7 = 0
            goto L_0x03c5
        L_0x0092:
            int r9 = r26.zzd()
            byte[] r9 = new byte[r9]
            byte[] r10 = r26.zzI()
            int r11 = r26.zzd()
            java.lang.System.arraycopy(r10, r4, r9, r4, r11)
            int r10 = r6.zza
            r11 = 5
            com.google.android.gms.internal.ads.zzacy.zzd(r11, r1, r4)
            int r12 = r26.zzl()
            r13 = 1
            int r12 = r12 + r13
            com.google.android.gms.internal.ads.zzacu r13 = new com.google.android.gms.internal.ads.zzacu
            byte[] r14 = r26.zzI()
            r13.<init>(r14)
            int r1 = r26.zzc()
            r14 = 8
            int r1 = r1 * 8
            r13.zzc(r1)
            r1 = 0
        L_0x00c4:
            r15 = 24
            r4 = 2
            r3 = 16
            if (r1 >= r12) goto L_0x0193
            int r14 = r13.zzb(r15)
            r7 = 5653314(0x564342, float:7.92198E-39)
            if (r14 != r7) goto L_0x0178
            int r3 = r13.zzb(r3)
            int r7 = r13.zzb(r15)
            boolean r14 = r13.zzd()
            if (r14 != 0) goto L_0x00fb
            boolean r14 = r13.zzd()
            r15 = 0
        L_0x00e7:
            if (r15 >= r7) goto L_0x010d
            if (r14 == 0) goto L_0x00f5
            boolean r18 = r13.zzd()
            if (r18 == 0) goto L_0x00f8
            r13.zzc(r11)
            goto L_0x00f8
        L_0x00f5:
            r13.zzc(r11)
        L_0x00f8:
            int r15 = r15 + 1
            goto L_0x00e7
        L_0x00fb:
            r13.zzc(r11)
            r14 = 0
        L_0x00ff:
            if (r14 >= r7) goto L_0x010d
            int r15 = r7 - r14
            int r15 = com.google.android.gms.internal.ads.zzacy.zza(r15)
            int r15 = r13.zzb(r15)
            int r14 = r14 + r15
            goto L_0x00ff
        L_0x010d:
            int r14 = r13.zzb(r5)
            if (r14 > r4) goto L_0x0161
            r15 = 1
            if (r14 == r15) goto L_0x011c
            if (r14 != r4) goto L_0x0119
            goto L_0x011d
        L_0x0119:
            r18 = r6
            goto L_0x0157
        L_0x011c:
            r4 = r14
        L_0x011d:
            r14 = 32
            r13.zzc(r14)
            r13.zzc(r14)
            int r14 = r13.zzb(r5)
            int r14 = r14 + r15
            r13.zzc(r15)
            if (r4 != r15) goto L_0x014a
            if (r3 == 0) goto L_0x0145
            r18 = r6
            long r5 = (long) r7
            long r3 = (long) r3
            double r3 = (double) r3
            double r5 = (double) r5
            r20 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r3 = r20 / r3
            double r3 = java.lang.Math.pow(r5, r3)
            double r3 = java.lang.Math.floor(r3)
            long r3 = (long) r3
            goto L_0x0150
        L_0x0145:
            r18 = r6
            r3 = 0
            goto L_0x0150
        L_0x014a:
            r18 = r6
            long r3 = (long) r3
            long r5 = (long) r7
            long r3 = r3 * r5
        L_0x0150:
            long r5 = (long) r14
            long r3 = r3 * r5
            int r4 = (int) r3
            r13.zzc(r4)
        L_0x0157:
            int r1 = r1 + 1
            r6 = r18
            r4 = 0
            r5 = 4
            r14 = 8
            goto L_0x00c4
        L_0x0161:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "lookup type greater than 2 not decodable: "
            r1.append(r2)
            r1.append(r14)
            java.lang.String r1 = r1.toString()
            r2 = 0
            com.google.android.gms.internal.ads.zzcc r1 = com.google.android.gms.internal.ads.zzcc.zza(r1, r2)
            throw r1
        L_0x0178:
            r2 = 0
            int r1 = r13.zza()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "expected code book to start with [0x56, 0x43, 0x42] at "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            com.google.android.gms.internal.ads.zzcc r1 = com.google.android.gms.internal.ads.zzcc.zza(r1, r2)
            throw r1
        L_0x0193:
            r18 = r6
            r1 = 6
            int r5 = r13.zzb(r1)
            r6 = 1
            int r5 = r5 + r6
            r6 = 0
        L_0x019d:
            if (r6 >= r5) goto L_0x01b0
            int r7 = r13.zzb(r3)
            if (r7 != 0) goto L_0x01a8
            int r6 = r6 + 1
            goto L_0x019d
        L_0x01a8:
            java.lang.String r1 = "placeholder of time domain transforms not zeroed out"
            r2 = 0
            com.google.android.gms.internal.ads.zzcc r1 = com.google.android.gms.internal.ads.zzcc.zza(r1, r2)
            throw r1
        L_0x01b0:
            int r5 = r13.zzb(r1)
            r6 = 1
            int r5 = r5 + r6
            r7 = 0
        L_0x01b7:
            r12 = 3
            if (r7 >= r5) goto L_0x0280
            int r14 = r13.zzb(r3)
            if (r14 == 0) goto L_0x024a
            if (r14 != r6) goto L_0x0233
            int r6 = r13.zzb(r11)
            int[] r14 = new int[r6]
            r11 = 0
            r15 = -1
        L_0x01ca:
            if (r11 >= r6) goto L_0x01dc
            r1 = 4
            int r3 = r13.zzb(r1)
            r14[r11] = r3
            if (r3 <= r15) goto L_0x01d6
            r15 = r3
        L_0x01d6:
            int r11 = r11 + 1
            r1 = 6
            r3 = 16
            goto L_0x01ca
        L_0x01dc:
            int r15 = r15 + 1
            int[] r1 = new int[r15]
            r3 = 0
        L_0x01e1:
            if (r3 >= r15) goto L_0x0213
            int r11 = r13.zzb(r12)
            r23 = 1
            int r11 = r11 + 1
            r1[r3] = r11
            int r11 = r13.zzb(r4)
            if (r11 <= 0) goto L_0x01f9
            r12 = 8
            r13.zzc(r12)
            goto L_0x01fb
        L_0x01f9:
            r12 = 8
        L_0x01fb:
            r24 = r5
            r4 = 0
        L_0x01fe:
            int r5 = r23 << r11
            if (r4 >= r5) goto L_0x020c
            r13.zzc(r12)
            int r4 = r4 + 1
            r12 = 8
            r23 = 1
            goto L_0x01fe
        L_0x020c:
            int r3 = r3 + 1
            r5 = r24
            r4 = 2
            r12 = 3
            goto L_0x01e1
        L_0x0213:
            r24 = r5
            r3 = 2
            r13.zzc(r3)
            r3 = 4
            int r4 = r13.zzb(r3)
            r3 = 0
            r5 = 0
            r11 = 0
        L_0x0221:
            if (r3 >= r6) goto L_0x0272
            r12 = r14[r3]
            r12 = r1[r12]
            int r5 = r5 + r12
        L_0x0228:
            if (r11 >= r5) goto L_0x0230
            r13.zzc(r4)
            int r11 = r11 + 1
            goto L_0x0228
        L_0x0230:
            int r3 = r3 + 1
            goto L_0x0221
        L_0x0233:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "floor type greater than 1 not decodable: "
            r1.append(r2)
            r1.append(r14)
            java.lang.String r1 = r1.toString()
            r2 = 0
            com.google.android.gms.internal.ads.zzcc r1 = com.google.android.gms.internal.ads.zzcc.zza(r1, r2)
            throw r1
        L_0x024a:
            r24 = r5
            r1 = 8
            r13.zzc(r1)
            r3 = 16
            r13.zzc(r3)
            r13.zzc(r3)
            r3 = 6
            r13.zzc(r3)
            r13.zzc(r1)
            r3 = 4
            int r4 = r13.zzb(r3)
            r3 = 1
            int r4 = r4 + r3
            r3 = 0
        L_0x0268:
            if (r3 >= r4) goto L_0x0272
            r13.zzc(r1)
            int r3 = r3 + 1
            r1 = 8
            goto L_0x0268
        L_0x0272:
            int r7 = r7 + 1
            r5 = r24
            r1 = 6
            r3 = 16
            r4 = 2
            r6 = 1
            r11 = 5
            r15 = 24
            goto L_0x01b7
        L_0x0280:
            int r3 = r13.zzb(r1)
            r4 = 1
            int r3 = r3 + r4
            r5 = 0
        L_0x0287:
            if (r5 >= r3) goto L_0x02f5
            r6 = 16
            int r7 = r13.zzb(r6)
            r6 = 2
            if (r7 > r6) goto L_0x02ed
            r6 = 24
            r13.zzc(r6)
            r13.zzc(r6)
            r13.zzc(r6)
            int r7 = r13.zzb(r1)
            int r7 = r7 + r4
            r1 = 8
            r13.zzc(r1)
            int[] r4 = new int[r7]
            r11 = 0
        L_0x02aa:
            if (r11 >= r7) goto L_0x02c9
            r12 = 3
            int r14 = r13.zzb(r12)
            boolean r15 = r13.zzd()
            if (r15 == 0) goto L_0x02bd
            r15 = 5
            int r20 = r13.zzb(r15)
            goto L_0x02c0
        L_0x02bd:
            r15 = 5
            r20 = 0
        L_0x02c0:
            int r20 = r20 * 8
            int r20 = r20 + r14
            r4[r11] = r20
            int r11 = r11 + 1
            goto L_0x02aa
        L_0x02c9:
            r12 = 3
            r15 = 5
            r11 = 0
        L_0x02cc:
            if (r11 >= r7) goto L_0x02e8
            r14 = 0
        L_0x02cf:
            if (r14 >= r1) goto L_0x02e3
            r20 = r4[r11]
            r21 = 1
            int r23 = r21 << r14
            r20 = r20 & r23
            if (r20 == 0) goto L_0x02de
            r13.zzc(r1)
        L_0x02de:
            int r14 = r14 + 1
            r1 = 8
            goto L_0x02cf
        L_0x02e3:
            int r11 = r11 + 1
            r1 = 8
            goto L_0x02cc
        L_0x02e8:
            int r5 = r5 + 1
            r1 = 6
            r4 = 1
            goto L_0x0287
        L_0x02ed:
            java.lang.String r1 = "residueType greater than 2 is not decodable"
            r2 = 0
            com.google.android.gms.internal.ads.zzcc r1 = com.google.android.gms.internal.ads.zzcc.zza(r1, r2)
            throw r1
        L_0x02f5:
            int r3 = r13.zzb(r1)
            r1 = 1
            int r3 = r3 + r1
            r1 = 0
        L_0x02fc:
            if (r1 >= r3) goto L_0x0383
            r4 = 16
            int r5 = r13.zzb(r4)
            if (r5 == 0) goto L_0x031f
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "mapping type other than 0 not supported: "
            r4.append(r6)
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = "VorbisUtil"
            com.google.android.gms.internal.ads.zzer.zzc(r5, r4)
            r4 = 2
            r7 = 4
            goto L_0x0378
        L_0x031f:
            boolean r4 = r13.zzd()
            if (r4 == 0) goto L_0x032d
            r4 = 4
            int r5 = r13.zzb(r4)
            r4 = 1
            int r5 = r5 + r4
            goto L_0x032f
        L_0x032d:
            r4 = 1
            r5 = 1
        L_0x032f:
            boolean r6 = r13.zzd()
            if (r6 == 0) goto L_0x0352
            r6 = 8
            int r7 = r13.zzb(r6)
            int r7 = r7 + r4
            r4 = 0
        L_0x033d:
            if (r4 >= r7) goto L_0x0352
            int r6 = r10 + -1
            int r11 = com.google.android.gms.internal.ads.zzacy.zza(r6)
            r13.zzc(r11)
            int r6 = com.google.android.gms.internal.ads.zzacy.zza(r6)
            r13.zzc(r6)
            int r4 = r4 + 1
            goto L_0x033d
        L_0x0352:
            r4 = 2
            int r6 = r13.zzb(r4)
            if (r6 != 0) goto L_0x037b
            r6 = 1
            if (r5 <= r6) goto L_0x0366
            r6 = 0
        L_0x035d:
            if (r6 >= r10) goto L_0x0366
            r7 = 4
            r13.zzc(r7)
            int r6 = r6 + 1
            goto L_0x035d
        L_0x0366:
            r7 = 4
            r6 = 0
        L_0x0368:
            if (r6 >= r5) goto L_0x0378
            r11 = 8
            r13.zzc(r11)
            r13.zzc(r11)
            r13.zzc(r11)
            int r6 = r6 + 1
            goto L_0x0368
        L_0x0378:
            int r1 = r1 + 1
            goto L_0x02fc
        L_0x037b:
            java.lang.String r1 = "to reserved bits must be zero after mapping coupling steps"
            r2 = 0
            com.google.android.gms.internal.ads.zzcc r1 = com.google.android.gms.internal.ads.zzcc.zza(r1, r2)
            throw r1
        L_0x0383:
            r1 = 6
            int r1 = r13.zzb(r1)
            r3 = 1
            int r1 = r1 + r3
            com.google.android.gms.internal.ads.zzacw[] r3 = new com.google.android.gms.internal.ads.zzacw[r1]
            r4 = 0
        L_0x038d:
            if (r4 >= r1) goto L_0x03ad
            boolean r5 = r13.zzd()
            r6 = 16
            int r7 = r13.zzb(r6)
            int r10 = r13.zzb(r6)
            r11 = 8
            int r12 = r13.zzb(r11)
            com.google.android.gms.internal.ads.zzacw r14 = new com.google.android.gms.internal.ads.zzacw
            r14.<init>(r5, r7, r10, r12)
            r3[r4] = r14
            int r4 = r4 + 1
            goto L_0x038d
        L_0x03ad:
            boolean r4 = r13.zzd()
            if (r4 == 0) goto L_0x0414
            r4 = -1
            int r1 = r1 + r4
            com.google.android.gms.internal.ads.zzaio r4 = new com.google.android.gms.internal.ads.zzaio
            int r10 = com.google.android.gms.internal.ads.zzacy.zza(r1)
            r5 = r4
            r6 = r18
            r7 = r8
            r8 = r9
            r9 = r3
            r5.<init>(r6, r7, r8, r9, r10)
            r7 = r4
        L_0x03c5:
            r0.zza = r7
            if (r7 != 0) goto L_0x03cb
            r1 = 1
            return r1
        L_0x03cb:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            com.google.android.gms.internal.ads.zzacx r3 = r7.zza
            byte[] r4 = r3.zzg
            r1.add(r4)
            byte[] r4 = r7.zzc
            r1.add(r4)
            com.google.android.gms.internal.ads.zzacv r4 = r7.zzb
            java.lang.String[] r4 = r4.zzb
            com.google.android.gms.internal.ads.zzfvs r4 = com.google.android.gms.internal.ads.zzfvs.zzk(r4)
            com.google.android.gms.internal.ads.zzby r4 = com.google.android.gms.internal.ads.zzacy.zzb(r4)
            com.google.android.gms.internal.ads.zzak r5 = new com.google.android.gms.internal.ads.zzak
            r5.<init>()
            java.lang.String r6 = "audio/vorbis"
            r5.zzU(r6)
            int r6 = r3.zzd
            r5.zzx(r6)
            int r6 = r3.zzc
            r5.zzQ(r6)
            int r6 = r3.zza
            r5.zzy(r6)
            int r3 = r3.zzb
            r5.zzV(r3)
            r5.zzK(r1)
            r5.zzO(r4)
            com.google.android.gms.internal.ads.zzam r1 = r5.zzac()
            r2.zza = r1
            r1 = 1
            return r1
        L_0x0414:
            java.lang.String r1 = "framing bit after modes not set as expected"
            r2 = 0
            com.google.android.gms.internal.ads.zzcc r1 = com.google.android.gms.internal.ads.zzcc.zza(r1, r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaip.zzc(com.google.android.gms.internal.ads.zzfb, long, com.google.android.gms.internal.ads.zzaik):boolean");
    }

    /* access modifiers changed from: protected */
    public final void zzi(long j10) {
        super.zzi(j10);
        int i10 = 0;
        this.zzc = j10 != 0;
        zzacx zzacx = this.zzd;
        if (zzacx != null) {
            i10 = zzacx.zze;
        }
        this.zzb = i10;
    }
}
