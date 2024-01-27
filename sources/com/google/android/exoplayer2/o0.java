package com.google.android.exoplayer2;

import a6.a;
import android.os.Handler;
import android.util.Pair;
import com.google.android.exoplayer2.a1;
import com.google.android.exoplayer2.source.j;
import com.google.android.exoplayer2.source.k;
import com.google.common.collect.x;
import f4.i1;

/* compiled from: MediaPeriodQueue */
final class o0 {

    /* renamed from: a  reason: collision with root package name */
    private final a1.b f7014a = new a1.b();

    /* renamed from: b  reason: collision with root package name */
    private final a1.c f7015b = new a1.c();

    /* renamed from: c  reason: collision with root package name */
    private final i1 f7016c;

    /* renamed from: d  reason: collision with root package name */
    private final Handler f7017d;

    /* renamed from: e  reason: collision with root package name */
    private long f7018e;

    /* renamed from: f  reason: collision with root package name */
    private int f7019f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f7020g;

    /* renamed from: h  reason: collision with root package name */
    private l0 f7021h;

    /* renamed from: i  reason: collision with root package name */
    private l0 f7022i;

    /* renamed from: j  reason: collision with root package name */
    private l0 f7023j;

    /* renamed from: k  reason: collision with root package name */
    private int f7024k;

    /* renamed from: l  reason: collision with root package name */
    private Object f7025l;

    /* renamed from: m  reason: collision with root package name */
    private long f7026m;

    public o0(i1 i1Var, Handler handler) {
        this.f7016c = i1Var;
        this.f7017d = handler;
    }

    private static k.a B(a1 a1Var, Object obj, long j10, long j11, a1.b bVar) {
        a1Var.h(obj, bVar);
        int d10 = bVar.d(j10);
        if (d10 == -1) {
            return new k.a(obj, j11, bVar.c(j10));
        }
        return new k.a(obj, d10, bVar.i(d10), j11);
    }

    private long C(a1 a1Var, Object obj) {
        int b10;
        int i10 = a1Var.h(obj, this.f7014a).f6236c;
        Object obj2 = this.f7025l;
        if (obj2 != null && (b10 = a1Var.b(obj2)) != -1 && a1Var.f(b10, this.f7014a).f6236c == i10) {
            return this.f7026m;
        }
        for (l0 l0Var = this.f7021h; l0Var != null; l0Var = l0Var.j()) {
            if (l0Var.f6860b.equals(obj)) {
                return l0Var.f6864f.f6875a.f8903d;
            }
        }
        for (l0 l0Var2 = this.f7021h; l0Var2 != null; l0Var2 = l0Var2.j()) {
            int b11 = a1Var.b(l0Var2.f6860b);
            if (b11 != -1 && a1Var.f(b11, this.f7014a).f6236c == i10) {
                return l0Var2.f6864f.f6875a.f8903d;
            }
        }
        long j10 = this.f7018e;
        this.f7018e = 1 + j10;
        if (this.f7021h == null) {
            this.f7025l = obj;
            this.f7026m = j10;
        }
        return j10;
    }

    private boolean E(a1 a1Var) {
        l0 l0Var = this.f7021h;
        if (l0Var == null) {
            return true;
        }
        int b10 = a1Var.b(l0Var.f6860b);
        while (true) {
            b10 = a1Var.d(b10, this.f7014a, this.f7015b, this.f7019f, this.f7020g);
            while (l0Var.j() != null && !l0Var.f6864f.f6881g) {
                l0Var = l0Var.j();
            }
            l0 j10 = l0Var.j();
            if (b10 == -1 || j10 == null || a1Var.b(j10.f6860b) != b10) {
                boolean z10 = z(l0Var);
                l0Var.f6864f = r(a1Var, l0Var.f6864f);
            } else {
                l0Var = j10;
            }
        }
        boolean z102 = z(l0Var);
        l0Var.f6864f = r(a1Var, l0Var.f6864f);
        return !z102;
    }

    private boolean d(long j10, long j11) {
        return j10 == -9223372036854775807L || j10 == j11;
    }

    private boolean e(m0 m0Var, m0 m0Var2) {
        return m0Var.f6876b == m0Var2.f6876b && m0Var.f6875a.equals(m0Var2.f6875a);
    }

    private m0 h(s0 s0Var) {
        return k(s0Var.f7059a, s0Var.f7060b, s0Var.f7061c, s0Var.f7077s);
    }

    private m0 i(a1 a1Var, l0 l0Var, long j10) {
        long j11;
        a1 a1Var2 = a1Var;
        m0 m0Var = l0Var.f6864f;
        long l10 = (l0Var.l() + m0Var.f6879e) - j10;
        if (m0Var.f6881g) {
            long j12 = 0;
            int d10 = a1Var.d(a1Var2.b(m0Var.f6875a.f8900a), this.f7014a, this.f7015b, this.f7019f, this.f7020g);
            if (d10 == -1) {
                return null;
            }
            int i10 = a1Var2.g(d10, this.f7014a, true).f6236c;
            Object obj = this.f7014a.f6235b;
            long j13 = m0Var.f6875a.f8903d;
            if (a1Var2.n(i10, this.f7015b).f6259o == d10) {
                Pair<Object, Long> k10 = a1Var.k(this.f7015b, this.f7014a, i10, -9223372036854775807L, Math.max(0, l10));
                if (k10 == null) {
                    return null;
                }
                obj = k10.first;
                long longValue = ((Long) k10.second).longValue();
                l0 j14 = l0Var.j();
                if (j14 == null || !j14.f6860b.equals(obj)) {
                    j13 = this.f7018e;
                    this.f7018e = 1 + j13;
                } else {
                    j13 = j14.f6864f.f6875a.f8903d;
                }
                j11 = longValue;
                j12 = -9223372036854775807L;
            } else {
                j11 = 0;
            }
            return k(a1Var, B(a1Var, obj, j11, j13, this.f7014a), j12, j11);
        }
        k.a aVar = m0Var.f6875a;
        a1Var2.h(aVar.f8900a, this.f7014a);
        if (aVar.b()) {
            int i11 = aVar.f8901b;
            int a10 = this.f7014a.a(i11);
            if (a10 == -1) {
                return null;
            }
            int j15 = this.f7014a.j(i11, aVar.f8902c);
            if (j15 < a10) {
                return l(a1Var, aVar.f8900a, i11, j15, m0Var.f6877c, aVar.f8903d);
            }
            long j16 = m0Var.f6877c;
            if (j16 == -9223372036854775807L) {
                a1.c cVar = this.f7015b;
                a1.b bVar = this.f7014a;
                Pair<Object, Long> k11 = a1Var.k(cVar, bVar, bVar.f6236c, -9223372036854775807L, Math.max(0, l10));
                if (k11 == null) {
                    return null;
                }
                j16 = ((Long) k11.second).longValue();
            }
            return m(a1Var, aVar.f8900a, Math.max(n(a1Var2, aVar.f8900a, aVar.f8901b), j16), m0Var.f6877c, aVar.f8903d);
        }
        int i12 = this.f7014a.i(aVar.f8904e);
        if (i12 == this.f7014a.a(aVar.f8904e)) {
            return m(a1Var, aVar.f8900a, n(a1Var2, aVar.f8900a, aVar.f8904e), m0Var.f6879e, aVar.f8903d);
        }
        return l(a1Var, aVar.f8900a, aVar.f8904e, i12, m0Var.f6879e, aVar.f8903d);
    }

    private m0 k(a1 a1Var, k.a aVar, long j10, long j11) {
        k.a aVar2 = aVar;
        a1 a1Var2 = a1Var;
        a1Var.h(aVar2.f8900a, this.f7014a);
        if (aVar.b()) {
            return l(a1Var, aVar2.f8900a, aVar2.f8901b, aVar2.f8902c, j10, aVar2.f8903d);
        }
        return m(a1Var, aVar2.f8900a, j11, j10, aVar2.f8903d);
    }

    private m0 l(a1 a1Var, Object obj, int i10, int i11, long j10, long j11) {
        int i12 = i11;
        k.a aVar = new k.a(obj, i10, i12, j11);
        long b10 = a1Var.h(aVar.f8900a, this.f7014a).b(aVar.f8901b, aVar.f8902c);
        long f10 = i12 == this.f7014a.i(i10) ? this.f7014a.f() : 0;
        return new m0(aVar, (b10 == -9223372036854775807L || f10 < b10) ? f10 : Math.max(0, b10 - 1), j10, -9223372036854775807L, b10, this.f7014a.m(aVar.f8901b), false, false, false);
    }

    private m0 m(a1 a1Var, Object obj, long j10, long j11, long j12) {
        long j13;
        a1 a1Var2 = a1Var;
        Object obj2 = obj;
        long j14 = j10;
        a1Var2.h(obj2, this.f7014a);
        int c10 = this.f7014a.c(j14);
        k.a aVar = new k.a(obj2, j12, c10);
        boolean s10 = s(aVar);
        boolean u10 = u(a1Var2, aVar);
        boolean t10 = t(a1Var2, aVar, s10);
        boolean z10 = c10 != -1 && this.f7014a.m(c10);
        long e10 = c10 != -1 ? this.f7014a.e(c10) : -9223372036854775807L;
        if (e10 == -9223372036854775807L || e10 == Long.MIN_VALUE) {
            j13 = this.f7014a.f6237d;
        } else {
            j13 = e10;
        }
        if (j13 != -9223372036854775807L && j14 >= j13) {
            j14 = Math.max(0, j13 - 1);
        }
        return new m0(aVar, j14, j11, e10, j13, z10, s10, u10, t10);
    }

    private long n(a1 a1Var, Object obj, int i10) {
        a1Var.h(obj, this.f7014a);
        long e10 = this.f7014a.e(i10);
        if (e10 == Long.MIN_VALUE) {
            return this.f7014a.f6237d;
        }
        return e10 + this.f7014a.g(i10);
    }

    private boolean s(k.a aVar) {
        return !aVar.b() && aVar.f8904e == -1;
    }

    private boolean t(a1 a1Var, k.a aVar, boolean z10) {
        int b10 = a1Var.b(aVar.f8900a);
        if (!a1Var.n(a1Var.f(b10, this.f7014a).f6236c, this.f7015b).f6253i) {
            return a1Var.r(b10, this.f7014a, this.f7015b, this.f7019f, this.f7020g) && z10;
        }
    }

    private boolean u(a1 a1Var, k.a aVar) {
        if (!s(aVar)) {
            return false;
        }
        int i10 = a1Var.h(aVar.f8900a, this.f7014a).f6236c;
        if (a1Var.n(i10, this.f7015b).f6260p == a1Var.b(aVar.f8900a)) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void w(x.a aVar, k.a aVar2) {
        this.f7016c.Q2(aVar.h(), aVar2);
    }

    private void x() {
        if (this.f7016c != null) {
            x.a l10 = x.l();
            for (l0 l0Var = this.f7021h; l0Var != null; l0Var = l0Var.j()) {
                l10.f(l0Var.f6864f.f6875a);
            }
            l0 l0Var2 = this.f7022i;
            this.f7017d.post(new n0(this, l10, l0Var2 == null ? null : l0Var2.f6864f.f6875a));
        }
    }

    public k.a A(a1 a1Var, Object obj, long j10) {
        return B(a1Var, obj, j10, C(a1Var, obj), this.f7014a);
    }

    public boolean D() {
        l0 l0Var = this.f7023j;
        return l0Var == null || (!l0Var.f6864f.f6883i && l0Var.q() && this.f7023j.f6864f.f6879e != -9223372036854775807L && this.f7024k < 100);
    }

    public boolean F(a1 a1Var, long j10, long j11) {
        m0 m0Var;
        long j12;
        l0 l0Var = this.f7021h;
        l0 l0Var2 = null;
        while (l0Var != null) {
            m0 m0Var2 = l0Var.f6864f;
            if (l0Var2 == null) {
                m0Var = r(a1Var, m0Var2);
            } else {
                m0 i10 = i(a1Var, l0Var2, j10);
                if (i10 == null) {
                    return !z(l0Var2);
                }
                if (!e(m0Var2, i10)) {
                    return !z(l0Var2);
                }
                m0Var = i10;
            }
            l0Var.f6864f = m0Var.a(m0Var2.f6877c);
            if (!d(m0Var2.f6879e, m0Var.f6879e)) {
                l0Var.A();
                long j13 = m0Var.f6879e;
                if (j13 == -9223372036854775807L) {
                    j12 = Long.MAX_VALUE;
                } else {
                    j12 = l0Var.z(j13);
                }
                boolean z10 = l0Var == this.f7022i && !l0Var.f6864f.f6880f && (j11 == Long.MIN_VALUE || j11 >= j12);
                if (z(l0Var) || z10) {
                    return false;
                }
                return true;
            }
            l0Var2 = l0Var;
            l0Var = l0Var.j();
        }
        return true;
    }

    public boolean G(a1 a1Var, int i10) {
        this.f7019f = i10;
        return E(a1Var);
    }

    public boolean H(a1 a1Var, boolean z10) {
        this.f7020g = z10;
        return E(a1Var);
    }

    public l0 b() {
        l0 l0Var = this.f7021h;
        if (l0Var == null) {
            return null;
        }
        if (l0Var == this.f7022i) {
            this.f7022i = l0Var.j();
        }
        this.f7021h.t();
        int i10 = this.f7024k - 1;
        this.f7024k = i10;
        if (i10 == 0) {
            this.f7023j = null;
            l0 l0Var2 = this.f7021h;
            this.f7025l = l0Var2.f6860b;
            this.f7026m = l0Var2.f6864f.f6875a.f8903d;
        }
        this.f7021h = this.f7021h.j();
        x();
        return this.f7021h;
    }

    public l0 c() {
        l0 l0Var = this.f7022i;
        a.f((l0Var == null || l0Var.j() == null) ? false : true);
        this.f7022i = this.f7022i.j();
        x();
        return this.f7022i;
    }

    public void f() {
        if (this.f7024k != 0) {
            l0 l0Var = (l0) a.h(this.f7021h);
            this.f7025l = l0Var.f6860b;
            this.f7026m = l0Var.f6864f.f6875a.f8903d;
            while (l0Var != null) {
                l0Var.t();
                l0Var = l0Var.j();
            }
            this.f7021h = null;
            this.f7023j = null;
            this.f7022i = null;
            this.f7024k = 0;
            x();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0018, code lost:
        if (r1 != -9223372036854775807L) goto L_0x002c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.android.exoplayer2.l0 g(e4.s[] r12, y5.o r13, z5.b r14, com.google.android.exoplayer2.r0 r15, com.google.android.exoplayer2.m0 r16, y5.p r17) {
        /*
            r11 = this;
            r0 = r11
            r8 = r16
            com.google.android.exoplayer2.l0 r1 = r0.f7023j
            if (r1 != 0) goto L_0x001e
            com.google.android.exoplayer2.source.k$a r1 = r8.f6875a
            boolean r1 = r1.b()
            if (r1 == 0) goto L_0x001b
            long r1 = r8.f6877c
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x001b
            goto L_0x002c
        L_0x001b:
            r1 = 0
            goto L_0x002c
        L_0x001e:
            long r1 = r1.l()
            com.google.android.exoplayer2.l0 r3 = r0.f7023j
            com.google.android.exoplayer2.m0 r3 = r3.f6864f
            long r3 = r3.f6879e
            long r1 = r1 + r3
            long r3 = r8.f6876b
            long r1 = r1 - r3
        L_0x002c:
            r3 = r1
            com.google.android.exoplayer2.l0 r10 = new com.google.android.exoplayer2.l0
            r1 = r10
            r2 = r12
            r5 = r13
            r6 = r14
            r7 = r15
            r8 = r16
            r9 = r17
            r1.<init>(r2, r3, r5, r6, r7, r8, r9)
            com.google.android.exoplayer2.l0 r1 = r0.f7023j
            if (r1 == 0) goto L_0x0043
            r1.w(r10)
            goto L_0x0047
        L_0x0043:
            r0.f7021h = r10
            r0.f7022i = r10
        L_0x0047:
            r1 = 0
            r0.f7025l = r1
            r0.f7023j = r10
            int r1 = r0.f7024k
            int r1 = r1 + 1
            r0.f7024k = r1
            r11.x()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.o0.g(e4.s[], y5.o, z5.b, com.google.android.exoplayer2.r0, com.google.android.exoplayer2.m0, y5.p):com.google.android.exoplayer2.l0");
    }

    public l0 j() {
        return this.f7023j;
    }

    public m0 o(long j10, s0 s0Var) {
        l0 l0Var = this.f7023j;
        if (l0Var == null) {
            return h(s0Var);
        }
        return i(s0Var.f7059a, l0Var, j10);
    }

    public l0 p() {
        return this.f7021h;
    }

    public l0 q() {
        return this.f7022i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0029, code lost:
        r1 = r3.f8904e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x006c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.android.exoplayer2.m0 r(com.google.android.exoplayer2.a1 r19, com.google.android.exoplayer2.m0 r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            com.google.android.exoplayer2.source.k$a r3 = r2.f6875a
            boolean r12 = r0.s(r3)
            boolean r13 = r0.u(r1, r3)
            boolean r14 = r0.t(r1, r3, r12)
            com.google.android.exoplayer2.source.k$a r4 = r2.f6875a
            java.lang.Object r4 = r4.f8900a
            com.google.android.exoplayer2.a1$b r5 = r0.f7014a
            r1.h(r4, r5)
            boolean r1 = r3.b()
            r4 = -1
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r1 != 0) goto L_0x0035
            int r1 = r3.f8904e
            if (r1 != r4) goto L_0x002e
            goto L_0x0035
        L_0x002e:
            com.google.android.exoplayer2.a1$b r7 = r0.f7014a
            long r7 = r7.e(r1)
            goto L_0x0036
        L_0x0035:
            r7 = r5
        L_0x0036:
            boolean r1 = r3.b()
            if (r1 == 0) goto L_0x0048
            com.google.android.exoplayer2.a1$b r1 = r0.f7014a
            int r5 = r3.f8901b
            int r6 = r3.f8902c
            long r5 = r1.b(r5, r6)
        L_0x0046:
            r9 = r5
            goto L_0x005c
        L_0x0048:
            int r1 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r1 == 0) goto L_0x0055
            r5 = -9223372036854775808
            int r1 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x0053
            goto L_0x0055
        L_0x0053:
            r9 = r7
            goto L_0x005c
        L_0x0055:
            com.google.android.exoplayer2.a1$b r1 = r0.f7014a
            long r5 = r1.h()
            goto L_0x0046
        L_0x005c:
            boolean r1 = r3.b()
            if (r1 == 0) goto L_0x006c
            com.google.android.exoplayer2.a1$b r1 = r0.f7014a
            int r4 = r3.f8901b
            boolean r1 = r1.m(r4)
            r11 = r1
            goto L_0x007d
        L_0x006c:
            int r1 = r3.f8904e
            if (r1 == r4) goto L_0x007b
            com.google.android.exoplayer2.a1$b r4 = r0.f7014a
            boolean r1 = r4.m(r1)
            if (r1 == 0) goto L_0x007b
            r1 = 1
            r11 = 1
            goto L_0x007d
        L_0x007b:
            r1 = 0
            r11 = 0
        L_0x007d:
            com.google.android.exoplayer2.m0 r15 = new com.google.android.exoplayer2.m0
            long r4 = r2.f6876b
            long r1 = r2.f6877c
            r16 = r1
            r1 = r15
            r2 = r3
            r3 = r4
            r5 = r16
            r1.<init>(r2, r3, r5, r7, r9, r11, r12, r13, r14)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.o0.r(com.google.android.exoplayer2.a1, com.google.android.exoplayer2.m0):com.google.android.exoplayer2.m0");
    }

    public boolean v(j jVar) {
        l0 l0Var = this.f7023j;
        return l0Var != null && l0Var.f6859a == jVar;
    }

    public void y(long j10) {
        l0 l0Var = this.f7023j;
        if (l0Var != null) {
            l0Var.s(j10);
        }
    }

    public boolean z(l0 l0Var) {
        boolean z10 = false;
        a.f(l0Var != null);
        if (l0Var.equals(this.f7023j)) {
            return false;
        }
        this.f7023j = l0Var;
        while (l0Var.j() != null) {
            l0Var = l0Var.j();
            if (l0Var == this.f7022i) {
                this.f7022i = this.f7021h;
                z10 = true;
            }
            l0Var.t();
            this.f7024k--;
        }
        this.f7023j.w((l0) null);
        x();
        return z10;
    }
}
