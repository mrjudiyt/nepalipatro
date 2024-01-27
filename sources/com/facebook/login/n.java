package com.facebook.login;

import android.content.Intent;
import com.facebook.FacebookCallback;
import com.facebook.internal.CallbackManagerImpl;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class n implements CallbackManagerImpl.Callback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ LoginManager f6127a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ FacebookCallback f6128b;

    public /* synthetic */ n(LoginManager loginManager, FacebookCallback facebookCallback) {
        this.f6127a = loginManager;
        this.f6128b = facebookCallback;
    }

    public final boolean onActivityResult(int i10, Intent intent) {
        return LoginManager.m141registerCallback$lambda0(this.f6127a, this.f6128b, i10, intent);
    }
}
