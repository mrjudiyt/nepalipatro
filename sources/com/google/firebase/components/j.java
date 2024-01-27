package com.google.firebase.components;

import com.google.firebase.inject.Provider;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class j implements Provider {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ComponentRuntime f13798a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Component f13799b;

    public /* synthetic */ j(ComponentRuntime componentRuntime, Component component) {
        this.f13798a = componentRuntime;
        this.f13799b = component;
    }

    public final Object get() {
        return this.f13798a.lambda$discoverComponents$0(this.f13799b);
    }
}
