package com.facebook.appevents;

import com.facebook.internal.InstallReferrerUtil;

/* compiled from: AppEventsLoggerImpl.kt */
public final class AppEventsLoggerImpl$Companion$getInstallReferrer$1 implements InstallReferrerUtil.Callback {
    AppEventsLoggerImpl$Companion$getInstallReferrer$1() {
    }

    public void onReceiveReferrerUrl(String str) {
        AppEventsLoggerImpl.Companion.setInstallReferrer(str);
    }
}
