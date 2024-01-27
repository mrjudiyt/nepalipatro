package com.google.android.gms.fido.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.common.Transport;

/* compiled from: com.google.android.gms:play-services-fido@@19.0.1 */
final class zza implements Parcelable.Creator {
    zza() {
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        try {
            return Transport.fromString(parcel.readString());
        } catch (Transport.UnsupportedTransportException e10) {
            throw new RuntimeException(e10);
        }
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new Transport[i10];
    }
}
