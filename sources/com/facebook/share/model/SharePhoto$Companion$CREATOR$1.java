package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.m;

/* compiled from: SharePhoto.kt */
public final class SharePhoto$Companion$CREATOR$1 implements Parcelable.Creator<SharePhoto> {
    SharePhoto$Companion$CREATOR$1() {
    }

    public SharePhoto createFromParcel(Parcel parcel) {
        m.f(parcel, "source");
        return new SharePhoto(parcel);
    }

    public SharePhoto[] newArray(int i10) {
        return new SharePhoto[i10];
    }
}
