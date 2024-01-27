package com.facebook.login;

import android.os.Bundle;
import com.facebook.LoginStatusCallback;
import com.facebook.internal.PlatformServiceClient;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class o implements PlatformServiceClient.CompletedListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f6129a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ LoginLogger f6130b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ LoginStatusCallback f6131c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ String f6132d;

    public /* synthetic */ o(String str, LoginLogger loginLogger, LoginStatusCallback loginStatusCallback, String str2) {
        this.f6129a = str;
        this.f6130b = loginLogger;
        this.f6131c = loginStatusCallback;
        this.f6132d = str2;
    }

    public final void completed(Bundle bundle) {
        LoginManager.m142retrieveLoginStatusImpl$lambda2(this.f6129a, this.f6130b, this.f6131c, this.f6132d, bundle);
    }
}
