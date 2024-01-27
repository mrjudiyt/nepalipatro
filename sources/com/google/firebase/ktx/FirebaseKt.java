package com.google.firebase.ktx;

import android.content.Context;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.components.Component;
import com.google.firebase.components.Dependency;
import com.google.firebase.components.Qualified;
import i9.g0;
import java.lang.annotation.Annotation;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.m;

/* compiled from: Firebase.kt */
public final class FirebaseKt {
    public static final FirebaseApp app(Firebase firebase, String str) {
        m.f(firebase, "<this>");
        m.f(str, "name");
        FirebaseApp instance = FirebaseApp.getInstance(str);
        m.e(instance, "getInstance(name)");
        return instance;
    }

    private static final /* synthetic */ <T extends Annotation> Component<g0> coroutineDispatcher() {
        m.l(4, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        Component.Builder<g0> builder = Component.builder(Qualified.qualified(Annotation.class, g0.class));
        m.l(4, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        Component.Builder<g0> add = builder.add(Dependency.required((Qualified<?>) Qualified.qualified(Annotation.class, Executor.class)));
        m.k();
        Component<g0> build = add.factory(FirebaseKt$coroutineDispatcher$1.INSTANCE).build();
        m.e(build, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        return build;
    }

    public static final FirebaseApp getApp(Firebase firebase) {
        m.f(firebase, "<this>");
        FirebaseApp instance = FirebaseApp.getInstance();
        m.e(instance, "getInstance()");
        return instance;
    }

    public static final FirebaseOptions getOptions(Firebase firebase) {
        m.f(firebase, "<this>");
        FirebaseOptions options = getApp(Firebase.INSTANCE).getOptions();
        m.e(options, "Firebase.app.options");
        return options;
    }

    public static final FirebaseApp initialize(Firebase firebase, Context context) {
        m.f(firebase, "<this>");
        m.f(context, "context");
        return FirebaseApp.initializeApp(context);
    }

    public static final FirebaseApp initialize(Firebase firebase, Context context, FirebaseOptions firebaseOptions) {
        m.f(firebase, "<this>");
        m.f(context, "context");
        m.f(firebaseOptions, "options");
        FirebaseApp initializeApp = FirebaseApp.initializeApp(context, firebaseOptions);
        m.e(initializeApp, "initializeApp(context, options)");
        return initializeApp;
    }

    public static final FirebaseApp initialize(Firebase firebase, Context context, FirebaseOptions firebaseOptions, String str) {
        m.f(firebase, "<this>");
        m.f(context, "context");
        m.f(firebaseOptions, "options");
        m.f(str, "name");
        FirebaseApp initializeApp = FirebaseApp.initializeApp(context, firebaseOptions, str);
        m.e(initializeApp, "initializeApp(context, options, name)");
        return initializeApp;
    }
}
