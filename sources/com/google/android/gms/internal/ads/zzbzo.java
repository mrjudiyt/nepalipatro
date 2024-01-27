package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "SignalConfigurationParcelCreator")
/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
public final class zzbzo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbzo> CREATOR = new zzbzp();
    @SafeParcelable.Field(id = 1)
    public final String zza;
    @SafeParcelable.Field(id = 2)
    public final String zzb;
    @SafeParcelable.Field(id = 3)
    @Deprecated
    public final zzq zzc;
    @SafeParcelable.Field(id = 4)
    public final zzl zzd;

    @SafeParcelable.Constructor
    public zzbzo(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) String str2, @SafeParcelable.Param(id = 3) zzq zzq, @SafeParcelable.Param(id = 4) zzl zzl) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = zzq;
        this.zzd = zzl;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.zza;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, str, false);
        SafeParcelWriter.writeString(parcel, 2, this.zzb, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.zzc, i10, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.zzd, i10, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
