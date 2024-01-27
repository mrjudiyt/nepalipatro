package com.facebook;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.m;

/* compiled from: AuthenticationTokenHeader.kt */
public final class AuthenticationTokenHeader$Companion$CREATOR$1 implements Parcelable.Creator<AuthenticationTokenHeader> {
    AuthenticationTokenHeader$Companion$CREATOR$1() {
    }

    public AuthenticationTokenHeader createFromParcel(Parcel parcel) {
        m.f(parcel, "source");
        return new AuthenticationTokenHeader(parcel);
    }

    public AuthenticationTokenHeader[] newArray(int i10) {
        return new AuthenticationTokenHeader[i10];
    }
}
