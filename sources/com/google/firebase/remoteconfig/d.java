package com.google.firebase.remoteconfig;

import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class d implements SuccessContinuation {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ FirebaseRemoteConfig f13998a;

    public /* synthetic */ d(FirebaseRemoteConfig firebaseRemoteConfig) {
        this.f13998a = firebaseRemoteConfig;
    }

    public final Task then(Object obj) {
        return this.f13998a.lambda$fetchAndActivate$1((Void) obj);
    }
}
