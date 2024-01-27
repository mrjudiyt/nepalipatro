package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.zzdu;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzbui implements Parcelable.Creator {
    public static final zzbuh zza(Parcel parcel) {
        Parcel parcel2 = parcel;
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        long j10 = 0;
        long j11 = 0;
        Bundle bundle = null;
        zzl zzl = null;
        zzq zzq = null;
        String str = null;
        ApplicationInfo applicationInfo = null;
        PackageInfo packageInfo = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        zzcaz zzcaz = null;
        Bundle bundle2 = null;
        ArrayList<String> arrayList = null;
        Bundle bundle3 = null;
        String str5 = null;
        String str6 = null;
        ArrayList<String> arrayList2 = null;
        String str7 = null;
        zzbfc zzbfc = null;
        ArrayList<String> arrayList3 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        Bundle bundle4 = null;
        String str11 = null;
        zzdu zzdu = null;
        Bundle bundle5 = null;
        String str12 = null;
        String str13 = null;
        String str14 = null;
        ArrayList<Integer> arrayList4 = null;
        String str15 = null;
        ArrayList<String> arrayList5 = null;
        ArrayList<String> arrayList6 = null;
        String str16 = null;
        zzbls zzbls = null;
        String str17 = null;
        Bundle bundle6 = null;
        int i10 = 0;
        int i11 = 0;
        boolean z10 = false;
        int i12 = 0;
        int i13 = 0;
        float f10 = 0.0f;
        float f11 = 0.0f;
        boolean z11 = false;
        int i14 = 0;
        int i15 = 0;
        boolean z12 = false;
        boolean z13 = false;
        int i16 = 0;
        boolean z14 = false;
        boolean z15 = false;
        int i17 = 0;
        boolean z16 = false;
        boolean z17 = false;
        boolean z18 = false;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(readHeader)) {
                case 1:
                    i10 = SafeParcelReader.readInt(parcel2, readHeader);
                    break;
                case 2:
                    bundle = SafeParcelReader.createBundle(parcel2, readHeader);
                    break;
                case 3:
                    zzl = (zzl) SafeParcelReader.createParcelable(parcel2, readHeader, zzl.CREATOR);
                    break;
                case 4:
                    zzq = (zzq) SafeParcelReader.createParcelable(parcel2, readHeader, zzq.CREATOR);
                    break;
                case 5:
                    str = SafeParcelReader.createString(parcel2, readHeader);
                    break;
                case 6:
                    applicationInfo = (ApplicationInfo) SafeParcelReader.createParcelable(parcel2, readHeader, ApplicationInfo.CREATOR);
                    break;
                case 7:
                    packageInfo = (PackageInfo) SafeParcelReader.createParcelable(parcel2, readHeader, PackageInfo.CREATOR);
                    break;
                case 8:
                    str2 = SafeParcelReader.createString(parcel2, readHeader);
                    break;
                case 9:
                    str3 = SafeParcelReader.createString(parcel2, readHeader);
                    break;
                case 10:
                    str4 = SafeParcelReader.createString(parcel2, readHeader);
                    break;
                case 11:
                    zzcaz = (zzcaz) SafeParcelReader.createParcelable(parcel2, readHeader, zzcaz.CREATOR);
                    break;
                case 12:
                    bundle2 = SafeParcelReader.createBundle(parcel2, readHeader);
                    break;
                case 13:
                    i11 = SafeParcelReader.readInt(parcel2, readHeader);
                    break;
                case 14:
                    arrayList = SafeParcelReader.createStringList(parcel2, readHeader);
                    break;
                case 15:
                    bundle3 = SafeParcelReader.createBundle(parcel2, readHeader);
                    break;
                case 16:
                    z10 = SafeParcelReader.readBoolean(parcel2, readHeader);
                    break;
                case 18:
                    i12 = SafeParcelReader.readInt(parcel2, readHeader);
                    break;
                case 19:
                    i13 = SafeParcelReader.readInt(parcel2, readHeader);
                    break;
                case 20:
                    f10 = SafeParcelReader.readFloat(parcel2, readHeader);
                    break;
                case 21:
                    str5 = SafeParcelReader.createString(parcel2, readHeader);
                    break;
                case 25:
                    j10 = SafeParcelReader.readLong(parcel2, readHeader);
                    break;
                case 26:
                    str6 = SafeParcelReader.createString(parcel2, readHeader);
                    break;
                case 27:
                    arrayList2 = SafeParcelReader.createStringList(parcel2, readHeader);
                    break;
                case 28:
                    str7 = SafeParcelReader.createString(parcel2, readHeader);
                    break;
                case 29:
                    zzbfc = (zzbfc) SafeParcelReader.createParcelable(parcel2, readHeader, zzbfc.CREATOR);
                    break;
                case 30:
                    arrayList3 = SafeParcelReader.createStringList(parcel2, readHeader);
                    break;
                case 31:
                    j11 = SafeParcelReader.readLong(parcel2, readHeader);
                    break;
                case 33:
                    str8 = SafeParcelReader.createString(parcel2, readHeader);
                    break;
                case 34:
                    f11 = SafeParcelReader.readFloat(parcel2, readHeader);
                    break;
                case 35:
                    i14 = SafeParcelReader.readInt(parcel2, readHeader);
                    break;
                case 36:
                    i15 = SafeParcelReader.readInt(parcel2, readHeader);
                    break;
                case 37:
                    z12 = SafeParcelReader.readBoolean(parcel2, readHeader);
                    break;
                case 39:
                    str9 = SafeParcelReader.createString(parcel2, readHeader);
                    break;
                case 40:
                    z11 = SafeParcelReader.readBoolean(parcel2, readHeader);
                    break;
                case 41:
                    str10 = SafeParcelReader.createString(parcel2, readHeader);
                    break;
                case 42:
                    z13 = SafeParcelReader.readBoolean(parcel2, readHeader);
                    break;
                case 43:
                    i16 = SafeParcelReader.readInt(parcel2, readHeader);
                    break;
                case 44:
                    bundle4 = SafeParcelReader.createBundle(parcel2, readHeader);
                    break;
                case 45:
                    str11 = SafeParcelReader.createString(parcel2, readHeader);
                    break;
                case 46:
                    zzdu = (zzdu) SafeParcelReader.createParcelable(parcel2, readHeader, zzdu.CREATOR);
                    break;
                case 47:
                    z14 = SafeParcelReader.readBoolean(parcel2, readHeader);
                    break;
                case 48:
                    bundle5 = SafeParcelReader.createBundle(parcel2, readHeader);
                    break;
                case 49:
                    str12 = SafeParcelReader.createString(parcel2, readHeader);
                    break;
                case 50:
                    str13 = SafeParcelReader.createString(parcel2, readHeader);
                    break;
                case 51:
                    str14 = SafeParcelReader.createString(parcel2, readHeader);
                    break;
                case 52:
                    z15 = SafeParcelReader.readBoolean(parcel2, readHeader);
                    break;
                case 53:
                    arrayList4 = SafeParcelReader.createIntegerList(parcel2, readHeader);
                    break;
                case 54:
                    str15 = SafeParcelReader.createString(parcel2, readHeader);
                    break;
                case 55:
                    arrayList5 = SafeParcelReader.createStringList(parcel2, readHeader);
                    break;
                case 56:
                    i17 = SafeParcelReader.readInt(parcel2, readHeader);
                    break;
                case 57:
                    z16 = SafeParcelReader.readBoolean(parcel2, readHeader);
                    break;
                case 58:
                    z17 = SafeParcelReader.readBoolean(parcel2, readHeader);
                    break;
                case 59:
                    z18 = SafeParcelReader.readBoolean(parcel2, readHeader);
                    break;
                case 60:
                    arrayList6 = SafeParcelReader.createStringList(parcel2, readHeader);
                    break;
                case 61:
                    str16 = SafeParcelReader.createString(parcel2, readHeader);
                    break;
                case 63:
                    zzbls = (zzbls) SafeParcelReader.createParcelable(parcel2, readHeader, zzbls.CREATOR);
                    break;
                case 64:
                    str17 = SafeParcelReader.createString(parcel2, readHeader);
                    break;
                case 65:
                    bundle6 = SafeParcelReader.createBundle(parcel2, readHeader);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel2, readHeader);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel2, validateObjectHeader);
        return new zzbuh(i10, bundle, zzl, zzq, str, applicationInfo, packageInfo, str2, str3, str4, zzcaz, bundle2, i11, arrayList, bundle3, z10, i12, i13, f10, str5, j10, str6, arrayList2, str7, zzbfc, arrayList3, j11, str8, f11, z11, i14, i15, z12, str9, str10, z13, i16, bundle4, str11, zzdu, z14, bundle5, str12, str13, str14, z15, arrayList4, str15, arrayList5, i17, z16, z17, z18, arrayList6, str16, zzbls, str17, bundle6);
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zza(parcel);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzbuh[i10];
    }
}
