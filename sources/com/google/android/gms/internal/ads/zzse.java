package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public abstract class zzse extends zzic {
    private static final byte[] zzb = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};
    private zzrz zzA;
    private int zzB;
    private boolean zzC;
    private boolean zzD;
    private boolean zzE;
    private boolean zzF;
    private boolean zzG;
    private boolean zzH;
    private boolean zzI;
    private boolean zzJ;
    private boolean zzK;
    private long zzL;
    private int zzM;
    private int zzN;
    private ByteBuffer zzO;
    private boolean zzP;
    private boolean zzQ;
    private boolean zzR;
    private boolean zzS;
    private boolean zzT;
    private boolean zzU;
    private int zzV;
    private int zzW;
    private int zzX;
    private boolean zzY;
    private boolean zzZ;
    protected zzid zza;
    private boolean zzaa;
    private long zzab;
    private long zzac;
    private boolean zzad;
    private boolean zzae;
    private boolean zzaf;
    private zzsd zzag;
    private long zzah;
    private boolean zzai;
    private zzre zzaj;
    private zzre zzak;
    private final zzrv zzc;
    private final zzsg zzd;
    private final float zze;
    private final zzht zzf = new zzht(0, 0);
    private final zzht zzg = new zzht(0, 0);
    private final zzht zzh = new zzht(2, 0);
    private final zzrs zzi;
    private final MediaCodec.BufferInfo zzj;
    private final ArrayDeque zzk;
    private final zzqp zzl;
    private zzam zzm;
    private zzam zzn;
    private MediaCrypto zzo;
    private boolean zzp;
    private long zzq;
    private float zzr;
    private float zzs;
    private zzrw zzt;
    private zzam zzu;
    private MediaFormat zzv;
    private boolean zzw;
    private float zzx;
    private ArrayDeque zzy;
    private zzsc zzz;

    public zzse(int i10, zzrv zzrv, zzsg zzsg, boolean z10, float f10) {
        super(i10);
        this.zzc = zzrv;
        Objects.requireNonNull(zzsg);
        this.zzd = zzsg;
        this.zze = f10;
        zzrs zzrs = new zzrs();
        this.zzi = zzrs;
        this.zzj = new MediaCodec.BufferInfo();
        this.zzr = 1.0f;
        this.zzs = 1.0f;
        this.zzq = -9223372036854775807L;
        this.zzk = new ArrayDeque();
        zzaL(zzsd.zza);
        zzrs.zzi(0);
        zzrs.zzc.order(ByteOrder.nativeOrder());
        this.zzl = new zzqp();
        this.zzx = -1.0f;
        this.zzB = 0;
        this.zzV = 0;
        this.zzM = -1;
        this.zzN = -1;
        this.zzL = -9223372036854775807L;
        this.zzab = -9223372036854775807L;
        this.zzac = -9223372036854775807L;
        this.zzah = -9223372036854775807L;
        this.zzW = 0;
        this.zzX = 0;
    }

    protected static boolean zzaG(zzam zzam) {
        return zzam.zzH == 0;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x0355, code lost:
        if ("stvm8".equals(r5) == false) goto L_0x0368;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x0365, code lost:
        if ("OMX.amlogic.avc.decoder.awesome.secure".equals(r2) == false) goto L_0x0368;
     */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x02fd  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x02ff  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x031e  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x0320  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x032f  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x0331  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x0345  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x0375  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x0377  */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x042e  */
    /* JADX WARNING: Removed duplicated region for block: B:228:0x0457 A[SYNTHETIC, Splitter:B:228:0x0457] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void zzaH(com.google.android.gms.internal.ads.zzrz r21, android.media.MediaCrypto r22) {
        /*
            r20 = this;
            r8 = r20
            r0 = r21
            java.lang.String r1 = "createCodec:"
            java.lang.String r2 = r0.zza
            int r3 = com.google.android.gms.internal.ads.zzfk.zza
            r5 = 23
            if (r3 >= r5) goto L_0x0011
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            goto L_0x001d
        L_0x0011:
            float r6 = r8.zzs
            com.google.android.gms.internal.ads.zzam r7 = r8.zzm
            com.google.android.gms.internal.ads.zzam[] r9 = r20.zzQ()
            float r6 = r8.zzW(r6, r7, r9)
        L_0x001d:
            float r7 = r8.zze
            int r7 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r7 > 0) goto L_0x0025
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x0025:
            com.google.android.gms.internal.ads.zzam r7 = r8.zzm
            r8.zzax(r7)
            r20.zzh()
            long r9 = android.os.SystemClock.elapsedRealtime()
            com.google.android.gms.internal.ads.zzam r7 = r8.zzm
            r11 = 0
            com.google.android.gms.internal.ads.zzru r7 = r8.zzac(r0, r7, r11, r6)
            r12 = 31
            if (r3 < r12) goto L_0x0043
            com.google.android.gms.internal.ads.zzol r13 = r20.zzn()
            com.google.android.gms.internal.ads.zzsb.zza(r7, r13)
        L_0x0043:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ all -> 0x045b }
            r13.<init>()     // Catch:{ all -> 0x045b }
            r13.append(r1)     // Catch:{ all -> 0x045b }
            r13.append(r2)     // Catch:{ all -> 0x045b }
            java.lang.String r13 = r13.toString()     // Catch:{ all -> 0x045b }
            android.os.Trace.beginSection(r13)     // Catch:{ all -> 0x045b }
            r13 = 0
            if (r3 < r5) goto L_0x007b
            if (r3 < r12) goto L_0x007b
            com.google.android.gms.internal.ads.zzam r1 = r7.zzc     // Catch:{ all -> 0x045b }
            java.lang.String r1 = r1.zzm     // Catch:{ all -> 0x045b }
            int r1 = com.google.android.gms.internal.ads.zzcb.zzb(r1)     // Catch:{ all -> 0x045b }
            java.lang.String r3 = "DMCodecAdapterFactory"
            java.lang.String r11 = com.google.android.gms.internal.ads.zzfk.zzA(r1)     // Catch:{ all -> 0x045b }
            java.lang.String r12 = "Creating an asynchronous MediaCodec adapter for track type "
            java.lang.String r11 = r12.concat(r11)     // Catch:{ all -> 0x045b }
            com.google.android.gms.internal.ads.zzer.zze(r3, r11)     // Catch:{ all -> 0x045b }
            com.google.android.gms.internal.ads.zzrj r3 = new com.google.android.gms.internal.ads.zzrj     // Catch:{ all -> 0x045b }
            r3.<init>(r1, r13)     // Catch:{ all -> 0x045b }
            com.google.android.gms.internal.ads.zzrl r1 = r3.zzc(r7)     // Catch:{ all -> 0x045b }
            goto L_0x00b0
        L_0x007b:
            com.google.android.gms.internal.ads.zzrz r3 = r7.zza     // Catch:{ IOException -> 0x0454, RuntimeException -> 0x0452 }
            java.util.Objects.requireNonNull(r3)
            java.lang.String r3 = r3.zza     // Catch:{ IOException -> 0x0454, RuntimeException -> 0x0452 }
            java.lang.String r1 = r1.concat(r3)     // Catch:{ IOException -> 0x0454, RuntimeException -> 0x0452 }
            android.os.Trace.beginSection(r1)     // Catch:{ IOException -> 0x0454, RuntimeException -> 0x0452 }
            android.media.MediaCodec r1 = android.media.MediaCodec.createByCodecName(r3)     // Catch:{ IOException -> 0x0454, RuntimeException -> 0x0452 }
            android.os.Trace.endSection()     // Catch:{ IOException -> 0x0454, RuntimeException -> 0x0452 }
            java.lang.String r3 = "configureCodec"
            android.os.Trace.beginSection(r3)     // Catch:{ IOException -> 0x044f, RuntimeException -> 0x044d }
            android.media.MediaFormat r3 = r7.zzb     // Catch:{ IOException -> 0x044f, RuntimeException -> 0x044d }
            android.view.Surface r12 = r7.zzd     // Catch:{ IOException -> 0x044f, RuntimeException -> 0x044d }
            r1.configure(r3, r12, r11, r13)     // Catch:{ IOException -> 0x044f, RuntimeException -> 0x044d }
            android.os.Trace.endSection()     // Catch:{ IOException -> 0x044f, RuntimeException -> 0x044d }
            java.lang.String r3 = "startCodec"
            android.os.Trace.beginSection(r3)     // Catch:{ IOException -> 0x044f, RuntimeException -> 0x044d }
            r1.start()     // Catch:{ IOException -> 0x044f, RuntimeException -> 0x044d }
            android.os.Trace.endSection()     // Catch:{ IOException -> 0x044f, RuntimeException -> 0x044d }
            com.google.android.gms.internal.ads.zzsv r3 = new com.google.android.gms.internal.ads.zzsv     // Catch:{ IOException -> 0x044f, RuntimeException -> 0x044d }
            r3.<init>(r1, r11)     // Catch:{ IOException -> 0x044f, RuntimeException -> 0x044d }
            r1 = r3
        L_0x00b0:
            r8.zzt = r1     // Catch:{ all -> 0x045b }
            android.os.Trace.endSection()
            r20.zzh()
            long r11 = android.os.SystemClock.elapsedRealtime()
            com.google.android.gms.internal.ads.zzam r1 = r8.zzm
            boolean r1 = r0.zze(r1)
            r3 = 2
            if (r1 != 0) goto L_0x026d
            java.lang.Object[] r1 = new java.lang.Object[r3]
            com.google.android.gms.internal.ads.zzam r15 = r8.zzm
            com.google.android.gms.internal.ads.zzn r16 = com.google.android.gms.internal.ads.zzam.zza
            if (r15 != 0) goto L_0x00d6
            java.lang.String r4 = "null"
            r17 = r7
            r18 = r9
        L_0x00d3:
            r7 = 0
            goto L_0x025a
        L_0x00d6:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r13 = "id="
            r5.append(r13)
            java.lang.String r13 = r15.zzb
            r5.append(r13)
            java.lang.String r13 = ", mimeType="
            r5.append(r13)
            java.lang.String r13 = r15.zzm
            r5.append(r13)
            int r13 = r15.zzi
            r3 = -1
            if (r13 == r3) goto L_0x00fe
            java.lang.String r13 = ", bitrate="
            r5.append(r13)
            int r13 = r15.zzi
            r5.append(r13)
        L_0x00fe:
            java.lang.String r13 = r15.zzj
            if (r13 == 0) goto L_0x010c
            java.lang.String r13 = ", codecs="
            r5.append(r13)
            java.lang.String r13 = r15.zzj
            r5.append(r13)
        L_0x010c:
            com.google.android.gms.internal.ads.zzad r13 = r15.zzp
            java.lang.String r14 = ","
            if (r13 == 0) goto L_0x01a4
            java.util.LinkedHashSet r13 = new java.util.LinkedHashSet
            r13.<init>()
            r4 = 0
        L_0x0118:
            com.google.android.gms.internal.ads.zzad r3 = r15.zzp
            r17 = r7
            int r7 = r3.zzb
            if (r4 >= r7) goto L_0x0194
            com.google.android.gms.internal.ads.zzac r3 = r3.zza(r4)
            java.util.UUID r3 = r3.zza
            java.util.UUID r7 = com.google.android.gms.internal.ads.zzo.zzb
            boolean r7 = r3.equals(r7)
            if (r7 == 0) goto L_0x0136
            java.lang.String r3 = "cenc"
            r13.add(r3)
        L_0x0133:
            r18 = r9
            goto L_0x018d
        L_0x0136:
            java.util.UUID r7 = com.google.android.gms.internal.ads.zzo.zzc
            boolean r7 = r3.equals(r7)
            if (r7 == 0) goto L_0x0144
            java.lang.String r3 = "clearkey"
            r13.add(r3)
            goto L_0x0133
        L_0x0144:
            java.util.UUID r7 = com.google.android.gms.internal.ads.zzo.zze
            boolean r7 = r3.equals(r7)
            if (r7 == 0) goto L_0x0152
            java.lang.String r3 = "playready"
            r13.add(r3)
            goto L_0x0133
        L_0x0152:
            java.util.UUID r7 = com.google.android.gms.internal.ads.zzo.zzd
            boolean r7 = r3.equals(r7)
            if (r7 == 0) goto L_0x0160
            java.lang.String r3 = "widevine"
            r13.add(r3)
            goto L_0x0133
        L_0x0160:
            java.util.UUID r7 = com.google.android.gms.internal.ads.zzo.zza
            boolean r7 = r3.equals(r7)
            if (r7 == 0) goto L_0x016e
            java.lang.String r3 = "universal"
            r13.add(r3)
            goto L_0x0133
        L_0x016e:
            java.lang.String r3 = r3.toString()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r18 = r9
            java.lang.String r9 = "unknown ("
            r7.append(r9)
            r7.append(r3)
            java.lang.String r3 = ")"
            r7.append(r3)
            java.lang.String r3 = r7.toString()
            r13.add(r3)
        L_0x018d:
            int r4 = r4 + 1
            r7 = r17
            r9 = r18
            goto L_0x0118
        L_0x0194:
            r18 = r9
            java.lang.String r3 = ", drm=["
            r5.append(r3)
            com.google.android.gms.internal.ads.zzfsl.zzb(r5, r13, r14)
            r3 = 93
            r5.append(r3)
            goto L_0x01a8
        L_0x01a4:
            r17 = r7
            r18 = r9
        L_0x01a8:
            int r3 = r15.zzr
            r4 = -1
            if (r3 == r4) goto L_0x01c5
            int r3 = r15.zzs
            if (r3 == r4) goto L_0x01c5
            java.lang.String r3 = ", res="
            r5.append(r3)
            int r3 = r15.zzr
            r5.append(r3)
            java.lang.String r3 = "x"
            r5.append(r3)
            int r3 = r15.zzs
            r5.append(r3)
        L_0x01c5:
            com.google.android.gms.internal.ads.zzs r3 = r15.zzy
            if (r3 == 0) goto L_0x01dd
            boolean r3 = r3.zze()
            if (r3 == 0) goto L_0x01dd
            java.lang.String r3 = ", color="
            r5.append(r3)
            com.google.android.gms.internal.ads.zzs r3 = r15.zzy
            java.lang.String r3 = r3.zzd()
            r5.append(r3)
        L_0x01dd:
            float r3 = r15.zzt
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 == 0) goto L_0x01ef
            java.lang.String r3 = ", fps="
            r5.append(r3)
            float r3 = r15.zzt
            r5.append(r3)
        L_0x01ef:
            int r3 = r15.zzz
            r4 = -1
            if (r3 == r4) goto L_0x01fe
            java.lang.String r3 = ", channels="
            r5.append(r3)
            int r3 = r15.zzz
            r5.append(r3)
        L_0x01fe:
            int r3 = r15.zzA
            if (r3 == r4) goto L_0x020c
            java.lang.String r3 = ", sample_rate="
            r5.append(r3)
            int r3 = r15.zzA
            r5.append(r3)
        L_0x020c:
            java.lang.String r3 = r15.zzd
            if (r3 == 0) goto L_0x021a
            java.lang.String r3 = ", language="
            r5.append(r3)
            java.lang.String r3 = r15.zzd
            r5.append(r3)
        L_0x021a:
            java.lang.String r3 = r15.zzc
            if (r3 == 0) goto L_0x0228
            java.lang.String r3 = ", label="
            r5.append(r3)
            java.lang.String r3 = r15.zzc
            r5.append(r3)
        L_0x0228:
            int r3 = r15.zze
            if (r3 == 0) goto L_0x0254
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            int r4 = r15.zze
            r7 = 1
            r4 = r4 & r7
            if (r4 == 0) goto L_0x023c
            java.lang.String r4 = "default"
            r3.add(r4)
        L_0x023c:
            int r4 = r15.zze
            r7 = 2
            r4 = r4 & r7
            if (r4 == 0) goto L_0x0247
            java.lang.String r4 = "forced"
            r3.add(r4)
        L_0x0247:
            java.lang.String r4 = ", selectionFlags=["
            r5.append(r4)
            com.google.android.gms.internal.ads.zzfsl.zzb(r5, r3, r14)
            java.lang.String r3 = "]"
            r5.append(r3)
        L_0x0254:
            java.lang.String r4 = r5.toString()
            goto L_0x00d3
        L_0x025a:
            r1[r7] = r4
            r3 = 1
            r1[r3] = r2
            java.util.Locale r3 = java.util.Locale.US
            java.lang.String r4 = "Format exceeds selected codec's capabilities [%s, %s]"
            java.lang.String r1 = java.lang.String.format(r3, r4, r1)
            java.lang.String r3 = "MediaCodecRenderer"
            com.google.android.gms.internal.ads.zzer.zzf(r3, r1)
            goto L_0x0272
        L_0x026d:
            r17 = r7
            r18 = r9
            r7 = 0
        L_0x0272:
            r8.zzA = r0
            r8.zzx = r6
            com.google.android.gms.internal.ads.zzam r1 = r8.zzm
            r8.zzu = r1
            int r1 = com.google.android.gms.internal.ads.zzfk.zza
            java.lang.String r3 = "OMX.Exynos.avc.dec.secure"
            r4 = 25
            if (r1 > r4) goto L_0x02ac
            boolean r5 = r3.equals(r2)
            if (r5 == 0) goto L_0x02ac
            java.lang.String r5 = com.google.android.gms.internal.ads.zzfk.zzd
            java.lang.String r6 = "SM-T585"
            boolean r6 = r5.startsWith(r6)
            if (r6 != 0) goto L_0x02aa
            java.lang.String r6 = "SM-A510"
            boolean r6 = r5.startsWith(r6)
            if (r6 != 0) goto L_0x02aa
            java.lang.String r6 = "SM-A520"
            boolean r6 = r5.startsWith(r6)
            if (r6 != 0) goto L_0x02aa
            java.lang.String r6 = "SM-J700"
            boolean r5 = r5.startsWith(r6)
            if (r5 == 0) goto L_0x02ac
        L_0x02aa:
            r5 = 2
            goto L_0x02e5
        L_0x02ac:
            r5 = 24
            if (r1 >= r5) goto L_0x02e4
            java.lang.String r5 = "OMX.Nvidia.h264.decode"
            boolean r5 = r5.equals(r2)
            if (r5 != 0) goto L_0x02c0
            java.lang.String r5 = "OMX.Nvidia.h264.decode.secure"
            boolean r5 = r5.equals(r2)
            if (r5 == 0) goto L_0x02e4
        L_0x02c0:
            java.lang.String r5 = com.google.android.gms.internal.ads.zzfk.zzb
            java.lang.String r6 = "flounder"
            boolean r6 = r6.equals(r5)
            if (r6 != 0) goto L_0x02e2
            java.lang.String r6 = "flounder_lte"
            boolean r6 = r6.equals(r5)
            if (r6 != 0) goto L_0x02e2
            java.lang.String r6 = "grouper"
            boolean r6 = r6.equals(r5)
            if (r6 != 0) goto L_0x02e2
            java.lang.String r6 = "tilapia"
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L_0x02e4
        L_0x02e2:
            r5 = 1
            goto L_0x02e5
        L_0x02e4:
            r5 = 0
        L_0x02e5:
            r8.zzB = r5
            com.google.android.gms.internal.ads.zzam r5 = r8.zzu
            r6 = 21
            if (r1 >= r6) goto L_0x02ff
            java.util.List r5 = r5.zzo
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L_0x02ff
            java.lang.String r5 = "OMX.MTK.VIDEO.DECODER.AVC"
            boolean r5 = r5.equals(r2)
            if (r5 == 0) goto L_0x02ff
            r5 = 1
            goto L_0x0300
        L_0x02ff:
            r5 = 0
        L_0x0300:
            r8.zzC = r5
            r5 = 19
            if (r1 != r5) goto L_0x0320
            java.lang.String r9 = com.google.android.gms.internal.ads.zzfk.zzd
            java.lang.String r10 = "SM-G800"
            boolean r9 = r9.startsWith(r10)
            if (r9 == 0) goto L_0x0320
            java.lang.String r9 = "OMX.Exynos.avc.dec"
            boolean r9 = r9.equals(r2)
            if (r9 != 0) goto L_0x031e
            boolean r3 = r3.equals(r2)
            if (r3 == 0) goto L_0x0320
        L_0x031e:
            r3 = 1
            goto L_0x0321
        L_0x0320:
            r3 = 0
        L_0x0321:
            r8.zzD = r3
            r3 = 29
            if (r1 != r3) goto L_0x0331
            java.lang.String r9 = "c2.android.aac.decoder"
            boolean r9 = r9.equals(r2)
            if (r9 == 0) goto L_0x0331
            r9 = 1
            goto L_0x0332
        L_0x0331:
            r9 = 0
        L_0x0332:
            r8.zzE = r9
            r9 = 23
            if (r1 > r9) goto L_0x0343
            java.lang.String r9 = "OMX.google.vorbis.decoder"
            boolean r9 = r9.equals(r2)
            if (r9 != 0) goto L_0x0341
            goto L_0x0343
        L_0x0341:
            r5 = 1
            goto L_0x0369
        L_0x0343:
            if (r1 > r5) goto L_0x0368
            java.lang.String r5 = com.google.android.gms.internal.ads.zzfk.zzb
            java.lang.String r9 = "hb2000"
            boolean r9 = r9.equals(r5)
            if (r9 != 0) goto L_0x0357
            java.lang.String r9 = "stvm8"
            boolean r5 = r9.equals(r5)
            if (r5 == 0) goto L_0x0368
        L_0x0357:
            java.lang.String r5 = "OMX.amlogic.avc.decoder.awesome"
            boolean r5 = r5.equals(r2)
            if (r5 != 0) goto L_0x0341
            java.lang.String r5 = "OMX.amlogic.avc.decoder.awesome.secure"
            boolean r5 = r5.equals(r2)
            if (r5 == 0) goto L_0x0368
            goto L_0x0341
        L_0x0368:
            r5 = 0
        L_0x0369:
            r8.zzF = r5
            if (r1 != r6) goto L_0x0377
            java.lang.String r5 = "OMX.google.aac.decoder"
            boolean r5 = r5.equals(r2)
            if (r5 == 0) goto L_0x0377
            r5 = 1
            goto L_0x0378
        L_0x0377:
            r5 = 0
        L_0x0378:
            r8.zzG = r5
            if (r1 >= r6) goto L_0x03c2
            java.lang.String r5 = "OMX.SEC.mp3.dec"
            boolean r5 = r5.equals(r2)
            if (r5 == 0) goto L_0x03c2
            java.lang.String r5 = com.google.android.gms.internal.ads.zzfk.zzc
            java.lang.String r6 = "samsung"
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L_0x03c2
            java.lang.String r5 = com.google.android.gms.internal.ads.zzfk.zzb
            java.lang.String r6 = "baffin"
            boolean r6 = r5.startsWith(r6)
            if (r6 != 0) goto L_0x03c0
            java.lang.String r6 = "grand"
            boolean r6 = r5.startsWith(r6)
            if (r6 != 0) goto L_0x03c0
            java.lang.String r6 = "fortuna"
            boolean r6 = r5.startsWith(r6)
            if (r6 != 0) goto L_0x03c0
            java.lang.String r6 = "gprimelte"
            boolean r6 = r5.startsWith(r6)
            if (r6 != 0) goto L_0x03c0
            java.lang.String r6 = "j2y18lte"
            boolean r6 = r5.startsWith(r6)
            if (r6 != 0) goto L_0x03c0
            java.lang.String r6 = "ms01"
            boolean r5 = r5.startsWith(r6)
            if (r5 == 0) goto L_0x03c2
        L_0x03c0:
            r5 = 1
            goto L_0x03c3
        L_0x03c2:
            r5 = 0
        L_0x03c3:
            r8.zzH = r5
            java.lang.String r5 = r0.zza
            if (r1 > r4) goto L_0x03d4
            java.lang.String r4 = "OMX.rk.video_decoder.avc"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x03d2
            goto L_0x03d4
        L_0x03d2:
            r13 = 1
            goto L_0x0420
        L_0x03d4:
            if (r1 > r3) goto L_0x0406
            java.lang.String r1 = "OMX.broadcom.video_decoder.tunnel"
            boolean r1 = r1.equals(r5)
            if (r1 != 0) goto L_0x03d2
            java.lang.String r1 = "OMX.broadcom.video_decoder.tunnel.secure"
            boolean r1 = r1.equals(r5)
            if (r1 != 0) goto L_0x03d2
            java.lang.String r1 = "OMX.bcm.vdec.avc.tunnel"
            boolean r1 = r1.equals(r5)
            if (r1 != 0) goto L_0x03d2
            java.lang.String r1 = "OMX.bcm.vdec.avc.tunnel.secure"
            boolean r1 = r1.equals(r5)
            if (r1 != 0) goto L_0x03d2
            java.lang.String r1 = "OMX.bcm.vdec.hevc.tunnel"
            boolean r1 = r1.equals(r5)
            if (r1 != 0) goto L_0x03d2
            java.lang.String r1 = "OMX.bcm.vdec.hevc.tunnel.secure"
            boolean r1 = r1.equals(r5)
            if (r1 != 0) goto L_0x03d2
        L_0x0406:
            java.lang.String r1 = com.google.android.gms.internal.ads.zzfk.zzc
            java.lang.String r3 = "Amazon"
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L_0x041f
            java.lang.String r1 = com.google.android.gms.internal.ads.zzfk.zzd
            java.lang.String r3 = "AFTS"
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L_0x041f
            boolean r0 = r0.zzf
            if (r0 == 0) goto L_0x041f
            goto L_0x03d2
        L_0x041f:
            r13 = 0
        L_0x0420:
            r8.zzK = r13
            com.google.android.gms.internal.ads.zzrw r0 = r8.zzt
            r0.zzr()
            int r0 = r20.zzbc()
            r1 = 2
            if (r0 != r1) goto L_0x043a
            r20.zzh()
            long r0 = android.os.SystemClock.elapsedRealtime()
            r3 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 + r3
            r8.zzL = r0
        L_0x043a:
            com.google.android.gms.internal.ads.zzid r0 = r8.zza
            int r1 = r0.zza
            r3 = 1
            int r1 = r1 + r3
            r0.zza = r1
            long r6 = r11 - r18
            r1 = r20
            r3 = r17
            r4 = r11
            r1.zzag(r2, r3, r4, r6)
            return
        L_0x044d:
            r0 = move-exception
            goto L_0x0450
        L_0x044f:
            r0 = move-exception
        L_0x0450:
            r11 = r1
            goto L_0x0455
        L_0x0452:
            r0 = move-exception
            goto L_0x0455
        L_0x0454:
            r0 = move-exception
        L_0x0455:
            if (r11 == 0) goto L_0x045a
            r11.release()     // Catch:{ all -> 0x045b }
        L_0x045a:
            throw r0     // Catch:{ all -> 0x045b }
        L_0x045b:
            r0 = move-exception
            android.os.Trace.endSection()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzse.zzaH(com.google.android.gms.internal.ads.zzrz, android.media.MediaCrypto):void");
    }

    @TargetApi(23)
    private final void zzaI() {
        int i10 = this.zzX;
        if (i10 == 1) {
            zzaj();
        } else if (i10 == 2) {
            zzaj();
            zzaM();
        } else if (i10 != 3) {
            this.zzae = true;
            zzal();
        } else {
            zzay();
            zzau();
        }
    }

    private final void zzaJ() {
        this.zzM = -1;
        this.zzg.zzc = null;
    }

    private final void zzaK() {
        this.zzN = -1;
        this.zzO = null;
    }

    private final void zzaL(zzsd zzsd) {
        this.zzag = zzsd;
        if (zzsd.zzd != -9223372036854775807L) {
            this.zzai = true;
        }
    }

    private final void zzaM() {
        this.zzaj = this.zzak;
        this.zzW = 0;
        this.zzX = 0;
    }

    @TargetApi(23)
    private final boolean zzaN() {
        if (this.zzY) {
            this.zzW = 1;
            if (this.zzD || this.zzF) {
                this.zzX = 3;
                return false;
            }
            this.zzX = 2;
        } else {
            zzaM();
        }
        return true;
    }

    private final boolean zzaO() {
        zzrw zzrw = this.zzt;
        if (zzrw == null || this.zzW == 2 || this.zzad) {
            return false;
        }
        if (this.zzM < 0) {
            int zza2 = zzrw.zza();
            this.zzM = zza2;
            if (zza2 < 0) {
                return false;
            }
            this.zzg.zzc = this.zzt.zzf(zza2);
            this.zzg.zzb();
        }
        if (this.zzW == 1) {
            if (!this.zzK) {
                this.zzZ = true;
                this.zzt.zzj(this.zzM, 0, 0, 0, 4);
                zzaJ();
            }
            this.zzW = 2;
            return false;
        } else if (this.zzI) {
            this.zzI = false;
            this.zzg.zzc.put(zzb);
            this.zzt.zzj(this.zzM, 0, 38, 0, 0);
            zzaJ();
            this.zzY = true;
            return true;
        } else {
            if (this.zzV == 1) {
                for (int i10 = 0; i10 < this.zzu.zzo.size(); i10++) {
                    this.zzg.zzc.put((byte[]) this.zzu.zzo.get(i10));
                }
                this.zzV = 2;
            }
            int position = this.zzg.zzc.position();
            zzkn zzj2 = zzj();
            try {
                int zzbd = zzbd(zzj2, this.zzg, 0);
                if (zzbd == -3) {
                    if (zzN()) {
                        this.zzac = this.zzab;
                    }
                    return false;
                } else if (zzbd == -5) {
                    if (this.zzV == 2) {
                        this.zzg.zzb();
                        this.zzV = 1;
                    }
                    zzZ(zzj2);
                    return true;
                } else {
                    zzht zzht = this.zzg;
                    if (zzht.zzf()) {
                        this.zzac = this.zzab;
                        if (this.zzV == 2) {
                            zzht.zzb();
                            this.zzV = 1;
                        }
                        this.zzad = true;
                        if (!this.zzY) {
                            zzaI();
                            return false;
                        }
                        try {
                            if (!this.zzK) {
                                this.zzZ = true;
                                this.zzt.zzj(this.zzM, 0, 0, 0, 4);
                                zzaJ();
                            }
                            return false;
                        } catch (MediaCodec.CryptoException e10) {
                            throw zzi(e10, this.zzm, false, zzfk.zzi(e10.getErrorCode()));
                        }
                    } else if (this.zzY || zzht.zzg()) {
                        boolean zzk2 = zzht.zzk();
                        if (zzk2) {
                            zzht.zzb.zzb(position);
                        }
                        if (this.zzC && !zzk2) {
                            ByteBuffer byteBuffer = this.zzg.zzc;
                            byte[] bArr = zzfy.zza;
                            int position2 = byteBuffer.position();
                            int i11 = 0;
                            int i12 = 0;
                            while (true) {
                                int i13 = i11 + 1;
                                if (i13 >= position2) {
                                    byteBuffer.clear();
                                    break;
                                }
                                byte b10 = byteBuffer.get(i11) & 255;
                                if (i12 == 3) {
                                    if (b10 == 1) {
                                        if ((byteBuffer.get(i13) & 31) == 7) {
                                            ByteBuffer duplicate = byteBuffer.duplicate();
                                            duplicate.position(i11 - 3);
                                            duplicate.limit(position2);
                                            byteBuffer.position(0);
                                            byteBuffer.put(duplicate);
                                            break;
                                        }
                                        b10 = 1;
                                    }
                                } else if (b10 == 0) {
                                    i12++;
                                }
                                if (b10 != 0) {
                                    i12 = 0;
                                }
                                i11 = i13;
                            }
                            if (this.zzg.zzc.position() == 0) {
                                return true;
                            }
                            this.zzC = false;
                        }
                        long j10 = this.zzg.zze;
                        if (this.zzaf) {
                            if (!this.zzk.isEmpty()) {
                                ((zzsd) this.zzk.peekLast()).zze.zzd(j10, this.zzm);
                            } else {
                                this.zzag.zze.zzd(j10, this.zzm);
                            }
                            this.zzaf = false;
                        }
                        long max = Math.max(this.zzab, j10);
                        this.zzab = max;
                        if (zzN() || this.zzg.zzh()) {
                            this.zzac = max;
                        }
                        this.zzg.zzj();
                        zzht zzht2 = this.zzg;
                        if (zzht2.zze()) {
                            zzae(zzht2);
                        }
                        zzaw(this.zzg);
                        if (zzk2) {
                            try {
                                this.zzt.zzk(this.zzM, 0, this.zzg.zzb, j10, 0);
                            } catch (MediaCodec.CryptoException e11) {
                                throw zzi(e11, this.zzm, false, zzfk.zzi(e11.getErrorCode()));
                            }
                        } else {
                            this.zzt.zzj(this.zzM, 0, this.zzg.zzc.limit(), j10, 0);
                        }
                        zzaJ();
                        this.zzY = true;
                        this.zzV = 0;
                        this.zza.zzc++;
                        return true;
                    } else {
                        zzht.zzb();
                        if (this.zzV == 2) {
                            this.zzV = 1;
                        }
                        return true;
                    }
                }
            } catch (zzhs e12) {
                zzaf(e12);
                zzaQ(0);
                zzaj();
                return true;
            }
        }
    }

    private final boolean zzaP() {
        return this.zzN >= 0;
    }

    private final boolean zzaQ(int i10) {
        zzht zzht = this.zzf;
        zzkn zzj2 = zzj();
        zzht.zzb();
        int zzbd = zzbd(zzj2, this.zzf, i10 | 4);
        if (zzbd == -5) {
            zzZ(zzj2);
            return true;
        } else if (zzbd != -4 || !this.zzf.zzf()) {
            return false;
        } else {
            this.zzad = true;
            zzaI();
            return false;
        }
    }

    private final boolean zzaR(long j10) {
        if (this.zzq == -9223372036854775807L) {
            return true;
        }
        zzh();
        return SystemClock.elapsedRealtime() - j10 < this.zzq;
    }

    private final boolean zzaS(zzam zzam) {
        if (!(zzfk.zza < 23 || this.zzt == null || this.zzX == 3 || zzbc() == 0)) {
            float zzW2 = zzW(this.zzs, zzam, zzQ());
            float f10 = this.zzx;
            if (f10 == zzW2) {
                return true;
            }
            if (zzW2 == -1.0f) {
                zzab();
                return false;
            } else if (f10 == -1.0f && zzW2 <= this.zze) {
                return true;
            } else {
                Bundle bundle = new Bundle();
                bundle.putFloat("operating-rate", zzW2);
                this.zzt.zzp(bundle);
                this.zzx = zzW2;
            }
        }
        return true;
    }

    private final void zzaa() {
        this.zzT = false;
        this.zzi.zzb();
        this.zzh.zzb();
        this.zzS = false;
        this.zzR = false;
        this.zzl.zzb();
    }

    private final void zzab() {
        if (this.zzY) {
            this.zzW = 1;
            this.zzX = 3;
            return;
        }
        zzay();
        zzau();
    }

    private final void zzaj() {
        try {
            this.zzt.zzi();
        } finally {
            zzaz();
        }
    }

    /* access modifiers changed from: protected */
    public void zzA() {
        try {
            zzaa();
            zzay();
        } finally {
            this.zzak = null;
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0037, code lost:
        if (r5 >= r1) goto L_0x0039;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzD(com.google.android.gms.internal.ads.zzam[] r16, long r17, long r19) {
        /*
            r15 = this;
            r0 = r15
            com.google.android.gms.internal.ads.zzsd r1 = r0.zzag
            long r1 = r1.zzd
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x0021
            com.google.android.gms.internal.ads.zzsd r1 = new com.google.android.gms.internal.ads.zzsd
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6 = r1
            r9 = r17
            r11 = r19
            r6.<init>(r7, r9, r11)
            r15.zzaL(r1)
            return
        L_0x0021:
            java.util.ArrayDeque r1 = r0.zzk
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x0057
            long r1 = r0.zzab
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x0039
            long r5 = r0.zzah
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 == 0) goto L_0x0057
            int r7 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r7 < 0) goto L_0x0057
        L_0x0039:
            com.google.android.gms.internal.ads.zzsd r1 = new com.google.android.gms.internal.ads.zzsd
            r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r8 = r1
            r11 = r17
            r13 = r19
            r8.<init>(r9, r11, r13)
            r15.zzaL(r1)
            com.google.android.gms.internal.ads.zzsd r1 = r0.zzag
            long r1 = r1.zzd
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x0056
            r15.zzak()
        L_0x0056:
            return
        L_0x0057:
            java.util.ArrayDeque r1 = r0.zzk
            com.google.android.gms.internal.ads.zzsd r9 = new com.google.android.gms.internal.ads.zzsd
            long r3 = r0.zzab
            r2 = r9
            r5 = r17
            r7 = r19
            r2.<init>(r3, r5, r7)
            r1.add(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzse.zzD(com.google.android.gms.internal.ads.zzam[], long, long):void");
    }

    public void zzK(float f10, float f11) {
        this.zzr = f10;
        this.zzs = f11;
        zzaS(this.zzu);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v1, resolved type: com.google.android.gms.internal.ads.zzse} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: com.google.android.gms.internal.ads.zzse} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: com.google.android.gms.internal.ads.zzse} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v8, resolved type: com.google.android.gms.internal.ads.zzse} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v28, resolved type: android.media.MediaFormat} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v17, resolved type: com.google.android.gms.internal.ads.zzse} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v84, resolved type: com.google.android.gms.internal.ads.zzse} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v26, resolved type: com.google.android.gms.internal.ads.zzse} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v27, resolved type: com.google.android.gms.internal.ads.zzse} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v85, resolved type: com.google.android.gms.internal.ads.zzse} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v88, resolved type: com.google.android.gms.internal.ads.zzse} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v31, resolved type: com.google.android.gms.internal.ads.zzam} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v97, resolved type: com.google.android.gms.internal.ads.zzse} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v98, resolved type: com.google.android.gms.internal.ads.zzse} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v99, resolved type: com.google.android.gms.internal.ads.zzse} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v40, resolved type: com.google.android.gms.internal.ads.zzam} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v41, resolved type: com.google.android.gms.internal.ads.zzse} */
    /* JADX WARNING: type inference failed for: r1v26 */
    /* JADX WARNING: type inference failed for: r1v27 */
    /* JADX WARNING: type inference failed for: r1v100 */
    /* JADX WARNING: type inference failed for: r1v101 */
    /* JADX WARNING: type inference failed for: r1v102 */
    /* JADX WARNING: Can't wrap try/catch for region: R(3:115|116|(1:118)(0)) */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x01de, code lost:
        r15 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:?, code lost:
        zzaI();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x01e3, code lost:
        if (r15.zzae != false) goto L_0x01e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x01e5, code lost:
        zzay();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x02e7, code lost:
        if (r15.zzn != null) goto L_0x02e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x0335, code lost:
        r15 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:?, code lost:
        zzaI();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x0338, code lost:
        r15 = r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x033a, code lost:
        r1 = r1;
        r15 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x033c, code lost:
        if (r15.zzae != false) goto L_0x033e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x033e, code lost:
        zzay();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x0341, code lost:
        r1 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x0342, code lost:
        r2 = r21;
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x0345, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x03b6, code lost:
        r0 = e;
        r15 = r15;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:115:0x01de */
    /* JADX WARNING: Missing exception handler attribute for start block: B:197:0x0335 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x01f8 A[Catch:{ IllegalStateException -> 0x03db }] */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x0231 A[Catch:{ IllegalStateException -> 0x03db }] */
    /* JADX WARNING: Removed duplicated region for block: B:216:0x0376  */
    /* JADX WARNING: Removed duplicated region for block: B:225:0x0397 A[Catch:{ IllegalStateException -> 0x03d8 }, LOOP:2: B:106:0x01c7->B:225:0x0397, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:227:0x03a1 A[Catch:{ IllegalStateException -> 0x03d8 }, LOOP:3: B:227:0x03a1->B:230:0x03ab, LOOP_START] */
    /* JADX WARNING: Removed duplicated region for block: B:285:0x0396 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:287:0x039e A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzS(long r24, long r26) {
        /*
            r23 = this;
            r15 = r23
            r14 = 1
            r13 = 0
            boolean r0 = r15.zzae     // Catch:{ IllegalStateException -> 0x03db }
            if (r0 == 0) goto L_0x000c
            r23.zzal()     // Catch:{ IllegalStateException -> 0x03db }
            return
        L_0x000c:
            com.google.android.gms.internal.ads.zzam r0 = r15.zzm     // Catch:{ IllegalStateException -> 0x03db }
            r11 = 2
            if (r0 != 0) goto L_0x0019
            boolean r0 = r15.zzaQ(r11)     // Catch:{ IllegalStateException -> 0x03db }
            if (r0 == 0) goto L_0x0018
            goto L_0x0019
        L_0x0018:
            return
        L_0x0019:
            r23.zzau()     // Catch:{ IllegalStateException -> 0x03db }
            boolean r0 = r15.zzR     // Catch:{ IllegalStateException -> 0x03db }
            if (r0 == 0) goto L_0x01b5
            java.lang.String r0 = "bypassRender"
            int r1 = com.google.android.gms.internal.ads.zzfk.zza     // Catch:{ IllegalStateException -> 0x03db }
            android.os.Trace.beginSection(r0)     // Catch:{ IllegalStateException -> 0x03db }
        L_0x0027:
            boolean r0 = r15.zzae     // Catch:{ IllegalStateException -> 0x03db }
            r0 = r0 ^ r14
            com.google.android.gms.internal.ads.zzdx.zzf(r0)     // Catch:{ IllegalStateException -> 0x03db }
            com.google.android.gms.internal.ads.zzrs r0 = r15.zzi     // Catch:{ IllegalStateException -> 0x03db }
            boolean r1 = r0.zzp()     // Catch:{ IllegalStateException -> 0x03db }
            if (r1 == 0) goto L_0x0088
            long r1 = r0.zzm()     // Catch:{ IllegalStateException -> 0x03db }
            long r3 = r23.zzf()     // Catch:{ IllegalStateException -> 0x03db }
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 >= 0) goto L_0x0044
            r16 = 1
            goto L_0x0046
        L_0x0044:
            r16 = 0
        L_0x0046:
            java.nio.ByteBuffer r7 = r0.zzc     // Catch:{ IllegalStateException -> 0x03db }
            int r8 = r15.zzN     // Catch:{ IllegalStateException -> 0x03db }
            int r10 = r0.zzl()     // Catch:{ IllegalStateException -> 0x03db }
            long r11 = r0.zze     // Catch:{ IllegalStateException -> 0x03db }
            r6 = 0
            r9 = 0
            boolean r0 = r0.zzf()     // Catch:{ IllegalStateException -> 0x03db }
            com.google.android.gms.internal.ads.zzam r4 = r15.zzn     // Catch:{ IllegalStateException -> 0x03db }
            r1 = r23
            r2 = r24
            r17 = r4
            r4 = r26
            r13 = r16
            r14 = r0
            r15 = r17
            boolean r0 = r1.zzam(r2, r4, r6, r7, r8, r9, r10, r11, r13, r14, r15)     // Catch:{ IllegalStateException -> 0x0082 }
            if (r0 == 0) goto L_0x007c
            r15 = r23
            com.google.android.gms.internal.ads.zzrs r0 = r15.zzi     // Catch:{ IllegalStateException -> 0x03db }
            long r0 = r0.zzm()     // Catch:{ IllegalStateException -> 0x03db }
            r15.zzav(r0)     // Catch:{ IllegalStateException -> 0x03db }
            com.google.android.gms.internal.ads.zzrs r0 = r15.zzi     // Catch:{ IllegalStateException -> 0x03db }
            r0.zzb()     // Catch:{ IllegalStateException -> 0x03db }
            goto L_0x0088
        L_0x007c:
            r15 = r23
            r13 = 0
            r14 = 1
            goto L_0x01ac
        L_0x0082:
            r0 = move-exception
            r2 = 1
            r19 = 0
            goto L_0x0347
        L_0x0088:
            boolean r0 = r15.zzad     // Catch:{ IllegalStateException -> 0x03db }
            if (r0 == 0) goto L_0x0092
            r14 = 1
            r15.zzae = r14     // Catch:{ IllegalStateException -> 0x03db }
            r13 = 0
            goto L_0x01ac
        L_0x0092:
            r14 = 1
            boolean r0 = r15.zzS     // Catch:{ IllegalStateException -> 0x03db }
            if (r0 == 0) goto L_0x00a6
            com.google.android.gms.internal.ads.zzrs r0 = r15.zzi     // Catch:{ IllegalStateException -> 0x03db }
            com.google.android.gms.internal.ads.zzht r1 = r15.zzh     // Catch:{ IllegalStateException -> 0x03db }
            boolean r0 = r0.zzo(r1)     // Catch:{ IllegalStateException -> 0x03db }
            com.google.android.gms.internal.ads.zzdx.zzf(r0)     // Catch:{ IllegalStateException -> 0x03db }
            r13 = 0
            r15.zzS = r13     // Catch:{ IllegalStateException -> 0x03db }
            goto L_0x00a7
        L_0x00a6:
            r13 = 0
        L_0x00a7:
            boolean r0 = r15.zzT     // Catch:{ IllegalStateException -> 0x03db }
            if (r0 == 0) goto L_0x00bf
            com.google.android.gms.internal.ads.zzrs r0 = r15.zzi     // Catch:{ IllegalStateException -> 0x03db }
            boolean r0 = r0.zzp()     // Catch:{ IllegalStateException -> 0x03db }
            if (r0 != 0) goto L_0x0027
            r23.zzaa()     // Catch:{ IllegalStateException -> 0x03db }
            r15.zzT = r13     // Catch:{ IllegalStateException -> 0x03db }
            r23.zzau()     // Catch:{ IllegalStateException -> 0x03db }
            boolean r0 = r15.zzR     // Catch:{ IllegalStateException -> 0x03db }
            if (r0 == 0) goto L_0x01ac
        L_0x00bf:
            boolean r0 = r15.zzad     // Catch:{ IllegalStateException -> 0x03db }
            r0 = r0 ^ r14
            com.google.android.gms.internal.ads.zzdx.zzf(r0)     // Catch:{ IllegalStateException -> 0x03db }
            com.google.android.gms.internal.ads.zzkn r0 = r23.zzj()     // Catch:{ IllegalStateException -> 0x03db }
            com.google.android.gms.internal.ads.zzht r1 = r15.zzh     // Catch:{ IllegalStateException -> 0x03db }
            r1.zzb()     // Catch:{ IllegalStateException -> 0x03db }
        L_0x00ce:
            com.google.android.gms.internal.ads.zzht r1 = r15.zzh     // Catch:{ IllegalStateException -> 0x03db }
            r1.zzb()     // Catch:{ IllegalStateException -> 0x03db }
            com.google.android.gms.internal.ads.zzht r1 = r15.zzh     // Catch:{ IllegalStateException -> 0x03db }
            int r1 = r15.zzbd(r0, r1, r13)     // Catch:{ IllegalStateException -> 0x03db }
            r2 = -5
            if (r1 == r2) goto L_0x018c
            r2 = -4
            if (r1 == r2) goto L_0x00e1
            goto L_0x018f
        L_0x00e1:
            com.google.android.gms.internal.ads.zzht r1 = r15.zzh     // Catch:{ IllegalStateException -> 0x03db }
            boolean r1 = r1.zzf()     // Catch:{ IllegalStateException -> 0x03db }
            if (r1 == 0) goto L_0x00ed
            r15.zzad = r14     // Catch:{ IllegalStateException -> 0x03db }
            goto L_0x018f
        L_0x00ed:
            boolean r1 = r15.zzaf     // Catch:{ IllegalStateException -> 0x03db }
            java.lang.String r2 = "audio/opus"
            if (r1 == 0) goto L_0x0131
            com.google.android.gms.internal.ads.zzam r1 = r15.zzm     // Catch:{ IllegalStateException -> 0x03db }
            java.util.Objects.requireNonNull(r1)
            r15.zzn = r1     // Catch:{ IllegalStateException -> 0x03db }
            java.lang.String r1 = r1.zzm     // Catch:{ IllegalStateException -> 0x03db }
            boolean r1 = com.google.android.gms.internal.ads.zzsa.zza(r1, r2)     // Catch:{ IllegalStateException -> 0x03db }
            if (r1 == 0) goto L_0x0129
            com.google.android.gms.internal.ads.zzam r1 = r15.zzn     // Catch:{ IllegalStateException -> 0x03db }
            java.util.List r1 = r1.zzo     // Catch:{ IllegalStateException -> 0x03db }
            boolean r1 = r1.isEmpty()     // Catch:{ IllegalStateException -> 0x03db }
            if (r1 != 0) goto L_0x0129
            com.google.android.gms.internal.ads.zzam r1 = r15.zzn     // Catch:{ IllegalStateException -> 0x03db }
            java.util.List r1 = r1.zzo     // Catch:{ IllegalStateException -> 0x03db }
            java.lang.Object r1 = r1.get(r13)     // Catch:{ IllegalStateException -> 0x03db }
            byte[] r1 = (byte[]) r1     // Catch:{ IllegalStateException -> 0x03db }
            int r1 = com.google.android.gms.internal.ads.zzaci.zza(r1)     // Catch:{ IllegalStateException -> 0x03db }
            com.google.android.gms.internal.ads.zzam r3 = r15.zzn     // Catch:{ IllegalStateException -> 0x03db }
            com.google.android.gms.internal.ads.zzak r3 = r3.zzb()     // Catch:{ IllegalStateException -> 0x03db }
            r3.zzE(r1)     // Catch:{ IllegalStateException -> 0x03db }
            com.google.android.gms.internal.ads.zzam r1 = r3.zzac()     // Catch:{ IllegalStateException -> 0x03db }
            r15.zzn = r1     // Catch:{ IllegalStateException -> 0x03db }
        L_0x0129:
            com.google.android.gms.internal.ads.zzam r1 = r15.zzn     // Catch:{ IllegalStateException -> 0x03db }
            r3 = 0
            r15.zzai(r1, r3)     // Catch:{ IllegalStateException -> 0x03db }
            r15.zzaf = r13     // Catch:{ IllegalStateException -> 0x03db }
        L_0x0131:
            com.google.android.gms.internal.ads.zzht r1 = r15.zzh     // Catch:{ IllegalStateException -> 0x03db }
            r1.zzj()     // Catch:{ IllegalStateException -> 0x03db }
            com.google.android.gms.internal.ads.zzam r1 = r15.zzn     // Catch:{ IllegalStateException -> 0x03db }
            if (r1 == 0) goto L_0x015c
            java.lang.String r1 = r1.zzm     // Catch:{ IllegalStateException -> 0x03db }
            boolean r1 = com.google.android.gms.internal.ads.zzsa.zza(r1, r2)     // Catch:{ IllegalStateException -> 0x03db }
            if (r1 == 0) goto L_0x015c
            com.google.android.gms.internal.ads.zzht r1 = r15.zzh     // Catch:{ IllegalStateException -> 0x03db }
            boolean r2 = r1.zze()     // Catch:{ IllegalStateException -> 0x03db }
            if (r2 == 0) goto L_0x0151
            com.google.android.gms.internal.ads.zzam r2 = r15.zzn     // Catch:{ IllegalStateException -> 0x03db }
            r1.zza = r2     // Catch:{ IllegalStateException -> 0x03db }
            r15.zzae(r1)     // Catch:{ IllegalStateException -> 0x03db }
        L_0x0151:
            com.google.android.gms.internal.ads.zzqp r1 = r15.zzl     // Catch:{ IllegalStateException -> 0x03db }
            com.google.android.gms.internal.ads.zzht r2 = r15.zzh     // Catch:{ IllegalStateException -> 0x03db }
            com.google.android.gms.internal.ads.zzam r3 = r15.zzn     // Catch:{ IllegalStateException -> 0x03db }
            java.util.List r3 = r3.zzo     // Catch:{ IllegalStateException -> 0x03db }
            r1.zza(r2, r3)     // Catch:{ IllegalStateException -> 0x03db }
        L_0x015c:
            com.google.android.gms.internal.ads.zzrs r1 = r15.zzi     // Catch:{ IllegalStateException -> 0x03db }
            boolean r2 = r1.zzp()     // Catch:{ IllegalStateException -> 0x03db }
            if (r2 != 0) goto L_0x0165
            goto L_0x0181
        L_0x0165:
            long r2 = r23.zzf()     // Catch:{ IllegalStateException -> 0x03db }
            long r4 = r1.zzm()     // Catch:{ IllegalStateException -> 0x03db }
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 < 0) goto L_0x0173
            r4 = 0
            goto L_0x0174
        L_0x0173:
            r4 = 1
        L_0x0174:
            com.google.android.gms.internal.ads.zzht r5 = r15.zzh     // Catch:{ IllegalStateException -> 0x03db }
            long r5 = r5.zze     // Catch:{ IllegalStateException -> 0x03db }
            int r7 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r7 < 0) goto L_0x017e
            r2 = 0
            goto L_0x017f
        L_0x017e:
            r2 = 1
        L_0x017f:
            if (r4 != r2) goto L_0x0189
        L_0x0181:
            com.google.android.gms.internal.ads.zzht r2 = r15.zzh     // Catch:{ IllegalStateException -> 0x03db }
            boolean r1 = r1.zzo(r2)     // Catch:{ IllegalStateException -> 0x03db }
            if (r1 != 0) goto L_0x00ce
        L_0x0189:
            r15.zzS = r14     // Catch:{ IllegalStateException -> 0x03db }
            goto L_0x018f
        L_0x018c:
            r15.zzZ(r0)     // Catch:{ IllegalStateException -> 0x03db }
        L_0x018f:
            com.google.android.gms.internal.ads.zzrs r0 = r15.zzi     // Catch:{ IllegalStateException -> 0x03db }
            boolean r1 = r0.zzp()     // Catch:{ IllegalStateException -> 0x03db }
            if (r1 == 0) goto L_0x019a
            r0.zzj()     // Catch:{ IllegalStateException -> 0x03db }
        L_0x019a:
            com.google.android.gms.internal.ads.zzrs r0 = r15.zzi     // Catch:{ IllegalStateException -> 0x03db }
            boolean r0 = r0.zzp()     // Catch:{ IllegalStateException -> 0x03db }
            if (r0 != 0) goto L_0x0027
            boolean r0 = r15.zzad     // Catch:{ IllegalStateException -> 0x03db }
            if (r0 != 0) goto L_0x0027
            boolean r0 = r15.zzT     // Catch:{ IllegalStateException -> 0x03db }
            if (r0 == 0) goto L_0x01ac
            goto L_0x0027
        L_0x01ac:
            android.os.Trace.endSection()     // Catch:{ IllegalStateException -> 0x03db }
            r1 = r15
            r2 = 1
            r19 = 0
            goto L_0x03d0
        L_0x01b5:
            com.google.android.gms.internal.ads.zzrw r0 = r15.zzt     // Catch:{ IllegalStateException -> 0x03db }
            if (r0 == 0) goto L_0x03be
            r23.zzh()     // Catch:{ IllegalStateException -> 0x03b9 }
            long r9 = android.os.SystemClock.elapsedRealtime()     // Catch:{ IllegalStateException -> 0x03b9 }
            java.lang.String r0 = "drainAndFeed"
            int r1 = com.google.android.gms.internal.ads.zzfk.zza     // Catch:{ IllegalStateException -> 0x03b9 }
            android.os.Trace.beginSection(r0)     // Catch:{ IllegalStateException -> 0x03b9 }
        L_0x01c7:
            boolean r0 = r23.zzaP()     // Catch:{ IllegalStateException -> 0x03b9 }
            if (r0 != 0) goto L_0x02f4
            boolean r0 = r15.zzG     // Catch:{ IllegalStateException -> 0x03db }
            if (r0 == 0) goto L_0x01ee
            boolean r0 = r15.zzZ     // Catch:{ IllegalStateException -> 0x03db }
            if (r0 == 0) goto L_0x01ee
            com.google.android.gms.internal.ads.zzrw r0 = r15.zzt     // Catch:{ IllegalStateException -> 0x01de }
            android.media.MediaCodec$BufferInfo r1 = r15.zzj     // Catch:{ IllegalStateException -> 0x01de }
            int r0 = r0.zzb(r1)     // Catch:{ IllegalStateException -> 0x01de }
            goto L_0x01f6
        L_0x01de:
            r23.zzaI()     // Catch:{ IllegalStateException -> 0x03db }
            boolean r0 = r15.zzae     // Catch:{ IllegalStateException -> 0x03db }
            if (r0 == 0) goto L_0x01e8
            r23.zzay()     // Catch:{ IllegalStateException -> 0x03db }
        L_0x01e8:
            r2 = r9
            r1 = r15
            r19 = 0
            goto L_0x03a1
        L_0x01ee:
            com.google.android.gms.internal.ads.zzrw r0 = r15.zzt     // Catch:{ IllegalStateException -> 0x03db }
            android.media.MediaCodec$BufferInfo r1 = r15.zzj     // Catch:{ IllegalStateException -> 0x03db }
            int r0 = r0.zzb(r1)     // Catch:{ IllegalStateException -> 0x03db }
        L_0x01f6:
            if (r0 >= 0) goto L_0x0231
            r1 = -2
            if (r0 != r1) goto L_0x0221
            r15.zzaa = r14     // Catch:{ IllegalStateException -> 0x03db }
            com.google.android.gms.internal.ads.zzrw r0 = r15.zzt     // Catch:{ IllegalStateException -> 0x03db }
            android.media.MediaFormat r0 = r0.zzc()     // Catch:{ IllegalStateException -> 0x03db }
            int r1 = r15.zzB     // Catch:{ IllegalStateException -> 0x03db }
            if (r1 == 0) goto L_0x021c
            java.lang.String r1 = "width"
            int r1 = r0.getInteger(r1)     // Catch:{ IllegalStateException -> 0x03db }
            r2 = 32
            if (r1 != r2) goto L_0x021c
            java.lang.String r1 = "height"
            int r1 = r0.getInteger(r1)     // Catch:{ IllegalStateException -> 0x03db }
            if (r1 != r2) goto L_0x021c
            r15.zzJ = r14     // Catch:{ IllegalStateException -> 0x03db }
            goto L_0x023c
        L_0x021c:
            r15.zzv = r0     // Catch:{ IllegalStateException -> 0x03db }
            r15.zzw = r14     // Catch:{ IllegalStateException -> 0x03db }
            goto L_0x023c
        L_0x0221:
            boolean r0 = r15.zzK     // Catch:{ IllegalStateException -> 0x03db }
            if (r0 == 0) goto L_0x01e8
            boolean r0 = r15.zzad     // Catch:{ IllegalStateException -> 0x03db }
            if (r0 != 0) goto L_0x022d
            int r0 = r15.zzW     // Catch:{ IllegalStateException -> 0x03db }
            if (r0 != r11) goto L_0x01e8
        L_0x022d:
            r23.zzaI()     // Catch:{ IllegalStateException -> 0x03db }
            goto L_0x01e8
        L_0x0231:
            boolean r1 = r15.zzJ     // Catch:{ IllegalStateException -> 0x03db }
            if (r1 == 0) goto L_0x0244
            r15.zzJ = r13     // Catch:{ IllegalStateException -> 0x03db }
            com.google.android.gms.internal.ads.zzrw r1 = r15.zzt     // Catch:{ IllegalStateException -> 0x03db }
            r1.zzn(r0, r13)     // Catch:{ IllegalStateException -> 0x03db }
        L_0x023c:
            r2 = r9
            r1 = r15
            r16 = 2
            r19 = 0
            goto L_0x0390
        L_0x0244:
            android.media.MediaCodec$BufferInfo r1 = r15.zzj     // Catch:{ IllegalStateException -> 0x03db }
            int r2 = r1.size     // Catch:{ IllegalStateException -> 0x03db }
            if (r2 != 0) goto L_0x0254
            int r1 = r1.flags     // Catch:{ IllegalStateException -> 0x03db }
            r1 = r1 & 4
            if (r1 == 0) goto L_0x0254
            r23.zzaI()     // Catch:{ IllegalStateException -> 0x03db }
            goto L_0x01e8
        L_0x0254:
            r15.zzN = r0     // Catch:{ IllegalStateException -> 0x03db }
            com.google.android.gms.internal.ads.zzrw r1 = r15.zzt     // Catch:{ IllegalStateException -> 0x03db }
            java.nio.ByteBuffer r0 = r1.zzg(r0)     // Catch:{ IllegalStateException -> 0x03db }
            r15.zzO = r0     // Catch:{ IllegalStateException -> 0x03db }
            if (r0 == 0) goto L_0x0273
            android.media.MediaCodec$BufferInfo r1 = r15.zzj     // Catch:{ IllegalStateException -> 0x03db }
            int r1 = r1.offset     // Catch:{ IllegalStateException -> 0x03db }
            r0.position(r1)     // Catch:{ IllegalStateException -> 0x03db }
            java.nio.ByteBuffer r0 = r15.zzO     // Catch:{ IllegalStateException -> 0x03db }
            android.media.MediaCodec$BufferInfo r1 = r15.zzj     // Catch:{ IllegalStateException -> 0x03db }
            int r2 = r1.offset     // Catch:{ IllegalStateException -> 0x03db }
            int r1 = r1.size     // Catch:{ IllegalStateException -> 0x03db }
            int r2 = r2 + r1
            r0.limit(r2)     // Catch:{ IllegalStateException -> 0x03db }
        L_0x0273:
            boolean r0 = r15.zzH     // Catch:{ IllegalStateException -> 0x03db }
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r0 == 0) goto L_0x0296
            android.media.MediaCodec$BufferInfo r0 = r15.zzj     // Catch:{ IllegalStateException -> 0x03db }
            long r3 = r0.presentationTimeUs     // Catch:{ IllegalStateException -> 0x03db }
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x0296
            int r3 = r0.flags     // Catch:{ IllegalStateException -> 0x03db }
            r3 = r3 & 4
            if (r3 == 0) goto L_0x0296
            long r3 = r15.zzab     // Catch:{ IllegalStateException -> 0x03db }
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r5 == 0) goto L_0x0296
            long r3 = r15.zzac     // Catch:{ IllegalStateException -> 0x03db }
            r0.presentationTimeUs = r3     // Catch:{ IllegalStateException -> 0x03db }
        L_0x0296:
            android.media.MediaCodec$BufferInfo r0 = r15.zzj     // Catch:{ IllegalStateException -> 0x03db }
            long r3 = r0.presentationTimeUs     // Catch:{ IllegalStateException -> 0x03db }
            long r5 = r23.zzf()     // Catch:{ IllegalStateException -> 0x03db }
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x02a4
            r0 = 1
            goto L_0x02a5
        L_0x02a4:
            r0 = 0
        L_0x02a5:
            r15.zzP = r0     // Catch:{ IllegalStateException -> 0x03db }
            long r3 = r15.zzac     // Catch:{ IllegalStateException -> 0x03db }
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x02b7
            android.media.MediaCodec$BufferInfo r0 = r15.zzj     // Catch:{ IllegalStateException -> 0x03db }
            long r0 = r0.presentationTimeUs     // Catch:{ IllegalStateException -> 0x03db }
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 > 0) goto L_0x02b7
            r0 = 1
            goto L_0x02b8
        L_0x02b7:
            r0 = 0
        L_0x02b8:
            r15.zzQ = r0     // Catch:{ IllegalStateException -> 0x03db }
            android.media.MediaCodec$BufferInfo r0 = r15.zzj     // Catch:{ IllegalStateException -> 0x03db }
            long r0 = r0.presentationTimeUs     // Catch:{ IllegalStateException -> 0x03db }
            com.google.android.gms.internal.ads.zzsd r2 = r15.zzag     // Catch:{ IllegalStateException -> 0x03db }
            com.google.android.gms.internal.ads.zzfh r2 = r2.zze     // Catch:{ IllegalStateException -> 0x03db }
            java.lang.Object r0 = r2.zzc(r0)     // Catch:{ IllegalStateException -> 0x03db }
            com.google.android.gms.internal.ads.zzam r0 = (com.google.android.gms.internal.ads.zzam) r0     // Catch:{ IllegalStateException -> 0x03db }
            if (r0 != 0) goto L_0x02dc
            boolean r1 = r15.zzai     // Catch:{ IllegalStateException -> 0x03db }
            if (r1 == 0) goto L_0x02dc
            android.media.MediaFormat r1 = r15.zzv     // Catch:{ IllegalStateException -> 0x03db }
            if (r1 == 0) goto L_0x02dc
            com.google.android.gms.internal.ads.zzsd r0 = r15.zzag     // Catch:{ IllegalStateException -> 0x03db }
            com.google.android.gms.internal.ads.zzfh r0 = r0.zze     // Catch:{ IllegalStateException -> 0x03db }
            java.lang.Object r0 = r0.zzb()     // Catch:{ IllegalStateException -> 0x03db }
            com.google.android.gms.internal.ads.zzam r0 = (com.google.android.gms.internal.ads.zzam) r0     // Catch:{ IllegalStateException -> 0x03db }
        L_0x02dc:
            if (r0 == 0) goto L_0x02e1
            r15.zzn = r0     // Catch:{ IllegalStateException -> 0x03db }
            goto L_0x02e9
        L_0x02e1:
            boolean r0 = r15.zzw     // Catch:{ IllegalStateException -> 0x03db }
            if (r0 == 0) goto L_0x02f4
            com.google.android.gms.internal.ads.zzam r0 = r15.zzn     // Catch:{ IllegalStateException -> 0x03db }
            if (r0 == 0) goto L_0x02f4
        L_0x02e9:
            com.google.android.gms.internal.ads.zzam r0 = r15.zzn     // Catch:{ IllegalStateException -> 0x03db }
            android.media.MediaFormat r1 = r15.zzv     // Catch:{ IllegalStateException -> 0x03db }
            r15.zzai(r0, r1)     // Catch:{ IllegalStateException -> 0x03db }
            r15.zzw = r13     // Catch:{ IllegalStateException -> 0x03db }
            r15.zzai = r13     // Catch:{ IllegalStateException -> 0x03db }
        L_0x02f4:
            boolean r0 = r15.zzG     // Catch:{ IllegalStateException -> 0x03b9 }
            if (r0 == 0) goto L_0x0350
            boolean r0 = r15.zzZ     // Catch:{ IllegalStateException -> 0x034b }
            if (r0 == 0) goto L_0x0350
            com.google.android.gms.internal.ads.zzrw r6 = r15.zzt     // Catch:{ IllegalStateException -> 0x0331 }
            java.nio.ByteBuffer r7 = r15.zzO     // Catch:{ IllegalStateException -> 0x0331 }
            int r8 = r15.zzN     // Catch:{ IllegalStateException -> 0x0331 }
            android.media.MediaCodec$BufferInfo r0 = r15.zzj     // Catch:{ IllegalStateException -> 0x0331 }
            int r12 = r0.flags     // Catch:{ IllegalStateException -> 0x0331 }
            r16 = 1
            long r4 = r0.presentationTimeUs     // Catch:{ IllegalStateException -> 0x0331 }
            boolean r0 = r15.zzP     // Catch:{ IllegalStateException -> 0x0331 }
            boolean r2 = r15.zzQ     // Catch:{ IllegalStateException -> 0x0331 }
            com.google.android.gms.internal.ads.zzam r3 = r15.zzn     // Catch:{ IllegalStateException -> 0x0331 }
            r1 = r23
            r17 = r2
            r18 = r3
            r2 = r24
            r19 = r4
            r4 = r26
            r21 = r9
            r9 = r12
            r10 = r16
            r16 = 2
            r11 = r19
            r19 = 0
            r13 = r0
            r14 = r17
            r15 = r18
            boolean r0 = r1.zzam(r2, r4, r6, r7, r8, r9, r10, r11, r13, r14, r15)     // Catch:{ IllegalStateException -> 0x0335 }
            goto L_0x0374
        L_0x0331:
            r21 = r9
            r19 = 0
        L_0x0335:
            r23.zzaI()     // Catch:{ IllegalStateException -> 0x0345 }
            r15 = r23
            boolean r0 = r15.zzae     // Catch:{ IllegalStateException -> 0x03b6 }
            if (r0 == 0) goto L_0x0341
            r23.zzay()     // Catch:{ IllegalStateException -> 0x03b6 }
        L_0x0341:
            r1 = r15
        L_0x0342:
            r2 = r21
            goto L_0x03a1
        L_0x0345:
            r0 = move-exception
            r2 = 1
        L_0x0347:
            r1 = r23
            goto L_0x03e0
        L_0x034b:
            r0 = move-exception
            r19 = 0
            goto L_0x03b7
        L_0x0350:
            r21 = r9
            r16 = 2
            r19 = 0
            com.google.android.gms.internal.ads.zzrw r6 = r15.zzt     // Catch:{ IllegalStateException -> 0x03b6 }
            java.nio.ByteBuffer r7 = r15.zzO     // Catch:{ IllegalStateException -> 0x03b6 }
            int r8 = r15.zzN     // Catch:{ IllegalStateException -> 0x03b6 }
            android.media.MediaCodec$BufferInfo r0 = r15.zzj     // Catch:{ IllegalStateException -> 0x03b6 }
            int r9 = r0.flags     // Catch:{ IllegalStateException -> 0x03b6 }
            r10 = 1
            long r11 = r0.presentationTimeUs     // Catch:{ IllegalStateException -> 0x03b6 }
            boolean r13 = r15.zzP     // Catch:{ IllegalStateException -> 0x03b6 }
            boolean r14 = r15.zzQ     // Catch:{ IllegalStateException -> 0x03b6 }
            com.google.android.gms.internal.ads.zzam r0 = r15.zzn     // Catch:{ IllegalStateException -> 0x03b6 }
            r1 = r23
            r2 = r24
            r4 = r26
            r15 = r0
            boolean r0 = r1.zzam(r2, r4, r6, r7, r8, r9, r10, r11, r13, r14, r15)     // Catch:{ IllegalStateException -> 0x03b2 }
        L_0x0374:
            if (r0 == 0) goto L_0x039e
            r1 = r23
            android.media.MediaCodec$BufferInfo r0 = r1.zzj     // Catch:{ IllegalStateException -> 0x03d8 }
            long r2 = r0.presentationTimeUs     // Catch:{ IllegalStateException -> 0x03d8 }
            r1.zzav(r2)     // Catch:{ IllegalStateException -> 0x03d8 }
            android.media.MediaCodec$BufferInfo r0 = r1.zzj     // Catch:{ IllegalStateException -> 0x03d8 }
            int r0 = r0.flags     // Catch:{ IllegalStateException -> 0x03d8 }
            r0 = r0 & 4
            r23.zzaK()     // Catch:{ IllegalStateException -> 0x03d8 }
            if (r0 == 0) goto L_0x038e
            r23.zzaI()     // Catch:{ IllegalStateException -> 0x03d8 }
            goto L_0x0342
        L_0x038e:
            r2 = r21
        L_0x0390:
            boolean r0 = r1.zzaR(r2)     // Catch:{ IllegalStateException -> 0x03d8 }
            if (r0 != 0) goto L_0x0397
            goto L_0x03a1
        L_0x0397:
            r15 = r1
            r9 = r2
            r11 = 2
            r13 = 0
            r14 = 1
            goto L_0x01c7
        L_0x039e:
            r1 = r23
            goto L_0x0342
        L_0x03a1:
            boolean r0 = r23.zzaO()     // Catch:{ IllegalStateException -> 0x03d8 }
            if (r0 == 0) goto L_0x03ad
            boolean r0 = r1.zzaR(r2)     // Catch:{ IllegalStateException -> 0x03d8 }
            if (r0 != 0) goto L_0x03a1
        L_0x03ad:
            android.os.Trace.endSection()     // Catch:{ IllegalStateException -> 0x03d8 }
            r2 = 1
            goto L_0x03d0
        L_0x03b2:
            r0 = move-exception
            r1 = r23
            goto L_0x03d9
        L_0x03b6:
            r0 = move-exception
        L_0x03b7:
            r1 = r15
            goto L_0x03d9
        L_0x03b9:
            r0 = move-exception
            r1 = r15
            r19 = 0
            goto L_0x03d9
        L_0x03be:
            r1 = r15
            r19 = 0
            com.google.android.gms.internal.ads.zzid r0 = r1.zza     // Catch:{ IllegalStateException -> 0x03d8 }
            int r2 = r0.zzd     // Catch:{ IllegalStateException -> 0x03d8 }
            int r3 = r23.zzd(r24)     // Catch:{ IllegalStateException -> 0x03d8 }
            int r2 = r2 + r3
            r0.zzd = r2     // Catch:{ IllegalStateException -> 0x03d8 }
            r2 = 1
            r1.zzaQ(r2)     // Catch:{ IllegalStateException -> 0x03d6 }
        L_0x03d0:
            com.google.android.gms.internal.ads.zzid r0 = r1.zza     // Catch:{ IllegalStateException -> 0x03d6 }
            r0.zza()     // Catch:{ IllegalStateException -> 0x03d6 }
            return
        L_0x03d6:
            r0 = move-exception
            goto L_0x03e0
        L_0x03d8:
            r0 = move-exception
        L_0x03d9:
            r2 = 1
            goto L_0x03e0
        L_0x03db:
            r0 = move-exception
            r1 = r15
            r2 = 1
            r19 = 0
        L_0x03e0:
            int r3 = com.google.android.gms.internal.ads.zzfk.zza
            r4 = 21
            if (r3 < r4) goto L_0x03eb
            boolean r5 = r0 instanceof android.media.MediaCodec.CodecException
            if (r5 == 0) goto L_0x03eb
            goto L_0x0400
        L_0x03eb:
            java.lang.StackTraceElement[] r5 = r0.getStackTrace()
            int r6 = r5.length
            if (r6 <= 0) goto L_0x0429
            r5 = r5[r19]
            java.lang.String r5 = r5.getClassName()
            java.lang.String r6 = "android.media.MediaCodec"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x0429
        L_0x0400:
            r1.zzaf(r0)
            if (r3 < r4) goto L_0x0414
            boolean r3 = r0 instanceof android.media.MediaCodec.CodecException
            if (r3 == 0) goto L_0x0414
            r3 = r0
            android.media.MediaCodec$CodecException r3 = (android.media.MediaCodec.CodecException) r3
            boolean r3 = r3.isRecoverable()
            if (r3 == 0) goto L_0x0414
            r14 = 1
            goto L_0x0415
        L_0x0414:
            r14 = 0
        L_0x0415:
            if (r14 == 0) goto L_0x041a
            r23.zzay()
        L_0x041a:
            com.google.android.gms.internal.ads.zzrz r2 = r1.zzA
            com.google.android.gms.internal.ads.zzrx r0 = r1.zzas(r0, r2)
            com.google.android.gms.internal.ads.zzam r2 = r1.zzm
            r3 = 4003(0xfa3, float:5.61E-42)
            com.google.android.gms.internal.ads.zzil r0 = r1.zzi(r0, r2, r14, r3)
            throw r0
        L_0x0429:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzse.zzS(long, long):void");
    }

    public boolean zzT() {
        return this.zzae;
    }

    public boolean zzU() {
        if (this.zzm != null) {
            if (zzP() || zzaP()) {
                return true;
            }
            if (this.zzL != -9223372036854775807L) {
                zzh();
                if (SystemClock.elapsedRealtime() >= this.zzL) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public final int zzV(zzam zzam) {
        try {
            return zzX(this.zzd, zzam);
        } catch (zzsn e10) {
            throw zzi(e10, zzam, false, 4002);
        }
    }

    /* access modifiers changed from: protected */
    public float zzW(float f10, zzam zzam, zzam[] zzamArr) {
        throw null;
    }

    /* access modifiers changed from: protected */
    public abstract int zzX(zzsg zzsg, zzam zzam);

    /* access modifiers changed from: protected */
    public zzie zzY(zzrz zzrz, zzam zzam, zzam zzam2) {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0060, code lost:
        if (zzaN() == false) goto L_0x00bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x008c, code lost:
        if (zzaN() == false) goto L_0x00bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00a0, code lost:
        if (zzaN() == false) goto L_0x00bc;
     */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00d5 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.android.gms.internal.ads.zzie zzZ(com.google.android.gms.internal.ads.zzkn r12) {
        /*
            r11 = this;
            r0 = 1
            r11.zzaf = r0
            com.google.android.gms.internal.ads.zzam r4 = r12.zza
            java.util.Objects.requireNonNull(r4)
            java.lang.String r1 = r4.zzm
            r2 = 0
            if (r1 == 0) goto L_0x00e7
            com.google.android.gms.internal.ads.zzre r12 = r12.zzb
            r11.zzak = r12
            r11.zzm = r4
            boolean r1 = r11.zzR
            r3 = 0
            if (r1 == 0) goto L_0x001b
            r11.zzT = r0
            return r3
        L_0x001b:
            com.google.android.gms.internal.ads.zzrw r1 = r11.zzt
            if (r1 != 0) goto L_0x0025
            r11.zzy = r3
            r11.zzau()
            return r3
        L_0x0025:
            com.google.android.gms.internal.ads.zzrz r3 = r11.zzA
            com.google.android.gms.internal.ads.zzam r5 = r11.zzu
            com.google.android.gms.internal.ads.zzre r6 = r11.zzaj
            if (r6 != r12) goto L_0x00d6
            if (r12 == r6) goto L_0x0031
            r12 = 1
            goto L_0x0032
        L_0x0031:
            r12 = 0
        L_0x0032:
            if (r12 == 0) goto L_0x003d
            int r6 = com.google.android.gms.internal.ads.zzfk.zza
            r7 = 23
            if (r6 < r7) goto L_0x003b
            goto L_0x003d
        L_0x003b:
            r6 = 0
            goto L_0x003e
        L_0x003d:
            r6 = 1
        L_0x003e:
            com.google.android.gms.internal.ads.zzdx.zzf(r6)
            com.google.android.gms.internal.ads.zzie r6 = r11.zzY(r3, r5, r4)
            int r7 = r6.zzd
            r8 = 3
            r9 = 16
            r10 = 2
            if (r7 == 0) goto L_0x00b8
            if (r7 == r0) goto L_0x008f
            if (r7 == r10) goto L_0x0063
            boolean r0 = r11.zzaS(r4)
            if (r0 != 0) goto L_0x0058
            goto L_0x0095
        L_0x0058:
            r11.zzu = r4
            if (r12 == 0) goto L_0x00bb
            boolean r12 = r11.zzaN()
            if (r12 != 0) goto L_0x00bb
            goto L_0x00bc
        L_0x0063:
            boolean r7 = r11.zzaS(r4)
            if (r7 != 0) goto L_0x006a
            goto L_0x0095
        L_0x006a:
            r11.zzU = r0
            r11.zzV = r0
            int r7 = r11.zzB
            if (r7 == r10) goto L_0x0082
            if (r7 != r0) goto L_0x0081
            int r7 = r4.zzr
            int r9 = r5.zzr
            if (r7 != r9) goto L_0x0081
            int r7 = r4.zzs
            int r9 = r5.zzs
            if (r7 != r9) goto L_0x0081
            goto L_0x0082
        L_0x0081:
            r0 = 0
        L_0x0082:
            r11.zzI = r0
            r11.zzu = r4
            if (r12 == 0) goto L_0x00bb
            boolean r12 = r11.zzaN()
            if (r12 != 0) goto L_0x00bb
            goto L_0x00bc
        L_0x008f:
            boolean r7 = r11.zzaS(r4)
            if (r7 != 0) goto L_0x0098
        L_0x0095:
            r10 = 16
            goto L_0x00bc
        L_0x0098:
            r11.zzu = r4
            if (r12 == 0) goto L_0x00a3
            boolean r12 = r11.zzaN()
            if (r12 != 0) goto L_0x00bb
            goto L_0x00bc
        L_0x00a3:
            boolean r12 = r11.zzY
            if (r12 == 0) goto L_0x00bb
            r11.zzW = r0
            boolean r12 = r11.zzD
            if (r12 != 0) goto L_0x00b5
            boolean r12 = r11.zzF
            if (r12 == 0) goto L_0x00b2
            goto L_0x00b5
        L_0x00b2:
            r11.zzX = r0
            goto L_0x00bb
        L_0x00b5:
            r11.zzX = r8
            goto L_0x00bc
        L_0x00b8:
            r11.zzab()
        L_0x00bb:
            r10 = 0
        L_0x00bc:
            int r12 = r6.zzd
            if (r12 == 0) goto L_0x00d5
            com.google.android.gms.internal.ads.zzrw r12 = r11.zzt
            if (r12 != r1) goto L_0x00c8
            int r12 = r11.zzX
            if (r12 != r8) goto L_0x00d5
        L_0x00c8:
            com.google.android.gms.internal.ads.zzie r12 = new com.google.android.gms.internal.ads.zzie
            java.lang.String r2 = r3.zza
            r0 = 0
            r1 = r12
            r3 = r5
            r5 = r0
            r6 = r10
            r1.<init>(r2, r3, r4, r5, r6)
            return r12
        L_0x00d5:
            return r6
        L_0x00d6:
            r11.zzab()
            com.google.android.gms.internal.ads.zzie r12 = new com.google.android.gms.internal.ads.zzie
            java.lang.String r2 = r3.zza
            r0 = 0
            r6 = 128(0x80, float:1.794E-43)
            r1 = r12
            r3 = r5
            r5 = r0
            r1.<init>(r2, r3, r4, r5, r6)
            return r12
        L_0x00e7:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            r12.<init>()
            r0 = 4005(0xfa5, float:5.612E-42)
            com.google.android.gms.internal.ads.zzil r12 = r11.zzi(r12, r4, r2, r0)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzse.zzZ(com.google.android.gms.internal.ads.zzkn):com.google.android.gms.internal.ads.zzie");
    }

    /* access modifiers changed from: protected */
    public final void zzaA() {
        zzaz();
        this.zzy = null;
        this.zzA = null;
        this.zzu = null;
        this.zzv = null;
        this.zzw = false;
        this.zzaa = false;
        this.zzx = -1.0f;
        this.zzB = 0;
        this.zzC = false;
        this.zzD = false;
        this.zzE = false;
        this.zzF = false;
        this.zzG = false;
        this.zzH = false;
        this.zzK = false;
        this.zzU = false;
        this.zzV = 0;
        this.zzp = false;
    }

    /* access modifiers changed from: protected */
    public final boolean zzaB() {
        boolean zzaC = zzaC();
        if (zzaC) {
            zzau();
        }
        return zzaC;
    }

    /* access modifiers changed from: protected */
    public final boolean zzaC() {
        if (this.zzt == null) {
            return false;
        }
        int i10 = this.zzX;
        if (i10 == 3 || this.zzD || ((this.zzE && !this.zzaa) || (this.zzF && this.zzZ))) {
            zzay();
            return true;
        }
        if (i10 == 2) {
            int i11 = zzfk.zza;
            zzdx.zzf(i11 >= 23);
            if (i11 >= 23) {
                try {
                    zzaM();
                } catch (zzil e10) {
                    zzer.zzg("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e10);
                    zzay();
                    return true;
                }
            }
        }
        zzaj();
        return false;
    }

    /* access modifiers changed from: protected */
    public final boolean zzaD() {
        return this.zzR;
    }

    /* access modifiers changed from: protected */
    public final boolean zzaE(zzam zzam) {
        return this.zzak == null && zzan(zzam);
    }

    /* access modifiers changed from: protected */
    public boolean zzaF(zzrz zzrz) {
        return true;
    }

    /* access modifiers changed from: protected */
    public abstract zzru zzac(zzrz zzrz, zzam zzam, MediaCrypto mediaCrypto, float f10);

    /* access modifiers changed from: protected */
    public abstract List zzad(zzsg zzsg, zzam zzam, boolean z10);

    /* access modifiers changed from: protected */
    public void zzae(zzht zzht) {
        throw null;
    }

    /* access modifiers changed from: protected */
    public void zzaf(Exception exc) {
        throw null;
    }

    /* access modifiers changed from: protected */
    public void zzag(String str, zzru zzru, long j10, long j11) {
        throw null;
    }

    /* access modifiers changed from: protected */
    public void zzah(String str) {
        throw null;
    }

    /* access modifiers changed from: protected */
    public void zzai(zzam zzam, MediaFormat mediaFormat) {
        throw null;
    }

    /* access modifiers changed from: protected */
    public void zzak() {
    }

    /* access modifiers changed from: protected */
    public void zzal() {
    }

    /* access modifiers changed from: protected */
    public abstract boolean zzam(long j10, long j11, zzrw zzrw, ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z10, boolean z11, zzam zzam);

    /* access modifiers changed from: protected */
    public boolean zzan(zzam zzam) {
        return false;
    }

    /* access modifiers changed from: protected */
    public final float zzao() {
        return this.zzr;
    }

    /* access modifiers changed from: protected */
    public final long zzap() {
        return this.zzag.zzd;
    }

    /* access modifiers changed from: protected */
    public final long zzaq() {
        return this.zzag.zzc;
    }

    /* access modifiers changed from: protected */
    public final zzrw zzar() {
        return this.zzt;
    }

    /* access modifiers changed from: protected */
    public zzrx zzas(Throwable th, zzrz zzrz) {
        return new zzrx(th, zzrz);
    }

    /* access modifiers changed from: protected */
    public final zzrz zzat() {
        return this.zzA;
    }

    /* access modifiers changed from: protected */
    public final void zzau() {
        zzam zzam;
        if (this.zzt == null && !this.zzR && (zzam = this.zzm) != null) {
            if (zzaE(zzam)) {
                zzam zzam2 = this.zzm;
                zzaa();
                String str = zzam2.zzm;
                if ("audio/mp4a-latm".equals(str) || "audio/mpeg".equals(str) || "audio/opus".equals(str)) {
                    this.zzi.zzn(32);
                } else {
                    this.zzi.zzn(1);
                }
                this.zzR = true;
                return;
            }
            zzre zzre = this.zzak;
            this.zzaj = zzre;
            zzam zzam3 = this.zzm;
            String str2 = zzam3.zzm;
            if (zzre != null) {
                boolean z10 = zzrf.zza;
            }
            try {
                if (this.zzy == null) {
                    List zzad2 = zzad(this.zzd, zzam3, false);
                    zzad2.isEmpty();
                    this.zzy = new ArrayDeque();
                    if (!zzad2.isEmpty()) {
                        this.zzy.add((zzrz) zzad2.get(0));
                    }
                    this.zzz = null;
                }
                if (!this.zzy.isEmpty()) {
                    zzrz zzrz = (zzrz) this.zzy.peekFirst();
                    while (this.zzt == null) {
                        zzrz zzrz2 = (zzrz) this.zzy.peekFirst();
                        if (zzaF(zzrz2)) {
                            try {
                                zzaH(zzrz2, (MediaCrypto) null);
                            } catch (Exception e10) {
                                if (zzrz2 == zzrz) {
                                    zzer.zzf("MediaCodecRenderer", "Preferred decoder instantiation failed. Sleeping for 50ms then retrying.");
                                    Thread.sleep(50);
                                    zzaH(zzrz2, (MediaCrypto) null);
                                } else {
                                    throw e10;
                                }
                            } catch (Exception e11) {
                                zzer.zzg("MediaCodecRenderer", "Failed to initialize decoder: ".concat(String.valueOf(zzrz2)), e11);
                                this.zzy.removeFirst();
                                zzsc zzsc = new zzsc(this.zzm, (Throwable) e11, false, zzrz2);
                                zzaf(zzsc);
                                zzsc zzsc2 = this.zzz;
                                if (zzsc2 == null) {
                                    this.zzz = zzsc;
                                } else {
                                    this.zzz = zzsc.zza(zzsc2, zzsc);
                                }
                                if (this.zzy.isEmpty()) {
                                    throw this.zzz;
                                }
                            }
                        } else {
                            return;
                        }
                    }
                    this.zzy = null;
                    return;
                }
                throw new zzsc(this.zzm, (Throwable) null, false, -49999);
            } catch (zzsn e12) {
                throw new zzsc(this.zzm, (Throwable) e12, false, -49998);
            } catch (zzsc e13) {
                throw zzi(e13, this.zzm, false, 4001);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void zzav(long j10) {
        this.zzah = j10;
        while (!this.zzk.isEmpty() && j10 >= ((zzsd) this.zzk.peek()).zzb) {
            zzaL((zzsd) this.zzk.poll());
            zzak();
        }
    }

    /* access modifiers changed from: protected */
    public void zzaw(zzht zzht) {
    }

    /* access modifiers changed from: protected */
    public void zzax(zzam zzam) {
    }

    /* access modifiers changed from: protected */
    public final void zzay() {
        try {
            zzrw zzrw = this.zzt;
            if (zzrw != null) {
                zzrw.zzl();
                this.zza.zzb++;
                zzah(this.zzA.zza);
            }
        } finally {
            this.zzt = null;
            this.zzo = null;
            this.zzaj = null;
            zzaA();
        }
    }

    /* access modifiers changed from: protected */
    public void zzaz() {
        zzaJ();
        zzaK();
        this.zzL = -9223372036854775807L;
        this.zzZ = false;
        this.zzY = false;
        this.zzI = false;
        this.zzJ = false;
        this.zzP = false;
        this.zzQ = false;
        this.zzab = -9223372036854775807L;
        this.zzac = -9223372036854775807L;
        this.zzah = -9223372036854775807L;
        this.zzW = 0;
        this.zzX = 0;
        this.zzV = this.zzU ? 1 : 0;
    }

    public final int zze() {
        return 8;
    }

    /* access modifiers changed from: protected */
    public void zzw() {
        this.zzm = null;
        zzaL(zzsd.zza);
        this.zzk.clear();
        zzaC();
    }

    /* access modifiers changed from: protected */
    public void zzx(boolean z10, boolean z11) {
        this.zza = new zzid();
    }

    /* access modifiers changed from: protected */
    public void zzy(long j10, boolean z10) {
        this.zzad = false;
        this.zzae = false;
        if (this.zzR) {
            this.zzi.zzb();
            this.zzh.zzb();
            this.zzS = false;
            this.zzl.zzb();
        } else {
            zzaB();
        }
        zzfh zzfh = this.zzag.zze;
        if (zzfh.zza() > 0) {
            this.zzaf = true;
        }
        zzfh.zze();
        this.zzk.clear();
    }
}
