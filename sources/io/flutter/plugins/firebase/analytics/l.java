package io.flutter.plugins.firebase.analytics;

import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Map;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class l implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ FlutterFirebaseAnalyticsPlugin f15085h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ Map f15086i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f15087j;

    public /* synthetic */ l(FlutterFirebaseAnalyticsPlugin flutterFirebaseAnalyticsPlugin, Map map, TaskCompletionSource taskCompletionSource) {
        this.f15085h = flutterFirebaseAnalyticsPlugin;
        this.f15086i = map;
        this.f15087j = taskCompletionSource;
    }

    public final void run() {
        this.f15085h.lambda$handleSetUserId$3(this.f15086i, this.f15087j);
    }
}
