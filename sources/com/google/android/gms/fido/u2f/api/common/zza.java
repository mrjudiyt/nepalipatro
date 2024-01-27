package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.u2f.api.common.ChannelIdValue;

/* compiled from: com.google.android.gms:play-services-fido@@19.0.1 */
final class zza implements Parcelable.Creator {
    zza() {
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        try {
            return ChannelIdValue.toChannelIdValueType(parcel.readInt());
        } catch (ChannelIdValue.UnsupportedChannelIdValueTypeException e10) {
            throw new RuntimeException(e10);
        }
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new ChannelIdValue.ChannelIdValueType[i10];
    }
}
