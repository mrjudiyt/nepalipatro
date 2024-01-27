package com.google.firebase.crashlytics;

import android.os.Bundle;
import com.google.firebase.crashlytics.internal.analytics.AnalyticsEventLogger;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class a implements AnalyticsEventLogger {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AnalyticsDeferredProxy f13868a;

    public /* synthetic */ a(AnalyticsDeferredProxy analyticsDeferredProxy) {
        this.f13868a = analyticsDeferredProxy;
    }

    public final void logEvent(String str, Bundle bundle) {
        this.f13868a.lambda$getAnalyticsEventLogger$1(str, bundle);
    }
}
