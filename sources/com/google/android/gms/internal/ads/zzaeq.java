package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzaeq implements zzbx {
    public static final Parcelable.Creator<zzaeq> CREATOR = new zzaep();
    public final int zza;
    public final String zzb;
    public final String zzc;
    public final String zzd;
    public final boolean zze;
    public final int zzf;

    public zzaeq(int i10, String str, String str2, String str3, boolean z10, int i11) {
        boolean z11 = true;
        if (i11 != -1 && i11 <= 0) {
            z11 = false;
        }
        zzdx.zzd(z11);
        this.zza = i10;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = str3;
        this.zze = z10;
        this.zzf = i11;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaeq.class == obj.getClass()) {
            zzaeq zzaeq = (zzaeq) obj;
            return this.zza == zzaeq.zza && zzfk.zzE(this.zzb, zzaeq.zzb) && zzfk.zzE(this.zzc, zzaeq.zzc) && zzfk.zzE(this.zzd, zzaeq.zzd) && this.zze == zzaeq.zze && this.zzf == zzaeq.zzf;
        }
    }

    public final int hashCode() {
        String str = this.zzb;
        int i10 = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        int i11 = this.zza;
        String str2 = this.zzc;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        int i12 = ((i11 + 527) * 31) + hashCode;
        String str3 = this.zzd;
        if (str3 != null) {
            i10 = str3.hashCode();
        }
        return (((((((i12 * 31) + hashCode2) * 31) + i10) * 31) + (this.zze ? 1 : 0)) * 31) + this.zzf;
    }

    public final String toString() {
        return "IcyHeaders: name=\"" + this.zzc + "\", genre=\"" + this.zzb + "\", bitrate=" + this.zza + ", metadataInterval=" + this.zzf;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.zza);
        parcel.writeString(this.zzb);
        parcel.writeString(this.zzc);
        parcel.writeString(this.zzd);
        int i11 = zzfk.zza;
        parcel.writeInt(this.zze ? 1 : 0);
        parcel.writeInt(this.zzf);
    }

    public final void zza(zzbt zzbt) {
        String str = this.zzc;
        if (str != null) {
            zzbt.zzp(str);
        }
        String str2 = this.zzb;
        if (str2 != null) {
            zzbt.zzi(str2);
        }
    }

    zzaeq(Parcel parcel) {
        this.zza = parcel.readInt();
        this.zzb = parcel.readString();
        this.zzc = parcel.readString();
        this.zzd = parcel.readString();
        int i10 = zzfk.zza;
        this.zze = parcel.readInt() != 0;
        this.zzf = parcel.readInt();
    }
}
