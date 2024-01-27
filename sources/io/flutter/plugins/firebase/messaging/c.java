package io.flutter.plugins.firebase.messaging;

import android.content.Intent;
import java.util.concurrent.CountDownLatch;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class c implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ Intent f15172h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ CountDownLatch f15173i;

    public /* synthetic */ c(Intent intent, CountDownLatch countDownLatch) {
        this.f15172h = intent;
        this.f15173i = countDownLatch;
    }

    public final void run() {
        FlutterFirebaseMessagingBackgroundService.flutterBackgroundExecutor.executeDartCallbackInBackgroundIsolate(this.f15172h, this.f15173i);
    }
}
