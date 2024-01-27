package com.google.android.exoplayer2.source;

import a6.m0;
import android.net.Uri;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.j0;
import com.google.android.exoplayer2.source.j;
import com.google.android.exoplayer2.source.k;
import e4.j;
import e4.k;
import g5.t;
import g5.u;
import g5.v;
import g5.w;
import java.util.ArrayList;
import z5.r;

/* compiled from: SilenceMediaSource */
public final class x extends a {
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public static final j f7590i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public static final j0 f7591j;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public static final byte[] f7592k = new byte[(m0.Y(2, 2) * 1024)];

    /* renamed from: g  reason: collision with root package name */
    private final long f7593g;

    /* renamed from: h  reason: collision with root package name */
    private final j0 f7594h;

    /* compiled from: SilenceMediaSource */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private long f7595a;

        /* renamed from: b  reason: collision with root package name */
        private Object f7596b;

        public x a() {
            a6.a.f(this.f7595a > 0);
            return new x(this.f7595a, x.f7591j.a().g(this.f7596b).a());
        }

        public b b(long j10) {
            this.f7595a = j10;
            return this;
        }

        public b c(Object obj) {
            this.f7596b = obj;
            return this;
        }
    }

    /* compiled from: SilenceMediaSource */
    private static final class c implements j {

        /* renamed from: j  reason: collision with root package name */
        private static final w f7597j = new w(new v(x.f7590i));

        /* renamed from: h  reason: collision with root package name */
        private final long f7598h;

        /* renamed from: i  reason: collision with root package name */
        private final ArrayList<t> f7599i = new ArrayList<>();

        public c(long j10) {
            this.f7598h = j10;
        }

        private long a(long j10) {
            return m0.s(j10, 0, this.f7598h);
        }

        public long b() {
            return Long.MIN_VALUE;
        }

        public long c(long j10, e4.v vVar) {
            return a(j10);
        }

        public boolean d(long j10) {
            return false;
        }

        public boolean f() {
            return false;
        }

        public long g() {
            return Long.MIN_VALUE;
        }

        public void h(long j10) {
        }

        public void m() {
        }

        public long n(long j10) {
            long a10 = a(j10);
            for (int i10 = 0; i10 < this.f7599i.size(); i10++) {
                ((d) this.f7599i.get(i10)).b(a10);
            }
            return a10;
        }

        public long p() {
            return -9223372036854775807L;
        }

        public void q(j.a aVar, long j10) {
            aVar.k(this);
        }

        public w r() {
            return f7597j;
        }

        public void t(long j10, boolean z10) {
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.lang.Object[]} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.lang.Object[]} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.lang.Object[]} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public long u(y5.h[] r5, boolean[] r6, g5.t[] r7, boolean[] r8, long r9) {
            /*
                r4 = this;
                long r9 = r4.a(r9)
                r0 = 0
            L_0x0005:
                int r1 = r5.length
                if (r0 >= r1) goto L_0x003d
                r1 = r7[r0]
                if (r1 == 0) goto L_0x001e
                r1 = r5[r0]
                if (r1 == 0) goto L_0x0014
                boolean r1 = r6[r0]
                if (r1 != 0) goto L_0x001e
            L_0x0014:
                java.util.ArrayList<g5.t> r1 = r4.f7599i
                r2 = r7[r0]
                r1.remove(r2)
                r1 = 0
                r7[r0] = r1
            L_0x001e:
                r1 = r7[r0]
                if (r1 != 0) goto L_0x003a
                r1 = r5[r0]
                if (r1 == 0) goto L_0x003a
                com.google.android.exoplayer2.source.x$d r1 = new com.google.android.exoplayer2.source.x$d
                long r2 = r4.f7598h
                r1.<init>(r2)
                r1.b(r9)
                java.util.ArrayList<g5.t> r2 = r4.f7599i
                r2.add(r1)
                r7[r0] = r1
                r1 = 1
                r8[r0] = r1
            L_0x003a:
                int r0 = r0 + 1
                goto L_0x0005
            L_0x003d:
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.x.c.u(y5.h[], boolean[], g5.t[], boolean[], long):long");
        }
    }

    /* compiled from: SilenceMediaSource */
    private static final class d implements t {

        /* renamed from: h  reason: collision with root package name */
        private final long f7600h;

        /* renamed from: i  reason: collision with root package name */
        private boolean f7601i;

        /* renamed from: j  reason: collision with root package name */
        private long f7602j;

        public d(long j10) {
            this.f7600h = x.G(j10);
            b(0);
        }

        public void a() {
        }

        public void b(long j10) {
            this.f7602j = m0.s(x.G(j10), 0, this.f7600h);
        }

        public boolean e() {
            return true;
        }

        public int i(k kVar, DecoderInputBuffer decoderInputBuffer, int i10) {
            if (!this.f7601i || (i10 & 2) != 0) {
                kVar.f8131b = x.f7590i;
                this.f7601i = true;
                return -5;
            }
            long j10 = this.f7600h;
            long j11 = this.f7602j;
            long j12 = j10 - j11;
            if (j12 == 0) {
                decoderInputBuffer.g(4);
                return -4;
            }
            decoderInputBuffer.f6471l = x.H(j11);
            decoderInputBuffer.g(1);
            int min = (int) Math.min((long) x.f7592k.length, j12);
            if ((i10 & 4) == 0) {
                decoderInputBuffer.t(min);
                decoderInputBuffer.f6469j.put(x.f7592k, 0, min);
            }
            if ((i10 & 1) == 0) {
                this.f7602j += (long) min;
            }
            return -4;
        }

        public int o(long j10) {
            long j11 = this.f7602j;
            b(j10);
            return (int) ((this.f7602j - j11) / ((long) x.f7592k.length));
        }
    }

    static {
        e4.j E = new j.b().e0("audio/raw").H(2).f0(44100).Y(2).E();
        f7590i = E;
        f7591j = new j0.c().d("SilenceMediaSource").h(Uri.EMPTY).e(E.f8096s).a();
    }

    /* access modifiers changed from: private */
    public static long G(long j10) {
        return ((long) m0.Y(2, 2)) * ((j10 * 44100) / 1000000);
    }

    /* access modifiers changed from: private */
    public static long H(long j10) {
        return ((j10 / ((long) m0.Y(2, 2))) * 1000000) / 44100;
    }

    /* access modifiers changed from: protected */
    public void A() {
    }

    public j0 g() {
        return this.f7594h;
    }

    public j h(k.a aVar, z5.b bVar, long j10) {
        return new c(this.f7593g);
    }

    public void l() {
    }

    public void n(j jVar) {
    }

    /* access modifiers changed from: protected */
    public void y(r rVar) {
        z(new u(this.f7593g, true, false, false, (Object) null, this.f7594h));
    }

    private x(long j10, j0 j0Var) {
        a6.a.a(j10 >= 0);
        this.f7593g = j10;
        this.f7594h = j0Var;
    }
}
