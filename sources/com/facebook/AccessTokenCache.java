package com.facebook;

import android.content.SharedPreferences;
import android.os.Bundle;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: AccessTokenCache.kt */
public final class AccessTokenCache {
    public static final String CACHED_ACCESS_TOKEN_KEY = "com.facebook.AccessTokenManager.CachedAccessToken";
    public static final Companion Companion = new Companion((g) null);
    private final SharedPreferences sharedPreferences;
    private final SharedPreferencesTokenCachingStrategyFactory tokenCachingStrategyFactory;
    private LegacyTokenHelper tokenCachingStrategyField;

    /* compiled from: AccessTokenCache.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }
    }

    /* compiled from: AccessTokenCache.kt */
    public static final class SharedPreferencesTokenCachingStrategyFactory {
        public final LegacyTokenHelper create() {
            FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
            return new LegacyTokenHelper(FacebookSdk.getApplicationContext(), (String) null, 2, (g) null);
        }
    }

    public AccessTokenCache(SharedPreferences sharedPreferences2, SharedPreferencesTokenCachingStrategyFactory sharedPreferencesTokenCachingStrategyFactory) {
        m.f(sharedPreferences2, "sharedPreferences");
        m.f(sharedPreferencesTokenCachingStrategyFactory, "tokenCachingStrategyFactory");
        this.sharedPreferences = sharedPreferences2;
        this.tokenCachingStrategyFactory = sharedPreferencesTokenCachingStrategyFactory;
    }

    private final AccessToken getCachedAccessToken() {
        String string = this.sharedPreferences.getString(CACHED_ACCESS_TOKEN_KEY, (String) null);
        if (string == null) {
            return null;
        }
        try {
            return AccessToken.Companion.createFromJSONObject$facebook_core_release(new JSONObject(string));
        } catch (JSONException unused) {
            return null;
        }
    }

    private final AccessToken getLegacyAccessToken() {
        Bundle load = getTokenCachingStrategy().load();
        if (load == null || !LegacyTokenHelper.Companion.hasTokenInformation(load)) {
            return null;
        }
        return AccessToken.Companion.createFromLegacyCache$facebook_core_release(load);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0031, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0032, code lost:
        com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(r0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0035, code lost:
        return null;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.facebook.LegacyTokenHelper getTokenCachingStrategy() {
        /*
            r3 = this;
            boolean r0 = com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(r3)
            r1 = 0
            if (r0 == 0) goto L_0x0008
            return r1
        L_0x0008:
            com.facebook.LegacyTokenHelper r0 = r3.tokenCachingStrategyField     // Catch:{ all -> 0x0031 }
            if (r0 != 0) goto L_0x0020
            monitor-enter(r3)     // Catch:{ all -> 0x0031 }
            com.facebook.LegacyTokenHelper r0 = r3.tokenCachingStrategyField     // Catch:{ all -> 0x001d }
            if (r0 != 0) goto L_0x0019
            com.facebook.AccessTokenCache$SharedPreferencesTokenCachingStrategyFactory r0 = r3.tokenCachingStrategyFactory     // Catch:{ all -> 0x001d }
            com.facebook.LegacyTokenHelper r0 = r0.create()     // Catch:{ all -> 0x001d }
            r3.tokenCachingStrategyField = r0     // Catch:{ all -> 0x001d }
        L_0x0019:
            o8.q r0 = o8.q.f16189a     // Catch:{ all -> 0x001d }
            monitor-exit(r3)     // Catch:{ all -> 0x0031 }
            goto L_0x0020
        L_0x001d:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0031 }
            throw r0     // Catch:{ all -> 0x0031 }
        L_0x0020:
            com.facebook.LegacyTokenHelper r0 = r3.tokenCachingStrategyField     // Catch:{ all -> 0x0031 }
            if (r0 == 0) goto L_0x0025
            return r0
        L_0x0025:
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0031 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0031 }
            r2.<init>(r0)     // Catch:{ all -> 0x0031 }
            throw r2     // Catch:{ all -> 0x0031 }
        L_0x0031:
            r0 = move-exception
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(r0, r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.AccessTokenCache.getTokenCachingStrategy():com.facebook.LegacyTokenHelper");
    }

    private final boolean hasCachedAccessToken() {
        return this.sharedPreferences.contains(CACHED_ACCESS_TOKEN_KEY);
    }

    private final boolean shouldCheckLegacyToken() {
        FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
        return FacebookSdk.isLegacyTokenUpgradeSupported();
    }

    public final void clear() {
        this.sharedPreferences.edit().remove(CACHED_ACCESS_TOKEN_KEY).apply();
        if (shouldCheckLegacyToken()) {
            getTokenCachingStrategy().clear();
        }
    }

    public final AccessToken load() {
        if (hasCachedAccessToken()) {
            return getCachedAccessToken();
        }
        if (!shouldCheckLegacyToken()) {
            return null;
        }
        AccessToken legacyAccessToken = getLegacyAccessToken();
        if (legacyAccessToken == null) {
            return legacyAccessToken;
        }
        save(legacyAccessToken);
        getTokenCachingStrategy().clear();
        return legacyAccessToken;
    }

    public final void save(AccessToken accessToken) {
        m.f(accessToken, "accessToken");
        try {
            this.sharedPreferences.edit().putString(CACHED_ACCESS_TOKEN_KEY, accessToken.toJSONObject$facebook_core_release().toString()).apply();
        } catch (JSONException unused) {
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AccessTokenCache() {
        /*
            r3 = this;
            com.facebook.FacebookSdk r0 = com.facebook.FacebookSdk.INSTANCE
            android.content.Context r0 = com.facebook.FacebookSdk.getApplicationContext()
            java.lang.String r1 = "com.facebook.AccessTokenManager.SharedPreferences"
            r2 = 0
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r1, r2)
            java.lang.String r1 = "FacebookSdk.getApplicationContext()\n              .getSharedPreferences(\n                  AccessTokenManager.SHARED_PREFERENCES_NAME, Context.MODE_PRIVATE)"
            kotlin.jvm.internal.m.e(r0, r1)
            com.facebook.AccessTokenCache$SharedPreferencesTokenCachingStrategyFactory r1 = new com.facebook.AccessTokenCache$SharedPreferencesTokenCachingStrategyFactory
            r1.<init>()
            r3.<init>(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.AccessTokenCache.<init>():void");
    }
}
