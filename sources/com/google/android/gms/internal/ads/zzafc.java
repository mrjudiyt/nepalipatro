package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzafc extends zzafh {
    public static final Parcelable.Creator<zzafc> CREATOR = new zzafb();
    public final String zza;
    public final String zzb;
    public final String zzc;
    public final byte[] zzd;

    zzafc(Parcel parcel) {
        super("GEOB");
        String readString = parcel.readString();
        int i10 = zzfk.zza;
        this.zza = readString;
        this.zzb = parcel.readString();
        this.zzc = parcel.readString();
        this.zzd = parcel.createByteArray();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzafc.class == obj.getClass()) {
            zzafc zzafc = (zzafc) obj;
            return zzfk.zzE(this.zza, zzafc.zza) && zzfk.zzE(this.zzb, zzafc.zzb) && zzfk.zzE(this.zzc, zzafc.zzc) && Arrays.equals(this.zzd, zzafc.zzd);
        }
    }

    public final int hashCode() {
        String str = this.zza;
        int i10 = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.zzb;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        int i11 = hashCode + 527;
        String str3 = this.zzc;
        if (str3 != null) {
            i10 = str3.hashCode();
        }
        return (((((i11 * 31) + hashCode2) * 31) + i10) * 31) + Arrays.hashCode(this.zzd);
    }

    public final String toString() {
        return this.zzf + ": mimeType=" + this.zza + ", filename=" + this.zzb + ", description=" + this.zzc;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.zza);
        parcel.writeString(this.zzb);
        parcel.writeString(this.zzc);
        parcel.writeByteArray(this.zzd);
    }

    public zzafc(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = bArr;
    }
}
