package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.m;

/* compiled from: ShareVideo.kt */
public final class ShareVideo$Companion$CREATOR$1 implements Parcelable.Creator<ShareVideo> {
    ShareVideo$Companion$CREATOR$1() {
    }

    public ShareVideo createFromParcel(Parcel parcel) {
        m.f(parcel, "source");
        return new ShareVideo(parcel);
    }

    public ShareVideo[] newArray(int i10) {
        return new ShareVideo[i10];
    }
}
