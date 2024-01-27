package com.facebook.bolts;

import java.util.concurrent.Executor;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class d implements Continuation {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f6015a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Continuation f6016b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Executor f6017c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ CancellationToken f6018d;

    public /* synthetic */ d(TaskCompletionSource taskCompletionSource, Continuation continuation, Executor executor, CancellationToken cancellationToken) {
        this.f6015a = taskCompletionSource;
        this.f6016b = continuation;
        this.f6017c = executor;
        this.f6018d = cancellationToken;
    }

    public final Object then(Task task) {
        return Task.m76continueWith$lambda10$lambda9(this.f6015a, this.f6016b, this.f6017c, this.f6018d, task);
    }
}
