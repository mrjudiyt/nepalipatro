package io.flutter.plugins.firebase.crashlytics;

import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Map;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ Map f15121h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f15122i;

    public /* synthetic */ b(Map map, TaskCompletionSource taskCompletionSource) {
        this.f15121h = map;
        this.f15122i = taskCompletionSource;
    }

    public final void run() {
        FlutterFirebaseCrashlyticsPlugin.lambda$log$5(this.f15121h, this.f15122i);
    }
}
