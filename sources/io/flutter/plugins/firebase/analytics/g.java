package io.flutter.plugins.firebase.analytics;

import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class g implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ FlutterFirebaseAnalyticsPlugin f15073h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f15074i;

    public /* synthetic */ g(FlutterFirebaseAnalyticsPlugin flutterFirebaseAnalyticsPlugin, TaskCompletionSource taskCompletionSource) {
        this.f15073h = flutterFirebaseAnalyticsPlugin;
        this.f15074i = taskCompletionSource;
    }

    public final void run() {
        this.f15073h.lambda$handleGetAppInstanceId$10(this.f15074i);
    }
}
