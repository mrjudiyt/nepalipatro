package io.flutter.plugins.webviewflutter;

import io.flutter.plugins.webviewflutter.GeneratedAndroidWebView;
import io.flutter.plugins.webviewflutter.WebViewHostApiImpl;

public class JavaObjectHostApiImpl implements GeneratedAndroidWebView.JavaObjectHostApi {
    private final InstanceManager instanceManager;

    public JavaObjectHostApiImpl(InstanceManager instanceManager2) {
        this.instanceManager = instanceManager2;
    }

    public void dispose(Long l10) {
        Object instance = this.instanceManager.getInstance(l10.longValue());
        if (instance instanceof WebViewHostApiImpl.WebViewPlatformView) {
            ((WebViewHostApiImpl.WebViewPlatformView) instance).destroy();
        }
        this.instanceManager.remove(l10.longValue());
    }
}
