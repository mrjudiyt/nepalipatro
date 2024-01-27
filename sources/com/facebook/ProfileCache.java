package com.facebook;

import android.content.SharedPreferences;
import com.google.android.gms.common.Scopes;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ProfileCache.kt */
public final class ProfileCache {
    public static final String CACHED_PROFILE_KEY = "com.facebook.ProfileManager.CachedProfile";
    public static final Companion Companion = new Companion((g) null);
    public static final String SHARED_PREFERENCES_NAME = "com.facebook.AccessTokenManager.SharedPreferences";
    private final SharedPreferences sharedPreferences;

    /* compiled from: ProfileCache.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }
    }

    public ProfileCache() {
        FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
        SharedPreferences sharedPreferences2 = FacebookSdk.getApplicationContext().getSharedPreferences("com.facebook.AccessTokenManager.SharedPreferences", 0);
        m.e(sharedPreferences2, "FacebookSdk.getApplicationContext()\n            .getSharedPreferences(SHARED_PREFERENCES_NAME, Context.MODE_PRIVATE)");
        this.sharedPreferences = sharedPreferences2;
    }

    public final void clear() {
        this.sharedPreferences.edit().remove(CACHED_PROFILE_KEY).apply();
    }

    public final Profile load() {
        String string = this.sharedPreferences.getString(CACHED_PROFILE_KEY, (String) null);
        if (string != null) {
            try {
                return new Profile(new JSONObject(string));
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    public final void save(Profile profile) {
        m.f(profile, Scopes.PROFILE);
        JSONObject jSONObject = profile.toJSONObject();
        if (jSONObject != null) {
            this.sharedPreferences.edit().putString(CACHED_PROFILE_KEY, jSONObject.toString()).apply();
        }
    }
}
