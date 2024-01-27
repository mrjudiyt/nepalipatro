package com.facebook.login;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.login.LoginClient;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;

/* compiled from: LoginClient.kt */
public final class LoginClient$Result$Companion$CREATOR$1 implements Parcelable.Creator<LoginClient.Result> {
    LoginClient$Result$Companion$CREATOR$1() {
    }

    public LoginClient.Result createFromParcel(Parcel parcel) {
        m.f(parcel, "source");
        return new LoginClient.Result(parcel, (g) null);
    }

    public LoginClient.Result[] newArray(int i10) {
        return new LoginClient.Result[i10];
    }
}
