package com.google.firebase;

import com.google.android.gms.ads.RequestConfiguration;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.components.Qualified;
import i9.g0;
import i9.m1;
import java.lang.annotation.Annotation;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.m;

/* compiled from: Firebase.kt */
public final class FirebaseKt$coroutineDispatcher$1<T> implements ComponentFactory {
    public static final FirebaseKt$coroutineDispatcher$1<T> INSTANCE = new FirebaseKt$coroutineDispatcher$1<>();

    public final g0 create(ComponentContainer componentContainer) {
        m.l(4, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        Object obj = componentContainer.get(Qualified.qualified(Annotation.class, Executor.class));
        m.e(obj, "c.get(Qualified.qualifie…a, Executor::class.java))");
        return m1.a((Executor) obj);
    }
}
