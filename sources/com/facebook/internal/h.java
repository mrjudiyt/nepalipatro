package com.facebook.internal;

import com.facebook.internal.FetchedAppSettingsManager;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class h implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ FetchedAppSettingsManager.FetchedAppSettingsCallback f6072h;

    public /* synthetic */ h(FetchedAppSettingsManager.FetchedAppSettingsCallback fetchedAppSettingsCallback) {
        this.f6072h = fetchedAppSettingsCallback;
    }

    public final void run() {
        FetchedAppSettingsManager.m96pollCallbacks$lambda1(this.f6072h);
    }
}
