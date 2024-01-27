package io.flutter.plugins.firebase.crashlytics;

import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class h implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ FlutterFirebaseCrashlyticsPlugin f15129h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f15130i;

    public /* synthetic */ h(FlutterFirebaseCrashlyticsPlugin flutterFirebaseCrashlyticsPlugin, TaskCompletionSource taskCompletionSource) {
        this.f15129h = flutterFirebaseCrashlyticsPlugin;
        this.f15130i = taskCompletionSource;
    }

    public final void run() {
        this.f15129h.lambda$didCrashOnPreviousExecution$3(this.f15130i);
    }
}
