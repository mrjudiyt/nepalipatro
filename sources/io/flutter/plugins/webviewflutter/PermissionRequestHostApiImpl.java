package io.flutter.plugins.webviewflutter;

import android.webkit.PermissionRequest;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugins.webviewflutter.GeneratedAndroidWebView;
import java.util.List;
import java.util.Objects;

public class PermissionRequestHostApiImpl implements GeneratedAndroidWebView.PermissionRequestHostApi {
    private final BinaryMessenger binaryMessenger;
    private final InstanceManager instanceManager;

    public PermissionRequestHostApiImpl(BinaryMessenger binaryMessenger2, InstanceManager instanceManager2) {
        this.binaryMessenger = binaryMessenger2;
        this.instanceManager = instanceManager2;
    }

    private PermissionRequest getPermissionRequestInstance(Long l10) {
        PermissionRequest permissionRequest = (PermissionRequest) this.instanceManager.getInstance(l10.longValue());
        Objects.requireNonNull(permissionRequest);
        PermissionRequest permissionRequest2 = permissionRequest;
        return permissionRequest;
    }

    public void deny(Long l10) {
        getPermissionRequestInstance(l10).deny();
    }

    public void grant(Long l10, List<String> list) {
        getPermissionRequestInstance(l10).grant((String[]) list.toArray(new String[0]));
    }
}
