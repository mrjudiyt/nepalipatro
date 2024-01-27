package io.flutter.plugins.firebase.messaging;

import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Map;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class k implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ Map f15188h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f15189i;

    public /* synthetic */ k(Map map, TaskCompletionSource taskCompletionSource) {
        this.f15188h = map;
        this.f15189i = taskCompletionSource;
    }

    public final void run() {
        FlutterFirebaseMessagingPlugin.lambda$unsubscribeFromTopic$5(this.f15188h, this.f15189i);
    }
}
