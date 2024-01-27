package com.google.firebase.messaging;

import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class q implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ FirebaseMessaging f13975h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f13976i;

    public /* synthetic */ q(FirebaseMessaging firebaseMessaging, TaskCompletionSource taskCompletionSource) {
        this.f13975h = firebaseMessaging;
        this.f13976i = taskCompletionSource;
    }

    public final void run() {
        this.f13975h.lambda$deleteToken$5(this.f13976i);
    }
}
