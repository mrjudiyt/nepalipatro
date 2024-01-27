package com.facebook;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.facebook.GraphRequest;
import com.facebook.appevents.InternalAppEventsLogger;
import com.facebook.internal.AttributionIdentifiers;
import com.facebook.internal.FetchedAppSettings;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.Utility;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.m;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: UserSettingsManager.kt */
public final class UserSettingsManager {
    private static final String ADVERTISERID_COLLECTION_FALSE_WARNING = "The value for AdvertiserIDCollectionEnabled is currently set to FALSE so you're sending app events without collecting Advertiser ID. This can affect the quality of your advertising and analytics results.";
    private static final String ADVERTISERID_COLLECTION_NOT_SET_WARNING = "You haven't set a value for AdvertiserIDCollectionEnabled. Set the flag to TRUE if you want to collect Advertiser ID for better advertising and analytics results. To request user consent before collecting data, set the flag value to FALSE, then change to TRUE once user consent is received. Learn more: https://developers.facebook.com/docs/app-events/getting-started-app-events-android#disable-auto-events.";
    private static final String ADVERTISER_ID_KEY = "advertiser_id";
    private static final String APPLICATION_FIELDS = "fields";
    private static final String AUTOLOG_APPEVENT_NOT_SET_WARNING = "Please set a value for AutoLogAppEventsEnabled. Set the flag to TRUE if you want to collect app install, app launch and in-app purchase events automatically. To request user consent before collecting data, set the flag value to FALSE, then change to TRUE once user consent is received. Learn more: https://developers.facebook.com/docs/app-events/getting-started-app-events-android#disable-auto-events.";
    private static final String AUTO_APP_LINK_WARNING = "You haven't set the Auto App Link URL scheme: fb<YOUR APP ID> in AndroidManifest";
    private static final String EVENTS_CODELESS_SETUP_ENABLED = "auto_event_setup_enabled";
    public static final UserSettingsManager INSTANCE = new UserSettingsManager();
    private static final String LAST_TIMESTAMP = "last_timestamp";
    private static final String TAG = UserSettingsManager.class.getName();
    private static final long TIMEOUT_7D = 604800000;
    private static final String USER_SETTINGS = "com.facebook.sdk.USER_SETTINGS";
    private static final String USER_SETTINGS_BITMASK = "com.facebook.sdk.USER_SETTINGS_BITMASK";
    private static final String VALUE = "value";
    private static final UserSetting advertiserIDCollectionEnabled = new UserSetting(true, FacebookSdk.ADVERTISER_ID_COLLECTION_ENABLED_PROPERTY);
    private static final UserSetting autoInitEnabled = new UserSetting(true, FacebookSdk.AUTO_INIT_ENABLED_PROPERTY);
    private static final UserSetting autoLogAppEventsEnabled = new UserSetting(true, FacebookSdk.AUTO_LOG_APP_EVENTS_ENABLED_PROPERTY);
    private static final UserSetting codelessSetupEnabled = new UserSetting(false, EVENTS_CODELESS_SETUP_ENABLED);
    private static final AtomicBoolean isFetchingCodelessStatus = new AtomicBoolean(false);
    private static final AtomicBoolean isInitialized = new AtomicBoolean(false);
    private static final UserSetting monitorEnabled = new UserSetting(true, FacebookSdk.MONITOR_ENABLED_PROPERTY);
    private static SharedPreferences userSettingPref;

    /* compiled from: UserSettingsManager.kt */
    private static final class UserSetting {
        private boolean defaultVal;
        private String key;
        private long lastTS;
        private Boolean value;

        public UserSetting(boolean z10, String str) {
            m.f(str, Constants.KEY);
            this.defaultVal = z10;
            this.key = str;
        }

        public final boolean getDefaultVal() {
            return this.defaultVal;
        }

        public final String getKey() {
            return this.key;
        }

        public final long getLastTS() {
            return this.lastTS;
        }

        public final Boolean getValue() {
            return this.value;
        }

        public final void setDefaultVal(boolean z10) {
            this.defaultVal = z10;
        }

        public final void setKey(String str) {
            m.f(str, "<set-?>");
            this.key = str;
        }

        public final void setLastTS(long j10) {
            this.lastTS = j10;
        }

        public final void setValue(Boolean bool) {
            this.value = bool;
        }

        /* renamed from: getValue  reason: collision with other method in class */
        public final boolean m22getValue() {
            Boolean bool = this.value;
            return bool == null ? this.defaultVal : bool.booleanValue();
        }
    }

    private UserSettingsManager() {
    }

    public static final boolean getAdvertiserIDCollectionEnabled() {
        Class<UserSettingsManager> cls = UserSettingsManager.class;
        if (CrashShieldHandler.isObjectCrashing(cls)) {
            return false;
        }
        try {
            INSTANCE.initializeIfNotInitialized();
            return advertiserIDCollectionEnabled.getValue();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, cls);
            return false;
        }
    }

    public static final boolean getAutoInitEnabled() {
        Class<UserSettingsManager> cls = UserSettingsManager.class;
        if (CrashShieldHandler.isObjectCrashing(cls)) {
            return false;
        }
        try {
            INSTANCE.initializeIfNotInitialized();
            return autoInitEnabled.getValue();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, cls);
            return false;
        }
    }

    public static final boolean getAutoLogAppEventsEnabled() {
        Class<UserSettingsManager> cls = UserSettingsManager.class;
        if (CrashShieldHandler.isObjectCrashing(cls)) {
            return false;
        }
        try {
            INSTANCE.initializeIfNotInitialized();
            return autoLogAppEventsEnabled.getValue();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, cls);
            return false;
        }
    }

    public static final boolean getCodelessSetupEnabled() {
        Class<UserSettingsManager> cls = UserSettingsManager.class;
        if (CrashShieldHandler.isObjectCrashing(cls)) {
            return false;
        }
        try {
            INSTANCE.initializeIfNotInitialized();
            return codelessSetupEnabled.getValue();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, cls);
            return false;
        }
    }

    public static final boolean getMonitorEnabled() {
        Class<UserSettingsManager> cls = UserSettingsManager.class;
        if (CrashShieldHandler.isObjectCrashing(cls)) {
            return false;
        }
        try {
            INSTANCE.initializeIfNotInitialized();
            return monitorEnabled.getValue();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, cls);
            return false;
        }
    }

    private final void initializeCodelessSetupEnabledAsync() {
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                UserSetting userSetting = codelessSetupEnabled;
                readSettingFromCache(userSetting);
                long currentTimeMillis = System.currentTimeMillis();
                if (userSetting.getValue() == null || currentTimeMillis - userSetting.getLastTS() >= TIMEOUT_7D) {
                    userSetting.setValue((Boolean) null);
                    userSetting.setLastTS(0);
                    if (isFetchingCodelessStatus.compareAndSet(false, true)) {
                        FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
                        FacebookSdk.getExecutor().execute(new v(currentTimeMillis));
                    }
                }
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: initializeCodelessSetupEnabledAsync$lambda-0  reason: not valid java name */
    public static final void m21initializeCodelessSetupEnabledAsync$lambda0(long j10) {
        Class<UserSettingsManager> cls = UserSettingsManager.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            try {
                if (advertiserIDCollectionEnabled.getValue()) {
                    FetchedAppSettingsManager fetchedAppSettingsManager = FetchedAppSettingsManager.INSTANCE;
                    FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
                    FetchedAppSettings queryAppSettings = FetchedAppSettingsManager.queryAppSettings(FacebookSdk.getApplicationId(), false);
                    if (queryAppSettings != null && queryAppSettings.getCodelessEventsEnabled()) {
                        AttributionIdentifiers attributionIdentifiers = AttributionIdentifiers.Companion.getAttributionIdentifiers(FacebookSdk.getApplicationContext());
                        String androidAdvertiserId = (attributionIdentifiers == null || attributionIdentifiers.getAndroidAdvertiserId() == null) ? null : attributionIdentifiers.getAndroidAdvertiserId();
                        if (androidAdvertiserId != null) {
                            Bundle bundle = new Bundle();
                            bundle.putString(ADVERTISER_ID_KEY, androidAdvertiserId);
                            bundle.putString("fields", EVENTS_CODELESS_SETUP_ENABLED);
                            GraphRequest newGraphPathRequest = GraphRequest.Companion.newGraphPathRequest((AccessToken) null, "app", (GraphRequest.Callback) null);
                            newGraphPathRequest.setParameters(bundle);
                            JSONObject jSONObject = newGraphPathRequest.executeAndWait().getJSONObject();
                            if (jSONObject != null) {
                                UserSetting userSetting = codelessSetupEnabled;
                                userSetting.setValue(Boolean.valueOf(jSONObject.optBoolean(EVENTS_CODELESS_SETUP_ENABLED, false)));
                                userSetting.setLastTS(j10);
                                INSTANCE.writeSettingToCache(userSetting);
                            }
                        }
                    }
                }
                isFetchingCodelessStatus.set(false);
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }

    private final void initializeIfNotInitialized() {
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
                if (FacebookSdk.isInitialized() && isInitialized.compareAndSet(false, true)) {
                    SharedPreferences sharedPreferences = FacebookSdk.getApplicationContext().getSharedPreferences(USER_SETTINGS, 0);
                    m.e(sharedPreferences, "FacebookSdk.getApplicationContext()\n            .getSharedPreferences(USER_SETTINGS, Context.MODE_PRIVATE)");
                    userSettingPref = sharedPreferences;
                    initializeUserSetting(autoLogAppEventsEnabled, advertiserIDCollectionEnabled, autoInitEnabled);
                    initializeCodelessSetupEnabledAsync();
                    logWarnings();
                    logIfSDKSettingsChanged();
                }
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    private final void initializeUserSetting(UserSetting... userSettingArr) {
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            int i10 = 0;
            try {
                int length = userSettingArr.length;
                while (i10 < length) {
                    UserSetting userSetting = userSettingArr[i10];
                    i10++;
                    if (userSetting == codelessSetupEnabled) {
                        initializeCodelessSetupEnabledAsync();
                    } else if (userSetting.getValue() == null) {
                        readSettingFromCache(userSetting);
                        if (userSetting.getValue() == null) {
                            loadSettingFromManifest(userSetting);
                        }
                    } else {
                        writeSettingToCache(userSetting);
                    }
                }
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    private final void loadSettingFromManifest(UserSetting userSetting) {
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                validateInitialized();
                FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
                Context applicationContext = FacebookSdk.getApplicationContext();
                ApplicationInfo applicationInfo = applicationContext.getPackageManager().getApplicationInfo(applicationContext.getPackageName(), 128);
                m.e(applicationInfo, "ctx.packageManager.getApplicationInfo(ctx.packageName, PackageManager.GET_META_DATA)");
                Bundle bundle = applicationInfo.metaData;
                if (bundle != null && bundle.containsKey(userSetting.getKey())) {
                    userSetting.setValue(Boolean.valueOf(applicationInfo.metaData.getBoolean(userSetting.getKey(), userSetting.getDefaultVal())));
                }
            } catch (PackageManager.NameNotFoundException e10) {
                Utility utility = Utility.INSTANCE;
                Utility.logd(TAG, (Exception) e10);
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    public static final void logIfAutoAppLinkEnabled() {
        Class<UserSettingsManager> cls = UserSettingsManager.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            try {
                FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
                Context applicationContext = FacebookSdk.getApplicationContext();
                ApplicationInfo applicationInfo = applicationContext.getPackageManager().getApplicationInfo(applicationContext.getPackageName(), 128);
                m.e(applicationInfo, "ctx.packageManager.getApplicationInfo(ctx.packageName, PackageManager.GET_META_DATA)");
                Bundle bundle = applicationInfo.metaData;
                if (bundle != null && bundle.getBoolean("com.facebook.sdk.AutoAppLinkEnabled", false)) {
                    InternalAppEventsLogger internalAppEventsLogger = new InternalAppEventsLogger(applicationContext);
                    Bundle bundle2 = new Bundle();
                    Utility utility = Utility.INSTANCE;
                    if (!Utility.isAutoAppLinkSetup()) {
                        bundle2.putString("SchemeWarning", AUTO_APP_LINK_WARNING);
                    }
                    internalAppEventsLogger.logEvent("fb_auto_applink", bundle2);
                }
            } catch (PackageManager.NameNotFoundException unused) {
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }

    private final void logIfSDKSettingsChanged() {
        int i10;
        int i11;
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                if (isInitialized.get()) {
                    FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
                    if (FacebookSdk.isInitialized()) {
                        Context applicationContext = FacebookSdk.getApplicationContext();
                        int i12 = 0;
                        int i13 = ((autoInitEnabled.getValue() ? 1 : 0) << 0) | 0 | ((autoLogAppEventsEnabled.getValue() ? 1 : 0) << 1) | ((advertiserIDCollectionEnabled.getValue() ? 1 : 0) << 2) | ((monitorEnabled.getValue() ? 1 : 0) << 3);
                        SharedPreferences sharedPreferences = userSettingPref;
                        if (sharedPreferences != null) {
                            int i14 = sharedPreferences.getInt(USER_SETTINGS_BITMASK, 0);
                            if (i14 != i13) {
                                SharedPreferences sharedPreferences2 = userSettingPref;
                                if (sharedPreferences2 != null) {
                                    sharedPreferences2.edit().putInt(USER_SETTINGS_BITMASK, i13).apply();
                                    try {
                                        ApplicationInfo applicationInfo = applicationContext.getPackageManager().getApplicationInfo(applicationContext.getPackageName(), 128);
                                        m.e(applicationInfo, "ctx.packageManager.getApplicationInfo(ctx.packageName, PackageManager.GET_META_DATA)");
                                        if (applicationInfo.metaData != null) {
                                            String[] strArr = {FacebookSdk.AUTO_INIT_ENABLED_PROPERTY, FacebookSdk.AUTO_LOG_APP_EVENTS_ENABLED_PROPERTY, FacebookSdk.ADVERTISER_ID_COLLECTION_ENABLED_PROPERTY, FacebookSdk.MONITOR_ENABLED_PROPERTY};
                                            boolean[] zArr = {true, true, true, true};
                                            int i15 = 0;
                                            i11 = 0;
                                            i10 = 0;
                                            while (true) {
                                                int i16 = i15 + 1;
                                                try {
                                                    i11 |= (applicationInfo.metaData.containsKey(strArr[i15]) ? 1 : 0) << i15;
                                                    i10 |= (applicationInfo.metaData.getBoolean(strArr[i15], zArr[i15]) ? 1 : 0) << i15;
                                                    if (i16 > 3) {
                                                        break;
                                                    }
                                                    i15 = i16;
                                                } catch (PackageManager.NameNotFoundException unused) {
                                                    i12 = i10;
                                                    i10 = i12;
                                                    i12 = i11;
                                                    InternalAppEventsLogger internalAppEventsLogger = new InternalAppEventsLogger(applicationContext);
                                                    Bundle bundle = new Bundle();
                                                    bundle.putInt("usage", i12);
                                                    bundle.putInt("initial", i10);
                                                    bundle.putInt("previous", i14);
                                                    bundle.putInt("current", i13);
                                                    internalAppEventsLogger.logChangedSettingsEvent(bundle);
                                                }
                                            }
                                            i12 = i11;
                                            InternalAppEventsLogger internalAppEventsLogger2 = new InternalAppEventsLogger(applicationContext);
                                            Bundle bundle2 = new Bundle();
                                            bundle2.putInt("usage", i12);
                                            bundle2.putInt("initial", i10);
                                            bundle2.putInt("previous", i14);
                                            bundle2.putInt("current", i13);
                                            internalAppEventsLogger2.logChangedSettingsEvent(bundle2);
                                        }
                                        i10 = 0;
                                        InternalAppEventsLogger internalAppEventsLogger22 = new InternalAppEventsLogger(applicationContext);
                                        Bundle bundle22 = new Bundle();
                                        bundle22.putInt("usage", i12);
                                        bundle22.putInt("initial", i10);
                                        bundle22.putInt("previous", i14);
                                        bundle22.putInt("current", i13);
                                        internalAppEventsLogger22.logChangedSettingsEvent(bundle22);
                                    } catch (PackageManager.NameNotFoundException unused2) {
                                        i11 = 0;
                                        i10 = i12;
                                        i12 = i11;
                                        InternalAppEventsLogger internalAppEventsLogger222 = new InternalAppEventsLogger(applicationContext);
                                        Bundle bundle222 = new Bundle();
                                        bundle222.putInt("usage", i12);
                                        bundle222.putInt("initial", i10);
                                        bundle222.putInt("previous", i14);
                                        bundle222.putInt("current", i13);
                                        internalAppEventsLogger222.logChangedSettingsEvent(bundle222);
                                    }
                                } else {
                                    m.x("userSettingPref");
                                    throw null;
                                }
                            }
                        } else {
                            m.x("userSettingPref");
                            throw null;
                        }
                    }
                }
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    private final void logWarnings() {
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
                Context applicationContext = FacebookSdk.getApplicationContext();
                ApplicationInfo applicationInfo = applicationContext.getPackageManager().getApplicationInfo(applicationContext.getPackageName(), 128);
                m.e(applicationInfo, "ctx.packageManager.getApplicationInfo(ctx.packageName, PackageManager.GET_META_DATA)");
                Bundle bundle = applicationInfo.metaData;
                if (bundle != null) {
                    boolean containsKey = bundle.containsKey(FacebookSdk.AUTO_LOG_APP_EVENTS_ENABLED_PROPERTY);
                    boolean containsKey2 = applicationInfo.metaData.containsKey(FacebookSdk.ADVERTISER_ID_COLLECTION_ENABLED_PROPERTY);
                    getAdvertiserIDCollectionEnabled();
                }
            } catch (PackageManager.NameNotFoundException unused) {
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    private final void readSettingFromCache(UserSetting userSetting) {
        String str = "";
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                validateInitialized();
                SharedPreferences sharedPreferences = userSettingPref;
                if (sharedPreferences != null) {
                    String string = sharedPreferences.getString(userSetting.getKey(), str);
                    if (string != null) {
                        str = string;
                    }
                    if (str.length() > 0) {
                        JSONObject jSONObject = new JSONObject(str);
                        userSetting.setValue(Boolean.valueOf(jSONObject.getBoolean("value")));
                        userSetting.setLastTS(jSONObject.getLong(LAST_TIMESTAMP));
                        return;
                    }
                    return;
                }
                m.x("userSettingPref");
                throw null;
            } catch (JSONException e10) {
                Utility utility = Utility.INSTANCE;
                Utility.logd(TAG, (Exception) e10);
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    public static final void setAdvertiserIDCollectionEnabled(boolean z10) {
        Class<UserSettingsManager> cls = UserSettingsManager.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            try {
                UserSetting userSetting = advertiserIDCollectionEnabled;
                userSetting.setValue(Boolean.valueOf(z10));
                userSetting.setLastTS(System.currentTimeMillis());
                if (isInitialized.get()) {
                    INSTANCE.writeSettingToCache(userSetting);
                } else {
                    INSTANCE.initializeIfNotInitialized();
                }
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }

    public static final void setAutoInitEnabled(boolean z10) {
        Class<UserSettingsManager> cls = UserSettingsManager.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            try {
                UserSetting userSetting = autoInitEnabled;
                userSetting.setValue(Boolean.valueOf(z10));
                userSetting.setLastTS(System.currentTimeMillis());
                if (isInitialized.get()) {
                    INSTANCE.writeSettingToCache(userSetting);
                } else {
                    INSTANCE.initializeIfNotInitialized();
                }
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }

    public static final void setAutoLogAppEventsEnabled(boolean z10) {
        Class<UserSettingsManager> cls = UserSettingsManager.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            try {
                UserSetting userSetting = autoLogAppEventsEnabled;
                userSetting.setValue(Boolean.valueOf(z10));
                userSetting.setLastTS(System.currentTimeMillis());
                if (isInitialized.get()) {
                    INSTANCE.writeSettingToCache(userSetting);
                } else {
                    INSTANCE.initializeIfNotInitialized();
                }
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }

    public static final void setMonitorEnabled(boolean z10) {
        Class<UserSettingsManager> cls = UserSettingsManager.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            try {
                UserSetting userSetting = monitorEnabled;
                userSetting.setValue(Boolean.valueOf(z10));
                userSetting.setLastTS(System.currentTimeMillis());
                if (isInitialized.get()) {
                    INSTANCE.writeSettingToCache(userSetting);
                } else {
                    INSTANCE.initializeIfNotInitialized();
                }
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }

    private final void validateInitialized() {
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                if (!isInitialized.get()) {
                    throw new FacebookSdkNotInitializedException("The UserSettingManager has not been initialized successfully");
                }
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    private final void writeSettingToCache(UserSetting userSetting) {
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                validateInitialized();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("value", userSetting.getValue());
                jSONObject.put(LAST_TIMESTAMP, userSetting.getLastTS());
                SharedPreferences sharedPreferences = userSettingPref;
                if (sharedPreferences != null) {
                    sharedPreferences.edit().putString(userSetting.getKey(), jSONObject.toString()).apply();
                    logIfSDKSettingsChanged();
                    return;
                }
                m.x("userSettingPref");
                throw null;
            } catch (Exception e10) {
                Utility utility = Utility.INSTANCE;
                Utility.logd(TAG, e10);
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }
}
