package com.google.firebase.components;

import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class p implements Deferred.DeferredHandler {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Deferred.DeferredHandler f13808a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Deferred.DeferredHandler f13809b;

    public /* synthetic */ p(Deferred.DeferredHandler deferredHandler, Deferred.DeferredHandler deferredHandler2) {
        this.f13808a = deferredHandler;
        this.f13809b = deferredHandler2;
    }

    public final void handle(Provider provider) {
        OptionalProvider.lambda$whenAvailable$2(this.f13808a, this.f13809b, provider);
    }
}
