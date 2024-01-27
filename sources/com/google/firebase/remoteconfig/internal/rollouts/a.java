package com.google.firebase.remoteconfig.internal.rollouts;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.remoteconfig.internal.ConfigContainer;
import com.google.firebase.remoteconfig.interop.rollouts.RolloutsStateSubscriber;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class a implements OnSuccessListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ RolloutsStateSubscriptionsHandler f14036a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Task f14037b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ RolloutsStateSubscriber f14038c;

    public /* synthetic */ a(RolloutsStateSubscriptionsHandler rolloutsStateSubscriptionsHandler, Task task, RolloutsStateSubscriber rolloutsStateSubscriber) {
        this.f14036a = rolloutsStateSubscriptionsHandler;
        this.f14037b = task;
        this.f14038c = rolloutsStateSubscriber;
    }

    public final void onSuccess(Object obj) {
        this.f14036a.lambda$registerRolloutsStateSubscriber$1(this.f14037b, this.f14038c, (ConfigContainer) obj);
    }
}
