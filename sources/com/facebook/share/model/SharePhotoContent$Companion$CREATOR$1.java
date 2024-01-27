package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.m;

/* compiled from: SharePhotoContent.kt */
public final class SharePhotoContent$Companion$CREATOR$1 implements Parcelable.Creator<SharePhotoContent> {
    SharePhotoContent$Companion$CREATOR$1() {
    }

    public SharePhotoContent createFromParcel(Parcel parcel) {
        m.f(parcel, "parcel");
        return new SharePhotoContent(parcel);
    }

    public SharePhotoContent[] newArray(int i10) {
        return new SharePhotoContent[i10];
    }
}
