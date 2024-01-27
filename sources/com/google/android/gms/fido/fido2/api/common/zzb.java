package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.AttestationConveyancePreference;

/* compiled from: com.google.android.gms:play-services-fido@@19.0.1 */
final class zzb implements Parcelable.Creator {
    zzb() {
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        try {
            return AttestationConveyancePreference.fromString(parcel.readString());
        } catch (AttestationConveyancePreference.UnsupportedAttestationConveyancePreferenceException e10) {
            throw new RuntimeException(e10);
        }
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new AttestationConveyancePreference[i10];
    }
}
