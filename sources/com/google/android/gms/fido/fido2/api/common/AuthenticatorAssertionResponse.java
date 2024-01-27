package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import com.google.android.gms.fido.u2f.api.common.SignResponseData;
import com.google.android.gms.internal.fido.zzap;
import com.google.android.gms.internal.fido.zzaq;
import com.google.android.gms.internal.fido.zzbl;
import java.util.Arrays;

@SafeParcelable.Class(creator = "AuthenticatorAssertionResponseCreator")
@SafeParcelable.Reserved({1})
/* compiled from: com.google.android.gms:play-services-fido@@19.0.1 */
public class AuthenticatorAssertionResponse extends AuthenticatorResponse {
    public static final Parcelable.Creator<AuthenticatorAssertionResponse> CREATOR = new zzg();
    @SafeParcelable.Field(getter = "getKeyHandle", id = 2)
    private final byte[] zza;
    @SafeParcelable.Field(getter = "getClientDataJSON", id = 3)
    private final byte[] zzb;
    @SafeParcelable.Field(getter = "getAuthenticatorData", id = 4)
    private final byte[] zzc;
    @SafeParcelable.Field(getter = "getSignature", id = 5)
    private final byte[] zzd;
    @SafeParcelable.Field(getter = "getUserHandle", id = 6)
    private final byte[] zze;

    @SafeParcelable.Constructor
    AuthenticatorAssertionResponse(@SafeParcelable.Param(id = 2) byte[] bArr, @SafeParcelable.Param(id = 3) byte[] bArr2, @SafeParcelable.Param(id = 4) byte[] bArr3, @SafeParcelable.Param(id = 5) byte[] bArr4, @SafeParcelable.Param(id = 6) byte[] bArr5) {
        this.zza = (byte[]) Preconditions.checkNotNull(bArr);
        this.zzb = (byte[]) Preconditions.checkNotNull(bArr2);
        this.zzc = (byte[]) Preconditions.checkNotNull(bArr3);
        this.zzd = (byte[]) Preconditions.checkNotNull(bArr4);
        this.zze = bArr5;
    }

    public static AuthenticatorAssertionResponse deserializeFromBytes(byte[] bArr) {
        return (AuthenticatorAssertionResponse) SafeParcelableSerializer.deserializeFromBytes(bArr, CREATOR);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AuthenticatorAssertionResponse)) {
            return false;
        }
        AuthenticatorAssertionResponse authenticatorAssertionResponse = (AuthenticatorAssertionResponse) obj;
        if (!Arrays.equals(this.zza, authenticatorAssertionResponse.zza) || !Arrays.equals(this.zzb, authenticatorAssertionResponse.zzb) || !Arrays.equals(this.zzc, authenticatorAssertionResponse.zzc) || !Arrays.equals(this.zzd, authenticatorAssertionResponse.zzd) || !Arrays.equals(this.zze, authenticatorAssertionResponse.zze)) {
            return false;
        }
        return true;
    }

    public byte[] getAuthenticatorData() {
        return this.zzc;
    }

    public byte[] getClientDataJSON() {
        return this.zzb;
    }

    @Deprecated
    public byte[] getKeyHandle() {
        return this.zza;
    }

    public byte[] getSignature() {
        return this.zzd;
    }

    public byte[] getUserHandle() {
        return this.zze;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(Arrays.hashCode(this.zza)), Integer.valueOf(Arrays.hashCode(this.zzb)), Integer.valueOf(Arrays.hashCode(this.zzc)), Integer.valueOf(Arrays.hashCode(this.zzd)), Integer.valueOf(Arrays.hashCode(this.zze)));
    }

    public byte[] serializeToBytes() {
        return SafeParcelableSerializer.serializeToBytes(this);
    }

    public String toString() {
        zzap zza2 = zzaq.zza(this);
        zzbl zzd2 = zzbl.zzd();
        byte[] bArr = this.zza;
        zza2.zzb(SignResponseData.JSON_RESPONSE_DATA_KEY_HANDLE, zzd2.zze(bArr, 0, bArr.length));
        zzbl zzd3 = zzbl.zzd();
        byte[] bArr2 = this.zzb;
        zza2.zzb("clientDataJSON", zzd3.zze(bArr2, 0, bArr2.length));
        zzbl zzd4 = zzbl.zzd();
        byte[] bArr3 = this.zzc;
        zza2.zzb("authenticatorData", zzd4.zze(bArr3, 0, bArr3.length));
        zzbl zzd5 = zzbl.zzd();
        byte[] bArr4 = this.zzd;
        zza2.zzb("signature", zzd5.zze(bArr4, 0, bArr4.length));
        byte[] bArr5 = this.zze;
        if (bArr5 != null) {
            zza2.zzb("userHandle", zzbl.zzd().zze(bArr5, 0, bArr5.length));
        }
        return zza2.toString();
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeByteArray(parcel, 2, getKeyHandle(), false);
        SafeParcelWriter.writeByteArray(parcel, 3, getClientDataJSON(), false);
        SafeParcelWriter.writeByteArray(parcel, 4, getAuthenticatorData(), false);
        SafeParcelWriter.writeByteArray(parcel, 5, getSignature(), false);
        SafeParcelWriter.writeByteArray(parcel, 6, getUserHandle(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
