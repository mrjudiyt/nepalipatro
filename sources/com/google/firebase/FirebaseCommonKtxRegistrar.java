package com.google.firebase;

import androidx.annotation.Keep;
import com.google.firebase.annotations.concurrent.Background;
import com.google.firebase.annotations.concurrent.Blocking;
import com.google.firebase.annotations.concurrent.Lightweight;
import com.google.firebase.annotations.concurrent.UiThread;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Dependency;
import com.google.firebase.components.Qualified;
import i9.g0;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.m;

@Keep
/* compiled from: Firebase.kt */
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {
    public List<Component<?>> getComponents() {
        Class<g0> cls = g0.class;
        Component<Background> build = Component.builder(Qualified.qualified(Background.class, cls)).add(Dependency.required((Qualified<?>) Qualified.qualified(Background.class, Executor.class))).factory(FirebaseCommonKtxRegistrar$getComponents$$inlined$coroutineDispatcher$1.INSTANCE).build();
        m.e(build, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        Component<Lightweight> build2 = Component.builder(Qualified.qualified(Lightweight.class, cls)).add(Dependency.required((Qualified<?>) Qualified.qualified(Lightweight.class, Executor.class))).factory(FirebaseCommonKtxRegistrar$getComponents$$inlined$coroutineDispatcher$2.INSTANCE).build();
        m.e(build2, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        Component<Blocking> build3 = Component.builder(Qualified.qualified(Blocking.class, cls)).add(Dependency.required((Qualified<?>) Qualified.qualified(Blocking.class, Executor.class))).factory(FirebaseCommonKtxRegistrar$getComponents$$inlined$coroutineDispatcher$3.INSTANCE).build();
        m.e(build3, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        Component<UiThread> build4 = Component.builder(Qualified.qualified(UiThread.class, cls)).add(Dependency.required((Qualified<?>) Qualified.qualified(UiThread.class, Executor.class))).factory(FirebaseCommonKtxRegistrar$getComponents$$inlined$coroutineDispatcher$4.INSTANCE).build();
        m.e(build4, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        return p.g(build, build2, build3, build4);
    }
}
