package com.facebook;

import android.content.Context;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class m implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ Context f6148h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ String f6149i;

    public /* synthetic */ m(Context context, String str) {
        this.f6148h = context;
        this.f6149i = str;
    }

    public final void run() {
        FacebookSdk.m7publishInstallAsync$lambda15(this.f6148h, this.f6149i);
    }
}
