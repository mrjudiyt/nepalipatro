package com.facebook;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.m;

/* compiled from: AccessToken.kt */
public final class AccessToken$Companion$CREATOR$1 implements Parcelable.Creator<AccessToken> {
    AccessToken$Companion$CREATOR$1() {
    }

    public AccessToken createFromParcel(Parcel parcel) {
        m.f(parcel, "source");
        return new AccessToken(parcel);
    }

    public AccessToken[] newArray(int i10) {
        return new AccessToken[i10];
    }
}
