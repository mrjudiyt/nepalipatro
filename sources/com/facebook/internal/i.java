package com.facebook.internal;

import com.facebook.internal.FetchedAppSettingsManager;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class i implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ FetchedAppSettingsManager.FetchedAppSettingsCallback f6073h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ FetchedAppSettings f6074i;

    public /* synthetic */ i(FetchedAppSettingsManager.FetchedAppSettingsCallback fetchedAppSettingsCallback, FetchedAppSettings fetchedAppSettings) {
        this.f6073h = fetchedAppSettingsCallback;
        this.f6074i = fetchedAppSettings;
    }

    public final void run() {
        FetchedAppSettingsManager.m97pollCallbacks$lambda2(this.f6073h, this.f6074i);
    }
}
