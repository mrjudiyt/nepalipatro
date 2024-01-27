package com.google.firebase.crashlytics.internal.send;

import java.util.concurrent.CountDownLatch;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ ReportQueue f13909h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ CountDownLatch f13910i;

    public /* synthetic */ b(ReportQueue reportQueue, CountDownLatch countDownLatch) {
        this.f13909h = reportQueue;
        this.f13910i = countDownLatch;
    }

    public final void run() {
        this.f13909h.lambda$flushScheduledReportsIfAble$0(this.f13910i);
    }
}
