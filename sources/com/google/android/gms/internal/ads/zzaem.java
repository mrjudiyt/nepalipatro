package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzaem implements zzbx {
    public static final Parcelable.Creator<zzaem> CREATOR = new zzael();
    public final int zza;
    public final String zzb;
    public final String zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final byte[] zzh;

    public zzaem(int i10, String str, String str2, int i11, int i12, int i13, int i14, byte[] bArr) {
        this.zza = i10;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = i11;
        this.zze = i12;
        this.zzf = i13;
        this.zzg = i14;
        this.zzh = bArr;
    }

    zzaem(Parcel parcel) {
        this.zza = parcel.readInt();
        String readString = parcel.readString();
        int i10 = zzfk.zza;
        this.zzb = readString;
        this.zzc = parcel.readString();
        this.zzd = parcel.readInt();
        this.zze = parcel.readInt();
        this.zzf = parcel.readInt();
        this.zzg = parcel.readInt();
        this.zzh = parcel.createByteArray();
    }

    public static zzaem zzb(zzfb zzfb) {
        int zzf2 = zzfb.zzf();
        String zzy = zzfb.zzy(zzfb.zzf(), zzfsi.zza);
        String zzy2 = zzfb.zzy(zzfb.zzf(), zzfsi.zzc);
        int zzf3 = zzfb.zzf();
        int zzf4 = zzfb.zzf();
        int zzf5 = zzfb.zzf();
        int zzf6 = zzfb.zzf();
        int zzf7 = zzfb.zzf();
        byte[] bArr = new byte[zzf7];
        zzfb.zzC(bArr, 0, zzf7);
        return new zzaem(zzf2, zzy, zzy2, zzf3, zzf4, zzf5, zzf6, bArr);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaem.class == obj.getClass()) {
            zzaem zzaem = (zzaem) obj;
            return this.zza == zzaem.zza && this.zzb.equals(zzaem.zzb) && this.zzc.equals(zzaem.zzc) && this.zzd == zzaem.zzd && this.zze == zzaem.zze && this.zzf == zzaem.zzf && this.zzg == zzaem.zzg && Arrays.equals(this.zzh, zzaem.zzh);
        }
    }

    public final int hashCode() {
        return ((((((((((((((this.zza + 527) * 31) + this.zzb.hashCode()) * 31) + this.zzc.hashCode()) * 31) + this.zzd) * 31) + this.zze) * 31) + this.zzf) * 31) + this.zzg) * 31) + Arrays.hashCode(this.zzh);
    }

    public final String toString() {
        return "Picture: mimeType=" + this.zzb + ", description=" + this.zzc;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.zza);
        parcel.writeString(this.zzb);
        parcel.writeString(this.zzc);
        parcel.writeInt(this.zzd);
        parcel.writeInt(this.zze);
        parcel.writeInt(this.zzf);
        parcel.writeInt(this.zzg);
        parcel.writeByteArray(this.zzh);
    }

    public final void zza(zzbt zzbt) {
        zzbt.zza(this.zzh, this.zza);
    }
}
