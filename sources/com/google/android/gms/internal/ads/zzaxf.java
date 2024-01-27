package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzaxf implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        long j10 = 0;
        ParcelFileDescriptor parcelFileDescriptor = null;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(readHeader);
            if (fieldId == 2) {
                parcelFileDescriptor = (ParcelFileDescriptor) SafeParcelReader.createParcelable(parcel, readHeader, ParcelFileDescriptor.CREATOR);
            } else if (fieldId == 3) {
                z10 = SafeParcelReader.readBoolean(parcel, readHeader);
            } else if (fieldId == 4) {
                z11 = SafeParcelReader.readBoolean(parcel, readHeader);
            } else if (fieldId == 5) {
                j10 = SafeParcelReader.readLong(parcel, readHeader);
            } else if (fieldId != 6) {
                SafeParcelReader.skipUnknownField(parcel, readHeader);
            } else {
                z12 = SafeParcelReader.readBoolean(parcel, readHeader);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new zzaxe(parcelFileDescriptor, z10, z11, j10, z12);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzaxe[i10];
    }
}
