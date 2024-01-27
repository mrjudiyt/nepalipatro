package com.facebook.bolts;

import java.util.concurrent.Executor;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class e implements Continuation {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f6019a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Continuation f6020b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Executor f6021c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ CancellationToken f6022d;

    public /* synthetic */ e(TaskCompletionSource taskCompletionSource, Continuation continuation, Executor executor, CancellationToken cancellationToken) {
        this.f6019a = taskCompletionSource;
        this.f6020b = continuation;
        this.f6021c = executor;
        this.f6022d = cancellationToken;
    }

    public final Object then(Task task) {
        return Task.m77continueWithTask$lambda12$lambda11(this.f6019a, this.f6020b, this.f6021c, this.f6022d, task);
    }
}
