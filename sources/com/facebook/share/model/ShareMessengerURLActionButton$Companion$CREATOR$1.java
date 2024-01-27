package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.m;

/* compiled from: ShareMessengerURLActionButton.kt */
public final class ShareMessengerURLActionButton$Companion$CREATOR$1 implements Parcelable.Creator<ShareMessengerURLActionButton> {
    ShareMessengerURLActionButton$Companion$CREATOR$1() {
    }

    public ShareMessengerURLActionButton createFromParcel(Parcel parcel) {
        m.f(parcel, "parcel");
        return new ShareMessengerURLActionButton(parcel);
    }

    public ShareMessengerURLActionButton[] newArray(int i10) {
        return new ShareMessengerURLActionButton[i10];
    }
}
