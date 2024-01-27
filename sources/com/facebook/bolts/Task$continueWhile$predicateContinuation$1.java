package com.facebook.bolts;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.m;

/* compiled from: Task.kt */
public final class Task$continueWhile$predicateContinuation$1 implements Continuation<Void, Task<Void>> {
    final /* synthetic */ Continuation<Void, Task<Void>> $continuation;
    final /* synthetic */ CancellationToken $ct;
    final /* synthetic */ Executor $executor;
    final /* synthetic */ Callable<Boolean> $predicate;

    Task$continueWhile$predicateContinuation$1(CancellationToken cancellationToken, Callable<Boolean> callable, Continuation<Void, Task<Void>> continuation, Executor executor) {
        this.$ct = cancellationToken;
        this.$predicate = callable;
        this.$continuation = continuation;
        this.$executor = executor;
    }

    public Task<Void> then(Task<Void> task) {
        m.f(task, "task");
        CancellationToken cancellationToken = this.$ct;
        if (cancellationToken != null && cancellationToken.isCancellationRequested()) {
            return Task.Companion.cancelled();
        }
        Boolean call = this.$predicate.call();
        m.e(call, "predicate.call()");
        if (call.booleanValue()) {
            return Task.Companion.forResult(null).onSuccessTask(this.$continuation, this.$executor).onSuccessTask(this, this.$executor);
        }
        return Task.Companion.forResult(null);
    }
}
