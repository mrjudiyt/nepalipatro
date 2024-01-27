package com.google.firebase.concurrent;

import java.util.concurrent.Callable;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class z implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Runnable f13866a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f13867b;

    public /* synthetic */ z(Runnable runnable, Object obj) {
        this.f13866a = runnable;
        this.f13867b = obj;
    }

    public final Object call() {
        return this.f13866a.run();
    }
}
