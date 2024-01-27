package l1;

import android.net.Uri;
import android.os.Handler;
import android.webkit.WebMessage;
import android.webkit.WebMessagePort;
import android.webkit.WebResourceError;
import android.webkit.WebSettings;
import android.webkit.WebView;
import k1.d;
import k1.f;

/* compiled from: ApiHelperForM */
public class c {

    /* compiled from: ApiHelperForM */
    class a extends WebMessagePort.WebMessageCallback {
        a(d.a aVar) {
        }

        public void onMessage(WebMessagePort webMessagePort, WebMessage webMessage) {
            new k(webMessagePort);
            k.c(webMessage);
            throw null;
        }
    }

    /* compiled from: ApiHelperForM */
    class b extends WebMessagePort.WebMessageCallback {
        b(d.a aVar) {
        }

        public void onMessage(WebMessagePort webMessagePort, WebMessage webMessage) {
            new k(webMessagePort);
            k.c(webMessage);
            throw null;
        }
    }

    /* renamed from: l1.c$c  reason: collision with other inner class name */
    /* compiled from: ApiHelperForM */
    class C0162c extends WebView.VisualStateCallback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f.a f9824a;

        C0162c(f.a aVar) {
            this.f9824a = aVar;
        }

        public void onComplete(long j10) {
            this.f9824a.onComplete(j10);
        }
    }

    public static void a(WebMessagePort webMessagePort) {
        webMessagePort.close();
    }

    public static WebMessage b(k1.c cVar) {
        return new WebMessage(cVar.a(), k.b(cVar.b()));
    }

    public static WebMessagePort[] c(WebView webView) {
        return webView.createWebMessageChannel();
    }

    public static k1.c d(WebMessage webMessage) {
        return new k1.c(webMessage.getData(), k.e(webMessage.getPorts()));
    }

    public static CharSequence e(WebResourceError webResourceError) {
        return webResourceError.getDescription();
    }

    public static int f(WebResourceError webResourceError) {
        return webResourceError.getErrorCode();
    }

    public static boolean g(WebSettings webSettings) {
        return webSettings.getOffscreenPreRaster();
    }

    public static void h(WebMessagePort webMessagePort, WebMessage webMessage) {
        webMessagePort.postMessage(webMessage);
    }

    public static void i(WebView webView, long j10, f.a aVar) {
        webView.postVisualStateCallback(j10, new C0162c(aVar));
    }

    public static void j(WebView webView, WebMessage webMessage, Uri uri) {
        webView.postWebMessage(webMessage, uri);
    }

    public static void k(WebSettings webSettings, boolean z10) {
        webSettings.setOffscreenPreRaster(z10);
    }

    public static void l(WebMessagePort webMessagePort, d.a aVar) {
        webMessagePort.setWebMessageCallback(new a(aVar));
    }

    public static void m(WebMessagePort webMessagePort, d.a aVar, Handler handler) {
        webMessagePort.setWebMessageCallback(new b(aVar), handler);
    }
}
