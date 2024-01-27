package com.facebook.appevents.codeless;

import java.util.TimerTask;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class e implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ ViewIndexer f5961h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ TimerTask f5962i;

    public /* synthetic */ e(ViewIndexer viewIndexer, TimerTask timerTask) {
        this.f5961h = viewIndexer;
        this.f5962i = timerTask;
    }

    public final void run() {
        ViewIndexer.m51schedule$lambda0(this.f5961h, this.f5962i);
    }
}
