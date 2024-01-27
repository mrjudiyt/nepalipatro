package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzafn extends zzafh {
    public static final Parcelable.Creator<zzafn> CREATOR = new zzafm();
    public final String zza;
    public final byte[] zzb;

    zzafn(Parcel parcel) {
        super("PRIV");
        String readString = parcel.readString();
        int i10 = zzfk.zza;
        this.zza = readString;
        this.zzb = parcel.createByteArray();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzafn.class == obj.getClass()) {
            zzafn zzafn = (zzafn) obj;
            return zzfk.zzE(this.zza, zzafn.zza) && Arrays.equals(this.zzb, zzafn.zzb);
        }
    }

    public final int hashCode() {
        String str = this.zza;
        return (((str != null ? str.hashCode() : 0) + 527) * 31) + Arrays.hashCode(this.zzb);
    }

    public final String toString() {
        return this.zzf + ": owner=" + this.zza;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.zza);
        parcel.writeByteArray(this.zzb);
    }

    public zzafn(String str, byte[] bArr) {
        super("PRIV");
        this.zza = str;
        this.zzb = bArr;
    }
}
