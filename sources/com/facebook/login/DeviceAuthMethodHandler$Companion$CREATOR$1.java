package com.facebook.login;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.m;

/* compiled from: DeviceAuthMethodHandler.kt */
public final class DeviceAuthMethodHandler$Companion$CREATOR$1 implements Parcelable.Creator<DeviceAuthMethodHandler> {
    DeviceAuthMethodHandler$Companion$CREATOR$1() {
    }

    public DeviceAuthMethodHandler createFromParcel(Parcel parcel) {
        m.f(parcel, "source");
        return new DeviceAuthMethodHandler(parcel);
    }

    public DeviceAuthMethodHandler[] newArray(int i10) {
        return new DeviceAuthMethodHandler[i10];
    }
}
