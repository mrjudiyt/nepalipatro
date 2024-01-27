package y7;

import com.facebook.appevents.AppEventsConstants;
import com.squareup.okhttp.internal.http.RouteException;
import ea.a0;
import ea.e;
import ea.f;
import ea.g;
import ea.l;
import ea.o;
import ea.z;
import java.io.IOException;
import java.net.CookieHandler;
import java.net.ProtocolException;
import java.net.Proxy;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import v7.p;
import v7.q;
import v7.r;
import v7.s;
import v7.t;
import v7.u;
import v7.v;
import v7.w;
import v7.x;
import v7.y;
import w7.i;
import y7.c;

/* compiled from: HttpEngine */
public final class h {

    /* renamed from: r  reason: collision with root package name */
    private static final y f17393r = new a();

    /* renamed from: a  reason: collision with root package name */
    final t f17394a;

    /* renamed from: b  reason: collision with root package name */
    public final q f17395b;

    /* renamed from: c  reason: collision with root package name */
    private final x f17396c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public j f17397d;

    /* renamed from: e  reason: collision with root package name */
    long f17398e = -1;

    /* renamed from: f  reason: collision with root package name */
    private boolean f17399f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f17400g;

    /* renamed from: h  reason: collision with root package name */
    private final v f17401h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public v f17402i;

    /* renamed from: j  reason: collision with root package name */
    private x f17403j;

    /* renamed from: k  reason: collision with root package name */
    private x f17404k;

    /* renamed from: l  reason: collision with root package name */
    private ea.x f17405l;

    /* renamed from: m  reason: collision with root package name */
    private f f17406m;

    /* renamed from: n  reason: collision with root package name */
    private final boolean f17407n;

    /* renamed from: o  reason: collision with root package name */
    private final boolean f17408o;

    /* renamed from: p  reason: collision with root package name */
    private b f17409p;

    /* renamed from: q  reason: collision with root package name */
    private c f17410q;

    /* compiled from: HttpEngine */
    static class a extends y {
        a() {
        }

        public long j() {
            return 0;
        }

        public s q() {
            return null;
        }

        public g u() {
            return new e();
        }
    }

    /* compiled from: HttpEngine */
    class b implements z {

        /* renamed from: h  reason: collision with root package name */
        boolean f17411h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ g f17412i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ b f17413j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ f f17414k;

        b(g gVar, b bVar, f fVar) {
            this.f17412i = gVar;
            this.f17413j = bVar;
            this.f17414k = fVar;
        }

        public long S(e eVar, long j10) {
            try {
                long S = this.f17412i.S(eVar, j10);
                if (S == -1) {
                    if (!this.f17411h) {
                        this.f17411h = true;
                        this.f17414k.close();
                    }
                    return -1;
                }
                eVar.E(this.f17414k.b(), eVar.w0() - S, S);
                this.f17414k.K();
                return S;
            } catch (IOException e10) {
                if (!this.f17411h) {
                    this.f17411h = true;
                    this.f17413j.a();
                }
                throw e10;
            }
        }

        public void close() {
            if (!this.f17411h && !w7.h.g(this, 100, TimeUnit.MILLISECONDS)) {
                this.f17411h = true;
                this.f17413j.a();
            }
            this.f17412i.close();
        }

        public a0 d() {
            return this.f17412i.d();
        }
    }

    /* compiled from: HttpEngine */
    class c implements r.a {

        /* renamed from: a  reason: collision with root package name */
        private final int f17416a;

        /* renamed from: b  reason: collision with root package name */
        private final v f17417b;

        /* renamed from: c  reason: collision with root package name */
        private int f17418c;

        c(int i10, v vVar) {
            this.f17416a = i10;
            this.f17417b = vVar;
        }

        public x a(v vVar) {
            this.f17418c++;
            if (this.f17416a > 0) {
                r rVar = h.this.f17394a.A().get(this.f17416a - 1);
                v7.a a10 = c().a().a();
                if (!vVar.j().q().equals(a10.k()) || vVar.j().A() != a10.l()) {
                    throw new IllegalStateException("network interceptor " + rVar + " must retain the same host and port");
                } else if (this.f17418c > 1) {
                    throw new IllegalStateException("network interceptor " + rVar + " must call proceed() exactly once");
                }
            }
            if (this.f17416a < h.this.f17394a.A().size()) {
                c cVar = new c(this.f17416a + 1, vVar);
                r rVar2 = h.this.f17394a.A().get(this.f17416a);
                x a11 = rVar2.a(cVar);
                if (cVar.f17418c != 1) {
                    throw new IllegalStateException("network interceptor " + rVar2 + " must call proceed() exactly once");
                } else if (a11 != null) {
                    return a11;
                } else {
                    throw new NullPointerException("network interceptor " + rVar2 + " returned null");
                }
            } else {
                h.this.f17397d.d(vVar);
                v unused = h.this.f17402i = vVar;
                if (h.this.o(vVar) && vVar.f() != null) {
                    f a12 = o.a(h.this.f17397d.e(vVar, vVar.f().a()));
                    vVar.f().g(a12);
                    a12.close();
                }
                x c10 = h.this.p();
                int n10 = c10.n();
                if ((n10 != 204 && n10 != 205) || c10.k().j() <= 0) {
                    return c10;
                }
                throw new ProtocolException("HTTP " + n10 + " had non-zero Content-Length: " + c10.k().j());
            }
        }

        public v b() {
            return this.f17417b;
        }

        public v7.h c() {
            return h.this.f17395b.b();
        }
    }

    public h(t tVar, v vVar, boolean z10, boolean z11, boolean z12, q qVar, n nVar, x xVar) {
        this.f17394a = tVar;
        this.f17401h = vVar;
        this.f17400g = z10;
        this.f17407n = z11;
        this.f17408o = z12;
        this.f17395b = qVar == null ? new q(tVar.f(), h(tVar, vVar)) : qVar;
        this.f17405l = nVar;
        this.f17396c = xVar;
    }

    private x d(b bVar, x xVar) {
        ea.x b10;
        if (bVar == null || (b10 = bVar.b()) == null) {
            return xVar;
        }
        return xVar.t().l(new l(xVar.r(), o.b(new b(xVar.k().u(), bVar, o.a(b10))))).m();
    }

    private static p f(p pVar, p pVar2) {
        p.b bVar = new p.b();
        int f10 = pVar.f();
        for (int i10 = 0; i10 < f10; i10++) {
            String d10 = pVar.d(i10);
            String g10 = pVar.g(i10);
            if ((!"Warning".equalsIgnoreCase(d10) || !g10.startsWith(AppEventsConstants.EVENT_PARAM_VALUE_YES)) && (!k.f(d10) || pVar2.a(d10) == null)) {
                bVar.b(d10, g10);
            }
        }
        int f11 = pVar2.f();
        for (int i11 = 0; i11 < f11; i11++) {
            String d11 = pVar2.d(i11);
            if (!"Content-Length".equalsIgnoreCase(d11) && k.f(d11)) {
                bVar.b(d11, pVar2.g(i11));
            }
        }
        return bVar.e();
    }

    private j g() {
        return this.f17395b.j(this.f17394a.e(), this.f17394a.t(), this.f17394a.x(), this.f17394a.u(), !this.f17402i.l().equals("GET"));
    }

    private static v7.a h(t tVar, v vVar) {
        v7.e eVar;
        HostnameVerifier hostnameVerifier;
        SSLSocketFactory sSLSocketFactory;
        if (vVar.k()) {
            SSLSocketFactory w10 = tVar.w();
            hostnameVerifier = tVar.p();
            sSLSocketFactory = w10;
            eVar = tVar.d();
        } else {
            sSLSocketFactory = null;
            hostnameVerifier = null;
            eVar = null;
        }
        return new v7.a(vVar.j().q(), vVar.j().A(), tVar.m(), tVar.v(), sSLSocketFactory, hostnameVerifier, eVar, tVar.c(), tVar.r(), tVar.q(), tVar.g(), tVar.s());
    }

    public static boolean l(x xVar) {
        if (xVar.u().l().equals("HEAD")) {
            return false;
        }
        int n10 = xVar.n();
        if (((n10 >= 100 && n10 < 200) || n10 == 204 || n10 == 304) && k.e(xVar) == -1 && !"chunked".equalsIgnoreCase(xVar.p("Transfer-Encoding"))) {
            return false;
        }
        return true;
    }

    private void m() {
        w7.c e10 = w7.b.f16991b.e(this.f17394a);
        if (e10 != null) {
            if (c.a(this.f17404k, this.f17402i)) {
                this.f17409p = e10.a(x(this.f17404k));
            } else if (i.a(this.f17402i.l())) {
                try {
                    e10.b(this.f17402i);
                } catch (IOException unused) {
                }
            }
        }
    }

    private v n(v vVar) {
        v.b m10 = vVar.m();
        if (vVar.h("Host") == null) {
            m10.j("Host", w7.h.i(vVar.j()));
        }
        if (vVar.h("Connection") == null) {
            m10.j("Connection", "Keep-Alive");
        }
        if (vVar.h("Accept-Encoding") == null) {
            this.f17399f = true;
            m10.j("Accept-Encoding", "gzip");
        }
        CookieHandler i10 = this.f17394a.i();
        if (i10 != null) {
            k.a(m10, i10.get(vVar.n(), k.j(m10.g().i(), (String) null)));
        }
        if (vVar.h("User-Agent") == null) {
            m10.j("User-Agent", i.a());
        }
        return m10.g();
    }

    /* access modifiers changed from: private */
    public x p() {
        this.f17397d.b();
        x m10 = this.f17397d.g().y(this.f17402i).r(this.f17395b.b().h()).s(k.f17422c, Long.toString(this.f17398e)).s(k.f17423d, Long.toString(System.currentTimeMillis())).m();
        if (!this.f17408o) {
            m10 = m10.t().l(this.f17397d.c(m10)).m();
        }
        if ("close".equalsIgnoreCase(m10.u().h("Connection")) || "close".equalsIgnoreCase(m10.p("Connection"))) {
            this.f17395b.k();
        }
        return m10;
    }

    private static x x(x xVar) {
        return (xVar == null || xVar.k() == null) ? xVar : xVar.t().l((y) null).m();
    }

    private x y(x xVar) {
        if (!this.f17399f || !"gzip".equalsIgnoreCase(this.f17404k.p("Content-Encoding")) || xVar.k() == null) {
            return xVar;
        }
        l lVar = new l(xVar.k().u());
        p e10 = xVar.r().e().g("Content-Encoding").g("Content-Length").e();
        return xVar.t().t(e10).l(new l(e10, o.b(lVar))).m();
    }

    private static boolean z(x xVar, x xVar2) {
        Date c10;
        if (xVar2.n() == 304) {
            return true;
        }
        Date c11 = xVar.r().c("Last-Modified");
        if (c11 == null || (c10 = xVar2.r().c("Last-Modified")) == null || c10.getTime() >= c11.getTime()) {
            return false;
        }
        return true;
    }

    public void A() {
        if (this.f17398e == -1) {
            this.f17398e = System.currentTimeMillis();
            return;
        }
        throw new IllegalStateException();
    }

    public q e() {
        f fVar = this.f17406m;
        if (fVar != null) {
            w7.h.c(fVar);
        } else {
            ea.x xVar = this.f17405l;
            if (xVar != null) {
                w7.h.c(xVar);
            }
        }
        x xVar2 = this.f17404k;
        if (xVar2 != null) {
            w7.h.c(xVar2.k());
        } else {
            this.f17395b.c();
        }
        return this.f17395b;
    }

    public v i() {
        Proxy proxy;
        String p10;
        q D;
        if (this.f17404k != null) {
            z7.a b10 = this.f17395b.b();
            v7.z a10 = b10 != null ? b10.a() : null;
            if (a10 != null) {
                proxy = a10.b();
            } else {
                proxy = this.f17394a.r();
            }
            int n10 = this.f17404k.n();
            String l10 = this.f17401h.l();
            if (n10 != 307 && n10 != 308) {
                if (n10 != 401) {
                    if (n10 != 407) {
                        switch (n10) {
                            case 300:
                            case 301:
                            case 302:
                            case 303:
                                break;
                            default:
                                return null;
                        }
                    } else if (proxy.type() != Proxy.Type.HTTP) {
                        throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                    }
                }
                return k.h(this.f17394a.c(), this.f17404k, proxy);
            } else if (!l10.equals("GET") && !l10.equals("HEAD")) {
                return null;
            }
            if (!this.f17394a.n() || (p10 = this.f17404k.p("Location")) == null || (D = this.f17401h.j().D(p10)) == null) {
                return null;
            }
            if (!D.E().equals(this.f17401h.j().E()) && !this.f17394a.o()) {
                return null;
            }
            v.b m10 = this.f17401h.m();
            if (i.b(l10)) {
                if (i.c(l10)) {
                    m10.k("GET", (w) null);
                } else {
                    m10.k(l10, (w) null);
                }
                m10.m("Transfer-Encoding");
                m10.m("Content-Length");
                m10.m("Content-Type");
            }
            if (!v(D)) {
                m10.m("Authorization");
            }
            return m10.o(D).g();
        }
        throw new IllegalStateException();
    }

    public v7.h j() {
        return this.f17395b.b();
    }

    public x k() {
        x xVar = this.f17404k;
        if (xVar != null) {
            return xVar;
        }
        throw new IllegalStateException();
    }

    /* access modifiers changed from: package-private */
    public boolean o(v vVar) {
        return i.b(vVar.l());
    }

    public void q() {
        x xVar;
        if (this.f17404k == null) {
            v vVar = this.f17402i;
            if (vVar == null && this.f17403j == null) {
                throw new IllegalStateException("call sendRequest() first!");
            } else if (vVar != null) {
                if (this.f17408o) {
                    this.f17397d.d(vVar);
                    xVar = p();
                } else if (!this.f17407n) {
                    xVar = new c(0, vVar).a(this.f17402i);
                } else {
                    f fVar = this.f17406m;
                    if (fVar != null && fVar.b().w0() > 0) {
                        this.f17406m.x();
                    }
                    if (this.f17398e == -1) {
                        if (k.d(this.f17402i) == -1) {
                            ea.x xVar2 = this.f17405l;
                            if (xVar2 instanceof n) {
                                this.f17402i = this.f17402i.m().j("Content-Length", Long.toString(((n) xVar2).a())).g();
                            }
                        }
                        this.f17397d.d(this.f17402i);
                    }
                    ea.x xVar3 = this.f17405l;
                    if (xVar3 != null) {
                        f fVar2 = this.f17406m;
                        if (fVar2 != null) {
                            fVar2.close();
                        } else {
                            xVar3.close();
                        }
                        ea.x xVar4 = this.f17405l;
                        if (xVar4 instanceof n) {
                            this.f17397d.a((n) xVar4);
                        }
                    }
                    xVar = p();
                }
                r(xVar.r());
                x xVar5 = this.f17403j;
                if (xVar5 != null) {
                    if (z(xVar5, xVar)) {
                        this.f17404k = this.f17403j.t().y(this.f17401h).w(x(this.f17396c)).t(f(this.f17403j.r(), xVar.r())).n(x(this.f17403j)).v(x(xVar)).m();
                        xVar.k().close();
                        u();
                        w7.c e10 = w7.b.f16991b.e(this.f17394a);
                        e10.d();
                        e10.c(this.f17403j, x(this.f17404k));
                        this.f17404k = y(this.f17404k);
                        return;
                    }
                    w7.h.c(this.f17403j.k());
                }
                x m10 = xVar.t().y(this.f17401h).w(x(this.f17396c)).n(x(this.f17403j)).v(x(xVar)).m();
                this.f17404k = m10;
                if (l(m10)) {
                    m();
                    this.f17404k = y(d(this.f17409p, this.f17404k));
                }
            }
        }
    }

    public void r(p pVar) {
        CookieHandler i10 = this.f17394a.i();
        if (i10 != null) {
            i10.put(this.f17401h.n(), k.j(pVar, (String) null));
        }
    }

    public h s(RouteException routeException) {
        if (!this.f17395b.l(routeException) || !this.f17394a.u()) {
            return null;
        }
        return new h(this.f17394a, this.f17401h, this.f17400g, this.f17407n, this.f17408o, e(), (n) this.f17405l, this.f17396c);
    }

    public h t(IOException iOException, ea.x xVar) {
        if (!this.f17395b.m(iOException, xVar) || !this.f17394a.u()) {
            return null;
        }
        return new h(this.f17394a, this.f17401h, this.f17400g, this.f17407n, this.f17408o, e(), (n) xVar, this.f17396c);
    }

    public void u() {
        this.f17395b.n();
    }

    public boolean v(q qVar) {
        q j10 = this.f17401h.j();
        return j10.q().equals(qVar.q()) && j10.A() == qVar.A() && j10.E().equals(qVar.E());
    }

    public void w() {
        if (this.f17410q == null) {
            if (this.f17397d == null) {
                v n10 = n(this.f17401h);
                w7.c e10 = w7.b.f16991b.e(this.f17394a);
                x e11 = e10 != null ? e10.e(n10) : null;
                c c10 = new c.b(System.currentTimeMillis(), n10, e11).c();
                this.f17410q = c10;
                this.f17402i = c10.f17335a;
                this.f17403j = c10.f17336b;
                if (e10 != null) {
                    e10.f(c10);
                }
                if (e11 != null && this.f17403j == null) {
                    w7.h.c(e11.k());
                }
                if (this.f17402i != null) {
                    j g10 = g();
                    this.f17397d = g10;
                    g10.f(this);
                    if (this.f17407n && o(this.f17402i) && this.f17405l == null) {
                        long d10 = k.d(n10);
                        if (!this.f17400g) {
                            this.f17397d.d(this.f17402i);
                            this.f17405l = this.f17397d.e(this.f17402i, d10);
                        } else if (d10 > 2147483647L) {
                            throw new IllegalStateException("Use setFixedLengthStreamingMode() or setChunkedStreamingMode() for requests larger than 2 GiB.");
                        } else if (d10 != -1) {
                            this.f17397d.d(this.f17402i);
                            this.f17405l = new n((int) d10);
                        } else {
                            this.f17405l = new n();
                        }
                    }
                } else {
                    x xVar = this.f17403j;
                    if (xVar != null) {
                        this.f17404k = xVar.t().y(this.f17401h).w(x(this.f17396c)).n(x(this.f17403j)).m();
                    } else {
                        this.f17404k = new x.b().y(this.f17401h).w(x(this.f17396c)).x(u.HTTP_1_1).q(504).u("Unsatisfiable Request (only-if-cached)").l(f17393r).m();
                    }
                    this.f17404k = y(this.f17404k);
                }
            } else {
                throw new IllegalStateException();
            }
        }
    }
}
