package com.google.firebase.crashlytics;

import com.google.firebase.Firebase;
import kotlin.jvm.internal.m;
import o8.q;
import y8.l;

/* compiled from: FirebaseCrashlytics.kt */
public final class FirebaseCrashlyticsKt {
    public static final FirebaseCrashlytics getCrashlytics(Firebase firebase) {
        m.f(firebase, "<this>");
        FirebaseCrashlytics instance = FirebaseCrashlytics.getInstance();
        m.e(instance, "getInstance()");
        return instance;
    }

    public static final void setCustomKeys(FirebaseCrashlytics firebaseCrashlytics, l<? super KeyValueBuilder, q> lVar) {
        m.f(firebaseCrashlytics, "<this>");
        m.f(lVar, "init");
        lVar.invoke(new KeyValueBuilder(firebaseCrashlytics));
    }
}
