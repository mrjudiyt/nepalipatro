package com.google.firebase.concurrent;

import com.google.firebase.concurrent.DelegatingScheduledFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class g implements DelegatingScheduledFuture.Resolver {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ DelegatingScheduledExecutorService f13833a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Callable f13834b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ long f13835c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ TimeUnit f13836d;

    public /* synthetic */ g(DelegatingScheduledExecutorService delegatingScheduledExecutorService, Callable callable, long j10, TimeUnit timeUnit) {
        this.f13833a = delegatingScheduledExecutorService;
        this.f13834b = callable;
        this.f13835c = j10;
        this.f13836d = timeUnit;
    }

    public final ScheduledFuture addCompleter(DelegatingScheduledFuture.Completer completer) {
        return this.f13833a.lambda$schedule$5(this.f13834b, this.f13835c, this.f13836d, completer);
    }
}
