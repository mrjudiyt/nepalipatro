package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.m;

/* compiled from: AppGroupCreationContent.kt */
public final class AppGroupCreationContent$Companion$CREATOR$1 implements Parcelable.Creator<AppGroupCreationContent> {
    AppGroupCreationContent$Companion$CREATOR$1() {
    }

    public AppGroupCreationContent createFromParcel(Parcel parcel) {
        m.f(parcel, "parcel");
        return new AppGroupCreationContent(parcel);
    }

    public AppGroupCreationContent[] newArray(int i10) {
        return new AppGroupCreationContent[i10];
    }
}
