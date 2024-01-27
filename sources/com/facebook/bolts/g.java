package com.facebook.bolts;

import com.facebook.bolts.Task;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class g implements Continuation {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CancellationToken f6024a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f6025b;

    public /* synthetic */ g(CancellationToken cancellationToken, TaskCompletionSource taskCompletionSource) {
        this.f6024a = cancellationToken;
        this.f6025b = taskCompletionSource;
    }

    public final Object then(Task task) {
        return Task.Companion.m83completeAfterTask$lambda7$lambda6(this.f6024a, this.f6025b, task);
    }
}
