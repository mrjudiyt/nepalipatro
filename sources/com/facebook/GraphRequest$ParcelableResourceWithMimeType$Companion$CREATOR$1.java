package com.facebook;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.GraphRequest;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;

/* compiled from: GraphRequest.kt */
public final class GraphRequest$ParcelableResourceWithMimeType$Companion$CREATOR$1 implements Parcelable.Creator<GraphRequest.ParcelableResourceWithMimeType<?>> {
    GraphRequest$ParcelableResourceWithMimeType$Companion$CREATOR$1() {
    }

    public GraphRequest.ParcelableResourceWithMimeType<?> createFromParcel(Parcel parcel) {
        m.f(parcel, "source");
        return new GraphRequest.ParcelableResourceWithMimeType<>(parcel, (g) null);
    }

    public GraphRequest.ParcelableResourceWithMimeType<?>[] newArray(int i10) {
        return new GraphRequest.ParcelableResourceWithMimeType[i10];
    }
}
