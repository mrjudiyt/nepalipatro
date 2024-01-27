package com.facebook.internal;

import com.facebook.FacebookSdk;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.FutureTask;
import kotlin.jvm.internal.m;

/* compiled from: LockOnGetVariable.kt */
public final class LockOnGetVariable<T> {
    private CountDownLatch initLatch;
    private T storedValue;

    public LockOnGetVariable(T t10) {
        this.storedValue = t10;
    }

    /* access modifiers changed from: private */
    /* renamed from: _init_$lambda-0  reason: not valid java name */
    public static final Void m103_init_$lambda0(LockOnGetVariable lockOnGetVariable, Callable callable) {
        m.f(lockOnGetVariable, "this$0");
        m.f(callable, "$callable");
        try {
            lockOnGetVariable.storedValue = callable.call();
        } finally {
            CountDownLatch countDownLatch = lockOnGetVariable.initLatch;
            if (countDownLatch != null) {
                countDownLatch.countDown();
            }
        }
    }

    private final void waitOnInit() {
        CountDownLatch countDownLatch = this.initLatch;
        if (countDownLatch != null) {
            try {
                countDownLatch.await();
            } catch (InterruptedException unused) {
            }
        }
    }

    public final T getValue() {
        waitOnInit();
        return this.storedValue;
    }

    public LockOnGetVariable(Callable<T> callable) {
        m.f(callable, "callable");
        this.initLatch = new CountDownLatch(1);
        FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
        FacebookSdk.getExecutor().execute(new FutureTask(new o(this, callable)));
    }
}
