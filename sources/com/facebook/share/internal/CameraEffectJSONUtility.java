package com.facebook.share.internal;

import com.facebook.share.model.CameraEffectArguments;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.jvm.internal.m;
import o8.o;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: CameraEffectJSONUtility.kt */
public final class CameraEffectJSONUtility {
    public static final CameraEffectJSONUtility INSTANCE = new CameraEffectJSONUtility();
    private static final HashMap<Class<?>, Setter> SETTERS = h0.e(o.a(String.class, new CameraEffectJSONUtility$SETTERS$1()), o.a(String[].class, new CameraEffectJSONUtility$SETTERS$2()), o.a(JSONArray.class, new CameraEffectJSONUtility$SETTERS$3()));

    /* compiled from: CameraEffectJSONUtility.kt */
    private interface Setter {
        void setOnArgumentsBuilder(CameraEffectArguments.Builder builder, String str, Object obj);

        void setOnJSON(JSONObject jSONObject, String str, Object obj);
    }

    private CameraEffectJSONUtility() {
    }

    public static final CameraEffectArguments convertToCameraEffectArguments(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        CameraEffectArguments.Builder builder = new CameraEffectArguments.Builder();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject.get(next);
            if (obj != JSONObject.NULL) {
                Setter setter = SETTERS.get(obj.getClass());
                if (setter != null) {
                    m.e(next, Constants.KEY);
                    setter.setOnArgumentsBuilder(builder, next, obj);
                } else {
                    throw new IllegalArgumentException(m.o("Unsupported type: ", obj.getClass()));
                }
            }
        }
        return builder.build();
    }

    public static final JSONObject convertToJSON(CameraEffectArguments cameraEffectArguments) {
        if (cameraEffectArguments == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        for (String next : cameraEffectArguments.keySet()) {
            Object obj = cameraEffectArguments.get(next);
            if (obj != null) {
                Setter setter = SETTERS.get(obj.getClass());
                if (setter != null) {
                    setter.setOnJSON(jSONObject, next, obj);
                } else {
                    throw new IllegalArgumentException(m.o("Unsupported type: ", obj.getClass()));
                }
            }
        }
        return jSONObject;
    }
}
