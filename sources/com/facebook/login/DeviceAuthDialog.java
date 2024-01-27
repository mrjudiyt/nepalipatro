package com.facebook.login;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Html;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.d;
import androidx.lifecycle.f;
import com.facebook.AccessToken;
import com.facebook.AccessTokenSource;
import com.facebook.FacebookActivity;
import com.facebook.FacebookException;
import com.facebook.FacebookRequestError;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.GraphRequestAsyncTask;
import com.facebook.GraphResponse;
import com.facebook.HttpMethod;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.appevents.InternalAppEventsLogger;
import com.facebook.common.R;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.facebook.internal.AnalyticsEvents;
import com.facebook.internal.FetchedAppSettings;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.ServerProtocol;
import com.facebook.internal.SmartLoginOption;
import com.facebook.internal.Utility;
import com.facebook.internal.Validate;
import com.facebook.login.LoginClient;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.EnumSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p0.a;

/* compiled from: DeviceAuthDialog.kt */
public class DeviceAuthDialog extends d {
    public static final Companion Companion = new Companion((g) null);
    /* access modifiers changed from: private */
    public static final String DEVICE_LOGIN_ENDPOINT = "device/login";
    /* access modifiers changed from: private */
    public static final String DEVICE_LOGIN_STATUS_ENDPOINT = "device/login_status";
    private static final int LOGIN_ERROR_SUBCODE_AUTHORIZATION_DECLINED = 1349173;
    /* access modifiers changed from: private */
    public static final int LOGIN_ERROR_SUBCODE_AUTHORIZATION_PENDING = 1349174;
    private static final int LOGIN_ERROR_SUBCODE_CODE_EXPIRED = 1349152;
    private static final int LOGIN_ERROR_SUBCODE_EXCESSIVE_POLLING = 1349172;
    private static final String REQUEST_STATE_KEY = "request_state";
    private final AtomicBoolean completed = new AtomicBoolean();
    private TextView confirmationCode;
    private volatile GraphRequestAsyncTask currentGraphRequestPoll;
    private volatile RequestState currentRequestState;
    private DeviceAuthMethodHandler deviceAuthMethodHandler;
    private TextView instructions;
    private boolean isBeingDestroyed;
    private boolean isRetry;
    private View progressBar;
    private LoginClient.Request request;
    private volatile ScheduledFuture<?> scheduledPoll;

    /* compiled from: DeviceAuthDialog.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public static /* synthetic */ void getDEVICE_LOGIN_ENDPOINT$facebook_common_release$annotations() {
        }

        public static /* synthetic */ void getDEVICE_LOGIN_STATUS_ENDPOINT$facebook_common_release$annotations() {
        }

        public static /* synthetic */ void getLOGIN_ERROR_SUBCODE_AUTHORIZATION_PENDING$facebook_common_release$annotations() {
        }

        /* access modifiers changed from: private */
        public final PermissionsLists handlePermissionResponse(JSONObject jSONObject) {
            String optString;
            JSONArray jSONArray = jSONObject.getJSONObject("permissions").getJSONArray("data");
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            int length = jSONArray.length();
            if (length > 0) {
                int i10 = 0;
                while (true) {
                    int i11 = i10 + 1;
                    JSONObject optJSONObject = jSONArray.optJSONObject(i10);
                    String optString2 = optJSONObject.optString("permission");
                    m.e(optString2, "permission");
                    if (!(optString2.length() == 0) && !m.a(optString2, "installed") && (optString = optJSONObject.optString(AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_STATUS)) != null) {
                        int hashCode = optString.hashCode();
                        if (hashCode != -1309235419) {
                            if (hashCode != 280295099) {
                                if (hashCode == 568196142 && optString.equals("declined")) {
                                    arrayList2.add(optString2);
                                }
                            } else if (optString.equals("granted")) {
                                arrayList.add(optString2);
                            }
                        } else if (optString.equals("expired")) {
                            arrayList3.add(optString2);
                        }
                    }
                    if (i11 >= length) {
                        break;
                    }
                    i10 = i11;
                }
            }
            return new PermissionsLists(arrayList, arrayList2, arrayList3);
        }

        public final String getDEVICE_LOGIN_ENDPOINT$facebook_common_release() {
            return DeviceAuthDialog.DEVICE_LOGIN_ENDPOINT;
        }

        public final String getDEVICE_LOGIN_STATUS_ENDPOINT$facebook_common_release() {
            return DeviceAuthDialog.DEVICE_LOGIN_STATUS_ENDPOINT;
        }

        public final int getLOGIN_ERROR_SUBCODE_AUTHORIZATION_PENDING$facebook_common_release() {
            return DeviceAuthDialog.LOGIN_ERROR_SUBCODE_AUTHORIZATION_PENDING;
        }
    }

    /* compiled from: DeviceAuthDialog.kt */
    private static final class PermissionsLists {
        private List<String> declinedPermissions;
        private List<String> expiredPermissions;
        private List<String> grantedPermissions;

        public PermissionsLists(List<String> list, List<String> list2, List<String> list3) {
            m.f(list, "grantedPermissions");
            m.f(list2, "declinedPermissions");
            m.f(list3, "expiredPermissions");
            this.grantedPermissions = list;
            this.declinedPermissions = list2;
            this.expiredPermissions = list3;
        }

        public final List<String> getDeclinedPermissions() {
            return this.declinedPermissions;
        }

        public final List<String> getExpiredPermissions() {
            return this.expiredPermissions;
        }

        public final List<String> getGrantedPermissions() {
            return this.grantedPermissions;
        }

        public final void setDeclinedPermissions(List<String> list) {
            m.f(list, "<set-?>");
            this.declinedPermissions = list;
        }

        public final void setExpiredPermissions(List<String> list) {
            m.f(list, "<set-?>");
            this.expiredPermissions = list;
        }

        public final void setGrantedPermissions(List<String> list) {
            m.f(list, "<set-?>");
            this.grantedPermissions = list;
        }
    }

    /* compiled from: DeviceAuthDialog.kt */
    private static final class RequestState implements Parcelable {
        public static final Parcelable.Creator<RequestState> CREATOR = new DeviceAuthDialog$RequestState$Companion$CREATOR$1();
        public static final Companion Companion = new Companion((g) null);
        private String authorizationUri;
        private long interval;
        private long lastPoll;
        private String requestCode;
        private String userCode;

        /* compiled from: DeviceAuthDialog.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(g gVar) {
                this();
            }
        }

        public RequestState() {
        }

        public int describeContents() {
            return 0;
        }

        public final String getAuthorizationUri() {
            return this.authorizationUri;
        }

        public final long getInterval() {
            return this.interval;
        }

        public final String getRequestCode() {
            return this.requestCode;
        }

        public final String getUserCode() {
            return this.userCode;
        }

        public final void setInterval(long j10) {
            this.interval = j10;
        }

        public final void setLastPoll(long j10) {
            this.lastPoll = j10;
        }

        public final void setRequestCode(String str) {
            this.requestCode = str;
        }

        public final void setUserCode(String str) {
            this.userCode = str;
            b0 b0Var = b0.f15559a;
            String format = String.format(Locale.ENGLISH, "https://facebook.com/device?user_code=%1$s&qr=1", Arrays.copyOf(new Object[]{str}, 1));
            m.e(format, "java.lang.String.format(locale, format, *args)");
            this.authorizationUri = format;
        }

        public final boolean withinLastRefreshWindow() {
            if (this.lastPoll != 0 && (new Date().getTime() - this.lastPoll) - (this.interval * 1000) < 0) {
                return true;
            }
            return false;
        }

        public void writeToParcel(Parcel parcel, int i10) {
            m.f(parcel, "dest");
            parcel.writeString(this.authorizationUri);
            parcel.writeString(this.userCode);
            parcel.writeString(this.requestCode);
            parcel.writeLong(this.interval);
            parcel.writeLong(this.lastPoll);
        }

        protected RequestState(Parcel parcel) {
            m.f(parcel, "parcel");
            this.authorizationUri = parcel.readString();
            this.userCode = parcel.readString();
            this.requestCode = parcel.readString();
            this.interval = parcel.readLong();
            this.lastPoll = parcel.readLong();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: _get_pollRequest_$lambda-5  reason: not valid java name */
    public static final void m130_get_pollRequest_$lambda5(DeviceAuthDialog deviceAuthDialog, GraphResponse graphResponse) {
        m.f(deviceAuthDialog, "this$0");
        m.f(graphResponse, "response");
        if (!deviceAuthDialog.completed.get()) {
            FacebookRequestError error = graphResponse.getError();
            if (error != null) {
                int subErrorCode = error.getSubErrorCode();
                boolean z10 = true;
                if (!(subErrorCode == LOGIN_ERROR_SUBCODE_AUTHORIZATION_PENDING || subErrorCode == LOGIN_ERROR_SUBCODE_EXCESSIVE_POLLING)) {
                    z10 = false;
                }
                if (z10) {
                    deviceAuthDialog.schedulePoll();
                } else if (subErrorCode == LOGIN_ERROR_SUBCODE_CODE_EXPIRED) {
                    RequestState requestState = deviceAuthDialog.currentRequestState;
                    if (requestState != null) {
                        DeviceRequestsHelper deviceRequestsHelper = DeviceRequestsHelper.INSTANCE;
                        DeviceRequestsHelper.cleanUpAdvertisementService(requestState.getUserCode());
                    }
                    LoginClient.Request request2 = deviceAuthDialog.request;
                    if (request2 != null) {
                        deviceAuthDialog.startLogin(request2);
                    } else {
                        deviceAuthDialog.onCancel();
                    }
                } else if (subErrorCode == LOGIN_ERROR_SUBCODE_AUTHORIZATION_DECLINED) {
                    deviceAuthDialog.onCancel();
                } else {
                    FacebookRequestError error2 = graphResponse.getError();
                    FacebookException exception = error2 == null ? null : error2.getException();
                    if (exception == null) {
                        exception = new FacebookException();
                    }
                    deviceAuthDialog.onError(exception);
                }
            } else {
                try {
                    JSONObject jSONObject = graphResponse.getJSONObject();
                    if (jSONObject == null) {
                        jSONObject = new JSONObject();
                    }
                    String string = jSONObject.getString("access_token");
                    m.e(string, "resultObject.getString(\"access_token\")");
                    deviceAuthDialog.onSuccess(string, jSONObject.getLong(AccessToken.EXPIRES_IN_KEY), Long.valueOf(jSONObject.optLong(AccessToken.DATA_ACCESS_EXPIRATION_TIME)));
                } catch (JSONException e10) {
                    deviceAuthDialog.onError(new FacebookException((Throwable) e10));
                }
            }
        }
    }

    private final void completeLogin(String str, PermissionsLists permissionsLists, String str2, Date date, Date date2) {
        DeviceAuthMethodHandler deviceAuthMethodHandler2 = this.deviceAuthMethodHandler;
        if (deviceAuthMethodHandler2 != null) {
            FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
            deviceAuthMethodHandler2.onSuccess(str2, FacebookSdk.getApplicationId(), str, permissionsLists.getGrantedPermissions(), permissionsLists.getDeclinedPermissions(), permissionsLists.getExpiredPermissions(), AccessTokenSource.DEVICE_AUTH, date, (Date) null, date2);
        }
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    private final GraphRequest getPollRequest() {
        Bundle bundle = new Bundle();
        RequestState requestState = this.currentRequestState;
        bundle.putString("code", requestState == null ? null : requestState.getRequestCode());
        bundle.putString("access_token", getApplicationAccessToken());
        return GraphRequest.Companion.newPostRequestWithBundle((AccessToken) null, DEVICE_LOGIN_STATUS_ENDPOINT, bundle, new f(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: initializeContentView$lambda-2  reason: not valid java name */
    public static final void m131initializeContentView$lambda2(DeviceAuthDialog deviceAuthDialog, View view) {
        m.f(deviceAuthDialog, "this$0");
        deviceAuthDialog.onCancel();
    }

    private final void onSuccess(String str, long j10, Long l10) {
        Bundle bundle = new Bundle();
        bundle.putString(GraphRequest.FIELDS_PARAM, "id,permissions,name");
        Date date = null;
        Date date2 = j10 != 0 ? new Date(new Date().getTime() + (j10 * 1000)) : null;
        if ((l10 == null || l10.longValue() != 0) && l10 != null) {
            date = new Date(l10.longValue() * 1000);
        }
        FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
        GraphRequest newGraphPathRequest = GraphRequest.Companion.newGraphPathRequest(new AccessToken(str, FacebookSdk.getApplicationId(), AppEventsConstants.EVENT_PARAM_VALUE_NO, (Collection) null, (Collection) null, (Collection) null, (AccessTokenSource) null, date2, (Date) null, date, (String) null, 1024, (g) null), "me", new g(this, str, date2, date));
        newGraphPathRequest.setHttpMethod(HttpMethod.GET);
        newGraphPathRequest.setParameters(bundle);
        newGraphPathRequest.executeAsync();
    }

    /* access modifiers changed from: private */
    /* renamed from: onSuccess$lambda-10  reason: not valid java name */
    public static final void m132onSuccess$lambda10(DeviceAuthDialog deviceAuthDialog, String str, Date date, Date date2, GraphResponse graphResponse) {
        EnumSet<SmartLoginOption> smartLoginOptions;
        m.f(deviceAuthDialog, "this$0");
        m.f(str, "$accessToken");
        m.f(graphResponse, "response");
        if (!deviceAuthDialog.completed.get()) {
            FacebookRequestError error = graphResponse.getError();
            if (error != null) {
                FacebookException exception = error.getException();
                if (exception == null) {
                    exception = new FacebookException();
                }
                deviceAuthDialog.onError(exception);
                return;
            }
            try {
                JSONObject jSONObject = graphResponse.getJSONObject();
                if (jSONObject == null) {
                    jSONObject = new JSONObject();
                }
                String string = jSONObject.getString("id");
                m.e(string, "jsonObject.getString(\"id\")");
                PermissionsLists access$handlePermissionResponse = Companion.handlePermissionResponse(jSONObject);
                String string2 = jSONObject.getString("name");
                m.e(string2, "jsonObject.getString(\"name\")");
                RequestState requestState = deviceAuthDialog.currentRequestState;
                if (requestState != null) {
                    DeviceRequestsHelper deviceRequestsHelper = DeviceRequestsHelper.INSTANCE;
                    DeviceRequestsHelper.cleanUpAdvertisementService(requestState.getUserCode());
                }
                FetchedAppSettingsManager fetchedAppSettingsManager = FetchedAppSettingsManager.INSTANCE;
                FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
                FetchedAppSettings appSettingsWithoutQuery = FetchedAppSettingsManager.getAppSettingsWithoutQuery(FacebookSdk.getApplicationId());
                Boolean bool = null;
                if (!(appSettingsWithoutQuery == null || (smartLoginOptions = appSettingsWithoutQuery.getSmartLoginOptions()) == null)) {
                    bool = Boolean.valueOf(smartLoginOptions.contains(SmartLoginOption.RequireConfirm));
                }
                if (!m.a(bool, Boolean.TRUE) || deviceAuthDialog.isRetry) {
                    deviceAuthDialog.completeLogin(string, access$handlePermissionResponse, str, date, date2);
                    return;
                }
                deviceAuthDialog.isRetry = true;
                deviceAuthDialog.presentConfirmation(string, access$handlePermissionResponse, str, string2, date, date2);
            } catch (JSONException e10) {
                deviceAuthDialog.onError(new FacebookException((Throwable) e10));
            }
        }
    }

    private final void poll() {
        RequestState requestState = this.currentRequestState;
        if (requestState != null) {
            requestState.setLastPoll(new Date().getTime());
        }
        this.currentGraphRequestPoll = getPollRequest().executeAsync();
    }

    private final void presentConfirmation(String str, PermissionsLists permissionsLists, String str2, String str3, Date date, Date date2) {
        String string = getResources().getString(R.string.com_facebook_smart_login_confirmation_title);
        m.e(string, "resources.getString(R.string.com_facebook_smart_login_confirmation_title)");
        String string2 = getResources().getString(R.string.com_facebook_smart_login_confirmation_continue_as);
        m.e(string2, "resources.getString(R.string.com_facebook_smart_login_confirmation_continue_as)");
        String string3 = getResources().getString(R.string.com_facebook_smart_login_confirmation_cancel);
        m.e(string3, "resources.getString(R.string.com_facebook_smart_login_confirmation_cancel)");
        b0 b0Var = b0.f15559a;
        String format = String.format(string2, Arrays.copyOf(new Object[]{str3}, 1));
        m.e(format, "java.lang.String.format(format, *args)");
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
        builder.setMessage(string).setCancelable(true).setNegativeButton(format, new c(this, str, permissionsLists, str2, date, date2)).setPositiveButton(string3, new b(this));
        builder.create().show();
    }

    /* access modifiers changed from: private */
    /* renamed from: presentConfirmation$lambda-6  reason: not valid java name */
    public static final void m133presentConfirmation$lambda6(DeviceAuthDialog deviceAuthDialog, String str, PermissionsLists permissionsLists, String str2, Date date, Date date2, DialogInterface dialogInterface, int i10) {
        m.f(deviceAuthDialog, "this$0");
        m.f(str, "$userId");
        m.f(permissionsLists, "$permissions");
        m.f(str2, "$accessToken");
        deviceAuthDialog.completeLogin(str, permissionsLists, str2, date, date2);
    }

    /* access modifiers changed from: private */
    /* renamed from: presentConfirmation$lambda-8  reason: not valid java name */
    public static final void m134presentConfirmation$lambda8(DeviceAuthDialog deviceAuthDialog, DialogInterface dialogInterface, int i10) {
        m.f(deviceAuthDialog, "this$0");
        View initializeContentView = deviceAuthDialog.initializeContentView(false);
        Dialog dialog = deviceAuthDialog.getDialog();
        if (dialog != null) {
            dialog.setContentView(initializeContentView);
        }
        LoginClient.Request request2 = deviceAuthDialog.request;
        if (request2 != null) {
            deviceAuthDialog.startLogin(request2);
        }
    }

    private final void schedulePoll() {
        RequestState requestState = this.currentRequestState;
        Long valueOf = requestState == null ? null : Long.valueOf(requestState.getInterval());
        if (valueOf != null) {
            this.scheduledPoll = DeviceAuthMethodHandler.Companion.getBackgroundExecutor().schedule(new h(this), valueOf.longValue(), TimeUnit.SECONDS);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: schedulePoll$lambda-3  reason: not valid java name */
    public static final void m135schedulePoll$lambda3(DeviceAuthDialog deviceAuthDialog) {
        m.f(deviceAuthDialog, "this$0");
        deviceAuthDialog.poll();
    }

    private final void setCurrentRequestState(RequestState requestState) {
        this.currentRequestState = requestState;
        TextView textView = this.confirmationCode;
        if (textView != null) {
            textView.setText(requestState.getUserCode());
            DeviceRequestsHelper deviceRequestsHelper = DeviceRequestsHelper.INSTANCE;
            BitmapDrawable bitmapDrawable = new BitmapDrawable(getResources(), DeviceRequestsHelper.generateQRCode(requestState.getAuthorizationUri()));
            TextView textView2 = this.instructions;
            if (textView2 != null) {
                textView2.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, bitmapDrawable, (Drawable) null, (Drawable) null);
                TextView textView3 = this.confirmationCode;
                if (textView3 != null) {
                    textView3.setVisibility(0);
                    View view = this.progressBar;
                    if (view != null) {
                        view.setVisibility(8);
                        if (!this.isRetry && DeviceRequestsHelper.startAdvertisementService(requestState.getUserCode())) {
                            new InternalAppEventsLogger(getContext()).logEventImplicitly(AnalyticsEvents.EVENT_SMART_LOGIN_SERVICE);
                        }
                        if (requestState.withinLastRefreshWindow()) {
                            schedulePoll();
                        } else {
                            poll();
                        }
                    } else {
                        m.x("progressBar");
                        throw null;
                    }
                } else {
                    m.x("confirmationCode");
                    throw null;
                }
            } else {
                m.x("instructions");
                throw null;
            }
        } else {
            m.x("confirmationCode");
            throw null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: startLogin$lambda-1  reason: not valid java name */
    public static final void m136startLogin$lambda1(DeviceAuthDialog deviceAuthDialog, GraphResponse graphResponse) {
        m.f(deviceAuthDialog, "this$0");
        m.f(graphResponse, "response");
        if (!deviceAuthDialog.isBeingDestroyed) {
            if (graphResponse.getError() != null) {
                FacebookRequestError error = graphResponse.getError();
                FacebookException exception = error == null ? null : error.getException();
                if (exception == null) {
                    exception = new FacebookException();
                }
                deviceAuthDialog.onError(exception);
                return;
            }
            JSONObject jSONObject = graphResponse.getJSONObject();
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            RequestState requestState = new RequestState();
            try {
                requestState.setUserCode(jSONObject.getString("user_code"));
                requestState.setRequestCode(jSONObject.getString("code"));
                requestState.setInterval(jSONObject.getLong("interval"));
                deviceAuthDialog.setCurrentRequestState(requestState);
            } catch (JSONException e10) {
                deviceAuthDialog.onError(new FacebookException((Throwable) e10));
            }
        }
    }

    public Map<String, String> additionalDeviceInfo() {
        return null;
    }

    public String getApplicationAccessToken() {
        StringBuilder sb = new StringBuilder();
        Validate validate = Validate.INSTANCE;
        sb.append(Validate.hasAppID());
        sb.append('|');
        sb.append(Validate.hasClientToken());
        return sb.toString();
    }

    public /* bridge */ /* synthetic */ a getDefaultViewModelCreationExtras() {
        return f.a(this);
    }

    /* access modifiers changed from: protected */
    public int getLayoutResId(boolean z10) {
        if (z10) {
            return R.layout.com_facebook_smart_device_dialog_fragment;
        }
        return R.layout.com_facebook_device_auth_dialog_fragment;
    }

    /* access modifiers changed from: protected */
    public View initializeContentView(boolean z10) {
        LayoutInflater layoutInflater = requireActivity().getLayoutInflater();
        m.e(layoutInflater, "requireActivity().layoutInflater");
        View inflate = layoutInflater.inflate(getLayoutResId(z10), (ViewGroup) null);
        m.e(inflate, "inflater.inflate(getLayoutResId(isSmartLogin), null)");
        View findViewById = inflate.findViewById(R.id.progress_bar);
        m.e(findViewById, "view.findViewById(R.id.progress_bar)");
        this.progressBar = findViewById;
        View findViewById2 = inflate.findViewById(R.id.confirmation_code);
        Objects.requireNonNull(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        this.confirmationCode = (TextView) findViewById2;
        View findViewById3 = inflate.findViewById(R.id.cancel_button);
        Objects.requireNonNull(findViewById3, "null cannot be cast to non-null type android.widget.Button");
        ((Button) findViewById3).setOnClickListener(new d(this));
        View findViewById4 = inflate.findViewById(R.id.com_facebook_device_auth_instructions);
        Objects.requireNonNull(findViewById4, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) findViewById4;
        this.instructions = textView;
        textView.setText(Html.fromHtml(getString(R.string.com_facebook_device_auth_instructions)));
        return inflate;
    }

    /* access modifiers changed from: protected */
    public boolean onBackButtonPressed() {
        return true;
    }

    /* access modifiers changed from: protected */
    public void onCancel() {
        if (this.completed.compareAndSet(false, true)) {
            RequestState requestState = this.currentRequestState;
            if (requestState != null) {
                DeviceRequestsHelper deviceRequestsHelper = DeviceRequestsHelper.INSTANCE;
                DeviceRequestsHelper.cleanUpAdvertisementService(requestState.getUserCode());
            }
            DeviceAuthMethodHandler deviceAuthMethodHandler2 = this.deviceAuthMethodHandler;
            if (deviceAuthMethodHandler2 != null) {
                deviceAuthMethodHandler2.onCancel();
            }
            Dialog dialog = getDialog();
            if (dialog != null) {
                dialog.dismiss();
            }
        }
    }

    public Dialog onCreateDialog(Bundle bundle) {
        DeviceAuthDialog$onCreateDialog$dialog$1 deviceAuthDialog$onCreateDialog$dialog$1 = new DeviceAuthDialog$onCreateDialog$dialog$1(this, requireActivity(), R.style.com_facebook_auth_dialog);
        DeviceRequestsHelper deviceRequestsHelper = DeviceRequestsHelper.INSTANCE;
        deviceAuthDialog$onCreateDialog$dialog$1.setContentView(initializeContentView(DeviceRequestsHelper.isAvailable() && !this.isRetry));
        return deviceAuthDialog$onCreateDialog$dialog$1;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        RequestState requestState;
        LoginClient loginClient;
        m.f(layoutInflater, "inflater");
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        LoginFragment loginFragment = (LoginFragment) ((FacebookActivity) requireActivity()).getCurrentFragment();
        LoginMethodHandler loginMethodHandler = null;
        if (!(loginFragment == null || (loginClient = loginFragment.getLoginClient()) == null)) {
            loginMethodHandler = loginClient.getCurrentHandler();
        }
        this.deviceAuthMethodHandler = (DeviceAuthMethodHandler) loginMethodHandler;
        if (!(bundle == null || (requestState = (RequestState) bundle.getParcelable(REQUEST_STATE_KEY)) == null)) {
            setCurrentRequestState(requestState);
        }
        return onCreateView;
    }

    public void onDestroyView() {
        this.isBeingDestroyed = true;
        this.completed.set(true);
        super.onDestroyView();
        GraphRequestAsyncTask graphRequestAsyncTask = this.currentGraphRequestPoll;
        if (graphRequestAsyncTask != null) {
            graphRequestAsyncTask.cancel(true);
        }
        ScheduledFuture<?> scheduledFuture = this.scheduledPoll;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
    }

    public void onDismiss(DialogInterface dialogInterface) {
        m.f(dialogInterface, "dialog");
        super.onDismiss(dialogInterface);
        if (!this.isBeingDestroyed) {
            onCancel();
        }
    }

    /* access modifiers changed from: protected */
    public void onError(FacebookException facebookException) {
        m.f(facebookException, "ex");
        if (this.completed.compareAndSet(false, true)) {
            RequestState requestState = this.currentRequestState;
            if (requestState != null) {
                DeviceRequestsHelper deviceRequestsHelper = DeviceRequestsHelper.INSTANCE;
                DeviceRequestsHelper.cleanUpAdvertisementService(requestState.getUserCode());
            }
            DeviceAuthMethodHandler deviceAuthMethodHandler2 = this.deviceAuthMethodHandler;
            if (deviceAuthMethodHandler2 != null) {
                deviceAuthMethodHandler2.onError(facebookException);
            }
            Dialog dialog = getDialog();
            if (dialog != null) {
                dialog.dismiss();
            }
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        m.f(bundle, "outState");
        super.onSaveInstanceState(bundle);
        if (this.currentRequestState != null) {
            bundle.putParcelable(REQUEST_STATE_KEY, this.currentRequestState);
        }
    }

    public void startLogin(LoginClient.Request request2) {
        m.f(request2, "request");
        this.request = request2;
        Bundle bundle = new Bundle();
        bundle.putString("scope", TextUtils.join(",", request2.getPermissions()));
        Utility utility = Utility.INSTANCE;
        Utility.putNonEmptyString(bundle, ServerProtocol.DIALOG_PARAM_REDIRECT_URI, request2.getDeviceRedirectUriString());
        Utility.putNonEmptyString(bundle, DeviceRequestsHelper.DEVICE_TARGET_USER_ID, request2.getDeviceAuthTargetUserId());
        bundle.putString("access_token", getApplicationAccessToken());
        DeviceRequestsHelper deviceRequestsHelper = DeviceRequestsHelper.INSTANCE;
        Map<String, String> additionalDeviceInfo = additionalDeviceInfo();
        bundle.putString(DeviceRequestsHelper.DEVICE_INFO_PARAM, DeviceRequestsHelper.getDeviceInfo(additionalDeviceInfo == null ? null : h0.n(additionalDeviceInfo)));
        GraphRequest.Companion.newPostRequestWithBundle((AccessToken) null, DEVICE_LOGIN_ENDPOINT, bundle, new e(this)).executeAsync();
    }
}
