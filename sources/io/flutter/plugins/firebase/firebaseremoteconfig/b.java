package io.flutter.plugins.firebase.firebaseremoteconfig;

import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f15157h;

    public /* synthetic */ b(TaskCompletionSource taskCompletionSource) {
        this.f15157h = taskCompletionSource;
    }

    public final void run() {
        FirebaseRemoteConfigPlugin.lambda$didReinitializeFirebaseCore$1(this.f15157h);
    }
}
