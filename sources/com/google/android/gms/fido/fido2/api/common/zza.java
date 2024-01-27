package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.Attachment;

/* compiled from: com.google.android.gms:play-services-fido@@19.0.1 */
final class zza implements Parcelable.Creator {
    zza() {
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        try {
            return Attachment.fromString(parcel.readString());
        } catch (Attachment.UnsupportedAttachmentException e10) {
            throw new RuntimeException(e10);
        }
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new Attachment[i10];
    }
}
