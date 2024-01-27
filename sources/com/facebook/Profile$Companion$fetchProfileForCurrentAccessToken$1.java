package com.facebook;

import android.net.Uri;
import com.facebook.internal.Utility;
import kotlin.jvm.internal.m;
import org.json.JSONObject;

/* compiled from: Profile.kt */
public final class Profile$Companion$fetchProfileForCurrentAccessToken$1 implements Utility.GraphMeRequestWithCacheCallback {
    Profile$Companion$fetchProfileForCurrentAccessToken$1() {
    }

    public void onFailure(FacebookException facebookException) {
        String unused = Profile.TAG;
        m.o("Got unexpected exception: ", facebookException);
    }

    public void onSuccess(JSONObject jSONObject) {
        Uri uri = null;
        String optString = jSONObject == null ? null : jSONObject.optString("id");
        if (optString == null) {
            String unused = Profile.TAG;
            return;
        }
        String optString2 = jSONObject.optString("link");
        String optString3 = jSONObject.optString("profile_picture", (String) null);
        String optString4 = jSONObject.optString("first_name");
        String optString5 = jSONObject.optString(AuthenticationTokenClaims.JSON_KEY_MIDDLE_NAME);
        String optString6 = jSONObject.optString("last_name");
        String optString7 = jSONObject.optString("name");
        Uri parse = optString2 != null ? Uri.parse(optString2) : null;
        if (optString3 != null) {
            uri = Uri.parse(optString3);
        }
        Profile.Companion.setCurrentProfile(new Profile(optString, optString4, optString5, optString6, optString7, parse, uri));
    }
}
