package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: com.google.android.gms:play-services-fido@@19.0.1 */
final class zzar implements Parcelable.Creator {
    zzar() {
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        try {
            return zzat.zza(parcel.readString());
        } catch (zzas e10) {
            throw new RuntimeException(e10);
        }
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzat[i10];
    }
}
