package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzfu implements zzbx {
    public static final Parcelable.Creator<zzfu> CREATOR = new zzfs();
    public final long zza;
    public final long zzb;
    public final long zzc;

    public zzfu(long j10, long j11, long j12) {
        this.zza = j10;
        this.zzb = j11;
        this.zzc = j12;
    }

    /* synthetic */ zzfu(Parcel parcel, zzft zzft) {
        this.zza = parcel.readLong();
        this.zzb = parcel.readLong();
        this.zzc = parcel.readLong();
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzfu)) {
            return false;
        }
        zzfu zzfu = (zzfu) obj;
        return this.zza == zzfu.zza && this.zzb == zzfu.zzb && this.zzc == zzfu.zzc;
    }

    public final int hashCode() {
        long j10 = this.zzc;
        long j11 = this.zza;
        long j12 = j10 ^ (j10 >>> 32);
        long j13 = this.zzb;
        return ((((((int) (j11 ^ (j11 >>> 32))) + 527) * 31) + ((int) (j13 ^ (j13 >>> 32)))) * 31) + ((int) j12);
    }

    public final String toString() {
        return "Mp4Timestamp: creation time=" + this.zza + ", modification time=" + this.zzb + ", timescale=" + this.zzc;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.zza);
        parcel.writeLong(this.zzb);
        parcel.writeLong(this.zzc);
    }

    public final /* synthetic */ void zza(zzbt zzbt) {
    }
}
