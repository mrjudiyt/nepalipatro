package com.google.firebase.remoteconfig;

import java.util.concurrent.Callable;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class j implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ FirebaseRemoteConfig f14043a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ FirebaseRemoteConfigSettings f14044b;

    public /* synthetic */ j(FirebaseRemoteConfig firebaseRemoteConfig, FirebaseRemoteConfigSettings firebaseRemoteConfigSettings) {
        this.f14043a = firebaseRemoteConfig;
        this.f14044b = firebaseRemoteConfigSettings;
    }

    public final Object call() {
        return this.f14043a.lambda$setConfigSettingsAsync$5(this.f14044b);
    }
}
