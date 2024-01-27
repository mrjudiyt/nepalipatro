package v7;

import com.squareup.okhttp.internal.http.RequestException;
import com.squareup.okhttp.internal.http.RouteException;
import ea.x;
import java.io.IOException;
import java.net.ProtocolException;
import v7.r;
import v7.v;
import y7.h;
import y7.n;
import y7.q;

/* compiled from: Call */
public class d {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final t f16777a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f16778b;

    /* renamed from: c  reason: collision with root package name */
    volatile boolean f16779c;

    /* renamed from: d  reason: collision with root package name */
    v f16780d;

    /* renamed from: e  reason: collision with root package name */
    h f16781e;

    /* compiled from: Call */
    class a implements r.a {

        /* renamed from: a  reason: collision with root package name */
        private final int f16782a;

        /* renamed from: b  reason: collision with root package name */
        private final v f16783b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f16784c;

        a(int i10, v vVar, boolean z10) {
            this.f16782a = i10;
            this.f16783b = vVar;
            this.f16784c = z10;
        }

        public x a(v vVar) {
            if (this.f16782a >= d.this.f16777a.y().size()) {
                return d.this.c(vVar, this.f16784c);
            }
            a aVar = new a(this.f16782a + 1, vVar, this.f16784c);
            r rVar = d.this.f16777a.y().get(this.f16782a);
            x a10 = rVar.a(aVar);
            if (a10 != null) {
                return a10;
            }
            throw new NullPointerException("application interceptor " + rVar + " returned null");
        }

        public v b() {
            return this.f16783b;
        }
    }

    protected d(t tVar, v vVar) {
        this.f16777a = tVar.b();
        this.f16780d = vVar;
    }

    private x d(boolean z10) {
        return new a(0, this.f16780d, z10).a(this.f16780d);
    }

    public x b() {
        synchronized (this) {
            if (!this.f16778b) {
                this.f16778b = true;
            } else {
                throw new IllegalStateException("Already Executed");
            }
        }
        try {
            this.f16777a.l().a(this);
            x d10 = d(false);
            if (d10 != null) {
                return d10;
            }
            throw new IOException("Canceled");
        } finally {
            this.f16777a.l().b(this);
        }
    }

    /* access modifiers changed from: package-private */
    public x c(v vVar, boolean z10) {
        boolean z11;
        Throwable th;
        q qVar;
        w f10 = vVar.f();
        if (f10 != null) {
            v.b m10 = vVar.m();
            s b10 = f10.b();
            if (b10 != null) {
                m10.j("Content-Type", b10.toString());
            }
            long a10 = f10.a();
            if (a10 != -1) {
                m10.j("Content-Length", Long.toString(a10));
                m10.m("Transfer-Encoding");
            } else {
                m10.j("Transfer-Encoding", "chunked");
                m10.m("Content-Length");
            }
            vVar = m10.g();
        }
        this.f16781e = new h(this.f16777a, vVar, false, false, z10, (q) null, (n) null, (x) null);
        int i10 = 0;
        while (!this.f16779c) {
            z11 = true;
            try {
                this.f16781e.w();
                this.f16781e.q();
                x k10 = this.f16781e.k();
                v i11 = this.f16781e.i();
                if (i11 == null) {
                    if (!z10) {
                        this.f16781e.u();
                    }
                    return k10;
                }
                q e10 = this.f16781e.e();
                i10++;
                if (i10 <= 20) {
                    if (!this.f16781e.v(i11.j())) {
                        e10.n();
                        qVar = null;
                    } else {
                        qVar = e10;
                    }
                    this.f16781e = new h(this.f16777a, i11, false, false, z10, qVar, (n) null, k10);
                } else {
                    e10.n();
                    throw new ProtocolException("Too many follow-up requests: " + i10);
                }
            } catch (RequestException e11) {
                throw e11.getCause();
            } catch (RouteException e12) {
                h s10 = this.f16781e.s(e12);
                if (s10 != null) {
                    this.f16781e = s10;
                } else {
                    throw e12.c();
                }
            } catch (IOException e13) {
                h t10 = this.f16781e.t(e13, (x) null);
                if (t10 != null) {
                    this.f16781e = t10;
                } else {
                    throw e13;
                }
            } catch (Throwable th2) {
                th = th2;
                z11 = false;
            }
        }
        this.f16781e.u();
        throw new IOException("Canceled");
        if (z11) {
            this.f16781e.e().n();
        }
        throw th;
    }
}
