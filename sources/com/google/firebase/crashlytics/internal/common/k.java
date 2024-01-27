package com.google.firebase.crashlytics.internal.common;

import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class k implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ Callable f13888h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ Executor f13889i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f13890j;

    public /* synthetic */ k(Callable callable, Executor executor, TaskCompletionSource taskCompletionSource) {
        this.f13888h = callable;
        this.f13889i = executor;
        this.f13890j = taskCompletionSource;
    }

    public final void run() {
        Utils.lambda$callTask$3(this.f13888h, this.f13889i, this.f13890j);
    }
}
