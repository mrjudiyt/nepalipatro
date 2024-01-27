package com.google.firebase.concurrent;

import com.google.firebase.inject.Provider;
import java.util.concurrent.Executors;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class t implements Provider {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ t f13858a = new t();

    private /* synthetic */ t() {
    }

    public final Object get() {
        return ExecutorsRegistrar.scheduled(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), ExecutorsRegistrar.factory("Firebase Lite", 0, ExecutorsRegistrar.litePolicy())));
    }
}
