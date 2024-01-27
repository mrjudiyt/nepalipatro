package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzaew extends zzafh {
    public static final Parcelable.Creator<zzaew> CREATOR = new zzaev();
    public final String zza;
    public final int zzb;
    public final int zzc;
    public final long zzd;
    public final long zze;
    private final zzafh[] zzg;

    zzaew(Parcel parcel) {
        super("CHAP");
        String readString = parcel.readString();
        int i10 = zzfk.zza;
        this.zza = readString;
        this.zzb = parcel.readInt();
        this.zzc = parcel.readInt();
        this.zzd = parcel.readLong();
        this.zze = parcel.readLong();
        int readInt = parcel.readInt();
        this.zzg = new zzafh[readInt];
        for (int i11 = 0; i11 < readInt; i11++) {
            this.zzg[i11] = (zzafh) parcel.readParcelable(zzafh.class.getClassLoader());
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaew.class == obj.getClass()) {
            zzaew zzaew = (zzaew) obj;
            return this.zzb == zzaew.zzb && this.zzc == zzaew.zzc && this.zzd == zzaew.zzd && this.zze == zzaew.zze && zzfk.zzE(this.zza, zzaew.zza) && Arrays.equals(this.zzg, zzaew.zzg);
        }
    }

    public final int hashCode() {
        String str = this.zza;
        return ((((((((this.zzb + 527) * 31) + this.zzc) * 31) + ((int) this.zzd)) * 31) + ((int) this.zze)) * 31) + (str != null ? str.hashCode() : 0);
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.zza);
        parcel.writeInt(this.zzb);
        parcel.writeInt(this.zzc);
        parcel.writeLong(this.zzd);
        parcel.writeLong(this.zze);
        parcel.writeInt(this.zzg.length);
        for (zzafh writeParcelable : this.zzg) {
            parcel.writeParcelable(writeParcelable, 0);
        }
    }

    public zzaew(String str, int i10, int i11, long j10, long j11, zzafh[] zzafhArr) {
        super("CHAP");
        this.zza = str;
        this.zzb = i10;
        this.zzc = i11;
        this.zzd = j10;
        this.zze = j11;
        this.zzg = zzafhArr;
    }
}
