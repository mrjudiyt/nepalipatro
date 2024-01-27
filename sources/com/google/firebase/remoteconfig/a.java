package com.google.firebase.remoteconfig;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class a implements Continuation {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Task f13993a;

    public /* synthetic */ a(Task task) {
        this.f13993a = task;
    }

    public final Object then(Task task) {
        return FirebaseRemoteConfig.lambda$ensureInitialized$0(this.f13993a, task);
    }
}
