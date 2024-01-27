package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ShowFirstParty;

@ShowFirstParty
/* compiled from: com.google.android.gms:play-services-fido@@19.0.1 */
public enum zzat implements Parcelable {
    USER_VERIFICATION_REQUIRED("required"),
    USER_VERIFICATION_PREFERRED("preferred"),
    USER_VERIFICATION_DISCOURAGED("discouraged");
    
    public static final Parcelable.Creator<zzat> CREATOR = null;
    private final String zze;

    static {
        CREATOR = new zzar();
    }

    private zzat(String str) {
        this.zze = str;
    }

    public static zzat zza(String str) {
        for (zzat zzat : values()) {
            if (str.equals(zzat.zze)) {
                return zzat;
            }
        }
        throw new zzas(str);
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return this.zze;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.zze);
    }
}
