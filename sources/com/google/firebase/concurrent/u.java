package com.google.firebase.concurrent;

import com.google.firebase.inject.Provider;
import java.util.concurrent.Executors;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class u implements Provider {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ u f13859a = new u();

    private /* synthetic */ u() {
    }

    public final Object get() {
        return ExecutorsRegistrar.scheduled(Executors.newFixedThreadPool(4, ExecutorsRegistrar.factory("Firebase Background", 10, ExecutorsRegistrar.bgPolicy())));
    }
}
