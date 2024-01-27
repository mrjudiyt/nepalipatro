package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzafu implements zzbx {
    public static final Parcelable.Creator<zzafu> CREATOR = new zzafs();
    public final long zza;
    public final long zzb;
    public final long zzc;
    public final long zzd;
    public final long zze;

    public zzafu(long j10, long j11, long j12, long j13, long j14) {
        this.zza = j10;
        this.zzb = j11;
        this.zzc = j12;
        this.zzd = j13;
        this.zze = j14;
    }

    /* synthetic */ zzafu(Parcel parcel, zzaft zzaft) {
        this.zza = parcel.readLong();
        this.zzb = parcel.readLong();
        this.zzc = parcel.readLong();
        this.zzd = parcel.readLong();
        this.zze = parcel.readLong();
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzafu.class == obj.getClass()) {
            zzafu zzafu = (zzafu) obj;
            return this.zza == zzafu.zza && this.zzb == zzafu.zzb && this.zzc == zzafu.zzc && this.zzd == zzafu.zzd && this.zze == zzafu.zze;
        }
    }

    public final int hashCode() {
        long j10 = this.zze;
        long j11 = this.zza;
        long j12 = j10 ^ (j10 >>> 32);
        long j13 = this.zzd;
        long j14 = j13 ^ (j13 >>> 32);
        long j15 = this.zzc;
        long j16 = j15 ^ (j15 >>> 32);
        long j17 = this.zzb;
        return ((((((((((int) (j11 ^ (j11 >>> 32))) + 527) * 31) + ((int) (j17 ^ (j17 >>> 32)))) * 31) + ((int) j16)) * 31) + ((int) j14)) * 31) + ((int) j12);
    }

    public final String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.zza + ", photoSize=" + this.zzb + ", photoPresentationTimestampUs=" + this.zzc + ", videoStartPosition=" + this.zzd + ", videoSize=" + this.zze;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.zza);
        parcel.writeLong(this.zzb);
        parcel.writeLong(this.zzc);
        parcel.writeLong(this.zzd);
        parcel.writeLong(this.zze);
    }

    public final /* synthetic */ void zza(zzbt zzbt) {
    }
}
