package com.google.firebase.concurrent;

import com.google.firebase.inject.Provider;
import java.util.concurrent.Executors;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class r implements Provider {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ r f13856a = new r();

    private /* synthetic */ r() {
    }

    public final Object get() {
        return Executors.newSingleThreadScheduledExecutor(ExecutorsRegistrar.factory("Firebase Scheduler", 0));
    }
}
