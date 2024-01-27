package com.google.firebase.crashlytics;

import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class c implements Deferred.DeferredHandler {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AnalyticsDeferredProxy f13870a;

    public /* synthetic */ c(AnalyticsDeferredProxy analyticsDeferredProxy) {
        this.f13870a = analyticsDeferredProxy;
    }

    public final void handle(Provider provider) {
        this.f13870a.lambda$init$2(provider);
    }
}
