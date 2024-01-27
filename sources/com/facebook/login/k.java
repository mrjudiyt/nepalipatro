package com.facebook.login;

import com.facebook.login.LoginClient;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class k implements LoginClient.OnCompletedListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ LoginFragment f6123a;

    public /* synthetic */ k(LoginFragment loginFragment) {
        this.f6123a = loginFragment;
    }

    public final void onCompleted(LoginClient.Result result) {
        LoginFragment.m138onCreate$lambda0(this.f6123a, result);
    }
}
