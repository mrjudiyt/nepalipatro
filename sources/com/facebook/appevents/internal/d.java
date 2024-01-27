package com.facebook.appevents.internal;

import android.content.Context;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ long f5986h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ String f5987i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ Context f5988j;

    public /* synthetic */ d(long j10, String str, Context context) {
        this.f5986h = j10;
        this.f5987i = str;
        this.f5988j = context;
    }

    public final void run() {
        ActivityLifecycleTracker.m62onActivityResumed$lambda2(this.f5986h, this.f5987i, this.f5988j);
    }
}
