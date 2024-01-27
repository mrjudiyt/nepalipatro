package com.facebook.appevents.codeless;

import android.os.Bundle;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ String f5955h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ Bundle f5956i;

    public /* synthetic */ a(String str, Bundle bundle) {
        this.f5955h = str;
        this.f5956i = bundle;
    }

    public final void run() {
        CodelessLoggingEventListener.m47logEvent$lambda0(this.f5955h, this.f5956i);
    }
}
