package io.flutter.plugins.firebase.messaging;

import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.FirebaseApp;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class s implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ FirebaseApp f15198h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f15199i;

    public /* synthetic */ s(FirebaseApp firebaseApp, TaskCompletionSource taskCompletionSource) {
        this.f15198h = firebaseApp;
        this.f15199i = taskCompletionSource;
    }

    public final void run() {
        FlutterFirebaseMessagingPlugin.lambda$getPluginConstantsForFirebaseApp$15(this.f15198h, this.f15199i);
    }
}
