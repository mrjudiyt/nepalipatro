package com.facebook.appevents;

import android.os.Bundle;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class q implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ Bundle f6002h;

    public /* synthetic */ q(Bundle bundle) {
        this.f6002h = bundle;
    }

    public final void run() {
        UserDataStore.m40setUserDataAndHash$lambda1(this.f6002h);
    }
}
