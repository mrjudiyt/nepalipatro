package io.flutter.plugins.webviewflutter;

import android.webkit.PermissionRequest;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugins.webviewflutter.GeneratedAndroidWebView;
import java.util.Arrays;

public class PermissionRequestFlutterApiImpl {
    private GeneratedAndroidWebView.PermissionRequestFlutterApi api;
    private final BinaryMessenger binaryMessenger;
    private final InstanceManager instanceManager;

    public PermissionRequestFlutterApiImpl(BinaryMessenger binaryMessenger2, InstanceManager instanceManager2) {
        this.binaryMessenger = binaryMessenger2;
        this.instanceManager = instanceManager2;
        this.api = new GeneratedAndroidWebView.PermissionRequestFlutterApi(binaryMessenger2);
    }

    public void create(PermissionRequest permissionRequest, String[] strArr, GeneratedAndroidWebView.PermissionRequestFlutterApi.Reply<Void> reply) {
        if (!this.instanceManager.containsInstance(permissionRequest)) {
            this.api.create(Long.valueOf(this.instanceManager.addHostCreatedInstance(permissionRequest)), Arrays.asList(strArr), reply);
        }
    }

    /* access modifiers changed from: package-private */
    public void setApi(GeneratedAndroidWebView.PermissionRequestFlutterApi permissionRequestFlutterApi) {
        this.api = permissionRequestFlutterApi;
    }
}
