package f4;

import a6.i;
import android.util.SparseArray;
import b6.z;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.a1;
import com.google.android.exoplayer2.j0;
import com.google.android.exoplayer2.k0;
import com.google.android.exoplayer2.source.k;
import com.google.android.exoplayer2.t0;
import e4.j;
import e4.m;
import g5.h;
import g5.w;
import h4.d;
import h4.e;
import java.io.IOException;
import java.util.List;
import l6.l;

/* compiled from: AnalyticsListener */
public interface j1 {

    /* compiled from: AnalyticsListener */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final long f8515a;

        /* renamed from: b  reason: collision with root package name */
        public final a1 f8516b;

        /* renamed from: c  reason: collision with root package name */
        public final int f8517c;

        /* renamed from: d  reason: collision with root package name */
        public final k.a f8518d;

        /* renamed from: e  reason: collision with root package name */
        public final long f8519e;

        /* renamed from: f  reason: collision with root package name */
        public final a1 f8520f;

        /* renamed from: g  reason: collision with root package name */
        public final int f8521g;

        /* renamed from: h  reason: collision with root package name */
        public final k.a f8522h;

        /* renamed from: i  reason: collision with root package name */
        public final long f8523i;

        /* renamed from: j  reason: collision with root package name */
        public final long f8524j;

        public a(long j10, a1 a1Var, int i10, k.a aVar, long j11, a1 a1Var2, int i11, k.a aVar2, long j12, long j13) {
            this.f8515a = j10;
            this.f8516b = a1Var;
            this.f8517c = i10;
            this.f8518d = aVar;
            this.f8519e = j11;
            this.f8520f = a1Var2;
            this.f8521g = i11;
            this.f8522h = aVar2;
            this.f8523i = j12;
            this.f8524j = j13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f8515a == aVar.f8515a && this.f8517c == aVar.f8517c && this.f8519e == aVar.f8519e && this.f8521g == aVar.f8521g && this.f8523i == aVar.f8523i && this.f8524j == aVar.f8524j && l.a(this.f8516b, aVar.f8516b) && l.a(this.f8518d, aVar.f8518d) && l.a(this.f8520f, aVar.f8520f) && l.a(this.f8522h, aVar.f8522h)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return l.b(Long.valueOf(this.f8515a), this.f8516b, Integer.valueOf(this.f8517c), this.f8518d, Long.valueOf(this.f8519e), this.f8520f, Integer.valueOf(this.f8521g), this.f8522h, Long.valueOf(this.f8523i), Long.valueOf(this.f8524j));
        }
    }

    /* compiled from: AnalyticsListener */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final i f8525a;

        /* renamed from: b  reason: collision with root package name */
        private final SparseArray<a> f8526b;

        public b(i iVar, SparseArray<a> sparseArray) {
            this.f8525a = iVar;
            SparseArray<a> sparseArray2 = new SparseArray<>(iVar.b());
            for (int i10 = 0; i10 < iVar.b(); i10++) {
                int a10 = iVar.a(i10);
                sparseArray2.append(a10, (a) a6.a.e(sparseArray.get(a10)));
            }
            this.f8526b = sparseArray2;
        }
    }

    @Deprecated
    void A(a aVar, String str, long j10);

    void B(a aVar, d dVar);

    @Deprecated
    void C(a aVar);

    void D(a aVar, j0 j0Var, int i10);

    void E(a aVar, int i10, long j10, long j11);

    void F(a aVar, j jVar, e eVar);

    @Deprecated
    void G(a aVar, int i10, d dVar);

    void H(a aVar, String str, long j10, long j11);

    @Deprecated
    void I(a aVar, int i10, String str, long j10);

    void J(a aVar, String str, long j10, long j11);

    @Deprecated
    void K(a aVar, List<x4.a> list);

    void L(t0 t0Var, b bVar);

    void M(a aVar, t0.f fVar, t0.f fVar2, int i10);

    void N(a aVar);

    void O(a aVar, boolean z10);

    @Deprecated
    void P(a aVar, int i10, j jVar);

    @Deprecated
    void Q(a aVar, int i10, int i11, int i12, float f10);

    void R(a aVar, z zVar);

    void S(a aVar, w wVar, y5.l lVar);

    void T(a aVar);

    void U(a aVar, Exception exc);

    void V(a aVar, k0 k0Var);

    @Deprecated
    void W(a aVar, j jVar);

    void X(a aVar, int i10);

    void Y(a aVar, int i10);

    void Z(a aVar, float f10);

    void a(a aVar, int i10, long j10, long j11);

    void a0(a aVar, PlaybackException playbackException);

    void b(a aVar, j jVar, e eVar);

    void b0(a aVar);

    void c(a aVar, String str);

    void c0(a aVar);

    void d(a aVar, Exception exc);

    void d0(a aVar, int i10, long j10);

    void e(a aVar, d dVar);

    void e0(a aVar);

    void f(a aVar, boolean z10);

    @Deprecated
    void f0(a aVar);

    void g(a aVar, t0.b bVar);

    void g0(a aVar, g4.d dVar);

    void h(a aVar, h hVar, g5.i iVar);

    void h0(a aVar, boolean z10, int i10);

    void i(a aVar, boolean z10);

    void i0(a aVar, long j10);

    void j(a aVar, d dVar);

    void j0(a aVar, String str);

    @Deprecated
    void k(a aVar, boolean z10, int i10);

    @Deprecated
    void k0(a aVar, boolean z10);

    void l(a aVar, h hVar, g5.i iVar);

    void l0(a aVar, long j10, int i10);

    void m(a aVar, g5.i iVar);

    @Deprecated
    void m0(a aVar, int i10);

    void n(a aVar, g5.i iVar);

    void n0(a aVar, d dVar);

    void o(a aVar, Exception exc);

    void o0(a aVar, int i10, int i11);

    void p(a aVar, x4.a aVar2);

    @Deprecated
    void p0(a aVar, int i10, d dVar);

    void q(a aVar, Object obj, long j10);

    void q0(a aVar, int i10);

    void r(a aVar, int i10);

    @Deprecated
    void r0(a aVar, j jVar);

    void s(a aVar, Exception exc);

    @Deprecated
    void t(a aVar, String str, long j10);

    void u(a aVar, boolean z10);

    @Deprecated
    void v(a aVar);

    void w(a aVar, h hVar, g5.i iVar);

    void x(a aVar, int i10);

    void y(a aVar, h hVar, g5.i iVar, IOException iOException, boolean z10);

    void z(a aVar, m mVar);
}
