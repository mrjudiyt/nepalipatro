package com.google.firebase.messaging;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class a0 implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ SharedPreferencesQueue f13939h;

    public /* synthetic */ a0(SharedPreferencesQueue sharedPreferencesQueue) {
        this.f13939h = sharedPreferencesQueue;
    }

    public final void run() {
        this.f13939h.syncState();
    }
}
