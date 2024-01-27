package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import com.facebook.appevents.AppEventsConstants;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzva implements zztu, zzabp, zzye, zzyj, zzvm {
    /* access modifiers changed from: private */
    public static final Map zzb;
    /* access modifiers changed from: private */
    public static final zzam zzc;
    /* access modifiers changed from: private */
    public long zzA;
    private boolean zzB;
    private int zzC;
    private boolean zzD;
    private boolean zzE;
    private int zzF;
    private boolean zzG;
    private long zzH;
    private long zzI;
    private boolean zzJ;
    private int zzK;
    private boolean zzL;
    private boolean zzM;
    private final zzyd zzN;
    private final zzxz zzO;
    private final Uri zzd;
    private final zzgi zze;
    private final zzrd zzf;
    private final zzuf zzg;
    private final zzqx zzh;
    private final zzuw zzi;
    /* access modifiers changed from: private */
    public final long zzj;
    private final zzym zzk = new zzym("ProgressiveMediaPeriod");
    private final zzup zzl;
    private final zzea zzm;
    private final Runnable zzn;
    /* access modifiers changed from: private */
    public final Runnable zzo;
    /* access modifiers changed from: private */
    public final Handler zzp;
    private final boolean zzq;
    private zztt zzr;
    /* access modifiers changed from: private */
    public zzaeq zzs;
    private zzvn[] zzt;
    private zzuy[] zzu;
    private boolean zzv;
    private boolean zzw;
    private boolean zzx;
    private zzuz zzy;
    private zzacm zzz;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("Icy-MetaData", AppEventsConstants.EVENT_PARAM_VALUE_YES);
        zzb = Collections.unmodifiableMap(hashMap);
        zzak zzak = new zzak();
        zzak.zzJ("icy");
        zzak.zzU("application/x-icy");
        zzc = zzak.zzac();
    }

    public zzva(Uri uri, zzgi zzgi, zzup zzup, zzrd zzrd, zzqx zzqx, zzyd zzyd, zzuf zzuf, zzuw zzuw, zzxz zzxz, String str, int i10, long j10) {
        this.zzd = uri;
        this.zze = zzgi;
        this.zzf = zzrd;
        this.zzh = zzqx;
        this.zzN = zzyd;
        this.zzg = zzuf;
        this.zzi = zzuw;
        this.zzO = zzxz;
        this.zzj = (long) i10;
        this.zzl = zzup;
        this.zzA = j10;
        this.zzq = j10 != -9223372036854775807L;
        this.zzm = new zzea(zzdy.zza);
        this.zzn = new zzur(this);
        this.zzo = new zzus(this);
        this.zzp = zzfk.zzv((Handler.Callback) null);
        this.zzu = new zzuy[0];
        this.zzt = new zzvn[0];
        this.zzI = -9223372036854775807L;
        this.zzC = 1;
    }

    private final int zzQ() {
        int i10 = 0;
        for (zzvn zzd2 : this.zzt) {
            i10 += zzd2.zzd();
        }
        return i10;
    }

    /* access modifiers changed from: private */
    public final long zzR(boolean z10) {
        int i10 = 0;
        long j10 = Long.MIN_VALUE;
        while (true) {
            zzvn[] zzvnArr = this.zzt;
            if (i10 >= zzvnArr.length) {
                return j10;
            }
            if (!z10) {
                zzuz zzuz = this.zzy;
                Objects.requireNonNull(zzuz);
                if (!zzuz.zzc[i10]) {
                    i10++;
                }
            }
            j10 = Math.max(j10, zzvnArr[i10].zzh());
            i10++;
        }
    }

    private final zzacs zzS(zzuy zzuy) {
        int length = this.zzt.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (zzuy.equals(this.zzu[i10])) {
                return this.zzt[i10];
            }
        }
        zzvn zzvn = new zzvn(this.zzO, this.zzf, this.zzh);
        zzvn.zzv(this);
        int i11 = length + 1;
        zzuy[] zzuyArr = (zzuy[]) Arrays.copyOf(this.zzu, i11);
        zzuyArr[length] = zzuy;
        int i12 = zzfk.zza;
        this.zzu = zzuyArr;
        zzvn[] zzvnArr = (zzvn[]) Arrays.copyOf(this.zzt, i11);
        zzvnArr[length] = zzvn;
        this.zzt = zzvnArr;
        return zzvn;
    }

    private final void zzT() {
        zzdx.zzf(this.zzw);
        Objects.requireNonNull(this.zzy);
        Objects.requireNonNull(this.zzz);
    }

    /* access modifiers changed from: private */
    public final void zzU() {
        int i10;
        zzby zzby;
        if (!this.zzM && !this.zzw && this.zzv && this.zzz != null) {
            zzvn[] zzvnArr = this.zzt;
            int length = zzvnArr.length;
            int i11 = 0;
            while (i11 < length) {
                if (zzvnArr[i11].zzi() != null) {
                    i11++;
                } else {
                    return;
                }
            }
            this.zzm.zzc();
            int length2 = this.zzt.length;
            zzcx[] zzcxArr = new zzcx[length2];
            boolean[] zArr = new boolean[length2];
            for (int i12 = 0; i12 < length2; i12++) {
                zzam zzi2 = this.zzt[i12].zzi();
                Objects.requireNonNull(zzi2);
                String str = zzi2.zzm;
                boolean zzf2 = zzcb.zzf(str);
                boolean z10 = zzf2 || zzcb.zzg(str);
                zArr[i12] = z10;
                this.zzx = z10 | this.zzx;
                zzaeq zzaeq = this.zzs;
                if (zzaeq != null) {
                    if (zzf2 || this.zzu[i12].zzb) {
                        zzby zzby2 = zzi2.zzk;
                        if (zzby2 == null) {
                            zzby = new zzby(-9223372036854775807L, zzaeq);
                        } else {
                            zzby = zzby2.zzc(zzaeq);
                        }
                        zzak zzb2 = zzi2.zzb();
                        zzb2.zzO(zzby);
                        zzi2 = zzb2.zzac();
                    }
                    if (zzf2 && zzi2.zzg == -1 && zzi2.zzh == -1 && (i10 = zzaeq.zza) != -1) {
                        zzak zzb3 = zzi2.zzb();
                        zzb3.zzx(i10);
                        zzi2 = zzb3.zzac();
                    }
                }
                zzcxArr[i12] = new zzcx(Integer.toString(i12), zzi2.zzc(this.zzf.zza(zzi2)));
            }
            this.zzy = new zzuz(new zzvx(zzcxArr), zArr);
            this.zzw = true;
            zztt zztt = this.zzr;
            Objects.requireNonNull(zztt);
            zztt.zzi(this);
        }
    }

    private final void zzV(int i10) {
        zzT();
        zzuz zzuz = this.zzy;
        boolean[] zArr = zzuz.zzd;
        if (!zArr[i10]) {
            zzam zzb2 = zzuz.zza.zzb(i10).zzb(0);
            this.zzg.zzc(new zzts(1, zzcb.zzb(zzb2.zzm), zzb2, 0, (Object) null, zzfk.zzs(this.zzH), -9223372036854775807L));
            zArr[i10] = true;
        }
    }

    private final void zzW(int i10) {
        zzT();
        boolean[] zArr = this.zzy.zzb;
        if (this.zzJ && zArr[i10] && !this.zzt[i10].zzy(false)) {
            this.zzI = 0;
            this.zzJ = false;
            this.zzE = true;
            this.zzH = 0;
            this.zzK = 0;
            for (zzvn zzq2 : this.zzt) {
                zzq2.zzq(false);
            }
            zztt zztt = this.zzr;
            Objects.requireNonNull(zztt);
            zztt.zzg(this);
        }
    }

    private final void zzX() {
        zzuv zzuv = new zzuv(this, this.zzd, this.zze, this.zzl, this, this.zzm);
        if (this.zzw) {
            zzdx.zzf(zzY());
            long j10 = this.zzA;
            if (j10 == -9223372036854775807L || this.zzI <= j10) {
                zzacm zzacm = this.zzz;
                Objects.requireNonNull(zzacm);
                zzuv.zzf(zzuv, zzacm.zzg(this.zzI).zza.zzc, this.zzI);
                for (zzvn zzu2 : this.zzt) {
                    zzu2.zzu(this.zzI);
                }
                this.zzI = -9223372036854775807L;
            } else {
                this.zzL = true;
                this.zzI = -9223372036854775807L;
                return;
            }
        }
        this.zzK = zzQ();
        long zza = this.zzk.zza(zzuv, this, zzyd.zza(this.zzC));
        zzgn zzd2 = zzuv.zzl;
        this.zzg.zzg(new zztn(zzuv.zzb, zzd2, zzd2.zza, Collections.emptyMap(), zza, 0, 0), new zzts(1, -1, (zzam) null, 0, (Object) null, zzfk.zzs(zzuv.zzk), zzfk.zzs(this.zzA)));
    }

    private final boolean zzY() {
        return this.zzI != -9223372036854775807L;
    }

    private final boolean zzZ() {
        return this.zzE || zzY();
    }

    public final void zzD() {
        this.zzv = true;
        this.zzp.post(this.zzn);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzE() {
        if (!this.zzM) {
            zztt zztt = this.zzr;
            Objects.requireNonNull(zztt);
            zztt.zzg(this);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzF() {
        this.zzG = true;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzG(zzacm zzacm) {
        zzacm zzacm2;
        if (this.zzs == null) {
            zzacm2 = zzacm;
        } else {
            zzacm2 = new zzacl(-9223372036854775807L, 0);
        }
        this.zzz = zzacm2;
        if (zzacm.zza() == -9223372036854775807L && this.zzA != -9223372036854775807L) {
            this.zzz = new zzuu(this, this.zzz);
        }
        this.zzA = this.zzz.zza();
        boolean z10 = false;
        int i10 = 1;
        if (!this.zzG && zzacm.zza() == -9223372036854775807L) {
            z10 = true;
        }
        this.zzB = z10;
        if (true == z10) {
            i10 = 7;
        }
        this.zzC = i10;
        this.zzi.zza(this.zzA, zzacm.zzh(), this.zzB);
        if (!this.zzw) {
            zzU();
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzH() {
        this.zzk.zzi(zzyd.zza(this.zzC));
    }

    /* access modifiers changed from: package-private */
    public final void zzI(int i10) {
        this.zzt[i10].zzn();
        zzH();
    }

    public final /* bridge */ /* synthetic */ void zzJ(zzyi zzyi, long j10, long j11, boolean z10) {
        zzuv zzuv = (zzuv) zzyi;
        zzhj zze2 = zzuv.zzd;
        zztn zztn = new zztn(zzuv.zzb, zzuv.zzl, zze2.zzh(), zze2.zzi(), j10, j11, zze2.zzg());
        long unused = zzuv.zzb;
        long zzc2 = zzuv.zzk;
        long j12 = this.zzA;
        long zzs2 = zzfk.zzs(zzc2);
        long zzs3 = zzfk.zzs(j12);
        zzts zzts = r5;
        zzts zzts2 = new zzts(1, -1, (zzam) null, 0, (Object) null, zzs2, zzs3);
        this.zzg.zzd(zztn, zzts);
        if (!z10) {
            for (zzvn zzq2 : this.zzt) {
                zzq2.zzq(false);
            }
            if (this.zzF > 0) {
                zztt zztt = this.zzr;
                Objects.requireNonNull(zztt);
                zztt.zzg(this);
            }
        }
    }

    public final /* bridge */ /* synthetic */ void zzK(zzyi zzyi, long j10, long j11) {
        zzacm zzacm;
        if (this.zzA == -9223372036854775807L && (zzacm = this.zzz) != null) {
            boolean zzh2 = zzacm.zzh();
            long zzR = zzR(true);
            long j12 = zzR == Long.MIN_VALUE ? 0 : zzR + 10000;
            this.zzA = j12;
            this.zzi.zza(j12, zzh2, this.zzB);
        }
        zzuv zzuv = (zzuv) zzyi;
        zzhj zze2 = zzuv.zzd;
        long zzb2 = zzuv.zzb;
        zzgn zzd2 = zzuv.zzl;
        Uri zzh3 = zze2.zzh();
        Map zzi2 = zze2.zzi();
        long zzg2 = zze2.zzg();
        zztn zztn = r4;
        zztn zztn2 = new zztn(zzb2, zzd2, zzh3, zzi2, j10, j11, zzg2);
        long unused = zzuv.zzb;
        this.zzg.zze(zztn, new zzts(1, -1, (zzam) null, 0, (Object) null, zzfk.zzs(zzuv.zzk), zzfk.zzs(this.zzA)));
        this.zzL = true;
        zztt zztt = this.zzr;
        Objects.requireNonNull(zztt);
        zztt.zzg(this);
    }

    public final void zzL() {
        for (zzvn zzp2 : this.zzt) {
            zzp2.zzp();
        }
        this.zzl.zze();
    }

    public final void zzM(zzam zzam) {
        this.zzp.post(this.zzn);
    }

    public final void zzN() {
        if (this.zzw) {
            for (zzvn zzo2 : this.zzt) {
                zzo2.zzo();
            }
        }
        this.zzk.zzj(this);
        this.zzp.removeCallbacksAndMessages((Object) null);
        this.zzr = null;
        this.zzM = true;
    }

    public final void zzO(zzacm zzacm) {
        this.zzp.post(new zzut(this, zzacm));
    }

    /* access modifiers changed from: package-private */
    public final boolean zzP(int i10) {
        return !zzZ() && this.zzt[i10].zzy(this.zzL);
    }

    public final long zza(long j10, zzlv zzlv) {
        long j11 = j10;
        zzlv zzlv2 = zzlv;
        zzT();
        if (!this.zzz.zzh()) {
            return 0;
        }
        zzack zzg2 = this.zzz.zzg(j11);
        zzacn zzacn = zzg2.zza;
        zzacn zzacn2 = zzg2.zzb;
        long j12 = zzlv2.zzf;
        if (j12 == 0) {
            if (zzlv2.zzg == 0) {
                return j11;
            }
            j12 = 0;
        }
        long j13 = zzacn.zzb;
        int i10 = zzfk.zza;
        long j14 = j11 - j12;
        long j15 = zzlv2.zzg;
        long j16 = j11 + j15;
        long j17 = j11 ^ j16;
        long j18 = j15 ^ j16;
        if (((j11 ^ j12) & (j11 ^ j14)) < 0) {
            j14 = Long.MIN_VALUE;
        }
        if ((j17 & j18) < 0) {
            j16 = Long.MAX_VALUE;
        }
        boolean z10 = true;
        boolean z11 = j14 <= j13 && j13 <= j16;
        long j19 = zzacn2.zzb;
        if (j14 > j19 || j19 > j16) {
            z10 = false;
        }
        if (z11 && z10) {
            if (Math.abs(j13 - j11) > Math.abs(j19 - j11)) {
                return j19;
            }
        } else if (!z11) {
            return z10 ? j19 : j14;
        }
        return j13;
    }

    public final long zzb() {
        long j10;
        zzT();
        if (this.zzL || this.zzF == 0) {
            return Long.MIN_VALUE;
        }
        if (zzY()) {
            return this.zzI;
        }
        if (this.zzx) {
            int length = this.zzt.length;
            j10 = Long.MAX_VALUE;
            for (int i10 = 0; i10 < length; i10++) {
                zzuz zzuz = this.zzy;
                if (zzuz.zzb[i10] && zzuz.zzc[i10] && !this.zzt[i10].zzx()) {
                    j10 = Math.min(j10, this.zzt[i10].zzh());
                }
            }
        } else {
            j10 = Long.MAX_VALUE;
        }
        if (j10 == Long.MAX_VALUE) {
            j10 = zzR(false);
        }
        return j10 == Long.MIN_VALUE ? this.zzH : j10;
    }

    public final long zzc() {
        return zzb();
    }

    public final long zzd() {
        if (!this.zzE) {
            return -9223372036854775807L;
        }
        if (!this.zzL && zzQ() <= this.zzK) {
            return -9223372036854775807L;
        }
        this.zzE = false;
        return this.zzH;
    }

    public final long zze(long j10) {
        boolean z10;
        zzT();
        boolean[] zArr = this.zzy.zzb;
        if (true != this.zzz.zzh()) {
            j10 = 0;
        }
        this.zzE = false;
        this.zzH = j10;
        if (zzY()) {
            this.zzI = j10;
            return j10;
        }
        if (this.zzC != 7) {
            int length = this.zzt.length;
            int i10 = 0;
            while (i10 < length) {
                zzvn zzvn = this.zzt[i10];
                if (this.zzq) {
                    z10 = zzvn.zzz(zzvn.zza());
                } else {
                    z10 = zzvn.zzA(j10, false);
                }
                if (z10 || (!zArr[i10] && this.zzx)) {
                    i10++;
                }
            }
            return j10;
        }
        this.zzJ = false;
        this.zzI = j10;
        this.zzL = false;
        zzym zzym = this.zzk;
        if (zzym.zzl()) {
            for (zzvn zzk2 : this.zzt) {
                zzk2.zzk();
            }
            this.zzk.zzg();
        } else {
            zzym.zzh();
            for (zzvn zzq2 : this.zzt) {
                zzq2.zzq(false);
            }
        }
        return j10;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0040, code lost:
        if (r2 == 0) goto L_0x0047;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00d6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long zzf(com.google.android.gms.internal.ads.zzxk[] r8, boolean[] r9, com.google.android.gms.internal.ads.zzvo[] r10, boolean[] r11, long r12) {
        /*
            r7 = this;
            r7.zzT()
            com.google.android.gms.internal.ads.zzuz r0 = r7.zzy
            com.google.android.gms.internal.ads.zzvx r1 = r0.zza
            boolean[] r0 = r0.zzc
            int r2 = r7.zzF
            r3 = 0
            r4 = 0
        L_0x000d:
            int r5 = r8.length
            if (r4 >= r5) goto L_0x0035
            r5 = r10[r4]
            if (r5 == 0) goto L_0x0032
            r6 = r8[r4]
            if (r6 == 0) goto L_0x001c
            boolean r6 = r9[r4]
            if (r6 != 0) goto L_0x0032
        L_0x001c:
            com.google.android.gms.internal.ads.zzux r5 = (com.google.android.gms.internal.ads.zzux) r5
            int r5 = r5.zzb
            boolean r6 = r0[r5]
            com.google.android.gms.internal.ads.zzdx.zzf(r6)
            int r6 = r7.zzF
            int r6 = r6 + -1
            r7.zzF = r6
            r0[r5] = r3
            r5 = 0
            r10[r4] = r5
        L_0x0032:
            int r4 = r4 + 1
            goto L_0x000d
        L_0x0035:
            boolean r9 = r7.zzq
            r4 = 0
            r6 = 1
            if (r9 != 0) goto L_0x004a
            boolean r9 = r7.zzD
            if (r9 == 0) goto L_0x0043
            if (r2 != 0) goto L_0x004a
            goto L_0x0047
        L_0x0043:
            int r9 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r9 == 0) goto L_0x0049
        L_0x0047:
            r9 = 1
            goto L_0x004b
        L_0x0049:
            r12 = r4
        L_0x004a:
            r9 = 0
        L_0x004b:
            r2 = 0
        L_0x004c:
            int r4 = r8.length
            if (r2 >= r4) goto L_0x00a5
            r4 = r10[r2]
            if (r4 != 0) goto L_0x00a2
            r4 = r8[r2]
            if (r4 == 0) goto L_0x00a2
            int r5 = r4.zzc()
            if (r5 != r6) goto L_0x005f
            r5 = 1
            goto L_0x0060
        L_0x005f:
            r5 = 0
        L_0x0060:
            com.google.android.gms.internal.ads.zzdx.zzf(r5)
            int r5 = r4.zza(r3)
            if (r5 != 0) goto L_0x006b
            r5 = 1
            goto L_0x006c
        L_0x006b:
            r5 = 0
        L_0x006c:
            com.google.android.gms.internal.ads.zzdx.zzf(r5)
            com.google.android.gms.internal.ads.zzcx r4 = r4.zze()
            int r4 = r1.zza(r4)
            boolean r5 = r0[r4]
            r5 = r5 ^ r6
            com.google.android.gms.internal.ads.zzdx.zzf(r5)
            int r5 = r7.zzF
            int r5 = r5 + r6
            r7.zzF = r5
            r0[r4] = r6
            com.google.android.gms.internal.ads.zzux r5 = new com.google.android.gms.internal.ads.zzux
            r5.<init>(r7, r4)
            r10[r2] = r5
            r11[r2] = r6
            if (r9 != 0) goto L_0x00a2
            com.google.android.gms.internal.ads.zzvn[] r9 = r7.zzt
            r9 = r9[r4]
            int r4 = r9.zzb()
            if (r4 == 0) goto L_0x00a1
            boolean r9 = r9.zzA(r12, r6)
            if (r9 != 0) goto L_0x00a1
            r9 = 1
            goto L_0x00a2
        L_0x00a1:
            r9 = 0
        L_0x00a2:
            int r2 = r2 + 1
            goto L_0x004c
        L_0x00a5:
            int r8 = r7.zzF
            if (r8 != 0) goto L_0x00d6
            r7.zzJ = r3
            r7.zzE = r3
            com.google.android.gms.internal.ads.zzym r8 = r7.zzk
            boolean r8 = r8.zzl()
            if (r8 == 0) goto L_0x00c8
            com.google.android.gms.internal.ads.zzvn[] r8 = r7.zzt
            int r9 = r8.length
        L_0x00b8:
            if (r3 >= r9) goto L_0x00c2
            r10 = r8[r3]
            r10.zzk()
            int r3 = r3 + 1
            goto L_0x00b8
        L_0x00c2:
            com.google.android.gms.internal.ads.zzym r8 = r7.zzk
            r8.zzg()
            goto L_0x00e8
        L_0x00c8:
            com.google.android.gms.internal.ads.zzvn[] r8 = r7.zzt
            int r9 = r8.length
            r10 = 0
        L_0x00cc:
            if (r10 >= r9) goto L_0x00e8
            r11 = r8[r10]
            r11.zzq(r3)
            int r10 = r10 + 1
            goto L_0x00cc
        L_0x00d6:
            if (r9 == 0) goto L_0x00e8
            long r12 = r7.zze(r12)
        L_0x00dc:
            int r8 = r10.length
            if (r3 >= r8) goto L_0x00e8
            r8 = r10[r3]
            if (r8 == 0) goto L_0x00e5
            r11[r3] = r6
        L_0x00e5:
            int r3 = r3 + 1
            goto L_0x00dc
        L_0x00e8:
            r7.zzD = r6
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzva.zzf(com.google.android.gms.internal.ads.zzxk[], boolean[], com.google.android.gms.internal.ads.zzvo[], boolean[], long):long");
    }

    /* access modifiers changed from: package-private */
    public final int zzg(int i10, zzkn zzkn, zzht zzht, int i11) {
        if (zzZ()) {
            return -3;
        }
        zzV(i10);
        int zze2 = this.zzt[i10].zze(zzkn, zzht, i11, this.zzL);
        if (zze2 == -3) {
            zzW(i10);
        }
        return zze2;
    }

    public final zzvx zzh() {
        zzT();
        return this.zzy.zza;
    }

    /* access modifiers changed from: package-private */
    public final int zzi(int i10, long j10) {
        if (zzZ()) {
            return 0;
        }
        zzV(i10);
        zzvn zzvn = this.zzt[i10];
        int zzc2 = zzvn.zzc(j10, this.zzL);
        zzvn.zzw(zzc2);
        if (zzc2 != 0) {
            return zzc2;
        }
        zzW(i10);
        return 0;
    }

    public final void zzj(long j10, boolean z10) {
        if (!this.zzq) {
            zzT();
            if (!zzY()) {
                boolean[] zArr = this.zzy.zzc;
                int length = this.zzt.length;
                for (int i10 = 0; i10 < length; i10++) {
                    this.zzt[i10].zzj(j10, false, zArr[i10]);
                }
            }
        }
    }

    public final void zzk() {
        zzH();
        if (this.zzL && !this.zzw) {
            throw zzcc.zza("Loading finished before preparation is complete.", (Throwable) null);
        }
    }

    public final void zzl(zztt zztt, long j10) {
        this.zzr = zztt;
        this.zzm.zze();
        zzX();
    }

    public final void zzm(long j10) {
    }

    public final boolean zzo(zzks zzks) {
        if (this.zzL) {
            return false;
        }
        zzym zzym = this.zzk;
        if (zzym.zzk() || this.zzJ) {
            return false;
        }
        if (this.zzw && this.zzF == 0) {
            return false;
        }
        boolean zze2 = this.zzm.zze();
        if (zzym.zzl()) {
            return zze2;
        }
        zzX();
        return true;
    }

    public final boolean zzp() {
        return this.zzk.zzl() && this.zzm.zzd();
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00e3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzyg zzu(com.google.android.gms.internal.ads.zzyi r22, long r23, long r25, java.io.IOException r27, int r28) {
        /*
            r21 = this;
            r0 = r21
            r1 = r27
            r2 = r22
            com.google.android.gms.internal.ads.zzuv r2 = (com.google.android.gms.internal.ads.zzuv) r2
            com.google.android.gms.internal.ads.zzhj r3 = r2.zzd
            com.google.android.gms.internal.ads.zztn r14 = new com.google.android.gms.internal.ads.zztn
            long r5 = r2.zzb
            com.google.android.gms.internal.ads.zzgn r7 = r2.zzl
            android.net.Uri r8 = r3.zzh()
            java.util.Map r9 = r3.zzi()
            long r15 = r3.zzg()
            r4 = r14
            r10 = r23
            r12 = r25
            r3 = r14
            r14 = r15
            r4.<init>(r5, r7, r8, r9, r10, r12, r14)
            long unused = r2.zzk
            int r4 = com.google.android.gms.internal.ads.zzfk.zza
            boolean r4 = r1 instanceof com.google.android.gms.internal.ads.zzcc
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 != 0) goto L_0x0068
            boolean r4 = r1 instanceof java.io.FileNotFoundException
            if (r4 != 0) goto L_0x0068
            boolean r4 = r1 instanceof com.google.android.gms.internal.ads.zzha
            if (r4 != 0) goto L_0x0068
            boolean r4 = r1 instanceof com.google.android.gms.internal.ads.zzyl
            if (r4 != 0) goto L_0x0068
            r4 = r1
        L_0x0047:
            if (r4 == 0) goto L_0x005c
            boolean r7 = r4 instanceof com.google.android.gms.internal.ads.zzgj
            if (r7 == 0) goto L_0x0057
            r7 = r4
            com.google.android.gms.internal.ads.zzgj r7 = (com.google.android.gms.internal.ads.zzgj) r7
            int r7 = r7.zza
            r8 = 2008(0x7d8, float:2.814E-42)
            if (r7 != r8) goto L_0x0057
            goto L_0x0068
        L_0x0057:
            java.lang.Throwable r4 = r4.getCause()
            goto L_0x0047
        L_0x005c:
            int r4 = r28 + -1
            int r4 = r4 * 1000
            r7 = 5000(0x1388, float:7.006E-42)
            int r4 = java.lang.Math.min(r4, r7)
            long r7 = (long) r4
            goto L_0x0069
        L_0x0068:
            r7 = r5
        L_0x0069:
            r4 = 1
            int r9 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r9 != 0) goto L_0x0071
            com.google.android.gms.internal.ads.zzyg r5 = com.google.android.gms.internal.ads.zzym.zzd
            goto L_0x00bd
        L_0x0071:
            int r9 = r21.zzQ()
            int r10 = r0.zzK
            r11 = 0
            if (r9 <= r10) goto L_0x007c
            r10 = 1
            goto L_0x007d
        L_0x007c:
            r10 = 0
        L_0x007d:
            boolean r12 = r0.zzG
            if (r12 != 0) goto L_0x00b7
            com.google.android.gms.internal.ads.zzacm r12 = r0.zzz
            if (r12 == 0) goto L_0x008e
            long r12 = r12.zza()
            int r14 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r14 == 0) goto L_0x008e
            goto L_0x00b7
        L_0x008e:
            boolean r5 = r0.zzw
            if (r5 == 0) goto L_0x009d
            boolean r6 = r21.zzZ()
            if (r6 != 0) goto L_0x009d
            r0.zzJ = r4
            com.google.android.gms.internal.ads.zzyg r5 = com.google.android.gms.internal.ads.zzym.zzc
            goto L_0x00bd
        L_0x009d:
            r0.zzE = r5
            r5 = 0
            r0.zzH = r5
            r0.zzK = r11
            com.google.android.gms.internal.ads.zzvn[] r9 = r0.zzt
            int r12 = r9.length
            r13 = 0
        L_0x00a9:
            if (r13 >= r12) goto L_0x00b3
            r14 = r9[r13]
            r14.zzq(r11)
            int r13 = r13 + 1
            goto L_0x00a9
        L_0x00b3:
            com.google.android.gms.internal.ads.zzuv.zzf(r2, r5, r5)
            goto L_0x00b9
        L_0x00b7:
            r0.zzK = r9
        L_0x00b9:
            com.google.android.gms.internal.ads.zzyg r5 = com.google.android.gms.internal.ads.zzym.zzb(r10, r7)
        L_0x00bd:
            boolean r6 = r5.zzc()
            r4 = r4 ^ r6
            com.google.android.gms.internal.ads.zzuf r6 = r0.zzg
            long r7 = r2.zzk
            long r9 = r0.zzA
            long r17 = com.google.android.gms.internal.ads.zzfk.zzs(r7)
            long r19 = com.google.android.gms.internal.ads.zzfk.zzs(r9)
            com.google.android.gms.internal.ads.zzts r7 = new com.google.android.gms.internal.ads.zzts
            r12 = 1
            r13 = -1
            r14 = 0
            r15 = 0
            r16 = 0
            r11 = r7
            r11.<init>(r12, r13, r14, r15, r16, r17, r19)
            r6.zzf(r3, r7, r1, r4)
            if (r4 == 0) goto L_0x00e6
            long unused = r2.zzb
        L_0x00e6:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzva.zzu(com.google.android.gms.internal.ads.zzyi, long, long, java.io.IOException, int):com.google.android.gms.internal.ads.zzyg");
    }

    /* access modifiers changed from: package-private */
    public final zzacs zzv() {
        return zzS(new zzuy(0, true));
    }

    public final zzacs zzw(int i10, int i11) {
        return zzS(new zzuy(i10, false));
    }
}
