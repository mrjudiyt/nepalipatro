package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@SafeParcelable.Class(creator = "BeginSignInRequestCreator")
/* compiled from: com.google.android.gms:play-services-auth@@20.4.1 */
public final class BeginSignInRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<BeginSignInRequest> CREATOR = new zba();
    @SafeParcelable.Field(getter = "getPasswordRequestOptions", id = 1)
    private final PasswordRequestOptions zba;
    @SafeParcelable.Field(getter = "getGoogleIdTokenRequestOptions", id = 2)
    private final GoogleIdTokenRequestOptions zbb;
    @SafeParcelable.Field(getter = "getSessionId", id = 3)
    private final String zbc;
    @SafeParcelable.Field(getter = "isAutoSelectEnabled", id = 4)
    private final boolean zbd;
    @SafeParcelable.Field(getter = "getTheme", id = 5)
    private final int zbe;
    @SafeParcelable.Field(getter = "getPasskeysRequestOptions", id = 6)
    private final PasskeysRequestOptions zbf;

    /* compiled from: com.google.android.gms:play-services-auth@@20.4.1 */
    public static final class Builder {
        private PasswordRequestOptions zba;
        private GoogleIdTokenRequestOptions zbb;
        private PasskeysRequestOptions zbc;
        private String zbd;
        private boolean zbe;
        private int zbf;

        public Builder() {
            PasswordRequestOptions.Builder builder = PasswordRequestOptions.builder();
            builder.setSupported(false);
            this.zba = builder.build();
            GoogleIdTokenRequestOptions.Builder builder2 = GoogleIdTokenRequestOptions.builder();
            builder2.setSupported(false);
            this.zbb = builder2.build();
            PasskeysRequestOptions.Builder builder3 = PasskeysRequestOptions.builder();
            builder3.setSupported(false);
            this.zbc = builder3.build();
        }

        public BeginSignInRequest build() {
            return new BeginSignInRequest(this.zba, this.zbb, this.zbd, this.zbe, this.zbf, this.zbc);
        }

        public Builder setAutoSelectEnabled(boolean z10) {
            this.zbe = z10;
            return this;
        }

        public Builder setGoogleIdTokenRequestOptions(GoogleIdTokenRequestOptions googleIdTokenRequestOptions) {
            this.zbb = (GoogleIdTokenRequestOptions) Preconditions.checkNotNull(googleIdTokenRequestOptions);
            return this;
        }

        public Builder setPasskeysSignInRequestOptions(PasskeysRequestOptions passkeysRequestOptions) {
            this.zbc = (PasskeysRequestOptions) Preconditions.checkNotNull(passkeysRequestOptions);
            return this;
        }

        public Builder setPasswordRequestOptions(PasswordRequestOptions passwordRequestOptions) {
            this.zba = (PasswordRequestOptions) Preconditions.checkNotNull(passwordRequestOptions);
            return this;
        }

        public final Builder zba(String str) {
            this.zbd = str;
            return this;
        }

        public final Builder zbb(int i10) {
            this.zbf = i10;
            return this;
        }
    }

    @SafeParcelable.Class(creator = "GoogleIdTokenRequestOptionsCreator")
    /* compiled from: com.google.android.gms:play-services-auth@@20.4.1 */
    public static final class GoogleIdTokenRequestOptions extends AbstractSafeParcelable {
        public static final Parcelable.Creator<GoogleIdTokenRequestOptions> CREATOR = new zbg();
        @SafeParcelable.Field(getter = "isSupported", id = 1)
        private final boolean zba;
        @SafeParcelable.Field(getter = "getServerClientId", id = 2)
        private final String zbb;
        @SafeParcelable.Field(getter = "getNonce", id = 3)
        private final String zbc;
        @SafeParcelable.Field(getter = "filterByAuthorizedAccounts", id = 4)
        private final boolean zbd;
        @SafeParcelable.Field(getter = "getLinkedServiceId", id = 5)
        private final String zbe;
        @SafeParcelable.Field(getter = "getIdTokenDepositionScopes", id = 6)
        private final List zbf;
        @SafeParcelable.Field(getter = "requestVerifiedPhoneNumber", id = 7)
        private final boolean zbg;

        /* compiled from: com.google.android.gms:play-services-auth@@20.4.1 */
        public static final class Builder {
            private boolean zba = false;
            private String zbb = null;
            private String zbc = null;
            private boolean zbd = true;
            private String zbe = null;
            private List zbf = null;
            private boolean zbg = false;

            public Builder associateLinkedAccounts(String str, List<String> list) {
                this.zbe = (String) Preconditions.checkNotNull(str, "linkedServiceId must be provided if you want to associate linked accounts.");
                this.zbf = list;
                return this;
            }

            public GoogleIdTokenRequestOptions build() {
                return new GoogleIdTokenRequestOptions(this.zba, this.zbb, this.zbc, this.zbd, this.zbe, this.zbf, this.zbg);
            }

            public Builder setFilterByAuthorizedAccounts(boolean z10) {
                this.zbd = z10;
                return this;
            }

            public Builder setNonce(String str) {
                this.zbc = str;
                return this;
            }

            public Builder setRequestVerifiedPhoneNumber(boolean z10) {
                this.zbg = z10;
                return this;
            }

            public Builder setServerClientId(String str) {
                this.zbb = Preconditions.checkNotEmpty(str);
                return this;
            }

            public Builder setSupported(boolean z10) {
                this.zba = z10;
                return this;
            }
        }

        @SafeParcelable.Constructor
        GoogleIdTokenRequestOptions(@SafeParcelable.Param(id = 1) boolean z10, @SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) String str2, @SafeParcelable.Param(id = 4) boolean z11, @SafeParcelable.Param(id = 5) String str3, @SafeParcelable.Param(id = 6) List list, @SafeParcelable.Param(id = 7) boolean z12) {
            boolean z13 = true;
            if (z11 && z12) {
                z13 = false;
            }
            Preconditions.checkArgument(z13, "filterByAuthorizedAccounts and requestVerifiedPhoneNumber must not both be true; the Verified Phone Number feature only works in sign-ups.");
            this.zba = z10;
            if (z10) {
                Preconditions.checkNotNull(str, "serverClientId must be provided if Google ID tokens are requested");
            }
            this.zbb = str;
            this.zbc = str2;
            this.zbd = z11;
            Parcelable.Creator<BeginSignInRequest> creator = BeginSignInRequest.CREATOR;
            ArrayList arrayList = null;
            if (list != null && !list.isEmpty()) {
                arrayList = new ArrayList(list);
                Collections.sort(arrayList);
            }
            this.zbf = arrayList;
            this.zbe = str3;
            this.zbg = z12;
        }

        public static Builder builder() {
            return new Builder();
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof GoogleIdTokenRequestOptions)) {
                return false;
            }
            GoogleIdTokenRequestOptions googleIdTokenRequestOptions = (GoogleIdTokenRequestOptions) obj;
            if (this.zba != googleIdTokenRequestOptions.zba || !Objects.equal(this.zbb, googleIdTokenRequestOptions.zbb) || !Objects.equal(this.zbc, googleIdTokenRequestOptions.zbc) || this.zbd != googleIdTokenRequestOptions.zbd || !Objects.equal(this.zbe, googleIdTokenRequestOptions.zbe) || !Objects.equal(this.zbf, googleIdTokenRequestOptions.zbf) || this.zbg != googleIdTokenRequestOptions.zbg) {
                return false;
            }
            return true;
        }

        public boolean filterByAuthorizedAccounts() {
            return this.zbd;
        }

        public List<String> getIdTokenDepositionScopes() {
            return this.zbf;
        }

        public String getLinkedServiceId() {
            return this.zbe;
        }

        public String getNonce() {
            return this.zbc;
        }

        public String getServerClientId() {
            return this.zbb;
        }

        public int hashCode() {
            return Objects.hashCode(Boolean.valueOf(this.zba), this.zbb, this.zbc, Boolean.valueOf(this.zbd), this.zbe, this.zbf, Boolean.valueOf(this.zbg));
        }

        public boolean isSupported() {
            return this.zba;
        }

        public boolean requestVerifiedPhoneNumber() {
            return this.zbg;
        }

        public void writeToParcel(Parcel parcel, int i10) {
            int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
            SafeParcelWriter.writeBoolean(parcel, 1, isSupported());
            SafeParcelWriter.writeString(parcel, 2, getServerClientId(), false);
            SafeParcelWriter.writeString(parcel, 3, getNonce(), false);
            SafeParcelWriter.writeBoolean(parcel, 4, filterByAuthorizedAccounts());
            SafeParcelWriter.writeString(parcel, 5, getLinkedServiceId(), false);
            SafeParcelWriter.writeStringList(parcel, 6, getIdTokenDepositionScopes(), false);
            SafeParcelWriter.writeBoolean(parcel, 7, requestVerifiedPhoneNumber());
            SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
        }
    }

    @SafeParcelable.Class(creator = "PasskeysRequestOptionsCreator")
    /* compiled from: com.google.android.gms:play-services-auth@@20.4.1 */
    public static final class PasskeysRequestOptions extends AbstractSafeParcelable {
        public static final Parcelable.Creator<PasskeysRequestOptions> CREATOR = new zbh();
        @SafeParcelable.Field(getter = "isSupported", id = 1)
        private final boolean zba;
        @SafeParcelable.Field(getter = "getChallenge", id = 2)
        private final byte[] zbb;
        @SafeParcelable.Field(getter = "getRpId", id = 3)
        private final String zbc;

        /* compiled from: com.google.android.gms:play-services-auth@@20.4.1 */
        public static final class Builder {
            private boolean zba = false;
            private byte[] zbb;
            private String zbc;

            public PasskeysRequestOptions build() {
                return new PasskeysRequestOptions(this.zba, this.zbb, this.zbc);
            }

            public Builder setChallenge(byte[] bArr) {
                this.zbb = bArr;
                return this;
            }

            public Builder setRpId(String str) {
                this.zbc = str;
                return this;
            }

            public Builder setSupported(boolean z10) {
                this.zba = z10;
                return this;
            }
        }

        @SafeParcelable.Constructor
        PasskeysRequestOptions(@SafeParcelable.Param(id = 1) boolean z10, @SafeParcelable.Param(id = 2) byte[] bArr, @SafeParcelable.Param(id = 3) String str) {
            if (z10) {
                Preconditions.checkNotNull(bArr);
                Preconditions.checkNotNull(str);
            }
            this.zba = z10;
            this.zbb = bArr;
            this.zbc = str;
        }

        public static Builder builder() {
            return new Builder();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x001c, code lost:
            r1 = r4.zbc;
            r5 = r5.zbc;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r5) {
            /*
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L_0x0004
                return r0
            L_0x0004:
                boolean r1 = r5 instanceof com.google.android.gms.auth.api.identity.BeginSignInRequest.PasskeysRequestOptions
                r2 = 0
                if (r1 != 0) goto L_0x000a
                return r2
            L_0x000a:
                com.google.android.gms.auth.api.identity.BeginSignInRequest$PasskeysRequestOptions r5 = (com.google.android.gms.auth.api.identity.BeginSignInRequest.PasskeysRequestOptions) r5
                boolean r1 = r4.zba
                boolean r3 = r5.zba
                if (r1 != r3) goto L_0x002b
                byte[] r1 = r4.zbb
                byte[] r3 = r5.zbb
                boolean r1 = java.util.Arrays.equals(r1, r3)
                if (r1 == 0) goto L_0x002b
                java.lang.String r1 = r4.zbc
                java.lang.String r5 = r5.zbc
                if (r1 == r5) goto L_0x002a
                if (r1 == 0) goto L_0x002b
                boolean r5 = r1.equals(r5)
                if (r5 == 0) goto L_0x002b
            L_0x002a:
                return r0
            L_0x002b:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.identity.BeginSignInRequest.PasskeysRequestOptions.equals(java.lang.Object):boolean");
        }

        public byte[] getChallenge() {
            return this.zbb;
        }

        public String getRpId() {
            return this.zbc;
        }

        public int hashCode() {
            return (Arrays.hashCode(new Object[]{Boolean.valueOf(this.zba), this.zbc}) * 31) + Arrays.hashCode(this.zbb);
        }

        public boolean isSupported() {
            return this.zba;
        }

        public void writeToParcel(Parcel parcel, int i10) {
            int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
            SafeParcelWriter.writeBoolean(parcel, 1, isSupported());
            SafeParcelWriter.writeByteArray(parcel, 2, getChallenge(), false);
            SafeParcelWriter.writeString(parcel, 3, getRpId(), false);
            SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
        }
    }

    @SafeParcelable.Class(creator = "PasswordRequestOptionsCreator")
    /* compiled from: com.google.android.gms:play-services-auth@@20.4.1 */
    public static final class PasswordRequestOptions extends AbstractSafeParcelable {
        public static final Parcelable.Creator<PasswordRequestOptions> CREATOR = new zbi();
        @SafeParcelable.Field(getter = "isSupported", id = 1)
        private final boolean zba;

        /* compiled from: com.google.android.gms:play-services-auth@@20.4.1 */
        public static final class Builder {
            private boolean zba = false;

            public PasswordRequestOptions build() {
                return new PasswordRequestOptions(this.zba);
            }

            public Builder setSupported(boolean z10) {
                this.zba = z10;
                return this;
            }
        }

        @SafeParcelable.Constructor
        PasswordRequestOptions(@SafeParcelable.Param(id = 1) boolean z10) {
            this.zba = z10;
        }

        public static Builder builder() {
            return new Builder();
        }

        public boolean equals(Object obj) {
            if ((obj instanceof PasswordRequestOptions) && this.zba == ((PasswordRequestOptions) obj).zba) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return Objects.hashCode(Boolean.valueOf(this.zba));
        }

        public boolean isSupported() {
            return this.zba;
        }

        public void writeToParcel(Parcel parcel, int i10) {
            int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
            SafeParcelWriter.writeBoolean(parcel, 1, isSupported());
            SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
        }
    }

    @SafeParcelable.Constructor
    BeginSignInRequest(@SafeParcelable.Param(id = 1) PasswordRequestOptions passwordRequestOptions, @SafeParcelable.Param(id = 2) GoogleIdTokenRequestOptions googleIdTokenRequestOptions, @SafeParcelable.Param(id = 3) String str, @SafeParcelable.Param(id = 4) boolean z10, @SafeParcelable.Param(id = 5) int i10, @SafeParcelable.Param(id = 6) PasskeysRequestOptions passkeysRequestOptions) {
        this.zba = (PasswordRequestOptions) Preconditions.checkNotNull(passwordRequestOptions);
        this.zbb = (GoogleIdTokenRequestOptions) Preconditions.checkNotNull(googleIdTokenRequestOptions);
        this.zbc = str;
        this.zbd = z10;
        this.zbe = i10;
        if (passkeysRequestOptions == null) {
            PasskeysRequestOptions.Builder builder = PasskeysRequestOptions.builder();
            builder.setSupported(false);
            passkeysRequestOptions = builder.build();
        }
        this.zbf = passkeysRequestOptions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder zba(BeginSignInRequest beginSignInRequest) {
        Preconditions.checkNotNull(beginSignInRequest);
        Builder builder = builder();
        builder.setGoogleIdTokenRequestOptions(beginSignInRequest.getGoogleIdTokenRequestOptions());
        builder.setPasswordRequestOptions(beginSignInRequest.getPasswordRequestOptions());
        builder.setPasskeysSignInRequestOptions(beginSignInRequest.getPasskeysRequestOptions());
        builder.setAutoSelectEnabled(beginSignInRequest.zbd);
        builder.zbb(beginSignInRequest.zbe);
        String str = beginSignInRequest.zbc;
        if (str != null) {
            builder.zba(str);
        }
        return builder;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof BeginSignInRequest)) {
            return false;
        }
        BeginSignInRequest beginSignInRequest = (BeginSignInRequest) obj;
        if (!Objects.equal(this.zba, beginSignInRequest.zba) || !Objects.equal(this.zbb, beginSignInRequest.zbb) || !Objects.equal(this.zbf, beginSignInRequest.zbf) || !Objects.equal(this.zbc, beginSignInRequest.zbc) || this.zbd != beginSignInRequest.zbd || this.zbe != beginSignInRequest.zbe) {
            return false;
        }
        return true;
    }

    public GoogleIdTokenRequestOptions getGoogleIdTokenRequestOptions() {
        return this.zbb;
    }

    public PasskeysRequestOptions getPasskeysRequestOptions() {
        return this.zbf;
    }

    public PasswordRequestOptions getPasswordRequestOptions() {
        return this.zba;
    }

    public int hashCode() {
        return Objects.hashCode(this.zba, this.zbb, this.zbf, this.zbc, Boolean.valueOf(this.zbd));
    }

    public boolean isAutoSelectEnabled() {
        return this.zbd;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, getPasswordRequestOptions(), i10, false);
        SafeParcelWriter.writeParcelable(parcel, 2, getGoogleIdTokenRequestOptions(), i10, false);
        SafeParcelWriter.writeString(parcel, 3, this.zbc, false);
        SafeParcelWriter.writeBoolean(parcel, 4, isAutoSelectEnabled());
        SafeParcelWriter.writeInt(parcel, 5, this.zbe);
        SafeParcelWriter.writeParcelable(parcel, 6, getPasskeysRequestOptions(), i10, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
