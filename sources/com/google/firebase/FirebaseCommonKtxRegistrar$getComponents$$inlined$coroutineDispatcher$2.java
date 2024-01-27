package com.google.firebase;

import com.google.firebase.annotations.concurrent.Lightweight;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.components.Qualified;
import i9.g0;
import i9.m1;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.m;

/* compiled from: Firebase.kt */
public final class FirebaseCommonKtxRegistrar$getComponents$$inlined$coroutineDispatcher$2<T> implements ComponentFactory {
    public static final FirebaseCommonKtxRegistrar$getComponents$$inlined$coroutineDispatcher$2<T> INSTANCE = new FirebaseCommonKtxRegistrar$getComponents$$inlined$coroutineDispatcher$2<>();

    public final g0 create(ComponentContainer componentContainer) {
        Object obj = componentContainer.get(Qualified.qualified(Lightweight.class, Executor.class));
        m.e(obj, "c.get(Qualified.qualifie…a, Executor::class.java))");
        return m1.a((Executor) obj);
    }
}
