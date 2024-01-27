package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzahr implements zzabm, zzacm {
    public static final zzabt zza = zzahp.zza;
    private final zzfb zzb;
    private final zzfb zzc;
    private final zzfb zzd;
    private final zzfb zze;
    private final ArrayDeque zzf;
    private final zzaht zzg;
    private final List zzh;
    private int zzi;
    private int zzj;
    private long zzk;
    private int zzl;
    private zzfb zzm;
    private int zzn;
    private int zzo;
    private int zzp;
    private int zzq;
    private zzabp zzr;
    private zzahq[] zzs;
    private long[][] zzt;
    private int zzu;
    private long zzv;
    private int zzw;
    private zzafu zzx;

    public zzahr() {
        this(0);
    }

    private static int zzf(int i10) {
        if (i10 != 1751476579) {
            return i10 != 1903435808 ? 0 : 1;
        }
        return 2;
    }

    private static int zzi(zzahy zzahy, long j10) {
        int zza2 = zzahy.zza(j10);
        return zza2 == -1 ? zzahy.zzb(j10) : zza2;
    }

    private static long zzj(zzahy zzahy, long j10, long j11) {
        int zzi2 = zzi(zzahy, j10);
        if (zzi2 == -1) {
            return j11;
        }
        return Math.min(zzahy.zzc[zzi2], j11);
    }

    private final void zzk() {
        this.zzi = 0;
        this.zzl = 0;
    }

    private final void zzl(long j10) {
        zzby zzby;
        long j11;
        int i10;
        List list;
        zzacc zzacc;
        int i11;
        int i12;
        zzby zzby2;
        int i13;
        while (!this.zzf.isEmpty() && ((zzagw) this.zzf.peek()).zza == j10) {
            zzagw zzagw = (zzagw) this.zzf.pop();
            if (zzagw.zzd == 1836019574) {
                ArrayList arrayList = new ArrayList();
                int i14 = this.zzw;
                zzacc zzacc2 = new zzacc();
                zzagx zzb2 = zzagw.zzb(1969517665);
                if (zzb2 != null) {
                    zzby zzb3 = zzahg.zzb(zzb2);
                    zzacc2.zzb(zzb3);
                    zzby = zzb3;
                } else {
                    zzby = null;
                }
                zzagw zza2 = zzagw.zza(1835365473);
                zzby zza3 = zza2 != null ? zzahg.zza(zza2) : null;
                zzbx[] zzbxArr = new zzbx[1];
                zzagx zzb4 = zzagw.zzb(1836476516);
                Objects.requireNonNull(zzb4);
                boolean z10 = i14 == 1;
                zzbxArr[0] = zzahg.zzc(zzb4.zza);
                zzby zzby3 = new zzby(-9223372036854775807L, zzbxArr);
                zzby zzby4 = zzby;
                long j12 = -9223372036854775807L;
                List zzd2 = zzahg.zzd(zzagw, zzacc2, -9223372036854775807L, (zzad) null, false, z10, zzaho.zza);
                int size = zzd2.size();
                long j13 = -9223372036854775807L;
                int i15 = -1;
                int i16 = 0;
                while (true) {
                    j11 = 0;
                    if (i16 >= size) {
                        break;
                    }
                    zzahy zzahy = (zzahy) zzd2.get(i16);
                    if (zzahy.zzb == 0) {
                        list = zzd2;
                        i10 = size;
                        zzacc = zzacc2;
                    } else {
                        zzahv zzahv = zzahy.zza;
                        list = zzd2;
                        long j14 = zzahv.zze;
                        if (j14 == j12) {
                            j14 = zzahy.zzh;
                        }
                        long max = Math.max(j13, j14);
                        i10 = size;
                        zzahq zzahq = new zzahq(zzahv, zzahy, this.zzr.zzw(i16, zzahv.zzb));
                        if ("audio/true-hd".equals(zzahv.zzf.zzm)) {
                            i11 = zzahy.zze * 16;
                        } else {
                            i11 = zzahy.zze + 30;
                        }
                        zzak zzb5 = zzahv.zzf.zzb();
                        zzb5.zzN(i11);
                        long j15 = max;
                        if (zzahv.zzb != 2 || j14 <= 0) {
                            i12 = 1;
                        } else {
                            int i17 = zzahy.zzb;
                            i12 = 1;
                            if (i17 > 1) {
                                zzb5.zzG(((float) i17) / (((float) j14) / 1000000.0f));
                            }
                        }
                        int i18 = zzahv.zzb;
                        int i19 = zzahn.zzb;
                        if (i18 == i12 && zzacc2.zza()) {
                            zzb5.zzE(zzacc2.zza);
                            zzb5.zzF(zzacc2.zzb);
                        }
                        int i20 = zzahv.zzb;
                        zzby[] zzbyArr = new zzby[3];
                        if (this.zzh.isEmpty()) {
                            i13 = 0;
                            zzby2 = null;
                        } else {
                            zzby2 = new zzby(this.zzh);
                            i13 = 0;
                        }
                        zzbyArr[i13] = zzby2;
                        zzbyArr[i12] = zzby4;
                        zzbyArr[2] = zzby3;
                        zzacc = zzacc2;
                        zzby zzby5 = new zzby(-9223372036854775807L, new zzbx[i13]);
                        if (zza3 != null) {
                            for (int i21 = 0; i21 < zza3.zza(); i21++) {
                                zzbx zzb6 = zza3.zzb(i21);
                                if (zzb6 instanceof zzfo) {
                                    zzfo zzfo = (zzfo) zzb6;
                                    if (!zzfo.zza.equals("com.android.capture.fps")) {
                                        zzby5 = zzby5.zzc(zzfo);
                                    } else if (i20 == 2) {
                                        zzby5 = zzby5.zzc(zzfo);
                                    }
                                }
                            }
                        }
                        for (int i22 = 0; i22 < 3; i22++) {
                            zzby5 = zzby5.zzd(zzbyArr[i22]);
                        }
                        if (zzby5.zza() > 0) {
                            zzb5.zzO(zzby5);
                        }
                        zzahq.zzc.zzl(zzb5.zzac());
                        if (zzahv.zzb == 2) {
                            if (i15 == -1) {
                                i15 = arrayList.size();
                            }
                        }
                        arrayList.add(zzahq);
                        j13 = j15;
                    }
                    i16++;
                    zzacc2 = zzacc;
                    zzd2 = list;
                    size = i10;
                    j12 = -9223372036854775807L;
                }
                this.zzu = i15;
                this.zzv = j13;
                zzahq[] zzahqArr = (zzahq[]) arrayList.toArray(new zzahq[0]);
                this.zzs = zzahqArr;
                int length = zzahqArr.length;
                long[][] jArr = new long[length][];
                int[] iArr = new int[length];
                long[] jArr2 = new long[length];
                boolean[] zArr = new boolean[length];
                for (int i23 = 0; i23 < zzahqArr.length; i23++) {
                    jArr[i23] = new long[zzahqArr[i23].zzb.zzb];
                    jArr2[i23] = zzahqArr[i23].zzb.zzf[0];
                }
                int i24 = 0;
                while (i24 < zzahqArr.length) {
                    long j16 = Long.MAX_VALUE;
                    int i25 = -1;
                    for (int i26 = 0; i26 < zzahqArr.length; i26++) {
                        if (!zArr[i26]) {
                            long j17 = jArr2[i26];
                            if (j17 <= j16) {
                                i25 = i26;
                                j16 = j17;
                            }
                        }
                    }
                    int i27 = iArr[i25];
                    long[] jArr3 = jArr[i25];
                    jArr3[i27] = j11;
                    zzahy zzahy2 = zzahqArr[i25].zzb;
                    j11 += (long) zzahy2.zzd[i27];
                    int i28 = i27 + 1;
                    iArr[i25] = i28;
                    if (i28 < jArr3.length) {
                        jArr2[i25] = zzahy2.zzf[i28];
                    } else {
                        zArr[i25] = true;
                        i24++;
                    }
                }
                this.zzt = jArr;
                this.zzr.zzD();
                this.zzr.zzO(this);
                this.zzf.clear();
                this.zzi = 2;
            } else if (!this.zzf.isEmpty()) {
                ((zzagw) this.zzf.peek()).zzc(zzagw);
            }
        }
        if (this.zzi != 2) {
            zzk();
        }
    }

    public final long zza() {
        return this.zzv;
    }

    /* JADX WARNING: Removed duplicated region for block: B:211:0x0081 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x007b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int zzb(com.google.android.gms.internal.ads.zzabn r33, com.google.android.gms.internal.ads.zzacj r34) {
        /*
            r32 = this;
            r0 = r32
            r1 = r33
            r2 = r34
        L_0x0006:
            int r3 = r0.zzi
            r4 = 1718909296(0x66747970, float:2.8862439E23)
            r6 = 0
            r8 = -1
            r9 = 8
            r10 = 1
            if (r3 == 0) goto L_0x024b
            r13 = 262144(0x40000, double:1.295163E-318)
            if (r3 == r10) goto L_0x01cb
            long r3 = r33.zzf()
            int r9 = r0.zzn
            if (r9 != r8) goto L_0x009e
            r16 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r18 = r16
            r21 = r18
            r23 = r21
            r9 = 0
            r20 = 1
            r25 = -1
            r26 = -1
            r27 = 1
        L_0x0034:
            com.google.android.gms.internal.ads.zzahq[] r5 = r0.zzs
            int r15 = r5.length
            if (r9 >= r15) goto L_0x0084
            r5 = r5[r9]
            int r15 = r5.zze
            com.google.android.gms.internal.ads.zzahy r5 = r5.zzb
            int r12 = r5.zzb
            if (r15 != r12) goto L_0x0044
            goto L_0x0081
        L_0x0044:
            long[] r5 = r5.zzc
            r28 = r5[r15]
            long[][] r5 = r0.zzt
            int r12 = com.google.android.gms.internal.ads.zzfk.zza
            r5 = r5[r9]
            r30 = r5[r15]
            long r28 = r28 - r3
            int r5 = (r28 > r6 ? 1 : (r28 == r6 ? 0 : -1))
            if (r5 < 0) goto L_0x005d
            int r5 = (r28 > r13 ? 1 : (r28 == r13 ? 0 : -1))
            if (r5 < 0) goto L_0x005b
            goto L_0x005d
        L_0x005b:
            r5 = 0
            goto L_0x005e
        L_0x005d:
            r5 = 1
        L_0x005e:
            if (r5 != 0) goto L_0x0064
            if (r27 != 0) goto L_0x006c
            r12 = 0
            goto L_0x0066
        L_0x0064:
            r12 = r27
        L_0x0066:
            if (r5 != r12) goto L_0x0075
            int r15 = (r28 > r23 ? 1 : (r28 == r23 ? 0 : -1))
            if (r15 >= 0) goto L_0x0075
        L_0x006c:
            r27 = r5
            r26 = r9
            r23 = r28
            r21 = r30
            goto L_0x0077
        L_0x0075:
            r27 = r12
        L_0x0077:
            int r12 = (r30 > r18 ? 1 : (r30 == r18 ? 0 : -1))
            if (r12 >= 0) goto L_0x0081
            r20 = r5
            r25 = r9
            r18 = r30
        L_0x0081:
            int r9 = r9 + 1
            goto L_0x0034
        L_0x0084:
            int r5 = (r18 > r16 ? 1 : (r18 == r16 ? 0 : -1))
            if (r5 == 0) goto L_0x0096
            if (r20 == 0) goto L_0x0096
            r15 = 10485760(0xa00000, double:5.180654E-317)
            long r18 = r18 + r15
            int r5 = (r21 > r18 ? 1 : (r21 == r18 ? 0 : -1))
            if (r5 < 0) goto L_0x0096
            r9 = r25
            goto L_0x0098
        L_0x0096:
            r9 = r26
        L_0x0098:
            r0.zzn = r9
            if (r9 != r8) goto L_0x009e
            goto L_0x01ca
        L_0x009e:
            com.google.android.gms.internal.ads.zzahq[] r5 = r0.zzs
            r5 = r5[r9]
            com.google.android.gms.internal.ads.zzacs r9 = r5.zzc
            int r12 = r5.zze
            com.google.android.gms.internal.ads.zzahy r15 = r5.zzb
            long[] r8 = r15.zzc
            r10 = r8[r12]
            int[] r8 = r15.zzd
            r8 = r8[r12]
            com.google.android.gms.internal.ads.zzact r15 = r5.zzd
            long r3 = r10 - r3
            int r13 = r0.zzo
            long r13 = (long) r13
            long r3 = r3 + r13
            int r13 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r13 < 0) goto L_0x01c7
            r6 = 262144(0x40000, double:1.295163E-318)
            int r13 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r13 < 0) goto L_0x00c5
            goto L_0x01c7
        L_0x00c5:
            com.google.android.gms.internal.ads.zzahv r2 = r5.zza
            int r2 = r2.zzg
            r6 = 1
            if (r2 != r6) goto L_0x00d1
            r6 = 8
            long r3 = r3 + r6
            int r8 = r8 + -8
        L_0x00d1:
            int r2 = (int) r3
            r1.zzk(r2)
            com.google.android.gms.internal.ads.zzahv r2 = r5.zza
            int r3 = r2.zzj
            if (r3 == 0) goto L_0x013b
            com.google.android.gms.internal.ads.zzfb r2 = r0.zzc
            byte[] r2 = r2.zzI()
            r4 = 0
            r2[r4] = r4
            r6 = 1
            r2[r6] = r4
            r6 = 2
            r2[r6] = r4
            int r4 = 4 - r3
        L_0x00ec:
            int r6 = r0.zzp
            if (r6 >= r8) goto L_0x017e
            int r6 = r0.zzq
            if (r6 != 0) goto L_0x0126
            r1.zzi(r2, r4, r3)
            int r6 = r0.zzo
            int r6 = r6 + r3
            r0.zzo = r6
            com.google.android.gms.internal.ads.zzfb r6 = r0.zzc
            r7 = 0
            r6.zzG(r7)
            com.google.android.gms.internal.ads.zzfb r6 = r0.zzc
            int r6 = r6.zzf()
            if (r6 < 0) goto L_0x011e
            r0.zzq = r6
            com.google.android.gms.internal.ads.zzfb r6 = r0.zzb
            r6.zzG(r7)
            com.google.android.gms.internal.ads.zzfb r6 = r0.zzb
            r10 = 4
            r9.zzr(r6, r10)
            int r6 = r0.zzp
            int r6 = r6 + r10
            r0.zzp = r6
            int r8 = r8 + r4
            goto L_0x00ec
        L_0x011e:
            java.lang.String r1 = "Invalid NAL length"
            r2 = 0
            com.google.android.gms.internal.ads.zzcc r1 = com.google.android.gms.internal.ads.zzcc.zza(r1, r2)
            throw r1
        L_0x0126:
            r7 = 0
            int r6 = r9.zzf(r1, r6, r7)
            int r7 = r0.zzo
            int r7 = r7 + r6
            r0.zzo = r7
            int r7 = r0.zzp
            int r7 = r7 + r6
            r0.zzp = r7
            int r7 = r0.zzq
            int r7 = r7 - r6
            r0.zzq = r7
            goto L_0x00ec
        L_0x013b:
            com.google.android.gms.internal.ads.zzam r2 = r2.zzf
            java.lang.String r2 = r2.zzm
            java.lang.String r3 = "audio/ac4"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x015e
            int r2 = r0.zzp
            if (r2 != 0) goto L_0x015b
            com.google.android.gms.internal.ads.zzfb r2 = r0.zzd
            com.google.android.gms.internal.ads.zzaaq.zzb(r8, r2)
            com.google.android.gms.internal.ads.zzfb r2 = r0.zzd
            r3 = 7
            r9.zzr(r2, r3)
            int r2 = r0.zzp
            int r2 = r2 + r3
            r0.zzp = r2
        L_0x015b:
            int r8 = r8 + 7
            goto L_0x0163
        L_0x015e:
            if (r15 == 0) goto L_0x0163
            r15.zzd(r1)
        L_0x0163:
            int r2 = r0.zzp
            if (r2 >= r8) goto L_0x017e
            int r2 = r8 - r2
            r3 = 0
            int r2 = r9.zzf(r1, r2, r3)
            int r3 = r0.zzo
            int r3 = r3 + r2
            r0.zzo = r3
            int r3 = r0.zzp
            int r3 = r3 + r2
            r0.zzp = r3
            int r3 = r0.zzq
            int r3 = r3 - r2
            r0.zzq = r3
            goto L_0x0163
        L_0x017e:
            com.google.android.gms.internal.ads.zzahy r1 = r5.zzb
            long[] r2 = r1.zzf
            r3 = r2[r12]
            int[] r1 = r1.zzg
            r1 = r1[r12]
            if (r15 == 0) goto L_0x01a7
            r21 = 0
            r22 = 0
            r2 = r15
            r16 = r9
            r17 = r3
            r19 = r1
            r20 = r8
            r15.zzc(r16, r17, r19, r20, r21, r22)
            r1 = 1
            int r12 = r12 + r1
            com.google.android.gms.internal.ads.zzahy r1 = r5.zzb
            int r1 = r1.zzb
            if (r12 != r1) goto L_0x01b5
            r1 = 0
            r2.zza(r9, r1)
            goto L_0x01b5
        L_0x01a7:
            r20 = 0
            r21 = 0
            r15 = r9
            r16 = r3
            r18 = r1
            r19 = r8
            r15.zzt(r16, r18, r19, r20, r21)
        L_0x01b5:
            int r1 = r5.zze
            r2 = 1
            int r1 = r1 + r2
            r5.zze = r1
            r1 = -1
            r0.zzn = r1
            r1 = 0
            r0.zzo = r1
            r0.zzp = r1
            r0.zzq = r1
            r8 = 0
            goto L_0x01ca
        L_0x01c7:
            r2.zza = r10
            r8 = 1
        L_0x01ca:
            return r8
        L_0x01cb:
            long r5 = r0.zzk
            int r3 = r0.zzl
            long r7 = (long) r3
            long r5 = r5 - r7
            long r7 = r33.zzf()
            long r7 = r7 + r5
            com.google.android.gms.internal.ads.zzfb r3 = r0.zzm
            if (r3 == 0) goto L_0x022a
            byte[] r10 = r3.zzI()
            int r11 = r0.zzl
            int r6 = (int) r5
            r1.zzi(r10, r11, r6)
            int r5 = r0.zzj
            if (r5 != r4) goto L_0x020f
            r3.zzG(r9)
            int r4 = r3.zzf()
            int r4 = zzf(r4)
            if (r4 == 0) goto L_0x01f6
            goto L_0x020c
        L_0x01f6:
            r4 = 4
            r3.zzH(r4)
        L_0x01fa:
            int r4 = r3.zza()
            if (r4 <= 0) goto L_0x020b
            int r4 = r3.zzf()
            int r4 = zzf(r4)
            if (r4 == 0) goto L_0x01fa
            goto L_0x020c
        L_0x020b:
            r4 = 0
        L_0x020c:
            r0.zzw = r4
            goto L_0x0235
        L_0x020f:
            java.util.ArrayDeque r4 = r0.zzf
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L_0x0235
            java.util.ArrayDeque r4 = r0.zzf
            java.lang.Object r4 = r4.peek()
            com.google.android.gms.internal.ads.zzagw r4 = (com.google.android.gms.internal.ads.zzagw) r4
            com.google.android.gms.internal.ads.zzagx r5 = new com.google.android.gms.internal.ads.zzagx
            int r6 = r0.zzj
            r5.<init>(r6, r3)
            r4.zzd(r5)
            goto L_0x0235
        L_0x022a:
            r3 = 262144(0x40000, double:1.295163E-318)
            int r9 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r9 >= 0) goto L_0x0237
            int r3 = (int) r5
            r1.zzk(r3)
        L_0x0235:
            r11 = 0
            goto L_0x023f
        L_0x0237:
            long r3 = r33.zzf()
            long r3 = r3 + r5
            r2.zza = r3
            r11 = 1
        L_0x023f:
            r0.zzl(r7)
            if (r11 == 0) goto L_0x0006
            int r3 = r0.zzi
            r4 = 2
            if (r3 == r4) goto L_0x0006
            r3 = 1
            return r3
        L_0x024b:
            r3 = 1
            int r5 = r0.zzl
            if (r5 != 0) goto L_0x0276
            com.google.android.gms.internal.ads.zzfb r5 = r0.zze
            byte[] r5 = r5.zzI()
            r8 = 0
            boolean r5 = r1.zzn(r5, r8, r9, r3)
            if (r5 != 0) goto L_0x025f
            r3 = -1
            return r3
        L_0x025f:
            r0.zzl = r9
            com.google.android.gms.internal.ads.zzfb r3 = r0.zze
            r3.zzG(r8)
            com.google.android.gms.internal.ads.zzfb r3 = r0.zze
            long r10 = r3.zzt()
            r0.zzk = r10
            com.google.android.gms.internal.ads.zzfb r3 = r0.zze
            int r3 = r3.zzf()
            r0.zzj = r3
        L_0x0276:
            long r10 = r0.zzk
            r12 = 1
            int r3 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r3 != 0) goto L_0x0295
            com.google.android.gms.internal.ads.zzfb r3 = r0.zze
            byte[] r3 = r3.zzI()
            r1.zzi(r3, r9, r9)
            int r3 = r0.zzl
            int r3 = r3 + r9
            r0.zzl = r3
            com.google.android.gms.internal.ads.zzfb r3 = r0.zze
            long r5 = r3.zzu()
            r0.zzk = r5
            goto L_0x02c0
        L_0x0295:
            int r3 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r3 != 0) goto L_0x02c0
            long r5 = r33.zzd()
            r7 = -1
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 != 0) goto L_0x02b1
            java.util.ArrayDeque r3 = r0.zzf
            java.lang.Object r3 = r3.peek()
            com.google.android.gms.internal.ads.zzagw r3 = (com.google.android.gms.internal.ads.zzagw) r3
            if (r3 == 0) goto L_0x02b0
            long r5 = r3.zza
            goto L_0x02b1
        L_0x02b0:
            r5 = r7
        L_0x02b1:
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 == 0) goto L_0x02c0
            long r7 = r33.zzf()
            long r5 = r5 - r7
            int r3 = r0.zzl
            long r7 = (long) r3
            long r5 = r5 + r7
            r0.zzk = r5
        L_0x02c0:
            long r5 = r0.zzk
            int r3 = r0.zzl
            long r7 = (long) r3
            int r10 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r10 < 0) goto L_0x03fd
            int r5 = r0.zzj
            r6 = 1836019574(0x6d6f6f76, float:4.631354E27)
            r7 = 1835365473(0x6d657461, float:4.4382975E27)
            if (r5 == r6) goto L_0x03ab
            r6 = 1953653099(0x7472616b, float:7.681346E31)
            if (r5 == r6) goto L_0x03ab
            r6 = 1835297121(0x6d646961, float:4.4181236E27)
            if (r5 == r6) goto L_0x03ab
            r6 = 1835626086(0x6d696e66, float:4.515217E27)
            if (r5 == r6) goto L_0x03ab
            r6 = 1937007212(0x7374626c, float:1.9362132E31)
            if (r5 == r6) goto L_0x03ab
            r6 = 1701082227(0x65647473, float:6.742798E22)
            if (r5 == r6) goto L_0x03ab
            if (r5 != r7) goto L_0x02f0
            goto L_0x03ab
        L_0x02f0:
            r6 = 1835296868(0x6d646864, float:4.418049E27)
            if (r5 == r6) goto L_0x0377
            r6 = 1836476516(0x6d766864, float:4.7662196E27)
            if (r5 == r6) goto L_0x0377
            r6 = 1751411826(0x68646c72, float:4.3148E24)
            if (r5 == r6) goto L_0x0377
            r6 = 1937011556(0x73747364, float:1.9367383E31)
            if (r5 == r6) goto L_0x0377
            r6 = 1937011827(0x73747473, float:1.9367711E31)
            if (r5 == r6) goto L_0x0377
            r6 = 1937011571(0x73747373, float:1.9367401E31)
            if (r5 == r6) goto L_0x0377
            r6 = 1668576371(0x63747473, float:4.5093966E21)
            if (r5 == r6) goto L_0x0377
            r6 = 1701606260(0x656c7374, float:6.9788014E22)
            if (r5 == r6) goto L_0x0377
            r6 = 1937011555(0x73747363, float:1.9367382E31)
            if (r5 == r6) goto L_0x0377
            r6 = 1937011578(0x7374737a, float:1.936741E31)
            if (r5 == r6) goto L_0x0377
            r6 = 1937013298(0x73747a32, float:1.9369489E31)
            if (r5 == r6) goto L_0x0377
            r6 = 1937007471(0x7374636f, float:1.9362445E31)
            if (r5 == r6) goto L_0x0377
            r6 = 1668232756(0x636f3634, float:4.4126776E21)
            if (r5 == r6) goto L_0x0377
            r6 = 1953196132(0x746b6864, float:7.46037E31)
            if (r5 == r6) goto L_0x0377
            if (r5 == r4) goto L_0x0377
            r4 = 1969517665(0x75647461, float:2.8960062E32)
            if (r5 == r4) goto L_0x0377
            r4 = 1801812339(0x6b657973, float:2.7741754E26)
            if (r5 == r4) goto L_0x0377
            r4 = 1768715124(0x696c7374, float:1.7865732E25)
            if (r5 != r4) goto L_0x0348
            goto L_0x0377
        L_0x0348:
            long r3 = r33.zzf()
            int r5 = r0.zzl
            long r5 = (long) r5
            long r10 = r3 - r5
            int r3 = r0.zzj
            r4 = 1836086884(0x6d707664, float:4.6512205E27)
            if (r3 != r4) goto L_0x036f
            long r14 = r10 + r5
            com.google.android.gms.internal.ads.zzafu r3 = new com.google.android.gms.internal.ads.zzafu
            r8 = 0
            long r12 = r0.zzk
            long r4 = r12 - r5
            r7 = r3
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r16 = r4
            r7.<init>(r8, r10, r12, r14, r16)
            r0.zzx = r3
        L_0x036f:
            r3 = 0
            r0.zzm = r3
            r3 = 1
            r0.zzi = r3
            goto L_0x0006
        L_0x0377:
            if (r3 != r9) goto L_0x037b
            r3 = 1
            goto L_0x037c
        L_0x037b:
            r3 = 0
        L_0x037c:
            com.google.android.gms.internal.ads.zzdx.zzf(r3)
            long r3 = r0.zzk
            r5 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 > 0) goto L_0x038a
            r3 = 1
            goto L_0x038b
        L_0x038a:
            r3 = 0
        L_0x038b:
            com.google.android.gms.internal.ads.zzdx.zzf(r3)
            com.google.android.gms.internal.ads.zzfb r3 = new com.google.android.gms.internal.ads.zzfb
            long r4 = r0.zzk
            int r5 = (int) r4
            r3.<init>((int) r5)
            com.google.android.gms.internal.ads.zzfb r4 = r0.zze
            byte[] r4 = r4.zzI()
            byte[] r5 = r3.zzI()
            r6 = 0
            java.lang.System.arraycopy(r4, r6, r5, r6, r9)
            r0.zzm = r3
            r3 = 1
            r0.zzi = r3
            goto L_0x0006
        L_0x03ab:
            long r3 = r33.zzf()
            long r5 = r0.zzk
            long r3 = r3 + r5
            int r8 = r0.zzl
            long r10 = (long) r8
            int r8 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r8 == 0) goto L_0x03dd
            int r5 = r0.zzj
            if (r5 != r7) goto L_0x03dd
            com.google.android.gms.internal.ads.zzfb r5 = r0.zzd
            r5.zzD(r9)
            com.google.android.gms.internal.ads.zzfb r5 = r0.zzd
            byte[] r5 = r5.zzI()
            r6 = 0
            r1.zzh(r5, r6, r9)
            com.google.android.gms.internal.ads.zzfb r5 = r0.zzd
            com.google.android.gms.internal.ads.zzahg.zze(r5)
            com.google.android.gms.internal.ads.zzfb r5 = r0.zzd
            int r5 = r5.zzc()
            r1.zzk(r5)
            r33.zzj()
        L_0x03dd:
            long r3 = r3 - r10
            java.util.ArrayDeque r5 = r0.zzf
            com.google.android.gms.internal.ads.zzagw r6 = new com.google.android.gms.internal.ads.zzagw
            int r7 = r0.zzj
            r6.<init>(r7, r3)
            r5.push(r6)
            long r5 = r0.zzk
            int r7 = r0.zzl
            long r7 = (long) r7
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 != 0) goto L_0x03f8
            r0.zzl(r3)
            goto L_0x0006
        L_0x03f8:
            r32.zzk()
            goto L_0x0006
        L_0x03fd:
            java.lang.String r1 = "Atom size less than header length (unsupported)."
            com.google.android.gms.internal.ads.zzcc r1 = com.google.android.gms.internal.ads.zzcc.zzc(r1)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzahr.zzb(com.google.android.gms.internal.ads.zzabn, com.google.android.gms.internal.ads.zzacj):int");
    }

    public final void zzc(zzabp zzabp) {
        this.zzr = zzabp;
    }

    public final void zzd(long j10, long j11) {
        this.zzf.clear();
        this.zzl = 0;
        this.zzn = -1;
        this.zzo = 0;
        this.zzp = 0;
        this.zzq = 0;
        if (j10 == 0) {
            zzk();
            return;
        }
        for (zzahq zzahq : this.zzs) {
            zzahy zzahy = zzahq.zzb;
            int zza2 = zzahy.zza(j11);
            if (zza2 == -1) {
                zza2 = zzahy.zzb(j11);
            }
            zzahq.zze = zza2;
            zzact zzact = zzahq.zzd;
            if (zzact != null) {
                zzact.zzb();
            }
        }
    }

    public final boolean zze(zzabn zzabn) {
        return zzahu.zzb(zzabn, false);
    }

    public final zzack zzg(long j10) {
        long j11;
        long j12;
        int zzb2;
        zzahq[] zzahqArr = this.zzs;
        if (zzahqArr.length == 0) {
            zzacn zzacn = zzacn.zza;
            return new zzack(zzacn, zzacn);
        }
        int i10 = this.zzu;
        long j13 = -1;
        if (i10 != -1) {
            zzahy zzahy = zzahqArr[i10].zzb;
            int zzi2 = zzi(zzahy, j10);
            if (zzi2 == -1) {
                zzacn zzacn2 = zzacn.zza;
                return new zzack(zzacn2, zzacn2);
            }
            long j14 = zzahy.zzf[zzi2];
            j11 = zzahy.zzc[zzi2];
            if (j14 >= j10 || zzi2 >= zzahy.zzb - 1 || (zzb2 = zzahy.zzb(j10)) == -1 || zzb2 == zzi2) {
                j12 = -9223372036854775807L;
            } else {
                j12 = zzahy.zzf[zzb2];
                j13 = zzahy.zzc[zzb2];
            }
            j10 = j14;
        } else {
            j11 = Long.MAX_VALUE;
            j12 = -9223372036854775807L;
        }
        int i11 = 0;
        while (true) {
            zzahq[] zzahqArr2 = this.zzs;
            if (i11 >= zzahqArr2.length) {
                break;
            }
            if (i11 != this.zzu) {
                zzahy zzahy2 = zzahqArr2[i11].zzb;
                long zzj2 = zzj(zzahy2, j10, j11);
                if (j12 != -9223372036854775807L) {
                    j13 = zzj(zzahy2, j12, j13);
                }
                j11 = zzj2;
            }
            i11++;
        }
        zzacn zzacn3 = new zzacn(j10, j11);
        if (j12 == -9223372036854775807L) {
            return new zzack(zzacn3, zzacn3);
        }
        return new zzack(zzacn3, new zzacn(j12, j13));
    }

    public final boolean zzh() {
        return true;
    }

    public zzahr(int i10) {
        this.zzi = 0;
        this.zzg = new zzaht();
        this.zzh = new ArrayList();
        this.zze = new zzfb(16);
        this.zzf = new ArrayDeque();
        this.zzb = new zzfb(zzfy.zza);
        this.zzc = new zzfb(4);
        this.zzd = new zzfb();
        this.zzn = -1;
        this.zzr = zzabp.zza;
        this.zzs = new zzahq[0];
    }
}
