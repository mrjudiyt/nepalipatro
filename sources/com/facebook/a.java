package com.facebook;

import com.facebook.AccessTokenManager;
import com.facebook.GraphRequest;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class a implements GraphRequest.Callback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AccessTokenManager.RefreshResult f5944a;

    public /* synthetic */ a(AccessTokenManager.RefreshResult refreshResult) {
        this.f5944a = refreshResult;
    }

    public final void onCompleted(GraphResponse graphResponse) {
        AccessTokenManager.m2refreshCurrentAccessTokenImpl$lambda2(this.f5944a, graphResponse);
    }
}
