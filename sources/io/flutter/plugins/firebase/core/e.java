package io.flutter.plugins.firebase.core;

import com.google.android.gms.tasks.TaskCompletionSource;
import io.flutter.plugins.firebase.core.GeneratedAndroidFirebaseCore;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class e implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ FlutterFirebaseCorePlugin f15099h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ GeneratedAndroidFirebaseCore.PigeonFirebaseOptions f15100i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ String f15101j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f15102k;

    public /* synthetic */ e(FlutterFirebaseCorePlugin flutterFirebaseCorePlugin, GeneratedAndroidFirebaseCore.PigeonFirebaseOptions pigeonFirebaseOptions, String str, TaskCompletionSource taskCompletionSource) {
        this.f15099h = flutterFirebaseCorePlugin;
        this.f15100i = pigeonFirebaseOptions;
        this.f15101j = str;
        this.f15102k = taskCompletionSource;
    }

    public final void run() {
        this.f15099h.lambda$initializeApp$2(this.f15100i, this.f15101j, this.f15102k);
    }
}
