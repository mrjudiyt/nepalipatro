package com.google.firebase.remoteconfig.internal.rollouts;

import com.google.firebase.remoteconfig.interop.rollouts.RolloutsState;
import com.google.firebase.remoteconfig.interop.rollouts.RolloutsStateSubscriber;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ RolloutsStateSubscriber f14039h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ RolloutsState f14040i;

    public /* synthetic */ b(RolloutsStateSubscriber rolloutsStateSubscriber, RolloutsState rolloutsState) {
        this.f14039h = rolloutsStateSubscriber;
        this.f14040i = rolloutsState;
    }

    public final void run() {
        this.f14039h.onRolloutsStateChanged(this.f14040i);
    }
}
