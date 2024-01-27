package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "AuthenticationExtensionsCreator")
@SafeParcelable.Reserved({1})
/* compiled from: com.google.android.gms:play-services-fido@@19.0.1 */
public class AuthenticationExtensions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AuthenticationExtensions> CREATOR = new zzd();
    @SafeParcelable.Field(getter = "getFidoAppIdExtension", id = 2)
    private final FidoAppIdExtension zza;
    @SafeParcelable.Field(getter = "getCableAuthenticationExtension", id = 3)
    private final zzp zzb;
    @SafeParcelable.Field(getter = "getUserVerificationMethodExtension", id = 4)
    private final UserVerificationMethodExtension zzc;
    @SafeParcelable.Field(getter = "getGoogleMultiAssertionExtension", id = 5)
    private final zzw zzd;
    @SafeParcelable.Field(getter = "getGoogleSessionIdExtension", id = 6)
    private final zzy zze;
    @SafeParcelable.Field(getter = "getGoogleSilentVerificationExtension", id = 7)
    private final zzaa zzf;
    @SafeParcelable.Field(getter = "getDevicePublicKeyExtension", id = 8)
    private final zzr zzg;
    @SafeParcelable.Field(getter = "getGoogleTunnelServerIdExtension", id = 9)
    private final zzad zzh;
    @SafeParcelable.Field(getter = "getGoogleThirdPartyPaymentExtension", id = 10)
    private final GoogleThirdPartyPaymentExtension zzi;

    /* compiled from: com.google.android.gms:play-services-fido@@19.0.1 */
    public static final class Builder {
        private FidoAppIdExtension zza;
        private UserVerificationMethodExtension zzb;
        private zzp zzc;
        private zzw zzd;
        private zzy zze;
        private zzaa zzf;
        private zzr zzg;
        private zzad zzh;
        private GoogleThirdPartyPaymentExtension zzi;

        public Builder() {
        }

        public Builder(AuthenticationExtensions authenticationExtensions) {
            if (authenticationExtensions != null) {
                this.zza = authenticationExtensions.getFidoAppIdExtension();
                this.zzb = authenticationExtensions.getUserVerificationMethodExtension();
                this.zzc = authenticationExtensions.zza();
                this.zzd = authenticationExtensions.zzc();
                this.zze = authenticationExtensions.zzd();
                this.zzf = authenticationExtensions.zze();
                this.zzg = authenticationExtensions.zzb();
                this.zzh = authenticationExtensions.zzg();
                this.zzi = authenticationExtensions.zzf();
            }
        }

        public AuthenticationExtensions build() {
            return new AuthenticationExtensions(this.zza, this.zzc, this.zzb, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi);
        }

        public Builder setFido2Extension(FidoAppIdExtension fidoAppIdExtension) {
            this.zza = fidoAppIdExtension;
            return this;
        }

        public Builder setGoogleThirdPartyPaymentExtension(GoogleThirdPartyPaymentExtension googleThirdPartyPaymentExtension) {
            this.zzi = googleThirdPartyPaymentExtension;
            return this;
        }

        public Builder setUserVerificationMethodExtension(UserVerificationMethodExtension userVerificationMethodExtension) {
            this.zzb = userVerificationMethodExtension;
            return this;
        }
    }

    @SafeParcelable.Constructor
    AuthenticationExtensions(@SafeParcelable.Param(id = 2) FidoAppIdExtension fidoAppIdExtension, @SafeParcelable.Param(id = 3) zzp zzp, @SafeParcelable.Param(id = 4) UserVerificationMethodExtension userVerificationMethodExtension, @SafeParcelable.Param(id = 5) zzw zzw, @SafeParcelable.Param(id = 6) zzy zzy, @SafeParcelable.Param(id = 7) zzaa zzaa, @SafeParcelable.Param(id = 8) zzr zzr, @SafeParcelable.Param(id = 9) zzad zzad, @SafeParcelable.Param(id = 10) GoogleThirdPartyPaymentExtension googleThirdPartyPaymentExtension) {
        this.zza = fidoAppIdExtension;
        this.zzc = userVerificationMethodExtension;
        this.zzb = zzp;
        this.zzd = zzw;
        this.zze = zzy;
        this.zzf = zzaa;
        this.zzg = zzr;
        this.zzh = zzad;
        this.zzi = googleThirdPartyPaymentExtension;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AuthenticationExtensions)) {
            return false;
        }
        AuthenticationExtensions authenticationExtensions = (AuthenticationExtensions) obj;
        if (!Objects.equal(this.zza, authenticationExtensions.zza) || !Objects.equal(this.zzb, authenticationExtensions.zzb) || !Objects.equal(this.zzc, authenticationExtensions.zzc) || !Objects.equal(this.zzd, authenticationExtensions.zzd) || !Objects.equal(this.zze, authenticationExtensions.zze) || !Objects.equal(this.zzf, authenticationExtensions.zzf) || !Objects.equal(this.zzg, authenticationExtensions.zzg) || !Objects.equal(this.zzh, authenticationExtensions.zzh) || !Objects.equal(this.zzi, authenticationExtensions.zzi)) {
            return false;
        }
        return true;
    }

    public FidoAppIdExtension getFidoAppIdExtension() {
        return this.zza;
    }

    public UserVerificationMethodExtension getUserVerificationMethodExtension() {
        return this.zzc;
    }

    public int hashCode() {
        return Objects.hashCode(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi);
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, getFidoAppIdExtension(), i10, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.zzb, i10, false);
        SafeParcelWriter.writeParcelable(parcel, 4, getUserVerificationMethodExtension(), i10, false);
        SafeParcelWriter.writeParcelable(parcel, 5, this.zzd, i10, false);
        SafeParcelWriter.writeParcelable(parcel, 6, this.zze, i10, false);
        SafeParcelWriter.writeParcelable(parcel, 7, this.zzf, i10, false);
        SafeParcelWriter.writeParcelable(parcel, 8, this.zzg, i10, false);
        SafeParcelWriter.writeParcelable(parcel, 9, this.zzh, i10, false);
        SafeParcelWriter.writeParcelable(parcel, 10, this.zzi, i10, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final zzp zza() {
        return this.zzb;
    }

    public final zzr zzb() {
        return this.zzg;
    }

    public final zzw zzc() {
        return this.zzd;
    }

    public final zzy zzd() {
        return this.zze;
    }

    public final zzaa zze() {
        return this.zzf;
    }

    public final GoogleThirdPartyPaymentExtension zzf() {
        return this.zzi;
    }

    public final zzad zzg() {
        return this.zzh;
    }
}
