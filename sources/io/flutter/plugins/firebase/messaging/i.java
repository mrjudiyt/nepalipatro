package io.flutter.plugins.firebase.messaging;

import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Map;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class i implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ Map f15184h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f15185i;

    public /* synthetic */ i(Map map, TaskCompletionSource taskCompletionSource) {
        this.f15184h = map;
        this.f15185i = taskCompletionSource;
    }

    public final void run() {
        FlutterFirebaseMessagingPlugin.lambda$sendMessage$6(this.f15184h, this.f15185i);
    }
}
