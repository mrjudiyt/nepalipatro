package u4;

import a6.c;
import a6.m0;
import a6.u;
import a6.y;
import a6.z;
import android.util.SparseArray;
import e4.j;
import java.util.ArrayList;
import java.util.Arrays;
import k4.b0;
import k4.k;
import u4.i0;

/* compiled from: H264Reader */
public final class p implements m {

    /* renamed from: a  reason: collision with root package name */
    private final d0 f11950a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f11951b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f11952c;

    /* renamed from: d  reason: collision with root package name */
    private final u f11953d = new u(7, 128);

    /* renamed from: e  reason: collision with root package name */
    private final u f11954e = new u(8, 128);

    /* renamed from: f  reason: collision with root package name */
    private final u f11955f = new u(6, 128);

    /* renamed from: g  reason: collision with root package name */
    private long f11956g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean[] f11957h = new boolean[3];

    /* renamed from: i  reason: collision with root package name */
    private String f11958i;

    /* renamed from: j  reason: collision with root package name */
    private b0 f11959j;

    /* renamed from: k  reason: collision with root package name */
    private b f11960k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f11961l;

    /* renamed from: m  reason: collision with root package name */
    private long f11962m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f11963n;

    /* renamed from: o  reason: collision with root package name */
    private final y f11964o = new y();

    /* compiled from: H264Reader */
    private static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final b0 f11965a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f11966b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f11967c;

        /* renamed from: d  reason: collision with root package name */
        private final SparseArray<u.b> f11968d = new SparseArray<>();

        /* renamed from: e  reason: collision with root package name */
        private final SparseArray<u.a> f11969e = new SparseArray<>();

        /* renamed from: f  reason: collision with root package name */
        private final z f11970f;

        /* renamed from: g  reason: collision with root package name */
        private byte[] f11971g;

        /* renamed from: h  reason: collision with root package name */
        private int f11972h;

        /* renamed from: i  reason: collision with root package name */
        private int f11973i;

        /* renamed from: j  reason: collision with root package name */
        private long f11974j;

        /* renamed from: k  reason: collision with root package name */
        private boolean f11975k;

        /* renamed from: l  reason: collision with root package name */
        private long f11976l;

        /* renamed from: m  reason: collision with root package name */
        private a f11977m = new a();

        /* renamed from: n  reason: collision with root package name */
        private a f11978n = new a();

        /* renamed from: o  reason: collision with root package name */
        private boolean f11979o;

        /* renamed from: p  reason: collision with root package name */
        private long f11980p;

        /* renamed from: q  reason: collision with root package name */
        private long f11981q;

        /* renamed from: r  reason: collision with root package name */
        private boolean f11982r;

        /* compiled from: H264Reader */
        private static final class a {

            /* renamed from: a  reason: collision with root package name */
            private boolean f11983a;

            /* renamed from: b  reason: collision with root package name */
            private boolean f11984b;

            /* renamed from: c  reason: collision with root package name */
            private u.b f11985c;

            /* renamed from: d  reason: collision with root package name */
            private int f11986d;

            /* renamed from: e  reason: collision with root package name */
            private int f11987e;

            /* renamed from: f  reason: collision with root package name */
            private int f11988f;

            /* renamed from: g  reason: collision with root package name */
            private int f11989g;

            /* renamed from: h  reason: collision with root package name */
            private boolean f11990h;

            /* renamed from: i  reason: collision with root package name */
            private boolean f11991i;

            /* renamed from: j  reason: collision with root package name */
            private boolean f11992j;

            /* renamed from: k  reason: collision with root package name */
            private boolean f11993k;

            /* renamed from: l  reason: collision with root package name */
            private int f11994l;

            /* renamed from: m  reason: collision with root package name */
            private int f11995m;

            /* renamed from: n  reason: collision with root package name */
            private int f11996n;

            /* renamed from: o  reason: collision with root package name */
            private int f11997o;

            /* renamed from: p  reason: collision with root package name */
            private int f11998p;

            private a() {
            }

            /* access modifiers changed from: private */
            public boolean c(a aVar) {
                int i10;
                int i11;
                int i12;
                boolean z10;
                if (!this.f11983a) {
                    return false;
                }
                if (!aVar.f11983a) {
                    return true;
                }
                u.b bVar = (u.b) a6.a.h(this.f11985c);
                u.b bVar2 = (u.b) a6.a.h(aVar.f11985c);
                if (this.f11988f == aVar.f11988f && this.f11989g == aVar.f11989g && this.f11990h == aVar.f11990h && ((!this.f11991i || !aVar.f11991i || this.f11992j == aVar.f11992j) && (((i10 = this.f11986d) == (i11 = aVar.f11986d) || (i10 != 0 && i11 != 0)) && (((i12 = bVar.f261k) != 0 || bVar2.f261k != 0 || (this.f11995m == aVar.f11995m && this.f11996n == aVar.f11996n)) && ((i12 != 1 || bVar2.f261k != 1 || (this.f11997o == aVar.f11997o && this.f11998p == aVar.f11998p)) && (z10 = this.f11993k) == aVar.f11993k && (!z10 || this.f11994l == aVar.f11994l)))))) {
                    return false;
                }
                return true;
            }

            public void b() {
                this.f11984b = false;
                this.f11983a = false;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
                r0 = r2.f11987e;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public boolean d() {
                /*
                    r2 = this;
                    boolean r0 = r2.f11984b
                    if (r0 == 0) goto L_0x000e
                    int r0 = r2.f11987e
                    r1 = 7
                    if (r0 == r1) goto L_0x000c
                    r1 = 2
                    if (r0 != r1) goto L_0x000e
                L_0x000c:
                    r0 = 1
                    goto L_0x000f
                L_0x000e:
                    r0 = 0
                L_0x000f:
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: u4.p.b.a.d():boolean");
            }

            public void e(u.b bVar, int i10, int i11, int i12, int i13, boolean z10, boolean z11, boolean z12, boolean z13, int i14, int i15, int i16, int i17, int i18) {
                this.f11985c = bVar;
                this.f11986d = i10;
                this.f11987e = i11;
                this.f11988f = i12;
                this.f11989g = i13;
                this.f11990h = z10;
                this.f11991i = z11;
                this.f11992j = z12;
                this.f11993k = z13;
                this.f11994l = i14;
                this.f11995m = i15;
                this.f11996n = i16;
                this.f11997o = i17;
                this.f11998p = i18;
                this.f11983a = true;
                this.f11984b = true;
            }

            public void f(int i10) {
                this.f11987e = i10;
                this.f11984b = true;
            }
        }

        public b(b0 b0Var, boolean z10, boolean z11) {
            this.f11965a = b0Var;
            this.f11966b = z10;
            this.f11967c = z11;
            byte[] bArr = new byte[128];
            this.f11971g = bArr;
            this.f11970f = new z(bArr, 0, 0);
            g();
        }

        private void d(int i10) {
            boolean z10 = this.f11982r;
            int i11 = (int) (this.f11974j - this.f11980p);
            this.f11965a.e(this.f11981q, z10 ? 1 : 0, i11, i10, (b0.a) null);
        }

        /* JADX WARNING: Removed duplicated region for block: B:51:0x00ff  */
        /* JADX WARNING: Removed duplicated region for block: B:52:0x0102  */
        /* JADX WARNING: Removed duplicated region for block: B:54:0x0106  */
        /* JADX WARNING: Removed duplicated region for block: B:58:0x0118  */
        /* JADX WARNING: Removed duplicated region for block: B:61:0x011e  */
        /* JADX WARNING: Removed duplicated region for block: B:72:0x014e  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void a(byte[] r24, int r25, int r26) {
            /*
                r23 = this;
                r0 = r23
                r1 = r25
                boolean r2 = r0.f11975k
                if (r2 != 0) goto L_0x0009
                return
            L_0x0009:
                int r2 = r26 - r1
                byte[] r3 = r0.f11971g
                int r4 = r3.length
                int r5 = r0.f11972h
                int r6 = r5 + r2
                r7 = 2
                if (r4 >= r6) goto L_0x001e
                int r5 = r5 + r2
                int r5 = r5 * 2
                byte[] r3 = java.util.Arrays.copyOf(r3, r5)
                r0.f11971g = r3
            L_0x001e:
                byte[] r3 = r0.f11971g
                int r4 = r0.f11972h
                r5 = r24
                java.lang.System.arraycopy(r5, r1, r3, r4, r2)
                int r1 = r0.f11972h
                int r1 = r1 + r2
                r0.f11972h = r1
                a6.z r2 = r0.f11970f
                byte[] r3 = r0.f11971g
                r4 = 0
                r2.i(r3, r4, r1)
                a6.z r1 = r0.f11970f
                r2 = 8
                boolean r1 = r1.b(r2)
                if (r1 != 0) goto L_0x003f
                return
            L_0x003f:
                a6.z r1 = r0.f11970f
                r1.k()
                a6.z r1 = r0.f11970f
                int r10 = r1.e(r7)
                a6.z r1 = r0.f11970f
                r2 = 5
                r1.l(r2)
                a6.z r1 = r0.f11970f
                boolean r1 = r1.c()
                if (r1 != 0) goto L_0x0059
                return
            L_0x0059:
                a6.z r1 = r0.f11970f
                r1.h()
                a6.z r1 = r0.f11970f
                boolean r1 = r1.c()
                if (r1 != 0) goto L_0x0067
                return
            L_0x0067:
                a6.z r1 = r0.f11970f
                int r11 = r1.h()
                boolean r1 = r0.f11967c
                if (r1 != 0) goto L_0x0079
                r0.f11975k = r4
                u4.p$b$a r1 = r0.f11978n
                r1.f(r11)
                return
            L_0x0079:
                a6.z r1 = r0.f11970f
                boolean r1 = r1.c()
                if (r1 != 0) goto L_0x0082
                return
            L_0x0082:
                a6.z r1 = r0.f11970f
                int r13 = r1.h()
                android.util.SparseArray<a6.u$a> r1 = r0.f11969e
                int r1 = r1.indexOfKey(r13)
                if (r1 >= 0) goto L_0x0093
                r0.f11975k = r4
                return
            L_0x0093:
                android.util.SparseArray<a6.u$a> r1 = r0.f11969e
                java.lang.Object r1 = r1.get(r13)
                a6.u$a r1 = (a6.u.a) r1
                android.util.SparseArray<a6.u$b> r3 = r0.f11968d
                int r5 = r1.f249b
                java.lang.Object r3 = r3.get(r5)
                r9 = r3
                a6.u$b r9 = (a6.u.b) r9
                boolean r3 = r9.f258h
                if (r3 == 0) goto L_0x00b8
                a6.z r3 = r0.f11970f
                boolean r3 = r3.b(r7)
                if (r3 != 0) goto L_0x00b3
                return
            L_0x00b3:
                a6.z r3 = r0.f11970f
                r3.l(r7)
            L_0x00b8:
                a6.z r3 = r0.f11970f
                int r5 = r9.f260j
                boolean r3 = r3.b(r5)
                if (r3 != 0) goto L_0x00c3
                return
            L_0x00c3:
                a6.z r3 = r0.f11970f
                int r5 = r9.f260j
                int r12 = r3.e(r5)
                boolean r3 = r9.f259i
                r5 = 1
                if (r3 != 0) goto L_0x00f7
                a6.z r3 = r0.f11970f
                boolean r3 = r3.b(r5)
                if (r3 != 0) goto L_0x00d9
                return
            L_0x00d9:
                a6.z r3 = r0.f11970f
                boolean r3 = r3.d()
                if (r3 == 0) goto L_0x00f5
                a6.z r6 = r0.f11970f
                boolean r6 = r6.b(r5)
                if (r6 != 0) goto L_0x00ea
                return
            L_0x00ea:
                a6.z r6 = r0.f11970f
                boolean r6 = r6.d()
                r14 = r3
                r16 = r6
                r15 = 1
                goto L_0x00fb
            L_0x00f5:
                r14 = r3
                goto L_0x00f8
            L_0x00f7:
                r14 = 0
            L_0x00f8:
                r15 = 0
                r16 = 0
            L_0x00fb:
                int r3 = r0.f11973i
                if (r3 != r2) goto L_0x0102
                r17 = 1
                goto L_0x0104
            L_0x0102:
                r17 = 0
            L_0x0104:
                if (r17 == 0) goto L_0x0118
                a6.z r2 = r0.f11970f
                boolean r2 = r2.c()
                if (r2 != 0) goto L_0x010f
                return
            L_0x010f:
                a6.z r2 = r0.f11970f
                int r2 = r2.h()
                r18 = r2
                goto L_0x011a
            L_0x0118:
                r18 = 0
            L_0x011a:
                int r2 = r9.f261k
                if (r2 != 0) goto L_0x014e
                a6.z r2 = r0.f11970f
                int r3 = r9.f262l
                boolean r2 = r2.b(r3)
                if (r2 != 0) goto L_0x0129
                return
            L_0x0129:
                a6.z r2 = r0.f11970f
                int r3 = r9.f262l
                int r2 = r2.e(r3)
                boolean r1 = r1.f250c
                if (r1 == 0) goto L_0x014b
                if (r14 != 0) goto L_0x014b
                a6.z r1 = r0.f11970f
                boolean r1 = r1.c()
                if (r1 != 0) goto L_0x0140
                return
            L_0x0140:
                a6.z r1 = r0.f11970f
                int r1 = r1.g()
                r20 = r1
                r19 = r2
                goto L_0x018c
            L_0x014b:
                r19 = r2
                goto L_0x018a
            L_0x014e:
                if (r2 != r5) goto L_0x0188
                boolean r2 = r9.f263m
                if (r2 != 0) goto L_0x0188
                a6.z r2 = r0.f11970f
                boolean r2 = r2.c()
                if (r2 != 0) goto L_0x015d
                return
            L_0x015d:
                a6.z r2 = r0.f11970f
                int r2 = r2.g()
                boolean r1 = r1.f250c
                if (r1 == 0) goto L_0x0181
                if (r14 != 0) goto L_0x0181
                a6.z r1 = r0.f11970f
                boolean r1 = r1.c()
                if (r1 != 0) goto L_0x0172
                return
            L_0x0172:
                a6.z r1 = r0.f11970f
                int r1 = r1.g()
                r22 = r1
                r21 = r2
                r19 = 0
                r20 = 0
                goto L_0x0190
            L_0x0181:
                r21 = r2
                r19 = 0
                r20 = 0
                goto L_0x018e
            L_0x0188:
                r19 = 0
            L_0x018a:
                r20 = 0
            L_0x018c:
                r21 = 0
            L_0x018e:
                r22 = 0
            L_0x0190:
                u4.p$b$a r8 = r0.f11978n
                r8.e(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
                r0.f11975k = r4
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: u4.p.b.a(byte[], int, int):void");
        }

        public boolean b(long j10, int i10, boolean z10, boolean z11) {
            boolean z12 = false;
            if (this.f11973i == 9 || (this.f11967c && this.f11978n.c(this.f11977m))) {
                if (z10 && this.f11979o) {
                    d(i10 + ((int) (j10 - this.f11974j)));
                }
                this.f11980p = this.f11974j;
                this.f11981q = this.f11976l;
                this.f11982r = false;
                this.f11979o = true;
            }
            if (this.f11966b) {
                z11 = this.f11978n.d();
            }
            boolean z13 = this.f11982r;
            int i11 = this.f11973i;
            if (i11 == 5 || (z11 && i11 == 1)) {
                z12 = true;
            }
            boolean z14 = z13 | z12;
            this.f11982r = z14;
            return z14;
        }

        public boolean c() {
            return this.f11967c;
        }

        public void e(u.a aVar) {
            this.f11969e.append(aVar.f248a, aVar);
        }

        public void f(u.b bVar) {
            this.f11968d.append(bVar.f254d, bVar);
        }

        public void g() {
            this.f11975k = false;
            this.f11979o = false;
            this.f11978n.b();
        }

        public void h(long j10, int i10, long j11) {
            this.f11973i = i10;
            this.f11976l = j11;
            this.f11974j = j10;
            if (!this.f11966b || i10 != 1) {
                if (!this.f11967c) {
                    return;
                }
                if (!(i10 == 5 || i10 == 1 || i10 == 2)) {
                    return;
                }
            }
            a aVar = this.f11977m;
            this.f11977m = this.f11978n;
            this.f11978n = aVar;
            aVar.b();
            this.f11972h = 0;
            this.f11975k = true;
        }
    }

    public p(d0 d0Var, boolean z10, boolean z11) {
        this.f11950a = d0Var;
        this.f11951b = z10;
        this.f11952c = z11;
    }

    private void f() {
        a6.a.h(this.f11959j);
        m0.j(this.f11960k);
    }

    private void g(long j10, int i10, int i11, long j11) {
        if (!this.f11961l || this.f11960k.c()) {
            this.f11953d.b(i11);
            this.f11954e.b(i11);
            if (!this.f11961l) {
                if (this.f11953d.c() && this.f11954e.c()) {
                    ArrayList arrayList = new ArrayList();
                    u uVar = this.f11953d;
                    arrayList.add(Arrays.copyOf(uVar.f12068d, uVar.f12069e));
                    u uVar2 = this.f11954e;
                    arrayList.add(Arrays.copyOf(uVar2.f12068d, uVar2.f12069e));
                    u uVar3 = this.f11953d;
                    u.b i12 = u.i(uVar3.f12068d, 3, uVar3.f12069e);
                    u uVar4 = this.f11954e;
                    u.a h10 = u.h(uVar4.f12068d, 3, uVar4.f12069e);
                    this.f11959j.d(new j.b().S(this.f11958i).e0("video/avc").I(c.a(i12.f251a, i12.f252b, i12.f253c)).j0(i12.f255e).Q(i12.f256f).a0(i12.f257g).T(arrayList).E());
                    this.f11961l = true;
                    this.f11960k.f(i12);
                    this.f11960k.e(h10);
                    this.f11953d.d();
                    this.f11954e.d();
                }
            } else if (this.f11953d.c()) {
                u uVar5 = this.f11953d;
                this.f11960k.f(u.i(uVar5.f12068d, 3, uVar5.f12069e));
                this.f11953d.d();
            } else if (this.f11954e.c()) {
                u uVar6 = this.f11954e;
                this.f11960k.e(u.h(uVar6.f12068d, 3, uVar6.f12069e));
                this.f11954e.d();
            }
        }
        if (this.f11955f.b(i11)) {
            u uVar7 = this.f11955f;
            this.f11964o.M(this.f11955f.f12068d, u.k(uVar7.f12068d, uVar7.f12069e));
            this.f11964o.O(4);
            this.f11950a.a(j11, this.f11964o);
        }
        if (this.f11960k.b(j10, i10, this.f11961l, this.f11963n)) {
            this.f11963n = false;
        }
    }

    private void h(byte[] bArr, int i10, int i11) {
        if (!this.f11961l || this.f11960k.c()) {
            this.f11953d.a(bArr, i10, i11);
            this.f11954e.a(bArr, i10, i11);
        }
        this.f11955f.a(bArr, i10, i11);
        this.f11960k.a(bArr, i10, i11);
    }

    private void i(long j10, int i10, long j11) {
        if (!this.f11961l || this.f11960k.c()) {
            this.f11953d.e(i10);
            this.f11954e.e(i10);
        }
        this.f11955f.e(i10);
        this.f11960k.h(j10, i10, j11);
    }

    public void a(y yVar) {
        f();
        int e10 = yVar.e();
        int f10 = yVar.f();
        byte[] d10 = yVar.d();
        this.f11956g += (long) yVar.a();
        this.f11959j.a(yVar, yVar.a());
        while (true) {
            int c10 = u.c(d10, e10, f10, this.f11957h);
            if (c10 == f10) {
                h(d10, e10, f10);
                return;
            }
            int f11 = u.f(d10, c10);
            int i10 = c10 - e10;
            if (i10 > 0) {
                h(d10, e10, c10);
            }
            int i11 = f10 - c10;
            long j10 = this.f11956g - ((long) i11);
            g(j10, i11, i10 < 0 ? -i10 : 0, this.f11962m);
            i(j10, f11, this.f11962m);
            e10 = c10 + 3;
        }
    }

    public void b() {
        this.f11956g = 0;
        this.f11963n = false;
        u.a(this.f11957h);
        this.f11953d.d();
        this.f11954e.d();
        this.f11955f.d();
        b bVar = this.f11960k;
        if (bVar != null) {
            bVar.g();
        }
    }

    public void c() {
    }

    public void d(k kVar, i0.d dVar) {
        dVar.a();
        this.f11958i = dVar.b();
        b0 e10 = kVar.e(dVar.c(), 2);
        this.f11959j = e10;
        this.f11960k = new b(e10, this.f11951b, this.f11952c);
        this.f11950a.b(kVar, dVar);
    }

    public void e(long j10, int i10) {
        this.f11962m = j10;
        this.f11963n |= (i10 & 2) != 0;
    }
}
