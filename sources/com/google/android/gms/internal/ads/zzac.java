package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;
import java.util.UUID;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzac implements Parcelable {
    public static final Parcelable.Creator<zzac> CREATOR = new zzab();
    public final UUID zza;
    public final String zzb;
    public final String zzc;
    public final byte[] zzd;
    private int zze;

    zzac(Parcel parcel) {
        this.zza = new UUID(parcel.readLong(), parcel.readLong());
        this.zzb = parcel.readString();
        String readString = parcel.readString();
        int i10 = zzfk.zza;
        this.zzc = readString;
        this.zzd = parcel.createByteArray();
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzac)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        zzac zzac = (zzac) obj;
        return zzfk.zzE(this.zzb, zzac.zzb) && zzfk.zzE(this.zzc, zzac.zzc) && zzfk.zzE(this.zza, zzac.zza) && Arrays.equals(this.zzd, zzac.zzd);
    }

    public final int hashCode() {
        int i10;
        int i11 = this.zze;
        if (i11 != 0) {
            return i11;
        }
        int hashCode = this.zza.hashCode() * 31;
        String str = this.zzb;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        int hashCode2 = ((((hashCode + i10) * 31) + this.zzc.hashCode()) * 31) + Arrays.hashCode(this.zzd);
        this.zze = hashCode2;
        return hashCode2;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.zza.getMostSignificantBits());
        parcel.writeLong(this.zza.getLeastSignificantBits());
        parcel.writeString(this.zzb);
        parcel.writeString(this.zzc);
        parcel.writeByteArray(this.zzd);
    }

    public zzac(UUID uuid, String str, String str2, byte[] bArr) {
        Objects.requireNonNull(uuid);
        this.zza = uuid;
        this.zzb = null;
        this.zzc = str2;
        this.zzd = bArr;
    }
}
