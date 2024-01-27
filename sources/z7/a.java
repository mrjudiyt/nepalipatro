package z7;

import a8.f;
import com.facebook.internal.security.CertificateUtil;
import com.google.android.gms.common.api.Api;
import com.squareup.okhttp.internal.http.RouteException;
import ea.g;
import java.io.IOException;
import java.lang.ref.Reference;
import java.net.ConnectException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.net.UnknownServiceException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLSocketFactory;
import v7.h;
import v7.j;
import v7.o;
import v7.u;
import v7.v;
import v7.x;
import v7.z;
import w7.i;
import x7.d;
import y7.e;
import y7.k;
import y7.q;

/* compiled from: RealConnection */
public final class a implements h {

    /* renamed from: m  reason: collision with root package name */
    private static SSLSocketFactory f17531m;

    /* renamed from: n  reason: collision with root package name */
    private static f f17532n;

    /* renamed from: a  reason: collision with root package name */
    private final z f17533a;

    /* renamed from: b  reason: collision with root package name */
    private Socket f17534b;

    /* renamed from: c  reason: collision with root package name */
    public Socket f17535c;

    /* renamed from: d  reason: collision with root package name */
    private o f17536d;

    /* renamed from: e  reason: collision with root package name */
    private u f17537e;

    /* renamed from: f  reason: collision with root package name */
    public volatile d f17538f;

    /* renamed from: g  reason: collision with root package name */
    public int f17539g;

    /* renamed from: h  reason: collision with root package name */
    public g f17540h;

    /* renamed from: i  reason: collision with root package name */
    public ea.f f17541i;

    /* renamed from: j  reason: collision with root package name */
    public final List<Reference<q>> f17542j = new ArrayList();

    /* renamed from: k  reason: collision with root package name */
    public boolean f17543k;

    /* renamed from: l  reason: collision with root package name */
    public long f17544l = Long.MAX_VALUE;

    public a(z zVar) {
        this.f17533a = zVar;
    }

    private void d(int i10, int i11, int i12, w7.a aVar) {
        this.f17534b.setSoTimeout(i11);
        try {
            w7.f.f().d(this.f17534b, this.f17533a.c(), i10);
            this.f17540h = ea.o.b(ea.o.h(this.f17534b));
            this.f17541i = ea.o.a(ea.o.f(this.f17534b));
            if (this.f17533a.a().j() != null) {
                e(i11, i12, aVar);
            } else {
                this.f17537e = u.HTTP_1_1;
                this.f17535c = this.f17534b;
            }
            u uVar = this.f17537e;
            if (uVar == u.SPDY_3 || uVar == u.HTTP_2) {
                this.f17535c.setSoTimeout(0);
                d i13 = new d.h(true).k(this.f17535c, this.f17533a.a().m().q(), this.f17540h, this.f17541i).j(this.f17537e).i();
                i13.X0();
                this.f17538f = i13;
            }
        } catch (ConnectException unused) {
            throw new ConnectException("Failed to connect to " + this.f17533a.c());
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: javax.net.ssl.SSLSocket} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: javax.net.ssl.SSLSocket} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: javax.net.ssl.SSLSocket} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: javax.net.ssl.SSLSocket} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0122 A[Catch:{ all -> 0x0119 }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0128 A[Catch:{ all -> 0x0119 }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x012b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void e(int r6, int r7, w7.a r8) {
        /*
            r5 = this;
            v7.z r0 = r5.f17533a
            boolean r0 = r0.d()
            if (r0 == 0) goto L_0x000b
            r5.f(r6, r7)
        L_0x000b:
            v7.z r6 = r5.f17533a
            v7.a r6 = r6.a()
            javax.net.ssl.SSLSocketFactory r7 = r6.j()
            r0 = 0
            java.net.Socket r1 = r5.f17534b     // Catch:{ AssertionError -> 0x011b }
            java.lang.String r2 = r6.k()     // Catch:{ AssertionError -> 0x011b }
            int r3 = r6.l()     // Catch:{ AssertionError -> 0x011b }
            r4 = 1
            java.net.Socket r7 = r7.createSocket(r1, r2, r3, r4)     // Catch:{ AssertionError -> 0x011b }
            javax.net.ssl.SSLSocket r7 = (javax.net.ssl.SSLSocket) r7     // Catch:{ AssertionError -> 0x011b }
            v7.j r8 = r8.a(r7)     // Catch:{ AssertionError -> 0x0116, all -> 0x0113 }
            boolean r1 = r8.j()     // Catch:{ AssertionError -> 0x0116, all -> 0x0113 }
            if (r1 == 0) goto L_0x0040
            w7.f r1 = w7.f.f()     // Catch:{ AssertionError -> 0x0116, all -> 0x0113 }
            java.lang.String r2 = r6.k()     // Catch:{ AssertionError -> 0x0116, all -> 0x0113 }
            java.util.List r3 = r6.f()     // Catch:{ AssertionError -> 0x0116, all -> 0x0113 }
            r1.c(r7, r2, r3)     // Catch:{ AssertionError -> 0x0116, all -> 0x0113 }
        L_0x0040:
            r7.startHandshake()     // Catch:{ AssertionError -> 0x0116, all -> 0x0113 }
            javax.net.ssl.SSLSession r1 = r7.getSession()     // Catch:{ AssertionError -> 0x0116, all -> 0x0113 }
            v7.o r1 = v7.o.b(r1)     // Catch:{ AssertionError -> 0x0116, all -> 0x0113 }
            javax.net.ssl.HostnameVerifier r2 = r6.e()     // Catch:{ AssertionError -> 0x0116, all -> 0x0113 }
            java.lang.String r3 = r6.k()     // Catch:{ AssertionError -> 0x0116, all -> 0x0113 }
            javax.net.ssl.SSLSession r4 = r7.getSession()     // Catch:{ AssertionError -> 0x0116, all -> 0x0113 }
            boolean r2 = r2.verify(r3, r4)     // Catch:{ AssertionError -> 0x0116, all -> 0x0113 }
            if (r2 == 0) goto L_0x00c0
            v7.e r2 = r6.b()     // Catch:{ AssertionError -> 0x0116, all -> 0x0113 }
            v7.e r3 = v7.e.f16786b     // Catch:{ AssertionError -> 0x0116, all -> 0x0113 }
            if (r2 == r3) goto L_0x0085
            javax.net.ssl.SSLSocketFactory r2 = r6.j()     // Catch:{ AssertionError -> 0x0116, all -> 0x0113 }
            a8.f r2 = k(r2)     // Catch:{ AssertionError -> 0x0116, all -> 0x0113 }
            a8.b r3 = new a8.b     // Catch:{ AssertionError -> 0x0116, all -> 0x0113 }
            r3.<init>(r2)     // Catch:{ AssertionError -> 0x0116, all -> 0x0113 }
            java.util.List r2 = r1.c()     // Catch:{ AssertionError -> 0x0116, all -> 0x0113 }
            java.util.List r2 = r3.a(r2)     // Catch:{ AssertionError -> 0x0116, all -> 0x0113 }
            v7.e r3 = r6.b()     // Catch:{ AssertionError -> 0x0116, all -> 0x0113 }
            java.lang.String r6 = r6.k()     // Catch:{ AssertionError -> 0x0116, all -> 0x0113 }
            r3.a(r6, r2)     // Catch:{ AssertionError -> 0x0116, all -> 0x0113 }
        L_0x0085:
            boolean r6 = r8.j()     // Catch:{ AssertionError -> 0x0116, all -> 0x0113 }
            if (r6 == 0) goto L_0x0093
            w7.f r6 = w7.f.f()     // Catch:{ AssertionError -> 0x0116, all -> 0x0113 }
            java.lang.String r0 = r6.h(r7)     // Catch:{ AssertionError -> 0x0116, all -> 0x0113 }
        L_0x0093:
            r5.f17535c = r7     // Catch:{ AssertionError -> 0x0116, all -> 0x0113 }
            ea.z r6 = ea.o.h(r7)     // Catch:{ AssertionError -> 0x0116, all -> 0x0113 }
            ea.g r6 = ea.o.b(r6)     // Catch:{ AssertionError -> 0x0116, all -> 0x0113 }
            r5.f17540h = r6     // Catch:{ AssertionError -> 0x0116, all -> 0x0113 }
            java.net.Socket r6 = r5.f17535c     // Catch:{ AssertionError -> 0x0116, all -> 0x0113 }
            ea.x r6 = ea.o.f(r6)     // Catch:{ AssertionError -> 0x0116, all -> 0x0113 }
            ea.f r6 = ea.o.a(r6)     // Catch:{ AssertionError -> 0x0116, all -> 0x0113 }
            r5.f17541i = r6     // Catch:{ AssertionError -> 0x0116, all -> 0x0113 }
            r5.f17536d = r1     // Catch:{ AssertionError -> 0x0116, all -> 0x0113 }
            if (r0 == 0) goto L_0x00b4
            v7.u r6 = v7.u.a(r0)     // Catch:{ AssertionError -> 0x0116, all -> 0x0113 }
            goto L_0x00b6
        L_0x00b4:
            v7.u r6 = v7.u.HTTP_1_1     // Catch:{ AssertionError -> 0x0116, all -> 0x0113 }
        L_0x00b6:
            r5.f17537e = r6     // Catch:{ AssertionError -> 0x0116, all -> 0x0113 }
            w7.f r6 = w7.f.f()
            r6.a(r7)
            return
        L_0x00c0:
            java.util.List r8 = r1.c()     // Catch:{ AssertionError -> 0x0116, all -> 0x0113 }
            r0 = 0
            java.lang.Object r8 = r8.get(r0)     // Catch:{ AssertionError -> 0x0116, all -> 0x0113 }
            java.security.cert.X509Certificate r8 = (java.security.cert.X509Certificate) r8     // Catch:{ AssertionError -> 0x0116, all -> 0x0113 }
            javax.net.ssl.SSLPeerUnverifiedException r0 = new javax.net.ssl.SSLPeerUnverifiedException     // Catch:{ AssertionError -> 0x0116, all -> 0x0113 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ AssertionError -> 0x0116, all -> 0x0113 }
            r1.<init>()     // Catch:{ AssertionError -> 0x0116, all -> 0x0113 }
            java.lang.String r2 = "Hostname "
            r1.append(r2)     // Catch:{ AssertionError -> 0x0116, all -> 0x0113 }
            java.lang.String r6 = r6.k()     // Catch:{ AssertionError -> 0x0116, all -> 0x0113 }
            r1.append(r6)     // Catch:{ AssertionError -> 0x0116, all -> 0x0113 }
            java.lang.String r6 = " not verified:"
            r1.append(r6)     // Catch:{ AssertionError -> 0x0116, all -> 0x0113 }
            java.lang.String r6 = "\n    certificate: "
            r1.append(r6)     // Catch:{ AssertionError -> 0x0116, all -> 0x0113 }
            java.lang.String r6 = v7.e.c(r8)     // Catch:{ AssertionError -> 0x0116, all -> 0x0113 }
            r1.append(r6)     // Catch:{ AssertionError -> 0x0116, all -> 0x0113 }
            java.lang.String r6 = "\n    DN: "
            r1.append(r6)     // Catch:{ AssertionError -> 0x0116, all -> 0x0113 }
            java.security.Principal r6 = r8.getSubjectDN()     // Catch:{ AssertionError -> 0x0116, all -> 0x0113 }
            java.lang.String r6 = r6.getName()     // Catch:{ AssertionError -> 0x0116, all -> 0x0113 }
            r1.append(r6)     // Catch:{ AssertionError -> 0x0116, all -> 0x0113 }
            java.lang.String r6 = "\n    subjectAltNames: "
            r1.append(r6)     // Catch:{ AssertionError -> 0x0116, all -> 0x0113 }
            java.util.List r6 = a8.d.a(r8)     // Catch:{ AssertionError -> 0x0116, all -> 0x0113 }
            r1.append(r6)     // Catch:{ AssertionError -> 0x0116, all -> 0x0113 }
            java.lang.String r6 = r1.toString()     // Catch:{ AssertionError -> 0x0116, all -> 0x0113 }
            r0.<init>(r6)     // Catch:{ AssertionError -> 0x0116, all -> 0x0113 }
            throw r0     // Catch:{ AssertionError -> 0x0116, all -> 0x0113 }
        L_0x0113:
            r6 = move-exception
            r0 = r7
            goto L_0x0129
        L_0x0116:
            r6 = move-exception
            r0 = r7
            goto L_0x011c
        L_0x0119:
            r6 = move-exception
            goto L_0x0129
        L_0x011b:
            r6 = move-exception
        L_0x011c:
            boolean r7 = w7.h.o(r6)     // Catch:{ all -> 0x0119 }
            if (r7 == 0) goto L_0x0128
            java.io.IOException r7 = new java.io.IOException     // Catch:{ all -> 0x0119 }
            r7.<init>(r6)     // Catch:{ all -> 0x0119 }
            throw r7     // Catch:{ all -> 0x0119 }
        L_0x0128:
            throw r6     // Catch:{ all -> 0x0119 }
        L_0x0129:
            if (r0 == 0) goto L_0x0132
            w7.f r7 = w7.f.f()
            r7.a(r0)
        L_0x0132:
            w7.h.d(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: z7.a.e(int, int, w7.a):void");
    }

    private void f(int i10, int i11) {
        v g10 = g();
        v7.q j10 = g10.j();
        String str = "CONNECT " + j10.q() + CertificateUtil.DELIMITER + j10.A() + " HTTP/1.1";
        do {
            e eVar = new e((q) null, this.f17540h, this.f17541i);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            this.f17540h.d().g((long) i10, timeUnit);
            this.f17541i.d().g((long) i11, timeUnit);
            eVar.w(g10.i(), str);
            eVar.b();
            x m10 = eVar.v().y(g10).m();
            long e10 = k.e(m10);
            if (e10 == -1) {
                e10 = 0;
            }
            ea.z s10 = eVar.s(e10);
            w7.h.q(s10, Api.BaseClientBuilder.API_PRIORITY_OTHER, timeUnit);
            s10.close();
            int n10 = m10.n();
            if (n10 != 200) {
                if (n10 == 407) {
                    g10 = k.h(this.f17533a.a().a(), m10, this.f17533a.b());
                } else {
                    throw new IOException("Unexpected response code for CONNECT: " + m10.n());
                }
            } else if (!this.f17540h.b().F() || !this.f17541i.b().F()) {
                throw new IOException("TLS tunnel buffered too many bytes!");
            } else {
                return;
            }
        } while (g10 != null);
        throw new IOException("Failed to authenticate with proxy");
    }

    private v g() {
        return new v.b().o(this.f17533a.a().m()).j("Host", w7.h.i(this.f17533a.a().m())).j("Proxy-Connection", "Keep-Alive").j("User-Agent", i.a()).g();
    }

    private static synchronized f k(SSLSocketFactory sSLSocketFactory) {
        f fVar;
        synchronized (a.class) {
            if (sSLSocketFactory != f17531m) {
                f17532n = w7.f.f().k(w7.f.f().j(sSLSocketFactory));
                f17531m = sSLSocketFactory;
            }
            fVar = f17532n;
        }
        return fVar;
    }

    public z a() {
        return this.f17533a;
    }

    public int b() {
        d dVar = this.f17538f;
        if (dVar != null) {
            return dVar.N0();
        }
        return 1;
    }

    public void c(int i10, int i11, int i12, List<j> list, boolean z10) {
        Socket socket;
        if (this.f17537e == null) {
            w7.a aVar = new w7.a(list);
            Proxy b10 = this.f17533a.b();
            v7.a a10 = this.f17533a.a();
            if (this.f17533a.a().j() != null || list.contains(j.f16848h)) {
                RouteException routeException = null;
                while (this.f17537e == null) {
                    try {
                        if (b10.type() != Proxy.Type.DIRECT) {
                            if (b10.type() != Proxy.Type.HTTP) {
                                socket = new Socket(b10);
                                this.f17534b = socket;
                                d(i10, i11, i12, aVar);
                            }
                        }
                        socket = a10.i().createSocket();
                        this.f17534b = socket;
                        d(i10, i11, i12, aVar);
                    } catch (IOException e10) {
                        w7.h.d(this.f17535c);
                        w7.h.d(this.f17534b);
                        this.f17535c = null;
                        this.f17534b = null;
                        this.f17540h = null;
                        this.f17541i = null;
                        this.f17536d = null;
                        this.f17537e = null;
                        if (routeException == null) {
                            routeException = new RouteException(e10);
                        } else {
                            routeException.a(e10);
                        }
                        if (!z10 || !aVar.b(e10)) {
                            throw routeException;
                        }
                    }
                }
                return;
            }
            throw new RouteException(new UnknownServiceException("CLEARTEXT communication not supported: " + list));
        }
        throw new IllegalStateException("already connected");
    }

    public o h() {
        return this.f17536d;
    }

    public Socket i() {
        return this.f17535c;
    }

    public boolean j(boolean z10) {
        int soTimeout;
        if (this.f17535c.isClosed() || this.f17535c.isInputShutdown() || this.f17535c.isOutputShutdown()) {
            return false;
        }
        if (this.f17538f == null && z10) {
            try {
                soTimeout = this.f17535c.getSoTimeout();
                this.f17535c.setSoTimeout(1);
                if (this.f17540h.F()) {
                    this.f17535c.setSoTimeout(soTimeout);
                    return false;
                }
                this.f17535c.setSoTimeout(soTimeout);
                return true;
            } catch (SocketTimeoutException unused) {
            } catch (IOException unused2) {
                return false;
            } catch (Throwable th) {
                this.f17535c.setSoTimeout(soTimeout);
                throw th;
            }
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Connection{");
        sb.append(this.f17533a.a().m().q());
        sb.append(CertificateUtil.DELIMITER);
        sb.append(this.f17533a.a().m().A());
        sb.append(", proxy=");
        sb.append(this.f17533a.b());
        sb.append(" hostAddress=");
        sb.append(this.f17533a.c());
        sb.append(" cipherSuite=");
        o oVar = this.f17536d;
        sb.append(oVar != null ? oVar.a() : "none");
        sb.append(" protocol=");
        sb.append(this.f17537e);
        sb.append('}');
        return sb.toString();
    }
}
