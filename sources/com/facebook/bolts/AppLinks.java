package com.facebook.bolts;

import android.content.Intent;
import android.os.Bundle;
import kotlin.jvm.internal.m;

/* compiled from: AppLinks.kt */
public final class AppLinks {
    public static final AppLinks INSTANCE = new AppLinks();
    public static final String KEY_NAME_APPLINK_DATA = "al_applink_data";
    public static final String KEY_NAME_EXTRAS = "extras";

    private AppLinks() {
    }

    public static final Bundle getAppLinkData(Intent intent) {
        m.f(intent, "intent");
        return intent.getBundleExtra(KEY_NAME_APPLINK_DATA);
    }

    public static final Bundle getAppLinkExtras(Intent intent) {
        m.f(intent, "intent");
        Bundle appLinkData = getAppLinkData(intent);
        if (appLinkData == null) {
            return null;
        }
        return appLinkData.getBundle(KEY_NAME_EXTRAS);
    }
}
