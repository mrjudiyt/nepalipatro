package io.flutter.plugins.firebase.crashlytics;

import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Map;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class l implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ FlutterFirebaseCrashlyticsPlugin f15139h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ Map f15140i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f15141j;

    public /* synthetic */ l(FlutterFirebaseCrashlyticsPlugin flutterFirebaseCrashlyticsPlugin, Map map, TaskCompletionSource taskCompletionSource) {
        this.f15139h = flutterFirebaseCrashlyticsPlugin;
        this.f15140i = map;
        this.f15141j = taskCompletionSource;
    }

    public final void run() {
        this.f15139h.lambda$setCrashlyticsCollectionEnabled$7(this.f15140i, this.f15141j);
    }
}
