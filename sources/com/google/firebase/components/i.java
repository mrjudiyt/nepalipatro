package com.google.firebase.components;

import com.google.firebase.inject.Provider;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class i implements Provider {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ComponentRegistrar f13797a;

    public /* synthetic */ i(ComponentRegistrar componentRegistrar) {
        this.f13797a = componentRegistrar;
    }

    public final Object get() {
        return ComponentRuntime.lambda$toProviders$1(this.f13797a);
    }
}
