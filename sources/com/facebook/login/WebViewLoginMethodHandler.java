package com.facebook.login;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.e;
import com.facebook.AccessTokenSource;
import com.facebook.FacebookException;
import com.facebook.internal.FacebookDialogFragment;
import com.facebook.internal.ServerProtocol;
import com.facebook.internal.Utility;
import com.facebook.internal.WebDialog;
import com.facebook.login.LoginClient;
import java.util.Objects;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;

/* compiled from: WebViewLoginMethodHandler.kt */
public class WebViewLoginMethodHandler extends WebLoginMethodHandler {
    public static final Parcelable.Creator<WebViewLoginMethodHandler> CREATOR = new WebViewLoginMethodHandler$Companion$CREATOR$1();
    public static final Companion Companion = new Companion((g) null);
    private static final String OAUTH_DIALOG = "oauth";
    private String e2e;
    private WebDialog loginDialog;
    private final String nameForLogging = "web_view";
    private final AccessTokenSource tokenSource = AccessTokenSource.WEB_VIEW;

    /* compiled from: WebViewLoginMethodHandler.kt */
    public final class AuthDialogBuilder extends WebDialog.Builder {
        public String authType;
        public String e2e;
        private boolean isFamilyLogin;
        private LoginBehavior loginBehavior = LoginBehavior.NATIVE_WITH_FALLBACK;
        private String redirect_uri = ServerProtocol.DIALOG_REDIRECT_URI;
        private boolean shouldSkipDedupe;
        private LoginTargetApp targetApp = LoginTargetApp.FACEBOOK;
        final /* synthetic */ WebViewLoginMethodHandler this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public AuthDialogBuilder(WebViewLoginMethodHandler webViewLoginMethodHandler, Context context, String str, Bundle bundle) {
            super(context, str, "oauth", bundle);
            m.f(webViewLoginMethodHandler, "this$0");
            m.f(context, "context");
            m.f(str, "applicationId");
            m.f(bundle, "parameters");
            this.this$0 = webViewLoginMethodHandler;
        }

        public WebDialog build() {
            Bundle parameters = getParameters();
            Objects.requireNonNull(parameters, "null cannot be cast to non-null type android.os.Bundle");
            parameters.putString(ServerProtocol.DIALOG_PARAM_REDIRECT_URI, this.redirect_uri);
            parameters.putString("client_id", getApplicationId());
            parameters.putString("e2e", getE2e());
            parameters.putString(ServerProtocol.DIALOG_PARAM_RESPONSE_TYPE, this.targetApp == LoginTargetApp.INSTAGRAM ? ServerProtocol.DIALOG_RESPONSE_TYPE_TOKEN_AND_SCOPES : ServerProtocol.DIALOG_RESPONSE_TYPE_TOKEN_AND_SIGNED_REQUEST);
            parameters.putString(ServerProtocol.DIALOG_PARAM_RETURN_SCOPES, ServerProtocol.DIALOG_RETURN_SCOPES_TRUE);
            parameters.putString(ServerProtocol.DIALOG_PARAM_AUTH_TYPE, getAuthType());
            parameters.putString("login_behavior", this.loginBehavior.name());
            if (this.isFamilyLogin) {
                parameters.putString(ServerProtocol.DIALOG_PARAM_FX_APP, this.targetApp.toString());
            }
            if (this.shouldSkipDedupe) {
                parameters.putString(ServerProtocol.DIALOG_PARAM_SKIP_DEDUPE, ServerProtocol.DIALOG_RETURN_SCOPES_TRUE);
            }
            WebDialog.Companion companion = WebDialog.Companion;
            Context context = getContext();
            Objects.requireNonNull(context, "null cannot be cast to non-null type android.content.Context");
            return companion.newInstance(context, "oauth", parameters, getTheme(), this.targetApp, getListener());
        }

        public final String getAuthType() {
            String str = this.authType;
            if (str != null) {
                return str;
            }
            m.x("authType");
            throw null;
        }

        public final String getE2e() {
            String str = this.e2e;
            if (str != null) {
                return str;
            }
            m.x("e2e");
            throw null;
        }

        /* renamed from: setAuthType  reason: collision with other method in class */
        public final void m146setAuthType(String str) {
            m.f(str, "<set-?>");
            this.authType = str;
        }

        public final AuthDialogBuilder setE2E(String str) {
            m.f(str, "e2e");
            setE2e(str);
            return this;
        }

        public final void setE2e(String str) {
            m.f(str, "<set-?>");
            this.e2e = str;
        }

        public final AuthDialogBuilder setFamilyLogin(boolean z10) {
            this.isFamilyLogin = z10;
            return this;
        }

        public final AuthDialogBuilder setIsChromeOS(boolean z10) {
            this.redirect_uri = z10 ? ServerProtocol.DIALOG_REDIRECT_CHROME_OS_URI : ServerProtocol.DIALOG_REDIRECT_URI;
            return this;
        }

        public final AuthDialogBuilder setIsRerequest(boolean z10) {
            return this;
        }

        public final AuthDialogBuilder setLoginBehavior(LoginBehavior loginBehavior2) {
            m.f(loginBehavior2, "loginBehavior");
            this.loginBehavior = loginBehavior2;
            return this;
        }

        public final AuthDialogBuilder setLoginTargetApp(LoginTargetApp loginTargetApp) {
            m.f(loginTargetApp, "targetApp");
            this.targetApp = loginTargetApp;
            return this;
        }

        public final AuthDialogBuilder setShouldSkipDedupe(boolean z10) {
            this.shouldSkipDedupe = z10;
            return this;
        }

        public final AuthDialogBuilder setAuthType(String str) {
            m.f(str, "authType");
            setAuthType(str);
            return this;
        }
    }

    /* compiled from: WebViewLoginMethodHandler.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WebViewLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
        m.f(loginClient, "loginClient");
    }

    public void cancel() {
        WebDialog webDialog = this.loginDialog;
        if (webDialog != null) {
            if (webDialog != null) {
                webDialog.cancel();
            }
            this.loginDialog = null;
        }
    }

    public int describeContents() {
        return 0;
    }

    public final String getE2e() {
        return this.e2e;
    }

    public final WebDialog getLoginDialog() {
        return this.loginDialog;
    }

    public String getNameForLogging() {
        return this.nameForLogging;
    }

    public AccessTokenSource getTokenSource() {
        return this.tokenSource;
    }

    public boolean needsInternetPermission() {
        return true;
    }

    public final void onWebDialogComplete(LoginClient.Request request, Bundle bundle, FacebookException facebookException) {
        m.f(request, "request");
        super.onComplete(request, bundle, facebookException);
    }

    public final void setE2e(String str) {
        this.e2e = str;
    }

    public final void setLoginDialog(WebDialog webDialog) {
        this.loginDialog = webDialog;
    }

    public int tryAuthorize(LoginClient.Request request) {
        m.f(request, "request");
        Bundle parameters = getParameters(request);
        WebViewLoginMethodHandler$tryAuthorize$listener$1 webViewLoginMethodHandler$tryAuthorize$listener$1 = new WebViewLoginMethodHandler$tryAuthorize$listener$1(this, request);
        String e2e2 = LoginClient.Companion.getE2E();
        this.e2e = e2e2;
        addLoggingExtra("e2e", e2e2);
        e activity = getLoginClient().getActivity();
        if (activity == null) {
            return 0;
        }
        Utility utility = Utility.INSTANCE;
        boolean isChromeOS = Utility.isChromeOS(activity);
        AuthDialogBuilder authDialogBuilder = new AuthDialogBuilder(this, activity, request.getApplicationId(), parameters);
        String str = this.e2e;
        Objects.requireNonNull(str, "null cannot be cast to non-null type kotlin.String");
        this.loginDialog = authDialogBuilder.setE2E(str).setIsChromeOS(isChromeOS).setAuthType(request.getAuthType()).setLoginBehavior(request.getLoginBehavior()).setLoginTargetApp(request.getLoginTargetApp()).setFamilyLogin(request.isFamilyLogin()).setShouldSkipDedupe(request.shouldSkipAccountDeduplication()).setOnCompleteListener(webViewLoginMethodHandler$tryAuthorize$listener$1).build();
        FacebookDialogFragment facebookDialogFragment = new FacebookDialogFragment();
        facebookDialogFragment.setRetainInstance(true);
        facebookDialogFragment.setInnerDialog(this.loginDialog);
        facebookDialogFragment.show(activity.getSupportFragmentManager(), FacebookDialogFragment.TAG);
        return 1;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        m.f(parcel, "dest");
        super.writeToParcel(parcel, i10);
        parcel.writeString(this.e2e);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WebViewLoginMethodHandler(Parcel parcel) {
        super(parcel);
        m.f(parcel, "source");
        this.e2e = parcel.readString();
    }
}
