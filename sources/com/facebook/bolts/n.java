package com.facebook.bolts;

import com.facebook.bolts.Task;
import java.util.concurrent.ScheduledFuture;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class n implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ ScheduledFuture f6042h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f6043i;

    public /* synthetic */ n(ScheduledFuture scheduledFuture, TaskCompletionSource taskCompletionSource) {
        this.f6042h = scheduledFuture;
        this.f6043i = taskCompletionSource;
    }

    public final void run() {
        Task.Companion.m86delay$lambda1(this.f6042h, this.f6043i);
    }
}
