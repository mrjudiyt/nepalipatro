package com.google.android.exoplayer2.audio;

import a6.m0;
import a6.p;
import a6.r;
import a6.s;
import a6.t;
import android.annotation.SuppressLint;
import android.content.Context;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.view.Surface;
import com.google.android.exoplayer2.audio.AudioSink;
import com.google.android.exoplayer2.audio.a;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.mediacodec.MediaCodecRenderer;
import com.google.android.exoplayer2.mediacodec.MediaCodecUtil;
import com.google.android.exoplayer2.mediacodec.h;
import com.google.android.exoplayer2.mediacodec.i;
import com.google.android.exoplayer2.w0;
import e4.j;
import e4.k;
import e4.m;
import g4.d;
import h4.e;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: MediaCodecAudioRenderer */
public class g extends MediaCodecRenderer implements r {
    private final Context P0;
    /* access modifiers changed from: private */
    public final a.C0109a Q0;
    private final AudioSink R0;
    private int S0;
    private boolean T0;
    private j U0;
    private long V0;
    private boolean W0;
    private boolean X0;
    private boolean Y0;
    private boolean Z0;
    /* access modifiers changed from: private */

    /* renamed from: a1  reason: collision with root package name */
    public w0.a f6380a1;

    /* compiled from: MediaCodecAudioRenderer */
    private final class b implements AudioSink.a {
        private b() {
        }

        public void a(boolean z10) {
            g.this.Q0.C(z10);
        }

        public void b(long j10) {
            g.this.Q0.B(j10);
        }

        public void c(Exception exc) {
            p.d("MediaCodecAudioRenderer", "Audio sink error", exc);
            g.this.Q0.l(exc);
        }

        public void d(int i10, long j10, long j11) {
            g.this.Q0.D(i10, j10, j11);
        }

        public void e(long j10) {
            if (g.this.f6380a1 != null) {
                g.this.f6380a1.b(j10);
            }
        }

        public void f() {
            g.this.x1();
        }

        public void g() {
            if (g.this.f6380a1 != null) {
                g.this.f6380a1.a();
            }
        }
    }

    public g(Context context, com.google.android.exoplayer2.mediacodec.j jVar, boolean z10, Handler handler, a aVar, AudioSink audioSink) {
        this(context, h.b.f6987a, jVar, z10, handler, aVar, audioSink);
    }

    private static boolean s1(String str) {
        if (m0.f205a < 24 && "OMX.SEC.aac.dec".equals(str) && "samsung".equals(m0.f207c)) {
            String str2 = m0.f206b;
            if (str2.startsWith("zeroflte") || str2.startsWith("herolte") || str2.startsWith("heroqlte")) {
                return true;
            }
        }
        return false;
    }

    private static boolean t1() {
        if (m0.f205a == 23) {
            String str = m0.f208d;
            if ("ZTE B2017G".equals(str) || "AXON 7 mini".equals(str)) {
                return true;
            }
        }
        return false;
    }

    private int u1(i iVar, j jVar) {
        int i10;
        if (!"OMX.google.raw.decoder".equals(iVar.f6988a) || (i10 = m0.f205a) >= 24 || (i10 == 23 && m0.m0(this.P0))) {
            return jVar.f8097t;
        }
        return -1;
    }

    private void y1() {
        long h10 = this.R0.h(c());
        if (h10 != Long.MIN_VALUE) {
            if (!this.X0) {
                h10 = Math.max(this.V0, h10);
            }
            this.V0 = h10;
            this.X0 = false;
        }
    }

    /* access modifiers changed from: protected */
    public void G() {
        this.Y0 = true;
        try {
            this.R0.flush();
            try {
                super.G();
            } finally {
                this.Q0.o(this.K0);
            }
        } catch (Throwable th) {
            super.G();
            throw th;
        } finally {
            this.Q0.o(this.K0);
        }
    }

    /* access modifiers changed from: protected */
    public void H(boolean z10, boolean z11) {
        super.H(z10, z11);
        this.Q0.p(this.K0);
        if (B().f8138a) {
            this.R0.m();
        } else {
            this.R0.j();
        }
    }

    /* access modifiers changed from: protected */
    public void I(long j10, boolean z10) {
        super.I(j10, z10);
        if (this.Z0) {
            this.R0.s();
        } else {
            this.R0.flush();
        }
        this.V0 = j10;
        this.W0 = true;
        this.X0 = true;
    }

    /* access modifiers changed from: protected */
    public void J() {
        try {
            super.J();
        } finally {
            if (this.Y0) {
                this.Y0 = false;
                this.R0.reset();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void K() {
        super.K();
        this.R0.e();
    }

    /* access modifiers changed from: protected */
    public void L() {
        y1();
        this.R0.pause();
        super.L();
    }

    /* access modifiers changed from: protected */
    public void L0(Exception exc) {
        p.d("MediaCodecAudioRenderer", "Audio codec error", exc);
        this.Q0.k(exc);
    }

    /* access modifiers changed from: protected */
    public void M0(String str, long j10, long j11) {
        this.Q0.m(str, j10, j11);
    }

    /* access modifiers changed from: protected */
    public void N0(String str) {
        this.Q0.n(str);
    }

    /* access modifiers changed from: protected */
    public e O0(k kVar) {
        e O0 = super.O0(kVar);
        this.Q0.q(kVar.f8131b, O0);
        return O0;
    }

    /* access modifiers changed from: protected */
    public void P0(j jVar, MediaFormat mediaFormat) {
        int i10;
        int i11;
        j jVar2 = this.U0;
        int[] iArr = null;
        if (jVar2 != null) {
            jVar = jVar2;
        } else if (q0() != null) {
            if ("audio/raw".equals(jVar.f8096s)) {
                i10 = jVar.H;
            } else if (m0.f205a >= 24 && mediaFormat.containsKey("pcm-encoding")) {
                i10 = mediaFormat.getInteger("pcm-encoding");
            } else if (mediaFormat.containsKey("v-bits-per-sample")) {
                i10 = m0.W(mediaFormat.getInteger("v-bits-per-sample"));
            } else {
                i10 = "audio/raw".equals(jVar.f8096s) ? jVar.H : 2;
            }
            j E = new j.b().e0("audio/raw").Y(i10).M(jVar.I).N(jVar.J).H(mediaFormat.getInteger("channel-count")).f0(mediaFormat.getInteger("sample-rate")).E();
            if (this.T0 && E.F == 6 && (i11 = jVar.F) < 6) {
                iArr = new int[i11];
                for (int i12 = 0; i12 < jVar.F; i12++) {
                    iArr[i12] = i12;
                }
            }
            jVar = E;
        }
        try {
            this.R0.p(jVar, 0, iArr);
        } catch (AudioSink.ConfigurationException e10) {
            throw z(e10, e10.f6268h, 5001);
        }
    }

    /* access modifiers changed from: protected */
    public e R(i iVar, j jVar, j jVar2) {
        int i10;
        e e10 = iVar.e(jVar, jVar2);
        int i11 = e10.f8969e;
        if (u1(iVar, jVar2) > this.S0) {
            i11 |= 64;
        }
        int i12 = i11;
        String str = iVar.f6988a;
        if (i12 != 0) {
            i10 = 0;
        } else {
            i10 = e10.f8968d;
        }
        return new e(str, jVar, jVar2, i10, i12);
    }

    /* access modifiers changed from: protected */
    public void R0() {
        super.R0();
        this.R0.l();
    }

    /* access modifiers changed from: protected */
    public void S0(DecoderInputBuffer decoderInputBuffer) {
        if (this.W0 && !decoderInputBuffer.o()) {
            if (Math.abs(decoderInputBuffer.f6471l - this.V0) > 500000) {
                this.V0 = decoderInputBuffer.f6471l;
            }
            this.W0 = false;
        }
    }

    /* access modifiers changed from: protected */
    public boolean U0(long j10, long j11, h hVar, ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z10, boolean z11, j jVar) {
        a6.a.e(byteBuffer);
        if (this.U0 != null && (i11 & 2) != 0) {
            ((h) a6.a.e(hVar)).h(i10, false);
            return true;
        } else if (z10) {
            if (hVar != null) {
                hVar.h(i10, false);
            }
            this.K0.f8959f += i12;
            this.R0.l();
            return true;
        } else {
            try {
                if (!this.R0.q(byteBuffer, j12, i12)) {
                    return false;
                }
                if (hVar != null) {
                    hVar.h(i10, false);
                }
                this.K0.f8958e += i12;
                return true;
            } catch (AudioSink.InitializationException e10) {
                throw A(e10, e10.f6271j, e10.f6270i, 5001);
            } catch (AudioSink.WriteException e11) {
                throw A(e11, jVar, e11.f6275i, 5002);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void Z0() {
        try {
            this.R0.b();
        } catch (AudioSink.WriteException e10) {
            throw A(e10, e10.f6276j, e10.f6275i, 5002);
        }
    }

    public String b() {
        return "MediaCodecAudioRenderer";
    }

    public boolean c() {
        return super.c() && this.R0.c();
    }

    public boolean e() {
        return this.R0.d() || super.e();
    }

    public void g(m mVar) {
        this.R0.g(mVar);
    }

    public m i() {
        return this.R0.i();
    }

    /* access modifiers changed from: protected */
    public boolean k1(j jVar) {
        return this.R0.a(jVar);
    }

    /* access modifiers changed from: protected */
    public int l1(com.google.android.exoplayer2.mediacodec.j jVar, j jVar2) {
        if (!t.p(jVar2.f8096s)) {
            return e4.r.a(0);
        }
        int i10 = m0.f205a >= 21 ? 32 : 0;
        boolean z10 = jVar2.L != null;
        boolean m12 = MediaCodecRenderer.m1(jVar2);
        int i11 = 8;
        int i12 = 4;
        if (m12 && this.R0.a(jVar2) && (!z10 || MediaCodecUtil.u() != null)) {
            return e4.r.b(4, 8, i10);
        }
        if ("audio/raw".equals(jVar2.f8096s) && !this.R0.a(jVar2)) {
            return e4.r.a(1);
        }
        if (!this.R0.a(m0.X(2, jVar2.F, jVar2.G))) {
            return e4.r.a(1);
        }
        List<i> v02 = v0(jVar, jVar2, false);
        if (v02.isEmpty()) {
            return e4.r.a(1);
        }
        if (!m12) {
            return e4.r.a(2);
        }
        i iVar = v02.get(0);
        boolean m10 = iVar.m(jVar2);
        if (m10 && iVar.o(jVar2)) {
            i11 = 16;
        }
        if (!m10) {
            i12 = 3;
        }
        return e4.r.b(i12, i11, i10);
    }

    public long n() {
        if (d() == 2) {
            y1();
        }
        return this.V0;
    }

    public void r(int i10, Object obj) {
        if (i10 == 2) {
            this.R0.setVolume(((Float) obj).floatValue());
        } else if (i10 == 3) {
            this.R0.k((d) obj);
        } else if (i10 != 5) {
            switch (i10) {
                case 101:
                    this.R0.t(((Boolean) obj).booleanValue());
                    return;
                case 102:
                    this.R0.f(((Integer) obj).intValue());
                    return;
                case 103:
                    this.f6380a1 = (w0.a) obj;
                    return;
                default:
                    super.r(i10, obj);
                    return;
            }
        } else {
            this.R0.o((g4.r) obj);
        }
    }

    /* access modifiers changed from: protected */
    public float t0(float f10, j jVar, j[] jVarArr) {
        int i10 = -1;
        for (j jVar2 : jVarArr) {
            int i11 = jVar2.G;
            if (i11 != -1) {
                i10 = Math.max(i10, i11);
            }
        }
        if (i10 == -1) {
            return -1.0f;
        }
        return f10 * ((float) i10);
    }

    /* access modifiers changed from: protected */
    public List<i> v0(com.google.android.exoplayer2.mediacodec.j jVar, j jVar2, boolean z10) {
        i u10;
        String str = jVar2.f8096s;
        if (str == null) {
            return Collections.emptyList();
        }
        if (this.R0.a(jVar2) && (u10 = MediaCodecUtil.u()) != null) {
            return Collections.singletonList(u10);
        }
        List<i> t10 = MediaCodecUtil.t(jVar.a(str, z10, false), jVar2);
        if ("audio/eac3-joc".equals(str)) {
            ArrayList arrayList = new ArrayList(t10);
            arrayList.addAll(jVar.a("audio/eac3", z10, false));
            t10 = arrayList;
        }
        return Collections.unmodifiableList(t10);
    }

    /* access modifiers changed from: protected */
    public int v1(i iVar, j jVar, j[] jVarArr) {
        int u12 = u1(iVar, jVar);
        if (jVarArr.length == 1) {
            return u12;
        }
        for (j jVar2 : jVarArr) {
            if (iVar.e(jVar, jVar2).f8968d != 0) {
                u12 = Math.max(u12, u1(iVar, jVar2));
            }
        }
        return u12;
    }

    /* access modifiers changed from: protected */
    @SuppressLint({"InlinedApi"})
    public MediaFormat w1(j jVar, String str, int i10, float f10) {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("channel-count", jVar.F);
        mediaFormat.setInteger("sample-rate", jVar.G);
        s.e(mediaFormat, jVar.f8098u);
        s.d(mediaFormat, "max-input-size", i10);
        int i11 = m0.f205a;
        if (i11 >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f10 != -1.0f && !t1()) {
                mediaFormat.setFloat("operating-rate", f10);
            }
        }
        if (i11 <= 28 && "audio/ac4".equals(jVar.f8096s)) {
            mediaFormat.setInteger("ac4-is-sync", 1);
        }
        if (i11 >= 24 && this.R0.n(m0.X(4, jVar.F, jVar.G)) == 2) {
            mediaFormat.setInteger("pcm-encoding", 4);
        }
        return mediaFormat;
    }

    /* access modifiers changed from: protected */
    public h.a x0(i iVar, j jVar, MediaCrypto mediaCrypto, float f10) {
        this.S0 = v1(iVar, jVar, E());
        this.T0 = s1(iVar.f6988a);
        MediaFormat w12 = w1(jVar, iVar.f6990c, this.S0, f10);
        this.U0 = "audio/raw".equals(iVar.f6989b) && !"audio/raw".equals(jVar.f8096s) ? jVar : null;
        return new h.a(iVar, w12, jVar, (Surface) null, mediaCrypto, 0);
    }

    /* access modifiers changed from: protected */
    public void x1() {
        this.X0 = true;
    }

    public r y() {
        return this;
    }

    public g(Context context, h.b bVar, com.google.android.exoplayer2.mediacodec.j jVar, boolean z10, Handler handler, a aVar, AudioSink audioSink) {
        super(1, bVar, jVar, z10, 44100.0f);
        this.P0 = context.getApplicationContext();
        this.R0 = audioSink;
        this.Q0 = new a.C0109a(handler, aVar);
        audioSink.r(new b());
    }
}
