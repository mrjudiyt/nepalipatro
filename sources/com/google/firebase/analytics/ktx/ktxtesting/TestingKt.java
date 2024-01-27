package com.google.firebase.analytics.ktx.ktxtesting;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.analytics.ktx.AnalyticsKt;
import kotlin.jvm.internal.m;
import o8.q;
import y8.a;

/* compiled from: com.google.android.gms:play-services-measurement-api@@21.5.0 */
public final class TestingKt {
    public static final void withAnalyticsForTest(FirebaseAnalytics firebaseAnalytics, a<q> aVar) {
        m.f(firebaseAnalytics, "analytics");
        m.f(aVar, "block");
        synchronized (AnalyticsKt.getLOCK()) {
            FirebaseAnalytics analytics = AnalyticsKt.getANALYTICS();
            AnalyticsKt.setANALYTICS(firebaseAnalytics);
            try {
                aVar.invoke();
            } finally {
                AnalyticsKt.setANALYTICS(analytics);
            }
        }
    }
}
