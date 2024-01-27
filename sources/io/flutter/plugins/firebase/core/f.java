package io.flutter.plugins.firebase.core;

import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class f implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ String f15103h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f15104i;

    public /* synthetic */ f(String str, TaskCompletionSource taskCompletionSource) {
        this.f15103h = str;
        this.f15104i = taskCompletionSource;
    }

    public final void run() {
        FlutterFirebaseCorePlugin.lambda$delete$7(this.f15103h, this.f15104i);
    }
}
