package com.facebook.appevents.eventdeactivation;

import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEvent;
import com.facebook.internal.FetchedAppSettings;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.Utility;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import io.flutter.plugins.firebase.analytics.Constants;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.m;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: EventDeactivationManager.kt */
public final class EventDeactivationManager {
    public static final EventDeactivationManager INSTANCE = new EventDeactivationManager();
    private static final Set<String> deprecatedEvents = new HashSet();
    private static final List<DeprecatedParamFilter> deprecatedParamFilters = new ArrayList();
    private static boolean enabled;

    /* compiled from: EventDeactivationManager.kt */
    public static final class DeprecatedParamFilter {
        private List<String> deprecateParams;
        private String eventName;

        public DeprecatedParamFilter(String str, List<String> list) {
            m.f(str, Constants.EVENT_NAME);
            m.f(list, "deprecateParams");
            this.eventName = str;
            this.deprecateParams = list;
        }

        public final List<String> getDeprecateParams() {
            return this.deprecateParams;
        }

        public final String getEventName() {
            return this.eventName;
        }

        public final void setDeprecateParams(List<String> list) {
            m.f(list, "<set-?>");
            this.deprecateParams = list;
        }

        public final void setEventName(String str) {
            m.f(str, "<set-?>");
            this.eventName = str;
        }
    }

    private EventDeactivationManager() {
    }

    public static final void enable() {
        Class<EventDeactivationManager> cls = EventDeactivationManager.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            try {
                EventDeactivationManager eventDeactivationManager = INSTANCE;
                enabled = true;
                eventDeactivationManager.initialize();
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }

    private final synchronized void initialize() {
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                FetchedAppSettingsManager fetchedAppSettingsManager = FetchedAppSettingsManager.INSTANCE;
                FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
                boolean z10 = false;
                FetchedAppSettings queryAppSettings = FetchedAppSettingsManager.queryAppSettings(FacebookSdk.getApplicationId(), false);
                if (queryAppSettings != null) {
                    String restrictiveDataSetting = queryAppSettings.getRestrictiveDataSetting();
                    if (restrictiveDataSetting != null) {
                        if (restrictiveDataSetting.length() > 0) {
                            z10 = true;
                        }
                        if (z10) {
                            JSONObject jSONObject = new JSONObject(restrictiveDataSetting);
                            deprecatedParamFilters.clear();
                            Iterator<String> keys = jSONObject.keys();
                            while (keys.hasNext()) {
                                String next = keys.next();
                                JSONObject jSONObject2 = jSONObject.getJSONObject(next);
                                if (jSONObject2 != null) {
                                    if (jSONObject2.optBoolean("is_deprecated_event")) {
                                        Set<String> set = deprecatedEvents;
                                        m.e(next, io.flutter.plugins.firebase.crashlytics.Constants.KEY);
                                        set.add(next);
                                    } else {
                                        JSONArray optJSONArray = jSONObject2.optJSONArray("deprecated_param");
                                        m.e(next, io.flutter.plugins.firebase.crashlytics.Constants.KEY);
                                        DeprecatedParamFilter deprecatedParamFilter = new DeprecatedParamFilter(next, new ArrayList());
                                        if (optJSONArray != null) {
                                            Utility utility = Utility.INSTANCE;
                                            deprecatedParamFilter.setDeprecateParams(Utility.convertJSONArrayToList(optJSONArray));
                                        }
                                        deprecatedParamFilters.add(deprecatedParamFilter);
                                    }
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

    public static final void processDeprecatedParameters(Map<String, String> map, String str) {
        Class<EventDeactivationManager> cls = EventDeactivationManager.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            try {
                m.f(map, "parameters");
                m.f(str, Constants.EVENT_NAME);
                if (enabled) {
                    ArrayList<String> arrayList = new ArrayList<>(map.keySet());
                    for (DeprecatedParamFilter deprecatedParamFilter : new ArrayList(deprecatedParamFilters)) {
                        if (m.a(deprecatedParamFilter.getEventName(), str)) {
                            for (String str2 : arrayList) {
                                if (deprecatedParamFilter.getDeprecateParams().contains(str2)) {
                                    map.remove(str2);
                                }
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }

    public static final void processEvents(List<AppEvent> list) {
        Class<EventDeactivationManager> cls = EventDeactivationManager.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            try {
                m.f(list, "events");
                if (enabled) {
                    Iterator<AppEvent> it = list.iterator();
                    while (it.hasNext()) {
                        if (deprecatedEvents.contains(it.next().getName())) {
                            it.remove();
                        }
                    }
                }
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }
}
