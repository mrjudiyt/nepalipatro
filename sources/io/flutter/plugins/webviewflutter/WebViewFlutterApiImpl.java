package io.flutter.plugins.webviewflutter;

import android.webkit.WebView;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugins.webviewflutter.GeneratedAndroidWebView;

public class WebViewFlutterApiImpl {
    private GeneratedAndroidWebView.WebViewFlutterApi api;
    private final BinaryMessenger binaryMessenger;
    private final InstanceManager instanceManager;

    public WebViewFlutterApiImpl(BinaryMessenger binaryMessenger2, InstanceManager instanceManager2) {
        this.binaryMessenger = binaryMessenger2;
        this.instanceManager = instanceManager2;
        this.api = new GeneratedAndroidWebView.WebViewFlutterApi(binaryMessenger2);
    }

    public void create(WebView webView, GeneratedAndroidWebView.WebViewFlutterApi.Reply<Void> reply) {
        if (!this.instanceManager.containsInstance(webView)) {
            this.api.create(Long.valueOf(this.instanceManager.addHostCreatedInstance(webView)), reply);
        }
    }

    /* access modifiers changed from: package-private */
    public void setApi(GeneratedAndroidWebView.WebViewFlutterApi webViewFlutterApi) {
        this.api = webViewFlutterApi;
    }
}
