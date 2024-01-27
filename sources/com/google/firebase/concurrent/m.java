package com.google.firebase.concurrent;

import com.google.firebase.concurrent.DelegatingScheduledFuture;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class m implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ Runnable f13850h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ DelegatingScheduledFuture.Completer f13851i;

    public /* synthetic */ m(Runnable runnable, DelegatingScheduledFuture.Completer completer) {
        this.f13850h = runnable;
        this.f13851i = completer;
    }

    public final void run() {
        DelegatingScheduledExecutorService.lambda$scheduleWithFixedDelay$9(this.f13850h, this.f13851i);
    }
}
