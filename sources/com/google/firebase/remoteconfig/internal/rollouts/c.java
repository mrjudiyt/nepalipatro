package com.google.firebase.remoteconfig.internal.rollouts;

import com.google.firebase.remoteconfig.interop.rollouts.RolloutsState;
import com.google.firebase.remoteconfig.interop.rollouts.RolloutsStateSubscriber;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class c implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ RolloutsStateSubscriber f14041h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ RolloutsState f14042i;

    public /* synthetic */ c(RolloutsStateSubscriber rolloutsStateSubscriber, RolloutsState rolloutsState) {
        this.f14041h = rolloutsStateSubscriber;
        this.f14042i = rolloutsState;
    }

    public final void run() {
        this.f14041h.onRolloutsStateChanged(this.f14042i);
    }
}
