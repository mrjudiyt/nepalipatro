package l1;

import android.webkit.SafeBrowsingResponse;
import android.webkit.WebMessagePort;
import android.webkit.WebResourceError;
import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

/* compiled from: WebkitToCompatConverter */
public class q {

    /* renamed from: a  reason: collision with root package name */
    private final WebkitToCompatConverterBoundaryInterface f9867a;

    public q(WebkitToCompatConverterBoundaryInterface webkitToCompatConverterBoundaryInterface) {
        this.f9867a = webkitToCompatConverterBoundaryInterface;
    }

    public SafeBrowsingResponse a(InvocationHandler invocationHandler) {
        return (SafeBrowsingResponse) this.f9867a.convertSafeBrowsingResponse(invocationHandler);
    }

    public InvocationHandler b(SafeBrowsingResponse safeBrowsingResponse) {
        return this.f9867a.convertSafeBrowsingResponse((Object) safeBrowsingResponse);
    }

    public WebMessagePort c(InvocationHandler invocationHandler) {
        return (WebMessagePort) this.f9867a.convertWebMessagePort(invocationHandler);
    }

    public WebResourceError d(InvocationHandler invocationHandler) {
        return (WebResourceError) this.f9867a.convertWebResourceError(invocationHandler);
    }

    public InvocationHandler e(WebResourceError webResourceError) {
        return this.f9867a.convertWebResourceError((Object) webResourceError);
    }
}
