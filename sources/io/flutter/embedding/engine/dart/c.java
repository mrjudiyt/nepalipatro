package io.flutter.embedding.engine.dart;

import io.flutter.embedding.engine.dart.DartMessenger;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class c implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ DartMessenger.SerialTaskQueue f15027h;

    public /* synthetic */ c(DartMessenger.SerialTaskQueue serialTaskQueue) {
        this.f15027h = serialTaskQueue;
    }

    public final void run() {
        this.f15027h.lambda$flush$1();
    }
}
