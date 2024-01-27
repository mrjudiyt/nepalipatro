package io.flutter.plugins.webviewflutter;

import android.webkit.GeolocationPermissions;
import android.webkit.PermissionRequest;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugins.webviewflutter.GeneratedAndroidWebView;
import java.util.List;
import java.util.Objects;

public class WebChromeClientFlutterApiImpl extends GeneratedAndroidWebView.WebChromeClientFlutterApi {
    private final BinaryMessenger binaryMessenger;
    private final InstanceManager instanceManager;
    private final WebViewFlutterApiImpl webViewFlutterApi;

    public WebChromeClientFlutterApiImpl(BinaryMessenger binaryMessenger2, InstanceManager instanceManager2) {
        super(binaryMessenger2);
        this.binaryMessenger = binaryMessenger2;
        this.instanceManager = instanceManager2;
        this.webViewFlutterApi = new WebViewFlutterApiImpl(binaryMessenger2, instanceManager2);
    }

    private long getIdentifierForClient(WebChromeClient webChromeClient) {
        Long identifierForStrongReference = this.instanceManager.getIdentifierForStrongReference(webChromeClient);
        if (identifierForStrongReference != null) {
            return identifierForStrongReference.longValue();
        }
        throw new IllegalStateException("Could not find identifier for WebChromeClient.");
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$onGeolocationPermissionsShowPrompt$3(Void voidR) {
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$onPermissionRequest$4(Void voidR) {
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$onProgressChanged$0(Void voidR) {
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$onShowFileChooser$1(Void voidR) {
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$onShowFileChooser$2(Void voidR) {
    }

    public void onGeolocationPermissionsHidePrompt(WebChromeClient webChromeClient, GeneratedAndroidWebView.WebChromeClientFlutterApi.Reply<Void> reply) {
        Long identifierForStrongReference = this.instanceManager.getIdentifierForStrongReference(webChromeClient);
        Objects.requireNonNull(identifierForStrongReference);
        super.onGeolocationPermissionsHidePrompt(identifierForStrongReference, reply);
    }

    public void onGeolocationPermissionsShowPrompt(WebChromeClient webChromeClient, String str, GeolocationPermissions.Callback callback, GeneratedAndroidWebView.WebChromeClientFlutterApi.Reply<Void> reply) {
        new GeolocationPermissionsCallbackFlutterApiImpl(this.binaryMessenger, this.instanceManager).create(callback, s2.f15328a);
        Long identifierForStrongReference = this.instanceManager.getIdentifierForStrongReference(webChromeClient);
        Objects.requireNonNull(identifierForStrongReference);
        Long identifierForStrongReference2 = this.instanceManager.getIdentifierForStrongReference(callback);
        Objects.requireNonNull(identifierForStrongReference2);
        onGeolocationPermissionsShowPrompt(identifierForStrongReference, identifierForStrongReference2, str, reply);
    }

    public void onPermissionRequest(WebChromeClient webChromeClient, PermissionRequest permissionRequest, GeneratedAndroidWebView.WebChromeClientFlutterApi.Reply<Void> reply) {
        new PermissionRequestFlutterApiImpl(this.binaryMessenger, this.instanceManager).create(permissionRequest, permissionRequest.getResources(), t2.f15333a);
        Long identifierForStrongReference = this.instanceManager.getIdentifierForStrongReference(webChromeClient);
        Objects.requireNonNull(identifierForStrongReference);
        Long identifierForStrongReference2 = this.instanceManager.getIdentifierForStrongReference(permissionRequest);
        Objects.requireNonNull(identifierForStrongReference2);
        super.onPermissionRequest(identifierForStrongReference, identifierForStrongReference2, reply);
    }

    public void onProgressChanged(WebChromeClient webChromeClient, WebView webView, Long l10, GeneratedAndroidWebView.WebChromeClientFlutterApi.Reply<Void> reply) {
        this.webViewFlutterApi.create(webView, v2.f15342a);
        Long identifierForStrongReference = this.instanceManager.getIdentifierForStrongReference(webView);
        Objects.requireNonNull(identifierForStrongReference);
        super.onProgressChanged(Long.valueOf(getIdentifierForClient(webChromeClient)), identifierForStrongReference, l10, reply);
    }

    public void onShowFileChooser(WebChromeClient webChromeClient, WebView webView, WebChromeClient.FileChooserParams fileChooserParams, GeneratedAndroidWebView.WebChromeClientFlutterApi.Reply<List<String>> reply) {
        this.webViewFlutterApi.create(webView, u2.f15338a);
        new FileChooserParamsFlutterApiImpl(this.binaryMessenger, this.instanceManager).create(fileChooserParams, r2.f15324a);
        Long identifierForStrongReference = this.instanceManager.getIdentifierForStrongReference(webChromeClient);
        Objects.requireNonNull(identifierForStrongReference);
        Long identifierForStrongReference2 = this.instanceManager.getIdentifierForStrongReference(webView);
        Objects.requireNonNull(identifierForStrongReference2);
        Long identifierForStrongReference3 = this.instanceManager.getIdentifierForStrongReference(fileChooserParams);
        Objects.requireNonNull(identifierForStrongReference3);
        onShowFileChooser(identifierForStrongReference, identifierForStrongReference2, identifierForStrongReference3, reply);
    }
}
