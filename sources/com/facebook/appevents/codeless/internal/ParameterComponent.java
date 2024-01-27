package com.facebook.appevents.codeless.internal;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: ParameterComponent.kt */
public final class ParameterComponent {
    public static final Companion Companion = new Companion((g) null);
    private static final String PARAMETER_NAME_KEY = "name";
    private static final String PARAMETER_PATH_KEY = "path";
    private static final String PARAMETER_VALUE_KEY = "value";
    private final String name;
    private final List<PathComponent> path;
    private final String pathType;
    private final String value;

    /* compiled from: ParameterComponent.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }
    }

    public ParameterComponent(JSONObject jSONObject) {
        m.f(jSONObject, "component");
        String string = jSONObject.getString("name");
        m.e(string, "component.getString(PARAMETER_NAME_KEY)");
        this.name = string;
        String optString = jSONObject.optString("value");
        m.e(optString, "component.optString(PARAMETER_VALUE_KEY)");
        this.value = optString;
        String optString2 = jSONObject.optString(Constants.EVENT_MAPPING_PATH_TYPE_KEY, Constants.PATH_TYPE_ABSOLUTE);
        m.e(optString2, "component.optString(Constants.EVENT_MAPPING_PATH_TYPE_KEY, Constants.PATH_TYPE_ABSOLUTE)");
        this.pathType = optString2;
        ArrayList arrayList = new ArrayList();
        JSONArray optJSONArray = jSONObject.optJSONArray(PARAMETER_PATH_KEY);
        if (optJSONArray != null) {
            int i10 = 0;
            int length = optJSONArray.length();
            if (length > 0) {
                while (true) {
                    int i11 = i10 + 1;
                    JSONObject jSONObject2 = optJSONArray.getJSONObject(i10);
                    m.e(jSONObject2, "jsonPathArray.getJSONObject(i)");
                    arrayList.add(new PathComponent(jSONObject2));
                    if (i11 >= length) {
                        break;
                    }
                    i10 = i11;
                }
            }
        }
        this.path = arrayList;
    }

    public final String getName() {
        return this.name;
    }

    public final List<PathComponent> getPath() {
        return this.path;
    }

    public final String getPathType() {
        return this.pathType;
    }

    public final String getValue() {
        return this.value;
    }
}
