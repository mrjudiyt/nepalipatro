package com.google.firebase.analytics;

import android.os.Bundle;
import io.flutter.plugins.firebase.crashlytics.Constants;
import kotlin.jvm.internal.m;

/* compiled from: com.google.android.gms:play-services-measurement-api@@21.5.0 */
public final class ParametersBuilder {
    private final Bundle zza = new Bundle();

    public final Bundle getBundle() {
        return this.zza;
    }

    public final void param(String str, double d10) {
        m.f(str, Constants.KEY);
        this.zza.putDouble(str, d10);
    }

    public final void param(String str, long j10) {
        m.f(str, Constants.KEY);
        this.zza.putLong(str, j10);
    }

    public final void param(String str, Bundle bundle) {
        m.f(str, Constants.KEY);
        m.f(bundle, "value");
        this.zza.putBundle(str, bundle);
    }

    public final void param(String str, String str2) {
        m.f(str, Constants.KEY);
        m.f(str2, "value");
        this.zza.putString(str, str2);
    }

    public final void param(String str, Bundle[] bundleArr) {
        m.f(str, Constants.KEY);
        m.f(bundleArr, "value");
        this.zza.putParcelableArray(str, bundleArr);
    }
}
