package io.flutter.plugins.firebase.messaging;

import android.app.Activity;
import androidx.core.app.b;
import io.flutter.plugin.common.PluginRegistry;
import java.util.ArrayList;

class FlutterFirebasePermissionManager implements PluginRegistry.RequestPermissionsResultListener {
    private final int permissionCode = 240;
    private boolean requestInProgress = false;
    private RequestPermissionsSuccessCallback successCallback;

    @FunctionalInterface
    interface RequestPermissionsSuccessCallback {
        void onSuccess(int i10);
    }

    FlutterFirebasePermissionManager() {
    }

    public boolean onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        RequestPermissionsSuccessCallback requestPermissionsSuccessCallback;
        int i11 = 0;
        if (!this.requestInProgress || i10 != 240 || (requestPermissionsSuccessCallback = this.successCallback) == null) {
            return false;
        }
        this.requestInProgress = false;
        if (iArr.length > 0 && iArr[0] == 0) {
            i11 = 1;
        }
        requestPermissionsSuccessCallback.onSuccess(i11);
        return true;
    }

    public void requestPermissions(Activity activity, RequestPermissionsSuccessCallback requestPermissionsSuccessCallback, ErrorCallback errorCallback) {
        if (this.requestInProgress) {
            errorCallback.onError("A request for permissions is already running, please wait for it to finish before doing another request.");
        } else if (activity == null) {
            errorCallback.onError("Unable to detect current Android Activity.");
        } else {
            this.successCallback = requestPermissionsSuccessCallback;
            ArrayList arrayList = new ArrayList();
            arrayList.add("android.permission.POST_NOTIFICATIONS");
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            if (!this.requestInProgress) {
                b.w(activity, strArr, 240);
                this.requestInProgress = true;
            }
        }
    }
}
