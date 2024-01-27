package io.flutter.plugins.webviewflutter;

import android.os.Build;
import android.webkit.CookieManager;
import android.webkit.WebView;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugins.webviewflutter.GeneratedAndroidWebView;
import java.util.Objects;

public class CookieManagerHostApiImpl implements GeneratedAndroidWebView.CookieManagerHostApi {
    private final BinaryMessenger binaryMessenger;
    private final InstanceManager instanceManager;
    private final CookieManagerProxy proxy;

    static class CookieManagerProxy {
        CookieManagerProxy() {
        }

        public CookieManager getInstance() {
            return CookieManager.getInstance();
        }
    }

    public CookieManagerHostApiImpl(BinaryMessenger binaryMessenger2, InstanceManager instanceManager2) {
        this(binaryMessenger2, instanceManager2, new CookieManagerProxy());
    }

    private CookieManager getCookieManagerInstance(Long l10) {
        CookieManager cookieManager = (CookieManager) this.instanceManager.getInstance(l10.longValue());
        Objects.requireNonNull(cookieManager);
        CookieManager cookieManager2 = cookieManager;
        return cookieManager;
    }

    private boolean removeCookiesPreL(CookieManager cookieManager) {
        boolean hasCookies = cookieManager.hasCookies();
        if (hasCookies) {
            cookieManager.removeAllCookie();
        }
        return hasCookies;
    }

    public void attachInstance(Long l10) {
        this.instanceManager.addDartCreatedInstance(this.proxy.getInstance(), l10.longValue());
    }

    public void removeAllCookies(Long l10, GeneratedAndroidWebView.Result<Boolean> result) {
        if (Build.VERSION.SDK_INT >= 21) {
            CookieManager cookieManagerInstance = getCookieManagerInstance(l10);
            Objects.requireNonNull(result);
            cookieManagerInstance.removeAllCookies(new a(result));
            return;
        }
        result.success(Boolean.valueOf(removeCookiesPreL(getCookieManagerInstance(l10))));
    }

    public void setAcceptThirdPartyCookies(Long l10, Long l11, Boolean bool) {
        if (Build.VERSION.SDK_INT >= 21) {
            CookieManager cookieManagerInstance = getCookieManagerInstance(l10);
            WebView webView = (WebView) this.instanceManager.getInstance(l11.longValue());
            Objects.requireNonNull(webView);
            WebView webView2 = webView;
            cookieManagerInstance.setAcceptThirdPartyCookies(webView, bool.booleanValue());
            return;
        }
        throw new UnsupportedOperationException("`setAcceptThirdPartyCookies` is unsupported on versions below `Build.VERSION_CODES.LOLLIPOP`.");
    }

    public void setCookie(Long l10, String str, String str2) {
        getCookieManagerInstance(l10).setCookie(str, str2);
    }

    public CookieManagerHostApiImpl(BinaryMessenger binaryMessenger2, InstanceManager instanceManager2, CookieManagerProxy cookieManagerProxy) {
        this.binaryMessenger = binaryMessenger2;
        this.instanceManager = instanceManager2;
        this.proxy = cookieManagerProxy;
    }
}
