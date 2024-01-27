package androidx.webkit;

import android.app.PendingIntent;
import android.os.Build;
import android.webkit.SafeBrowsingResponse;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.lang.reflect.InvocationHandler;
import k1.a;
import k1.e;
import k1.g;
import l1.b;
import l1.i;
import l1.l;
import l1.m;
import org.chromium.support_lib_boundary.WebViewClientBoundaryInterface;

public class WebViewClientCompat extends WebViewClient implements WebViewClientBoundaryInterface {
    private static final String[] sSupportedFeatures = {"VISUAL_STATE_CALLBACK", "RECEIVE_WEB_RESOURCE_ERROR", "RECEIVE_HTTP_ERROR", "SHOULD_OVERRIDE_WITH_REDIRECTS", "SAFE_BROWSING_HIT"};

    public final String[] getSupportedFeatures() {
        return sSupportedFeatures;
    }

    public void onPageCommitVisible(WebView webView, String str) {
    }

    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, InvocationHandler invocationHandler) {
        onReceivedError(webView, webResourceRequest, (e) new l(invocationHandler));
    }

    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
    }

    public final void onSafeBrowsingHit(WebView webView, WebResourceRequest webResourceRequest, int i10, InvocationHandler invocationHandler) {
        onSafeBrowsingHit(webView, webResourceRequest, i10, (a) new i(invocationHandler));
    }

    public boolean onWebAuthnIntent(WebView webView, PendingIntent pendingIntent, InvocationHandler invocationHandler) {
        return false;
    }

    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        if (Build.VERSION.SDK_INT < 21) {
            return false;
        }
        return shouldOverrideUrlLoading(webView, b.a(webResourceRequest).toString());
    }

    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        if (Build.VERSION.SDK_INT >= 23) {
            onReceivedError(webView, webResourceRequest, (e) new l(webResourceError));
        }
    }

    public final void onSafeBrowsingHit(WebView webView, WebResourceRequest webResourceRequest, int i10, SafeBrowsingResponse safeBrowsingResponse) {
        onSafeBrowsingHit(webView, webResourceRequest, i10, (a) new i(safeBrowsingResponse));
    }

    public void onSafeBrowsingHit(WebView webView, WebResourceRequest webResourceRequest, int i10, a aVar) {
        if (g.a("SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL")) {
            aVar.a(true);
            return;
        }
        throw m.a();
    }

    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, e eVar) {
        if (Build.VERSION.SDK_INT >= 21 && g.a("WEB_RESOURCE_ERROR_GET_CODE") && g.a("WEB_RESOURCE_ERROR_GET_DESCRIPTION") && b.b(webResourceRequest)) {
            onReceivedError(webView, eVar.b(), eVar.a().toString(), b.a(webResourceRequest).toString());
        }
    }
}
