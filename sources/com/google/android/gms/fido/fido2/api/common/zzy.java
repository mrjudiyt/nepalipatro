package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "GoogleSessionIdExtensionCreator")
/* compiled from: com.google.android.gms:play-services-fido@@19.0.1 */
public final class zzy extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzy> CREATOR = new zzz();
    @SafeParcelable.Field(getter = "getSessionId", id = 1)
    private final long zza;

    @SafeParcelable.Constructor
    public zzy(@SafeParcelable.Param(id = 1) long j10) {
        this.zza = ((Long) Preconditions.checkNotNull(Long.valueOf(j10))).longValue();
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof zzy) && this.zza == ((zzy) obj).zza) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(Long.valueOf(this.zza));
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeLong(parcel, 1, this.zza);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
