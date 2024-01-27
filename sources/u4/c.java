package u4;

import a6.a;
import a6.m0;
import a6.x;
import a6.y;
import e4.j;
import g4.b;
import k4.b0;
import k4.k;
import u4.i0;

/* compiled from: Ac3Reader */
public final class c implements m {

    /* renamed from: a  reason: collision with root package name */
    private final x f11757a;

    /* renamed from: b  reason: collision with root package name */
    private final y f11758b;

    /* renamed from: c  reason: collision with root package name */
    private final String f11759c;

    /* renamed from: d  reason: collision with root package name */
    private String f11760d;

    /* renamed from: e  reason: collision with root package name */
    private b0 f11761e;

    /* renamed from: f  reason: collision with root package name */
    private int f11762f;

    /* renamed from: g  reason: collision with root package name */
    private int f11763g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f11764h;

    /* renamed from: i  reason: collision with root package name */
    private long f11765i;

    /* renamed from: j  reason: collision with root package name */
    private j f11766j;

    /* renamed from: k  reason: collision with root package name */
    private int f11767k;

    /* renamed from: l  reason: collision with root package name */
    private long f11768l;

    public c() {
        this((String) null);
    }

    private boolean f(y yVar, byte[] bArr, int i10) {
        int min = Math.min(yVar.a(), i10 - this.f11763g);
        yVar.j(bArr, this.f11763g, min);
        int i11 = this.f11763g + min;
        this.f11763g = i11;
        return i11 == i10;
    }

    private void g() {
        this.f11757a.p(0);
        b.C0141b e10 = b.e(this.f11757a);
        j jVar = this.f11766j;
        if (jVar == null || e10.f8837d != jVar.F || e10.f8836c != jVar.G || !m0.c(e10.f8834a, jVar.f8096s)) {
            j E = new j.b().S(this.f11760d).e0(e10.f8834a).H(e10.f8837d).f0(e10.f8836c).V(this.f11759c).E();
            this.f11766j = E;
            this.f11761e.d(E);
        }
        this.f11767k = e10.f8838e;
        this.f11765i = (((long) e10.f8839f) * 1000000) / ((long) this.f11766j.G);
    }

    private boolean h(y yVar) {
        while (true) {
            boolean z10 = false;
            if (yVar.a() <= 0) {
                return false;
            }
            if (!this.f11764h) {
                if (yVar.C() == 11) {
                    z10 = true;
                }
                this.f11764h = z10;
            } else {
                int C = yVar.C();
                if (C == 119) {
                    this.f11764h = false;
                    return true;
                }
                if (C == 11) {
                    z10 = true;
                }
                this.f11764h = z10;
            }
        }
    }

    public void a(y yVar) {
        a.h(this.f11761e);
        while (yVar.a() > 0) {
            int i10 = this.f11762f;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        int min = Math.min(yVar.a(), this.f11767k - this.f11763g);
                        this.f11761e.a(yVar, min);
                        int i11 = this.f11763g + min;
                        this.f11763g = i11;
                        int i12 = this.f11767k;
                        if (i11 == i12) {
                            this.f11761e.e(this.f11768l, 1, i12, 0, (b0.a) null);
                            this.f11768l += this.f11765i;
                            this.f11762f = 0;
                        }
                    }
                } else if (f(yVar, this.f11758b.d(), 128)) {
                    g();
                    this.f11758b.O(0);
                    this.f11761e.a(this.f11758b, 128);
                    this.f11762f = 2;
                }
            } else if (h(yVar)) {
                this.f11762f = 1;
                this.f11758b.d()[0] = 11;
                this.f11758b.d()[1] = 119;
                this.f11763g = 2;
            }
        }
    }

    public void b() {
        this.f11762f = 0;
        this.f11763g = 0;
        this.f11764h = false;
    }

    public void c() {
    }

    public void d(k kVar, i0.d dVar) {
        dVar.a();
        this.f11760d = dVar.b();
        this.f11761e = kVar.e(dVar.c(), 1);
    }

    public void e(long j10, int i10) {
        this.f11768l = j10;
    }

    public c(String str) {
        x xVar = new x(new byte[128]);
        this.f11757a = xVar;
        this.f11758b = new y(xVar.f274a);
        this.f11762f = 0;
        this.f11759c = str;
    }
}
