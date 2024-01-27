package io.flutter.plugins.firebase.crashlytics;

import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Map;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class m implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ Map f15142h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f15143i;

    public /* synthetic */ m(Map map, TaskCompletionSource taskCompletionSource) {
        this.f15142h = map;
        this.f15143i = taskCompletionSource;
    }

    public final void run() {
        FlutterFirebaseCrashlyticsPlugin.lambda$setUserIdentifier$8(this.f15142h, this.f15143i);
    }
}
