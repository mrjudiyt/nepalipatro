package com.facebook.login;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.m;

/* compiled from: GetTokenLoginMethodHandler.kt */
public final class GetTokenLoginMethodHandler$Companion$CREATOR$1 implements Parcelable.Creator<GetTokenLoginMethodHandler> {
    GetTokenLoginMethodHandler$Companion$CREATOR$1() {
    }

    public GetTokenLoginMethodHandler createFromParcel(Parcel parcel) {
        m.f(parcel, "source");
        return new GetTokenLoginMethodHandler(parcel);
    }

    public GetTokenLoginMethodHandler[] newArray(int i10) {
        return new GetTokenLoginMethodHandler[i10];
    }
}
