package com.google.firebase.components;

import com.google.firebase.inject.Provider;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class l implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ LazySet f13801h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ Provider f13802i;

    public /* synthetic */ l(LazySet lazySet, Provider provider) {
        this.f13801h = lazySet;
        this.f13802i = provider;
    }

    public final void run() {
        this.f13801h.add(this.f13802i);
    }
}
