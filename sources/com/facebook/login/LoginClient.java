package com.facebook.login;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import com.facebook.AccessToken;
import com.facebook.AuthenticationToken;
import com.facebook.CustomTabMainActivity;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.common.R;
import com.facebook.internal.CallbackManagerImpl;
import com.facebook.internal.Utility;
import com.facebook.internal.Validate;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: LoginClient.kt */
public class LoginClient implements Parcelable {
    public static final Parcelable.Creator<LoginClient> CREATOR = new LoginClient$Companion$CREATOR$1();
    public static final Companion Companion = new Companion((g) null);
    private BackgroundProcessingListener backgroundProcessingListener;
    private boolean checkedInternetPermission;
    private int currentHandler = -1;
    private Map<String, String> extraData;
    private Fragment fragment;
    private LoginMethodHandler[] handlersToTry;
    private Map<String, String> loggingExtras;
    private LoginLogger loginLogger;
    private int numActivitiesReturned;
    private int numTotalIntentsFired;
    private OnCompletedListener onCompletedListener;
    private Request pendingRequest;

    /* compiled from: LoginClient.kt */
    public interface BackgroundProcessingListener {
        void onBackgroundProcessingStarted();

        void onBackgroundProcessingStopped();
    }

    /* compiled from: LoginClient.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public final String getE2E() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("init", System.currentTimeMillis());
            } catch (JSONException unused) {
            }
            String jSONObject2 = jSONObject.toString();
            m.e(jSONObject2, "e2e.toString()");
            return jSONObject2;
        }

        public final int getLoginRequestCode() {
            return CallbackManagerImpl.RequestCodeOffset.Login.toRequestCode();
        }
    }

    /* compiled from: LoginClient.kt */
    public interface OnCompletedListener {
        void onCompleted(Result result);
    }

    /* compiled from: LoginClient.kt */
    public static final class Result implements Parcelable {
        public static final Parcelable.Creator<Result> CREATOR = new LoginClient$Result$Companion$CREATOR$1();
        public static final Companion Companion = new Companion((g) null);
        public final AuthenticationToken authenticationToken;
        public final Code code;
        public final String errorCode;
        public final String errorMessage;
        public Map<String, String> extraData;
        public Map<String, String> loggingExtras;
        public final Request request;
        public final AccessToken token;

        /* compiled from: LoginClient.kt */
        public enum Code {
            SUCCESS("success"),
            CANCEL("cancel"),
            ERROR("error");
            
            private final String loggingValue;

            private Code(String str) {
                this.loggingValue = str;
            }

            public final String getLoggingValue() {
                return this.loggingValue;
            }
        }

        /* compiled from: LoginClient.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(g gVar) {
                this();
            }

            public static /* synthetic */ Result createErrorResult$default(Companion companion, Request request, String str, String str2, String str3, int i10, Object obj) {
                if ((i10 & 8) != 0) {
                    str3 = null;
                }
                return companion.createErrorResult(request, str, str2, str3);
            }

            public final Result createCancelResult(Request request, String str) {
                return new Result(request, Code.CANCEL, (AccessToken) null, str, (String) null);
            }

            public final Result createCompositeTokenResult(Request request, AccessToken accessToken, AuthenticationToken authenticationToken) {
                return new Result(request, Code.SUCCESS, accessToken, authenticationToken, (String) null, (String) null);
            }

            public final Result createErrorResult(Request request, String str, String str2) {
                return createErrorResult$default(this, request, str, str2, (String) null, 8, (Object) null);
            }

            public final Result createErrorResult(Request request, String str, String str2, String str3) {
                ArrayList arrayList = new ArrayList();
                if (str != null) {
                    arrayList.add(str);
                }
                if (str2 != null) {
                    arrayList.add(str2);
                }
                return new Result(request, Code.ERROR, (AccessToken) null, TextUtils.join(": ", arrayList), str3);
            }

            public final Result createTokenResult(Request request, AccessToken accessToken) {
                m.f(accessToken, "token");
                return new Result(request, Code.SUCCESS, accessToken, (String) null, (String) null);
            }
        }

        public /* synthetic */ Result(Parcel parcel, g gVar) {
            this(parcel);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public Result(Request request2, Code code2, AccessToken accessToken, String str, String str2) {
            this(request2, code2, accessToken, (AuthenticationToken) null, str, str2);
            m.f(code2, "code");
        }

        public static final Result createCancelResult(Request request2, String str) {
            return Companion.createCancelResult(request2, str);
        }

        public static final Result createCompositeTokenResult(Request request2, AccessToken accessToken, AuthenticationToken authenticationToken2) {
            return Companion.createCompositeTokenResult(request2, accessToken, authenticationToken2);
        }

        public static final Result createErrorResult(Request request2, String str, String str2) {
            return Companion.createErrorResult(request2, str, str2);
        }

        public static final Result createErrorResult(Request request2, String str, String str2, String str3) {
            return Companion.createErrorResult(request2, str, str2, str3);
        }

        public static final Result createTokenResult(Request request2, AccessToken accessToken) {
            return Companion.createTokenResult(request2, accessToken);
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i10) {
            m.f(parcel, "dest");
            parcel.writeString(this.code.name());
            parcel.writeParcelable(this.token, i10);
            parcel.writeParcelable(this.authenticationToken, i10);
            parcel.writeString(this.errorMessage);
            parcel.writeString(this.errorCode);
            parcel.writeParcelable(this.request, i10);
            Utility utility = Utility.INSTANCE;
            Utility.writeNonnullStringMapToParcel(parcel, this.loggingExtras);
            Utility.writeNonnullStringMapToParcel(parcel, this.extraData);
        }

        public Result(Request request2, Code code2, AccessToken accessToken, AuthenticationToken authenticationToken2, String str, String str2) {
            m.f(code2, "code");
            this.request = request2;
            this.token = accessToken;
            this.authenticationToken = authenticationToken2;
            this.errorMessage = str;
            this.code = code2;
            this.errorCode = str2;
        }

        private Result(Parcel parcel) {
            String readString = parcel.readString();
            this.code = Code.valueOf(readString == null ? "error" : readString);
            this.token = (AccessToken) parcel.readParcelable(AccessToken.class.getClassLoader());
            this.authenticationToken = (AuthenticationToken) parcel.readParcelable(AuthenticationToken.class.getClassLoader());
            this.errorMessage = parcel.readString();
            this.errorCode = parcel.readString();
            this.request = (Request) parcel.readParcelable(Request.class.getClassLoader());
            Utility utility = Utility.INSTANCE;
            this.loggingExtras = Utility.readNonnullStringMapFromParcel(parcel);
            this.extraData = Utility.readNonnullStringMapFromParcel(parcel);
        }
    }

    public LoginClient(Fragment fragment2) {
        m.f(fragment2, "fragment");
        setFragment(fragment2);
    }

    private final void addLoggingExtra(String str, String str2, boolean z10) {
        Map<String, String> map = this.loggingExtras;
        if (map == null) {
            map = new HashMap<>();
        }
        if (this.loggingExtras == null) {
            this.loggingExtras = map;
        }
        if (map.containsKey(str) && z10) {
            str2 = map.get(str) + ',' + str2;
        }
        map.put(str, str2);
    }

    private final void completeWithFailure() {
        complete(Result.Companion.createErrorResult$default(Result.Companion, this.pendingRequest, "Login attempt failed.", (String) null, (String) null, 8, (Object) null));
    }

    public static final String getE2E() {
        return Companion.getE2E();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0016, code lost:
        if (kotlin.jvm.internal.m.a(r1, r2 == null ? null : r2.getApplicationId()) == false) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.facebook.login.LoginLogger getLogger() {
        /*
            r3 = this;
            com.facebook.login.LoginLogger r0 = r3.loginLogger
            if (r0 == 0) goto L_0x0018
            java.lang.String r1 = r0.getApplicationId()
            com.facebook.login.LoginClient$Request r2 = r3.pendingRequest
            if (r2 != 0) goto L_0x000e
            r2 = 0
            goto L_0x0012
        L_0x000e:
            java.lang.String r2 = r2.getApplicationId()
        L_0x0012:
            boolean r1 = kotlin.jvm.internal.m.a(r1, r2)
            if (r1 != 0) goto L_0x003a
        L_0x0018:
            com.facebook.login.LoginLogger r0 = new com.facebook.login.LoginLogger
            androidx.fragment.app.e r1 = r3.getActivity()
            if (r1 != 0) goto L_0x0026
            com.facebook.FacebookSdk r1 = com.facebook.FacebookSdk.INSTANCE
            android.content.Context r1 = com.facebook.FacebookSdk.getApplicationContext()
        L_0x0026:
            com.facebook.login.LoginClient$Request r2 = r3.pendingRequest
            if (r2 != 0) goto L_0x0031
            com.facebook.FacebookSdk r2 = com.facebook.FacebookSdk.INSTANCE
            java.lang.String r2 = com.facebook.FacebookSdk.getApplicationId()
            goto L_0x0035
        L_0x0031:
            java.lang.String r2 = r2.getApplicationId()
        L_0x0035:
            r0.<init>(r1, r2)
            r3.loginLogger = r0
        L_0x003a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.login.LoginClient.getLogger():com.facebook.login.LoginLogger");
    }

    public static final int getLoginRequestCode() {
        return Companion.getLoginRequestCode();
    }

    private final void logAuthorizationMethodComplete(String str, Result result, Map<String, String> map) {
        logAuthorizationMethodComplete(str, result.code.getLoggingValue(), result.errorMessage, result.errorCode, map);
    }

    private final void notifyOnCompleteListener(Result result) {
        OnCompletedListener onCompletedListener2 = this.onCompletedListener;
        if (onCompletedListener2 != null) {
            onCompletedListener2.onCompleted(result);
        }
    }

    public final void addExtraData(String str, String str2, boolean z10) {
        m.f(str, Constants.KEY);
        m.f(str2, "value");
        Map<String, String> map = this.extraData;
        if (map == null) {
            map = new HashMap<>();
        }
        if (this.extraData == null) {
            this.extraData = map;
        }
        if (map.containsKey(str) && z10) {
            str2 = map.get(str) + ',' + str2;
        }
        map.put(str, str2);
    }

    public final void authorize(Request request) {
        if (request != null) {
            if (this.pendingRequest != null) {
                throw new FacebookException("Attempted to authorize while a request is pending.");
            } else if (!AccessToken.Companion.isCurrentAccessTokenActive() || checkInternetPermission()) {
                this.pendingRequest = request;
                this.handlersToTry = getHandlersToTry(request);
                tryNextHandler();
            }
        }
    }

    public final void cancelCurrentHandler() {
        LoginMethodHandler currentHandler2 = getCurrentHandler();
        if (currentHandler2 != null) {
            currentHandler2.cancel();
        }
    }

    public final boolean checkInternetPermission() {
        String str;
        if (this.checkedInternetPermission) {
            return true;
        }
        if (checkPermission("android.permission.INTERNET") != 0) {
            e activity = getActivity();
            String str2 = null;
            if (activity == null) {
                str = null;
            } else {
                str = activity.getString(R.string.com_facebook_internet_permission_error_title);
            }
            if (activity != null) {
                str2 = activity.getString(R.string.com_facebook_internet_permission_error_message);
            }
            complete(Result.Companion.createErrorResult$default(Result.Companion, this.pendingRequest, str, str2, (String) null, 8, (Object) null));
            return false;
        }
        this.checkedInternetPermission = true;
        return true;
    }

    public final int checkPermission(String str) {
        m.f(str, "permission");
        e activity = getActivity();
        if (activity == null) {
            return -1;
        }
        return activity.checkCallingOrSelfPermission(str);
    }

    public final void complete(Result result) {
        m.f(result, "outcome");
        LoginMethodHandler currentHandler2 = getCurrentHandler();
        if (currentHandler2 != null) {
            logAuthorizationMethodComplete(currentHandler2.getNameForLogging(), result, currentHandler2.getMethodLoggingExtras());
        }
        Map<String, String> map = this.loggingExtras;
        if (map != null) {
            result.loggingExtras = map;
        }
        Map<String, String> map2 = this.extraData;
        if (map2 != null) {
            result.extraData = map2;
        }
        this.handlersToTry = null;
        this.currentHandler = -1;
        this.pendingRequest = null;
        this.loggingExtras = null;
        this.numActivitiesReturned = 0;
        this.numTotalIntentsFired = 0;
        notifyOnCompleteListener(result);
    }

    public final void completeAndValidate(Result result) {
        m.f(result, "outcome");
        if (result.token == null || !AccessToken.Companion.isCurrentAccessTokenActive()) {
            complete(result);
        } else {
            validateSameFbidAndFinish(result);
        }
    }

    public int describeContents() {
        return 0;
    }

    public final e getActivity() {
        Fragment fragment2 = this.fragment;
        if (fragment2 == null) {
            return null;
        }
        return fragment2.getActivity();
    }

    public final BackgroundProcessingListener getBackgroundProcessingListener() {
        return this.backgroundProcessingListener;
    }

    public final boolean getCheckedInternetPermission() {
        return this.checkedInternetPermission;
    }

    public final LoginMethodHandler getCurrentHandler() {
        LoginMethodHandler[] loginMethodHandlerArr;
        int i10 = this.currentHandler;
        if (i10 < 0 || (loginMethodHandlerArr = this.handlersToTry) == null) {
            return null;
        }
        return loginMethodHandlerArr[i10];
    }

    public final Map<String, String> getExtraData() {
        return this.extraData;
    }

    public final Fragment getFragment() {
        return this.fragment;
    }

    public final LoginMethodHandler[] getHandlersToTry() {
        return this.handlersToTry;
    }

    public final boolean getInProgress() {
        return this.pendingRequest != null && this.currentHandler >= 0;
    }

    public final Map<String, String> getLoggingExtras() {
        return this.loggingExtras;
    }

    public final OnCompletedListener getOnCompletedListener() {
        return this.onCompletedListener;
    }

    public final Request getPendingRequest() {
        return this.pendingRequest;
    }

    public final void notifyBackgroundProcessingStart() {
        BackgroundProcessingListener backgroundProcessingListener2 = this.backgroundProcessingListener;
        if (backgroundProcessingListener2 != null) {
            backgroundProcessingListener2.onBackgroundProcessingStarted();
        }
    }

    public final void notifyBackgroundProcessingStop() {
        BackgroundProcessingListener backgroundProcessingListener2 = this.backgroundProcessingListener;
        if (backgroundProcessingListener2 != null) {
            backgroundProcessingListener2.onBackgroundProcessingStopped();
        }
    }

    public final boolean onActivityResult(int i10, int i11, Intent intent) {
        this.numActivitiesReturned++;
        if (this.pendingRequest != null) {
            if (intent == null || !intent.getBooleanExtra(CustomTabMainActivity.NO_ACTIVITY_EXCEPTION, false)) {
                LoginMethodHandler currentHandler2 = getCurrentHandler();
                if (currentHandler2 != null && (!currentHandler2.shouldKeepTrackOfMultipleIntents() || intent != null || this.numActivitiesReturned >= this.numTotalIntentsFired)) {
                    return currentHandler2.onActivityResult(i10, i11, intent);
                }
            } else {
                tryNextHandler();
                return false;
            }
        }
        return false;
    }

    public final void setBackgroundProcessingListener(BackgroundProcessingListener backgroundProcessingListener2) {
        this.backgroundProcessingListener = backgroundProcessingListener2;
    }

    public final void setCheckedInternetPermission(boolean z10) {
        this.checkedInternetPermission = z10;
    }

    /* access modifiers changed from: protected */
    public final void setCurrentHandlerIndex(int i10) {
        this.currentHandler = i10;
    }

    public final void setExtraData(Map<String, String> map) {
        this.extraData = map;
    }

    public final void setFragment(Fragment fragment2) {
        if (this.fragment == null) {
            this.fragment = fragment2;
            return;
        }
        throw new FacebookException("Can't set fragment once it is already set.");
    }

    public final void setHandlersToTry(LoginMethodHandler[] loginMethodHandlerArr) {
        this.handlersToTry = loginMethodHandlerArr;
    }

    public final void setLoggingExtras(Map<String, String> map) {
        this.loggingExtras = map;
    }

    public final void setOnCompletedListener(OnCompletedListener onCompletedListener2) {
        this.onCompletedListener = onCompletedListener2;
    }

    public final void setPendingRequest(Request request) {
        this.pendingRequest = request;
    }

    public final void startOrContinueAuth(Request request) {
        if (!getInProgress()) {
            authorize(request);
        }
    }

    public final boolean tryCurrentHandler() {
        LoginMethodHandler currentHandler2 = getCurrentHandler();
        if (currentHandler2 == null) {
            return false;
        }
        if (!currentHandler2.needsInternetPermission() || checkInternetPermission()) {
            Request request = this.pendingRequest;
            if (request == null) {
                return false;
            }
            int tryAuthorize = currentHandler2.tryAuthorize(request);
            this.numActivitiesReturned = 0;
            if (tryAuthorize > 0) {
                getLogger().logAuthorizationMethodStart(request.getAuthId(), currentHandler2.getNameForLogging(), request.isFamilyLogin() ? LoginLogger.EVENT_NAME_FOA_LOGIN_METHOD_START : LoginLogger.EVENT_NAME_LOGIN_METHOD_START);
                this.numTotalIntentsFired = tryAuthorize;
            } else {
                getLogger().logAuthorizationMethodNotTried(request.getAuthId(), currentHandler2.getNameForLogging(), request.isFamilyLogin() ? LoginLogger.EVENT_NAME_FOA_LOGIN_METHOD_NOT_TRIED : LoginLogger.EVENT_NAME_LOGIN_METHOD_NOT_TRIED);
                addLoggingExtra(LoginLogger.EVENT_EXTRAS_NOT_TRIED, currentHandler2.getNameForLogging(), true);
            }
            if (tryAuthorize > 0) {
                return true;
            }
            return false;
        }
        addLoggingExtra(LoginLogger.EVENT_EXTRAS_MISSING_INTERNET_PERMISSION, AppEventsConstants.EVENT_PARAM_VALUE_YES, false);
        return false;
    }

    public final void tryNextHandler() {
        LoginMethodHandler currentHandler2 = getCurrentHandler();
        if (currentHandler2 != null) {
            logAuthorizationMethodComplete(currentHandler2.getNameForLogging(), LoginLogger.EVENT_PARAM_METHOD_RESULT_SKIPPED, (String) null, (String) null, currentHandler2.getMethodLoggingExtras());
        }
        LoginMethodHandler[] loginMethodHandlerArr = this.handlersToTry;
        while (loginMethodHandlerArr != null) {
            int i10 = this.currentHandler;
            if (i10 >= loginMethodHandlerArr.length - 1) {
                break;
            }
            this.currentHandler = i10 + 1;
            if (tryCurrentHandler()) {
                return;
            }
        }
        if (this.pendingRequest != null) {
            completeWithFailure();
        }
    }

    public final void validateSameFbidAndFinish(Result result) {
        Result result2;
        m.f(result, "pendingResult");
        if (result.token != null) {
            AccessToken currentAccessToken = AccessToken.Companion.getCurrentAccessToken();
            AccessToken accessToken = result.token;
            if (currentAccessToken != null) {
                try {
                    if (m.a(currentAccessToken.getUserId(), accessToken.getUserId())) {
                        result2 = Result.Companion.createCompositeTokenResult(this.pendingRequest, result.token, result.authenticationToken);
                        complete(result2);
                        return;
                    }
                } catch (Exception e10) {
                    complete(Result.Companion.createErrorResult$default(Result.Companion, this.pendingRequest, "Caught exception", e10.getMessage(), (String) null, 8, (Object) null));
                    return;
                }
            }
            result2 = Result.Companion.createErrorResult$default(Result.Companion, this.pendingRequest, "User logged in as different Facebook user.", (String) null, (String) null, 8, (Object) null);
            complete(result2);
            return;
        }
        throw new FacebookException("Can't validate without a token");
    }

    public void writeToParcel(Parcel parcel, int i10) {
        m.f(parcel, "dest");
        parcel.writeParcelableArray(this.handlersToTry, i10);
        parcel.writeInt(this.currentHandler);
        parcel.writeParcelable(this.pendingRequest, i10);
        Utility utility = Utility.INSTANCE;
        Utility.writeNonnullStringMapToParcel(parcel, this.loggingExtras);
        Utility.writeNonnullStringMapToParcel(parcel, this.extraData);
    }

    /* compiled from: LoginClient.kt */
    public static final class Request implements Parcelable {
        public static final Parcelable.Creator<Request> CREATOR = new LoginClient$Request$Companion$CREATOR$1();
        public static final Companion Companion = new Companion((g) null);
        private final String applicationId;
        private String authId;
        private String authType;
        private final String codeChallenge;
        private final CodeChallengeMethod codeChallengeMethod;
        private final String codeVerifier;
        private final DefaultAudience defaultAudience;
        private String deviceAuthTargetUserId;
        private String deviceRedirectUriString;
        private boolean isFamilyLogin;
        private boolean isRerequest;
        private final LoginBehavior loginBehavior;
        private final LoginTargetApp loginTargetApp;
        private String messengerPageId;
        private final String nonce;
        private Set<String> permissions;
        private boolean resetMessengerState;
        private boolean shouldSkipAccountDeduplication;

        /* compiled from: LoginClient.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(g gVar) {
                this();
            }
        }

        public /* synthetic */ Request(Parcel parcel, g gVar) {
            this(parcel);
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public Request(com.facebook.login.LoginBehavior r16, java.util.Set<java.lang.String> r17, com.facebook.login.DefaultAudience r18, java.lang.String r19, java.lang.String r20, java.lang.String r21) {
            /*
                r15 = this;
                java.lang.String r0 = "loginBehavior"
                r2 = r16
                kotlin.jvm.internal.m.f(r2, r0)
                java.lang.String r0 = "defaultAudience"
                r4 = r18
                kotlin.jvm.internal.m.f(r4, r0)
                java.lang.String r0 = "authType"
                r5 = r19
                kotlin.jvm.internal.m.f(r5, r0)
                java.lang.String r0 = "applicationId"
                r6 = r20
                kotlin.jvm.internal.m.f(r6, r0)
                java.lang.String r0 = "authId"
                r7 = r21
                kotlin.jvm.internal.m.f(r7, r0)
                r8 = 0
                r9 = 0
                r10 = 0
                r11 = 0
                r12 = 0
                r13 = 1984(0x7c0, float:2.78E-42)
                r14 = 0
                r1 = r15
                r3 = r17
                r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.login.LoginClient.Request.<init>(com.facebook.login.LoginBehavior, java.util.Set, com.facebook.login.DefaultAudience, java.lang.String, java.lang.String, java.lang.String):void");
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public Request(com.facebook.login.LoginBehavior r16, java.util.Set<java.lang.String> r17, com.facebook.login.DefaultAudience r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, com.facebook.login.LoginTargetApp r22) {
            /*
                r15 = this;
                java.lang.String r0 = "loginBehavior"
                r2 = r16
                kotlin.jvm.internal.m.f(r2, r0)
                java.lang.String r0 = "defaultAudience"
                r4 = r18
                kotlin.jvm.internal.m.f(r4, r0)
                java.lang.String r0 = "authType"
                r5 = r19
                kotlin.jvm.internal.m.f(r5, r0)
                java.lang.String r0 = "applicationId"
                r6 = r20
                kotlin.jvm.internal.m.f(r6, r0)
                java.lang.String r0 = "authId"
                r7 = r21
                kotlin.jvm.internal.m.f(r7, r0)
                r9 = 0
                r10 = 0
                r11 = 0
                r12 = 0
                r13 = 1920(0x780, float:2.69E-42)
                r14 = 0
                r1 = r15
                r3 = r17
                r8 = r22
                r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.login.LoginClient.Request.<init>(com.facebook.login.LoginBehavior, java.util.Set, com.facebook.login.DefaultAudience, java.lang.String, java.lang.String, java.lang.String, com.facebook.login.LoginTargetApp):void");
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public Request(com.facebook.login.LoginBehavior r16, java.util.Set<java.lang.String> r17, com.facebook.login.DefaultAudience r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, com.facebook.login.LoginTargetApp r22, java.lang.String r23) {
            /*
                r15 = this;
                java.lang.String r0 = "loginBehavior"
                r2 = r16
                kotlin.jvm.internal.m.f(r2, r0)
                java.lang.String r0 = "defaultAudience"
                r4 = r18
                kotlin.jvm.internal.m.f(r4, r0)
                java.lang.String r0 = "authType"
                r5 = r19
                kotlin.jvm.internal.m.f(r5, r0)
                java.lang.String r0 = "applicationId"
                r6 = r20
                kotlin.jvm.internal.m.f(r6, r0)
                java.lang.String r0 = "authId"
                r7 = r21
                kotlin.jvm.internal.m.f(r7, r0)
                r10 = 0
                r11 = 0
                r12 = 0
                r13 = 1792(0x700, float:2.511E-42)
                r14 = 0
                r1 = r15
                r3 = r17
                r8 = r22
                r9 = r23
                r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.login.LoginClient.Request.<init>(com.facebook.login.LoginBehavior, java.util.Set, com.facebook.login.DefaultAudience, java.lang.String, java.lang.String, java.lang.String, com.facebook.login.LoginTargetApp, java.lang.String):void");
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public Request(com.facebook.login.LoginBehavior r16, java.util.Set<java.lang.String> r17, com.facebook.login.DefaultAudience r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, com.facebook.login.LoginTargetApp r22, java.lang.String r23, java.lang.String r24) {
            /*
                r15 = this;
                java.lang.String r0 = "loginBehavior"
                r2 = r16
                kotlin.jvm.internal.m.f(r2, r0)
                java.lang.String r0 = "defaultAudience"
                r4 = r18
                kotlin.jvm.internal.m.f(r4, r0)
                java.lang.String r0 = "authType"
                r5 = r19
                kotlin.jvm.internal.m.f(r5, r0)
                java.lang.String r0 = "applicationId"
                r6 = r20
                kotlin.jvm.internal.m.f(r6, r0)
                java.lang.String r0 = "authId"
                r7 = r21
                kotlin.jvm.internal.m.f(r7, r0)
                r11 = 0
                r12 = 0
                r13 = 1536(0x600, float:2.152E-42)
                r14 = 0
                r1 = r15
                r3 = r17
                r8 = r22
                r9 = r23
                r10 = r24
                r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.login.LoginClient.Request.<init>(com.facebook.login.LoginBehavior, java.util.Set, com.facebook.login.DefaultAudience, java.lang.String, java.lang.String, java.lang.String, com.facebook.login.LoginTargetApp, java.lang.String, java.lang.String):void");
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public Request(com.facebook.login.LoginBehavior r16, java.util.Set<java.lang.String> r17, com.facebook.login.DefaultAudience r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, com.facebook.login.LoginTargetApp r22, java.lang.String r23, java.lang.String r24, java.lang.String r25) {
            /*
                r15 = this;
                java.lang.String r0 = "loginBehavior"
                r2 = r16
                kotlin.jvm.internal.m.f(r2, r0)
                java.lang.String r0 = "defaultAudience"
                r4 = r18
                kotlin.jvm.internal.m.f(r4, r0)
                java.lang.String r0 = "authType"
                r5 = r19
                kotlin.jvm.internal.m.f(r5, r0)
                java.lang.String r0 = "applicationId"
                r6 = r20
                kotlin.jvm.internal.m.f(r6, r0)
                java.lang.String r0 = "authId"
                r7 = r21
                kotlin.jvm.internal.m.f(r7, r0)
                r12 = 0
                r13 = 1024(0x400, float:1.435E-42)
                r14 = 0
                r1 = r15
                r3 = r17
                r8 = r22
                r9 = r23
                r10 = r24
                r11 = r25
                r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.login.LoginClient.Request.<init>(com.facebook.login.LoginBehavior, java.util.Set, com.facebook.login.DefaultAudience, java.lang.String, java.lang.String, java.lang.String, com.facebook.login.LoginTargetApp, java.lang.String, java.lang.String, java.lang.String):void");
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ Request(com.facebook.login.LoginBehavior r15, java.util.Set r16, com.facebook.login.DefaultAudience r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, com.facebook.login.LoginTargetApp r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, com.facebook.login.CodeChallengeMethod r25, int r26, kotlin.jvm.internal.g r27) {
            /*
                r14 = this;
                r0 = r26
                r1 = r0 & 64
                if (r1 == 0) goto L_0x000a
                com.facebook.login.LoginTargetApp r1 = com.facebook.login.LoginTargetApp.FACEBOOK
                r9 = r1
                goto L_0x000c
            L_0x000a:
                r9 = r21
            L_0x000c:
                r1 = r0 & 128(0x80, float:1.794E-43)
                r2 = 0
                if (r1 == 0) goto L_0x0013
                r10 = r2
                goto L_0x0015
            L_0x0013:
                r10 = r22
            L_0x0015:
                r1 = r0 & 256(0x100, float:3.59E-43)
                if (r1 == 0) goto L_0x001b
                r11 = r2
                goto L_0x001d
            L_0x001b:
                r11 = r23
            L_0x001d:
                r1 = r0 & 512(0x200, float:7.175E-43)
                if (r1 == 0) goto L_0x0023
                r12 = r2
                goto L_0x0025
            L_0x0023:
                r12 = r24
            L_0x0025:
                r0 = r0 & 1024(0x400, float:1.435E-42)
                if (r0 == 0) goto L_0x002b
                r13 = r2
                goto L_0x002d
            L_0x002b:
                r13 = r25
            L_0x002d:
                r2 = r14
                r3 = r15
                r4 = r16
                r5 = r17
                r6 = r18
                r7 = r19
                r8 = r20
                r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.login.LoginClient.Request.<init>(com.facebook.login.LoginBehavior, java.util.Set, com.facebook.login.DefaultAudience, java.lang.String, java.lang.String, java.lang.String, com.facebook.login.LoginTargetApp, java.lang.String, java.lang.String, java.lang.String, com.facebook.login.CodeChallengeMethod, int, kotlin.jvm.internal.g):void");
        }

        public int describeContents() {
            return 0;
        }

        public final String getApplicationId() {
            return this.applicationId;
        }

        public final String getAuthId() {
            return this.authId;
        }

        public final String getAuthType() {
            return this.authType;
        }

        public final String getCodeChallenge() {
            return this.codeChallenge;
        }

        public final CodeChallengeMethod getCodeChallengeMethod() {
            return this.codeChallengeMethod;
        }

        public final String getCodeVerifier() {
            return this.codeVerifier;
        }

        public final DefaultAudience getDefaultAudience() {
            return this.defaultAudience;
        }

        public final String getDeviceAuthTargetUserId() {
            return this.deviceAuthTargetUserId;
        }

        public final String getDeviceRedirectUriString() {
            return this.deviceRedirectUriString;
        }

        public final LoginBehavior getLoginBehavior() {
            return this.loginBehavior;
        }

        public final LoginTargetApp getLoginTargetApp() {
            return this.loginTargetApp;
        }

        public final String getMessengerPageId() {
            return this.messengerPageId;
        }

        public final String getNonce() {
            return this.nonce;
        }

        public final Set<String> getPermissions() {
            return this.permissions;
        }

        public final boolean getResetMessengerState() {
            return this.resetMessengerState;
        }

        public final boolean hasPublishPermission() {
            for (String isPublishPermission : this.permissions) {
                if (LoginManager.Companion.isPublishPermission(isPublishPermission)) {
                    return true;
                }
            }
            return false;
        }

        public final boolean isFamilyLogin() {
            return this.isFamilyLogin;
        }

        public final boolean isInstagramLogin() {
            return this.loginTargetApp == LoginTargetApp.INSTAGRAM;
        }

        public final boolean isRerequest() {
            return this.isRerequest;
        }

        public final void setAuthId(String str) {
            m.f(str, "<set-?>");
            this.authId = str;
        }

        public final void setAuthType(String str) {
            m.f(str, "<set-?>");
            this.authType = str;
        }

        public final void setDeviceAuthTargetUserId(String str) {
            this.deviceAuthTargetUserId = str;
        }

        public final void setDeviceRedirectUriString(String str) {
            this.deviceRedirectUriString = str;
        }

        public final void setFamilyLogin(boolean z10) {
            this.isFamilyLogin = z10;
        }

        public final void setMessengerPageId(String str) {
            this.messengerPageId = str;
        }

        public final void setPermissions(Set<String> set) {
            m.f(set, "<set-?>");
            this.permissions = set;
        }

        public final void setRerequest(boolean z10) {
            this.isRerequest = z10;
        }

        public final void setResetMessengerState(boolean z10) {
            this.resetMessengerState = z10;
        }

        public final void setShouldSkipAccountDeduplication(boolean z10) {
            this.shouldSkipAccountDeduplication = z10;
        }

        public final boolean shouldSkipAccountDeduplication() {
            return this.shouldSkipAccountDeduplication;
        }

        public void writeToParcel(Parcel parcel, int i10) {
            m.f(parcel, "dest");
            parcel.writeString(this.loginBehavior.name());
            parcel.writeStringList(new ArrayList(this.permissions));
            parcel.writeString(this.defaultAudience.name());
            parcel.writeString(this.applicationId);
            parcel.writeString(this.authId);
            parcel.writeByte(this.isRerequest ? (byte) 1 : 0);
            parcel.writeString(this.deviceRedirectUriString);
            parcel.writeString(this.authType);
            parcel.writeString(this.deviceAuthTargetUserId);
            parcel.writeString(this.messengerPageId);
            parcel.writeByte(this.resetMessengerState ? (byte) 1 : 0);
            parcel.writeString(this.loginTargetApp.name());
            parcel.writeByte(this.isFamilyLogin ? (byte) 1 : 0);
            parcel.writeByte(this.shouldSkipAccountDeduplication ? (byte) 1 : 0);
            parcel.writeString(this.nonce);
            parcel.writeString(this.codeVerifier);
            parcel.writeString(this.codeChallenge);
            CodeChallengeMethod codeChallengeMethod2 = this.codeChallengeMethod;
            parcel.writeString(codeChallengeMethod2 == null ? null : codeChallengeMethod2.name());
        }

        public Request(LoginBehavior loginBehavior2, Set<String> set, DefaultAudience defaultAudience2, String str, String str2, String str3, LoginTargetApp loginTargetApp2, String str4, String str5, String str6, CodeChallengeMethod codeChallengeMethod2) {
            m.f(loginBehavior2, "loginBehavior");
            m.f(defaultAudience2, "defaultAudience");
            m.f(str, "authType");
            m.f(str2, "applicationId");
            m.f(str3, "authId");
            this.loginBehavior = loginBehavior2;
            this.permissions = set == null ? new HashSet<>() : set;
            this.defaultAudience = defaultAudience2;
            this.authType = str;
            this.applicationId = str2;
            this.authId = str3;
            this.loginTargetApp = loginTargetApp2 == null ? LoginTargetApp.FACEBOOK : loginTargetApp2;
            if (str4 != null) {
                if (!(str4.length() == 0)) {
                    this.nonce = str4;
                    this.codeVerifier = str5;
                    this.codeChallenge = str6;
                    this.codeChallengeMethod = codeChallengeMethod2;
                }
            }
            String uuid = UUID.randomUUID().toString();
            m.e(uuid, "randomUUID().toString()");
            this.nonce = uuid;
            this.codeVerifier = str5;
            this.codeChallenge = str6;
            this.codeChallengeMethod = codeChallengeMethod2;
        }

        private Request(Parcel parcel) {
            DefaultAudience defaultAudience2;
            LoginTargetApp loginTargetApp2;
            CodeChallengeMethod codeChallengeMethod2;
            Validate validate = Validate.INSTANCE;
            this.loginBehavior = LoginBehavior.valueOf(Validate.notNullOrEmpty(parcel.readString(), "loginBehavior"));
            ArrayList arrayList = new ArrayList();
            parcel.readStringList(arrayList);
            this.permissions = new HashSet(arrayList);
            String readString = parcel.readString();
            if (readString != null) {
                defaultAudience2 = DefaultAudience.valueOf(readString);
            } else {
                defaultAudience2 = DefaultAudience.NONE;
            }
            this.defaultAudience = defaultAudience2;
            this.applicationId = Validate.notNullOrEmpty(parcel.readString(), "applicationId");
            this.authId = Validate.notNullOrEmpty(parcel.readString(), "authId");
            boolean z10 = true;
            this.isRerequest = parcel.readByte() != 0;
            this.deviceRedirectUriString = parcel.readString();
            this.authType = Validate.notNullOrEmpty(parcel.readString(), "authType");
            this.deviceAuthTargetUserId = parcel.readString();
            this.messengerPageId = parcel.readString();
            this.resetMessengerState = parcel.readByte() != 0;
            String readString2 = parcel.readString();
            if (readString2 != null) {
                loginTargetApp2 = LoginTargetApp.valueOf(readString2);
            } else {
                loginTargetApp2 = LoginTargetApp.FACEBOOK;
            }
            this.loginTargetApp = loginTargetApp2;
            this.isFamilyLogin = parcel.readByte() != 0;
            this.shouldSkipAccountDeduplication = parcel.readByte() == 0 ? false : z10;
            this.nonce = Validate.notNullOrEmpty(parcel.readString(), "nonce");
            this.codeVerifier = parcel.readString();
            this.codeChallenge = parcel.readString();
            String readString3 = parcel.readString();
            if (readString3 == null) {
                codeChallengeMethod2 = null;
            } else {
                codeChallengeMethod2 = CodeChallengeMethod.valueOf(readString3);
            }
            this.codeChallengeMethod = codeChallengeMethod2;
        }
    }

    public LoginMethodHandler[] getHandlersToTry(Request request) {
        m.f(request, "request");
        ArrayList arrayList = new ArrayList();
        LoginBehavior loginBehavior = request.getLoginBehavior();
        if (!request.isInstagramLogin()) {
            if (loginBehavior.allowsGetTokenAuth()) {
                arrayList.add(new GetTokenLoginMethodHandler(this));
            }
            if (!FacebookSdk.bypassAppSwitch && loginBehavior.allowsKatanaAuth()) {
                arrayList.add(new KatanaProxyLoginMethodHandler(this));
            }
        } else if (!FacebookSdk.bypassAppSwitch && loginBehavior.allowsInstagramAppAuth()) {
            arrayList.add(new InstagramAppLoginMethodHandler(this));
        }
        if (loginBehavior.allowsCustomTabAuth()) {
            arrayList.add(new CustomTabLoginMethodHandler(this));
        }
        if (loginBehavior.allowsWebViewAuth()) {
            arrayList.add(new WebViewLoginMethodHandler(this));
        }
        if (!request.isInstagramLogin() && loginBehavior.allowsDeviceAuth()) {
            arrayList.add(new DeviceAuthMethodHandler(this));
        }
        Object[] array = arrayList.toArray(new LoginMethodHandler[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        return (LoginMethodHandler[]) array;
    }

    private final void logAuthorizationMethodComplete(String str, String str2, String str3, String str4, Map<String, String> map) {
        Request request = this.pendingRequest;
        String str5 = LoginLogger.EVENT_NAME_LOGIN_METHOD_COMPLETE;
        if (request == null) {
            getLogger().logUnexpectedError(str5, "Unexpected call to logCompleteLogin with null pendingAuthorizationRequest.", str);
            return;
        }
        LoginLogger logger = getLogger();
        String authId = request.getAuthId();
        if (request.isFamilyLogin()) {
            str5 = LoginLogger.EVENT_NAME_FOA_LOGIN_METHOD_COMPLETE;
        }
        logger.logAuthorizationMethodComplete(authId, str, str2, str3, str4, map, str5);
    }

    /* JADX WARNING: type inference failed for: r5v0 */
    /* JADX WARNING: type inference failed for: r5v1, types: [java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX WARNING: type inference failed for: r5v3, types: [java.lang.Object, com.facebook.login.LoginMethodHandler] */
    /* JADX WARNING: type inference failed for: r5v6 */
    /* JADX WARNING: type inference failed for: r5v7 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public LoginClient(android.os.Parcel r9) {
        /*
            r8 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.m.f(r9, r0)
            r8.<init>()
            r0 = -1
            r8.currentHandler = r0
            java.lang.Class<com.facebook.login.LoginMethodHandler> r0 = com.facebook.login.LoginMethodHandler.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            android.os.Parcelable[] r0 = r9.readParcelableArray(r0)
            r1 = 0
            if (r0 != 0) goto L_0x001a
            android.os.Parcelable[] r0 = new android.os.Parcelable[r1]
        L_0x001a:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            int r3 = r0.length
            r4 = 0
        L_0x0021:
            r5 = 0
            if (r4 >= r3) goto L_0x003b
            r6 = r0[r4]
            boolean r7 = r6 instanceof com.facebook.login.LoginMethodHandler
            if (r7 == 0) goto L_0x002d
            r5 = r6
            com.facebook.login.LoginMethodHandler r5 = (com.facebook.login.LoginMethodHandler) r5
        L_0x002d:
            if (r5 != 0) goto L_0x0030
            goto L_0x0033
        L_0x0030:
            r5.setLoginClient(r8)
        L_0x0033:
            if (r5 == 0) goto L_0x0038
            r2.add(r5)
        L_0x0038:
            int r4 = r4 + 1
            goto L_0x0021
        L_0x003b:
            com.facebook.login.LoginMethodHandler[] r0 = new com.facebook.login.LoginMethodHandler[r1]
            java.lang.Object[] r0 = r2.toArray(r0)
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.Array<T>"
            java.util.Objects.requireNonNull(r0, r1)
            com.facebook.login.LoginMethodHandler[] r0 = (com.facebook.login.LoginMethodHandler[]) r0
            r8.handlersToTry = r0
            int r0 = r9.readInt()
            r8.currentHandler = r0
            java.lang.Class<com.facebook.login.LoginClient$Request> r0 = com.facebook.login.LoginClient.Request.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            android.os.Parcelable r0 = r9.readParcelable(r0)
            com.facebook.login.LoginClient$Request r0 = (com.facebook.login.LoginClient.Request) r0
            r8.pendingRequest = r0
            com.facebook.internal.Utility r0 = com.facebook.internal.Utility.INSTANCE
            java.util.Map r0 = com.facebook.internal.Utility.readNonnullStringMapFromParcel(r9)
            if (r0 != 0) goto L_0x0068
            r0 = r5
            goto L_0x006c
        L_0x0068:
            java.util.Map r0 = p8.h0.n(r0)
        L_0x006c:
            r8.loggingExtras = r0
            java.util.Map r9 = com.facebook.internal.Utility.readNonnullStringMapFromParcel(r9)
            if (r9 != 0) goto L_0x0075
            goto L_0x0079
        L_0x0075:
            java.util.Map r5 = p8.h0.n(r9)
        L_0x0079:
            r8.extraData = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.login.LoginClient.<init>(android.os.Parcel):void");
    }
}
