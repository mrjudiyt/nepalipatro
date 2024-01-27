package com.facebook;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.facebook.AccessToken;
import com.facebook.GraphRequest;
import com.facebook.internal.AnalyticsEvents;
import com.facebook.internal.Utility;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;
import org.json.JSONArray;
import org.json.JSONObject;
import q0.a;

/* compiled from: AccessTokenManager.kt */
public final class AccessTokenManager {
    public static final String ACTION_CURRENT_ACCESS_TOKEN_CHANGED = "com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED";
    public static final Companion Companion = new Companion((g) null);
    public static final String EXTRA_NEW_ACCESS_TOKEN = "com.facebook.sdk.EXTRA_NEW_ACCESS_TOKEN";
    public static final String EXTRA_OLD_ACCESS_TOKEN = "com.facebook.sdk.EXTRA_OLD_ACCESS_TOKEN";
    private static final String ME_PERMISSIONS_GRAPH_PATH = "me/permissions";
    public static final String SHARED_PREFERENCES_NAME = "com.facebook.AccessTokenManager.SharedPreferences";
    public static final String TAG = "AccessTokenManager";
    private static final int TOKEN_EXTEND_RETRY_SECONDS = 3600;
    private static final int TOKEN_EXTEND_THRESHOLD_SECONDS = 86400;
    /* access modifiers changed from: private */
    public static AccessTokenManager instanceField;
    private final AccessTokenCache accessTokenCache;
    private AccessToken currentAccessTokenField;
    private Date lastAttemptedTokenExtendDate = new Date(0);
    private final a localBroadcastManager;
    private final AtomicBoolean tokenRefreshInProgress = new AtomicBoolean(false);

    /* compiled from: AccessTokenManager.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        /* access modifiers changed from: private */
        public final GraphRequest createExtendAccessTokenRequest(AccessToken accessToken, GraphRequest.Callback callback) {
            RefreshTokenInfo refreshTokenInfoForToken = getRefreshTokenInfoForToken(accessToken);
            Bundle bundle = new Bundle();
            bundle.putString("grant_type", refreshTokenInfoForToken.getGrantType());
            bundle.putString("client_id", accessToken.getApplicationId());
            bundle.putString(GraphRequest.FIELDS_PARAM, "access_token,expires_at,expires_in,data_access_expiration_time,graph_domain");
            GraphRequest newGraphPathRequest = GraphRequest.Companion.newGraphPathRequest(accessToken, refreshTokenInfoForToken.getGraphPath(), callback);
            newGraphPathRequest.setParameters(bundle);
            newGraphPathRequest.setHttpMethod(HttpMethod.GET);
            return newGraphPathRequest;
        }

        /* access modifiers changed from: private */
        public final GraphRequest createGrantedPermissionsRequest(AccessToken accessToken, GraphRequest.Callback callback) {
            Bundle bundle = new Bundle();
            bundle.putString(GraphRequest.FIELDS_PARAM, "permission,status");
            GraphRequest newGraphPathRequest = GraphRequest.Companion.newGraphPathRequest(accessToken, AccessTokenManager.ME_PERMISSIONS_GRAPH_PATH, callback);
            newGraphPathRequest.setParameters(bundle);
            newGraphPathRequest.setHttpMethod(HttpMethod.GET);
            return newGraphPathRequest;
        }

        private final RefreshTokenInfo getRefreshTokenInfoForToken(AccessToken accessToken) {
            String graphDomain = accessToken.getGraphDomain();
            if (graphDomain == null) {
                graphDomain = AccessToken.DEFAULT_GRAPH_DOMAIN;
            }
            if (m.a(graphDomain, FacebookSdk.INSTAGRAM)) {
                return new InstagramRefreshTokenInfo();
            }
            return new FacebookRefreshTokenInfo();
        }

        public final AccessTokenManager getInstance() {
            AccessTokenManager access$getInstanceField$cp;
            AccessTokenManager access$getInstanceField$cp2 = AccessTokenManager.instanceField;
            if (access$getInstanceField$cp2 != null) {
                return access$getInstanceField$cp2;
            }
            synchronized (this) {
                access$getInstanceField$cp = AccessTokenManager.instanceField;
                if (access$getInstanceField$cp == null) {
                    FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
                    a b10 = a.b(FacebookSdk.getApplicationContext());
                    m.e(b10, "getInstance(applicationContext)");
                    AccessTokenManager accessTokenManager = new AccessTokenManager(b10, new AccessTokenCache());
                    Companion companion = AccessTokenManager.Companion;
                    AccessTokenManager.instanceField = accessTokenManager;
                    access$getInstanceField$cp = accessTokenManager;
                }
            }
            return access$getInstanceField$cp;
        }
    }

    /* compiled from: AccessTokenManager.kt */
    public static final class FacebookRefreshTokenInfo implements RefreshTokenInfo {
        private final String grantType = "fb_extend_sso_token";
        private final String graphPath = "oauth/access_token";

        public String getGrantType() {
            return this.grantType;
        }

        public String getGraphPath() {
            return this.graphPath;
        }
    }

    /* compiled from: AccessTokenManager.kt */
    public static final class InstagramRefreshTokenInfo implements RefreshTokenInfo {
        private final String grantType = "ig_refresh_token";
        private final String graphPath = "refresh_access_token";

        public String getGrantType() {
            return this.grantType;
        }

        public String getGraphPath() {
            return this.graphPath;
        }
    }

    /* compiled from: AccessTokenManager.kt */
    private static final class RefreshResult {
        private String accessToken;
        private Long dataAccessExpirationTime;
        private int expiresAt;
        private int expiresIn;
        private String graphDomain;

        public final String getAccessToken() {
            return this.accessToken;
        }

        public final Long getDataAccessExpirationTime() {
            return this.dataAccessExpirationTime;
        }

        public final int getExpiresAt() {
            return this.expiresAt;
        }

        public final int getExpiresIn() {
            return this.expiresIn;
        }

        public final String getGraphDomain() {
            return this.graphDomain;
        }

        public final void setAccessToken(String str) {
            this.accessToken = str;
        }

        public final void setDataAccessExpirationTime(Long l10) {
            this.dataAccessExpirationTime = l10;
        }

        public final void setExpiresAt(int i10) {
            this.expiresAt = i10;
        }

        public final void setExpiresIn(int i10) {
            this.expiresIn = i10;
        }

        public final void setGraphDomain(String str) {
            this.graphDomain = str;
        }
    }

    /* compiled from: AccessTokenManager.kt */
    public interface RefreshTokenInfo {
        String getGrantType();

        String getGraphPath();
    }

    public AccessTokenManager(a aVar, AccessTokenCache accessTokenCache2) {
        m.f(aVar, "localBroadcastManager");
        m.f(accessTokenCache2, "accessTokenCache");
        this.localBroadcastManager = aVar;
        this.accessTokenCache = accessTokenCache2;
    }

    public static final AccessTokenManager getInstance() {
        return Companion.getInstance();
    }

    /* access modifiers changed from: private */
    /* renamed from: refreshCurrentAccessToken$lambda-0  reason: not valid java name */
    public static final void m0refreshCurrentAccessToken$lambda0(AccessTokenManager accessTokenManager, AccessToken.AccessTokenRefreshCallback accessTokenRefreshCallback) {
        m.f(accessTokenManager, "this$0");
        accessTokenManager.refreshCurrentAccessTokenImpl(accessTokenRefreshCallback);
    }

    private final void refreshCurrentAccessTokenImpl(AccessToken.AccessTokenRefreshCallback accessTokenRefreshCallback) {
        AccessToken currentAccessToken = getCurrentAccessToken();
        if (currentAccessToken == null) {
            if (accessTokenRefreshCallback != null) {
                accessTokenRefreshCallback.OnTokenRefreshFailed(new FacebookException("No current access token to refresh"));
            }
        } else if (this.tokenRefreshInProgress.compareAndSet(false, true)) {
            this.lastAttemptedTokenExtendDate = new Date();
            HashSet hashSet = new HashSet();
            HashSet hashSet2 = new HashSet();
            HashSet hashSet3 = new HashSet();
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            RefreshResult refreshResult = new RefreshResult();
            Companion companion = Companion;
            GraphRequestBatch graphRequestBatch = new GraphRequestBatch(companion.createGrantedPermissionsRequest(currentAccessToken, new b(atomicBoolean, hashSet, hashSet2, hashSet3)), companion.createExtendAccessTokenRequest(currentAccessToken, new a(refreshResult)));
            graphRequestBatch.addCallback(new c(refreshResult, currentAccessToken, accessTokenRefreshCallback, atomicBoolean, hashSet, hashSet2, hashSet3, this));
            graphRequestBatch.executeAsync();
        } else if (accessTokenRefreshCallback != null) {
            accessTokenRefreshCallback.OnTokenRefreshFailed(new FacebookException("Refresh already in progress"));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: refreshCurrentAccessTokenImpl$lambda-1  reason: not valid java name */
    public static final void m1refreshCurrentAccessTokenImpl$lambda1(AtomicBoolean atomicBoolean, Set set, Set set2, Set set3, GraphResponse graphResponse) {
        JSONArray optJSONArray;
        m.f(atomicBoolean, "$permissionsCallSucceeded");
        m.f(set, "$permissions");
        m.f(set2, "$declinedPermissions");
        m.f(set3, "$expiredPermissions");
        m.f(graphResponse, "response");
        JSONObject jsonObject = graphResponse.getJsonObject();
        if (jsonObject != null && (optJSONArray = jsonObject.optJSONArray("data")) != null) {
            atomicBoolean.set(true);
            int i10 = 0;
            int length = optJSONArray.length();
            if (length > 0) {
                while (true) {
                    int i11 = i10 + 1;
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i10);
                    if (optJSONObject != null) {
                        String optString = optJSONObject.optString("permission");
                        String optString2 = optJSONObject.optString(AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_STATUS);
                        Utility utility = Utility.INSTANCE;
                        if (!Utility.isNullOrEmpty(optString) && !Utility.isNullOrEmpty(optString2)) {
                            m.e(optString2, AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_STATUS);
                            Locale locale = Locale.US;
                            m.e(locale, "US");
                            String lowerCase = optString2.toLowerCase(locale);
                            m.e(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                            m.e(lowerCase, AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_STATUS);
                            int hashCode = lowerCase.hashCode();
                            if (hashCode != -1309235419) {
                                if (hashCode != 280295099) {
                                    if (hashCode == 568196142 && lowerCase.equals("declined")) {
                                        set2.add(optString);
                                    }
                                } else if (lowerCase.equals("granted")) {
                                    set.add(optString);
                                }
                            } else if (lowerCase.equals("expired")) {
                                set3.add(optString);
                            }
                            m.o("Unexpected status: ", lowerCase);
                        }
                    }
                    if (i11 < length) {
                        i10 = i11;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: refreshCurrentAccessTokenImpl$lambda-2  reason: not valid java name */
    public static final void m2refreshCurrentAccessTokenImpl$lambda2(RefreshResult refreshResult, GraphResponse graphResponse) {
        m.f(refreshResult, "$refreshResult");
        m.f(graphResponse, "response");
        JSONObject jsonObject = graphResponse.getJsonObject();
        if (jsonObject != null) {
            refreshResult.setAccessToken(jsonObject.optString("access_token"));
            refreshResult.setExpiresAt(jsonObject.optInt("expires_at"));
            refreshResult.setExpiresIn(jsonObject.optInt(AccessToken.EXPIRES_IN_KEY));
            refreshResult.setDataAccessExpirationTime(Long.valueOf(jsonObject.optLong(AccessToken.DATA_ACCESS_EXPIRATION_TIME)));
            refreshResult.setGraphDomain(jsonObject.optString("graph_domain", (String) null));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: refreshCurrentAccessTokenImpl$lambda-3  reason: not valid java name */
    public static final void m3refreshCurrentAccessTokenImpl$lambda3(RefreshResult refreshResult, AccessToken accessToken, AccessToken.AccessTokenRefreshCallback accessTokenRefreshCallback, AtomicBoolean atomicBoolean, Set set, Set set2, Set set3, AccessTokenManager accessTokenManager, GraphRequestBatch graphRequestBatch) {
        AccessToken accessToken2;
        Set<String> set4;
        Set<String> set5;
        Date date;
        AccessToken.AccessTokenRefreshCallback accessTokenRefreshCallback2 = accessTokenRefreshCallback;
        AccessTokenManager accessTokenManager2 = accessTokenManager;
        m.f(refreshResult, "$refreshResult");
        m.f(atomicBoolean, "$permissionsCallSucceeded");
        Set set6 = set;
        m.f(set6, "$permissions");
        Set set7 = set2;
        m.f(set7, "$declinedPermissions");
        Set set8 = set3;
        m.f(set8, "$expiredPermissions");
        m.f(accessTokenManager2, "this$0");
        m.f(graphRequestBatch, "it");
        String accessToken3 = refreshResult.getAccessToken();
        int expiresAt = refreshResult.getExpiresAt();
        Long dataAccessExpirationTime = refreshResult.getDataAccessExpirationTime();
        String graphDomain = refreshResult.getGraphDomain();
        try {
            Companion companion = Companion;
            if (companion.getInstance().getCurrentAccessToken() != null) {
                AccessToken currentAccessToken = companion.getInstance().getCurrentAccessToken();
                if ((currentAccessToken == null ? null : currentAccessToken.getUserId()) == accessToken.getUserId()) {
                    if (!atomicBoolean.get() && accessToken3 == null && expiresAt == 0) {
                        if (accessTokenRefreshCallback2 != null) {
                            accessTokenRefreshCallback2.OnTokenRefreshFailed(new FacebookException("Failed to refresh access token"));
                        }
                        accessTokenManager2.tokenRefreshInProgress.set(false);
                        return;
                    }
                    Date expires = accessToken.getExpires();
                    if (refreshResult.getExpiresAt() != 0) {
                        expires = new Date(((long) refreshResult.getExpiresAt()) * 1000);
                    } else if (refreshResult.getExpiresIn() != 0) {
                        expires = new Date((((long) refreshResult.getExpiresIn()) * 1000) + new Date().getTime());
                    }
                    Date date2 = expires;
                    if (accessToken3 == null) {
                        accessToken3 = accessToken.getToken();
                    }
                    String str = accessToken3;
                    String applicationId = accessToken.getApplicationId();
                    String userId = accessToken.getUserId();
                    Set<String> permissions = atomicBoolean.get() ? set6 : accessToken.getPermissions();
                    if (atomicBoolean.get()) {
                        set4 = set7;
                    } else {
                        set4 = accessToken.getDeclinedPermissions();
                    }
                    if (atomicBoolean.get()) {
                        set5 = set8;
                    } else {
                        set5 = accessToken.getExpiredPermissions();
                    }
                    AccessTokenSource source = accessToken.getSource();
                    Date date3 = new Date();
                    if (dataAccessExpirationTime != null) {
                        date = new Date(dataAccessExpirationTime.longValue() * 1000);
                    } else {
                        date = accessToken.getDataAccessExpirationTime();
                    }
                    Date date4 = date;
                    if (graphDomain == null) {
                        graphDomain = accessToken.getGraphDomain();
                    }
                    AccessToken accessToken4 = new AccessToken(str, applicationId, userId, permissions, set4, set5, source, date2, date3, date4, graphDomain);
                    try {
                        companion.getInstance().setCurrentAccessToken(accessToken4);
                        accessTokenManager2.tokenRefreshInProgress.set(false);
                        if (accessTokenRefreshCallback2 != null) {
                            accessTokenRefreshCallback2.OnTokenRefreshed(accessToken4);
                            return;
                        }
                        return;
                    } catch (Throwable th) {
                        th = th;
                        accessToken2 = accessToken4;
                        accessTokenManager2.tokenRefreshInProgress.set(false);
                        if (!(accessTokenRefreshCallback2 == null || accessToken2 == null)) {
                            accessTokenRefreshCallback2.OnTokenRefreshed(accessToken2);
                        }
                        throw th;
                    }
                }
            }
            if (accessTokenRefreshCallback2 != null) {
                accessTokenRefreshCallback2.OnTokenRefreshFailed(new FacebookException("No current access token to refresh"));
            }
            accessTokenManager2.tokenRefreshInProgress.set(false);
        } catch (Throwable th2) {
            th = th2;
            accessToken2 = null;
            accessTokenManager2.tokenRefreshInProgress.set(false);
            accessTokenRefreshCallback2.OnTokenRefreshed(accessToken2);
            throw th;
        }
    }

    private final void sendCurrentAccessTokenChangedBroadcastIntent(AccessToken accessToken, AccessToken accessToken2) {
        FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
        Intent intent = new Intent(FacebookSdk.getApplicationContext(), CurrentAccessTokenExpirationBroadcastReceiver.class);
        intent.setAction(ACTION_CURRENT_ACCESS_TOKEN_CHANGED);
        intent.putExtra(EXTRA_OLD_ACCESS_TOKEN, accessToken);
        intent.putExtra(EXTRA_NEW_ACCESS_TOKEN, accessToken2);
        this.localBroadcastManager.d(intent);
    }

    private final void setTokenExpirationBroadcastAlarm() {
        PendingIntent pendingIntent;
        FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
        Context applicationContext = FacebookSdk.getApplicationContext();
        AccessToken.Companion companion = AccessToken.Companion;
        AccessToken currentAccessToken = companion.getCurrentAccessToken();
        AlarmManager alarmManager = (AlarmManager) applicationContext.getSystemService("alarm");
        if (companion.isCurrentAccessTokenActive()) {
            if ((currentAccessToken == null ? null : currentAccessToken.getExpires()) != null && alarmManager != null) {
                Intent intent = new Intent(applicationContext, CurrentAccessTokenExpirationBroadcastReceiver.class);
                intent.setAction(ACTION_CURRENT_ACCESS_TOKEN_CHANGED);
                if (Build.VERSION.SDK_INT >= 23) {
                    pendingIntent = PendingIntent.getBroadcast(applicationContext, 0, intent, 67108864);
                } else {
                    pendingIntent = PendingIntent.getBroadcast(applicationContext, 0, intent, 0);
                }
                try {
                    alarmManager.set(1, currentAccessToken.getExpires().getTime(), pendingIntent);
                } catch (Exception unused) {
                }
            }
        }
    }

    private final boolean shouldExtendAccessToken() {
        AccessToken currentAccessToken = getCurrentAccessToken();
        if (currentAccessToken == null) {
            return false;
        }
        long time = new Date().getTime();
        if (!currentAccessToken.getSource().canExtendToken() || time - this.lastAttemptedTokenExtendDate.getTime() <= 3600000 || time - currentAccessToken.getLastRefresh().getTime() <= 86400000) {
            return false;
        }
        return true;
    }

    public final void currentAccessTokenChanged() {
        sendCurrentAccessTokenChangedBroadcastIntent(getCurrentAccessToken(), getCurrentAccessToken());
    }

    public final void extendAccessTokenIfNeeded() {
        if (shouldExtendAccessToken()) {
            refreshCurrentAccessToken((AccessToken.AccessTokenRefreshCallback) null);
        }
    }

    public final AccessToken getCurrentAccessToken() {
        return this.currentAccessTokenField;
    }

    public final boolean loadCurrentAccessToken() {
        AccessToken load = this.accessTokenCache.load();
        if (load == null) {
            return false;
        }
        setCurrentAccessToken(load, false);
        return true;
    }

    public final void refreshCurrentAccessToken(AccessToken.AccessTokenRefreshCallback accessTokenRefreshCallback) {
        if (m.a(Looper.getMainLooper(), Looper.myLooper())) {
            refreshCurrentAccessTokenImpl(accessTokenRefreshCallback);
        } else {
            new Handler(Looper.getMainLooper()).post(new d(this, accessTokenRefreshCallback));
        }
    }

    public final void setCurrentAccessToken(AccessToken accessToken) {
        setCurrentAccessToken(accessToken, true);
    }

    private final void setCurrentAccessToken(AccessToken accessToken, boolean z10) {
        AccessToken accessToken2 = this.currentAccessTokenField;
        this.currentAccessTokenField = accessToken;
        this.tokenRefreshInProgress.set(false);
        this.lastAttemptedTokenExtendDate = new Date(0);
        if (z10) {
            if (accessToken != null) {
                this.accessTokenCache.save(accessToken);
            } else {
                this.accessTokenCache.clear();
                Utility utility = Utility.INSTANCE;
                FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
                Utility.clearFacebookCookies(FacebookSdk.getApplicationContext());
            }
        }
        Utility utility2 = Utility.INSTANCE;
        if (!Utility.areObjectsEqual(accessToken2, accessToken)) {
            sendCurrentAccessTokenChangedBroadcastIntent(accessToken2, accessToken);
            setTokenExpirationBroadcastAlarm();
        }
    }
}
