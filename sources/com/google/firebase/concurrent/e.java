package com.google.firebase.concurrent;

import com.google.firebase.concurrent.DelegatingScheduledFuture;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class e implements DelegatingScheduledFuture.Resolver {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ DelegatingScheduledExecutorService f13824a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Runnable f13825b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ long f13826c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ long f13827d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ TimeUnit f13828e;

    public /* synthetic */ e(DelegatingScheduledExecutorService delegatingScheduledExecutorService, Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        this.f13824a = delegatingScheduledExecutorService;
        this.f13825b = runnable;
        this.f13826c = j10;
        this.f13827d = j11;
        this.f13828e = timeUnit;
    }

    public final ScheduledFuture addCompleter(DelegatingScheduledFuture.Completer completer) {
        return this.f13824a.lambda$scheduleWithFixedDelay$11(this.f13825b, this.f13826c, this.f13827d, this.f13828e, completer);
    }
}
