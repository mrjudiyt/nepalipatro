package v7;

import a8.d;
import java.net.CookieHandler;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import v7.p;
import w7.b;
import w7.c;
import w7.g;
import w7.h;
import y7.q;

/* compiled from: OkHttpClient */
public class t implements Cloneable {
    private static final List<u> E = h.k(u.HTTP_2, u.SPDY_3, u.HTTP_1_1);
    private static final List<j> F = h.k(j.f16846f, j.f16847g, j.f16848h);
    private static SSLSocketFactory G;
    private boolean A;
    private int B;
    private int C;
    private int D;

    /* renamed from: h  reason: collision with root package name */
    private final g f16900h;

    /* renamed from: i  reason: collision with root package name */
    private l f16901i;

    /* renamed from: j  reason: collision with root package name */
    private Proxy f16902j;

    /* renamed from: k  reason: collision with root package name */
    private List<u> f16903k;

    /* renamed from: l  reason: collision with root package name */
    private List<j> f16904l;

    /* renamed from: m  reason: collision with root package name */
    private final List<r> f16905m;

    /* renamed from: n  reason: collision with root package name */
    private final List<r> f16906n;

    /* renamed from: o  reason: collision with root package name */
    private ProxySelector f16907o;

    /* renamed from: p  reason: collision with root package name */
    private CookieHandler f16908p;

    /* renamed from: q  reason: collision with root package name */
    private c f16909q;

    /* renamed from: r  reason: collision with root package name */
    private SocketFactory f16910r;

    /* renamed from: s  reason: collision with root package name */
    private SSLSocketFactory f16911s;

    /* renamed from: t  reason: collision with root package name */
    private HostnameVerifier f16912t;

    /* renamed from: u  reason: collision with root package name */
    private e f16913u;

    /* renamed from: v  reason: collision with root package name */
    private b f16914v;

    /* renamed from: w  reason: collision with root package name */
    private i f16915w;

    /* renamed from: x  reason: collision with root package name */
    private m f16916x;

    /* renamed from: y  reason: collision with root package name */
    private boolean f16917y;

    /* renamed from: z  reason: collision with root package name */
    private boolean f16918z;

    /* compiled from: OkHttpClient */
    static class a extends b {
        a() {
        }

        public void a(p.b bVar, String str) {
            bVar.c(str);
        }

        public void b(j jVar, SSLSocket sSLSocket, boolean z10) {
            jVar.e(sSLSocket, z10);
        }

        public boolean c(i iVar, z7.a aVar) {
            return iVar.b(aVar);
        }

        public z7.a d(i iVar, a aVar, q qVar) {
            return iVar.c(aVar, qVar);
        }

        public c e(t tVar) {
            return tVar.z();
        }

        public void f(i iVar, z7.a aVar) {
            iVar.f(aVar);
        }

        public g g(i iVar) {
            return iVar.f16843f;
        }
    }

    static {
        b.f16991b = new a();
    }

    public t() {
        this.f16905m = new ArrayList();
        this.f16906n = new ArrayList();
        this.f16917y = true;
        this.f16918z = true;
        this.A = true;
        this.B = 10000;
        this.C = 10000;
        this.D = 10000;
        this.f16900h = new g();
        this.f16901i = new l();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:4|5|6|7|8|9) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0016 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized javax.net.ssl.SSLSocketFactory k() {
        /*
            r2 = this;
            monitor-enter(r2)
            javax.net.ssl.SSLSocketFactory r0 = G     // Catch:{ all -> 0x0020 }
            if (r0 != 0) goto L_0x001c
            java.lang.String r0 = "TLS"
            javax.net.ssl.SSLContext r0 = javax.net.ssl.SSLContext.getInstance(r0)     // Catch:{ GeneralSecurityException -> 0x0016 }
            r1 = 0
            r0.init(r1, r1, r1)     // Catch:{ GeneralSecurityException -> 0x0016 }
            javax.net.ssl.SSLSocketFactory r0 = r0.getSocketFactory()     // Catch:{ GeneralSecurityException -> 0x0016 }
            G = r0     // Catch:{ GeneralSecurityException -> 0x0016 }
            goto L_0x001c
        L_0x0016:
            java.lang.AssertionError r0 = new java.lang.AssertionError     // Catch:{ all -> 0x0020 }
            r0.<init>()     // Catch:{ all -> 0x0020 }
            throw r0     // Catch:{ all -> 0x0020 }
        L_0x001c:
            javax.net.ssl.SSLSocketFactory r0 = G     // Catch:{ all -> 0x0020 }
            monitor-exit(r2)
            return r0
        L_0x0020:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: v7.t.k():javax.net.ssl.SSLSocketFactory");
    }

    public List<r> A() {
        return this.f16906n;
    }

    public d B(v vVar) {
        return new d(this, vVar);
    }

    public void C(long j10, TimeUnit timeUnit) {
        int i10 = (j10 > 0 ? 1 : (j10 == 0 ? 0 : -1));
        if (i10 < 0) {
            throw new IllegalArgumentException("timeout < 0");
        } else if (timeUnit != null) {
            long millis = timeUnit.toMillis(j10);
            if (millis > 2147483647L) {
                throw new IllegalArgumentException("Timeout too large.");
            } else if (millis != 0 || i10 <= 0) {
                this.B = (int) millis;
            } else {
                throw new IllegalArgumentException("Timeout too small.");
            }
        } else {
            throw new IllegalArgumentException("unit == null");
        }
    }

    public void D(long j10, TimeUnit timeUnit) {
        int i10 = (j10 > 0 ? 1 : (j10 == 0 ? 0 : -1));
        if (i10 < 0) {
            throw new IllegalArgumentException("timeout < 0");
        } else if (timeUnit != null) {
            long millis = timeUnit.toMillis(j10);
            if (millis > 2147483647L) {
                throw new IllegalArgumentException("Timeout too large.");
            } else if (millis != 0 || i10 <= 0) {
                this.C = (int) millis;
            } else {
                throw new IllegalArgumentException("Timeout too small.");
            }
        } else {
            throw new IllegalArgumentException("unit == null");
        }
    }

    /* renamed from: a */
    public t clone() {
        return new t(this);
    }

    /* access modifiers changed from: package-private */
    public t b() {
        t tVar = new t(this);
        if (tVar.f16907o == null) {
            tVar.f16907o = ProxySelector.getDefault();
        }
        if (tVar.f16908p == null) {
            tVar.f16908p = CookieHandler.getDefault();
        }
        if (tVar.f16910r == null) {
            tVar.f16910r = SocketFactory.getDefault();
        }
        if (tVar.f16911s == null) {
            tVar.f16911s = k();
        }
        if (tVar.f16912t == null) {
            tVar.f16912t = d.f13298a;
        }
        if (tVar.f16913u == null) {
            tVar.f16913u = e.f16786b;
        }
        if (tVar.f16914v == null) {
            tVar.f16914v = y7.a.f17334a;
        }
        if (tVar.f16915w == null) {
            tVar.f16915w = i.d();
        }
        if (tVar.f16903k == null) {
            tVar.f16903k = E;
        }
        if (tVar.f16904l == null) {
            tVar.f16904l = F;
        }
        if (tVar.f16916x == null) {
            tVar.f16916x = m.f16862a;
        }
        return tVar;
    }

    public b c() {
        return this.f16914v;
    }

    public e d() {
        return this.f16913u;
    }

    public int e() {
        return this.B;
    }

    public i f() {
        return this.f16915w;
    }

    public List<j> g() {
        return this.f16904l;
    }

    public CookieHandler i() {
        return this.f16908p;
    }

    public l l() {
        return this.f16901i;
    }

    public m m() {
        return this.f16916x;
    }

    public boolean n() {
        return this.f16918z;
    }

    public boolean o() {
        return this.f16917y;
    }

    public HostnameVerifier p() {
        return this.f16912t;
    }

    public List<u> q() {
        return this.f16903k;
    }

    public Proxy r() {
        return this.f16902j;
    }

    public ProxySelector s() {
        return this.f16907o;
    }

    public int t() {
        return this.C;
    }

    public boolean u() {
        return this.A;
    }

    public SocketFactory v() {
        return this.f16910r;
    }

    public SSLSocketFactory w() {
        return this.f16911s;
    }

    public int x() {
        return this.D;
    }

    public List<r> y() {
        return this.f16905m;
    }

    /* access modifiers changed from: package-private */
    public c z() {
        return this.f16909q;
    }

    private t(t tVar) {
        ArrayList arrayList = new ArrayList();
        this.f16905m = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f16906n = arrayList2;
        this.f16917y = true;
        this.f16918z = true;
        this.A = true;
        this.B = 10000;
        this.C = 10000;
        this.D = 10000;
        this.f16900h = tVar.f16900h;
        this.f16901i = tVar.f16901i;
        this.f16902j = tVar.f16902j;
        this.f16903k = tVar.f16903k;
        this.f16904l = tVar.f16904l;
        arrayList.addAll(tVar.f16905m);
        arrayList2.addAll(tVar.f16906n);
        this.f16907o = tVar.f16907o;
        this.f16908p = tVar.f16908p;
        this.f16909q = tVar.f16909q;
        this.f16910r = tVar.f16910r;
        this.f16911s = tVar.f16911s;
        this.f16912t = tVar.f16912t;
        this.f16913u = tVar.f16913u;
        this.f16914v = tVar.f16914v;
        this.f16915w = tVar.f16915w;
        this.f16916x = tVar.f16916x;
        this.f16917y = tVar.f16917y;
        this.f16918z = tVar.f16918z;
        this.A = tVar.A;
        this.B = tVar.B;
        this.C = tVar.C;
        this.D = tVar.D;
    }
}
