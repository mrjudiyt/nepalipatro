package io.flutter.plugins.firebase.messaging;

import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class p implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f15196h;

    public /* synthetic */ p(TaskCompletionSource taskCompletionSource) {
        this.f15196h = taskCompletionSource;
    }

    public final void run() {
        FlutterFirebaseMessagingPlugin.lambda$deleteToken$2(this.f15196h);
    }
}
