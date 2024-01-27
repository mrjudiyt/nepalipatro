package io.flutter.plugins.firebase.crashlytics;

import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.FirebaseApp;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class j implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ FlutterFirebaseCrashlyticsPlugin f15133h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f15134i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ FirebaseApp f15135j;

    public /* synthetic */ j(FlutterFirebaseCrashlyticsPlugin flutterFirebaseCrashlyticsPlugin, TaskCompletionSource taskCompletionSource, FirebaseApp firebaseApp) {
        this.f15133h = flutterFirebaseCrashlyticsPlugin;
        this.f15134i = taskCompletionSource;
        this.f15135j = firebaseApp;
    }

    public final void run() {
        this.f15133h.lambda$getPluginConstantsForFirebaseApp$11(this.f15134i, this.f15135j);
    }
}
