package io.flutter.plugins.firebase.messaging;

import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class t implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ FlutterFirebaseMessagingPlugin f15200h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f15201i;

    public /* synthetic */ t(FlutterFirebaseMessagingPlugin flutterFirebaseMessagingPlugin, TaskCompletionSource taskCompletionSource) {
        this.f15200h = flutterFirebaseMessagingPlugin;
        this.f15201i = taskCompletionSource;
    }

    public final void run() {
        this.f15200h.lambda$requestPermissions$12(this.f15201i);
    }
}
