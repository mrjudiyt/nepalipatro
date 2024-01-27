package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.0 */
public final class zzq implements Parcelable.Creator<zzo> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        String str = "";
        String str2 = str;
        String str3 = str2;
        long j10 = 0;
        long j11 = 0;
        long j12 = 0;
        long j13 = 0;
        long j14 = 0;
        long j15 = 0;
        long j16 = 0;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        Boolean bool = null;
        ArrayList<String> arrayList = null;
        String str11 = null;
        String str12 = null;
        long j17 = -2147483648L;
        boolean z10 = true;
        boolean z11 = false;
        int i10 = 0;
        boolean z12 = true;
        boolean z13 = false;
        boolean z14 = false;
        int i11 = 100;
        int i12 = 0;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(readHeader)) {
                case 2:
                    str4 = SafeParcelReader.createString(parcel2, readHeader);
                    break;
                case 3:
                    str5 = SafeParcelReader.createString(parcel2, readHeader);
                    break;
                case 4:
                    str6 = SafeParcelReader.createString(parcel2, readHeader);
                    break;
                case 5:
                    str7 = SafeParcelReader.createString(parcel2, readHeader);
                    break;
                case 6:
                    j10 = SafeParcelReader.readLong(parcel2, readHeader);
                    break;
                case 7:
                    j11 = SafeParcelReader.readLong(parcel2, readHeader);
                    break;
                case 8:
                    str8 = SafeParcelReader.createString(parcel2, readHeader);
                    break;
                case 9:
                    z10 = SafeParcelReader.readBoolean(parcel2, readHeader);
                    break;
                case 10:
                    z11 = SafeParcelReader.readBoolean(parcel2, readHeader);
                    break;
                case 11:
                    j17 = SafeParcelReader.readLong(parcel2, readHeader);
                    break;
                case 12:
                    str9 = SafeParcelReader.createString(parcel2, readHeader);
                    break;
                case 13:
                    j12 = SafeParcelReader.readLong(parcel2, readHeader);
                    break;
                case 14:
                    j13 = SafeParcelReader.readLong(parcel2, readHeader);
                    break;
                case 15:
                    i10 = SafeParcelReader.readInt(parcel2, readHeader);
                    break;
                case 16:
                    z12 = SafeParcelReader.readBoolean(parcel2, readHeader);
                    break;
                case 18:
                    z13 = SafeParcelReader.readBoolean(parcel2, readHeader);
                    break;
                case 19:
                    str10 = SafeParcelReader.createString(parcel2, readHeader);
                    break;
                case 21:
                    bool = SafeParcelReader.readBooleanObject(parcel2, readHeader);
                    break;
                case 22:
                    j14 = SafeParcelReader.readLong(parcel2, readHeader);
                    break;
                case 23:
                    arrayList = SafeParcelReader.createStringList(parcel2, readHeader);
                    break;
                case 24:
                    str11 = SafeParcelReader.createString(parcel2, readHeader);
                    break;
                case 25:
                    str = SafeParcelReader.createString(parcel2, readHeader);
                    break;
                case 26:
                    str2 = SafeParcelReader.createString(parcel2, readHeader);
                    break;
                case 27:
                    str12 = SafeParcelReader.createString(parcel2, readHeader);
                    break;
                case 28:
                    z14 = SafeParcelReader.readBoolean(parcel2, readHeader);
                    break;
                case 29:
                    j15 = SafeParcelReader.readLong(parcel2, readHeader);
                    break;
                case 30:
                    i11 = SafeParcelReader.readInt(parcel2, readHeader);
                    break;
                case 31:
                    str3 = SafeParcelReader.createString(parcel2, readHeader);
                    break;
                case 32:
                    i12 = SafeParcelReader.readInt(parcel2, readHeader);
                    break;
                case 34:
                    j16 = SafeParcelReader.readLong(parcel2, readHeader);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel2, readHeader);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel2, validateObjectHeader);
        return new zzo(str4, str5, str6, str7, j10, j11, str8, z10, z11, j17, str9, j12, j13, i10, z12, z13, str10, bool, j14, (List<String>) arrayList, str11, str, str2, str12, z14, j15, i11, str3, i12, j16);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzo[i10];
    }
}
