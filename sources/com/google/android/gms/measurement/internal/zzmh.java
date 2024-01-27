package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "TriggerUriParcelCreator")
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.0 */
public final class zzmh extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzmh> CREATOR = new zzmk();
    @SafeParcelable.Field(id = 1)
    public final String zza;
    @SafeParcelable.Field(id = 2)
    public final long zzb;
    @SafeParcelable.Field(id = 3)
    public final int zzc;

    @SafeParcelable.Constructor
    zzmh(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) long j10, @SafeParcelable.Param(id = 3) int i10) {
        this.zza = str;
        this.zzb = j10;
        this.zzc = i10;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.zza, false);
        SafeParcelWriter.writeLong(parcel, 2, this.zzb);
        SafeParcelWriter.writeInt(parcel, 3, this.zzc);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
