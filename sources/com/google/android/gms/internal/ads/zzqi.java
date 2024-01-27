package com.google.android.gms.internal.ads;

import android.media.AudioDeviceInfo;
import android.media.AudioTrack;
import android.os.SystemClock;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.Objects;
import java.util.concurrent.ExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzqi implements zzpi {
    private static final Object zza = new Object();
    private static ExecutorService zzb;
    private static int zzc;
    private long zzA;
    private long zzB;
    private long zzC;
    private long zzD;
    private int zzE;
    private boolean zzF;
    private boolean zzG;
    private long zzH;
    private float zzI;
    private ByteBuffer zzJ;
    private int zzK;
    private ByteBuffer zzL;
    private byte[] zzM;
    private int zzN;
    private boolean zzO;
    private boolean zzP;
    /* access modifiers changed from: private */
    public boolean zzQ;
    private boolean zzR;
    private int zzS;
    private zzl zzT;
    private zzpu zzU;
    /* access modifiers changed from: private */
    public long zzV;
    private boolean zzW;
    private boolean zzX;
    private final zzpy zzY;
    private final zzpq zzZ;
    private final zzpn zzd;
    private final zzqs zze;
    private final zzfvs zzf;
    private final zzfvs zzg;
    private final zzea zzh;
    private final zzpm zzi = new zzpm(new zzqd(this, (zzqc) null));
    private final ArrayDeque zzj;
    private zzqg zzk;
    private final zzqb zzl;
    private final zzqb zzm;
    private final zzpv zzn;
    private zzol zzo;
    /* access modifiers changed from: private */
    public zzpf zzp;
    private zzpx zzq;
    private zzpx zzr;
    private zzdn zzs;
    /* access modifiers changed from: private */
    public AudioTrack zzt;
    private zzon zzu;
    private zzk zzv;
    private zzqa zzw;
    private zzqa zzx;
    private zzcg zzy;
    private boolean zzz;

    /* synthetic */ zzqi(zzpw zzpw, zzqh zzqh) {
        this.zzu = zzpw.zza;
        this.zzY = zzpw.zzd;
        int i10 = zzfk.zza;
        this.zzn = zzpw.zzc;
        zzpq zzg2 = zzpw.zze;
        Objects.requireNonNull(zzg2);
        this.zzZ = zzg2;
        zzea zzea = new zzea(zzdy.zza);
        this.zzh = zzea;
        zzea.zze();
        zzpn zzpn = new zzpn();
        this.zzd = zzpn;
        zzqs zzqs = new zzqs();
        this.zze = zzqs;
        this.zzf = zzfvs.zzo(new zzdu(), zzpn, zzqs);
        this.zzg = zzfvs.zzm(new zzqr());
        this.zzI = 1.0f;
        this.zzv = zzk.zza;
        this.zzS = 0;
        this.zzT = new zzl(0, 0.0f);
        zzcg zzcg = zzcg.zza;
        this.zzx = new zzqa(zzcg, 0, 0, (zzpz) null);
        this.zzy = zzcg;
        this.zzz = false;
        this.zzj = new ArrayDeque();
        this.zzl = new zzqb(100);
        this.zzm = new zzqb(100);
    }

    static /* synthetic */ void zzF(AudioTrack audioTrack, zzea zzea) {
        try {
            audioTrack.flush();
            audioTrack.release();
            zzea.zze();
            synchronized (zza) {
                int i10 = zzc - 1;
                zzc = i10;
                if (i10 == 0) {
                    zzb.shutdown();
                    zzb = null;
                }
            }
        } catch (Throwable th) {
            zzea.zze();
            synchronized (zza) {
                int i11 = zzc - 1;
                zzc = i11;
                if (i11 == 0) {
                    zzb.shutdown();
                    zzb = null;
                }
                throw th;
            }
        }
    }

    /* access modifiers changed from: private */
    public final long zzH() {
        zzpx zzpx = this.zzr;
        return zzpx.zzc == 0 ? this.zzA / ((long) zzpx.zzb) : this.zzB;
    }

    /* access modifiers changed from: private */
    public final long zzI() {
        zzpx zzpx = this.zzr;
        if (zzpx.zzc != 0) {
            return this.zzD;
        }
        long j10 = this.zzC;
        long j11 = (long) zzpx.zzd;
        int i10 = zzfk.zza;
        return ((j10 + j11) - 1) / j11;
    }

    private final AudioTrack zzJ(zzpx zzpx) {
        try {
            return zzpx.zza(false, this.zzv, this.zzS);
        } catch (zzpe e10) {
            zzpf zzpf = this.zzp;
            if (zzpf != null) {
                zzpf.zza(e10);
            }
            throw e10;
        }
    }

    private final void zzK(long j10) {
        zzcg zzcg;
        boolean z10;
        if (zzU()) {
            zzpy zzpy = this.zzY;
            zzcg = this.zzy;
            zzpy.zzc(zzcg);
        } else {
            zzcg = zzcg.zza;
        }
        zzcg zzcg2 = zzcg;
        this.zzy = zzcg2;
        if (zzU()) {
            zzpy zzpy2 = this.zzY;
            z10 = this.zzz;
            zzpy2.zzd(z10);
        } else {
            z10 = false;
        }
        this.zzz = z10;
        ArrayDeque arrayDeque = this.zzj;
        long max = Math.max(0, j10);
        zzpx zzpx = this.zzr;
        long zzI2 = zzI();
        int i10 = zzpx.zze;
        int i11 = zzfk.zza;
        arrayDeque.add(new zzqa(zzcg2, max, (zzI2 * 1000000) / ((long) i10), (zzpz) null));
        zzP();
        zzpf zzpf = this.zzp;
        if (zzpf != null) {
            ((zzqn) zzpf).zza.zzc.zzs(this.zzz);
        }
    }

    private final void zzL() {
        if (!this.zzP) {
            this.zzP = true;
            this.zzi.zzc(zzI());
            this.zzt.stop();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0028, code lost:
        if (r0 == null) goto L_0x0039;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002e, code lost:
        if (r0.hasRemaining() != false) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0031, code lost:
        r2.zzs.zze(r2.zzJ);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0026, code lost:
        r0 = r2.zzJ;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void zzM(long r3) {
        /*
            r2 = this;
            com.google.android.gms.internal.ads.zzdn r0 = r2.zzs
            boolean r0 = r0.zzh()
            if (r0 == 0) goto L_0x003a
        L_0x0008:
            com.google.android.gms.internal.ads.zzdn r0 = r2.zzs
            boolean r0 = r0.zzg()
            if (r0 != 0) goto L_0x0039
        L_0x0010:
            com.google.android.gms.internal.ads.zzdn r0 = r2.zzs
            java.nio.ByteBuffer r0 = r0.zzb()
            boolean r1 = r0.hasRemaining()
            if (r1 == 0) goto L_0x0026
            r2.zzQ(r0, r3)
            boolean r0 = r0.hasRemaining()
            if (r0 == 0) goto L_0x0010
            return
        L_0x0026:
            java.nio.ByteBuffer r0 = r2.zzJ
            if (r0 == 0) goto L_0x0039
            boolean r0 = r0.hasRemaining()
            if (r0 != 0) goto L_0x0031
            goto L_0x0039
        L_0x0031:
            com.google.android.gms.internal.ads.zzdn r0 = r2.zzs
            java.nio.ByteBuffer r1 = r2.zzJ
            r0.zze(r1)
            goto L_0x0008
        L_0x0039:
            return
        L_0x003a:
            java.nio.ByteBuffer r0 = r2.zzJ
            if (r0 != 0) goto L_0x0040
            java.nio.ByteBuffer r0 = com.google.android.gms.internal.ads.zzdq.zza
        L_0x0040:
            r2.zzQ(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzqi.zzM(long):void");
    }

    private final void zzN(zzcg zzcg) {
        zzqa zzqa = new zzqa(zzcg, -9223372036854775807L, -9223372036854775807L, (zzpz) null);
        if (zzS()) {
            this.zzw = zzqa;
        } else {
            this.zzx = zzqa;
        }
    }

    private final void zzO() {
        if (zzS()) {
            if (zzfk.zza >= 21) {
                this.zzt.setVolume(this.zzI);
                return;
            }
            AudioTrack audioTrack = this.zzt;
            float f10 = this.zzI;
            audioTrack.setStereoVolume(f10, f10);
        }
    }

    private final void zzP() {
        zzdn zzdn = this.zzr.zzi;
        this.zzs = zzdn;
        zzdn.zzc();
    }

    private final void zzQ(ByteBuffer byteBuffer, long j10) {
        int i10;
        zzpf zzpf;
        if (byteBuffer.hasRemaining()) {
            ByteBuffer byteBuffer2 = this.zzL;
            boolean z10 = true;
            if (byteBuffer2 != null) {
                zzdx.zzd(byteBuffer2 == byteBuffer);
            } else {
                this.zzL = byteBuffer;
                if (zzfk.zza < 21) {
                    int remaining = byteBuffer.remaining();
                    byte[] bArr = this.zzM;
                    if (bArr == null || bArr.length < remaining) {
                        this.zzM = new byte[remaining];
                    }
                    int position = byteBuffer.position();
                    byteBuffer.get(this.zzM, 0, remaining);
                    byteBuffer.position(position);
                    this.zzN = 0;
                }
            }
            int remaining2 = byteBuffer.remaining();
            int i11 = zzfk.zza;
            if (i11 < 21) {
                int zza2 = this.zzi.zza(this.zzC);
                if (zza2 > 0) {
                    i10 = this.zzt.write(this.zzM, this.zzN, Math.min(remaining2, zza2));
                    if (i10 > 0) {
                        this.zzN += i10;
                        byteBuffer.position(byteBuffer.position() + i10);
                    }
                } else {
                    i10 = 0;
                }
            } else {
                i10 = this.zzt.write(byteBuffer, remaining2, 1);
            }
            this.zzV = SystemClock.elapsedRealtime();
            if (i10 < 0) {
                if (((i11 < 24 || i10 != -6) && i10 != -32) || zzI() <= 0) {
                    z10 = false;
                }
                zzph zzph = new zzph(i10, this.zzr.zza, z10);
                zzpf zzpf2 = this.zzp;
                if (zzpf2 != null) {
                    zzpf2.zza(zzph);
                }
                if (!zzph.zzb) {
                    this.zzm.zzb(zzph);
                } else {
                    this.zzu = zzon.zza;
                    throw zzph;
                }
            } else {
                this.zzm.zza();
                if (zzT(this.zzt)) {
                    if (this.zzD > 0) {
                        this.zzX = false;
                    }
                    if (this.zzQ && (zzpf = this.zzp) != null && i10 < remaining2) {
                        zzqo zzqo = ((zzqn) zzpf).zza;
                        if (zzqo.zzl != null) {
                            zzqo.zzl.zza();
                        }
                    }
                }
                int i12 = this.zzr.zzc;
                if (i12 == 0) {
                    this.zzC += (long) i10;
                }
                if (i10 == remaining2) {
                    if (i12 != 0) {
                        if (byteBuffer != this.zzJ) {
                            z10 = false;
                        }
                        zzdx.zzf(z10);
                        this.zzD += ((long) this.zzE) * ((long) this.zzK);
                    }
                    this.zzL = null;
                }
            }
        }
    }

    private final boolean zzR() {
        if (!this.zzs.zzh()) {
            ByteBuffer byteBuffer = this.zzL;
            if (byteBuffer == null) {
                return true;
            }
            zzQ(byteBuffer, Long.MIN_VALUE);
            return this.zzL == null;
        }
        this.zzs.zzd();
        zzM(Long.MIN_VALUE);
        if (!this.zzs.zzg()) {
            return false;
        }
        ByteBuffer byteBuffer2 = this.zzL;
        return byteBuffer2 == null || !byteBuffer2.hasRemaining();
    }

    private final boolean zzS() {
        return this.zzt != null;
    }

    private static boolean zzT(AudioTrack audioTrack) {
        return zzfk.zza >= 29 && audioTrack.isOffloadedPlayback();
    }

    private final boolean zzU() {
        zzpx zzpx = this.zzr;
        if (zzpx.zzc != 0) {
            return false;
        }
        int i10 = zzpx.zza.zzB;
        return true;
    }

    public final int zza(zzam zzam) {
        if (!"audio/raw".equals(zzam.zzm)) {
            return this.zzu.zza(zzam) != null ? 2 : 0;
        }
        if (!zzfk.zzF(zzam.zzB)) {
            int i10 = zzam.zzB;
            zzer.zzf("DefaultAudioSink", "Invalid PCM encoding: " + i10);
            return 0;
        } else if (zzam.zzB != 2) {
            return 1;
        } else {
            return 2;
        }
    }

    public final long zzb(boolean z10) {
        long j10;
        if (!zzS() || this.zzG) {
            return Long.MIN_VALUE;
        }
        long zzb2 = this.zzi.zzb(z10);
        zzpx zzpx = this.zzr;
        long zzI2 = zzI();
        int i10 = zzpx.zze;
        int i11 = zzfk.zza;
        long min = Math.min(zzb2, (zzI2 * 1000000) / ((long) i10));
        while (!this.zzj.isEmpty() && min >= ((zzqa) this.zzj.getFirst()).zzc) {
            this.zzx = (zzqa) this.zzj.remove();
        }
        zzqa zzqa = this.zzx;
        long j11 = min - zzqa.zzc;
        if (zzqa.zza.equals(zzcg.zza)) {
            j10 = this.zzx.zzb + j11;
        } else if (this.zzj.isEmpty()) {
            j10 = this.zzY.zza(j11) + this.zzx.zzb;
        } else {
            zzqa zzqa2 = (zzqa) this.zzj.getFirst();
            j10 = zzqa2.zzb - zzfk.zzo(zzqa2.zzc - min, this.zzx.zza.zzc);
        }
        zzpx zzpx2 = this.zzr;
        return j10 + ((this.zzY.zzb() * 1000000) / ((long) zzpx2.zze));
    }

    public final zzcg zzc() {
        return this.zzy;
    }

    public final zzoq zzd(zzam zzam) {
        if (this.zzW) {
            return zzoq.zza;
        }
        return this.zzZ.zza(zzam, this.zzv);
    }

    /* JADX WARNING: Removed duplicated region for block: B:52:0x0162  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0165  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zze(com.google.android.gms.internal.ads.zzam r19, int r20, int[] r21) {
        /*
            r18 = this;
            r1 = r18
            r3 = r19
            java.lang.String r0 = r3.zzm
            java.lang.String r2 = "audio/raw"
            boolean r0 = r2.equals(r0)
            r2 = 8
            r5 = -1
            if (r0 == 0) goto L_0x0098
            int r0 = r3.zzB
            boolean r0 = com.google.android.gms.internal.ads.zzfk.zzF(r0)
            com.google.android.gms.internal.ads.zzdx.zzd(r0)
            int r0 = r3.zzB
            int r6 = r3.zzz
            int r0 = com.google.android.gms.internal.ads.zzfk.zzl(r0, r6)
            com.google.android.gms.internal.ads.zzfvp r6 = new com.google.android.gms.internal.ads.zzfvp
            r6.<init>()
            com.google.android.gms.internal.ads.zzfvs r7 = r1.zzf
            r6.zzh(r7)
            com.google.android.gms.internal.ads.zzpy r7 = r1.zzY
            com.google.android.gms.internal.ads.zzdq[] r7 = r7.zze()
            r6.zzg(r7)
            com.google.android.gms.internal.ads.zzdn r7 = new com.google.android.gms.internal.ads.zzdn
            com.google.android.gms.internal.ads.zzfvs r6 = r6.zzi()
            r7.<init>(r6)
            com.google.android.gms.internal.ads.zzdn r6 = r1.zzs
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L_0x0048
            com.google.android.gms.internal.ads.zzdn r7 = r1.zzs
        L_0x0048:
            com.google.android.gms.internal.ads.zzqs r6 = r1.zze
            int r8 = r3.zzC
            int r9 = r3.zzD
            r6.zzq(r8, r9)
            int r6 = com.google.android.gms.internal.ads.zzfk.zza
            r8 = 21
            if (r6 >= r8) goto L_0x0068
            int r6 = r3.zzz
            if (r6 != r2) goto L_0x0068
            if (r21 != 0) goto L_0x0068
            r6 = 6
            int[] r8 = new int[r6]
            r9 = 0
        L_0x0061:
            if (r9 >= r6) goto L_0x006a
            r8[r9] = r9
            int r9 = r9 + 1
            goto L_0x0061
        L_0x0068:
            r8 = r21
        L_0x006a:
            com.google.android.gms.internal.ads.zzpn r6 = r1.zzd
            r6.zzo(r8)
            com.google.android.gms.internal.ads.zzdo r6 = new com.google.android.gms.internal.ads.zzdo
            int r8 = r3.zzA
            int r9 = r3.zzz
            int r10 = r3.zzB
            r6.<init>(r8, r9, r10)
            com.google.android.gms.internal.ads.zzdo r6 = r7.zza(r6)     // Catch:{ zzdp -> 0x0090 }
            int r8 = r6.zzd
            int r9 = r6.zzb
            int r6 = r6.zzc
            int r10 = com.google.android.gms.internal.ads.zzfk.zzg(r6)
            int r6 = com.google.android.gms.internal.ads.zzfk.zzl(r8, r6)
            r11 = r7
            r7 = r9
            r9 = 0
            goto L_0x00c3
        L_0x0090:
            r0 = move-exception
            r2 = r0
            com.google.android.gms.internal.ads.zzpd r0 = new com.google.android.gms.internal.ads.zzpd
            r0.<init>((java.lang.Throwable) r2, (com.google.android.gms.internal.ads.zzam) r3)
            throw r0
        L_0x0098:
            com.google.android.gms.internal.ads.zzdn r0 = new com.google.android.gms.internal.ads.zzdn
            com.google.android.gms.internal.ads.zzfvs r6 = com.google.android.gms.internal.ads.zzfvs.zzl()
            r0.<init>(r6)
            int r6 = r3.zzA
            com.google.android.gms.internal.ads.zzoq r7 = com.google.android.gms.internal.ads.zzoq.zza
            com.google.android.gms.internal.ads.zzon r7 = r1.zzu
            android.util.Pair r7 = r7.zza(r3)
            if (r7 == 0) goto L_0x01aa
            java.lang.Object r8 = r7.first
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            java.lang.Object r7 = r7.second
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r9 = 2
            r11 = r0
            r10 = r7
            r0 = -1
            r7 = r6
            r6 = -1
        L_0x00c3:
            java.lang.String r12 = ") for: "
            if (r8 == 0) goto L_0x0189
            if (r10 == 0) goto L_0x0168
            int r12 = android.media.AudioTrack.getMinBufferSize(r7, r10, r8)
            r13 = -2
            r14 = 1
            if (r12 == r13) goto L_0x00d3
            r13 = 1
            goto L_0x00d4
        L_0x00d3:
            r13 = 0
        L_0x00d4:
            com.google.android.gms.internal.ads.zzdx.zzf(r13)
            if (r6 == r5) goto L_0x00db
            r13 = r6
            goto L_0x00dc
        L_0x00db:
            r13 = 1
        L_0x00dc:
            int r15 = r3.zzi
            r4 = 250000(0x3d090, float:3.50325E-40)
            if (r9 == 0) goto L_0x0120
            r16 = 1000000(0xf4240, double:4.940656E-318)
            if (r9 == r14) goto L_0x010d
            r14 = 5
            if (r8 != r14) goto L_0x00f0
            r4 = 500000(0x7a120, float:7.00649E-40)
            r8 = 5
            goto L_0x00f1
        L_0x00f0:
            r14 = r8
        L_0x00f1:
            if (r15 == r5) goto L_0x00fa
            java.math.RoundingMode r8 = java.math.RoundingMode.CEILING
            int r2 = com.google.android.gms.internal.ads.zzfxy.zza(r15, r2, r8)
            goto L_0x00fe
        L_0x00fa:
            int r2 = com.google.android.gms.internal.ads.zzqk.zzb(r8)
        L_0x00fe:
            r21 = r6
            long r5 = (long) r4
            r4 = r14
            long r14 = (long) r2
            long r5 = r5 * r14
            long r5 = r5 / r16
            int r2 = com.google.android.gms.internal.ads.zzfya.zza(r5)
            r14 = r4
            goto L_0x0138
        L_0x010d:
            r21 = r6
            int r2 = com.google.android.gms.internal.ads.zzqk.zzb(r8)
            long r4 = (long) r2
            r14 = 50000000(0x2faf080, double:2.47032823E-316)
            long r4 = r4 * r14
            long r4 = r4 / r16
            int r2 = com.google.android.gms.internal.ads.zzfya.zza(r4)
            goto L_0x0137
        L_0x0120:
            r21 = r6
            int r2 = r12 * 4
            int r4 = com.google.android.gms.internal.ads.zzqk.zza(r4, r7, r13)
            r5 = 750000(0xb71b0, float:1.050974E-39)
            int r5 = com.google.android.gms.internal.ads.zzqk.zza(r5, r7, r13)
            int r2 = java.lang.Math.min(r2, r5)
            int r2 = java.lang.Math.max(r4, r2)
        L_0x0137:
            r14 = r8
        L_0x0138:
            double r4 = (double) r2
            int r2 = (int) r4
            int r2 = java.lang.Math.max(r12, r2)
            int r2 = r2 + r13
            r4 = -1
            int r2 = r2 + r4
            int r2 = r2 / r13
            int r12 = r2 * r13
            r2 = 0
            r1.zzW = r2
            com.google.android.gms.internal.ads.zzpx r15 = new com.google.android.gms.internal.ads.zzpx
            r13 = 0
            r16 = 0
            r2 = r15
            r3 = r19
            r4 = r0
            r5 = r9
            r6 = r21
            r8 = r10
            r9 = r14
            r10 = r12
            r12 = r13
            r13 = r16
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            boolean r0 = r18.zzS()
            if (r0 == 0) goto L_0x0165
            r1.zzq = r15
            return
        L_0x0165:
            r1.zzr = r15
            return
        L_0x0168:
            com.google.android.gms.internal.ads.zzpd r0 = new com.google.android.gms.internal.ads.zzpd
            java.lang.String r2 = java.lang.String.valueOf(r19)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Invalid output channel config (mode="
            r4.append(r5)
            r4.append(r9)
            r4.append(r12)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r0.<init>((java.lang.String) r2, (com.google.android.gms.internal.ads.zzam) r3)
            throw r0
        L_0x0189:
            com.google.android.gms.internal.ads.zzpd r0 = new com.google.android.gms.internal.ads.zzpd
            java.lang.String r2 = java.lang.String.valueOf(r19)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Invalid output encoding (mode="
            r4.append(r5)
            r4.append(r9)
            r4.append(r12)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r0.<init>((java.lang.String) r2, (com.google.android.gms.internal.ads.zzam) r3)
            throw r0
        L_0x01aa:
            com.google.android.gms.internal.ads.zzpd r0 = new com.google.android.gms.internal.ads.zzpd
            java.lang.String r2 = java.lang.String.valueOf(r19)
            java.lang.String r4 = "Unable to configure passthrough for: "
            java.lang.String r2 = r4.concat(r2)
            r0.<init>((java.lang.String) r2, (com.google.android.gms.internal.ads.zzam) r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzqi.zze(com.google.android.gms.internal.ads.zzam, int, int[]):void");
    }

    public final void zzf() {
        if (zzS()) {
            this.zzA = 0;
            this.zzB = 0;
            this.zzC = 0;
            this.zzD = 0;
            this.zzX = false;
            this.zzE = 0;
            this.zzx = new zzqa(this.zzy, 0, 0, (zzpz) null);
            this.zzH = 0;
            this.zzw = null;
            this.zzj.clear();
            this.zzJ = null;
            this.zzK = 0;
            this.zzL = null;
            this.zzP = false;
            this.zzO = false;
            this.zze.zzp();
            zzP();
            if (this.zzi.zzi()) {
                this.zzt.pause();
            }
            if (zzT(this.zzt)) {
                zzqg zzqg = this.zzk;
                Objects.requireNonNull(zzqg);
                zzqg.zzb(this.zzt);
            }
            if (zzfk.zza < 21 && !this.zzR) {
                this.zzS = 0;
            }
            zzpx zzpx = this.zzq;
            if (zzpx != null) {
                this.zzr = zzpx;
                this.zzq = null;
            }
            this.zzi.zzd();
            AudioTrack audioTrack = this.zzt;
            zzea zzea = this.zzh;
            zzea.zzc();
            synchronized (zza) {
                if (zzb == null) {
                    zzb = zzfk.zzC("ExoPlayer:AudioTrackReleaseThread");
                }
                zzc++;
                zzb.execute(new zzpr(audioTrack, zzea));
            }
            this.zzt = null;
        }
        this.zzm.zza();
        this.zzl.zza();
    }

    public final void zzg() {
        this.zzF = true;
    }

    public final void zzh() {
        this.zzQ = false;
        if (zzS() && this.zzi.zzl()) {
            this.zzt.pause();
        }
    }

    public final void zzi() {
        this.zzQ = true;
        if (zzS()) {
            this.zzi.zzg();
            this.zzt.play();
        }
    }

    public final void zzj() {
        if (!this.zzO && zzS() && zzR()) {
            zzL();
            this.zzO = true;
        }
    }

    public final void zzk() {
        zzf();
        zzfvs zzfvs = this.zzf;
        int size = zzfvs.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((zzdq) zzfvs.get(i10)).zzf();
        }
        zzfvs zzfvs2 = this.zzg;
        int size2 = zzfvs2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            ((zzdq) zzfvs2.get(i11)).zzf();
        }
        zzdn zzdn = this.zzs;
        if (zzdn != null) {
            zzdn.zzf();
        }
        this.zzQ = false;
        this.zzW = false;
    }

    public final void zzl(zzk zzk2) {
        if (!this.zzv.equals(zzk2)) {
            this.zzv = zzk2;
            zzf();
        }
    }

    public final void zzm(int i10) {
        if (this.zzS != i10) {
            this.zzS = i10;
            this.zzR = i10 != 0;
            zzf();
        }
    }

    public final void zzn(zzl zzl2) {
        if (!this.zzT.equals(zzl2)) {
            if (this.zzt != null) {
                int i10 = this.zzT.zza;
            }
            this.zzT = zzl2;
        }
    }

    public final void zzo(zzdy zzdy) {
        this.zzi.zzf(zzdy);
    }

    public final void zzp(zzpf zzpf) {
        this.zzp = zzpf;
    }

    public final void zzq(int i10, int i11) {
        AudioTrack audioTrack = this.zzt;
        if (audioTrack != null) {
            zzT(audioTrack);
        }
    }

    public final void zzr(zzcg zzcg) {
        this.zzy = new zzcg(Math.max(0.1f, Math.min(zzcg.zzc, 8.0f)), Math.max(0.1f, Math.min(zzcg.zzd, 8.0f)));
        zzN(zzcg);
    }

    public final void zzs(zzol zzol) {
        this.zzo = zzol;
    }

    public final void zzt(AudioDeviceInfo audioDeviceInfo) {
        zzpu zzpu;
        if (audioDeviceInfo == null) {
            zzpu = null;
        } else {
            zzpu = new zzpu(audioDeviceInfo);
        }
        this.zzU = zzpu;
        AudioTrack audioTrack = this.zzt;
        if (audioTrack != null) {
            zzps.zza(audioTrack, zzpu);
        }
    }

    public final void zzu(boolean z10) {
        this.zzz = z10;
        zzN(this.zzy);
    }

    public final void zzv(float f10) {
        if (this.zzI != f10) {
            this.zzI = f10;
            zzO();
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(9:41|42|43|44|(3:46|47|48)|185|186|(0)|189) */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x020c, code lost:
        r0 = 1024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x021d, code lost:
        r10 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x02b5, code lost:
        r1.zzE = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x02b7, code lost:
        if (r0 == 0) goto L_0x02ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x02ba, code lost:
        return r10;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:185:0x0396 */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x039e A[Catch:{ zzpe -> 0x0084, zzpe -> 0x03a2 }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:49:0x00c0=Splitter:B:49:0x00c0, B:185:0x0396=Splitter:B:185:0x0396} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean zzw(java.nio.ByteBuffer r27, long r28, int r30) {
        /*
            r26 = this;
            r1 = r26
            r2 = r27
            r3 = r28
            r5 = r30
            java.nio.ByteBuffer r0 = r1.zzJ
            r7 = 0
            if (r0 == 0) goto L_0x0012
            if (r2 != r0) goto L_0x0010
            goto L_0x0012
        L_0x0010:
            r0 = 0
            goto L_0x0013
        L_0x0012:
            r0 = 1
        L_0x0013:
            com.google.android.gms.internal.ads.zzdx.zzd(r0)
            com.google.android.gms.internal.ads.zzpx r0 = r1.zzq
            r8 = 0
            if (r0 == 0) goto L_0x0067
            boolean r0 = r26.zzR()
            if (r0 != 0) goto L_0x0022
            return r7
        L_0x0022:
            com.google.android.gms.internal.ads.zzpx r0 = r1.zzq
            com.google.android.gms.internal.ads.zzpx r9 = r1.zzr
            int r10 = r9.zzc
            int r11 = r0.zzc
            if (r10 != r11) goto L_0x0057
            int r10 = r9.zzg
            int r11 = r0.zzg
            if (r10 != r11) goto L_0x0057
            int r10 = r9.zze
            int r11 = r0.zze
            if (r10 != r11) goto L_0x0057
            int r10 = r9.zzf
            int r11 = r0.zzf
            if (r10 != r11) goto L_0x0057
            int r9 = r9.zzd
            int r10 = r0.zzd
            if (r9 != r10) goto L_0x0057
            r1.zzr = r0
            r1.zzq = r8
            android.media.AudioTrack r0 = r1.zzt
            if (r0 == 0) goto L_0x0064
            boolean r0 = zzT(r0)
            if (r0 == 0) goto L_0x0064
            com.google.android.gms.internal.ads.zzpx r0 = r1.zzr
            boolean r0 = r0.zzk
            goto L_0x0064
        L_0x0057:
            r26.zzL()
            boolean r0 = r26.zzx()
            if (r0 == 0) goto L_0x0061
            return r7
        L_0x0061:
            r26.zzf()
        L_0x0064:
            r1.zzK(r3)
        L_0x0067:
            boolean r0 = r26.zzS()
            r9 = 31
            if (r0 == 0) goto L_0x0071
            goto L_0x0121
        L_0x0071:
            com.google.android.gms.internal.ads.zzea r0 = r1.zzh     // Catch:{ zzpe -> 0x03a2 }
            boolean r0 = r0.zzd()     // Catch:{ zzpe -> 0x03a2 }
            if (r0 != 0) goto L_0x007a
            return r7
        L_0x007a:
            com.google.android.gms.internal.ads.zzpx r0 = r1.zzr     // Catch:{ zzpe -> 0x0084 }
            java.util.Objects.requireNonNull(r0)
            android.media.AudioTrack r0 = r1.zzJ(r0)     // Catch:{ zzpe -> 0x0084 }
            goto L_0x00c0
        L_0x0084:
            r0 = move-exception
            r11 = r0
            com.google.android.gms.internal.ads.zzpx r0 = r1.zzr     // Catch:{ zzpe -> 0x03a2 }
            int r12 = r0.zzh     // Catch:{ zzpe -> 0x03a2 }
            r13 = 1000000(0xf4240, float:1.401298E-39)
            if (r12 <= r13) goto L_0x0396
            com.google.android.gms.internal.ads.zzpx r12 = new com.google.android.gms.internal.ads.zzpx     // Catch:{ zzpe -> 0x03a2 }
            com.google.android.gms.internal.ads.zzam r15 = r0.zza     // Catch:{ zzpe -> 0x03a2 }
            int r13 = r0.zzb     // Catch:{ zzpe -> 0x03a2 }
            int r14 = r0.zzc     // Catch:{ zzpe -> 0x03a2 }
            int r8 = r0.zzd     // Catch:{ zzpe -> 0x03a2 }
            int r7 = r0.zze     // Catch:{ zzpe -> 0x03a2 }
            int r6 = r0.zzf     // Catch:{ zzpe -> 0x03a2 }
            int r10 = r0.zzg     // Catch:{ zzpe -> 0x03a2 }
            r22 = 1000000(0xf4240, float:1.401298E-39)
            com.google.android.gms.internal.ads.zzdn r0 = r0.zzi     // Catch:{ zzpe -> 0x03a2 }
            r24 = 0
            r25 = 0
            r17 = r14
            r14 = r12
            r16 = r13
            r18 = r8
            r19 = r7
            r20 = r6
            r21 = r10
            r23 = r0
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)     // Catch:{ zzpe -> 0x03a2 }
            android.media.AudioTrack r0 = r1.zzJ(r12)     // Catch:{ zzpe -> 0x037e }
            r1.zzr = r12     // Catch:{ zzpe -> 0x037e }
        L_0x00c0:
            r1.zzt = r0     // Catch:{ zzpe -> 0x03a2 }
            boolean r0 = zzT(r0)     // Catch:{ zzpe -> 0x03a2 }
            if (r0 == 0) goto L_0x00de
            android.media.AudioTrack r0 = r1.zzt     // Catch:{ zzpe -> 0x03a2 }
            com.google.android.gms.internal.ads.zzqg r6 = r1.zzk     // Catch:{ zzpe -> 0x03a2 }
            if (r6 != 0) goto L_0x00d5
            com.google.android.gms.internal.ads.zzqg r6 = new com.google.android.gms.internal.ads.zzqg     // Catch:{ zzpe -> 0x03a2 }
            r6.<init>(r1)     // Catch:{ zzpe -> 0x03a2 }
            r1.zzk = r6     // Catch:{ zzpe -> 0x03a2 }
        L_0x00d5:
            com.google.android.gms.internal.ads.zzqg r6 = r1.zzk     // Catch:{ zzpe -> 0x03a2 }
            r6.zza(r0)     // Catch:{ zzpe -> 0x03a2 }
            com.google.android.gms.internal.ads.zzpx r0 = r1.zzr     // Catch:{ zzpe -> 0x03a2 }
            boolean r0 = r0.zzk     // Catch:{ zzpe -> 0x03a2 }
        L_0x00de:
            int r0 = com.google.android.gms.internal.ads.zzfk.zza     // Catch:{ zzpe -> 0x03a2 }
            if (r0 < r9) goto L_0x00eb
            com.google.android.gms.internal.ads.zzol r6 = r1.zzo     // Catch:{ zzpe -> 0x03a2 }
            if (r6 == 0) goto L_0x00eb
            android.media.AudioTrack r7 = r1.zzt     // Catch:{ zzpe -> 0x03a2 }
            com.google.android.gms.internal.ads.zzpt.zza(r7, r6)     // Catch:{ zzpe -> 0x03a2 }
        L_0x00eb:
            android.media.AudioTrack r6 = r1.zzt     // Catch:{ zzpe -> 0x03a2 }
            int r6 = r6.getAudioSessionId()     // Catch:{ zzpe -> 0x03a2 }
            r1.zzS = r6     // Catch:{ zzpe -> 0x03a2 }
            com.google.android.gms.internal.ads.zzpm r10 = r1.zzi     // Catch:{ zzpe -> 0x03a2 }
            android.media.AudioTrack r11 = r1.zzt     // Catch:{ zzpe -> 0x03a2 }
            com.google.android.gms.internal.ads.zzpx r6 = r1.zzr     // Catch:{ zzpe -> 0x03a2 }
            int r7 = r6.zzc     // Catch:{ zzpe -> 0x03a2 }
            r8 = 2
            if (r7 != r8) goto L_0x0100
            r12 = 1
            goto L_0x0101
        L_0x0100:
            r12 = 0
        L_0x0101:
            int r13 = r6.zzg     // Catch:{ zzpe -> 0x03a2 }
            int r14 = r6.zzd     // Catch:{ zzpe -> 0x03a2 }
            int r15 = r6.zzh     // Catch:{ zzpe -> 0x03a2 }
            r10.zze(r11, r12, r13, r14, r15)     // Catch:{ zzpe -> 0x03a2 }
            r26.zzO()     // Catch:{ zzpe -> 0x03a2 }
            com.google.android.gms.internal.ads.zzl r6 = r1.zzT     // Catch:{ zzpe -> 0x03a2 }
            int r6 = r6.zza     // Catch:{ zzpe -> 0x03a2 }
            com.google.android.gms.internal.ads.zzpu r6 = r1.zzU     // Catch:{ zzpe -> 0x03a2 }
            if (r6 == 0) goto L_0x011e
            r7 = 23
            if (r0 < r7) goto L_0x011e
            android.media.AudioTrack r0 = r1.zzt     // Catch:{ zzpe -> 0x03a2 }
            com.google.android.gms.internal.ads.zzps.zza(r0, r6)     // Catch:{ zzpe -> 0x03a2 }
        L_0x011e:
            r6 = 1
            r1.zzG = r6     // Catch:{ zzpe -> 0x03a2 }
        L_0x0121:
            com.google.android.gms.internal.ads.zzqb r0 = r1.zzl
            r0.zza()
            boolean r0 = r1.zzG
            r6 = 0
            if (r0 == 0) goto L_0x0141
            long r10 = java.lang.Math.max(r6, r3)
            r1.zzH = r10
            r8 = 0
            r1.zzF = r8
            r1.zzG = r8
            r1.zzK(r3)
            boolean r0 = r1.zzQ
            if (r0 == 0) goto L_0x0141
            r26.zzi()
        L_0x0141:
            com.google.android.gms.internal.ads.zzpm r0 = r1.zzi
            long r10 = r26.zzI()
            boolean r0 = r0.zzk(r10)
            if (r0 != 0) goto L_0x014f
            r8 = 0
            return r8
        L_0x014f:
            java.nio.ByteBuffer r0 = r1.zzJ
            if (r0 != 0) goto L_0x0351
            java.nio.ByteOrder r0 = r27.order()
            java.nio.ByteOrder r8 = java.nio.ByteOrder.LITTLE_ENDIAN
            if (r0 != r8) goto L_0x015d
            r0 = 1
            goto L_0x015e
        L_0x015d:
            r0 = 0
        L_0x015e:
            com.google.android.gms.internal.ads.zzdx.zzd(r0)
            boolean r0 = r27.hasRemaining()
            if (r0 != 0) goto L_0x0169
            r8 = 1
            return r8
        L_0x0169:
            com.google.android.gms.internal.ads.zzpx r0 = r1.zzr
            int r8 = r0.zzc
            if (r8 == 0) goto L_0x02bb
            int r8 = r1.zzE
            if (r8 != 0) goto L_0x02bb
            int r0 = r0.zzg
            r8 = -2
            r10 = 16
            r11 = 1024(0x400, float:1.435E-42)
            r12 = -1
            switch(r0) {
                case 5: goto L_0x02b0;
                case 6: goto L_0x02b0;
                case 7: goto L_0x0226;
                case 8: goto L_0x0226;
                case 9: goto L_0x020f;
                case 10: goto L_0x020c;
                case 11: goto L_0x0209;
                case 12: goto L_0x0209;
                case 13: goto L_0x017e;
                case 14: goto L_0x01b9;
                case 15: goto L_0x01b6;
                case 16: goto L_0x020c;
                case 17: goto L_0x019b;
                case 18: goto L_0x02b0;
                case 19: goto L_0x017e;
                case 20: goto L_0x0195;
                default: goto L_0x017e;
            }
        L_0x017e:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Unexpected audio encoding: "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
        L_0x0195:
            int r0 = com.google.android.gms.internal.ads.zzaci.zzb(r27)
            goto L_0x021d
        L_0x019b:
            int r0 = com.google.android.gms.internal.ads.zzaaq.zza
            byte[] r0 = new byte[r10]
            int r8 = r27.position()
            r2.get(r0)
            r2.position(r8)
            com.google.android.gms.internal.ads.zzfa r8 = new com.google.android.gms.internal.ads.zzfa
            r8.<init>(r0, r10)
            com.google.android.gms.internal.ads.zzaap r0 = com.google.android.gms.internal.ads.zzaaq.zza(r8)
            int r0 = r0.zzc
            goto L_0x021d
        L_0x01b6:
            r0 = 512(0x200, float:7.175E-43)
            goto L_0x021d
        L_0x01b9:
            int r0 = com.google.android.gms.internal.ads.zzaan.zza
            int r0 = r27.position()
            int r9 = r27.limit()
            int r9 = r9 + -10
            r11 = r0
        L_0x01c6:
            if (r11 > r9) goto L_0x01d9
            int r13 = r11 + 4
            int r13 = com.google.android.gms.internal.ads.zzfk.zzh(r2, r13)
            r13 = r13 & r8
            r14 = -126718022(0xfffffffff8726fba, float:-1.966878E34)
            if (r13 != r14) goto L_0x01d6
            int r11 = r11 - r0
            goto L_0x01da
        L_0x01d6:
            int r11 = r11 + 1
            goto L_0x01c6
        L_0x01d9:
            r11 = -1
        L_0x01da:
            if (r11 != r12) goto L_0x01de
            r0 = 0
            goto L_0x021d
        L_0x01de:
            int r0 = r27.position()
            int r0 = r0 + r11
            int r0 = r0 + 7
            byte r0 = r2.get(r0)
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r8 = r27.position()
            int r8 = r8 + r11
            r9 = 187(0xbb, float:2.62E-43)
            if (r0 != r9) goto L_0x01f7
            r0 = 9
            goto L_0x01f9
        L_0x01f7:
            r0 = 8
        L_0x01f9:
            r9 = 40
            int r8 = r8 + r0
            byte r0 = r2.get(r8)
            int r0 = r0 >> 4
            r0 = r0 & 7
            int r0 = r9 << r0
            int r0 = r0 * 16
            goto L_0x021d
        L_0x0209:
            r0 = 2048(0x800, float:2.87E-42)
            goto L_0x021d
        L_0x020c:
            r0 = 1024(0x400, float:1.435E-42)
            goto L_0x021d
        L_0x020f:
            int r0 = r27.position()
            int r0 = com.google.android.gms.internal.ads.zzfk.zzh(r2, r0)
            int r0 = com.google.android.gms.internal.ads.zzach.zzc(r0)
            if (r0 == r12) goto L_0x0220
        L_0x021d:
            r10 = 1
            goto L_0x02b5
        L_0x0220:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
        L_0x0226:
            int r0 = com.google.android.gms.internal.ads.zzabj.zza
            r10 = 0
            int r0 = r2.getInt(r10)
            r13 = -233094848(0xfffffffff21b4140, float:-3.0751398E30)
            if (r0 == r13) goto L_0x02ac
            int r0 = r2.getInt(r10)
            r13 = -398277519(0xffffffffe842c471, float:-3.6790512E24)
            if (r0 != r13) goto L_0x023c
            goto L_0x020c
        L_0x023c:
            int r0 = r2.getInt(r10)
            r10 = 622876772(0x25205864, float:1.3907736E-16)
            if (r0 != r10) goto L_0x0248
            r0 = 4096(0x1000, float:5.74E-42)
            goto L_0x021d
        L_0x0248:
            int r0 = r27.position()
            byte r10 = r2.get(r0)
            if (r10 == r8) goto L_0x0293
            if (r10 == r12) goto L_0x027c
            if (r10 == r9) goto L_0x026a
            int r8 = r0 + 4
            int r0 = r0 + 5
            byte r8 = r2.get(r8)
            r9 = 1
            r8 = r8 & r9
            int r8 = r8 << 6
            byte r0 = r2.get(r0)
            r0 = r0 & 252(0xfc, float:3.53E-43)
            r9 = 2
            goto L_0x028f
        L_0x026a:
            r9 = 2
            int r8 = r0 + 5
            byte r8 = r2.get(r8)
            r8 = r8 & 7
            int r8 = r8 << 4
            int r0 = r0 + 6
            byte r0 = r2.get(r0)
            goto L_0x028d
        L_0x027c:
            r9 = 2
            int r8 = r0 + 4
            byte r8 = r2.get(r8)
            r8 = r8 & 7
            int r8 = r8 << 4
            int r0 = r0 + 7
            byte r0 = r2.get(r0)
        L_0x028d:
            r0 = r0 & 60
        L_0x028f:
            int r0 = r0 >> r9
            r0 = r0 | r8
            r10 = 1
            goto L_0x02a8
        L_0x0293:
            r9 = 2
            int r8 = r0 + 4
            int r0 = r0 + 5
            byte r0 = r2.get(r0)
            r10 = 1
            r0 = r0 & r10
            int r0 = r0 << 6
            byte r8 = r2.get(r8)
            r8 = r8 & 252(0xfc, float:3.53E-43)
            int r8 = r8 >> r9
            r0 = r0 | r8
        L_0x02a8:
            int r0 = r0 + r10
            int r0 = r0 * 32
            goto L_0x02b5
        L_0x02ac:
            r10 = 1
            r0 = 1024(0x400, float:1.435E-42)
            goto L_0x02b5
        L_0x02b0:
            r10 = 1
            int r0 = com.google.android.gms.internal.ads.zzaan.zza(r27)
        L_0x02b5:
            r1.zzE = r0
            if (r0 == 0) goto L_0x02ba
            goto L_0x02bb
        L_0x02ba:
            return r10
        L_0x02bb:
            com.google.android.gms.internal.ads.zzqa r0 = r1.zzw
            if (r0 == 0) goto L_0x02cd
            boolean r0 = r26.zzR()
            if (r0 != 0) goto L_0x02c7
            r8 = 0
            return r8
        L_0x02c7:
            r1.zzK(r3)
            r8 = 0
            r1.zzw = r8
        L_0x02cd:
            long r8 = r1.zzH
            com.google.android.gms.internal.ads.zzpx r0 = r1.zzr
            long r10 = r26.zzH()
            com.google.android.gms.internal.ads.zzqs r12 = r1.zze
            long r12 = r12.zzo()
            long r10 = r10 - r12
            com.google.android.gms.internal.ads.zzam r0 = r0.zza
            int r0 = r0.zzA
            int r12 = com.google.android.gms.internal.ads.zzfk.zza
            long r12 = (long) r0
            r14 = 1000000(0xf4240, double:4.940656E-318)
            long r10 = r10 * r14
            long r10 = r10 / r12
            long r8 = r8 + r10
            boolean r0 = r1.zzF
            if (r0 != 0) goto L_0x030a
            long r10 = r8 - r3
            long r10 = java.lang.Math.abs(r10)
            r12 = 200000(0x30d40, double:9.8813E-319)
            int r0 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r0 <= 0) goto L_0x030a
            com.google.android.gms.internal.ads.zzpf r0 = r1.zzp
            if (r0 == 0) goto L_0x0307
            com.google.android.gms.internal.ads.zzpg r10 = new com.google.android.gms.internal.ads.zzpg
            r10.<init>(r3, r8)
            r0.zza(r10)
        L_0x0307:
            r10 = 1
            r1.zzF = r10
        L_0x030a:
            boolean r0 = r1.zzF
            if (r0 == 0) goto L_0x0331
            boolean r0 = r26.zzR()
            r10 = 0
            if (r0 != 0) goto L_0x0316
            return r10
        L_0x0316:
            long r8 = r3 - r8
            long r11 = r1.zzH
            long r11 = r11 + r8
            r1.zzH = r11
            r1.zzF = r10
            r1.zzK(r3)
            com.google.android.gms.internal.ads.zzpf r0 = r1.zzp
            if (r0 == 0) goto L_0x0331
            int r10 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r10 == 0) goto L_0x0331
            com.google.android.gms.internal.ads.zzqn r0 = (com.google.android.gms.internal.ads.zzqn) r0
            com.google.android.gms.internal.ads.zzqo r0 = r0.zza
            r0.zzaj()
        L_0x0331:
            com.google.android.gms.internal.ads.zzpx r0 = r1.zzr
            int r0 = r0.zzc
            if (r0 != 0) goto L_0x0342
            long r6 = r1.zzA
            int r0 = r27.remaining()
            long r8 = (long) r0
            long r6 = r6 + r8
            r1.zzA = r6
            goto L_0x034d
        L_0x0342:
            long r6 = r1.zzB
            int r0 = r1.zzE
            long r8 = (long) r0
            long r10 = (long) r5
            long r8 = r8 * r10
            long r6 = r6 + r8
            r1.zzB = r6
        L_0x034d:
            r1.zzJ = r2
            r1.zzK = r5
        L_0x0351:
            r1.zzM(r3)
            java.nio.ByteBuffer r0 = r1.zzJ
            boolean r0 = r0.hasRemaining()
            if (r0 != 0) goto L_0x0364
            r2 = 0
            r1.zzJ = r2
            r2 = 0
            r1.zzK = r2
            r3 = 1
            return r3
        L_0x0364:
            r2 = 0
            r3 = 1
            com.google.android.gms.internal.ads.zzpm r0 = r1.zzi
            long r4 = r26.zzI()
            boolean r0 = r0.zzj(r4)
            if (r0 == 0) goto L_0x037d
            java.lang.String r0 = "DefaultAudioSink"
            java.lang.String r2 = "Resetting stalled audio track"
            com.google.android.gms.internal.ads.zzer.zzf(r0, r2)
            r26.zzf()
            return r3
        L_0x037d:
            return r2
        L_0x037e:
            r0 = move-exception
            java.lang.Class<java.lang.Throwable> r2 = java.lang.Throwable.class
            java.lang.String r3 = "addSuppressed"
            r4 = 1
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch:{ Exception -> 0x0396 }
            java.lang.Class<java.lang.Throwable> r6 = java.lang.Throwable.class
            r7 = 0
            r5[r7] = r6     // Catch:{ Exception -> 0x0396 }
            java.lang.reflect.Method r2 = r2.getDeclaredMethod(r3, r5)     // Catch:{ Exception -> 0x0396 }
            java.lang.Object[] r3 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x0396 }
            r3[r7] = r0     // Catch:{ Exception -> 0x0396 }
            r2.invoke(r11, r3)     // Catch:{ Exception -> 0x0396 }
        L_0x0396:
            com.google.android.gms.internal.ads.zzpx r0 = r1.zzr     // Catch:{ zzpe -> 0x03a2 }
            boolean r0 = r0.zzb()     // Catch:{ zzpe -> 0x03a2 }
            if (r0 == 0) goto L_0x03a1
            r2 = 1
            r1.zzW = r2     // Catch:{ zzpe -> 0x03a2 }
        L_0x03a1:
            throw r11     // Catch:{ zzpe -> 0x03a2 }
        L_0x03a2:
            r0 = move-exception
            boolean r2 = r0.zzb
            if (r2 != 0) goto L_0x03ae
            com.google.android.gms.internal.ads.zzqb r2 = r1.zzl
            r2.zzb(r0)
            r2 = 0
            return r2
        L_0x03ae:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzqi.zzw(java.nio.ByteBuffer, long, int):boolean");
    }

    public final boolean zzx() {
        return zzS() && this.zzi.zzh(zzI());
    }

    public final boolean zzy() {
        return !zzS() || (this.zzO && !zzx());
    }

    public final boolean zzz(zzam zzam) {
        return zza(zzam) != 0;
    }
}
