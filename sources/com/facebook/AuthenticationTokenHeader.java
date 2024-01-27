package com.facebook;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.facebook.internal.Validate;
import com.google.android.gms.fido.u2f.api.common.ClientData;
import g9.d;
import java.nio.charset.Charset;
import java.util.Objects;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: AuthenticationTokenHeader.kt */
public final class AuthenticationTokenHeader implements Parcelable {
    public static final Parcelable.Creator<AuthenticationTokenHeader> CREATOR = new AuthenticationTokenHeader$Companion$CREATOR$1();
    public static final Companion Companion = new Companion((g) null);
    private final String alg;
    private final String kid;
    private final String typ;

    /* compiled from: AuthenticationTokenHeader.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }
    }

    public AuthenticationTokenHeader(String str) {
        m.f(str, "encodedHeaderString");
        if (isValidHeader(str)) {
            byte[] decode = Base64.decode(str, 0);
            m.e(decode, "decodedBytes");
            JSONObject jSONObject = new JSONObject(new String(decode, d.f14759b));
            String string = jSONObject.getString("alg");
            m.e(string, "jsonObj.getString(\"alg\")");
            this.alg = string;
            String string2 = jSONObject.getString(ClientData.KEY_TYPE);
            m.e(string2, "jsonObj.getString(\"typ\")");
            this.typ = string2;
            String string3 = jSONObject.getString("kid");
            m.e(string3, "jsonObj.getString(\"kid\")");
            this.kid = string3;
            return;
        }
        throw new IllegalArgumentException("Invalid Header".toString());
    }

    private final boolean isValidHeader(String str) {
        Validate validate = Validate.INSTANCE;
        Validate.notEmpty(str, "encodedHeaderString");
        byte[] decode = Base64.decode(str, 0);
        m.e(decode, "decodedBytes");
        try {
            JSONObject jSONObject = new JSONObject(new String(decode, d.f14759b));
            String optString = jSONObject.optString("alg");
            m.e(optString, "alg");
            boolean z10 = (optString.length() > 0) && m.a(optString, "RS256");
            String optString2 = jSONObject.optString("kid");
            m.e(optString2, "jsonObj.optString(\"kid\")");
            boolean z11 = optString2.length() > 0;
            String optString3 = jSONObject.optString(ClientData.KEY_TYPE);
            m.e(optString3, "jsonObj.optString(\"typ\")");
            boolean z12 = optString3.length() > 0;
            if (!z10 || !z11 || !z12) {
                return false;
            }
            return true;
        } catch (JSONException unused) {
            return false;
        }
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthenticationTokenHeader)) {
            return false;
        }
        AuthenticationTokenHeader authenticationTokenHeader = (AuthenticationTokenHeader) obj;
        if (!m.a(this.alg, authenticationTokenHeader.alg) || !m.a(this.typ, authenticationTokenHeader.typ) || !m.a(this.kid, authenticationTokenHeader.kid)) {
            return false;
        }
        return true;
    }

    public final String getAlg() {
        return this.alg;
    }

    public final String getKid() {
        return this.kid;
    }

    public final String getTyp() {
        return this.typ;
    }

    public int hashCode() {
        return ((((527 + this.alg.hashCode()) * 31) + this.typ.hashCode()) * 31) + this.kid.hashCode();
    }

    public final String toEnCodedString() {
        String authenticationTokenHeader = toString();
        Charset charset = d.f14759b;
        Objects.requireNonNull(authenticationTokenHeader, "null cannot be cast to non-null type java.lang.String");
        byte[] bytes = authenticationTokenHeader.getBytes(charset);
        m.e(bytes, "(this as java.lang.String).getBytes(charset)");
        String encodeToString = Base64.encodeToString(bytes, 0);
        m.e(encodeToString, "encodeToString(claimsJsonString.toByteArray(), Base64.DEFAULT)");
        return encodeToString;
    }

    public final JSONObject toJSONObject$facebook_core_release() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("alg", this.alg);
        jSONObject.put(ClientData.KEY_TYPE, this.typ);
        jSONObject.put("kid", this.kid);
        return jSONObject;
    }

    public String toString() {
        String jSONObject = toJSONObject$facebook_core_release().toString();
        m.e(jSONObject, "headerJsonObject.toString()");
        return jSONObject;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        m.f(parcel, "dest");
        parcel.writeString(this.alg);
        parcel.writeString(this.typ);
        parcel.writeString(this.kid);
    }

    public AuthenticationTokenHeader(Parcel parcel) {
        m.f(parcel, "parcel");
        String readString = parcel.readString();
        Validate validate = Validate.INSTANCE;
        this.alg = Validate.notNullOrEmpty(readString, "alg");
        this.typ = Validate.notNullOrEmpty(parcel.readString(), ClientData.KEY_TYPE);
        this.kid = Validate.notNullOrEmpty(parcel.readString(), "kid");
    }

    public AuthenticationTokenHeader(JSONObject jSONObject) {
        m.f(jSONObject, "jsonObject");
        String string = jSONObject.getString("alg");
        m.e(string, "jsonObject.getString(\"alg\")");
        this.alg = string;
        String string2 = jSONObject.getString(ClientData.KEY_TYPE);
        m.e(string2, "jsonObject.getString(\"typ\")");
        this.typ = string2;
        String string3 = jSONObject.getString("kid");
        m.e(string3, "jsonObject.getString(\"kid\")");
        this.kid = string3;
    }

    public AuthenticationTokenHeader(String str, String str2, String str3) {
        m.f(str, "alg");
        m.f(str2, ClientData.KEY_TYPE);
        m.f(str3, "kid");
        this.alg = str;
        this.typ = str2;
        this.kid = str3;
    }
}
