package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzaey extends zzafh {
    public static final Parcelable.Creator<zzaey> CREATOR = new zzaex();
    public final String zza;
    public final boolean zzb;
    public final boolean zzc;
    public final String[] zzd;
    private final zzafh[] zze;

    zzaey(Parcel parcel) {
        super("CTOC");
        String readString = parcel.readString();
        int i10 = zzfk.zza;
        this.zza = readString;
        boolean z10 = true;
        this.zzb = parcel.readByte() != 0;
        this.zzc = parcel.readByte() == 0 ? false : z10;
        this.zzd = parcel.createStringArray();
        int readInt = parcel.readInt();
        this.zze = new zzafh[readInt];
        for (int i11 = 0; i11 < readInt; i11++) {
            this.zze[i11] = (zzafh) parcel.readParcelable(zzafh.class.getClassLoader());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaey.class == obj.getClass()) {
            zzaey zzaey = (zzaey) obj;
            return this.zzb == zzaey.zzb && this.zzc == zzaey.zzc && zzfk.zzE(this.zza, zzaey.zza) && Arrays.equals(this.zzd, zzaey.zzd) && Arrays.equals(this.zze, zzaey.zze);
        }
    }

    public final int hashCode() {
        String str = this.zza;
        return (((((this.zzb ? 1 : 0) + true) * 31) + (this.zzc ? 1 : 0)) * 31) + (str != null ? str.hashCode() : 0);
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.zza);
        parcel.writeByte(this.zzb ? (byte) 1 : 0);
        parcel.writeByte(this.zzc ? (byte) 1 : 0);
        parcel.writeStringArray(this.zzd);
        parcel.writeInt(this.zze.length);
        for (zzafh writeParcelable : this.zze) {
            parcel.writeParcelable(writeParcelable, 0);
        }
    }

    public zzaey(String str, boolean z10, boolean z11, String[] strArr, zzafh[] zzafhArr) {
        super("CTOC");
        this.zza = str;
        this.zzb = z10;
        this.zzc = z11;
        this.zzd = strArr;
        this.zze = zzafhArr;
    }
}
