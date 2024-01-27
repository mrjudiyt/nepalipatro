package com.facebook.login;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.m;

/* compiled from: WebViewLoginMethodHandler.kt */
public final class WebViewLoginMethodHandler$Companion$CREATOR$1 implements Parcelable.Creator<WebViewLoginMethodHandler> {
    WebViewLoginMethodHandler$Companion$CREATOR$1() {
    }

    public WebViewLoginMethodHandler createFromParcel(Parcel parcel) {
        m.f(parcel, "source");
        return new WebViewLoginMethodHandler(parcel);
    }

    public WebViewLoginMethodHandler[] newArray(int i10) {
        return new WebViewLoginMethodHandler[i10];
    }
}
