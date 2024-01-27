package com.facebook;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.facebook.LegacyTokenHelper;
import com.facebook.internal.Utility;
import com.facebook.internal.Validate;
import io.flutter.plugins.firebase.analytics.Constants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: AccessToken.kt */
public final class AccessToken implements Parcelable {
    public static final String ACCESS_TOKEN_KEY = "access_token";
    private static final String APPLICATION_ID_KEY = "application_id";
    public static final Parcelable.Creator<AccessToken> CREATOR = new AccessToken$Companion$CREATOR$1();
    private static final int CURRENT_JSON_FORMAT = 1;
    public static final Companion Companion = new Companion((g) null);
    public static final String DATA_ACCESS_EXPIRATION_TIME = "data_access_expiration_time";
    private static final String DECLINED_PERMISSIONS_KEY = "declined_permissions";
    private static final AccessTokenSource DEFAULT_ACCESS_TOKEN_SOURCE = AccessTokenSource.FACEBOOK_APPLICATION_WEB;
    private static final Date DEFAULT_EXPIRATION_TIME;
    public static final String DEFAULT_GRAPH_DOMAIN = "facebook";
    private static final Date DEFAULT_LAST_REFRESH_TIME = new Date();
    private static final String EXPIRED_PERMISSIONS_KEY = "expired_permissions";
    private static final String EXPIRES_AT_KEY = "expires_at";
    public static final String EXPIRES_IN_KEY = "expires_in";
    public static final String GRAPH_DOMAIN = "graph_domain";
    private static final String LAST_REFRESH_KEY = "last_refresh";
    private static final Date MAX_DATE;
    private static final String PERMISSIONS_KEY = "permissions";
    private static final String SOURCE_KEY = "source";
    private static final String TOKEN_KEY = "token";
    public static final String USER_ID_KEY = "user_id";
    private static final String VERSION_KEY = "version";
    private final String applicationId;
    private final Date dataAccessExpirationTime;
    private final Set<String> declinedPermissions;
    private final Set<String> expiredPermissions;
    private final Date expires;
    private final String graphDomain;
    private final Date lastRefresh;
    private final Set<String> permissions;
    private final AccessTokenSource source;
    private final String token;
    private final String userId;

    /* compiled from: AccessToken.kt */
    public interface AccessTokenCreationCallback {
        void onError(FacebookException facebookException);

        void onSuccess(AccessToken accessToken);
    }

    /* compiled from: AccessToken.kt */
    public interface AccessTokenRefreshCallback {
        void OnTokenRefreshFailed(FacebookException facebookException);

        void OnTokenRefreshed(AccessToken accessToken);
    }

    /* compiled from: AccessToken.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        /* access modifiers changed from: private */
        public final AccessToken createFromBundle(List<String> list, Bundle bundle, AccessTokenSource accessTokenSource, Date date, String str) {
            String string;
            Bundle bundle2 = bundle;
            String string2 = bundle2.getString("access_token");
            if (string2 == null) {
                return null;
            }
            Utility utility = Utility.INSTANCE;
            Date bundleLongAsDate = Utility.getBundleLongAsDate(bundle2, AccessToken.EXPIRES_IN_KEY, date);
            if (bundleLongAsDate == null || (string = bundle2.getString(AccessToken.USER_ID_KEY)) == null) {
                return null;
            }
            return new AccessToken(string2, str, string, list, (Collection) null, (Collection) null, accessTokenSource, bundleLongAsDate, new Date(), Utility.getBundleLongAsDate(bundle2, AccessToken.DATA_ACCESS_EXPIRATION_TIME, new Date(0)), (String) null, 1024, (g) null);
        }

        public final AccessToken createExpired$facebook_core_release(AccessToken accessToken) {
            m.f(accessToken, "current");
            return new AccessToken(accessToken.getToken(), accessToken.getApplicationId(), accessToken.getUserId(), accessToken.getPermissions(), accessToken.getDeclinedPermissions(), accessToken.getExpiredPermissions(), accessToken.getSource(), new Date(), new Date(), accessToken.getDataAccessExpirationTime(), (String) null, 1024, (g) null);
        }

        public final AccessToken createFromJSONObject$facebook_core_release(JSONObject jSONObject) {
            Collection collection;
            m.f(jSONObject, "jsonObject");
            if (jSONObject.getInt("version") <= 1) {
                String string = jSONObject.getString(AccessToken.TOKEN_KEY);
                Date date = new Date(jSONObject.getLong(AccessToken.EXPIRES_AT_KEY));
                JSONArray jSONArray = jSONObject.getJSONArray("permissions");
                JSONArray jSONArray2 = jSONObject.getJSONArray(AccessToken.DECLINED_PERMISSIONS_KEY);
                JSONArray optJSONArray = jSONObject.optJSONArray(AccessToken.EXPIRED_PERMISSIONS_KEY);
                Date date2 = new Date(jSONObject.getLong(AccessToken.LAST_REFRESH_KEY));
                String string2 = jSONObject.getString("source");
                m.e(string2, "jsonObject.getString(SOURCE_KEY)");
                AccessTokenSource valueOf = AccessTokenSource.valueOf(string2);
                String string3 = jSONObject.getString(AccessToken.APPLICATION_ID_KEY);
                String string4 = jSONObject.getString(AccessToken.USER_ID_KEY);
                Date date3 = new Date(jSONObject.optLong(AccessToken.DATA_ACCESS_EXPIRATION_TIME, 0));
                String optString = jSONObject.optString("graph_domain", (String) null);
                m.e(string, AccessToken.TOKEN_KEY);
                m.e(string3, "applicationId");
                m.e(string4, Constants.USER_ID);
                Utility utility = Utility.INSTANCE;
                m.e(jSONArray, "permissionsArray");
                List<String> jsonArrayToStringList = Utility.jsonArrayToStringList(jSONArray);
                m.e(jSONArray2, "declinedPermissionsArray");
                List<String> jsonArrayToStringList2 = Utility.jsonArrayToStringList(jSONArray2);
                if (optJSONArray == null) {
                    collection = new ArrayList();
                } else {
                    collection = Utility.jsonArrayToStringList(optJSONArray);
                }
                return new AccessToken(string, string3, string4, jsonArrayToStringList, jsonArrayToStringList2, collection, valueOf, date, date2, date3, optString);
            }
            throw new FacebookException("Unknown AccessToken serialization format.");
        }

        public final AccessToken createFromLegacyCache$facebook_core_release(Bundle bundle) {
            String str;
            Bundle bundle2 = bundle;
            m.f(bundle2, "bundle");
            List<String> permissionsFromBundle$facebook_core_release = getPermissionsFromBundle$facebook_core_release(bundle2, LegacyTokenHelper.PERMISSIONS_KEY);
            List<String> permissionsFromBundle$facebook_core_release2 = getPermissionsFromBundle$facebook_core_release(bundle2, LegacyTokenHelper.DECLINED_PERMISSIONS_KEY);
            List<String> permissionsFromBundle$facebook_core_release3 = getPermissionsFromBundle$facebook_core_release(bundle2, LegacyTokenHelper.EXPIRED_PERMISSIONS_KEY);
            LegacyTokenHelper.Companion companion = LegacyTokenHelper.Companion;
            String applicationId = companion.getApplicationId(bundle2);
            Utility utility = Utility.INSTANCE;
            if (Utility.isNullOrEmpty(applicationId)) {
                FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
                applicationId = FacebookSdk.getApplicationId();
            }
            String str2 = applicationId;
            String token = companion.getToken(bundle2);
            if (token == null) {
                return null;
            }
            JSONObject awaitGetGraphMeRequestWithCache = Utility.awaitGetGraphMeRequestWithCache(token);
            if (awaitGetGraphMeRequestWithCache == null) {
                str = null;
            } else {
                try {
                    str = awaitGetGraphMeRequestWithCache.getString("id");
                } catch (JSONException unused) {
                    return null;
                }
            }
            if (str2 == null || str == null) {
                return null;
            }
            return new AccessToken(token, str2, str, permissionsFromBundle$facebook_core_release, permissionsFromBundle$facebook_core_release2, permissionsFromBundle$facebook_core_release3, companion.getSource(bundle2), companion.getExpirationDate(bundle2), companion.getLastRefreshDate(bundle2), (Date) null, (String) null, 1024, (g) null);
        }

        public final void createFromNativeLinkingIntent(Intent intent, String str, AccessTokenCreationCallback accessTokenCreationCallback) {
            m.f(intent, "intent");
            m.f(str, "applicationId");
            m.f(accessTokenCreationCallback, "accessTokenCallback");
            if (intent.getExtras() == null) {
                accessTokenCreationCallback.onError(new FacebookException("No extras found on intent"));
                return;
            }
            Bundle bundle = new Bundle(intent.getExtras());
            String string = bundle.getString("access_token");
            if (string != null) {
                boolean z10 = true;
                if (!(string.length() == 0)) {
                    String string2 = bundle.getString(AccessToken.USER_ID_KEY);
                    if (string2 != null) {
                        if (string2.length() != 0) {
                            z10 = false;
                        }
                        if (!z10) {
                            accessTokenCreationCallback.onSuccess(createFromBundle((List<String>) null, bundle, AccessTokenSource.FACEBOOK_APPLICATION_WEB, new Date(), str));
                            return;
                        }
                    }
                    Utility utility = Utility.INSTANCE;
                    Utility.getGraphMeRequestWithCacheAsync(string, new AccessToken$Companion$createFromNativeLinkingIntent$1(bundle, accessTokenCreationCallback, str));
                    return;
                }
            }
            accessTokenCreationCallback.onError(new FacebookException("No access token found on intent"));
        }

        @SuppressLint({"FieldGetter"})
        public final AccessToken createFromRefresh$facebook_core_release(AccessToken accessToken, Bundle bundle) {
            Bundle bundle2 = bundle;
            m.f(accessToken, "current");
            m.f(bundle2, "bundle");
            if (accessToken.getSource() == AccessTokenSource.FACEBOOK_APPLICATION_WEB || accessToken.getSource() == AccessTokenSource.FACEBOOK_APPLICATION_NATIVE || accessToken.getSource() == AccessTokenSource.FACEBOOK_APPLICATION_SERVICE) {
                Utility utility = Utility.INSTANCE;
                Date bundleLongAsDate = Utility.getBundleLongAsDate(bundle2, AccessToken.EXPIRES_IN_KEY, new Date(0));
                String string = bundle2.getString("access_token");
                if (string == null) {
                    return null;
                }
                String string2 = bundle2.getString("graph_domain");
                Date bundleLongAsDate2 = Utility.getBundleLongAsDate(bundle2, AccessToken.DATA_ACCESS_EXPIRATION_TIME, new Date(0));
                if (Utility.isNullOrEmpty(string)) {
                    return null;
                }
                return new AccessToken(string, accessToken.getApplicationId(), accessToken.getUserId(), accessToken.getPermissions(), accessToken.getDeclinedPermissions(), accessToken.getExpiredPermissions(), accessToken.getSource(), bundleLongAsDate, new Date(), bundleLongAsDate2, string2);
            }
            throw new FacebookException(m.o("Invalid token source: ", accessToken.getSource()));
        }

        public final void expireCurrentAccessToken() {
            AccessToken currentAccessToken = AccessTokenManager.Companion.getInstance().getCurrentAccessToken();
            if (currentAccessToken != null) {
                setCurrentAccessToken(createExpired$facebook_core_release(currentAccessToken));
            }
        }

        public final AccessToken getCurrentAccessToken() {
            return AccessTokenManager.Companion.getInstance().getCurrentAccessToken();
        }

        public final List<String> getPermissionsFromBundle$facebook_core_release(Bundle bundle, String str) {
            m.f(bundle, "bundle");
            ArrayList<String> stringArrayList = bundle.getStringArrayList(str);
            if (stringArrayList == null) {
                return p.e();
            }
            List<String> unmodifiableList = Collections.unmodifiableList(new ArrayList(stringArrayList));
            m.e(unmodifiableList, "{\n            Collections.unmodifiableList(ArrayList(originalPermissions))\n          }");
            return unmodifiableList;
        }

        public final boolean isCurrentAccessTokenActive() {
            AccessToken currentAccessToken = AccessTokenManager.Companion.getInstance().getCurrentAccessToken();
            return currentAccessToken != null && !currentAccessToken.isExpired();
        }

        public final boolean isDataAccessActive() {
            AccessToken currentAccessToken = AccessTokenManager.Companion.getInstance().getCurrentAccessToken();
            return currentAccessToken != null && !currentAccessToken.isDataAccessExpired();
        }

        public final boolean isLoggedInWithInstagram() {
            AccessToken currentAccessToken = AccessTokenManager.Companion.getInstance().getCurrentAccessToken();
            return currentAccessToken != null && !currentAccessToken.isExpired() && currentAccessToken.isInstagramToken();
        }

        public final void refreshCurrentAccessTokenAsync() {
            AccessTokenManager.Companion.getInstance().refreshCurrentAccessToken((AccessTokenRefreshCallback) null);
        }

        public final void setCurrentAccessToken(AccessToken accessToken) {
            AccessTokenManager.Companion.getInstance().setCurrentAccessToken(accessToken);
        }

        public final void refreshCurrentAccessTokenAsync(AccessTokenRefreshCallback accessTokenRefreshCallback) {
            AccessTokenManager.Companion.getInstance().refreshCurrentAccessToken(accessTokenRefreshCallback);
        }
    }

    /* compiled from: AccessToken.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AccessTokenSource.values().length];
            iArr[AccessTokenSource.FACEBOOK_APPLICATION_WEB.ordinal()] = 1;
            iArr[AccessTokenSource.CHROME_CUSTOM_TAB.ordinal()] = 2;
            iArr[AccessTokenSource.WEB_VIEW.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        Date date = new Date(Long.MAX_VALUE);
        MAX_DATE = date;
        DEFAULT_EXPIRATION_TIME = date;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AccessToken(java.lang.String r16, java.lang.String r17, java.lang.String r18, java.util.Collection<java.lang.String> r19, java.util.Collection<java.lang.String> r20, java.util.Collection<java.lang.String> r21, com.facebook.AccessTokenSource r22, java.util.Date r23, java.util.Date r24, java.util.Date r25) {
        /*
            r15 = this;
            java.lang.String r0 = "accessToken"
            r2 = r16
            kotlin.jvm.internal.m.f(r2, r0)
            java.lang.String r0 = "applicationId"
            r3 = r17
            kotlin.jvm.internal.m.f(r3, r0)
            java.lang.String r0 = "userId"
            r4 = r18
            kotlin.jvm.internal.m.f(r4, r0)
            r12 = 0
            r13 = 1024(0x400, float:1.435E-42)
            r14 = 0
            r1 = r15
            r5 = r19
            r6 = r20
            r7 = r21
            r8 = r22
            r9 = r23
            r10 = r24
            r11 = r25
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.AccessToken.<init>(java.lang.String, java.lang.String, java.lang.String, java.util.Collection, java.util.Collection, java.util.Collection, com.facebook.AccessTokenSource, java.util.Date, java.util.Date, java.util.Date):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AccessToken(String str, String str2, String str3, Collection collection, Collection collection2, Collection collection3, AccessTokenSource accessTokenSource, Date date, Date date2, Date date3, String str4, int i10, g gVar) {
        this(str, str2, str3, collection, collection2, collection3, accessTokenSource, date, date2, date3, (i10 & 1024) != 0 ? DEFAULT_GRAPH_DOMAIN : str4);
    }

    private final void appendPermissions(StringBuilder sb) {
        sb.append(" permissions:");
        sb.append("[");
        sb.append(TextUtils.join(", ", this.permissions));
        sb.append("]");
    }

    private final AccessTokenSource convertTokenSourceForGraphDomain(AccessTokenSource accessTokenSource, String str) {
        if (str == null || !str.equals(FacebookSdk.INSTAGRAM)) {
            return accessTokenSource;
        }
        int i10 = WhenMappings.$EnumSwitchMapping$0[accessTokenSource.ordinal()];
        if (i10 == 1) {
            return AccessTokenSource.INSTAGRAM_APPLICATION_WEB;
        }
        if (i10 == 2) {
            return AccessTokenSource.INSTAGRAM_CUSTOM_CHROME_TAB;
        }
        if (i10 != 3) {
            return accessTokenSource;
        }
        return AccessTokenSource.INSTAGRAM_WEB_VIEW;
    }

    public static final AccessToken createFromJSONObject$facebook_core_release(JSONObject jSONObject) {
        return Companion.createFromJSONObject$facebook_core_release(jSONObject);
    }

    public static final AccessToken createFromLegacyCache$facebook_core_release(Bundle bundle) {
        return Companion.createFromLegacyCache$facebook_core_release(bundle);
    }

    public static final void createFromNativeLinkingIntent(Intent intent, String str, AccessTokenCreationCallback accessTokenCreationCallback) {
        Companion.createFromNativeLinkingIntent(intent, str, accessTokenCreationCallback);
    }

    @SuppressLint({"FieldGetter"})
    public static final AccessToken createFromRefresh$facebook_core_release(AccessToken accessToken, Bundle bundle) {
        return Companion.createFromRefresh$facebook_core_release(accessToken, bundle);
    }

    public static final void expireCurrentAccessToken() {
        Companion.expireCurrentAccessToken();
    }

    public static final AccessToken getCurrentAccessToken() {
        return Companion.getCurrentAccessToken();
    }

    public static final List<String> getPermissionsFromBundle$facebook_core_release(Bundle bundle, String str) {
        return Companion.getPermissionsFromBundle$facebook_core_release(bundle, str);
    }

    public static final boolean isCurrentAccessTokenActive() {
        return Companion.isCurrentAccessTokenActive();
    }

    public static final boolean isDataAccessActive() {
        return Companion.isDataAccessActive();
    }

    public static final boolean isLoggedInWithInstagram() {
        return Companion.isLoggedInWithInstagram();
    }

    public static final void refreshCurrentAccessTokenAsync() {
        Companion.refreshCurrentAccessTokenAsync();
    }

    public static final void refreshCurrentAccessTokenAsync(AccessTokenRefreshCallback accessTokenRefreshCallback) {
        Companion.refreshCurrentAccessTokenAsync(accessTokenRefreshCallback);
    }

    public static final void setCurrentAccessToken(AccessToken accessToken) {
        Companion.setCurrentAccessToken(accessToken);
    }

    private final String tokenToString() {
        FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
        return FacebookSdk.isLoggingBehaviorEnabled(LoggingBehavior.INCLUDE_ACCESS_TOKENS) ? this.token : "ACCESS_TOKEN_REMOVED";
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccessToken)) {
            return false;
        }
        AccessToken accessToken = (AccessToken) obj;
        if (m.a(this.expires, accessToken.expires) && m.a(this.permissions, accessToken.permissions) && m.a(this.declinedPermissions, accessToken.declinedPermissions) && m.a(this.expiredPermissions, accessToken.expiredPermissions) && m.a(this.token, accessToken.token) && this.source == accessToken.source && m.a(this.lastRefresh, accessToken.lastRefresh) && m.a(this.applicationId, accessToken.applicationId) && m.a(this.userId, accessToken.userId) && m.a(this.dataAccessExpirationTime, accessToken.dataAccessExpirationTime)) {
            String str = this.graphDomain;
            String str2 = accessToken.graphDomain;
            if (str == null ? str2 == null : m.a(str, str2)) {
                return true;
            }
        }
        return false;
    }

    public final String getApplicationId() {
        return this.applicationId;
    }

    public final Date getDataAccessExpirationTime() {
        return this.dataAccessExpirationTime;
    }

    public final Set<String> getDeclinedPermissions() {
        return this.declinedPermissions;
    }

    public final Set<String> getExpiredPermissions() {
        return this.expiredPermissions;
    }

    public final Date getExpires() {
        return this.expires;
    }

    public final String getGraphDomain() {
        return this.graphDomain;
    }

    public final Date getLastRefresh() {
        return this.lastRefresh;
    }

    public final Set<String> getPermissions() {
        return this.permissions;
    }

    public final AccessTokenSource getSource() {
        return this.source;
    }

    public final String getToken() {
        return this.token;
    }

    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        int hashCode = (((((((((((((((((((527 + this.expires.hashCode()) * 31) + this.permissions.hashCode()) * 31) + this.declinedPermissions.hashCode()) * 31) + this.expiredPermissions.hashCode()) * 31) + this.token.hashCode()) * 31) + this.source.hashCode()) * 31) + this.lastRefresh.hashCode()) * 31) + this.applicationId.hashCode()) * 31) + this.userId.hashCode()) * 31) + this.dataAccessExpirationTime.hashCode()) * 31;
        String str = this.graphDomain;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final boolean isDataAccessExpired() {
        return new Date().after(this.dataAccessExpirationTime);
    }

    public final boolean isExpired() {
        return new Date().after(this.expires);
    }

    public final boolean isInstagramToken() {
        String str = this.graphDomain;
        return str != null && str.equals(FacebookSdk.INSTAGRAM);
    }

    public final JSONObject toJSONObject$facebook_core_release() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("version", 1);
        jSONObject.put(TOKEN_KEY, this.token);
        jSONObject.put(EXPIRES_AT_KEY, this.expires.getTime());
        jSONObject.put("permissions", new JSONArray(this.permissions));
        jSONObject.put(DECLINED_PERMISSIONS_KEY, new JSONArray(this.declinedPermissions));
        jSONObject.put(EXPIRED_PERMISSIONS_KEY, new JSONArray(this.expiredPermissions));
        jSONObject.put(LAST_REFRESH_KEY, this.lastRefresh.getTime());
        jSONObject.put("source", this.source.name());
        jSONObject.put(APPLICATION_ID_KEY, this.applicationId);
        jSONObject.put(USER_ID_KEY, this.userId);
        jSONObject.put(DATA_ACCESS_EXPIRATION_TIME, this.dataAccessExpirationTime.getTime());
        String str = this.graphDomain;
        if (str != null) {
            jSONObject.put("graph_domain", str);
        }
        return jSONObject;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{AccessToken");
        sb.append(" token:");
        sb.append(tokenToString());
        appendPermissions(sb);
        sb.append("}");
        String sb2 = sb.toString();
        m.e(sb2, "builder.toString()");
        return sb2;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        m.f(parcel, "dest");
        parcel.writeLong(this.expires.getTime());
        parcel.writeStringList(new ArrayList(this.permissions));
        parcel.writeStringList(new ArrayList(this.declinedPermissions));
        parcel.writeStringList(new ArrayList(this.expiredPermissions));
        parcel.writeString(this.token);
        parcel.writeString(this.source.name());
        parcel.writeLong(this.lastRefresh.getTime());
        parcel.writeString(this.applicationId);
        parcel.writeString(this.userId);
        parcel.writeLong(this.dataAccessExpirationTime.getTime());
        parcel.writeString(this.graphDomain);
    }

    public AccessToken(String str, String str2, String str3, Collection<String> collection, Collection<String> collection2, Collection<String> collection3, AccessTokenSource accessTokenSource, Date date, Date date2, Date date3, String str4) {
        HashSet hashSet;
        HashSet hashSet2;
        HashSet hashSet3;
        m.f(str, "accessToken");
        m.f(str2, "applicationId");
        m.f(str3, Constants.USER_ID);
        Validate validate = Validate.INSTANCE;
        Validate.notEmpty(str, "accessToken");
        Validate.notEmpty(str2, "applicationId");
        Validate.notEmpty(str3, Constants.USER_ID);
        this.expires = date == null ? DEFAULT_EXPIRATION_TIME : date;
        if (collection == null) {
            hashSet = new HashSet();
        }
        Set<String> unmodifiableSet = Collections.unmodifiableSet(hashSet);
        m.e(unmodifiableSet, "unmodifiableSet(if (permissions != null) HashSet(permissions) else HashSet())");
        this.permissions = unmodifiableSet;
        if (collection2 == null) {
            hashSet2 = new HashSet();
        }
        Set<String> unmodifiableSet2 = Collections.unmodifiableSet(hashSet2);
        m.e(unmodifiableSet2, "unmodifiableSet(\n            if (declinedPermissions != null) HashSet(declinedPermissions) else HashSet())");
        this.declinedPermissions = unmodifiableSet2;
        if (collection3 == null) {
            hashSet3 = new HashSet();
        }
        Set<String> unmodifiableSet3 = Collections.unmodifiableSet(hashSet3);
        m.e(unmodifiableSet3, "unmodifiableSet(\n            if (expiredPermissions != null) HashSet(expiredPermissions) else HashSet())");
        this.expiredPermissions = unmodifiableSet3;
        this.token = str;
        this.source = convertTokenSourceForGraphDomain(accessTokenSource == null ? DEFAULT_ACCESS_TOKEN_SOURCE : accessTokenSource, str4);
        this.lastRefresh = date2 == null ? DEFAULT_LAST_REFRESH_TIME : date2;
        this.applicationId = str2;
        this.userId = str3;
        this.dataAccessExpirationTime = (date3 == null || date3.getTime() == 0) ? DEFAULT_EXPIRATION_TIME : date3;
        this.graphDomain = str4 == null ? DEFAULT_GRAPH_DOMAIN : str4;
    }

    public AccessToken(Parcel parcel) {
        AccessTokenSource accessTokenSource;
        m.f(parcel, "parcel");
        this.expires = new Date(parcel.readLong());
        ArrayList arrayList = new ArrayList();
        parcel.readStringList(arrayList);
        Set<String> unmodifiableSet = Collections.unmodifiableSet(new HashSet(arrayList));
        m.e(unmodifiableSet, "unmodifiableSet(HashSet(permissionsList))");
        this.permissions = unmodifiableSet;
        arrayList.clear();
        parcel.readStringList(arrayList);
        Set<String> unmodifiableSet2 = Collections.unmodifiableSet(new HashSet(arrayList));
        m.e(unmodifiableSet2, "unmodifiableSet(HashSet(permissionsList))");
        this.declinedPermissions = unmodifiableSet2;
        arrayList.clear();
        parcel.readStringList(arrayList);
        Set<String> unmodifiableSet3 = Collections.unmodifiableSet(new HashSet(arrayList));
        m.e(unmodifiableSet3, "unmodifiableSet(HashSet(permissionsList))");
        this.expiredPermissions = unmodifiableSet3;
        String readString = parcel.readString();
        Validate validate = Validate.INSTANCE;
        this.token = Validate.notNullOrEmpty(readString, TOKEN_KEY);
        String readString2 = parcel.readString();
        if (readString2 != null) {
            accessTokenSource = AccessTokenSource.valueOf(readString2);
        } else {
            accessTokenSource = DEFAULT_ACCESS_TOKEN_SOURCE;
        }
        this.source = accessTokenSource;
        this.lastRefresh = new Date(parcel.readLong());
        this.applicationId = Validate.notNullOrEmpty(parcel.readString(), "applicationId");
        this.userId = Validate.notNullOrEmpty(parcel.readString(), Constants.USER_ID);
        this.dataAccessExpirationTime = new Date(parcel.readLong());
        this.graphDomain = parcel.readString();
    }
}
