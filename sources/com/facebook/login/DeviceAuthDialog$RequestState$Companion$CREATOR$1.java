package com.facebook.login;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.login.DeviceAuthDialog;
import kotlin.jvm.internal.m;

/* compiled from: DeviceAuthDialog.kt */
public final class DeviceAuthDialog$RequestState$Companion$CREATOR$1 implements Parcelable.Creator<DeviceAuthDialog.RequestState> {
    DeviceAuthDialog$RequestState$Companion$CREATOR$1() {
    }

    public DeviceAuthDialog.RequestState createFromParcel(Parcel parcel) {
        m.f(parcel, "parcel");
        return new DeviceAuthDialog.RequestState(parcel);
    }

    public DeviceAuthDialog.RequestState[] newArray(int i10) {
        return new DeviceAuthDialog.RequestState[i10];
    }
}
