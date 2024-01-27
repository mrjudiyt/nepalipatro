package com.facebook.login;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.m;

/* compiled from: CustomTabLoginMethodHandler.kt */
public final class CustomTabLoginMethodHandler$Companion$CREATOR$1 implements Parcelable.Creator<CustomTabLoginMethodHandler> {
    CustomTabLoginMethodHandler$Companion$CREATOR$1() {
    }

    public CustomTabLoginMethodHandler createFromParcel(Parcel parcel) {
        m.f(parcel, "source");
        return new CustomTabLoginMethodHandler(parcel);
    }

    public CustomTabLoginMethodHandler[] newArray(int i10) {
        return new CustomTabLoginMethodHandler[i10];
    }
}
