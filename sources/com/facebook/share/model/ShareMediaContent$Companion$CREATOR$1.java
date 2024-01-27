package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.m;

/* compiled from: ShareMediaContent.kt */
public final class ShareMediaContent$Companion$CREATOR$1 implements Parcelable.Creator<ShareMediaContent> {
    ShareMediaContent$Companion$CREATOR$1() {
    }

    public ShareMediaContent createFromParcel(Parcel parcel) {
        m.f(parcel, "source");
        return new ShareMediaContent(parcel);
    }

    public ShareMediaContent[] newArray(int i10) {
        return new ShareMediaContent[i10];
    }
}
