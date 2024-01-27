package com.facebook.login;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.facebook.AccessToken;
import com.facebook.AccessTokenSource;
import com.facebook.AuthenticationToken;
import com.facebook.FacebookException;
import com.facebook.FacebookRequestError;
import com.facebook.FacebookSdk;
import com.facebook.FacebookServiceException;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.appevents.InternalAppEventsLogger;
import com.facebook.internal.AnalyticsEvents;
import com.facebook.internal.NativeProtocol;
import com.facebook.internal.Utility;
import com.facebook.login.LoginClient;
import g9.d;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: LoginMethodHandler.kt */
public abstract class LoginMethodHandler implements Parcelable {
    public static final Companion Companion = new Companion((g) null);
    public static final String NO_SIGNED_REQUEST_ERROR_MESSAGE = "Authorization response does not contain the signed_request";
    public static final String NO_USER_ID_ERROR_MESSAGE = "Failed to retrieve user_id from signed_request";
    public static final String USER_CANCELED_LOG_IN_ERROR_MESSAGE = "User canceled log in.";
    public LoginClient loginClient;
    private Map<String, String> methodLoggingExtras;

    /* compiled from: LoginMethodHandler.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public final AccessToken createAccessTokenFromNativeLogin(Bundle bundle, AccessTokenSource accessTokenSource, String str) {
            String string;
            Bundle bundle2 = bundle;
            m.f(bundle, "bundle");
            m.f(str, "applicationId");
            Utility utility = Utility.INSTANCE;
            Date bundleLongAsDate = Utility.getBundleLongAsDate(bundle, NativeProtocol.EXTRA_EXPIRES_SECONDS_SINCE_EPOCH, new Date(0));
            ArrayList<String> stringArrayList = bundle.getStringArrayList(NativeProtocol.EXTRA_PERMISSIONS);
            String string2 = bundle.getString(NativeProtocol.EXTRA_ACCESS_TOKEN);
            Date bundleLongAsDate2 = Utility.getBundleLongAsDate(bundle, NativeProtocol.EXTRA_DATA_ACCESS_EXPIRATION_TIME, new Date(0));
            if (string2 != null) {
                boolean z10 = true;
                if (!(string2.length() == 0) && (string = bundle.getString(NativeProtocol.EXTRA_USER_ID)) != null) {
                    if (string.length() != 0) {
                        z10 = false;
                    }
                    if (!z10) {
                        return new AccessToken(string2, str, string, stringArrayList, (Collection<String>) null, (Collection<String>) null, accessTokenSource, bundleLongAsDate, new Date(), bundleLongAsDate2, bundle.getString("graph_domain"));
                    }
                }
            }
            return null;
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0079  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x00b1  */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x00e7 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x00e8  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.facebook.AccessToken createAccessTokenFromWebBundle(java.util.Collection<java.lang.String> r20, android.os.Bundle r21, com.facebook.AccessTokenSource r22, java.lang.String r23) {
            /*
                r19 = this;
                r0 = r21
                java.lang.String r1 = "bundle"
                kotlin.jvm.internal.m.f(r0, r1)
                java.lang.String r1 = "applicationId"
                r4 = r23
                kotlin.jvm.internal.m.f(r4, r1)
                com.facebook.internal.Utility r1 = com.facebook.internal.Utility.INSTANCE
                java.util.Date r1 = new java.util.Date
                r1.<init>()
                java.lang.String r2 = "expires_in"
                java.util.Date r10 = com.facebook.internal.Utility.getBundleLongAsDate(r0, r2, r1)
                java.lang.String r1 = "access_token"
                java.lang.String r3 = r0.getString(r1)
                r1 = 0
                if (r3 != 0) goto L_0x0025
                return r1
            L_0x0025:
                java.util.Date r2 = new java.util.Date
                r5 = 0
                r2.<init>(r5)
                java.lang.String r5 = "data_access_expiration_time"
                java.util.Date r12 = com.facebook.internal.Utility.getBundleLongAsDate(r0, r5, r2)
                java.lang.String r2 = "granted_scopes"
                java.lang.String r13 = r0.getString(r2)
                java.lang.String r2 = "null cannot be cast to non-null type kotlin.Array<T>"
                java.lang.String r5 = ","
                r6 = 1
                r7 = 0
                if (r13 == 0) goto L_0x006f
                int r8 = r13.length()
                if (r8 <= 0) goto L_0x0048
                r8 = 1
                goto L_0x0049
            L_0x0048:
                r8 = 0
            L_0x0049:
                if (r8 == 0) goto L_0x006f
                java.lang.String[] r14 = new java.lang.String[]{r5}
                r15 = 0
                r16 = 0
                r17 = 6
                r18 = 0
                java.util.List r8 = g9.q.c0(r13, r14, r15, r16, r17, r18)
                java.lang.String[] r9 = new java.lang.String[r7]
                java.lang.Object[] r8 = r8.toArray(r9)
                java.util.Objects.requireNonNull(r8, r2)
                java.lang.String[] r8 = (java.lang.String[]) r8
                int r9 = r8.length
                java.lang.Object[] r8 = java.util.Arrays.copyOf(r8, r9)
                java.util.ArrayList r8 = p8.p.c(r8)
                goto L_0x0071
            L_0x006f:
                r8 = r20
            L_0x0071:
                java.lang.String r9 = "denied_scopes"
                java.lang.String r13 = r0.getString(r9)
                if (r13 == 0) goto L_0x00a8
                int r9 = r13.length()
                if (r9 <= 0) goto L_0x0081
                r9 = 1
                goto L_0x0082
            L_0x0081:
                r9 = 0
            L_0x0082:
                if (r9 == 0) goto L_0x00a8
                java.lang.String[] r14 = new java.lang.String[]{r5}
                r15 = 0
                r16 = 0
                r17 = 6
                r18 = 0
                java.util.List r9 = g9.q.c0(r13, r14, r15, r16, r17, r18)
                java.lang.String[] r11 = new java.lang.String[r7]
                java.lang.Object[] r9 = r9.toArray(r11)
                java.util.Objects.requireNonNull(r9, r2)
                java.lang.String[] r9 = (java.lang.String[]) r9
                int r11 = r9.length
                java.lang.Object[] r9 = java.util.Arrays.copyOf(r9, r11)
                java.util.ArrayList r9 = p8.p.c(r9)
                goto L_0x00a9
            L_0x00a8:
                r9 = r1
            L_0x00a9:
                java.lang.String r11 = "expired_scopes"
                java.lang.String r13 = r0.getString(r11)
                if (r13 == 0) goto L_0x00e0
                int r11 = r13.length()
                if (r11 <= 0) goto L_0x00b8
                goto L_0x00b9
            L_0x00b8:
                r6 = 0
            L_0x00b9:
                if (r6 == 0) goto L_0x00e0
                java.lang.String[] r14 = new java.lang.String[]{r5}
                r15 = 0
                r16 = 0
                r17 = 6
                r18 = 0
                java.util.List r5 = g9.q.c0(r13, r14, r15, r16, r17, r18)
                java.lang.String[] r6 = new java.lang.String[r7]
                java.lang.Object[] r5 = r5.toArray(r6)
                java.util.Objects.requireNonNull(r5, r2)
                java.lang.String[] r5 = (java.lang.String[]) r5
                int r2 = r5.length
                java.lang.Object[] r2 = java.util.Arrays.copyOf(r5, r2)
                java.util.ArrayList r2 = p8.p.c(r2)
                r11 = r2
                goto L_0x00e1
            L_0x00e0:
                r11 = r1
            L_0x00e1:
                boolean r2 = com.facebook.internal.Utility.isNullOrEmpty((java.lang.String) r3)
                if (r2 == 0) goto L_0x00e8
                return r1
            L_0x00e8:
                java.lang.String r1 = "graph_domain"
                java.lang.String r13 = r0.getString(r1)
                java.lang.String r1 = "signed_request"
                java.lang.String r0 = r0.getString(r1)
                r1 = r19
                java.lang.String r5 = r1.getUserIDFromSignedRequest(r0)
                com.facebook.AccessToken r0 = new com.facebook.AccessToken
                java.util.Date r14 = new java.util.Date
                r14.<init>()
                r2 = r0
                r4 = r23
                r6 = r8
                r7 = r9
                r8 = r11
                r9 = r22
                r11 = r14
                r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.login.LoginMethodHandler.Companion.createAccessTokenFromWebBundle(java.util.Collection, android.os.Bundle, com.facebook.AccessTokenSource, java.lang.String):com.facebook.AccessToken");
        }

        public final AuthenticationToken createAuthenticationTokenFromNativeLogin(Bundle bundle, String str) {
            m.f(bundle, "bundle");
            String string = bundle.getString(NativeProtocol.EXTRA_AUTHENTICATION_TOKEN);
            if (string != null) {
                boolean z10 = true;
                if (!(string.length() == 0) && str != null) {
                    if (str.length() != 0) {
                        z10 = false;
                    }
                    if (!z10) {
                        try {
                            return new AuthenticationToken(string, str);
                        } catch (Exception e10) {
                            throw new FacebookException(e10.getMessage());
                        }
                    }
                }
            }
            return null;
        }

        public final AuthenticationToken createAuthenticationTokenFromWebBundle(Bundle bundle, String str) {
            m.f(bundle, "bundle");
            String string = bundle.getString("id_token");
            if (string != null) {
                boolean z10 = true;
                if (!(string.length() == 0) && str != null) {
                    if (str.length() != 0) {
                        z10 = false;
                    }
                    if (!z10) {
                        try {
                            return new AuthenticationToken(string, str);
                        } catch (Exception e10) {
                            throw new FacebookException(e10.getMessage(), (Throwable) e10);
                        }
                    }
                }
            }
            return null;
        }

        public final String getUserIDFromSignedRequest(String str) {
            if (str != null) {
                if (!(str.length() == 0)) {
                    try {
                        Object[] array = q.c0(str, new String[]{"."}, false, 0, 6, (Object) null).toArray(new String[0]);
                        if (array != null) {
                            String[] strArr = (String[]) array;
                            if (strArr.length == 2) {
                                byte[] decode = Base64.decode(strArr[1], 0);
                                m.e(decode, "data");
                                String string = new JSONObject(new String(decode, d.f14759b)).getString(AccessToken.USER_ID_KEY);
                                m.e(string, "jsonObject.getString(\"user_id\")");
                                return string;
                            }
                            throw new FacebookException(LoginMethodHandler.NO_USER_ID_ERROR_MESSAGE);
                        }
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                    } catch (UnsupportedEncodingException | JSONException unused) {
                    }
                }
            }
            throw new FacebookException(LoginMethodHandler.NO_SIGNED_REQUEST_ERROR_MESSAGE);
        }
    }

    public LoginMethodHandler(LoginClient loginClient2) {
        m.f(loginClient2, "loginClient");
        setLoginClient(loginClient2);
    }

    public static final AccessToken createAccessTokenFromNativeLogin(Bundle bundle, AccessTokenSource accessTokenSource, String str) {
        return Companion.createAccessTokenFromNativeLogin(bundle, accessTokenSource, str);
    }

    public static final AccessToken createAccessTokenFromWebBundle(Collection<String> collection, Bundle bundle, AccessTokenSource accessTokenSource, String str) {
        return Companion.createAccessTokenFromWebBundle(collection, bundle, accessTokenSource, str);
    }

    public static final AuthenticationToken createAuthenticationTokenFromNativeLogin(Bundle bundle, String str) {
        return Companion.createAuthenticationTokenFromNativeLogin(bundle, str);
    }

    public static final AuthenticationToken createAuthenticationTokenFromWebBundle(Bundle bundle, String str) {
        return Companion.createAuthenticationTokenFromWebBundle(bundle, str);
    }

    public static final String getUserIDFromSignedRequest(String str) {
        return Companion.getUserIDFromSignedRequest(str);
    }

    /* access modifiers changed from: protected */
    public void addLoggingExtra(String str, Object obj) {
        if (this.methodLoggingExtras == null) {
            this.methodLoggingExtras = new HashMap();
        }
        Map<String, String> map = this.methodLoggingExtras;
        if (map != null) {
            String put = map.put(str, obj == null ? null : obj.toString());
        }
    }

    public void cancel() {
    }

    /* access modifiers changed from: protected */
    public String getClientState(String str) {
        m.f(str, "authId");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(LoginLogger.EVENT_PARAM_AUTH_LOGGER_ID, str);
            jSONObject.put(LoginLogger.EVENT_PARAM_METHOD, getNameForLogging());
            putChallengeParam(jSONObject);
        } catch (JSONException e10) {
            m.o("Error creating client state json: ", e10.getMessage());
        }
        String jSONObject2 = jSONObject.toString();
        m.e(jSONObject2, "param.toString()");
        return jSONObject2;
    }

    public final LoginClient getLoginClient() {
        LoginClient loginClient2 = this.loginClient;
        if (loginClient2 != null) {
            return loginClient2;
        }
        m.x("loginClient");
        throw null;
    }

    public final Map<String, String> getMethodLoggingExtras() {
        return this.methodLoggingExtras;
    }

    public abstract String getNameForLogging();

    /* access modifiers changed from: protected */
    public String getRedirectUrl() {
        StringBuilder sb = new StringBuilder();
        sb.append("fb");
        FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
        sb.append(FacebookSdk.getApplicationId());
        sb.append("://authorize/");
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    public void logWebLoginCompleted(String str) {
        LoginClient.Request pendingRequest = getLoginClient().getPendingRequest();
        String applicationId = pendingRequest == null ? null : pendingRequest.getApplicationId();
        if (applicationId == null) {
            FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
            applicationId = FacebookSdk.getApplicationId();
        }
        InternalAppEventsLogger internalAppEventsLogger = new InternalAppEventsLogger(getLoginClient().getActivity(), applicationId);
        Bundle bundle = new Bundle();
        bundle.putString(AnalyticsEvents.PARAMETER_WEB_LOGIN_E2E, str);
        bundle.putLong(AnalyticsEvents.PARAMETER_WEB_LOGIN_SWITCHBACK_TIME, System.currentTimeMillis());
        bundle.putString("app_id", applicationId);
        internalAppEventsLogger.logEventImplicitly(AnalyticsEvents.EVENT_WEB_LOGIN_COMPLETE, (Double) null, bundle);
    }

    public boolean needsInternetPermission() {
        return false;
    }

    public boolean onActivityResult(int i10, int i11, Intent intent) {
        return false;
    }

    /* access modifiers changed from: protected */
    public Bundle processCodeExchange(LoginClient.Request request, Bundle bundle) {
        GraphRequest graphRequest;
        m.f(request, "request");
        m.f(bundle, "values");
        String string = bundle.getString("code");
        Utility utility = Utility.INSTANCE;
        if (!Utility.isNullOrEmpty(string)) {
            String str = null;
            if (string == null) {
                graphRequest = null;
            } else {
                PKCEUtil pKCEUtil = PKCEUtil.INSTANCE;
                String redirectUrl = getRedirectUrl();
                String codeVerifier = request.getCodeVerifier();
                if (codeVerifier == null) {
                    codeVerifier = "";
                }
                graphRequest = PKCEUtil.createCodeExchangeRequest(string, redirectUrl, codeVerifier);
            }
            if (graphRequest != null) {
                GraphResponse executeAndWait = graphRequest.executeAndWait();
                FacebookRequestError error = executeAndWait.getError();
                if (error == null) {
                    try {
                        JSONObject jSONObject = executeAndWait.getJSONObject();
                        if (jSONObject != null) {
                            str = jSONObject.getString("access_token");
                        }
                        if (jSONObject == null || Utility.isNullOrEmpty(str)) {
                            throw new FacebookException("No access token found from result");
                        }
                        bundle.putString("access_token", str);
                        if (jSONObject.has("id_token")) {
                            bundle.putString("id_token", jSONObject.getString("id_token"));
                        }
                        return bundle;
                    } catch (JSONException e10) {
                        throw new FacebookException(m.o("Fail to process code exchange response: ", e10.getMessage()));
                    }
                } else {
                    throw new FacebookServiceException(error, error.getErrorMessage());
                }
            } else {
                throw new FacebookException("Failed to create code exchange request");
            }
        } else {
            throw new FacebookException("No code param found from the request");
        }
    }

    public void putChallengeParam(JSONObject jSONObject) {
        m.f(jSONObject, "param");
    }

    public final void setLoginClient(LoginClient loginClient2) {
        m.f(loginClient2, "<set-?>");
        this.loginClient = loginClient2;
    }

    public final void setMethodLoggingExtras(Map<String, String> map) {
        this.methodLoggingExtras = map;
    }

    public boolean shouldKeepTrackOfMultipleIntents() {
        return false;
    }

    public abstract int tryAuthorize(LoginClient.Request request);

    public void writeToParcel(Parcel parcel, int i10) {
        m.f(parcel, "dest");
        Utility utility = Utility.INSTANCE;
        Utility.writeStringMapToParcel(parcel, this.methodLoggingExtras);
    }

    protected LoginMethodHandler(Parcel parcel) {
        m.f(parcel, "source");
        Utility utility = Utility.INSTANCE;
        Map<String, String> readStringMapFromParcel = Utility.readStringMapFromParcel(parcel);
        this.methodLoggingExtras = readStringMapFromParcel == null ? null : h0.n(readStringMapFromParcel);
    }
}
