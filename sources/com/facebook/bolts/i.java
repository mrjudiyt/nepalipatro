package com.facebook.bolts;

import com.facebook.bolts.Task;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class i implements Continuation {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AtomicBoolean f6028a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f6029b;

    public /* synthetic */ i(AtomicBoolean atomicBoolean, TaskCompletionSource taskCompletionSource) {
        this.f6028a = atomicBoolean;
        this.f6029b = taskCompletionSource;
    }

    public final Object then(Task task) {
        return Task.Companion.m87whenAny$lambda4(this.f6028a, this.f6029b, task);
    }
}
