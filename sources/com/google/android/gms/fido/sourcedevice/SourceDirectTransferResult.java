package com.google.android.gms.fido.sourcedevice;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "SourceDirectTransferResultCreator")
/* compiled from: com.google.android.gms:play-services-fido@@19.0.1 */
public class SourceDirectTransferResult extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<SourceDirectTransferResult> CREATOR = new zza();
    @SafeParcelable.Field(getter = "getStatus", id = 1)
    private final Status zza;
    @SafeParcelable.Field(getter = "getAuthorizationType", id = 2)
    private final int zzb;

    public SourceDirectTransferResult(Status status) {
        this(status, 0);
    }

    public Status getStatus() {
        return this.zza;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, getStatus(), i10, false);
        SafeParcelWriter.writeInt(parcel, 2, this.zzb);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @SafeParcelable.Constructor
    public SourceDirectTransferResult(@SafeParcelable.Param(id = 1) Status status, @SafeParcelable.Param(id = 2) int i10) {
        this.zza = status;
        this.zzb = i10;
    }
}
