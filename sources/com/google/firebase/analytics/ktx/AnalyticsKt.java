package com.google.firebase.analytics.ktx;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.ktx.Firebase;
import com.google.firebase.ktx.FirebaseKt;
import kotlin.jvm.internal.m;
import o8.q;
import y8.l;

/* compiled from: com.google.android.gms:play-services-measurement-api@@21.5.0 */
public final class AnalyticsKt {
    private static volatile FirebaseAnalytics zza;
    private static final Object zzb = new Object();

    public static final FirebaseAnalytics getANALYTICS() {
        return zza;
    }

    public static final FirebaseAnalytics getAnalytics(Firebase firebase) {
        m.f(firebase, "<this>");
        if (zza == null) {
            synchronized (zzb) {
                if (zza == null) {
                    zza = FirebaseAnalytics.getInstance(FirebaseKt.getApp(Firebase.INSTANCE).getApplicationContext());
                }
            }
        }
        FirebaseAnalytics firebaseAnalytics = zza;
        m.c(firebaseAnalytics);
        return firebaseAnalytics;
    }

    public static final Object getLOCK() {
        return zzb;
    }

    public static final void logEvent(FirebaseAnalytics firebaseAnalytics, String str, l<? super ParametersBuilder, q> lVar) {
        m.f(firebaseAnalytics, "<this>");
        m.f(str, "name");
        m.f(lVar, "block");
        ParametersBuilder parametersBuilder = new ParametersBuilder();
        lVar.invoke(parametersBuilder);
        firebaseAnalytics.logEvent(str, parametersBuilder.getBundle());
    }

    public static final void setANALYTICS(FirebaseAnalytics firebaseAnalytics) {
        zza = firebaseAnalytics;
    }

    public static final void setConsent(FirebaseAnalytics firebaseAnalytics, l<? super ConsentBuilder, q> lVar) {
        m.f(firebaseAnalytics, "<this>");
        m.f(lVar, "block");
        ConsentBuilder consentBuilder = new ConsentBuilder();
        lVar.invoke(consentBuilder);
        firebaseAnalytics.setConsent(consentBuilder.asMap());
    }
}
