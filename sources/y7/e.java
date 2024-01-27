package y7;

import ea.a0;
import ea.k;
import ea.o;
import ea.x;
import ea.z;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import v7.p;
import v7.v;
import v7.x;
import v7.y;
import w7.h;

/* compiled from: Http1xStream */
public final class e implements j {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final q f17349a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final ea.g f17350b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final ea.f f17351c;

    /* renamed from: d  reason: collision with root package name */
    private h f17352d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public int f17353e = 0;

    /* compiled from: Http1xStream */
    private abstract class b implements z {

        /* renamed from: h  reason: collision with root package name */
        protected final k f17354h;

        /* renamed from: i  reason: collision with root package name */
        protected boolean f17355i;

        private b() {
            this.f17354h = new k(e.this.f17350b.d());
        }

        /* access modifiers changed from: protected */
        public final void a() {
            if (e.this.f17353e == 5) {
                e.this.n(this.f17354h);
                int unused = e.this.f17353e = 6;
                if (e.this.f17349a != null) {
                    e.this.f17349a.q(e.this);
                    return;
                }
                return;
            }
            throw new IllegalStateException("state: " + e.this.f17353e);
        }

        public a0 d() {
            return this.f17354h;
        }

        /* access modifiers changed from: protected */
        public final void h() {
            if (e.this.f17353e != 6) {
                int unused = e.this.f17353e = 6;
                if (e.this.f17349a != null) {
                    e.this.f17349a.k();
                    e.this.f17349a.q(e.this);
                }
            }
        }
    }

    /* compiled from: Http1xStream */
    private final class c implements x {

        /* renamed from: h  reason: collision with root package name */
        private final k f17357h;

        /* renamed from: i  reason: collision with root package name */
        private boolean f17358i;

        private c() {
            this.f17357h = new k(e.this.f17351c.d());
        }

        public void F0(ea.e eVar, long j10) {
            if (this.f17358i) {
                throw new IllegalStateException("closed");
            } else if (j10 != 0) {
                e.this.f17351c.b0(j10);
                e.this.f17351c.U("\r\n");
                e.this.f17351c.F0(eVar, j10);
                e.this.f17351c.U("\r\n");
            }
        }

        public synchronized void close() {
            if (!this.f17358i) {
                this.f17358i = true;
                e.this.f17351c.U("0\r\n\r\n");
                e.this.n(this.f17357h);
                int unused = e.this.f17353e = 3;
            }
        }

        public a0 d() {
            return this.f17357h;
        }

        public synchronized void flush() {
            if (!this.f17358i) {
                e.this.f17351c.flush();
            }
        }
    }

    /* compiled from: Http1xStream */
    private class d extends b {

        /* renamed from: k  reason: collision with root package name */
        private long f17360k = -1;

        /* renamed from: l  reason: collision with root package name */
        private boolean f17361l = true;

        /* renamed from: m  reason: collision with root package name */
        private final h f17362m;

        d(h hVar) {
            super();
            this.f17362m = hVar;
        }

        private void j() {
            if (this.f17360k != -1) {
                e.this.f17350b.j0();
            }
            try {
                this.f17360k = e.this.f17350b.H0();
                String trim = e.this.f17350b.j0().trim();
                if (this.f17360k < 0 || (!trim.isEmpty() && !trim.startsWith(";"))) {
                    throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f17360k + trim + "\"");
                } else if (this.f17360k == 0) {
                    this.f17361l = false;
                    this.f17362m.r(e.this.u());
                    a();
                }
            } catch (NumberFormatException e10) {
                throw new ProtocolException(e10.getMessage());
            }
        }

        public long S(ea.e eVar, long j10) {
            if (j10 < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j10);
            } else if (this.f17355i) {
                throw new IllegalStateException("closed");
            } else if (!this.f17361l) {
                return -1;
            } else {
                long j11 = this.f17360k;
                if (j11 == 0 || j11 == -1) {
                    j();
                    if (!this.f17361l) {
                        return -1;
                    }
                }
                long S = e.this.f17350b.S(eVar, Math.min(j10, this.f17360k));
                if (S != -1) {
                    this.f17360k -= S;
                    return S;
                }
                h();
                throw new ProtocolException("unexpected end of stream");
            }
        }

        public void close() {
            if (!this.f17355i) {
                if (this.f17361l && !h.g(this, 100, TimeUnit.MILLISECONDS)) {
                    h();
                }
                this.f17355i = true;
            }
        }
    }

    /* renamed from: y7.e$e  reason: collision with other inner class name */
    /* compiled from: Http1xStream */
    private final class C0296e implements x {

        /* renamed from: h  reason: collision with root package name */
        private final k f17364h;

        /* renamed from: i  reason: collision with root package name */
        private boolean f17365i;

        /* renamed from: j  reason: collision with root package name */
        private long f17366j;

        public void F0(ea.e eVar, long j10) {
            if (!this.f17365i) {
                h.a(eVar.w0(), 0, j10);
                if (j10 <= this.f17366j) {
                    e.this.f17351c.F0(eVar, j10);
                    this.f17366j -= j10;
                    return;
                }
                throw new ProtocolException("expected " + this.f17366j + " bytes but received " + j10);
            }
            throw new IllegalStateException("closed");
        }

        public void close() {
            if (!this.f17365i) {
                this.f17365i = true;
                if (this.f17366j <= 0) {
                    e.this.n(this.f17364h);
                    int unused = e.this.f17353e = 3;
                    return;
                }
                throw new ProtocolException("unexpected end of stream");
            }
        }

        public a0 d() {
            return this.f17364h;
        }

        public void flush() {
            if (!this.f17365i) {
                e.this.f17351c.flush();
            }
        }

        private C0296e(long j10) {
            this.f17364h = new k(e.this.f17351c.d());
            this.f17366j = j10;
        }
    }

    /* compiled from: Http1xStream */
    private class f extends b {

        /* renamed from: k  reason: collision with root package name */
        private long f17368k;

        public f(long j10) {
            super();
            this.f17368k = j10;
            if (j10 == 0) {
                a();
            }
        }

        public long S(ea.e eVar, long j10) {
            if (j10 < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j10);
            } else if (this.f17355i) {
                throw new IllegalStateException("closed");
            } else if (this.f17368k == 0) {
                return -1;
            } else {
                long S = e.this.f17350b.S(eVar, Math.min(this.f17368k, j10));
                if (S != -1) {
                    long j11 = this.f17368k - S;
                    this.f17368k = j11;
                    if (j11 == 0) {
                        a();
                    }
                    return S;
                }
                h();
                throw new ProtocolException("unexpected end of stream");
            }
        }

        public void close() {
            if (!this.f17355i) {
                if (this.f17368k != 0 && !h.g(this, 100, TimeUnit.MILLISECONDS)) {
                    h();
                }
                this.f17355i = true;
            }
        }
    }

    /* compiled from: Http1xStream */
    private class g extends b {

        /* renamed from: k  reason: collision with root package name */
        private boolean f17370k;

        private g() {
            super();
        }

        public long S(ea.e eVar, long j10) {
            if (j10 < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j10);
            } else if (this.f17355i) {
                throw new IllegalStateException("closed");
            } else if (this.f17370k) {
                return -1;
            } else {
                long S = e.this.f17350b.S(eVar, j10);
                if (S != -1) {
                    return S;
                }
                this.f17370k = true;
                a();
                return -1;
            }
        }

        public void close() {
            if (!this.f17355i) {
                if (!this.f17370k) {
                    h();
                }
                this.f17355i = true;
            }
        }
    }

    public e(q qVar, ea.g gVar, ea.f fVar) {
        this.f17349a = qVar;
        this.f17350b = gVar;
        this.f17351c = fVar;
    }

    /* access modifiers changed from: private */
    public void n(k kVar) {
        a0 i10 = kVar.i();
        kVar.j(a0.f14345d);
        i10.a();
        i10.b();
    }

    private z o(v7.x xVar) {
        if (!h.l(xVar)) {
            return s(0);
        }
        if ("chunked".equalsIgnoreCase(xVar.p("Transfer-Encoding"))) {
            return q(this.f17352d);
        }
        long e10 = k.e(xVar);
        if (e10 != -1) {
            return s(e10);
        }
        return t();
    }

    public void a(n nVar) {
        if (this.f17353e == 1) {
            this.f17353e = 3;
            nVar.h(this.f17351c);
            return;
        }
        throw new IllegalStateException("state: " + this.f17353e);
    }

    public void b() {
        this.f17351c.flush();
    }

    public y c(v7.x xVar) {
        return new l(xVar.r(), o.b(o(xVar)));
    }

    public void d(v vVar) {
        this.f17352d.A();
        w(vVar.i(), m.a(vVar, this.f17352d.j().a().b().type()));
    }

    public x e(v vVar, long j10) {
        if ("chunked".equalsIgnoreCase(vVar.h("Transfer-Encoding"))) {
            return p();
        }
        if (j10 != -1) {
            return r(j10);
        }
        throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
    }

    public void f(h hVar) {
        this.f17352d = hVar;
    }

    public x.b g() {
        return v();
    }

    public ea.x p() {
        if (this.f17353e == 1) {
            this.f17353e = 2;
            return new c();
        }
        throw new IllegalStateException("state: " + this.f17353e);
    }

    public z q(h hVar) {
        if (this.f17353e == 4) {
            this.f17353e = 5;
            return new d(hVar);
        }
        throw new IllegalStateException("state: " + this.f17353e);
    }

    public ea.x r(long j10) {
        if (this.f17353e == 1) {
            this.f17353e = 2;
            return new C0296e(j10);
        }
        throw new IllegalStateException("state: " + this.f17353e);
    }

    public z s(long j10) {
        if (this.f17353e == 4) {
            this.f17353e = 5;
            return new f(j10);
        }
        throw new IllegalStateException("state: " + this.f17353e);
    }

    public z t() {
        if (this.f17353e == 4) {
            q qVar = this.f17349a;
            if (qVar != null) {
                this.f17353e = 5;
                qVar.k();
                return new g();
            }
            throw new IllegalStateException("streamAllocation == null");
        }
        throw new IllegalStateException("state: " + this.f17353e);
    }

    public p u() {
        p.b bVar = new p.b();
        while (true) {
            String j02 = this.f17350b.j0();
            if (j02.length() == 0) {
                return bVar.e();
            }
            w7.b.f16991b.a(bVar, j02);
        }
    }

    public x.b v() {
        p a10;
        x.b t10;
        int i10 = this.f17353e;
        if (i10 == 1 || i10 == 3) {
            do {
                try {
                    a10 = p.a(this.f17350b.j0());
                    t10 = new x.b().x(a10.f17440a).q(a10.f17441b).u(a10.f17442c).t(u());
                } catch (EOFException e10) {
                    IOException iOException = new IOException("unexpected end of stream on " + this.f17349a);
                    iOException.initCause(e10);
                    throw iOException;
                }
            } while (a10.f17441b == 100);
            this.f17353e = 4;
            return t10;
        }
        throw new IllegalStateException("state: " + this.f17353e);
    }

    public void w(p pVar, String str) {
        if (this.f17353e == 0) {
            this.f17351c.U(str).U("\r\n");
            int f10 = pVar.f();
            for (int i10 = 0; i10 < f10; i10++) {
                this.f17351c.U(pVar.d(i10)).U(": ").U(pVar.g(i10)).U("\r\n");
            }
            this.f17351c.U("\r\n");
            this.f17353e = 1;
            return;
        }
        throw new IllegalStateException("state: " + this.f17353e);
    }
}
