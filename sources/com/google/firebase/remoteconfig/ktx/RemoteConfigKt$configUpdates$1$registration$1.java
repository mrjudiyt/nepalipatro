package com.google.firebase.remoteconfig.ktx;

import com.google.firebase.remoteconfig.ConfigUpdate;
import com.google.firebase.remoteconfig.ConfigUpdateListener;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import i9.m0;
import k9.j;
import k9.p;
import kotlin.jvm.internal.m;

/* compiled from: RemoteConfig.kt */
public final class RemoteConfigKt$configUpdates$1$registration$1 implements ConfigUpdateListener {
    final /* synthetic */ p<ConfigUpdate> $$this$callbackFlow;
    final /* synthetic */ FirebaseRemoteConfig $this_configUpdates;

    RemoteConfigKt$configUpdates$1$registration$1(FirebaseRemoteConfig firebaseRemoteConfig, p<? super ConfigUpdate> pVar) {
        this.$this_configUpdates = firebaseRemoteConfig;
        this.$$this$callbackFlow = pVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: onUpdate$lambda-0  reason: not valid java name */
    public static final void m158onUpdate$lambda0(p pVar, ConfigUpdate configUpdate) {
        m.f(pVar, "$$this$callbackFlow");
        m.f(configUpdate, "$configUpdate");
        j.b(pVar, configUpdate);
    }

    public void onError(FirebaseRemoteConfigException firebaseRemoteConfigException) {
        m.f(firebaseRemoteConfigException, "error");
        m0.b(this.$$this$callbackFlow, "Error listening for config updates.", firebaseRemoteConfigException);
    }

    public void onUpdate(ConfigUpdate configUpdate) {
        m.f(configUpdate, "configUpdate");
        this.$this_configUpdates.schedule(new a(this.$$this$callbackFlow, configUpdate));
    }
}
