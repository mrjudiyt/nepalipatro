package com.google.firebase.messaging;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class e implements Continuation {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ e f13954a = new e();

    private /* synthetic */ e() {
    }

    public final Object then(Task task) {
        return FcmBroadcastProcessor.lambda$startMessagingService$1(task);
    }
}
