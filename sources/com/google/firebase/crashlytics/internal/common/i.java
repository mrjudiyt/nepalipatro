package com.google.firebase.crashlytics.internal.common;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class i implements Continuation {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f13886a;

    public /* synthetic */ i(TaskCompletionSource taskCompletionSource) {
        this.f13886a = taskCompletionSource;
    }

    public final Object then(Task task) {
        return Utils.lambda$callTask$2(this.f13886a, task);
    }
}
