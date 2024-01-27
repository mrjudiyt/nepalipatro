package com.facebook.login.widget;

import com.facebook.login.LoginManager;
import kotlin.jvm.internal.n;
import y8.a;

/* compiled from: LoginButton.kt */
final class LoginButton$loginManagerLazy$1 extends n implements a<LoginManager> {
    public static final LoginButton$loginManagerLazy$1 INSTANCE = new LoginButton$loginManagerLazy$1();

    LoginButton$loginManagerLazy$1() {
        super(0);
    }

    public final LoginManager invoke() {
        return LoginManager.Companion.getInstance();
    }
}
