package io.flutter.plugins.firebase.messaging;

import io.flutter.embedding.engine.FlutterShellArgs;
import io.flutter.embedding.engine.loader.FlutterLoader;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ FlutterFirebaseMessagingBackgroundExecutor f15168h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ FlutterLoader f15169i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ FlutterShellArgs f15170j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ long f15171k;

    public /* synthetic */ b(FlutterFirebaseMessagingBackgroundExecutor flutterFirebaseMessagingBackgroundExecutor, FlutterLoader flutterLoader, FlutterShellArgs flutterShellArgs, long j10) {
        this.f15168h = flutterFirebaseMessagingBackgroundExecutor;
        this.f15169i = flutterLoader;
        this.f15170j = flutterShellArgs;
        this.f15171k = j10;
    }

    public final void run() {
        this.f15168h.lambda$startBackgroundIsolate$0(this.f15169i, this.f15170j, this.f15171k);
    }
}
