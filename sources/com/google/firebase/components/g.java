package com.google.firebase.components;

import com.google.firebase.inject.Provider;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class g implements Provider {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f13795a;

    public /* synthetic */ g(String str) {
        this.f13795a = str;
    }

    public final Object get() {
        return ComponentDiscovery.instantiate(this.f13795a);
    }
}
