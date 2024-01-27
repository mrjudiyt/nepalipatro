package com.facebook.bolts;

import com.facebook.bolts.Task;

/* compiled from: UnobservedErrorNotifier.kt */
public final class UnobservedErrorNotifier {
    private Task<?> task;

    public UnobservedErrorNotifier(Task<?> task2) {
        this.task = task2;
    }

    public final void finalize() {
        Task.UnobservedExceptionHandler unobservedExceptionHandler;
        Task<?> task2 = this.task;
        if (task2 != null && (unobservedExceptionHandler = Task.Companion.getUnobservedExceptionHandler()) != null) {
            unobservedExceptionHandler.unobservedException(task2, new UnobservedTaskException(task2.getError()));
        }
    }

    public final void setObserved() {
        this.task = null;
    }
}
