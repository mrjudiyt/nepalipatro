package com.facebook;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.AsyncTask;
import com.facebook.GraphRequest;
import com.facebook.Profile;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.appevents.AppEventsManager;
import com.facebook.appevents.internal.ActivityLifecycleTracker;
import com.facebook.appevents.internal.AppEventsLoggerUtility;
import com.facebook.appevents.ondeviceprocessing.OnDeviceProcessingManager;
import com.facebook.internal.AttributionIdentifiers;
import com.facebook.internal.FeatureManager;
import com.facebook.internal.LockOnGetVariable;
import com.facebook.internal.ServerProtocol;
import com.facebook.internal.Utility;
import com.facebook.internal.Validate;
import com.facebook.internal.instrument.InstrumentManager;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.m;
import o8.q;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: FacebookSdk.kt */
public final class FacebookSdk {
    public static final String ADVERTISER_ID_COLLECTION_ENABLED_PROPERTY = "com.facebook.sdk.AdvertiserIDCollectionEnabled";
    public static final String APPLICATION_ID_PROPERTY = "com.facebook.sdk.ApplicationId";
    public static final String APPLICATION_NAME_PROPERTY = "com.facebook.sdk.ApplicationName";
    public static final String APP_EVENT_PREFERENCES = "com.facebook.sdk.appEventPreferences";
    private static final String ATTRIBUTION_PREFERENCES = "com.facebook.sdk.attributionTracking";
    public static final String AUTO_INIT_ENABLED_PROPERTY = "com.facebook.sdk.AutoInitEnabled";
    public static final String AUTO_LOG_APP_EVENTS_ENABLED_PROPERTY = "com.facebook.sdk.AutoLogAppEventsEnabled";
    public static final String CALLBACK_OFFSET_CHANGED_AFTER_INIT = "The callback request code offset can't be updated once the SDK is initialized. Call FacebookSdk.setCallbackRequestCodeOffset inside your Application.onCreate method";
    public static final String CALLBACK_OFFSET_NEGATIVE = "The callback request code offset can't be negative.";
    public static final String CALLBACK_OFFSET_PROPERTY = "com.facebook.sdk.CallbackOffset";
    public static final String CLIENT_TOKEN_PROPERTY = "com.facebook.sdk.ClientToken";
    public static final String CLOUDBRIDGE_SAVED_CREDENTIALS = "com.facebook.sdk.CloudBridgeSavedCredentials";
    public static final String CODELESS_DEBUG_LOG_ENABLED_PROPERTY = "com.facebook.sdk.CodelessDebugLogEnabled";
    public static final String DATA_PROCESSING_OPTIONS_PREFERENCES = "com.facebook.sdk.DataProcessingOptions";
    public static final String DATA_PROCESSION_OPTIONS = "data_processing_options";
    public static final String DATA_PROCESSION_OPTIONS_COUNTRY = "data_processing_options_country";
    public static final String DATA_PROCESSION_OPTIONS_STATE = "data_processing_options_state";
    private static final int DEFAULT_CALLBACK_REQUEST_CODE_OFFSET = 64206;
    public static final String FACEBOOK_COM = "facebook.com";
    public static final String FB_GG = "fb.gg";
    public static final String GAMING = "gaming";
    public static final String INSTAGRAM = "instagram";
    public static final String INSTAGRAM_COM = "instagram.com";
    public static final FacebookSdk INSTANCE = new FacebookSdk();
    private static final ReentrantLock LOCK = new ReentrantLock();
    private static final int MAX_REQUEST_CODE_RANGE = 100;
    public static final String MONITOR_ENABLED_PROPERTY = "com.facebook.sdk.MonitorEnabled";
    private static final String PUBLISH_ACTIVITY_PATH = "%s/activities";
    private static final String TAG = FacebookSdk.class.getCanonicalName();
    public static final String WEB_DIALOG_THEME = "com.facebook.sdk.WebDialogTheme";
    private static volatile String appClientToken;
    private static Context applicationContext;
    private static volatile String applicationId;
    private static volatile String applicationName;
    public static boolean bypassAppSwitch;
    private static LockOnGetVariable<File> cacheDir;
    private static int callbackRequestCodeOffset = DEFAULT_CALLBACK_REQUEST_CODE_OFFSET;
    private static volatile Boolean codelessDebugLogEnabled;
    private static Executor executor;
    private static volatile String facebookDomain = FACEBOOK_COM;
    private static String graphApiVersion = ServerProtocol.getDefaultAPIVersion();
    private static GraphRequestCreator graphRequestCreator = g.f6056a;
    public static boolean hasCustomTabsPrefetching;
    public static boolean ignoreAppSwitchToLoggedOut;
    private static volatile String instagramDomain = INSTAGRAM_COM;
    private static volatile boolean isDebugEnabledField;
    private static boolean isFullyInitialized;
    private static boolean isLegacyTokenUpgradeSupported;
    private static final HashSet<LoggingBehavior> loggingBehaviors = m0.c(LoggingBehavior.DEVELOPER_ERRORS);
    private static AtomicLong onProgressThreshold = new AtomicLong(65536);
    private static final AtomicBoolean sdkInitialized = new AtomicBoolean(false);

    /* compiled from: FacebookSdk.kt */
    public interface GraphRequestCreator {
        GraphRequest createPostRequest(AccessToken accessToken, String str, JSONObject jSONObject, GraphRequest.Callback callback);
    }

    /* compiled from: FacebookSdk.kt */
    public interface InitializeCallback {
        void onInitialized();
    }

    static {
        ServerProtocol serverProtocol = ServerProtocol.INSTANCE;
    }

    private FacebookSdk() {
    }

    public static final void addLoggingBehavior(LoggingBehavior loggingBehavior) {
        m.f(loggingBehavior, "behavior");
        HashSet<LoggingBehavior> hashSet = loggingBehaviors;
        synchronized (hashSet) {
            hashSet.add(loggingBehavior);
            INSTANCE.updateGraphDebugBehavior();
            q qVar = q.f16189a;
        }
    }

    public static final void clearLoggingBehaviors() {
        HashSet<LoggingBehavior> hashSet = loggingBehaviors;
        synchronized (hashSet) {
            hashSet.clear();
            q qVar = q.f16189a;
        }
    }

    public static final void fullyInitialize() {
        isFullyInitialized = true;
    }

    public static final boolean getAdvertiserIDCollectionEnabled() {
        UserSettingsManager userSettingsManager = UserSettingsManager.INSTANCE;
        return UserSettingsManager.getAdvertiserIDCollectionEnabled();
    }

    public static final Context getApplicationContext() {
        Validate validate = Validate.INSTANCE;
        Validate.sdkInitialized();
        Context context = applicationContext;
        if (context != null) {
            return context;
        }
        m.x("applicationContext");
        throw null;
    }

    public static final String getApplicationId() {
        Validate validate = Validate.INSTANCE;
        Validate.sdkInitialized();
        String str = applicationId;
        if (str != null) {
            return str;
        }
        throw new FacebookException("A valid Facebook app id must be set in the AndroidManifest.xml or set by calling FacebookSdk.setApplicationId before initializing the sdk.");
    }

    public static final String getApplicationName() {
        Validate validate = Validate.INSTANCE;
        Validate.sdkInitialized();
        return applicationName;
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String getApplicationSignature(android.content.Context r4) {
        /*
            java.lang.Class<com.facebook.FacebookSdk> r0 = com.facebook.FacebookSdk.class
            boolean r1 = com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(r0)
            r2 = 0
            if (r1 == 0) goto L_0x000a
            return r2
        L_0x000a:
            com.facebook.internal.Validate r1 = com.facebook.internal.Validate.INSTANCE     // Catch:{ all -> 0x004e }
            com.facebook.internal.Validate.sdkInitialized()     // Catch:{ all -> 0x004e }
            if (r4 != 0) goto L_0x0012
            return r2
        L_0x0012:
            android.content.pm.PackageManager r1 = r4.getPackageManager()     // Catch:{ all -> 0x004e }
            if (r1 != 0) goto L_0x0019
            return r2
        L_0x0019:
            java.lang.String r4 = r4.getPackageName()     // Catch:{ all -> 0x004e }
            r3 = 64
            android.content.pm.PackageInfo r4 = r1.getPackageInfo(r4, r3)     // Catch:{ NameNotFoundException -> 0x004d }
            android.content.pm.Signature[] r1 = r4.signatures     // Catch:{ all -> 0x004e }
            if (r1 == 0) goto L_0x004d
            int r1 = r1.length     // Catch:{ all -> 0x004e }
            r3 = 0
            if (r1 != 0) goto L_0x002d
            r1 = 1
            goto L_0x002e
        L_0x002d:
            r1 = 0
        L_0x002e:
            if (r1 == 0) goto L_0x0031
            goto L_0x004d
        L_0x0031:
            java.lang.String r1 = "SHA-1"
            java.security.MessageDigest r1 = java.security.MessageDigest.getInstance(r1)     // Catch:{  }
            android.content.pm.Signature[] r4 = r4.signatures     // Catch:{ all -> 0x004e }
            r4 = r4[r3]     // Catch:{ all -> 0x004e }
            byte[] r4 = r4.toByteArray()     // Catch:{ all -> 0x004e }
            r1.update(r4)     // Catch:{ all -> 0x004e }
            byte[] r4 = r1.digest()     // Catch:{ all -> 0x004e }
            r1 = 9
            java.lang.String r4 = android.util.Base64.encodeToString(r4, r1)     // Catch:{ all -> 0x004e }
            return r4
        L_0x004d:
            return r2
        L_0x004e:
            r4 = move-exception
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(r4, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.FacebookSdk.getApplicationSignature(android.content.Context):java.lang.String");
    }

    public static final boolean getAutoInitEnabled() {
        UserSettingsManager userSettingsManager = UserSettingsManager.INSTANCE;
        return UserSettingsManager.getAutoInitEnabled();
    }

    public static final boolean getAutoLogAppEventsEnabled() {
        UserSettingsManager userSettingsManager = UserSettingsManager.INSTANCE;
        return UserSettingsManager.getAutoLogAppEventsEnabled();
    }

    public static final File getCacheDir() {
        Validate validate = Validate.INSTANCE;
        Validate.sdkInitialized();
        LockOnGetVariable<File> lockOnGetVariable = cacheDir;
        if (lockOnGetVariable != null) {
            return lockOnGetVariable.getValue();
        }
        m.x("cacheDir");
        throw null;
    }

    public static final int getCallbackRequestCodeOffset() {
        Validate validate = Validate.INSTANCE;
        Validate.sdkInitialized();
        return callbackRequestCodeOffset;
    }

    public static final String getClientToken() {
        Validate validate = Validate.INSTANCE;
        Validate.sdkInitialized();
        String str = appClientToken;
        if (str != null) {
            return str;
        }
        throw new FacebookException("A valid Facebook client token must be set in the AndroidManifest.xml or set by calling FacebookSdk.setClientToken before initializing the sdk. Visit https://developers.facebook.com/docs/android/getting-started#add-app_id for more information.");
    }

    public static final boolean getCodelessDebugLogEnabled() {
        Validate validate = Validate.INSTANCE;
        Validate.sdkInitialized();
        Boolean bool = codelessDebugLogEnabled;
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public static final boolean getCodelessSetupEnabled() {
        UserSettingsManager userSettingsManager = UserSettingsManager.INSTANCE;
        return UserSettingsManager.getCodelessSetupEnabled();
    }

    /* JADX INFO: finally extract failed */
    public static final Executor getExecutor() {
        ReentrantLock reentrantLock = LOCK;
        reentrantLock.lock();
        try {
            if (executor == null) {
                executor = AsyncTask.THREAD_POOL_EXECUTOR;
            }
            q qVar = q.f16189a;
            reentrantLock.unlock();
            Executor executor2 = executor;
            if (executor2 != null) {
                return executor2;
            }
            throw new IllegalStateException("Required value was null.".toString());
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public static final String getFacebookDomain() {
        return facebookDomain;
    }

    public static final String getFacebookGamingDomain() {
        return FB_GG;
    }

    public static final String getGraphApiVersion() {
        Utility utility = Utility.INSTANCE;
        String str = TAG;
        b0 b0Var = b0.f15559a;
        String format = String.format("getGraphApiVersion: %s", Arrays.copyOf(new Object[]{graphApiVersion}, 1));
        m.e(format, "java.lang.String.format(format, *args)");
        Utility.logd(str, format);
        return graphApiVersion;
    }

    public static final String getGraphDomain() {
        AccessToken currentAccessToken = AccessToken.Companion.getCurrentAccessToken();
        String graphDomain = currentAccessToken != null ? currentAccessToken.getGraphDomain() : null;
        Utility utility = Utility.INSTANCE;
        return Utility.getGraphDomainFromTokenDomain(graphDomain);
    }

    public static final String getInstagramDomain() {
        return instagramDomain;
    }

    public static final boolean getLimitEventAndDataUsage(Context context) {
        m.f(context, "context");
        Validate validate = Validate.INSTANCE;
        Validate.sdkInitialized();
        return context.getSharedPreferences(APP_EVENT_PREFERENCES, 0).getBoolean("limitEventUsage", false);
    }

    public static final Set<LoggingBehavior> getLoggingBehaviors() {
        Set<LoggingBehavior> unmodifiableSet;
        HashSet<LoggingBehavior> hashSet = loggingBehaviors;
        synchronized (hashSet) {
            unmodifiableSet = Collections.unmodifiableSet(new HashSet(hashSet));
            m.e(unmodifiableSet, "unmodifiableSet(HashSet(loggingBehaviors))");
        }
        return unmodifiableSet;
    }

    public static final boolean getMonitorEnabled() {
        UserSettingsManager userSettingsManager = UserSettingsManager.INSTANCE;
        return UserSettingsManager.getMonitorEnabled();
    }

    public static final long getOnProgressThreshold() {
        Validate validate = Validate.INSTANCE;
        Validate.sdkInitialized();
        return onProgressThreshold.get();
    }

    public static final String getSdkVersion() {
        return FacebookSdkVersion.BUILD;
    }

    /* access modifiers changed from: private */
    /* renamed from: graphRequestCreator$lambda-0  reason: not valid java name */
    public static final GraphRequest m6graphRequestCreator$lambda0(AccessToken accessToken, String str, JSONObject jSONObject, GraphRequest.Callback callback) {
        return GraphRequest.Companion.newPostRequest(accessToken, str, jSONObject, callback);
    }

    public static final boolean isDebugEnabled() {
        return isDebugEnabledField;
    }

    public static final boolean isFacebookRequestCode(int i10) {
        int i11 = callbackRequestCodeOffset;
        return i10 >= i11 && i10 < i11 + 100;
    }

    public static final synchronized boolean isFullyInitialized() {
        boolean z10;
        synchronized (FacebookSdk.class) {
            z10 = isFullyInitialized;
        }
        return z10;
    }

    public static final boolean isInitialized() {
        return sdkInitialized.get();
    }

    public static final boolean isLegacyTokenUpgradeSupported() {
        return isLegacyTokenUpgradeSupported;
    }

    public static final boolean isLoggingBehaviorEnabled(LoggingBehavior loggingBehavior) {
        boolean z10;
        m.f(loggingBehavior, "behavior");
        HashSet<LoggingBehavior> hashSet = loggingBehaviors;
        synchronized (hashSet) {
            z10 = isDebugEnabled() && hashSet.contains(loggingBehavior);
        }
        return z10;
    }

    public static final void loadDefaultsFromMetadata$facebook_core_release(Context context) {
        if (context != null) {
            try {
                ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
                m.e(applicationInfo, "try {\n          context.packageManager.getApplicationInfo(\n              context.packageName, PackageManager.GET_META_DATA)\n        } catch (e: PackageManager.NameNotFoundException) {\n          return\n        }");
                if (applicationInfo.metaData != null) {
                    if (applicationId == null) {
                        Object obj = applicationInfo.metaData.get(APPLICATION_ID_PROPERTY);
                        if (obj instanceof String) {
                            String str = (String) obj;
                            Locale locale = Locale.ROOT;
                            m.e(locale, "ROOT");
                            String lowerCase = str.toLowerCase(locale);
                            m.e(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                            if (p.v(lowerCase, "fb", false, 2, (Object) null)) {
                                String substring = str.substring(2);
                                m.e(substring, "(this as java.lang.String).substring(startIndex)");
                                applicationId = substring;
                            } else {
                                applicationId = str;
                            }
                        } else if (obj instanceof Number) {
                            throw new FacebookException("App Ids cannot be directly placed in the manifest.They must be prefixed by 'fb' or be placed in the string resource file.");
                        }
                    }
                    if (applicationName == null) {
                        applicationName = applicationInfo.metaData.getString(APPLICATION_NAME_PROPERTY);
                    }
                    if (appClientToken == null) {
                        appClientToken = applicationInfo.metaData.getString(CLIENT_TOKEN_PROPERTY);
                    }
                    if (callbackRequestCodeOffset == DEFAULT_CALLBACK_REQUEST_CODE_OFFSET) {
                        callbackRequestCodeOffset = applicationInfo.metaData.getInt(CALLBACK_OFFSET_PROPERTY, DEFAULT_CALLBACK_REQUEST_CODE_OFFSET);
                    }
                    if (codelessDebugLogEnabled == null) {
                        codelessDebugLogEnabled = Boolean.valueOf(applicationInfo.metaData.getBoolean(CODELESS_DEBUG_LOG_ENABLED_PROPERTY, false));
                    }
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
    }

    private final void publishInstallAndWaitForResponse(Context context, String str) {
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                AttributionIdentifiers attributionIdentifiers = AttributionIdentifiers.Companion.getAttributionIdentifiers(context);
                SharedPreferences sharedPreferences = context.getSharedPreferences(ATTRIBUTION_PREFERENCES, 0);
                String o10 = m.o(str, "ping");
                long j10 = sharedPreferences.getLong(o10, 0);
                AppEventsLoggerUtility appEventsLoggerUtility = AppEventsLoggerUtility.INSTANCE;
                JSONObject jSONObjectForGraphAPICall = AppEventsLoggerUtility.getJSONObjectForGraphAPICall(AppEventsLoggerUtility.GraphAPIActivityType.MOBILE_INSTALL_EVENT, attributionIdentifiers, AppEventsLogger.Companion.getAnonymousAppDeviceGUID(context), getLimitEventAndDataUsage(context), context);
                b0 b0Var = b0.f15559a;
                String format = String.format(PUBLISH_ACTIVITY_PATH, Arrays.copyOf(new Object[]{str}, 1));
                m.e(format, "java.lang.String.format(format, *args)");
                GraphRequest createPostRequest = graphRequestCreator.createPostRequest((AccessToken) null, format, jSONObjectForGraphAPICall, (GraphRequest.Callback) null);
                if (j10 == 0 && createPostRequest.executeAndWait().getError() == null) {
                    SharedPreferences.Editor edit = sharedPreferences.edit();
                    edit.putLong(o10, System.currentTimeMillis());
                    edit.apply();
                }
            } catch (JSONException e10) {
                throw new FacebookException("An error occurred while publishing install.", (Throwable) e10);
            } catch (Exception e11) {
                try {
                    Utility utility = Utility.INSTANCE;
                    Utility.logd("Facebook-publish", e11);
                } catch (Throwable th) {
                    CrashShieldHandler.handleThrowable(th, this);
                }
            }
        }
    }

    public static final void publishInstallAsync(Context context, String str) {
        Class<FacebookSdk> cls = FacebookSdk.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            try {
                m.f(context, "context");
                m.f(str, "applicationId");
                getExecutor().execute(new m(context.getApplicationContext(), str));
                FeatureManager featureManager = FeatureManager.INSTANCE;
                if (FeatureManager.isEnabled(FeatureManager.Feature.OnDeviceEventProcessing)) {
                    OnDeviceProcessingManager onDeviceProcessingManager = OnDeviceProcessingManager.INSTANCE;
                    if (OnDeviceProcessingManager.isOnDeviceProcessingEnabled()) {
                        OnDeviceProcessingManager.sendInstallEventAsync(str, ATTRIBUTION_PREFERENCES);
                    }
                }
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: publishInstallAsync$lambda-15  reason: not valid java name */
    public static final void m7publishInstallAsync$lambda15(Context context, String str) {
        m.f(str, "$applicationId");
        FacebookSdk facebookSdk = INSTANCE;
        m.e(context, "applicationContext");
        facebookSdk.publishInstallAndWaitForResponse(context, str);
    }

    public static final void removeLoggingBehavior(LoggingBehavior loggingBehavior) {
        m.f(loggingBehavior, "behavior");
        HashSet<LoggingBehavior> hashSet = loggingBehaviors;
        synchronized (hashSet) {
            hashSet.remove(loggingBehavior);
        }
    }

    public static final synchronized void sdkInitialize(Context context, int i10) {
        synchronized (FacebookSdk.class) {
            m.f(context, "applicationContext");
            sdkInitialize(context, i10, (InitializeCallback) null);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: sdkInitialize$lambda-3  reason: not valid java name */
    public static final File m8sdkInitialize$lambda3() {
        Context context = applicationContext;
        if (context != null) {
            return context.getCacheDir();
        }
        m.x("applicationContext");
        throw null;
    }

    /* access modifiers changed from: private */
    /* renamed from: sdkInitialize$lambda-4  reason: not valid java name */
    public static final void m9sdkInitialize$lambda4(boolean z10) {
        if (z10) {
            InstrumentManager instrumentManager = InstrumentManager.INSTANCE;
            InstrumentManager.start();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: sdkInitialize$lambda-5  reason: not valid java name */
    public static final void m10sdkInitialize$lambda5(boolean z10) {
        if (z10) {
            AppEventsManager appEventsManager = AppEventsManager.INSTANCE;
            AppEventsManager.start();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: sdkInitialize$lambda-6  reason: not valid java name */
    public static final void m11sdkInitialize$lambda6(boolean z10) {
        if (z10) {
            hasCustomTabsPrefetching = true;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: sdkInitialize$lambda-7  reason: not valid java name */
    public static final void m12sdkInitialize$lambda7(boolean z10) {
        if (z10) {
            ignoreAppSwitchToLoggedOut = true;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: sdkInitialize$lambda-8  reason: not valid java name */
    public static final void m13sdkInitialize$lambda8(boolean z10) {
        if (z10) {
            bypassAppSwitch = true;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: sdkInitialize$lambda-9  reason: not valid java name */
    public static final Void m14sdkInitialize$lambda9(InitializeCallback initializeCallback) {
        AccessTokenManager.Companion.getInstance().loadCurrentAccessToken();
        ProfileManager.Companion.getInstance().loadCurrentProfile();
        if (AccessToken.Companion.isCurrentAccessTokenActive()) {
            Profile.Companion companion = Profile.Companion;
            if (companion.getCurrentProfile() == null) {
                companion.fetchProfileForCurrentAccessToken();
            }
        }
        if (initializeCallback != null) {
            initializeCallback.onInitialized();
        }
        AppEventsLogger.Companion companion2 = AppEventsLogger.Companion;
        companion2.initializeLib(getApplicationContext(), applicationId);
        UserSettingsManager userSettingsManager = UserSettingsManager.INSTANCE;
        UserSettingsManager.logIfAutoAppLinkEnabled();
        Context applicationContext2 = getApplicationContext().getApplicationContext();
        m.e(applicationContext2, "getApplicationContext().applicationContext");
        companion2.newLogger(applicationContext2).flush();
        return null;
    }

    public static final void setAdvertiserIDCollectionEnabled(boolean z10) {
        UserSettingsManager userSettingsManager = UserSettingsManager.INSTANCE;
        UserSettingsManager.setAdvertiserIDCollectionEnabled(z10);
    }

    public static final void setApplicationId(String str) {
        m.f(str, "applicationId");
        Validate validate = Validate.INSTANCE;
        Validate.notEmpty(str, "applicationId");
        applicationId = str;
    }

    public static final void setApplicationName(String str) {
        applicationName = str;
    }

    public static final void setAutoInitEnabled(boolean z10) {
        UserSettingsManager userSettingsManager = UserSettingsManager.INSTANCE;
        UserSettingsManager.setAutoInitEnabled(z10);
        if (z10) {
            fullyInitialize();
        }
    }

    public static final void setAutoLogAppEventsEnabled(boolean z10) {
        UserSettingsManager userSettingsManager = UserSettingsManager.INSTANCE;
        UserSettingsManager.setAutoLogAppEventsEnabled(z10);
        if (z10) {
            ActivityLifecycleTracker activityLifecycleTracker = ActivityLifecycleTracker.INSTANCE;
            ActivityLifecycleTracker.startTracking((Application) getApplicationContext(), getApplicationId());
        }
    }

    public static final void setCacheDir(File file) {
        m.f(file, "cacheDir");
        cacheDir = new LockOnGetVariable<>(file);
    }

    public static final void setClientToken(String str) {
        appClientToken = str;
    }

    public static final void setCodelessDebugLogEnabled(boolean z10) {
        codelessDebugLogEnabled = Boolean.valueOf(z10);
    }

    public static final void setDataProcessingOptions(String[] strArr) {
        Class<FacebookSdk> cls = FacebookSdk.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            try {
                setDataProcessingOptions(strArr, 0, 0);
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }

    public static final void setExecutor(Executor executor2) {
        m.f(executor2, "executor");
        ReentrantLock reentrantLock = LOCK;
        reentrantLock.lock();
        try {
            executor = executor2;
            q qVar = q.f16189a;
        } finally {
            reentrantLock.unlock();
        }
    }

    public static final void setFacebookDomain(String str) {
        m.f(str, "facebookDomain");
        facebookDomain = str;
    }

    public static final void setGraphApiVersion(String str) {
        m.f(str, "graphApiVersion");
        Utility utility = Utility.INSTANCE;
        if (!Utility.isNullOrEmpty(str) && !m.a(graphApiVersion, str)) {
            graphApiVersion = str;
        }
    }

    public static final void setGraphRequestCreator$facebook_core_release(GraphRequestCreator graphRequestCreator2) {
        m.f(graphRequestCreator2, "graphRequestCreator");
        graphRequestCreator = graphRequestCreator2;
    }

    public static final void setIsDebugEnabled(boolean z10) {
        isDebugEnabledField = z10;
    }

    public static final void setLegacyTokenUpgradeSupported(boolean z10) {
        isLegacyTokenUpgradeSupported = z10;
    }

    public static final void setLimitEventAndDataUsage(Context context, boolean z10) {
        m.f(context, "context");
        context.getSharedPreferences(APP_EVENT_PREFERENCES, 0).edit().putBoolean("limitEventUsage", z10).apply();
    }

    public static final void setMonitorEnabled(boolean z10) {
        UserSettingsManager userSettingsManager = UserSettingsManager.INSTANCE;
        UserSettingsManager.setMonitorEnabled(z10);
    }

    public static final void setOnProgressThreshold(long j10) {
        onProgressThreshold.set(j10);
    }

    private final void updateGraphDebugBehavior() {
        HashSet<LoggingBehavior> hashSet = loggingBehaviors;
        if (hashSet.contains(LoggingBehavior.GRAPH_API_DEBUG_INFO)) {
            LoggingBehavior loggingBehavior = LoggingBehavior.GRAPH_API_DEBUG_WARNING;
            if (!hashSet.contains(loggingBehavior)) {
                hashSet.add(loggingBehavior);
            }
        }
    }

    public static final synchronized void sdkInitialize(Context context, int i10, InitializeCallback initializeCallback) {
        synchronized (FacebookSdk.class) {
            m.f(context, "applicationContext");
            if (sdkInitialized.get()) {
                if (i10 != callbackRequestCodeOffset) {
                    throw new FacebookException(CALLBACK_OFFSET_CHANGED_AFTER_INIT);
                }
            }
            if (i10 >= 0) {
                callbackRequestCodeOffset = i10;
                sdkInitialize(context, initializeCallback);
            } else {
                throw new FacebookException(CALLBACK_OFFSET_NEGATIVE);
            }
        }
    }

    public static final void setDataProcessingOptions(String[] strArr, int i10, int i11) {
        Class<FacebookSdk> cls = FacebookSdk.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            if (strArr == null) {
                try {
                    strArr = new String[0];
                } catch (Throwable th) {
                    CrashShieldHandler.handleThrowable(th, cls);
                    return;
                }
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(DATA_PROCESSION_OPTIONS, new JSONArray(k.y(strArr)));
                jSONObject.put(DATA_PROCESSION_OPTIONS_COUNTRY, i10);
                jSONObject.put(DATA_PROCESSION_OPTIONS_STATE, i11);
                Context context = applicationContext;
                if (context != null) {
                    context.getSharedPreferences(DATA_PROCESSING_OPTIONS_PREFERENCES, 0).edit().putString(DATA_PROCESSION_OPTIONS, jSONObject.toString()).apply();
                } else {
                    m.x("applicationContext");
                    throw null;
                }
            } catch (JSONException unused) {
            }
        }
    }

    public static final synchronized void sdkInitialize(Context context) {
        synchronized (FacebookSdk.class) {
            m.f(context, "applicationContext");
            sdkInitialize(context, (InitializeCallback) null);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0017, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00ef  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final synchronized void sdkInitialize(android.content.Context r5, com.facebook.FacebookSdk.InitializeCallback r6) {
        /*
            java.lang.Class<com.facebook.FacebookSdk> r0 = com.facebook.FacebookSdk.class
            monitor-enter(r0)
            java.lang.String r1 = "applicationContext"
            kotlin.jvm.internal.m.f(r5, r1)     // Catch:{ all -> 0x00fd }
            java.util.concurrent.atomic.AtomicBoolean r1 = sdkInitialized     // Catch:{ all -> 0x00fd }
            boolean r2 = r1.get()     // Catch:{ all -> 0x00fd }
            if (r2 == 0) goto L_0x0018
            if (r6 != 0) goto L_0x0013
            goto L_0x0016
        L_0x0013:
            r6.onInitialized()     // Catch:{ all -> 0x00fd }
        L_0x0016:
            monitor-exit(r0)
            return
        L_0x0018:
            com.facebook.internal.Validate r2 = com.facebook.internal.Validate.INSTANCE     // Catch:{ all -> 0x00fd }
            r2 = 0
            com.facebook.internal.Validate.hasFacebookActivity(r5, r2)     // Catch:{ all -> 0x00fd }
            com.facebook.internal.Validate.hasInternetPermissions(r5, r2)     // Catch:{ all -> 0x00fd }
            android.content.Context r3 = r5.getApplicationContext()     // Catch:{ all -> 0x00fd }
            java.lang.String r4 = "applicationContext.applicationContext"
            kotlin.jvm.internal.m.e(r3, r4)     // Catch:{ all -> 0x00fd }
            applicationContext = r3     // Catch:{ all -> 0x00fd }
            com.facebook.appevents.AppEventsLogger$Companion r3 = com.facebook.appevents.AppEventsLogger.Companion     // Catch:{ all -> 0x00fd }
            r3.getAnonymousAppDeviceGUID(r5)     // Catch:{ all -> 0x00fd }
            android.content.Context r5 = applicationContext     // Catch:{ all -> 0x00fd }
            r3 = 0
            if (r5 == 0) goto L_0x00f7
            loadDefaultsFromMetadata$facebook_core_release(r5)     // Catch:{ all -> 0x00fd }
            java.lang.String r5 = applicationId     // Catch:{ all -> 0x00fd }
            r4 = 1
            if (r5 == 0) goto L_0x0047
            int r5 = r5.length()     // Catch:{ all -> 0x00fd }
            if (r5 != 0) goto L_0x0045
            goto L_0x0047
        L_0x0045:
            r5 = 0
            goto L_0x0048
        L_0x0047:
            r5 = 1
        L_0x0048:
            if (r5 != 0) goto L_0x00ef
            java.lang.String r5 = appClientToken     // Catch:{ all -> 0x00fd }
            if (r5 == 0) goto L_0x0054
            int r5 = r5.length()     // Catch:{ all -> 0x00fd }
            if (r5 != 0) goto L_0x0055
        L_0x0054:
            r2 = 1
        L_0x0055:
            if (r2 != 0) goto L_0x00e7
            r1.set(r4)     // Catch:{ all -> 0x00fd }
            boolean r5 = getAutoInitEnabled()     // Catch:{ all -> 0x00fd }
            if (r5 == 0) goto L_0x0063
            fullyInitialize()     // Catch:{ all -> 0x00fd }
        L_0x0063:
            android.content.Context r5 = applicationContext     // Catch:{ all -> 0x00fd }
            if (r5 == 0) goto L_0x00e1
            boolean r5 = r5 instanceof android.app.Application     // Catch:{ all -> 0x00fd }
            if (r5 == 0) goto L_0x0087
            com.facebook.UserSettingsManager r5 = com.facebook.UserSettingsManager.INSTANCE     // Catch:{ all -> 0x00fd }
            boolean r5 = com.facebook.UserSettingsManager.getAutoLogAppEventsEnabled()     // Catch:{ all -> 0x00fd }
            if (r5 == 0) goto L_0x0087
            com.facebook.appevents.internal.ActivityLifecycleTracker r5 = com.facebook.appevents.internal.ActivityLifecycleTracker.INSTANCE     // Catch:{ all -> 0x00fd }
            android.content.Context r5 = applicationContext     // Catch:{ all -> 0x00fd }
            if (r5 == 0) goto L_0x0081
            android.app.Application r5 = (android.app.Application) r5     // Catch:{ all -> 0x00fd }
            java.lang.String r1 = applicationId     // Catch:{ all -> 0x00fd }
            com.facebook.appevents.internal.ActivityLifecycleTracker.startTracking(r5, r1)     // Catch:{ all -> 0x00fd }
            goto L_0x0087
        L_0x0081:
            java.lang.String r5 = "applicationContext"
            kotlin.jvm.internal.m.x(r5)     // Catch:{ all -> 0x00fd }
            throw r3     // Catch:{ all -> 0x00fd }
        L_0x0087:
            com.facebook.internal.FetchedAppSettingsManager r5 = com.facebook.internal.FetchedAppSettingsManager.INSTANCE     // Catch:{ all -> 0x00fd }
            com.facebook.internal.FetchedAppSettingsManager.loadAppSettingsAsync()     // Catch:{ all -> 0x00fd }
            com.facebook.internal.NativeProtocol r5 = com.facebook.internal.NativeProtocol.INSTANCE     // Catch:{ all -> 0x00fd }
            com.facebook.internal.NativeProtocol.updateAllAvailableProtocolVersionsAsync()     // Catch:{ all -> 0x00fd }
            com.facebook.internal.BoltsMeasurementEventListener$Companion r5 = com.facebook.internal.BoltsMeasurementEventListener.Companion     // Catch:{ all -> 0x00fd }
            android.content.Context r1 = applicationContext     // Catch:{ all -> 0x00fd }
            if (r1 == 0) goto L_0x00db
            r5.getInstance(r1)     // Catch:{ all -> 0x00fd }
            com.facebook.internal.LockOnGetVariable r5 = new com.facebook.internal.LockOnGetVariable     // Catch:{ all -> 0x00fd }
            com.facebook.o r1 = com.facebook.o.f6151a     // Catch:{ all -> 0x00fd }
            r5.<init>(r1)     // Catch:{ all -> 0x00fd }
            cacheDir = r5     // Catch:{ all -> 0x00fd }
            com.facebook.internal.FeatureManager r5 = com.facebook.internal.FeatureManager.INSTANCE     // Catch:{ all -> 0x00fd }
            com.facebook.internal.FeatureManager$Feature r5 = com.facebook.internal.FeatureManager.Feature.Instrument     // Catch:{ all -> 0x00fd }
            com.facebook.h r1 = com.facebook.h.f6057a     // Catch:{ all -> 0x00fd }
            com.facebook.internal.FeatureManager.checkFeature(r5, r1)     // Catch:{ all -> 0x00fd }
            com.facebook.internal.FeatureManager$Feature r5 = com.facebook.internal.FeatureManager.Feature.AppEvents     // Catch:{ all -> 0x00fd }
            com.facebook.k r1 = com.facebook.k.f6100a     // Catch:{ all -> 0x00fd }
            com.facebook.internal.FeatureManager.checkFeature(r5, r1)     // Catch:{ all -> 0x00fd }
            com.facebook.internal.FeatureManager$Feature r5 = com.facebook.internal.FeatureManager.Feature.ChromeCustomTabsPrefetching     // Catch:{ all -> 0x00fd }
            com.facebook.l r1 = com.facebook.l.f6101a     // Catch:{ all -> 0x00fd }
            com.facebook.internal.FeatureManager.checkFeature(r5, r1)     // Catch:{ all -> 0x00fd }
            com.facebook.internal.FeatureManager$Feature r5 = com.facebook.internal.FeatureManager.Feature.IgnoreAppSwitchToLoggedOut     // Catch:{ all -> 0x00fd }
            com.facebook.i r1 = com.facebook.i.f6058a     // Catch:{ all -> 0x00fd }
            com.facebook.internal.FeatureManager.checkFeature(r5, r1)     // Catch:{ all -> 0x00fd }
            com.facebook.internal.FeatureManager$Feature r5 = com.facebook.internal.FeatureManager.Feature.BypassAppSwitch     // Catch:{ all -> 0x00fd }
            com.facebook.j r1 = com.facebook.j.f6099a     // Catch:{ all -> 0x00fd }
            com.facebook.internal.FeatureManager.checkFeature(r5, r1)     // Catch:{ all -> 0x00fd }
            java.util.concurrent.FutureTask r5 = new java.util.concurrent.FutureTask     // Catch:{ all -> 0x00fd }
            com.facebook.n r1 = new com.facebook.n     // Catch:{ all -> 0x00fd }
            r1.<init>(r6)     // Catch:{ all -> 0x00fd }
            r5.<init>(r1)     // Catch:{ all -> 0x00fd }
            java.util.concurrent.Executor r6 = getExecutor()     // Catch:{ all -> 0x00fd }
            r6.execute(r5)     // Catch:{ all -> 0x00fd }
            monitor-exit(r0)
            return
        L_0x00db:
            java.lang.String r5 = "applicationContext"
            kotlin.jvm.internal.m.x(r5)     // Catch:{ all -> 0x00fd }
            throw r3     // Catch:{ all -> 0x00fd }
        L_0x00e1:
            java.lang.String r5 = "applicationContext"
            kotlin.jvm.internal.m.x(r5)     // Catch:{ all -> 0x00fd }
            throw r3     // Catch:{ all -> 0x00fd }
        L_0x00e7:
            com.facebook.FacebookException r5 = new com.facebook.FacebookException     // Catch:{ all -> 0x00fd }
            java.lang.String r6 = "A valid Facebook app client token must be set in the AndroidManifest.xml or set by calling FacebookSdk.setClientToken before initializing the sdk."
            r5.<init>((java.lang.String) r6)     // Catch:{ all -> 0x00fd }
            throw r5     // Catch:{ all -> 0x00fd }
        L_0x00ef:
            com.facebook.FacebookException r5 = new com.facebook.FacebookException     // Catch:{ all -> 0x00fd }
            java.lang.String r6 = "A valid Facebook app id must be set in the AndroidManifest.xml or set by calling FacebookSdk.setApplicationId before initializing the sdk."
            r5.<init>((java.lang.String) r6)     // Catch:{ all -> 0x00fd }
            throw r5     // Catch:{ all -> 0x00fd }
        L_0x00f7:
            java.lang.String r5 = "applicationContext"
            kotlin.jvm.internal.m.x(r5)     // Catch:{ all -> 0x00fd }
            throw r3     // Catch:{ all -> 0x00fd }
        L_0x00fd:
            r5 = move-exception
            monitor-exit(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.FacebookSdk.sdkInitialize(android.content.Context, com.facebook.FacebookSdk$InitializeCallback):void");
    }
}
