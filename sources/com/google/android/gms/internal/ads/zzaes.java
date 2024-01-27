package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzaes extends zzafh {
    public static final Parcelable.Creator<zzaes> CREATOR = new zzaer();
    public final String zza;
    public final String zzb;
    public final int zzc;
    public final byte[] zzd;

    zzaes(Parcel parcel) {
        super("APIC");
        String readString = parcel.readString();
        int i10 = zzfk.zza;
        this.zza = readString;
        this.zzb = parcel.readString();
        this.zzc = parcel.readInt();
        this.zzd = parcel.createByteArray();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaes.class == obj.getClass()) {
            zzaes zzaes = (zzaes) obj;
            return this.zzc == zzaes.zzc && zzfk.zzE(this.zza, zzaes.zza) && zzfk.zzE(this.zzb, zzaes.zzb) && Arrays.equals(this.zzd, zzaes.zzd);
        }
    }

    public final int hashCode() {
        String str = this.zza;
        int i10 = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        int i11 = this.zzc;
        String str2 = this.zzb;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return ((((((i11 + 527) * 31) + hashCode) * 31) + i10) * 31) + Arrays.hashCode(this.zzd);
    }

    public final String toString() {
        return this.zzf + ": mimeType=" + this.zza + ", description=" + this.zzb;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.zza);
        parcel.writeString(this.zzb);
        parcel.writeInt(this.zzc);
        parcel.writeByteArray(this.zzd);
    }

    public final void zza(zzbt zzbt) {
        zzbt.zza(this.zzd, this.zzc);
    }

    public zzaes(String str, String str2, int i10, byte[] bArr) {
        super("APIC");
        this.zza = str;
        this.zzb = str2;
        this.zzc = i10;
        this.zzd = bArr;
    }
}
