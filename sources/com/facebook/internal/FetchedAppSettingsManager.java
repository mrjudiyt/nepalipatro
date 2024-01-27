package com.facebook.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.AccessToken;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.appevents.codeless.internal.UnityReflection;
import com.facebook.appevents.internal.AutomaticAnalyticsLogger;
import com.facebook.appevents.internal.Constants;
import com.facebook.internal.FacebookRequestErrorClassification;
import com.facebook.internal.FetchedAppSettings;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.m;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: FetchedAppSettingsManager.kt */
public final class FetchedAppSettingsManager {
    private static final String APPLICATION_FIELDS = "fields";
    private static final String APP_SETTINGS_PREFS_KEY_FORMAT = "com.facebook.internal.APP_SETTINGS.%s";
    private static final String APP_SETTINGS_PREFS_STORE = "com.facebook.internal.preferences.APP_SETTINGS";
    private static final String APP_SETTING_ANDROID_SDK_ERROR_CATEGORIES = "android_sdk_error_categories";
    private static final String APP_SETTING_APP_EVENTS_AAM_RULE = "aam_rules";
    private static final String APP_SETTING_APP_EVENTS_EVENT_BINDINGS = "auto_event_mapping_android";
    private static final String APP_SETTING_APP_EVENTS_FEATURE_BITMASK = "app_events_feature_bitmask";
    private static final String APP_SETTING_APP_EVENTS_SESSION_TIMEOUT = "app_events_session_timeout";
    private static final String APP_SETTING_DIALOG_CONFIGS = "android_dialog_configs";
    private static final List<String> APP_SETTING_FIELDS = p.g(APP_SETTING_SUPPORTS_IMPLICIT_SDK_LOGGING, APP_SETTING_NUX_CONTENT, APP_SETTING_NUX_ENABLED, APP_SETTING_DIALOG_CONFIGS, APP_SETTING_ANDROID_SDK_ERROR_CATEGORIES, APP_SETTING_APP_EVENTS_SESSION_TIMEOUT, APP_SETTING_APP_EVENTS_FEATURE_BITMASK, APP_SETTING_APP_EVENTS_EVENT_BINDINGS, APP_SETTING_SMART_LOGIN_OPTIONS, SMART_LOGIN_BOOKMARK_ICON_URL, SMART_LOGIN_MENU_ICON_URL, APP_SETTING_RESTRICTIVE_EVENT_FILTER_FIELD, APP_SETTING_APP_EVENTS_AAM_RULE, SUGGESTED_EVENTS_SETTING);
    private static final String APP_SETTING_NUX_CONTENT = "gdpv4_nux_content";
    private static final String APP_SETTING_NUX_ENABLED = "gdpv4_nux_enabled";
    private static final String APP_SETTING_RESTRICTIVE_EVENT_FILTER_FIELD = "restrictive_data_filter_params";
    private static final String APP_SETTING_SMART_LOGIN_OPTIONS = "seamless_login";
    private static final String APP_SETTING_SUPPORTS_IMPLICIT_SDK_LOGGING = "supports_implicit_sdk_logging";
    private static final int AUTOMATIC_LOGGING_ENABLED_BITMASK_FIELD = 8;
    private static final int CODELESS_EVENTS_ENABLED_BITMASK_FIELD = 32;
    private static final int IAP_AUTOMATIC_LOGGING_ENABLED_BITMASK_FIELD = 16;
    public static final FetchedAppSettingsManager INSTANCE = new FetchedAppSettingsManager();
    private static final int MONITOR_ENABLED_BITMASK_FIELD = 16384;
    private static final String SDK_UPDATE_MESSAGE = "sdk_update_message";
    private static final String SMART_LOGIN_BOOKMARK_ICON_URL = "smart_login_bookmark_icon_url";
    private static final String SMART_LOGIN_MENU_ICON_URL = "smart_login_menu_icon_url";
    private static final String SUGGESTED_EVENTS_SETTING = "suggested_events_setting";
    private static final String TAG = FetchedAppSettingsManager.class.getSimpleName();
    private static final int TRACK_UNINSTALL_ENABLED_BITMASK_FIELD = 256;
    private static final Map<String, FetchedAppSettings> fetchedAppSettings = new ConcurrentHashMap();
    private static final ConcurrentLinkedQueue<FetchedAppSettingsCallback> fetchedAppSettingsCallbacks = new ConcurrentLinkedQueue<>();
    private static boolean isUnityInit;
    private static final AtomicReference<FetchAppSettingState> loadingState = new AtomicReference<>(FetchAppSettingState.NOT_LOADED);
    private static boolean printedSDKUpdatedMessage;
    private static JSONArray unityEventBindings;

    /* compiled from: FetchedAppSettingsManager.kt */
    public enum FetchAppSettingState {
        NOT_LOADED,
        LOADING,
        SUCCESS,
        ERROR
    }

    /* compiled from: FetchedAppSettingsManager.kt */
    public interface FetchedAppSettingsCallback {
        void onError();

        void onSuccess(FetchedAppSettings fetchedAppSettings);
    }

    private FetchedAppSettingsManager() {
    }

    public static final void getAppSettingsAsync(FetchedAppSettingsCallback fetchedAppSettingsCallback) {
        m.f(fetchedAppSettingsCallback, "callback");
        fetchedAppSettingsCallbacks.add(fetchedAppSettingsCallback);
        loadAppSettingsAsync();
    }

    private final JSONObject getAppSettingsQueryResponse(String str) {
        Bundle bundle = new Bundle();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(APP_SETTING_FIELDS);
        bundle.putString("fields", TextUtils.join(",", arrayList));
        GraphRequest newGraphPathRequest = GraphRequest.Companion.newGraphPathRequest((AccessToken) null, "app", (GraphRequest.Callback) null);
        newGraphPathRequest.setForceApplicationRequest(true);
        newGraphPathRequest.setParameters(bundle);
        JSONObject jsonObject = newGraphPathRequest.executeAndWait().getJsonObject();
        return jsonObject == null ? new JSONObject() : jsonObject;
    }

    public static final FetchedAppSettings getAppSettingsWithoutQuery(String str) {
        if (str != null) {
            return fetchedAppSettings.get(str);
        }
        return null;
    }

    public static final void loadAppSettingsAsync() {
        FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
        Context applicationContext = FacebookSdk.getApplicationContext();
        String applicationId = FacebookSdk.getApplicationId();
        Utility utility = Utility.INSTANCE;
        if (Utility.isNullOrEmpty(applicationId)) {
            loadingState.set(FetchAppSettingState.ERROR);
            INSTANCE.pollCallbacks();
        } else if (fetchedAppSettings.containsKey(applicationId)) {
            loadingState.set(FetchAppSettingState.SUCCESS);
            INSTANCE.pollCallbacks();
        } else {
            AtomicReference<FetchAppSettingState> atomicReference = loadingState;
            FetchAppSettingState fetchAppSettingState = FetchAppSettingState.NOT_LOADED;
            FetchAppSettingState fetchAppSettingState2 = FetchAppSettingState.LOADING;
            if (!(atomicReference.compareAndSet(fetchAppSettingState, fetchAppSettingState2) || atomicReference.compareAndSet(FetchAppSettingState.ERROR, fetchAppSettingState2))) {
                INSTANCE.pollCallbacks();
                return;
            }
            b0 b0Var = b0.f15559a;
            String format = String.format(APP_SETTINGS_PREFS_KEY_FORMAT, Arrays.copyOf(new Object[]{applicationId}, 1));
            m.e(format, "java.lang.String.format(format, *args)");
            FacebookSdk.getExecutor().execute(new g(applicationContext, format, applicationId));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: loadAppSettingsAsync$lambda-0  reason: not valid java name */
    public static final void m95loadAppSettingsAsync$lambda0(Context context, String str, String str2) {
        FetchAppSettingState fetchAppSettingState;
        JSONObject jSONObject;
        m.f(context, "$context");
        m.f(str, "$settingsKey");
        m.f(str2, "$applicationId");
        SharedPreferences sharedPreferences = context.getSharedPreferences(APP_SETTINGS_PREFS_STORE, 0);
        FetchedAppSettings fetchedAppSettings2 = null;
        String string = sharedPreferences.getString(str, (String) null);
        Utility utility = Utility.INSTANCE;
        if (!Utility.isNullOrEmpty(string)) {
            if (string != null) {
                try {
                    jSONObject = new JSONObject(string);
                } catch (JSONException e10) {
                    Utility utility2 = Utility.INSTANCE;
                    Utility.logd(Utility.LOG_TAG, (Exception) e10);
                    jSONObject = null;
                }
                if (jSONObject != null) {
                    fetchedAppSettings2 = INSTANCE.parseAppSettingsFromJSON$facebook_core_release(str2, jSONObject);
                }
            } else {
                throw new IllegalStateException("Required value was null.".toString());
            }
        }
        FetchedAppSettingsManager fetchedAppSettingsManager = INSTANCE;
        JSONObject appSettingsQueryResponse = fetchedAppSettingsManager.getAppSettingsQueryResponse(str2);
        if (appSettingsQueryResponse != null) {
            fetchedAppSettingsManager.parseAppSettingsFromJSON$facebook_core_release(str2, appSettingsQueryResponse);
            sharedPreferences.edit().putString(str, appSettingsQueryResponse.toString()).apply();
        }
        if (fetchedAppSettings2 != null) {
            String sdkUpdateMessage = fetchedAppSettings2.getSdkUpdateMessage();
            if (!printedSDKUpdatedMessage && sdkUpdateMessage != null && sdkUpdateMessage.length() > 0) {
                printedSDKUpdatedMessage = true;
            }
        }
        FetchedAppGateKeepersManager fetchedAppGateKeepersManager = FetchedAppGateKeepersManager.INSTANCE;
        FetchedAppGateKeepersManager.queryAppGateKeepers(str2, true);
        AutomaticAnalyticsLogger automaticAnalyticsLogger = AutomaticAnalyticsLogger.INSTANCE;
        AutomaticAnalyticsLogger.logActivateAppEvent();
        AtomicReference<FetchAppSettingState> atomicReference = loadingState;
        if (fetchedAppSettings.containsKey(str2)) {
            fetchAppSettingState = FetchAppSettingState.SUCCESS;
        } else {
            fetchAppSettingState = FetchAppSettingState.ERROR;
        }
        atomicReference.set(fetchAppSettingState);
        fetchedAppSettingsManager.pollCallbacks();
    }

    private final Map<String, Map<String, FetchedAppSettings.DialogFeatureConfig>> parseDialogConfigurations(JSONObject jSONObject) {
        JSONArray optJSONArray;
        HashMap hashMap = new HashMap();
        if (jSONObject != null && (optJSONArray = jSONObject.optJSONArray("data")) != null) {
            int i10 = 0;
            int length = optJSONArray.length();
            if (length > 0) {
                while (true) {
                    int i11 = i10 + 1;
                    FetchedAppSettings.DialogFeatureConfig.Companion companion = FetchedAppSettings.DialogFeatureConfig.Companion;
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i10);
                    m.e(optJSONObject, "dialogConfigData.optJSONObject(i)");
                    FetchedAppSettings.DialogFeatureConfig parseDialogConfig = companion.parseDialogConfig(optJSONObject);
                    if (parseDialogConfig != null) {
                        String dialogName = parseDialogConfig.getDialogName();
                        Map map = (Map) hashMap.get(dialogName);
                        if (map == null) {
                            map = new HashMap();
                            hashMap.put(dialogName, map);
                        }
                        map.put(parseDialogConfig.getFeatureName(), parseDialogConfig);
                    }
                    if (i11 >= length) {
                        break;
                    }
                    i10 = i11;
                }
            }
        }
        return hashMap;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0060, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized void pollCallbacks() {
        /*
            r4 = this;
            monitor-enter(r4)
            java.util.concurrent.atomic.AtomicReference<com.facebook.internal.FetchedAppSettingsManager$FetchAppSettingState> r0 = loadingState     // Catch:{ all -> 0x0061 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0061 }
            com.facebook.internal.FetchedAppSettingsManager$FetchAppSettingState r0 = (com.facebook.internal.FetchedAppSettingsManager.FetchAppSettingState) r0     // Catch:{ all -> 0x0061 }
            com.facebook.internal.FetchedAppSettingsManager$FetchAppSettingState r1 = com.facebook.internal.FetchedAppSettingsManager.FetchAppSettingState.NOT_LOADED     // Catch:{ all -> 0x0061 }
            if (r1 == r0) goto L_0x005f
            com.facebook.internal.FetchedAppSettingsManager$FetchAppSettingState r1 = com.facebook.internal.FetchedAppSettingsManager.FetchAppSettingState.LOADING     // Catch:{ all -> 0x0061 }
            if (r1 != r0) goto L_0x0012
            goto L_0x005f
        L_0x0012:
            com.facebook.FacebookSdk r1 = com.facebook.FacebookSdk.INSTANCE     // Catch:{ all -> 0x0061 }
            java.lang.String r1 = com.facebook.FacebookSdk.getApplicationId()     // Catch:{ all -> 0x0061 }
            java.util.Map<java.lang.String, com.facebook.internal.FetchedAppSettings> r2 = fetchedAppSettings     // Catch:{ all -> 0x0061 }
            java.lang.Object r1 = r2.get(r1)     // Catch:{ all -> 0x0061 }
            com.facebook.internal.FetchedAppSettings r1 = (com.facebook.internal.FetchedAppSettings) r1     // Catch:{ all -> 0x0061 }
            android.os.Handler r2 = new android.os.Handler     // Catch:{ all -> 0x0061 }
            android.os.Looper r3 = android.os.Looper.getMainLooper()     // Catch:{ all -> 0x0061 }
            r2.<init>(r3)     // Catch:{ all -> 0x0061 }
            com.facebook.internal.FetchedAppSettingsManager$FetchAppSettingState r3 = com.facebook.internal.FetchedAppSettingsManager.FetchAppSettingState.ERROR     // Catch:{ all -> 0x0061 }
            if (r3 != r0) goto L_0x0046
        L_0x002d:
            java.util.concurrent.ConcurrentLinkedQueue<com.facebook.internal.FetchedAppSettingsManager$FetchedAppSettingsCallback> r0 = fetchedAppSettingsCallbacks     // Catch:{ all -> 0x0061 }
            boolean r1 = r0.isEmpty()     // Catch:{ all -> 0x0061 }
            if (r1 != 0) goto L_0x0044
            java.lang.Object r0 = r0.poll()     // Catch:{ all -> 0x0061 }
            com.facebook.internal.FetchedAppSettingsManager$FetchedAppSettingsCallback r0 = (com.facebook.internal.FetchedAppSettingsManager.FetchedAppSettingsCallback) r0     // Catch:{ all -> 0x0061 }
            com.facebook.internal.h r1 = new com.facebook.internal.h     // Catch:{ all -> 0x0061 }
            r1.<init>(r0)     // Catch:{ all -> 0x0061 }
            r2.post(r1)     // Catch:{ all -> 0x0061 }
            goto L_0x002d
        L_0x0044:
            monitor-exit(r4)
            return
        L_0x0046:
            java.util.concurrent.ConcurrentLinkedQueue<com.facebook.internal.FetchedAppSettingsManager$FetchedAppSettingsCallback> r0 = fetchedAppSettingsCallbacks     // Catch:{ all -> 0x0061 }
            boolean r3 = r0.isEmpty()     // Catch:{ all -> 0x0061 }
            if (r3 != 0) goto L_0x005d
            java.lang.Object r0 = r0.poll()     // Catch:{ all -> 0x0061 }
            com.facebook.internal.FetchedAppSettingsManager$FetchedAppSettingsCallback r0 = (com.facebook.internal.FetchedAppSettingsManager.FetchedAppSettingsCallback) r0     // Catch:{ all -> 0x0061 }
            com.facebook.internal.i r3 = new com.facebook.internal.i     // Catch:{ all -> 0x0061 }
            r3.<init>(r0, r1)     // Catch:{ all -> 0x0061 }
            r2.post(r3)     // Catch:{ all -> 0x0061 }
            goto L_0x0046
        L_0x005d:
            monitor-exit(r4)
            return
        L_0x005f:
            monitor-exit(r4)
            return
        L_0x0061:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.FetchedAppSettingsManager.pollCallbacks():void");
    }

    /* access modifiers changed from: private */
    /* renamed from: pollCallbacks$lambda-1  reason: not valid java name */
    public static final void m96pollCallbacks$lambda1(FetchedAppSettingsCallback fetchedAppSettingsCallback) {
        fetchedAppSettingsCallback.onError();
    }

    /* access modifiers changed from: private */
    /* renamed from: pollCallbacks$lambda-2  reason: not valid java name */
    public static final void m97pollCallbacks$lambda2(FetchedAppSettingsCallback fetchedAppSettingsCallback, FetchedAppSettings fetchedAppSettings2) {
        fetchedAppSettingsCallback.onSuccess(fetchedAppSettings2);
    }

    public static final FetchedAppSettings queryAppSettings(String str, boolean z10) {
        m.f(str, "applicationId");
        if (!z10) {
            Map<String, FetchedAppSettings> map = fetchedAppSettings;
            if (map.containsKey(str)) {
                return map.get(str);
            }
        }
        FetchedAppSettingsManager fetchedAppSettingsManager = INSTANCE;
        JSONObject appSettingsQueryResponse = fetchedAppSettingsManager.getAppSettingsQueryResponse(str);
        if (appSettingsQueryResponse == null) {
            return null;
        }
        FetchedAppSettings parseAppSettingsFromJSON$facebook_core_release = fetchedAppSettingsManager.parseAppSettingsFromJSON$facebook_core_release(str, appSettingsQueryResponse);
        FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
        if (m.a(str, FacebookSdk.getApplicationId())) {
            loadingState.set(FetchAppSettingState.SUCCESS);
            fetchedAppSettingsManager.pollCallbacks();
        }
        return parseAppSettingsFromJSON$facebook_core_release;
    }

    public static final void setIsUnityInit(boolean z10) {
        isUnityInit = z10;
        if (unityEventBindings != null && z10) {
            UnityReflection unityReflection = UnityReflection.INSTANCE;
            UnityReflection.sendEventMapping(String.valueOf(unityEventBindings));
        }
    }

    public final FetchedAppSettings parseAppSettingsFromJSON$facebook_core_release(String str, JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        m.f(str, "applicationId");
        m.f(jSONObject2, "settingsJSON");
        JSONArray optJSONArray = jSONObject2.optJSONArray(APP_SETTING_ANDROID_SDK_ERROR_CATEGORIES);
        FacebookRequestErrorClassification.Companion companion = FacebookRequestErrorClassification.Companion;
        FacebookRequestErrorClassification createFromJSON = companion.createFromJSON(optJSONArray);
        if (createFromJSON == null) {
            createFromJSON = companion.getDefaultErrorClassification();
        }
        FacebookRequestErrorClassification facebookRequestErrorClassification = createFromJSON;
        int optInt = jSONObject2.optInt(APP_SETTING_APP_EVENTS_FEATURE_BITMASK, 0);
        boolean z10 = (optInt & 8) != 0;
        boolean z11 = (optInt & 16) != 0;
        boolean z12 = (optInt & 32) != 0;
        boolean z13 = (optInt & 256) != 0;
        boolean z14 = (optInt & MONITOR_ENABLED_BITMASK_FIELD) != 0;
        JSONArray optJSONArray2 = jSONObject2.optJSONArray(APP_SETTING_APP_EVENTS_EVENT_BINDINGS);
        unityEventBindings = optJSONArray2;
        if (optJSONArray2 != null) {
            InternalSettings internalSettings = InternalSettings.INSTANCE;
            if (InternalSettings.isUnityApp()) {
                UnityReflection unityReflection = UnityReflection.INSTANCE;
                UnityReflection.sendEventMapping(optJSONArray2 == null ? null : optJSONArray2.toString());
            }
        }
        boolean optBoolean = jSONObject2.optBoolean(APP_SETTING_SUPPORTS_IMPLICIT_SDK_LOGGING, false);
        String optString = jSONObject2.optString(APP_SETTING_NUX_CONTENT, "");
        String str2 = optString;
        m.e(optString, "settingsJSON.optString(APP_SETTING_NUX_CONTENT, \"\")");
        boolean optBoolean2 = jSONObject2.optBoolean(APP_SETTING_NUX_ENABLED, false);
        Constants constants = Constants.INSTANCE;
        int optInt2 = jSONObject2.optInt(APP_SETTING_APP_EVENTS_SESSION_TIMEOUT, Constants.getDefaultAppEventsSessionTimeoutInSeconds());
        EnumSet<SmartLoginOption> parseOptions = SmartLoginOption.Companion.parseOptions(jSONObject2.optLong(APP_SETTING_SMART_LOGIN_OPTIONS));
        Map<String, Map<String, FetchedAppSettings.DialogFeatureConfig>> parseDialogConfigurations = parseDialogConfigurations(jSONObject2.optJSONObject(APP_SETTING_DIALOG_CONFIGS));
        String optString2 = jSONObject2.optString(SMART_LOGIN_BOOKMARK_ICON_URL);
        m.e(optString2, "settingsJSON.optString(SMART_LOGIN_BOOKMARK_ICON_URL)");
        String optString3 = jSONObject2.optString(SMART_LOGIN_MENU_ICON_URL);
        String str3 = optString3;
        FetchedAppSettings fetchedAppSettings2 = r3;
        m.e(optString3, "settingsJSON.optString(SMART_LOGIN_MENU_ICON_URL)");
        String optString4 = jSONObject2.optString(SDK_UPDATE_MESSAGE);
        m.e(optString4, "settingsJSON.optString(SDK_UPDATE_MESSAGE)");
        FetchedAppSettings fetchedAppSettings3 = new FetchedAppSettings(optBoolean, str2, optBoolean2, optInt2, parseOptions, parseDialogConfigurations, z10, facebookRequestErrorClassification, optString2, str3, z11, z12, optJSONArray2, optString4, z13, z14, jSONObject2.optString(APP_SETTING_APP_EVENTS_AAM_RULE), jSONObject2.optString(SUGGESTED_EVENTS_SETTING), jSONObject2.optString(APP_SETTING_RESTRICTIVE_EVENT_FILTER_FIELD));
        FetchedAppSettings fetchedAppSettings4 = fetchedAppSettings2;
        fetchedAppSettings.put(str, fetchedAppSettings4);
        return fetchedAppSettings4;
    }
}
