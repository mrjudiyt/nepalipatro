package l1;

import android.webkit.WebResourceError;
import ga.a;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import k1.e;
import l1.a;
import org.chromium.support_lib_boundary.WebResourceErrorBoundaryInterface;

/* compiled from: WebResourceErrorImpl */
public class l extends e {

    /* renamed from: a  reason: collision with root package name */
    private WebResourceError f9833a;

    /* renamed from: b  reason: collision with root package name */
    private WebResourceErrorBoundaryInterface f9834b;

    public l(InvocationHandler invocationHandler) {
        this.f9834b = (WebResourceErrorBoundaryInterface) a.a(WebResourceErrorBoundaryInterface.class, invocationHandler);
    }

    private WebResourceErrorBoundaryInterface c() {
        if (this.f9834b == null) {
            this.f9834b = (WebResourceErrorBoundaryInterface) a.a(WebResourceErrorBoundaryInterface.class, n.c().e(this.f9833a));
        }
        return this.f9834b;
    }

    private WebResourceError d() {
        if (this.f9833a == null) {
            this.f9833a = n.c().d(Proxy.getInvocationHandler(this.f9834b));
        }
        return this.f9833a;
    }

    public CharSequence a() {
        a.b bVar = m.f9858v;
        if (bVar.c()) {
            return c.e(d());
        }
        if (bVar.d()) {
            return c().getDescription();
        }
        throw m.a();
    }

    public int b() {
        a.b bVar = m.f9859w;
        if (bVar.c()) {
            return c.f(d());
        }
        if (bVar.d()) {
            return c().getErrorCode();
        }
        throw m.a();
    }

    public l(WebResourceError webResourceError) {
        this.f9833a = webResourceError;
    }
}
