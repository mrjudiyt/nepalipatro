package com.google.firebase.remoteconfig;

import com.google.firebase.Firebase;
import com.google.firebase.FirebaseApp;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigSettings;
import io.flutter.plugins.firebase.crashlytics.Constants;
import kotlin.jvm.internal.m;
import l9.d;
import l9.f;
import o8.q;
import y8.l;

/* compiled from: RemoteConfig.kt */
public final class RemoteConfigKt {
    public static final FirebaseRemoteConfigValue get(FirebaseRemoteConfig firebaseRemoteConfig, String str) {
        m.f(firebaseRemoteConfig, "<this>");
        m.f(str, Constants.KEY);
        FirebaseRemoteConfigValue value = firebaseRemoteConfig.getValue(str);
        m.e(value, "this.getValue(key)");
        return value;
    }

    public static final d<ConfigUpdate> getConfigUpdates(FirebaseRemoteConfig firebaseRemoteConfig) {
        m.f(firebaseRemoteConfig, "<this>");
        return f.a(new RemoteConfigKt$configUpdates$1(firebaseRemoteConfig, (r8.d<? super RemoteConfigKt$configUpdates$1>) null));
    }

    public static final FirebaseRemoteConfig getRemoteConfig(Firebase firebase) {
        m.f(firebase, "<this>");
        FirebaseRemoteConfig instance = FirebaseRemoteConfig.getInstance();
        m.e(instance, "getInstance()");
        return instance;
    }

    public static final FirebaseRemoteConfig remoteConfig(Firebase firebase, FirebaseApp firebaseApp) {
        m.f(firebase, "<this>");
        m.f(firebaseApp, "app");
        FirebaseRemoteConfig instance = FirebaseRemoteConfig.getInstance(firebaseApp);
        m.e(instance, "getInstance(app)");
        return instance;
    }

    public static final FirebaseRemoteConfigSettings remoteConfigSettings(l<? super FirebaseRemoteConfigSettings.Builder, q> lVar) {
        m.f(lVar, "init");
        FirebaseRemoteConfigSettings.Builder builder = new FirebaseRemoteConfigSettings.Builder();
        lVar.invoke(builder);
        FirebaseRemoteConfigSettings build = builder.build();
        m.e(build, "builder.build()");
        return build;
    }
}
