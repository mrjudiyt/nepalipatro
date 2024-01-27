package com.facebook.appevents;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class e implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ AccessTokenAppIdPair f5968h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ SessionEventsState f5969i;

    public /* synthetic */ e(AccessTokenAppIdPair accessTokenAppIdPair, SessionEventsState sessionEventsState) {
        this.f5968h = accessTokenAppIdPair;
        this.f5969i = sessionEventsState;
    }

    public final void run() {
        AppEventQueue.m29handleResponse$lambda5(this.f5968h, this.f5969i);
    }
}
