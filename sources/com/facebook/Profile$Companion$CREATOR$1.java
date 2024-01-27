package com.facebook;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;

/* compiled from: Profile.kt */
public final class Profile$Companion$CREATOR$1 implements Parcelable.Creator<Profile> {
    Profile$Companion$CREATOR$1() {
    }

    public Profile createFromParcel(Parcel parcel) {
        m.f(parcel, "source");
        return new Profile(parcel, (g) null);
    }

    public Profile[] newArray(int i10) {
        return new Profile[i10];
    }
}
