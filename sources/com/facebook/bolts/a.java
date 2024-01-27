package com.facebook.bolts;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ CancellationTokenSource f6010h;

    public /* synthetic */ a(CancellationTokenSource cancellationTokenSource) {
        this.f6010h = cancellationTokenSource;
    }

    public final void run() {
        CancellationTokenSource.m75cancelAfter$lambda6$lambda5(this.f6010h);
    }
}
