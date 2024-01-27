package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.m;

/* compiled from: CameraEffectArguments.kt */
public final class CameraEffectArguments$Companion$CREATOR$1 implements Parcelable.Creator<CameraEffectArguments> {
    CameraEffectArguments$Companion$CREATOR$1() {
    }

    public CameraEffectArguments createFromParcel(Parcel parcel) {
        m.f(parcel, "parcel");
        return new CameraEffectArguments(parcel);
    }

    public CameraEffectArguments[] newArray(int i10) {
        return new CameraEffectArguments[i10];
    }
}
