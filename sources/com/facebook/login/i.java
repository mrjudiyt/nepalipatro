package com.facebook.login;

import android.os.Bundle;
import com.facebook.internal.PlatformServiceClient;
import com.facebook.login.LoginClient;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class i implements PlatformServiceClient.CompletedListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ GetTokenLoginMethodHandler f6120a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ LoginClient.Request f6121b;

    public /* synthetic */ i(GetTokenLoginMethodHandler getTokenLoginMethodHandler, LoginClient.Request request) {
        this.f6120a = getTokenLoginMethodHandler;
        this.f6121b = request;
    }

    public final void completed(Bundle bundle) {
        GetTokenLoginMethodHandler.m137tryAuthorize$lambda1(this.f6120a, this.f6121b, bundle);
    }
}
