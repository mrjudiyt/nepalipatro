package u4;

import a6.x;
import a6.y;
import com.google.android.exoplayer2.ParserException;
import e4.j;
import g4.a;
import java.util.Collections;
import k4.b0;
import k4.k;
import u4.i0;

/* compiled from: LatmReader */
public final class s implements m {

    /* renamed from: a  reason: collision with root package name */
    private final String f12032a;

    /* renamed from: b  reason: collision with root package name */
    private final y f12033b;

    /* renamed from: c  reason: collision with root package name */
    private final x f12034c;

    /* renamed from: d  reason: collision with root package name */
    private b0 f12035d;

    /* renamed from: e  reason: collision with root package name */
    private String f12036e;

    /* renamed from: f  reason: collision with root package name */
    private j f12037f;

    /* renamed from: g  reason: collision with root package name */
    private int f12038g;

    /* renamed from: h  reason: collision with root package name */
    private int f12039h;

    /* renamed from: i  reason: collision with root package name */
    private int f12040i;

    /* renamed from: j  reason: collision with root package name */
    private int f12041j;

    /* renamed from: k  reason: collision with root package name */
    private long f12042k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f12043l;

    /* renamed from: m  reason: collision with root package name */
    private int f12044m;

    /* renamed from: n  reason: collision with root package name */
    private int f12045n;

    /* renamed from: o  reason: collision with root package name */
    private int f12046o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f12047p;

    /* renamed from: q  reason: collision with root package name */
    private long f12048q;

    /* renamed from: r  reason: collision with root package name */
    private int f12049r;

    /* renamed from: s  reason: collision with root package name */
    private long f12050s;

    /* renamed from: t  reason: collision with root package name */
    private int f12051t;

    /* renamed from: u  reason: collision with root package name */
    private String f12052u;

    public s(String str) {
        this.f12032a = str;
        y yVar = new y(1024);
        this.f12033b = yVar;
        this.f12034c = new x(yVar.d());
    }

    private static long f(x xVar) {
        return (long) xVar.h((xVar.h(2) + 1) * 8);
    }

    private void g(x xVar) {
        if (!xVar.g()) {
            this.f12043l = true;
            l(xVar);
        } else if (!this.f12043l) {
            return;
        }
        if (this.f12044m != 0) {
            throw ParserException.a((String) null, (Throwable) null);
        } else if (this.f12045n == 0) {
            k(xVar, j(xVar));
            if (this.f12047p) {
                xVar.r((int) this.f12048q);
            }
        } else {
            throw ParserException.a((String) null, (Throwable) null);
        }
    }

    private int h(x xVar) {
        int b10 = xVar.b();
        a.b e10 = a.e(xVar, true);
        this.f12052u = e10.f8827c;
        this.f12049r = e10.f8825a;
        this.f12051t = e10.f8826b;
        return b10 - xVar.b();
    }

    private void i(x xVar) {
        int h10 = xVar.h(3);
        this.f12046o = h10;
        if (h10 == 0) {
            xVar.r(8);
        } else if (h10 == 1) {
            xVar.r(9);
        } else if (h10 == 3 || h10 == 4 || h10 == 5) {
            xVar.r(6);
        } else if (h10 == 6 || h10 == 7) {
            xVar.r(1);
        } else {
            throw new IllegalStateException();
        }
    }

    private int j(x xVar) {
        int h10;
        if (this.f12046o == 0) {
            int i10 = 0;
            do {
                h10 = xVar.h(8);
                i10 += h10;
            } while (h10 == 255);
            return i10;
        }
        throw ParserException.a((String) null, (Throwable) null);
    }

    private void k(x xVar, int i10) {
        int e10 = xVar.e();
        if ((e10 & 7) == 0) {
            this.f12033b.O(e10 >> 3);
        } else {
            xVar.i(this.f12033b.d(), 0, i10 * 8);
            this.f12033b.O(0);
        }
        this.f12035d.a(this.f12033b, i10);
        this.f12035d.e(this.f12042k, 1, i10, 0, (b0.a) null);
        this.f12042k += this.f12050s;
    }

    private void l(x xVar) {
        boolean g10;
        int h10 = xVar.h(1);
        int h11 = h10 == 1 ? xVar.h(1) : 0;
        this.f12044m = h11;
        if (h11 == 0) {
            if (h10 == 1) {
                f(xVar);
            }
            if (xVar.g()) {
                this.f12045n = xVar.h(6);
                int h12 = xVar.h(4);
                int h13 = xVar.h(3);
                if (h12 == 0 && h13 == 0) {
                    if (h10 == 0) {
                        int e10 = xVar.e();
                        int h14 = h(xVar);
                        xVar.p(e10);
                        byte[] bArr = new byte[((h14 + 7) / 8)];
                        xVar.i(bArr, 0, h14);
                        j E = new j.b().S(this.f12036e).e0("audio/mp4a-latm").I(this.f12052u).H(this.f12051t).f0(this.f12049r).T(Collections.singletonList(bArr)).V(this.f12032a).E();
                        if (!E.equals(this.f12037f)) {
                            this.f12037f = E;
                            this.f12050s = 1024000000 / ((long) E.G);
                            this.f12035d.d(E);
                        }
                    } else {
                        xVar.r(((int) f(xVar)) - h(xVar));
                    }
                    i(xVar);
                    boolean g11 = xVar.g();
                    this.f12047p = g11;
                    this.f12048q = 0;
                    if (g11) {
                        if (h10 == 1) {
                            this.f12048q = f(xVar);
                        } else {
                            do {
                                g10 = xVar.g();
                                this.f12048q = (this.f12048q << 8) + ((long) xVar.h(8));
                            } while (g10);
                        }
                    }
                    if (xVar.g()) {
                        xVar.r(8);
                        return;
                    }
                    return;
                }
                throw ParserException.a((String) null, (Throwable) null);
            }
            throw ParserException.a((String) null, (Throwable) null);
        }
        throw ParserException.a((String) null, (Throwable) null);
    }

    private void m(int i10) {
        this.f12033b.K(i10);
        this.f12034c.n(this.f12033b.d());
    }

    public void a(y yVar) {
        a6.a.h(this.f12035d);
        while (yVar.a() > 0) {
            int i10 = this.f12038g;
            if (i10 != 0) {
                if (i10 == 1) {
                    int C = yVar.C();
                    if ((C & 224) == 224) {
                        this.f12041j = C;
                        this.f12038g = 2;
                    } else if (C != 86) {
                        this.f12038g = 0;
                    }
                } else if (i10 == 2) {
                    int C2 = ((this.f12041j & -225) << 8) | yVar.C();
                    this.f12040i = C2;
                    if (C2 > this.f12033b.d().length) {
                        m(this.f12040i);
                    }
                    this.f12039h = 0;
                    this.f12038g = 3;
                } else if (i10 == 3) {
                    int min = Math.min(yVar.a(), this.f12040i - this.f12039h);
                    yVar.j(this.f12034c.f274a, this.f12039h, min);
                    int i11 = this.f12039h + min;
                    this.f12039h = i11;
                    if (i11 == this.f12040i) {
                        this.f12034c.p(0);
                        g(this.f12034c);
                        this.f12038g = 0;
                    }
                } else {
                    throw new IllegalStateException();
                }
            } else if (yVar.C() == 86) {
                this.f12038g = 1;
            }
        }
    }

    public void b() {
        this.f12038g = 0;
        this.f12043l = false;
    }

    public void c() {
    }

    public void d(k kVar, i0.d dVar) {
        dVar.a();
        this.f12035d = kVar.e(dVar.c(), 1);
        this.f12036e = dVar.b();
    }

    public void e(long j10, int i10) {
        this.f12042k = j10;
    }
}
