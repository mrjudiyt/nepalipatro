package com.facebook.internal;

import java.util.concurrent.Callable;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class o implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ LockOnGetVariable f6084a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Callable f6085b;

    public /* synthetic */ o(LockOnGetVariable lockOnGetVariable, Callable callable) {
        this.f6084a = lockOnGetVariable;
        this.f6085b = callable;
    }

    public final Object call() {
        return LockOnGetVariable.m103_init_$lambda0(this.f6084a, this.f6085b);
    }
}
