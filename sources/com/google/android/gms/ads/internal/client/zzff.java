package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "RequestConfigurationParcelCreator")
/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
public final class zzff extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzff> CREATOR = new zzfg();
    @SafeParcelable.Field(id = 1)
    public final int zza;
    @SafeParcelable.Field(id = 2)
    public final int zzb;

    @SafeParcelable.Constructor
    public zzff(@SafeParcelable.Param(id = 1) int i10, @SafeParcelable.Param(id = 2) int i11) {
        this.zza = i10;
        this.zzb = i11;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.zza;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, i11);
        SafeParcelWriter.writeInt(parcel, 2, this.zzb);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public zzff(RequestConfiguration requestConfiguration) {
        this.zza = requestConfiguration.getTagForChildDirectedTreatment();
        this.zzb = requestConfiguration.getTagForUnderAgeOfConsent();
    }
}
