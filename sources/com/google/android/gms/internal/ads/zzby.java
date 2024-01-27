package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzby implements Parcelable {
    public static final Parcelable.Creator<zzby> CREATOR = new zzbw();
    public final long zza;
    private final zzbx[] zzb;

    public zzby(long j10, zzbx... zzbxArr) {
        this.zza = j10;
        this.zzb = zzbxArr;
    }

    zzby(Parcel parcel) {
        this.zzb = new zzbx[parcel.readInt()];
        int i10 = 0;
        while (true) {
            zzbx[] zzbxArr = this.zzb;
            if (i10 < zzbxArr.length) {
                zzbxArr[i10] = (zzbx) parcel.readParcelable(zzbx.class.getClassLoader());
                i10++;
            } else {
                this.zza = parcel.readLong();
                return;
            }
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzby.class == obj.getClass()) {
            zzby zzby = (zzby) obj;
            return Arrays.equals(this.zzb, zzby.zzb) && this.zza == zzby.zza;
        }
    }

    public final int hashCode() {
        long j10 = this.zza;
        return (Arrays.hashCode(this.zzb) * 31) + ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        String str;
        long j10 = this.zza;
        int i10 = (j10 > -9223372036854775807L ? 1 : (j10 == -9223372036854775807L ? 0 : -1));
        String arrays = Arrays.toString(this.zzb);
        if (i10 == 0) {
            str = "";
        } else {
            str = ", presentationTimeUs=" + j10;
        }
        return "entries=" + arrays + str;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.zzb.length);
        for (zzbx writeParcelable : this.zzb) {
            parcel.writeParcelable(writeParcelable, 0);
        }
        parcel.writeLong(this.zza);
    }

    public final int zza() {
        return this.zzb.length;
    }

    public final zzbx zzb(int i10) {
        return this.zzb[i10];
    }

    public final zzby zzc(zzbx... zzbxArr) {
        int length = zzbxArr.length;
        if (length == 0) {
            return this;
        }
        long j10 = this.zza;
        zzbx[] zzbxArr2 = this.zzb;
        int i10 = zzfk.zza;
        int length2 = zzbxArr2.length;
        Object[] copyOf = Arrays.copyOf(zzbxArr2, length2 + length);
        System.arraycopy(zzbxArr, 0, copyOf, length2, length);
        return new zzby(j10, (zzbx[]) copyOf);
    }

    public final zzby zzd(zzby zzby) {
        return zzby == null ? this : zzc(zzby.zzb);
    }

    public zzby(List list) {
        this(-9223372036854775807L, (zzbx[]) list.toArray(new zzbx[0]));
    }
}
