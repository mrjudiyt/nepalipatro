package com.google.firebase.concurrent;

import java.util.concurrent.Callable;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class y implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Runnable f13865a;

    public /* synthetic */ y(Runnable runnable) {
        this.f13865a = runnable;
    }

    public final Object call() {
        return this.f13865a.run();
    }
}
