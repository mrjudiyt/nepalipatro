package com.facebook;

import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import org.json.JSONObject;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class g implements FacebookSdk.GraphRequestCreator {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ g f6056a = new g();

    private /* synthetic */ g() {
    }

    public final GraphRequest createPostRequest(AccessToken accessToken, String str, JSONObject jSONObject, GraphRequest.Callback callback) {
        return FacebookSdk.m6graphRequestCreator$lambda0(accessToken, str, jSONObject, callback);
    }
}
