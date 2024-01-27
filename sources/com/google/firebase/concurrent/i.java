package com.google.firebase.concurrent;

import com.google.firebase.concurrent.DelegatingScheduledFuture;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class i implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ DelegatingScheduledExecutorService f13840h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ Runnable f13841i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ DelegatingScheduledFuture.Completer f13842j;

    public /* synthetic */ i(DelegatingScheduledExecutorService delegatingScheduledExecutorService, Runnable runnable, DelegatingScheduledFuture.Completer completer) {
        this.f13840h = delegatingScheduledExecutorService;
        this.f13841i = runnable;
        this.f13842j = completer;
    }

    public final void run() {
        this.f13840h.lambda$scheduleAtFixedRate$7(this.f13841i, this.f13842j);
    }
}
