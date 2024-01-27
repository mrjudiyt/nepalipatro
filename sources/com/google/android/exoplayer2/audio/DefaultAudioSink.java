package com.google.android.exoplayer2.audio;

import a6.m0;
import a6.p;
import a6.t;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.PlaybackParams;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Pair;
import com.google.android.exoplayer2.audio.AudioProcessor;
import com.google.android.exoplayer2.audio.AudioSink;
import com.google.android.exoplayer2.audio.c;
import e4.j;
import e4.m;
import g4.r;
import g4.s;
import g4.u;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

public final class DefaultAudioSink implements AudioSink {

    /* renamed from: a0  reason: collision with root package name */
    public static boolean f6277a0 = false;
    private long A;
    private long B;
    private long C;
    private int D;
    private boolean E;
    private boolean F;
    private long G;
    private float H;
    private AudioProcessor[] I;
    private ByteBuffer[] J;
    private ByteBuffer K;
    private int L;
    private ByteBuffer M;
    private byte[] N;
    private int O;
    private int P;
    private boolean Q;
    private boolean R;
    /* access modifiers changed from: private */
    public boolean S;
    private boolean T;
    private int U;
    private r V;
    private boolean W;
    /* access modifiers changed from: private */
    public long X;
    private boolean Y;
    private boolean Z;

    /* renamed from: a  reason: collision with root package name */
    private final g4.e f6278a;

    /* renamed from: b  reason: collision with root package name */
    private final b f6279b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f6280c;

    /* renamed from: d  reason: collision with root package name */
    private final e f6281d;

    /* renamed from: e  reason: collision with root package name */
    private final l f6282e;

    /* renamed from: f  reason: collision with root package name */
    private final AudioProcessor[] f6283f;

    /* renamed from: g  reason: collision with root package name */
    private final AudioProcessor[] f6284g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public final ConditionVariable f6285h;

    /* renamed from: i  reason: collision with root package name */
    private final c f6286i;

    /* renamed from: j  reason: collision with root package name */
    private final ArrayDeque<e> f6287j;

    /* renamed from: k  reason: collision with root package name */
    private final boolean f6288k;

    /* renamed from: l  reason: collision with root package name */
    private final int f6289l;

    /* renamed from: m  reason: collision with root package name */
    private h f6290m;

    /* renamed from: n  reason: collision with root package name */
    private final f<AudioSink.InitializationException> f6291n;

    /* renamed from: o  reason: collision with root package name */
    private final f<AudioSink.WriteException> f6292o;
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public AudioSink.a f6293p;

    /* renamed from: q  reason: collision with root package name */
    private c f6294q;

    /* renamed from: r  reason: collision with root package name */
    private c f6295r;
    /* access modifiers changed from: private */

    /* renamed from: s  reason: collision with root package name */
    public AudioTrack f6296s;

    /* renamed from: t  reason: collision with root package name */
    private g4.d f6297t;

    /* renamed from: u  reason: collision with root package name */
    private e f6298u;

    /* renamed from: v  reason: collision with root package name */
    private e f6299v;

    /* renamed from: w  reason: collision with root package name */
    private m f6300w;

    /* renamed from: x  reason: collision with root package name */
    private ByteBuffer f6301x;

    /* renamed from: y  reason: collision with root package name */
    private int f6302y;

    /* renamed from: z  reason: collision with root package name */
    private long f6303z;

    public static final class InvalidAudioTrackTimestampException extends RuntimeException {
        /* synthetic */ InvalidAudioTrackTimestampException(String str, a aVar) {
            this(str);
        }

        private InvalidAudioTrackTimestampException(String str) {
            super(str);
        }
    }

    class a extends Thread {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ AudioTrack f6304h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(String str, AudioTrack audioTrack) {
            super(str);
            this.f6304h = audioTrack;
        }

        public void run() {
            try {
                this.f6304h.flush();
                this.f6304h.release();
            } finally {
                DefaultAudioSink.this.f6285h.open();
            }
        }
    }

    public interface b {
        long a(long j10);

        m b(m mVar);

        long c();

        boolean d(boolean z10);

        AudioProcessor[] e();
    }

    private static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final j f6306a;

        /* renamed from: b  reason: collision with root package name */
        public final int f6307b;

        /* renamed from: c  reason: collision with root package name */
        public final int f6308c;

        /* renamed from: d  reason: collision with root package name */
        public final int f6309d;

        /* renamed from: e  reason: collision with root package name */
        public final int f6310e;

        /* renamed from: f  reason: collision with root package name */
        public final int f6311f;

        /* renamed from: g  reason: collision with root package name */
        public final int f6312g;

        /* renamed from: h  reason: collision with root package name */
        public final int f6313h;

        /* renamed from: i  reason: collision with root package name */
        public final AudioProcessor[] f6314i;

        public c(j jVar, int i10, int i11, int i12, int i13, int i14, int i15, int i16, boolean z10, AudioProcessor[] audioProcessorArr) {
            this.f6306a = jVar;
            this.f6307b = i10;
            this.f6308c = i11;
            this.f6309d = i12;
            this.f6310e = i13;
            this.f6311f = i14;
            this.f6312g = i15;
            this.f6314i = audioProcessorArr;
            this.f6313h = c(i16, z10);
        }

        private int c(int i10, boolean z10) {
            if (i10 != 0) {
                return i10;
            }
            int i11 = this.f6308c;
            if (i11 == 0) {
                return m(z10 ? 8.0f : 1.0f);
            } else if (i11 == 1) {
                return l(50000000);
            } else {
                if (i11 == 2) {
                    return l(250000);
                }
                throw new IllegalStateException();
            }
        }

        private AudioTrack d(boolean z10, g4.d dVar, int i10) {
            int i11 = m0.f205a;
            if (i11 >= 29) {
                return f(z10, dVar, i10);
            }
            if (i11 >= 21) {
                return e(z10, dVar, i10);
            }
            return g(dVar, i10);
        }

        private AudioTrack e(boolean z10, g4.d dVar, int i10) {
            return new AudioTrack(j(dVar, z10), DefaultAudioSink.J(this.f6310e, this.f6311f, this.f6312g), this.f6313h, 1, i10);
        }

        private AudioTrack f(boolean z10, g4.d dVar, int i10) {
            AudioFormat u10 = DefaultAudioSink.J(this.f6310e, this.f6311f, this.f6312g);
            AudioAttributes j10 = j(dVar, z10);
            boolean z11 = true;
            AudioTrack.Builder sessionId = new AudioTrack.Builder().setAudioAttributes(j10).setAudioFormat(u10).setTransferMode(1).setBufferSizeInBytes(this.f6313h).setSessionId(i10);
            if (this.f6308c != 1) {
                z11 = false;
            }
            return sessionId.setOffloadedPlayback(z11).build();
        }

        private AudioTrack g(g4.d dVar, int i10) {
            int a02 = m0.a0(dVar.f8850c);
            if (i10 == 0) {
                return new AudioTrack(a02, this.f6310e, this.f6311f, this.f6312g, this.f6313h, 1);
            }
            return new AudioTrack(a02, this.f6310e, this.f6311f, this.f6312g, this.f6313h, 1, i10);
        }

        private static AudioAttributes j(g4.d dVar, boolean z10) {
            if (z10) {
                return k();
            }
            return dVar.a();
        }

        private static AudioAttributes k() {
            return new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
        }

        private int l(long j10) {
            int v10 = DefaultAudioSink.P(this.f6312g);
            if (this.f6312g == 5) {
                v10 *= 2;
            }
            return (int) ((j10 * ((long) v10)) / 1000000);
        }

        private int m(float f10) {
            int minBufferSize = AudioTrack.getMinBufferSize(this.f6310e, this.f6311f, this.f6312g);
            a6.a.f(minBufferSize != -2);
            int r10 = m0.r(minBufferSize * 4, ((int) h(250000)) * this.f6309d, Math.max(minBufferSize, ((int) h(750000)) * this.f6309d));
            return f10 != 1.0f ? Math.round(((float) r10) * f10) : r10;
        }

        public AudioTrack a(boolean z10, g4.d dVar, int i10) {
            try {
                AudioTrack d10 = d(z10, dVar, i10);
                int state = d10.getState();
                if (state == 1) {
                    return d10;
                }
                try {
                    d10.release();
                } catch (Exception unused) {
                }
                throw new AudioSink.InitializationException(state, this.f6310e, this.f6311f, this.f6313h, this.f6306a, o(), (Exception) null);
            } catch (IllegalArgumentException | UnsupportedOperationException e10) {
                throw new AudioSink.InitializationException(0, this.f6310e, this.f6311f, this.f6313h, this.f6306a, o(), e10);
            }
        }

        public boolean b(c cVar) {
            return cVar.f6308c == this.f6308c && cVar.f6312g == this.f6312g && cVar.f6310e == this.f6310e && cVar.f6311f == this.f6311f && cVar.f6309d == this.f6309d;
        }

        public long h(long j10) {
            return (j10 * ((long) this.f6310e)) / 1000000;
        }

        public long i(long j10) {
            return (j10 * 1000000) / ((long) this.f6310e);
        }

        public long n(long j10) {
            return (j10 * 1000000) / ((long) this.f6306a.G);
        }

        public boolean o() {
            return this.f6308c == 1;
        }
    }

    public static class d implements b {

        /* renamed from: a  reason: collision with root package name */
        private final AudioProcessor[] f6315a;

        /* renamed from: b  reason: collision with root package name */
        private final i f6316b;

        /* renamed from: c  reason: collision with root package name */
        private final k f6317c;

        public d(AudioProcessor... audioProcessorArr) {
            this(audioProcessorArr, new i(), new k());
        }

        public long a(long j10) {
            return this.f6317c.g(j10);
        }

        public m b(m mVar) {
            this.f6317c.i(mVar.f8134a);
            this.f6317c.h(mVar.f8135b);
            return mVar;
        }

        public long c() {
            return this.f6316b.p();
        }

        public boolean d(boolean z10) {
            this.f6316b.v(z10);
            return z10;
        }

        public AudioProcessor[] e() {
            return this.f6315a;
        }

        public d(AudioProcessor[] audioProcessorArr, i iVar, k kVar) {
            AudioProcessor[] audioProcessorArr2 = new AudioProcessor[(audioProcessorArr.length + 2)];
            this.f6315a = audioProcessorArr2;
            System.arraycopy(audioProcessorArr, 0, audioProcessorArr2, 0, audioProcessorArr.length);
            this.f6316b = iVar;
            this.f6317c = kVar;
            audioProcessorArr2[audioProcessorArr.length] = iVar;
            audioProcessorArr2[audioProcessorArr.length + 1] = kVar;
        }
    }

    private static final class e {

        /* renamed from: a  reason: collision with root package name */
        public final m f6318a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f6319b;

        /* renamed from: c  reason: collision with root package name */
        public final long f6320c;

        /* renamed from: d  reason: collision with root package name */
        public final long f6321d;

        /* synthetic */ e(m mVar, boolean z10, long j10, long j11, a aVar) {
            this(mVar, z10, j10, j11);
        }

        private e(m mVar, boolean z10, long j10, long j11) {
            this.f6318a = mVar;
            this.f6319b = z10;
            this.f6320c = j10;
            this.f6321d = j11;
        }
    }

    private static final class f<T extends Exception> {

        /* renamed from: a  reason: collision with root package name */
        private final long f6322a;

        /* renamed from: b  reason: collision with root package name */
        private T f6323b;

        /* renamed from: c  reason: collision with root package name */
        private long f6324c;

        public f(long j10) {
            this.f6322a = j10;
        }

        public void a() {
            this.f6323b = null;
        }

        public void b(T t10) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (this.f6323b == null) {
                this.f6323b = t10;
                this.f6324c = this.f6322a + elapsedRealtime;
            }
            if (elapsedRealtime >= this.f6324c) {
                T t11 = this.f6323b;
                if (t11 != t10) {
                    t11.addSuppressed(t10);
                }
                T t12 = this.f6323b;
                a();
                throw t12;
            }
        }
    }

    private final class g implements c.a {
        private g() {
        }

        public void a(int i10, long j10) {
            if (DefaultAudioSink.this.f6293p != null) {
                DefaultAudioSink.this.f6293p.d(i10, j10, SystemClock.elapsedRealtime() - DefaultAudioSink.this.X);
            }
        }

        public void b(long j10) {
            if (DefaultAudioSink.this.f6293p != null) {
                DefaultAudioSink.this.f6293p.b(j10);
            }
        }

        public void c(long j10) {
            StringBuilder sb = new StringBuilder(61);
            sb.append("Ignoring impossibly large audio latency: ");
            sb.append(j10);
            p.h("DefaultAudioSink", sb.toString());
        }

        public void d(long j10, long j11, long j12, long j13) {
            long A = DefaultAudioSink.this.S();
            long B = DefaultAudioSink.this.T();
            StringBuilder sb = new StringBuilder(182);
            sb.append("Spurious audio timestamp (frame position mismatch): ");
            sb.append(j10);
            sb.append(", ");
            sb.append(j11);
            sb.append(", ");
            sb.append(j12);
            sb.append(", ");
            sb.append(j13);
            sb.append(", ");
            sb.append(A);
            sb.append(", ");
            sb.append(B);
            String sb2 = sb.toString();
            if (!DefaultAudioSink.f6277a0) {
                p.h("DefaultAudioSink", sb2);
                return;
            }
            throw new InvalidAudioTrackTimestampException(sb2, (a) null);
        }

        public void e(long j10, long j11, long j12, long j13) {
            long A = DefaultAudioSink.this.S();
            long B = DefaultAudioSink.this.T();
            StringBuilder sb = new StringBuilder(180);
            sb.append("Spurious audio timestamp (system clock mismatch): ");
            sb.append(j10);
            sb.append(", ");
            sb.append(j11);
            sb.append(", ");
            sb.append(j12);
            sb.append(", ");
            sb.append(j13);
            sb.append(", ");
            sb.append(A);
            sb.append(", ");
            sb.append(B);
            String sb2 = sb.toString();
            if (!DefaultAudioSink.f6277a0) {
                p.h("DefaultAudioSink", sb2);
                return;
            }
            throw new InvalidAudioTrackTimestampException(sb2, (a) null);
        }

        /* synthetic */ g(DefaultAudioSink defaultAudioSink, a aVar) {
            this();
        }
    }

    private final class h {

        /* renamed from: a  reason: collision with root package name */
        private final Handler f6326a = new Handler();

        /* renamed from: b  reason: collision with root package name */
        private final AudioTrack.StreamEventCallback f6327b;

        class a extends AudioTrack.StreamEventCallback {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ DefaultAudioSink f6329a;

            a(DefaultAudioSink defaultAudioSink) {
                this.f6329a = defaultAudioSink;
            }

            public void onDataRequest(AudioTrack audioTrack, int i10) {
                a6.a.f(audioTrack == DefaultAudioSink.this.f6296s);
                if (DefaultAudioSink.this.f6293p != null && DefaultAudioSink.this.S) {
                    DefaultAudioSink.this.f6293p.g();
                }
            }

            public void onTearDown(AudioTrack audioTrack) {
                a6.a.f(audioTrack == DefaultAudioSink.this.f6296s);
                if (DefaultAudioSink.this.f6293p != null && DefaultAudioSink.this.S) {
                    DefaultAudioSink.this.f6293p.g();
                }
            }
        }

        public h() {
            this.f6327b = new a(DefaultAudioSink.this);
        }

        public void a(AudioTrack audioTrack) {
            Handler handler = this.f6326a;
            Objects.requireNonNull(handler);
            audioTrack.registerStreamEventCallback(new s(handler), this.f6327b);
        }

        public void b(AudioTrack audioTrack) {
            audioTrack.unregisterStreamEventCallback(this.f6327b);
            this.f6326a.removeCallbacksAndMessages((Object) null);
        }
    }

    public DefaultAudioSink(g4.e eVar, b bVar, boolean z10, boolean z11, int i10) {
        this.f6278a = eVar;
        this.f6279b = (b) a6.a.e(bVar);
        int i11 = m0.f205a;
        this.f6280c = i11 >= 21 && z10;
        this.f6288k = i11 >= 23 && z11;
        this.f6289l = i11 < 29 ? 0 : i10;
        this.f6285h = new ConditionVariable(true);
        this.f6286i = new c(new g(this, (a) null));
        e eVar2 = new e();
        this.f6281d = eVar2;
        l lVar = new l();
        this.f6282e = lVar;
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, new d[]{new h(), eVar2, lVar});
        Collections.addAll(arrayList, bVar.e());
        this.f6283f = (AudioProcessor[]) arrayList.toArray(new AudioProcessor[0]);
        this.f6284g = new AudioProcessor[]{new f()};
        this.H = 1.0f;
        this.f6297t = g4.d.f8846f;
        this.U = 0;
        this.V = new r(0, 0.0f);
        m mVar = m.f8132d;
        this.f6299v = new e(mVar, false, 0, 0, (a) null);
        this.f6300w = mVar;
        this.P = -1;
        this.I = new AudioProcessor[0];
        this.J = new ByteBuffer[0];
        this.f6287j = new ArrayDeque<>();
        this.f6291n = new f<>(100);
        this.f6292o = new f<>(100);
    }

    private void D(long j10) {
        m mVar;
        if (l0()) {
            mVar = this.f6279b.b(K());
        } else {
            mVar = m.f8132d;
        }
        m mVar2 = mVar;
        boolean d10 = l0() ? this.f6279b.d(R()) : false;
        this.f6287j.add(new e(mVar2, d10, Math.max(0, j10), this.f6295r.i(T()), (a) null));
        k0();
        AudioSink.a aVar = this.f6293p;
        if (aVar != null) {
            aVar.a(d10);
        }
    }

    private long E(long j10) {
        while (!this.f6287j.isEmpty() && j10 >= this.f6287j.getFirst().f6321d) {
            this.f6299v = this.f6287j.remove();
        }
        e eVar = this.f6299v;
        long j11 = j10 - eVar.f6321d;
        if (eVar.f6318a.equals(m.f8132d)) {
            return this.f6299v.f6320c + j11;
        }
        if (this.f6287j.isEmpty()) {
            return this.f6299v.f6320c + this.f6279b.a(j11);
        }
        e first = this.f6287j.getFirst();
        return first.f6320c - m0.U(first.f6321d - j10, this.f6299v.f6318a.f8134a);
    }

    private long F(long j10) {
        return j10 + this.f6295r.i(this.f6279b.c());
    }

    private AudioTrack G() {
        try {
            return ((c) a6.a.e(this.f6295r)).a(this.W, this.f6297t, this.U);
        } catch (AudioSink.InitializationException e10) {
            a0();
            AudioSink.a aVar = this.f6293p;
            if (aVar != null) {
                aVar.c(e10);
            }
            throw e10;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0018  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean H() {
        /*
            r9 = this;
            int r0 = r9.P
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 != r1) goto L_0x000b
            r9.P = r3
        L_0x0009:
            r0 = 1
            goto L_0x000c
        L_0x000b:
            r0 = 0
        L_0x000c:
            int r4 = r9.P
            com.google.android.exoplayer2.audio.AudioProcessor[] r5 = r9.I
            int r6 = r5.length
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 >= r6) goto L_0x002f
            r4 = r5[r4]
            if (r0 == 0) goto L_0x001f
            r4.f()
        L_0x001f:
            r9.c0(r7)
            boolean r0 = r4.c()
            if (r0 != 0) goto L_0x0029
            return r3
        L_0x0029:
            int r0 = r9.P
            int r0 = r0 + r2
            r9.P = r0
            goto L_0x0009
        L_0x002f:
            java.nio.ByteBuffer r0 = r9.M
            if (r0 == 0) goto L_0x003b
            r9.o0(r0, r7)
            java.nio.ByteBuffer r0 = r9.M
            if (r0 == 0) goto L_0x003b
            return r3
        L_0x003b:
            r9.P = r1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.audio.DefaultAudioSink.H():boolean");
    }

    private void I() {
        int i10 = 0;
        while (true) {
            AudioProcessor[] audioProcessorArr = this.I;
            if (i10 < audioProcessorArr.length) {
                AudioProcessor audioProcessor = audioProcessorArr[i10];
                audioProcessor.flush();
                this.J[i10] = audioProcessor.b();
                i10++;
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: private */
    public static AudioFormat J(int i10, int i11, int i12) {
        return new AudioFormat.Builder().setSampleRate(i10).setChannelMask(i11).setEncoding(i12).build();
    }

    private m K() {
        return Q().f6318a;
    }

    private static int L(int i10) {
        int i11 = m0.f205a;
        if (i11 <= 28) {
            if (i10 == 7) {
                i10 = 8;
            } else if (i10 == 3 || i10 == 4 || i10 == 5) {
                i10 = 6;
            }
        }
        if (i11 <= 26 && "fugu".equals(m0.f206b) && i10 == 1) {
            i10 = 2;
        }
        return m0.F(i10);
    }

    private static Pair<Integer, Integer> M(j jVar, g4.e eVar) {
        if (eVar == null) {
            return null;
        }
        int f10 = t.f((String) a6.a.e(jVar.f8096s), jVar.f8093p);
        int i10 = 6;
        if (!(f10 == 5 || f10 == 6 || f10 == 18 || f10 == 17 || f10 == 7 || f10 == 8 || f10 == 14)) {
            return null;
        }
        if (f10 == 18 && !eVar.f(18)) {
            f10 = 6;
        } else if (f10 == 8 && !eVar.f(8)) {
            f10 = 7;
        }
        if (!eVar.f(f10)) {
            return null;
        }
        if (f10 != 18) {
            i10 = jVar.F;
            if (i10 > eVar.e()) {
                return null;
            }
        } else if (m0.f205a >= 29 && (i10 = O(18, jVar.G)) == 0) {
            p.h("DefaultAudioSink", "E-AC3 JOC encoding supported but no channel count supported");
            return null;
        }
        int L2 = L(i10);
        if (L2 == 0) {
            return null;
        }
        return Pair.create(Integer.valueOf(f10), Integer.valueOf(L2));
    }

    private static int N(int i10, ByteBuffer byteBuffer) {
        switch (i10) {
            case 5:
            case 6:
            case 18:
                return g4.b.d(byteBuffer);
            case 7:
            case 8:
                return g4.t.e(byteBuffer);
            case 9:
                int m10 = u.m(m0.G(byteBuffer, byteBuffer.position()));
                if (m10 != -1) {
                    return m10;
                }
                throw new IllegalArgumentException();
            case 10:
                return 1024;
            case 11:
            case 12:
                return 2048;
            case 14:
                int a10 = g4.b.a(byteBuffer);
                if (a10 == -1) {
                    return 0;
                }
                return g4.b.h(byteBuffer, a10) * 16;
            case 15:
                return 512;
            case 16:
                return 1024;
            case 17:
                return g4.c.c(byteBuffer);
            default:
                StringBuilder sb = new StringBuilder(38);
                sb.append("Unexpected audio encoding: ");
                sb.append(i10);
                throw new IllegalStateException(sb.toString());
        }
    }

    private static int O(int i10, int i11) {
        AudioAttributes build = new AudioAttributes.Builder().setUsage(1).setContentType(3).build();
        for (int i12 = 8; i12 > 0; i12--) {
            if (AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i10).setSampleRate(i11).setChannelMask(m0.F(i12)).build(), build)) {
                return i12;
            }
        }
        return 0;
    }

    /* access modifiers changed from: private */
    public static int P(int i10) {
        switch (i10) {
            case 5:
                return 80000;
            case 6:
            case 18:
                return 768000;
            case 7:
                return 192000;
            case 8:
                return 2250000;
            case 9:
                return 40000;
            case 10:
                return 100000;
            case 11:
                return 16000;
            case 12:
                return 7000;
            case 14:
                return 3062500;
            case 15:
                return 8000;
            case 16:
                return 256000;
            case 17:
                return 336000;
            default:
                throw new IllegalArgumentException();
        }
    }

    private e Q() {
        e eVar = this.f6298u;
        if (eVar != null) {
            return eVar;
        }
        if (!this.f6287j.isEmpty()) {
            return this.f6287j.getLast();
        }
        return this.f6299v;
    }

    /* access modifiers changed from: private */
    public long S() {
        c cVar = this.f6295r;
        if (cVar.f6308c == 0) {
            return this.f6303z / ((long) cVar.f6307b);
        }
        return this.A;
    }

    /* access modifiers changed from: private */
    public long T() {
        c cVar = this.f6295r;
        if (cVar.f6308c == 0) {
            return this.B / ((long) cVar.f6309d);
        }
        return this.C;
    }

    private void U() {
        this.f6285h.block();
        AudioTrack G2 = G();
        this.f6296s = G2;
        if (Y(G2)) {
            d0(this.f6296s);
            if (this.f6289l != 3) {
                AudioTrack audioTrack = this.f6296s;
                j jVar = this.f6295r.f6306a;
                audioTrack.setOffloadDelayPadding(jVar.I, jVar.J);
            }
        }
        this.U = this.f6296s.getAudioSessionId();
        c cVar = this.f6286i;
        AudioTrack audioTrack2 = this.f6296s;
        c cVar2 = this.f6295r;
        cVar.t(audioTrack2, cVar2.f6308c == 2, cVar2.f6312g, cVar2.f6309d, cVar2.f6313h);
        h0();
        int i10 = this.V.f8862a;
        if (i10 != 0) {
            this.f6296s.attachAuxEffect(i10);
            this.f6296s.setAuxEffectSendLevel(this.V.f8863b);
        }
        this.F = true;
    }

    private static boolean V(int i10) {
        return (m0.f205a >= 24 && i10 == -6) || i10 == -32;
    }

    private boolean W() {
        return this.f6296s != null;
    }

    private static boolean X() {
        return m0.f205a >= 30 && m0.f208d.startsWith("Pixel");
    }

    private static boolean Y(AudioTrack audioTrack) {
        return m0.f205a >= 29 && audioTrack.isOffloadedPlayback();
    }

    private static boolean Z(j jVar, g4.e eVar) {
        return M(jVar, eVar) != null;
    }

    private void a0() {
        if (this.f6295r.o()) {
            this.Y = true;
        }
    }

    private void b0() {
        if (!this.R) {
            this.R = true;
            this.f6286i.h(T());
            this.f6296s.stop();
            this.f6302y = 0;
        }
    }

    private void c0(long j10) {
        ByteBuffer byteBuffer;
        int length = this.I.length;
        int i10 = length;
        while (i10 >= 0) {
            if (i10 > 0) {
                byteBuffer = this.J[i10 - 1];
            } else {
                byteBuffer = this.K;
                if (byteBuffer == null) {
                    byteBuffer = AudioProcessor.f6262a;
                }
            }
            if (i10 == length) {
                o0(byteBuffer, j10);
            } else {
                AudioProcessor audioProcessor = this.I[i10];
                if (i10 > this.P) {
                    audioProcessor.d(byteBuffer);
                }
                ByteBuffer b10 = audioProcessor.b();
                this.J[i10] = b10;
                if (b10.hasRemaining()) {
                    i10++;
                }
            }
            if (!byteBuffer.hasRemaining()) {
                i10--;
            } else {
                return;
            }
        }
    }

    private void d0(AudioTrack audioTrack) {
        if (this.f6290m == null) {
            this.f6290m = new h();
        }
        this.f6290m.a(audioTrack);
    }

    private void e0() {
        this.f6303z = 0;
        this.A = 0;
        this.B = 0;
        this.C = 0;
        this.Z = false;
        this.D = 0;
        this.f6299v = new e(K(), R(), 0, 0, (a) null);
        this.G = 0;
        this.f6298u = null;
        this.f6287j.clear();
        this.K = null;
        this.L = 0;
        this.M = null;
        this.R = false;
        this.Q = false;
        this.P = -1;
        this.f6301x = null;
        this.f6302y = 0;
        this.f6282e.n();
        I();
    }

    private void f0(m mVar, boolean z10) {
        e Q2 = Q();
        if (!mVar.equals(Q2.f6318a) || z10 != Q2.f6319b) {
            e eVar = new e(mVar, z10, -9223372036854775807L, -9223372036854775807L, (a) null);
            if (W()) {
                this.f6298u = eVar;
            } else {
                this.f6299v = eVar;
            }
        }
    }

    private void g0(m mVar) {
        if (W()) {
            try {
                this.f6296s.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(mVar.f8134a).setPitch(mVar.f8135b).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e10) {
                p.i("DefaultAudioSink", "Failed to set playback params", e10);
            }
            mVar = new m(this.f6296s.getPlaybackParams().getSpeed(), this.f6296s.getPlaybackParams().getPitch());
            this.f6286i.u(mVar.f8134a);
        }
        this.f6300w = mVar;
    }

    private void h0() {
        if (W()) {
            if (m0.f205a >= 21) {
                i0(this.f6296s, this.H);
            } else {
                j0(this.f6296s, this.H);
            }
        }
    }

    private static void i0(AudioTrack audioTrack, float f10) {
        audioTrack.setVolume(f10);
    }

    private static void j0(AudioTrack audioTrack, float f10) {
        audioTrack.setStereoVolume(f10, f10);
    }

    private void k0() {
        AudioProcessor[] audioProcessorArr = this.f6295r.f6314i;
        ArrayList arrayList = new ArrayList();
        for (AudioProcessor audioProcessor : audioProcessorArr) {
            if (audioProcessor.a()) {
                arrayList.add(audioProcessor);
            } else {
                audioProcessor.flush();
            }
        }
        int size = arrayList.size();
        this.I = (AudioProcessor[]) arrayList.toArray(new AudioProcessor[size]);
        this.J = new ByteBuffer[size];
        I();
    }

    private boolean l0() {
        return !this.W && "audio/raw".equals(this.f6295r.f6306a.f8096s) && !m0(this.f6295r.f6306a.H);
    }

    private boolean m0(int i10) {
        return this.f6280c && m0.i0(i10);
    }

    private boolean n0(j jVar, g4.d dVar) {
        int f10;
        int F2;
        if (m0.f205a < 29 || this.f6289l == 0 || (f10 = t.f((String) a6.a.e(jVar.f8096s), jVar.f8093p)) == 0 || (F2 = m0.F(jVar.F)) == 0 || !AudioManager.isOffloadedPlaybackSupported(J(jVar.G, F2, f10), dVar.a())) {
            return false;
        }
        boolean z10 = (jVar.I == 0 && jVar.J == 0) ? false : true;
        boolean z11 = this.f6289l == 1;
        if (!z10 || !z11 || X()) {
            return true;
        }
        return false;
    }

    private void o0(ByteBuffer byteBuffer, long j10) {
        int i10;
        if (byteBuffer.hasRemaining()) {
            ByteBuffer byteBuffer2 = this.M;
            boolean z10 = true;
            if (byteBuffer2 != null) {
                a6.a.a(byteBuffer2 == byteBuffer);
            } else {
                this.M = byteBuffer;
                if (m0.f205a < 21) {
                    int remaining = byteBuffer.remaining();
                    byte[] bArr = this.N;
                    if (bArr == null || bArr.length < remaining) {
                        this.N = new byte[remaining];
                    }
                    int position = byteBuffer.position();
                    byteBuffer.get(this.N, 0, remaining);
                    byteBuffer.position(position);
                    this.O = 0;
                }
            }
            int remaining2 = byteBuffer.remaining();
            if (m0.f205a < 21) {
                int c10 = this.f6286i.c(this.B);
                if (c10 > 0) {
                    i10 = this.f6296s.write(this.N, this.O, Math.min(remaining2, c10));
                    if (i10 > 0) {
                        this.O += i10;
                        byteBuffer.position(byteBuffer.position() + i10);
                    }
                } else {
                    i10 = 0;
                }
            } else if (this.W) {
                a6.a.f(j10 != -9223372036854775807L);
                i10 = q0(this.f6296s, byteBuffer, remaining2, j10);
            } else {
                i10 = p0(this.f6296s, byteBuffer, remaining2);
            }
            this.X = SystemClock.elapsedRealtime();
            if (i10 < 0) {
                boolean V2 = V(i10);
                if (V2) {
                    a0();
                }
                AudioSink.WriteException writeException = new AudioSink.WriteException(i10, this.f6295r.f6306a, V2);
                AudioSink.a aVar = this.f6293p;
                if (aVar != null) {
                    aVar.c(writeException);
                }
                if (!writeException.f6275i) {
                    this.f6292o.b(writeException);
                    return;
                }
                throw writeException;
            }
            this.f6292o.a();
            if (Y(this.f6296s)) {
                long j11 = this.C;
                if (j11 > 0) {
                    this.Z = false;
                }
                if (this.S && this.f6293p != null && i10 < remaining2 && !this.Z) {
                    this.f6293p.e(this.f6286i.e(j11));
                }
            }
            int i11 = this.f6295r.f6308c;
            if (i11 == 0) {
                this.B += (long) i10;
            }
            if (i10 == remaining2) {
                if (i11 != 0) {
                    if (byteBuffer != this.K) {
                        z10 = false;
                    }
                    a6.a.f(z10);
                    this.C += (long) (this.D * this.L);
                }
                this.M = null;
            }
        }
    }

    private static int p0(AudioTrack audioTrack, ByteBuffer byteBuffer, int i10) {
        return audioTrack.write(byteBuffer, i10, 1);
    }

    private int q0(AudioTrack audioTrack, ByteBuffer byteBuffer, int i10, long j10) {
        if (m0.f205a >= 26) {
            return audioTrack.write(byteBuffer, i10, 1, j10 * 1000);
        }
        if (this.f6301x == null) {
            ByteBuffer allocate = ByteBuffer.allocate(16);
            this.f6301x = allocate;
            allocate.order(ByteOrder.BIG_ENDIAN);
            this.f6301x.putInt(1431633921);
        }
        if (this.f6302y == 0) {
            this.f6301x.putInt(4, i10);
            this.f6301x.putLong(8, j10 * 1000);
            this.f6301x.position(0);
            this.f6302y = i10;
        }
        int remaining = this.f6301x.remaining();
        if (remaining > 0) {
            int write = audioTrack.write(this.f6301x, remaining, 1);
            if (write < 0) {
                this.f6302y = 0;
                return write;
            } else if (write < remaining) {
                return 0;
            }
        }
        int p02 = p0(audioTrack, byteBuffer, i10);
        if (p02 < 0) {
            this.f6302y = 0;
            return p02;
        }
        this.f6302y -= p02;
        return p02;
    }

    public boolean R() {
        return Q().f6319b;
    }

    public boolean a(j jVar) {
        return n(jVar) != 0;
    }

    public void b() {
        if (!this.Q && W() && H()) {
            b0();
            this.Q = true;
        }
    }

    public boolean c() {
        return !W() || (this.Q && !d());
    }

    public boolean d() {
        return W() && this.f6286i.i(T());
    }

    public void e() {
        this.S = true;
        if (W()) {
            this.f6286i.v();
            this.f6296s.play();
        }
    }

    public void f(int i10) {
        if (this.U != i10) {
            this.U = i10;
            this.T = i10 != 0;
            flush();
        }
    }

    public void flush() {
        if (W()) {
            e0();
            if (this.f6286i.j()) {
                this.f6296s.pause();
            }
            if (Y(this.f6296s)) {
                ((h) a6.a.e(this.f6290m)).b(this.f6296s);
            }
            AudioTrack audioTrack = this.f6296s;
            this.f6296s = null;
            if (m0.f205a < 21 && !this.T) {
                this.U = 0;
            }
            c cVar = this.f6294q;
            if (cVar != null) {
                this.f6295r = cVar;
                this.f6294q = null;
            }
            this.f6286i.r();
            this.f6285h.close();
            new a("ExoPlayer:AudioTrackReleaseThread", audioTrack).start();
        }
        this.f6292o.a();
        this.f6291n.a();
    }

    public void g(m mVar) {
        m mVar2 = new m(m0.q(mVar.f8134a, 0.1f, 8.0f), m0.q(mVar.f8135b, 0.1f, 8.0f));
        if (!this.f6288k || m0.f205a < 23) {
            f0(mVar2, R());
        } else {
            g0(mVar2);
        }
    }

    public long h(boolean z10) {
        if (!W() || this.F) {
            return Long.MIN_VALUE;
        }
        return F(E(Math.min(this.f6286i.d(z10), this.f6295r.i(T()))));
    }

    public m i() {
        if (this.f6288k) {
            return this.f6300w;
        }
        return K();
    }

    public void j() {
        if (this.W) {
            this.W = false;
            flush();
        }
    }

    public void k(g4.d dVar) {
        if (!this.f6297t.equals(dVar)) {
            this.f6297t = dVar;
            if (!this.W) {
                flush();
            }
        }
    }

    public void l() {
        this.E = true;
    }

    public void m() {
        a6.a.f(m0.f205a >= 21);
        a6.a.f(this.T);
        if (!this.W) {
            this.W = true;
            flush();
        }
    }

    public int n(j jVar) {
        if (!"audio/raw".equals(jVar.f8096s)) {
            return ((this.Y || !n0(jVar, this.f6297t)) && !Z(jVar, this.f6278a)) ? 0 : 2;
        }
        if (!m0.j0(jVar.H)) {
            int i10 = jVar.H;
            StringBuilder sb = new StringBuilder(33);
            sb.append("Invalid PCM encoding: ");
            sb.append(i10);
            p.h("DefaultAudioSink", sb.toString());
            return 0;
        }
        int i11 = jVar.H;
        if (i11 == 2 || (this.f6280c && i11 == 4)) {
            return 2;
        }
        return 1;
    }

    public void o(r rVar) {
        if (!this.V.equals(rVar)) {
            int i10 = rVar.f8862a;
            float f10 = rVar.f8863b;
            AudioTrack audioTrack = this.f6296s;
            if (audioTrack != null) {
                if (this.V.f8862a != i10) {
                    audioTrack.attachAuxEffect(i10);
                }
                if (i10 != 0) {
                    this.f6296s.setAuxEffectSendLevel(f10);
                }
            }
            this.V = rVar;
        }
    }

    public void p(j jVar, int i10, int[] iArr) {
        AudioProcessor[] audioProcessorArr;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        AudioProcessor[] audioProcessorArr2;
        int[] iArr2;
        j jVar2 = jVar;
        if ("audio/raw".equals(jVar2.f8096s)) {
            a6.a.a(m0.j0(jVar2.H));
            i16 = m0.Y(jVar2.H, jVar2.F);
            if (m0(jVar2.H)) {
                audioProcessorArr2 = this.f6284g;
            } else {
                audioProcessorArr2 = this.f6283f;
            }
            this.f6282e.o(jVar2.I, jVar2.J);
            if (m0.f205a < 21 && jVar2.F == 8 && iArr == null) {
                iArr2 = new int[6];
                for (int i17 = 0; i17 < 6; i17++) {
                    iArr2[i17] = i17;
                }
            } else {
                iArr2 = iArr;
            }
            this.f6281d.m(iArr2);
            AudioProcessor.a aVar = new AudioProcessor.a(jVar2.G, jVar2.F, jVar2.H);
            int length = audioProcessorArr2.length;
            int i18 = 0;
            while (i18 < length) {
                AudioProcessor audioProcessor = audioProcessorArr2[i18];
                try {
                    AudioProcessor.a e10 = audioProcessor.e(aVar);
                    if (audioProcessor.a()) {
                        aVar = e10;
                    }
                    i18++;
                } catch (AudioProcessor.UnhandledAudioFormatException e11) {
                    throw new AudioSink.ConfigurationException((Throwable) e11, jVar);
                }
            }
            int i19 = aVar.f6266c;
            i13 = aVar.f6264a;
            i12 = m0.F(aVar.f6265b);
            audioProcessorArr = audioProcessorArr2;
            i11 = i19;
            i14 = m0.Y(i19, aVar.f6265b);
            i15 = 0;
        } else {
            AudioProcessor[] audioProcessorArr3 = new AudioProcessor[0];
            int i20 = jVar2.G;
            if (n0(jVar, this.f6297t)) {
                audioProcessorArr = audioProcessorArr3;
                i11 = t.f((String) a6.a.e(jVar2.f8096s), jVar2.f8093p);
                i12 = m0.F(jVar2.F);
                i16 = -1;
                i14 = -1;
                i13 = i20;
                i15 = 1;
            } else {
                Pair<Integer, Integer> M2 = M(jVar, this.f6278a);
                if (M2 != null) {
                    audioProcessorArr = audioProcessorArr3;
                    i11 = ((Integer) M2.first).intValue();
                    i16 = -1;
                    i14 = -1;
                    i12 = ((Integer) M2.second).intValue();
                    i13 = i20;
                    i15 = 2;
                } else {
                    String valueOf = String.valueOf(jVar);
                    StringBuilder sb = new StringBuilder(valueOf.length() + 37);
                    sb.append("Unable to configure passthrough for: ");
                    sb.append(valueOf);
                    throw new AudioSink.ConfigurationException(sb.toString(), jVar);
                }
            }
        }
        if (i11 == 0) {
            String valueOf2 = String.valueOf(jVar);
            StringBuilder sb2 = new StringBuilder(valueOf2.length() + 48);
            sb2.append("Invalid output encoding (mode=");
            sb2.append(i15);
            sb2.append(") for: ");
            sb2.append(valueOf2);
            throw new AudioSink.ConfigurationException(sb2.toString(), jVar);
        } else if (i12 != 0) {
            this.Y = false;
            c cVar = new c(jVar, i16, i15, i14, i13, i12, i11, i10, this.f6288k, audioProcessorArr);
            if (W()) {
                this.f6294q = cVar;
            } else {
                this.f6295r = cVar;
            }
        } else {
            String valueOf3 = String.valueOf(jVar);
            StringBuilder sb3 = new StringBuilder(valueOf3.length() + 54);
            sb3.append("Invalid output channel config (mode=");
            sb3.append(i15);
            sb3.append(") for: ");
            sb3.append(valueOf3);
            throw new AudioSink.ConfigurationException(sb3.toString(), jVar);
        }
    }

    public void pause() {
        this.S = false;
        if (W() && this.f6286i.q()) {
            this.f6296s.pause();
        }
    }

    public boolean q(ByteBuffer byteBuffer, long j10, int i10) {
        ByteBuffer byteBuffer2 = byteBuffer;
        long j11 = j10;
        int i11 = i10;
        ByteBuffer byteBuffer3 = this.K;
        a6.a.a(byteBuffer3 == null || byteBuffer2 == byteBuffer3);
        if (this.f6294q != null) {
            if (!H()) {
                return false;
            }
            if (!this.f6294q.b(this.f6295r)) {
                b0();
                if (d()) {
                    return false;
                }
                flush();
            } else {
                this.f6295r = this.f6294q;
                this.f6294q = null;
                if (Y(this.f6296s) && this.f6289l != 3) {
                    this.f6296s.setOffloadEndOfStream();
                    AudioTrack audioTrack = this.f6296s;
                    j jVar = this.f6295r.f6306a;
                    audioTrack.setOffloadDelayPadding(jVar.I, jVar.J);
                    this.Z = true;
                }
            }
            D(j11);
        }
        if (!W()) {
            try {
                U();
            } catch (AudioSink.InitializationException e10) {
                AudioSink.InitializationException initializationException = e10;
                if (!initializationException.f6270i) {
                    this.f6291n.b(initializationException);
                    return false;
                }
                throw initializationException;
            }
        }
        this.f6291n.a();
        if (this.F) {
            this.G = Math.max(0, j11);
            this.E = false;
            this.F = false;
            if (this.f6288k && m0.f205a >= 23) {
                g0(this.f6300w);
            }
            D(j11);
            if (this.S) {
                e();
            }
        }
        if (!this.f6286i.l(T())) {
            return false;
        }
        if (this.K == null) {
            a6.a.a(byteBuffer.order() == ByteOrder.LITTLE_ENDIAN);
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            c cVar = this.f6295r;
            if (cVar.f6308c != 0 && this.D == 0) {
                int N2 = N(cVar.f6312g, byteBuffer2);
                this.D = N2;
                if (N2 == 0) {
                    return true;
                }
            }
            if (this.f6298u != null) {
                if (!H()) {
                    return false;
                }
                D(j11);
                this.f6298u = null;
            }
            long n10 = this.G + this.f6295r.n(S() - this.f6282e.m());
            if (!this.E && Math.abs(n10 - j11) > 200000) {
                this.f6293p.c(new AudioSink.UnexpectedDiscontinuityException(j11, n10));
                this.E = true;
            }
            if (this.E) {
                if (!H()) {
                    return false;
                }
                long j12 = j11 - n10;
                this.G += j12;
                this.E = false;
                D(j11);
                AudioSink.a aVar = this.f6293p;
                if (!(aVar == null || j12 == 0)) {
                    aVar.f();
                }
            }
            if (this.f6295r.f6308c == 0) {
                this.f6303z += (long) byteBuffer.remaining();
            } else {
                this.A += (long) (this.D * i11);
            }
            this.K = byteBuffer2;
            this.L = i11;
        }
        c0(j11);
        if (!this.K.hasRemaining()) {
            this.K = null;
            this.L = 0;
            return true;
        } else if (!this.f6286i.k(T())) {
            return false;
        } else {
            p.h("DefaultAudioSink", "Resetting stalled audio track");
            flush();
            return true;
        }
    }

    public void r(AudioSink.a aVar) {
        this.f6293p = aVar;
    }

    public void reset() {
        flush();
        for (AudioProcessor reset : this.f6283f) {
            reset.reset();
        }
        for (AudioProcessor reset2 : this.f6284g) {
            reset2.reset();
        }
        this.S = false;
        this.Y = false;
    }

    public void s() {
        if (m0.f205a < 25) {
            flush();
            return;
        }
        this.f6292o.a();
        this.f6291n.a();
        if (W()) {
            e0();
            if (this.f6286i.j()) {
                this.f6296s.pause();
            }
            this.f6296s.flush();
            this.f6286i.r();
            c cVar = this.f6286i;
            AudioTrack audioTrack = this.f6296s;
            c cVar2 = this.f6295r;
            cVar.t(audioTrack, cVar2.f6308c == 2, cVar2.f6312g, cVar2.f6309d, cVar2.f6313h);
            this.F = true;
        }
    }

    public void setVolume(float f10) {
        if (this.H != f10) {
            this.H = f10;
            h0();
        }
    }

    public void t(boolean z10) {
        f0(K(), z10);
    }
}
