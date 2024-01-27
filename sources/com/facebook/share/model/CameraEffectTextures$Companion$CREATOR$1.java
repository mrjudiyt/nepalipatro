package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.m;

/* compiled from: CameraEffectTextures.kt */
public final class CameraEffectTextures$Companion$CREATOR$1 implements Parcelable.Creator<CameraEffectTextures> {
    CameraEffectTextures$Companion$CREATOR$1() {
    }

    public CameraEffectTextures createFromParcel(Parcel parcel) {
        m.f(parcel, "parcel");
        return new CameraEffectTextures(parcel);
    }

    public CameraEffectTextures[] newArray(int i10) {
        return new CameraEffectTextures[i10];
    }
}
