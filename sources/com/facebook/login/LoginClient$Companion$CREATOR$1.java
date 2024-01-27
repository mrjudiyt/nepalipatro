package com.facebook.login;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.m;

/* compiled from: LoginClient.kt */
public final class LoginClient$Companion$CREATOR$1 implements Parcelable.Creator<LoginClient> {
    LoginClient$Companion$CREATOR$1() {
    }

    public LoginClient createFromParcel(Parcel parcel) {
        m.f(parcel, "source");
        return new LoginClient(parcel);
    }

    public LoginClient[] newArray(int i10) {
        return new LoginClient[i10];
    }
}
