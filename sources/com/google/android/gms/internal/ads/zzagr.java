package com.google.android.gms.internal.ads;

import java.io.EOFException;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzagr implements zzabm {
    public static final zzabt zza = zzagp.zza;
    private static final zzafe zzb = zzagq.zza;
    private final zzfb zzc;
    private final zzacg zzd;
    private final zzacc zze;
    private final zzace zzf;
    private final zzacs zzg;
    private zzabp zzh;
    private zzacs zzi;
    private zzacs zzj;
    private int zzk;
    private zzby zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private int zzp;
    private zzagt zzq;
    private boolean zzr;

    public zzagr() {
        this(0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0087 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0163  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0169  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int zzf(com.google.android.gms.internal.ads.zzabn r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            int r2 = r0.zzk
            r3 = -1
            r4 = 0
            if (r2 != 0) goto L_0x000f
            r0.zzk(r1, r4)     // Catch:{ EOFException -> 0x000e }
            goto L_0x000f
        L_0x000e:
            return r3
        L_0x000f:
            com.google.android.gms.internal.ads.zzagt r2 = r0.zzq
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r8 = 1
            if (r2 != 0) goto L_0x01c3
            com.google.android.gms.internal.ads.zzacg r2 = r0.zzd
            com.google.android.gms.internal.ads.zzfb r14 = new com.google.android.gms.internal.ads.zzfb
            int r2 = r2.zzc
            r14.<init>((int) r2)
            byte[] r2 = r14.zzI()
            com.google.android.gms.internal.ads.zzacg r9 = r0.zzd
            int r9 = r9.zzc
            r10 = r1
            com.google.android.gms.internal.ads.zzabc r10 = (com.google.android.gms.internal.ads.zzabc) r10
            r10.zzm(r2, r4, r9, r4)
            com.google.android.gms.internal.ads.zzacg r2 = r0.zzd
            int r9 = r2.zza
            r9 = r9 & r8
            r10 = 36
            r11 = 21
            if (r9 == 0) goto L_0x0042
            int r2 = r2.zze
            if (r2 == r8) goto L_0x0046
            r2 = 36
            goto L_0x004d
        L_0x0042:
            int r2 = r2.zze
            if (r2 == r8) goto L_0x0049
        L_0x0046:
            r2 = 21
            goto L_0x004d
        L_0x0049:
            r11 = 13
            r2 = 13
        L_0x004d:
            int r9 = r14.zzd()
            int r11 = r2 + 4
            r12 = 1483304551(0x58696e67, float:1.02664153E15)
            r13 = 1447187017(0x56425249, float:5.3414667E13)
            r15 = 1231971951(0x496e666f, float:976486.94)
            if (r9 < r11) goto L_0x006f
            r14.zzG(r2)
            int r9 = r14.zzf()
            if (r9 == r12) goto L_0x006d
            if (r9 != r15) goto L_0x006f
            r11 = 1231971951(0x496e666f, float:976486.94)
            goto L_0x0085
        L_0x006d:
            r11 = r9
            goto L_0x0085
        L_0x006f:
            int r9 = r14.zzd()
            r11 = 40
            if (r9 < r11) goto L_0x0084
            r14.zzG(r10)
            int r9 = r14.zzf()
            if (r9 != r13) goto L_0x0084
            r11 = 1447187017(0x56425249, float:5.3414667E13)
            goto L_0x0085
        L_0x0084:
            r11 = 0
        L_0x0085:
            if (r11 == r12) goto L_0x00aa
            if (r11 != r15) goto L_0x008a
            goto L_0x00aa
        L_0x008a:
            if (r11 != r13) goto L_0x00a5
            long r9 = r17.zzd()
            long r11 = r17.zzf()
            com.google.android.gms.internal.ads.zzacg r13 = r0.zzd
            com.google.android.gms.internal.ads.zzagu r2 = com.google.android.gms.internal.ads.zzagu.zzb(r9, r11, r13, r14)
            com.google.android.gms.internal.ads.zzacg r9 = r0.zzd
            int r9 = r9.zzc
            r10 = r1
            com.google.android.gms.internal.ads.zzabc r10 = (com.google.android.gms.internal.ads.zzabc) r10
            r10.zzo(r9, r4)
            goto L_0x010d
        L_0x00a5:
            r17.zzj()
            r2 = 0
            goto L_0x010d
        L_0x00aa:
            long r9 = r17.zzd()
            long r12 = r17.zzf()
            com.google.android.gms.internal.ads.zzacg r8 = r0.zzd
            r7 = r11
            r11 = r12
            r13 = r8
            com.google.android.gms.internal.ads.zzagv r8 = com.google.android.gms.internal.ads.zzagv.zzb(r9, r11, r13, r14)
            if (r8 == 0) goto L_0x00f3
            com.google.android.gms.internal.ads.zzacc r9 = r0.zze
            boolean r9 = r9.zza()
            if (r9 != 0) goto L_0x00f3
            r17.zzj()
            int r2 = r2 + 141
            r9 = r1
            com.google.android.gms.internal.ads.zzabc r9 = (com.google.android.gms.internal.ads.zzabc) r9
            r9.zzl(r2, r4)
            com.google.android.gms.internal.ads.zzfb r2 = r0.zzc
            byte[] r2 = r2.zzI()
            r10 = 3
            r9.zzm(r2, r4, r10, r4)
            com.google.android.gms.internal.ads.zzfb r2 = r0.zzc
            r2.zzG(r4)
            com.google.android.gms.internal.ads.zzacc r2 = r0.zze
            com.google.android.gms.internal.ads.zzfb r9 = r0.zzc
            int r9 = r9.zzn()
            int r10 = r9 >> 12
            r9 = r9 & 4095(0xfff, float:5.738E-42)
            if (r10 > 0) goto L_0x00ef
            if (r9 <= 0) goto L_0x00f3
        L_0x00ef:
            r2.zza = r10
            r2.zzb = r9
        L_0x00f3:
            com.google.android.gms.internal.ads.zzacg r2 = r0.zzd
            int r2 = r2.zzc
            r9 = r1
            com.google.android.gms.internal.ads.zzabc r9 = (com.google.android.gms.internal.ads.zzabc) r9
            r9.zzo(r2, r4)
            if (r8 == 0) goto L_0x010c
            boolean r2 = r8.zzh()
            if (r2 != 0) goto L_0x010c
            if (r7 != r15) goto L_0x010c
            com.google.android.gms.internal.ads.zzagt r2 = r0.zzh(r1, r4)
            goto L_0x010d
        L_0x010c:
            r2 = r8
        L_0x010d:
            com.google.android.gms.internal.ads.zzby r7 = r0.zzl
            long r8 = r17.zzf()
            if (r7 == 0) goto L_0x015e
            int r10 = r7.zza()
            r11 = 0
        L_0x011a:
            if (r11 >= r10) goto L_0x015e
            com.google.android.gms.internal.ads.zzbx r12 = r7.zzb(r11)
            boolean r13 = r12 instanceof com.google.android.gms.internal.ads.zzafl
            if (r13 == 0) goto L_0x015b
            com.google.android.gms.internal.ads.zzafl r12 = (com.google.android.gms.internal.ads.zzafl) r12
            int r10 = r7.zza()
            r11 = 0
        L_0x012b:
            if (r11 >= r10) goto L_0x0155
            com.google.android.gms.internal.ads.zzbx r13 = r7.zzb(r11)
            boolean r14 = r13 instanceof com.google.android.gms.internal.ads.zzafp
            if (r14 == 0) goto L_0x0152
            com.google.android.gms.internal.ads.zzafp r13 = (com.google.android.gms.internal.ads.zzafp) r13
            java.lang.String r14 = r13.zzf
            java.lang.String r15 = "TLEN"
            boolean r14 = r14.equals(r15)
            if (r14 == 0) goto L_0x0152
            com.google.android.gms.internal.ads.zzfvs r7 = r13.zzc
            java.lang.Object r7 = r7.get(r4)
            java.lang.String r7 = (java.lang.String) r7
            long r10 = java.lang.Long.parseLong(r7)
            long r10 = com.google.android.gms.internal.ads.zzfk.zzq(r10)
            goto L_0x0156
        L_0x0152:
            int r11 = r11 + 1
            goto L_0x012b
        L_0x0155:
            r10 = r5
        L_0x0156:
            com.google.android.gms.internal.ads.zzago r7 = com.google.android.gms.internal.ads.zzago.zzb(r8, r12, r10)
            goto L_0x015f
        L_0x015b:
            int r11 = r11 + 1
            goto L_0x011a
        L_0x015e:
            r7 = 0
        L_0x015f:
            boolean r8 = r0.zzr
            if (r8 == 0) goto L_0x0169
            com.google.android.gms.internal.ads.zzags r2 = new com.google.android.gms.internal.ads.zzags
            r2.<init>()
            goto L_0x017a
        L_0x0169:
            if (r7 == 0) goto L_0x016d
            r2 = r7
            goto L_0x0170
        L_0x016d:
            if (r2 != 0) goto L_0x0170
            r2 = 0
        L_0x0170:
            if (r2 == 0) goto L_0x0176
            r2.zzh()
            goto L_0x017a
        L_0x0176:
            com.google.android.gms.internal.ads.zzagt r2 = r0.zzh(r1, r4)
        L_0x017a:
            r0.zzq = r2
            com.google.android.gms.internal.ads.zzabp r7 = r0.zzh
            r7.zzO(r2)
            com.google.android.gms.internal.ads.zzacs r2 = r0.zzj
            com.google.android.gms.internal.ads.zzak r7 = new com.google.android.gms.internal.ads.zzak
            r7.<init>()
            com.google.android.gms.internal.ads.zzacg r8 = r0.zzd
            java.lang.String r8 = r8.zzb
            r7.zzU(r8)
            r8 = 4096(0x1000, float:5.74E-42)
            r7.zzN(r8)
            com.google.android.gms.internal.ads.zzacg r8 = r0.zzd
            int r8 = r8.zze
            r7.zzy(r8)
            com.google.android.gms.internal.ads.zzacg r8 = r0.zzd
            int r8 = r8.zzd
            r7.zzV(r8)
            com.google.android.gms.internal.ads.zzacc r8 = r0.zze
            int r8 = r8.zza
            r7.zzE(r8)
            com.google.android.gms.internal.ads.zzacc r8 = r0.zze
            int r8 = r8.zzb
            r7.zzF(r8)
            com.google.android.gms.internal.ads.zzby r8 = r0.zzl
            r7.zzO(r8)
            com.google.android.gms.internal.ads.zzam r7 = r7.zzac()
            r2.zzl(r7)
            long r7 = r17.zzf()
            r0.zzo = r7
            goto L_0x01db
        L_0x01c3:
            long r7 = r0.zzo
            r9 = 0
            int r2 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r2 == 0) goto L_0x01db
            long r9 = r17.zzf()
            int r2 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r2 >= 0) goto L_0x01db
            long r7 = r7 - r9
            r2 = r1
            com.google.android.gms.internal.ads.zzabc r2 = (com.google.android.gms.internal.ads.zzabc) r2
            int r8 = (int) r7
            r2.zzo(r8, r4)
        L_0x01db:
            int r2 = r0.zzp
            if (r2 != 0) goto L_0x023f
            r17.zzj()
            boolean r2 = r16.zzj(r17)
            if (r2 == 0) goto L_0x01e9
            goto L_0x0251
        L_0x01e9:
            com.google.android.gms.internal.ads.zzfb r2 = r0.zzc
            r2.zzG(r4)
            com.google.android.gms.internal.ads.zzfb r2 = r0.zzc
            int r2 = r2.zzf()
            int r7 = r0.zzk
            long r7 = (long) r7
            boolean r7 = zzi(r2, r7)
            if (r7 == 0) goto L_0x0236
            int r7 = com.google.android.gms.internal.ads.zzach.zzb(r2)
            if (r7 != r3) goto L_0x0204
            goto L_0x0236
        L_0x0204:
            com.google.android.gms.internal.ads.zzacg r7 = r0.zzd
            r7.zza(r2)
            long r7 = r0.zzm
            int r2 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r2 != 0) goto L_0x021b
            com.google.android.gms.internal.ads.zzagt r2 = r0.zzq
            long r5 = r17.zzf()
            long r5 = r2.zzd(r5)
            r0.zzm = r5
        L_0x021b:
            com.google.android.gms.internal.ads.zzacg r2 = r0.zzd
            int r5 = r2.zzc
            r0.zzp = r5
            com.google.android.gms.internal.ads.zzagt r6 = r0.zzq
            boolean r7 = r6 instanceof com.google.android.gms.internal.ads.zzagn
            if (r7 != 0) goto L_0x0229
            r2 = r5
            goto L_0x023f
        L_0x0229:
            com.google.android.gms.internal.ads.zzagn r6 = (com.google.android.gms.internal.ads.zzagn) r6
            long r3 = r0.zzn
            int r1 = r2.zzg
            long r1 = (long) r1
            long r3 = r3 + r1
            r0.zzg(r3)
            r1 = 0
            throw r1
        L_0x0236:
            com.google.android.gms.internal.ads.zzabc r1 = (com.google.android.gms.internal.ads.zzabc) r1
            r5 = 1
            r1.zzo(r5, r4)
            r0.zzk = r4
            goto L_0x0250
        L_0x023f:
            r5 = 1
            com.google.android.gms.internal.ads.zzacs r6 = r0.zzj
            int r1 = r6.zzf(r1, r2, r5)
            if (r1 != r3) goto L_0x0249
            goto L_0x0251
        L_0x0249:
            int r2 = r0.zzp
            int r2 = r2 - r1
            r0.zzp = r2
            if (r2 <= 0) goto L_0x0252
        L_0x0250:
            r3 = 0
        L_0x0251:
            return r3
        L_0x0252:
            com.google.android.gms.internal.ads.zzacs r5 = r0.zzj
            long r1 = r0.zzn
            long r6 = r0.zzg(r1)
            r8 = 1
            com.google.android.gms.internal.ads.zzacg r1 = r0.zzd
            int r9 = r1.zzc
            r10 = 0
            r11 = 0
            r5.zzt(r6, r8, r9, r10, r11)
            long r1 = r0.zzn
            com.google.android.gms.internal.ads.zzacg r3 = r0.zzd
            int r3 = r3.zzg
            long r5 = (long) r3
            long r1 = r1 + r5
            r0.zzn = r1
            r0.zzp = r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzagr.zzf(com.google.android.gms.internal.ads.zzabn):int");
    }

    private final long zzg(long j10) {
        return this.zzm + ((j10 * 1000000) / ((long) this.zzd.zzd));
    }

    private final zzagt zzh(zzabn zzabn, boolean z10) {
        ((zzabc) zzabn).zzm(this.zzc.zzI(), 0, 4, false);
        this.zzc.zzG(0);
        this.zzd.zza(this.zzc.zzf());
        return new zzagm(zzabn.zzd(), zzabn.zzf(), this.zzd, false);
    }

    private static boolean zzi(int i10, long j10) {
        return ((long) (i10 & -128000)) == (j10 & -128000);
    }

    private final boolean zzj(zzabn zzabn) {
        zzagt zzagt = this.zzq;
        if (zzagt != null) {
            long zzc2 = zzagt.zzc();
            if (zzc2 != -1 && zzabn.zze() > zzc2 - 4) {
                return true;
            }
        }
        try {
            return !zzabn.zzm(this.zzc.zzI(), 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    private final boolean zzk(zzabn zzabn, boolean z10) {
        int i10;
        int i11;
        int zzb2;
        zzabn.zzj();
        if (zzabn.zzf() == 0) {
            zzby zza2 = this.zzf.zza(zzabn, (zzafe) null);
            this.zzl = zza2;
            if (zza2 != null) {
                this.zze.zzb(zza2);
            }
            i10 = (int) zzabn.zze();
            if (!z10) {
                ((zzabc) zzabn).zzo(i10, false);
            }
            i11 = 0;
        } else {
            i11 = 0;
            i10 = 0;
        }
        int i12 = 0;
        int i13 = 0;
        while (true) {
            if (!zzj(zzabn)) {
                this.zzc.zzG(0);
                int zzf2 = this.zzc.zzf();
                if ((i11 == 0 || zzi(zzf2, (long) i11)) && (zzb2 = zzach.zzb(zzf2)) != -1) {
                    i12++;
                    if (i12 != 1) {
                        if (i12 == 4) {
                            break;
                        }
                    } else {
                        this.zzd.zza(zzf2);
                        i11 = zzf2;
                    }
                    ((zzabc) zzabn).zzl(zzb2 - 4, false);
                } else {
                    int i14 = i13 + 1;
                    if (i13 != (true != z10 ? 131072 : 32768)) {
                        if (z10) {
                            zzabn.zzj();
                            ((zzabc) zzabn).zzl(i10 + i14, false);
                        } else {
                            ((zzabc) zzabn).zzo(1, false);
                        }
                        i13 = i14;
                        i11 = 0;
                        i12 = 0;
                    } else if (z10) {
                        return false;
                    } else {
                        throw zzcc.zza("Searched too many bytes.", (Throwable) null);
                    }
                }
            } else if (i12 <= 0) {
                throw new EOFException();
            }
        }
        if (z10) {
            ((zzabc) zzabn).zzo(i10 + i13, false);
        } else {
            zzabn.zzj();
        }
        this.zzk = i11;
        return true;
    }

    public final void zza() {
        this.zzr = true;
    }

    public final int zzb(zzabn zzabn, zzacj zzacj) {
        zzdx.zzb(this.zzi);
        int i10 = zzfk.zza;
        int zzf2 = zzf(zzabn);
        if (zzf2 == -1 && (this.zzq instanceof zzagn)) {
            if (this.zzq.zza() != zzg(this.zzn)) {
                zzagn zzagn = (zzagn) this.zzq;
                throw null;
            }
        }
        return zzf2;
    }

    public final void zzc(zzabp zzabp) {
        this.zzh = zzabp;
        zzacs zzw = zzabp.zzw(0, 1);
        this.zzi = zzw;
        this.zzj = zzw;
        this.zzh.zzD();
    }

    public final void zzd(long j10, long j11) {
        this.zzk = 0;
        this.zzm = -9223372036854775807L;
        this.zzn = 0;
        this.zzp = 0;
        zzagt zzagt = this.zzq;
        if (zzagt instanceof zzagn) {
            zzagn zzagn = (zzagn) zzagt;
            throw null;
        }
    }

    public final boolean zze(zzabn zzabn) {
        return zzk(zzabn, true);
    }

    public zzagr(int i10) {
        this.zzc = new zzfb(10);
        this.zzd = new zzacg();
        this.zze = new zzacc();
        this.zzm = -9223372036854775807L;
        this.zzf = new zzace();
        zzabl zzabl = new zzabl();
        this.zzg = zzabl;
        this.zzj = zzabl;
    }
}
