package com.google.firebase.crashlytics.ktx;

import com.google.firebase.crashlytics.FirebaseCrashlytics;
import io.flutter.plugins.firebase.crashlytics.Constants;
import kotlin.jvm.internal.m;

/* compiled from: KeyValueBuilder.kt */
public final class KeyValueBuilder {
    private final FirebaseCrashlytics crashlytics;

    public KeyValueBuilder(FirebaseCrashlytics firebaseCrashlytics) {
        m.f(firebaseCrashlytics, "crashlytics");
        this.crashlytics = firebaseCrashlytics;
    }

    public final void key(String str, boolean z10) {
        m.f(str, Constants.KEY);
        this.crashlytics.setCustomKey(str, z10);
    }

    public final void key(String str, double d10) {
        m.f(str, Constants.KEY);
        this.crashlytics.setCustomKey(str, d10);
    }

    public final void key(String str, float f10) {
        m.f(str, Constants.KEY);
        this.crashlytics.setCustomKey(str, f10);
    }

    public final void key(String str, int i10) {
        m.f(str, Constants.KEY);
        this.crashlytics.setCustomKey(str, i10);
    }

    public final void key(String str, long j10) {
        m.f(str, Constants.KEY);
        this.crashlytics.setCustomKey(str, j10);
    }

    public final void key(String str, String str2) {
        m.f(str, Constants.KEY);
        m.f(str2, "value");
        this.crashlytics.setCustomKey(str, str2);
    }
}
