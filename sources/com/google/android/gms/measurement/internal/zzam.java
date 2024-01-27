package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "ConsentParcelCreator")
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.0 */
public final class zzam extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzam> CREATOR = new zzal();
    @SafeParcelable.Field(id = 1)
    public final Bundle zza;

    @SafeParcelable.Constructor
    public zzam(@SafeParcelable.Param(id = 1) Bundle bundle) {
        this.zza = bundle;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBundle(parcel, 1, this.zza, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
