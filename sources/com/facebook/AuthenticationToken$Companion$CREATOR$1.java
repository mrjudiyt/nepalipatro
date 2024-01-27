package com.facebook;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.m;

/* compiled from: AuthenticationToken.kt */
public final class AuthenticationToken$Companion$CREATOR$1 implements Parcelable.Creator<AuthenticationToken> {
    AuthenticationToken$Companion$CREATOR$1() {
    }

    public AuthenticationToken createFromParcel(Parcel parcel) {
        m.f(parcel, "source");
        return new AuthenticationToken(parcel);
    }

    public AuthenticationToken[] newArray(int i10) {
        return new AuthenticationToken[i10];
    }
}
