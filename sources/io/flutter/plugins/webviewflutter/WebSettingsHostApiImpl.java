package io.flutter.plugins.webviewflutter;

import android.webkit.WebSettings;
import android.webkit.WebView;
import io.flutter.plugins.webviewflutter.GeneratedAndroidWebView;
import java.util.Objects;

public class WebSettingsHostApiImpl implements GeneratedAndroidWebView.WebSettingsHostApi {
    private final InstanceManager instanceManager;
    private final WebSettingsCreator webSettingsCreator;

    public static class WebSettingsCreator {
        public WebSettings createWebSettings(WebView webView) {
            return webView.getSettings();
        }
    }

    public WebSettingsHostApiImpl(InstanceManager instanceManager2, WebSettingsCreator webSettingsCreator2) {
        this.instanceManager = instanceManager2;
        this.webSettingsCreator = webSettingsCreator2;
    }

    public void create(Long l10, Long l11) {
        WebView webView = (WebView) this.instanceManager.getInstance(l11.longValue());
        Objects.requireNonNull(webView);
        WebView webView2 = webView;
        this.instanceManager.addDartCreatedInstance(this.webSettingsCreator.createWebSettings(webView), l10.longValue());
    }

    public void setAllowFileAccess(Long l10, Boolean bool) {
        WebSettings webSettings = (WebSettings) this.instanceManager.getInstance(l10.longValue());
        Objects.requireNonNull(webSettings);
        WebSettings webSettings2 = webSettings;
        webSettings.setAllowFileAccess(bool.booleanValue());
    }

    public void setBuiltInZoomControls(Long l10, Boolean bool) {
        WebSettings webSettings = (WebSettings) this.instanceManager.getInstance(l10.longValue());
        Objects.requireNonNull(webSettings);
        WebSettings webSettings2 = webSettings;
        webSettings.setBuiltInZoomControls(bool.booleanValue());
    }

    public void setDisplayZoomControls(Long l10, Boolean bool) {
        WebSettings webSettings = (WebSettings) this.instanceManager.getInstance(l10.longValue());
        Objects.requireNonNull(webSettings);
        WebSettings webSettings2 = webSettings;
        webSettings.setDisplayZoomControls(bool.booleanValue());
    }

    public void setDomStorageEnabled(Long l10, Boolean bool) {
        WebSettings webSettings = (WebSettings) this.instanceManager.getInstance(l10.longValue());
        Objects.requireNonNull(webSettings);
        WebSettings webSettings2 = webSettings;
        webSettings.setDomStorageEnabled(bool.booleanValue());
    }

    public void setJavaScriptCanOpenWindowsAutomatically(Long l10, Boolean bool) {
        WebSettings webSettings = (WebSettings) this.instanceManager.getInstance(l10.longValue());
        Objects.requireNonNull(webSettings);
        WebSettings webSettings2 = webSettings;
        webSettings.setJavaScriptCanOpenWindowsAutomatically(bool.booleanValue());
    }

    public void setJavaScriptEnabled(Long l10, Boolean bool) {
        WebSettings webSettings = (WebSettings) this.instanceManager.getInstance(l10.longValue());
        Objects.requireNonNull(webSettings);
        WebSettings webSettings2 = webSettings;
        webSettings.setJavaScriptEnabled(bool.booleanValue());
    }

    public void setLoadWithOverviewMode(Long l10, Boolean bool) {
        WebSettings webSettings = (WebSettings) this.instanceManager.getInstance(l10.longValue());
        Objects.requireNonNull(webSettings);
        WebSettings webSettings2 = webSettings;
        webSettings.setLoadWithOverviewMode(bool.booleanValue());
    }

    public void setMediaPlaybackRequiresUserGesture(Long l10, Boolean bool) {
        WebSettings webSettings = (WebSettings) this.instanceManager.getInstance(l10.longValue());
        Objects.requireNonNull(webSettings);
        WebSettings webSettings2 = webSettings;
        webSettings.setMediaPlaybackRequiresUserGesture(bool.booleanValue());
    }

    public void setSupportMultipleWindows(Long l10, Boolean bool) {
        WebSettings webSettings = (WebSettings) this.instanceManager.getInstance(l10.longValue());
        Objects.requireNonNull(webSettings);
        WebSettings webSettings2 = webSettings;
        webSettings.setSupportMultipleWindows(bool.booleanValue());
    }

    public void setSupportZoom(Long l10, Boolean bool) {
        WebSettings webSettings = (WebSettings) this.instanceManager.getInstance(l10.longValue());
        Objects.requireNonNull(webSettings);
        WebSettings webSettings2 = webSettings;
        webSettings.setSupportZoom(bool.booleanValue());
    }

    public void setTextZoom(Long l10, Long l11) {
        WebSettings webSettings = (WebSettings) this.instanceManager.getInstance(l10.longValue());
        Objects.requireNonNull(webSettings);
        WebSettings webSettings2 = webSettings;
        webSettings.setTextZoom(l11.intValue());
    }

    public void setUseWideViewPort(Long l10, Boolean bool) {
        WebSettings webSettings = (WebSettings) this.instanceManager.getInstance(l10.longValue());
        Objects.requireNonNull(webSettings);
        WebSettings webSettings2 = webSettings;
        webSettings.setUseWideViewPort(bool.booleanValue());
    }

    public void setUserAgentString(Long l10, String str) {
        WebSettings webSettings = (WebSettings) this.instanceManager.getInstance(l10.longValue());
        Objects.requireNonNull(webSettings);
        WebSettings webSettings2 = webSettings;
        webSettings.setUserAgentString(str);
    }
}
