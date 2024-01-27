package com.google.android.gms.internal.ads;

import com.facebook.ads.AdError;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzvn implements zzacs {
    private boolean zzA = true;
    private boolean zzB;
    private zzre zzC;
    private final zzvh zza;
    private final zzvj zzb = new zzvj();
    private final zzvu zzc = new zzvu(zzvi.zza);
    private final zzrd zzd;
    private final zzqx zze;
    private zzvm zzf;
    private zzam zzg;
    private int zzh = 1000;
    private long[] zzi = new long[1000];
    private long[] zzj = new long[1000];
    private int[] zzk = new int[1000];
    private int[] zzl = new int[1000];
    private long[] zzm = new long[1000];
    private zzacr[] zzn = new zzacr[1000];
    private int zzo;
    private int zzp;
    private int zzq;
    private int zzr;
    private long zzs = Long.MIN_VALUE;
    private long zzt = Long.MIN_VALUE;
    private long zzu = Long.MIN_VALUE;
    private boolean zzv;
    private boolean zzw = true;
    private boolean zzx = true;
    private zzam zzy;
    private zzam zzz;

    protected zzvn(zzxz zzxz, zzrd zzrd, zzqx zzqx) {
        this.zzd = zzrd;
        this.zze = zzqx;
        this.zza = new zzvh(zzxz);
    }

    private final int zzB(int i10, int i11, long j10, boolean z10) {
        int i12 = -1;
        for (int i13 = 0; i13 < i11; i13++) {
            int i14 = (this.zzm[i10] > j10 ? 1 : (this.zzm[i10] == j10 ? 0 : -1));
            if (i14 > 0) {
                break;
            }
            if (!z10 || (this.zzl[i10] & 1) != 0) {
                i12 = i13;
                if (i14 == 0) {
                    break;
                }
            }
            i10++;
            if (i10 == this.zzh) {
                i10 = 0;
            }
        }
        return i12;
    }

    private final int zzC(int i10) {
        int i11 = this.zzq + i10;
        int i12 = this.zzh;
        return i11 < i12 ? i11 : i11 - i12;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0024, code lost:
        return -3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized int zzD(com.google.android.gms.internal.ads.zzkn r7, com.google.android.gms.internal.ads.zzht r8, boolean r9, boolean r10, com.google.android.gms.internal.ads.zzvj r11) {
        /*
            r6 = this;
            monitor-enter(r6)
            r0 = 0
            r8.zzd = r0     // Catch:{ all -> 0x009a }
            boolean r0 = r6.zzL()     // Catch:{ all -> 0x009a }
            r1 = -5
            r2 = -3
            r3 = -4
            if (r0 != 0) goto L_0x002f
            if (r10 != 0) goto L_0x0025
            boolean r10 = r6.zzv     // Catch:{ all -> 0x009a }
            if (r10 == 0) goto L_0x0014
            goto L_0x0025
        L_0x0014:
            com.google.android.gms.internal.ads.zzam r8 = r6.zzz     // Catch:{ all -> 0x009a }
            if (r8 == 0) goto L_0x0023
            if (r9 != 0) goto L_0x001e
            com.google.android.gms.internal.ads.zzam r9 = r6.zzg     // Catch:{ all -> 0x009a }
            if (r8 == r9) goto L_0x0023
        L_0x001e:
            r6.zzI(r8, r7)     // Catch:{ all -> 0x009a }
            monitor-exit(r6)
            return r1
        L_0x0023:
            monitor-exit(r6)
            return r2
        L_0x0025:
            r7 = 4
            r8.zzc(r7)     // Catch:{ all -> 0x009a }
            r9 = -9223372036854775808
            r8.zze = r9     // Catch:{ all -> 0x009a }
            monitor-exit(r6)
            return r3
        L_0x002f:
            com.google.android.gms.internal.ads.zzvu r0 = r6.zzc     // Catch:{ all -> 0x009a }
            int r4 = r6.zzp     // Catch:{ all -> 0x009a }
            int r5 = r6.zzr     // Catch:{ all -> 0x009a }
            int r4 = r4 + r5
            java.lang.Object r0 = r0.zza(r4)     // Catch:{ all -> 0x009a }
            com.google.android.gms.internal.ads.zzvl r0 = (com.google.android.gms.internal.ads.zzvl) r0     // Catch:{ all -> 0x009a }
            com.google.android.gms.internal.ads.zzam r0 = r0.zza     // Catch:{ all -> 0x009a }
            if (r9 != 0) goto L_0x0095
            com.google.android.gms.internal.ads.zzam r9 = r6.zzg     // Catch:{ all -> 0x009a }
            if (r0 == r9) goto L_0x0045
            goto L_0x0095
        L_0x0045:
            int r7 = r6.zzr     // Catch:{ all -> 0x009a }
            int r7 = r6.zzC(r7)     // Catch:{ all -> 0x009a }
            boolean r9 = r6.zzM(r7)     // Catch:{ all -> 0x009a }
            if (r9 != 0) goto L_0x0056
            r7 = 1
            r8.zzd = r7     // Catch:{ all -> 0x009a }
            monitor-exit(r6)
            return r2
        L_0x0056:
            int[] r9 = r6.zzl     // Catch:{ all -> 0x009a }
            r9 = r9[r7]     // Catch:{ all -> 0x009a }
            r8.zzc(r9)     // Catch:{ all -> 0x009a }
            int r9 = r6.zzr     // Catch:{ all -> 0x009a }
            int r0 = r6.zzo     // Catch:{ all -> 0x009a }
            int r0 = r0 + -1
            if (r9 != r0) goto L_0x0070
            if (r10 != 0) goto L_0x006b
            boolean r9 = r6.zzv     // Catch:{ all -> 0x009a }
            if (r9 == 0) goto L_0x0070
        L_0x006b:
            r9 = 536870912(0x20000000, float:1.0842022E-19)
            r8.zza(r9)     // Catch:{ all -> 0x009a }
        L_0x0070:
            long[] r9 = r6.zzm     // Catch:{ all -> 0x009a }
            r0 = r9[r7]     // Catch:{ all -> 0x009a }
            r8.zze = r0     // Catch:{ all -> 0x009a }
            long r9 = r6.zzs     // Catch:{ all -> 0x009a }
            int r2 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r2 >= 0) goto L_0x0081
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
            r8.zza(r9)     // Catch:{ all -> 0x009a }
        L_0x0081:
            int[] r8 = r6.zzk     // Catch:{ all -> 0x009a }
            r8 = r8[r7]     // Catch:{ all -> 0x009a }
            r11.zza = r8     // Catch:{ all -> 0x009a }
            long[] r8 = r6.zzj     // Catch:{ all -> 0x009a }
            r9 = r8[r7]     // Catch:{ all -> 0x009a }
            r11.zzb = r9     // Catch:{ all -> 0x009a }
            com.google.android.gms.internal.ads.zzacr[] r8 = r6.zzn     // Catch:{ all -> 0x009a }
            r7 = r8[r7]     // Catch:{ all -> 0x009a }
            r11.zzc = r7     // Catch:{ all -> 0x009a }
            monitor-exit(r6)
            return r3
        L_0x0095:
            r6.zzI(r0, r7)     // Catch:{ all -> 0x009a }
            monitor-exit(r6)
            return r1
        L_0x009a:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzvn.zzD(com.google.android.gms.internal.ads.zzkn, com.google.android.gms.internal.ads.zzht, boolean, boolean, com.google.android.gms.internal.ads.zzvj):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x002e, code lost:
        return -1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized long zzE(long r10, boolean r12, boolean r13) {
        /*
            r9 = this;
            monitor-enter(r9)
            int r12 = r9.zzo     // Catch:{ all -> 0x002f }
            r0 = -1
            if (r12 == 0) goto L_0x002d
            long[] r2 = r9.zzm     // Catch:{ all -> 0x002f }
            int r4 = r9.zzq     // Catch:{ all -> 0x002f }
            r5 = r2[r4]     // Catch:{ all -> 0x002f }
            int r2 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r2 >= 0) goto L_0x0012
            goto L_0x002d
        L_0x0012:
            if (r13 == 0) goto L_0x001a
            int r13 = r9.zzr     // Catch:{ all -> 0x002f }
            if (r13 == r12) goto L_0x001a
            int r12 = r13 + 1
        L_0x001a:
            r5 = r12
            r8 = 0
            r3 = r9
            r6 = r10
            int r10 = r3.zzB(r4, r5, r6, r8)     // Catch:{ all -> 0x002f }
            r11 = -1
            if (r10 != r11) goto L_0x0027
            monitor-exit(r9)
            return r0
        L_0x0027:
            long r10 = r9.zzG(r10)     // Catch:{ all -> 0x002f }
            monitor-exit(r9)
            return r10
        L_0x002d:
            monitor-exit(r9)
            return r0
        L_0x002f:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzvn.zzE(long, boolean, boolean):long");
    }

    private final synchronized long zzF() {
        int i10 = this.zzo;
        if (i10 == 0) {
            return -1;
        }
        return zzG(i10);
    }

    private final long zzG(int i10) {
        long j10 = this.zzt;
        long j11 = Long.MIN_VALUE;
        if (i10 != 0) {
            int zzC2 = zzC(i10 - 1);
            for (int i11 = 0; i11 < i10; i11++) {
                j11 = Math.max(j11, this.zzm[zzC2]);
                if ((this.zzl[zzC2] & 1) != 0) {
                    break;
                }
                zzC2--;
                if (zzC2 == -1) {
                    zzC2 = this.zzh - 1;
                }
            }
        }
        this.zzt = Math.max(j10, j11);
        this.zzo -= i10;
        int i12 = this.zzp + i10;
        this.zzp = i12;
        int i13 = this.zzq + i10;
        this.zzq = i13;
        int i14 = this.zzh;
        if (i13 >= i14) {
            this.zzq = i13 - i14;
        }
        int i15 = this.zzr - i10;
        this.zzr = i15;
        if (i15 < 0) {
            this.zzr = 0;
        }
        this.zzc.zze(i12);
        if (this.zzo != 0) {
            return this.zzj[this.zzq];
        }
        int i16 = this.zzq;
        if (i16 == 0) {
            i16 = this.zzh;
        }
        int i17 = i16 - 1;
        return this.zzj[i17] + ((long) this.zzk[i17]);
    }

    private final synchronized void zzH(long j10, int i10, long j11, int i11, zzacr zzacr) {
        int i12 = this.zzo;
        if (i12 > 0) {
            int zzC2 = zzC(i12 - 1);
            zzdx.zzd(this.zzj[zzC2] + ((long) this.zzk[zzC2]) <= j11);
        }
        this.zzv = (536870912 & i10) != 0;
        this.zzu = Math.max(this.zzu, j10);
        int zzC3 = zzC(this.zzo);
        this.zzm[zzC3] = j10;
        this.zzj[zzC3] = j11;
        this.zzk[zzC3] = i11;
        this.zzl[zzC3] = i10;
        this.zzn[zzC3] = zzacr;
        this.zzi[zzC3] = 0;
        if (this.zzc.zzf() || !((zzvl) this.zzc.zzb()).zza.equals(this.zzz)) {
            zzam zzam = this.zzz;
            Objects.requireNonNull(zzam);
            this.zzc.zzc(this.zzp + this.zzo, new zzvl(zzam, zzrc.zzb, (zzvk) null));
        }
        int i13 = this.zzo + 1;
        this.zzo = i13;
        int i14 = this.zzh;
        if (i13 == i14) {
            int i15 = i14 + 1000;
            long[] jArr = new long[i15];
            long[] jArr2 = new long[i15];
            long[] jArr3 = new long[i15];
            int[] iArr = new int[i15];
            int[] iArr2 = new int[i15];
            zzacr[] zzacrArr = new zzacr[i15];
            int i16 = this.zzq;
            int i17 = i14 - i16;
            System.arraycopy(this.zzj, i16, jArr2, 0, i17);
            System.arraycopy(this.zzm, this.zzq, jArr3, 0, i17);
            System.arraycopy(this.zzl, this.zzq, iArr, 0, i17);
            System.arraycopy(this.zzk, this.zzq, iArr2, 0, i17);
            System.arraycopy(this.zzn, this.zzq, zzacrArr, 0, i17);
            System.arraycopy(this.zzi, this.zzq, jArr, 0, i17);
            int i18 = this.zzq;
            System.arraycopy(this.zzj, 0, jArr2, i17, i18);
            System.arraycopy(this.zzm, 0, jArr3, i17, i18);
            System.arraycopy(this.zzl, 0, iArr, i17, i18);
            System.arraycopy(this.zzk, 0, iArr2, i17, i18);
            System.arraycopy(this.zzn, 0, zzacrArr, i17, i18);
            System.arraycopy(this.zzi, 0, jArr, i17, i18);
            this.zzj = jArr2;
            this.zzm = jArr3;
            this.zzl = iArr;
            this.zzk = iArr2;
            this.zzn = zzacrArr;
            this.zzi = jArr;
            this.zzq = 0;
            this.zzh = i15;
        }
    }

    private final void zzI(zzam zzam, zzkn zzkn) {
        zzad zzad;
        zzam zzam2 = this.zzg;
        zzre zzre = null;
        if (zzam2 == null) {
            zzad = null;
        } else {
            zzad = zzam2.zzp;
        }
        this.zzg = zzam;
        zzad zzad2 = zzam.zzp;
        zzkn.zza = zzam.zzc(this.zzd.zza(zzam));
        zzkn.zzb = this.zzC;
        if (zzam2 == null || !zzfk.zzE(zzad, zzad2)) {
            if (zzam.zzp != null) {
                zzre = new zzre(new zzqv(new zzrg(1), AdError.MEDIAVIEW_MISSING_ERROR_CODE));
            }
            this.zzC = zzre;
            zzkn.zzb = zzre;
        }
    }

    private final void zzJ() {
        if (this.zzC != null) {
            this.zzC = null;
            this.zzg = null;
        }
    }

    private final synchronized void zzK() {
        this.zzr = 0;
        this.zza.zzg();
    }

    private final boolean zzL() {
        return this.zzr != this.zzo;
    }

    private final boolean zzM(int i10) {
        if (this.zzC != null) {
            return (this.zzl[i10] & 1073741824) != 0 ? false : false;
        }
        return true;
    }

    private final synchronized boolean zzN(zzam zzam) {
        this.zzx = false;
        if (zzfk.zzE(zzam, this.zzz)) {
            return false;
        }
        if (this.zzc.zzf() || !((zzvl) this.zzc.zzb()).zza.equals(zzam)) {
            this.zzz = zzam;
        } else {
            this.zzz = ((zzvl) this.zzc.zzb()).zza;
        }
        boolean z10 = this.zzA;
        zzam zzam2 = this.zzz;
        this.zzA = z10 & zzcb.zze(zzam2.zzm, zzam2.zzj);
        this.zzB = false;
        return true;
    }

    static /* synthetic */ void zzm(zzvl zzvl) {
        zzrc zzrc = zzvl.zzb;
        int i10 = zzrb.zza;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0060, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean zzA(long r11, boolean r13) {
        /*
            r10 = this;
            monitor-enter(r10)
            r10.zzK()     // Catch:{ all -> 0x0061 }
            int r0 = r10.zzr     // Catch:{ all -> 0x0061 }
            int r2 = r10.zzC(r0)     // Catch:{ all -> 0x0061 }
            boolean r1 = r10.zzL()     // Catch:{ all -> 0x0061 }
            r7 = 0
            if (r1 == 0) goto L_0x005f
            long[] r1 = r10.zzm     // Catch:{ all -> 0x0061 }
            r3 = r1[r2]     // Catch:{ all -> 0x0061 }
            int r1 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r1 < 0) goto L_0x005f
            long r3 = r10.zzu     // Catch:{ all -> 0x0061 }
            r8 = 1
            int r1 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r1 <= 0) goto L_0x0023
            if (r13 == 0) goto L_0x005f
            r13 = 1
        L_0x0023:
            boolean r1 = r10.zzA     // Catch:{ all -> 0x0061 }
            r9 = -1
            if (r1 == 0) goto L_0x0047
            int r1 = r10.zzo     // Catch:{ all -> 0x0061 }
            int r1 = r1 - r0
            r0 = 0
        L_0x002c:
            if (r0 >= r1) goto L_0x0042
            long[] r3 = r10.zzm     // Catch:{ all -> 0x0061 }
            r4 = r3[r2]     // Catch:{ all -> 0x0061 }
            int r3 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r3 >= 0) goto L_0x0040
            int r2 = r2 + 1
            int r3 = r10.zzh     // Catch:{ all -> 0x0061 }
            if (r2 != r3) goto L_0x003d
            r2 = 0
        L_0x003d:
            int r0 = r0 + 1
            goto L_0x002c
        L_0x0040:
            r1 = r0
            goto L_0x0052
        L_0x0042:
            if (r13 == 0) goto L_0x0045
            goto L_0x0052
        L_0x0045:
            r1 = -1
            goto L_0x0052
        L_0x0047:
            int r13 = r10.zzo     // Catch:{ all -> 0x0061 }
            int r3 = r13 - r0
            r6 = 1
            r1 = r10
            r4 = r11
            int r1 = r1.zzB(r2, r3, r4, r6)     // Catch:{ all -> 0x0061 }
        L_0x0052:
            if (r1 != r9) goto L_0x0056
            monitor-exit(r10)
            return r7
        L_0x0056:
            r10.zzs = r11     // Catch:{ all -> 0x0061 }
            int r11 = r10.zzr     // Catch:{ all -> 0x0061 }
            int r11 = r11 + r1
            r10.zzr = r11     // Catch:{ all -> 0x0061 }
            monitor-exit(r10)
            return r8
        L_0x005f:
            monitor-exit(r10)
            return r7
        L_0x0061:
            r11 = move-exception
            monitor-exit(r10)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzvn.zzA(long, boolean):boolean");
    }

    public final int zza() {
        return this.zzp;
    }

    public final int zzb() {
        return this.zzp + this.zzr;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0032, code lost:
        if (r9 != -1) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0034, code lost:
        return 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0035, code lost:
        return r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0037, code lost:
        return 0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized int zzc(long r9, boolean r11) {
        /*
            r8 = this;
            monitor-enter(r8)
            int r0 = r8.zzr     // Catch:{ all -> 0x0038 }
            int r2 = r8.zzC(r0)     // Catch:{ all -> 0x0038 }
            boolean r1 = r8.zzL()     // Catch:{ all -> 0x0038 }
            r7 = 0
            if (r1 == 0) goto L_0x0036
            long[] r1 = r8.zzm     // Catch:{ all -> 0x0038 }
            r3 = r1[r2]     // Catch:{ all -> 0x0038 }
            int r1 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r1 >= 0) goto L_0x0017
            goto L_0x0036
        L_0x0017:
            long r3 = r8.zzu     // Catch:{ all -> 0x0038 }
            int r1 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r1 <= 0) goto L_0x0025
            if (r11 != 0) goto L_0x0020
            goto L_0x0025
        L_0x0020:
            int r9 = r8.zzo     // Catch:{ all -> 0x0038 }
            int r9 = r9 - r0
            monitor-exit(r8)
            return r9
        L_0x0025:
            int r11 = r8.zzo     // Catch:{ all -> 0x0038 }
            int r3 = r11 - r0
            r6 = 1
            r1 = r8
            r4 = r9
            int r9 = r1.zzB(r2, r3, r4, r6)     // Catch:{ all -> 0x0038 }
            r10 = -1
            monitor-exit(r8)
            if (r9 != r10) goto L_0x0035
            return r7
        L_0x0035:
            return r9
        L_0x0036:
            monitor-exit(r8)
            return r7
        L_0x0038:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzvn.zzc(long, boolean):int");
    }

    public final int zzd() {
        return this.zzp + this.zzo;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0034, code lost:
        if (r9 != 0) goto L_0x003d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int zze(com.google.android.gms.internal.ads.zzkn r9, com.google.android.gms.internal.ads.zzht r10, int r11, boolean r12) {
        /*
            r8 = this;
            r0 = r11 & 2
            r1 = 1
            if (r0 == 0) goto L_0x0007
            r5 = 1
            goto L_0x0009
        L_0x0007:
            r0 = 0
            r5 = 0
        L_0x0009:
            com.google.android.gms.internal.ads.zzvj r7 = r8.zzb
            r2 = r8
            r3 = r9
            r4 = r10
            r6 = r12
            int r9 = r2.zzD(r3, r4, r5, r6, r7)
            r12 = -4
            if (r9 != r12) goto L_0x003e
            boolean r9 = r10.zzf()
            if (r9 != 0) goto L_0x003d
            r9 = r11 & 1
            r11 = r11 & 4
            if (r11 != 0) goto L_0x0034
            if (r9 == 0) goto L_0x002c
            com.google.android.gms.internal.ads.zzvh r9 = r8.zza
            com.google.android.gms.internal.ads.zzvj r11 = r8.zzb
            r9.zzd(r10, r11)
            goto L_0x003d
        L_0x002c:
            com.google.android.gms.internal.ads.zzvh r9 = r8.zza
            com.google.android.gms.internal.ads.zzvj r11 = r8.zzb
            r9.zze(r10, r11)
            goto L_0x0037
        L_0x0034:
            if (r9 == 0) goto L_0x0037
            goto L_0x003d
        L_0x0037:
            int r9 = r8.zzr
            int r9 = r9 + r1
            r8.zzr = r9
            return r12
        L_0x003d:
            r9 = -4
        L_0x003e:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzvn.zze(com.google.android.gms.internal.ads.zzkn, com.google.android.gms.internal.ads.zzht, int, boolean):int");
    }

    public final /* synthetic */ int zzf(zzt zzt2, int i10, boolean z10) {
        return zzacq.zza(this, zzt2, i10, z10);
    }

    public final int zzg(zzt zzt2, int i10, boolean z10, int i11) {
        return this.zza.zza(zzt2, i10, z10);
    }

    public final synchronized long zzh() {
        return this.zzu;
    }

    public final synchronized zzam zzi() {
        if (this.zzx) {
            return null;
        }
        return this.zzz;
    }

    public final void zzj(long j10, boolean z10, boolean z11) {
        this.zza.zzc(zzE(j10, false, z11));
    }

    public final void zzk() {
        this.zza.zzc(zzF());
    }

    public final void zzl(zzam zzam) {
        this.zzy = zzam;
        boolean zzN = zzN(zzam);
        zzvm zzvm = this.zzf;
        if (zzvm != null && zzN) {
            zzvm.zzM(zzam);
        }
    }

    public final void zzn() {
        zzre zzre = this.zzC;
        if (zzre != null) {
            throw zzre.zza();
        }
    }

    public final void zzo() {
        zzk();
        zzJ();
    }

    public final void zzp() {
        zzq(true);
        zzJ();
    }

    public final void zzq(boolean z10) {
        this.zza.zzf();
        this.zzo = 0;
        this.zzp = 0;
        this.zzq = 0;
        this.zzr = 0;
        this.zzw = true;
        this.zzs = Long.MIN_VALUE;
        this.zzt = Long.MIN_VALUE;
        this.zzu = Long.MIN_VALUE;
        this.zzv = false;
        this.zzc.zzd();
        if (z10) {
            this.zzy = null;
            this.zzz = null;
            this.zzx = true;
            this.zzA = true;
        }
    }

    public final /* synthetic */ void zzr(zzfb zzfb, int i10) {
        zzacq.zzb(this, zzfb, i10);
    }

    public final void zzs(zzfb zzfb, int i10, int i11) {
        this.zza.zzh(zzfb, i10);
    }

    public final void zzt(long j10, int i10, int i11, int i12, zzacr zzacr) {
        if (this.zzw) {
            if ((i10 & 1) != 0) {
                this.zzw = false;
            } else {
                return;
            }
        }
        if (this.zzA) {
            if (j10 >= this.zzs) {
                if ((i10 & 1) == 0) {
                    if (!this.zzB) {
                        zzer.zzf("SampleQueue", "Overriding unexpected non-sync sample for format: ".concat(String.valueOf(this.zzz)));
                        this.zzB = true;
                    }
                    i10 |= 1;
                }
            } else {
                return;
            }
        }
        zzH(j10, i10, (this.zza.zzb() - ((long) i11)) - ((long) i12), i11, zzacr);
    }

    public final void zzu(long j10) {
        this.zzs = j10;
    }

    public final void zzv(zzvm zzvm) {
        this.zzf = zzvm;
    }

    public final synchronized void zzw(int i10) {
        boolean z10 = false;
        if (i10 >= 0) {
            try {
                if (this.zzr + i10 <= this.zzo) {
                    z10 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        zzdx.zzd(z10);
        this.zzr += i10;
    }

    public final synchronized boolean zzx() {
        return this.zzv;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x001c, code lost:
        return r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean zzy(boolean r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.zzL()     // Catch:{ all -> 0x003e }
            r1 = 1
            if (r0 != 0) goto L_0x001d
            r0 = 0
            if (r4 != 0) goto L_0x001b
            boolean r4 = r3.zzv     // Catch:{ all -> 0x003e }
            if (r4 != 0) goto L_0x001b
            com.google.android.gms.internal.ads.zzam r4 = r3.zzz     // Catch:{ all -> 0x003e }
            if (r4 == 0) goto L_0x001a
            com.google.android.gms.internal.ads.zzam r2 = r3.zzg     // Catch:{ all -> 0x003e }
            if (r4 == r2) goto L_0x0018
            goto L_0x001b
        L_0x0018:
            monitor-exit(r3)
            return r0
        L_0x001a:
            r1 = 0
        L_0x001b:
            monitor-exit(r3)
            return r1
        L_0x001d:
            com.google.android.gms.internal.ads.zzvu r4 = r3.zzc     // Catch:{ all -> 0x003e }
            int r0 = r3.zzp     // Catch:{ all -> 0x003e }
            int r2 = r3.zzr     // Catch:{ all -> 0x003e }
            int r0 = r0 + r2
            java.lang.Object r4 = r4.zza(r0)     // Catch:{ all -> 0x003e }
            com.google.android.gms.internal.ads.zzvl r4 = (com.google.android.gms.internal.ads.zzvl) r4     // Catch:{ all -> 0x003e }
            com.google.android.gms.internal.ads.zzam r4 = r4.zza     // Catch:{ all -> 0x003e }
            com.google.android.gms.internal.ads.zzam r0 = r3.zzg     // Catch:{ all -> 0x003e }
            if (r4 == r0) goto L_0x0032
            monitor-exit(r3)
            return r1
        L_0x0032:
            int r4 = r3.zzr     // Catch:{ all -> 0x003e }
            int r4 = r3.zzC(r4)     // Catch:{ all -> 0x003e }
            boolean r4 = r3.zzM(r4)     // Catch:{ all -> 0x003e }
            monitor-exit(r3)
            return r4
        L_0x003e:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzvn.zzy(boolean):boolean");
    }

    public final synchronized boolean zzz(int i10) {
        boolean z10;
        zzK();
        int i11 = this.zzp;
        if (i10 >= i11) {
            if (i10 <= this.zzo + i11) {
                this.zzs = Long.MIN_VALUE;
                this.zzr = i10 - i11;
                z10 = true;
            }
        }
        z10 = false;
        return z10;
    }
}
