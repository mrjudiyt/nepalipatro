package f4;

import a6.b;
import a6.k;
import a6.m0;
import a6.o;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import b6.m;
import b6.x;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.a1;
import com.google.android.exoplayer2.drm.i;
import com.google.android.exoplayer2.j0;
import com.google.android.exoplayer2.k0;
import com.google.android.exoplayer2.source.k;
import com.google.android.exoplayer2.source.l;
import com.google.android.exoplayer2.t0;
import com.google.common.collect.f0;
import com.google.common.collect.z;
import e4.c;
import e4.j;
import e4.n;
import f4.j1;
import g4.g;
import g5.h;
import g5.w;
import h4.d;
import java.io.IOException;
import java.util.List;
import z5.e;

/* compiled from: AnalyticsCollector */
public class i1 implements t0.e, com.google.android.exoplayer2.audio.a, x, l, e.a, i {

    /* renamed from: h  reason: collision with root package name */
    private final b f8500h;

    /* renamed from: i  reason: collision with root package name */
    private final a1.b f8501i;

    /* renamed from: j  reason: collision with root package name */
    private final a1.c f8502j = new a1.c();

    /* renamed from: k  reason: collision with root package name */
    private final a f8503k;

    /* renamed from: l  reason: collision with root package name */
    private final SparseArray<j1.a> f8504l;

    /* renamed from: m  reason: collision with root package name */
    private o<j1> f8505m;

    /* renamed from: n  reason: collision with root package name */
    private t0 f8506n;

    /* renamed from: o  reason: collision with root package name */
    private k f8507o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f8508p;

    /* compiled from: AnalyticsCollector */
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final a1.b f8509a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public com.google.common.collect.x<k.a> f8510b = com.google.common.collect.x.s();

        /* renamed from: c  reason: collision with root package name */
        private z<k.a, a1> f8511c = z.j();

        /* renamed from: d  reason: collision with root package name */
        private k.a f8512d;

        /* renamed from: e  reason: collision with root package name */
        private k.a f8513e;

        /* renamed from: f  reason: collision with root package name */
        private k.a f8514f;

        public a(a1.b bVar) {
            this.f8509a = bVar;
        }

        private void b(z.a<k.a, a1> aVar, k.a aVar2, a1 a1Var) {
            if (aVar2 != null) {
                if (a1Var.b(aVar2.f8900a) != -1) {
                    aVar.f(aVar2, a1Var);
                    return;
                }
                a1 a1Var2 = this.f8511c.get(aVar2);
                if (a1Var2 != null) {
                    aVar.f(aVar2, a1Var2);
                }
            }
        }

        private static k.a c(t0 t0Var, com.google.common.collect.x<k.a> xVar, k.a aVar, a1.b bVar) {
            a1 k10 = t0Var.k();
            int e10 = t0Var.e();
            Object m10 = k10.q() ? null : k10.m(e10);
            int c10 = (t0Var.a() || k10.q()) ? -1 : k10.f(e10, bVar).c(c.d(t0Var.m()) - bVar.l());
            for (int i10 = 0; i10 < xVar.size(); i10++) {
                k.a aVar2 = xVar.get(i10);
                if (i(aVar2, m10, t0Var.a(), t0Var.j(), t0Var.f(), c10)) {
                    return aVar2;
                }
            }
            if (xVar.isEmpty() && aVar != null) {
                if (i(aVar, m10, t0Var.a(), t0Var.j(), t0Var.f(), c10)) {
                    return aVar;
                }
            }
            return null;
        }

        private static boolean i(k.a aVar, Object obj, boolean z10, int i10, int i11, int i12) {
            if (!aVar.f8900a.equals(obj)) {
                return false;
            }
            if ((z10 && aVar.f8901b == i10 && aVar.f8902c == i11) || (!z10 && aVar.f8901b == -1 && aVar.f8904e == i12)) {
                return true;
            }
            return false;
        }

        private void m(a1 a1Var) {
            z.a a10 = z.a();
            if (this.f8510b.isEmpty()) {
                b(a10, this.f8513e, a1Var);
                if (!l6.l.a(this.f8514f, this.f8513e)) {
                    b(a10, this.f8514f, a1Var);
                }
                if (!l6.l.a(this.f8512d, this.f8513e) && !l6.l.a(this.f8512d, this.f8514f)) {
                    b(a10, this.f8512d, a1Var);
                }
            } else {
                for (int i10 = 0; i10 < this.f8510b.size(); i10++) {
                    b(a10, this.f8510b.get(i10), a1Var);
                }
                if (!this.f8510b.contains(this.f8512d)) {
                    b(a10, this.f8512d, a1Var);
                }
            }
            this.f8511c = a10.a();
        }

        public k.a d() {
            return this.f8512d;
        }

        public k.a e() {
            if (this.f8510b.isEmpty()) {
                return null;
            }
            return (k.a) f0.c(this.f8510b);
        }

        public a1 f(k.a aVar) {
            return this.f8511c.get(aVar);
        }

        public k.a g() {
            return this.f8513e;
        }

        public k.a h() {
            return this.f8514f;
        }

        public void j(t0 t0Var) {
            this.f8512d = c(t0Var, this.f8510b, this.f8513e, this.f8509a);
        }

        public void k(List<k.a> list, k.a aVar, t0 t0Var) {
            this.f8510b = com.google.common.collect.x.n(list);
            if (!list.isEmpty()) {
                this.f8513e = list.get(0);
                this.f8514f = (k.a) a6.a.e(aVar);
            }
            if (this.f8512d == null) {
                this.f8512d = c(t0Var, this.f8510b, this.f8513e, this.f8509a);
            }
            m(t0Var.k());
        }

        public void l(t0 t0Var) {
            this.f8512d = c(t0Var, this.f8510b, this.f8513e, this.f8509a);
            m(t0Var.k());
        }
    }

    public i1(b bVar) {
        this.f8500h = (b) a6.a.e(bVar);
        this.f8505m = new o<>(m0.N(), bVar, b1.f14421a);
        a1.b bVar2 = new a1.b();
        this.f8501i = bVar2;
        this.f8503k = new a(bVar2);
        this.f8504l = new SparseArray<>();
    }

    private j1.a A1() {
        return z1(this.f8503k.e());
    }

    private j1.a B1(int i10, k.a aVar) {
        a6.a.e(this.f8506n);
        boolean z10 = true;
        if (aVar != null) {
            if (this.f8503k.f(aVar) == null) {
                z10 = false;
            }
            if (z10) {
                return z1(aVar);
            }
            return y1(a1.f6231a, i10, aVar);
        }
        a1 k10 = this.f8506n.k();
        if (i10 >= k10.p()) {
            z10 = false;
        }
        if (!z10) {
            k10 = a1.f6231a;
        }
        return y1(k10, i10, (k.a) null);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void B2(j1.a aVar, String str, long j10, long j11, j1 j1Var) {
        j1Var.A(aVar, str, j10);
        long j12 = j10;
        j1Var.H(aVar, str, j11, j12);
        j1Var.I(aVar, 2, str, j12);
    }

    private j1.a C1() {
        return z1(this.f8503k.g());
    }

    private j1.a D1() {
        return z1(this.f8503k.h());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void D2(j1.a aVar, d dVar, j1 j1Var) {
        j1Var.e(aVar, dVar);
        j1Var.p0(aVar, 2, dVar);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void E1(j1 j1Var, a6.i iVar) {
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void E2(j1.a aVar, d dVar, j1 j1Var) {
        j1Var.j(aVar, dVar);
        j1Var.G(aVar, 2, dVar);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void G2(j1.a aVar, j jVar, h4.e eVar, j1 j1Var) {
        j1Var.W(aVar, jVar);
        j1Var.b(aVar, jVar, eVar);
        j1Var.P(aVar, 2, jVar);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void H2(j1.a aVar, b6.z zVar, j1 j1Var) {
        j1Var.R(aVar, zVar);
        j1Var.Q(aVar, zVar.f5137a, zVar.f5138b, zVar.f5139c, zVar.f5140d);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void I1(j1.a aVar, String str, long j10, long j11, j1 j1Var) {
        j1Var.t(aVar, str, j10);
        long j12 = j10;
        j1Var.J(aVar, str, j11, j12);
        j1Var.I(aVar, 1, str, j12);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void K1(j1.a aVar, d dVar, j1 j1Var) {
        j1Var.n0(aVar, dVar);
        j1Var.p0(aVar, 1, dVar);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void K2() {
        this.f8505m.i();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void L1(j1.a aVar, d dVar, j1 j1Var) {
        j1Var.B(aVar, dVar);
        j1Var.G(aVar, 1, dVar);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void L2(t0 t0Var, j1 j1Var, a6.i iVar) {
        j1Var.L(t0Var, new j1.b(iVar, this.f8504l));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void M1(j1.a aVar, j jVar, h4.e eVar, j1 j1Var) {
        j1Var.r0(aVar, jVar);
        j1Var.F(aVar, jVar, eVar);
        j1Var.P(aVar, 1, jVar);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void W1(j1.a aVar, int i10, j1 j1Var) {
        j1Var.f0(aVar);
        j1Var.Y(aVar, i10);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a2(j1.a aVar, boolean z10, j1 j1Var) {
        j1Var.k0(aVar, z10);
        j1Var.i(aVar, z10);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void p2(j1.a aVar, int i10, t0.f fVar, t0.f fVar2, j1 j1Var) {
        j1Var.m0(aVar, i10);
        j1Var.M(aVar, fVar, fVar2, i10);
    }

    private j1.a z1(k.a aVar) {
        a1 a1Var;
        a6.a.e(this.f8506n);
        if (aVar == null) {
            a1Var = null;
        } else {
            a1Var = this.f8503k.f(aVar);
        }
        if (aVar != null && a1Var != null) {
            return y1(a1Var, a1Var.h(aVar.f8900a, this.f8501i).f6236c, aVar);
        }
        int h10 = this.f8506n.h();
        a1 k10 = this.f8506n.k();
        if (!(h10 < k10.p())) {
            k10 = a1.f6231a;
        }
        return y1(k10, h10, (k.a) null);
    }

    public final void A(int i10, long j10, long j11) {
        j1.a A1 = A1();
        O2(A1, 1006, new g(A1, i10, j10, j11));
    }

    public final void B(w wVar, y5.l lVar) {
        j1.a x12 = x1();
        O2(x12, 2, new c0(x12, wVar, lVar));
    }

    public /* synthetic */ void C(j jVar) {
        m.a(this, jVar);
    }

    public void D(k0 k0Var) {
        j1.a x12 = x1();
        O2(x12, 15, new o(x12, k0Var));
    }

    public final void E(d dVar) {
        j1.a C1 = C1();
        O2(C1, 1025, new g0(C1, dVar));
    }

    public final void F(String str) {
        j1.a D1 = D1();
        O2(D1, 1013, new n0(D1, str));
    }

    public final void G(String str, long j10, long j11) {
        j1.a D1 = D1();
        O2(D1, 1009, new q0(D1, str, j11, j10));
    }

    public final void H(boolean z10) {
        j1.a x12 = x1();
        O2(x12, 10, new v0(x12, z10));
    }

    public final void I(d dVar) {
        j1.a C1 = C1();
        O2(C1, 1014, new f0(C1, dVar));
    }

    public /* synthetic */ void J(t0 t0Var, t0.d dVar) {
        e4.o.f(this, t0Var, dVar);
    }

    public final void K(int i10, long j10) {
        j1.a C1 = C1();
        O2(C1, 1023, new f(C1, i10, j10));
    }

    public final void L(j jVar, h4.e eVar) {
        j1.a D1 = D1();
        O2(D1, 1010, new r(D1, jVar, eVar));
    }

    public /* synthetic */ void M(int i10, boolean z10) {
        e4.o.e(this, i10, z10);
    }

    public final void M2() {
        if (!this.f8508p) {
            j1.a x12 = x1();
            this.f8508p = true;
            O2(x12, -1, new l(x12));
        }
    }

    public /* synthetic */ void N(j jVar) {
        g.a(this, jVar);
    }

    public void N2() {
        j1.a x12 = x1();
        this.f8504l.put(1036, x12);
        O2(x12, 1036, new d1(x12));
        ((a6.k) a6.a.h(this.f8507o)).c(new c1(this));
    }

    public final void O(boolean z10, int i10) {
        j1.a x12 = x1();
        O2(x12, -1, new y0(x12, z10, i10));
    }

    /* access modifiers changed from: protected */
    public final void O2(j1.a aVar, int i10, o.a<j1> aVar2) {
        this.f8504l.put(i10, aVar);
        this.f8505m.j(i10, aVar2);
    }

    public final void P(int i10, k.a aVar) {
        j1.a B1 = B1(i10, aVar);
        O2(B1, 1034, new s0(B1));
    }

    public void P2(t0 t0Var, Looper looper) {
        a6.a.f(this.f8506n == null || this.f8503k.f8510b.isEmpty());
        this.f8506n = (t0) a6.a.e(t0Var);
        this.f8507o = this.f8500h.b(looper, (Handler.Callback) null);
        this.f8505m = this.f8505m.d(looper, new a1(this, t0Var));
    }

    public /* synthetic */ void Q(int i10, int i11, int i12, float f10) {
        b6.k.a(this, i10, i11, i12, f10);
    }

    public final void Q2(List<k.a> list, k.a aVar) {
        this.f8503k.k(list, aVar, (t0) a6.a.e(this.f8506n));
    }

    public final void R(Object obj, long j10) {
        j1.a D1 = D1();
        O2(D1, 1027, new m0(D1, obj, j10));
    }

    public final void S(d dVar) {
        j1.a D1 = D1();
        O2(D1, 1008, new e0(D1, dVar));
    }

    public final void T(g4.d dVar) {
        j1.a D1 = D1();
        O2(D1, 1016, new u(D1, dVar));
    }

    public /* synthetic */ void U() {
        e4.o.o(this);
    }

    public final void V(j0 j0Var, int i10) {
        j1.a x12 = x1();
        O2(x12, 1, new n(x12, j0Var, i10));
    }

    public /* synthetic */ void W(int i10, k.a aVar) {
        j4.e.a(this, i10, aVar);
    }

    public /* synthetic */ void X(List list) {
        e4.o.c(this, list);
    }

    public final void Y(long j10) {
        j1.a D1 = D1();
        O2(D1, 1011, new j(D1, j10));
    }

    public final void Z(int i10, k.a aVar) {
        j1.a B1 = B1(i10, aVar);
        O2(B1, 1031, new w(B1));
    }

    public final void a(boolean z10) {
        j1.a D1 = D1();
        O2(D1, 1017, new w0(D1, z10));
    }

    public final void a0(Exception exc) {
        j1.a D1 = D1();
        O2(D1, 1037, new l0(D1, exc));
    }

    public final void b(e4.m mVar) {
        j1.a x12 = x1();
        O2(x12, 13, new t(x12, mVar));
    }

    public final void b0(Exception exc) {
        j1.a D1 = D1();
        O2(D1, 1038, new i0(D1, exc));
    }

    public final void c(Exception exc) {
        j1.a D1 = D1();
        O2(D1, 1018, new j0(D1, exc));
    }

    public final void c0(boolean z10, int i10) {
        j1.a x12 = x1();
        O2(x12, 6, new z0(x12, z10, i10));
    }

    public final void d(int i10) {
        j1.a x12 = x1();
        O2(x12, 9, new d(x12, i10));
    }

    public final void d0(int i10, k.a aVar, g5.i iVar) {
        j1.a B1 = B1(i10, aVar);
        O2(B1, 1005, new a0(B1, iVar));
    }

    public final void e(b6.z zVar) {
        j1.a D1 = D1();
        O2(D1, 1028, new m(D1, zVar));
    }

    public /* synthetic */ void e0(i4.a aVar) {
        e4.o.d(this, aVar);
    }

    public final void f(t0.f fVar, t0.f fVar2, int i10) {
        if (i10 == 1) {
            this.f8508p = false;
        }
        this.f8503k.j((t0) a6.a.e(this.f8506n));
        j1.a x12 = x1();
        O2(x12, 12, new i(x12, i10, fVar, fVar2));
    }

    public void f0(int i10, int i11) {
        j1.a D1 = D1();
        O2(D1, 1029, new e(D1, i10, i11));
    }

    public final void g(int i10) {
        j1.a x12 = x1();
        O2(x12, 7, new g1(x12, i10));
    }

    public final void g0(int i10, k.a aVar, int i11) {
        j1.a B1 = B1(i10, aVar);
        O2(B1, 1030, new h1(B1, i11));
    }

    public /* synthetic */ void h(boolean z10) {
        n.d(this, z10);
    }

    public final void h0(int i10, k.a aVar) {
        j1.a B1 = B1(i10, aVar);
        O2(B1, 1035, new h0(B1));
    }

    public /* synthetic */ void i(int i10) {
        n.l(this, i10);
    }

    public final void i0(int i10, long j10, long j11) {
        j1.a D1 = D1();
        O2(D1, 1012, new h(D1, i10, j10, j11));
    }

    public final void j(String str) {
        j1.a D1 = D1();
        O2(D1, 1024, new o0(D1, str));
    }

    public /* synthetic */ void j0(PlaybackException playbackException) {
        e4.o.n(this, playbackException);
    }

    public final void k(d dVar) {
        j1.a D1 = D1();
        O2(D1, 1020, new d0(D1, dVar));
    }

    public final void k0(int i10, k.a aVar, h hVar, g5.i iVar) {
        j1.a B1 = B1(i10, aVar);
        O2(B1, 1001, new v(B1, hVar, iVar));
    }

    public final void l(int i10, k.a aVar, h hVar, g5.i iVar) {
        j1.a B1 = B1(i10, aVar);
        O2(B1, 1002, new y(B1, hVar, iVar));
    }

    public final void l0(int i10, k.a aVar, h hVar, g5.i iVar) {
        j1.a B1 = B1(i10, aVar);
        O2(B1, 1000, new x(B1, hVar, iVar));
    }

    @Deprecated
    public final void m(List<x4.a> list) {
        j1.a x12 = x1();
        O2(x12, 3, new r0(x12, list));
    }

    public final void m0(long j10, int i10) {
        j1.a C1 = C1();
        O2(C1, 1026, new k(C1, j10, i10));
    }

    public final void n(int i10, k.a aVar, h hVar, g5.i iVar, IOException iOException, boolean z10) {
        j1.a B1 = B1(i10, aVar);
        O2(B1, 1003, new z(B1, hVar, iVar, iOException, z10));
    }

    public final void n0(int i10, k.a aVar) {
        j1.a B1 = B1(i10, aVar);
        O2(B1, 1033, new a(B1));
    }

    public final void o(String str, long j10, long j11) {
        j1.a D1 = D1();
        O2(D1, 1021, new p0(D1, str, j11, j10));
    }

    public void o0(boolean z10) {
        j1.a x12 = x1();
        O2(x12, 8, new x0(x12, z10));
    }

    public final void p(x4.a aVar) {
        j1.a x12 = x1();
        O2(x12, 1007, new t0(x12, aVar));
    }

    public final void q(boolean z10) {
        j1.a x12 = x1();
        O2(x12, 4, new u0(x12, z10));
    }

    public final void r() {
        j1.a x12 = x1();
        O2(x12, -1, new e1(x12));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = ((com.google.android.exoplayer2.ExoPlaybackException) r4).f6216p;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void s(com.google.android.exoplayer2.PlaybackException r4) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof com.google.android.exoplayer2.ExoPlaybackException
            if (r0 == 0) goto L_0x0015
            r0 = r4
            com.google.android.exoplayer2.ExoPlaybackException r0 = (com.google.android.exoplayer2.ExoPlaybackException) r0
            g5.j r0 = r0.f6216p
            if (r0 == 0) goto L_0x0015
            com.google.android.exoplayer2.source.k$a r1 = new com.google.android.exoplayer2.source.k$a
            r1.<init>((g5.j) r0)
            f4.j1$a r0 = r3.z1(r1)
            goto L_0x0016
        L_0x0015:
            r0 = 0
        L_0x0016:
            if (r0 != 0) goto L_0x001c
            f4.j1$a r0 = r3.x1()
        L_0x001c:
            r1 = 11
            f4.p r2 = new f4.p
            r2.<init>(r0, r4)
            r3.O2(r0, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f4.i1.s(com.google.android.exoplayer2.PlaybackException):void");
    }

    public void t(t0.b bVar) {
        j1.a x12 = x1();
        O2(x12, 14, new q(x12, bVar));
    }

    public final void u(int i10, k.a aVar, Exception exc) {
        j1.a B1 = B1(i10, aVar);
        O2(B1, 1032, new k0(B1, exc));
    }

    public final void v(a1 a1Var, int i10) {
        this.f8503k.l((t0) a6.a.e(this.f8506n));
        j1.a x12 = x1();
        O2(x12, 0, new c(x12, i10));
    }

    public final void w(float f10) {
        j1.a D1 = D1();
        O2(D1, 1019, new f1(D1, f10));
    }

    public final void x(int i10) {
        j1.a x12 = x1();
        O2(x12, 5, new b(x12, i10));
    }

    /* access modifiers changed from: protected */
    public final j1.a x1() {
        return z1(this.f8503k.d());
    }

    public final void y(j jVar, h4.e eVar) {
        j1.a D1 = D1();
        O2(D1, 1022, new s(D1, jVar, eVar));
    }

    /* access modifiers changed from: protected */
    public final j1.a y1(a1 a1Var, int i10, k.a aVar) {
        long j10;
        a1 a1Var2 = a1Var;
        int i11 = i10;
        k.a aVar2 = a1Var.q() ? null : aVar;
        long elapsedRealtime = this.f8500h.elapsedRealtime();
        boolean z10 = true;
        boolean z11 = a1Var2.equals(this.f8506n.k()) && i11 == this.f8506n.h();
        long j11 = 0;
        if (aVar2 != null && aVar2.b()) {
            if (!(z11 && this.f8506n.j() == aVar2.f8901b && this.f8506n.f() == aVar2.f8902c)) {
                z10 = false;
            }
            if (z10) {
                j11 = this.f8506n.m();
            }
        } else if (z11) {
            j10 = this.f8506n.i();
            return new j1.a(elapsedRealtime, a1Var, i10, aVar2, j10, this.f8506n.k(), this.f8506n.h(), this.f8503k.d(), this.f8506n.m(), this.f8506n.b());
        } else if (!a1Var.q()) {
            j11 = a1Var2.n(i11, this.f8502j).b();
        }
        j10 = j11;
        return new j1.a(elapsedRealtime, a1Var, i10, aVar2, j10, this.f8506n.k(), this.f8506n.h(), this.f8503k.d(), this.f8506n.m(), this.f8506n.b());
    }

    public final void z(int i10, k.a aVar, g5.i iVar) {
        j1.a B1 = B1(i10, aVar);
        O2(B1, 1004, new b0(B1, iVar));
    }
}
