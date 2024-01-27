package com.google.firebase.concurrent;

import com.google.firebase.inject.Provider;
import java.util.concurrent.Executors;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class s implements Provider {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ s f13857a = new s();

    private /* synthetic */ s() {
    }

    public final Object get() {
        return ExecutorsRegistrar.scheduled(Executors.newCachedThreadPool(ExecutorsRegistrar.factory("Firebase Blocking", 11)));
    }
}
