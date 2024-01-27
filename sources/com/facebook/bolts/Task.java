package com.facebook.bolts;

import com.facebook.bolts.BoltsExecutors;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;
import o8.q;

/* compiled from: Task.kt */
public final class Task<TResult> {
    public static final ExecutorService BACKGROUND_EXECUTOR;
    public static final Companion Companion = new Companion((g) null);
    /* access modifiers changed from: private */
    public static final Executor IMMEDIATE_EXECUTOR;
    /* access modifiers changed from: private */
    public static final Task<?> TASK_CANCELLED = new Task<>(true);
    /* access modifiers changed from: private */
    public static final Task<Boolean> TASK_FALSE = new Task<>(Boolean.FALSE);
    /* access modifiers changed from: private */
    public static final Task<?> TASK_NULL = new Task<>((Object) null);
    /* access modifiers changed from: private */
    public static final Task<Boolean> TASK_TRUE = new Task<>(Boolean.TRUE);
    public static final Executor UI_THREAD_EXECUTOR = AndroidExecutors.Companion.uiThread();
    /* access modifiers changed from: private */
    public static volatile UnobservedExceptionHandler unobservedExceptionHandler;
    private boolean cancelledField;
    private boolean completeField;
    private final Condition condition;
    private List<Continuation<TResult, Void>> continuations = new ArrayList();
    private Exception errorField;
    private boolean errorHasBeenObserved;
    private final ReentrantLock lock;
    private TResult resultField;
    private UnobservedErrorNotifier unobservedErrorNotifier;

    /* compiled from: Task.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        /* access modifiers changed from: private */
        /* renamed from: call$lambda-2  reason: not valid java name */
        public static final void m81call$lambda2(CancellationToken cancellationToken, TaskCompletionSource taskCompletionSource, Callable callable) {
            m.f(taskCompletionSource, "$tcs");
            m.f(callable, "$callable");
            if (cancellationToken == null || !cancellationToken.isCancellationRequested()) {
                try {
                    taskCompletionSource.setResult(callable.call());
                } catch (CancellationException unused) {
                    taskCompletionSource.setCancelled();
                } catch (Exception e10) {
                    taskCompletionSource.setError(e10);
                }
            } else {
                taskCompletionSource.setCancelled();
            }
        }

        /* access modifiers changed from: private */
        public final <TContinuationResult, TResult> void completeAfterTask(TaskCompletionSource<TContinuationResult> taskCompletionSource, Continuation<TResult, Task<TContinuationResult>> continuation, Task<TResult> task, Executor executor, CancellationToken cancellationToken) {
            try {
                executor.execute(new j(cancellationToken, taskCompletionSource, continuation, task));
            } catch (Exception e10) {
                taskCompletionSource.setError(new ExecutorException(e10));
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: completeAfterTask$lambda-7  reason: not valid java name */
        public static final void m82completeAfterTask$lambda7(CancellationToken cancellationToken, TaskCompletionSource taskCompletionSource, Continuation continuation, Task task) {
            m.f(taskCompletionSource, "$tcs");
            m.f(continuation, "$continuation");
            m.f(task, "$task");
            if (cancellationToken == null || !cancellationToken.isCancellationRequested()) {
                try {
                    Task task2 = (Task) continuation.then(task);
                    if (task2 == null) {
                        taskCompletionSource.setResult(null);
                    } else {
                        task2.continueWith(new g(cancellationToken, taskCompletionSource));
                    }
                } catch (CancellationException unused) {
                    taskCompletionSource.setCancelled();
                } catch (Exception e10) {
                    taskCompletionSource.setError(e10);
                }
            } else {
                taskCompletionSource.setCancelled();
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: completeAfterTask$lambda-7$lambda-6  reason: not valid java name */
        public static final Void m83completeAfterTask$lambda7$lambda6(CancellationToken cancellationToken, TaskCompletionSource taskCompletionSource, Task task) {
            m.f(taskCompletionSource, "$tcs");
            m.f(task, "task");
            if (cancellationToken == null || !cancellationToken.isCancellationRequested()) {
                if (task.isCancelled()) {
                    taskCompletionSource.setCancelled();
                } else if (task.isFaulted()) {
                    taskCompletionSource.setError(task.getError());
                } else {
                    taskCompletionSource.setResult(task.getResult());
                }
                return null;
            }
            taskCompletionSource.setCancelled();
            return null;
        }

        /* access modifiers changed from: private */
        public final <TContinuationResult, TResult> void completeImmediately(TaskCompletionSource<TContinuationResult> taskCompletionSource, Continuation<TResult, TContinuationResult> continuation, Task<TResult> task, Executor executor, CancellationToken cancellationToken) {
            try {
                executor.execute(new k(cancellationToken, taskCompletionSource, continuation, task));
            } catch (Exception e10) {
                taskCompletionSource.setError(new ExecutorException(e10));
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: completeImmediately$lambda-5  reason: not valid java name */
        public static final void m84completeImmediately$lambda5(CancellationToken cancellationToken, TaskCompletionSource taskCompletionSource, Continuation continuation, Task task) {
            m.f(taskCompletionSource, "$tcs");
            m.f(continuation, "$continuation");
            m.f(task, "$task");
            if (cancellationToken == null || !cancellationToken.isCancellationRequested()) {
                try {
                    taskCompletionSource.setResult(continuation.then(task));
                } catch (CancellationException unused) {
                    taskCompletionSource.setCancelled();
                } catch (Exception e10) {
                    taskCompletionSource.setError(e10);
                }
            } else {
                taskCompletionSource.setCancelled();
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: delay$lambda-0  reason: not valid java name */
        public static final void m85delay$lambda0(TaskCompletionSource taskCompletionSource) {
            m.f(taskCompletionSource, "$tcs");
            taskCompletionSource.trySetResult(null);
        }

        /* access modifiers changed from: private */
        /* renamed from: delay$lambda-1  reason: not valid java name */
        public static final void m86delay$lambda1(ScheduledFuture scheduledFuture, TaskCompletionSource taskCompletionSource) {
            m.f(taskCompletionSource, "$tcs");
            scheduledFuture.cancel(true);
            taskCompletionSource.trySetCancelled();
        }

        /* access modifiers changed from: private */
        /* renamed from: whenAny$lambda-4  reason: not valid java name */
        public static final Void m87whenAny$lambda4(AtomicBoolean atomicBoolean, TaskCompletionSource taskCompletionSource, Task task) {
            m.f(atomicBoolean, "$isAnyTaskComplete");
            m.f(taskCompletionSource, "$firstCompleted");
            m.f(task, "it");
            if (atomicBoolean.compareAndSet(false, true)) {
                taskCompletionSource.setResult(task);
                return null;
            }
            task.getError();
            return null;
        }

        /* access modifiers changed from: private */
        /* renamed from: whenAnyResult$lambda-3  reason: not valid java name */
        public static final Void m88whenAnyResult$lambda3(AtomicBoolean atomicBoolean, TaskCompletionSource taskCompletionSource, Task task) {
            m.f(atomicBoolean, "$isAnyTaskComplete");
            m.f(taskCompletionSource, "$firstCompleted");
            m.f(task, "it");
            if (atomicBoolean.compareAndSet(false, true)) {
                taskCompletionSource.setResult(task);
                return null;
            }
            task.getError();
            return null;
        }

        public final <TResult> Task<TResult> call(Callable<TResult> callable, Executor executor) {
            m.f(callable, "callable");
            m.f(executor, "executor");
            return call(callable, executor, (CancellationToken) null);
        }

        public final <TResult> Task<TResult> callInBackground(Callable<TResult> callable) {
            m.f(callable, "callable");
            return call(callable, Task.BACKGROUND_EXECUTOR, (CancellationToken) null);
        }

        public final <TResult> Task<TResult> cancelled() {
            return Task.TASK_CANCELLED;
        }

        public final Task<Void> delay(long j10) {
            return delay$facebook_bolts_release(j10, BoltsExecutors.Companion.scheduled$facebook_bolts_release(), (CancellationToken) null);
        }

        public final Task<Void> delay$facebook_bolts_release(long j10, ScheduledExecutorService scheduledExecutorService, CancellationToken cancellationToken) {
            m.f(scheduledExecutorService, "executor");
            if (cancellationToken != null && cancellationToken.isCancellationRequested()) {
                return cancelled();
            }
            if (j10 <= 0) {
                return forResult((Object) null);
            }
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            ScheduledFuture<?> schedule = scheduledExecutorService.schedule(new m(taskCompletionSource), j10, TimeUnit.MILLISECONDS);
            if (cancellationToken != null) {
                cancellationToken.register(new n(schedule, taskCompletionSource));
            }
            return taskCompletionSource.getTask();
        }

        public final <TResult> Task<TResult> forError(Exception exc) {
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            taskCompletionSource.setError(exc);
            return taskCompletionSource.getTask();
        }

        public final <TResult> Task<TResult> forResult(TResult tresult) {
            if (tresult == null) {
                return Task.TASK_NULL;
            }
            if (tresult instanceof Boolean) {
                return ((Boolean) tresult).booleanValue() ? Task.TASK_TRUE : Task.TASK_FALSE;
            }
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            taskCompletionSource.setResult(tresult);
            return taskCompletionSource.getTask();
        }

        public final UnobservedExceptionHandler getUnobservedExceptionHandler() {
            return Task.unobservedExceptionHandler;
        }

        public final void setUnobservedExceptionHandler(UnobservedExceptionHandler unobservedExceptionHandler) {
            Task.unobservedExceptionHandler = unobservedExceptionHandler;
        }

        public final Task<Void> whenAll(Collection<? extends Task<?>> collection) {
            m.f(collection, "tasks");
            if (collection.isEmpty()) {
                return forResult((Object) null);
            }
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            ArrayList arrayList = new ArrayList();
            ReentrantLock reentrantLock = new ReentrantLock();
            AtomicInteger atomicInteger = new AtomicInteger(collection.size());
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            for (Task continueWith : collection) {
                continueWith.continueWith(new Task$Companion$whenAll$1(reentrantLock, atomicBoolean, atomicInteger, arrayList, taskCompletionSource));
            }
            return taskCompletionSource.getTask();
        }

        public final <TResult> Task<List<TResult>> whenAllResult(Collection<Task<TResult>> collection) {
            m.f(collection, "tasks");
            return whenAll(collection).onSuccess(new Task$Companion$whenAllResult$1(collection));
        }

        public final Task<Task<?>> whenAny(Collection<? extends Task<?>> collection) {
            m.f(collection, "tasks");
            if (collection.isEmpty()) {
                return forResult((Object) null);
            }
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            for (Task continueWith : collection) {
                continueWith.continueWith(new i(atomicBoolean, taskCompletionSource));
            }
            return taskCompletionSource.getTask();
        }

        public final <TResult> Task<Task<TResult>> whenAnyResult(Collection<Task<TResult>> collection) {
            m.f(collection, "tasks");
            if (collection.isEmpty()) {
                return forResult((Object) null);
            }
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            for (Task<TResult> continueWith : collection) {
                continueWith.continueWith(new h(atomicBoolean, taskCompletionSource));
            }
            return taskCompletionSource.getTask();
        }

        public final <TResult> Task<TResult> call(Callable<TResult> callable, Executor executor, CancellationToken cancellationToken) {
            m.f(callable, "callable");
            m.f(executor, "executor");
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            try {
                executor.execute(new l(cancellationToken, taskCompletionSource, callable));
            } catch (Exception e10) {
                taskCompletionSource.setError(new ExecutorException(e10));
            }
            return taskCompletionSource.getTask();
        }

        public final <TResult> Task<TResult> callInBackground(Callable<TResult> callable, CancellationToken cancellationToken) {
            m.f(callable, "callable");
            return call(callable, Task.BACKGROUND_EXECUTOR, cancellationToken);
        }

        public final Task<Void> delay(long j10, CancellationToken cancellationToken) {
            return delay$facebook_bolts_release(j10, BoltsExecutors.Companion.scheduled$facebook_bolts_release(), cancellationToken);
        }

        public final <TResult> Task<TResult> call(Callable<TResult> callable) {
            m.f(callable, "callable");
            return call(callable, Task.IMMEDIATE_EXECUTOR, (CancellationToken) null);
        }

        public final <TResult> Task<TResult> call(Callable<TResult> callable, CancellationToken cancellationToken) {
            m.f(callable, "callable");
            return call(callable, Task.IMMEDIATE_EXECUTOR, cancellationToken);
        }
    }

    /* compiled from: Task.kt */
    public final class TaskCompletionSource extends TaskCompletionSource<TResult> {
        final /* synthetic */ Task<TResult> this$0;

        public TaskCompletionSource(Task task) {
            m.f(task, "this$0");
            this.this$0 = task;
        }
    }

    /* compiled from: Task.kt */
    public interface UnobservedExceptionHandler {
        void unobservedException(Task<?> task, UnobservedTaskException unobservedTaskException);
    }

    static {
        BoltsExecutors.Companion companion = BoltsExecutors.Companion;
        BACKGROUND_EXECUTOR = companion.background();
        IMMEDIATE_EXECUTOR = companion.immediate$facebook_bolts_release();
    }

    public Task() {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.lock = reentrantLock;
        this.condition = reentrantLock.newCondition();
    }

    public static final <TResult> Task<TResult> call(Callable<TResult> callable) {
        return Companion.call(callable);
    }

    public static final <TResult> Task<TResult> call(Callable<TResult> callable, CancellationToken cancellationToken) {
        return Companion.call(callable, cancellationToken);
    }

    public static final <TResult> Task<TResult> call(Callable<TResult> callable, Executor executor) {
        return Companion.call(callable, executor);
    }

    public static final <TResult> Task<TResult> call(Callable<TResult> callable, Executor executor, CancellationToken cancellationToken) {
        return Companion.call(callable, executor, cancellationToken);
    }

    public static final <TResult> Task<TResult> callInBackground(Callable<TResult> callable) {
        return Companion.callInBackground(callable);
    }

    public static final <TResult> Task<TResult> callInBackground(Callable<TResult> callable, CancellationToken cancellationToken) {
        return Companion.callInBackground(callable, cancellationToken);
    }

    public static final <TResult> Task<TResult> cancelled() {
        return Companion.cancelled();
    }

    public static /* synthetic */ Task continueWhile$default(Task task, Callable callable, Continuation continuation, Executor executor, CancellationToken cancellationToken, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            executor = IMMEDIATE_EXECUTOR;
        }
        if ((i10 & 8) != 0) {
            cancellationToken = null;
        }
        return task.continueWhile(callable, continuation, executor, cancellationToken);
    }

    /* access modifiers changed from: private */
    /* renamed from: continueWith$lambda-10$lambda-9  reason: not valid java name */
    public static final Void m76continueWith$lambda10$lambda9(TaskCompletionSource taskCompletionSource, Continuation continuation, Executor executor, CancellationToken cancellationToken, Task task) {
        m.f(taskCompletionSource, "$tcs");
        m.f(continuation, "$continuation");
        m.f(executor, "$executor");
        m.f(task, "task");
        Companion.completeImmediately(taskCompletionSource, continuation, task, executor, cancellationToken);
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: continueWithTask$lambda-12$lambda-11  reason: not valid java name */
    public static final Void m77continueWithTask$lambda12$lambda11(TaskCompletionSource taskCompletionSource, Continuation continuation, Executor executor, CancellationToken cancellationToken, Task task) {
        m.f(taskCompletionSource, "$tcs");
        m.f(continuation, "$continuation");
        m.f(executor, "$executor");
        m.f(task, "task");
        Companion.completeAfterTask(taskCompletionSource, continuation, task, executor, cancellationToken);
        return null;
    }

    public static final Task<Void> delay(long j10) {
        return Companion.delay(j10);
    }

    public static final Task<Void> delay(long j10, CancellationToken cancellationToken) {
        return Companion.delay(j10, cancellationToken);
    }

    public static final Task<Void> delay$facebook_bolts_release(long j10, ScheduledExecutorService scheduledExecutorService, CancellationToken cancellationToken) {
        return Companion.delay$facebook_bolts_release(j10, scheduledExecutorService, cancellationToken);
    }

    public static final <TResult> Task<TResult> forError(Exception exc) {
        return Companion.forError(exc);
    }

    public static final <TResult> Task<TResult> forResult(TResult tresult) {
        return Companion.forResult(tresult);
    }

    public static final UnobservedExceptionHandler getUnobservedExceptionHandler() {
        return Companion.getUnobservedExceptionHandler();
    }

    /* access modifiers changed from: private */
    /* renamed from: makeVoid$lambda-8  reason: not valid java name */
    public static final Task m78makeVoid$lambda8(Task task) {
        m.f(task, "task");
        if (task.isCancelled()) {
            return Companion.cancelled();
        }
        if (task.isFaulted()) {
            return Companion.forError(task.getError());
        }
        return Companion.forResult(null);
    }

    /* access modifiers changed from: private */
    /* renamed from: onSuccess$lambda-13  reason: not valid java name */
    public static final Task m79onSuccess$lambda13(CancellationToken cancellationToken, Continuation continuation, Task task) {
        m.f(continuation, "$continuation");
        m.f(task, "task");
        if (cancellationToken != null && cancellationToken.isCancellationRequested()) {
            return Companion.cancelled();
        }
        if (task.isFaulted()) {
            return Companion.forError(task.getError());
        }
        if (task.isCancelled()) {
            return Companion.cancelled();
        }
        return task.continueWith(continuation);
    }

    /* access modifiers changed from: private */
    /* renamed from: onSuccessTask$lambda-14  reason: not valid java name */
    public static final Task m80onSuccessTask$lambda14(CancellationToken cancellationToken, Continuation continuation, Task task) {
        m.f(continuation, "$continuation");
        m.f(task, "task");
        if (cancellationToken != null && cancellationToken.isCancellationRequested()) {
            return Companion.cancelled();
        }
        if (task.isFaulted()) {
            return Companion.forError(task.getError());
        }
        if (task.isCancelled()) {
            return Companion.cancelled();
        }
        return task.continueWithTask(continuation);
    }

    private final void runContinuations() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            List<Continuation<TResult, Void>> list = this.continuations;
            if (list != null) {
                for (Continuation then : list) {
                    then.then(this);
                }
            }
            this.continuations = null;
            q qVar = q.f16189a;
            reentrantLock.unlock();
        } catch (RuntimeException e10) {
            throw e10;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public static final void setUnobservedExceptionHandler(UnobservedExceptionHandler unobservedExceptionHandler2) {
        Companion.setUnobservedExceptionHandler(unobservedExceptionHandler2);
    }

    public static final Task<Void> whenAll(Collection<? extends Task<?>> collection) {
        return Companion.whenAll(collection);
    }

    public static final <TResult> Task<List<TResult>> whenAllResult(Collection<Task<TResult>> collection) {
        return Companion.whenAllResult(collection);
    }

    public static final Task<Task<?>> whenAny(Collection<? extends Task<?>> collection) {
        return Companion.whenAny(collection);
    }

    public static final <TResult> Task<Task<TResult>> whenAnyResult(Collection<Task<TResult>> collection) {
        return Companion.whenAnyResult(collection);
    }

    public final <TOut> Task<TOut> cast() {
        return this;
    }

    public final Task<Void> continueWhile(Callable<Boolean> callable, Continuation<Void, Task<Void>> continuation) {
        m.f(callable, "predicate");
        m.f(continuation, "continuation");
        return continueWhile(callable, continuation, IMMEDIATE_EXECUTOR, (CancellationToken) null);
    }

    public final <TContinuationResult> Task<TContinuationResult> continueWith(Continuation<TResult, TContinuationResult> continuation, Executor executor) {
        m.f(continuation, "continuation");
        m.f(executor, "executor");
        return continueWith(continuation, executor, (CancellationToken) null);
    }

    public final <TContinuationResult> Task<TContinuationResult> continueWithTask(Continuation<TResult, Task<TContinuationResult>> continuation, Executor executor) {
        m.f(continuation, "continuation");
        m.f(executor, "executor");
        return continueWithTask(continuation, executor, (CancellationToken) null);
    }

    public final Exception getError() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (this.errorField != null) {
                this.errorHasBeenObserved = true;
                UnobservedErrorNotifier unobservedErrorNotifier2 = this.unobservedErrorNotifier;
                if (unobservedErrorNotifier2 != null) {
                    unobservedErrorNotifier2.setObserved();
                    this.unobservedErrorNotifier = null;
                }
            }
            return this.errorField;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final TResult getResult() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            return this.resultField;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean isCancelled() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            return this.cancelledField;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean isCompleted() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            return this.completeField;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean isFaulted() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            return this.errorField != null;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final Task<Void> makeVoid() {
        return continueWithTask(f.f6023a);
    }

    public final <TContinuationResult> Task<TContinuationResult> onSuccess(Continuation<TResult, TContinuationResult> continuation, Executor executor) {
        m.f(continuation, "continuation");
        m.f(executor, "executor");
        return onSuccess(continuation, executor, (CancellationToken) null);
    }

    public final <TContinuationResult> Task<TContinuationResult> onSuccessTask(Continuation<TResult, Task<TContinuationResult>> continuation, Executor executor) {
        m.f(continuation, "continuation");
        m.f(executor, "executor");
        return onSuccessTask(continuation, executor, (CancellationToken) null);
    }

    public final boolean trySetCancelled() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (this.completeField) {
                return false;
            }
            this.completeField = true;
            this.cancelledField = true;
            this.condition.signalAll();
            runContinuations();
            reentrantLock.unlock();
            return true;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean trySetError(Exception exc) {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (this.completeField) {
                return false;
            }
            this.completeField = true;
            this.errorField = exc;
            this.errorHasBeenObserved = false;
            this.condition.signalAll();
            runContinuations();
            if (!this.errorHasBeenObserved && unobservedExceptionHandler != null) {
                this.unobservedErrorNotifier = new UnobservedErrorNotifier(this);
            }
            reentrantLock.unlock();
            return true;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean trySetResult(TResult tresult) {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (this.completeField) {
                return false;
            }
            this.completeField = true;
            this.resultField = tresult;
            this.condition.signalAll();
            runContinuations();
            reentrantLock.unlock();
            return true;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void waitForCompletion() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (!isCompleted()) {
                this.condition.await();
            }
            q qVar = q.f16189a;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final Task<Void> continueWhile(Callable<Boolean> callable, Continuation<Void, Task<Void>> continuation, CancellationToken cancellationToken) {
        m.f(callable, "predicate");
        m.f(continuation, "continuation");
        return continueWhile(callable, continuation, IMMEDIATE_EXECUTOR, cancellationToken);
    }

    public final <TContinuationResult> Task<TContinuationResult> continueWith(Continuation<TResult, TContinuationResult> continuation, Executor executor, CancellationToken cancellationToken) {
        m.f(continuation, "continuation");
        m.f(executor, "executor");
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            boolean isCompleted = isCompleted();
            if (!isCompleted) {
                List<Continuation<TResult, Void>> list = this.continuations;
                if (list != null) {
                    list.add(new d(taskCompletionSource, continuation, executor, cancellationToken));
                }
            }
            q qVar = q.f16189a;
            if (isCompleted) {
                Companion.completeImmediately(taskCompletionSource, continuation, this, executor, cancellationToken);
            }
            return taskCompletionSource.getTask();
        } finally {
            reentrantLock.unlock();
        }
    }

    public final <TContinuationResult> Task<TContinuationResult> continueWithTask(Continuation<TResult, Task<TContinuationResult>> continuation, Executor executor, CancellationToken cancellationToken) {
        m.f(continuation, "continuation");
        m.f(executor, "executor");
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            boolean isCompleted = isCompleted();
            if (!isCompleted) {
                List<Continuation<TResult, Void>> list = this.continuations;
                if (list != null) {
                    list.add(new e(taskCompletionSource, continuation, executor, cancellationToken));
                }
            }
            q qVar = q.f16189a;
            if (isCompleted) {
                Companion.completeAfterTask(taskCompletionSource, continuation, this, executor, cancellationToken);
            }
            return taskCompletionSource.getTask();
        } finally {
            reentrantLock.unlock();
        }
    }

    public final <TContinuationResult> Task<TContinuationResult> onSuccess(Continuation<TResult, TContinuationResult> continuation, Executor executor, CancellationToken cancellationToken) {
        m.f(continuation, "continuation");
        m.f(executor, "executor");
        return continueWithTask(new b(cancellationToken, continuation), executor);
    }

    public final <TContinuationResult> Task<TContinuationResult> onSuccessTask(Continuation<TResult, Task<TContinuationResult>> continuation, Executor executor, CancellationToken cancellationToken) {
        m.f(continuation, "continuation");
        m.f(executor, "executor");
        return continueWithTask(new c(cancellationToken, continuation), executor);
    }

    public final Task<Void> continueWhile(Callable<Boolean> callable, Continuation<Void, Task<Void>> continuation, Executor executor, CancellationToken cancellationToken) {
        m.f(callable, "predicate");
        m.f(continuation, "continuation");
        m.f(executor, "executor");
        return makeVoid().continueWithTask(new Task$continueWhile$predicateContinuation$1(cancellationToken, callable, continuation, executor), executor);
    }

    public final <TContinuationResult> Task<TContinuationResult> onSuccess(Continuation<TResult, TContinuationResult> continuation) {
        m.f(continuation, "continuation");
        return onSuccess(continuation, IMMEDIATE_EXECUTOR, (CancellationToken) null);
    }

    public final <TContinuationResult> Task<TContinuationResult> onSuccessTask(Continuation<TResult, Task<TContinuationResult>> continuation) {
        m.f(continuation, "continuation");
        return onSuccessTask(continuation, IMMEDIATE_EXECUTOR);
    }

    private Task(TResult tresult) {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.lock = reentrantLock;
        this.condition = reentrantLock.newCondition();
        trySetResult(tresult);
    }

    public final <TContinuationResult> Task<TContinuationResult> onSuccess(Continuation<TResult, TContinuationResult> continuation, CancellationToken cancellationToken) {
        m.f(continuation, "continuation");
        return onSuccess(continuation, IMMEDIATE_EXECUTOR, cancellationToken);
    }

    public final <TContinuationResult> Task<TContinuationResult> onSuccessTask(Continuation<TResult, Task<TContinuationResult>> continuation, CancellationToken cancellationToken) {
        m.f(continuation, "continuation");
        return onSuccessTask(continuation, IMMEDIATE_EXECUTOR, cancellationToken);
    }

    public final boolean waitForCompletion(long j10, TimeUnit timeUnit) {
        m.f(timeUnit, "timeUnit");
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (!isCompleted()) {
                this.condition.await(j10, timeUnit);
            }
            return isCompleted();
        } finally {
            reentrantLock.unlock();
        }
    }

    private Task(boolean z10) {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.lock = reentrantLock;
        this.condition = reentrantLock.newCondition();
        if (z10) {
            trySetCancelled();
        } else {
            trySetResult((Object) null);
        }
    }

    public final <TContinuationResult> Task<TContinuationResult> continueWith(Continuation<TResult, TContinuationResult> continuation) {
        m.f(continuation, "continuation");
        return continueWith(continuation, IMMEDIATE_EXECUTOR, (CancellationToken) null);
    }

    public final <TContinuationResult> Task<TContinuationResult> continueWithTask(Continuation<TResult, Task<TContinuationResult>> continuation) {
        m.f(continuation, "continuation");
        return continueWithTask(continuation, IMMEDIATE_EXECUTOR, (CancellationToken) null);
    }

    public final <TContinuationResult> Task<TContinuationResult> continueWith(Continuation<TResult, TContinuationResult> continuation, CancellationToken cancellationToken) {
        m.f(continuation, "continuation");
        return continueWith(continuation, IMMEDIATE_EXECUTOR, cancellationToken);
    }

    public final <TContinuationResult> Task<TContinuationResult> continueWithTask(Continuation<TResult, Task<TContinuationResult>> continuation, CancellationToken cancellationToken) {
        m.f(continuation, "continuation");
        return continueWithTask(continuation, IMMEDIATE_EXECUTOR, cancellationToken);
    }
}
