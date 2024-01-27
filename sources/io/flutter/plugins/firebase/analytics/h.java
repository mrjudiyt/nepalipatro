package io.flutter.plugins.firebase.analytics;

import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class h implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ FlutterFirebaseAnalyticsPlugin f15075h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f15076i;

    public /* synthetic */ h(FlutterFirebaseAnalyticsPlugin flutterFirebaseAnalyticsPlugin, TaskCompletionSource taskCompletionSource) {
        this.f15075h = flutterFirebaseAnalyticsPlugin;
        this.f15076i = taskCompletionSource;
    }

    public final void run() {
        this.f15075h.lambda$handleResetAnalyticsData$7(this.f15076i);
    }
}
