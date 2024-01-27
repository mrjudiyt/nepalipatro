package com.facebook.appevents.codeless.internal;

import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.share.internal.ShareConstants;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import io.flutter.plugins.firebase.analytics.Constants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: EventBinding.kt */
public final class EventBinding {
    public static final Companion Companion = new Companion((g) null);
    private final String activityName;
    private final String appVersion;
    private final String componentId;
    private final String eventName;
    private final MappingMethod method;
    private final List<ParameterComponent> parameters;
    private final List<PathComponent> path;
    private final String pathType;
    private final ActionType type;

    /* compiled from: EventBinding.kt */
    public enum ActionType {
        CLICK,
        SELECTED,
        TEXT_CHANGED
    }

    /* compiled from: EventBinding.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public final EventBinding getInstanceFromJson(JSONObject jSONObject) {
            int length;
            m.f(jSONObject, "mapping");
            String string = jSONObject.getString("event_name");
            String string2 = jSONObject.getString("method");
            m.e(string2, "mapping.getString(\"method\")");
            Locale locale = Locale.ENGLISH;
            m.e(locale, ViewHierarchyConstants.ENGLISH);
            String upperCase = string2.toUpperCase(locale);
            m.e(upperCase, "(this as java.lang.String).toUpperCase(locale)");
            MappingMethod valueOf = MappingMethod.valueOf(upperCase);
            String string3 = jSONObject.getString("event_type");
            m.e(string3, "mapping.getString(\"event_type\")");
            m.e(locale, ViewHierarchyConstants.ENGLISH);
            String upperCase2 = string3.toUpperCase(locale);
            m.e(upperCase2, "(this as java.lang.String).toUpperCase(locale)");
            ActionType valueOf2 = ActionType.valueOf(upperCase2);
            String string4 = jSONObject.getString("app_version");
            JSONArray jSONArray = jSONObject.getJSONArray("path");
            ArrayList arrayList = new ArrayList();
            int length2 = jSONArray.length();
            int i10 = 0;
            if (length2 > 0) {
                int i11 = 0;
                while (true) {
                    int i12 = i11 + 1;
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i11);
                    m.e(jSONObject2, "jsonPath");
                    arrayList.add(new PathComponent(jSONObject2));
                    if (i12 >= length2) {
                        break;
                    }
                    i11 = i12;
                }
            }
            String optString = jSONObject.optString(Constants.EVENT_MAPPING_PATH_TYPE_KEY, Constants.PATH_TYPE_ABSOLUTE);
            JSONArray optJSONArray = jSONObject.optJSONArray("parameters");
            ArrayList arrayList2 = new ArrayList();
            if (optJSONArray != null && (length = optJSONArray.length()) > 0) {
                while (true) {
                    int i13 = i10 + 1;
                    JSONObject jSONObject3 = optJSONArray.getJSONObject(i10);
                    m.e(jSONObject3, "jsonParameter");
                    arrayList2.add(new ParameterComponent(jSONObject3));
                    if (i13 >= length) {
                        break;
                    }
                    i10 = i13;
                }
            }
            String optString2 = jSONObject.optString("component_id");
            String optString3 = jSONObject.optString("activity_name");
            m.e(string, Constants.EVENT_NAME);
            m.e(string4, RemoteConfigConstants.RequestFieldKey.APP_VERSION);
            m.e(optString2, "componentId");
            m.e(optString, "pathType");
            m.e(optString3, "activityName");
            return new EventBinding(string, valueOf, valueOf2, string4, arrayList, arrayList2, optString2, optString, optString3);
        }

        public final List<EventBinding> parseArray(JSONArray jSONArray) {
            ArrayList arrayList = new ArrayList();
            if (jSONArray != null) {
                int i10 = 0;
                try {
                    int length = jSONArray.length();
                    if (length > 0) {
                        while (true) {
                            int i11 = i10 + 1;
                            JSONObject jSONObject = jSONArray.getJSONObject(i10);
                            m.e(jSONObject, "array.getJSONObject(i)");
                            arrayList.add(getInstanceFromJson(jSONObject));
                            if (i11 >= length) {
                                break;
                            }
                            i10 = i11;
                        }
                    }
                } catch (IllegalArgumentException | JSONException unused) {
                }
            }
            return arrayList;
        }
    }

    /* compiled from: EventBinding.kt */
    public enum MappingMethod {
        MANUAL,
        INFERENCE
    }

    public EventBinding(String str, MappingMethod mappingMethod, ActionType actionType, String str2, List<PathComponent> list, List<ParameterComponent> list2, String str3, String str4, String str5) {
        m.f(str, Constants.EVENT_NAME);
        m.f(mappingMethod, "method");
        m.f(actionType, ShareConstants.MEDIA_TYPE);
        m.f(str2, RemoteConfigConstants.RequestFieldKey.APP_VERSION);
        m.f(list, "path");
        m.f(list2, "parameters");
        m.f(str3, "componentId");
        m.f(str4, "pathType");
        m.f(str5, "activityName");
        this.eventName = str;
        this.method = mappingMethod;
        this.type = actionType;
        this.appVersion = str2;
        this.path = list;
        this.parameters = list2;
        this.componentId = str3;
        this.pathType = str4;
        this.activityName = str5;
    }

    public static final EventBinding getInstanceFromJson(JSONObject jSONObject) {
        return Companion.getInstanceFromJson(jSONObject);
    }

    public static final List<EventBinding> parseArray(JSONArray jSONArray) {
        return Companion.parseArray(jSONArray);
    }

    public final String getActivityName() {
        return this.activityName;
    }

    public final String getAppVersion() {
        return this.appVersion;
    }

    public final String getComponentId() {
        return this.componentId;
    }

    public final String getEventName() {
        return this.eventName;
    }

    public final MappingMethod getMethod() {
        return this.method;
    }

    public final String getPathType() {
        return this.pathType;
    }

    public final ActionType getType() {
        return this.type;
    }

    public final List<ParameterComponent> getViewParameters() {
        List<ParameterComponent> unmodifiableList = Collections.unmodifiableList(this.parameters);
        m.e(unmodifiableList, "unmodifiableList(parameters)");
        return unmodifiableList;
    }

    public final List<PathComponent> getViewPath() {
        List<PathComponent> unmodifiableList = Collections.unmodifiableList(this.path);
        m.e(unmodifiableList, "unmodifiableList(path)");
        return unmodifiableList;
    }
}
