package io.flutter.plugins.firebase.core;

import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class i implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f15111h;

    public /* synthetic */ i(TaskCompletionSource taskCompletionSource) {
        this.f15111h = taskCompletionSource;
    }

    public final void run() {
        FlutterFirebasePluginRegistry.lambda$didReinitializeFirebaseCore$1(this.f15111h);
    }
}
