package com.facebook.bolts;

import com.facebook.bolts.Task;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class j implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ CancellationToken f6030h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f6031i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ Continuation f6032j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ Task f6033k;

    public /* synthetic */ j(CancellationToken cancellationToken, TaskCompletionSource taskCompletionSource, Continuation continuation, Task task) {
        this.f6030h = cancellationToken;
        this.f6031i = taskCompletionSource;
        this.f6032j = continuation;
        this.f6033k = task;
    }

    public final void run() {
        Task.Companion.m82completeAfterTask$lambda7(this.f6030h, this.f6031i, this.f6032j, this.f6033k);
    }
}
