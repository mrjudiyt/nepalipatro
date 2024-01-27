package com.facebook.bolts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.m;

/* compiled from: Task.kt */
final class Task$Companion$whenAll$1<TTaskResult, TContinuationResult> implements Continuation {
    final /* synthetic */ TaskCompletionSource<Void> $allFinished;
    final /* synthetic */ ArrayList<Exception> $causes;
    final /* synthetic */ AtomicInteger $count;
    final /* synthetic */ ReentrantLock $errorLock;
    final /* synthetic */ AtomicBoolean $isCancelled;

    Task$Companion$whenAll$1(ReentrantLock reentrantLock, AtomicBoolean atomicBoolean, AtomicInteger atomicInteger, ArrayList<Exception> arrayList, TaskCompletionSource<Void> taskCompletionSource) {
        this.$errorLock = reentrantLock;
        this.$isCancelled = atomicBoolean;
        this.$count = atomicInteger;
        this.$causes = arrayList;
        this.$allFinished = taskCompletionSource;
    }

    public final Void then(Task<Object> task) {
        m.f(task, "it");
        if (task.isFaulted()) {
            ReentrantLock reentrantLock = this.$errorLock;
            ArrayList<Exception> arrayList = this.$causes;
            reentrantLock.lock();
            try {
                arrayList.add(task.getError());
            } finally {
                reentrantLock.unlock();
            }
        }
        if (task.isCancelled()) {
            this.$isCancelled.set(true);
        }
        if (this.$count.decrementAndGet() == 0) {
            if (this.$causes.size() != 0) {
                if (this.$causes.size() == 1) {
                    this.$allFinished.setError(this.$causes.get(0));
                } else {
                    b0 b0Var = b0.f15559a;
                    String format = String.format("There were %d exceptions.", Arrays.copyOf(new Object[]{Integer.valueOf(this.$causes.size())}, 1));
                    m.e(format, "java.lang.String.format(format, *args)");
                    this.$allFinished.setError(new AggregateException(format, this.$causes));
                }
            } else if (this.$isCancelled.get()) {
                this.$allFinished.setCancelled();
            } else {
                this.$allFinished.setResult(null);
            }
        }
        return null;
    }
}
