package com.facebook.internal;

import com.android.installreferrer.api.InstallReferrerClient;
import com.facebook.FacebookSdk;
import kotlin.jvm.internal.m;

/* compiled from: InstallReferrerUtil.kt */
public final class InstallReferrerUtil {
    public static final InstallReferrerUtil INSTANCE = new InstallReferrerUtil();
    private static final String IS_REFERRER_UPDATED = "is_referrer_updated";

    /* compiled from: InstallReferrerUtil.kt */
    public interface Callback {
        void onReceiveReferrerUrl(String str);
    }

    private InstallReferrerUtil() {
    }

    private final boolean isUpdated() {
        FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
        return FacebookSdk.getApplicationContext().getSharedPreferences(FacebookSdk.APP_EVENT_PREFERENCES, 0).getBoolean(IS_REFERRER_UPDATED, false);
    }

    private final void tryConnectReferrerInfo(Callback callback) {
        FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
        InstallReferrerClient a10 = InstallReferrerClient.c(FacebookSdk.getApplicationContext()).a();
        try {
            a10.d(new InstallReferrerUtil$tryConnectReferrerInfo$installReferrerStateListener$1(a10, callback));
        } catch (Exception unused) {
        }
    }

    public static final void tryUpdateReferrerInfo(Callback callback) {
        m.f(callback, "callback");
        InstallReferrerUtil installReferrerUtil = INSTANCE;
        if (!installReferrerUtil.isUpdated()) {
            installReferrerUtil.tryConnectReferrerInfo(callback);
        }
    }

    /* access modifiers changed from: private */
    public final void updateReferrer() {
        FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
        FacebookSdk.getApplicationContext().getSharedPreferences(FacebookSdk.APP_EVENT_PREFERENCES, 0).edit().putBoolean(IS_REFERRER_UPDATED, true).apply();
    }
}
