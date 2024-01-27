package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.m;

/* compiled from: ShareCameraEffectContent.kt */
public final class ShareCameraEffectContent$Companion$CREATOR$1 implements Parcelable.Creator<ShareCameraEffectContent> {
    ShareCameraEffectContent$Companion$CREATOR$1() {
    }

    public ShareCameraEffectContent createFromParcel(Parcel parcel) {
        m.f(parcel, "parcel");
        return new ShareCameraEffectContent(parcel);
    }

    public ShareCameraEffectContent[] newArray(int i10) {
        return new ShareCameraEffectContent[i10];
    }
}
