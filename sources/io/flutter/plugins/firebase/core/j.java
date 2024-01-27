package io.flutter.plugins.firebase.core;

import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.FirebaseApp;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class j implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ FirebaseApp f15112h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f15113i;

    public /* synthetic */ j(FirebaseApp firebaseApp, TaskCompletionSource taskCompletionSource) {
        this.f15112h = firebaseApp;
        this.f15113i = taskCompletionSource;
    }

    public final void run() {
        FlutterFirebasePluginRegistry.lambda$getPluginConstantsForFirebaseApp$0(this.f15112h, this.f15113i);
    }
}
