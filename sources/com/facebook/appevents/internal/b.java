package com.facebook.appevents.internal;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ long f5982h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ String f5983i;

    public /* synthetic */ b(long j10, String str) {
        this.f5982h = j10;
        this.f5983i = str;
    }

    public final void run() {
        ActivityLifecycleTracker.m60onActivityPaused$lambda6(this.f5982h, this.f5983i);
    }
}
