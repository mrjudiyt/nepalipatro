package com.google.firebase.remoteconfig.ktx;

import com.google.firebase.remoteconfig.ConfigUpdate;
import k9.p;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ p f14046h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ ConfigUpdate f14047i;

    public /* synthetic */ a(p pVar, ConfigUpdate configUpdate) {
        this.f14046h = pVar;
        this.f14047i = configUpdate;
    }

    public final void run() {
        RemoteConfigKt$configUpdates$1$registration$1.m158onUpdate$lambda0(this.f14046h, this.f14047i);
    }
}
