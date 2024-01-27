package com.facebook.bolts;

import com.facebook.bolts.Task;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class h implements Continuation {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AtomicBoolean f6026a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f6027b;

    public /* synthetic */ h(AtomicBoolean atomicBoolean, TaskCompletionSource taskCompletionSource) {
        this.f6026a = atomicBoolean;
        this.f6027b = taskCompletionSource;
    }

    public final Object then(Task task) {
        return Task.Companion.m88whenAnyResult$lambda3(this.f6026a, this.f6027b, task);
    }
}
