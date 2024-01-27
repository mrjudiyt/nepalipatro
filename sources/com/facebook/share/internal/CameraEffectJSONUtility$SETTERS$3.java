package com.facebook.share.internal;

import com.facebook.share.internal.CameraEffectJSONUtility;
import com.facebook.share.model.CameraEffectArguments;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.ArrayList;
import java.util.Objects;
import kotlin.jvm.internal.m;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: CameraEffectJSONUtility.kt */
public final class CameraEffectJSONUtility$SETTERS$3 implements CameraEffectJSONUtility.Setter {
    CameraEffectJSONUtility$SETTERS$3() {
    }

    public void setOnArgumentsBuilder(CameraEffectArguments.Builder builder, String str, Object obj) {
        m.f(builder, "builder");
        m.f(str, Constants.KEY);
        Objects.requireNonNull(obj, "null cannot be cast to non-null type org.json.JSONArray");
        JSONArray jSONArray = (JSONArray) obj;
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        if (length > 0) {
            int i10 = 0;
            while (true) {
                int i11 = i10 + 1;
                Object obj2 = jSONArray.get(i10);
                if (obj2 instanceof String) {
                    arrayList.add(obj2);
                    if (i11 >= length) {
                        break;
                    }
                    i10 = i11;
                } else {
                    throw new IllegalArgumentException(m.o("Unexpected type in an array: ", obj2.getClass()));
                }
            }
        }
        Object[] array = arrayList.toArray(new String[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        builder.putArgument(str, (String[]) array);
    }

    public void setOnJSON(JSONObject jSONObject, String str, Object obj) {
        m.f(jSONObject, "json");
        m.f(str, Constants.KEY);
        throw new IllegalArgumentException("JSONArray's are not supported in bundles.");
    }
}
