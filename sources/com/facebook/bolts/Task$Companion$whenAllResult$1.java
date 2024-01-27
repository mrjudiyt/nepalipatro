package com.facebook.bolts;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.m;

/* compiled from: Task.kt */
public final class Task$Companion$whenAllResult$1 implements Continuation<Void, List<? extends TResult>> {
    final /* synthetic */ Collection<Task<TResult>> $tasks;

    Task$Companion$whenAllResult$1(Collection<Task<TResult>> collection) {
        this.$tasks = collection;
    }

    public List<TResult> then(Task<Void> task) {
        m.f(task, "task");
        if (this.$tasks.isEmpty()) {
            return p.e();
        }
        ArrayList arrayList = new ArrayList();
        for (Task<TResult> result : this.$tasks) {
            arrayList.add(result.getResult());
        }
        return arrayList;
    }
}
