package com.facebook.login.widget;

import android.content.DialogInterface;
import com.facebook.login.LoginManager;
import com.facebook.login.widget.LoginButton;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class d implements DialogInterface.OnClickListener {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ LoginManager f6143h;

    public /* synthetic */ d(LoginManager loginManager) {
        this.f6143h = loginManager;
    }

    public final void onClick(DialogInterface dialogInterface, int i10) {
        LoginButton.LoginClickListener.m150performLogout$lambda2(this.f6143h, dialogInterface, i10);
    }
}
