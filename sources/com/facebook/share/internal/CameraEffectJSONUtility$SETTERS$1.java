package com.facebook.share.internal;

import com.facebook.share.internal.CameraEffectJSONUtility;
import com.facebook.share.model.CameraEffectArguments;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.Objects;
import kotlin.jvm.internal.m;
import org.json.JSONObject;

/* compiled from: CameraEffectJSONUtility.kt */
public final class CameraEffectJSONUtility$SETTERS$1 implements CameraEffectJSONUtility.Setter {
    CameraEffectJSONUtility$SETTERS$1() {
    }

    public void setOnArgumentsBuilder(CameraEffectArguments.Builder builder, String str, Object obj) {
        m.f(builder, "builder");
        m.f(str, Constants.KEY);
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.String");
        builder.putArgument(str, (String) obj);
    }

    public void setOnJSON(JSONObject jSONObject, String str, Object obj) {
        m.f(jSONObject, "json");
        m.f(str, Constants.KEY);
        jSONObject.put(str, obj);
    }
}
