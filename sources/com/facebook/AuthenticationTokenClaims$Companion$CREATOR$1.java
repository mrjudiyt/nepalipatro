package com.facebook;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.m;

/* compiled from: AuthenticationTokenClaims.kt */
public final class AuthenticationTokenClaims$Companion$CREATOR$1 implements Parcelable.Creator<AuthenticationTokenClaims> {
    AuthenticationTokenClaims$Companion$CREATOR$1() {
    }

    public AuthenticationTokenClaims createFromParcel(Parcel parcel) {
        m.f(parcel, "source");
        return new AuthenticationTokenClaims(parcel);
    }

    public AuthenticationTokenClaims[] newArray(int i10) {
        return new AuthenticationTokenClaims[i10];
    }
}
