package io.flutter.plugins.firebase.firebaseremoteconfig;

import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.FirebaseApp;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class c implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ FirebaseRemoteConfigPlugin f15158h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ FirebaseApp f15159i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f15160j;

    public /* synthetic */ c(FirebaseRemoteConfigPlugin firebaseRemoteConfigPlugin, FirebaseApp firebaseApp, TaskCompletionSource taskCompletionSource) {
        this.f15158h = firebaseRemoteConfigPlugin;
        this.f15159i = firebaseApp;
        this.f15160j = taskCompletionSource;
    }

    public final void run() {
        this.f15158h.lambda$getPluginConstantsForFirebaseApp$0(this.f15159i, this.f15160j);
    }
}
