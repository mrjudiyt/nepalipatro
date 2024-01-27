package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.internal.security.CertificateUtil;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@KeepForSdk
@SafeParcelable.Class(creator = "ClientIdentityCreator")
@SafeParcelable.Reserved({1000})
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public class ClientIdentity extends AbstractSafeParcelable {
    @KeepForSdk
    public static final Parcelable.Creator<ClientIdentity> CREATOR = new zaa();
    @SafeParcelable.Field(defaultValueUnchecked = "null", id = 2)
    @KeepForSdk
    public final String packageName;
    @SafeParcelable.Field(defaultValueUnchecked = "0", id = 1)
    @KeepForSdk
    public final int uid;

    @SafeParcelable.Constructor
    public ClientIdentity(@SafeParcelable.Param(id = 1) int i10, @SafeParcelable.Param(id = 2) String str) {
        this.uid = i10;
        this.packageName = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ClientIdentity)) {
            return false;
        }
        ClientIdentity clientIdentity = (ClientIdentity) obj;
        return clientIdentity.uid == this.uid && Objects.equal(clientIdentity.packageName, this.packageName);
    }

    public final int hashCode() {
        return this.uid;
    }

    public final String toString() {
        int i10 = this.uid;
        String str = this.packageName;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12);
        sb.append(i10);
        sb.append(CertificateUtil.DELIMITER);
        sb.append(str);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.uid);
        SafeParcelWriter.writeString(parcel, 2, this.packageName, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
