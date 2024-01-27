package com.facebook.login.widget;

import com.facebook.AccessToken;
import com.facebook.AccessTokenTracker;

/* compiled from: LoginButton.kt */
public final class LoginButton$configureButton$1 extends AccessTokenTracker {
    final /* synthetic */ LoginButton this$0;

    LoginButton$configureButton$1(LoginButton loginButton) {
        this.this$0 = loginButton;
    }

    /* access modifiers changed from: protected */
    public void onCurrentAccessTokenChanged(AccessToken accessToken, AccessToken accessToken2) {
        this.this$0.setButtonText();
        this.this$0.setButtonIcon();
    }
}
