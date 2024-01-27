package io.flutter.plugins.firebase.core;

import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class h implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ String f15108h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ Boolean f15109i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f15110j;

    public /* synthetic */ h(String str, Boolean bool, TaskCompletionSource taskCompletionSource) {
        this.f15108h = str;
        this.f15109i = bool;
        this.f15110j = taskCompletionSource;
    }

    public final void run() {
        FlutterFirebaseCorePlugin.lambda$setAutomaticResourceManagementEnabled$6(this.f15108h, this.f15109i, this.f15110j);
    }
}
