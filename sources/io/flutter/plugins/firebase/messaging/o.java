package io.flutter.plugins.firebase.messaging;

import com.google.android.gms.tasks.TaskCompletionSource;
import io.flutter.plugins.firebase.messaging.FlutterFirebasePermissionManager;
import java.util.Map;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class o implements FlutterFirebasePermissionManager.RequestPermissionsSuccessCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Map f15194a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f15195b;

    public /* synthetic */ o(Map map, TaskCompletionSource taskCompletionSource) {
        this.f15194a = map;
        this.f15195b = taskCompletionSource;
    }

    public final void onSuccess(int i10) {
        FlutterFirebaseMessagingPlugin.lambda$requestPermissions$10(this.f15194a, this.f15195b, i10);
    }
}
