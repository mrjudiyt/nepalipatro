package l1;

import ga.a;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

/* compiled from: WebViewProviderFactoryAdapter */
public class p implements o {

    /* renamed from: a  reason: collision with root package name */
    final WebViewProviderFactoryBoundaryInterface f9866a;

    public p(WebViewProviderFactoryBoundaryInterface webViewProviderFactoryBoundaryInterface) {
        this.f9866a = webViewProviderFactoryBoundaryInterface;
    }

    public String[] a() {
        return this.f9866a.getSupportedFeatures();
    }

    public WebkitToCompatConverterBoundaryInterface getWebkitToCompatConverter() {
        return (WebkitToCompatConverterBoundaryInterface) a.a(WebkitToCompatConverterBoundaryInterface.class, this.f9866a.getWebkitToCompatConverter());
    }
}
