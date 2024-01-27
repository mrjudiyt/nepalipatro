package com.facebook;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.AuthenticationTokenClaims;
import com.facebook.internal.Validate;
import com.facebook.internal.security.OidcSecurityUtil;
import java.io.IOException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.util.List;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;
import org.json.JSONObject;

/* compiled from: AuthenticationToken.kt */
public final class AuthenticationToken implements Parcelable {
    public static final String AUTHENTICATION_TOKEN_KEY = "id_token";
    private static final String CLAIMS_KEY = "claims";
    public static final Parcelable.Creator<AuthenticationToken> CREATOR = new AuthenticationToken$Companion$CREATOR$1();
    public static final Companion Companion = new Companion((g) null);
    private static final String EXPECTED_NONCE_KEY = "expected_nonce";
    private static final String HEADER_KEY = "header";
    private static final String SIGNATURE_KEY = "signature";
    private static final String TOKEN_STRING_KEY = "token_string";
    private final AuthenticationTokenClaims claims;
    private final String expectedNonce;
    private final AuthenticationTokenHeader header;
    private final String signature;
    private final String token;

    /* compiled from: AuthenticationToken.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public final AuthenticationToken getCurrentAuthenticationToken() {
            return AuthenticationTokenManager.Companion.getInstance().getCurrentAuthenticationToken();
        }

        public final void setCurrentAuthenticationToken(AuthenticationToken authenticationToken) {
            AuthenticationTokenManager.Companion.getInstance().setCurrentAuthenticationToken(authenticationToken);
        }
    }

    public AuthenticationToken(String str, String str2) {
        m.f(str, "token");
        m.f(str2, "expectedNonce");
        Validate validate = Validate.INSTANCE;
        Validate.notEmpty(str, "token");
        Validate.notEmpty(str2, "expectedNonce");
        List c02 = q.c0(str, new String[]{"."}, false, 0, 6, (Object) null);
        if (c02.size() == 3) {
            String str3 = (String) c02.get(0);
            String str4 = (String) c02.get(1);
            String str5 = (String) c02.get(2);
            this.token = str;
            this.expectedNonce = str2;
            AuthenticationTokenHeader authenticationTokenHeader = new AuthenticationTokenHeader(str3);
            this.header = authenticationTokenHeader;
            this.claims = new AuthenticationTokenClaims(str4, str2);
            if (isValidSignature(str3, str4, str5, authenticationTokenHeader.getKid())) {
                this.signature = str5;
                return;
            }
            throw new IllegalArgumentException("Invalid Signature".toString());
        }
        throw new IllegalArgumentException("Invalid IdToken string".toString());
    }

    public static final AuthenticationToken getCurrentAuthenticationToken() {
        return Companion.getCurrentAuthenticationToken();
    }

    private final boolean isValidSignature(String str, String str2, String str3, String str4) {
        try {
            OidcSecurityUtil oidcSecurityUtil = OidcSecurityUtil.INSTANCE;
            String rawKeyFromEndPoint = OidcSecurityUtil.getRawKeyFromEndPoint(str4);
            if (rawKeyFromEndPoint == null) {
                return false;
            }
            PublicKey publicKeyFromString = OidcSecurityUtil.getPublicKeyFromString(rawKeyFromEndPoint);
            return OidcSecurityUtil.verify(publicKeyFromString, str + '.' + str2, str3);
        } catch (IOException | InvalidKeySpecException unused) {
            return false;
        }
    }

    public static final void setCurrentAuthenticationToken(AuthenticationToken authenticationToken) {
        Companion.setCurrentAuthenticationToken(authenticationToken);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthenticationToken)) {
            return false;
        }
        AuthenticationToken authenticationToken = (AuthenticationToken) obj;
        if (!m.a(this.token, authenticationToken.token) || !m.a(this.expectedNonce, authenticationToken.expectedNonce) || !m.a(this.header, authenticationToken.header) || !m.a(this.claims, authenticationToken.claims) || !m.a(this.signature, authenticationToken.signature)) {
            return false;
        }
        return true;
    }

    public final AuthenticationTokenClaims getClaims() {
        return this.claims;
    }

    public final String getExpectedNonce() {
        return this.expectedNonce;
    }

    public final AuthenticationTokenHeader getHeader() {
        return this.header;
    }

    public final String getSignature() {
        return this.signature;
    }

    public final String getToken() {
        return this.token;
    }

    public int hashCode() {
        return ((((((((527 + this.token.hashCode()) * 31) + this.expectedNonce.hashCode()) * 31) + this.header.hashCode()) * 31) + this.claims.hashCode()) * 31) + this.signature.hashCode();
    }

    public final JSONObject toJSONObject$facebook_core_release() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(TOKEN_STRING_KEY, this.token);
        jSONObject.put(EXPECTED_NONCE_KEY, this.expectedNonce);
        jSONObject.put(HEADER_KEY, this.header.toJSONObject$facebook_core_release());
        jSONObject.put(CLAIMS_KEY, this.claims.toJSONObject$facebook_core_release());
        jSONObject.put(SIGNATURE_KEY, this.signature);
        return jSONObject;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        m.f(parcel, "dest");
        parcel.writeString(this.token);
        parcel.writeString(this.expectedNonce);
        parcel.writeParcelable(this.header, i10);
        parcel.writeParcelable(this.claims, i10);
        parcel.writeString(this.signature);
    }

    public AuthenticationToken(Parcel parcel) {
        m.f(parcel, "parcel");
        String readString = parcel.readString();
        Validate validate = Validate.INSTANCE;
        this.token = Validate.notNullOrEmpty(readString, "token");
        this.expectedNonce = Validate.notNullOrEmpty(parcel.readString(), "expectedNonce");
        Parcelable readParcelable = parcel.readParcelable(AuthenticationTokenHeader.class.getClassLoader());
        if (readParcelable != null) {
            this.header = (AuthenticationTokenHeader) readParcelable;
            Parcelable readParcelable2 = parcel.readParcelable(AuthenticationTokenClaims.class.getClassLoader());
            if (readParcelable2 != null) {
                this.claims = (AuthenticationTokenClaims) readParcelable2;
                this.signature = Validate.notNullOrEmpty(parcel.readString(), SIGNATURE_KEY);
                return;
            }
            throw new IllegalStateException("Required value was null.".toString());
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    public AuthenticationToken(JSONObject jSONObject) {
        m.f(jSONObject, "jsonObject");
        String string = jSONObject.getString(TOKEN_STRING_KEY);
        m.e(string, "jsonObject.getString(TOKEN_STRING_KEY)");
        this.token = string;
        String string2 = jSONObject.getString(EXPECTED_NONCE_KEY);
        m.e(string2, "jsonObject.getString(EXPECTED_NONCE_KEY)");
        this.expectedNonce = string2;
        String string3 = jSONObject.getString(SIGNATURE_KEY);
        m.e(string3, "jsonObject.getString(SIGNATURE_KEY)");
        this.signature = string3;
        JSONObject jSONObject2 = jSONObject.getJSONObject(HEADER_KEY);
        JSONObject jSONObject3 = jSONObject.getJSONObject(CLAIMS_KEY);
        m.e(jSONObject2, "headerJSONObject");
        this.header = new AuthenticationTokenHeader(jSONObject2);
        AuthenticationTokenClaims.Companion companion = AuthenticationTokenClaims.Companion;
        m.e(jSONObject3, "claimsJSONObject");
        this.claims = companion.createFromJSONObject$facebook_core_release(jSONObject3);
    }
}
