package com.google.firebase.concurrent;

import com.google.firebase.concurrent.DelegatingScheduledFuture;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class l implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ Runnable f13848h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ DelegatingScheduledFuture.Completer f13849i;

    public /* synthetic */ l(Runnable runnable, DelegatingScheduledFuture.Completer completer) {
        this.f13848h = runnable;
        this.f13849i = completer;
    }

    public final void run() {
        DelegatingScheduledExecutorService.lambda$scheduleAtFixedRate$6(this.f13848h, this.f13849i);
    }
}
