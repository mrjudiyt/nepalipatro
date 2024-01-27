package com.facebook.internal;

import com.facebook.internal.WorkQueue;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class w implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ WorkQueue.WorkNode f6097h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ WorkQueue f6098i;

    public /* synthetic */ w(WorkQueue.WorkNode workNode, WorkQueue workQueue) {
        this.f6097h = workNode;
        this.f6098i = workQueue;
    }

    public final void run() {
        WorkQueue.m111execute$lambda2(this.f6097h, this.f6098i);
    }
}
