package io.flutter.plugins.webviewflutter;

import android.webkit.WebView;
import io.flutter.embedding.engine.FlutterEngine;

/* compiled from: WebViewFlutterAndroidExternalApi */
public final /* synthetic */ class x3 {
    public static WebView a(FlutterEngine flutterEngine, long j10) {
        WebViewFlutterPlugin webViewFlutterPlugin = (WebViewFlutterPlugin) flutterEngine.getPlugins().get(WebViewFlutterPlugin.class);
        if (webViewFlutterPlugin == null || webViewFlutterPlugin.getInstanceManager() == null) {
            return null;
        }
        Object instance = webViewFlutterPlugin.getInstanceManager().getInstance(j10);
        if (instance instanceof WebView) {
            return (WebView) instance;
        }
        return null;
    }
}
