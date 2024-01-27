package com.google.firebase.remoteconfig;

import k9.p;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class n implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ p f14050h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ ConfigUpdate f14051i;

    public /* synthetic */ n(p pVar, ConfigUpdate configUpdate) {
        this.f14050h = pVar;
        this.f14051i = configUpdate;
    }

    public final void run() {
        RemoteConfigKt$configUpdates$1$registration$1.m157onUpdate$lambda0(this.f14050h, this.f14051i);
    }
}
