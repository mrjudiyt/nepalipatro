package com.google.android.exoplayer2;

import a6.m0;
import android.net.Uri;
import android.util.Pair;
import b6.y;
import com.google.android.exoplayer2.j0;
import h5.a;

/* compiled from: Timeline */
public abstract class a1 {

    /* renamed from: a  reason: collision with root package name */
    public static final a1 f6231a = new a();

    /* renamed from: b  reason: collision with root package name */
    public static final e4.b<a1> f6232b = y.f5134a;

    /* compiled from: Timeline */
    class a extends a1 {
        a() {
        }

        public int b(Object obj) {
            return -1;
        }

        public b g(int i10, b bVar, boolean z10) {
            throw new IndexOutOfBoundsException();
        }

        public int i() {
            return 0;
        }

        public Object m(int i10) {
            throw new IndexOutOfBoundsException();
        }

        public c o(int i10, c cVar, long j10) {
            throw new IndexOutOfBoundsException();
        }

        public int p() {
            return 0;
        }
    }

    /* compiled from: Timeline */
    public static final class b {

        /* renamed from: h  reason: collision with root package name */
        public static final e4.b<b> f6233h = y.f5134a;

        /* renamed from: a  reason: collision with root package name */
        public Object f6234a;

        /* renamed from: b  reason: collision with root package name */
        public Object f6235b;

        /* renamed from: c  reason: collision with root package name */
        public int f6236c;

        /* renamed from: d  reason: collision with root package name */
        public long f6237d;

        /* renamed from: e  reason: collision with root package name */
        public long f6238e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f6239f;

        /* renamed from: g  reason: collision with root package name */
        private h5.a f6240g = h5.a.f8986g;

        public int a(int i10) {
            return this.f6240g.a(i10).f8997b;
        }

        public long b(int i10, int i11) {
            a.C0145a a10 = this.f6240g.a(i10);
            if (a10.f8997b != -1) {
                return a10.f9000e[i11];
            }
            return -9223372036854775807L;
        }

        public int c(long j10) {
            return this.f6240g.b(j10, this.f6237d);
        }

        public int d(long j10) {
            return this.f6240g.c(j10, this.f6237d);
        }

        public long e(int i10) {
            return this.f6240g.a(i10).f8996a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !b.class.equals(obj.getClass())) {
                return false;
            }
            b bVar = (b) obj;
            if (m0.c(this.f6234a, bVar.f6234a) && m0.c(this.f6235b, bVar.f6235b) && this.f6236c == bVar.f6236c && this.f6237d == bVar.f6237d && this.f6238e == bVar.f6238e && this.f6239f == bVar.f6239f && m0.c(this.f6240g, bVar.f6240g)) {
                return true;
            }
            return false;
        }

        public long f() {
            return this.f6240g.f8991c;
        }

        public long g(int i10) {
            return this.f6240g.a(i10).f9001f;
        }

        public long h() {
            return this.f6237d;
        }

        public int hashCode() {
            Object obj = this.f6234a;
            int i10 = 0;
            int hashCode = (217 + (obj == null ? 0 : obj.hashCode())) * 31;
            Object obj2 = this.f6235b;
            if (obj2 != null) {
                i10 = obj2.hashCode();
            }
            long j10 = this.f6237d;
            long j11 = this.f6238e;
            return ((((((((((hashCode + i10) * 31) + this.f6236c) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + (this.f6239f ? 1 : 0)) * 31) + this.f6240g.hashCode();
        }

        public int i(int i10) {
            return this.f6240g.a(i10).c();
        }

        public int j(int i10, int i11) {
            return this.f6240g.a(i10).d(i11);
        }

        public long k() {
            return e4.c.e(this.f6238e);
        }

        public long l() {
            return this.f6238e;
        }

        public boolean m(int i10) {
            return this.f6240g.a(i10).f9002g;
        }

        public b n(Object obj, Object obj2, int i10, long j10, long j11) {
            return o(obj, obj2, i10, j10, j11, h5.a.f8986g, false);
        }

        public b o(Object obj, Object obj2, int i10, long j10, long j11, h5.a aVar, boolean z10) {
            this.f6234a = obj;
            this.f6235b = obj2;
            this.f6236c = i10;
            this.f6237d = j10;
            this.f6238e = j11;
            this.f6240g = aVar;
            this.f6239f = z10;
            return this;
        }
    }

    /* compiled from: Timeline */
    public static final class c {

        /* renamed from: r  reason: collision with root package name */
        public static final Object f6241r = new Object();

        /* renamed from: s  reason: collision with root package name */
        private static final Object f6242s = new Object();

        /* renamed from: t  reason: collision with root package name */
        private static final j0 f6243t = new j0.c().d("com.google.android.exoplayer2.Timeline").h(Uri.EMPTY).a();

        /* renamed from: u  reason: collision with root package name */
        public static final e4.b<c> f6244u = y.f5134a;

        /* renamed from: a  reason: collision with root package name */
        public Object f6245a = f6241r;
        @Deprecated

        /* renamed from: b  reason: collision with root package name */
        public Object f6246b;

        /* renamed from: c  reason: collision with root package name */
        public j0 f6247c = f6243t;

        /* renamed from: d  reason: collision with root package name */
        public Object f6248d;

        /* renamed from: e  reason: collision with root package name */
        public long f6249e;

        /* renamed from: f  reason: collision with root package name */
        public long f6250f;

        /* renamed from: g  reason: collision with root package name */
        public long f6251g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f6252h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f6253i;
        @Deprecated

        /* renamed from: j  reason: collision with root package name */
        public boolean f6254j;

        /* renamed from: k  reason: collision with root package name */
        public j0.f f6255k;

        /* renamed from: l  reason: collision with root package name */
        public boolean f6256l;

        /* renamed from: m  reason: collision with root package name */
        public long f6257m;

        /* renamed from: n  reason: collision with root package name */
        public long f6258n;

        /* renamed from: o  reason: collision with root package name */
        public int f6259o;

        /* renamed from: p  reason: collision with root package name */
        public int f6260p;

        /* renamed from: q  reason: collision with root package name */
        public long f6261q;

        public long a() {
            return m0.V(this.f6251g);
        }

        public long b() {
            return e4.c.e(this.f6257m);
        }

        public long c() {
            return this.f6257m;
        }

        public long d() {
            return e4.c.e(this.f6258n);
        }

        public long e() {
            return this.f6261q;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !c.class.equals(obj.getClass())) {
                return false;
            }
            c cVar = (c) obj;
            if (m0.c(this.f6245a, cVar.f6245a) && m0.c(this.f6247c, cVar.f6247c) && m0.c(this.f6248d, cVar.f6248d) && m0.c(this.f6255k, cVar.f6255k) && this.f6249e == cVar.f6249e && this.f6250f == cVar.f6250f && this.f6251g == cVar.f6251g && this.f6252h == cVar.f6252h && this.f6253i == cVar.f6253i && this.f6256l == cVar.f6256l && this.f6257m == cVar.f6257m && this.f6258n == cVar.f6258n && this.f6259o == cVar.f6259o && this.f6260p == cVar.f6260p && this.f6261q == cVar.f6261q) {
                return true;
            }
            return false;
        }

        public boolean f() {
            a6.a.f(this.f6254j == (this.f6255k != null));
            if (this.f6255k != null) {
                return true;
            }
            return false;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0011, code lost:
            r1 = r1.f6744b;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.google.android.exoplayer2.a1.c g(java.lang.Object r6, com.google.android.exoplayer2.j0 r7, java.lang.Object r8, long r9, long r11, long r13, boolean r15, boolean r16, com.google.android.exoplayer2.j0.f r17, long r18, long r20, int r22, int r23, long r24) {
            /*
                r5 = this;
                r0 = r5
                r1 = r7
                r2 = r17
                r3 = r6
                r0.f6245a = r3
                if (r1 == 0) goto L_0x000b
                r3 = r1
                goto L_0x000d
            L_0x000b:
                com.google.android.exoplayer2.j0 r3 = f6243t
            L_0x000d:
                r0.f6247c = r3
                if (r1 == 0) goto L_0x0018
                com.google.android.exoplayer2.j0$g r1 = r1.f6744b
                if (r1 == 0) goto L_0x0018
                java.lang.Object r1 = r1.f6804h
                goto L_0x0019
            L_0x0018:
                r1 = 0
            L_0x0019:
                r0.f6246b = r1
                r1 = r8
                r0.f6248d = r1
                r3 = r9
                r0.f6249e = r3
                r3 = r11
                r0.f6250f = r3
                r3 = r13
                r0.f6251g = r3
                r1 = r15
                r0.f6252h = r1
                r1 = r16
                r0.f6253i = r1
                r1 = 0
                if (r2 == 0) goto L_0x0033
                r3 = 1
                goto L_0x0034
            L_0x0033:
                r3 = 0
            L_0x0034:
                r0.f6254j = r3
                r0.f6255k = r2
                r2 = r18
                r0.f6257m = r2
                r2 = r20
                r0.f6258n = r2
                r2 = r22
                r0.f6259o = r2
                r2 = r23
                r0.f6260p = r2
                r2 = r24
                r0.f6261q = r2
                r0.f6256l = r1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.a1.c.g(java.lang.Object, com.google.android.exoplayer2.j0, java.lang.Object, long, long, long, boolean, boolean, com.google.android.exoplayer2.j0$f, long, long, int, int, long):com.google.android.exoplayer2.a1$c");
        }

        public int hashCode() {
            int hashCode = (((217 + this.f6245a.hashCode()) * 31) + this.f6247c.hashCode()) * 31;
            Object obj = this.f6248d;
            int i10 = 0;
            int hashCode2 = (hashCode + (obj == null ? 0 : obj.hashCode())) * 31;
            j0.f fVar = this.f6255k;
            if (fVar != null) {
                i10 = fVar.hashCode();
            }
            long j10 = this.f6249e;
            long j11 = this.f6250f;
            long j12 = this.f6251g;
            long j13 = this.f6257m;
            long j14 = this.f6258n;
            long j15 = this.f6261q;
            return ((((((((((((((((((((((hashCode2 + i10) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + ((int) (j12 ^ (j12 >>> 32)))) * 31) + (this.f6252h ? 1 : 0)) * 31) + (this.f6253i ? 1 : 0)) * 31) + (this.f6256l ? 1 : 0)) * 31) + ((int) (j13 ^ (j13 >>> 32)))) * 31) + ((int) (j14 ^ (j14 >>> 32)))) * 31) + this.f6259o) * 31) + this.f6260p) * 31) + ((int) (j15 ^ (j15 >>> 32)));
        }
    }

    public int a(boolean z10) {
        return q() ? -1 : 0;
    }

    public abstract int b(Object obj);

    public int c(boolean z10) {
        if (q()) {
            return -1;
        }
        return p() - 1;
    }

    public final int d(int i10, b bVar, c cVar, int i11, boolean z10) {
        int i12 = f(i10, bVar).f6236c;
        if (n(i12, cVar).f6260p != i10) {
            return i10 + 1;
        }
        int e10 = e(i12, i11, z10);
        if (e10 == -1) {
            return -1;
        }
        return n(e10, cVar).f6259o;
    }

    public int e(int i10, int i11, boolean z10) {
        if (i11 != 0) {
            if (i11 == 1) {
                return i10;
            }
            if (i11 == 2) {
                return i10 == c(z10) ? a(z10) : i10 + 1;
            }
            throw new IllegalStateException();
        } else if (i10 == c(z10)) {
            return -1;
        } else {
            return i10 + 1;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a1)) {
            return false;
        }
        a1 a1Var = (a1) obj;
        if (a1Var.p() != p() || a1Var.i() != i()) {
            return false;
        }
        c cVar = new c();
        b bVar = new b();
        c cVar2 = new c();
        b bVar2 = new b();
        for (int i10 = 0; i10 < p(); i10++) {
            if (!n(i10, cVar).equals(a1Var.n(i10, cVar2))) {
                return false;
            }
        }
        for (int i11 = 0; i11 < i(); i11++) {
            if (!g(i11, bVar, true).equals(a1Var.g(i11, bVar2, true))) {
                return false;
            }
        }
        return true;
    }

    public final b f(int i10, b bVar) {
        return g(i10, bVar, false);
    }

    public abstract b g(int i10, b bVar, boolean z10);

    public b h(Object obj, b bVar) {
        return g(b(obj), bVar, true);
    }

    public int hashCode() {
        c cVar = new c();
        b bVar = new b();
        int p10 = 217 + p();
        for (int i10 = 0; i10 < p(); i10++) {
            p10 = (p10 * 31) + n(i10, cVar).hashCode();
        }
        int i11 = (p10 * 31) + i();
        for (int i12 = 0; i12 < i(); i12++) {
            i11 = (i11 * 31) + g(i12, bVar, true).hashCode();
        }
        return i11;
    }

    public abstract int i();

    public final Pair<Object, Long> j(c cVar, b bVar, int i10, long j10) {
        return (Pair) a6.a.e(k(cVar, bVar, i10, j10, 0));
    }

    public final Pair<Object, Long> k(c cVar, b bVar, int i10, long j10, long j11) {
        a6.a.c(i10, 0, p());
        o(i10, cVar, j11);
        if (j10 == -9223372036854775807L) {
            j10 = cVar.c();
            if (j10 == -9223372036854775807L) {
                return null;
            }
        }
        int i11 = cVar.f6259o;
        f(i11, bVar);
        while (i11 < cVar.f6260p && bVar.f6238e != j10) {
            int i12 = i11 + 1;
            if (f(i12, bVar).f6238e > j10) {
                break;
            }
            i11 = i12;
        }
        g(i11, bVar, true);
        return Pair.create(a6.a.e(bVar.f6235b), Long.valueOf(j10 - bVar.f6238e));
    }

    public int l(int i10, int i11, boolean z10) {
        if (i11 != 0) {
            if (i11 == 1) {
                return i10;
            }
            if (i11 == 2) {
                return i10 == a(z10) ? c(z10) : i10 - 1;
            }
            throw new IllegalStateException();
        } else if (i10 == a(z10)) {
            return -1;
        } else {
            return i10 - 1;
        }
    }

    public abstract Object m(int i10);

    public final c n(int i10, c cVar) {
        return o(i10, cVar, 0);
    }

    public abstract c o(int i10, c cVar, long j10);

    public abstract int p();

    public final boolean q() {
        return p() == 0;
    }

    public final boolean r(int i10, b bVar, c cVar, int i11, boolean z10) {
        return d(i10, bVar, cVar, i11, z10) == -1;
    }
}
