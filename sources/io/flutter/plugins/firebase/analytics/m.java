package io.flutter.plugins.firebase.analytics;

import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Map;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class m implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ FlutterFirebaseAnalyticsPlugin f15088h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ Map f15089i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f15090j;

    public /* synthetic */ m(FlutterFirebaseAnalyticsPlugin flutterFirebaseAnalyticsPlugin, Map map, TaskCompletionSource taskCompletionSource) {
        this.f15088h = flutterFirebaseAnalyticsPlugin;
        this.f15089i = map;
        this.f15090j = taskCompletionSource;
    }

    public final void run() {
        this.f15088h.lambda$setConsent$8(this.f15089i, this.f15090j);
    }
}
