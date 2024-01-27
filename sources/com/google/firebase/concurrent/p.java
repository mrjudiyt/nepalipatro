package com.google.firebase.concurrent;

import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class p implements ComponentFactory {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ p f13854a = new p();

    private /* synthetic */ p() {
    }

    public final Object create(ComponentContainer componentContainer) {
        return ExecutorsRegistrar.LITE_EXECUTOR.get();
    }
}
