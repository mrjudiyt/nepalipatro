package com.facebook.internal;

import android.content.Context;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class g implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ Context f6069h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ String f6070i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ String f6071j;

    public /* synthetic */ g(Context context, String str, String str2) {
        this.f6069h = context;
        this.f6070i = str;
        this.f6071j = str2;
    }

    public final void run() {
        FetchedAppSettingsManager.m95loadAppSettingsAsync$lambda0(this.f6069h, this.f6070i, this.f6071j);
    }
}
