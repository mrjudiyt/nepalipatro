package v7;

import java.io.IOException;
import java.net.URI;
import v7.p;
import y7.i;

/* compiled from: Request */
public final class v {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final q f16925a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final String f16926b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final p f16927c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final w f16928d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final Object f16929e;

    /* renamed from: f  reason: collision with root package name */
    private volatile URI f16930f;

    /* renamed from: g  reason: collision with root package name */
    private volatile c f16931g;

    /* compiled from: Request */
    public static class b {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public q f16932a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public String f16933b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public p.b f16934c;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public w f16935d;
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public Object f16936e;

        public b f(String str, String str2) {
            this.f16934c.b(str, str2);
            return this;
        }

        public v g() {
            if (this.f16932a != null) {
                return new v(this);
            }
            throw new IllegalStateException("url == null");
        }

        public b h(c cVar) {
            String cVar2 = cVar.toString();
            if (cVar2.isEmpty()) {
                return m("Cache-Control");
            }
            return j("Cache-Control", cVar2);
        }

        public b i() {
            return k("GET", (w) null);
        }

        public b j(String str, String str2) {
            this.f16934c.h(str, str2);
            return this;
        }

        public b k(String str, w wVar) {
            if (str == null || str.length() == 0) {
                throw new IllegalArgumentException("method == null || method.length() == 0");
            } else if (wVar != null && !i.b(str)) {
                throw new IllegalArgumentException("method " + str + " must not have a request body.");
            } else if (wVar != null || !i.d(str)) {
                this.f16933b = str;
                this.f16935d = wVar;
                return this;
            } else {
                throw new IllegalArgumentException("method " + str + " must have a request body.");
            }
        }

        public b l(w wVar) {
            return k("POST", wVar);
        }

        public b m(String str) {
            this.f16934c.g(str);
            return this;
        }

        public b n(String str) {
            if (str != null) {
                if (str.regionMatches(true, 0, "ws:", 0, 3)) {
                    str = "http:" + str.substring(3);
                } else if (str.regionMatches(true, 0, "wss:", 0, 4)) {
                    str = "https:" + str.substring(4);
                }
                q u10 = q.u(str);
                if (u10 != null) {
                    return o(u10);
                }
                throw new IllegalArgumentException("unexpected url: " + str);
            }
            throw new IllegalArgumentException("url == null");
        }

        public b o(q qVar) {
            if (qVar != null) {
                this.f16932a = qVar;
                return this;
            }
            throw new IllegalArgumentException("url == null");
        }

        public b() {
            this.f16933b = "GET";
            this.f16934c = new p.b();
        }

        private b(v vVar) {
            this.f16932a = vVar.f16925a;
            this.f16933b = vVar.f16926b;
            this.f16935d = vVar.f16928d;
            this.f16936e = vVar.f16929e;
            this.f16934c = vVar.f16927c.e();
        }
    }

    public w f() {
        return this.f16928d;
    }

    public c g() {
        c cVar = this.f16931g;
        if (cVar != null) {
            return cVar;
        }
        c k10 = c.k(this.f16927c);
        this.f16931g = k10;
        return k10;
    }

    public String h(String str) {
        return this.f16927c.a(str);
    }

    public p i() {
        return this.f16927c;
    }

    public q j() {
        return this.f16925a;
    }

    public boolean k() {
        return this.f16925a.r();
    }

    public String l() {
        return this.f16926b;
    }

    public b m() {
        return new b();
    }

    public URI n() {
        try {
            URI uri = this.f16930f;
            if (uri != null) {
                return uri;
            }
            URI F = this.f16925a.F();
            this.f16930f = F;
            return F;
        } catch (IllegalStateException e10) {
            throw new IOException(e10.getMessage());
        }
    }

    public String o() {
        return this.f16925a.toString();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Request{method=");
        sb.append(this.f16926b);
        sb.append(", url=");
        sb.append(this.f16925a);
        sb.append(", tag=");
        Object obj = this.f16929e;
        if (obj == this) {
            obj = null;
        }
        sb.append(obj);
        sb.append('}');
        return sb.toString();
    }

    private v(b bVar) {
        this.f16925a = bVar.f16932a;
        this.f16926b = bVar.f16933b;
        this.f16927c = bVar.f16934c.e();
        this.f16928d = bVar.f16935d;
        this.f16929e = bVar.f16936e != null ? bVar.f16936e : this;
    }
}
