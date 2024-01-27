package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.MediaFormat;
import android.os.Handler;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzqo extends zzse implements zzkt {
    private final Context zzb;
    /* access modifiers changed from: private */
    public final zzpb zzc;
    private final zzpi zzd;
    private int zze;
    private boolean zzf;
    private zzam zzg;
    private zzam zzh;
    private long zzi;
    private boolean zzj;
    private boolean zzk;
    /* access modifiers changed from: private */
    public zzlq zzl;

    public zzqo(Context context, zzrv zzrv, zzsg zzsg, boolean z10, Handler handler, zzpc zzpc, zzpi zzpi) {
        super(1, zzrv, zzsg, false, 44100.0f);
        this.zzb = context.getApplicationContext();
        this.zzd = zzpi;
        this.zzc = new zzpb(handler, zzpc);
        zzpi.zzp(new zzqn(this, (zzqm) null));
    }

    private final int zzaH(zzrz zzrz, zzam zzam) {
        int i10;
        if (!"OMX.google.raw.decoder".equals(zzrz.zza) || (i10 = zzfk.zza) >= 24 || (i10 == 23 && zzfk.zzH(this.zzb))) {
            return zzam.zzn;
        }
        return -1;
    }

    private static List zzaI(zzsg zzsg, zzam zzam, boolean z10, zzpi zzpi) {
        zzrz zzd2;
        if (zzam.zzm == null) {
            return zzfvs.zzl();
        }
        if (!zzpi.zzz(zzam) || (zzd2 = zzst.zzd()) == null) {
            return zzst.zzh(zzsg, zzam, false, false);
        }
        return zzfvs.zzm(zzd2);
    }

    private final void zzaJ() {
        long zzb2 = this.zzd.zzb(zzT());
        if (zzb2 != Long.MIN_VALUE) {
            if (!this.zzj) {
                zzb2 = Math.max(this.zzi, zzb2);
            }
            this.zzi = zzb2;
            this.zzj = false;
        }
    }

    /* access modifiers changed from: protected */
    public final void zzA() {
        try {
            super.zzA();
            if (this.zzk) {
                this.zzk = false;
                this.zzd.zzk();
            }
        } catch (Throwable th) {
            if (this.zzk) {
                this.zzk = false;
                this.zzd.zzk();
            }
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    public final void zzB() {
        this.zzd.zzi();
    }

    /* access modifiers changed from: protected */
    public final void zzC() {
        zzaJ();
        this.zzd.zzh();
    }

    public final String zzR() {
        return "MediaCodecAudioRenderer";
    }

    public final boolean zzT() {
        return super.zzT() && this.zzd.zzy();
    }

    public final boolean zzU() {
        return this.zzd.zzx() || super.zzU();
    }

    /* access modifiers changed from: protected */
    public final float zzW(float f10, zzam zzam, zzam[] zzamArr) {
        int i10 = -1;
        for (zzam zzam2 : zzamArr) {
            int i11 = zzam2.zzA;
            if (i11 != -1) {
                i10 = Math.max(i10, i11);
            }
        }
        if (i10 == -1) {
            return -1.0f;
        }
        return ((float) i10) * f10;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0077 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0078  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int zzX(com.google.android.gms.internal.ads.zzsg r12, com.google.android.gms.internal.ads.zzam r13) {
        /*
            r11 = this;
            java.lang.String r0 = r13.zzm
            boolean r0 = com.google.android.gms.internal.ads.zzcb.zzf(r0)
            r1 = 128(0x80, float:1.794E-43)
            if (r0 != 0) goto L_0x000b
            return r1
        L_0x000b:
            int r0 = com.google.android.gms.internal.ads.zzfk.zza
            r2 = 21
            r3 = 0
            if (r0 < r2) goto L_0x0015
            r0 = 32
            goto L_0x0016
        L_0x0015:
            r0 = 0
        L_0x0016:
            int r2 = r13.zzH
            boolean r4 = com.google.android.gms.internal.ads.zzse.zzaG(r13)
            r5 = 1
            if (r4 == 0) goto L_0x004f
            if (r2 == 0) goto L_0x0027
            com.google.android.gms.internal.ads.zzrz r2 = com.google.android.gms.internal.ads.zzst.zzd()
            if (r2 == 0) goto L_0x004f
        L_0x0027:
            com.google.android.gms.internal.ads.zzpi r2 = r11.zzd
            com.google.android.gms.internal.ads.zzoq r2 = r2.zzd(r13)
            boolean r6 = r2.zzb
            if (r6 != 0) goto L_0x0033
            r6 = 0
            goto L_0x0042
        L_0x0033:
            boolean r6 = r2.zzc
            if (r5 == r6) goto L_0x003a
            r6 = 512(0x200, float:7.175E-43)
            goto L_0x003c
        L_0x003a:
            r6 = 1536(0x600, float:2.152E-42)
        L_0x003c:
            boolean r2 = r2.zzd
            if (r2 == 0) goto L_0x0042
            r6 = r6 | 2048(0x800, float:2.87E-42)
        L_0x0042:
            com.google.android.gms.internal.ads.zzpi r2 = r11.zzd
            boolean r2 = r2.zzz(r13)
            if (r2 != 0) goto L_0x004b
            goto L_0x0050
        L_0x004b:
            r12 = r0 | 140(0x8c, float:1.96E-43)
        L_0x004d:
            r12 = r12 | r6
            return r12
        L_0x004f:
            r6 = 0
        L_0x0050:
            java.lang.String r2 = r13.zzm
            java.lang.String r7 = "audio/raw"
            boolean r2 = r7.equals(r2)
            r7 = 129(0x81, float:1.81E-43)
            if (r2 == 0) goto L_0x0066
            com.google.android.gms.internal.ads.zzpi r2 = r11.zzd
            boolean r2 = r2.zzz(r13)
            if (r2 == 0) goto L_0x0065
            goto L_0x0066
        L_0x0065:
            return r7
        L_0x0066:
            com.google.android.gms.internal.ads.zzpi r2 = r11.zzd
            r8 = 2
            int r9 = r13.zzz
            int r10 = r13.zzA
            com.google.android.gms.internal.ads.zzam r8 = com.google.android.gms.internal.ads.zzfk.zzx(r8, r9, r10)
            boolean r2 = r2.zzz(r8)
            if (r2 != 0) goto L_0x0078
            return r7
        L_0x0078:
            com.google.android.gms.internal.ads.zzpi r2 = r11.zzd
            java.util.List r12 = zzaI(r12, r13, r3, r2)
            boolean r2 = r12.isEmpty()
            if (r2 == 0) goto L_0x0085
            return r7
        L_0x0085:
            if (r4 != 0) goto L_0x008a
            r12 = 130(0x82, float:1.82E-43)
            return r12
        L_0x008a:
            java.lang.Object r2 = r12.get(r3)
            com.google.android.gms.internal.ads.zzrz r2 = (com.google.android.gms.internal.ads.zzrz) r2
            boolean r4 = r2.zze(r13)
            if (r4 != 0) goto L_0x00b0
            r7 = 1
        L_0x0097:
            int r8 = r12.size()
            if (r7 >= r8) goto L_0x00b0
            java.lang.Object r8 = r12.get(r7)
            com.google.android.gms.internal.ads.zzrz r8 = (com.google.android.gms.internal.ads.zzrz) r8
            boolean r9 = r8.zze(r13)
            if (r9 == 0) goto L_0x00ad
            r2 = r8
            r12 = 0
            r4 = 1
            goto L_0x00b1
        L_0x00ad:
            int r7 = r7 + 1
            goto L_0x0097
        L_0x00b0:
            r12 = 1
        L_0x00b1:
            if (r5 == r4) goto L_0x00b5
            r7 = 3
            goto L_0x00b6
        L_0x00b5:
            r7 = 4
        L_0x00b6:
            r8 = 8
            if (r4 == 0) goto L_0x00c2
            boolean r13 = r2.zzf(r13)
            if (r13 == 0) goto L_0x00c2
            r8 = 16
        L_0x00c2:
            boolean r13 = r2.zzg
            if (r5 == r13) goto L_0x00c8
            r13 = 0
            goto L_0x00ca
        L_0x00c8:
            r13 = 64
        L_0x00ca:
            if (r5 == r12) goto L_0x00cd
            r1 = 0
        L_0x00cd:
            r12 = r7 | r8
            r12 = r12 | r0
            r12 = r12 | r13
            r12 = r12 | r1
            goto L_0x004d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzqo.zzX(com.google.android.gms.internal.ads.zzsg, com.google.android.gms.internal.ads.zzam):int");
    }

    /* access modifiers changed from: protected */
    public final zzie zzY(zzrz zzrz, zzam zzam, zzam zzam2) {
        int i10;
        int i11;
        zzie zzb2 = zzrz.zzb(zzam, zzam2);
        int i12 = zzb2.zze;
        if (zzaE(zzam2)) {
            i12 |= 32768;
        }
        if (zzaH(zzrz, zzam2) > this.zze) {
            i12 |= 64;
        }
        String str = zzrz.zza;
        if (i12 != 0) {
            i10 = i12;
            i11 = 0;
        } else {
            i11 = zzb2.zzd;
            i10 = 0;
        }
        return new zzie(str, zzam, zzam2, i11, i10);
    }

    /* access modifiers changed from: protected */
    public final zzie zzZ(zzkn zzkn) {
        zzam zzam = zzkn.zza;
        Objects.requireNonNull(zzam);
        this.zzg = zzam;
        zzie zzZ = super.zzZ(zzkn);
        this.zzc.zzg(zzam, zzZ);
        return zzZ;
    }

    public final long zza() {
        if (zzbc() == 2) {
            zzaJ();
        }
        return this.zzi;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00a8, code lost:
        if ("AXON 7 mini".equals(r10) == false) goto L_0x00aa;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00fb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.zzru zzac(com.google.android.gms.internal.ads.zzrz r8, com.google.android.gms.internal.ads.zzam r9, android.media.MediaCrypto r10, float r11) {
        /*
            r7 = this;
            com.google.android.gms.internal.ads.zzam[] r10 = r7.zzQ()
            int r0 = r10.length
            int r1 = r7.zzaH(r8, r9)
            r2 = 0
            r3 = 1
            if (r0 != r3) goto L_0x000e
            goto L_0x0026
        L_0x000e:
            r4 = 0
        L_0x000f:
            if (r4 >= r0) goto L_0x0026
            r5 = r10[r4]
            com.google.android.gms.internal.ads.zzie r6 = r8.zzb(r9, r5)
            int r6 = r6.zzd
            if (r6 == 0) goto L_0x0023
            int r5 = r7.zzaH(r8, r5)
            int r1 = java.lang.Math.max(r1, r5)
        L_0x0023:
            int r4 = r4 + 1
            goto L_0x000f
        L_0x0026:
            r7.zze = r1
            java.lang.String r10 = r8.zza
            int r0 = com.google.android.gms.internal.ads.zzfk.zza
            r1 = 24
            if (r0 >= r1) goto L_0x005e
            java.lang.String r4 = "OMX.SEC.aac.dec"
            boolean r10 = r4.equals(r10)
            if (r10 == 0) goto L_0x005e
            java.lang.String r10 = com.google.android.gms.internal.ads.zzfk.zzc
            java.lang.String r4 = "samsung"
            boolean r10 = r4.equals(r10)
            if (r10 == 0) goto L_0x005e
            java.lang.String r10 = com.google.android.gms.internal.ads.zzfk.zzb
            java.lang.String r4 = "zeroflte"
            boolean r4 = r10.startsWith(r4)
            if (r4 != 0) goto L_0x005c
            java.lang.String r4 = "herolte"
            boolean r4 = r10.startsWith(r4)
            if (r4 != 0) goto L_0x005c
            java.lang.String r4 = "heroqlte"
            boolean r10 = r10.startsWith(r4)
            if (r10 == 0) goto L_0x005e
        L_0x005c:
            r10 = 1
            goto L_0x005f
        L_0x005e:
            r10 = 0
        L_0x005f:
            r7.zzf = r10
            java.lang.String r10 = r8.zzc
            int r4 = r7.zze
            android.media.MediaFormat r5 = new android.media.MediaFormat
            r5.<init>()
            java.lang.String r6 = "mime"
            r5.setString(r6, r10)
            int r10 = r9.zzz
            java.lang.String r6 = "channel-count"
            r5.setInteger(r6, r10)
            int r10 = r9.zzA
            java.lang.String r6 = "sample-rate"
            r5.setInteger(r6, r10)
            java.util.List r10 = r9.zzo
            com.google.android.gms.internal.ads.zzeu.zzb(r5, r10)
            java.lang.String r10 = "max-input-size"
            com.google.android.gms.internal.ads.zzeu.zza(r5, r10, r4)
            r10 = 23
            if (r0 < r10) goto L_0x00af
            java.lang.String r4 = "priority"
            r5.setInteger(r4, r2)
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r2 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r2 == 0) goto L_0x00af
            if (r0 != r10) goto L_0x00aa
            java.lang.String r10 = com.google.android.gms.internal.ads.zzfk.zzd
            java.lang.String r2 = "ZTE B2017G"
            boolean r2 = r2.equals(r10)
            if (r2 != 0) goto L_0x00af
            java.lang.String r2 = "AXON 7 mini"
            boolean r10 = r2.equals(r10)
            if (r10 != 0) goto L_0x00af
        L_0x00aa:
            java.lang.String r10 = "operating-rate"
            r5.setFloat(r10, r11)
        L_0x00af:
            r10 = 28
            if (r0 > r10) goto L_0x00c2
            java.lang.String r10 = r9.zzm
            java.lang.String r11 = "audio/ac4"
            boolean r10 = r11.equals(r10)
            if (r10 == 0) goto L_0x00c2
            java.lang.String r10 = "ac4-is-sync"
            r5.setInteger(r10, r3)
        L_0x00c2:
            if (r0 < r1) goto L_0x00db
            com.google.android.gms.internal.ads.zzpi r10 = r7.zzd
            int r11 = r9.zzz
            int r1 = r9.zzA
            r2 = 4
            com.google.android.gms.internal.ads.zzam r11 = com.google.android.gms.internal.ads.zzfk.zzx(r2, r11, r1)
            int r10 = r10.zza(r11)
            r11 = 2
            if (r10 != r11) goto L_0x00db
            java.lang.String r10 = "pcm-encoding"
            r5.setInteger(r10, r2)
        L_0x00db:
            r10 = 32
            if (r0 < r10) goto L_0x00e6
            r10 = 99
            java.lang.String r11 = "max-output-channel-count"
            r5.setInteger(r11, r10)
        L_0x00e6:
            java.lang.String r10 = r8.zzb
            java.lang.String r11 = "audio/raw"
            boolean r10 = r11.equals(r10)
            r0 = 0
            if (r10 == 0) goto L_0x00fb
            java.lang.String r10 = r9.zzm
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x00fb
            r10 = r9
            goto L_0x00fc
        L_0x00fb:
            r10 = r0
        L_0x00fc:
            r7.zzh = r10
            com.google.android.gms.internal.ads.zzru r8 = com.google.android.gms.internal.ads.zzru.zza(r8, r5, r9, r0)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzqo.zzac(com.google.android.gms.internal.ads.zzrz, com.google.android.gms.internal.ads.zzam, android.media.MediaCrypto, float):com.google.android.gms.internal.ads.zzru");
    }

    /* access modifiers changed from: protected */
    public final List zzad(zzsg zzsg, zzam zzam, boolean z10) {
        return zzst.zzi(zzaI(zzsg, zzam, false, this.zzd), zzam);
    }

    /* access modifiers changed from: protected */
    public final void zzae(zzht zzht) {
        zzam zzam;
        if (zzfk.zza >= 29 && (zzam = zzht.zza) != null) {
            String str = zzam.zzm;
            if ((str == "audio/opus" || (str != null && str.equals("audio/opus"))) && zzaD()) {
                ByteBuffer byteBuffer = zzht.zzf;
                Objects.requireNonNull(byteBuffer);
                zzam zzam2 = zzht.zza;
                Objects.requireNonNull(zzam2);
                if (byteBuffer.remaining() == 8) {
                    this.zzd.zzq(zzam2.zzC, (int) ((byteBuffer.order(ByteOrder.LITTLE_ENDIAN).getLong() * 48000) / 1000000000));
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void zzaf(Exception exc) {
        zzer.zzd("MediaCodecAudioRenderer", "Audio codec error", exc);
        this.zzc.zza(exc);
    }

    /* access modifiers changed from: protected */
    public final void zzag(String str, zzru zzru, long j10, long j11) {
        this.zzc.zzc(str, j10, j11);
    }

    /* access modifiers changed from: protected */
    public final void zzah(String str) {
        this.zzc.zzd(str);
    }

    /* access modifiers changed from: protected */
    public final void zzai(zzam zzam, MediaFormat mediaFormat) {
        int i10;
        int i11;
        zzam zzam2 = this.zzh;
        int[] iArr = null;
        if (zzam2 != null) {
            zzam = zzam2;
        } else if (zzar() != null) {
            Objects.requireNonNull(mediaFormat);
            if ("audio/raw".equals(zzam.zzm)) {
                i10 = zzam.zzB;
            } else if (zzfk.zza < 24 || !mediaFormat.containsKey("pcm-encoding")) {
                i10 = mediaFormat.containsKey("v-bits-per-sample") ? zzfk.zzk(mediaFormat.getInteger("v-bits-per-sample")) : 2;
            } else {
                i10 = mediaFormat.getInteger("pcm-encoding");
            }
            zzak zzak = new zzak();
            zzak.zzU("audio/raw");
            zzak.zzP(i10);
            zzak.zzE(zzam.zzC);
            zzak.zzF(zzam.zzD);
            zzak.zzO(zzam.zzk);
            zzak.zzJ(zzam.zzb);
            zzak.zzL(zzam.zzc);
            zzak.zzM(zzam.zzd);
            zzak.zzW(zzam.zze);
            zzak.zzy(mediaFormat.getInteger("channel-count"));
            zzak.zzV(mediaFormat.getInteger("sample-rate"));
            zzam zzac = zzak.zzac();
            if (this.zzf && zzac.zzz == 6 && (i11 = zzam.zzz) < 6) {
                iArr = new int[i11];
                for (int i12 = 0; i12 < zzam.zzz; i12++) {
                    iArr[i12] = i12;
                }
            }
            zzam = zzac;
        }
        try {
            int i13 = zzfk.zza;
            if (i13 >= 29) {
                if (zzaD()) {
                    zzm();
                }
                zzdx.zzf(i13 >= 29);
            }
            this.zzd.zze(zzam, 0, iArr);
        } catch (zzpd e10) {
            throw zzi(e10, e10.zza, false, 5001);
        }
    }

    /* access modifiers changed from: protected */
    public final void zzaj() {
        this.zzj = true;
    }

    /* access modifiers changed from: protected */
    public final void zzak() {
        this.zzd.zzg();
    }

    /* access modifiers changed from: protected */
    public final void zzal() {
        try {
            this.zzd.zzj();
        } catch (zzph e10) {
            throw zzi(e10, e10.zzc, e10.zzb, 5002);
        }
    }

    /* access modifiers changed from: protected */
    public final boolean zzam(long j10, long j11, zzrw zzrw, ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z10, boolean z11, zzam zzam) {
        Objects.requireNonNull(byteBuffer);
        if (this.zzh != null && (i11 & 2) != 0) {
            Objects.requireNonNull(zzrw);
            zzrw.zzn(i10, false);
            return true;
        } else if (z10) {
            if (zzrw != null) {
                zzrw.zzn(i10, false);
            }
            this.zza.zzf += i12;
            this.zzd.zzg();
            return true;
        } else {
            try {
                if (!this.zzd.zzw(byteBuffer, j12, i12)) {
                    return false;
                }
                if (zzrw != null) {
                    zzrw.zzn(i10, false);
                }
                this.zza.zze += i12;
                return true;
            } catch (zzpe e10) {
                throw zzi(e10, this.zzg, e10.zzb, 5001);
            } catch (zzph e11) {
                throw zzi(e11, zzam, e11.zzb, 5002);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final boolean zzan(zzam zzam) {
        zzm();
        return this.zzd.zzz(zzam);
    }

    public final zzcg zzc() {
        return this.zzd.zzc();
    }

    public final void zzg(zzcg zzcg) {
        this.zzd.zzr(zzcg);
    }

    public final zzkt zzk() {
        return this;
    }

    public final void zzt(int i10, Object obj) {
        if (i10 == 2) {
            zzpi zzpi = this.zzd;
            Objects.requireNonNull(obj);
            zzpi.zzv(((Float) obj).floatValue());
        } else if (i10 == 3) {
            zzk zzk2 = (zzk) obj;
            zzpi zzpi2 = this.zzd;
            Objects.requireNonNull(zzk2);
            zzpi2.zzl(zzk2);
        } else if (i10 != 6) {
            switch (i10) {
                case 9:
                    zzpi zzpi3 = this.zzd;
                    Objects.requireNonNull(obj);
                    zzpi3.zzu(((Boolean) obj).booleanValue());
                    return;
                case 10:
                    zzpi zzpi4 = this.zzd;
                    Objects.requireNonNull(obj);
                    zzpi4.zzm(((Integer) obj).intValue());
                    return;
                case 11:
                    this.zzl = (zzlq) obj;
                    return;
                case 12:
                    if (zzfk.zza >= 23) {
                        zzql.zza(this.zzd, obj);
                        return;
                    }
                    return;
                default:
                    return;
            }
        } else {
            zzl zzl2 = (zzl) obj;
            zzpi zzpi5 = this.zzd;
            Objects.requireNonNull(zzl2);
            zzpi5.zzn(zzl2);
        }
    }

    /* access modifiers changed from: protected */
    public final void zzw() {
        this.zzk = true;
        this.zzg = null;
        try {
            this.zzd.zzf();
            try {
                super.zzw();
            } finally {
                this.zzc.zze(this.zza);
            }
        } catch (Throwable th) {
            super.zzw();
            throw th;
        } finally {
            this.zzc.zze(this.zza);
        }
    }

    /* access modifiers changed from: protected */
    public final void zzx(boolean z10, boolean z11) {
        super.zzx(z10, z11);
        this.zzc.zzf(this.zza);
        zzm();
        this.zzd.zzs(zzn());
        this.zzd.zzo(zzh());
    }

    /* access modifiers changed from: protected */
    public final void zzy(long j10, boolean z10) {
        super.zzy(j10, z10);
        this.zzd.zzf();
        this.zzi = j10;
        this.zzj = true;
    }

    /* access modifiers changed from: protected */
    public final void zzz() {
    }
}
