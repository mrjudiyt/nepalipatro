package com.facebook.appevents;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.webkit.WebView;
import com.facebook.AccessToken;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.LoggingBehavior;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.appevents.internal.ActivityLifecycleTracker;
import com.facebook.appevents.internal.AutomaticAnalyticsLogger;
import com.facebook.appevents.internal.Constants;
import com.facebook.appevents.ondeviceprocessing.OnDeviceProcessingManager;
import com.facebook.internal.AnalyticsEvents;
import com.facebook.internal.FeatureManager;
import com.facebook.internal.FetchedAppGateKeepersManager;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.InstallReferrerUtil;
import com.facebook.internal.Logger;
import com.facebook.internal.Utility;
import com.facebook.internal.Validate;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;
import o8.q;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: AppEventsLoggerImpl.kt */
public final class AppEventsLoggerImpl {
    private static final String ACCOUNT_KIT_EVENT_NAME_PREFIX = "fb_ak";
    private static final String APP_EVENTS_KILLSWITCH = "app_events_killswitch";
    private static final String APP_EVENT_NAME_PUSH_OPENED = "fb_mobile_push_opened";
    private static final String APP_EVENT_PREFERENCES = "com.facebook.sdk.appEventPreferences";
    private static final String APP_EVENT_PUSH_PARAMETER_ACTION = "fb_push_action";
    private static final String APP_EVENT_PUSH_PARAMETER_CAMPAIGN = "fb_push_campaign";
    private static final int APP_SUPPORTS_ATTRIBUTION_ID_RECHECK_PERIOD_IN_SECONDS = 86400;
    public static final Companion Companion = new Companion((g) null);
    private static final String PUSH_PAYLOAD_CAMPAIGN_KEY = "campaign";
    private static final String PUSH_PAYLOAD_KEY = "fb_push_payload";
    private static final String TAG;
    private static String anonymousAppDeviceGUID;
    private static ScheduledThreadPoolExecutor backgroundExecutor;
    private static AppEventsLogger.FlushBehavior flushBehaviorField = AppEventsLogger.FlushBehavior.AUTO;
    private static boolean isActivateAppEventRequested;
    private static String pushNotificationsRegistrationIdField;
    private static final Object staticLock = new Object();
    private AccessTokenAppIdPair accessTokenAppId;
    private final String contextName;

    /* compiled from: AppEventsLoggerImpl.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        /* access modifiers changed from: private */
        /* renamed from: initializeLib$lambda-4  reason: not valid java name */
        public static final void m31initializeLib$lambda4(Context context, AppEventsLoggerImpl appEventsLoggerImpl) {
            m.f(context, "$context");
            m.f(appEventsLoggerImpl, "$logger");
            Bundle bundle = new Bundle();
            String[] strArr = {"com.facebook.core.Core", "com.facebook.login.Login", "com.facebook.share.Share", "com.facebook.places.Places", "com.facebook.messenger.Messenger", "com.facebook.applinks.AppLinks", "com.facebook.marketing.Marketing", "com.facebook.gamingservices.GamingServices", "com.facebook.all.All", "com.android.billingclient.api.BillingClient", "com.android.vending.billing.IInAppBillingService"};
            String[] strArr2 = {"core_lib_included", "login_lib_included", "share_lib_included", "places_lib_included", "messenger_lib_included", "applinks_lib_included", "marketing_lib_included", "gamingservices_lib_included", "all_lib_included", "billing_client_lib_included", "billing_service_lib_included"};
            int i10 = 0;
            int i11 = 0;
            while (true) {
                int i12 = i10 + 1;
                String str = strArr[i10];
                String str2 = strArr2[i10];
                try {
                    Class.forName(str);
                    bundle.putInt(str2, 1);
                    i11 |= 1 << i10;
                } catch (ClassNotFoundException unused) {
                }
                if (i12 > 10) {
                    break;
                }
                i10 = i12;
            }
            SharedPreferences sharedPreferences = context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0);
            if (sharedPreferences.getInt("kitsBitmask", 0) != i11) {
                sharedPreferences.edit().putInt("kitsBitmask", i11).apply();
                appEventsLoggerImpl.logEventImplicitly(AnalyticsEvents.EVENT_SDK_INITIALIZE, (Double) null, bundle);
            }
        }

        /* access modifiers changed from: private */
        /* JADX WARNING: Code restructure failed: missing block: B:10:0x001b, code lost:
            r3 = com.facebook.appevents.j.f5990h;
            r2 = com.facebook.appevents.AppEventsLoggerImpl.access$getBackgroundExecutor$cp();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0021, code lost:
            if (r2 == null) goto L_0x002e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0023, code lost:
            r2.scheduleAtFixedRate(r3, 0, 86400, java.util.concurrent.TimeUnit.SECONDS);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x002d, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0039, code lost:
            throw new java.lang.IllegalStateException("Required value was null.".toString());
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void initializeTimersIfNeeded() {
            /*
                r9 = this;
                java.lang.Object r0 = com.facebook.appevents.AppEventsLoggerImpl.access$getStaticLock$cp()
                monitor-enter(r0)
                java.util.concurrent.ScheduledThreadPoolExecutor r1 = com.facebook.appevents.AppEventsLoggerImpl.access$getBackgroundExecutor$cp()     // Catch:{ all -> 0x003a }
                if (r1 == 0) goto L_0x000d
                monitor-exit(r0)
                return
            L_0x000d:
                com.facebook.appevents.AppEventsLoggerImpl$Companion r1 = com.facebook.appevents.AppEventsLoggerImpl.Companion     // Catch:{ all -> 0x003a }
                java.util.concurrent.ScheduledThreadPoolExecutor r1 = new java.util.concurrent.ScheduledThreadPoolExecutor     // Catch:{ all -> 0x003a }
                r2 = 1
                r1.<init>(r2)     // Catch:{ all -> 0x003a }
                com.facebook.appevents.AppEventsLoggerImpl.access$setBackgroundExecutor$cp(r1)     // Catch:{ all -> 0x003a }
                o8.q r1 = o8.q.f16189a     // Catch:{ all -> 0x003a }
                monitor-exit(r0)
                com.facebook.appevents.j r3 = com.facebook.appevents.j.f5990h
                java.util.concurrent.ScheduledThreadPoolExecutor r2 = com.facebook.appevents.AppEventsLoggerImpl.access$getBackgroundExecutor$cp()
                if (r2 == 0) goto L_0x002e
                r4 = 0
                r6 = 86400(0x15180, double:4.26873E-319)
                java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.SECONDS
                r2.scheduleAtFixedRate(r3, r4, r6, r8)
                return
            L_0x002e:
                java.lang.String r0 = "Required value was null."
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r0 = r0.toString()
                r1.<init>(r0)
                throw r1
            L_0x003a:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.appevents.AppEventsLoggerImpl.Companion.initializeTimersIfNeeded():void");
        }

        /* access modifiers changed from: private */
        /* renamed from: initializeTimersIfNeeded$lambda-6  reason: not valid java name */
        public static final void m32initializeTimersIfNeeded$lambda6() {
            HashSet<String> hashSet = new HashSet<>();
            AppEventQueue appEventQueue = AppEventQueue.INSTANCE;
            for (AccessTokenAppIdPair applicationId : AppEventQueue.getKeySet()) {
                hashSet.add(applicationId.getApplicationId());
            }
            for (String queryAppSettings : hashSet) {
                FetchedAppSettingsManager fetchedAppSettingsManager = FetchedAppSettingsManager.INSTANCE;
                FetchedAppSettingsManager.queryAppSettings(queryAppSettings, true);
            }
        }

        /* access modifiers changed from: private */
        public final void logEvent(AppEvent appEvent, AccessTokenAppIdPair accessTokenAppIdPair) {
            AppEventQueue appEventQueue = AppEventQueue.INSTANCE;
            AppEventQueue.add(accessTokenAppIdPair, appEvent);
            FeatureManager featureManager = FeatureManager.INSTANCE;
            if (FeatureManager.isEnabled(FeatureManager.Feature.OnDevicePostInstallEventProcessing)) {
                OnDeviceProcessingManager onDeviceProcessingManager = OnDeviceProcessingManager.INSTANCE;
                if (OnDeviceProcessingManager.isOnDeviceProcessingEnabled()) {
                    OnDeviceProcessingManager.sendCustomEventAsync(accessTokenAppIdPair.getApplicationId(), appEvent);
                }
            }
            if (!appEvent.getIsImplicit() && !AppEventsLoggerImpl.access$isActivateAppEventRequested$cp()) {
                if (m.a(appEvent.getName(), AppEventsConstants.EVENT_NAME_ACTIVATED_APP)) {
                    AppEventsLoggerImpl.access$setActivateAppEventRequested$cp(true);
                } else {
                    Logger.Companion.log(LoggingBehavior.APP_EVENTS, "AppEvents", "Warning: Please call AppEventsLogger.activateApp(...)from the long-lived activity's onResume() methodbefore logging other app events.");
                }
            }
        }

        /* access modifiers changed from: private */
        public final void notifyDeveloperError(String str) {
            Logger.Companion.log(LoggingBehavior.DEVELOPER_ERRORS, "AppEvents", str);
        }

        public final void activateApp(Application application, String str) {
            m.f(application, "application");
            FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
            if (FacebookSdk.isInitialized()) {
                AnalyticsUserIDStore analyticsUserIDStore = AnalyticsUserIDStore.INSTANCE;
                AnalyticsUserIDStore.initStore();
                UserDataStore userDataStore = UserDataStore.INSTANCE;
                UserDataStore.initStore();
                if (str == null) {
                    str = FacebookSdk.getApplicationId();
                }
                FacebookSdk.publishInstallAsync(application, str);
                ActivityLifecycleTracker activityLifecycleTracker = ActivityLifecycleTracker.INSTANCE;
                ActivityLifecycleTracker.startTracking(application, str);
                return;
            }
            throw new FacebookException("The Facebook sdk must be initialized before calling activateApp");
        }

        public final void augmentWebView(WebView webView, Context context) {
            m.f(webView, "webView");
            String str = Build.VERSION.RELEASE;
            m.e(str, "RELEASE");
            List c02 = q.c0(str, new String[]{"."}, false, 0, 6, (Object) null);
            int i10 = 0;
            Object[] array = c02.toArray(new String[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            String[] strArr = (String[]) array;
            int parseInt = (strArr.length == 0) ^ true ? Integer.parseInt(strArr[0]) : 0;
            if (strArr.length > 1) {
                i10 = Integer.parseInt(strArr[1]);
            }
            if (Build.VERSION.SDK_INT < 17 || parseInt < 4 || (parseInt == 4 && i10 <= 1)) {
                Logger.Companion.log(LoggingBehavior.DEVELOPER_ERRORS, AppEventsLoggerImpl.access$getTAG$cp(), "augmentWebView is only available for Android SDK version >= 17 on devices running Android >= 4.2");
                return;
            }
            FacebookSDKJSInterface facebookSDKJSInterface = new FacebookSDKJSInterface(context);
            FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
            webView.addJavascriptInterface(facebookSDKJSInterface, m.o("fbmq_", FacebookSdk.getApplicationId()));
        }

        public final void eagerFlush() {
            if (getFlushBehavior() != AppEventsLogger.FlushBehavior.EXPLICIT_ONLY) {
                AppEventQueue appEventQueue = AppEventQueue.INSTANCE;
                AppEventQueue.flush(FlushReason.EAGER_FLUSHING_EVENT);
            }
        }

        public final void functionDEPRECATED(String str) {
            m.f(str, "extraMsg");
            AppEventsLoggerImpl.access$getTAG$cp();
            m.o("This function is deprecated. ", str);
        }

        public final Executor getAnalyticsExecutor() {
            if (AppEventsLoggerImpl.access$getBackgroundExecutor$cp() == null) {
                initializeTimersIfNeeded();
            }
            ScheduledThreadPoolExecutor access$getBackgroundExecutor$cp = AppEventsLoggerImpl.access$getBackgroundExecutor$cp();
            if (access$getBackgroundExecutor$cp != null) {
                return access$getBackgroundExecutor$cp;
            }
            throw new IllegalStateException("Required value was null.".toString());
        }

        public final String getAnonymousAppDeviceGUID(Context context) {
            m.f(context, "context");
            if (AppEventsLoggerImpl.access$getAnonymousAppDeviceGUID$cp() == null) {
                synchronized (AppEventsLoggerImpl.access$getStaticLock$cp()) {
                    if (AppEventsLoggerImpl.access$getAnonymousAppDeviceGUID$cp() == null) {
                        SharedPreferences sharedPreferences = context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0);
                        Companion companion = AppEventsLoggerImpl.Companion;
                        AppEventsLoggerImpl.access$setAnonymousAppDeviceGUID$cp(sharedPreferences.getString("anonymousAppDeviceGUID", (String) null));
                        if (AppEventsLoggerImpl.access$getAnonymousAppDeviceGUID$cp() == null) {
                            UUID randomUUID = UUID.randomUUID();
                            m.e(randomUUID, "randomUUID()");
                            AppEventsLoggerImpl.access$setAnonymousAppDeviceGUID$cp(m.o("XZ", randomUUID));
                            context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).edit().putString("anonymousAppDeviceGUID", AppEventsLoggerImpl.access$getAnonymousAppDeviceGUID$cp()).apply();
                        }
                    }
                    q qVar = q.f16189a;
                }
            }
            String access$getAnonymousAppDeviceGUID$cp = AppEventsLoggerImpl.access$getAnonymousAppDeviceGUID$cp();
            if (access$getAnonymousAppDeviceGUID$cp != null) {
                return access$getAnonymousAppDeviceGUID$cp;
            }
            throw new IllegalStateException("Required value was null.".toString());
        }

        public final AppEventsLogger.FlushBehavior getFlushBehavior() {
            AppEventsLogger.FlushBehavior access$getFlushBehaviorField$cp;
            synchronized (AppEventsLoggerImpl.access$getStaticLock$cp()) {
                access$getFlushBehaviorField$cp = AppEventsLoggerImpl.access$getFlushBehaviorField$cp();
            }
            return access$getFlushBehaviorField$cp;
        }

        public final String getInstallReferrer() {
            InstallReferrerUtil installReferrerUtil = InstallReferrerUtil.INSTANCE;
            InstallReferrerUtil.tryUpdateReferrerInfo(new AppEventsLoggerImpl$Companion$getInstallReferrer$1());
            FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
            return FacebookSdk.getApplicationContext().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getString("install_referrer", (String) null);
        }

        public final String getPushNotificationsRegistrationId() {
            String access$getPushNotificationsRegistrationIdField$cp;
            synchronized (AppEventsLoggerImpl.access$getStaticLock$cp()) {
                access$getPushNotificationsRegistrationIdField$cp = AppEventsLoggerImpl.access$getPushNotificationsRegistrationIdField$cp();
            }
            return access$getPushNotificationsRegistrationIdField$cp;
        }

        public final void initializeLib(Context context, String str) {
            m.f(context, "context");
            FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
            if (FacebookSdk.getAutoLogAppEventsEnabled()) {
                AppEventsLoggerImpl appEventsLoggerImpl = new AppEventsLoggerImpl(context, str, (AccessToken) null);
                ScheduledThreadPoolExecutor access$getBackgroundExecutor$cp = AppEventsLoggerImpl.access$getBackgroundExecutor$cp();
                if (access$getBackgroundExecutor$cp != null) {
                    access$getBackgroundExecutor$cp.execute(new i(context, appEventsLoggerImpl));
                    return;
                }
                throw new IllegalStateException("Required value was null.".toString());
            }
        }

        public final void onContextStop() {
            AppEventQueue appEventQueue = AppEventQueue.INSTANCE;
            AppEventQueue.persistToDisk();
        }

        public final void setFlushBehavior(AppEventsLogger.FlushBehavior flushBehavior) {
            m.f(flushBehavior, "flushBehavior");
            synchronized (AppEventsLoggerImpl.access$getStaticLock$cp()) {
                Companion companion = AppEventsLoggerImpl.Companion;
                AppEventsLoggerImpl.access$setFlushBehaviorField$cp(flushBehavior);
                q qVar = q.f16189a;
            }
        }

        public final void setInstallReferrer(String str) {
            FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
            SharedPreferences sharedPreferences = FacebookSdk.getApplicationContext().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0);
            if (str != null) {
                sharedPreferences.edit().putString("install_referrer", str).apply();
            }
        }

        public final void setPushNotificationsRegistrationId(String str) {
            synchronized (AppEventsLoggerImpl.access$getStaticLock$cp()) {
                Utility utility = Utility.INSTANCE;
                if (!Utility.stringsEqualOrEmpty(AppEventsLoggerImpl.access$getPushNotificationsRegistrationIdField$cp(), str)) {
                    Companion companion = AppEventsLoggerImpl.Companion;
                    AppEventsLoggerImpl.access$setPushNotificationsRegistrationIdField$cp(str);
                    FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
                    AppEventsLoggerImpl appEventsLoggerImpl = new AppEventsLoggerImpl(FacebookSdk.getApplicationContext(), (String) null, (AccessToken) null);
                    appEventsLoggerImpl.logEvent(AppEventsConstants.EVENT_NAME_PUSH_TOKEN_OBTAINED);
                    if (companion.getFlushBehavior() != AppEventsLogger.FlushBehavior.EXPLICIT_ONLY) {
                        appEventsLoggerImpl.flush();
                    }
                }
                q qVar = q.f16189a;
            }
        }
    }

    static {
        String canonicalName = AppEventsLoggerImpl.class.getCanonicalName();
        if (canonicalName == null) {
            canonicalName = "com.facebook.appevents.AppEventsLoggerImpl";
        }
        TAG = canonicalName;
    }

    public AppEventsLoggerImpl(String str, String str2, AccessToken accessToken) {
        m.f(str, "activityName");
        Validate validate = Validate.INSTANCE;
        Validate.sdkInitialized();
        this.contextName = str;
        accessToken = accessToken == null ? AccessToken.Companion.getCurrentAccessToken() : accessToken;
        if (accessToken == null || accessToken.isExpired() || (str2 != null && !m.a(str2, accessToken.getApplicationId()))) {
            if (str2 == null) {
                Utility utility = Utility.INSTANCE;
                FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
                str2 = Utility.getMetadataApplicationId(FacebookSdk.getApplicationContext());
            }
            if (str2 != null) {
                this.accessTokenAppId = new AccessTokenAppIdPair((String) null, str2);
            } else {
                throw new IllegalStateException("Required value was null.".toString());
            }
        } else {
            this.accessTokenAppId = new AccessTokenAppIdPair(accessToken);
        }
        Companion.initializeTimersIfNeeded();
    }

    public static final /* synthetic */ String access$getAnonymousAppDeviceGUID$cp() {
        Class<AppEventsLoggerImpl> cls = AppEventsLoggerImpl.class;
        if (CrashShieldHandler.isObjectCrashing(cls)) {
            return null;
        }
        try {
            return anonymousAppDeviceGUID;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, cls);
            return null;
        }
    }

    public static final /* synthetic */ ScheduledThreadPoolExecutor access$getBackgroundExecutor$cp() {
        Class<AppEventsLoggerImpl> cls = AppEventsLoggerImpl.class;
        if (CrashShieldHandler.isObjectCrashing(cls)) {
            return null;
        }
        try {
            return backgroundExecutor;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, cls);
            return null;
        }
    }

    public static final /* synthetic */ AppEventsLogger.FlushBehavior access$getFlushBehaviorField$cp() {
        Class<AppEventsLoggerImpl> cls = AppEventsLoggerImpl.class;
        if (CrashShieldHandler.isObjectCrashing(cls)) {
            return null;
        }
        try {
            return flushBehaviorField;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, cls);
            return null;
        }
    }

    public static final /* synthetic */ String access$getPushNotificationsRegistrationIdField$cp() {
        Class<AppEventsLoggerImpl> cls = AppEventsLoggerImpl.class;
        if (CrashShieldHandler.isObjectCrashing(cls)) {
            return null;
        }
        try {
            return pushNotificationsRegistrationIdField;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, cls);
            return null;
        }
    }

    public static final /* synthetic */ Object access$getStaticLock$cp() {
        Class<AppEventsLoggerImpl> cls = AppEventsLoggerImpl.class;
        if (CrashShieldHandler.isObjectCrashing(cls)) {
            return null;
        }
        try {
            return staticLock;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, cls);
            return null;
        }
    }

    public static final /* synthetic */ String access$getTAG$cp() {
        Class<AppEventsLoggerImpl> cls = AppEventsLoggerImpl.class;
        if (CrashShieldHandler.isObjectCrashing(cls)) {
            return null;
        }
        try {
            return TAG;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, cls);
            return null;
        }
    }

    public static final /* synthetic */ boolean access$isActivateAppEventRequested$cp() {
        Class<AppEventsLoggerImpl> cls = AppEventsLoggerImpl.class;
        if (CrashShieldHandler.isObjectCrashing(cls)) {
            return false;
        }
        try {
            return isActivateAppEventRequested;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, cls);
            return false;
        }
    }

    public static final /* synthetic */ void access$setActivateAppEventRequested$cp(boolean z10) {
        Class<AppEventsLoggerImpl> cls = AppEventsLoggerImpl.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            try {
                isActivateAppEventRequested = z10;
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }

    public static final /* synthetic */ void access$setAnonymousAppDeviceGUID$cp(String str) {
        Class<AppEventsLoggerImpl> cls = AppEventsLoggerImpl.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            try {
                anonymousAppDeviceGUID = str;
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }

    public static final /* synthetic */ void access$setBackgroundExecutor$cp(ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        Class<AppEventsLoggerImpl> cls = AppEventsLoggerImpl.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            try {
                backgroundExecutor = scheduledThreadPoolExecutor;
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }

    public static final /* synthetic */ void access$setFlushBehaviorField$cp(AppEventsLogger.FlushBehavior flushBehavior) {
        Class<AppEventsLoggerImpl> cls = AppEventsLoggerImpl.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            try {
                flushBehaviorField = flushBehavior;
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }

    public static final /* synthetic */ void access$setPushNotificationsRegistrationIdField$cp(String str) {
        Class<AppEventsLoggerImpl> cls = AppEventsLoggerImpl.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            try {
                pushNotificationsRegistrationIdField = str;
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }

    public static final void activateApp(Application application, String str) {
        Class<AppEventsLoggerImpl> cls = AppEventsLoggerImpl.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            try {
                Companion.activateApp(application, str);
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }

    public static final void augmentWebView(WebView webView, Context context) {
        Class<AppEventsLoggerImpl> cls = AppEventsLoggerImpl.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            try {
                Companion.augmentWebView(webView, context);
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }

    public static final void functionDEPRECATED(String str) {
        Class<AppEventsLoggerImpl> cls = AppEventsLoggerImpl.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            try {
                Companion.functionDEPRECATED(str);
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }

    public static final Executor getAnalyticsExecutor() {
        Class<AppEventsLoggerImpl> cls = AppEventsLoggerImpl.class;
        if (CrashShieldHandler.isObjectCrashing(cls)) {
            return null;
        }
        try {
            return Companion.getAnalyticsExecutor();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, cls);
            return null;
        }
    }

    public static final String getAnonymousAppDeviceGUID(Context context) {
        Class<AppEventsLoggerImpl> cls = AppEventsLoggerImpl.class;
        if (CrashShieldHandler.isObjectCrashing(cls)) {
            return null;
        }
        try {
            return Companion.getAnonymousAppDeviceGUID(context);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, cls);
            return null;
        }
    }

    public static final AppEventsLogger.FlushBehavior getFlushBehavior() {
        Class<AppEventsLoggerImpl> cls = AppEventsLoggerImpl.class;
        if (CrashShieldHandler.isObjectCrashing(cls)) {
            return null;
        }
        try {
            return Companion.getFlushBehavior();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, cls);
            return null;
        }
    }

    public static final String getInstallReferrer() {
        Class<AppEventsLoggerImpl> cls = AppEventsLoggerImpl.class;
        if (CrashShieldHandler.isObjectCrashing(cls)) {
            return null;
        }
        try {
            return Companion.getInstallReferrer();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, cls);
            return null;
        }
    }

    public static final String getPushNotificationsRegistrationId() {
        Class<AppEventsLoggerImpl> cls = AppEventsLoggerImpl.class;
        if (CrashShieldHandler.isObjectCrashing(cls)) {
            return null;
        }
        try {
            return Companion.getPushNotificationsRegistrationId();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, cls);
            return null;
        }
    }

    public static final void initializeLib(Context context, String str) {
        Class<AppEventsLoggerImpl> cls = AppEventsLoggerImpl.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            try {
                Companion.initializeLib(context, str);
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }

    public static /* synthetic */ void logEvent$default(AppEventsLoggerImpl appEventsLoggerImpl, String str, Bundle bundle, int i10, Object obj) {
        Class<AppEventsLoggerImpl> cls = AppEventsLoggerImpl.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            if ((i10 & 2) != 0) {
                bundle = null;
            }
            try {
                appEventsLoggerImpl.logEvent(str, bundle);
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }

    public static /* synthetic */ void logPurchase$default(AppEventsLoggerImpl appEventsLoggerImpl, BigDecimal bigDecimal, Currency currency, Bundle bundle, int i10, Object obj) {
        Class<AppEventsLoggerImpl> cls = AppEventsLoggerImpl.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            if ((i10 & 4) != 0) {
                bundle = null;
            }
            try {
                appEventsLoggerImpl.logPurchase(bigDecimal, currency, bundle);
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }

    public static final void onContextStop() {
        Class<AppEventsLoggerImpl> cls = AppEventsLoggerImpl.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            try {
                Companion.onContextStop();
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }

    public static final void setFlushBehavior(AppEventsLogger.FlushBehavior flushBehavior) {
        Class<AppEventsLoggerImpl> cls = AppEventsLoggerImpl.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            try {
                Companion.setFlushBehavior(flushBehavior);
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }

    public static final void setInstallReferrer(String str) {
        Class<AppEventsLoggerImpl> cls = AppEventsLoggerImpl.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            try {
                Companion.setInstallReferrer(str);
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }

    public static final void setPushNotificationsRegistrationId(String str) {
        Class<AppEventsLoggerImpl> cls = AppEventsLoggerImpl.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            try {
                Companion.setPushNotificationsRegistrationId(str);
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }

    public final void flush() {
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                AppEventQueue appEventQueue = AppEventQueue.INSTANCE;
                AppEventQueue.flush(FlushReason.EXPLICIT);
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    public final String getApplicationId() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            return this.accessTokenAppId.getApplicationId();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    public final boolean isValidForAccessToken(AccessToken accessToken) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return false;
        }
        try {
            m.f(accessToken, "accessToken");
            return m.a(this.accessTokenAppId, new AccessTokenAppIdPair(accessToken));
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return false;
        }
    }

    public final void logEvent(String str) {
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                logEvent(str, (Bundle) null);
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    public final void logEventFromSE(String str, String str2) {
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                Bundle bundle = new Bundle();
                bundle.putString("_is_suggested_event", AppEventsConstants.EVENT_PARAM_VALUE_YES);
                bundle.putString("_button_text", str2);
                logEvent(str, bundle);
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    public final void logEventImplicitly(String str, Double d10, Bundle bundle) {
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                ActivityLifecycleTracker activityLifecycleTracker = ActivityLifecycleTracker.INSTANCE;
                logEvent(str, d10, bundle, true, ActivityLifecycleTracker.getCurrentSessionGuid());
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    public final void logProductItem(String str, AppEventsLogger.ProductAvailability productAvailability, AppEventsLogger.ProductCondition productCondition, String str2, String str3, String str4, String str5, BigDecimal bigDecimal, Currency currency, String str6, String str7, String str8, Bundle bundle) {
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            if (str == null) {
                try {
                    Companion.notifyDeveloperError("itemID cannot be null");
                } catch (Throwable th) {
                    CrashShieldHandler.handleThrowable(th, this);
                }
            } else if (productAvailability == null) {
                Companion.notifyDeveloperError("availability cannot be null");
            } else if (productCondition == null) {
                Companion.notifyDeveloperError("condition cannot be null");
            } else if (str2 == null) {
                Companion.notifyDeveloperError("description cannot be null");
            } else if (str3 == null) {
                Companion.notifyDeveloperError("imageLink cannot be null");
            } else if (str4 == null) {
                Companion.notifyDeveloperError("link cannot be null");
            } else if (str5 == null) {
                Companion.notifyDeveloperError("title cannot be null");
            } else if (bigDecimal == null) {
                Companion.notifyDeveloperError("priceAmount cannot be null");
            } else if (currency == null) {
                Companion.notifyDeveloperError("currency cannot be null");
            } else if (str6 == null && str7 == null && str8 == null) {
                Companion.notifyDeveloperError("Either gtin, mpn or brand is required");
            } else {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                bundle.putString(Constants.EVENT_PARAM_PRODUCT_ITEM_ID, str);
                bundle.putString(Constants.EVENT_PARAM_PRODUCT_AVAILABILITY, productAvailability.name());
                bundle.putString(Constants.EVENT_PARAM_PRODUCT_CONDITION, productCondition.name());
                bundle.putString(Constants.EVENT_PARAM_PRODUCT_DESCRIPTION, str2);
                bundle.putString(Constants.EVENT_PARAM_PRODUCT_IMAGE_LINK, str3);
                bundle.putString(Constants.EVENT_PARAM_PRODUCT_LINK, str4);
                bundle.putString(Constants.EVENT_PARAM_PRODUCT_TITLE, str5);
                bundle.putString(Constants.EVENT_PARAM_PRODUCT_PRICE_AMOUNT, bigDecimal.setScale(3, 4).toString());
                bundle.putString(Constants.EVENT_PARAM_PRODUCT_PRICE_CURRENCY, currency.getCurrencyCode());
                if (str6 != null) {
                    bundle.putString(Constants.EVENT_PARAM_PRODUCT_GTIN, str6);
                }
                if (str7 != null) {
                    bundle.putString(Constants.EVENT_PARAM_PRODUCT_MPN, str7);
                }
                if (str8 != null) {
                    bundle.putString(Constants.EVENT_PARAM_PRODUCT_BRAND, str8);
                }
                logEvent(AppEventsConstants.EVENT_NAME_PRODUCT_CATALOG_UPDATE, bundle);
                Companion.eagerFlush();
            }
        }
    }

    public final void logPurchase(BigDecimal bigDecimal, Currency currency) {
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                logPurchase(bigDecimal, currency, (Bundle) null);
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    public final void logPurchaseImplicitly(BigDecimal bigDecimal, Currency currency, Bundle bundle) {
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                logPurchase(bigDecimal, currency, bundle, true);
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    public final void logPushNotificationOpen(Bundle bundle, String str) {
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                m.f(bundle, "payload");
                String str2 = null;
                try {
                    String string = bundle.getString(PUSH_PAYLOAD_KEY);
                    Utility utility = Utility.INSTANCE;
                    if (!Utility.isNullOrEmpty(string)) {
                        str2 = new JSONObject(string).getString("campaign");
                        if (str2 == null) {
                            Logger.Companion.log(LoggingBehavior.DEVELOPER_ERRORS, TAG, "Malformed payload specified for logging a push notification open.");
                            return;
                        }
                        Bundle bundle2 = new Bundle();
                        bundle2.putString(APP_EVENT_PUSH_PARAMETER_CAMPAIGN, str2);
                        if (str != null) {
                            bundle2.putString(APP_EVENT_PUSH_PARAMETER_ACTION, str);
                        }
                        logEvent(APP_EVENT_NAME_PUSH_OPENED, bundle2);
                    }
                } catch (JSONException unused) {
                }
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    public final void logSdkEvent(String str, Double d10, Bundle bundle) {
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                m.f(str, io.flutter.plugins.firebase.analytics.Constants.EVENT_NAME);
                if (p.v(str, ACCOUNT_KIT_EVENT_NAME_PREFIX, false, 2, (Object) null)) {
                    FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
                    if (FacebookSdk.getAutoLogAppEventsEnabled()) {
                        ActivityLifecycleTracker activityLifecycleTracker = ActivityLifecycleTracker.INSTANCE;
                        logEvent(str, d10, bundle, true, ActivityLifecycleTracker.getCurrentSessionGuid());
                    }
                }
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    public final void logEvent(String str, Bundle bundle) {
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                ActivityLifecycleTracker activityLifecycleTracker = ActivityLifecycleTracker.INSTANCE;
                logEvent(str, (Double) null, bundle, false, ActivityLifecycleTracker.getCurrentSessionGuid());
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    public final void logEventImplicitly(String str, BigDecimal bigDecimal, Currency currency, Bundle bundle) {
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            if (bigDecimal == null || currency == null) {
                Utility utility = Utility.INSTANCE;
                Utility.logd(TAG, "purchaseAmount and currency cannot be null");
                return;
            }
            if (bundle == null) {
                try {
                    bundle = new Bundle();
                } catch (Throwable th) {
                    CrashShieldHandler.handleThrowable(th, this);
                    return;
                }
            }
            Bundle bundle2 = bundle;
            bundle2.putString(AppEventsConstants.EVENT_PARAM_CURRENCY, currency.getCurrencyCode());
            Double valueOf = Double.valueOf(bigDecimal.doubleValue());
            ActivityLifecycleTracker activityLifecycleTracker = ActivityLifecycleTracker.INSTANCE;
            logEvent(str, valueOf, bundle2, true, ActivityLifecycleTracker.getCurrentSessionGuid());
        }
    }

    public final void logPurchase(BigDecimal bigDecimal, Currency currency, Bundle bundle) {
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                AutomaticAnalyticsLogger automaticAnalyticsLogger = AutomaticAnalyticsLogger.INSTANCE;
                boolean isImplicitPurchaseLoggingEnabled = AutomaticAnalyticsLogger.isImplicitPurchaseLoggingEnabled();
                logPurchase(bigDecimal, currency, bundle, false);
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    public final void logEvent(String str, double d10) {
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                logEvent(str, d10, (Bundle) null);
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    public final void logPurchase(BigDecimal bigDecimal, Currency currency, Bundle bundle, boolean z10) {
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            if (bigDecimal == null) {
                try {
                    Companion.notifyDeveloperError("purchaseAmount cannot be null");
                } catch (Throwable th) {
                    CrashShieldHandler.handleThrowable(th, this);
                }
            } else if (currency == null) {
                Companion.notifyDeveloperError("currency cannot be null");
            } else {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                Bundle bundle2 = bundle;
                bundle2.putString(AppEventsConstants.EVENT_PARAM_CURRENCY, currency.getCurrencyCode());
                Double valueOf = Double.valueOf(bigDecimal.doubleValue());
                ActivityLifecycleTracker activityLifecycleTracker = ActivityLifecycleTracker.INSTANCE;
                logEvent(AppEventsConstants.EVENT_NAME_PURCHASED, valueOf, bundle2, z10, ActivityLifecycleTracker.getCurrentSessionGuid());
                Companion.eagerFlush();
            }
        }
    }

    public final void logEvent(String str, double d10, Bundle bundle) {
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                Double valueOf = Double.valueOf(d10);
                ActivityLifecycleTracker activityLifecycleTracker = ActivityLifecycleTracker.INSTANCE;
                logEvent(str, valueOf, bundle, false, ActivityLifecycleTracker.getCurrentSessionGuid());
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    public final void logEvent(String str, Double d10, Bundle bundle, boolean z10, UUID uuid) {
        if (!CrashShieldHandler.isObjectCrashing(this) && str != null) {
            try {
                if (!(str.length() == 0)) {
                    FetchedAppGateKeepersManager fetchedAppGateKeepersManager = FetchedAppGateKeepersManager.INSTANCE;
                    FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
                    if (FetchedAppGateKeepersManager.getGateKeeperForKey(APP_EVENTS_KILLSWITCH, FacebookSdk.getApplicationId(), false)) {
                        Logger.Companion.log(LoggingBehavior.APP_EVENTS, "AppEvents", "KillSwitch is enabled and fail to log app event: %s", str);
                        return;
                    }
                    String str2 = this.contextName;
                    ActivityLifecycleTracker activityLifecycleTracker = ActivityLifecycleTracker.INSTANCE;
                    Companion.logEvent(new AppEvent(str2, str, d10, bundle, z10, ActivityLifecycleTracker.isInBackground(), uuid), this.accessTokenAppId);
                }
            } catch (JSONException e10) {
                Logger.Companion.log(LoggingBehavior.APP_EVENTS, "AppEvents", "JSON encoding for app event failed: '%s'", e10.toString());
            } catch (FacebookException e11) {
                Logger.Companion.log(LoggingBehavior.APP_EVENTS, "AppEvents", "Invalid app event: %s", e11.toString());
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AppEventsLoggerImpl(Context context, String str, AccessToken accessToken) {
        this(Utility.getActivityName(context), str, accessToken);
        Utility utility = Utility.INSTANCE;
    }
}
