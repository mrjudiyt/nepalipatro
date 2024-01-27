package com.facebook.bolts;

import com.facebook.bolts.Task;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class m implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f6041h;

    public /* synthetic */ m(TaskCompletionSource taskCompletionSource) {
        this.f6041h = taskCompletionSource;
    }

    public final void run() {
        Task.Companion.m85delay$lambda0(this.f6041h);
    }
}
