package io.flutter.plugins.webviewflutter;

import android.net.Uri;
import android.os.Message;
import android.webkit.GeolocationPermissions;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import io.flutter.plugins.webviewflutter.GeneratedAndroidWebView;
import java.util.List;
import java.util.Objects;

public class WebChromeClientHostApiImpl implements GeneratedAndroidWebView.WebChromeClientHostApi {
    private final WebChromeClientFlutterApiImpl flutterApi;
    private final InstanceManager instanceManager;
    private final WebChromeClientCreator webChromeClientCreator;

    public static class SecureWebChromeClient extends WebChromeClient {
        WebViewClient webViewClient;

        public boolean onCreateWindow(WebView webView, boolean z10, boolean z11, Message message) {
            return onCreateWindow(webView, message, new WebView(webView.getContext()));
        }

        public void setWebViewClient(WebViewClient webViewClient2) {
            this.webViewClient = webViewClient2;
        }

        /* access modifiers changed from: package-private */
        public boolean onCreateWindow(final WebView webView, Message message, WebView webView2) {
            if (this.webViewClient == null) {
                return false;
            }
            AnonymousClass1 r02 = new WebViewClient() {
                public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
                    if (SecureWebChromeClient.this.webViewClient.shouldOverrideUrlLoading(webView, webResourceRequest)) {
                        return true;
                    }
                    webView.loadUrl(webResourceRequest.getUrl().toString());
                    return true;
                }

                public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                    if (SecureWebChromeClient.this.webViewClient.shouldOverrideUrlLoading(webView, str)) {
                        return true;
                    }
                    webView.loadUrl(str);
                    return true;
                }
            };
            if (webView2 == null) {
                webView2 = new WebView(webView.getContext());
            }
            webView2.setWebViewClient(r02);
            ((WebView.WebViewTransport) message.obj).setWebView(webView2);
            message.sendToTarget();
            return true;
        }
    }

    public static class WebChromeClientCreator {
        public WebChromeClientImpl createWebChromeClient(WebChromeClientFlutterApiImpl webChromeClientFlutterApiImpl) {
            return new WebChromeClientImpl(webChromeClientFlutterApiImpl);
        }
    }

    public static class WebChromeClientImpl extends SecureWebChromeClient {
        private final WebChromeClientFlutterApiImpl flutterApi;
        private boolean returnValueForOnShowFileChooser = false;

        public WebChromeClientImpl(WebChromeClientFlutterApiImpl webChromeClientFlutterApiImpl) {
            this.flutterApi = webChromeClientFlutterApiImpl;
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ void lambda$onGeolocationPermissionsHidePrompt$2(Void voidR) {
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ void lambda$onGeolocationPermissionsShowPrompt$1(Void voidR) {
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ void lambda$onPermissionRequest$4(Void voidR) {
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ void lambda$onProgressChanged$0(Void voidR) {
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ void lambda$onShowFileChooser$3(boolean z10, ValueCallback valueCallback, List list) {
            if (z10) {
                Uri[] uriArr = new Uri[list.size()];
                for (int i10 = 0; i10 < list.size(); i10++) {
                    uriArr[i10] = Uri.parse((String) list.get(i10));
                }
                valueCallback.onReceiveValue(uriArr);
            }
        }

        public void onGeolocationPermissionsHidePrompt() {
            this.flutterApi.onGeolocationPermissionsHidePrompt(this, y2.f15356a);
        }

        public void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
            this.flutterApi.onGeolocationPermissionsShowPrompt(this, str, callback, z2.f15360a);
        }

        public void onPermissionRequest(PermissionRequest permissionRequest) {
            this.flutterApi.onPermissionRequest(this, permissionRequest, a3.f15245a);
        }

        public void onProgressChanged(WebView webView, int i10) {
            this.flutterApi.onProgressChanged(this, webView, Long.valueOf((long) i10), x2.f15353a);
        }

        public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
            boolean z10 = this.returnValueForOnShowFileChooser;
            this.flutterApi.onShowFileChooser(this, webView, fileChooserParams, new w2(z10, valueCallback));
            return z10;
        }

        public void setReturnValueForOnShowFileChooser(boolean z10) {
            this.returnValueForOnShowFileChooser = z10;
        }
    }

    public WebChromeClientHostApiImpl(InstanceManager instanceManager2, WebChromeClientCreator webChromeClientCreator2, WebChromeClientFlutterApiImpl webChromeClientFlutterApiImpl) {
        this.instanceManager = instanceManager2;
        this.webChromeClientCreator = webChromeClientCreator2;
        this.flutterApi = webChromeClientFlutterApiImpl;
    }

    public void create(Long l10) {
        this.instanceManager.addDartCreatedInstance(this.webChromeClientCreator.createWebChromeClient(this.flutterApi), l10.longValue());
    }

    public void setSynchronousReturnValueForOnShowFileChooser(Long l10, Boolean bool) {
        WebChromeClientImpl webChromeClientImpl = (WebChromeClientImpl) this.instanceManager.getInstance(l10.longValue());
        Objects.requireNonNull(webChromeClientImpl);
        WebChromeClientImpl webChromeClientImpl2 = webChromeClientImpl;
        webChromeClientImpl.setReturnValueForOnShowFileChooser(bool.booleanValue());
    }
}
