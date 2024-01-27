package com.facebook;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.facebook.internal.Utility;
import com.facebook.internal.Validate;
import g9.d;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.m;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: AuthenticationTokenClaims.kt */
public final class AuthenticationTokenClaims implements Parcelable {
    public static final Parcelable.Creator<AuthenticationTokenClaims> CREATOR = new AuthenticationTokenClaims$Companion$CREATOR$1();
    public static final Companion Companion = new Companion((g) null);
    public static final String JSON_KEY_AUD = "aud";
    public static final String JSON_KEY_EMAIL = "email";
    public static final String JSON_KEY_EXP = "exp";
    public static final String JSON_KEY_FAMILY_NAME = "family_name";
    public static final String JSON_KEY_GIVEN_NAME = "given_name";
    public static final String JSON_KEY_IAT = "iat";
    public static final String JSON_KEY_ISS = "iss";
    public static final String JSON_KEY_JIT = "jti";
    public static final String JSON_KEY_MIDDLE_NAME = "middle_name";
    public static final String JSON_KEY_NAME = "name";
    public static final String JSON_KEY_NONCE = "nonce";
    public static final String JSON_KEY_PICTURE = "picture";
    public static final String JSON_KEY_SUB = "sub";
    public static final String JSON_KEY_USER_AGE_RANGE = "user_age_range";
    public static final String JSON_KEY_USER_BIRTHDAY = "user_birthday";
    public static final String JSON_KEY_USER_FRIENDS = "user_friends";
    public static final String JSON_KEY_USER_GENDER = "user_gender";
    public static final String JSON_KEY_USER_HOMETOWN = "user_hometown";
    public static final String JSON_KEY_USER_LINK = "user_link";
    public static final String JSON_KEY_USER_LOCATION = "user_location";
    public static final long MAX_TIME_SINCE_TOKEN_ISSUED = 600000;
    private final String aud;
    private final String email;
    private final long exp;
    private final String familyName;
    private final String givenName;
    private final long iat;
    private final String iss;
    private final String jti;
    private final String middleName;
    private final String name;
    private final String nonce;
    private final String picture;
    private final String sub;
    private final Map<String, Integer> userAgeRange;
    private final String userBirthday;
    private final Set<String> userFriends;
    private final String userGender;
    private final Map<String, String> userHometown;
    private final String userLink;
    private final Map<String, String> userLocation;

    /* compiled from: AuthenticationTokenClaims.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public final AuthenticationTokenClaims createFromJSONObject$facebook_core_release(JSONObject jSONObject) {
            List<String> list;
            Map<String, Object> map;
            Map<String, String> map2;
            JSONObject jSONObject2 = jSONObject;
            m.f(jSONObject2, "jsonObject");
            String string = jSONObject2.getString(AuthenticationTokenClaims.JSON_KEY_JIT);
            String string2 = jSONObject2.getString(AuthenticationTokenClaims.JSON_KEY_ISS);
            String string3 = jSONObject2.getString(AuthenticationTokenClaims.JSON_KEY_AUD);
            String string4 = jSONObject2.getString("nonce");
            long j10 = jSONObject2.getLong(AuthenticationTokenClaims.JSON_KEY_EXP);
            long j11 = jSONObject2.getLong(AuthenticationTokenClaims.JSON_KEY_IAT);
            String string5 = jSONObject2.getString(AuthenticationTokenClaims.JSON_KEY_SUB);
            long j12 = j11;
            String nullableString$facebook_core_release = getNullableString$facebook_core_release(jSONObject2, "name");
            String nullableString$facebook_core_release2 = getNullableString$facebook_core_release(jSONObject2, AuthenticationTokenClaims.JSON_KEY_GIVEN_NAME);
            String nullableString$facebook_core_release3 = getNullableString$facebook_core_release(jSONObject2, AuthenticationTokenClaims.JSON_KEY_MIDDLE_NAME);
            String nullableString$facebook_core_release4 = getNullableString$facebook_core_release(jSONObject2, AuthenticationTokenClaims.JSON_KEY_FAMILY_NAME);
            String nullableString$facebook_core_release5 = getNullableString$facebook_core_release(jSONObject2, "email");
            String nullableString$facebook_core_release6 = getNullableString$facebook_core_release(jSONObject2, "picture");
            JSONArray optJSONArray = jSONObject2.optJSONArray(AuthenticationTokenClaims.JSON_KEY_USER_FRIENDS);
            String str = nullableString$facebook_core_release;
            String nullableString$facebook_core_release7 = getNullableString$facebook_core_release(jSONObject2, AuthenticationTokenClaims.JSON_KEY_USER_BIRTHDAY);
            JSONObject optJSONObject = jSONObject2.optJSONObject(AuthenticationTokenClaims.JSON_KEY_USER_AGE_RANGE);
            long j13 = j10;
            JSONObject optJSONObject2 = jSONObject2.optJSONObject(AuthenticationTokenClaims.JSON_KEY_USER_HOMETOWN);
            JSONObject optJSONObject3 = jSONObject2.optJSONObject(AuthenticationTokenClaims.JSON_KEY_USER_LOCATION);
            String nullableString$facebook_core_release8 = getNullableString$facebook_core_release(jSONObject2, AuthenticationTokenClaims.JSON_KEY_USER_GENDER);
            String nullableString$facebook_core_release9 = getNullableString$facebook_core_release(jSONObject2, AuthenticationTokenClaims.JSON_KEY_USER_LINK);
            m.e(string, AuthenticationTokenClaims.JSON_KEY_JIT);
            m.e(string2, AuthenticationTokenClaims.JSON_KEY_ISS);
            m.e(string3, AuthenticationTokenClaims.JSON_KEY_AUD);
            m.e(string4, "nonce");
            m.e(string5, AuthenticationTokenClaims.JSON_KEY_SUB);
            Map<String, String> map3 = null;
            if (optJSONArray == null) {
                list = null;
            } else {
                Utility utility = Utility.INSTANCE;
                list = Utility.jsonArrayToStringList(optJSONArray);
            }
            if (optJSONObject == null) {
                map = null;
            } else {
                Utility utility2 = Utility.INSTANCE;
                map = Utility.convertJSONObjectToHashMap(optJSONObject);
            }
            if (optJSONObject2 == null) {
                map2 = null;
            } else {
                Utility utility3 = Utility.INSTANCE;
                map2 = Utility.convertJSONObjectToStringMap(optJSONObject2);
            }
            if (optJSONObject3 != null) {
                Utility utility4 = Utility.INSTANCE;
                map3 = Utility.convertJSONObjectToStringMap(optJSONObject3);
            }
            return new AuthenticationTokenClaims(string, string2, string3, string4, j13, j12, string5, str, nullableString$facebook_core_release2, nullableString$facebook_core_release3, nullableString$facebook_core_release4, nullableString$facebook_core_release5, nullableString$facebook_core_release6, list, nullableString$facebook_core_release7, map, map2, map3, nullableString$facebook_core_release8, nullableString$facebook_core_release9);
        }

        public final String getNullableString$facebook_core_release(JSONObject jSONObject, String str) {
            m.f(jSONObject, "<this>");
            m.f(str, "name");
            if (jSONObject.has(str)) {
                return jSONObject.getString(str);
            }
            return null;
        }
    }

    public AuthenticationTokenClaims(String str, String str2) {
        Set<String> set;
        Map<String, Integer> map;
        Map<String, String> map2;
        m.f(str, "encodedClaims");
        m.f(str2, "expectedNonce");
        Validate validate = Validate.INSTANCE;
        Validate.notEmpty(str, "encodedClaims");
        byte[] decode = Base64.decode(str, 8);
        m.e(decode, "decodedBytes");
        JSONObject jSONObject = new JSONObject(new String(decode, d.f14759b));
        if (isValidClaims(jSONObject, str2)) {
            String string = jSONObject.getString(JSON_KEY_JIT);
            m.e(string, "jsonObj.getString(JSON_KEY_JIT)");
            this.jti = string;
            String string2 = jSONObject.getString(JSON_KEY_ISS);
            m.e(string2, "jsonObj.getString(JSON_KEY_ISS)");
            this.iss = string2;
            String string3 = jSONObject.getString(JSON_KEY_AUD);
            m.e(string3, "jsonObj.getString(JSON_KEY_AUD)");
            this.aud = string3;
            String string4 = jSONObject.getString("nonce");
            m.e(string4, "jsonObj.getString(JSON_KEY_NONCE)");
            this.nonce = string4;
            this.exp = jSONObject.getLong(JSON_KEY_EXP);
            this.iat = jSONObject.getLong(JSON_KEY_IAT);
            String string5 = jSONObject.getString(JSON_KEY_SUB);
            m.e(string5, "jsonObj.getString(JSON_KEY_SUB)");
            this.sub = string5;
            Companion companion = Companion;
            this.name = companion.getNullableString$facebook_core_release(jSONObject, "name");
            this.givenName = companion.getNullableString$facebook_core_release(jSONObject, JSON_KEY_GIVEN_NAME);
            this.middleName = companion.getNullableString$facebook_core_release(jSONObject, JSON_KEY_MIDDLE_NAME);
            this.familyName = companion.getNullableString$facebook_core_release(jSONObject, JSON_KEY_FAMILY_NAME);
            this.email = companion.getNullableString$facebook_core_release(jSONObject, "email");
            this.picture = companion.getNullableString$facebook_core_release(jSONObject, "picture");
            JSONArray optJSONArray = jSONObject.optJSONArray(JSON_KEY_USER_FRIENDS);
            Map<String, String> map3 = null;
            if (optJSONArray == null) {
                set = null;
            } else {
                Utility utility = Utility.INSTANCE;
                set = Collections.unmodifiableSet(Utility.jsonArrayToSet(optJSONArray));
            }
            this.userFriends = set;
            this.userBirthday = companion.getNullableString$facebook_core_release(jSONObject, JSON_KEY_USER_BIRTHDAY);
            JSONObject optJSONObject = jSONObject.optJSONObject(JSON_KEY_USER_AGE_RANGE);
            if (optJSONObject == null) {
                map = null;
            } else {
                Utility utility2 = Utility.INSTANCE;
                map = Collections.unmodifiableMap(Utility.convertJSONObjectToHashMap(optJSONObject));
            }
            this.userAgeRange = map;
            JSONObject optJSONObject2 = jSONObject.optJSONObject(JSON_KEY_USER_HOMETOWN);
            if (optJSONObject2 == null) {
                map2 = null;
            } else {
                Utility utility3 = Utility.INSTANCE;
                map2 = Collections.unmodifiableMap(Utility.convertJSONObjectToStringMap(optJSONObject2));
            }
            this.userHometown = map2;
            JSONObject optJSONObject3 = jSONObject.optJSONObject(JSON_KEY_USER_LOCATION);
            if (optJSONObject3 != null) {
                Utility utility4 = Utility.INSTANCE;
                map3 = Collections.unmodifiableMap(Utility.convertJSONObjectToStringMap(optJSONObject3));
            }
            this.userLocation = map3;
            this.userGender = companion.getNullableString$facebook_core_release(jSONObject, JSON_KEY_USER_GENDER);
            this.userLink = companion.getNullableString$facebook_core_release(jSONObject, JSON_KEY_USER_LINK);
            return;
        }
        throw new IllegalArgumentException("Invalid claims".toString());
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AuthenticationTokenClaims(String str, String str2, String str3, String str4, long j10, long j11, String str5) {
        this(str, str2, str3, str4, j10, j11, str5, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Collection) null, (String) null, (Map) null, (Map) null, (Map) null, (String) null, (String) null, 1048448, (g) null);
        m.f(str, JSON_KEY_JIT);
        m.f(str2, JSON_KEY_ISS);
        m.f(str3, JSON_KEY_AUD);
        m.f(str4, "nonce");
        m.f(str5, JSON_KEY_SUB);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AuthenticationTokenClaims(String str, String str2, String str3, String str4, long j10, long j11, String str5, String str6) {
        this(str, str2, str3, str4, j10, j11, str5, str6, (String) null, (String) null, (String) null, (String) null, (String) null, (Collection) null, (String) null, (Map) null, (Map) null, (Map) null, (String) null, (String) null, 1048320, (g) null);
        m.f(str, JSON_KEY_JIT);
        m.f(str2, JSON_KEY_ISS);
        m.f(str3, JSON_KEY_AUD);
        m.f(str4, "nonce");
        m.f(str5, JSON_KEY_SUB);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AuthenticationTokenClaims(String str, String str2, String str3, String str4, long j10, long j11, String str5, String str6, String str7) {
        this(str, str2, str3, str4, j10, j11, str5, str6, str7, (String) null, (String) null, (String) null, (String) null, (Collection) null, (String) null, (Map) null, (Map) null, (Map) null, (String) null, (String) null, 1048064, (g) null);
        m.f(str, JSON_KEY_JIT);
        m.f(str2, JSON_KEY_ISS);
        m.f(str3, JSON_KEY_AUD);
        m.f(str4, "nonce");
        m.f(str5, JSON_KEY_SUB);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AuthenticationTokenClaims(String str, String str2, String str3, String str4, long j10, long j11, String str5, String str6, String str7, String str8) {
        this(str, str2, str3, str4, j10, j11, str5, str6, str7, str8, (String) null, (String) null, (String) null, (Collection) null, (String) null, (Map) null, (Map) null, (Map) null, (String) null, (String) null, 1047552, (g) null);
        m.f(str, JSON_KEY_JIT);
        m.f(str2, JSON_KEY_ISS);
        m.f(str3, JSON_KEY_AUD);
        m.f(str4, "nonce");
        m.f(str5, JSON_KEY_SUB);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AuthenticationTokenClaims(String str, String str2, String str3, String str4, long j10, long j11, String str5, String str6, String str7, String str8, String str9) {
        this(str, str2, str3, str4, j10, j11, str5, str6, str7, str8, str9, (String) null, (String) null, (Collection) null, (String) null, (Map) null, (Map) null, (Map) null, (String) null, (String) null, 1046528, (g) null);
        m.f(str, JSON_KEY_JIT);
        m.f(str2, JSON_KEY_ISS);
        m.f(str3, JSON_KEY_AUD);
        m.f(str4, "nonce");
        m.f(str5, JSON_KEY_SUB);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AuthenticationTokenClaims(String str, String str2, String str3, String str4, long j10, long j11, String str5, String str6, String str7, String str8, String str9, String str10) {
        this(str, str2, str3, str4, j10, j11, str5, str6, str7, str8, str9, str10, (String) null, (Collection) null, (String) null, (Map) null, (Map) null, (Map) null, (String) null, (String) null, 1044480, (g) null);
        m.f(str, JSON_KEY_JIT);
        m.f(str2, JSON_KEY_ISS);
        m.f(str3, JSON_KEY_AUD);
        m.f(str4, "nonce");
        m.f(str5, JSON_KEY_SUB);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AuthenticationTokenClaims(java.lang.String r28, java.lang.String r29, java.lang.String r30, java.lang.String r31, long r32, long r34, java.lang.String r36, java.lang.String r37, java.lang.String r38, java.lang.String r39, java.lang.String r40, java.lang.String r41, java.lang.String r42) {
        /*
            r27 = this;
            r0 = r27
            r1 = r28
            r2 = r29
            r3 = r30
            r4 = r31
            r5 = r32
            r7 = r34
            r9 = r36
            r10 = r37
            r11 = r38
            r12 = r39
            r13 = r40
            r14 = r41
            r15 = r42
            r25 = r0
            java.lang.String r0 = "jti"
            r26 = r1
            kotlin.jvm.internal.m.f(r1, r0)
            java.lang.String r0 = "iss"
            r1 = r29
            kotlin.jvm.internal.m.f(r1, r0)
            java.lang.String r0 = "aud"
            r1 = r30
            kotlin.jvm.internal.m.f(r1, r0)
            java.lang.String r0 = "nonce"
            r1 = r31
            kotlin.jvm.internal.m.f(r1, r0)
            java.lang.String r0 = "sub"
            r1 = r36
            kotlin.jvm.internal.m.f(r1, r0)
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 1040384(0xfe000, float:1.457889E-39)
            r24 = 0
            r0 = r25
            r1 = r26
            r0.<init>(r1, r2, r3, r4, r5, r7, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.AuthenticationTokenClaims.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AuthenticationTokenClaims(java.lang.String r28, java.lang.String r29, java.lang.String r30, java.lang.String r31, long r32, long r34, java.lang.String r36, java.lang.String r37, java.lang.String r38, java.lang.String r39, java.lang.String r40, java.lang.String r41, java.lang.String r42, java.util.Collection<java.lang.String> r43) {
        /*
            r27 = this;
            r0 = r27
            r1 = r28
            r2 = r29
            r3 = r30
            r4 = r31
            r5 = r32
            r7 = r34
            r9 = r36
            r10 = r37
            r11 = r38
            r12 = r39
            r13 = r40
            r14 = r41
            r15 = r42
            r16 = r43
            r25 = r0
            java.lang.String r0 = "jti"
            r26 = r1
            kotlin.jvm.internal.m.f(r1, r0)
            java.lang.String r0 = "iss"
            r1 = r29
            kotlin.jvm.internal.m.f(r1, r0)
            java.lang.String r0 = "aud"
            r1 = r30
            kotlin.jvm.internal.m.f(r1, r0)
            java.lang.String r0 = "nonce"
            r1 = r31
            kotlin.jvm.internal.m.f(r1, r0)
            java.lang.String r0 = "sub"
            r1 = r36
            kotlin.jvm.internal.m.f(r1, r0)
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 1032192(0xfc000, float:1.446409E-39)
            r24 = 0
            r0 = r25
            r1 = r26
            r0.<init>(r1, r2, r3, r4, r5, r7, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.AuthenticationTokenClaims.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.Collection):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AuthenticationTokenClaims(java.lang.String r28, java.lang.String r29, java.lang.String r30, java.lang.String r31, long r32, long r34, java.lang.String r36, java.lang.String r37, java.lang.String r38, java.lang.String r39, java.lang.String r40, java.lang.String r41, java.lang.String r42, java.util.Collection<java.lang.String> r43, java.lang.String r44) {
        /*
            r27 = this;
            r0 = r27
            r1 = r28
            r2 = r29
            r3 = r30
            r4 = r31
            r5 = r32
            r7 = r34
            r9 = r36
            r10 = r37
            r11 = r38
            r12 = r39
            r13 = r40
            r14 = r41
            r15 = r42
            r16 = r43
            r17 = r44
            r25 = r0
            java.lang.String r0 = "jti"
            r26 = r1
            kotlin.jvm.internal.m.f(r1, r0)
            java.lang.String r0 = "iss"
            r1 = r29
            kotlin.jvm.internal.m.f(r1, r0)
            java.lang.String r0 = "aud"
            r1 = r30
            kotlin.jvm.internal.m.f(r1, r0)
            java.lang.String r0 = "nonce"
            r1 = r31
            kotlin.jvm.internal.m.f(r1, r0)
            java.lang.String r0 = "sub"
            r1 = r36
            kotlin.jvm.internal.m.f(r1, r0)
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 1015808(0xf8000, float:1.42345E-39)
            r24 = 0
            r0 = r25
            r1 = r26
            r0.<init>(r1, r2, r3, r4, r5, r7, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.AuthenticationTokenClaims.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.Collection, java.lang.String):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AuthenticationTokenClaims(java.lang.String r28, java.lang.String r29, java.lang.String r30, java.lang.String r31, long r32, long r34, java.lang.String r36, java.lang.String r37, java.lang.String r38, java.lang.String r39, java.lang.String r40, java.lang.String r41, java.lang.String r42, java.util.Collection<java.lang.String> r43, java.lang.String r44, java.util.Map<java.lang.String, java.lang.Integer> r45) {
        /*
            r27 = this;
            r0 = r27
            r1 = r28
            r2 = r29
            r3 = r30
            r4 = r31
            r5 = r32
            r7 = r34
            r9 = r36
            r10 = r37
            r11 = r38
            r12 = r39
            r13 = r40
            r14 = r41
            r15 = r42
            r16 = r43
            r17 = r44
            r18 = r45
            r25 = r0
            java.lang.String r0 = "jti"
            r26 = r1
            kotlin.jvm.internal.m.f(r1, r0)
            java.lang.String r0 = "iss"
            r1 = r29
            kotlin.jvm.internal.m.f(r1, r0)
            java.lang.String r0 = "aud"
            r1 = r30
            kotlin.jvm.internal.m.f(r1, r0)
            java.lang.String r0 = "nonce"
            r1 = r31
            kotlin.jvm.internal.m.f(r1, r0)
            java.lang.String r0 = "sub"
            r1 = r36
            kotlin.jvm.internal.m.f(r1, r0)
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 983040(0xf0000, float:1.377532E-39)
            r24 = 0
            r0 = r25
            r1 = r26
            r0.<init>(r1, r2, r3, r4, r5, r7, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.AuthenticationTokenClaims.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.Collection, java.lang.String, java.util.Map):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AuthenticationTokenClaims(java.lang.String r28, java.lang.String r29, java.lang.String r30, java.lang.String r31, long r32, long r34, java.lang.String r36, java.lang.String r37, java.lang.String r38, java.lang.String r39, java.lang.String r40, java.lang.String r41, java.lang.String r42, java.util.Collection<java.lang.String> r43, java.lang.String r44, java.util.Map<java.lang.String, java.lang.Integer> r45, java.util.Map<java.lang.String, java.lang.String> r46) {
        /*
            r27 = this;
            r0 = r27
            r1 = r28
            r2 = r29
            r3 = r30
            r4 = r31
            r5 = r32
            r7 = r34
            r9 = r36
            r10 = r37
            r11 = r38
            r12 = r39
            r13 = r40
            r14 = r41
            r15 = r42
            r16 = r43
            r17 = r44
            r18 = r45
            r19 = r46
            r25 = r0
            java.lang.String r0 = "jti"
            r26 = r1
            kotlin.jvm.internal.m.f(r1, r0)
            java.lang.String r0 = "iss"
            r1 = r29
            kotlin.jvm.internal.m.f(r1, r0)
            java.lang.String r0 = "aud"
            r1 = r30
            kotlin.jvm.internal.m.f(r1, r0)
            java.lang.String r0 = "nonce"
            r1 = r31
            kotlin.jvm.internal.m.f(r1, r0)
            java.lang.String r0 = "sub"
            r1 = r36
            kotlin.jvm.internal.m.f(r1, r0)
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 917504(0xe0000, float:1.285697E-39)
            r24 = 0
            r0 = r25
            r1 = r26
            r0.<init>(r1, r2, r3, r4, r5, r7, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.AuthenticationTokenClaims.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.Collection, java.lang.String, java.util.Map, java.util.Map):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AuthenticationTokenClaims(java.lang.String r28, java.lang.String r29, java.lang.String r30, java.lang.String r31, long r32, long r34, java.lang.String r36, java.lang.String r37, java.lang.String r38, java.lang.String r39, java.lang.String r40, java.lang.String r41, java.lang.String r42, java.util.Collection<java.lang.String> r43, java.lang.String r44, java.util.Map<java.lang.String, java.lang.Integer> r45, java.util.Map<java.lang.String, java.lang.String> r46, java.util.Map<java.lang.String, java.lang.String> r47) {
        /*
            r27 = this;
            r0 = r27
            r1 = r28
            r2 = r29
            r3 = r30
            r4 = r31
            r5 = r32
            r7 = r34
            r9 = r36
            r10 = r37
            r11 = r38
            r12 = r39
            r13 = r40
            r14 = r41
            r15 = r42
            r16 = r43
            r17 = r44
            r18 = r45
            r19 = r46
            r20 = r47
            r25 = r0
            java.lang.String r0 = "jti"
            r26 = r1
            kotlin.jvm.internal.m.f(r1, r0)
            java.lang.String r0 = "iss"
            r1 = r29
            kotlin.jvm.internal.m.f(r1, r0)
            java.lang.String r0 = "aud"
            r1 = r30
            kotlin.jvm.internal.m.f(r1, r0)
            java.lang.String r0 = "nonce"
            r1 = r31
            kotlin.jvm.internal.m.f(r1, r0)
            java.lang.String r0 = "sub"
            r1 = r36
            kotlin.jvm.internal.m.f(r1, r0)
            r21 = 0
            r22 = 0
            r23 = 786432(0xc0000, float:1.102026E-39)
            r24 = 0
            r0 = r25
            r1 = r26
            r0.<init>(r1, r2, r3, r4, r5, r7, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.AuthenticationTokenClaims.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.Collection, java.lang.String, java.util.Map, java.util.Map, java.util.Map):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AuthenticationTokenClaims(java.lang.String r28, java.lang.String r29, java.lang.String r30, java.lang.String r31, long r32, long r34, java.lang.String r36, java.lang.String r37, java.lang.String r38, java.lang.String r39, java.lang.String r40, java.lang.String r41, java.lang.String r42, java.util.Collection<java.lang.String> r43, java.lang.String r44, java.util.Map<java.lang.String, java.lang.Integer> r45, java.util.Map<java.lang.String, java.lang.String> r46, java.util.Map<java.lang.String, java.lang.String> r47, java.lang.String r48) {
        /*
            r27 = this;
            r0 = r27
            r1 = r28
            r2 = r29
            r3 = r30
            r4 = r31
            r5 = r32
            r7 = r34
            r9 = r36
            r10 = r37
            r11 = r38
            r12 = r39
            r13 = r40
            r14 = r41
            r15 = r42
            r16 = r43
            r17 = r44
            r18 = r45
            r19 = r46
            r20 = r47
            r21 = r48
            r25 = r0
            java.lang.String r0 = "jti"
            r26 = r1
            kotlin.jvm.internal.m.f(r1, r0)
            java.lang.String r0 = "iss"
            r1 = r29
            kotlin.jvm.internal.m.f(r1, r0)
            java.lang.String r0 = "aud"
            r1 = r30
            kotlin.jvm.internal.m.f(r1, r0)
            java.lang.String r0 = "nonce"
            r1 = r31
            kotlin.jvm.internal.m.f(r1, r0)
            java.lang.String r0 = "sub"
            r1 = r36
            kotlin.jvm.internal.m.f(r1, r0)
            r22 = 0
            r23 = 524288(0x80000, float:7.34684E-40)
            r24 = 0
            r0 = r25
            r1 = r26
            r0.<init>(r1, r2, r3, r4, r5, r7, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.AuthenticationTokenClaims.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.Collection, java.lang.String, java.util.Map, java.util.Map, java.util.Map, java.lang.String):void");
    }

    public static final AuthenticationTokenClaims createFromJSONObject$facebook_core_release(JSONObject jSONObject) {
        return Companion.createFromJSONObject$facebook_core_release(jSONObject);
    }

    private final boolean isValidClaims(JSONObject jSONObject, String str) {
        if (jSONObject == null) {
            return false;
        }
        String optString = jSONObject.optString(JSON_KEY_JIT);
        m.e(optString, JSON_KEY_JIT);
        if (optString.length() == 0) {
            return false;
        }
        try {
            String optString2 = jSONObject.optString(JSON_KEY_ISS);
            m.e(optString2, JSON_KEY_ISS);
            if (!(optString2.length() == 0) && (m.a(new URL(optString2).getHost(), FacebookSdk.FACEBOOK_COM) || m.a(new URL(optString2).getHost(), "www.facebook.com"))) {
                String optString3 = jSONObject.optString(JSON_KEY_AUD);
                m.e(optString3, JSON_KEY_AUD);
                if (!(optString3.length() == 0)) {
                    FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
                    if (m.a(optString3, FacebookSdk.getApplicationId())) {
                        long j10 = (long) 1000;
                        if (new Date().after(new Date(jSONObject.optLong(JSON_KEY_EXP) * j10))) {
                            return false;
                        }
                        if (new Date().after(new Date((jSONObject.optLong(JSON_KEY_IAT) * j10) + MAX_TIME_SINCE_TOKEN_ISSUED))) {
                            return false;
                        }
                        String optString4 = jSONObject.optString(JSON_KEY_SUB);
                        m.e(optString4, JSON_KEY_SUB);
                        if (optString4.length() == 0) {
                            return false;
                        }
                        String optString5 = jSONObject.optString("nonce");
                        m.e(optString5, "nonce");
                        if ((optString5.length() == 0) || !m.a(optString5, str)) {
                            return false;
                        }
                        return true;
                    }
                }
            }
        } catch (MalformedURLException unused) {
        }
        return false;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthenticationTokenClaims)) {
            return false;
        }
        AuthenticationTokenClaims authenticationTokenClaims = (AuthenticationTokenClaims) obj;
        if (!m.a(this.jti, authenticationTokenClaims.jti) || !m.a(this.iss, authenticationTokenClaims.iss) || !m.a(this.aud, authenticationTokenClaims.aud) || !m.a(this.nonce, authenticationTokenClaims.nonce) || this.exp != authenticationTokenClaims.exp || this.iat != authenticationTokenClaims.iat || !m.a(this.sub, authenticationTokenClaims.sub) || !m.a(this.name, authenticationTokenClaims.name) || !m.a(this.givenName, authenticationTokenClaims.givenName) || !m.a(this.middleName, authenticationTokenClaims.middleName) || !m.a(this.familyName, authenticationTokenClaims.familyName) || !m.a(this.email, authenticationTokenClaims.email) || !m.a(this.picture, authenticationTokenClaims.picture) || !m.a(this.userFriends, authenticationTokenClaims.userFriends) || !m.a(this.userBirthday, authenticationTokenClaims.userBirthday) || !m.a(this.userAgeRange, authenticationTokenClaims.userAgeRange) || !m.a(this.userHometown, authenticationTokenClaims.userHometown) || !m.a(this.userLocation, authenticationTokenClaims.userLocation) || !m.a(this.userGender, authenticationTokenClaims.userGender) || !m.a(this.userLink, authenticationTokenClaims.userLink)) {
            return false;
        }
        return true;
    }

    public final String getAud() {
        return this.aud;
    }

    public final String getEmail() {
        return this.email;
    }

    public final long getExp() {
        return this.exp;
    }

    public final String getFamilyName() {
        return this.familyName;
    }

    public final String getGivenName() {
        return this.givenName;
    }

    public final long getIat() {
        return this.iat;
    }

    public final String getIss() {
        return this.iss;
    }

    public final String getJti() {
        return this.jti;
    }

    public final String getMiddleName() {
        return this.middleName;
    }

    public final String getName() {
        return this.name;
    }

    public final String getNonce() {
        return this.nonce;
    }

    public final String getPicture() {
        return this.picture;
    }

    public final String getSub() {
        return this.sub;
    }

    public final Map<String, Integer> getUserAgeRange() {
        return this.userAgeRange;
    }

    public final String getUserBirthday() {
        return this.userBirthday;
    }

    public final Set<String> getUserFriends() {
        return this.userFriends;
    }

    public final String getUserGender() {
        return this.userGender;
    }

    public final Map<String, String> getUserHometown() {
        return this.userHometown;
    }

    public final String getUserLink() {
        return this.userLink;
    }

    public final Map<String, String> getUserLocation() {
        return this.userLocation;
    }

    public int hashCode() {
        int hashCode = (((((((((((((527 + this.jti.hashCode()) * 31) + this.iss.hashCode()) * 31) + this.aud.hashCode()) * 31) + this.nonce.hashCode()) * 31) + androidx.privacysandbox.ads.adservices.topics.d.a(this.exp)) * 31) + androidx.privacysandbox.ads.adservices.topics.d.a(this.iat)) * 31) + this.sub.hashCode()) * 31;
        String str = this.name;
        int i10 = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.givenName;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.middleName;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.familyName;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.email;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.picture;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Set<String> set = this.userFriends;
        int hashCode8 = (hashCode7 + (set == null ? 0 : set.hashCode())) * 31;
        String str7 = this.userBirthday;
        int hashCode9 = (hashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Map<String, Integer> map = this.userAgeRange;
        int hashCode10 = (hashCode9 + (map == null ? 0 : map.hashCode())) * 31;
        Map<String, String> map2 = this.userHometown;
        int hashCode11 = (hashCode10 + (map2 == null ? 0 : map2.hashCode())) * 31;
        Map<String, String> map3 = this.userLocation;
        int hashCode12 = (hashCode11 + (map3 == null ? 0 : map3.hashCode())) * 31;
        String str8 = this.userGender;
        int hashCode13 = (hashCode12 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.userLink;
        if (str9 != null) {
            i10 = str9.hashCode();
        }
        return hashCode13 + i10;
    }

    public final String toEnCodedString() {
        String authenticationTokenClaims = toString();
        Charset charset = d.f14759b;
        Objects.requireNonNull(authenticationTokenClaims, "null cannot be cast to non-null type java.lang.String");
        byte[] bytes = authenticationTokenClaims.getBytes(charset);
        m.e(bytes, "(this as java.lang.String).getBytes(charset)");
        String encodeToString = Base64.encodeToString(bytes, 8);
        m.e(encodeToString, "encodeToString(claimsJsonString.toByteArray(), Base64.URL_SAFE)");
        return encodeToString;
    }

    public final JSONObject toJSONObject$facebook_core_release() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(JSON_KEY_JIT, this.jti);
        jSONObject.put(JSON_KEY_ISS, this.iss);
        jSONObject.put(JSON_KEY_AUD, this.aud);
        jSONObject.put("nonce", this.nonce);
        jSONObject.put(JSON_KEY_EXP, this.exp);
        jSONObject.put(JSON_KEY_IAT, this.iat);
        String str = this.sub;
        if (str != null) {
            jSONObject.put(JSON_KEY_SUB, str);
        }
        String str2 = this.name;
        if (str2 != null) {
            jSONObject.put("name", str2);
        }
        String str3 = this.givenName;
        if (str3 != null) {
            jSONObject.put(JSON_KEY_GIVEN_NAME, str3);
        }
        String str4 = this.middleName;
        if (str4 != null) {
            jSONObject.put(JSON_KEY_MIDDLE_NAME, str4);
        }
        String str5 = this.familyName;
        if (str5 != null) {
            jSONObject.put(JSON_KEY_FAMILY_NAME, str5);
        }
        String str6 = this.email;
        if (str6 != null) {
            jSONObject.put("email", str6);
        }
        String str7 = this.picture;
        if (str7 != null) {
            jSONObject.put("picture", str7);
        }
        if (this.userFriends != null) {
            jSONObject.put(JSON_KEY_USER_FRIENDS, new JSONArray(this.userFriends));
        }
        String str8 = this.userBirthday;
        if (str8 != null) {
            jSONObject.put(JSON_KEY_USER_BIRTHDAY, str8);
        }
        if (this.userAgeRange != null) {
            jSONObject.put(JSON_KEY_USER_AGE_RANGE, new JSONObject(this.userAgeRange));
        }
        if (this.userHometown != null) {
            jSONObject.put(JSON_KEY_USER_HOMETOWN, new JSONObject(this.userHometown));
        }
        if (this.userLocation != null) {
            jSONObject.put(JSON_KEY_USER_LOCATION, new JSONObject(this.userLocation));
        }
        String str9 = this.userGender;
        if (str9 != null) {
            jSONObject.put(JSON_KEY_USER_GENDER, str9);
        }
        String str10 = this.userLink;
        if (str10 != null) {
            jSONObject.put(JSON_KEY_USER_LINK, str10);
        }
        return jSONObject;
    }

    public String toString() {
        String jSONObject = toJSONObject$facebook_core_release().toString();
        m.e(jSONObject, "claimsJsonObject.toString()");
        return jSONObject;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        m.f(parcel, "dest");
        parcel.writeString(this.jti);
        parcel.writeString(this.iss);
        parcel.writeString(this.aud);
        parcel.writeString(this.nonce);
        parcel.writeLong(this.exp);
        parcel.writeLong(this.iat);
        parcel.writeString(this.sub);
        parcel.writeString(this.name);
        parcel.writeString(this.givenName);
        parcel.writeString(this.middleName);
        parcel.writeString(this.familyName);
        parcel.writeString(this.email);
        parcel.writeString(this.picture);
        if (this.userFriends == null) {
            parcel.writeStringList((List) null);
        } else {
            parcel.writeStringList(new ArrayList(this.userFriends));
        }
        parcel.writeString(this.userBirthday);
        parcel.writeMap(this.userAgeRange);
        parcel.writeMap(this.userHometown);
        parcel.writeMap(this.userLocation);
        parcel.writeString(this.userGender);
        parcel.writeString(this.userLink);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ AuthenticationTokenClaims(java.lang.String r27, java.lang.String r28, java.lang.String r29, java.lang.String r30, long r31, long r33, java.lang.String r35, java.lang.String r36, java.lang.String r37, java.lang.String r38, java.lang.String r39, java.lang.String r40, java.lang.String r41, java.util.Collection r42, java.lang.String r43, java.util.Map r44, java.util.Map r45, java.util.Map r46, java.lang.String r47, java.lang.String r48, int r49, kotlin.jvm.internal.g r50) {
        /*
            r26 = this;
            r0 = r49
            r1 = r0 & 128(0x80, float:1.794E-43)
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r13 = r2
            goto L_0x000b
        L_0x0009:
            r13 = r36
        L_0x000b:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x0011
            r14 = r2
            goto L_0x0013
        L_0x0011:
            r14 = r37
        L_0x0013:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x0019
            r15 = r2
            goto L_0x001b
        L_0x0019:
            r15 = r38
        L_0x001b:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L_0x0022
            r16 = r2
            goto L_0x0024
        L_0x0022:
            r16 = r39
        L_0x0024:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L_0x002b
            r17 = r2
            goto L_0x002d
        L_0x002b:
            r17 = r40
        L_0x002d:
            r1 = r0 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L_0x0034
            r18 = r2
            goto L_0x0036
        L_0x0034:
            r18 = r41
        L_0x0036:
            r1 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r1 == 0) goto L_0x003d
            r19 = r2
            goto L_0x003f
        L_0x003d:
            r19 = r42
        L_0x003f:
            r1 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r1 == 0) goto L_0x0046
            r20 = r2
            goto L_0x0048
        L_0x0046:
            r20 = r43
        L_0x0048:
            r1 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0051
            r21 = r2
            goto L_0x0053
        L_0x0051:
            r21 = r44
        L_0x0053:
            r1 = 65536(0x10000, float:9.18355E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x005b
            r22 = r2
            goto L_0x005d
        L_0x005b:
            r22 = r45
        L_0x005d:
            r1 = 131072(0x20000, float:1.83671E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0065
            r23 = r2
            goto L_0x0067
        L_0x0065:
            r23 = r46
        L_0x0067:
            r1 = 262144(0x40000, float:3.67342E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x006f
            r24 = r2
            goto L_0x0071
        L_0x006f:
            r24 = r47
        L_0x0071:
            r1 = 524288(0x80000, float:7.34684E-40)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x0079
            r25 = r2
            goto L_0x007b
        L_0x0079:
            r25 = r48
        L_0x007b:
            r3 = r26
            r4 = r27
            r5 = r28
            r6 = r29
            r7 = r30
            r8 = r31
            r10 = r33
            r12 = r35
            r3.<init>(r4, r5, r6, r7, r8, r10, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.AuthenticationTokenClaims.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.Collection, java.lang.String, java.util.Map, java.util.Map, java.util.Map, java.lang.String, java.lang.String, int, kotlin.jvm.internal.g):void");
    }

    public AuthenticationTokenClaims(String str, String str2, String str3, String str4, long j10, long j11, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Collection<String> collection, String str12, Map<String, Integer> map, Map<String, String> map2, Map<String, String> map3, String str13, String str14) {
        String str15 = str;
        String str16 = str2;
        String str17 = str3;
        String str18 = str4;
        String str19 = str5;
        Collection<String> collection2 = collection;
        Map<String, Integer> map4 = map;
        Map<String, String> map5 = map2;
        Map<String, String> map6 = map3;
        m.f(str15, JSON_KEY_JIT);
        m.f(str16, JSON_KEY_ISS);
        m.f(str17, JSON_KEY_AUD);
        m.f(str18, "nonce");
        m.f(str19, JSON_KEY_SUB);
        Validate validate = Validate.INSTANCE;
        Validate.notEmpty(str15, JSON_KEY_JIT);
        Validate.notEmpty(str16, JSON_KEY_ISS);
        Validate.notEmpty(str17, JSON_KEY_AUD);
        Validate.notEmpty(str18, "nonce");
        Validate.notEmpty(str19, JSON_KEY_SUB);
        this.jti = str15;
        this.iss = str16;
        this.aud = str17;
        this.nonce = str18;
        this.exp = j10;
        this.iat = j11;
        this.sub = str19;
        this.name = str6;
        this.givenName = str7;
        this.middleName = str8;
        this.familyName = str9;
        this.email = str10;
        this.picture = str11;
        Map<String, String> map7 = null;
        this.userFriends = collection2 != null ? Collections.unmodifiableSet(new HashSet(collection2)) : null;
        this.userBirthday = str12;
        this.userAgeRange = map4 != null ? Collections.unmodifiableMap(new HashMap(map4)) : null;
        this.userHometown = map5 != null ? Collections.unmodifiableMap(new HashMap(map5)) : null;
        this.userLocation = map6 != null ? Collections.unmodifiableMap(new HashMap(map6)) : map7;
        this.userGender = str13;
        this.userLink = str14;
    }

    public AuthenticationTokenClaims(Parcel parcel) {
        m.f(parcel, "parcel");
        String readString = parcel.readString();
        Validate validate = Validate.INSTANCE;
        this.jti = Validate.notNullOrEmpty(readString, JSON_KEY_JIT);
        this.iss = Validate.notNullOrEmpty(parcel.readString(), JSON_KEY_ISS);
        this.aud = Validate.notNullOrEmpty(parcel.readString(), JSON_KEY_AUD);
        this.nonce = Validate.notNullOrEmpty(parcel.readString(), "nonce");
        this.exp = parcel.readLong();
        this.iat = parcel.readLong();
        this.sub = Validate.notNullOrEmpty(parcel.readString(), JSON_KEY_SUB);
        this.name = parcel.readString();
        this.givenName = parcel.readString();
        this.middleName = parcel.readString();
        this.familyName = parcel.readString();
        this.email = parcel.readString();
        this.picture = parcel.readString();
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        Map<String, String> map = null;
        this.userFriends = createStringArrayList != null ? Collections.unmodifiableSet(new HashSet(createStringArrayList)) : null;
        this.userBirthday = parcel.readString();
        HashMap readHashMap = parcel.readHashMap(l.f15569a.getClass().getClassLoader());
        readHashMap = !(readHashMap instanceof HashMap) ? null : readHashMap;
        this.userAgeRange = readHashMap != null ? Collections.unmodifiableMap(readHashMap) : null;
        b0 b0Var = b0.f15559a;
        HashMap readHashMap2 = parcel.readHashMap(b0Var.getClass().getClassLoader());
        readHashMap2 = !(readHashMap2 instanceof HashMap) ? null : readHashMap2;
        this.userHometown = readHashMap2 != null ? Collections.unmodifiableMap(readHashMap2) : null;
        HashMap readHashMap3 = parcel.readHashMap(b0Var.getClass().getClassLoader());
        readHashMap3 = !(readHashMap3 instanceof HashMap) ? null : readHashMap3;
        this.userLocation = readHashMap3 != null ? Collections.unmodifiableMap(readHashMap3) : map;
        this.userGender = parcel.readString();
        this.userLink = parcel.readString();
    }
}
