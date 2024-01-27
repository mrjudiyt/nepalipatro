package v7;

import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.Objects;

/* compiled from: Route */
public final class z {

    /* renamed from: a  reason: collision with root package name */
    final a f16964a;

    /* renamed from: b  reason: collision with root package name */
    final Proxy f16965b;

    /* renamed from: c  reason: collision with root package name */
    final InetSocketAddress f16966c;

    public z(a aVar, Proxy proxy, InetSocketAddress inetSocketAddress) {
        Objects.requireNonNull(aVar, "address == null");
        Objects.requireNonNull(proxy, "proxy == null");
        Objects.requireNonNull(inetSocketAddress, "inetSocketAddress == null");
        this.f16964a = aVar;
        this.f16965b = proxy;
        this.f16966c = inetSocketAddress;
    }

    public a a() {
        return this.f16964a;
    }

    public Proxy b() {
        return this.f16965b;
    }

    public InetSocketAddress c() {
        return this.f16966c;
    }

    public boolean d() {
        return this.f16964a.f16747i != null && this.f16965b.type() == Proxy.Type.HTTP;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        if (!this.f16964a.equals(zVar.f16964a) || !this.f16965b.equals(zVar.f16965b) || !this.f16966c.equals(zVar.f16966c)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((527 + this.f16964a.hashCode()) * 31) + this.f16965b.hashCode()) * 31) + this.f16966c.hashCode();
    }
}
