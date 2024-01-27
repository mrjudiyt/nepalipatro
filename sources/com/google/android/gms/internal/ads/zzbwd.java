package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "RewardedVideoAdRequestParcelCreator")
@SafeParcelable.Reserved({1})
/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
public final class zzbwd extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbwd> CREATOR = new zzbwe();
    @SafeParcelable.Field(id = 2)
    public final zzl zza;
    @SafeParcelable.Field(id = 3)
    public final String zzb;

    @SafeParcelable.Constructor
    public zzbwd(@SafeParcelable.Param(id = 2) zzl zzl, @SafeParcelable.Param(id = 3) String str) {
        this.zza = zzl;
        this.zzb = str;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        zzl zzl = this.zza;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, zzl, i10, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzb, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
