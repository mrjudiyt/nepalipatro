package com.google.firebase.remoteconfig;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class c implements Continuation {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ FirebaseRemoteConfig f13995a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Task f13996b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Task f13997c;

    public /* synthetic */ c(FirebaseRemoteConfig firebaseRemoteConfig, Task task, Task task2) {
        this.f13995a = firebaseRemoteConfig;
        this.f13996b = task;
        this.f13997c = task2;
    }

    public final Object then(Task task) {
        return this.f13995a.lambda$activate$2(this.f13996b, this.f13997c, task);
    }
}
