package io.flutter.plugins.firebase.core;

import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ FlutterFirebaseCorePlugin f15092h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f15093i;

    public /* synthetic */ b(FlutterFirebaseCorePlugin flutterFirebaseCorePlugin, TaskCompletionSource taskCompletionSource) {
        this.f15092h = flutterFirebaseCorePlugin;
        this.f15093i = taskCompletionSource;
    }

    public final void run() {
        this.f15092h.lambda$initializeCore$3(this.f15093i);
    }
}
