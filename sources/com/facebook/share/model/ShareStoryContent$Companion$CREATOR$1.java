package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.m;

/* compiled from: ShareStoryContent.kt */
public final class ShareStoryContent$Companion$CREATOR$1 implements Parcelable.Creator<ShareStoryContent> {
    ShareStoryContent$Companion$CREATOR$1() {
    }

    public ShareStoryContent createFromParcel(Parcel parcel) {
        m.f(parcel, "parcel");
        return new ShareStoryContent(parcel);
    }

    public ShareStoryContent[] newArray(int i10) {
        return new ShareStoryContent[i10];
    }
}
