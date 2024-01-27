package com.facebook.login;

import android.os.Bundle;
import com.facebook.login.LoginClient;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ CustomTabLoginMethodHandler f6102h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ LoginClient.Request f6103i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ Bundle f6104j;

    public /* synthetic */ a(CustomTabLoginMethodHandler customTabLoginMethodHandler, LoginClient.Request request, Bundle bundle) {
        this.f6102h = customTabLoginMethodHandler;
        this.f6103i = request;
        this.f6104j = bundle;
    }

    public final void run() {
        CustomTabLoginMethodHandler.m129onCustomTabComplete$lambda0(this.f6102h, this.f6103i, this.f6104j);
    }
}
