package com.facebook;

import com.facebook.GraphRequest;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class u implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ GraphRequest.Callback f6162h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ long f6163i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ long f6164j;

    public /* synthetic */ u(GraphRequest.Callback callback, long j10, long j11) {
        this.f6162h = callback;
        this.f6163i = j10;
        this.f6164j = j11;
    }

    public final void run() {
        RequestProgress.m20reportProgress$lambda0(this.f6162h, this.f6163i, this.f6164j);
    }
}
