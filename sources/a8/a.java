package a8;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

/* compiled from: AndroidTrustRootIndex */
public final class a implements f {

    /* renamed from: a  reason: collision with root package name */
    private final X509TrustManager f13288a;

    /* renamed from: b  reason: collision with root package name */
    private final Method f13289b;

    public a(X509TrustManager x509TrustManager, Method method) {
        this.f13289b = method;
        this.f13288a = x509TrustManager;
    }

    public static f b(X509TrustManager x509TrustManager) {
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", new Class[]{X509Certificate.class});
            declaredMethod.setAccessible(true);
            return new a(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public X509Certificate a(X509Certificate x509Certificate) {
        try {
            TrustAnchor trustAnchor = (TrustAnchor) this.f13289b.invoke(this.f13288a, new Object[]{x509Certificate});
            if (trustAnchor != null) {
                return trustAnchor.getTrustedCert();
            }
            return null;
        } catch (IllegalAccessException unused) {
            throw new AssertionError();
        } catch (InvocationTargetException unused2) {
            return null;
        }
    }
}
