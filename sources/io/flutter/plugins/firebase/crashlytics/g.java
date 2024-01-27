package io.flutter.plugins.firebase.crashlytics;

import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class g implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f15128h;

    public /* synthetic */ g(TaskCompletionSource taskCompletionSource) {
        this.f15128h = taskCompletionSource;
    }

    public final void run() {
        FlutterFirebaseCrashlyticsPlugin.lambda$deleteUnsentReports$2(this.f15128h);
    }
}
