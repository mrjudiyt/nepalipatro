package com.google.firebase.crashlytics;

import com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbHandler;
import com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbSource;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class b implements BreadcrumbSource {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AnalyticsDeferredProxy f13869a;

    public /* synthetic */ b(AnalyticsDeferredProxy analyticsDeferredProxy) {
        this.f13869a = analyticsDeferredProxy;
    }

    public final void registerBreadcrumbHandler(BreadcrumbHandler breadcrumbHandler) {
        this.f13869a.lambda$getDeferredBreadcrumbSource$0(breadcrumbHandler);
    }
}
