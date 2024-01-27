package com.google.android.gms.ads.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzk implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        String str = null;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        float f10 = 0.0f;
        int i10 = 0;
        boolean z13 = false;
        boolean z14 = false;
        boolean z15 = false;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(readHeader)) {
                case 2:
                    z10 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 3:
                    z11 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 4:
                    str = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 5:
                    z12 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 6:
                    f10 = SafeParcelReader.readFloat(parcel, readHeader);
                    break;
                case 7:
                    i10 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 8:
                    z13 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 9:
                    z14 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 10:
                    z15 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, readHeader);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new zzj(z10, z11, str, z12, f10, i10, z13, z14, z15);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzj[i10];
    }
}
