package com.facebook.appevents;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class f implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ FlushReason f5970h;

    public /* synthetic */ f(FlushReason flushReason) {
        this.f5970h = flushReason;
    }

    public final void run() {
        AppEventQueue.m27flush$lambda2(this.f5970h);
    }
}
