package com.facebook.login;

import android.os.Bundle;
import com.facebook.FacebookException;
import com.facebook.internal.NativeProtocol;
import com.facebook.internal.Utility;
import com.facebook.login.LoginClient;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: GetTokenLoginMethodHandler.kt */
public final class GetTokenLoginMethodHandler$complete$1 implements Utility.GraphMeRequestWithCacheCallback {
    final /* synthetic */ LoginClient.Request $request;
    final /* synthetic */ Bundle $result;
    final /* synthetic */ GetTokenLoginMethodHandler this$0;

    GetTokenLoginMethodHandler$complete$1(Bundle bundle, GetTokenLoginMethodHandler getTokenLoginMethodHandler, LoginClient.Request request) {
        this.$result = bundle;
        this.this$0 = getTokenLoginMethodHandler;
        this.$request = request;
    }

    public void onFailure(FacebookException facebookException) {
        this.this$0.getLoginClient().complete(LoginClient.Result.Companion.createErrorResult$default(LoginClient.Result.Companion, this.this$0.getLoginClient().getPendingRequest(), "Caught exception", facebookException == null ? null : facebookException.getMessage(), (String) null, 8, (Object) null));
    }

    public void onSuccess(JSONObject jSONObject) {
        try {
            this.$result.putString(NativeProtocol.EXTRA_USER_ID, jSONObject == null ? null : jSONObject.getString("id"));
            this.this$0.onComplete(this.$request, this.$result);
        } catch (JSONException e10) {
            this.this$0.getLoginClient().complete(LoginClient.Result.Companion.createErrorResult$default(LoginClient.Result.Companion, this.this$0.getLoginClient().getPendingRequest(), "Caught exception", e10.getMessage(), (String) null, 8, (Object) null));
        }
    }
}
