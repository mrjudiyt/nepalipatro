package io.flutter.plugins.webviewflutter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import android.webkit.DownloadListener;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import io.flutter.embedding.android.FlutterView;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.platform.PlatformView;
import io.flutter.plugin.platform.c;
import io.flutter.plugins.webviewflutter.GeneratedAndroidWebView;
import io.flutter.plugins.webviewflutter.WebChromeClientHostApiImpl;
import java.util.Map;
import java.util.Objects;

public class WebViewHostApiImpl implements GeneratedAndroidWebView.WebViewHostApi {
    private final BinaryMessenger binaryMessenger;
    private Context context;
    private final InstanceManager instanceManager;
    private final WebViewProxy webViewProxy;

    @SuppressLint({"ViewConstructor"})
    public static class WebViewPlatformView extends WebView implements PlatformView {
        private WebViewFlutterApiImpl api;
        private WebChromeClientHostApiImpl.SecureWebChromeClient currentWebChromeClient = new WebChromeClientHostApiImpl.SecureWebChromeClient();
        private WebViewClient currentWebViewClient = new WebViewClient();

        public WebViewPlatformView(Context context, BinaryMessenger binaryMessenger, InstanceManager instanceManager) {
            super(context);
            this.api = new WebViewFlutterApiImpl(binaryMessenger, instanceManager);
            setWebViewClient(this.currentWebViewClient);
            setWebChromeClient(this.currentWebChromeClient);
        }

        private FlutterView tryFindFlutterView() {
            ViewParent viewParent = this;
            while (viewParent.getParent() != null) {
                viewParent = viewParent.getParent();
                if (viewParent instanceof FlutterView) {
                    return (FlutterView) viewParent;
                }
            }
            return null;
        }

        public void dispose() {
        }

        public View getView() {
            return this;
        }

        public WebChromeClient getWebChromeClient() {
            return this.currentWebChromeClient;
        }

        /* access modifiers changed from: protected */
        public void onAttachedToWindow() {
            FlutterView tryFindFlutterView;
            super.onAttachedToWindow();
            if (Build.VERSION.SDK_INT >= 26 && (tryFindFlutterView = tryFindFlutterView()) != null) {
                tryFindFlutterView.setImportantForAutofill(1);
            }
        }

        public /* synthetic */ void onFlutterViewAttached(View view) {
            c.a(this, view);
        }

        public /* synthetic */ void onFlutterViewDetached() {
            c.b(this);
        }

        public /* synthetic */ void onInputConnectionLocked() {
            c.c(this);
        }

        public /* synthetic */ void onInputConnectionUnlocked() {
            c.d(this);
        }

        /* access modifiers changed from: package-private */
        public void setApi(WebViewFlutterApiImpl webViewFlutterApiImpl) {
            this.api = webViewFlutterApiImpl;
        }

        public void setWebChromeClient(WebChromeClient webChromeClient) {
            super.setWebChromeClient(webChromeClient);
            if (webChromeClient instanceof WebChromeClientHostApiImpl.SecureWebChromeClient) {
                WebChromeClientHostApiImpl.SecureWebChromeClient secureWebChromeClient = (WebChromeClientHostApiImpl.SecureWebChromeClient) webChromeClient;
                this.currentWebChromeClient = secureWebChromeClient;
                secureWebChromeClient.setWebViewClient(this.currentWebViewClient);
                return;
            }
            throw new AssertionError("Client must be a SecureWebChromeClient.");
        }

        public void setWebViewClient(WebViewClient webViewClient) {
            super.setWebViewClient(webViewClient);
            this.currentWebViewClient = webViewClient;
            this.currentWebChromeClient.setWebViewClient(webViewClient);
        }
    }

    public static class WebViewProxy {
        public WebViewPlatformView createWebView(Context context, BinaryMessenger binaryMessenger, InstanceManager instanceManager) {
            return new WebViewPlatformView(context, binaryMessenger, instanceManager);
        }

        public void setWebContentsDebuggingEnabled(boolean z10) {
            WebView.setWebContentsDebuggingEnabled(z10);
        }
    }

    public WebViewHostApiImpl(InstanceManager instanceManager2, BinaryMessenger binaryMessenger2, WebViewProxy webViewProxy2, Context context2) {
        this.instanceManager = instanceManager2;
        this.binaryMessenger = binaryMessenger2;
        this.webViewProxy = webViewProxy2;
        this.context = context2;
    }

    @SuppressLint({"JavascriptInterface"})
    public void addJavaScriptChannel(Long l10, Long l11) {
        WebView webView = (WebView) this.instanceManager.getInstance(l10.longValue());
        Objects.requireNonNull(webView);
        WebView webView2 = webView;
        JavaScriptChannel javaScriptChannel = (JavaScriptChannel) this.instanceManager.getInstance(l11.longValue());
        Objects.requireNonNull(javaScriptChannel);
        webView.addJavascriptInterface(javaScriptChannel, javaScriptChannel.javaScriptChannelName);
    }

    public Boolean canGoBack(Long l10) {
        WebView webView = (WebView) this.instanceManager.getInstance(l10.longValue());
        Objects.requireNonNull(webView);
        WebView webView2 = webView;
        return Boolean.valueOf(webView.canGoBack());
    }

    public Boolean canGoForward(Long l10) {
        WebView webView = (WebView) this.instanceManager.getInstance(l10.longValue());
        Objects.requireNonNull(webView);
        WebView webView2 = webView;
        return Boolean.valueOf(webView.canGoForward());
    }

    public void clearCache(Long l10, Boolean bool) {
        WebView webView = (WebView) this.instanceManager.getInstance(l10.longValue());
        Objects.requireNonNull(webView);
        WebView webView2 = webView;
        webView.clearCache(bool.booleanValue());
    }

    public void create(Long l10) {
        DisplayListenerProxy displayListenerProxy = new DisplayListenerProxy();
        DisplayManager displayManager = (DisplayManager) this.context.getSystemService("display");
        displayListenerProxy.onPreWebViewInitialization(displayManager);
        WebViewPlatformView createWebView = this.webViewProxy.createWebView(this.context, this.binaryMessenger, this.instanceManager);
        displayListenerProxy.onPostWebViewInitialization(displayManager);
        this.instanceManager.addDartCreatedInstance(createWebView, l10.longValue());
    }

    public void evaluateJavascript(Long l10, String str, GeneratedAndroidWebView.Result<String> result) {
        WebView webView = (WebView) this.instanceManager.getInstance(l10.longValue());
        Objects.requireNonNull(webView);
        WebView webView2 = webView;
        Objects.requireNonNull(result);
        webView.evaluateJavascript(str, new b4(result));
    }

    public InstanceManager getInstanceManager() {
        return this.instanceManager;
    }

    public GeneratedAndroidWebView.WebViewPoint getScrollPosition(Long l10) {
        WebView webView = (WebView) this.instanceManager.getInstance(l10.longValue());
        Objects.requireNonNull(webView);
        WebView webView2 = webView;
        return new GeneratedAndroidWebView.WebViewPoint.Builder().setX(Long.valueOf((long) webView.getScrollX())).setY(Long.valueOf((long) webView.getScrollY())).build();
    }

    public Long getScrollX(Long l10) {
        WebView webView = (WebView) this.instanceManager.getInstance(l10.longValue());
        Objects.requireNonNull(webView);
        WebView webView2 = webView;
        return Long.valueOf((long) webView.getScrollX());
    }

    public Long getScrollY(Long l10) {
        WebView webView = (WebView) this.instanceManager.getInstance(l10.longValue());
        Objects.requireNonNull(webView);
        WebView webView2 = webView;
        return Long.valueOf((long) webView.getScrollY());
    }

    public String getTitle(Long l10) {
        WebView webView = (WebView) this.instanceManager.getInstance(l10.longValue());
        Objects.requireNonNull(webView);
        WebView webView2 = webView;
        return webView.getTitle();
    }

    public String getUrl(Long l10) {
        WebView webView = (WebView) this.instanceManager.getInstance(l10.longValue());
        Objects.requireNonNull(webView);
        WebView webView2 = webView;
        return webView.getUrl();
    }

    public void goBack(Long l10) {
        WebView webView = (WebView) this.instanceManager.getInstance(l10.longValue());
        Objects.requireNonNull(webView);
        WebView webView2 = webView;
        webView.goBack();
    }

    public void goForward(Long l10) {
        WebView webView = (WebView) this.instanceManager.getInstance(l10.longValue());
        Objects.requireNonNull(webView);
        WebView webView2 = webView;
        webView.goForward();
    }

    public void loadData(Long l10, String str, String str2, String str3) {
        WebView webView = (WebView) this.instanceManager.getInstance(l10.longValue());
        Objects.requireNonNull(webView);
        WebView webView2 = webView;
        webView.loadData(str, str2, str3);
    }

    public void loadDataWithBaseUrl(Long l10, String str, String str2, String str3, String str4, String str5) {
        WebView webView = (WebView) this.instanceManager.getInstance(l10.longValue());
        Objects.requireNonNull(webView);
        WebView webView2 = webView;
        webView.loadDataWithBaseURL(str, str2, str3, str4, str5);
    }

    public void loadUrl(Long l10, String str, Map<String, String> map) {
        WebView webView = (WebView) this.instanceManager.getInstance(l10.longValue());
        Objects.requireNonNull(webView);
        WebView webView2 = webView;
        webView.loadUrl(str, map);
    }

    public void postUrl(Long l10, String str, byte[] bArr) {
        WebView webView = (WebView) this.instanceManager.getInstance(l10.longValue());
        Objects.requireNonNull(webView);
        WebView webView2 = webView;
        webView.postUrl(str, bArr);
    }

    public void reload(Long l10) {
        WebView webView = (WebView) this.instanceManager.getInstance(l10.longValue());
        Objects.requireNonNull(webView);
        WebView webView2 = webView;
        webView.reload();
    }

    public void removeJavaScriptChannel(Long l10, Long l11) {
        WebView webView = (WebView) this.instanceManager.getInstance(l10.longValue());
        Objects.requireNonNull(webView);
        WebView webView2 = webView;
        JavaScriptChannel javaScriptChannel = (JavaScriptChannel) this.instanceManager.getInstance(l11.longValue());
        Objects.requireNonNull(javaScriptChannel);
        webView.removeJavascriptInterface(javaScriptChannel.javaScriptChannelName);
    }

    public void scrollBy(Long l10, Long l11, Long l12) {
        WebView webView = (WebView) this.instanceManager.getInstance(l10.longValue());
        Objects.requireNonNull(webView);
        WebView webView2 = webView;
        webView.scrollBy(l11.intValue(), l12.intValue());
    }

    public void scrollTo(Long l10, Long l11, Long l12) {
        WebView webView = (WebView) this.instanceManager.getInstance(l10.longValue());
        Objects.requireNonNull(webView);
        WebView webView2 = webView;
        webView.scrollTo(l11.intValue(), l12.intValue());
    }

    public void setBackgroundColor(Long l10, Long l11) {
        WebView webView = (WebView) this.instanceManager.getInstance(l10.longValue());
        Objects.requireNonNull(webView);
        WebView webView2 = webView;
        webView.setBackgroundColor(l11.intValue());
    }

    public void setContext(Context context2) {
        this.context = context2;
    }

    public void setDownloadListener(Long l10, Long l11) {
        WebView webView = (WebView) this.instanceManager.getInstance(l10.longValue());
        Objects.requireNonNull(webView);
        WebView webView2 = webView;
        InstanceManager instanceManager2 = this.instanceManager;
        Objects.requireNonNull(l11);
        webView.setDownloadListener((DownloadListener) instanceManager2.getInstance(l11.longValue()));
    }

    public void setWebChromeClient(Long l10, Long l11) {
        WebView webView = (WebView) this.instanceManager.getInstance(l10.longValue());
        Objects.requireNonNull(webView);
        WebView webView2 = webView;
        InstanceManager instanceManager2 = this.instanceManager;
        Objects.requireNonNull(l11);
        webView.setWebChromeClient((WebChromeClient) instanceManager2.getInstance(l11.longValue()));
    }

    public void setWebContentsDebuggingEnabled(Boolean bool) {
        this.webViewProxy.setWebContentsDebuggingEnabled(bool.booleanValue());
    }

    public void setWebViewClient(Long l10, Long l11) {
        WebView webView = (WebView) this.instanceManager.getInstance(l10.longValue());
        Objects.requireNonNull(webView);
        WebView webView2 = webView;
        webView.setWebViewClient((WebViewClient) this.instanceManager.getInstance(l11.longValue()));
    }
}
