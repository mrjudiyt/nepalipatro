package com.facebook.login.widget;

import com.facebook.internal.FetchedAppSettings;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ LoginButton f6139h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ FetchedAppSettings f6140i;

    public /* synthetic */ b(LoginButton loginButton, FetchedAppSettings fetchedAppSettings) {
        this.f6139h = loginButton;
        this.f6140i = fetchedAppSettings;
    }

    public final void run() {
        LoginButton.m148checkToolTipSettings$lambda3$lambda2(this.f6139h, this.f6140i);
    }
}
