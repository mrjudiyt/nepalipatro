package com.google.firebase.crashlytics.internal.common;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.CountDownLatch;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class j implements Continuation {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CountDownLatch f13887a;

    public /* synthetic */ j(CountDownLatch countDownLatch) {
        this.f13887a = countDownLatch;
    }

    public final Object then(Task task) {
        return this.f13887a.countDown();
    }
}
