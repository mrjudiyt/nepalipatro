package com.facebook.login;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.facebook.AccessTokenSource;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.internal.NativeProtocol;
import com.facebook.internal.PlatformServiceClient;
import com.facebook.internal.Utility;
import com.facebook.login.LoginClient;
import com.facebook.login.LoginMethodHandler;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;

/* compiled from: GetTokenLoginMethodHandler.kt */
public final class GetTokenLoginMethodHandler extends LoginMethodHandler {
    public static final Parcelable.Creator<GetTokenLoginMethodHandler> CREATOR = new GetTokenLoginMethodHandler$Companion$CREATOR$1();
    public static final Companion Companion = new Companion((g) null);
    private GetTokenClient getTokenClient;
    private final String nameForLogging = "get_token";

    /* compiled from: GetTokenLoginMethodHandler.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GetTokenLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
        m.f(loginClient, "loginClient");
    }

    /* access modifiers changed from: private */
    /* renamed from: tryAuthorize$lambda-1  reason: not valid java name */
    public static final void m137tryAuthorize$lambda1(GetTokenLoginMethodHandler getTokenLoginMethodHandler, LoginClient.Request request, Bundle bundle) {
        m.f(getTokenLoginMethodHandler, "this$0");
        m.f(request, "$request");
        getTokenLoginMethodHandler.getTokenCompleted(request, bundle);
    }

    public void cancel() {
        GetTokenClient getTokenClient2 = this.getTokenClient;
        if (getTokenClient2 != null) {
            getTokenClient2.cancel();
            getTokenClient2.setCompletedListener((PlatformServiceClient.CompletedListener) null);
            this.getTokenClient = null;
        }
    }

    public final void complete(LoginClient.Request request, Bundle bundle) {
        m.f(request, "request");
        m.f(bundle, "result");
        String string = bundle.getString(NativeProtocol.EXTRA_USER_ID);
        if (string == null || string.length() == 0) {
            getLoginClient().notifyBackgroundProcessingStart();
            String string2 = bundle.getString(NativeProtocol.EXTRA_ACCESS_TOKEN);
            if (string2 != null) {
                Utility utility = Utility.INSTANCE;
                Utility.getGraphMeRequestWithCacheAsync(string2, new GetTokenLoginMethodHandler$complete$1(bundle, this, request));
                return;
            }
            throw new IllegalStateException("Required value was null.".toString());
        }
        onComplete(request, bundle);
    }

    public int describeContents() {
        return 0;
    }

    public String getNameForLogging() {
        return this.nameForLogging;
    }

    public final void getTokenCompleted(LoginClient.Request request, Bundle bundle) {
        m.f(request, "request");
        GetTokenClient getTokenClient2 = this.getTokenClient;
        if (getTokenClient2 != null) {
            getTokenClient2.setCompletedListener((PlatformServiceClient.CompletedListener) null);
        }
        this.getTokenClient = null;
        getLoginClient().notifyBackgroundProcessingStop();
        if (bundle != null) {
            List stringArrayList = bundle.getStringArrayList(NativeProtocol.EXTRA_PERMISSIONS);
            if (stringArrayList == null) {
                stringArrayList = p.e();
            }
            Set<String> permissions = request.getPermissions();
            if (permissions == null) {
                permissions = m0.b();
            }
            String string = bundle.getString(NativeProtocol.EXTRA_AUTHENTICATION_TOKEN);
            if (permissions.contains("openid")) {
                if (string == null || string.length() == 0) {
                    getLoginClient().tryNextHandler();
                    return;
                }
            }
            if (stringArrayList.containsAll(permissions)) {
                complete(request, bundle);
                return;
            }
            HashSet hashSet = new HashSet();
            for (String next : permissions) {
                if (!stringArrayList.contains(next)) {
                    hashSet.add(next);
                }
            }
            if (!hashSet.isEmpty()) {
                addLoggingExtra(LoginLogger.EVENT_EXTRAS_NEW_PERMISSIONS, TextUtils.join(",", hashSet));
            }
            request.setPermissions(hashSet);
        }
        getLoginClient().tryNextHandler();
    }

    public final void onComplete(LoginClient.Request request, Bundle bundle) {
        LoginClient.Result result;
        m.f(request, "request");
        m.f(bundle, "result");
        try {
            LoginMethodHandler.Companion companion = LoginMethodHandler.Companion;
            result = LoginClient.Result.Companion.createCompositeTokenResult(request, companion.createAccessTokenFromNativeLogin(bundle, AccessTokenSource.FACEBOOK_APPLICATION_SERVICE, request.getApplicationId()), companion.createAuthenticationTokenFromNativeLogin(bundle, request.getNonce()));
        } catch (FacebookException e10) {
            result = LoginClient.Result.Companion.createErrorResult$default(LoginClient.Result.Companion, getLoginClient().getPendingRequest(), (String) null, e10.getMessage(), (String) null, 8, (Object) null);
        }
        getLoginClient().completeAndValidate(result);
    }

    public int tryAuthorize(LoginClient.Request request) {
        m.f(request, "request");
        Context activity = getLoginClient().getActivity();
        if (activity == null) {
            FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
            activity = FacebookSdk.getApplicationContext();
        }
        GetTokenClient getTokenClient2 = new GetTokenClient(activity, request);
        this.getTokenClient = getTokenClient2;
        if (m.a(Boolean.valueOf(getTokenClient2.start()), Boolean.FALSE)) {
            return 0;
        }
        getLoginClient().notifyBackgroundProcessingStart();
        i iVar = new i(this, request);
        GetTokenClient getTokenClient3 = this.getTokenClient;
        if (getTokenClient3 == null) {
            return 1;
        }
        getTokenClient3.setCompletedListener(iVar);
        return 1;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GetTokenLoginMethodHandler(Parcel parcel) {
        super(parcel);
        m.f(parcel, "source");
    }
}
