package com.facebook.bolts;

import com.facebook.bolts.Task;
import java.util.concurrent.Callable;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class l implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ CancellationToken f6038h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f6039i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ Callable f6040j;

    public /* synthetic */ l(CancellationToken cancellationToken, TaskCompletionSource taskCompletionSource, Callable callable) {
        this.f6038h = cancellationToken;
        this.f6039i = taskCompletionSource;
        this.f6040j = callable;
    }

    public final void run() {
        Task.Companion.m81call$lambda2(this.f6038h, this.f6039i, this.f6040j);
    }
}
