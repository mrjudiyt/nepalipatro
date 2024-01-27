package com.facebook;

import com.facebook.AccessToken;
import com.facebook.AccessTokenManager;
import com.facebook.GraphRequestBatch;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class c implements GraphRequestBatch.Callback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AccessTokenManager.RefreshResult f6044a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AccessToken f6045b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ AccessToken.AccessTokenRefreshCallback f6046c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ AtomicBoolean f6047d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Set f6048e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Set f6049f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ Set f6050g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ AccessTokenManager f6051h;

    public /* synthetic */ c(AccessTokenManager.RefreshResult refreshResult, AccessToken accessToken, AccessToken.AccessTokenRefreshCallback accessTokenRefreshCallback, AtomicBoolean atomicBoolean, Set set, Set set2, Set set3, AccessTokenManager accessTokenManager) {
        this.f6044a = refreshResult;
        this.f6045b = accessToken;
        this.f6046c = accessTokenRefreshCallback;
        this.f6047d = atomicBoolean;
        this.f6048e = set;
        this.f6049f = set2;
        this.f6050g = set3;
        this.f6051h = accessTokenManager;
    }

    public final void onBatchCompleted(GraphRequestBatch graphRequestBatch) {
        AccessTokenManager.m3refreshCurrentAccessTokenImpl$lambda3(this.f6044a, this.f6045b, this.f6046c, this.f6047d, this.f6048e, this.f6049f, this.f6050g, this.f6051h, graphRequestBatch);
    }
}
