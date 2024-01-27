package io.flutter.plugins.firebase.messaging;

import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class f implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ FlutterFirebaseMessagingPlugin f15177h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f15178i;

    public /* synthetic */ f(FlutterFirebaseMessagingPlugin flutterFirebaseMessagingPlugin, TaskCompletionSource taskCompletionSource) {
        this.f15177h = flutterFirebaseMessagingPlugin;
        this.f15178i = taskCompletionSource;
    }

    public final void run() {
        this.f15177h.lambda$getToken$3(this.f15178i);
    }
}
