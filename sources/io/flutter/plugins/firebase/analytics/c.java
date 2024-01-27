package io.flutter.plugins.firebase.analytics;

import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Map;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class c implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ FlutterFirebaseAnalyticsPlugin f15064h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ Map f15065i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f15066j;

    public /* synthetic */ c(FlutterFirebaseAnalyticsPlugin flutterFirebaseAnalyticsPlugin, Map map, TaskCompletionSource taskCompletionSource) {
        this.f15064h = flutterFirebaseAnalyticsPlugin;
        this.f15065i = map;
        this.f15066j = taskCompletionSource;
    }

    public final void run() {
        this.f15064h.lambda$setDefaultEventParameters$9(this.f15065i, this.f15066j);
    }
}
