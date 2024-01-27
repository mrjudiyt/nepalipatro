package com.google.android.exoplayer2.extractor.flv;

import a6.y;
import k4.i;
import k4.j;
import k4.k;
import k4.o;
import k4.x;
import k4.y;
import n4.a;

/* compiled from: FlvExtractor */
public final class b implements i {

    /* renamed from: q  reason: collision with root package name */
    public static final o f6629q = a.f15775b;

    /* renamed from: a  reason: collision with root package name */
    private final y f6630a = new y(4);

    /* renamed from: b  reason: collision with root package name */
    private final y f6631b = new y(9);

    /* renamed from: c  reason: collision with root package name */
    private final y f6632c = new y(11);

    /* renamed from: d  reason: collision with root package name */
    private final y f6633d = new y();

    /* renamed from: e  reason: collision with root package name */
    private final c f6634e = new c();

    /* renamed from: f  reason: collision with root package name */
    private k f6635f;

    /* renamed from: g  reason: collision with root package name */
    private int f6636g = 1;

    /* renamed from: h  reason: collision with root package name */
    private boolean f6637h;

    /* renamed from: i  reason: collision with root package name */
    private long f6638i;

    /* renamed from: j  reason: collision with root package name */
    private int f6639j;

    /* renamed from: k  reason: collision with root package name */
    private int f6640k;

    /* renamed from: l  reason: collision with root package name */
    private int f6641l;

    /* renamed from: m  reason: collision with root package name */
    private long f6642m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f6643n;

    /* renamed from: o  reason: collision with root package name */
    private a f6644o;

    /* renamed from: p  reason: collision with root package name */
    private d f6645p;

    private void e() {
        if (!this.f6643n) {
            this.f6635f.i(new y.b(-9223372036854775807L));
            this.f6643n = true;
        }
    }

    private long f() {
        if (this.f6637h) {
            return this.f6638i + this.f6642m;
        }
        if (this.f6634e.d() == -9223372036854775807L) {
            return 0;
        }
        return this.f6642m;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ i[] h() {
        return new i[]{new b()};
    }

    private a6.y i(j jVar) {
        if (this.f6641l > this.f6633d.b()) {
            a6.y yVar = this.f6633d;
            yVar.M(new byte[Math.max(yVar.b() * 2, this.f6641l)], 0);
        } else {
            this.f6633d.O(0);
        }
        this.f6633d.N(this.f6641l);
        jVar.readFully(this.f6633d.d(), 0, this.f6641l);
        return this.f6633d;
    }

    private boolean j(j jVar) {
        boolean z10 = false;
        if (!jVar.b(this.f6631b.d(), 0, 9, true)) {
            return false;
        }
        this.f6631b.O(0);
        this.f6631b.P(4);
        int C = this.f6631b.C();
        boolean z11 = (C & 4) != 0;
        if ((C & 1) != 0) {
            z10 = true;
        }
        if (z11 && this.f6644o == null) {
            this.f6644o = new a(this.f6635f.e(8, 1));
        }
        if (z10 && this.f6645p == null) {
            this.f6645p = new d(this.f6635f.e(9, 2));
        }
        this.f6635f.o();
        this.f6639j = (this.f6631b.m() - 9) + 4;
        this.f6636g = 2;
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x008b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean k(k4.j r10) {
        /*
            r9 = this;
            long r0 = r9.f()
            int r2 = r9.f6640k
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5 = 0
            r6 = 1
            r7 = 8
            if (r2 != r7) goto L_0x0024
            com.google.android.exoplayer2.extractor.flv.a r7 = r9.f6644o
            if (r7 == 0) goto L_0x0024
            r9.e()
            com.google.android.exoplayer2.extractor.flv.a r2 = r9.f6644o
            a6.y r10 = r9.i(r10)
            boolean r5 = r2.a(r10, r0)
        L_0x0022:
            r10 = 1
            goto L_0x0075
        L_0x0024:
            r7 = 9
            if (r2 != r7) goto L_0x003a
            com.google.android.exoplayer2.extractor.flv.d r7 = r9.f6645p
            if (r7 == 0) goto L_0x003a
            r9.e()
            com.google.android.exoplayer2.extractor.flv.d r2 = r9.f6645p
            a6.y r10 = r9.i(r10)
            boolean r5 = r2.a(r10, r0)
            goto L_0x0022
        L_0x003a:
            r7 = 18
            if (r2 != r7) goto L_0x006f
            boolean r2 = r9.f6643n
            if (r2 != 0) goto L_0x006f
            com.google.android.exoplayer2.extractor.flv.c r2 = r9.f6634e
            a6.y r10 = r9.i(r10)
            boolean r5 = r2.a(r10, r0)
            com.google.android.exoplayer2.extractor.flv.c r10 = r9.f6634e
            long r0 = r10.d()
            int r10 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r10 == 0) goto L_0x0022
            k4.k r10 = r9.f6635f
            k4.w r2 = new k4.w
            com.google.android.exoplayer2.extractor.flv.c r7 = r9.f6634e
            long[] r7 = r7.e()
            com.google.android.exoplayer2.extractor.flv.c r8 = r9.f6634e
            long[] r8 = r8.f()
            r2.<init>(r7, r8, r0)
            r10.i(r2)
            r9.f6643n = r6
            goto L_0x0022
        L_0x006f:
            int r0 = r9.f6641l
            r10.l(r0)
            r10 = 0
        L_0x0075:
            boolean r0 = r9.f6637h
            if (r0 != 0) goto L_0x008f
            if (r5 == 0) goto L_0x008f
            r9.f6637h = r6
            com.google.android.exoplayer2.extractor.flv.c r0 = r9.f6634e
            long r0 = r0.d()
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 != 0) goto L_0x008b
            long r0 = r9.f6642m
            long r0 = -r0
            goto L_0x008d
        L_0x008b:
            r0 = 0
        L_0x008d:
            r9.f6638i = r0
        L_0x008f:
            r0 = 4
            r9.f6639j = r0
            r0 = 2
            r9.f6636g = r0
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.flv.b.k(k4.j):boolean");
    }

    private boolean l(j jVar) {
        if (!jVar.b(this.f6632c.d(), 0, 11, true)) {
            return false;
        }
        this.f6632c.O(0);
        this.f6640k = this.f6632c.C();
        this.f6641l = this.f6632c.F();
        this.f6642m = (long) this.f6632c.F();
        this.f6642m = (((long) (this.f6632c.C() << 24)) | this.f6642m) * 1000;
        this.f6632c.P(3);
        this.f6636g = 4;
        return true;
    }

    private void m(j jVar) {
        jVar.l(this.f6639j);
        this.f6639j = 0;
        this.f6636g = 3;
    }

    public void b(long j10, long j11) {
        if (j10 == 0) {
            this.f6636g = 1;
            this.f6637h = false;
        } else {
            this.f6636g = 3;
        }
        this.f6639j = 0;
    }

    public void c(k kVar) {
        this.f6635f = kVar;
    }

    public boolean d(j jVar) {
        jVar.o(this.f6630a.d(), 0, 3);
        this.f6630a.O(0);
        if (this.f6630a.F() != 4607062) {
            return false;
        }
        jVar.o(this.f6630a.d(), 0, 2);
        this.f6630a.O(0);
        if ((this.f6630a.I() & 250) != 0) {
            return false;
        }
        jVar.o(this.f6630a.d(), 0, 4);
        this.f6630a.O(0);
        int m10 = this.f6630a.m();
        jVar.k();
        jVar.f(m10);
        jVar.o(this.f6630a.d(), 0, 4);
        this.f6630a.O(0);
        if (this.f6630a.m() == 0) {
            return true;
        }
        return false;
    }

    public int g(j jVar, x xVar) {
        a6.a.h(this.f6635f);
        while (true) {
            int i10 = this.f6636g;
            if (i10 != 1) {
                if (i10 == 2) {
                    m(jVar);
                } else if (i10 != 3) {
                    if (i10 != 4) {
                        throw new IllegalStateException();
                    } else if (k(jVar)) {
                        return 0;
                    }
                } else if (!l(jVar)) {
                    return -1;
                }
            } else if (!j(jVar)) {
                return -1;
            }
        }
    }

    public void release() {
    }
}
