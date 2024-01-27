package com.google.firebase.components;

import com.google.firebase.inject.Provider;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class m implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ OptionalProvider f13803h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ Provider f13804i;

    public /* synthetic */ m(OptionalProvider optionalProvider, Provider provider) {
        this.f13803h = optionalProvider;
        this.f13804i = provider;
    }

    public final void run() {
        this.f13803h.set(this.f13804i);
    }
}
