package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;

@SafeParcelable.Class(creator = "AuthenticationExtensionsClientOutputsCreator")
/* compiled from: com.google.android.gms:play-services-fido@@19.0.1 */
public class AuthenticationExtensionsClientOutputs extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AuthenticationExtensionsClientOutputs> CREATOR = new zzc();
    @SafeParcelable.Field(getter = "getUvmEntries", id = 1)
    private final UvmEntries zza;
    @SafeParcelable.Field(getter = "getDevicePubKey", id = 2)
    private final zze zzb;

    /* compiled from: com.google.android.gms:play-services-fido@@19.0.1 */
    public static final class Builder {
        private UvmEntries zza;

        public AuthenticationExtensionsClientOutputs build() {
            return new AuthenticationExtensionsClientOutputs(this.zza, (zze) null);
        }

        public Builder setUserVerificationMethodEntries(UvmEntries uvmEntries) {
            this.zza = uvmEntries;
            return this;
        }
    }

    @SafeParcelable.Constructor
    AuthenticationExtensionsClientOutputs(@SafeParcelable.Param(id = 1) UvmEntries uvmEntries, @SafeParcelable.Param(id = 2) zze zze) {
        this.zza = uvmEntries;
        this.zzb = zze;
    }

    public static AuthenticationExtensionsClientOutputs deserializeFromBytes(byte[] bArr) {
        return (AuthenticationExtensionsClientOutputs) SafeParcelableSerializer.deserializeFromBytes(bArr, CREATOR);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AuthenticationExtensionsClientOutputs)) {
            return false;
        }
        AuthenticationExtensionsClientOutputs authenticationExtensionsClientOutputs = (AuthenticationExtensionsClientOutputs) obj;
        if (!Objects.equal(this.zza, authenticationExtensionsClientOutputs.zza) || !Objects.equal(this.zzb, authenticationExtensionsClientOutputs.zzb)) {
            return false;
        }
        return true;
    }

    public UvmEntries getUvmEntries() {
        return this.zza;
    }

    public int hashCode() {
        return Objects.hashCode(this.zza, this.zzb);
    }

    public byte[] serializeToBytes() {
        return SafeParcelableSerializer.serializeToBytes(this);
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, getUvmEntries(), i10, false);
        SafeParcelWriter.writeParcelable(parcel, 2, this.zzb, i10, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
