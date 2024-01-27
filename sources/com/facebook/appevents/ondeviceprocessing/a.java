package com.facebook.appevents.ondeviceprocessing;

import android.content.Context;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ Context f5996h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ String f5997i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ String f5998j;

    public /* synthetic */ a(Context context, String str, String str2) {
        this.f5996h = context;
        this.f5997i = str;
        this.f5998j = str2;
    }

    public final void run() {
        OnDeviceProcessingManager.m70sendInstallEventAsync$lambda0(this.f5996h, this.f5997i, this.f5998j);
    }
}
