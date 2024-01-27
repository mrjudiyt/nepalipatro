package com.facebook.login;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Pair;
import androidx.activity.result.c;
import androidx.activity.result.d;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import com.facebook.AccessToken;
import com.facebook.AccessTokenSource;
import com.facebook.AuthenticationToken;
import com.facebook.CallbackManager;
import com.facebook.FacebookActivity;
import com.facebook.FacebookAuthorizationException;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.GraphResponse;
import com.facebook.LoginStatusCallback;
import com.facebook.Profile;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.internal.CallbackManagerImpl;
import com.facebook.internal.CustomTabUtils;
import com.facebook.internal.FragmentWrapper;
import com.facebook.internal.NativeProtocol;
import com.facebook.internal.ServerProtocol;
import com.facebook.internal.Utility;
import com.facebook.internal.Validate;
import com.facebook.login.LoginClient;
import e.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;
import o8.q;

/* compiled from: LoginManager.kt */
public class LoginManager {
    public static final Companion Companion;
    private static final String EXPRESS_LOGIN_ALLOWED = "express_login_allowed";
    private static final String MANAGE_PERMISSION_PREFIX = "manage";
    /* access modifiers changed from: private */
    public static final Set<String> OTHER_PUBLISH_PERMISSIONS;
    private static final String PREFERENCE_LOGIN_MANAGER = "com.facebook.loginManager";
    private static final String PUBLISH_PERMISSION_PREFIX = "publish";
    private static final String TAG;
    /* access modifiers changed from: private */
    public static volatile LoginManager instance;
    private String authType = ServerProtocol.DIALOG_REREQUEST_AUTH_TYPE;
    private DefaultAudience defaultAudience = DefaultAudience.FRIENDS;
    private boolean isFamilyLogin;
    private LoginBehavior loginBehavior = LoginBehavior.NATIVE_WITH_FALLBACK;
    private LoginTargetApp loginTargetApp = LoginTargetApp.FACEBOOK;
    private String messengerPageId;
    private boolean resetMessengerState;
    private final SharedPreferences sharedPreferences;
    private boolean shouldSkipAccountDeduplication;

    /* compiled from: LoginManager.kt */
    private static final class ActivityStartActivityDelegate implements StartActivityDelegate {
        private final Activity activityContext;

        public ActivityStartActivityDelegate(Activity activity) {
            m.f(activity, "activity");
            this.activityContext = activity;
        }

        public Activity getActivityContext() {
            return this.activityContext;
        }

        public void startActivityForResult(Intent intent, int i10) {
            m.f(intent, "intent");
            getActivityContext().startActivityForResult(intent, i10);
        }
    }

    /* compiled from: LoginManager.kt */
    private static final class AndroidxActivityResultRegistryOwnerStartActivityDelegate implements StartActivityDelegate {
        private final d activityResultRegistryOwner;
        private final CallbackManager callbackManager;

        public AndroidxActivityResultRegistryOwnerStartActivityDelegate(d dVar, CallbackManager callbackManager2) {
            m.f(dVar, "activityResultRegistryOwner");
            m.f(callbackManager2, "callbackManager");
            this.activityResultRegistryOwner = dVar;
            this.callbackManager = callbackManager2;
        }

        /* access modifiers changed from: private */
        /* renamed from: startActivityForResult$lambda-0  reason: not valid java name */
        public static final void m144startActivityForResult$lambda0(AndroidxActivityResultRegistryOwnerStartActivityDelegate androidxActivityResultRegistryOwnerStartActivityDelegate, LoginManager$AndroidxActivityResultRegistryOwnerStartActivityDelegate$startActivityForResult$LauncherHolder loginManager$AndroidxActivityResultRegistryOwnerStartActivityDelegate$startActivityForResult$LauncherHolder, Pair pair) {
            m.f(androidxActivityResultRegistryOwnerStartActivityDelegate, "this$0");
            m.f(loginManager$AndroidxActivityResultRegistryOwnerStartActivityDelegate$startActivityForResult$LauncherHolder, "$launcherHolder");
            CallbackManager callbackManager2 = androidxActivityResultRegistryOwnerStartActivityDelegate.callbackManager;
            int requestCode = CallbackManagerImpl.RequestCodeOffset.Login.toRequestCode();
            Object obj = pair.first;
            m.e(obj, "result.first");
            callbackManager2.onActivityResult(requestCode, ((Number) obj).intValue(), (Intent) pair.second);
            c<Intent> launcher = loginManager$AndroidxActivityResultRegistryOwnerStartActivityDelegate$startActivityForResult$LauncherHolder.getLauncher();
            if (launcher != null) {
                launcher.d();
            }
            loginManager$AndroidxActivityResultRegistryOwnerStartActivityDelegate$startActivityForResult$LauncherHolder.setLauncher((c<Intent>) null);
        }

        public Activity getActivityContext() {
            d dVar = this.activityResultRegistryOwner;
            if (dVar instanceof Activity) {
                return (Activity) dVar;
            }
            return null;
        }

        public void startActivityForResult(Intent intent, int i10) {
            m.f(intent, "intent");
            LoginManager$AndroidxActivityResultRegistryOwnerStartActivityDelegate$startActivityForResult$LauncherHolder loginManager$AndroidxActivityResultRegistryOwnerStartActivityDelegate$startActivityForResult$LauncherHolder = new LoginManager$AndroidxActivityResultRegistryOwnerStartActivityDelegate$startActivityForResult$LauncherHolder();
            loginManager$AndroidxActivityResultRegistryOwnerStartActivityDelegate$startActivityForResult$LauncherHolder.setLauncher(this.activityResultRegistryOwner.getActivityResultRegistry().j("facebook-login", new LoginManager$AndroidxActivityResultRegistryOwnerStartActivityDelegate$startActivityForResult$1(), new p(this, loginManager$AndroidxActivityResultRegistryOwnerStartActivityDelegate$startActivityForResult$LauncherHolder)));
            c<Intent> launcher = loginManager$AndroidxActivityResultRegistryOwnerStartActivityDelegate$startActivityForResult$LauncherHolder.getLauncher();
            if (launcher != null) {
                launcher.b(intent);
            }
        }
    }

    /* compiled from: LoginManager.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        /* access modifiers changed from: private */
        public final Set<String> getOtherPublishPermissions() {
            return m0.f("ads_management", "create_event", "rsvp_event");
        }

        /* access modifiers changed from: private */
        public final void handleLoginStatusError(String str, String str2, String str3, LoginLogger loginLogger, LoginStatusCallback loginStatusCallback) {
            FacebookException facebookException = new FacebookException(str + ": " + str2);
            loginLogger.logLoginStatusError(str3, facebookException);
            loginStatusCallback.onError(facebookException);
        }

        public final LoginResult computeLoginResult(LoginClient.Request request, AccessToken accessToken, AuthenticationToken authenticationToken) {
            m.f(request, "request");
            m.f(accessToken, "newToken");
            Set<String> permissions = request.getPermissions();
            Set U = x.U(x.u(accessToken.getPermissions()));
            if (request.isRerequest()) {
                U.retainAll(permissions);
            }
            Set U2 = x.U(x.u(permissions));
            U2.removeAll(U);
            return new LoginResult(accessToken, authenticationToken, U, U2);
        }

        public final Map<String, String> getExtraDataFromIntent(Intent intent) {
            if (intent == null) {
                return null;
            }
            intent.setExtrasClassLoader(LoginClient.Result.class.getClassLoader());
            LoginClient.Result result = (LoginClient.Result) intent.getParcelableExtra(LoginFragment.RESULT_KEY);
            if (result == null) {
                return null;
            }
            return result.extraData;
        }

        public LoginManager getInstance() {
            if (LoginManager.instance == null) {
                synchronized (this) {
                    Companion companion = LoginManager.Companion;
                    LoginManager.instance = new LoginManager();
                    q qVar = q.f16189a;
                }
            }
            LoginManager access$getInstance$cp = LoginManager.instance;
            if (access$getInstance$cp != null) {
                return access$getInstance$cp;
            }
            m.x("instance");
            throw null;
        }

        public final boolean isPublishPermission(String str) {
            if (str == null) {
                return false;
            }
            if (p.v(str, LoginManager.PUBLISH_PERMISSION_PREFIX, false, 2, (Object) null) || p.v(str, LoginManager.MANAGE_PERMISSION_PREFIX, false, 2, (Object) null) || LoginManager.OTHER_PUBLISH_PERMISSIONS.contains(str)) {
                return true;
            }
            return false;
        }
    }

    /* compiled from: LoginManager.kt */
    public final class FacebookLoginActivityResultContract extends a<Collection<? extends String>, CallbackManager.ActivityResultParameters> {
        private CallbackManager callbackManager;
        private String loggerID;

        public FacebookLoginActivityResultContract(LoginManager loginManager, CallbackManager callbackManager2, String str) {
            m.f(loginManager, "this$0");
            LoginManager.this = loginManager;
            this.callbackManager = callbackManager2;
            this.loggerID = str;
        }

        public final CallbackManager getCallbackManager() {
            return this.callbackManager;
        }

        public final String getLoggerID() {
            return this.loggerID;
        }

        public final void setCallbackManager(CallbackManager callbackManager2) {
            this.callbackManager = callbackManager2;
        }

        public final void setLoggerID(String str) {
            this.loggerID = str;
        }

        public Intent createIntent(Context context, Collection<String> collection) {
            m.f(context, "context");
            m.f(collection, "permissions");
            LoginClient.Request createLoginRequestWithConfig = LoginManager.this.createLoginRequestWithConfig(new LoginConfiguration(collection, (String) null, 2, (g) null));
            String str = this.loggerID;
            if (str != null) {
                createLoginRequestWithConfig.setAuthId(str);
            }
            LoginManager.this.logStartLogin(context, createLoginRequestWithConfig);
            Intent facebookActivityIntent = LoginManager.this.getFacebookActivityIntent(createLoginRequestWithConfig);
            if (LoginManager.this.resolveIntent(facebookActivityIntent)) {
                return facebookActivityIntent;
            }
            FacebookException facebookException = new FacebookException("Log in attempt failed: FacebookActivity could not be started. Please make sure you added FacebookActivity to the AndroidManifest.");
            LoginManager.this.logCompleteLogin(context, LoginClient.Result.Code.ERROR, (Map<String, String>) null, facebookException, false, createLoginRequestWithConfig);
            throw facebookException;
        }

        public CallbackManager.ActivityResultParameters parseResult(int i10, Intent intent) {
            LoginManager.onActivityResult$default(LoginManager.this, i10, intent, (FacebookCallback) null, 4, (Object) null);
            int requestCode = CallbackManagerImpl.RequestCodeOffset.Login.toRequestCode();
            CallbackManager callbackManager2 = this.callbackManager;
            if (callbackManager2 != null) {
                callbackManager2.onActivityResult(requestCode, i10, intent);
            }
            return new CallbackManager.ActivityResultParameters(requestCode, i10, intent);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ FacebookLoginActivityResultContract(CallbackManager callbackManager2, String str, int i10, g gVar) {
            this(LoginManager.this, (i10 & 1) != 0 ? null : callbackManager2, (i10 & 2) != 0 ? null : str);
        }
    }

    /* compiled from: LoginManager.kt */
    private static final class FragmentStartActivityDelegate implements StartActivityDelegate {
        private final Activity activityContext;
        private final FragmentWrapper fragment;

        public FragmentStartActivityDelegate(FragmentWrapper fragmentWrapper) {
            m.f(fragmentWrapper, "fragment");
            this.fragment = fragmentWrapper;
            this.activityContext = fragmentWrapper.getActivity();
        }

        public Activity getActivityContext() {
            return this.activityContext;
        }

        public void startActivityForResult(Intent intent, int i10) {
            m.f(intent, "intent");
            this.fragment.startActivityForResult(intent, i10);
        }
    }

    /* compiled from: LoginManager.kt */
    private static final class LoginLoggerHolder {
        public static final LoginLoggerHolder INSTANCE = new LoginLoggerHolder();
        private static LoginLogger logger;

        private LoginLoggerHolder() {
        }

        public final synchronized LoginLogger getLogger(Context context) {
            if (context == null) {
                FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
                context = FacebookSdk.getApplicationContext();
            }
            if (context == null) {
                return null;
            }
            if (logger == null) {
                FacebookSdk facebookSdk2 = FacebookSdk.INSTANCE;
                logger = new LoginLogger(context, FacebookSdk.getApplicationId());
            }
            return logger;
        }
    }

    static {
        Companion companion = new Companion((g) null);
        Companion = companion;
        OTHER_PUBLISH_PERMISSIONS = companion.getOtherPublishPermissions();
        String cls = LoginManager.class.toString();
        m.e(cls, "LoginManager::class.java.toString()");
        TAG = cls;
    }

    public LoginManager() {
        Validate validate = Validate.INSTANCE;
        Validate.sdkInitialized();
        FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
        SharedPreferences sharedPreferences2 = FacebookSdk.getApplicationContext().getSharedPreferences(PREFERENCE_LOGIN_MANAGER, 0);
        m.e(sharedPreferences2, "getApplicationContext().getSharedPreferences(PREFERENCE_LOGIN_MANAGER, Context.MODE_PRIVATE)");
        this.sharedPreferences = sharedPreferences2;
        if (FacebookSdk.hasCustomTabsPrefetching) {
            CustomTabUtils customTabUtils = CustomTabUtils.INSTANCE;
            if (CustomTabUtils.getChromePackage() != null) {
                androidx.browser.customtabs.c.a(FacebookSdk.getApplicationContext(), "com.android.chrome", new CustomTabPrefetchHelper());
                androidx.browser.customtabs.c.b(FacebookSdk.getApplicationContext(), FacebookSdk.getApplicationContext().getPackageName());
            }
        }
    }

    public static final LoginResult computeLoginResult(LoginClient.Request request, AccessToken accessToken, AuthenticationToken authenticationToken) {
        return Companion.computeLoginResult(request, accessToken, authenticationToken);
    }

    public static /* synthetic */ FacebookLoginActivityResultContract createLogInActivityResultContract$default(LoginManager loginManager, CallbackManager callbackManager, String str, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 1) != 0) {
                callbackManager = null;
            }
            if ((i10 & 2) != 0) {
                str = null;
            }
            return loginManager.createLogInActivityResultContract(callbackManager, str);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createLogInActivityResultContract");
    }

    private final LoginClient.Request createLoginRequestFromResponse(GraphResponse graphResponse) {
        Set<String> permissions;
        AccessToken accessToken = graphResponse.getRequest().getAccessToken();
        List list = null;
        if (!(accessToken == null || (permissions = accessToken.getPermissions()) == null)) {
            list = x.u(permissions);
        }
        return createLoginRequest(list);
    }

    private final void finishLogin(AccessToken accessToken, AuthenticationToken authenticationToken, LoginClient.Request request, FacebookException facebookException, boolean z10, FacebookCallback<LoginResult> facebookCallback) {
        if (accessToken != null) {
            AccessToken.Companion.setCurrentAccessToken(accessToken);
            Profile.Companion.fetchProfileForCurrentAccessToken();
        }
        if (authenticationToken != null) {
            AuthenticationToken.Companion.setCurrentAuthenticationToken(authenticationToken);
        }
        if (facebookCallback != null) {
            LoginResult computeLoginResult = (accessToken == null || request == null) ? null : Companion.computeLoginResult(request, accessToken, authenticationToken);
            if (z10 || (computeLoginResult != null && computeLoginResult.getRecentlyGrantedPermissions().isEmpty())) {
                facebookCallback.onCancel();
            } else if (facebookException != null) {
                facebookCallback.onError(facebookException);
            } else if (accessToken != null && computeLoginResult != null) {
                setExpressLoginStatus(true);
                facebookCallback.onSuccess(computeLoginResult);
            }
        }
    }

    public static final Map<String, String> getExtraDataFromIntent(Intent intent) {
        return Companion.getExtraDataFromIntent(intent);
    }

    public static LoginManager getInstance() {
        return Companion.getInstance();
    }

    private final boolean isExpressLoginAllowed() {
        return this.sharedPreferences.getBoolean(EXPRESS_LOGIN_ALLOWED, true);
    }

    public static final boolean isPublishPermission(String str) {
        return Companion.isPublishPermission(str);
    }

    /* access modifiers changed from: private */
    public final void logCompleteLogin(Context context, LoginClient.Result.Code code, Map<String, String> map, Exception exc, boolean z10, LoginClient.Request request) {
        LoginLogger logger = LoginLoggerHolder.INSTANCE.getLogger(context);
        if (logger != null) {
            if (request == null) {
                LoginLogger.logUnexpectedError$default(logger, LoginLogger.EVENT_NAME_LOGIN_COMPLETE, "Unexpected call to logCompleteLogin with null pendingAuthorizationRequest.", (String) null, 4, (Object) null);
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put(LoginLogger.EVENT_EXTRAS_TRY_LOGIN_ACTIVITY, z10 ? AppEventsConstants.EVENT_PARAM_VALUE_YES : AppEventsConstants.EVENT_PARAM_VALUE_NO);
            logger.logCompleteLogin(request.getAuthId(), hashMap, code, map, exc, request.isFamilyLogin() ? LoginLogger.EVENT_NAME_FOA_LOGIN_COMPLETE : LoginLogger.EVENT_NAME_LOGIN_COMPLETE);
        }
    }

    /* access modifiers changed from: private */
    public final void logStartLogin(Context context, LoginClient.Request request) {
        LoginLogger logger = LoginLoggerHolder.INSTANCE.getLogger(context);
        if (logger != null && request != null) {
            logger.logStartLogin(request, request.isFamilyLogin() ? LoginLogger.EVENT_NAME_FOA_LOGIN_START : LoginLogger.EVENT_NAME_LOGIN_START);
        }
    }

    private final void loginWithConfiguration(FragmentWrapper fragmentWrapper, LoginConfiguration loginConfiguration) {
        logIn(fragmentWrapper, loginConfiguration);
    }

    public static /* synthetic */ boolean onActivityResult$default(LoginManager loginManager, int i10, Intent intent, FacebookCallback facebookCallback, int i11, Object obj) {
        if (obj == null) {
            if ((i11 & 4) != 0) {
                facebookCallback = null;
            }
            return loginManager.onActivityResult(i10, intent, facebookCallback);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onActivityResult");
    }

    /* access modifiers changed from: private */
    /* renamed from: registerCallback$lambda-0  reason: not valid java name */
    public static final boolean m141registerCallback$lambda0(LoginManager loginManager, FacebookCallback facebookCallback, int i10, Intent intent) {
        m.f(loginManager, "this$0");
        return loginManager.onActivityResult(i10, intent, facebookCallback);
    }

    /* access modifiers changed from: private */
    public final boolean resolveIntent(Intent intent) {
        FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
        return FacebookSdk.getApplicationContext().getPackageManager().resolveActivity(intent, 0) != null;
    }

    private final void retrieveLoginStatusImpl(Context context, LoginStatusCallback loginStatusCallback, long j10) {
        FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
        String applicationId = FacebookSdk.getApplicationId();
        String uuid = UUID.randomUUID().toString();
        m.e(uuid, "randomUUID().toString()");
        LoginLogger loginLogger = new LoginLogger(context == null ? FacebookSdk.getApplicationContext() : context, applicationId);
        if (!isExpressLoginAllowed()) {
            loginLogger.logLoginStatusFailure(uuid);
            loginStatusCallback.onFailure();
            return;
        }
        LoginStatusClient newInstance$facebook_common_release = LoginStatusClient.Companion.newInstance$facebook_common_release(context, applicationId, uuid, FacebookSdk.getGraphApiVersion(), j10, (String) null);
        newInstance$facebook_common_release.setCompletedListener(new o(uuid, loginLogger, loginStatusCallback, applicationId));
        loginLogger.logLoginStatusStart(uuid);
        if (!newInstance$facebook_common_release.start()) {
            loginLogger.logLoginStatusFailure(uuid);
            loginStatusCallback.onFailure();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: retrieveLoginStatusImpl$lambda-2  reason: not valid java name */
    public static final void m142retrieveLoginStatusImpl$lambda2(String str, LoginLogger loginLogger, LoginStatusCallback loginStatusCallback, String str2, Bundle bundle) {
        String str3 = str;
        LoginLogger loginLogger2 = loginLogger;
        LoginStatusCallback loginStatusCallback2 = loginStatusCallback;
        Bundle bundle2 = bundle;
        m.f(str3, "$loggerRef");
        m.f(loginLogger2, "$logger");
        m.f(loginStatusCallback2, "$responseCallback");
        m.f(str2, "$applicationId");
        if (bundle2 != null) {
            String string = bundle2.getString(NativeProtocol.STATUS_ERROR_TYPE);
            String string2 = bundle2.getString(NativeProtocol.STATUS_ERROR_DESCRIPTION);
            if (string != null) {
                Companion.handleLoginStatusError(string, string2, str, loginLogger, loginStatusCallback);
                return;
            }
            String string3 = bundle2.getString(NativeProtocol.EXTRA_ACCESS_TOKEN);
            Utility utility = Utility.INSTANCE;
            Date bundleLongAsDate = Utility.getBundleLongAsDate(bundle2, NativeProtocol.EXTRA_EXPIRES_SECONDS_SINCE_EPOCH, new Date(0));
            ArrayList<String> stringArrayList = bundle2.getStringArrayList(NativeProtocol.EXTRA_PERMISSIONS);
            String string4 = bundle2.getString(NativeProtocol.RESULT_ARGS_SIGNED_REQUEST);
            String string5 = bundle2.getString("graph_domain");
            Date bundleLongAsDate2 = Utility.getBundleLongAsDate(bundle2, NativeProtocol.EXTRA_DATA_ACCESS_EXPIRATION_TIME, new Date(0));
            String str4 = null;
            boolean z10 = false;
            if (!(string4 == null || string4.length() == 0)) {
                str4 = LoginMethodHandler.Companion.getUserIDFromSignedRequest(string4);
            }
            String str5 = str4;
            if (!(string3 == null || string3.length() == 0)) {
                if (!(stringArrayList == null || stringArrayList.isEmpty())) {
                    if (str5 == null || str5.length() == 0) {
                        z10 = true;
                    }
                    if (!z10) {
                        AccessToken accessToken = new AccessToken(string3, str2, str5, stringArrayList, (Collection<String>) null, (Collection<String>) null, (AccessTokenSource) null, bundleLongAsDate, (Date) null, bundleLongAsDate2, string5);
                        AccessToken.Companion.setCurrentAccessToken(accessToken);
                        Profile.Companion.fetchProfileForCurrentAccessToken();
                        loginLogger2.logLoginStatusSuccess(str3);
                        loginStatusCallback2.onCompleted(accessToken);
                        return;
                    }
                }
            }
            loginLogger2.logLoginStatusFailure(str3);
            loginStatusCallback.onFailure();
            return;
        }
        loginLogger2.logLoginStatusFailure(str3);
        loginStatusCallback.onFailure();
    }

    private final void setExpressLoginStatus(boolean z10) {
        SharedPreferences.Editor edit = this.sharedPreferences.edit();
        edit.putBoolean(EXPRESS_LOGIN_ALLOWED, z10);
        edit.apply();
    }

    private final void startLogin(StartActivityDelegate startActivityDelegate, LoginClient.Request request) {
        logStartLogin(startActivityDelegate.getActivityContext(), request);
        CallbackManagerImpl.Companion.registerStaticCallback(CallbackManagerImpl.RequestCodeOffset.Login.toRequestCode(), new m(this));
        if (!tryFacebookActivity(startActivityDelegate, request)) {
            FacebookException facebookException = new FacebookException("Log in attempt failed: FacebookActivity could not be started. Please make sure you added FacebookActivity to the AndroidManifest.");
            logCompleteLogin(startActivityDelegate.getActivityContext(), LoginClient.Result.Code.ERROR, (Map<String, String>) null, facebookException, false, request);
            throw facebookException;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: startLogin$lambda-1  reason: not valid java name */
    public static final boolean m143startLogin$lambda1(LoginManager loginManager, int i10, Intent intent) {
        m.f(loginManager, "this$0");
        return onActivityResult$default(loginManager, i10, intent, (FacebookCallback) null, 4, (Object) null);
    }

    private final boolean tryFacebookActivity(StartActivityDelegate startActivityDelegate, LoginClient.Request request) {
        Intent facebookActivityIntent = getFacebookActivityIntent(request);
        if (!resolveIntent(facebookActivityIntent)) {
            return false;
        }
        try {
            startActivityDelegate.startActivityForResult(facebookActivityIntent, LoginClient.Companion.getLoginRequestCode());
            return true;
        } catch (ActivityNotFoundException unused) {
            return false;
        }
    }

    private final void validatePublishPermissions(Collection<String> collection) {
        if (collection != null) {
            for (String next : collection) {
                if (!Companion.isPublishPermission(next)) {
                    throw new FacebookException("Cannot pass a read permission (" + next + ") to a request for publish authorization");
                }
            }
        }
    }

    private final void validateReadPermissions(Collection<String> collection) {
        if (collection != null) {
            for (String next : collection) {
                if (Companion.isPublishPermission(next)) {
                    throw new FacebookException("Cannot pass a publish or manage permission (" + next + ") to a request for read authorization");
                }
            }
        }
    }

    public final FacebookLoginActivityResultContract createLogInActivityResultContract() {
        return createLogInActivityResultContract$default(this, (CallbackManager) null, (String) null, 3, (Object) null);
    }

    public final FacebookLoginActivityResultContract createLogInActivityResultContract(CallbackManager callbackManager) {
        return createLogInActivityResultContract$default(this, callbackManager, (String) null, 2, (Object) null);
    }

    public final FacebookLoginActivityResultContract createLogInActivityResultContract(CallbackManager callbackManager, String str) {
        return new FacebookLoginActivityResultContract(this, callbackManager, str);
    }

    /* access modifiers changed from: protected */
    public LoginClient.Request createLoginRequest(Collection<String> collection) {
        Set set;
        LoginBehavior loginBehavior2 = this.loginBehavior;
        if (collection == null) {
            set = null;
        } else {
            set = x.V(collection);
        }
        Set set2 = set;
        DefaultAudience defaultAudience2 = this.defaultAudience;
        String str = this.authType;
        FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
        String applicationId = FacebookSdk.getApplicationId();
        String uuid = UUID.randomUUID().toString();
        m.e(uuid, "randomUUID().toString()");
        LoginClient.Request request = new LoginClient.Request(loginBehavior2, set2, defaultAudience2, str, applicationId, uuid, this.loginTargetApp, (String) null, (String) null, (String) null, (CodeChallengeMethod) null, 1920, (g) null);
        request.setRerequest(AccessToken.Companion.isCurrentAccessTokenActive());
        request.setMessengerPageId(this.messengerPageId);
        request.setResetMessengerState(this.resetMessengerState);
        request.setFamilyLogin(this.isFamilyLogin);
        request.setShouldSkipAccountDeduplication(this.shouldSkipAccountDeduplication);
        return request;
    }

    /* access modifiers changed from: protected */
    public LoginClient.Request createLoginRequestWithConfig(LoginConfiguration loginConfiguration) {
        String str;
        m.f(loginConfiguration, "loginConfig");
        CodeChallengeMethod codeChallengeMethod = CodeChallengeMethod.S256;
        try {
            PKCEUtil pKCEUtil = PKCEUtil.INSTANCE;
            str = PKCEUtil.generateCodeChallenge(loginConfiguration.getCodeVerifier(), codeChallengeMethod);
        } catch (FacebookException unused) {
            codeChallengeMethod = CodeChallengeMethod.PLAIN;
            str = loginConfiguration.getCodeVerifier();
        }
        String str2 = str;
        LoginBehavior loginBehavior2 = this.loginBehavior;
        Set V = x.V(loginConfiguration.getPermissions());
        DefaultAudience defaultAudience2 = this.defaultAudience;
        String str3 = this.authType;
        FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
        String applicationId = FacebookSdk.getApplicationId();
        String uuid = UUID.randomUUID().toString();
        m.e(uuid, "randomUUID().toString()");
        LoginClient.Request request = new LoginClient.Request(loginBehavior2, V, defaultAudience2, str3, applicationId, uuid, this.loginTargetApp, loginConfiguration.getNonce(), loginConfiguration.getCodeVerifier(), str2, codeChallengeMethod);
        request.setRerequest(AccessToken.Companion.isCurrentAccessTokenActive());
        request.setMessengerPageId(this.messengerPageId);
        request.setResetMessengerState(this.resetMessengerState);
        request.setFamilyLogin(this.isFamilyLogin);
        request.setShouldSkipAccountDeduplication(this.shouldSkipAccountDeduplication);
        return request;
    }

    /* access modifiers changed from: protected */
    public LoginClient.Request createReauthorizeRequest() {
        LoginBehavior loginBehavior2 = LoginBehavior.DIALOG_ONLY;
        HashSet hashSet = new HashSet();
        DefaultAudience defaultAudience2 = this.defaultAudience;
        FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
        String applicationId = FacebookSdk.getApplicationId();
        String uuid = UUID.randomUUID().toString();
        m.e(uuid, "randomUUID().toString()");
        LoginClient.Request request = new LoginClient.Request(loginBehavior2, hashSet, defaultAudience2, "reauthorize", applicationId, uuid, this.loginTargetApp, (String) null, (String) null, (String) null, (CodeChallengeMethod) null, 1920, (g) null);
        request.setFamilyLogin(this.isFamilyLogin);
        request.setShouldSkipAccountDeduplication(this.shouldSkipAccountDeduplication);
        return request;
    }

    public final String getAuthType() {
        return this.authType;
    }

    public final DefaultAudience getDefaultAudience() {
        return this.defaultAudience;
    }

    /* access modifiers changed from: protected */
    public Intent getFacebookActivityIntent(LoginClient.Request request) {
        m.f(request, "request");
        Intent intent = new Intent();
        FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
        intent.setClass(FacebookSdk.getApplicationContext(), FacebookActivity.class);
        intent.setAction(request.getLoginBehavior().toString());
        Bundle bundle = new Bundle();
        bundle.putParcelable("request", request);
        intent.putExtra(LoginFragment.REQUEST_KEY, bundle);
        return intent;
    }

    public final LoginBehavior getLoginBehavior() {
        return this.loginBehavior;
    }

    public final LoginTargetApp getLoginTargetApp() {
        return this.loginTargetApp;
    }

    public final boolean getShouldSkipAccountDeduplication() {
        return this.shouldSkipAccountDeduplication;
    }

    public final boolean isFamilyLogin() {
        return this.isFamilyLogin;
    }

    public final void logIn(Fragment fragment, Collection<String> collection) {
        m.f(fragment, "fragment");
        logIn(new FragmentWrapper(fragment), collection);
    }

    public final void logInWithConfiguration(Fragment fragment, LoginConfiguration loginConfiguration) {
        m.f(fragment, "fragment");
        m.f(loginConfiguration, "loginConfig");
        loginWithConfiguration(new FragmentWrapper(fragment), loginConfiguration);
    }

    public final void logInWithPublishPermissions(Fragment fragment, Collection<String> collection) {
        m.f(fragment, "fragment");
        m.f(collection, "permissions");
        logInWithPublishPermissions(new FragmentWrapper(fragment), collection);
    }

    public final void logInWithReadPermissions(Fragment fragment, Collection<String> collection) {
        m.f(fragment, "fragment");
        m.f(collection, "permissions");
        logInWithReadPermissions(new FragmentWrapper(fragment), collection);
    }

    public void logOut() {
        AccessToken.Companion.setCurrentAccessToken((AccessToken) null);
        AuthenticationToken.Companion.setCurrentAuthenticationToken((AuthenticationToken) null);
        Profile.Companion.setCurrentProfile((Profile) null);
        setExpressLoginStatus(false);
    }

    public final boolean onActivityResult(int i10, Intent intent) {
        return onActivityResult$default(this, i10, intent, (FacebookCallback) null, 4, (Object) null);
    }

    public boolean onActivityResult(int i10, Intent intent, FacebookCallback<LoginResult> facebookCallback) {
        boolean z10;
        Map<String, String> map;
        LoginClient.Result.Code code;
        LoginClient.Request request;
        AuthenticationToken authenticationToken;
        AccessToken accessToken;
        AuthenticationToken authenticationToken2;
        int i11 = i10;
        Intent intent2 = intent;
        LoginClient.Result.Code code2 = LoginClient.Result.Code.ERROR;
        FacebookException facebookException = null;
        boolean z11 = false;
        if (intent2 != null) {
            intent2.setExtrasClassLoader(LoginClient.Result.class.getClassLoader());
            LoginClient.Result result = (LoginClient.Result) intent2.getParcelableExtra(LoginFragment.RESULT_KEY);
            if (result != null) {
                request = result.request;
                LoginClient.Result.Code code3 = result.code;
                if (i11 != -1) {
                    if (i11 != 0) {
                        accessToken = null;
                        authenticationToken2 = null;
                    } else {
                        accessToken = null;
                        authenticationToken2 = null;
                        z11 = true;
                    }
                } else if (code3 == LoginClient.Result.Code.SUCCESS) {
                    accessToken = result.token;
                    authenticationToken2 = result.authenticationToken;
                } else {
                    authenticationToken2 = null;
                    facebookException = new FacebookAuthorizationException(result.errorMessage);
                    accessToken = null;
                }
                map = result.loggingExtras;
                z10 = z11;
                authenticationToken = authenticationToken2;
                code = code3;
                if (facebookException == null && accessToken == null && !z10) {
                    facebookException = new FacebookException("Unexpected call to LoginManager.onActivityResult");
                }
                FacebookException facebookException2 = facebookException;
                LoginClient.Request request2 = request;
                logCompleteLogin((Context) null, code, map, facebookException2, true, request2);
                finishLogin(accessToken, authenticationToken, request2, facebookException2, z10, facebookCallback);
                return true;
            }
        } else if (i11 == 0) {
            code = LoginClient.Result.Code.CANCEL;
            accessToken = null;
            authenticationToken = null;
            request = null;
            map = null;
            z10 = true;
            facebookException = new FacebookException("Unexpected call to LoginManager.onActivityResult");
            FacebookException facebookException22 = facebookException;
            LoginClient.Request request22 = request;
            logCompleteLogin((Context) null, code, map, facebookException22, true, request22);
            finishLogin(accessToken, authenticationToken, request22, facebookException22, z10, facebookCallback);
            return true;
        }
        code = code2;
        accessToken = null;
        authenticationToken = null;
        request = null;
        map = null;
        z10 = false;
        facebookException = new FacebookException("Unexpected call to LoginManager.onActivityResult");
        FacebookException facebookException222 = facebookException;
        LoginClient.Request request222 = request;
        logCompleteLogin((Context) null, code, map, facebookException222, true, request222);
        finishLogin(accessToken, authenticationToken, request222, facebookException222, z10, facebookCallback);
        return true;
    }

    public final void reauthorizeDataAccess(Activity activity) {
        m.f(activity, "activity");
        startLogin(new ActivityStartActivityDelegate(activity), createReauthorizeRequest());
    }

    public final void registerCallback(CallbackManager callbackManager, FacebookCallback<LoginResult> facebookCallback) {
        if (callbackManager instanceof CallbackManagerImpl) {
            ((CallbackManagerImpl) callbackManager).registerCallback(CallbackManagerImpl.RequestCodeOffset.Login.toRequestCode(), new n(this, facebookCallback));
            return;
        }
        throw new FacebookException("Unexpected CallbackManager, please use the provided Factory.");
    }

    public final void resolveError(Activity activity, GraphResponse graphResponse) {
        m.f(activity, "activity");
        m.f(graphResponse, "response");
        startLogin(new ActivityStartActivityDelegate(activity), createLoginRequestFromResponse(graphResponse));
    }

    public final void retrieveLoginStatus(Context context, LoginStatusCallback loginStatusCallback) {
        m.f(context, "context");
        m.f(loginStatusCallback, "responseCallback");
        retrieveLoginStatus(context, 5000, loginStatusCallback);
    }

    public final LoginManager setAuthType(String str) {
        m.f(str, "authType");
        this.authType = str;
        return this;
    }

    public final LoginManager setDefaultAudience(DefaultAudience defaultAudience2) {
        m.f(defaultAudience2, "defaultAudience");
        this.defaultAudience = defaultAudience2;
        return this;
    }

    public final LoginManager setFamilyLogin(boolean z10) {
        this.isFamilyLogin = z10;
        return this;
    }

    public final LoginManager setLoginBehavior(LoginBehavior loginBehavior2) {
        m.f(loginBehavior2, "loginBehavior");
        this.loginBehavior = loginBehavior2;
        return this;
    }

    public final LoginManager setLoginTargetApp(LoginTargetApp loginTargetApp2) {
        m.f(loginTargetApp2, "targetApp");
        this.loginTargetApp = loginTargetApp2;
        return this;
    }

    public final LoginManager setMessengerPageId(String str) {
        this.messengerPageId = str;
        return this;
    }

    public final LoginManager setResetMessengerState(boolean z10) {
        this.resetMessengerState = z10;
        return this;
    }

    public final LoginManager setShouldSkipAccountDeduplication(boolean z10) {
        this.shouldSkipAccountDeduplication = z10;
        return this;
    }

    public final void unregisterCallback(CallbackManager callbackManager) {
        if (callbackManager instanceof CallbackManagerImpl) {
            ((CallbackManagerImpl) callbackManager).unregisterCallback(CallbackManagerImpl.RequestCodeOffset.Login.toRequestCode());
            return;
        }
        throw new FacebookException("Unexpected CallbackManager, please use the provided Factory.");
    }

    public final void logIn(Fragment fragment, Collection<String> collection, String str) {
        m.f(fragment, "fragment");
        logIn(new FragmentWrapper(fragment), collection, str);
    }

    public final void logInWithPublishPermissions(Fragment fragment, CallbackManager callbackManager, Collection<String> collection) {
        m.f(fragment, "fragment");
        m.f(callbackManager, "callbackManager");
        m.f(collection, "permissions");
        e activity = fragment.getActivity();
        if (activity != null) {
            logInWithPublishPermissions((d) activity, callbackManager, collection);
            return;
        }
        throw new FacebookException(m.o("Cannot obtain activity context on the fragment ", fragment));
    }

    public final void logInWithReadPermissions(Fragment fragment, CallbackManager callbackManager, Collection<String> collection) {
        m.f(fragment, "fragment");
        m.f(callbackManager, "callbackManager");
        m.f(collection, "permissions");
        e activity = fragment.getActivity();
        if (activity != null) {
            logInWithReadPermissions((d) activity, callbackManager, collection);
            return;
        }
        throw new FacebookException(m.o("Cannot obtain activity context on the fragment ", fragment));
    }

    public final void loginWithConfiguration(Activity activity, LoginConfiguration loginConfiguration) {
        m.f(activity, "activity");
        m.f(loginConfiguration, "loginConfig");
        logIn(activity, loginConfiguration);
    }

    public final void resolveError(Fragment fragment, GraphResponse graphResponse) {
        m.f(fragment, "fragment");
        m.f(graphResponse, "response");
        resolveError(new FragmentWrapper(fragment), graphResponse);
    }

    public final void retrieveLoginStatus(Context context, long j10, LoginStatusCallback loginStatusCallback) {
        m.f(context, "context");
        m.f(loginStatusCallback, "responseCallback");
        retrieveLoginStatusImpl(context, loginStatusCallback, j10);
    }

    public final void logIn(android.app.Fragment fragment, Collection<String> collection) {
        m.f(fragment, "fragment");
        logIn(new FragmentWrapper(fragment), collection);
    }

    public final void reauthorizeDataAccess(Fragment fragment) {
        m.f(fragment, "fragment");
        reauthorizeDataAccess(new FragmentWrapper(fragment));
    }

    public final void resolveError(Fragment fragment, CallbackManager callbackManager, GraphResponse graphResponse) {
        m.f(fragment, "fragment");
        m.f(callbackManager, "callbackManager");
        m.f(graphResponse, "response");
        e activity = fragment.getActivity();
        if (activity != null) {
            resolveError((d) activity, callbackManager, graphResponse);
            return;
        }
        throw new FacebookException(m.o("Cannot obtain activity context on the fragment ", fragment));
    }

    private final void reauthorizeDataAccess(FragmentWrapper fragmentWrapper) {
        startLogin(new FragmentStartActivityDelegate(fragmentWrapper), createReauthorizeRequest());
    }

    public final void logIn(android.app.Fragment fragment, Collection<String> collection, String str) {
        m.f(fragment, "fragment");
        logIn(new FragmentWrapper(fragment), collection, str);
    }

    public final void logIn(FragmentWrapper fragmentWrapper, Collection<String> collection) {
        m.f(fragmentWrapper, "fragment");
        logIn(fragmentWrapper, new LoginConfiguration(collection, (String) null, 2, (g) null));
    }

    public final void logInWithPublishPermissions(android.app.Fragment fragment, Collection<String> collection) {
        m.f(fragment, "fragment");
        m.f(collection, "permissions");
        logInWithPublishPermissions(new FragmentWrapper(fragment), collection);
    }

    public final void logInWithReadPermissions(android.app.Fragment fragment, Collection<String> collection) {
        m.f(fragment, "fragment");
        m.f(collection, "permissions");
        logInWithReadPermissions(new FragmentWrapper(fragment), collection);
    }

    private final void logInWithPublishPermissions(FragmentWrapper fragmentWrapper, Collection<String> collection) {
        validatePublishPermissions(collection);
        loginWithConfiguration(fragmentWrapper, new LoginConfiguration(collection, (String) null, 2, (g) null));
    }

    private final void logInWithReadPermissions(FragmentWrapper fragmentWrapper, Collection<String> collection) {
        validateReadPermissions(collection);
        logIn(fragmentWrapper, new LoginConfiguration(collection, (String) null, 2, (g) null));
    }

    public final void resolveError(android.app.Fragment fragment, GraphResponse graphResponse) {
        m.f(fragment, "fragment");
        m.f(graphResponse, "response");
        resolveError(new FragmentWrapper(fragment), graphResponse);
    }

    private final void resolveError(FragmentWrapper fragmentWrapper, GraphResponse graphResponse) {
        startLogin(new FragmentStartActivityDelegate(fragmentWrapper), createLoginRequestFromResponse(graphResponse));
    }

    public final void logIn(FragmentWrapper fragmentWrapper, Collection<String> collection, String str) {
        m.f(fragmentWrapper, "fragment");
        LoginClient.Request createLoginRequestWithConfig = createLoginRequestWithConfig(new LoginConfiguration(collection, (String) null, 2, (g) null));
        if (str != null) {
            createLoginRequestWithConfig.setAuthId(str);
        }
        startLogin(new FragmentStartActivityDelegate(fragmentWrapper), createLoginRequestWithConfig);
    }

    public final void resolveError(d dVar, CallbackManager callbackManager, GraphResponse graphResponse) {
        m.f(dVar, "activityResultRegistryOwner");
        m.f(callbackManager, "callbackManager");
        m.f(graphResponse, "response");
        startLogin(new AndroidxActivityResultRegistryOwnerStartActivityDelegate(dVar, callbackManager), createLoginRequestFromResponse(graphResponse));
    }

    public final void logInWithPublishPermissions(Activity activity, Collection<String> collection) {
        m.f(activity, "activity");
        validatePublishPermissions(collection);
        loginWithConfiguration(activity, new LoginConfiguration(collection, (String) null, 2, (g) null));
    }

    public final void logInWithReadPermissions(Activity activity, Collection<String> collection) {
        m.f(activity, "activity");
        validateReadPermissions(collection);
        logIn(activity, new LoginConfiguration(collection, (String) null, 2, (g) null));
    }

    public final void logIn(Activity activity, Collection<String> collection) {
        m.f(activity, "activity");
        logIn(activity, new LoginConfiguration(collection, (String) null, 2, (g) null));
    }

    public final void logInWithPublishPermissions(d dVar, CallbackManager callbackManager, Collection<String> collection) {
        m.f(dVar, "activityResultRegistryOwner");
        m.f(callbackManager, "callbackManager");
        m.f(collection, "permissions");
        validatePublishPermissions(collection);
        logIn(dVar, callbackManager, new LoginConfiguration(collection, (String) null, 2, (g) null));
    }

    public final void logInWithReadPermissions(d dVar, CallbackManager callbackManager, Collection<String> collection) {
        m.f(dVar, "activityResultRegistryOwner");
        m.f(callbackManager, "callbackManager");
        m.f(collection, "permissions");
        validateReadPermissions(collection);
        logIn(dVar, callbackManager, new LoginConfiguration(collection, (String) null, 2, (g) null));
    }

    public final void logIn(FragmentWrapper fragmentWrapper, LoginConfiguration loginConfiguration) {
        m.f(fragmentWrapper, "fragment");
        m.f(loginConfiguration, "loginConfig");
        startLogin(new FragmentStartActivityDelegate(fragmentWrapper), createLoginRequestWithConfig(loginConfiguration));
    }

    public final void logIn(Activity activity, LoginConfiguration loginConfiguration) {
        m.f(activity, "activity");
        m.f(loginConfiguration, "loginConfig");
        boolean z10 = activity instanceof d;
        startLogin(new ActivityStartActivityDelegate(activity), createLoginRequestWithConfig(loginConfiguration));
    }

    public final void logIn(Activity activity, Collection<String> collection, String str) {
        m.f(activity, "activity");
        LoginClient.Request createLoginRequestWithConfig = createLoginRequestWithConfig(new LoginConfiguration(collection, (String) null, 2, (g) null));
        if (str != null) {
            createLoginRequestWithConfig.setAuthId(str);
        }
        startLogin(new ActivityStartActivityDelegate(activity), createLoginRequestWithConfig);
    }

    private final void logIn(d dVar, CallbackManager callbackManager, LoginConfiguration loginConfiguration) {
        startLogin(new AndroidxActivityResultRegistryOwnerStartActivityDelegate(dVar, callbackManager), createLoginRequestWithConfig(loginConfiguration));
    }

    public final void logIn(d dVar, CallbackManager callbackManager, Collection<String> collection, String str) {
        m.f(dVar, "activityResultRegistryOwner");
        m.f(callbackManager, "callbackManager");
        m.f(collection, "permissions");
        LoginClient.Request createLoginRequestWithConfig = createLoginRequestWithConfig(new LoginConfiguration(collection, (String) null, 2, (g) null));
        if (str != null) {
            createLoginRequestWithConfig.setAuthId(str);
        }
        startLogin(new AndroidxActivityResultRegistryOwnerStartActivityDelegate(dVar, callbackManager), createLoginRequestWithConfig);
    }

    public final void logIn(d dVar, CallbackManager callbackManager, Collection<String> collection) {
        m.f(dVar, "activityResultRegistryOwner");
        m.f(callbackManager, "callbackManager");
        m.f(collection, "permissions");
        logIn(dVar, callbackManager, new LoginConfiguration(collection, (String) null, 2, (g) null));
    }
}
