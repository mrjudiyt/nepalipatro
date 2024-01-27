package com.google.android.gms.internal.ads;

import com.facebook.internal.FacebookRequestErrorClassification;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzakv implements zzakw {
    private static final int[] zza = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};
    private static final int[] zzb = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, FacebookRequestErrorClassification.EC_INVALID_TOKEN, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};
    private final zzabp zzc;
    private final zzacs zzd;
    private final zzakz zze;
    private final int zzf;
    private final byte[] zzg;
    private final zzfb zzh;
    private final int zzi;
    private final zzam zzj;
    private int zzk;
    private long zzl;
    private int zzm;
    private long zzn;

    public zzakv(zzabp zzabp, zzacs zzacs, zzakz zzakz) {
        this.zzc = zzabp;
        this.zzd = zzacs;
        this.zze = zzakz;
        int max = Math.max(1, zzakz.zzc / 10);
        this.zzi = max;
        zzfb zzfb = new zzfb(zzakz.zzf);
        zzfb.zzj();
        int zzj2 = zzfb.zzj();
        this.zzf = zzj2;
        int i10 = zzakz.zzb;
        int i11 = zzakz.zzd;
        int i12 = (((i11 - (i10 * 4)) * 8) / (zzakz.zze * i10)) + 1;
        if (zzj2 == i12) {
            int i13 = zzfk.zza;
            int i14 = ((max + zzj2) - 1) / zzj2;
            this.zzg = new byte[(i11 * i14)];
            this.zzh = new zzfb(i14 * (zzj2 + zzj2) * i10);
            int i15 = ((zzakz.zzc * zzakz.zzd) * 8) / zzj2;
            zzak zzak = new zzak();
            zzak.zzU("audio/raw");
            zzak.zzx(i15);
            zzak.zzQ(i15);
            zzak.zzN((max + max) * i10);
            zzak.zzy(zzakz.zzb);
            zzak.zzV(zzakz.zzc);
            zzak.zzP(2);
            this.zzj = zzak.zzac();
            return;
        }
        throw zzcc.zza("Expected frames per block: " + i12 + "; got: " + zzj2, (Throwable) null);
    }

    private final int zzd(int i10) {
        int i11 = this.zze.zzb;
        return i10 / (i11 + i11);
    }

    private final int zze(int i10) {
        return (i10 + i10) * this.zze.zzb;
    }

    private final void zzf(int i10) {
        long zzr = this.zzl + zzfk.zzr(this.zzn, 1000000, (long) this.zze.zzc);
        int zze2 = zze(i10);
        this.zzd.zzt(zzr, 1, zze2, this.zzm - zze2, (zzacr) null);
        this.zzn += (long) i10;
        this.zzm -= zze2;
    }

    public final void zza(int i10, long j10) {
        this.zzc.zzO(new zzalc(this.zze, this.zzf, (long) i10, j10));
        this.zzd.zzl(this.zzj);
    }

    public final void zzb(long j10) {
        this.zzk = 0;
        this.zzl = j10;
        this.zzm = 0;
        this.zzn = 0;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0045 A[EDGE_INSN: B:38:0x0045->B:10:0x0045 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:5:0x0026  */
    public final boolean zzc(com.google.android.gms.internal.ads.zzabn r21, long r22) {
        /*
            r20 = this;
            r0 = r20
            r1 = r22
            int r3 = r0.zzm
            int r3 = r0.zzd(r3)
            int r4 = r0.zzi
            int r4 = r4 - r3
            int r3 = com.google.android.gms.internal.ads.zzfk.zza
            int r3 = r0.zzf
            int r4 = r4 + r3
            com.google.android.gms.internal.ads.zzakz r5 = r0.zze
            r6 = -1
            int r4 = r4 + r6
            int r4 = r4 / r3
            int r3 = r5.zzd
            int r4 = r4 * r3
            r7 = 0
            int r9 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r9 != 0) goto L_0x0023
        L_0x0021:
            r7 = 1
            goto L_0x0024
        L_0x0023:
            r7 = 0
        L_0x0024:
            if (r7 != 0) goto L_0x0045
            int r8 = r0.zzk
            if (r8 >= r4) goto L_0x0045
            int r8 = r4 - r8
            long r8 = (long) r8
            long r8 = java.lang.Math.min(r8, r1)
            int r9 = (int) r8
            byte[] r8 = r0.zzg
            int r10 = r0.zzk
            r11 = r21
            int r8 = r11.zza(r8, r10, r9)
            if (r8 != r6) goto L_0x003f
            goto L_0x0021
        L_0x003f:
            int r9 = r0.zzk
            int r9 = r9 + r8
            r0.zzk = r9
            goto L_0x0024
        L_0x0045:
            int r1 = r0.zzk
            com.google.android.gms.internal.ads.zzakz r2 = r0.zze
            int r2 = r2.zzd
            int r1 = r1 / r2
            if (r1 <= 0) goto L_0x0150
            byte[] r2 = r0.zzg
            com.google.android.gms.internal.ads.zzfb r4 = r0.zzh
            r6 = 0
        L_0x0053:
            if (r6 >= r1) goto L_0x011b
            r8 = 0
        L_0x0056:
            com.google.android.gms.internal.ads.zzakz r9 = r0.zze
            int r10 = r9.zzb
            if (r8 >= r10) goto L_0x0113
            byte[] r11 = r4.zzI()
            int r9 = r9.zzd
            int r12 = r6 * r9
            int r9 = r9 / r10
            int r9 = r9 + -4
            int r13 = r8 * 4
            int r12 = r12 + r13
            int r13 = r12 + 1
            byte r13 = r2[r13]
            r13 = r13 & 255(0xff, float:3.57E-43)
            byte r14 = r2[r12]
            r14 = r14 & 255(0xff, float:3.57E-43)
            int r15 = r12 + 2
            byte r15 = r2[r15]
            r15 = r15 & 255(0xff, float:3.57E-43)
            r3 = 88
            int r15 = java.lang.Math.min(r15, r3)
            int[] r16 = zzb
            r16 = r16[r15]
            int r3 = r0.zzf
            int r3 = r3 * r6
            int r3 = r3 * r10
            int r3 = r3 + r8
            int r13 = r13 << 8
            r13 = r13 | r14
            short r13 = (short) r13
            r14 = r13 & 255(0xff, float:3.57E-43)
            int r3 = r3 + r3
            byte r14 = (byte) r14
            r11[r3] = r14
            int r14 = r3 + 1
            int r5 = r13 >> 8
            byte r5 = (byte) r5
            r11[r14] = r5
            r5 = 0
        L_0x009d:
            int r14 = r9 + r9
            if (r5 >= r14) goto L_0x010b
            int r14 = r10 * 4
            int r14 = r14 + r12
            int r18 = r5 / 8
            int r19 = r5 / 2
            int r19 = r19 % 4
            int r18 = r18 * r10
            int r18 = r18 * 4
            int r14 = r14 + r18
            int r14 = r14 + r19
            byte r14 = r2[r14]
            r14 = r14 & 255(0xff, float:3.57E-43)
            int r18 = r5 % 2
            if (r18 != 0) goto L_0x00bd
            r14 = r14 & 15
            goto L_0x00bf
        L_0x00bd:
            int r14 = r14 >> 4
        L_0x00bf:
            r18 = r14 & 7
            int r18 = r18 + r18
            r17 = 1
            int r18 = r18 + 1
            int r18 = r18 * r16
            r16 = r14 & 8
            r19 = r2
            int r2 = r18 >> 3
            if (r16 == 0) goto L_0x00d2
            int r2 = -r2
        L_0x00d2:
            r22 = r9
            r9 = -32768(0xffffffffffff8000, float:NaN)
            int r13 = r13 + r2
            r2 = 32767(0x7fff, float:4.5916E-41)
            int r2 = java.lang.Math.min(r13, r2)
            int r13 = java.lang.Math.max(r9, r2)
            int r2 = r10 + r10
            int r3 = r3 + r2
            r2 = r13 & 255(0xff, float:3.57E-43)
            byte r2 = (byte) r2
            r11[r3] = r2
            int r2 = r3 + 1
            int r9 = r13 >> 8
            byte r9 = (byte) r9
            r11[r2] = r9
            int[] r2 = zza
            r2 = r2[r14]
            int r15 = r15 + r2
            r2 = 88
            int r9 = java.lang.Math.min(r15, r2)
            r14 = 0
            int r15 = java.lang.Math.max(r14, r9)
            int[] r9 = zzb
            r16 = r9[r15]
            int r5 = r5 + 1
            r9 = r22
            r2 = r19
            goto L_0x009d
        L_0x010b:
            r19 = r2
            r17 = 1
            int r8 = r8 + 1
            goto L_0x0056
        L_0x0113:
            r19 = r2
            r17 = 1
            int r6 = r6 + 1
            goto L_0x0053
        L_0x011b:
            int r2 = r0.zzf
            int r2 = r2 * r1
            int r2 = r0.zze(r2)
            r3 = 0
            r4.zzG(r3)
            r4.zzF(r2)
            int r2 = r0.zzk
            com.google.android.gms.internal.ads.zzakz r3 = r0.zze
            int r3 = r3.zzd
            int r1 = r1 * r3
            int r2 = r2 - r1
            r0.zzk = r2
            com.google.android.gms.internal.ads.zzfb r1 = r0.zzh
            com.google.android.gms.internal.ads.zzacs r2 = r0.zzd
            int r3 = r1.zzd()
            com.google.android.gms.internal.ads.zzacq.zzb(r2, r1, r3)
            int r1 = r0.zzm
            int r1 = r1 + r3
            r0.zzm = r1
            int r1 = r0.zzd(r1)
            int r2 = r0.zzi
            if (r1 < r2) goto L_0x0150
            r0.zzf(r2)
        L_0x0150:
            if (r7 == 0) goto L_0x015d
            int r1 = r0.zzm
            int r1 = r0.zzd(r1)
            if (r1 <= 0) goto L_0x015d
            r0.zzf(r1)
        L_0x015d:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzakv.zzc(com.google.android.gms.internal.ads.zzabn, long):boolean");
    }
}
