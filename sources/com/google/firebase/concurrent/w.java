package com.google.firebase.concurrent;

import java.util.concurrent.Callable;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class w implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Runnable f13862a;

    public /* synthetic */ w(Runnable runnable) {
        this.f13862a = runnable;
    }

    public final Object call() {
        return this.f13862a.run();
    }
}
