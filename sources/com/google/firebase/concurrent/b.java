package com.google.firebase.concurrent;

import com.google.firebase.concurrent.DelegatingScheduledFuture;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class b implements DelegatingScheduledFuture.Resolver {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ DelegatingScheduledExecutorService f13814a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Runnable f13815b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ long f13816c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ long f13817d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ TimeUnit f13818e;

    public /* synthetic */ b(DelegatingScheduledExecutorService delegatingScheduledExecutorService, Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        this.f13814a = delegatingScheduledExecutorService;
        this.f13815b = runnable;
        this.f13816c = j10;
        this.f13817d = j11;
        this.f13818e = timeUnit;
    }

    public final ScheduledFuture addCompleter(DelegatingScheduledFuture.Completer completer) {
        return this.f13814a.lambda$scheduleAtFixedRate$8(this.f13815b, this.f13816c, this.f13817d, this.f13818e, completer);
    }
}
