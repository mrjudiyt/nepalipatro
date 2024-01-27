package com.google.firebase.concurrent;

import com.google.firebase.concurrent.DelegatingScheduledFuture;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class j implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ DelegatingScheduledExecutorService f13843h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ Runnable f13844i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ DelegatingScheduledFuture.Completer f13845j;

    public /* synthetic */ j(DelegatingScheduledExecutorService delegatingScheduledExecutorService, Runnable runnable, DelegatingScheduledFuture.Completer completer) {
        this.f13843h = delegatingScheduledExecutorService;
        this.f13844i = runnable;
        this.f13845j = completer;
    }

    public final void run() {
        this.f13843h.lambda$scheduleWithFixedDelay$10(this.f13844i, this.f13845j);
    }
}
