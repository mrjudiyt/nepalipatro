package io.flutter.plugins.webviewflutter;

import android.webkit.GeolocationPermissions;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugins.webviewflutter.GeneratedAndroidWebView;

public class GeolocationPermissionsCallbackFlutterApiImpl {
    private GeneratedAndroidWebView.GeolocationPermissionsCallbackFlutterApi api;
    private final BinaryMessenger binaryMessenger;
    private final InstanceManager instanceManager;

    public GeolocationPermissionsCallbackFlutterApiImpl(BinaryMessenger binaryMessenger2, InstanceManager instanceManager2) {
        this.binaryMessenger = binaryMessenger2;
        this.instanceManager = instanceManager2;
        this.api = new GeneratedAndroidWebView.GeolocationPermissionsCallbackFlutterApi(binaryMessenger2);
    }

    public void create(GeolocationPermissions.Callback callback, GeneratedAndroidWebView.GeolocationPermissionsCallbackFlutterApi.Reply<Void> reply) {
        if (!this.instanceManager.containsInstance(callback)) {
            this.api.create(Long.valueOf(this.instanceManager.addHostCreatedInstance(callback)), reply);
        }
    }

    /* access modifiers changed from: package-private */
    public void setApi(GeneratedAndroidWebView.GeolocationPermissionsCallbackFlutterApi geolocationPermissionsCallbackFlutterApi) {
        this.api = geolocationPermissionsCallbackFlutterApi;
    }
}
