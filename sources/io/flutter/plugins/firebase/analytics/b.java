package io.flutter.plugins.firebase.analytics;

import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Map;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ FlutterFirebaseAnalyticsPlugin f15061h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ Map f15062i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f15063j;

    public /* synthetic */ b(FlutterFirebaseAnalyticsPlugin flutterFirebaseAnalyticsPlugin, Map map, TaskCompletionSource taskCompletionSource) {
        this.f15061h = flutterFirebaseAnalyticsPlugin;
        this.f15062i = map;
        this.f15063j = taskCompletionSource;
    }

    public final void run() {
        this.f15061h.lambda$handleLogEvent$2(this.f15062i, this.f15063j);
    }
}
