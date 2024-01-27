package s4;

import a6.m0;
import e4.j;
import k4.b0;
import k4.k;
import k4.x;
import k4.y;

/* compiled from: StreamReader */
abstract class i {

    /* renamed from: a  reason: collision with root package name */
    private final e f11459a = new e();

    /* renamed from: b  reason: collision with root package name */
    private b0 f11460b;

    /* renamed from: c  reason: collision with root package name */
    private k f11461c;

    /* renamed from: d  reason: collision with root package name */
    private g f11462d;

    /* renamed from: e  reason: collision with root package name */
    private long f11463e;

    /* renamed from: f  reason: collision with root package name */
    private long f11464f;

    /* renamed from: g  reason: collision with root package name */
    private long f11465g;

    /* renamed from: h  reason: collision with root package name */
    private int f11466h;

    /* renamed from: i  reason: collision with root package name */
    private int f11467i;

    /* renamed from: j  reason: collision with root package name */
    private b f11468j = new b();

    /* renamed from: k  reason: collision with root package name */
    private long f11469k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f11470l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f11471m;

    /* compiled from: StreamReader */
    static class b {

        /* renamed from: a  reason: collision with root package name */
        j f11472a;

        /* renamed from: b  reason: collision with root package name */
        g f11473b;

        b() {
        }
    }

    /* compiled from: StreamReader */
    private static final class c implements g {
        private c() {
        }

        public long a(k4.j jVar) {
            return -1;
        }

        public y b() {
            return new y.b(-9223372036854775807L);
        }

        public void c(long j10) {
        }
    }

    private void a() {
        a6.a.h(this.f11460b);
        m0.j(this.f11461c);
    }

    private boolean i(k4.j jVar) {
        while (this.f11459a.d(jVar)) {
            this.f11469k = jVar.getPosition() - this.f11464f;
            if (!h(this.f11459a.c(), this.f11464f, this.f11468j)) {
                return true;
            }
            this.f11464f = jVar.getPosition();
        }
        this.f11466h = 3;
        return false;
    }

    private int j(k4.j jVar) {
        if (!i(jVar)) {
            return -1;
        }
        j jVar2 = this.f11468j.f11472a;
        this.f11467i = jVar2.G;
        if (!this.f11471m) {
            this.f11460b.d(jVar2);
            this.f11471m = true;
        }
        g gVar = this.f11468j.f11473b;
        if (gVar != null) {
            this.f11462d = gVar;
        } else if (jVar.a() == -1) {
            this.f11462d = new c();
        } else {
            f b10 = this.f11459a.b();
            this.f11462d = new a(this, this.f11464f, jVar.a(), (long) (b10.f11453h + b10.f11454i), b10.f11448c, (b10.f11447b & 4) != 0);
        }
        this.f11466h = 2;
        this.f11459a.f();
        return 0;
    }

    private int k(k4.j jVar, x xVar) {
        k4.j jVar2 = jVar;
        long a10 = this.f11462d.a(jVar2);
        if (a10 >= 0) {
            xVar.f9627a = a10;
            return 1;
        }
        if (a10 < -1) {
            e(-(a10 + 2));
        }
        if (!this.f11470l) {
            this.f11461c.i((y) a6.a.h(this.f11462d.b()));
            this.f11470l = true;
        }
        if (this.f11469k > 0 || this.f11459a.d(jVar2)) {
            this.f11469k = 0;
            a6.y c10 = this.f11459a.c();
            long f10 = f(c10);
            if (f10 >= 0) {
                long j10 = this.f11465g;
                if (j10 + f10 >= this.f11463e) {
                    long b10 = b(j10);
                    this.f11460b.a(c10, c10.f());
                    this.f11460b.e(b10, 1, c10.f(), 0, (b0.a) null);
                    this.f11463e = -1;
                }
            }
            this.f11465g += f10;
            return 0;
        }
        this.f11466h = 3;
        return -1;
    }

    /* access modifiers changed from: protected */
    public long b(long j10) {
        return (j10 * 1000000) / ((long) this.f11467i);
    }

    /* access modifiers changed from: protected */
    public long c(long j10) {
        return (((long) this.f11467i) * j10) / 1000000;
    }

    /* access modifiers changed from: package-private */
    public void d(k kVar, b0 b0Var) {
        this.f11461c = kVar;
        this.f11460b = b0Var;
        l(true);
    }

    /* access modifiers changed from: protected */
    public void e(long j10) {
        this.f11465g = j10;
    }

    /* access modifiers changed from: protected */
    public abstract long f(a6.y yVar);

    /* access modifiers changed from: package-private */
    public final int g(k4.j jVar, x xVar) {
        a();
        int i10 = this.f11466h;
        if (i10 == 0) {
            return j(jVar);
        }
        if (i10 == 1) {
            jVar.l((int) this.f11464f);
            this.f11466h = 2;
            return 0;
        } else if (i10 == 2) {
            m0.j(this.f11462d);
            return k(jVar, xVar);
        } else if (i10 == 3) {
            return -1;
        } else {
            throw new IllegalStateException();
        }
    }

    /* access modifiers changed from: protected */
    public abstract boolean h(a6.y yVar, long j10, b bVar);

    /* access modifiers changed from: protected */
    public void l(boolean z10) {
        if (z10) {
            this.f11468j = new b();
            this.f11464f = 0;
            this.f11466h = 0;
        } else {
            this.f11466h = 1;
        }
        this.f11463e = -1;
        this.f11465g = 0;
    }

    /* access modifiers changed from: package-private */
    public final void m(long j10, long j11) {
        this.f11459a.e();
        if (j10 == 0) {
            l(!this.f11470l);
        } else if (this.f11466h != 0) {
            this.f11463e = c(j11);
            ((g) m0.j(this.f11462d)).c(this.f11463e);
            this.f11466h = 2;
        }
    }
}
