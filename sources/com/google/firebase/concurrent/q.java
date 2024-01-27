package com.google.firebase.concurrent;

import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class q implements ComponentFactory {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ q f13855a = new q();

    private /* synthetic */ q() {
    }

    public final Object create(ComponentContainer componentContainer) {
        return ExecutorsRegistrar.BG_EXECUTOR.get();
    }
}
