package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "GoogleTunnelServerIdExtensionCreator")
/* compiled from: com.google.android.gms:play-services-fido@@19.0.1 */
public final class zzad extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzad> CREATOR = new zzae();
    @SafeParcelable.Field(getter = "getTunnelServerId", id = 1)
    private final String zza;

    @SafeParcelable.Constructor
    public zzad(@SafeParcelable.Param(id = 1) String str) {
        this.zza = (String) Preconditions.checkNotNull(str);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzad)) {
            return false;
        }
        return this.zza.equals(((zzad) obj).zza);
    }

    public final int hashCode() {
        return Objects.hashCode(this.zza);
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.zza, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
