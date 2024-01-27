package com.facebook.internal;

import android.content.Context;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class f implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ String f6066h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ Context f6067i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ String f6068j;

    public /* synthetic */ f(String str, Context context, String str2) {
        this.f6066h = str;
        this.f6067i = context;
        this.f6068j = str2;
    }

    public final void run() {
        FetchedAppGateKeepersManager.m93loadAppGateKeepersAsync$lambda0(this.f6066h, this.f6067i, this.f6068j);
    }
}
