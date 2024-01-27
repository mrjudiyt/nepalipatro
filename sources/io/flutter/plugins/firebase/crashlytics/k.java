package io.flutter.plugins.firebase.crashlytics;

import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Map;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class k implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ FlutterFirebaseCrashlyticsPlugin f15136h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ Map f15137i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f15138j;

    public /* synthetic */ k(FlutterFirebaseCrashlyticsPlugin flutterFirebaseCrashlyticsPlugin, Map map, TaskCompletionSource taskCompletionSource) {
        this.f15136h = flutterFirebaseCrashlyticsPlugin;
        this.f15137i = map;
        this.f15138j = taskCompletionSource;
    }

    public final void run() {
        this.f15136h.lambda$recordError$4(this.f15137i, this.f15138j);
    }
}
