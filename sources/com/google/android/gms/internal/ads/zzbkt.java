package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "HttpRequestParcelCreator")
/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzbkt extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbkt> CREATOR = new zzbku();
    @SafeParcelable.Field(id = 1)
    public final String zza;
    @SafeParcelable.Field(id = 2)
    public final String[] zzb;
    @SafeParcelable.Field(id = 3)
    public final String[] zzc;

    @SafeParcelable.Constructor
    zzbkt(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) String[] strArr, @SafeParcelable.Param(id = 3) String[] strArr2) {
        this.zza = str;
        this.zzb = strArr;
        this.zzc = strArr2;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.zza;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, str, false);
        SafeParcelWriter.writeStringArray(parcel, 2, this.zzb, false);
        SafeParcelWriter.writeStringArray(parcel, 3, this.zzc, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
