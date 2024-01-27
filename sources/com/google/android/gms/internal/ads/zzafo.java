package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzafo implements Parcelable.Creator {
    zzafo() {
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        String readString = parcel.readString();
        Objects.requireNonNull(readString);
        String readString2 = parcel.readString();
        String[] createStringArray = parcel.createStringArray();
        Objects.requireNonNull(createStringArray);
        return new zzafp(readString, readString2, zzfvs.zzk(createStringArray));
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzafp[i10];
    }
}
