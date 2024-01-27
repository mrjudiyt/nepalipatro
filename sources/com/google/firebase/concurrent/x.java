package com.google.firebase.concurrent;

import java.util.concurrent.Callable;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class x implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Runnable f13863a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f13864b;

    public /* synthetic */ x(Runnable runnable, Object obj) {
        this.f13863a = runnable;
        this.f13864b = obj;
    }

    public final Object call() {
        return this.f13863a.run();
    }
}
