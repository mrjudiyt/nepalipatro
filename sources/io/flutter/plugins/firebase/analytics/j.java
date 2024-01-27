package io.flutter.plugins.firebase.analytics;

import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Map;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class j implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ FlutterFirebaseAnalyticsPlugin f15079h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ Map f15080i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f15081j;

    public /* synthetic */ j(FlutterFirebaseAnalyticsPlugin flutterFirebaseAnalyticsPlugin, Map map, TaskCompletionSource taskCompletionSource) {
        this.f15079h = flutterFirebaseAnalyticsPlugin;
        this.f15080i = map;
        this.f15081j = taskCompletionSource;
    }

    public final void run() {
        this.f15079h.lambda$handleSetSessionTimeoutDuration$5(this.f15080i, this.f15081j);
    }
}
