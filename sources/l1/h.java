package l1;

import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

/* compiled from: IncompatibleApkWebViewProviderFactory */
public class h implements o {

    /* renamed from: a  reason: collision with root package name */
    private static final String[] f9825a = new String[0];

    public String[] a() {
        return f9825a;
    }

    public WebkitToCompatConverterBoundaryInterface getWebkitToCompatConverter() {
        throw new UnsupportedOperationException("This should never happen, if this method was called it means we're trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily");
    }
}
