package io.flutter.plugins.firebase.crashlytics;

import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class i implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ FlutterFirebaseCrashlyticsPlugin f15131h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f15132i;

    public /* synthetic */ i(FlutterFirebaseCrashlyticsPlugin flutterFirebaseCrashlyticsPlugin, TaskCompletionSource taskCompletionSource) {
        this.f15131h = flutterFirebaseCrashlyticsPlugin;
        this.f15132i = taskCompletionSource;
    }

    public final void run() {
        this.f15131h.lambda$checkForUnsentReports$0(this.f15132i);
    }
}
