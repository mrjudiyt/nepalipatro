package com.google.android.exoplayer2.drm;

import com.google.android.exoplayer2.drm.DefaultDrmSessionManager;
import e4.j;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class e implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ DefaultDrmSessionManager.e f6557h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ j f6558i;

    public /* synthetic */ e(DefaultDrmSessionManager.e eVar, j jVar) {
        this.f6557h = eVar;
        this.f6558i = jVar;
    }

    public final void run() {
        this.f6557h.d(this.f6558i);
    }
}
