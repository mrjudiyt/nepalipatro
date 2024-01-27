package com.google.android.exoplayer2.mediacodec;

import a6.h0;
import a6.j0;
import a6.m0;
import a6.p;
import a6.u;
import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import com.facebook.ads.AdError;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.mediacodec.MediaCodecUtil;
import com.google.android.exoplayer2.mediacodec.b;
import com.google.android.exoplayer2.mediacodec.h;
import e4.a;
import e4.c;
import e4.j;
import e4.k;
import h4.d;
import h4.e;
import j4.q;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public abstract class MediaCodecRenderer extends a {
    private static final byte[] O0 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};
    private final f A;
    private long A0;
    private final h0<j> B;
    private long B0;
    private final ArrayList<Long> C;
    private boolean C0;
    private final MediaCodec.BufferInfo D;
    private boolean D0;
    private final long[] E;
    private boolean E0;
    private final long[] F;
    private boolean F0;
    private final long[] G;
    private boolean G0;
    private j H;
    private boolean H0;
    private j I;
    private boolean I0;
    private DrmSession J;
    private ExoPlaybackException J0;
    private DrmSession K;
    protected d K0;
    private MediaCrypto L;
    private long L0;
    private boolean M;
    private long M0;
    private long N;
    private int N0;
    private float O;
    private float P;
    private h Q;
    private j R;
    private MediaFormat S;
    private boolean T;
    private float U;
    private ArrayDeque<i> V;
    private DecoderInitializationException W;
    private i X;
    private int Y;
    private boolean Z;

    /* renamed from: a0  reason: collision with root package name */
    private boolean f6886a0;

    /* renamed from: b0  reason: collision with root package name */
    private boolean f6887b0;

    /* renamed from: c0  reason: collision with root package name */
    private boolean f6888c0;

    /* renamed from: d0  reason: collision with root package name */
    private boolean f6889d0;

    /* renamed from: e0  reason: collision with root package name */
    private boolean f6890e0;

    /* renamed from: f0  reason: collision with root package name */
    private boolean f6891f0;

    /* renamed from: g0  reason: collision with root package name */
    private boolean f6892g0;

    /* renamed from: h0  reason: collision with root package name */
    private boolean f6893h0;

    /* renamed from: i0  reason: collision with root package name */
    private boolean f6894i0;

    /* renamed from: j0  reason: collision with root package name */
    private g f6895j0;

    /* renamed from: k0  reason: collision with root package name */
    private long f6896k0;

    /* renamed from: l0  reason: collision with root package name */
    private int f6897l0;

    /* renamed from: m0  reason: collision with root package name */
    private int f6898m0;

    /* renamed from: n0  reason: collision with root package name */
    private ByteBuffer f6899n0;

    /* renamed from: o0  reason: collision with root package name */
    private boolean f6900o0;

    /* renamed from: p0  reason: collision with root package name */
    private boolean f6901p0;

    /* renamed from: q0  reason: collision with root package name */
    private boolean f6902q0;

    /* renamed from: r0  reason: collision with root package name */
    private boolean f6903r0;

    /* renamed from: s0  reason: collision with root package name */
    private boolean f6904s0;

    /* renamed from: t  reason: collision with root package name */
    private final h.b f6905t;

    /* renamed from: t0  reason: collision with root package name */
    private boolean f6906t0;

    /* renamed from: u  reason: collision with root package name */
    private final j f6907u;

    /* renamed from: u0  reason: collision with root package name */
    private int f6908u0;

    /* renamed from: v  reason: collision with root package name */
    private final boolean f6909v;

    /* renamed from: v0  reason: collision with root package name */
    private int f6910v0;

    /* renamed from: w  reason: collision with root package name */
    private final float f6911w;

    /* renamed from: w0  reason: collision with root package name */
    private int f6912w0;

    /* renamed from: x  reason: collision with root package name */
    private final DecoderInputBuffer f6913x = DecoderInputBuffer.w();

    /* renamed from: x0  reason: collision with root package name */
    private boolean f6914x0;

    /* renamed from: y  reason: collision with root package name */
    private final DecoderInputBuffer f6915y = new DecoderInputBuffer(0);

    /* renamed from: y0  reason: collision with root package name */
    private boolean f6916y0;

    /* renamed from: z  reason: collision with root package name */
    private final DecoderInputBuffer f6917z = new DecoderInputBuffer(2);

    /* renamed from: z0  reason: collision with root package name */
    private boolean f6918z0;

    public MediaCodecRenderer(int i10, h.b bVar, j jVar, boolean z10, float f10) {
        super(i10);
        this.f6905t = bVar;
        this.f6907u = (j) a6.a.e(jVar);
        this.f6909v = z10;
        this.f6911w = f10;
        f fVar = new f();
        this.A = fVar;
        this.B = new h0<>();
        this.C = new ArrayList<>();
        this.D = new MediaCodec.BufferInfo();
        this.O = 1.0f;
        this.P = 1.0f;
        this.N = -9223372036854775807L;
        this.E = new long[10];
        this.F = new long[10];
        this.G = new long[10];
        this.L0 = -9223372036854775807L;
        this.M0 = -9223372036854775807L;
        fVar.t(0);
        fVar.f6469j.order(ByteOrder.nativeOrder());
        this.U = -1.0f;
        this.Y = 0;
        this.f6908u0 = 0;
        this.f6897l0 = -1;
        this.f6898m0 = -1;
        this.f6896k0 = -9223372036854775807L;
        this.A0 = -9223372036854775807L;
        this.B0 = -9223372036854775807L;
        this.f6910v0 = 0;
        this.f6912w0 = 0;
    }

    private boolean B0() {
        return this.f6898m0 >= 0;
    }

    private void C0(j jVar) {
        c0();
        String str = jVar.f8096s;
        if ("audio/mp4a-latm".equals(str) || "audio/mpeg".equals(str) || "audio/opus".equals(str)) {
            this.A.E(32);
        } else {
            this.A.E(1);
        }
        this.f6902q0 = true;
    }

    private void D0(i iVar, MediaCrypto mediaCrypto) {
        float f10;
        h hVar;
        String str = iVar.f6988a;
        int i10 = m0.f205a;
        float f11 = -1.0f;
        if (i10 < 23) {
            f10 = -1.0f;
        } else {
            f10 = t0(this.P, this.H, E());
        }
        if (f10 > this.f6911w) {
            f11 = f10;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        String valueOf = String.valueOf(str);
        j0.a(valueOf.length() != 0 ? "createCodec:".concat(valueOf) : new String("createCodec:"));
        h.a x02 = x0(iVar, this.H, mediaCrypto, f11);
        if (!this.G0 || i10 < 23) {
            hVar = this.f6905t.a(x02);
        } else {
            hVar = new b.C0112b(j(), this.H0, this.I0).a(x02);
        }
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        this.Q = hVar;
        this.X = iVar;
        this.U = f11;
        this.R = this.H;
        this.Y = S(str);
        this.Z = T(str, this.R);
        this.f6886a0 = Y(str);
        this.f6887b0 = a0(str);
        this.f6888c0 = V(str);
        this.f6889d0 = W(str);
        this.f6890e0 = U(str);
        this.f6891f0 = Z(str, this.R);
        boolean z10 = false;
        this.f6894i0 = X(iVar) || s0();
        if (hVar.a()) {
            this.f6906t0 = true;
            this.f6908u0 = 1;
            if (this.Y != 0) {
                z10 = true;
            }
            this.f6892g0 = z10;
        }
        if ("c2.android.mp3.decoder".equals(iVar.f6988a)) {
            this.f6895j0 = new g();
        }
        if (d() == 2) {
            this.f6896k0 = SystemClock.elapsedRealtime() + 1000;
        }
        this.K0.f8954a++;
        M0(str, elapsedRealtime2, elapsedRealtime2 - elapsedRealtime);
    }

    private boolean E0(long j10) {
        int size = this.C.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.C.get(i10).longValue() == j10) {
                this.C.remove(i10);
                return true;
            }
        }
        return false;
    }

    private static boolean F0(IllegalStateException illegalStateException) {
        if (m0.f205a >= 21 && G0(illegalStateException)) {
            return true;
        }
        StackTraceElement[] stackTrace = illegalStateException.getStackTrace();
        if (stackTrace.length <= 0 || !stackTrace[0].getClassName().equals("android.media.MediaCodec")) {
            return false;
        }
        return true;
    }

    private static boolean G0(IllegalStateException illegalStateException) {
        return illegalStateException instanceof MediaCodec.CodecException;
    }

    private static boolean H0(IllegalStateException illegalStateException) {
        if (illegalStateException instanceof MediaCodec.CodecException) {
            return ((MediaCodec.CodecException) illegalStateException).isRecoverable();
        }
        return false;
    }

    private void J0(MediaCrypto mediaCrypto, boolean z10) {
        if (this.V == null) {
            try {
                List<i> p02 = p0(z10);
                ArrayDeque<i> arrayDeque = new ArrayDeque<>();
                this.V = arrayDeque;
                if (this.f6909v) {
                    arrayDeque.addAll(p02);
                } else if (!p02.isEmpty()) {
                    this.V.add(p02.get(0));
                }
                this.W = null;
            } catch (MediaCodecUtil.DecoderQueryException e10) {
                throw new DecoderInitializationException(this.H, (Throwable) e10, z10, -49998);
            }
        }
        if (!this.V.isEmpty()) {
            while (this.Q == null) {
                i peekFirst = this.V.peekFirst();
                if (j1(peekFirst)) {
                    try {
                        D0(peekFirst, mediaCrypto);
                    } catch (Exception e11) {
                        String valueOf = String.valueOf(peekFirst);
                        StringBuilder sb = new StringBuilder(valueOf.length() + 30);
                        sb.append("Failed to initialize decoder: ");
                        sb.append(valueOf);
                        p.i("MediaCodecRenderer", sb.toString(), e11);
                        this.V.removeFirst();
                        DecoderInitializationException decoderInitializationException = new DecoderInitializationException(this.H, (Throwable) e11, z10, peekFirst);
                        L0(decoderInitializationException);
                        if (this.W == null) {
                            this.W = decoderInitializationException;
                        } else {
                            this.W = this.W.c(decoderInitializationException);
                        }
                        if (this.V.isEmpty()) {
                            throw this.W;
                        }
                    }
                } else {
                    return;
                }
            }
            this.V = null;
            return;
        }
        throw new DecoderInitializationException(this.H, (Throwable) null, z10, -49999);
    }

    private boolean K0(q qVar, j jVar) {
        if (qVar.f9438c) {
            return false;
        }
        try {
            MediaCrypto mediaCrypto = new MediaCrypto(qVar.f9436a, qVar.f9437b);
            try {
                return mediaCrypto.requiresSecureDecoderComponent(jVar.f8096s);
            } finally {
                mediaCrypto.release();
            }
        } catch (MediaCryptoException unused) {
            return true;
        }
    }

    private void P() {
        a6.a.f(!this.C0);
        k C2 = C();
        this.f6917z.k();
        do {
            this.f6917z.k();
            int N2 = N(C2, this.f6917z, 0);
            if (N2 == -5) {
                O0(C2);
                return;
            } else if (N2 != -4) {
                if (N2 != -3) {
                    throw new IllegalStateException();
                }
                return;
            } else if (this.f6917z.p()) {
                this.C0 = true;
                return;
            } else {
                if (this.E0) {
                    j jVar = (j) a6.a.e(this.H);
                    this.I = jVar;
                    P0(jVar, (MediaFormat) null);
                    this.E0 = false;
                }
                this.f6917z.u();
            }
        } while (this.A.y(this.f6917z));
        this.f6903r0 = true;
    }

    private boolean Q(long j10, long j11) {
        a6.a.f(!this.D0);
        if (this.A.D()) {
            f fVar = this.A;
            if (!U0(j10, j11, (h) null, fVar.f6469j, this.f6898m0, 0, fVar.C(), this.A.A(), this.A.o(), this.A.p(), this.I)) {
                return false;
            }
            Q0(this.A.B());
            this.A.k();
        }
        if (this.C0) {
            this.D0 = true;
            return false;
        }
        if (this.f6903r0) {
            a6.a.f(this.A.y(this.f6917z));
            this.f6903r0 = false;
        }
        if (this.f6904s0) {
            if (this.A.D()) {
                return true;
            }
            c0();
            this.f6904s0 = false;
            I0();
            if (!this.f6902q0) {
                return false;
            }
        }
        P();
        if (this.A.D()) {
            this.A.u();
        }
        return this.A.D() || this.C0 || this.f6904s0;
    }

    private int S(String str) {
        int i10 = m0.f205a;
        if (i10 <= 25 && "OMX.Exynos.avc.dec.secure".equals(str)) {
            String str2 = m0.f208d;
            if (str2.startsWith("SM-T585") || str2.startsWith("SM-A510") || str2.startsWith("SM-A520") || str2.startsWith("SM-J700")) {
                return 2;
            }
        }
        if (i10 >= 24) {
            return 0;
        }
        if (!"OMX.Nvidia.h264.decode".equals(str) && !"OMX.Nvidia.h264.decode.secure".equals(str)) {
            return 0;
        }
        String str3 = m0.f206b;
        return ("flounder".equals(str3) || "flounder_lte".equals(str3) || "grouper".equals(str3) || "tilapia".equals(str3)) ? 1 : 0;
    }

    private static boolean T(String str, j jVar) {
        return m0.f205a < 21 && jVar.f8098u.isEmpty() && "OMX.MTK.VIDEO.DECODER.AVC".equals(str);
    }

    @TargetApi(23)
    private void T0() {
        int i10 = this.f6912w0;
        if (i10 == 1) {
            m0();
        } else if (i10 == 2) {
            m0();
            o1();
        } else if (i10 != 3) {
            this.D0 = true;
            Z0();
        } else {
            X0();
        }
    }

    private static boolean U(String str) {
        if (m0.f205a < 21 && "OMX.SEC.mp3.dec".equals(str) && "samsung".equals(m0.f207c)) {
            String str2 = m0.f206b;
            if (str2.startsWith("baffin") || str2.startsWith("grand") || str2.startsWith("fortuna") || str2.startsWith("gprimelte") || str2.startsWith("j2y18lte") || str2.startsWith("ms01")) {
                return true;
            }
        }
        return false;
    }

    private static boolean V(String str) {
        int i10 = m0.f205a;
        if (i10 > 23 || !"OMX.google.vorbis.decoder".equals(str)) {
            if (i10 <= 19) {
                String str2 = m0.f206b;
                if (("hb2000".equals(str2) || "stvm8".equals(str2)) && ("OMX.amlogic.avc.decoder.awesome".equals(str) || "OMX.amlogic.avc.decoder.awesome.secure".equals(str))) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    private void V0() {
        this.f6918z0 = true;
        MediaFormat b10 = this.Q.b();
        if (this.Y != 0 && b10.getInteger(ViewHierarchyConstants.DIMENSION_WIDTH_KEY) == 32 && b10.getInteger(ViewHierarchyConstants.DIMENSION_HEIGHT_KEY) == 32) {
            this.f6893h0 = true;
            return;
        }
        if (this.f6891f0) {
            b10.setInteger("channel-count", 1);
        }
        this.S = b10;
        this.T = true;
    }

    private static boolean W(String str) {
        return m0.f205a == 21 && "OMX.google.aac.decoder".equals(str);
    }

    private boolean W0(int i10) {
        k C2 = C();
        this.f6913x.k();
        int N2 = N(C2, this.f6913x, i10 | 4);
        if (N2 == -5) {
            O0(C2);
            return true;
        } else if (N2 != -4 || !this.f6913x.p()) {
            return false;
        } else {
            this.C0 = true;
            T0();
            return false;
        }
    }

    private static boolean X(i iVar) {
        String str = iVar.f6988a;
        int i10 = m0.f205a;
        return (i10 <= 25 && "OMX.rk.video_decoder.avc".equals(str)) || (i10 <= 17 && "OMX.allwinner.video.decoder.avc".equals(str)) || ((i10 <= 29 && ("OMX.broadcom.video_decoder.tunnel".equals(str) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str))) || ("Amazon".equals(m0.f207c) && "AFTS".equals(m0.f208d) && iVar.f6994g));
    }

    private void X0() {
        Y0();
        I0();
    }

    private static boolean Y(String str) {
        int i10 = m0.f205a;
        return i10 < 18 || (i10 == 18 && ("OMX.SEC.avc.dec".equals(str) || "OMX.SEC.avc.dec.secure".equals(str))) || (i10 == 19 && m0.f208d.startsWith("SM-G800") && ("OMX.Exynos.avc.dec".equals(str) || "OMX.Exynos.avc.dec.secure".equals(str)));
    }

    private static boolean Z(String str, j jVar) {
        if (m0.f205a > 18 || jVar.F != 1 || !"OMX.MTK.AUDIO.DECODER.MP3".equals(str)) {
            return false;
        }
        return true;
    }

    private static boolean a0(String str) {
        return m0.f205a == 29 && "c2.android.aac.decoder".equals(str);
    }

    private void c0() {
        this.f6904s0 = false;
        this.A.k();
        this.f6917z.k();
        this.f6903r0 = false;
        this.f6902q0 = false;
    }

    private void c1() {
        this.f6897l0 = -1;
        this.f6915y.f6469j = null;
    }

    private boolean d0() {
        if (this.f6914x0) {
            this.f6910v0 = 1;
            if (this.f6886a0 || this.f6888c0) {
                this.f6912w0 = 3;
                return false;
            }
            this.f6912w0 = 1;
        }
        return true;
    }

    private void d1() {
        this.f6898m0 = -1;
        this.f6899n0 = null;
    }

    private void e0() {
        if (this.f6914x0) {
            this.f6910v0 = 1;
            this.f6912w0 = 3;
            return;
        }
        X0();
    }

    private void e1(DrmSession drmSession) {
        j4.d.a(this.J, drmSession);
        this.J = drmSession;
    }

    @TargetApi(23)
    private boolean f0() {
        if (this.f6914x0) {
            this.f6910v0 = 1;
            if (this.f6886a0 || this.f6888c0) {
                this.f6912w0 = 3;
                return false;
            }
            this.f6912w0 = 2;
        } else {
            o1();
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:68:0x00f9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean g0(long r20, long r22) {
        /*
            r19 = this;
            r15 = r19
            boolean r0 = r19.B0()
            r16 = 1
            r14 = 0
            if (r0 != 0) goto L_0x00c2
            boolean r0 = r15.f6889d0
            if (r0 == 0) goto L_0x0028
            boolean r0 = r15.f6916y0
            if (r0 == 0) goto L_0x0028
            com.google.android.exoplayer2.mediacodec.h r0 = r15.Q     // Catch:{ IllegalStateException -> 0x001c }
            android.media.MediaCodec$BufferInfo r1 = r15.D     // Catch:{ IllegalStateException -> 0x001c }
            int r0 = r0.f(r1)     // Catch:{ IllegalStateException -> 0x001c }
            goto L_0x0030
        L_0x001c:
            r19.T0()
            boolean r0 = r15.D0
            if (r0 == 0) goto L_0x0027
            r19.Y0()
        L_0x0027:
            return r14
        L_0x0028:
            com.google.android.exoplayer2.mediacodec.h r0 = r15.Q
            android.media.MediaCodec$BufferInfo r1 = r15.D
            int r0 = r0.f(r1)
        L_0x0030:
            if (r0 >= 0) goto L_0x004a
            r1 = -2
            if (r0 != r1) goto L_0x0039
            r19.V0()
            return r16
        L_0x0039:
            boolean r0 = r15.f6894i0
            if (r0 == 0) goto L_0x0049
            boolean r0 = r15.C0
            if (r0 != 0) goto L_0x0046
            int r0 = r15.f6910v0
            r1 = 2
            if (r0 != r1) goto L_0x0049
        L_0x0046:
            r19.T0()
        L_0x0049:
            return r14
        L_0x004a:
            boolean r1 = r15.f6893h0
            if (r1 == 0) goto L_0x0056
            r15.f6893h0 = r14
            com.google.android.exoplayer2.mediacodec.h r1 = r15.Q
            r1.h(r0, r14)
            return r16
        L_0x0056:
            android.media.MediaCodec$BufferInfo r1 = r15.D
            int r2 = r1.size
            if (r2 != 0) goto L_0x0066
            int r1 = r1.flags
            r1 = r1 & 4
            if (r1 == 0) goto L_0x0066
            r19.T0()
            return r14
        L_0x0066:
            r15.f6898m0 = r0
            com.google.android.exoplayer2.mediacodec.h r1 = r15.Q
            java.nio.ByteBuffer r0 = r1.m(r0)
            r15.f6899n0 = r0
            if (r0 == 0) goto L_0x0085
            android.media.MediaCodec$BufferInfo r1 = r15.D
            int r1 = r1.offset
            r0.position(r1)
            java.nio.ByteBuffer r0 = r15.f6899n0
            android.media.MediaCodec$BufferInfo r1 = r15.D
            int r2 = r1.offset
            int r1 = r1.size
            int r2 = r2 + r1
            r0.limit(r2)
        L_0x0085:
            boolean r0 = r15.f6890e0
            if (r0 == 0) goto L_0x00a6
            android.media.MediaCodec$BufferInfo r0 = r15.D
            long r1 = r0.presentationTimeUs
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x00a6
            int r1 = r0.flags
            r1 = r1 & 4
            if (r1 == 0) goto L_0x00a6
            long r1 = r15.A0
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x00a6
            r0.presentationTimeUs = r1
        L_0x00a6:
            android.media.MediaCodec$BufferInfo r0 = r15.D
            long r0 = r0.presentationTimeUs
            boolean r0 = r15.E0(r0)
            r15.f6900o0 = r0
            long r0 = r15.B0
            android.media.MediaCodec$BufferInfo r2 = r15.D
            long r2 = r2.presentationTimeUs
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x00bc
            r0 = 1
            goto L_0x00bd
        L_0x00bc:
            r0 = 0
        L_0x00bd:
            r15.f6901p0 = r0
            r15.p1(r2)
        L_0x00c2:
            boolean r0 = r15.f6889d0
            if (r0 == 0) goto L_0x00fd
            boolean r0 = r15.f6916y0
            if (r0 == 0) goto L_0x00fd
            com.google.android.exoplayer2.mediacodec.h r5 = r15.Q     // Catch:{ IllegalStateException -> 0x00f0 }
            java.nio.ByteBuffer r6 = r15.f6899n0     // Catch:{ IllegalStateException -> 0x00f0 }
            int r7 = r15.f6898m0     // Catch:{ IllegalStateException -> 0x00f0 }
            android.media.MediaCodec$BufferInfo r0 = r15.D     // Catch:{ IllegalStateException -> 0x00f0 }
            int r8 = r0.flags     // Catch:{ IllegalStateException -> 0x00f0 }
            r9 = 1
            long r10 = r0.presentationTimeUs     // Catch:{ IllegalStateException -> 0x00f0 }
            boolean r12 = r15.f6900o0     // Catch:{ IllegalStateException -> 0x00f0 }
            boolean r13 = r15.f6901p0     // Catch:{ IllegalStateException -> 0x00f0 }
            e4.j r3 = r15.I     // Catch:{ IllegalStateException -> 0x00f0 }
            r0 = r19
            r1 = r20
            r17 = r3
            r3 = r22
            r18 = 0
            r14 = r17
            boolean r0 = r0.U0(r1, r3, r5, r6, r7, r8, r9, r10, r12, r13, r14)     // Catch:{ IllegalStateException -> 0x00ee }
            goto L_0x011c
        L_0x00ee:
            goto L_0x00f2
        L_0x00f0:
            r18 = 0
        L_0x00f2:
            r19.T0()
            boolean r0 = r15.D0
            if (r0 == 0) goto L_0x00fc
            r19.Y0()
        L_0x00fc:
            return r18
        L_0x00fd:
            r18 = 0
            com.google.android.exoplayer2.mediacodec.h r5 = r15.Q
            java.nio.ByteBuffer r6 = r15.f6899n0
            int r7 = r15.f6898m0
            android.media.MediaCodec$BufferInfo r0 = r15.D
            int r8 = r0.flags
            r9 = 1
            long r10 = r0.presentationTimeUs
            boolean r12 = r15.f6900o0
            boolean r13 = r15.f6901p0
            e4.j r14 = r15.I
            r0 = r19
            r1 = r20
            r3 = r22
            boolean r0 = r0.U0(r1, r3, r5, r6, r7, r8, r9, r10, r12, r13, r14)
        L_0x011c:
            if (r0 == 0) goto L_0x0139
            android.media.MediaCodec$BufferInfo r0 = r15.D
            long r0 = r0.presentationTimeUs
            r15.Q0(r0)
            android.media.MediaCodec$BufferInfo r0 = r15.D
            int r0 = r0.flags
            r0 = r0 & 4
            if (r0 == 0) goto L_0x012f
            r14 = 1
            goto L_0x0130
        L_0x012f:
            r14 = 0
        L_0x0130:
            r19.d1()
            if (r14 != 0) goto L_0x0136
            return r16
        L_0x0136:
            r19.T0()
        L_0x0139:
            return r18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.mediacodec.MediaCodecRenderer.g0(long, long):boolean");
    }

    private boolean h0(i iVar, j jVar, DrmSession drmSession, DrmSession drmSession2) {
        q w02;
        if (drmSession == drmSession2) {
            return false;
        }
        if (drmSession2 == null || drmSession == null || m0.f205a < 23) {
            return true;
        }
        UUID uuid = c.f8049e;
        if (uuid.equals(drmSession.c()) || uuid.equals(drmSession2.c()) || (w02 = w0(drmSession2)) == null) {
            return true;
        }
        return !iVar.f6994g && K0(w02, jVar);
    }

    private void h1(DrmSession drmSession) {
        j4.d.a(this.K, drmSession);
        this.K = drmSession;
    }

    private boolean i1(long j10) {
        return this.N == -9223372036854775807L || SystemClock.elapsedRealtime() - j10 < this.N;
    }

    private boolean l0() {
        h hVar = this.Q;
        if (hVar == null || this.f6910v0 == 2 || this.C0) {
            return false;
        }
        if (this.f6897l0 < 0) {
            int e10 = hVar.e();
            this.f6897l0 = e10;
            if (e10 < 0) {
                return false;
            }
            this.f6915y.f6469j = this.Q.j(e10);
            this.f6915y.k();
        }
        if (this.f6910v0 == 1) {
            if (!this.f6894i0) {
                this.f6916y0 = true;
                this.Q.l(this.f6897l0, 0, 0, 0, 4);
                c1();
            }
            this.f6910v0 = 2;
            return false;
        } else if (this.f6892g0) {
            this.f6892g0 = false;
            ByteBuffer byteBuffer = this.f6915y.f6469j;
            byte[] bArr = O0;
            byteBuffer.put(bArr);
            this.Q.l(this.f6897l0, 0, bArr.length, 0, 0);
            c1();
            this.f6914x0 = true;
            return true;
        } else {
            if (this.f6908u0 == 1) {
                for (int i10 = 0; i10 < this.R.f8098u.size(); i10++) {
                    this.f6915y.f6469j.put(this.R.f8098u.get(i10));
                }
                this.f6908u0 = 2;
            }
            int position = this.f6915y.f6469j.position();
            k C2 = C();
            try {
                int N2 = N(C2, this.f6915y, 0);
                if (k()) {
                    this.B0 = this.A0;
                }
                if (N2 == -3) {
                    return false;
                }
                if (N2 == -5) {
                    if (this.f6908u0 == 2) {
                        this.f6915y.k();
                        this.f6908u0 = 1;
                    }
                    O0(C2);
                    return true;
                } else if (this.f6915y.p()) {
                    if (this.f6908u0 == 2) {
                        this.f6915y.k();
                        this.f6908u0 = 1;
                    }
                    this.C0 = true;
                    if (!this.f6914x0) {
                        T0();
                        return false;
                    }
                    try {
                        if (!this.f6894i0) {
                            this.f6916y0 = true;
                            this.Q.l(this.f6897l0, 0, 0, 0, 4);
                            c1();
                        }
                        return false;
                    } catch (MediaCodec.CryptoException e11) {
                        throw z(e11, this.H, c.b(e11.getErrorCode()));
                    }
                } else if (this.f6914x0 || this.f6915y.q()) {
                    boolean v10 = this.f6915y.v();
                    if (v10) {
                        this.f6915y.f6468i.b(position);
                    }
                    if (this.Z && !v10) {
                        u.b(this.f6915y.f6469j);
                        if (this.f6915y.f6469j.position() == 0) {
                            return true;
                        }
                        this.Z = false;
                    }
                    DecoderInputBuffer decoderInputBuffer = this.f6915y;
                    long j10 = decoderInputBuffer.f6471l;
                    g gVar = this.f6895j0;
                    if (gVar != null) {
                        j10 = gVar.c(this.H, decoderInputBuffer);
                    }
                    long j11 = j10;
                    if (this.f6915y.o()) {
                        this.C.add(Long.valueOf(j11));
                    }
                    if (this.E0) {
                        this.B.a(j11, this.H);
                        this.E0 = false;
                    }
                    if (this.f6895j0 != null) {
                        this.A0 = Math.max(this.A0, this.f6915y.f6471l);
                    } else {
                        this.A0 = Math.max(this.A0, j11);
                    }
                    this.f6915y.u();
                    if (this.f6915y.n()) {
                        A0(this.f6915y);
                    }
                    S0(this.f6915y);
                    if (v10) {
                        try {
                            this.Q.n(this.f6897l0, 0, this.f6915y.f6468i, j11, 0);
                        } catch (MediaCodec.CryptoException e12) {
                            throw z(e12, this.H, c.b(e12.getErrorCode()));
                        }
                    } else {
                        this.Q.l(this.f6897l0, 0, this.f6915y.f6469j.limit(), j11, 0);
                    }
                    c1();
                    this.f6914x0 = true;
                    this.f6908u0 = 0;
                    this.K0.f8956c++;
                    return true;
                } else {
                    this.f6915y.k();
                    if (this.f6908u0 == 2) {
                        this.f6908u0 = 1;
                    }
                    return true;
                }
            } catch (DecoderInputBuffer.InsufficientCapacityException e13) {
                L0(e13);
                W0(0);
                m0();
                return true;
            }
        }
    }

    private void m0() {
        try {
            this.Q.flush();
        } finally {
            a1();
        }
    }

    protected static boolean m1(j jVar) {
        Class<? extends j4.p> cls = jVar.L;
        return cls == null || q.class.equals(cls);
    }

    private boolean n1(j jVar) {
        if (!(m0.f205a < 23 || this.Q == null || this.f6912w0 == 3 || d() == 0)) {
            float t02 = t0(this.P, jVar, E());
            float f10 = this.U;
            if (f10 == t02) {
                return true;
            }
            if (t02 == -1.0f) {
                e0();
                return false;
            } else if (f10 == -1.0f && t02 <= this.f6911w) {
                return true;
            } else {
                Bundle bundle = new Bundle();
                bundle.putFloat("operating-rate", t02);
                this.Q.c(bundle);
                this.U = t02;
            }
        }
        return true;
    }

    private void o1() {
        try {
            this.L.setMediaDrmSession(w0(this.K).f9437b);
            e1(this.K);
            this.f6910v0 = 0;
            this.f6912w0 = 0;
        } catch (MediaCryptoException e10) {
            throw z(e10, this.H, 6006);
        }
    }

    private List<i> p0(boolean z10) {
        List<i> v02 = v0(this.f6907u, this.H, z10);
        if (v02.isEmpty() && z10) {
            v02 = v0(this.f6907u, this.H, false);
            if (!v02.isEmpty()) {
                String str = this.H.f8096s;
                String valueOf = String.valueOf(v02);
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 99 + valueOf.length());
                sb.append("Drm session requires secure decoder for ");
                sb.append(str);
                sb.append(", but no secure decoder available. Trying to proceed with ");
                sb.append(valueOf);
                sb.append(".");
                p.h("MediaCodecRenderer", sb.toString());
            }
        }
        return v02;
    }

    private q w0(DrmSession drmSession) {
        j4.p g10 = drmSession.g();
        if (g10 == null || (g10 instanceof q)) {
            return (q) g10;
        }
        String valueOf = String.valueOf(g10);
        StringBuilder sb = new StringBuilder(valueOf.length() + 42);
        sb.append("Expecting FrameworkMediaCrypto but found: ");
        sb.append(valueOf);
        throw z(new IllegalArgumentException(sb.toString()), this.H, AdError.MEDIAVIEW_MISSING_ERROR_CODE);
    }

    /* access modifiers changed from: protected */
    public void A0(DecoderInputBuffer decoderInputBuffer) {
    }

    /* access modifiers changed from: protected */
    public void G() {
        this.H = null;
        this.L0 = -9223372036854775807L;
        this.M0 = -9223372036854775807L;
        this.N0 = 0;
        o0();
    }

    /* access modifiers changed from: protected */
    public void H(boolean z10, boolean z11) {
        this.K0 = new d();
    }

    /* access modifiers changed from: protected */
    public void I(long j10, boolean z10) {
        this.C0 = false;
        this.D0 = false;
        this.F0 = false;
        if (this.f6902q0) {
            this.A.k();
            this.f6917z.k();
            this.f6903r0 = false;
        } else {
            n0();
        }
        if (this.B.k() > 0) {
            this.E0 = true;
        }
        this.B.c();
        int i10 = this.N0;
        if (i10 != 0) {
            this.M0 = this.F[i10 - 1];
            this.L0 = this.E[i10 - 1];
            this.N0 = 0;
        }
    }

    /* access modifiers changed from: protected */
    public final void I0() {
        j jVar;
        if (this.Q == null && !this.f6902q0 && (jVar = this.H) != null) {
            if (this.K != null || !k1(jVar)) {
                e1(this.K);
                String str = this.H.f8096s;
                DrmSession drmSession = this.J;
                if (drmSession != null) {
                    if (this.L == null) {
                        q w02 = w0(drmSession);
                        if (w02 != null) {
                            try {
                                MediaCrypto mediaCrypto = new MediaCrypto(w02.f9436a, w02.f9437b);
                                this.L = mediaCrypto;
                                this.M = !w02.f9438c && mediaCrypto.requiresSecureDecoderComponent(str);
                            } catch (MediaCryptoException e10) {
                                throw z(e10, this.H, 6006);
                            }
                        } else if (this.J.h() == null) {
                            return;
                        }
                    }
                    if (q.f9435d) {
                        int d10 = this.J.d();
                        if (d10 == 1) {
                            DrmSession.DrmSessionException drmSessionException = (DrmSession.DrmSessionException) a6.a.e(this.J.h());
                            throw z(drmSessionException, this.H, drmSessionException.f6548h);
                        } else if (d10 != 4) {
                            return;
                        }
                    }
                }
                try {
                    J0(this.L, this.M);
                } catch (DecoderInitializationException e11) {
                    throw z(e11, this.H, 4001);
                }
            } else {
                C0(this.H);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void J() {
        try {
            c0();
            Y0();
        } finally {
            h1((DrmSession) null);
        }
    }

    /* access modifiers changed from: protected */
    public void K() {
    }

    /* access modifiers changed from: protected */
    public void L() {
    }

    /* access modifiers changed from: protected */
    public abstract void L0(Exception exc);

    /* access modifiers changed from: protected */
    public void M(j[] jVarArr, long j10, long j11) {
        boolean z10 = true;
        if (this.M0 == -9223372036854775807L) {
            if (this.L0 != -9223372036854775807L) {
                z10 = false;
            }
            a6.a.f(z10);
            this.L0 = j10;
            this.M0 = j11;
            return;
        }
        int i10 = this.N0;
        long[] jArr = this.F;
        if (i10 == jArr.length) {
            long j12 = jArr[i10 - 1];
            StringBuilder sb = new StringBuilder(65);
            sb.append("Too many stream changes, so dropping offset: ");
            sb.append(j12);
            p.h("MediaCodecRenderer", sb.toString());
        } else {
            this.N0 = i10 + 1;
        }
        long[] jArr2 = this.E;
        int i11 = this.N0;
        jArr2[i11 - 1] = j10;
        this.F[i11 - 1] = j11;
        this.G[i11 - 1] = this.A0;
    }

    /* access modifiers changed from: protected */
    public abstract void M0(String str, long j10, long j11);

    /* access modifiers changed from: protected */
    public abstract void N0(String str);

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0080, code lost:
        if (f0() == false) goto L_0x00cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00b2, code lost:
        if (f0() == false) goto L_0x00cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00cf, code lost:
        r7 = 2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00eb A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public h4.e O0(e4.k r12) {
        /*
            r11 = this;
            r0 = 1
            r11.E0 = r0
            e4.j r1 = r12.f8131b
            java.lang.Object r1 = a6.a.e(r1)
            r5 = r1
            e4.j r5 = (e4.j) r5
            java.lang.String r1 = r5.f8096s
            if (r1 == 0) goto L_0x00ec
            com.google.android.exoplayer2.drm.DrmSession r12 = r12.f8130a
            r11.h1(r12)
            r11.H = r5
            boolean r12 = r11.f6902q0
            r1 = 0
            if (r12 == 0) goto L_0x001f
            r11.f6904s0 = r0
            return r1
        L_0x001f:
            com.google.android.exoplayer2.mediacodec.h r12 = r11.Q
            if (r12 != 0) goto L_0x0029
            r11.V = r1
            r11.I0()
            return r1
        L_0x0029:
            com.google.android.exoplayer2.mediacodec.i r1 = r11.X
            e4.j r4 = r11.R
            com.google.android.exoplayer2.drm.DrmSession r2 = r11.J
            com.google.android.exoplayer2.drm.DrmSession r3 = r11.K
            boolean r2 = r11.h0(r1, r5, r2, r3)
            if (r2 == 0) goto L_0x0046
            r11.e0()
            h4.e r12 = new h4.e
            java.lang.String r3 = r1.f6988a
            r6 = 0
            r7 = 128(0x80, float:1.794E-43)
            r2 = r12
            r2.<init>(r3, r4, r5, r6, r7)
            return r12
        L_0x0046:
            com.google.android.exoplayer2.drm.DrmSession r2 = r11.K
            com.google.android.exoplayer2.drm.DrmSession r3 = r11.J
            r6 = 0
            if (r2 == r3) goto L_0x004f
            r2 = 1
            goto L_0x0050
        L_0x004f:
            r2 = 0
        L_0x0050:
            if (r2 == 0) goto L_0x005b
            int r3 = a6.m0.f205a
            r7 = 23
            if (r3 < r7) goto L_0x0059
            goto L_0x005b
        L_0x0059:
            r3 = 0
            goto L_0x005c
        L_0x005b:
            r3 = 1
        L_0x005c:
            a6.a.f(r3)
            h4.e r3 = r11.R(r1, r4, r5)
            int r7 = r3.f8968d
            r8 = 3
            r9 = 16
            r10 = 2
            if (r7 == 0) goto L_0x00d1
            if (r7 == r0) goto L_0x00b5
            if (r7 == r10) goto L_0x0089
            if (r7 != r8) goto L_0x0083
            boolean r0 = r11.n1(r5)
            if (r0 != 0) goto L_0x0078
            goto L_0x00bb
        L_0x0078:
            r11.R = r5
            if (r2 == 0) goto L_0x00d4
            boolean r0 = r11.f0()
            if (r0 != 0) goto L_0x00d4
            goto L_0x00cf
        L_0x0083:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            r12.<init>()
            throw r12
        L_0x0089:
            boolean r7 = r11.n1(r5)
            if (r7 != 0) goto L_0x0090
            goto L_0x00bb
        L_0x0090:
            r11.f6906t0 = r0
            r11.f6908u0 = r0
            int r7 = r11.Y
            if (r7 == r10) goto L_0x00a8
            if (r7 != r0) goto L_0x00a7
            int r7 = r5.f8101x
            int r9 = r4.f8101x
            if (r7 != r9) goto L_0x00a7
            int r7 = r5.f8102y
            int r9 = r4.f8102y
            if (r7 != r9) goto L_0x00a7
            goto L_0x00a8
        L_0x00a7:
            r0 = 0
        L_0x00a8:
            r11.f6892g0 = r0
            r11.R = r5
            if (r2 == 0) goto L_0x00d4
            boolean r0 = r11.f0()
            if (r0 != 0) goto L_0x00d4
            goto L_0x00cf
        L_0x00b5:
            boolean r0 = r11.n1(r5)
            if (r0 != 0) goto L_0x00be
        L_0x00bb:
            r7 = 16
            goto L_0x00d5
        L_0x00be:
            r11.R = r5
            if (r2 == 0) goto L_0x00c9
            boolean r0 = r11.f0()
            if (r0 != 0) goto L_0x00d4
            goto L_0x00cf
        L_0x00c9:
            boolean r0 = r11.d0()
            if (r0 != 0) goto L_0x00d4
        L_0x00cf:
            r7 = 2
            goto L_0x00d5
        L_0x00d1:
            r11.e0()
        L_0x00d4:
            r7 = 0
        L_0x00d5:
            int r0 = r3.f8968d
            if (r0 == 0) goto L_0x00eb
            com.google.android.exoplayer2.mediacodec.h r0 = r11.Q
            if (r0 != r12) goto L_0x00e1
            int r12 = r11.f6912w0
            if (r12 != r8) goto L_0x00eb
        L_0x00e1:
            h4.e r12 = new h4.e
            java.lang.String r3 = r1.f6988a
            r6 = 0
            r2 = r12
            r2.<init>(r3, r4, r5, r6, r7)
            return r12
        L_0x00eb:
            return r3
        L_0x00ec:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            r12.<init>()
            r0 = 4005(0xfa5, float:5.612E-42)
            com.google.android.exoplayer2.ExoPlaybackException r12 = r11.z(r12, r5, r0)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.mediacodec.MediaCodecRenderer.O0(e4.k):h4.e");
    }

    /* access modifiers changed from: protected */
    public abstract void P0(j jVar, MediaFormat mediaFormat);

    /* access modifiers changed from: protected */
    public void Q0(long j10) {
        while (true) {
            int i10 = this.N0;
            if (i10 != 0 && j10 >= this.G[0]) {
                long[] jArr = this.E;
                this.L0 = jArr[0];
                this.M0 = this.F[0];
                int i11 = i10 - 1;
                this.N0 = i11;
                System.arraycopy(jArr, 1, jArr, 0, i11);
                long[] jArr2 = this.F;
                System.arraycopy(jArr2, 1, jArr2, 0, this.N0);
                long[] jArr3 = this.G;
                System.arraycopy(jArr3, 1, jArr3, 0, this.N0);
                R0();
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: protected */
    public abstract e R(i iVar, j jVar, j jVar2);

    /* access modifiers changed from: protected */
    public void R0() {
    }

    /* access modifiers changed from: protected */
    public abstract void S0(DecoderInputBuffer decoderInputBuffer);

    /* access modifiers changed from: protected */
    public abstract boolean U0(long j10, long j11, h hVar, ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z10, boolean z11, j jVar);

    /* access modifiers changed from: protected */
    public void Y0() {
        try {
            h hVar = this.Q;
            if (hVar != null) {
                hVar.release();
                this.K0.f8955b++;
                N0(this.X.f6988a);
            }
            this.Q = null;
            try {
                MediaCrypto mediaCrypto = this.L;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
                this.L = null;
                e1((DrmSession) null);
                b1();
            }
        } catch (Throwable th) {
            this.Q = null;
            MediaCrypto mediaCrypto2 = this.L;
            if (mediaCrypto2 != null) {
                mediaCrypto2.release();
            }
            throw th;
        } finally {
            this.L = null;
            e1((DrmSession) null);
            b1();
        }
    }

    /* access modifiers changed from: protected */
    public void Z0() {
    }

    public final int a(j jVar) {
        try {
            return l1(this.f6907u, jVar);
        } catch (MediaCodecUtil.DecoderQueryException e10) {
            throw z(e10, jVar, 4002);
        }
    }

    /* access modifiers changed from: protected */
    public void a1() {
        c1();
        d1();
        this.f6896k0 = -9223372036854775807L;
        this.f6916y0 = false;
        this.f6914x0 = false;
        this.f6892g0 = false;
        this.f6893h0 = false;
        this.f6900o0 = false;
        this.f6901p0 = false;
        this.C.clear();
        this.A0 = -9223372036854775807L;
        this.B0 = -9223372036854775807L;
        g gVar = this.f6895j0;
        if (gVar != null) {
            gVar.b();
        }
        this.f6910v0 = 0;
        this.f6912w0 = 0;
        this.f6908u0 = this.f6906t0 ? 1 : 0;
    }

    /* access modifiers changed from: protected */
    public MediaCodecDecoderException b0(Throwable th, i iVar) {
        return new MediaCodecDecoderException(th, iVar);
    }

    /* access modifiers changed from: protected */
    public void b1() {
        a1();
        this.J0 = null;
        this.f6895j0 = null;
        this.V = null;
        this.X = null;
        this.R = null;
        this.S = null;
        this.T = false;
        this.f6918z0 = false;
        this.U = -1.0f;
        this.Y = 0;
        this.Z = false;
        this.f6886a0 = false;
        this.f6887b0 = false;
        this.f6888c0 = false;
        this.f6889d0 = false;
        this.f6890e0 = false;
        this.f6891f0 = false;
        this.f6894i0 = false;
        this.f6906t0 = false;
        this.f6908u0 = 0;
        this.M = false;
    }

    public boolean c() {
        return this.D0;
    }

    public boolean e() {
        return this.H != null && (F() || B0() || (this.f6896k0 != -9223372036854775807L && SystemClock.elapsedRealtime() < this.f6896k0));
    }

    /* access modifiers changed from: protected */
    public final void f1() {
        this.F0 = true;
    }

    /* access modifiers changed from: protected */
    public final void g1(ExoPlaybackException exoPlaybackException) {
        this.J0 = exoPlaybackException;
    }

    public void i0(boolean z10) {
        this.G0 = z10;
    }

    public void j0(boolean z10) {
        this.H0 = z10;
    }

    /* access modifiers changed from: protected */
    public boolean j1(i iVar) {
        return true;
    }

    public void k0(boolean z10) {
        this.I0 = z10;
    }

    /* access modifiers changed from: protected */
    public boolean k1(j jVar) {
        return false;
    }

    /* access modifiers changed from: protected */
    public abstract int l1(j jVar, j jVar2);

    /* access modifiers changed from: protected */
    public final boolean n0() {
        boolean o02 = o0();
        if (o02) {
            I0();
        }
        return o02;
    }

    public void o(float f10, float f11) {
        this.O = f10;
        this.P = f11;
        n1(this.R);
    }

    /* access modifiers changed from: protected */
    public boolean o0() {
        if (this.Q == null) {
            return false;
        }
        if (this.f6912w0 == 3 || this.f6886a0 || ((this.f6887b0 && !this.f6918z0) || (this.f6888c0 && this.f6916y0))) {
            Y0();
            return true;
        }
        m0();
        return false;
    }

    public final int p() {
        return 8;
    }

    /* access modifiers changed from: protected */
    public final void p1(long j10) {
        boolean z10;
        j i10 = this.B.i(j10);
        if (i10 == null && this.T) {
            i10 = this.B.h();
        }
        if (i10 != null) {
            this.I = i10;
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 || (this.T && this.I != null)) {
            P0(this.I, this.S);
            this.T = false;
        }
    }

    public void q(long j10, long j11) {
        boolean z10 = false;
        if (this.F0) {
            this.F0 = false;
            T0();
        }
        ExoPlaybackException exoPlaybackException = this.J0;
        if (exoPlaybackException == null) {
            try {
                if (this.D0) {
                    Z0();
                } else if (this.H != null || W0(2)) {
                    I0();
                    if (this.f6902q0) {
                        j0.a("bypassRender");
                        while (Q(j10, j11)) {
                        }
                        j0.c();
                    } else if (this.Q != null) {
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        j0.a("drainAndFeed");
                        while (g0(j10, j11) && i1(elapsedRealtime)) {
                        }
                        while (l0() && i1(elapsedRealtime)) {
                        }
                        j0.c();
                    } else {
                        this.K0.f8957d += O(j10);
                        W0(1);
                    }
                    this.K0.c();
                }
            } catch (IllegalStateException e10) {
                if (F0(e10)) {
                    L0(e10);
                    if (m0.f205a >= 21 && H0(e10)) {
                        z10 = true;
                    }
                    if (z10) {
                        Y0();
                    }
                    throw A(b0(e10, r0()), this.H, z10, 4003);
                }
                throw e10;
            }
        } else {
            this.J0 = null;
            throw exoPlaybackException;
        }
    }

    /* access modifiers changed from: protected */
    public final h q0() {
        return this.Q;
    }

    /* access modifiers changed from: protected */
    public final i r0() {
        return this.X;
    }

    /* access modifiers changed from: protected */
    public boolean s0() {
        return false;
    }

    /* access modifiers changed from: protected */
    public abstract float t0(float f10, j jVar, j[] jVarArr);

    /* access modifiers changed from: protected */
    public final MediaFormat u0() {
        return this.S;
    }

    /* access modifiers changed from: protected */
    public abstract List<i> v0(j jVar, j jVar2, boolean z10);

    /* access modifiers changed from: protected */
    public abstract h.a x0(i iVar, j jVar, MediaCrypto mediaCrypto, float f10);

    /* access modifiers changed from: protected */
    public final long y0() {
        return this.M0;
    }

    /* access modifiers changed from: protected */
    public float z0() {
        return this.O;
    }

    public static class DecoderInitializationException extends Exception {

        /* renamed from: h  reason: collision with root package name */
        public final String f6919h;

        /* renamed from: i  reason: collision with root package name */
        public final boolean f6920i;

        /* renamed from: j  reason: collision with root package name */
        public final i f6921j;

        /* renamed from: k  reason: collision with root package name */
        public final String f6922k;

        /* renamed from: l  reason: collision with root package name */
        public final DecoderInitializationException f6923l;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public DecoderInitializationException(e4.j r12, java.lang.Throwable r13, boolean r14, int r15) {
            /*
                r11 = this;
                java.lang.String r0 = java.lang.String.valueOf(r12)
                int r1 = r0.length()
                int r1 = r1 + 36
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>(r1)
                java.lang.String r1 = "Decoder init failed: ["
                r2.append(r1)
                r2.append(r15)
                java.lang.String r1 = "], "
                r2.append(r1)
                r2.append(r0)
                java.lang.String r4 = r2.toString()
                java.lang.String r6 = r12.f8096s
                java.lang.String r9 = b(r15)
                r8 = 0
                r10 = 0
                r3 = r11
                r5 = r13
                r7 = r14
                r3.<init>(r4, r5, r6, r7, r8, r9, r10)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.mediacodec.MediaCodecRenderer.DecoderInitializationException.<init>(e4.j, java.lang.Throwable, boolean, int):void");
        }

        private static String b(int i10) {
            String str = i10 < 0 ? "neg_" : "";
            int abs = Math.abs(i10);
            StringBuilder sb = new StringBuilder(str.length() + 71);
            sb.append("com.google.android.exoplayer2.mediacodec.MediaCodecRenderer_");
            sb.append(str);
            sb.append(abs);
            return sb.toString();
        }

        /* access modifiers changed from: private */
        public DecoderInitializationException c(DecoderInitializationException decoderInitializationException) {
            return new DecoderInitializationException(getMessage(), getCause(), this.f6919h, this.f6920i, this.f6921j, this.f6922k, decoderInitializationException);
        }

        private static String d(Throwable th) {
            if (th instanceof MediaCodec.CodecException) {
                return ((MediaCodec.CodecException) th).getDiagnosticInfo();
            }
            return null;
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public DecoderInitializationException(e4.j r9, java.lang.Throwable r10, boolean r11, com.google.android.exoplayer2.mediacodec.i r12) {
            /*
                r8 = this;
                java.lang.String r0 = r12.f6988a
                java.lang.String r1 = java.lang.String.valueOf(r9)
                java.lang.String r2 = java.lang.String.valueOf(r0)
                int r2 = r2.length()
                int r2 = r2 + 23
                int r3 = r1.length()
                int r2 = r2 + r3
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>(r2)
                java.lang.String r2 = "Decoder init failed: "
                r3.append(r2)
                r3.append(r0)
                java.lang.String r0 = ", "
                r3.append(r0)
                r3.append(r1)
                java.lang.String r1 = r3.toString()
                java.lang.String r3 = r9.f8096s
                int r0 = a6.m0.f205a
                r2 = 21
                if (r0 < r2) goto L_0x003b
                java.lang.String r0 = d(r10)
                goto L_0x003c
            L_0x003b:
                r0 = 0
            L_0x003c:
                r6 = r0
                r7 = 0
                r0 = r8
                r2 = r10
                r4 = r11
                r5 = r12
                r0.<init>(r1, r2, r3, r4, r5, r6, r7)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.mediacodec.MediaCodecRenderer.DecoderInitializationException.<init>(e4.j, java.lang.Throwable, boolean, com.google.android.exoplayer2.mediacodec.i):void");
        }

        private DecoderInitializationException(String str, Throwable th, String str2, boolean z10, i iVar, String str3, DecoderInitializationException decoderInitializationException) {
            super(str, th);
            this.f6919h = str2;
            this.f6920i = z10;
            this.f6921j = iVar;
            this.f6922k = str3;
            this.f6923l = decoderInitializationException;
        }
    }
}
