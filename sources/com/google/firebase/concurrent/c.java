package com.google.firebase.concurrent;

import com.google.firebase.concurrent.DelegatingScheduledFuture;
import java.util.concurrent.Callable;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class c implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ Callable f13819h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ DelegatingScheduledFuture.Completer f13820i;

    public /* synthetic */ c(Callable callable, DelegatingScheduledFuture.Completer completer) {
        this.f13819h = callable;
        this.f13820i = completer;
    }

    public final void run() {
        DelegatingScheduledExecutorService.lambda$schedule$3(this.f13819h, this.f13820i);
    }
}
