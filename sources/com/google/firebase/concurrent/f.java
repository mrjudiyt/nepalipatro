package com.google.firebase.concurrent;

import com.google.firebase.concurrent.DelegatingScheduledFuture;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class f implements DelegatingScheduledFuture.Resolver {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ DelegatingScheduledExecutorService f13829a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Runnable f13830b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ long f13831c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ TimeUnit f13832d;

    public /* synthetic */ f(DelegatingScheduledExecutorService delegatingScheduledExecutorService, Runnable runnable, long j10, TimeUnit timeUnit) {
        this.f13829a = delegatingScheduledExecutorService;
        this.f13830b = runnable;
        this.f13831c = j10;
        this.f13832d = timeUnit;
    }

    public final ScheduledFuture addCompleter(DelegatingScheduledFuture.Completer completer) {
        return this.f13829a.lambda$schedule$2(this.f13830b, this.f13831c, this.f13832d, completer);
    }
}
