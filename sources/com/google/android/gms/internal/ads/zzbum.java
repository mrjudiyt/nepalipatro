package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Collections;
import java.util.List;

@SafeParcelable.Class(creator = "AutoClickProtectionConfigurationParcelCreator")
@SafeParcelable.Reserved({1})
/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzbum extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbum> CREATOR = new zzbun();
    @SafeParcelable.Field(id = 2)
    public final boolean zza;
    @SafeParcelable.Field(id = 3)
    public final List zzb;

    public zzbum() {
        this(false, Collections.emptyList());
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        boolean z10 = this.zza;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 2, z10);
        SafeParcelWriter.writeStringList(parcel, 3, this.zzb, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zzbum(@SafeParcelable.Param(id = 2) boolean z10, @SafeParcelable.Param(id = 3) List list) {
        this.zza = z10;
        this.zzb = list;
    }
}
