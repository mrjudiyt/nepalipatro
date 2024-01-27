package com.google.firebase.remoteconfig;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class b implements Continuation {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ FirebaseRemoteConfig f13994a;

    public /* synthetic */ b(FirebaseRemoteConfig firebaseRemoteConfig) {
        this.f13994a = firebaseRemoteConfig;
    }

    public final Object then(Task task) {
        return Boolean.valueOf(this.f13994a.processActivatePutTask(task));
    }
}
