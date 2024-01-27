package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.m;

/* compiled from: ShareLinkContent.kt */
public final class ShareLinkContent$Companion$CREATOR$1 implements Parcelable.Creator<ShareLinkContent> {
    ShareLinkContent$Companion$CREATOR$1() {
    }

    public ShareLinkContent createFromParcel(Parcel parcel) {
        m.f(parcel, "source");
        return new ShareLinkContent(parcel);
    }

    public ShareLinkContent[] newArray(int i10) {
        return new ShareLinkContent[i10];
    }
}
