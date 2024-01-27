package com.facebook.appevents.ondeviceprocessing;

import com.facebook.appevents.AppEvent;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ String f5999h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ AppEvent f6000i;

    public /* synthetic */ b(String str, AppEvent appEvent) {
        this.f5999h = str;
        this.f6000i = appEvent;
    }

    public final void run() {
        OnDeviceProcessingManager.m69sendCustomEventAsync$lambda1(this.f5999h, this.f6000i);
    }
}
