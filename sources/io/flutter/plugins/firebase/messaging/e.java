package io.flutter.plugins.firebase.messaging;

import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class e implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ FlutterFirebaseMessagingPlugin f15175h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f15176i;

    public /* synthetic */ e(FlutterFirebaseMessagingPlugin flutterFirebaseMessagingPlugin, TaskCompletionSource taskCompletionSource) {
        this.f15175h = flutterFirebaseMessagingPlugin;
        this.f15176i = taskCompletionSource;
    }

    public final void run() {
        this.f15175h.lambda$getInitialMessage$9(this.f15176i);
    }
}
