package com.facebook.login;

import android.os.Bundle;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class l implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ LoginLogger f6124h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ Bundle f6125i;

    public /* synthetic */ l(LoginLogger loginLogger, Bundle bundle) {
        this.f6124h = loginLogger;
        this.f6125i = bundle;
    }

    public final void run() {
        LoginLogger.m140logHeartbeatEvent$lambda0(this.f6124h, this.f6125i);
    }
}
