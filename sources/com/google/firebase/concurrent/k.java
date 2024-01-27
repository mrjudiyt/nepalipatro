package com.google.firebase.concurrent;

import com.google.firebase.concurrent.DelegatingScheduledFuture;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class k implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ Runnable f13846h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ DelegatingScheduledFuture.Completer f13847i;

    public /* synthetic */ k(Runnable runnable, DelegatingScheduledFuture.Completer completer) {
        this.f13846h = runnable;
        this.f13847i = completer;
    }

    public final void run() {
        DelegatingScheduledExecutorService.lambda$schedule$0(this.f13846h, this.f13847i);
    }
}
