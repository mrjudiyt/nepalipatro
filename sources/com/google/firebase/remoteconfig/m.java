package com.google.firebase.remoteconfig;

import java.util.concurrent.Callable;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class m implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ RemoteConfigComponent f14049a;

    public /* synthetic */ m(RemoteConfigComponent remoteConfigComponent) {
        this.f14049a = remoteConfigComponent;
    }

    public final Object call() {
        return this.f14049a.getDefault();
    }
}
