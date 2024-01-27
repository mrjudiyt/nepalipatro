package com.facebook.login;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.m;

/* compiled from: InstagramAppLoginMethodHandler.kt */
public final class InstagramAppLoginMethodHandler$Companion$CREATOR$1 implements Parcelable.Creator<InstagramAppLoginMethodHandler> {
    InstagramAppLoginMethodHandler$Companion$CREATOR$1() {
    }

    public InstagramAppLoginMethodHandler createFromParcel(Parcel parcel) {
        m.f(parcel, "source");
        return new InstagramAppLoginMethodHandler(parcel);
    }

    public InstagramAppLoginMethodHandler[] newArray(int i10) {
        return new InstagramAppLoginMethodHandler[i10];
    }
}
