package io.flutter.plugins.firebase.core;

import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class g implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ String f15105h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ Boolean f15106i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f15107j;

    public /* synthetic */ g(String str, Boolean bool, TaskCompletionSource taskCompletionSource) {
        this.f15105h = str;
        this.f15106i = bool;
        this.f15107j = taskCompletionSource;
    }

    public final void run() {
        FlutterFirebaseCorePlugin.lambda$setAutomaticDataCollectionEnabled$5(this.f15105h, this.f15106i, this.f15107j);
    }
}
