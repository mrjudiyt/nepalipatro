package com.facebook.login.widget;

import android.view.ViewTreeObserver;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class g implements ViewTreeObserver.OnScrollChangedListener {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ ToolTipPopup f6146h;

    public /* synthetic */ g(ToolTipPopup toolTipPopup) {
        this.f6146h = toolTipPopup;
    }

    public final void onScrollChanged() {
        ToolTipPopup.m152scrollListener$lambda1(this.f6146h);
    }
}
