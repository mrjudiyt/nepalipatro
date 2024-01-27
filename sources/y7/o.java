package y7;

import com.facebook.internal.security.CertificateUtil;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;
import v7.a;
import v7.q;
import v7.z;
import w7.g;

/* compiled from: RouteSelector */
public final class o {

    /* renamed from: a  reason: collision with root package name */
    private final a f17431a;

    /* renamed from: b  reason: collision with root package name */
    private final g f17432b;

    /* renamed from: c  reason: collision with root package name */
    private Proxy f17433c;

    /* renamed from: d  reason: collision with root package name */
    private InetSocketAddress f17434d;

    /* renamed from: e  reason: collision with root package name */
    private List<Proxy> f17435e = Collections.emptyList();

    /* renamed from: f  reason: collision with root package name */
    private int f17436f;

    /* renamed from: g  reason: collision with root package name */
    private List<InetSocketAddress> f17437g = Collections.emptyList();

    /* renamed from: h  reason: collision with root package name */
    private int f17438h;

    /* renamed from: i  reason: collision with root package name */
    private final List<z> f17439i = new ArrayList();

    public o(a aVar, g gVar) {
        this.f17431a = aVar;
        this.f17432b = gVar;
        l(aVar.m(), aVar.g());
    }

    static String b(InetSocketAddress inetSocketAddress) {
        InetAddress address = inetSocketAddress.getAddress();
        if (address == null) {
            return inetSocketAddress.getHostName();
        }
        return address.getHostAddress();
    }

    private boolean d() {
        return this.f17438h < this.f17437g.size();
    }

    private boolean e() {
        return !this.f17439i.isEmpty();
    }

    private boolean f() {
        return this.f17436f < this.f17435e.size();
    }

    private InetSocketAddress h() {
        if (d()) {
            List<InetSocketAddress> list = this.f17437g;
            int i10 = this.f17438h;
            this.f17438h = i10 + 1;
            return list.get(i10);
        }
        throw new SocketException("No route to " + this.f17431a.k() + "; exhausted inet socket addresses: " + this.f17437g);
    }

    private z i() {
        return this.f17439i.remove(0);
    }

    private Proxy j() {
        if (f()) {
            List<Proxy> list = this.f17435e;
            int i10 = this.f17436f;
            this.f17436f = i10 + 1;
            Proxy proxy = list.get(i10);
            k(proxy);
            return proxy;
        }
        throw new SocketException("No route to " + this.f17431a.k() + "; exhausted proxy configurations: " + this.f17435e);
    }

    private void k(Proxy proxy) {
        String str;
        int i10;
        this.f17437g = new ArrayList();
        if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
            str = this.f17431a.k();
            i10 = this.f17431a.l();
        } else {
            SocketAddress address = proxy.address();
            if (address instanceof InetSocketAddress) {
                InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
                str = b(inetSocketAddress);
                i10 = inetSocketAddress.getPort();
            } else {
                throw new IllegalArgumentException("Proxy.address() is not an InetSocketAddress: " + address.getClass());
            }
        }
        if (i10 < 1 || i10 > 65535) {
            throw new SocketException("No route to " + str + CertificateUtil.DELIMITER + i10 + "; port is out of range");
        }
        if (proxy.type() == Proxy.Type.SOCKS) {
            this.f17437g.add(InetSocketAddress.createUnresolved(str, i10));
        } else {
            List<InetAddress> a10 = this.f17431a.d().a(str);
            int size = a10.size();
            for (int i11 = 0; i11 < size; i11++) {
                this.f17437g.add(new InetSocketAddress(a10.get(i11), i10));
            }
        }
        this.f17438h = 0;
    }

    private void l(q qVar, Proxy proxy) {
        if (proxy != null) {
            this.f17435e = Collections.singletonList(proxy);
        } else {
            this.f17435e = new ArrayList();
            List<Proxy> select = this.f17431a.h().select(qVar.F());
            if (select != null) {
                this.f17435e.addAll(select);
            }
            this.f17435e.removeAll(Collections.singleton(Proxy.NO_PROXY));
            this.f17435e.add(Proxy.NO_PROXY);
        }
        this.f17436f = 0;
    }

    public void a(z zVar, IOException iOException) {
        if (!(zVar.b().type() == Proxy.Type.DIRECT || this.f17431a.h() == null)) {
            this.f17431a.h().connectFailed(this.f17431a.m().F(), zVar.b().address(), iOException);
        }
        this.f17432b.b(zVar);
    }

    public boolean c() {
        return d() || f() || e();
    }

    public z g() {
        if (!d()) {
            if (f()) {
                this.f17433c = j();
            } else if (e()) {
                return i();
            } else {
                throw new NoSuchElementException();
            }
        }
        InetSocketAddress h10 = h();
        this.f17434d = h10;
        z zVar = new z(this.f17431a, this.f17433c, h10);
        if (!this.f17432b.c(zVar)) {
            return zVar;
        }
        this.f17439i.add(zVar);
        return g();
    }
}
