package com.google.firebase.installations;

import com.google.firebase.Firebase;
import com.google.firebase.FirebaseApp;
import kotlin.jvm.internal.m;

/* compiled from: Installations.kt */
public final class InstallationsKt {
    public static final FirebaseInstallations getInstallations(Firebase firebase) {
        m.f(firebase, "<this>");
        FirebaseInstallations instance = FirebaseInstallations.getInstance();
        m.e(instance, "getInstance()");
        return instance;
    }

    public static final FirebaseInstallations installations(Firebase firebase, FirebaseApp firebaseApp) {
        m.f(firebase, "<this>");
        m.f(firebaseApp, "app");
        FirebaseInstallations instance = FirebaseInstallations.getInstance(firebaseApp);
        m.e(instance, "getInstance(app)");
        return instance;
    }
}
