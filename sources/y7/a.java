package y7;

import java.net.Authenticator;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.util.List;
import v7.b;
import v7.f;
import v7.k;
import v7.q;
import v7.v;
import v7.x;

/* compiled from: AuthenticatorAdapter */
public final class a implements b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f17334a = new a();

    private InetAddress c(Proxy proxy, q qVar) {
        if (proxy == null || proxy.type() == Proxy.Type.DIRECT) {
            return InetAddress.getByName(qVar.q());
        }
        return ((InetSocketAddress) proxy.address()).getAddress();
    }

    public v a(Proxy proxy, x xVar) {
        List<f> m10 = xVar.m();
        v u10 = xVar.u();
        q j10 = u10.j();
        int size = m10.size();
        for (int i10 = 0; i10 < size; i10++) {
            f fVar = m10.get(i10);
            if (!"Basic".equalsIgnoreCase(fVar.b())) {
                Proxy proxy2 = proxy;
            } else {
                PasswordAuthentication requestPasswordAuthentication = Authenticator.requestPasswordAuthentication(j10.q(), c(proxy, j10), j10.A(), j10.E(), fVar.a(), fVar.b(), j10.G(), Authenticator.RequestorType.SERVER);
                if (requestPasswordAuthentication != null) {
                    return u10.m().j("Authorization", k.a(requestPasswordAuthentication.getUserName(), new String(requestPasswordAuthentication.getPassword()))).g();
                }
            }
        }
        return null;
    }

    public v b(Proxy proxy, x xVar) {
        List<f> m10 = xVar.m();
        v u10 = xVar.u();
        q j10 = u10.j();
        int size = m10.size();
        for (int i10 = 0; i10 < size; i10++) {
            f fVar = m10.get(i10);
            if ("Basic".equalsIgnoreCase(fVar.b())) {
                InetSocketAddress inetSocketAddress = (InetSocketAddress) proxy.address();
                PasswordAuthentication requestPasswordAuthentication = Authenticator.requestPasswordAuthentication(inetSocketAddress.getHostName(), c(proxy, j10), inetSocketAddress.getPort(), j10.E(), fVar.a(), fVar.b(), j10.G(), Authenticator.RequestorType.PROXY);
                if (requestPasswordAuthentication != null) {
                    return u10.m().j("Proxy-Authorization", k.a(requestPasswordAuthentication.getUserName(), new String(requestPasswordAuthentication.getPassword()))).g();
                }
            }
        }
        return null;
    }
}
