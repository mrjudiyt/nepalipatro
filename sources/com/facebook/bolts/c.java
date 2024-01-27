package com.facebook.bolts;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class c implements Continuation {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CancellationToken f6013a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Continuation f6014b;

    public /* synthetic */ c(CancellationToken cancellationToken, Continuation continuation) {
        this.f6013a = cancellationToken;
        this.f6014b = continuation;
    }

    public final Object then(Task task) {
        return Task.m80onSuccessTask$lambda14(this.f6013a, this.f6014b, task);
    }
}
