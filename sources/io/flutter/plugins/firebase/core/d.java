package io.flutter.plugins.firebase.core;

import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.FirebaseApp;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ FlutterFirebaseCorePlugin f15096h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ FirebaseApp f15097i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f15098j;

    public /* synthetic */ d(FlutterFirebaseCorePlugin flutterFirebaseCorePlugin, FirebaseApp firebaseApp, TaskCompletionSource taskCompletionSource) {
        this.f15096h = flutterFirebaseCorePlugin;
        this.f15097i = firebaseApp;
        this.f15098j = taskCompletionSource;
    }

    public final void run() {
        this.f15096h.lambda$firebaseAppToMap$0(this.f15097i, this.f15098j);
    }
}
