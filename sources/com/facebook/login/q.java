package com.facebook.login;

import android.os.Bundle;
import com.facebook.login.LoginClient;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class q implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ NativeAppLoginMethodHandler f6135h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ LoginClient.Request f6136i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ Bundle f6137j;

    public /* synthetic */ q(NativeAppLoginMethodHandler nativeAppLoginMethodHandler, LoginClient.Request request, Bundle bundle) {
        this.f6135h = nativeAppLoginMethodHandler;
        this.f6136i = request;
        this.f6137j = bundle;
    }

    public final void run() {
        NativeAppLoginMethodHandler.m145processSuccessResponse$lambda0(this.f6135h, this.f6136i, this.f6137j);
    }
}
