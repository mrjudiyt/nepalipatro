package io.flutter.plugins.firebase.analytics;

import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Map;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ FlutterFirebaseAnalyticsPlugin f15067h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ Map f15068i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f15069j;

    public /* synthetic */ d(FlutterFirebaseAnalyticsPlugin flutterFirebaseAnalyticsPlugin, Map map, TaskCompletionSource taskCompletionSource) {
        this.f15067h = flutterFirebaseAnalyticsPlugin;
        this.f15068i = map;
        this.f15069j = taskCompletionSource;
    }

    public final void run() {
        this.f15067h.lambda$handleSetAnalyticsCollectionEnabled$4(this.f15068i, this.f15069j);
    }
}
