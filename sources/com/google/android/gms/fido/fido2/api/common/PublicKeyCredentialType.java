package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: com.google.android.gms:play-services-fido@@19.0.1 */
public enum PublicKeyCredentialType implements Parcelable {
    PUBLIC_KEY("public-key");
    
    public static final Parcelable.Creator<PublicKeyCredentialType> CREATOR = null;
    private final String zzb;

    /* compiled from: com.google.android.gms:play-services-fido@@19.0.1 */
    public static class UnsupportedPublicKeyCredTypeException extends Exception {
        public UnsupportedPublicKeyCredTypeException(String str) {
            super(str);
        }
    }

    static {
        CREATOR = new zzal();
    }

    private PublicKeyCredentialType(String str) {
        this.zzb = "public-key";
    }

    public static PublicKeyCredentialType fromString(String str) {
        for (PublicKeyCredentialType publicKeyCredentialType : values()) {
            if (str.equals(publicKeyCredentialType.zzb)) {
                return publicKeyCredentialType;
            }
        }
        throw new UnsupportedPublicKeyCredTypeException(String.format("PublicKeyCredentialType %s not supported", new Object[]{str}));
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return this.zzb;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.zzb);
    }
}
