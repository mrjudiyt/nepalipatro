package com.facebook.appevents;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ AccessTokenAppIdPair f5966h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ AppEvent f5967i;

    public /* synthetic */ d(AccessTokenAppIdPair accessTokenAppIdPair, AppEvent appEvent) {
        this.f5966h = accessTokenAppIdPair;
        this.f5967i = appEvent;
    }

    public final void run() {
        AppEventQueue.m25add$lambda3(this.f5966h, this.f5967i);
    }
}
