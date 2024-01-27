package io.flutter.plugins.webviewflutter;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.os.Build;
import android.view.KeyEvent;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.webkit.WebViewClientCompat;
import io.flutter.plugins.webviewflutter.GeneratedAndroidWebView;
import java.util.Objects;
import k1.e;

public class WebViewClientHostApiImpl implements GeneratedAndroidWebView.WebViewClientHostApi {
    private final WebViewClientFlutterApiImpl flutterApi;
    private final InstanceManager instanceManager;
    private final WebViewClientCreator webViewClientCreator;

    public static class WebViewClientCompatImpl extends WebViewClientCompat {
        private final WebViewClientFlutterApiImpl flutterApi;
        private boolean returnValueForShouldOverrideUrlLoading = false;

        public WebViewClientCompatImpl(WebViewClientFlutterApiImpl webViewClientFlutterApiImpl) {
            this.flutterApi = webViewClientFlutterApiImpl;
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ void lambda$doUpdateVisitedHistory$6(Void voidR) {
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ void lambda$onPageFinished$1(Void voidR) {
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ void lambda$onPageStarted$0(Void voidR) {
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ void lambda$onReceivedError$2(Void voidR) {
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ void lambda$onReceivedError$3(Void voidR) {
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ void lambda$shouldOverrideUrlLoading$4(Void voidR) {
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ void lambda$shouldOverrideUrlLoading$5(Void voidR) {
        }

        public void doUpdateVisitedHistory(WebView webView, String str, boolean z10) {
            this.flutterApi.doUpdateVisitedHistory(this, webView, str, z10, p3.f15315a);
        }

        public void onPageFinished(WebView webView, String str) {
            this.flutterApi.onPageFinished(this, webView, str, j3.f15289a);
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            this.flutterApi.onPageStarted(this, webView, str, l3.f15298a);
        }

        @SuppressLint({"RequiresFeature"})
        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, e eVar) {
            this.flutterApi.onReceivedRequestError((WebViewClient) this, webView, webResourceRequest, eVar, (GeneratedAndroidWebView.WebViewClientFlutterApi.Reply<Void>) n3.f15306a);
        }

        public void onUnhandledKeyEvent(WebView webView, KeyEvent keyEvent) {
        }

        public void setReturnValueForShouldOverrideUrlLoading(boolean z10) {
            this.returnValueForShouldOverrideUrlLoading = z10;
        }

        @TargetApi(21)
        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            this.flutterApi.requestLoading(this, webView, webResourceRequest, k3.f15293a);
            return this.returnValueForShouldOverrideUrlLoading;
        }

        public void onReceivedError(WebView webView, int i10, String str, String str2) {
            this.flutterApi.onReceivedError(this, webView, Long.valueOf((long) i10), str, str2, m3.f15301a);
        }

        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            this.flutterApi.urlLoading(this, webView, str, o3.f15311a);
            return this.returnValueForShouldOverrideUrlLoading;
        }
    }

    public static class WebViewClientCreator {
        public WebViewClient createWebViewClient(WebViewClientFlutterApiImpl webViewClientFlutterApiImpl) {
            if (Build.VERSION.SDK_INT >= 24) {
                return new WebViewClientImpl(webViewClientFlutterApiImpl);
            }
            return new WebViewClientCompatImpl(webViewClientFlutterApiImpl);
        }
    }

    public static class WebViewClientImpl extends WebViewClient {
        private final WebViewClientFlutterApiImpl flutterApi;
        private boolean returnValueForShouldOverrideUrlLoading = false;

        public WebViewClientImpl(WebViewClientFlutterApiImpl webViewClientFlutterApiImpl) {
            this.flutterApi = webViewClientFlutterApiImpl;
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ void lambda$doUpdateVisitedHistory$6(Void voidR) {
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ void lambda$onPageFinished$1(Void voidR) {
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ void lambda$onPageStarted$0(Void voidR) {
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ void lambda$onReceivedError$2(Void voidR) {
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ void lambda$onReceivedError$3(Void voidR) {
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ void lambda$shouldOverrideUrlLoading$4(Void voidR) {
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ void lambda$shouldOverrideUrlLoading$5(Void voidR) {
        }

        public void doUpdateVisitedHistory(WebView webView, String str, boolean z10) {
            this.flutterApi.doUpdateVisitedHistory(this, webView, str, z10, w3.f15349a);
        }

        public void onPageFinished(WebView webView, String str) {
            this.flutterApi.onPageFinished(this, webView, str, r3.f15325a);
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            this.flutterApi.onPageStarted(this, webView, str, q3.f15321a);
        }

        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            this.flutterApi.onReceivedRequestError((WebViewClient) this, webView, webResourceRequest, webResourceError, (GeneratedAndroidWebView.WebViewClientFlutterApi.Reply<Void>) t3.f15334a);
        }

        public void onUnhandledKeyEvent(WebView webView, KeyEvent keyEvent) {
        }

        public void setReturnValueForShouldOverrideUrlLoading(boolean z10) {
            this.returnValueForShouldOverrideUrlLoading = z10;
        }

        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            this.flutterApi.requestLoading(this, webView, webResourceRequest, s3.f15329a);
            return this.returnValueForShouldOverrideUrlLoading;
        }

        public void onReceivedError(WebView webView, int i10, String str, String str2) {
            this.flutterApi.onReceivedError(this, webView, Long.valueOf((long) i10), str, str2, u3.f15339a);
        }

        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            this.flutterApi.urlLoading(this, webView, str, v3.f15343a);
            return this.returnValueForShouldOverrideUrlLoading;
        }
    }

    public WebViewClientHostApiImpl(InstanceManager instanceManager2, WebViewClientCreator webViewClientCreator2, WebViewClientFlutterApiImpl webViewClientFlutterApiImpl) {
        this.instanceManager = instanceManager2;
        this.webViewClientCreator = webViewClientCreator2;
        this.flutterApi = webViewClientFlutterApiImpl;
    }

    public void create(Long l10) {
        this.instanceManager.addDartCreatedInstance(this.webViewClientCreator.createWebViewClient(this.flutterApi), l10.longValue());
    }

    public void setSynchronousReturnValueForShouldOverrideUrlLoading(Long l10, Boolean bool) {
        WebViewClient webViewClient = (WebViewClient) this.instanceManager.getInstance(l10.longValue());
        Objects.requireNonNull(webViewClient);
        WebViewClient webViewClient2 = webViewClient;
        if (webViewClient instanceof WebViewClientCompatImpl) {
            ((WebViewClientCompatImpl) webViewClient).setReturnValueForShouldOverrideUrlLoading(bool.booleanValue());
        } else if (Build.VERSION.SDK_INT < 24 || !(webViewClient instanceof WebViewClientImpl)) {
            throw new IllegalStateException("This WebViewClient doesn't support setting the returnValueForShouldOverrideUrlLoading.");
        } else {
            ((WebViewClientImpl) webViewClient).setReturnValueForShouldOverrideUrlLoading(bool.booleanValue());
        }
    }
}
