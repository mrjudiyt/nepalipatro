package com.facebook.internal;

import com.facebook.internal.FetchedAppGateKeepersManager;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class e implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ FetchedAppGateKeepersManager.Callback f6065h;

    public /* synthetic */ e(FetchedAppGateKeepersManager.Callback callback) {
        this.f6065h = callback;
    }

    public final void run() {
        FetchedAppGateKeepersManager.m94pollCallbacks$lambda1(this.f6065h);
    }
}
