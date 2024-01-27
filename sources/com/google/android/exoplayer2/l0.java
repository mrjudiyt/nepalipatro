package com.google.android.exoplayer2;

import a6.a;
import com.google.android.exoplayer2.source.j;
import com.google.android.exoplayer2.source.k;
import e4.s;
import g5.g;
import g5.t;
import g5.w;
import y5.h;
import y5.o;
import y5.p;
import z5.b;

/* compiled from: MediaPeriodHolder */
final class l0 {

    /* renamed from: a  reason: collision with root package name */
    public final j f6859a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f6860b;

    /* renamed from: c  reason: collision with root package name */
    public final t[] f6861c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f6862d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f6863e;

    /* renamed from: f  reason: collision with root package name */
    public m0 f6864f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f6865g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean[] f6866h;

    /* renamed from: i  reason: collision with root package name */
    private final s[] f6867i;

    /* renamed from: j  reason: collision with root package name */
    private final o f6868j;

    /* renamed from: k  reason: collision with root package name */
    private final r0 f6869k;

    /* renamed from: l  reason: collision with root package name */
    private l0 f6870l;

    /* renamed from: m  reason: collision with root package name */
    private w f6871m = w.f8923k;

    /* renamed from: n  reason: collision with root package name */
    private p f6872n;

    /* renamed from: o  reason: collision with root package name */
    private long f6873o;

    public l0(s[] sVarArr, long j10, o oVar, b bVar, r0 r0Var, m0 m0Var, p pVar) {
        this.f6867i = sVarArr;
        this.f6873o = j10;
        this.f6868j = oVar;
        this.f6869k = r0Var;
        k.a aVar = m0Var.f6875a;
        this.f6860b = aVar.f8900a;
        this.f6864f = m0Var;
        this.f6872n = pVar;
        this.f6861c = new t[sVarArr.length];
        this.f6866h = new boolean[sVarArr.length];
        this.f6859a = e(aVar, r0Var, bVar, m0Var.f6876b, m0Var.f6878d);
    }

    private void c(t[] tVarArr) {
        int i10 = 0;
        while (true) {
            s[] sVarArr = this.f6867i;
            if (i10 < sVarArr.length) {
                if (sVarArr[i10].j() == 7 && this.f6872n.c(i10)) {
                    tVarArr[i10] = new g();
                }
                i10++;
            } else {
                return;
            }
        }
    }

    private static j e(k.a aVar, r0 r0Var, b bVar, long j10, long j11) {
        j h10 = r0Var.h(aVar, bVar, j10);
        return j11 != -9223372036854775807L ? new com.google.android.exoplayer2.source.b(h10, true, 0, j11) : h10;
    }

    private void f() {
        if (r()) {
            int i10 = 0;
            while (true) {
                p pVar = this.f6872n;
                if (i10 < pVar.f13098a) {
                    boolean c10 = pVar.c(i10);
                    h hVar = this.f6872n.f13100c[i10];
                    if (c10 && hVar != null) {
                        hVar.h();
                    }
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    private void g(t[] tVarArr) {
        int i10 = 0;
        while (true) {
            s[] sVarArr = this.f6867i;
            if (i10 < sVarArr.length) {
                if (sVarArr[i10].j() == 7) {
                    tVarArr[i10] = null;
                }
                i10++;
            } else {
                return;
            }
        }
    }

    private void h() {
        if (r()) {
            int i10 = 0;
            while (true) {
                p pVar = this.f6872n;
                if (i10 < pVar.f13098a) {
                    boolean c10 = pVar.c(i10);
                    h hVar = this.f6872n.f13100c[i10];
                    if (c10 && hVar != null) {
                        hVar.j();
                    }
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    private boolean r() {
        return this.f6870l == null;
    }

    private static void u(r0 r0Var, j jVar) {
        try {
            if (jVar instanceof com.google.android.exoplayer2.source.b) {
                r0Var.z(((com.google.android.exoplayer2.source.b) jVar).f7102h);
            } else {
                r0Var.z(jVar);
            }
        } catch (RuntimeException e10) {
            a6.p.d("MediaPeriodHolder", "Period release failed.", e10);
        }
    }

    public void A() {
        j jVar = this.f6859a;
        if (jVar instanceof com.google.android.exoplayer2.source.b) {
            long j10 = this.f6864f.f6878d;
            if (j10 == -9223372036854775807L) {
                j10 = Long.MIN_VALUE;
            }
            ((com.google.android.exoplayer2.source.b) jVar).s(0, j10);
        }
    }

    public long a(p pVar, long j10, boolean z10) {
        return b(pVar, j10, z10, new boolean[this.f6867i.length]);
    }

    public long b(p pVar, long j10, boolean z10, boolean[] zArr) {
        p pVar2 = pVar;
        int i10 = 0;
        while (true) {
            boolean z11 = true;
            if (i10 >= pVar2.f13098a) {
                break;
            }
            boolean[] zArr2 = this.f6866h;
            if (z10 || !pVar.b(this.f6872n, i10)) {
                z11 = false;
            }
            zArr2[i10] = z11;
            i10++;
        }
        g(this.f6861c);
        f();
        this.f6872n = pVar2;
        h();
        long u10 = this.f6859a.u(pVar2.f13100c, this.f6866h, this.f6861c, zArr, j10);
        c(this.f6861c);
        this.f6863e = false;
        int i11 = 0;
        while (true) {
            t[] tVarArr = this.f6861c;
            if (i11 >= tVarArr.length) {
                return u10;
            }
            if (tVarArr[i11] != null) {
                a.f(pVar.c(i11));
                if (this.f6867i[i11].j() != 7) {
                    this.f6863e = true;
                }
            } else {
                a.f(pVar2.f13100c[i11] == null);
            }
            i11++;
        }
    }

    public void d(long j10) {
        a.f(r());
        this.f6859a.d(y(j10));
    }

    public long i() {
        if (!this.f6862d) {
            return this.f6864f.f6876b;
        }
        long g10 = this.f6863e ? this.f6859a.g() : Long.MIN_VALUE;
        return g10 == Long.MIN_VALUE ? this.f6864f.f6879e : g10;
    }

    public l0 j() {
        return this.f6870l;
    }

    public long k() {
        if (!this.f6862d) {
            return 0;
        }
        return this.f6859a.b();
    }

    public long l() {
        return this.f6873o;
    }

    public long m() {
        return this.f6864f.f6876b + this.f6873o;
    }

    public w n() {
        return this.f6871m;
    }

    public p o() {
        return this.f6872n;
    }

    public void p(float f10, a1 a1Var) {
        this.f6862d = true;
        this.f6871m = this.f6859a.r();
        p v10 = v(f10, a1Var);
        m0 m0Var = this.f6864f;
        long j10 = m0Var.f6876b;
        long j11 = m0Var.f6879e;
        if (j11 != -9223372036854775807L && j10 >= j11) {
            j10 = Math.max(0, j11 - 1);
        }
        long a10 = a(v10, j10, false);
        long j12 = this.f6873o;
        m0 m0Var2 = this.f6864f;
        this.f6873o = j12 + (m0Var2.f6876b - a10);
        this.f6864f = m0Var2.b(a10);
    }

    public boolean q() {
        return this.f6862d && (!this.f6863e || this.f6859a.g() == Long.MIN_VALUE);
    }

    public void s(long j10) {
        a.f(r());
        if (this.f6862d) {
            this.f6859a.h(y(j10));
        }
    }

    public void t() {
        f();
        u(this.f6869k, this.f6859a);
    }

    public p v(float f10, a1 a1Var) {
        p d10 = this.f6868j.d(this.f6867i, n(), this.f6864f.f6875a, a1Var);
        for (h hVar : d10.f13100c) {
            if (hVar != null) {
                hVar.q(f10);
            }
        }
        return d10;
    }

    public void w(l0 l0Var) {
        if (l0Var != this.f6870l) {
            f();
            this.f6870l = l0Var;
            h();
        }
    }

    public void x(long j10) {
        this.f6873o = j10;
    }

    public long y(long j10) {
        return j10 - l();
    }

    public long z(long j10) {
        return j10 + l();
    }
}
