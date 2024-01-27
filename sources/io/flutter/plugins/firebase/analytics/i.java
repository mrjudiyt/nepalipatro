package io.flutter.plugins.firebase.analytics;

import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class i implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ FlutterFirebaseAnalyticsPlugin f15077h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f15078i;

    public /* synthetic */ i(FlutterFirebaseAnalyticsPlugin flutterFirebaseAnalyticsPlugin, TaskCompletionSource taskCompletionSource) {
        this.f15077h = flutterFirebaseAnalyticsPlugin;
        this.f15078i = taskCompletionSource;
    }

    public final void run() {
        this.f15077h.lambda$handleGetSessionId$1(this.f15078i);
    }
}
