package com.google.android.exoplayer2.source;

import a6.m0;
import com.google.android.exoplayer2.a1;
import com.google.android.exoplayer2.j0;
import com.google.android.exoplayer2.source.k;
import z5.r;

/* compiled from: MaskingMediaSource */
public final class i extends c<Void> {

    /* renamed from: j  reason: collision with root package name */
    private final k f7452j;

    /* renamed from: k  reason: collision with root package name */
    private final boolean f7453k;

    /* renamed from: l  reason: collision with root package name */
    private final a1.c f7454l;

    /* renamed from: m  reason: collision with root package name */
    private final a1.b f7455m;

    /* renamed from: n  reason: collision with root package name */
    private a f7456n;

    /* renamed from: o  reason: collision with root package name */
    private h f7457o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f7458p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f7459q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f7460r;

    /* compiled from: MaskingMediaSource */
    private static final class a extends f {

        /* renamed from: f  reason: collision with root package name */
        public static final Object f7461f = new Object();

        /* renamed from: d  reason: collision with root package name */
        private final Object f7462d;
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public final Object f7463e;

        private a(a1 a1Var, Object obj, Object obj2) {
            super(a1Var);
            this.f7462d = obj;
            this.f7463e = obj2;
        }

        public static a u(j0 j0Var) {
            return new a(new b(j0Var), a1.c.f6241r, f7461f);
        }

        public static a v(a1 a1Var, Object obj, Object obj2) {
            return new a(a1Var, obj, obj2);
        }

        public int b(Object obj) {
            Object obj2;
            a1 a1Var = this.f7282c;
            if (f7461f.equals(obj) && (obj2 = this.f7463e) != null) {
                obj = obj2;
            }
            return a1Var.b(obj);
        }

        public a1.b g(int i10, a1.b bVar, boolean z10) {
            this.f7282c.g(i10, bVar, z10);
            if (m0.c(bVar.f6235b, this.f7463e) && z10) {
                bVar.f6235b = f7461f;
            }
            return bVar;
        }

        public Object m(int i10) {
            Object m10 = this.f7282c.m(i10);
            return m0.c(m10, this.f7463e) ? f7461f : m10;
        }

        public a1.c o(int i10, a1.c cVar, long j10) {
            this.f7282c.o(i10, cVar, j10);
            if (m0.c(cVar.f6245a, this.f7462d)) {
                cVar.f6245a = a1.c.f6241r;
            }
            return cVar;
        }

        public a t(a1 a1Var) {
            return new a(a1Var, this.f7462d, this.f7463e);
        }
    }

    /* compiled from: MaskingMediaSource */
    public static final class b extends a1 {

        /* renamed from: c  reason: collision with root package name */
        private final j0 f7464c;

        public b(j0 j0Var) {
            this.f7464c = j0Var;
        }

        public int b(Object obj) {
            return obj == a.f7461f ? 0 : -1;
        }

        public a1.b g(int i10, a1.b bVar, boolean z10) {
            Object obj = null;
            Integer num = z10 ? 0 : null;
            if (z10) {
                obj = a.f7461f;
            }
            bVar.o(num, obj, 0, -9223372036854775807L, 0, h5.a.f8986g, true);
            return bVar;
        }

        public int i() {
            return 1;
        }

        public Object m(int i10) {
            return a.f7461f;
        }

        public a1.c o(int i10, a1.c cVar, long j10) {
            a1.c cVar2 = cVar;
            cVar.g(a1.c.f6241r, this.f7464c, (Object) null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, false, true, (j0.f) null, 0, -9223372036854775807L, 0, 0, 0);
            a1.c cVar3 = cVar;
            cVar3.f6256l = true;
            return cVar3;
        }

        public int p() {
            return 1;
        }
    }

    public i(k kVar, boolean z10) {
        this.f7452j = kVar;
        this.f7453k = z10 && kVar.m();
        this.f7454l = new a1.c();
        this.f7455m = new a1.b();
        a1 o10 = kVar.o();
        if (o10 != null) {
            this.f7456n = a.v(o10, (Object) null, (Object) null);
            this.f7460r = true;
            return;
        }
        this.f7456n = a.u(kVar.g());
    }

    private Object M(Object obj) {
        return (this.f7456n.f7463e == null || !this.f7456n.f7463e.equals(obj)) ? obj : a.f7461f;
    }

    private Object N(Object obj) {
        return (this.f7456n.f7463e == null || !obj.equals(a.f7461f)) ? obj : this.f7456n.f7463e;
    }

    private void R(long j10) {
        h hVar = this.f7457o;
        int b10 = this.f7456n.b(hVar.f7288h.f8900a);
        if (b10 != -1) {
            long j11 = this.f7456n.f(b10, this.f7455m).f6237d;
            if (j11 != -9223372036854775807L && j10 >= j11) {
                j10 = Math.max(0, j11 - 1);
            }
            hVar.v(j10);
        }
    }

    public void A() {
        this.f7459q = false;
        this.f7458p = false;
        super.A();
    }

    /* renamed from: L */
    public h h(k.a aVar, z5.b bVar, long j10) {
        h hVar = new h(aVar, bVar, j10);
        hVar.x(this.f7452j);
        if (this.f7459q) {
            hVar.a(aVar.c(N(aVar.f8900a)));
        } else {
            this.f7457o = hVar;
            if (!this.f7458p) {
                this.f7458p = true;
                J(null, this.f7452j);
            }
        }
        return hVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: O */
    public k.a E(Void voidR, k.a aVar) {
        return aVar.c(M(aVar.f8900a));
    }

    public a1 P() {
        return this.f7456n;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* renamed from: Q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void I(java.lang.Void r13, com.google.android.exoplayer2.source.k r14, com.google.android.exoplayer2.a1 r15) {
        /*
            r12 = this;
            boolean r13 = r12.f7459q
            if (r13 == 0) goto L_0x0019
            com.google.android.exoplayer2.source.i$a r13 = r12.f7456n
            com.google.android.exoplayer2.source.i$a r13 = r13.t(r15)
            r12.f7456n = r13
            com.google.android.exoplayer2.source.h r13 = r12.f7457o
            if (r13 == 0) goto L_0x00ae
            long r13 = r13.e()
            r12.R(r13)
            goto L_0x00ae
        L_0x0019:
            boolean r13 = r15.q()
            if (r13 == 0) goto L_0x0036
            boolean r13 = r12.f7460r
            if (r13 == 0) goto L_0x002a
            com.google.android.exoplayer2.source.i$a r13 = r12.f7456n
            com.google.android.exoplayer2.source.i$a r13 = r13.t(r15)
            goto L_0x0032
        L_0x002a:
            java.lang.Object r13 = com.google.android.exoplayer2.a1.c.f6241r
            java.lang.Object r14 = com.google.android.exoplayer2.source.i.a.f7461f
            com.google.android.exoplayer2.source.i$a r13 = com.google.android.exoplayer2.source.i.a.v(r15, r13, r14)
        L_0x0032:
            r12.f7456n = r13
            goto L_0x00ae
        L_0x0036:
            com.google.android.exoplayer2.a1$c r13 = r12.f7454l
            r14 = 0
            r15.n(r14, r13)
            com.google.android.exoplayer2.a1$c r13 = r12.f7454l
            long r0 = r13.c()
            com.google.android.exoplayer2.a1$c r13 = r12.f7454l
            java.lang.Object r13 = r13.f6245a
            com.google.android.exoplayer2.source.h r2 = r12.f7457o
            if (r2 == 0) goto L_0x0074
            long r2 = r2.l()
            com.google.android.exoplayer2.source.i$a r4 = r12.f7456n
            com.google.android.exoplayer2.source.h r5 = r12.f7457o
            com.google.android.exoplayer2.source.k$a r5 = r5.f7288h
            java.lang.Object r5 = r5.f8900a
            com.google.android.exoplayer2.a1$b r6 = r12.f7455m
            r4.h(r5, r6)
            com.google.android.exoplayer2.a1$b r4 = r12.f7455m
            long r4 = r4.l()
            long r4 = r4 + r2
            com.google.android.exoplayer2.source.i$a r2 = r12.f7456n
            com.google.android.exoplayer2.a1$c r3 = r12.f7454l
            com.google.android.exoplayer2.a1$c r14 = r2.n(r14, r3)
            long r2 = r14.c()
            int r14 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r14 == 0) goto L_0x0074
            r10 = r4
            goto L_0x0075
        L_0x0074:
            r10 = r0
        L_0x0075:
            com.google.android.exoplayer2.a1$c r7 = r12.f7454l
            com.google.android.exoplayer2.a1$b r8 = r12.f7455m
            r9 = 0
            r6 = r15
            android.util.Pair r14 = r6.j(r7, r8, r9, r10)
            java.lang.Object r0 = r14.first
            java.lang.Object r14 = r14.second
            java.lang.Long r14 = (java.lang.Long) r14
            long r1 = r14.longValue()
            boolean r14 = r12.f7460r
            if (r14 == 0) goto L_0x0094
            com.google.android.exoplayer2.source.i$a r13 = r12.f7456n
            com.google.android.exoplayer2.source.i$a r13 = r13.t(r15)
            goto L_0x0098
        L_0x0094:
            com.google.android.exoplayer2.source.i$a r13 = com.google.android.exoplayer2.source.i.a.v(r15, r13, r0)
        L_0x0098:
            r12.f7456n = r13
            com.google.android.exoplayer2.source.h r13 = r12.f7457o
            if (r13 == 0) goto L_0x00ae
            r12.R(r1)
            com.google.android.exoplayer2.source.k$a r13 = r13.f7288h
            java.lang.Object r14 = r13.f8900a
            java.lang.Object r14 = r12.N(r14)
            com.google.android.exoplayer2.source.k$a r13 = r13.c(r14)
            goto L_0x00af
        L_0x00ae:
            r13 = 0
        L_0x00af:
            r14 = 1
            r12.f7460r = r14
            r12.f7459q = r14
            com.google.android.exoplayer2.source.i$a r14 = r12.f7456n
            r12.z(r14)
            if (r13 == 0) goto L_0x00c6
            com.google.android.exoplayer2.source.h r14 = r12.f7457o
            java.lang.Object r14 = a6.a.e(r14)
            com.google.android.exoplayer2.source.h r14 = (com.google.android.exoplayer2.source.h) r14
            r14.a(r13)
        L_0x00c6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.i.I(java.lang.Void, com.google.android.exoplayer2.source.k, com.google.android.exoplayer2.a1):void");
    }

    public j0 g() {
        return this.f7452j.g();
    }

    public void l() {
    }

    public void n(j jVar) {
        ((h) jVar).w();
        if (jVar == this.f7457o) {
            this.f7457o = null;
        }
    }

    public void y(r rVar) {
        super.y(rVar);
        if (!this.f7453k) {
            this.f7458p = true;
            J(null, this.f7452j);
        }
    }
}
