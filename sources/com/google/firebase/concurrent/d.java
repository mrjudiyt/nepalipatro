package com.google.firebase.concurrent;

import com.google.firebase.concurrent.DelegatingScheduledFuture;
import java.util.concurrent.Callable;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class d implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ DelegatingScheduledExecutorService f13821a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Callable f13822b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ DelegatingScheduledFuture.Completer f13823c;

    public /* synthetic */ d(DelegatingScheduledExecutorService delegatingScheduledExecutorService, Callable callable, DelegatingScheduledFuture.Completer completer) {
        this.f13821a = delegatingScheduledExecutorService;
        this.f13822b = callable;
        this.f13823c = completer;
    }

    public final Object call() {
        return this.f13821a.lambda$schedule$4(this.f13822b, this.f13823c);
    }
}
