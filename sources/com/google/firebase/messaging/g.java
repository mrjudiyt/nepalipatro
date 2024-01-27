package com.google.firebase.messaging;

import android.content.Intent;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class g implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ FcmLifecycleCallbacks f13959h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ Intent f13960i;

    public /* synthetic */ g(FcmLifecycleCallbacks fcmLifecycleCallbacks, Intent intent) {
        this.f13959h = fcmLifecycleCallbacks;
        this.f13960i = intent;
    }

    public final void run() {
        this.f13959h.lambda$onActivityCreated$0(this.f13960i);
    }
}
