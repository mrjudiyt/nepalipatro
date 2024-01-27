package com.google.android.exoplayer2.source;

import a6.m0;
import android.net.Uri;
import android.os.Handler;
import com.facebook.appevents.AppEventsConstants;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.drm.i;
import com.google.android.exoplayer2.source.g;
import com.google.android.exoplayer2.source.j;
import com.google.android.exoplayer2.source.l;
import com.google.android.exoplayer2.source.u;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.android.exoplayer2.upstream.b;
import com.google.android.exoplayer2.upstream.g;
import e4.j;
import g5.h;
import g5.t;
import g5.v;
import g5.w;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import k4.b0;
import k4.k;
import k4.x;
import k4.y;

/* compiled from: ProgressiveMediaPeriod */
final class q implements j, k, Loader.b<a>, Loader.f, u.d {
    /* access modifiers changed from: private */
    public static final Map<String, String> T = K();
    /* access modifiers changed from: private */
    public static final j U = new j.b().S("icy").e0("application/x-icy").E();
    private d[] A;
    private boolean B;
    private boolean C;
    private boolean D;
    private e E;
    private y F;
    private long G;
    private boolean H;
    private int I;
    private boolean J;
    private boolean K;
    private int L;
    private long M;
    private long N;
    private long O;
    private boolean P;
    private int Q;
    private boolean R;
    private boolean S;

    /* renamed from: h  reason: collision with root package name */
    private final Uri f7475h;

    /* renamed from: i  reason: collision with root package name */
    private final com.google.android.exoplayer2.upstream.a f7476i;

    /* renamed from: j  reason: collision with root package name */
    private final com.google.android.exoplayer2.drm.j f7477j;

    /* renamed from: k  reason: collision with root package name */
    private final g f7478k;

    /* renamed from: l  reason: collision with root package name */
    private final l.a f7479l;

    /* renamed from: m  reason: collision with root package name */
    private final i.a f7480m;

    /* renamed from: n  reason: collision with root package name */
    private final b f7481n;

    /* renamed from: o  reason: collision with root package name */
    private final z5.b f7482o;
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public final String f7483p;
    /* access modifiers changed from: private */

    /* renamed from: q  reason: collision with root package name */
    public final long f7484q;

    /* renamed from: r  reason: collision with root package name */
    private final Loader f7485r = new Loader("ProgressiveMediaPeriod");

    /* renamed from: s  reason: collision with root package name */
    private final m f7486s;

    /* renamed from: t  reason: collision with root package name */
    private final a6.e f7487t;

    /* renamed from: u  reason: collision with root package name */
    private final Runnable f7488u;
    /* access modifiers changed from: private */

    /* renamed from: v  reason: collision with root package name */
    public final Runnable f7489v;
    /* access modifiers changed from: private */

    /* renamed from: w  reason: collision with root package name */
    public final Handler f7490w;

    /* renamed from: x  reason: collision with root package name */
    private j.a f7491x;
    /* access modifiers changed from: private */

    /* renamed from: y  reason: collision with root package name */
    public b5.b f7492y;

    /* renamed from: z  reason: collision with root package name */
    private u[] f7493z;

    /* compiled from: ProgressiveMediaPeriod */
    final class a implements Loader.e, g.a {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final long f7494a = h.a();

        /* renamed from: b  reason: collision with root package name */
        private final Uri f7495b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public final z5.q f7496c;

        /* renamed from: d  reason: collision with root package name */
        private final m f7497d;

        /* renamed from: e  reason: collision with root package name */
        private final k f7498e;

        /* renamed from: f  reason: collision with root package name */
        private final a6.e f7499f;

        /* renamed from: g  reason: collision with root package name */
        private final x f7500g = new x();

        /* renamed from: h  reason: collision with root package name */
        private volatile boolean f7501h;

        /* renamed from: i  reason: collision with root package name */
        private boolean f7502i = true;
        /* access modifiers changed from: private */

        /* renamed from: j  reason: collision with root package name */
        public long f7503j;
        /* access modifiers changed from: private */

        /* renamed from: k  reason: collision with root package name */
        public com.google.android.exoplayer2.upstream.b f7504k = j(0);
        /* access modifiers changed from: private */

        /* renamed from: l  reason: collision with root package name */
        public long f7505l = -1;

        /* renamed from: m  reason: collision with root package name */
        private b0 f7506m;

        /* renamed from: n  reason: collision with root package name */
        private boolean f7507n;

        public a(Uri uri, com.google.android.exoplayer2.upstream.a aVar, m mVar, k kVar, a6.e eVar) {
            this.f7495b = uri;
            this.f7496c = new z5.q(aVar);
            this.f7497d = mVar;
            this.f7498e = kVar;
            this.f7499f = eVar;
        }

        private com.google.android.exoplayer2.upstream.b j(long j10) {
            return new b.C0120b().i(this.f7495b).h(j10).f(q.this.f7483p).b(6).e(q.T).a();
        }

        /* access modifiers changed from: private */
        public void k(long j10, long j11) {
            this.f7500g.f9627a = j10;
            this.f7503j = j11;
            this.f7502i = true;
            this.f7507n = false;
        }

        public void a(a6.y yVar) {
            long max = !this.f7507n ? this.f7503j : Math.max(q.this.M(), this.f7503j);
            int a10 = yVar.a();
            b0 b0Var = (b0) a6.a.e(this.f7506m);
            b0Var.a(yVar, a10);
            b0Var.e(max, 1, a10, 0, (b0.a) null);
            this.f7507n = true;
        }

        public void b() {
            int i10 = 0;
            while (i10 == 0 && !this.f7501h) {
                try {
                    long j10 = this.f7500g.f9627a;
                    com.google.android.exoplayer2.upstream.b j11 = j(j10);
                    this.f7504k = j11;
                    long h10 = this.f7496c.h(j11);
                    this.f7505l = h10;
                    if (h10 != -1) {
                        this.f7505l = h10 + j10;
                    }
                    b5.b unused = q.this.f7492y = b5.b.b(this.f7496c.j());
                    z5.g gVar = this.f7496c;
                    if (!(q.this.f7492y == null || q.this.f7492y.f5004m == -1)) {
                        gVar = new g(this.f7496c, q.this.f7492y.f5004m, this);
                        b0 N = q.this.N();
                        this.f7506m = N;
                        N.d(q.U);
                    }
                    m mVar = this.f7497d;
                    Uri uri = this.f7495b;
                    Map<String, List<String>> j12 = this.f7496c.j();
                    long j13 = this.f7505l;
                    long j14 = j10;
                    mVar.f(gVar, uri, j12, j10, j13, this.f7498e);
                    if (q.this.f7492y != null) {
                        this.f7497d.e();
                    }
                    if (this.f7502i) {
                        this.f7497d.b(j14, this.f7503j);
                        this.f7502i = false;
                    }
                    while (true) {
                        long j15 = j14;
                        while (i10 == 0 && !this.f7501h) {
                            this.f7499f.a();
                            i10 = this.f7497d.c(this.f7500g);
                            j14 = this.f7497d.d();
                            if (j14 > q.this.f7484q + j15) {
                                this.f7499f.c();
                                q.this.f7490w.post(q.this.f7489v);
                            }
                        }
                    }
                    if (i10 == 1) {
                        i10 = 0;
                    } else if (this.f7497d.d() != -1) {
                        this.f7500g.f9627a = this.f7497d.d();
                    }
                    m0.n(this.f7496c);
                } catch (InterruptedException unused2) {
                    throw new InterruptedIOException();
                } catch (Throwable th) {
                    if (!(i10 == 1 || this.f7497d.d() == -1)) {
                        this.f7500g.f9627a = this.f7497d.d();
                    }
                    m0.n(this.f7496c);
                    throw th;
                }
            }
        }

        public void c() {
            this.f7501h = true;
        }
    }

    /* compiled from: ProgressiveMediaPeriod */
    interface b {
        void f(long j10, boolean z10, boolean z11);
    }

    /* compiled from: ProgressiveMediaPeriod */
    private final class c implements t {
        /* access modifiers changed from: private */

        /* renamed from: h  reason: collision with root package name */
        public final int f7509h;

        public c(int i10) {
            this.f7509h = i10;
        }

        public void a() {
            q.this.W(this.f7509h);
        }

        public boolean e() {
            return q.this.P(this.f7509h);
        }

        public int i(e4.k kVar, DecoderInputBuffer decoderInputBuffer, int i10) {
            return q.this.b0(this.f7509h, kVar, decoderInputBuffer, i10);
        }

        public int o(long j10) {
            return q.this.f0(this.f7509h, j10);
        }
    }

    /* compiled from: ProgressiveMediaPeriod */
    private static final class d {

        /* renamed from: a  reason: collision with root package name */
        public final int f7511a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f7512b;

        public d(int i10, boolean z10) {
            this.f7511a = i10;
            this.f7512b = z10;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || d.class != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            if (this.f7511a == dVar.f7511a && this.f7512b == dVar.f7512b) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (this.f7511a * 31) + (this.f7512b ? 1 : 0);
        }
    }

    /* compiled from: ProgressiveMediaPeriod */
    private static final class e {

        /* renamed from: a  reason: collision with root package name */
        public final w f7513a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean[] f7514b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean[] f7515c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean[] f7516d;

        public e(w wVar, boolean[] zArr) {
            this.f7513a = wVar;
            this.f7514b = zArr;
            int i10 = wVar.f8924h;
            this.f7515c = new boolean[i10];
            this.f7516d = new boolean[i10];
        }
    }

    public q(Uri uri, com.google.android.exoplayer2.upstream.a aVar, m mVar, com.google.android.exoplayer2.drm.j jVar, i.a aVar2, com.google.android.exoplayer2.upstream.g gVar, l.a aVar3, b bVar, z5.b bVar2, String str, int i10) {
        this.f7475h = uri;
        this.f7476i = aVar;
        this.f7477j = jVar;
        this.f7480m = aVar2;
        this.f7478k = gVar;
        this.f7479l = aVar3;
        this.f7481n = bVar;
        this.f7482o = bVar2;
        this.f7483p = str;
        this.f7484q = (long) i10;
        this.f7486s = mVar;
        this.f7487t = new a6.e();
        this.f7488u = new n(this);
        this.f7489v = new o(this);
        this.f7490w = m0.x();
        this.A = new d[0];
        this.f7493z = new u[0];
        this.O = -9223372036854775807L;
        this.M = -1;
        this.G = -9223372036854775807L;
        this.I = 1;
    }

    private void H() {
        a6.a.f(this.C);
        a6.a.e(this.E);
        a6.a.e(this.F);
    }

    private boolean I(a aVar, int i10) {
        y yVar;
        if (this.M == -1 && ((yVar = this.F) == null || yVar.i() == -9223372036854775807L)) {
            if (!this.C || h0()) {
                this.K = this.C;
                this.N = 0;
                this.Q = 0;
                for (u V : this.f7493z) {
                    V.V();
                }
                aVar.k(0, 0);
                return true;
            }
            this.P = true;
            return false;
        }
        this.Q = i10;
        return true;
    }

    private void J(a aVar) {
        if (this.M == -1) {
            this.M = aVar.f7505l;
        }
    }

    private static Map<String, String> K() {
        HashMap hashMap = new HashMap();
        hashMap.put("Icy-MetaData", AppEventsConstants.EVENT_PARAM_VALUE_YES);
        return Collections.unmodifiableMap(hashMap);
    }

    private int L() {
        int i10 = 0;
        for (u G2 : this.f7493z) {
            i10 += G2.G();
        }
        return i10;
    }

    /* access modifiers changed from: private */
    public long M() {
        long j10 = Long.MIN_VALUE;
        for (u z10 : this.f7493z) {
            j10 = Math.max(j10, z10.z());
        }
        return j10;
    }

    private boolean O() {
        return this.O != -9223372036854775807L;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void Q() {
        if (!this.S) {
            ((j.a) a6.a.e(this.f7491x)).i(this);
        }
    }

    /* access modifiers changed from: private */
    public void S() {
        x4.a aVar;
        if (!this.S && !this.C && this.B && this.F != null) {
            u[] uVarArr = this.f7493z;
            int length = uVarArr.length;
            int i10 = 0;
            while (i10 < length) {
                if (uVarArr[i10].F() != null) {
                    i10++;
                } else {
                    return;
                }
            }
            this.f7487t.c();
            int length2 = this.f7493z.length;
            v[] vVarArr = new v[length2];
            boolean[] zArr = new boolean[length2];
            for (int i11 = 0; i11 < length2; i11++) {
                e4.j jVar = (e4.j) a6.a.e(this.f7493z[i11].F());
                String str = jVar.f8096s;
                boolean p10 = a6.t.p(str);
                boolean z10 = p10 || a6.t.s(str);
                zArr[i11] = z10;
                this.D = z10 | this.D;
                b5.b bVar = this.f7492y;
                if (bVar != null) {
                    if (p10 || this.A[i11].f7512b) {
                        x4.a aVar2 = jVar.f8094q;
                        if (aVar2 == null) {
                            aVar = new x4.a(bVar);
                        } else {
                            aVar = aVar2.b(bVar);
                        }
                        jVar = jVar.b().X(aVar).E();
                    }
                    if (p10 && jVar.f8090m == -1 && jVar.f8091n == -1 && bVar.f4999h != -1) {
                        jVar = jVar.b().G(bVar.f4999h).E();
                    }
                }
                vVarArr[i11] = new v(jVar.c(this.f7477j.b(jVar)));
            }
            this.E = new e(new w(vVarArr), zArr);
            this.C = true;
            ((j.a) a6.a.e(this.f7491x)).k(this);
        }
    }

    private void T(int i10) {
        H();
        e eVar = this.E;
        boolean[] zArr = eVar.f7516d;
        if (!zArr[i10]) {
            e4.j b10 = eVar.f7513a.b(i10).b(0);
            this.f7479l.i(a6.t.l(b10.f8096s), b10, 0, (Object) null, this.N);
            zArr[i10] = true;
        }
    }

    private void U(int i10) {
        H();
        boolean[] zArr = this.E.f7514b;
        if (this.P && zArr[i10]) {
            if (!this.f7493z[i10].K(false)) {
                this.O = 0;
                this.P = false;
                this.K = true;
                this.N = 0;
                this.Q = 0;
                for (u V : this.f7493z) {
                    V.V();
                }
                ((j.a) a6.a.e(this.f7491x)).i(this);
            }
        }
    }

    private b0 a0(d dVar) {
        int length = this.f7493z.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (dVar.equals(this.A[i10])) {
                return this.f7493z[i10];
            }
        }
        u k10 = u.k(this.f7482o, this.f7490w.getLooper(), this.f7477j, this.f7480m);
        k10.d0(this);
        int i11 = length + 1;
        d[] dVarArr = (d[]) Arrays.copyOf(this.A, i11);
        dVarArr[length] = dVar;
        this.A = (d[]) m0.k(dVarArr);
        u[] uVarArr = (u[]) Arrays.copyOf(this.f7493z, i11);
        uVarArr[length] = k10;
        this.f7493z = (u[]) m0.k(uVarArr);
        return k10;
    }

    private boolean d0(boolean[] zArr, long j10) {
        int length = this.f7493z.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (!this.f7493z[i10].Z(j10, false) && (zArr[i10] || !this.D)) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: e0 */
    public void R(y yVar) {
        this.F = this.f7492y == null ? yVar : new y.b(-9223372036854775807L);
        this.G = yVar.i();
        int i10 = 1;
        boolean z10 = this.M == -1 && yVar.i() == -9223372036854775807L;
        this.H = z10;
        if (z10) {
            i10 = 7;
        }
        this.I = i10;
        this.f7481n.f(this.G, yVar.f(), this.H);
        if (!this.C) {
            S();
        }
    }

    private void g0() {
        a aVar = new a(this.f7475h, this.f7476i, this.f7486s, this, this.f7487t);
        if (this.C) {
            a6.a.f(O());
            long j10 = this.G;
            if (j10 == -9223372036854775807L || this.O <= j10) {
                aVar.k(((y) a6.a.e(this.F)).h(this.O).f9628a.f9634b, this.O);
                for (u b02 : this.f7493z) {
                    b02.b0(this.O);
                }
                this.O = -9223372036854775807L;
            } else {
                this.R = true;
                this.O = -9223372036854775807L;
                return;
            }
        }
        this.Q = L();
        this.f7479l.A(new h(aVar.f7494a, aVar.f7504k, this.f7485r.n(aVar, this, this.f7478k.d(this.I))), 1, -1, (e4.j) null, 0, (Object) null, aVar.f7503j, this.G);
    }

    private boolean h0() {
        return this.K || O();
    }

    /* access modifiers changed from: package-private */
    public b0 N() {
        return a0(new d(0, true));
    }

    /* access modifiers changed from: package-private */
    public boolean P(int i10) {
        return !h0() && this.f7493z[i10].K(this.R);
    }

    /* access modifiers changed from: package-private */
    public void V() {
        this.f7485r.k(this.f7478k.d(this.I));
    }

    /* access modifiers changed from: package-private */
    public void W(int i10) {
        this.f7493z[i10].N();
        V();
    }

    /* renamed from: X */
    public void k(a aVar, long j10, long j11, boolean z10) {
        z5.q d10 = aVar.f7496c;
        h hVar = new h(aVar.f7494a, aVar.f7504k, d10.q(), d10.r(), j10, j11, d10.p());
        this.f7478k.c(aVar.f7494a);
        this.f7479l.r(hVar, 1, -1, (e4.j) null, 0, (Object) null, aVar.f7503j, this.G);
        if (!z10) {
            J(aVar);
            for (u V : this.f7493z) {
                V.V();
            }
            if (this.L > 0) {
                ((j.a) a6.a.e(this.f7491x)).i(this);
            }
        }
    }

    /* renamed from: Y */
    public void l(a aVar, long j10, long j11) {
        y yVar;
        if (this.G == -9223372036854775807L && (yVar = this.F) != null) {
            boolean f10 = yVar.f();
            long M2 = M();
            long j12 = M2 == Long.MIN_VALUE ? 0 : M2 + 10000;
            this.G = j12;
            this.f7481n.f(j12, f10, this.H);
        }
        z5.q d10 = aVar.f7496c;
        h hVar = new h(aVar.f7494a, aVar.f7504k, d10.q(), d10.r(), j10, j11, d10.p());
        this.f7478k.c(aVar.f7494a);
        this.f7479l.u(hVar, 1, -1, (e4.j) null, 0, (Object) null, aVar.f7503j, this.G);
        J(aVar);
        this.R = true;
        ((j.a) a6.a.e(this.f7491x)).i(this);
    }

    /* renamed from: Z */
    public Loader.c s(a aVar, long j10, long j11, IOException iOException, int i10) {
        Loader.c cVar;
        a aVar2;
        boolean z10;
        J(aVar);
        z5.q d10 = aVar.f7496c;
        h hVar = new h(aVar.f7494a, aVar.f7504k, d10.q(), d10.r(), j10, j11, d10.p());
        long a10 = this.f7478k.a(new g.c(hVar, new g5.i(1, -1, (e4.j) null, 0, (Object) null, e4.c.e(aVar.f7503j), e4.c.e(this.G)), iOException, i10));
        if (a10 == -9223372036854775807L) {
            cVar = Loader.f7665g;
            a aVar3 = aVar;
        } else {
            int L2 = L();
            if (L2 > this.Q) {
                aVar2 = aVar;
                z10 = true;
            } else {
                z10 = false;
                aVar2 = aVar;
            }
            if (I(aVar2, L2)) {
                cVar = Loader.h(z10, a10);
            } else {
                cVar = Loader.f7664f;
            }
        }
        boolean z11 = !cVar.c();
        this.f7479l.w(hVar, 1, -1, (e4.j) null, 0, (Object) null, aVar.f7503j, this.G, iOException, z11);
        if (z11) {
            this.f7478k.c(aVar.f7494a);
        }
        return cVar;
    }

    public void a(e4.j jVar) {
        this.f7490w.post(this.f7488u);
    }

    public long b() {
        if (this.L == 0) {
            return Long.MIN_VALUE;
        }
        return g();
    }

    /* access modifiers changed from: package-private */
    public int b0(int i10, e4.k kVar, DecoderInputBuffer decoderInputBuffer, int i11) {
        if (h0()) {
            return -3;
        }
        T(i10);
        int S2 = this.f7493z[i10].S(kVar, decoderInputBuffer, i11, this.R);
        if (S2 == -3) {
            U(i10);
        }
        return S2;
    }

    public long c(long j10, e4.v vVar) {
        H();
        if (!this.F.f()) {
            return 0;
        }
        y.a h10 = this.F.h(j10);
        return vVar.a(j10, h10.f9628a.f9633a, h10.f9629b.f9633a);
    }

    public void c0() {
        if (this.C) {
            for (u R2 : this.f7493z) {
                R2.R();
            }
        }
        this.f7485r.m(this);
        this.f7490w.removeCallbacksAndMessages((Object) null);
        this.f7491x = null;
        this.S = true;
    }

    public boolean d(long j10) {
        if (this.R || this.f7485r.i() || this.P) {
            return false;
        }
        if (this.C && this.L == 0) {
            return false;
        }
        boolean e10 = this.f7487t.e();
        if (this.f7485r.j()) {
            return e10;
        }
        g0();
        return true;
    }

    public b0 e(int i10, int i11) {
        return a0(new d(i10, false));
    }

    public boolean f() {
        return this.f7485r.j() && this.f7487t.d();
    }

    /* access modifiers changed from: package-private */
    public int f0(int i10, long j10) {
        if (h0()) {
            return 0;
        }
        T(i10);
        u uVar = this.f7493z[i10];
        int E2 = uVar.E(j10, this.R);
        uVar.e0(E2);
        if (E2 == 0) {
            U(i10);
        }
        return E2;
    }

    public long g() {
        long j10;
        H();
        boolean[] zArr = this.E.f7514b;
        if (this.R) {
            return Long.MIN_VALUE;
        }
        if (O()) {
            return this.O;
        }
        if (this.D) {
            int length = this.f7493z.length;
            j10 = Long.MAX_VALUE;
            for (int i10 = 0; i10 < length; i10++) {
                if (zArr[i10] && !this.f7493z[i10].J()) {
                    j10 = Math.min(j10, this.f7493z[i10].z());
                }
            }
        } else {
            j10 = Long.MAX_VALUE;
        }
        if (j10 == Long.MAX_VALUE) {
            j10 = M();
        }
        return j10 == Long.MIN_VALUE ? this.N : j10;
    }

    public void h(long j10) {
    }

    public void i(y yVar) {
        this.f7490w.post(new p(this, yVar));
    }

    public void j() {
        for (u T2 : this.f7493z) {
            T2.T();
        }
        this.f7486s.release();
    }

    public void m() {
        V();
        if (this.R && !this.C) {
            throw ParserException.a("Loading finished before preparation is complete.", (Throwable) null);
        }
    }

    public long n(long j10) {
        H();
        boolean[] zArr = this.E.f7514b;
        if (!this.F.f()) {
            j10 = 0;
        }
        int i10 = 0;
        this.K = false;
        this.N = j10;
        if (O()) {
            this.O = j10;
            return j10;
        } else if (this.I != 7 && d0(zArr, j10)) {
            return j10;
        } else {
            this.P = false;
            this.O = j10;
            this.R = false;
            if (this.f7485r.j()) {
                u[] uVarArr = this.f7493z;
                int length = uVarArr.length;
                while (i10 < length) {
                    uVarArr[i10].r();
                    i10++;
                }
                this.f7485r.f();
            } else {
                this.f7485r.g();
                u[] uVarArr2 = this.f7493z;
                int length2 = uVarArr2.length;
                while (i10 < length2) {
                    uVarArr2[i10].V();
                    i10++;
                }
            }
            return j10;
        }
    }

    public void o() {
        this.B = true;
        this.f7490w.post(this.f7488u);
    }

    public long p() {
        if (!this.K) {
            return -9223372036854775807L;
        }
        if (!this.R && L() <= this.Q) {
            return -9223372036854775807L;
        }
        this.K = false;
        return this.N;
    }

    public void q(j.a aVar, long j10) {
        this.f7491x = aVar;
        this.f7487t.e();
        g0();
    }

    public w r() {
        H();
        return this.E.f7513a;
    }

    public void t(long j10, boolean z10) {
        H();
        if (!O()) {
            boolean[] zArr = this.E.f7515c;
            int length = this.f7493z.length;
            for (int i10 = 0; i10 < length; i10++) {
                this.f7493z[i10].q(j10, z10, zArr[i10]);
            }
        }
    }

    public long u(y5.h[] hVarArr, boolean[] zArr, t[] tVarArr, boolean[] zArr2, long j10) {
        H();
        e eVar = this.E;
        w wVar = eVar.f7513a;
        boolean[] zArr3 = eVar.f7515c;
        int i10 = this.L;
        int i11 = 0;
        for (int i12 = 0; i12 < hVarArr.length; i12++) {
            if (tVarArr[i12] != null && (hVarArr[i12] == null || !zArr[i12])) {
                int b10 = tVarArr[i12].f7509h;
                a6.a.f(zArr3[b10]);
                this.L--;
                zArr3[b10] = false;
                tVarArr[i12] = null;
            }
        }
        boolean z10 = !this.J ? j10 != 0 : i10 == 0;
        for (int i13 = 0; i13 < hVarArr.length; i13++) {
            if (tVarArr[i13] == null && hVarArr[i13] != null) {
                y5.h hVar = hVarArr[i13];
                a6.a.f(hVar.length() == 1);
                a6.a.f(hVar.k(0) == 0);
                int c10 = wVar.c(hVar.b());
                a6.a.f(!zArr3[c10]);
                this.L++;
                zArr3[c10] = true;
                tVarArr[i13] = new c(c10);
                zArr2[i13] = true;
                if (!z10) {
                    u uVar = this.f7493z[c10];
                    z10 = !uVar.Z(j10, true) && uVar.C() != 0;
                }
            }
        }
        if (this.L == 0) {
            this.P = false;
            this.K = false;
            if (this.f7485r.j()) {
                u[] uVarArr = this.f7493z;
                int length = uVarArr.length;
                while (i11 < length) {
                    uVarArr[i11].r();
                    i11++;
                }
                this.f7485r.f();
            } else {
                u[] uVarArr2 = this.f7493z;
                int length2 = uVarArr2.length;
                while (i11 < length2) {
                    uVarArr2[i11].V();
                    i11++;
                }
            }
        } else if (z10) {
            j10 = n(j10);
            while (i11 < tVarArr.length) {
                if (tVarArr[i11] != null) {
                    zArr2[i11] = true;
                }
                i11++;
            }
        }
        this.J = true;
        return j10;
    }
}
