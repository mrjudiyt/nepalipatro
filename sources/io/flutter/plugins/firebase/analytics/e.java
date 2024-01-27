package io.flutter.plugins.firebase.analytics;

import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class e implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f15070h;

    public /* synthetic */ e(TaskCompletionSource taskCompletionSource) {
        this.f15070h = taskCompletionSource;
    }

    public final void run() {
        FlutterFirebaseAnalyticsPlugin.lambda$didReinitializeFirebaseCore$12(this.f15070h);
    }
}
