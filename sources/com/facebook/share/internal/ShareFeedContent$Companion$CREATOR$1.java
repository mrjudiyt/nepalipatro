package com.facebook.share.internal;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.m;

/* compiled from: ShareFeedContent.kt */
public final class ShareFeedContent$Companion$CREATOR$1 implements Parcelable.Creator<ShareFeedContent> {
    ShareFeedContent$Companion$CREATOR$1() {
    }

    public ShareFeedContent createFromParcel(Parcel parcel) {
        m.f(parcel, "parcel");
        return new ShareFeedContent(parcel);
    }

    public ShareFeedContent[] newArray(int i10) {
        return new ShareFeedContent[i10];
    }
}
