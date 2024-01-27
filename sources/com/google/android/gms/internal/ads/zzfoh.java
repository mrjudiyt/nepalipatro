package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "ProgramRequestCreator")
/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzfoh extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfoh> CREATOR = new zzfoi();
    @SafeParcelable.VersionField(id = 1)
    public final int zza;
    @SafeParcelable.Field(id = 2)
    public final int zzb;
    @SafeParcelable.Field(id = 3)
    public final String zzc;
    @SafeParcelable.Field(id = 4)
    public final String zzd;
    @SafeParcelable.Field(id = 5)
    public final int zze;

    @SafeParcelable.Constructor
    zzfoh(@SafeParcelable.Param(id = 1) int i10, @SafeParcelable.Param(id = 2) int i11, @SafeParcelable.Param(id = 5) int i12, @SafeParcelable.Param(id = 3) String str, @SafeParcelable.Param(id = 4) String str2) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = str;
        this.zzd = str2;
        this.zze = i12;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.zza;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, i11);
        SafeParcelWriter.writeInt(parcel, 2, this.zzb);
        SafeParcelWriter.writeString(parcel, 3, this.zzc, false);
        SafeParcelWriter.writeString(parcel, 4, this.zzd, false);
        SafeParcelWriter.writeInt(parcel, 5, this.zze);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public zzfoh(int i10, int i11, String str, String str2) {
        this(1, 1, i11 - 1, str, str2);
    }
}
