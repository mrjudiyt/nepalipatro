package com.facebook.login;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.login.LoginClient;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;

/* compiled from: LoginClient.kt */
public final class LoginClient$Request$Companion$CREATOR$1 implements Parcelable.Creator<LoginClient.Request> {
    LoginClient$Request$Companion$CREATOR$1() {
    }

    public LoginClient.Request createFromParcel(Parcel parcel) {
        m.f(parcel, "source");
        return new LoginClient.Request(parcel, (g) null);
    }

    public LoginClient.Request[] newArray(int i10) {
        return new LoginClient.Request[i10];
    }
}
