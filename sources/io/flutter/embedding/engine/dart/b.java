package io.flutter.embedding.engine.dart;

import io.flutter.embedding.engine.dart.DartMessenger;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ DartMessenger.SerialTaskQueue f15026h;

    public /* synthetic */ b(DartMessenger.SerialTaskQueue serialTaskQueue) {
        this.f15026h = serialTaskQueue;
    }

    public final void run() {
        this.f15026h.lambda$dispatch$0();
    }
}
