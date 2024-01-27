package com.google.firebase.crashlytics.internal;

import com.google.firebase.crashlytics.internal.model.StaticSessionData;
import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class b implements Deferred.DeferredHandler {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f13873a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f13874b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ long f13875c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ StaticSessionData f13876d;

    public /* synthetic */ b(String str, String str2, long j10, StaticSessionData staticSessionData) {
        this.f13873a = str;
        this.f13874b = str2;
        this.f13875c = j10;
        this.f13876d = staticSessionData;
    }

    public final void handle(Provider provider) {
        ((CrashlyticsNativeComponent) provider.get()).prepareNativeSession(this.f13873a, this.f13874b, this.f13875c, this.f13876d);
    }
}
