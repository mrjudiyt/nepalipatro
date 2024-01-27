package io.flutter.plugins.firebase.messaging;

import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Map;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class h implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ Map f15182h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f15183i;

    public /* synthetic */ h(Map map, TaskCompletionSource taskCompletionSource) {
        this.f15182h = map;
        this.f15183i = taskCompletionSource;
    }

    public final void run() {
        FlutterFirebaseMessagingPlugin.lambda$subscribeToTopic$4(this.f15182h, this.f15183i);
    }
}
