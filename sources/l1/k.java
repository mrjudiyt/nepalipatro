package l1;

import android.webkit.WebMessage;
import android.webkit.WebMessagePort;
import java.lang.reflect.Proxy;
import k1.c;
import k1.d;
import org.chromium.support_lib_boundary.WebMessagePortBoundaryInterface;

/* compiled from: WebMessagePortImpl */
public class k extends d {

    /* renamed from: a  reason: collision with root package name */
    private WebMessagePort f9831a;

    /* renamed from: b  reason: collision with root package name */
    private WebMessagePortBoundaryInterface f9832b;

    public k(WebMessagePort webMessagePort) {
        this.f9831a = webMessagePort;
    }

    public static WebMessagePort[] b(d[] dVarArr) {
        if (dVarArr == null) {
            return null;
        }
        int length = dVarArr.length;
        WebMessagePort[] webMessagePortArr = new WebMessagePort[length];
        for (int i10 = 0; i10 < length; i10++) {
            webMessagePortArr[i10] = dVarArr[i10].a();
        }
        return webMessagePortArr;
    }

    public static c c(WebMessage webMessage) {
        return c.d(webMessage);
    }

    private WebMessagePort d() {
        if (this.f9831a == null) {
            this.f9831a = n.c().c(Proxy.getInvocationHandler(this.f9832b));
        }
        return this.f9831a;
    }

    public static d[] e(WebMessagePort[] webMessagePortArr) {
        if (webMessagePortArr == null) {
            return null;
        }
        d[] dVarArr = new d[webMessagePortArr.length];
        for (int i10 = 0; i10 < webMessagePortArr.length; i10++) {
            dVarArr[i10] = new k(webMessagePortArr[i10]);
        }
        return dVarArr;
    }

    public WebMessagePort a() {
        return d();
    }
}
