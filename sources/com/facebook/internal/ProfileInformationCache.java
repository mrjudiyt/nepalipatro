package com.facebook.internal;

import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.m;
import org.json.JSONObject;

/* compiled from: ProfileInformationCache.kt */
public final class ProfileInformationCache {
    public static final ProfileInformationCache INSTANCE = new ProfileInformationCache();
    private static final ConcurrentHashMap<String, JSONObject> infoCache = new ConcurrentHashMap<>();

    private ProfileInformationCache() {
    }

    public static final JSONObject getProfileInformation(String str) {
        m.f(str, "accessToken");
        return infoCache.get(str);
    }

    public static final void putProfileInformation(String str, JSONObject jSONObject) {
        m.f(str, Constants.KEY);
        m.f(jSONObject, "value");
        infoCache.put(str, jSONObject);
    }
}
