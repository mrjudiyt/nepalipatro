package com.google.firebase.concurrent;

import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class n implements ComponentFactory {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ n f13852a = new n();

    private /* synthetic */ n() {
    }

    public final Object create(ComponentContainer componentContainer) {
        return ExecutorsRegistrar.BLOCKING_EXECUTOR.get();
    }
}
