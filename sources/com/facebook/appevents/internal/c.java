package com.facebook.appevents.internal;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class c implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ long f5984h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ String f5985i;

    public /* synthetic */ c(long j10, String str) {
        this.f5984h = j10;
        this.f5985i = str;
    }

    public final void run() {
        ActivityLifecycleTracker.m61onActivityPaused$lambda6$lambda4(this.f5984h, this.f5985i);
    }
}
