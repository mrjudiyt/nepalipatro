package com.facebook;

import com.facebook.AccessToken;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ AccessTokenManager f6052h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ AccessToken.AccessTokenRefreshCallback f6053i;

    public /* synthetic */ d(AccessTokenManager accessTokenManager, AccessToken.AccessTokenRefreshCallback accessTokenRefreshCallback) {
        this.f6052h = accessTokenManager;
        this.f6053i = accessTokenRefreshCallback;
    }

    public final void run() {
        AccessTokenManager.m0refreshCurrentAccessToken$lambda0(this.f6052h, this.f6053i);
    }
}
