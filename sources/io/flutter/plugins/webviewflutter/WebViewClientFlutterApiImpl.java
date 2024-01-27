package io.flutter.plugins.webviewflutter;

import android.annotation.SuppressLint;
import android.os.Build;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugins.webviewflutter.GeneratedAndroidWebView;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import k1.e;

public class WebViewClientFlutterApiImpl extends GeneratedAndroidWebView.WebViewClientFlutterApi {
    private final BinaryMessenger binaryMessenger;
    private final InstanceManager instanceManager;
    private final WebViewFlutterApiImpl webViewFlutterApi;

    public WebViewClientFlutterApiImpl(BinaryMessenger binaryMessenger2, InstanceManager instanceManager2) {
        super(binaryMessenger2);
        this.binaryMessenger = binaryMessenger2;
        this.instanceManager = instanceManager2;
        this.webViewFlutterApi = new WebViewFlutterApiImpl(binaryMessenger2, instanceManager2);
    }

    static GeneratedAndroidWebView.WebResourceErrorData createWebResourceErrorData(WebResourceError webResourceError) {
        return new GeneratedAndroidWebView.WebResourceErrorData.Builder().setErrorCode(Long.valueOf((long) webResourceError.getErrorCode())).setDescription(webResourceError.getDescription().toString()).build();
    }

    static GeneratedAndroidWebView.WebResourceRequestData createWebResourceRequestData(WebResourceRequest webResourceRequest) {
        Map map;
        GeneratedAndroidWebView.WebResourceRequestData.Builder method = new GeneratedAndroidWebView.WebResourceRequestData.Builder().setUrl(webResourceRequest.getUrl().toString()).setIsForMainFrame(Boolean.valueOf(webResourceRequest.isForMainFrame())).setHasGesture(Boolean.valueOf(webResourceRequest.hasGesture())).setMethod(webResourceRequest.getMethod());
        if (webResourceRequest.getRequestHeaders() != null) {
            map = webResourceRequest.getRequestHeaders();
        } else {
            map = new HashMap();
        }
        GeneratedAndroidWebView.WebResourceRequestData.Builder requestHeaders = method.setRequestHeaders(map);
        if (Build.VERSION.SDK_INT >= 24) {
            requestHeaders.setIsRedirect(Boolean.valueOf(webResourceRequest.isRedirect()));
        }
        return requestHeaders.build();
    }

    private long getIdentifierForClient(WebViewClient webViewClient) {
        Long identifierForStrongReference = this.instanceManager.getIdentifierForStrongReference(webViewClient);
        if (identifierForStrongReference != null) {
            return identifierForStrongReference.longValue();
        }
        throw new IllegalStateException("Could not find identifier for WebViewClient.");
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$doUpdateVisitedHistory$7(Void voidR) {
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$onPageFinished$1(Void voidR) {
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$onPageStarted$0(Void voidR) {
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$onReceivedError$4(Void voidR) {
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$onReceivedRequestError$2(Void voidR) {
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$onReceivedRequestError$3(Void voidR) {
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$requestLoading$5(Void voidR) {
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$urlLoading$6(Void voidR) {
    }

    public void doUpdateVisitedHistory(WebViewClient webViewClient, WebView webView, String str, boolean z10, GeneratedAndroidWebView.WebViewClientFlutterApi.Reply<Void> reply) {
        this.webViewFlutterApi.create(webView, g3.f15275a);
        Long identifierForStrongReference = this.instanceManager.getIdentifierForStrongReference(webView);
        Objects.requireNonNull(identifierForStrongReference);
        doUpdateVisitedHistory(Long.valueOf(getIdentifierForClient(webViewClient)), identifierForStrongReference, str, Boolean.valueOf(z10), reply);
    }

    public void onPageFinished(WebViewClient webViewClient, WebView webView, String str, GeneratedAndroidWebView.WebViewClientFlutterApi.Reply<Void> reply) {
        this.webViewFlutterApi.create(webView, e3.f15265a);
        Long identifierForStrongReference = this.instanceManager.getIdentifierForStrongReference(webView);
        Objects.requireNonNull(identifierForStrongReference);
        onPageFinished(Long.valueOf(getIdentifierForClient(webViewClient)), identifierForStrongReference, str, reply);
    }

    public void onPageStarted(WebViewClient webViewClient, WebView webView, String str, GeneratedAndroidWebView.WebViewClientFlutterApi.Reply<Void> reply) {
        this.webViewFlutterApi.create(webView, c3.f15255a);
        Long identifierForStrongReference = this.instanceManager.getIdentifierForStrongReference(webView);
        Objects.requireNonNull(identifierForStrongReference);
        onPageStarted(Long.valueOf(getIdentifierForClient(webViewClient)), identifierForStrongReference, str, reply);
    }

    public void onReceivedError(WebViewClient webViewClient, WebView webView, Long l10, String str, String str2, GeneratedAndroidWebView.WebViewClientFlutterApi.Reply<Void> reply) {
        this.webViewFlutterApi.create(webView, h3.f15280a);
        Long identifierForStrongReference = this.instanceManager.getIdentifierForStrongReference(webView);
        Objects.requireNonNull(identifierForStrongReference);
        onReceivedError(Long.valueOf(getIdentifierForClient(webViewClient)), identifierForStrongReference, l10, str, str2, reply);
    }

    public void onReceivedRequestError(WebViewClient webViewClient, WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError, GeneratedAndroidWebView.WebViewClientFlutterApi.Reply<Void> reply) {
        this.webViewFlutterApi.create(webView, i3.f15284a);
        Long identifierForStrongReference = this.instanceManager.getIdentifierForStrongReference(webView);
        Objects.requireNonNull(identifierForStrongReference);
        onReceivedRequestError(Long.valueOf(getIdentifierForClient(webViewClient)), identifierForStrongReference, createWebResourceRequestData(webResourceRequest), createWebResourceErrorData(webResourceError), reply);
    }

    public void requestLoading(WebViewClient webViewClient, WebView webView, WebResourceRequest webResourceRequest, GeneratedAndroidWebView.WebViewClientFlutterApi.Reply<Void> reply) {
        this.webViewFlutterApi.create(webView, d3.f15260a);
        Long identifierForStrongReference = this.instanceManager.getIdentifierForStrongReference(webView);
        Objects.requireNonNull(identifierForStrongReference);
        requestLoading(Long.valueOf(getIdentifierForClient(webViewClient)), identifierForStrongReference, createWebResourceRequestData(webResourceRequest), reply);
    }

    public void urlLoading(WebViewClient webViewClient, WebView webView, String str, GeneratedAndroidWebView.WebViewClientFlutterApi.Reply<Void> reply) {
        this.webViewFlutterApi.create(webView, b3.f15251a);
        Long identifierForStrongReference = this.instanceManager.getIdentifierForStrongReference(webView);
        Objects.requireNonNull(identifierForStrongReference);
        urlLoading(Long.valueOf(getIdentifierForClient(webViewClient)), identifierForStrongReference, str, reply);
    }

    @SuppressLint({"RequiresFeature"})
    static GeneratedAndroidWebView.WebResourceErrorData createWebResourceErrorData(e eVar) {
        return new GeneratedAndroidWebView.WebResourceErrorData.Builder().setErrorCode(Long.valueOf((long) eVar.b())).setDescription(eVar.a().toString()).build();
    }

    public void onReceivedRequestError(WebViewClient webViewClient, WebView webView, WebResourceRequest webResourceRequest, e eVar, GeneratedAndroidWebView.WebViewClientFlutterApi.Reply<Void> reply) {
        this.webViewFlutterApi.create(webView, f3.f15270a);
        Long identifierForStrongReference = this.instanceManager.getIdentifierForStrongReference(webView);
        Objects.requireNonNull(identifierForStrongReference);
        onReceivedRequestError(Long.valueOf(getIdentifierForClient(webViewClient)), identifierForStrongReference, createWebResourceRequestData(webResourceRequest), createWebResourceErrorData(eVar), reply);
    }
}
