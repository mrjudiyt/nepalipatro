package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzaej implements zzbx {
    public static final Parcelable.Creator<zzaej> CREATOR = new zzaei();
    private static final zzam zzf;
    private static final zzam zzg;
    public final String zza;
    public final String zzb;
    public final long zzc;
    public final long zzd;
    public final byte[] zze;
    private int zzh;

    static {
        zzak zzak = new zzak();
        zzak.zzU("application/id3");
        zzf = zzak.zzac();
        zzak zzak2 = new zzak();
        zzak2.zzU("application/x-scte35");
        zzg = zzak2.zzac();
    }

    zzaej(Parcel parcel) {
        String readString = parcel.readString();
        int i10 = zzfk.zza;
        this.zza = readString;
        this.zzb = parcel.readString();
        this.zzc = parcel.readLong();
        this.zzd = parcel.readLong();
        this.zze = parcel.createByteArray();
    }

    public zzaej(String str, String str2, long j10, long j11, byte[] bArr) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = j10;
        this.zzd = j11;
        this.zze = bArr;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaej.class == obj.getClass()) {
            zzaej zzaej = (zzaej) obj;
            return this.zzc == zzaej.zzc && this.zzd == zzaej.zzd && zzfk.zzE(this.zza, zzaej.zza) && zzfk.zzE(this.zzb, zzaej.zzb) && Arrays.equals(this.zze, zzaej.zze);
        }
    }

    public final int hashCode() {
        int i10 = this.zzh;
        if (i10 != 0) {
            return i10;
        }
        String str = this.zza;
        int i11 = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.zzb;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        long j10 = this.zzc;
        long j11 = this.zzd;
        int hashCode2 = ((((((((hashCode + 527) * 31) + i11) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + Arrays.hashCode(this.zze);
        this.zzh = hashCode2;
        return hashCode2;
    }

    public final String toString() {
        return "EMSG: scheme=" + this.zza + ", id=" + this.zzd + ", durationMs=" + this.zzc + ", value=" + this.zzb;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.zza);
        parcel.writeString(this.zzb);
        parcel.writeLong(this.zzc);
        parcel.writeLong(this.zzd);
        parcel.writeByteArray(this.zze);
    }

    public final /* synthetic */ void zza(zzbt zzbt) {
    }
}
