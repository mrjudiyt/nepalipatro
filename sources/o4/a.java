package o4;

import a6.y;
import d5.b;
import e4.j;
import k4.i;
import k4.j;
import k4.k;
import k4.x;
import k4.y;
import x4.a;

/* compiled from: JpegExtractor */
public final class a implements i {

    /* renamed from: a  reason: collision with root package name */
    private final y f10370a = new y(6);

    /* renamed from: b  reason: collision with root package name */
    private k f10371b;

    /* renamed from: c  reason: collision with root package name */
    private int f10372c;

    /* renamed from: d  reason: collision with root package name */
    private int f10373d;

    /* renamed from: e  reason: collision with root package name */
    private int f10374e;

    /* renamed from: f  reason: collision with root package name */
    private long f10375f = -1;

    /* renamed from: g  reason: collision with root package name */
    private b f10376g;

    /* renamed from: h  reason: collision with root package name */
    private j f10377h;

    /* renamed from: i  reason: collision with root package name */
    private c f10378i;

    /* renamed from: j  reason: collision with root package name */
    private r4.k f10379j;

    private void a(j jVar) {
        this.f10370a.K(2);
        jVar.o(this.f10370a.d(), 0, 2);
        jVar.f(this.f10370a.I() - 2);
    }

    private void e() {
        h(new a.b[0]);
        ((k) a6.a.e(this.f10371b)).o();
        this.f10371b.i(new y.b(-9223372036854775807L));
        this.f10372c = 6;
    }

    private static b f(String str, long j10) {
        b a10;
        if (j10 == -1 || (a10 = e.a(str)) == null) {
            return null;
        }
        return a10.a(j10);
    }

    private void h(a.b... bVarArr) {
        ((k) a6.a.e(this.f10371b)).e(1024, 4).d(new j.b().K("image/jpeg").X(new x4.a(bVarArr)).E());
    }

    private int i(k4.j jVar) {
        this.f10370a.K(2);
        jVar.o(this.f10370a.d(), 0, 2);
        return this.f10370a.I();
    }

    private void j(k4.j jVar) {
        this.f10370a.K(2);
        jVar.readFully(this.f10370a.d(), 0, 2);
        int I = this.f10370a.I();
        this.f10373d = I;
        if (I == 65498) {
            if (this.f10375f != -1) {
                this.f10372c = 4;
            } else {
                e();
            }
        } else if ((I < 65488 || I > 65497) && I != 65281) {
            this.f10372c = 1;
        }
    }

    private void k(k4.j jVar) {
        String w10;
        if (this.f10373d == 65505) {
            a6.y yVar = new a6.y(this.f10374e);
            jVar.readFully(yVar.d(), 0, this.f10374e);
            if (this.f10376g == null && "http://ns.adobe.com/xap/1.0/".equals(yVar.w()) && (w10 = yVar.w()) != null) {
                b f10 = f(w10, jVar.a());
                this.f10376g = f10;
                if (f10 != null) {
                    this.f10375f = f10.f7958k;
                }
            }
        } else {
            jVar.l(this.f10374e);
        }
        this.f10372c = 0;
    }

    private void l(k4.j jVar) {
        this.f10370a.K(2);
        jVar.readFully(this.f10370a.d(), 0, 2);
        this.f10374e = this.f10370a.I() - 2;
        this.f10372c = 2;
    }

    private void m(k4.j jVar) {
        if (!jVar.d(this.f10370a.d(), 0, 1, true)) {
            e();
            return;
        }
        jVar.k();
        if (this.f10379j == null) {
            this.f10379j = new r4.k();
        }
        c cVar = new c(jVar, this.f10375f);
        this.f10378i = cVar;
        if (this.f10379j.d(cVar)) {
            this.f10379j.c(new d(this.f10375f, (k) a6.a.e(this.f10371b)));
            n();
            return;
        }
        e();
    }

    private void n() {
        h((a.b) a6.a.e(this.f10376g));
        this.f10372c = 5;
    }

    public void b(long j10, long j11) {
        if (j10 == 0) {
            this.f10372c = 0;
            this.f10379j = null;
        } else if (this.f10372c == 5) {
            ((r4.k) a6.a.e(this.f10379j)).b(j10, j11);
        }
    }

    public void c(k kVar) {
        this.f10371b = kVar;
    }

    public boolean d(k4.j jVar) {
        if (i(jVar) != 65496) {
            return false;
        }
        int i10 = i(jVar);
        this.f10373d = i10;
        if (i10 == 65504) {
            a(jVar);
            this.f10373d = i(jVar);
        }
        if (this.f10373d != 65505) {
            return false;
        }
        jVar.f(2);
        this.f10370a.K(6);
        jVar.o(this.f10370a.d(), 0, 6);
        if (this.f10370a.E() == 1165519206 && this.f10370a.I() == 0) {
            return true;
        }
        return false;
    }

    public int g(k4.j jVar, x xVar) {
        int i10 = this.f10372c;
        if (i10 == 0) {
            j(jVar);
            return 0;
        } else if (i10 == 1) {
            l(jVar);
            return 0;
        } else if (i10 == 2) {
            k(jVar);
            return 0;
        } else if (i10 == 4) {
            long position = jVar.getPosition();
            long j10 = this.f10375f;
            if (position != j10) {
                xVar.f9627a = j10;
                return 1;
            }
            m(jVar);
            return 0;
        } else if (i10 == 5) {
            if (this.f10378i == null || jVar != this.f10377h) {
                this.f10377h = jVar;
                this.f10378i = new c(jVar, this.f10375f);
            }
            int g10 = ((r4.k) a6.a.e(this.f10379j)).g(this.f10378i, xVar);
            if (g10 == 1) {
                xVar.f9627a += this.f10375f;
            }
            return g10;
        } else if (i10 == 6) {
            return -1;
        } else {
            throw new IllegalStateException();
        }
    }

    public void release() {
        r4.k kVar = this.f10379j;
        if (kVar != null) {
            kVar.release();
        }
    }
}
