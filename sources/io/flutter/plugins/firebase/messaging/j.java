package io.flutter.plugins.firebase.messaging;

import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Map;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class j implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ Map f15186h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f15187i;

    public /* synthetic */ j(Map map, TaskCompletionSource taskCompletionSource) {
        this.f15186h = map;
        this.f15187i = taskCompletionSource;
    }

    public final void run() {
        FlutterFirebaseMessagingPlugin.lambda$setDeliveryMetricsExportToBigQuery$8(this.f15186h, this.f15187i);
    }
}
