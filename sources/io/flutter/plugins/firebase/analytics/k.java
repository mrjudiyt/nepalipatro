package io.flutter.plugins.firebase.analytics;

import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Map;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class k implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ FlutterFirebaseAnalyticsPlugin f15082h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ Map f15083i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f15084j;

    public /* synthetic */ k(FlutterFirebaseAnalyticsPlugin flutterFirebaseAnalyticsPlugin, Map map, TaskCompletionSource taskCompletionSource) {
        this.f15082h = flutterFirebaseAnalyticsPlugin;
        this.f15083i = map;
        this.f15084j = taskCompletionSource;
    }

    public final void run() {
        this.f15082h.lambda$handleSetUserProperty$6(this.f15083i, this.f15084j);
    }
}
