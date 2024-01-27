package com.google.firebase.crashlytics.internal.common;

import com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbHandler;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class d implements BreadcrumbHandler {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CrashlyticsCore f13881a;

    public /* synthetic */ d(CrashlyticsCore crashlyticsCore) {
        this.f13881a = crashlyticsCore;
    }

    public final void handleBreadcrumb(String str) {
        this.f13881a.log(str);
    }
}
