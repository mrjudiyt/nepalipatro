package com.google.android.gms.fido.sourcedevice;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-fido@@19.0.1 */
public final class zzb implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        ArrayList arrayList = null;
        String str = null;
        int i10 = 0;
        boolean z10 = false;
        boolean z11 = false;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(readHeader);
            if (fieldId == 1) {
                i10 = SafeParcelReader.readInt(parcel, readHeader);
            } else if (fieldId == 2) {
                z10 = SafeParcelReader.readBoolean(parcel, readHeader);
            } else if (fieldId == 3) {
                arrayList = SafeParcelReader.createTypedList(parcel, readHeader, Account.CREATOR);
            } else if (fieldId == 4) {
                z11 = SafeParcelReader.readBoolean(parcel, readHeader);
            } else if (fieldId != 5) {
                SafeParcelReader.skipUnknownField(parcel, readHeader);
            } else {
                str = SafeParcelReader.createString(parcel, readHeader);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new SourceStartDirectTransferOptions(i10, z10, arrayList, z11, str);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new SourceStartDirectTransferOptions[i10];
    }
}
