package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import com.google.android.gms.fido.fido2.api.common.ErrorCode;
import com.google.android.gms.internal.fido.zzap;
import com.google.android.gms.internal.fido.zzaq;

@SafeParcelable.Class(creator = "AuthenticatorErrorResponseCreator")
@SafeParcelable.Reserved({1})
/* compiled from: com.google.android.gms:play-services-fido@@19.0.1 */
public class AuthenticatorErrorResponse extends AuthenticatorResponse {
    public static final Parcelable.Creator<AuthenticatorErrorResponse> CREATOR = new zzi();
    @SafeParcelable.Field(getter = "getErrorCodeAsInt", id = 2, type = "int")
    private final ErrorCode zza;
    @SafeParcelable.Field(getter = "getErrorMessage", id = 3)
    private final String zzb;

    @SafeParcelable.Constructor
    AuthenticatorErrorResponse(@SafeParcelable.Param(id = 2) int i10, @SafeParcelable.Param(id = 3) String str) {
        try {
            this.zza = ErrorCode.toErrorCode(i10);
            this.zzb = str;
        } catch (ErrorCode.UnsupportedErrorCodeException e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public static AuthenticatorErrorResponse deserializeFromBytes(byte[] bArr) {
        return (AuthenticatorErrorResponse) SafeParcelableSerializer.deserializeFromBytes(bArr, CREATOR);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AuthenticatorErrorResponse)) {
            return false;
        }
        AuthenticatorErrorResponse authenticatorErrorResponse = (AuthenticatorErrorResponse) obj;
        if (!Objects.equal(this.zza, authenticatorErrorResponse.zza) || !Objects.equal(this.zzb, authenticatorErrorResponse.zzb)) {
            return false;
        }
        return true;
    }

    public byte[] getClientDataJSON() {
        throw new UnsupportedOperationException();
    }

    public ErrorCode getErrorCode() {
        return this.zza;
    }

    public int getErrorCodeAsInt() {
        return this.zza.getCode();
    }

    public String getErrorMessage() {
        return this.zzb;
    }

    public int hashCode() {
        return Objects.hashCode(this.zza, this.zzb);
    }

    public byte[] serializeToBytes() {
        return SafeParcelableSerializer.serializeToBytes(this);
    }

    public String toString() {
        zzap zza2 = zzaq.zza(this);
        zza2.zza("errorCode", this.zza.getCode());
        String str = this.zzb;
        if (str != null) {
            zza2.zzb("errorMessage", str);
        }
        return zza2.toString();
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, getErrorCodeAsInt());
        SafeParcelWriter.writeString(parcel, 3, getErrorMessage(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
