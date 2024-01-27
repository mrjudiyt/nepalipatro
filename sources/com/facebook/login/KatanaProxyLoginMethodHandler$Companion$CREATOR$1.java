package com.facebook.login;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.m;

/* compiled from: KatanaProxyLoginMethodHandler.kt */
public final class KatanaProxyLoginMethodHandler$Companion$CREATOR$1 implements Parcelable.Creator<KatanaProxyLoginMethodHandler> {
    KatanaProxyLoginMethodHandler$Companion$CREATOR$1() {
    }

    public KatanaProxyLoginMethodHandler createFromParcel(Parcel parcel) {
        m.f(parcel, "source");
        return new KatanaProxyLoginMethodHandler(parcel);
    }

    public KatanaProxyLoginMethodHandler[] newArray(int i10) {
        return new KatanaProxyLoginMethodHandler[i10];
    }
}
