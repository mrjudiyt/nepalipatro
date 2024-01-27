package io.flutter.plugins.firebase.crashlytics;

import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Map;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class c implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ Map f15123h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f15124i;

    public /* synthetic */ c(Map map, TaskCompletionSource taskCompletionSource) {
        this.f15123h = map;
        this.f15124i = taskCompletionSource;
    }

    public final void run() {
        FlutterFirebaseCrashlyticsPlugin.lambda$setCustomKey$9(this.f15123h, this.f15124i);
    }
}
