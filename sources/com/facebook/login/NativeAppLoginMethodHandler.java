package com.facebook.login;

import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.Parcel;
import androidx.activity.result.c;
import androidx.fragment.app.Fragment;
import com.facebook.AccessTokenSource;
import com.facebook.FacebookException;
import com.facebook.FacebookRequestError;
import com.facebook.FacebookSdk;
import com.facebook.FacebookServiceException;
import com.facebook.bolts.AppLinks;
import com.facebook.internal.AnalyticsEvents;
import com.facebook.internal.NativeProtocol;
import com.facebook.internal.ServerProtocol;
import com.facebook.internal.Utility;
import com.facebook.login.CustomTabLoginMethodHandler;
import com.facebook.login.LoginClient;
import com.facebook.login.LoginMethodHandler;
import java.util.List;
import kotlin.jvm.internal.m;
import o8.q;

/* compiled from: NativeAppLoginMethodHandler.kt */
public abstract class NativeAppLoginMethodHandler extends LoginMethodHandler {
    private final AccessTokenSource tokenSource = AccessTokenSource.FACEBOOK_APPLICATION_WEB;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NativeAppLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
        m.f(loginClient, "loginClient");
    }

    private final void completeLogin(LoginClient.Result result) {
        if (result != null) {
            getLoginClient().completeAndValidate(result);
        } else {
            getLoginClient().tryNextHandler();
        }
    }

    private final boolean isCallable(Intent intent) {
        FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
        List<ResolveInfo> queryIntentActivities = FacebookSdk.getApplicationContext().getPackageManager().queryIntentActivities(intent, NativeProtocol.MESSAGE_GET_ACCESS_TOKEN_REQUEST);
        m.e(queryIntentActivities, "FacebookSdk.getApplicationContext()\n            .packageManager\n            .queryIntentActivities(intent, PackageManager.MATCH_DEFAULT_ONLY)");
        return !queryIntentActivities.isEmpty();
    }

    private final void processSuccessResponse(LoginClient.Request request, Bundle bundle) {
        if (bundle.containsKey("code")) {
            Utility utility = Utility.INSTANCE;
            if (!Utility.isNullOrEmpty(bundle.getString("code"))) {
                FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
                FacebookSdk.getExecutor().execute(new q(this, request, bundle));
                return;
            }
        }
        handleResultOk(request, bundle);
    }

    /* access modifiers changed from: private */
    /* renamed from: processSuccessResponse$lambda-0  reason: not valid java name */
    public static final void m145processSuccessResponse$lambda0(NativeAppLoginMethodHandler nativeAppLoginMethodHandler, LoginClient.Request request, Bundle bundle) {
        m.f(nativeAppLoginMethodHandler, "this$0");
        m.f(request, "$request");
        m.f(bundle, "$extras");
        try {
            nativeAppLoginMethodHandler.handleResultOk(request, nativeAppLoginMethodHandler.processCodeExchange(request, bundle));
        } catch (FacebookServiceException e10) {
            FacebookRequestError requestError = e10.getRequestError();
            nativeAppLoginMethodHandler.handleResultError(request, requestError.getErrorType(), requestError.getErrorMessage(), String.valueOf(requestError.getErrorCode()));
        } catch (FacebookException e11) {
            nativeAppLoginMethodHandler.handleResultError(request, (String) null, e11.getMessage(), (String) null);
        }
    }

    /* access modifiers changed from: protected */
    public String getError(Bundle bundle) {
        String string = bundle == null ? null : bundle.getString("error");
        if (string != null) {
            return string;
        }
        if (bundle == null) {
            return null;
        }
        return bundle.getString(NativeProtocol.BRIDGE_ARG_ERROR_TYPE);
    }

    /* access modifiers changed from: protected */
    public String getErrorMessage(Bundle bundle) {
        String string = bundle == null ? null : bundle.getString(AnalyticsEvents.PARAMETER_SHARE_ERROR_MESSAGE);
        if (string != null) {
            return string;
        }
        if (bundle == null) {
            return null;
        }
        return bundle.getString(NativeProtocol.BRIDGE_ARG_ERROR_DESCRIPTION);
    }

    public AccessTokenSource getTokenSource() {
        return this.tokenSource;
    }

    /* access modifiers changed from: protected */
    public void handleResultCancel(LoginClient.Request request, Intent intent) {
        Object obj;
        m.f(intent, "data");
        Bundle extras = intent.getExtras();
        String error = getError(extras);
        String str = null;
        if (!(extras == null || (obj = extras.get(NativeProtocol.BRIDGE_ARG_ERROR_CODE)) == null)) {
            str = obj.toString();
        }
        ServerProtocol serverProtocol = ServerProtocol.INSTANCE;
        if (m.a(ServerProtocol.getErrorConnectionFailure(), str)) {
            completeLogin(LoginClient.Result.Companion.createErrorResult(request, error, getErrorMessage(extras), str));
            return;
        }
        completeLogin(LoginClient.Result.Companion.createCancelResult(request, error));
    }

    /* access modifiers changed from: protected */
    public void handleResultError(LoginClient.Request request, String str, String str2, String str3) {
        if (str == null || !m.a(str, "logged_out")) {
            ServerProtocol serverProtocol = ServerProtocol.INSTANCE;
            if (x.q(ServerProtocol.getErrorsProxyAuthDisabled(), str)) {
                completeLogin((LoginClient.Result) null);
            } else if (x.q(ServerProtocol.getErrorsUserCanceled(), str)) {
                completeLogin(LoginClient.Result.Companion.createCancelResult(request, (String) null));
            } else {
                completeLogin(LoginClient.Result.Companion.createErrorResult(request, str, str2, str3));
            }
        } else {
            CustomTabLoginMethodHandler.Companion companion = CustomTabLoginMethodHandler.Companion;
            CustomTabLoginMethodHandler.calledThroughLoggedOutAppSwitch = true;
            completeLogin((LoginClient.Result) null);
        }
    }

    /* access modifiers changed from: protected */
    public void handleResultOk(LoginClient.Request request, Bundle bundle) {
        m.f(request, "request");
        m.f(bundle, AppLinks.KEY_NAME_EXTRAS);
        try {
            LoginMethodHandler.Companion companion = LoginMethodHandler.Companion;
            completeLogin(LoginClient.Result.Companion.createCompositeTokenResult(request, companion.createAccessTokenFromWebBundle(request.getPermissions(), bundle, getTokenSource(), request.getApplicationId()), companion.createAuthenticationTokenFromWebBundle(bundle, request.getNonce())));
        } catch (FacebookException e10) {
            completeLogin(LoginClient.Result.Companion.createErrorResult$default(LoginClient.Result.Companion, request, (String) null, e10.getMessage(), (String) null, 8, (Object) null));
        }
    }

    public boolean onActivityResult(int i10, int i11, Intent intent) {
        LoginClient.Request pendingRequest = getLoginClient().getPendingRequest();
        if (intent == null) {
            completeLogin(LoginClient.Result.Companion.createCancelResult(pendingRequest, "Operation canceled"));
        } else if (i11 == 0) {
            handleResultCancel(pendingRequest, intent);
        } else if (i11 != -1) {
            completeLogin(LoginClient.Result.Companion.createErrorResult$default(LoginClient.Result.Companion, pendingRequest, "Unexpected resultCode from authorization.", (String) null, (String) null, 8, (Object) null));
        } else {
            Bundle extras = intent.getExtras();
            if (extras == null) {
                completeLogin(LoginClient.Result.Companion.createErrorResult$default(LoginClient.Result.Companion, pendingRequest, "Unexpected null from returned authorization data.", (String) null, (String) null, 8, (Object) null));
                return true;
            }
            String error = getError(extras);
            Object obj = extras.get(NativeProtocol.BRIDGE_ARG_ERROR_CODE);
            String obj2 = obj == null ? null : obj.toString();
            String errorMessage = getErrorMessage(extras);
            String string = extras.getString("e2e");
            Utility utility = Utility.INSTANCE;
            if (!Utility.isNullOrEmpty(string)) {
                logWebLoginCompleted(string);
            }
            if (error == null && obj2 == null && errorMessage == null && pendingRequest != null) {
                processSuccessResponse(pendingRequest, extras);
            } else {
                handleResultError(pendingRequest, error, errorMessage, obj2);
            }
        }
        return true;
    }

    public abstract int tryAuthorize(LoginClient.Request request);

    /* access modifiers changed from: protected */
    public boolean tryIntent(Intent intent, int i10) {
        c<Intent> launcher;
        if (intent == null || !isCallable(intent)) {
            return false;
        }
        Fragment fragment = getLoginClient().getFragment();
        q qVar = null;
        LoginFragment loginFragment = fragment instanceof LoginFragment ? (LoginFragment) fragment : null;
        if (!(loginFragment == null || (launcher = loginFragment.getLauncher()) == null)) {
            launcher.b(intent);
            qVar = q.f16189a;
        }
        if (qVar == null) {
            return false;
        }
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NativeAppLoginMethodHandler(Parcel parcel) {
        super(parcel);
        m.f(parcel, "source");
    }
}
