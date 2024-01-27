package com.google.firebase.concurrent;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class v implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ LimitedConcurrencyExecutor f13860h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ Runnable f13861i;

    public /* synthetic */ v(LimitedConcurrencyExecutor limitedConcurrencyExecutor, Runnable runnable) {
        this.f13860h = limitedConcurrencyExecutor;
        this.f13861i = runnable;
    }

    public final void run() {
        this.f13860h.lambda$decorate$0(this.f13861i);
    }
}
