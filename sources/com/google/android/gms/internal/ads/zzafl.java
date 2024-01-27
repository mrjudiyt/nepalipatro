package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzafl extends zzafh {
    public static final Parcelable.Creator<zzafl> CREATOR = new zzafk();
    public final int zza;
    public final int zzb;
    public final int zzc;
    public final int[] zzd;
    public final int[] zze;

    public zzafl(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.zza = i10;
        this.zzb = i11;
        this.zzc = i12;
        this.zzd = iArr;
        this.zze = iArr2;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzafl.class == obj.getClass()) {
            zzafl zzafl = (zzafl) obj;
            return this.zza == zzafl.zza && this.zzb == zzafl.zzb && this.zzc == zzafl.zzc && Arrays.equals(this.zzd, zzafl.zzd) && Arrays.equals(this.zze, zzafl.zze);
        }
    }

    public final int hashCode() {
        return ((((((((this.zza + 527) * 31) + this.zzb) * 31) + this.zzc) * 31) + Arrays.hashCode(this.zzd)) * 31) + Arrays.hashCode(this.zze);
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.zza);
        parcel.writeInt(this.zzb);
        parcel.writeInt(this.zzc);
        parcel.writeIntArray(this.zzd);
        parcel.writeIntArray(this.zze);
    }

    zzafl(Parcel parcel) {
        super("MLLT");
        this.zza = parcel.readInt();
        this.zzb = parcel.readInt();
        this.zzc = parcel.readInt();
        int[] createIntArray = parcel.createIntArray();
        int i10 = zzfk.zza;
        this.zzd = createIntArray;
        this.zze = parcel.createIntArray();
    }
}
