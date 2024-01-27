package com.facebook.appevents;

import android.content.Context;
import android.os.Bundle;
import com.facebook.AccessToken;
import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEventsLogger;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.Map;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;

/* compiled from: InternalAppEventsLogger.kt */
public final class InternalAppEventsLogger {
    public static final Companion Companion = new Companion((g) null);
    private final AppEventsLoggerImpl loggerImpl;

    /* compiled from: InternalAppEventsLogger.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public static /* synthetic */ InternalAppEventsLogger createInstance$default(Companion companion, Context context, String str, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                str = null;
            }
            return companion.createInstance(context, str);
        }

        public final InternalAppEventsLogger createInstance(Context context) {
            return createInstance$default(this, context, (String) null, 2, (Object) null);
        }

        public final InternalAppEventsLogger createInstance(Context context, String str) {
            return new InternalAppEventsLogger(context, str);
        }

        public final Executor getAnalyticsExecutor() {
            return AppEventsLoggerImpl.Companion.getAnalyticsExecutor();
        }

        public final AppEventsLogger.FlushBehavior getFlushBehavior() {
            return AppEventsLoggerImpl.Companion.getFlushBehavior();
        }

        public final String getPushNotificationsRegistrationId() {
            return AppEventsLoggerImpl.Companion.getPushNotificationsRegistrationId();
        }

        public final void setInternalUserData(Map<String, String> map) {
            m.f(map, "ud");
            UserDataStore userDataStore = UserDataStore.INSTANCE;
            UserDataStore.setInternalUd(map);
        }

        public final void setUserData(Bundle bundle) {
            UserDataStore userDataStore = UserDataStore.INSTANCE;
            UserDataStore.setUserDataAndHash(bundle);
        }

        public final InternalAppEventsLogger createInstance(String str, String str2, AccessToken accessToken) {
            m.f(str, "activityName");
            return new InternalAppEventsLogger(str, str2, accessToken);
        }
    }

    public InternalAppEventsLogger(AppEventsLoggerImpl appEventsLoggerImpl) {
        m.f(appEventsLoggerImpl, "loggerImpl");
        this.loggerImpl = appEventsLoggerImpl;
    }

    public static final InternalAppEventsLogger createInstance(Context context) {
        return Companion.createInstance(context);
    }

    public static final InternalAppEventsLogger createInstance(Context context, String str) {
        return Companion.createInstance(context, str);
    }

    public static final InternalAppEventsLogger createInstance(String str, String str2, AccessToken accessToken) {
        return Companion.createInstance(str, str2, accessToken);
    }

    public static final Executor getAnalyticsExecutor() {
        return Companion.getAnalyticsExecutor();
    }

    public static final AppEventsLogger.FlushBehavior getFlushBehavior() {
        return Companion.getFlushBehavior();
    }

    public static final String getPushNotificationsRegistrationId() {
        return Companion.getPushNotificationsRegistrationId();
    }

    public static final void setInternalUserData(Map<String, String> map) {
        Companion.setInternalUserData(map);
    }

    public static final void setUserData(Bundle bundle) {
        Companion.setUserData(bundle);
    }

    public final void flush() {
        this.loggerImpl.flush();
    }

    public final void logChangedSettingsEvent(Bundle bundle) {
        m.f(bundle, "parameters");
        if (!((bundle.getInt("previous") & 2) != 0)) {
            FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
            if (!FacebookSdk.getAutoLogAppEventsEnabled()) {
                return;
            }
        }
        this.loggerImpl.logEventImplicitly("fb_sdk_settings_changed", (Double) null, bundle);
    }

    public final void logEvent(String str, Bundle bundle) {
        FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
        if (FacebookSdk.getAutoLogAppEventsEnabled()) {
            this.loggerImpl.logEvent(str, bundle);
        }
    }

    public final void logEventFromSE(String str, String str2) {
        this.loggerImpl.logEventFromSE(str, str2);
    }

    public final void logEventImplicitly(String str, BigDecimal bigDecimal, Currency currency, Bundle bundle) {
        FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
        if (FacebookSdk.getAutoLogAppEventsEnabled()) {
            this.loggerImpl.logEventImplicitly(str, bigDecimal, currency, bundle);
        }
    }

    public final void logPurchaseImplicitly(BigDecimal bigDecimal, Currency currency, Bundle bundle) {
        FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
        if (FacebookSdk.getAutoLogAppEventsEnabled()) {
            this.loggerImpl.logPurchaseImplicitly(bigDecimal, currency, bundle);
        }
    }

    public InternalAppEventsLogger(Context context) {
        this(new AppEventsLoggerImpl(context, (String) null, (AccessToken) null));
    }

    public final void logEvent(String str, double d10, Bundle bundle) {
        FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
        if (FacebookSdk.getAutoLogAppEventsEnabled()) {
            this.loggerImpl.logEvent(str, d10, bundle);
        }
    }

    public final void logEventImplicitly(String str) {
        FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
        if (FacebookSdk.getAutoLogAppEventsEnabled()) {
            this.loggerImpl.logEventImplicitly(str, (Double) null, (Bundle) null);
        }
    }

    public InternalAppEventsLogger(Context context, String str) {
        this(new AppEventsLoggerImpl(context, str, (AccessToken) null));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public InternalAppEventsLogger(String str, String str2, AccessToken accessToken) {
        this(new AppEventsLoggerImpl(str, str2, accessToken));
        m.f(str, "activityName");
    }

    public final void logEventImplicitly(String str, Double d10, Bundle bundle) {
        FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
        if (FacebookSdk.getAutoLogAppEventsEnabled()) {
            this.loggerImpl.logEventImplicitly(str, d10, bundle);
        }
    }

    public final void logEventImplicitly(String str, Bundle bundle) {
        FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
        if (FacebookSdk.getAutoLogAppEventsEnabled()) {
            this.loggerImpl.logEventImplicitly(str, (Double) null, bundle);
        }
    }
}
