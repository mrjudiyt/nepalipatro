package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzadv implements zzabm {
    public static final zzabt zza = zzadu.zza;
    private final zzfb zzb = new zzfb(4);
    private final zzfb zzc = new zzfb(9);
    private final zzfb zzd = new zzfb(11);
    private final zzfb zze = new zzfb();
    private final zzadw zzf = new zzadw();
    private zzabp zzg;
    private int zzh = 1;
    private boolean zzi;
    private long zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private long zzn;
    private boolean zzo;
    private zzadt zzp;
    private zzadz zzq;

    private final zzfb zza(zzabn zzabn) {
        if (this.zzm > this.zze.zzb()) {
            zzfb zzfb = this.zze;
            int zzb2 = zzfb.zzb();
            zzfb.zzE(new byte[Math.max(zzb2 + zzb2, this.zzm)], 0);
        } else {
            this.zze.zzG(0);
        }
        this.zze.zzF(this.zzm);
        ((zzabc) zzabn).zzn(this.zze.zzI(), 0, this.zzm, false);
        return this.zze;
    }

    private final void zzf() {
        if (!this.zzo) {
            this.zzg.zzO(new zzacl(-9223372036854775807L, 0));
            this.zzo = true;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c2 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0009 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int zzb(com.google.android.gms.internal.ads.zzabn r17, com.google.android.gms.internal.ads.zzacj r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            com.google.android.gms.internal.ads.zzabp r2 = r0.zzg
            com.google.android.gms.internal.ads.zzdx.zzb(r2)
        L_0x0009:
            int r2 = r0.zzh
            r3 = -1
            r4 = 8
            r5 = 9
            r6 = 2
            r7 = 4
            r8 = 0
            r9 = 1
            if (r2 == r9) goto L_0x0120
            r10 = 3
            if (r2 == r6) goto L_0x0112
            if (r2 == r10) goto L_0x00c9
            if (r2 != r7) goto L_0x00c3
            boolean r2 = r0.zzi
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r2 == 0) goto L_0x002c
            long r2 = r0.zzj
            long r14 = r0.zzn
            long r2 = r2 + r14
            goto L_0x003b
        L_0x002c:
            com.google.android.gms.internal.ads.zzadw r2 = r0.zzf
            long r2 = r2.zzc()
            int r14 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r14 != 0) goto L_0x0039
            r2 = 0
            goto L_0x003b
        L_0x0039:
            long r2 = r0.zzn
        L_0x003b:
            int r14 = r0.zzl
            if (r14 != r4) goto L_0x0052
            com.google.android.gms.internal.ads.zzadt r14 = r0.zzp
            if (r14 == 0) goto L_0x0053
            r16.zzf()
            com.google.android.gms.internal.ads.zzadt r4 = r0.zzp
            com.google.android.gms.internal.ads.zzfb r5 = r16.zza(r17)
            boolean r2 = r4.zzf(r5, r2)
        L_0x0050:
            r3 = 1
            goto L_0x00a2
        L_0x0052:
            r4 = r14
        L_0x0053:
            if (r4 != r5) goto L_0x0067
            com.google.android.gms.internal.ads.zzadz r4 = r0.zzq
            if (r4 == 0) goto L_0x0098
            r16.zzf()
            com.google.android.gms.internal.ads.zzadz r4 = r0.zzq
            com.google.android.gms.internal.ads.zzfb r5 = r16.zza(r17)
            boolean r2 = r4.zzf(r5, r2)
            goto L_0x0050
        L_0x0067:
            r5 = 18
            if (r4 != r5) goto L_0x0098
            boolean r4 = r0.zzo
            if (r4 != 0) goto L_0x0098
            com.google.android.gms.internal.ads.zzadw r4 = r0.zzf
            com.google.android.gms.internal.ads.zzfb r5 = r16.zza(r17)
            boolean r2 = r4.zzf(r5, r2)
            com.google.android.gms.internal.ads.zzadw r3 = r0.zzf
            long r4 = r3.zzc()
            int r14 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r14 == 0) goto L_0x0050
            com.google.android.gms.internal.ads.zzabp r14 = r0.zzg
            com.google.android.gms.internal.ads.zzacf r15 = new com.google.android.gms.internal.ads.zzacf
            long[] r10 = r3.zzd()
            long[] r3 = r3.zze()
            r15.<init>(r10, r3, r4)
            r14.zzO(r15)
            r0.zzo = r9
            goto L_0x0050
        L_0x0098:
            int r2 = r0.zzm
            r3 = r1
            com.google.android.gms.internal.ads.zzabc r3 = (com.google.android.gms.internal.ads.zzabc) r3
            r3.zzo(r2, r8)
            r2 = 0
            r3 = 0
        L_0x00a2:
            boolean r4 = r0.zzi
            if (r4 != 0) goto L_0x00bc
            if (r2 == 0) goto L_0x00bc
            r0.zzi = r9
            com.google.android.gms.internal.ads.zzadw r2 = r0.zzf
            long r4 = r2.zzc()
            int r2 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r2 != 0) goto L_0x00b8
            long r4 = r0.zzn
            long r10 = -r4
            goto L_0x00ba
        L_0x00b8:
            r10 = 0
        L_0x00ba:
            r0.zzj = r10
        L_0x00bc:
            r0.zzk = r7
            r0.zzh = r6
            if (r3 == 0) goto L_0x0009
            return r8
        L_0x00c3:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            throw r1
        L_0x00c9:
            com.google.android.gms.internal.ads.zzfb r2 = r0.zzd
            byte[] r2 = r2.zzI()
            r4 = 11
            boolean r2 = r1.zzn(r2, r8, r4, r9)
            if (r2 != 0) goto L_0x00d8
            return r3
        L_0x00d8:
            com.google.android.gms.internal.ads.zzfb r2 = r0.zzd
            r2.zzG(r8)
            com.google.android.gms.internal.ads.zzfb r2 = r0.zzd
            int r2 = r2.zzl()
            r0.zzl = r2
            com.google.android.gms.internal.ads.zzfb r2 = r0.zzd
            int r2 = r2.zzn()
            r0.zzm = r2
            com.google.android.gms.internal.ads.zzfb r2 = r0.zzd
            int r2 = r2.zzn()
            long r2 = (long) r2
            r0.zzn = r2
            com.google.android.gms.internal.ads.zzfb r2 = r0.zzd
            int r2 = r2.zzl()
            int r2 = r2 << 24
            long r3 = r0.zzn
            long r5 = (long) r2
            long r2 = r5 | r3
            r4 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r4
            r0.zzn = r2
            com.google.android.gms.internal.ads.zzfb r2 = r0.zzd
            r2.zzH(r10)
            r0.zzh = r7
            goto L_0x0009
        L_0x0112:
            int r2 = r0.zzk
            r3 = r1
            com.google.android.gms.internal.ads.zzabc r3 = (com.google.android.gms.internal.ads.zzabc) r3
            r3.zzo(r2, r8)
            r0.zzk = r8
            r0.zzh = r10
            goto L_0x0009
        L_0x0120:
            com.google.android.gms.internal.ads.zzfb r2 = r0.zzc
            byte[] r2 = r2.zzI()
            boolean r2 = r1.zzn(r2, r8, r5, r9)
            if (r2 != 0) goto L_0x012d
            return r3
        L_0x012d:
            com.google.android.gms.internal.ads.zzfb r2 = r0.zzc
            r2.zzG(r8)
            com.google.android.gms.internal.ads.zzfb r2 = r0.zzc
            r2.zzH(r7)
            com.google.android.gms.internal.ads.zzfb r2 = r0.zzc
            int r2 = r2.zzl()
            r3 = r2 & 4
            r2 = r2 & r9
            if (r3 == 0) goto L_0x0153
            com.google.android.gms.internal.ads.zzadt r3 = r0.zzp
            if (r3 != 0) goto L_0x0153
            com.google.android.gms.internal.ads.zzadt r3 = new com.google.android.gms.internal.ads.zzadt
            com.google.android.gms.internal.ads.zzabp r7 = r0.zzg
            com.google.android.gms.internal.ads.zzacs r4 = r7.zzw(r4, r9)
            r3.<init>(r4)
            r0.zzp = r3
        L_0x0153:
            if (r2 == 0) goto L_0x0166
            com.google.android.gms.internal.ads.zzadz r2 = r0.zzq
            if (r2 != 0) goto L_0x0166
            com.google.android.gms.internal.ads.zzadz r2 = new com.google.android.gms.internal.ads.zzadz
            com.google.android.gms.internal.ads.zzabp r3 = r0.zzg
            com.google.android.gms.internal.ads.zzacs r3 = r3.zzw(r5, r6)
            r2.<init>(r3)
            r0.zzq = r2
        L_0x0166:
            com.google.android.gms.internal.ads.zzabp r2 = r0.zzg
            r2.zzD()
            com.google.android.gms.internal.ads.zzfb r2 = r0.zzc
            int r2 = r2.zzf()
            int r2 = r2 + -5
            r0.zzk = r2
            r0.zzh = r6
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzadv.zzb(com.google.android.gms.internal.ads.zzabn, com.google.android.gms.internal.ads.zzacj):int");
    }

    public final void zzc(zzabp zzabp) {
        this.zzg = zzabp;
    }

    public final void zzd(long j10, long j11) {
        if (j10 == 0) {
            this.zzh = 1;
            this.zzi = false;
        } else {
            this.zzh = 3;
        }
        this.zzk = 0;
    }

    public final boolean zze(zzabn zzabn) {
        zzabc zzabc = (zzabc) zzabn;
        zzabc.zzm(this.zzb.zzI(), 0, 3, false);
        this.zzb.zzG(0);
        if (this.zzb.zzn() != 4607062) {
            return false;
        }
        zzabc.zzm(this.zzb.zzI(), 0, 2, false);
        this.zzb.zzG(0);
        if ((this.zzb.zzp() & 250) != 0) {
            return false;
        }
        zzabc.zzm(this.zzb.zzI(), 0, 4, false);
        this.zzb.zzG(0);
        int zzf2 = this.zzb.zzf();
        zzabn.zzj();
        zzabc zzabc2 = (zzabc) zzabn;
        zzabc2.zzl(zzf2, false);
        zzabc2.zzm(this.zzb.zzI(), 0, 4, false);
        this.zzb.zzG(0);
        if (this.zzb.zzf() == 0) {
            return true;
        }
        return false;
    }
}
