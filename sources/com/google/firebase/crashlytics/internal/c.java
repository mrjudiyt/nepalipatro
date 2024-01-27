package com.google.firebase.crashlytics.internal;

import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class c implements Deferred.DeferredHandler {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CrashlyticsRemoteConfigListener f13877a;

    public /* synthetic */ c(CrashlyticsRemoteConfigListener crashlyticsRemoteConfigListener) {
        this.f13877a = crashlyticsRemoteConfigListener;
    }

    public final void handle(Provider provider) {
        RemoteConfigDeferredProxy.lambda$setupListener$0(this.f13877a, provider);
    }
}
