package com.facebook.bolts;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class b implements Continuation {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CancellationToken f6011a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Continuation f6012b;

    public /* synthetic */ b(CancellationToken cancellationToken, Continuation continuation) {
        this.f6011a = cancellationToken;
        this.f6012b = continuation;
    }

    public final Object then(Task task) {
        return Task.m79onSuccess$lambda13(this.f6011a, this.f6012b, task);
    }
}
