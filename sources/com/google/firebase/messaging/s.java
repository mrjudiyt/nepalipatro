package com.google.firebase.messaging;

import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class s implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ FirebaseMessaging f13977h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f13978i;

    public /* synthetic */ s(FirebaseMessaging firebaseMessaging, TaskCompletionSource taskCompletionSource) {
        this.f13977h = firebaseMessaging;
        this.f13978i = taskCompletionSource;
    }

    public final void run() {
        this.f13977h.lambda$getToken$4(this.f13978i);
    }
}
