package com.google.firebase.crashlytics.internal;

import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class a implements Deferred.DeferredHandler {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CrashlyticsNativeComponentDeferredProxy f13872a;

    public /* synthetic */ a(CrashlyticsNativeComponentDeferredProxy crashlyticsNativeComponentDeferredProxy) {
        this.f13872a = crashlyticsNativeComponentDeferredProxy;
    }

    public final void handle(Provider provider) {
        this.f13872a.lambda$new$0(provider);
    }
}
