package com.google.firebase.crashlytics.internal.common;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class g implements Continuation {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f13884a;

    public /* synthetic */ g(TaskCompletionSource taskCompletionSource) {
        this.f13884a = taskCompletionSource;
    }

    public final Object then(Task task) {
        return Utils.lambda$race$1(this.f13884a, task);
    }
}
