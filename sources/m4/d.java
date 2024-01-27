package m4;

import a6.m0;
import a6.y;
import k4.b0;
import k4.i;
import k4.j;
import k4.k;
import k4.o;
import k4.p;
import k4.q;
import k4.r;
import k4.s;
import k4.x;
import k4.y;
import x4.a;

/* compiled from: FlacExtractor */
public final class d implements i {

    /* renamed from: o  reason: collision with root package name */
    public static final o f10220o = c.f15721b;

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f10221a;

    /* renamed from: b  reason: collision with root package name */
    private final y f10222b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f10223c;

    /* renamed from: d  reason: collision with root package name */
    private final p.a f10224d;

    /* renamed from: e  reason: collision with root package name */
    private k f10225e;

    /* renamed from: f  reason: collision with root package name */
    private b0 f10226f;

    /* renamed from: g  reason: collision with root package name */
    private int f10227g;

    /* renamed from: h  reason: collision with root package name */
    private a f10228h;

    /* renamed from: i  reason: collision with root package name */
    private s f10229i;

    /* renamed from: j  reason: collision with root package name */
    private int f10230j;

    /* renamed from: k  reason: collision with root package name */
    private int f10231k;

    /* renamed from: l  reason: collision with root package name */
    private b f10232l;

    /* renamed from: m  reason: collision with root package name */
    private int f10233m;

    /* renamed from: n  reason: collision with root package name */
    private long f10234n;

    public d() {
        this(0);
    }

    private long e(y yVar, boolean z10) {
        boolean z11;
        a6.a.e(this.f10229i);
        int e10 = yVar.e();
        while (e10 <= yVar.f() - 16) {
            yVar.O(e10);
            if (p.d(yVar, this.f10229i, this.f10231k, this.f10224d)) {
                yVar.O(e10);
                return this.f10224d.f9600a;
            }
            e10++;
        }
        if (z10) {
            while (e10 <= yVar.f() - this.f10230j) {
                yVar.O(e10);
                boolean z12 = false;
                try {
                    z11 = p.d(yVar, this.f10229i, this.f10231k, this.f10224d);
                } catch (IndexOutOfBoundsException unused) {
                    z11 = false;
                }
                if (yVar.e() <= yVar.f()) {
                    z12 = z11;
                }
                if (z12) {
                    yVar.O(e10);
                    return this.f10224d.f9600a;
                }
                e10++;
            }
            yVar.O(yVar.f());
            return -1;
        }
        yVar.O(e10);
        return -1;
    }

    private void f(j jVar) {
        this.f10231k = q.b(jVar);
        ((k) m0.j(this.f10225e)).i(h(jVar.getPosition(), jVar.a()));
        this.f10227g = 5;
    }

    private k4.y h(long j10, long j11) {
        a6.a.e(this.f10229i);
        s sVar = this.f10229i;
        if (sVar.f9614k != null) {
            return new r(sVar, j10);
        }
        if (j11 == -1 || sVar.f9613j <= 0) {
            return new y.b(sVar.g());
        }
        b bVar = new b(sVar, this.f10231k, j10, j11);
        this.f10232l = bVar;
        return bVar.b();
    }

    private void i(j jVar) {
        byte[] bArr = this.f10221a;
        jVar.o(bArr, 0, bArr.length);
        jVar.k();
        this.f10227g = 2;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ i[] j() {
        return new i[]{new d()};
    }

    private void k() {
        ((b0) m0.j(this.f10226f)).e((this.f10234n * 1000000) / ((long) ((s) m0.j(this.f10229i)).f9608e), 1, this.f10233m, 0, (b0.a) null);
    }

    private int l(j jVar, x xVar) {
        boolean z10;
        a6.a.e(this.f10226f);
        a6.a.e(this.f10229i);
        b bVar = this.f10232l;
        if (bVar != null && bVar.d()) {
            return this.f10232l.c(jVar, xVar);
        }
        if (this.f10234n == -1) {
            this.f10234n = p.i(jVar, this.f10229i);
            return 0;
        }
        int f10 = this.f10222b.f();
        if (f10 < 32768) {
            int read = jVar.read(this.f10222b.d(), f10, 32768 - f10);
            z10 = read == -1;
            if (!z10) {
                this.f10222b.N(f10 + read);
            } else if (this.f10222b.a() == 0) {
                k();
                return -1;
            }
        } else {
            z10 = false;
        }
        int e10 = this.f10222b.e();
        int i10 = this.f10233m;
        int i11 = this.f10230j;
        if (i10 < i11) {
            a6.y yVar = this.f10222b;
            yVar.P(Math.min(i11 - i10, yVar.a()));
        }
        long e11 = e(this.f10222b, z10);
        int e12 = this.f10222b.e() - e10;
        this.f10222b.O(e10);
        this.f10226f.a(this.f10222b, e12);
        this.f10233m += e12;
        if (e11 != -1) {
            k();
            this.f10233m = 0;
            this.f10234n = e11;
        }
        if (this.f10222b.a() < 16) {
            int a10 = this.f10222b.a();
            System.arraycopy(this.f10222b.d(), this.f10222b.e(), this.f10222b.d(), 0, a10);
            this.f10222b.O(0);
            this.f10222b.N(a10);
        }
        return 0;
    }

    private void m(j jVar) {
        this.f10228h = q.d(jVar, !this.f10223c);
        this.f10227g = 1;
    }

    private void n(j jVar) {
        q.a aVar = new q.a(this.f10229i);
        boolean z10 = false;
        while (!z10) {
            z10 = q.e(jVar, aVar);
            this.f10229i = (s) m0.j(aVar.f9601a);
        }
        a6.a.e(this.f10229i);
        this.f10230j = Math.max(this.f10229i.f9606c, 6);
        ((b0) m0.j(this.f10226f)).d(this.f10229i.h(this.f10221a, this.f10228h));
        this.f10227g = 4;
    }

    private void o(j jVar) {
        q.j(jVar);
        this.f10227g = 3;
    }

    public void b(long j10, long j11) {
        long j12 = 0;
        if (j10 == 0) {
            this.f10227g = 0;
        } else {
            b bVar = this.f10232l;
            if (bVar != null) {
                bVar.h(j11);
            }
        }
        if (j11 != 0) {
            j12 = -1;
        }
        this.f10234n = j12;
        this.f10233m = 0;
        this.f10222b.K(0);
    }

    public void c(k kVar) {
        this.f10225e = kVar;
        this.f10226f = kVar.e(0, 1);
        kVar.o();
    }

    public boolean d(j jVar) {
        q.c(jVar, false);
        return q.a(jVar);
    }

    public int g(j jVar, x xVar) {
        int i10 = this.f10227g;
        if (i10 == 0) {
            m(jVar);
            return 0;
        } else if (i10 == 1) {
            i(jVar);
            return 0;
        } else if (i10 == 2) {
            o(jVar);
            return 0;
        } else if (i10 == 3) {
            n(jVar);
            return 0;
        } else if (i10 == 4) {
            f(jVar);
            return 0;
        } else if (i10 == 5) {
            return l(jVar, xVar);
        } else {
            throw new IllegalStateException();
        }
    }

    public void release() {
    }

    public d(int i10) {
        this.f10221a = new byte[42];
        this.f10222b = new a6.y(new byte[32768], 0);
        this.f10223c = (i10 & 1) == 0 ? false : true;
        this.f10224d = new p.a();
        this.f10227g = 0;
    }
}
