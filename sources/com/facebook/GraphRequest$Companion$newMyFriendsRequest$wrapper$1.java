package com.facebook;

import com.facebook.GraphRequest;
import kotlin.jvm.internal.m;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: GraphRequest.kt */
public final class GraphRequest$Companion$newMyFriendsRequest$wrapper$1 implements GraphRequest.Callback {
    final /* synthetic */ GraphRequest.GraphJSONArrayCallback $callback;

    GraphRequest$Companion$newMyFriendsRequest$wrapper$1(GraphRequest.GraphJSONArrayCallback graphJSONArrayCallback) {
        this.$callback = graphJSONArrayCallback;
    }

    public void onCompleted(GraphResponse graphResponse) {
        JSONArray jSONArray;
        m.f(graphResponse, "response");
        if (this.$callback != null) {
            JSONObject jSONObject = graphResponse.getJSONObject();
            if (jSONObject == null) {
                jSONArray = null;
            } else {
                jSONArray = jSONObject.optJSONArray("data");
            }
            this.$callback.onCompleted(jSONArray, graphResponse);
        }
    }
}
