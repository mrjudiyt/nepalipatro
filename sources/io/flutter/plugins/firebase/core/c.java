package io.flutter.plugins.firebase.core;

import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class c implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ FlutterFirebaseCorePlugin f15094h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f15095i;

    public /* synthetic */ c(FlutterFirebaseCorePlugin flutterFirebaseCorePlugin, TaskCompletionSource taskCompletionSource) {
        this.f15094h = flutterFirebaseCorePlugin;
        this.f15095i = taskCompletionSource;
    }

    public final void run() {
        this.f15094h.lambda$optionsFromResource$4(this.f15095i);
    }
}
