package l1;

import android.webkit.SafeBrowsingResponse;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import k1.a;
import l1.a;
import org.chromium.support_lib_boundary.SafeBrowsingResponseBoundaryInterface;

/* compiled from: SafeBrowsingResponseImpl */
public class i extends a {

    /* renamed from: a  reason: collision with root package name */
    private SafeBrowsingResponse f9826a;

    /* renamed from: b  reason: collision with root package name */
    private SafeBrowsingResponseBoundaryInterface f9827b;

    public i(InvocationHandler invocationHandler) {
        this.f9827b = (SafeBrowsingResponseBoundaryInterface) ga.a.a(SafeBrowsingResponseBoundaryInterface.class, invocationHandler);
    }

    private SafeBrowsingResponseBoundaryInterface b() {
        if (this.f9827b == null) {
            this.f9827b = (SafeBrowsingResponseBoundaryInterface) ga.a.a(SafeBrowsingResponseBoundaryInterface.class, n.c().b(this.f9826a));
        }
        return this.f9827b;
    }

    private SafeBrowsingResponse c() {
        if (this.f9826a == null) {
            this.f9826a = n.c().a(Proxy.getInvocationHandler(this.f9827b));
        }
        return this.f9826a;
    }

    public void a(boolean z10) {
        a.f fVar = m.f9862z;
        if (fVar.c()) {
            e.e(c(), z10);
        } else if (fVar.d()) {
            b().showInterstitial(z10);
        } else {
            throw m.a();
        }
    }

    public i(SafeBrowsingResponse safeBrowsingResponse) {
        this.f9826a = safeBrowsingResponse;
    }
}
