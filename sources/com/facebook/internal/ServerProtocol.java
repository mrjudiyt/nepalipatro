package com.facebook.internal;

import android.os.Bundle;
import com.facebook.FacebookSdk;
import com.facebook.LoggingBehavior;
import com.facebook.internal.Logger;
import java.util.Arrays;
import java.util.Collection;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.m;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ServerProtocol.kt */
public final class ServerProtocol {
    private static final String DIALOG_AUTHORITY_FORMAT = "m.%s";
    public static final String DIALOG_CANCEL_URI = "fbconnect://cancel";
    public static final String DIALOG_PARAM_ACCESS_TOKEN = "access_token";
    public static final String DIALOG_PARAM_APP_ID = "app_id";
    public static final String DIALOG_PARAM_AUTHENTICATION_TOKEN = "id_token";
    public static final String DIALOG_PARAM_AUTH_TYPE = "auth_type";
    public static final String DIALOG_PARAM_CBT = "cbt";
    public static final String DIALOG_PARAM_CCT_OVER_LOGGED_OUT_APP_SWITCH = "cct_over_app_switch";
    public static final String DIALOG_PARAM_CLIENT_ID = "client_id";
    public static final String DIALOG_PARAM_CODE_CHALLENGE = "code_challenge";
    public static final String DIALOG_PARAM_CODE_CHALLENGE_METHOD = "code_challenge_method";
    public static final String DIALOG_PARAM_CODE_REDIRECT_URI = "code_redirect_uri";
    public static final String DIALOG_PARAM_CUSTOM_TABS_PREFETCHING = "cct_prefetching";
    public static final String DIALOG_PARAM_DEFAULT_AUDIENCE = "default_audience";
    public static final String DIALOG_PARAM_DISPLAY = "display";
    public static final String DIALOG_PARAM_DISPLAY_TOUCH = "touch";
    public static final String DIALOG_PARAM_E2E = "e2e";
    public static final String DIALOG_PARAM_FAIL_ON_LOGGED_OUT = "fail_on_logged_out";
    public static final String DIALOG_PARAM_FX_APP = "fx_app";
    public static final String DIALOG_PARAM_IES = "ies";
    public static final String DIALOG_PARAM_LEGACY_OVERRIDE = "legacy_override";
    public static final String DIALOG_PARAM_LOGIN_BEHAVIOR = "login_behavior";
    public static final String DIALOG_PARAM_MESSENGER_PAGE_ID = "messenger_page_id";
    public static final String DIALOG_PARAM_NONCE = "nonce";
    public static final String DIALOG_PARAM_REDIRECT_URI = "redirect_uri";
    public static final String DIALOG_PARAM_RESET_MESSENGER_STATE = "reset_messenger_state";
    public static final String DIALOG_PARAM_RESPONSE_TYPE = "response_type";
    public static final String DIALOG_PARAM_RETURN_SCOPES = "return_scopes";
    public static final String DIALOG_PARAM_SCOPE = "scope";
    public static final String DIALOG_PARAM_SDK_VERSION = "sdk";
    public static final String DIALOG_PARAM_SKIP_DEDUPE = "skip_dedupe";
    public static final String DIALOG_PARAM_SSO_DEVICE = "sso";
    public static final String DIALOG_PARAM_STATE = "state";
    public static final String DIALOG_PATH = "dialog/";
    public static final String DIALOG_REDIRECT_CHROME_OS_URI = "fbconnect://chrome_os_success";
    public static final String DIALOG_REDIRECT_URI = "fbconnect://success";
    public static final String DIALOG_REREQUEST_AUTH_TYPE = "rerequest";
    public static final String DIALOG_RESPONSE_TYPE_CODE = "code,signed_request,graph_domain";
    public static final String DIALOG_RESPONSE_TYPE_ID_TOKEN_AND_SIGNED_REQUEST = "id_token,token,signed_request,graph_domain";
    public static final String DIALOG_RESPONSE_TYPE_TOKEN_AND_SCOPES = "token,signed_request,graph_domain,granted_scopes";
    public static final String DIALOG_RESPONSE_TYPE_TOKEN_AND_SIGNED_REQUEST = "token,signed_request,graph_domain";
    public static final String DIALOG_RETURN_SCOPES_TRUE = "true";
    public static final String FALLBACK_DIALOG_DISPLAY_VALUE_TOUCH = "touch";
    public static final String FALLBACK_DIALOG_PARAM_APP_ID = "app_id";
    public static final String FALLBACK_DIALOG_PARAM_BRIDGE_ARGS = "bridge_args";
    public static final String FALLBACK_DIALOG_PARAM_KEY_HASH = "android_key_hash";
    public static final String FALLBACK_DIALOG_PARAM_METHOD_ARGS = "method_args";
    public static final String FALLBACK_DIALOG_PARAM_METHOD_RESULTS = "method_results";
    public static final String FALLBACK_DIALOG_PARAM_VERSION = "version";
    private static final String GAMING_DIALOG_AUTHORITY_FORMAT = "%s";
    private static final String GRAPH_URL_FORMAT = "https://graph.%s";
    private static final String GRAPH_VIDEO_URL_FORMAT = "https://graph-video.%s";
    public static final String INSTAGRAM_OAUTH_PATH = "oauth/authorize";
    public static final ServerProtocol INSTANCE = new ServerProtocol();
    private static final String TAG = ServerProtocol.class.getName();

    private ServerProtocol() {
    }

    public static final String getDefaultAPIVersion() {
        return "v16.0";
    }

    public static final String getDialogAuthority() {
        b0 b0Var = b0.f15559a;
        FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
        String format = String.format(DIALOG_AUTHORITY_FORMAT, Arrays.copyOf(new Object[]{FacebookSdk.getFacebookDomain()}, 1));
        m.e(format, "java.lang.String.format(format, *args)");
        return format;
    }

    public static final String getErrorConnectionFailure() {
        return "CONNECTION_FAILURE";
    }

    public static final Collection<String> getErrorsProxyAuthDisabled() {
        return p.g("service_disabled", "AndroidAuthKillSwitchException");
    }

    public static final Collection<String> getErrorsUserCanceled() {
        return p.g("access_denied", "OAuthAccessDeniedException");
    }

    public static final String getFacebookGraphUrlBase() {
        b0 b0Var = b0.f15559a;
        FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
        String format = String.format(GRAPH_URL_FORMAT, Arrays.copyOf(new Object[]{FacebookSdk.getFacebookDomain()}, 1));
        m.e(format, "java.lang.String.format(format, *args)");
        return format;
    }

    public static final String getGamingDialogAuthority() {
        b0 b0Var = b0.f15559a;
        FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
        String format = String.format(GAMING_DIALOG_AUTHORITY_FORMAT, Arrays.copyOf(new Object[]{FacebookSdk.getFacebookGamingDomain()}, 1));
        m.e(format, "java.lang.String.format(format, *args)");
        return format;
    }

    public static final String getGraphUrlBase() {
        b0 b0Var = b0.f15559a;
        FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
        String format = String.format(GRAPH_URL_FORMAT, Arrays.copyOf(new Object[]{FacebookSdk.getGraphDomain()}, 1));
        m.e(format, "java.lang.String.format(format, *args)");
        return format;
    }

    public static final String getGraphUrlBaseForSubdomain(String str) {
        m.f(str, "subdomain");
        b0 b0Var = b0.f15559a;
        String format = String.format(GRAPH_URL_FORMAT, Arrays.copyOf(new Object[]{str}, 1));
        m.e(format, "java.lang.String.format(format, *args)");
        return format;
    }

    public static final String getGraphVideoUrlBase() {
        b0 b0Var = b0.f15559a;
        FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
        String format = String.format(GRAPH_VIDEO_URL_FORMAT, Arrays.copyOf(new Object[]{FacebookSdk.getGraphDomain()}, 1));
        m.e(format, "java.lang.String.format(format, *args)");
        return format;
    }

    public static final String getInstagramDialogAuthority() {
        b0 b0Var = b0.f15559a;
        FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
        String format = String.format(DIALOG_AUTHORITY_FORMAT, Arrays.copyOf(new Object[]{FacebookSdk.getInstagramDomain()}, 1));
        m.e(format, "java.lang.String.format(format, *args)");
        return format;
    }

    public static final Bundle getQueryParamsForPlatformActivityIntentWebFallback(String str, int i10, Bundle bundle) {
        m.f(str, "callId");
        FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
        String applicationSignature = FacebookSdk.getApplicationSignature(FacebookSdk.getApplicationContext());
        Utility utility = Utility.INSTANCE;
        if (Utility.isNullOrEmpty(applicationSignature)) {
            return null;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putString(FALLBACK_DIALOG_PARAM_KEY_HASH, applicationSignature);
        bundle2.putString("app_id", FacebookSdk.getApplicationId());
        bundle2.putInt(FALLBACK_DIALOG_PARAM_VERSION, i10);
        bundle2.putString("display", "touch");
        Bundle bundle3 = new Bundle();
        bundle3.putString("action_id", str);
        try {
            BundleJSONConverter bundleJSONConverter = BundleJSONConverter.INSTANCE;
            JSONObject convertToJSON = BundleJSONConverter.convertToJSON(bundle3);
            if (bundle == null) {
                bundle = new Bundle();
            }
            JSONObject convertToJSON2 = BundleJSONConverter.convertToJSON(bundle);
            if (convertToJSON != null) {
                if (convertToJSON2 != null) {
                    bundle2.putString(FALLBACK_DIALOG_PARAM_BRIDGE_ARGS, convertToJSON.toString());
                    bundle2.putString(FALLBACK_DIALOG_PARAM_METHOD_ARGS, convertToJSON2.toString());
                    return bundle2;
                }
            }
            return null;
        } catch (JSONException e10) {
            Logger.Companion companion = Logger.Companion;
            LoggingBehavior loggingBehavior = LoggingBehavior.DEVELOPER_ERRORS;
            String str2 = TAG;
            m.e(str2, "TAG");
            companion.log(loggingBehavior, 6, str2, m.o("Error creating Url -- ", e10));
            return null;
        } catch (IllegalArgumentException e11) {
            Logger.Companion companion2 = Logger.Companion;
            LoggingBehavior loggingBehavior2 = LoggingBehavior.DEVELOPER_ERRORS;
            String str3 = TAG;
            m.e(str3, "TAG");
            companion2.log(loggingBehavior2, 6, str3, m.o("Error creating Url -- ", e11));
            return null;
        }
    }
}
