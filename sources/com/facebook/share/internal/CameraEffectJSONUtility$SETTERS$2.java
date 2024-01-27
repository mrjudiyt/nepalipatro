package com.facebook.share.internal;

import com.facebook.share.internal.CameraEffectJSONUtility;
import com.facebook.share.model.CameraEffectArguments;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.Objects;
import kotlin.jvm.internal.m;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: CameraEffectJSONUtility.kt */
public final class CameraEffectJSONUtility$SETTERS$2 implements CameraEffectJSONUtility.Setter {
    CameraEffectJSONUtility$SETTERS$2() {
    }

    public void setOnArgumentsBuilder(CameraEffectArguments.Builder builder, String str, Object obj) {
        m.f(builder, "builder");
        m.f(str, Constants.KEY);
        throw new IllegalArgumentException("Unexpected type from JSON");
    }

    public void setOnJSON(JSONObject jSONObject, String str, Object obj) {
        m.f(jSONObject, "json");
        m.f(str, Constants.KEY);
        JSONArray jSONArray = new JSONArray();
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.String?>");
        String[] strArr = (String[]) obj;
        int i10 = 0;
        int length = strArr.length;
        while (i10 < length) {
            String str2 = strArr[i10];
            i10++;
            jSONArray.put(str2);
        }
        jSONObject.put(str, jSONArray);
    }
}
