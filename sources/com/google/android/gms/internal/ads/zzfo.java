package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzfo implements zzbx {
    public static final Parcelable.Creator<zzfo> CREATOR = new zzfm();
    public final String zza;
    public final byte[] zzb;
    public final int zzc;
    public final int zzd;

    /* synthetic */ zzfo(Parcel parcel, zzfn zzfn) {
        String readString = parcel.readString();
        int i10 = zzfk.zza;
        this.zza = readString;
        this.zzb = parcel.createByteArray();
        this.zzc = parcel.readInt();
        this.zzd = parcel.readInt();
    }

    public zzfo(String str, byte[] bArr, int i10, int i11) {
        this.zza = str;
        this.zzb = bArr;
        this.zzc = i10;
        this.zzd = i11;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzfo.class == obj.getClass()) {
            zzfo zzfo = (zzfo) obj;
            return this.zza.equals(zzfo.zza) && Arrays.equals(this.zzb, zzfo.zzb) && this.zzc == zzfo.zzc && this.zzd == zzfo.zzd;
        }
    }

    public final int hashCode() {
        return ((((((this.zza.hashCode() + 527) * 31) + Arrays.hashCode(this.zzb)) * 31) + this.zzc) * 31) + this.zzd;
    }

    public final String toString() {
        String str;
        int i10 = this.zzd;
        if (i10 != 1) {
            if (i10 == 23) {
                byte[] bArr = this.zzb;
                int i11 = zzfk.zza;
                zzdx.zzd(bArr.length == 4);
                str = String.valueOf(Float.intBitsToFloat((bArr[3] & 255) | ((bArr[1] & 255) << 16) | (bArr[0] << 24) | ((bArr[2] & 255) << 8)));
            } else if (i10 != 67) {
                byte[] bArr2 = this.zzb;
                int length = bArr2.length;
                StringBuilder sb = new StringBuilder(length + length);
                for (int i12 = 0; i12 < bArr2.length; i12++) {
                    sb.append(Character.forDigit((bArr2[i12] >> 4) & 15, 16));
                    sb.append(Character.forDigit(bArr2[i12] & 15, 16));
                }
                str = sb.toString();
            } else {
                byte[] bArr3 = this.zzb;
                int i13 = zzfk.zza;
                zzdx.zzd(bArr3.length == 4);
                str = String.valueOf(bArr3[3] | (bArr3[1] << 16) | (bArr3[0] << 24) | (bArr3[2] << 8));
            }
        } else {
            str = new String(this.zzb, zzfsi.zzc);
        }
        String str2 = this.zza;
        return "mdta: key=" + str2 + ", value=" + str;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.zza);
        parcel.writeByteArray(this.zzb);
        parcel.writeInt(this.zzc);
        parcel.writeInt(this.zzd);
    }

    public final /* synthetic */ void zza(zzbt zzbt) {
    }
}
