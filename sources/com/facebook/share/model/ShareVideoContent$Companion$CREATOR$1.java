package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.m;

/* compiled from: ShareVideoContent.kt */
public final class ShareVideoContent$Companion$CREATOR$1 implements Parcelable.Creator<ShareVideoContent> {
    ShareVideoContent$Companion$CREATOR$1() {
    }

    public ShareVideoContent createFromParcel(Parcel parcel) {
        m.f(parcel, "parcel");
        return new ShareVideoContent(parcel);
    }

    public ShareVideoContent[] newArray(int i10) {
        return new ShareVideoContent[i10];
    }
}
