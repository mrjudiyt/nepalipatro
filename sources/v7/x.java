package v7;

import java.util.Collections;
import java.util.List;
import v7.p;
import y7.k;

/* compiled from: Response */
public final class x {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final v f16943a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final u f16944b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final int f16945c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final String f16946d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final o f16947e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final p f16948f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public final y f16949g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public x f16950h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public x f16951i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public final x f16952j;

    /* renamed from: k  reason: collision with root package name */
    private volatile c f16953k;

    /* compiled from: Response */
    public static class b {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public v f16954a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public u f16955b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public int f16956c;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public String f16957d;
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public o f16958e;
        /* access modifiers changed from: private */

        /* renamed from: f  reason: collision with root package name */
        public p.b f16959f;
        /* access modifiers changed from: private */

        /* renamed from: g  reason: collision with root package name */
        public y f16960g;
        /* access modifiers changed from: private */

        /* renamed from: h  reason: collision with root package name */
        public x f16961h;
        /* access modifiers changed from: private */

        /* renamed from: i  reason: collision with root package name */
        public x f16962i;
        /* access modifiers changed from: private */

        /* renamed from: j  reason: collision with root package name */
        public x f16963j;

        private void o(x xVar) {
            if (xVar.f16949g != null) {
                throw new IllegalArgumentException("priorResponse.body != null");
            }
        }

        private void p(String str, x xVar) {
            if (xVar.f16949g != null) {
                throw new IllegalArgumentException(str + ".body != null");
            } else if (xVar.f16950h != null) {
                throw new IllegalArgumentException(str + ".networkResponse != null");
            } else if (xVar.f16951i != null) {
                throw new IllegalArgumentException(str + ".cacheResponse != null");
            } else if (xVar.f16952j != null) {
                throw new IllegalArgumentException(str + ".priorResponse != null");
            }
        }

        public b k(String str, String str2) {
            this.f16959f.b(str, str2);
            return this;
        }

        public b l(y yVar) {
            this.f16960g = yVar;
            return this;
        }

        public x m() {
            if (this.f16954a == null) {
                throw new IllegalStateException("request == null");
            } else if (this.f16955b == null) {
                throw new IllegalStateException("protocol == null");
            } else if (this.f16956c >= 0) {
                return new x(this);
            } else {
                throw new IllegalStateException("code < 0: " + this.f16956c);
            }
        }

        public b n(x xVar) {
            if (xVar != null) {
                p("cacheResponse", xVar);
            }
            this.f16962i = xVar;
            return this;
        }

        public b q(int i10) {
            this.f16956c = i10;
            return this;
        }

        public b r(o oVar) {
            this.f16958e = oVar;
            return this;
        }

        public b s(String str, String str2) {
            this.f16959f.h(str, str2);
            return this;
        }

        public b t(p pVar) {
            this.f16959f = pVar.e();
            return this;
        }

        public b u(String str) {
            this.f16957d = str;
            return this;
        }

        public b v(x xVar) {
            if (xVar != null) {
                p("networkResponse", xVar);
            }
            this.f16961h = xVar;
            return this;
        }

        public b w(x xVar) {
            if (xVar != null) {
                o(xVar);
            }
            this.f16963j = xVar;
            return this;
        }

        public b x(u uVar) {
            this.f16955b = uVar;
            return this;
        }

        public b y(v vVar) {
            this.f16954a = vVar;
            return this;
        }

        public b() {
            this.f16956c = -1;
            this.f16959f = new p.b();
        }

        private b(x xVar) {
            this.f16956c = -1;
            this.f16954a = xVar.f16943a;
            this.f16955b = xVar.f16944b;
            this.f16956c = xVar.f16945c;
            this.f16957d = xVar.f16946d;
            this.f16958e = xVar.f16947e;
            this.f16959f = xVar.f16948f.e();
            this.f16960g = xVar.f16949g;
            this.f16961h = xVar.f16950h;
            this.f16962i = xVar.f16951i;
            this.f16963j = xVar.f16952j;
        }
    }

    public y k() {
        return this.f16949g;
    }

    public c l() {
        c cVar = this.f16953k;
        if (cVar != null) {
            return cVar;
        }
        c k10 = c.k(this.f16948f);
        this.f16953k = k10;
        return k10;
    }

    public List<f> m() {
        String str;
        int i10 = this.f16945c;
        if (i10 == 401) {
            str = "WWW-Authenticate";
        } else if (i10 != 407) {
            return Collections.emptyList();
        } else {
            str = "Proxy-Authenticate";
        }
        return k.g(r(), str);
    }

    public int n() {
        return this.f16945c;
    }

    public o o() {
        return this.f16947e;
    }

    public String p(String str) {
        return q(str, (String) null);
    }

    public String q(String str, String str2) {
        String a10 = this.f16948f.a(str);
        return a10 != null ? a10 : str2;
    }

    public p r() {
        return this.f16948f;
    }

    public boolean s() {
        int i10 = this.f16945c;
        return i10 >= 200 && i10 < 300;
    }

    public b t() {
        return new b();
    }

    public String toString() {
        return "Response{protocol=" + this.f16944b + ", code=" + this.f16945c + ", message=" + this.f16946d + ", url=" + this.f16943a.o() + '}';
    }

    public v u() {
        return this.f16943a;
    }

    private x(b bVar) {
        this.f16943a = bVar.f16954a;
        this.f16944b = bVar.f16955b;
        this.f16945c = bVar.f16956c;
        this.f16946d = bVar.f16957d;
        this.f16947e = bVar.f16958e;
        this.f16948f = bVar.f16959f.e();
        this.f16949g = bVar.f16960g;
        this.f16950h = bVar.f16961h;
        this.f16951i = bVar.f16962i;
        this.f16952j = bVar.f16963j;
    }
}
