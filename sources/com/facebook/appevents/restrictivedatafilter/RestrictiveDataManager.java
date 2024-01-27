package com.facebook.appevents.restrictivedatafilter;

import com.facebook.FacebookSdk;
import com.facebook.internal.FetchedAppSettings;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.Utility;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import io.flutter.plugins.firebase.analytics.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.m;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: RestrictiveDataManager.kt */
public final class RestrictiveDataManager {
    public static final RestrictiveDataManager INSTANCE = new RestrictiveDataManager();
    private static final String PROCESS_EVENT_NAME = "process_event_name";
    private static final String REPLACEMENT_STRING = "_removed_";
    private static final String RESTRICTIVE_PARAM = "restrictive_param";
    private static final String RESTRICTIVE_PARAM_KEY = "_restrictedParams";
    private static final String TAG = RestrictiveDataManager.class.getCanonicalName();
    private static boolean enabled;
    private static final Set<String> restrictedEvents = new CopyOnWriteArraySet();
    private static final List<RestrictiveParamFilter> restrictiveParamFilters = new ArrayList();

    /* compiled from: RestrictiveDataManager.kt */
    public static final class RestrictiveParamFilter {
        private String eventName;
        private Map<String, String> restrictiveParams;

        public RestrictiveParamFilter(String str, Map<String, String> map) {
            m.f(str, Constants.EVENT_NAME);
            m.f(map, "restrictiveParams");
            this.eventName = str;
            this.restrictiveParams = map;
        }

        public final String getEventName() {
            return this.eventName;
        }

        public final Map<String, String> getRestrictiveParams() {
            return this.restrictiveParams;
        }

        public final void setEventName(String str) {
            m.f(str, "<set-?>");
            this.eventName = str;
        }

        public final void setRestrictiveParams(Map<String, String> map) {
            m.f(map, "<set-?>");
            this.restrictiveParams = map;
        }
    }

    private RestrictiveDataManager() {
    }

    public static final void enable() {
        Class<RestrictiveDataManager> cls = RestrictiveDataManager.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            try {
                RestrictiveDataManager restrictiveDataManager = INSTANCE;
                enabled = true;
                restrictiveDataManager.initialize();
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }

    private final String getMatchedRuleType(String str, String str2) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            for (RestrictiveParamFilter restrictiveParamFilter : new ArrayList(restrictiveParamFilters)) {
                if (restrictiveParamFilter != null) {
                    if (m.a(str, restrictiveParamFilter.getEventName())) {
                        for (String next : restrictiveParamFilter.getRestrictiveParams().keySet()) {
                            if (m.a(str2, next)) {
                                return restrictiveParamFilter.getRestrictiveParams().get(next);
                            }
                        }
                        continue;
                    } else {
                        continue;
                    }
                }
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
        return null;
    }

    private final void initialize() {
        String restrictiveDataSetting;
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                FetchedAppSettingsManager fetchedAppSettingsManager = FetchedAppSettingsManager.INSTANCE;
                FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
                boolean z10 = false;
                FetchedAppSettings queryAppSettings = FetchedAppSettingsManager.queryAppSettings(FacebookSdk.getApplicationId(), false);
                if (queryAppSettings != null && (restrictiveDataSetting = queryAppSettings.getRestrictiveDataSetting()) != null) {
                    if (restrictiveDataSetting.length() == 0) {
                        z10 = true;
                    }
                    if (!z10) {
                        JSONObject jSONObject = new JSONObject(restrictiveDataSetting);
                        restrictiveParamFilters.clear();
                        restrictedEvents.clear();
                        Iterator<String> keys = jSONObject.keys();
                        while (keys.hasNext()) {
                            String next = keys.next();
                            JSONObject jSONObject2 = jSONObject.getJSONObject(next);
                            if (jSONObject2 != null) {
                                JSONObject optJSONObject = jSONObject2.optJSONObject(RESTRICTIVE_PARAM);
                                m.e(next, io.flutter.plugins.firebase.crashlytics.Constants.KEY);
                                RestrictiveParamFilter restrictiveParamFilter = new RestrictiveParamFilter(next, new HashMap());
                                if (optJSONObject != null) {
                                    Utility utility = Utility.INSTANCE;
                                    restrictiveParamFilter.setRestrictiveParams(Utility.convertJSONObjectToStringMap(optJSONObject));
                                    restrictiveParamFilters.add(restrictiveParamFilter);
                                }
                                if (jSONObject2.has(PROCESS_EVENT_NAME)) {
                                    restrictedEvents.add(restrictiveParamFilter.getEventName());
                                }
                            }
                        }
                    }
                }
            } catch (Exception unused) {
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    private final boolean isRestrictedEvent(String str) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return false;
        }
        try {
            return restrictedEvents.contains(str);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return false;
        }
    }

    public static final String processEvent(String str) {
        Class<RestrictiveDataManager> cls = RestrictiveDataManager.class;
        if (CrashShieldHandler.isObjectCrashing(cls)) {
            return null;
        }
        try {
            m.f(str, Constants.EVENT_NAME);
            return (!enabled || !INSTANCE.isRestrictedEvent(str)) ? str : REPLACEMENT_STRING;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, cls);
            return null;
        }
    }

    public static final void processParameters(Map<String, String> map, String str) {
        Class<RestrictiveDataManager> cls = RestrictiveDataManager.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            try {
                m.f(map, "parameters");
                m.f(str, Constants.EVENT_NAME);
                if (enabled) {
                    HashMap hashMap = new HashMap();
                    for (String str2 : new ArrayList(map.keySet())) {
                        String matchedRuleType = INSTANCE.getMatchedRuleType(str, str2);
                        if (matchedRuleType != null) {
                            hashMap.put(str2, matchedRuleType);
                            map.remove(str2);
                        }
                    }
                    if (!hashMap.isEmpty()) {
                        try {
                            JSONObject jSONObject = new JSONObject();
                            for (Map.Entry entry : hashMap.entrySet()) {
                                jSONObject.put((String) entry.getKey(), (String) entry.getValue());
                            }
                            map.put(RESTRICTIVE_PARAM_KEY, jSONObject.toString());
                        } catch (JSONException unused) {
                        }
                    }
                }
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }
}
