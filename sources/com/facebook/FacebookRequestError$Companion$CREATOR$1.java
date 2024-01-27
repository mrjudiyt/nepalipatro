package com.facebook;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;

/* compiled from: FacebookRequestError.kt */
public final class FacebookRequestError$Companion$CREATOR$1 implements Parcelable.Creator<FacebookRequestError> {
    FacebookRequestError$Companion$CREATOR$1() {
    }

    public FacebookRequestError createFromParcel(Parcel parcel) {
        m.f(parcel, "parcel");
        return new FacebookRequestError(parcel, (g) null);
    }

    public FacebookRequestError[] newArray(int i10) {
        return new FacebookRequestError[i10];
    }
}
