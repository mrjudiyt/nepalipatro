package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.m;

/* compiled from: ShareHashtag.kt */
public final class ShareHashtag$Companion$CREATOR$1 implements Parcelable.Creator<ShareHashtag> {
    ShareHashtag$Companion$CREATOR$1() {
    }

    public ShareHashtag createFromParcel(Parcel parcel) {
        m.f(parcel, "source");
        return new ShareHashtag(parcel);
    }

    public ShareHashtag[] newArray(int i10) {
        return new ShareHashtag[i10];
    }
}
