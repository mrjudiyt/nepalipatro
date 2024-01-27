package com.facebook.bolts;

import com.facebook.bolts.Task;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class k implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ CancellationToken f6034h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f6035i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ Continuation f6036j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ Task f6037k;

    public /* synthetic */ k(CancellationToken cancellationToken, TaskCompletionSource taskCompletionSource, Continuation continuation, Task task) {
        this.f6034h = cancellationToken;
        this.f6035i = taskCompletionSource;
        this.f6036j = continuation;
        this.f6037k = task;
    }

    public final void run() {
        Task.Companion.m84completeImmediately$lambda5(this.f6034h, this.f6035i, this.f6036j, this.f6037k);
    }
}
