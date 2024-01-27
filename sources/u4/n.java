package u4;

import a6.m0;
import a6.u;
import a6.y;
import android.util.Pair;
import e4.j;
import java.util.Arrays;
import k4.b0;
import k4.k;
import u4.i0;

/* compiled from: H262Reader */
public final class n implements m {

    /* renamed from: q  reason: collision with root package name */
    private static final double[] f11902q = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* renamed from: a  reason: collision with root package name */
    private String f11903a;

    /* renamed from: b  reason: collision with root package name */
    private b0 f11904b;

    /* renamed from: c  reason: collision with root package name */
    private final k0 f11905c;

    /* renamed from: d  reason: collision with root package name */
    private final y f11906d;

    /* renamed from: e  reason: collision with root package name */
    private final u f11907e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean[] f11908f;

    /* renamed from: g  reason: collision with root package name */
    private final a f11909g;

    /* renamed from: h  reason: collision with root package name */
    private long f11910h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f11911i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f11912j;

    /* renamed from: k  reason: collision with root package name */
    private long f11913k;

    /* renamed from: l  reason: collision with root package name */
    private long f11914l;

    /* renamed from: m  reason: collision with root package name */
    private long f11915m;

    /* renamed from: n  reason: collision with root package name */
    private long f11916n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f11917o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f11918p;

    /* compiled from: H262Reader */
    private static final class a {

        /* renamed from: e  reason: collision with root package name */
        private static final byte[] f11919e = {0, 0, 1};

        /* renamed from: a  reason: collision with root package name */
        private boolean f11920a;

        /* renamed from: b  reason: collision with root package name */
        public int f11921b;

        /* renamed from: c  reason: collision with root package name */
        public int f11922c;

        /* renamed from: d  reason: collision with root package name */
        public byte[] f11923d;

        public a(int i10) {
            this.f11923d = new byte[i10];
        }

        public void a(byte[] bArr, int i10, int i11) {
            if (this.f11920a) {
                int i12 = i11 - i10;
                byte[] bArr2 = this.f11923d;
                int length = bArr2.length;
                int i13 = this.f11921b;
                if (length < i13 + i12) {
                    this.f11923d = Arrays.copyOf(bArr2, (i13 + i12) * 2);
                }
                System.arraycopy(bArr, i10, this.f11923d, this.f11921b, i12);
                this.f11921b += i12;
            }
        }

        public boolean b(int i10, int i11) {
            if (this.f11920a) {
                int i12 = this.f11921b - i11;
                this.f11921b = i12;
                if (this.f11922c == 0 && i10 == 181) {
                    this.f11922c = i12;
                } else {
                    this.f11920a = false;
                    return true;
                }
            } else if (i10 == 179) {
                this.f11920a = true;
            }
            byte[] bArr = f11919e;
            a(bArr, 0, bArr.length);
            return false;
        }

        public void c() {
            this.f11920a = false;
            this.f11921b = 0;
            this.f11922c = 0;
        }
    }

    public n() {
        this((k0) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0075  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.util.Pair<e4.j, java.lang.Long> f(u4.n.a r8, java.lang.String r9) {
        /*
            byte[] r0 = r8.f11923d
            int r1 = r8.f11921b
            byte[] r0 = java.util.Arrays.copyOf(r0, r1)
            r1 = 4
            byte r2 = r0[r1]
            r2 = r2 & 255(0xff, float:3.57E-43)
            r3 = 5
            byte r4 = r0[r3]
            r4 = r4 & 255(0xff, float:3.57E-43)
            r5 = 6
            byte r5 = r0[r5]
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r2 = r2 << r1
            int r6 = r4 >> 4
            r2 = r2 | r6
            r4 = r4 & 15
            int r4 = r4 << 8
            r4 = r4 | r5
            r5 = 7
            byte r6 = r0[r5]
            r6 = r6 & 240(0xf0, float:3.36E-43)
            int r6 = r6 >> r1
            r7 = 2
            if (r6 == r7) goto L_0x003d
            r7 = 3
            if (r6 == r7) goto L_0x0037
            if (r6 == r1) goto L_0x0031
            r1 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0044
        L_0x0031:
            int r1 = r4 * 121
            float r1 = (float) r1
            int r6 = r2 * 100
            goto L_0x0042
        L_0x0037:
            int r1 = r4 * 16
            float r1 = (float) r1
            int r6 = r2 * 9
            goto L_0x0042
        L_0x003d:
            int r1 = r4 * 4
            float r1 = (float) r1
            int r6 = r2 * 3
        L_0x0042:
            float r6 = (float) r6
            float r1 = r1 / r6
        L_0x0044:
            e4.j$b r6 = new e4.j$b
            r6.<init>()
            e4.j$b r9 = r6.S(r9)
            java.lang.String r6 = "video/mpeg2"
            e4.j$b r9 = r9.e0(r6)
            e4.j$b r9 = r9.j0(r2)
            e4.j$b r9 = r9.Q(r4)
            e4.j$b r9 = r9.a0(r1)
            java.util.List r1 = java.util.Collections.singletonList(r0)
            e4.j$b r9 = r9.T(r1)
            e4.j r9 = r9.E()
            r1 = 0
            byte r4 = r0[r5]
            r4 = r4 & 15
            int r4 = r4 + -1
            if (r4 < 0) goto L_0x009d
            double[] r5 = f11902q
            int r6 = r5.length
            if (r4 >= r6) goto L_0x009d
            r1 = r5[r4]
            int r8 = r8.f11922c
            int r8 = r8 + 9
            byte r4 = r0[r8]
            r4 = r4 & 96
            int r3 = r4 >> 5
            byte r8 = r0[r8]
            r8 = r8 & 31
            if (r3 == r8) goto L_0x0096
            double r3 = (double) r3
            r5 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r3 = r3 + r5
            int r8 = r8 + 1
            double r5 = (double) r8
            double r3 = r3 / r5
            double r1 = r1 * r3
        L_0x0096:
            r3 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r3 = r3 / r1
            long r1 = (long) r3
        L_0x009d:
            java.lang.Long r8 = java.lang.Long.valueOf(r1)
            android.util.Pair r8 = android.util.Pair.create(r9, r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: u4.n.f(u4.n$a, java.lang.String):android.util.Pair");
    }

    public void a(y yVar) {
        int i10;
        a6.a.h(this.f11904b);
        int e10 = yVar.e();
        int f10 = yVar.f();
        byte[] d10 = yVar.d();
        this.f11910h += (long) yVar.a();
        this.f11904b.a(yVar, yVar.a());
        while (true) {
            int c10 = u.c(d10, e10, f10, this.f11908f);
            if (c10 == f10) {
                break;
            }
            int i11 = c10 + 3;
            byte b10 = yVar.d()[i11] & 255;
            int i12 = c10 - e10;
            boolean z10 = false;
            if (!this.f11912j) {
                if (i12 > 0) {
                    this.f11909g.a(d10, e10, c10);
                }
                if (this.f11909g.b(b10, i12 < 0 ? -i12 : 0)) {
                    Pair<j, Long> f11 = f(this.f11909g, (String) a6.a.e(this.f11903a));
                    this.f11904b.d((j) f11.first);
                    this.f11913k = ((Long) f11.second).longValue();
                    this.f11912j = true;
                }
            }
            u uVar = this.f11907e;
            if (uVar != null) {
                if (i12 > 0) {
                    uVar.a(d10, e10, c10);
                    i10 = 0;
                } else {
                    i10 = -i12;
                }
                if (this.f11907e.b(i10)) {
                    u uVar2 = this.f11907e;
                    ((y) m0.j(this.f11906d)).M(this.f11907e.f12068d, u.k(uVar2.f12068d, uVar2.f12069e));
                    ((k0) m0.j(this.f11905c)).a(this.f11916n, this.f11906d);
                }
                if (b10 == 178 && yVar.d()[c10 + 2] == 1) {
                    this.f11907e.e(b10);
                }
            }
            if (b10 == 0 || b10 == 179) {
                int i13 = f10 - c10;
                if (this.f11911i && this.f11918p && this.f11912j) {
                    this.f11904b.e(this.f11916n, this.f11917o ? 1 : 0, ((int) (this.f11910h - this.f11915m)) - i13, i13, (b0.a) null);
                }
                boolean z11 = this.f11911i;
                if (!z11 || this.f11918p) {
                    this.f11915m = this.f11910h - ((long) i13);
                    long j10 = this.f11914l;
                    if (j10 == -9223372036854775807L) {
                        j10 = z11 ? this.f11916n + this.f11913k : 0;
                    }
                    this.f11916n = j10;
                    this.f11917o = false;
                    this.f11914l = -9223372036854775807L;
                    this.f11911i = true;
                }
                if (b10 == 0) {
                    z10 = true;
                }
                this.f11918p = z10;
            } else if (b10 == 184) {
                this.f11917o = true;
            }
            e10 = i11;
        }
        if (!this.f11912j) {
            this.f11909g.a(d10, e10, f10);
        }
        u uVar3 = this.f11907e;
        if (uVar3 != null) {
            uVar3.a(d10, e10, f10);
        }
    }

    public void b() {
        u.a(this.f11908f);
        this.f11909g.c();
        u uVar = this.f11907e;
        if (uVar != null) {
            uVar.d();
        }
        this.f11910h = 0;
        this.f11911i = false;
    }

    public void c() {
    }

    public void d(k kVar, i0.d dVar) {
        dVar.a();
        this.f11903a = dVar.b();
        this.f11904b = kVar.e(dVar.c(), 2);
        k0 k0Var = this.f11905c;
        if (k0Var != null) {
            k0Var.b(kVar, dVar);
        }
    }

    public void e(long j10, int i10) {
        this.f11914l = j10;
    }

    n(k0 k0Var) {
        this.f11905c = k0Var;
        this.f11908f = new boolean[4];
        this.f11909g = new a(128);
        if (k0Var != null) {
            this.f11907e = new u(178, 128);
            this.f11906d = new y();
            return;
        }
        this.f11907e = null;
        this.f11906d = null;
    }
}
