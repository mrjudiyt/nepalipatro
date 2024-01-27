package io.flutter.plugins.firebase.crashlytics;

import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class e implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f15126h;

    public /* synthetic */ e(TaskCompletionSource taskCompletionSource) {
        this.f15126h = taskCompletionSource;
    }

    public final void run() {
        FlutterFirebaseCrashlyticsPlugin.lambda$didReinitializeFirebaseCore$12(this.f15126h);
    }
}
