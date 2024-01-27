package com.google.firebase.concurrent;

import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class o implements ComponentFactory {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ o f13853a = new o();

    private /* synthetic */ o() {
    }

    public final Object create(ComponentContainer componentContainer) {
        return UiExecutor.INSTANCE;
    }
}
