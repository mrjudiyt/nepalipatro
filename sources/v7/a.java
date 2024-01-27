package v7;

import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import v7.q;
import w7.h;

/* compiled from: Address */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    final q f16739a;

    /* renamed from: b  reason: collision with root package name */
    final m f16740b;

    /* renamed from: c  reason: collision with root package name */
    final SocketFactory f16741c;

    /* renamed from: d  reason: collision with root package name */
    final b f16742d;

    /* renamed from: e  reason: collision with root package name */
    final List<u> f16743e;

    /* renamed from: f  reason: collision with root package name */
    final List<j> f16744f;

    /* renamed from: g  reason: collision with root package name */
    final ProxySelector f16745g;

    /* renamed from: h  reason: collision with root package name */
    final Proxy f16746h;

    /* renamed from: i  reason: collision with root package name */
    final SSLSocketFactory f16747i;

    /* renamed from: j  reason: collision with root package name */
    final HostnameVerifier f16748j;

    /* renamed from: k  reason: collision with root package name */
    final e f16749k;

    public a(String str, int i10, m mVar, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, e eVar, b bVar, Proxy proxy, List<u> list, List<j> list2, ProxySelector proxySelector) {
        this.f16739a = new q.b().u(sSLSocketFactory != null ? "https" : "http").i(str).p(i10).a();
        if (mVar != null) {
            this.f16740b = mVar;
            if (socketFactory != null) {
                this.f16741c = socketFactory;
                if (bVar != null) {
                    this.f16742d = bVar;
                    if (list != null) {
                        this.f16743e = h.j(list);
                        if (list2 != null) {
                            this.f16744f = h.j(list2);
                            if (proxySelector != null) {
                                this.f16745g = proxySelector;
                                this.f16746h = proxy;
                                this.f16747i = sSLSocketFactory;
                                this.f16748j = hostnameVerifier;
                                this.f16749k = eVar;
                                return;
                            }
                            throw new IllegalArgumentException("proxySelector == null");
                        }
                        throw new IllegalArgumentException("connectionSpecs == null");
                    }
                    throw new IllegalArgumentException("protocols == null");
                }
                throw new IllegalArgumentException("authenticator == null");
            }
            throw new IllegalArgumentException("socketFactory == null");
        }
        throw new IllegalArgumentException("dns == null");
    }

    public b a() {
        return this.f16742d;
    }

    public e b() {
        return this.f16749k;
    }

    public List<j> c() {
        return this.f16744f;
    }

    public m d() {
        return this.f16740b;
    }

    public HostnameVerifier e() {
        return this.f16748j;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (!this.f16739a.equals(aVar.f16739a) || !this.f16740b.equals(aVar.f16740b) || !this.f16742d.equals(aVar.f16742d) || !this.f16743e.equals(aVar.f16743e) || !this.f16744f.equals(aVar.f16744f) || !this.f16745g.equals(aVar.f16745g) || !h.h(this.f16746h, aVar.f16746h) || !h.h(this.f16747i, aVar.f16747i) || !h.h(this.f16748j, aVar.f16748j) || !h.h(this.f16749k, aVar.f16749k)) {
            return false;
        }
        return true;
    }

    public List<u> f() {
        return this.f16743e;
    }

    public Proxy g() {
        return this.f16746h;
    }

    public ProxySelector h() {
        return this.f16745g;
    }

    public int hashCode() {
        int hashCode = (((((((((((527 + this.f16739a.hashCode()) * 31) + this.f16740b.hashCode()) * 31) + this.f16742d.hashCode()) * 31) + this.f16743e.hashCode()) * 31) + this.f16744f.hashCode()) * 31) + this.f16745g.hashCode()) * 31;
        Proxy proxy = this.f16746h;
        int i10 = 0;
        int hashCode2 = (hashCode + (proxy != null ? proxy.hashCode() : 0)) * 31;
        SSLSocketFactory sSLSocketFactory = this.f16747i;
        int hashCode3 = (hashCode2 + (sSLSocketFactory != null ? sSLSocketFactory.hashCode() : 0)) * 31;
        HostnameVerifier hostnameVerifier = this.f16748j;
        int hashCode4 = (hashCode3 + (hostnameVerifier != null ? hostnameVerifier.hashCode() : 0)) * 31;
        e eVar = this.f16749k;
        if (eVar != null) {
            i10 = eVar.hashCode();
        }
        return hashCode4 + i10;
    }

    public SocketFactory i() {
        return this.f16741c;
    }

    public SSLSocketFactory j() {
        return this.f16747i;
    }

    @Deprecated
    public String k() {
        return this.f16739a.q();
    }

    @Deprecated
    public int l() {
        return this.f16739a.A();
    }

    public q m() {
        return this.f16739a;
    }
}
