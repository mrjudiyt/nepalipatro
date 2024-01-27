package io.flutter.plugins.firebase.analytics;

import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class f implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ FlutterFirebaseAnalyticsPlugin f15071h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f15072i;

    public /* synthetic */ f(FlutterFirebaseAnalyticsPlugin flutterFirebaseAnalyticsPlugin, TaskCompletionSource taskCompletionSource) {
        this.f15071h = flutterFirebaseAnalyticsPlugin;
        this.f15072i = taskCompletionSource;
    }

    public final void run() {
        this.f15071h.lambda$getPluginConstantsForFirebaseApp$11(this.f15072i);
    }
}
