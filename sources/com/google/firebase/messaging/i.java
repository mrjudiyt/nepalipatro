package com.google.firebase.messaging;

import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class i implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ FirebaseMessaging f13962h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f13963i;

    public /* synthetic */ i(FirebaseMessaging firebaseMessaging, TaskCompletionSource taskCompletionSource) {
        this.f13962h = firebaseMessaging;
        this.f13963i = taskCompletionSource;
    }

    public final void run() {
        this.f13962h.lambda$deleteToken$6(this.f13963i);
    }
}
