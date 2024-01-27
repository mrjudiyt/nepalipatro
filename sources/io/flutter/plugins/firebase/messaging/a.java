package io.flutter.plugins.firebase.messaging;

import android.os.Handler;
import io.flutter.embedding.engine.FlutterShellArgs;
import io.flutter.embedding.engine.loader.FlutterLoader;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ FlutterFirebaseMessagingBackgroundExecutor f15163h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ FlutterLoader f15164i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ Handler f15165j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ FlutterShellArgs f15166k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ long f15167l;

    public /* synthetic */ a(FlutterFirebaseMessagingBackgroundExecutor flutterFirebaseMessagingBackgroundExecutor, FlutterLoader flutterLoader, Handler handler, FlutterShellArgs flutterShellArgs, long j10) {
        this.f15163h = flutterFirebaseMessagingBackgroundExecutor;
        this.f15164i = flutterLoader;
        this.f15165j = handler;
        this.f15166k = flutterShellArgs;
        this.f15167l = j10;
    }

    public final void run() {
        this.f15163h.lambda$startBackgroundIsolate$1(this.f15164i, this.f15165j, this.f15166k, this.f15167l);
    }
}
