package com.facebook.login;

import android.content.Intent;
import com.facebook.internal.CallbackManagerImpl;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class m implements CallbackManagerImpl.Callback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ LoginManager f6126a;

    public /* synthetic */ m(LoginManager loginManager) {
        this.f6126a = loginManager;
    }

    public final boolean onActivityResult(int i10, Intent intent) {
        return LoginManager.m143startLogin$lambda1(this.f6126a, i10, intent);
    }
}
