package io.flutter.plugins.firebase.messaging;

import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class u implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ FlutterFirebaseMessagingPlugin f15202h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f15203i;

    public /* synthetic */ u(FlutterFirebaseMessagingPlugin flutterFirebaseMessagingPlugin, TaskCompletionSource taskCompletionSource) {
        this.f15202h = flutterFirebaseMessagingPlugin;
        this.f15203i = taskCompletionSource;
    }

    public final void run() {
        this.f15202h.lambda$getPermissions$13(this.f15203i);
    }
}
