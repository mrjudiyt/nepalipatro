package com.google.firebase.remoteconfig;

import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.components.Qualified;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class o implements ComponentFactory {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Qualified f14052a;

    public /* synthetic */ o(Qualified qualified) {
        this.f14052a = qualified;
    }

    public final Object create(ComponentContainer componentContainer) {
        return RemoteConfigRegistrar.lambda$getComponents$0(this.f14052a, componentContainer);
    }
}
