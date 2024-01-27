package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.m;

/* compiled from: GameRequestContent.kt */
public final class GameRequestContent$Companion$CREATOR$1 implements Parcelable.Creator<GameRequestContent> {
    GameRequestContent$Companion$CREATOR$1() {
    }

    public GameRequestContent createFromParcel(Parcel parcel) {
        m.f(parcel, "parcel");
        return new GameRequestContent(parcel);
    }

    public GameRequestContent[] newArray(int i10) {
        return new GameRequestContent[i10];
    }
}
