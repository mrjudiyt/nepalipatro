package com.google.firebase.concurrent;

import com.google.firebase.concurrent.DelegatingScheduledFuture;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class h implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ DelegatingScheduledExecutorService f13837h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ Runnable f13838i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ DelegatingScheduledFuture.Completer f13839j;

    public /* synthetic */ h(DelegatingScheduledExecutorService delegatingScheduledExecutorService, Runnable runnable, DelegatingScheduledFuture.Completer completer) {
        this.f13837h = delegatingScheduledExecutorService;
        this.f13838i = runnable;
        this.f13839j = completer;
    }

    public final void run() {
        this.f13837h.lambda$schedule$1(this.f13838i, this.f13839j);
    }
}
