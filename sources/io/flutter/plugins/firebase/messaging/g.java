package io.flutter.plugins.firebase.messaging;

import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Map;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class g implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ FlutterFirebaseMessagingPlugin f15179h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ Map f15180i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f15181j;

    public /* synthetic */ g(FlutterFirebaseMessagingPlugin flutterFirebaseMessagingPlugin, Map map, TaskCompletionSource taskCompletionSource) {
        this.f15179h = flutterFirebaseMessagingPlugin;
        this.f15180i = map;
        this.f15181j = taskCompletionSource;
    }

    public final void run() {
        this.f15179h.lambda$setAutoInitEnabled$7(this.f15180i, this.f15181j);
    }
}
