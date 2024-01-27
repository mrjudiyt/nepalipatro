package com.google.firebase.messaging;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.ScheduledFuture;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class e0 implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ScheduledFuture f13955a;

    public /* synthetic */ e0(ScheduledFuture scheduledFuture) {
        this.f13955a = scheduledFuture;
    }

    public final void onComplete(Task task) {
        this.f13955a.cancel(false);
    }
}
