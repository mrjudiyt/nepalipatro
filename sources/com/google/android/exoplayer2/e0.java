package com.google.android.exoplayer2;

import a6.b;
import a6.k;
import a6.m0;
import android.os.Looper;
import android.util.Pair;
import com.google.android.exoplayer2.a1;
import com.google.android.exoplayer2.h0;
import com.google.android.exoplayer2.r0;
import com.google.android.exoplayer2.source.k;
import com.google.android.exoplayer2.source.w;
import com.google.android.exoplayer2.t0;
import com.google.android.exoplayer2.u0;
import com.google.common.collect.x;
import e4.c;
import e4.g;
import e4.h;
import e4.i;
import e4.m;
import e4.v;
import f4.i1;
import g5.r;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import y5.l;
import y5.o;
import y5.p;
import z5.e;

/* compiled from: ExoPlayerImpl */
final class e0 extends e {
    private v A;
    private w B;
    private boolean C;
    private t0.b D;
    private k0 E;
    private k0 F;
    private s0 G;
    private int H;
    private int I;
    private long J;

    /* renamed from: b  reason: collision with root package name */
    final p f6597b;

    /* renamed from: c  reason: collision with root package name */
    final t0.b f6598c;

    /* renamed from: d  reason: collision with root package name */
    private final w0[] f6599d;

    /* renamed from: e  reason: collision with root package name */
    private final o f6600e;

    /* renamed from: f  reason: collision with root package name */
    private final k f6601f;

    /* renamed from: g  reason: collision with root package name */
    private final h0.f f6602g;

    /* renamed from: h  reason: collision with root package name */
    private final h0 f6603h;

    /* renamed from: i  reason: collision with root package name */
    private final a6.o<t0.c> f6604i;

    /* renamed from: j  reason: collision with root package name */
    private final CopyOnWriteArraySet<g> f6605j;

    /* renamed from: k  reason: collision with root package name */
    private final a1.b f6606k;

    /* renamed from: l  reason: collision with root package name */
    private final List<a> f6607l;

    /* renamed from: m  reason: collision with root package name */
    private final boolean f6608m;

    /* renamed from: n  reason: collision with root package name */
    private final r f6609n;

    /* renamed from: o  reason: collision with root package name */
    private final i1 f6610o;

    /* renamed from: p  reason: collision with root package name */
    private final Looper f6611p;

    /* renamed from: q  reason: collision with root package name */
    private final e f6612q;

    /* renamed from: r  reason: collision with root package name */
    private final long f6613r;

    /* renamed from: s  reason: collision with root package name */
    private final long f6614s;

    /* renamed from: t  reason: collision with root package name */
    private final b f6615t;

    /* renamed from: u  reason: collision with root package name */
    private int f6616u;

    /* renamed from: v  reason: collision with root package name */
    private boolean f6617v;

    /* renamed from: w  reason: collision with root package name */
    private int f6618w;

    /* renamed from: x  reason: collision with root package name */
    private int f6619x;

    /* renamed from: y  reason: collision with root package name */
    private boolean f6620y;

    /* renamed from: z  reason: collision with root package name */
    private int f6621z;

    /* compiled from: ExoPlayerImpl */
    private static final class a implements p0 {

        /* renamed from: a  reason: collision with root package name */
        private final Object f6622a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public a1 f6623b;

        public a(Object obj, a1 a1Var) {
            this.f6622a = obj;
            this.f6623b = a1Var;
        }

        public a1 a() {
            return this.f6623b;
        }

        public Object getUid() {
            return this.f6622a;
        }
    }

    /* JADX WARNING: type inference failed for: r37v0, types: [com.google.android.exoplayer2.t0] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @android.annotation.SuppressLint({"HandlerLeak"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public e0(com.google.android.exoplayer2.w0[] r19, y5.o r20, g5.r r21, e4.l r22, z5.e r23, f4.i1 r24, boolean r25, e4.v r26, long r27, long r29, com.google.android.exoplayer2.i0 r31, long r32, boolean r34, a6.b r35, android.os.Looper r36, com.google.android.exoplayer2.t0 r37, com.google.android.exoplayer2.t0.b r38) {
        /*
            r18 = this;
            r0 = r18
            r2 = r19
            r6 = r23
            r9 = r24
            r15 = r35
            r14 = r36
            r18.<init>()
            int r1 = java.lang.System.identityHashCode(r18)
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            java.lang.String r3 = a6.m0.f209e
            java.lang.String r4 = java.lang.String.valueOf(r1)
            int r4 = r4.length()
            int r4 = r4 + 30
            java.lang.String r5 = java.lang.String.valueOf(r3)
            int r5 = r5.length()
            int r4 = r4 + r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r4)
            java.lang.String r4 = "Init "
            r5.append(r4)
            r5.append(r1)
            java.lang.String r1 = " ["
            r5.append(r1)
            java.lang.String r1 = "ExoPlayerLib/2.15.0"
            r5.append(r1)
            java.lang.String r1 = "] ["
            r5.append(r1)
            r5.append(r3)
            java.lang.String r1 = "]"
            r5.append(r1)
            java.lang.String r1 = r5.toString()
            java.lang.String r3 = "ExoPlayerImpl"
            a6.p.f(r3, r1)
            int r1 = r2.length
            r3 = 0
            if (r1 <= 0) goto L_0x005f
            r1 = 1
            goto L_0x0060
        L_0x005f:
            r1 = 0
        L_0x0060:
            a6.a.f(r1)
            java.lang.Object r1 = a6.a.e(r19)
            com.google.android.exoplayer2.w0[] r1 = (com.google.android.exoplayer2.w0[]) r1
            r0.f6599d = r1
            java.lang.Object r1 = a6.a.e(r20)
            y5.o r1 = (y5.o) r1
            r0.f6600e = r1
            r1 = r21
            r0.f6609n = r1
            r0.f6612q = r6
            r0.f6610o = r9
            r1 = r25
            r0.f6608m = r1
            r10 = r26
            r0.A = r10
            r4 = r27
            r0.f6613r = r4
            r4 = r29
            r0.f6614s = r4
            r12 = r34
            r0.C = r12
            r0.f6611p = r14
            r0.f6615t = r15
            r0.f6616u = r3
            if (r37 == 0) goto L_0x009a
            r1 = r37
            goto L_0x009b
        L_0x009a:
            r1 = r0
        L_0x009b:
            a6.o r4 = new a6.o
            com.google.android.exoplayer2.t r5 = new com.google.android.exoplayer2.t
            r5.<init>(r1)
            r4.<init>(r14, r15, r5)
            r0.f6604i = r4
            java.util.concurrent.CopyOnWriteArraySet r4 = new java.util.concurrent.CopyOnWriteArraySet
            r4.<init>()
            r0.f6605j = r4
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r0.f6607l = r4
            com.google.android.exoplayer2.source.w$a r4 = new com.google.android.exoplayer2.source.w$a
            r4.<init>(r3)
            r0.B = r4
            y5.p r4 = new y5.p
            int r3 = r2.length
            e4.t[] r3 = new e4.t[r3]
            int r5 = r2.length
            y5.h[] r5 = new y5.h[r5]
            r7 = 0
            r4.<init>(r3, r5, r7)
            r0.f6597b = r4
            com.google.android.exoplayer2.a1$b r3 = new com.google.android.exoplayer2.a1$b
            r3.<init>()
            r0.f6606k = r3
            com.google.android.exoplayer2.t0$b$a r3 = new com.google.android.exoplayer2.t0$b$a
            r3.<init>()
            r5 = 10
            int[] r5 = new int[r5]
            r5 = {1, 2, 12, 13, 14, 15, 16, 17, 18, 19} // fill-array
            com.google.android.exoplayer2.t0$b$a r3 = r3.c(r5)
            r5 = r38
            com.google.android.exoplayer2.t0$b$a r3 = r3.b(r5)
            com.google.android.exoplayer2.t0$b r3 = r3.e()
            r0.f6598c = r3
            com.google.android.exoplayer2.t0$b$a r5 = new com.google.android.exoplayer2.t0$b$a
            r5.<init>()
            com.google.android.exoplayer2.t0$b$a r3 = r5.b(r3)
            r5 = 3
            com.google.android.exoplayer2.t0$b$a r3 = r3.a(r5)
            r5 = 9
            com.google.android.exoplayer2.t0$b$a r3 = r3.a(r5)
            com.google.android.exoplayer2.t0$b r3 = r3.e()
            r0.D = r3
            com.google.android.exoplayer2.k0 r3 = com.google.android.exoplayer2.k0.G
            r0.E = r3
            r0.F = r3
            r3 = -1
            r0.H = r3
            a6.k r3 = r15.b(r14, r7)
            r0.f6601f = r3
            com.google.android.exoplayer2.u r13 = new com.google.android.exoplayer2.u
            r13.<init>(r0)
            r0.f6602g = r13
            com.google.android.exoplayer2.s0 r3 = com.google.android.exoplayer2.s0.k(r4)
            r0.G = r3
            if (r9 == 0) goto L_0x0133
            r9.P2(r1, r14)
            r0.a0(r9)
            android.os.Handler r1 = new android.os.Handler
            r1.<init>(r14)
            r6.d(r1, r9)
        L_0x0133:
            com.google.android.exoplayer2.h0 r11 = new com.google.android.exoplayer2.h0
            r1 = r11
            int r7 = r0.f6616u
            boolean r8 = r0.f6617v
            r2 = r19
            r3 = r20
            r5 = r22
            r6 = r23
            r9 = r24
            r10 = r26
            r0 = r11
            r11 = r31
            r17 = r13
            r12 = r32
            r14 = r34
            r15 = r36
            r16 = r35
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r14, r15, r16, r17)
            r1 = r0
            r0 = r18
            r0.f6603h = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.e0.<init>(com.google.android.exoplayer2.w0[], y5.o, g5.r, e4.l, z5.e, f4.i1, boolean, e4.v, long, long, com.google.android.exoplayer2.i0, long, boolean, a6.b, android.os.Looper, com.google.android.exoplayer2.t0, com.google.android.exoplayer2.t0$b):void");
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void A0(t0.c cVar) {
        cVar.D(this.E);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void E0(t0.c cVar) {
        cVar.t(this.D);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void L0(s0 s0Var, t0.c cVar) {
        cVar.h(s0Var.f7065g);
        cVar.q(s0Var.f7065g);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void T0(int i10, t0.f fVar, t0.f fVar2, t0.c cVar) {
        cVar.i(i10);
        cVar.f(fVar, fVar2, i10);
    }

    private s0 U0(s0 s0Var, a1 a1Var, Pair<Object, Long> pair) {
        int i10;
        long j10;
        a1 a1Var2 = a1Var;
        Pair<Object, Long> pair2 = pair;
        a6.a.a(a1Var.q() || pair2 != null);
        a1 a1Var3 = s0Var.f7059a;
        s0 j11 = s0Var.j(a1Var);
        if (a1Var.q()) {
            k.a l10 = s0.l();
            long d10 = c.d(this.J);
            s0 b10 = j11.c(l10, d10, d10, d10, 0, g5.w.f8923k, this.f6597b, x.s()).b(l10);
            b10.f7075q = b10.f7077s;
            return b10;
        }
        Object obj = j11.f7060b.f8900a;
        boolean z10 = !obj.equals(((Pair) m0.j(pair)).first);
        k.a aVar = z10 ? new k.a(pair2.first) : j11.f7060b;
        long longValue = ((Long) pair2.second).longValue();
        long d11 = c.d(i());
        if (!a1Var3.q()) {
            d11 -= a1Var3.h(obj, this.f6606k).l();
        }
        if (z10 || longValue < d11) {
            k.a aVar2 = aVar;
            a6.a.f(!aVar2.b());
            k.a aVar3 = aVar2;
            s0 b11 = j11.c(aVar3, longValue, longValue, longValue, 0, z10 ? g5.w.f8923k : j11.f7066h, z10 ? this.f6597b : j11.f7067i, z10 ? x.s() : j11.f7068j).b(aVar3);
            b11.f7075q = longValue;
            return b11;
        }
        if (i10 == 0) {
            int b12 = a1Var2.b(j11.f7069k.f8900a);
            if (b12 == -1 || a1Var2.f(b12, this.f6606k).f6236c != a1Var2.h(aVar.f8900a, this.f6606k).f6236c) {
                a1Var2.h(aVar.f8900a, this.f6606k);
                if (aVar.b()) {
                    j10 = this.f6606k.b(aVar.f8901b, aVar.f8902c);
                } else {
                    j10 = this.f6606k.f6237d;
                }
                j11 = j11.c(aVar, j11.f7077s, j11.f7077s, j11.f7062d, j10 - j11.f7077s, j11.f7066h, j11.f7067i, j11.f7068j).b(aVar);
                j11.f7075q = j10;
            }
        } else {
            k.a aVar4 = aVar;
            a6.a.f(!aVar4.b());
            long max = Math.max(0, j11.f7076r - (longValue - d11));
            long j12 = j11.f7075q;
            if (j11.f7069k.equals(j11.f7060b)) {
                j12 = longValue + max;
            }
            j11 = j11.c(aVar4, longValue, longValue, longValue, max, j11.f7066h, j11.f7067i, j11.f7068j);
            j11.f7075q = j12;
        }
        return j11;
    }

    private long W0(a1 a1Var, k.a aVar, long j10) {
        a1Var.h(aVar.f8900a, this.f6606k);
        return j10 + this.f6606k.l();
    }

    private s0 Z0(int i10, int i11) {
        boolean z10 = false;
        a6.a.a(i10 >= 0 && i11 >= i10 && i11 <= this.f6607l.size());
        int h10 = h();
        a1 k10 = k();
        int size = this.f6607l.size();
        this.f6618w++;
        a1(i10, i11);
        a1 c02 = c0();
        s0 U0 = U0(this.G, c02, n0(k10, c02));
        int i12 = U0.f7063e;
        if (i12 != 1 && i12 != 4 && i10 < i11 && i11 == size && h10 >= U0.f7059a.p()) {
            z10 = true;
        }
        if (z10) {
            U0 = U0.h(4);
        }
        this.f6603h.m0(i10, i11, this.B);
        return U0;
    }

    private void a1(int i10, int i11) {
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            this.f6607l.remove(i12);
        }
        this.B = this.B.b(i10, i11);
    }

    private List<r0.c> b0(int i10, List<com.google.android.exoplayer2.source.k> list) {
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < list.size(); i11++) {
            r0.c cVar = new r0.c(list.get(i11), this.f6608m);
            arrayList.add(cVar);
            this.f6607l.add(i11 + i10, new a(cVar.f7051b, cVar.f7050a.P()));
        }
        this.B = this.B.f(i10, arrayList.size());
        return arrayList;
    }

    private a1 c0() {
        return new v0(this.f6607l, this.B);
    }

    private Pair<Boolean, Integer> e0(s0 s0Var, s0 s0Var2, boolean z10, int i10, boolean z11) {
        a1 a1Var = s0Var2.f7059a;
        a1 a1Var2 = s0Var.f7059a;
        if (a1Var2.q() && a1Var.q()) {
            return new Pair<>(Boolean.FALSE, -1);
        }
        int i11 = 3;
        if (a1Var2.q() != a1Var.q()) {
            return new Pair<>(Boolean.TRUE, 3);
        }
        if (!a1Var.n(a1Var.h(s0Var2.f7060b.f8900a, this.f6606k).f6236c, this.f6596a).f6245a.equals(a1Var2.n(a1Var2.h(s0Var.f7060b.f8900a, this.f6606k).f6236c, this.f6596a).f6245a)) {
            if (z10 && i10 == 0) {
                i11 = 1;
            } else if (z10 && i10 == 1) {
                i11 = 2;
            } else if (!z11) {
                throw new IllegalStateException();
            }
            return new Pair<>(Boolean.TRUE, Integer.valueOf(i11));
        } else if (!z10 || i10 != 0 || s0Var2.f7060b.f8903d >= s0Var.f7060b.f8903d) {
            return new Pair<>(Boolean.FALSE, -1);
        } else {
            return new Pair<>(Boolean.TRUE, 0);
        }
    }

    private void e1(List<com.google.android.exoplayer2.source.k> list, int i10, long j10, boolean z10) {
        int i11;
        long j11;
        int i12 = i10;
        int l02 = l0();
        long m10 = m();
        boolean z11 = true;
        this.f6618w++;
        if (!this.f6607l.isEmpty()) {
            a1(0, this.f6607l.size());
        }
        List<r0.c> b02 = b0(0, list);
        a1 c02 = c0();
        if (c02.q() || i12 < c02.p()) {
            long j12 = j10;
            if (z10) {
                j11 = -9223372036854775807L;
                i11 = c02.a(this.f6617v);
            } else if (i12 == -1) {
                i11 = l02;
                j11 = m10;
            } else {
                i11 = i12;
                j11 = j12;
            }
            s0 U0 = U0(this.G, c02, o0(c02, i11, j11));
            int i13 = U0.f7063e;
            if (!(i11 == -1 || i13 == 1)) {
                i13 = (c02.q() || i11 >= c02.p()) ? 4 : 2;
            }
            s0 h10 = U0.h(i13);
            this.f6603h.L0(b02, i11, c.d(j11), this.B);
            if (this.G.f7060b.f8900a.equals(h10.f7060b.f8900a) || this.G.f7059a.q()) {
                z11 = false;
            }
            l1(h10, 0, 1, false, z11, 4, k0(h10), -1);
            return;
        }
        throw new IllegalSeekPositionException(c02, i12, j10);
    }

    private long k0(s0 s0Var) {
        if (s0Var.f7059a.q()) {
            return c.d(this.J);
        }
        if (s0Var.f7060b.b()) {
            return s0Var.f7077s;
        }
        return W0(s0Var.f7059a, s0Var.f7060b, s0Var.f7077s);
    }

    private void k1() {
        t0.b bVar = this.D;
        t0.b n10 = n(this.f6598c);
        this.D = n10;
        if (!n10.equals(bVar)) {
            this.f6604i.h(14, new x(this));
        }
    }

    private int l0() {
        if (this.G.f7059a.q()) {
            return this.H;
        }
        s0 s0Var = this.G;
        return s0Var.f7059a.h(s0Var.f7060b.f8900a, this.f6606k).f6236c;
    }

    private void l1(s0 s0Var, int i10, int i11, boolean z10, boolean z11, int i12, long j10, int i13) {
        s0 s0Var2 = s0Var;
        int i14 = i12;
        s0 s0Var3 = this.G;
        this.G = s0Var2;
        Pair<Boolean, Integer> e02 = e0(s0Var, s0Var3, z11, i12, !s0Var3.f7059a.equals(s0Var2.f7059a));
        boolean booleanValue = ((Boolean) e02.first).booleanValue();
        int intValue = ((Integer) e02.second).intValue();
        k0 k0Var = this.E;
        j0 j0Var = null;
        if (booleanValue) {
            if (!s0Var2.f7059a.q()) {
                j0Var = s0Var2.f7059a.n(s0Var2.f7059a.h(s0Var2.f7060b.f8900a, this.f6606k).f6236c, this.f6596a).f6247c;
            }
            k0Var = j0Var != null ? j0Var.f6746d : k0.G;
        }
        if (!s0Var3.f7068j.equals(s0Var2.f7068j)) {
            k0Var = k0Var.a().H(s0Var2.f7068j).F();
        }
        boolean z12 = !k0Var.equals(this.E);
        this.E = k0Var;
        if (!s0Var3.f7059a.equals(s0Var2.f7059a)) {
            this.f6604i.h(0, new o(s0Var, i10));
        }
        if (z11) {
            this.f6604i.h(12, new s(i14, t0(i14, s0Var3, i13), s0(j10)));
        }
        if (booleanValue) {
            this.f6604i.h(1, new y(j0Var, intValue));
        }
        if (s0Var3.f7064f != s0Var2.f7064f) {
            this.f6604i.h(11, new c0(s0Var));
            if (s0Var2.f7064f != null) {
                this.f6604i.h(11, new a0(s0Var));
            }
        }
        p pVar = s0Var3.f7067i;
        p pVar2 = s0Var2.f7067i;
        if (pVar != pVar2) {
            this.f6600e.c(pVar2.f13101d);
            this.f6604i.h(2, new p(s0Var, new l(s0Var2.f7067i.f13100c)));
        }
        if (!s0Var3.f7068j.equals(s0Var2.f7068j)) {
            this.f6604i.h(3, new d0(s0Var));
        }
        if (z12) {
            this.f6604i.h(15, new z(this.E));
        }
        if (s0Var3.f7065g != s0Var2.f7065g) {
            this.f6604i.h(4, new k(s0Var));
        }
        if (!(s0Var3.f7063e == s0Var2.f7063e && s0Var3.f7070l == s0Var2.f7070l)) {
            this.f6604i.h(-1, new b0(s0Var));
        }
        if (s0Var3.f7063e != s0Var2.f7063e) {
            this.f6604i.h(5, new m(s0Var));
        }
        if (s0Var3.f7070l != s0Var2.f7070l) {
            this.f6604i.h(6, new n(s0Var, i11));
        }
        if (s0Var3.f7071m != s0Var2.f7071m) {
            this.f6604i.h(7, new l(s0Var));
        }
        if (w0(s0Var3) != w0(s0Var)) {
            this.f6604i.h(8, new i(s0Var));
        }
        if (!s0Var3.f7072n.equals(s0Var2.f7072n)) {
            this.f6604i.h(13, new j(s0Var));
        }
        if (z10) {
            this.f6604i.h(-1, h.f14228a);
        }
        k1();
        this.f6604i.e();
        if (s0Var3.f7073o != s0Var2.f7073o) {
            Iterator<g> it = this.f6605j.iterator();
            while (it.hasNext()) {
                it.next().P(s0Var2.f7073o);
            }
        }
        if (s0Var3.f7074p != s0Var2.f7074p) {
            Iterator<g> it2 = this.f6605j.iterator();
            while (it2.hasNext()) {
                it2.next().u(s0Var2.f7074p);
            }
        }
    }

    private Pair<Object, Long> n0(a1 a1Var, a1 a1Var2) {
        long i10 = i();
        int i11 = -1;
        if (a1Var.q() || a1Var2.q()) {
            boolean z10 = !a1Var.q() && a1Var2.q();
            if (!z10) {
                i11 = l0();
            }
            if (z10) {
                i10 = -9223372036854775807L;
            }
            return o0(a1Var2, i11, i10);
        }
        Pair<Object, Long> j10 = a1Var.j(this.f6596a, this.f6606k, h(), c.d(i10));
        Object obj = ((Pair) m0.j(j10)).first;
        if (a1Var2.b(obj) != -1) {
            return j10;
        }
        Object x02 = h0.x0(this.f6596a, this.f6606k, this.f6616u, this.f6617v, obj, a1Var, a1Var2);
        if (x02 == null) {
            return o0(a1Var2, -1, -9223372036854775807L);
        }
        a1Var2.h(x02, this.f6606k);
        int i12 = this.f6606k.f6236c;
        return o0(a1Var2, i12, a1Var2.n(i12, this.f6596a).b());
    }

    private Pair<Object, Long> o0(a1 a1Var, int i10, long j10) {
        if (a1Var.q()) {
            this.H = i10;
            if (j10 == -9223372036854775807L) {
                j10 = 0;
            }
            this.J = j10;
            this.I = 0;
            return null;
        }
        if (i10 == -1 || i10 >= a1Var.p()) {
            i10 = a1Var.a(this.f6617v);
            j10 = a1Var.n(i10, this.f6596a).b();
        }
        return a1Var.j(this.f6596a, this.f6606k, i10, c.d(j10));
    }

    private t0.f s0(long j10) {
        int i10;
        Object obj;
        int h10 = h();
        Object obj2 = null;
        if (!this.G.f7059a.q()) {
            s0 s0Var = this.G;
            Object obj3 = s0Var.f7060b.f8900a;
            s0Var.f7059a.h(obj3, this.f6606k);
            i10 = this.G.f7059a.b(obj3);
            obj = obj3;
            obj2 = this.G.f7059a.n(h10, this.f6596a).f6245a;
        } else {
            obj = null;
            i10 = -1;
        }
        long e10 = c.e(j10);
        long e11 = this.G.f7060b.b() ? c.e(u0(this.G)) : e10;
        k.a aVar = this.G.f7060b;
        return new t0.f(obj2, h10, obj, i10, e10, e11, aVar.f8901b, aVar.f8902c);
    }

    private t0.f t0(int i10, s0 s0Var, int i11) {
        int i12;
        Object obj;
        int i13;
        Object obj2;
        long j10;
        long j11;
        s0 s0Var2 = s0Var;
        a1.b bVar = new a1.b();
        if (!s0Var2.f7059a.q()) {
            Object obj3 = s0Var2.f7060b.f8900a;
            s0Var2.f7059a.h(obj3, bVar);
            int i14 = bVar.f6236c;
            i13 = i14;
            obj = obj3;
            i12 = s0Var2.f7059a.b(obj3);
            obj2 = s0Var2.f7059a.n(i14, this.f6596a).f6245a;
        } else {
            i13 = i11;
            obj2 = null;
            obj = null;
            i12 = -1;
        }
        if (i10 == 0) {
            j10 = bVar.f6238e + bVar.f6237d;
            if (s0Var2.f7060b.b()) {
                k.a aVar = s0Var2.f7060b;
                j10 = bVar.b(aVar.f8901b, aVar.f8902c);
                j11 = u0(s0Var);
                long e10 = c.e(j10);
                long e11 = c.e(j11);
                k.a aVar2 = s0Var2.f7060b;
                return new t0.f(obj2, i13, obj, i12, e10, e11, aVar2.f8901b, aVar2.f8902c);
            } else if (s0Var2.f7060b.f8904e != -1 && this.G.f7060b.b()) {
                j10 = u0(this.G);
            }
        } else if (s0Var2.f7060b.b()) {
            j10 = s0Var2.f7077s;
            j11 = u0(s0Var);
            long e102 = c.e(j10);
            long e112 = c.e(j11);
            k.a aVar22 = s0Var2.f7060b;
            return new t0.f(obj2, i13, obj, i12, e102, e112, aVar22.f8901b, aVar22.f8902c);
        } else {
            j10 = bVar.f6238e + s0Var2.f7077s;
        }
        j11 = j10;
        long e1022 = c.e(j10);
        long e1122 = c.e(j11);
        k.a aVar222 = s0Var2.f7060b;
        return new t0.f(obj2, i13, obj, i12, e1022, e1122, aVar222.f8901b, aVar222.f8902c);
    }

    private static long u0(s0 s0Var) {
        a1.c cVar = new a1.c();
        a1.b bVar = new a1.b();
        s0Var.f7059a.h(s0Var.f7060b.f8900a, bVar);
        if (s0Var.f7061c == -9223372036854775807L) {
            return s0Var.f7059a.n(bVar.f6236c, cVar).c();
        }
        return bVar.l() + s0Var.f7061c;
    }

    /* access modifiers changed from: private */
    /* renamed from: v0 */
    public void y0(h0.e eVar) {
        long j10;
        boolean z10;
        long j11;
        int i10 = this.f6618w - eVar.f6725c;
        this.f6618w = i10;
        boolean z11 = true;
        if (eVar.f6726d) {
            this.f6619x = eVar.f6727e;
            this.f6620y = true;
        }
        if (eVar.f6728f) {
            this.f6621z = eVar.f6729g;
        }
        if (i10 == 0) {
            a1 a1Var = eVar.f6724b.f7059a;
            if (!this.G.f7059a.q() && a1Var.q()) {
                this.H = -1;
                this.J = 0;
                this.I = 0;
            }
            if (!a1Var.q()) {
                List<a1> E2 = ((v0) a1Var).E();
                a6.a.f(E2.size() == this.f6607l.size());
                for (int i11 = 0; i11 < E2.size(); i11++) {
                    a1 unused = this.f6607l.get(i11).f6623b = E2.get(i11);
                }
            }
            if (this.f6620y) {
                if (eVar.f6724b.f7060b.equals(this.G.f7060b) && eVar.f6724b.f7062d == this.G.f7077s) {
                    z11 = false;
                }
                if (z11) {
                    if (a1Var.q() || eVar.f6724b.f7060b.b()) {
                        j11 = eVar.f6724b.f7062d;
                    } else {
                        s0 s0Var = eVar.f6724b;
                        j11 = W0(a1Var, s0Var.f7060b, s0Var.f7062d);
                    }
                    j10 = j11;
                } else {
                    j10 = -9223372036854775807L;
                }
                z10 = z11;
            } else {
                j10 = -9223372036854775807L;
                z10 = false;
            }
            this.f6620y = false;
            l1(eVar.f6724b, 1, this.f6621z, false, z10, this.f6619x, j10, -1);
        }
    }

    private static boolean w0(s0 s0Var) {
        return s0Var.f7063e == 3 && s0Var.f7070l && s0Var.f7071m == 0;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void z0(h0.e eVar) {
        this.f6601f.c(new v(this, eVar));
    }

    public void V0(x4.a aVar) {
        k0 F2 = this.E.a().I(aVar).F();
        if (!F2.equals(this.E)) {
            this.E = F2;
            this.f6604i.j(15, new w(this));
        }
    }

    public void X0() {
        s0 s0Var = this.G;
        if (s0Var.f7063e == 1) {
            s0 f10 = s0Var.f((ExoPlaybackException) null);
            s0 h10 = f10.h(f10.f7059a.q() ? 4 : 2);
            this.f6618w++;
            this.f6603h.h0();
            l1(h10, 1, 1, false, false, 5, -9223372036854775807L, -1);
        }
    }

    public void Y(g gVar) {
        this.f6605j.add(gVar);
    }

    public void Y0() {
        String hexString = Integer.toHexString(System.identityHashCode(this));
        String str = m0.f209e;
        String b10 = i.b();
        StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 36 + String.valueOf(str).length() + String.valueOf(b10).length());
        sb.append("Release ");
        sb.append(hexString);
        sb.append(" [");
        sb.append("ExoPlayerLib/2.15.0");
        sb.append("] [");
        sb.append(str);
        sb.append("] [");
        sb.append(b10);
        sb.append("]");
        a6.p.f("ExoPlayerImpl", sb.toString());
        if (!this.f6603h.j0()) {
            this.f6604i.j(11, r.f7031a);
        }
        this.f6604i.i();
        this.f6601f.k((Object) null);
        i1 i1Var = this.f6610o;
        if (i1Var != null) {
            this.f6612q.g(i1Var);
        }
        s0 h10 = this.G.h(1);
        this.G = h10;
        s0 b11 = h10.b(h10.f7060b);
        this.G = b11;
        b11.f7075q = b11.f7077s;
        this.G.f7076r = 0;
    }

    public void Z(t0.c cVar) {
        this.f6604i.c(cVar);
    }

    public boolean a() {
        return this.G.f7060b.b();
    }

    public void a0(t0.e eVar) {
        Z(eVar);
    }

    public long b() {
        return c.e(this.G.f7076r);
    }

    public void b1(com.google.android.exoplayer2.source.k kVar) {
        c1(Collections.singletonList(kVar));
    }

    public void c(int i10, long j10) {
        int i11 = i10;
        long j11 = j10;
        a1 a1Var = this.G.f7059a;
        if (i11 < 0 || (!a1Var.q() && i11 >= a1Var.p())) {
            throw new IllegalSeekPositionException(a1Var, i10, j11);
        }
        int i12 = 1;
        this.f6618w++;
        if (a()) {
            a6.p.h("ExoPlayerImpl", "seekTo ignored because an ad is playing");
            h0.e eVar = new h0.e(this.G);
            eVar.b(1);
            this.f6602g.a(eVar);
            return;
        }
        if (r0() != 1) {
            i12 = 2;
        }
        int h10 = h();
        s0 U0 = U0(this.G.h(i12), a1Var, o0(a1Var, i10, j11));
        this.f6603h.z0(a1Var, i10, c.d(j10));
        l1(U0, 0, 1, true, true, 1, k0(U0), h10);
    }

    public void c1(List<com.google.android.exoplayer2.source.k> list) {
        d1(list, true);
    }

    public void d(boolean z10) {
        j1(z10, (ExoPlaybackException) null);
    }

    public u0 d0(u0.b bVar) {
        return new u0(this.f6603h, bVar, this.G.f7059a, h(), this.f6615t, this.f6603h.A());
    }

    public void d1(List<com.google.android.exoplayer2.source.k> list, boolean z10) {
        e1(list, -1, -9223372036854775807L, z10);
    }

    public int e() {
        if (this.G.f7059a.q()) {
            return this.I;
        }
        s0 s0Var = this.G;
        return s0Var.f7059a.b(s0Var.f7060b.f8900a);
    }

    public int f() {
        if (a()) {
            return this.G.f7060b.f8902c;
        }
        return -1;
    }

    public boolean f0() {
        return this.G.f7074p;
    }

    public void f1(boolean z10, int i10, int i11) {
        s0 s0Var = this.G;
        if (s0Var.f7070l != z10 || s0Var.f7071m != i10) {
            this.f6618w++;
            s0 e10 = s0Var.e(z10, i10);
            this.f6603h.O0(z10, i10);
            l1(e10, 0, i11, false, false, 5, -9223372036854775807L, -1);
        }
    }

    public int g() {
        return this.f6616u;
    }

    public void g0(long j10) {
        this.f6603h.t(j10);
    }

    public void g1(m mVar) {
        if (mVar == null) {
            mVar = m.f8132d;
        }
        if (!this.G.f7072n.equals(mVar)) {
            s0 g10 = this.G.g(mVar);
            this.f6618w++;
            this.f6603h.Q0(mVar);
            l1(g10, 0, 1, false, false, 5, -9223372036854775807L, -1);
        }
    }

    public int h() {
        int l02 = l0();
        if (l02 == -1) {
            return 0;
        }
        return l02;
    }

    public Looper h0() {
        return this.f6611p;
    }

    public void h1(int i10) {
        if (this.f6616u != i10) {
            this.f6616u = i10;
            this.f6603h.S0(i10);
            this.f6604i.h(9, new h(i10));
            k1();
            this.f6604i.e();
        }
    }

    public long i() {
        if (!a()) {
            return m();
        }
        s0 s0Var = this.G;
        s0Var.f7059a.h(s0Var.f7060b.f8900a, this.f6606k);
        s0 s0Var2 = this.G;
        if (s0Var2.f7061c == -9223372036854775807L) {
            return s0Var2.f7059a.n(h(), this.f6596a).b();
        }
        return this.f6606k.k() + c.e(this.G.f7061c);
    }

    public long i0() {
        if (!a()) {
            return j0();
        }
        s0 s0Var = this.G;
        if (s0Var.f7069k.equals(s0Var.f7060b)) {
            return c.e(this.G.f7075q);
        }
        return m0();
    }

    public void i1(boolean z10) {
        if (this.f6617v != z10) {
            this.f6617v = z10;
            this.f6603h.V0(z10);
            this.f6604i.h(10, new q(z10));
            k1();
            this.f6604i.e();
        }
    }

    public int j() {
        if (a()) {
            return this.G.f7060b.f8901b;
        }
        return -1;
    }

    public long j0() {
        if (this.G.f7059a.q()) {
            return this.J;
        }
        s0 s0Var = this.G;
        if (s0Var.f7069k.f8903d != s0Var.f7060b.f8903d) {
            return s0Var.f7059a.n(h(), this.f6596a).d();
        }
        long j10 = s0Var.f7075q;
        if (this.G.f7069k.b()) {
            s0 s0Var2 = this.G;
            a1.b h10 = s0Var2.f7059a.h(s0Var2.f7069k.f8900a, this.f6606k);
            long e10 = h10.e(this.G.f7069k.f8901b);
            j10 = e10 == Long.MIN_VALUE ? h10.f6237d : e10;
        }
        s0 s0Var3 = this.G;
        return c.e(W0(s0Var3.f7059a, s0Var3.f7069k, j10));
    }

    public void j1(boolean z10, ExoPlaybackException exoPlaybackException) {
        s0 s0Var;
        if (z10) {
            s0Var = Z0(0, this.f6607l.size()).f((ExoPlaybackException) null);
        } else {
            s0 s0Var2 = this.G;
            s0Var = s0Var2.b(s0Var2.f7060b);
            s0Var.f7075q = s0Var.f7077s;
            s0Var.f7076r = 0;
        }
        s0 h10 = s0Var.h(1);
        if (exoPlaybackException != null) {
            h10 = h10.f(exoPlaybackException);
        }
        s0 s0Var3 = h10;
        this.f6618w++;
        this.f6603h.f1();
        l1(s0Var3, 0, 1, false, s0Var3.f7059a.q() && !this.G.f7059a.q(), 4, k0(s0Var3), -1);
    }

    public a1 k() {
        return this.G.f7059a;
    }

    public boolean l() {
        return this.f6617v;
    }

    public long m() {
        return c.e(k0(this.G));
    }

    public long m0() {
        if (!a()) {
            return o();
        }
        s0 s0Var = this.G;
        k.a aVar = s0Var.f7060b;
        s0Var.f7059a.h(aVar.f8900a, this.f6606k);
        return c.e(this.f6606k.b(aVar.f8901b, aVar.f8902c));
    }

    public boolean p0() {
        return this.G.f7070l;
    }

    public m q0() {
        return this.G.f7072n;
    }

    public int r0() {
        return this.G.f7063e;
    }
}
