package com.facebook.login.widget;

import android.annotation.TargetApi;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import androidx.activity.result.c;
import androidx.activity.result.d;
import androidx.fragment.app.Fragment;
import com.facebook.AccessToken;
import com.facebook.AccessTokenTracker;
import com.facebook.CallbackManager;
import com.facebook.FacebookButtonBase;
import com.facebook.FacebookCallback;
import com.facebook.FacebookSdk;
import com.facebook.Profile;
import com.facebook.appevents.InternalAppEventsLogger;
import com.facebook.internal.AnalyticsEvents;
import com.facebook.internal.CallbackManagerImpl;
import com.facebook.internal.FetchedAppSettings;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.ServerProtocol;
import com.facebook.internal.Utility;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import com.facebook.login.DefaultAudience;
import com.facebook.login.LoginBehavior;
import com.facebook.login.LoginManager;
import com.facebook.login.LoginResult;
import com.facebook.login.LoginTargetApp;
import com.facebook.login.R;
import com.facebook.login.widget.ToolTipPopup;
import h.a;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;

/* compiled from: LoginButton.kt */
public class LoginButton extends FacebookButtonBase {
    public static final Companion Companion = new Companion((g) null);
    private static final int MAX_BUTTON_TRANSPARENCY = 255;
    private static final int MIN_BUTTON_TRANSPARENCY = 0;
    private static final String TAG = LoginButton.class.getName();
    private AccessTokenTracker accessTokenTracker;
    /* access modifiers changed from: private */
    public c<Collection<String>> androidXLoginCaller;
    private CallbackManager callbackManager;
    /* access modifiers changed from: private */
    public boolean confirmLogout;
    private Float customButtonRadius;
    private int customButtonTransparency;
    private final String loggerID;
    private o8.g<? extends LoginManager> loginManagerLazy;
    private String loginText;
    private String logoutText;
    private final LoginButtonProperties properties;
    private boolean toolTipChecked;
    private long toolTipDisplayTime;
    private ToolTipMode toolTipMode;
    private ToolTipPopup toolTipPopup;
    private ToolTipPopup.Style toolTipStyle;

    /* compiled from: LoginButton.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }
    }

    /* compiled from: LoginButton.kt */
    public static class LoginButtonProperties {
        private String authType = ServerProtocol.DIALOG_REREQUEST_AUTH_TYPE;
        private DefaultAudience defaultAudience = DefaultAudience.FRIENDS;
        private LoginBehavior loginBehavior = LoginBehavior.NATIVE_WITH_FALLBACK;
        private LoginTargetApp loginTargetApp = LoginTargetApp.FACEBOOK;
        private String messengerPageId;
        private List<String> permissions = p.e();
        private boolean resetMessengerState;
        private boolean shouldSkipAccountDeduplication;

        public final void clearPermissions() {
            this.permissions = p.e();
        }

        public final String getAuthType() {
            return this.authType;
        }

        public final DefaultAudience getDefaultAudience() {
            return this.defaultAudience;
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

        public final List<String> getPermissions() {
            return this.permissions;
        }

        public final boolean getResetMessengerState() {
            return this.resetMessengerState;
        }

        public final boolean getShouldSkipAccountDeduplication() {
            return this.shouldSkipAccountDeduplication;
        }

        public final void setAuthType(String str) {
            m.f(str, "<set-?>");
            this.authType = str;
        }

        public final void setDefaultAudience(DefaultAudience defaultAudience2) {
            m.f(defaultAudience2, "<set-?>");
            this.defaultAudience = defaultAudience2;
        }

        public final void setLoginBehavior(LoginBehavior loginBehavior2) {
            m.f(loginBehavior2, "<set-?>");
            this.loginBehavior = loginBehavior2;
        }

        public final void setLoginTargetApp(LoginTargetApp loginTargetApp2) {
            m.f(loginTargetApp2, "<set-?>");
            this.loginTargetApp = loginTargetApp2;
        }

        public final void setMessengerPageId(String str) {
            this.messengerPageId = str;
        }

        public final void setPermissions(List<String> list) {
            m.f(list, "<set-?>");
            this.permissions = list;
        }

        public final void setResetMessengerState(boolean z10) {
            this.resetMessengerState = z10;
        }

        /* access modifiers changed from: protected */
        public final void setShouldSkipAccountDeduplication(boolean z10) {
            this.shouldSkipAccountDeduplication = z10;
        }
    }

    /* compiled from: LoginButton.kt */
    protected class LoginClickListener implements View.OnClickListener {
        final /* synthetic */ LoginButton this$0;

        public LoginClickListener(LoginButton loginButton) {
            m.f(loginButton, "this$0");
            this.this$0 = loginButton;
        }

        /* access modifiers changed from: private */
        /* renamed from: performLogout$lambda-2  reason: not valid java name */
        public static final void m150performLogout$lambda2(LoginManager loginManager, DialogInterface dialogInterface, int i10) {
            if (!CrashShieldHandler.isObjectCrashing(LoginClickListener.class)) {
                try {
                    m.f(loginManager, "$loginManager");
                    loginManager.logOut();
                } catch (Throwable th) {
                    CrashShieldHandler.handleThrowable(th, LoginClickListener.class);
                }
            }
        }

        /* access modifiers changed from: protected */
        public LoginManager getLoginManager() {
            if (CrashShieldHandler.isObjectCrashing(this)) {
                return null;
            }
            try {
                LoginManager instance = LoginManager.Companion.getInstance();
                instance.setDefaultAudience(this.this$0.getDefaultAudience());
                instance.setLoginBehavior(this.this$0.getLoginBehavior());
                instance.setLoginTargetApp(getLoginTargetApp());
                instance.setAuthType(this.this$0.getAuthType());
                instance.setFamilyLogin(isFamilyLogin());
                instance.setShouldSkipAccountDeduplication(this.this$0.getShouldSkipAccountDeduplication());
                instance.setMessengerPageId(this.this$0.getMessengerPageId());
                instance.setResetMessengerState(this.this$0.getResetMessengerState());
                return instance;
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
                return null;
            }
        }

        /* access modifiers changed from: protected */
        public final LoginTargetApp getLoginTargetApp() {
            if (CrashShieldHandler.isObjectCrashing(this)) {
                return null;
            }
            try {
                return LoginTargetApp.FACEBOOK;
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
                return null;
            }
        }

        /* access modifiers changed from: protected */
        public final boolean isFamilyLogin() {
            CrashShieldHandler.isObjectCrashing(this);
            return false;
        }

        public void onClick(View view) {
            if (!CrashShieldHandler.isObjectCrashing(this)) {
                try {
                    m.f(view, "v");
                    this.this$0.callExternalOnClickListener(view);
                    AccessToken.Companion companion = AccessToken.Companion;
                    AccessToken currentAccessToken = companion.getCurrentAccessToken();
                    boolean isCurrentAccessTokenActive = companion.isCurrentAccessTokenActive();
                    if (isCurrentAccessTokenActive) {
                        Context context = this.this$0.getContext();
                        m.e(context, "context");
                        performLogout(context);
                    } else {
                        performLogin();
                    }
                    InternalAppEventsLogger internalAppEventsLogger = new InternalAppEventsLogger(this.this$0.getContext());
                    Bundle bundle = new Bundle();
                    int i10 = 0;
                    bundle.putInt("logging_in", currentAccessToken != null ? 0 : 1);
                    if (isCurrentAccessTokenActive) {
                        i10 = 1;
                    }
                    bundle.putInt("access_token_expired", i10);
                    internalAppEventsLogger.logEventImplicitly(AnalyticsEvents.EVENT_LOGIN_VIEW_USAGE, bundle);
                } catch (Throwable th) {
                    CrashShieldHandler.handleThrowable(th, this);
                }
            }
        }

        /* access modifiers changed from: protected */
        public final void performLogin() {
            if (!CrashShieldHandler.isObjectCrashing(this)) {
                try {
                    LoginManager loginManager = getLoginManager();
                    c access$getAndroidXLoginCaller$p = this.this$0.androidXLoginCaller;
                    if (access$getAndroidXLoginCaller$p != null) {
                        LoginManager.FacebookLoginActivityResultContract facebookLoginActivityResultContract = (LoginManager.FacebookLoginActivityResultContract) access$getAndroidXLoginCaller$p.a();
                        CallbackManager callbackManager = this.this$0.getCallbackManager();
                        if (callbackManager == null) {
                            callbackManager = new CallbackManagerImpl();
                        }
                        facebookLoginActivityResultContract.setCallbackManager(callbackManager);
                        access$getAndroidXLoginCaller$p.b(this.this$0.getProperties().getPermissions());
                    } else if (this.this$0.getFragment() != null) {
                        Fragment fragment = this.this$0.getFragment();
                        if (fragment != null) {
                            LoginButton loginButton = this.this$0;
                            loginManager.logIn(fragment, (Collection<String>) loginButton.getProperties().getPermissions(), loginButton.getLoggerID());
                        }
                    } else if (this.this$0.getNativeFragment() != null) {
                        android.app.Fragment nativeFragment = this.this$0.getNativeFragment();
                        if (nativeFragment != null) {
                            LoginButton loginButton2 = this.this$0;
                            loginManager.logIn(nativeFragment, (Collection<String>) loginButton2.getProperties().getPermissions(), loginButton2.getLoggerID());
                        }
                    } else {
                        loginManager.logIn(this.this$0.getActivity(), (Collection<String>) this.this$0.getProperties().getPermissions(), this.this$0.getLoggerID());
                    }
                } catch (Throwable th) {
                    CrashShieldHandler.handleThrowable(th, this);
                }
            }
        }

        /* access modifiers changed from: protected */
        public final void performLogout(Context context) {
            String str;
            String str2;
            if (!CrashShieldHandler.isObjectCrashing(this)) {
                try {
                    m.f(context, "context");
                    LoginManager loginManager = getLoginManager();
                    if (this.this$0.confirmLogout) {
                        String string = this.this$0.getResources().getString(R.string.com_facebook_loginview_log_out_action);
                        m.e(string, "resources.getString(R.string.com_facebook_loginview_log_out_action)");
                        String string2 = this.this$0.getResources().getString(R.string.com_facebook_loginview_cancel_action);
                        m.e(string2, "resources.getString(R.string.com_facebook_loginview_cancel_action)");
                        Profile currentProfile = Profile.Companion.getCurrentProfile();
                        if (currentProfile == null) {
                            str = null;
                        } else {
                            str = currentProfile.getName();
                        }
                        if (str != null) {
                            b0 b0Var = b0.f15559a;
                            String string3 = this.this$0.getResources().getString(R.string.com_facebook_loginview_logged_in_as);
                            m.e(string3, "resources.getString(R.string.com_facebook_loginview_logged_in_as)");
                            str2 = String.format(string3, Arrays.copyOf(new Object[]{currentProfile.getName()}, 1));
                            m.e(str2, "java.lang.String.format(format, *args)");
                        } else {
                            str2 = this.this$0.getResources().getString(R.string.com_facebook_loginview_logged_in_using_facebook);
                            m.e(str2, "{\n          resources.getString(R.string.com_facebook_loginview_logged_in_using_facebook)\n        }");
                        }
                        AlertDialog.Builder builder = new AlertDialog.Builder(context);
                        builder.setMessage(str2).setCancelable(true).setPositiveButton(string, new d(loginManager)).setNegativeButton(string2, (DialogInterface.OnClickListener) null);
                        builder.create().show();
                        return;
                    }
                    loginManager.logOut();
                } catch (Throwable th) {
                    CrashShieldHandler.handleThrowable(th, this);
                }
            }
        }
    }

    /* compiled from: LoginButton.kt */
    public enum ToolTipMode {
        AUTOMATIC(AnalyticsEvents.PARAMETER_SHARE_DIALOG_SHOW_AUTOMATIC, 0),
        DISPLAY_ALWAYS("display_always", 1),
        NEVER_DISPLAY("never_display", 2);
        
        public static final Companion Companion = null;
        /* access modifiers changed from: private */
        public static final ToolTipMode DEFAULT = null;
        private final int intValue;
        private final String stringValue;

        /* compiled from: LoginButton.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(g gVar) {
                this();
            }

            public final ToolTipMode fromInt(int i10) {
                for (ToolTipMode toolTipMode : ToolTipMode.values()) {
                    if (toolTipMode.getIntValue() == i10) {
                        return toolTipMode;
                    }
                }
                return null;
            }

            public final ToolTipMode getDEFAULT() {
                return ToolTipMode.DEFAULT;
            }
        }

        static {
            ToolTipMode toolTipMode;
            Companion = new Companion((g) null);
            DEFAULT = toolTipMode;
        }

        private ToolTipMode(String str, int i10) {
            this.stringValue = str;
            this.intValue = i10;
        }

        public final int getIntValue() {
            return this.intValue;
        }

        public String toString() {
            return this.stringValue;
        }
    }

    /* compiled from: LoginButton.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ToolTipMode.values().length];
            iArr[ToolTipMode.AUTOMATIC.ordinal()] = 1;
            iArr[ToolTipMode.DISPLAY_ALWAYS.ordinal()] = 2;
            iArr[ToolTipMode.NEVER_DISPLAY.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected LoginButton(Context context, AttributeSet attributeSet, int i10, int i11, String str, String str2) {
        super(context, attributeSet, i10, i11, str, str2);
        m.f(context, "context");
        m.f(str, "analyticsButtonCreatedEventName");
        m.f(str2, "analyticsButtonTappedEventName");
        this.properties = new LoginButtonProperties();
        this.toolTipStyle = ToolTipPopup.Style.BLUE;
        this.toolTipMode = ToolTipMode.Companion.getDEFAULT();
        this.toolTipDisplayTime = ToolTipPopup.DEFAULT_POPUP_DISPLAY_TIME;
        this.loginManagerLazy = i.a(LoginButton$loginManagerLazy$1.INSTANCE);
        this.customButtonTransparency = MAX_BUTTON_TRANSPARENCY;
        String uuid = UUID.randomUUID().toString();
        m.e(uuid, "randomUUID().toString()");
        this.loggerID = uuid;
    }

    private final void checkToolTipSettings() {
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                int i10 = WhenMappings.$EnumSwitchMapping$0[this.toolTipMode.ordinal()];
                if (i10 == 1) {
                    Utility utility = Utility.INSTANCE;
                    String metadataApplicationId = Utility.getMetadataApplicationId(getContext());
                    FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
                    FacebookSdk.getExecutor().execute(new c(metadataApplicationId, this));
                } else if (i10 == 2) {
                    String string = getResources().getString(R.string.com_facebook_tooltip_default);
                    m.e(string, "resources.getString(R.string.com_facebook_tooltip_default)");
                    displayToolTip(string);
                }
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: checkToolTipSettings$lambda-3  reason: not valid java name */
    public static final void m147checkToolTipSettings$lambda3(String str, LoginButton loginButton) {
        m.f(str, "$appId");
        m.f(loginButton, "this$0");
        FetchedAppSettingsManager fetchedAppSettingsManager = FetchedAppSettingsManager.INSTANCE;
        loginButton.getActivity().runOnUiThread(new b(loginButton, FetchedAppSettingsManager.queryAppSettings(str, false)));
    }

    /* access modifiers changed from: private */
    /* renamed from: checkToolTipSettings$lambda-3$lambda-2  reason: not valid java name */
    public static final void m148checkToolTipSettings$lambda3$lambda2(LoginButton loginButton, FetchedAppSettings fetchedAppSettings) {
        m.f(loginButton, "this$0");
        loginButton.showToolTipPerSettings(fetchedAppSettings);
    }

    private final void displayToolTip(String str) {
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                ToolTipPopup toolTipPopup2 = new ToolTipPopup(str, this);
                toolTipPopup2.setStyle(this.toolTipStyle);
                toolTipPopup2.setNuxDisplayTime(this.toolTipDisplayTime);
                toolTipPopup2.show();
                this.toolTipPopup = toolTipPopup2;
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    private final int measureButtonWidth(String str) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return 0;
        }
        try {
            return getCompoundPaddingLeft() + getCompoundDrawablePadding() + measureTextWidth(str) + getCompoundPaddingRight();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return 0;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: onAttachedToWindow$lambda-0  reason: not valid java name */
    public static final void m149onAttachedToWindow$lambda0(CallbackManager.ActivityResultParameters activityResultParameters) {
    }

    private final void showToolTipPerSettings(FetchedAppSettings fetchedAppSettings) {
        if (!CrashShieldHandler.isObjectCrashing(this) && fetchedAppSettings != null) {
            try {
                if (fetchedAppSettings.getNuxEnabled() && getVisibility() == 0) {
                    displayToolTip(fetchedAppSettings.getNuxContent());
                }
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    public final void clearPermissions() {
        this.properties.clearPermissions();
    }

    /* access modifiers changed from: protected */
    public void configureButton(Context context, AttributeSet attributeSet, int i10, int i11) {
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                m.f(context, "context");
                super.configureButton(context, attributeSet, i10, i11);
                setInternalOnClickListener(getNewLoginClickListener());
                parseLoginButtonAttributes(context, attributeSet, i10, i11);
                if (isInEditMode()) {
                    setBackgroundColor(getResources().getColor(com.facebook.common.R.color.com_facebook_blue));
                    setLoginText("Continue with Facebook");
                } else {
                    this.accessTokenTracker = new LoginButton$configureButton$1(this);
                }
                setButtonText();
                setButtonRadius();
                setButtonTransparency();
                setButtonIcon();
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    public final void dismissToolTip() {
        ToolTipPopup toolTipPopup2 = this.toolTipPopup;
        if (toolTipPopup2 != null) {
            toolTipPopup2.dismiss();
        }
        this.toolTipPopup = null;
    }

    public final String getAuthType() {
        return this.properties.getAuthType();
    }

    public final CallbackManager getCallbackManager() {
        return this.callbackManager;
    }

    public final DefaultAudience getDefaultAudience() {
        return this.properties.getDefaultAudience();
    }

    /* access modifiers changed from: protected */
    public int getDefaultRequestCode() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return 0;
        }
        try {
            return CallbackManagerImpl.RequestCodeOffset.Login.toRequestCode();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return 0;
        }
    }

    /* access modifiers changed from: protected */
    public int getDefaultStyleResource() {
        return R.style.com_facebook_loginview_default_style;
    }

    public final String getLoggerID() {
        return this.loggerID;
    }

    public final LoginBehavior getLoginBehavior() {
        return this.properties.getLoginBehavior();
    }

    /* access modifiers changed from: protected */
    public final int getLoginButtonContinueLabel() {
        return R.string.com_facebook_loginview_log_in_button_continue;
    }

    /* access modifiers changed from: protected */
    public final int getLoginButtonWidth(int i10) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return 0;
        }
        try {
            Resources resources = getResources();
            String str = this.loginText;
            if (str == null) {
                str = resources.getString(R.string.com_facebook_loginview_log_in_button_continue);
                int measureButtonWidth = measureButtonWidth(str);
                if (Button.resolveSize(measureButtonWidth, i10) < measureButtonWidth) {
                    str = resources.getString(R.string.com_facebook_loginview_log_in_button);
                }
            }
            return measureButtonWidth(str);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return 0;
        }
    }

    /* access modifiers changed from: protected */
    public final o8.g<LoginManager> getLoginManagerLazy() {
        return this.loginManagerLazy;
    }

    public final LoginTargetApp getLoginTargetApp() {
        return this.properties.getLoginTargetApp();
    }

    public final String getLoginText() {
        return this.loginText;
    }

    public final String getLogoutText() {
        return this.logoutText;
    }

    public final String getMessengerPageId() {
        return this.properties.getMessengerPageId();
    }

    /* access modifiers changed from: protected */
    public LoginClickListener getNewLoginClickListener() {
        return new LoginClickListener(this);
    }

    public final List<String> getPermissions() {
        return this.properties.getPermissions();
    }

    /* access modifiers changed from: protected */
    public final LoginButtonProperties getProperties() {
        return this.properties;
    }

    public final boolean getResetMessengerState() {
        return this.properties.getResetMessengerState();
    }

    public final boolean getShouldSkipAccountDeduplication() {
        return this.properties.getShouldSkipAccountDeduplication();
    }

    public final long getToolTipDisplayTime() {
        return this.toolTipDisplayTime;
    }

    public final ToolTipMode getToolTipMode() {
        return this.toolTipMode;
    }

    public final ToolTipPopup.Style getToolTipStyle() {
        return this.toolTipStyle;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                super.onAttachedToWindow();
                if (getContext() instanceof d) {
                    Context context = getContext();
                    if (context != null) {
                        this.androidXLoginCaller = ((d) context).getActivityResultRegistry().j("facebook-login", ((LoginManager) this.loginManagerLazy.getValue()).createLogInActivityResultContract(this.callbackManager, this.loggerID), a.f6138a);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type androidx.activity.result.ActivityResultRegistryOwner");
                    }
                }
                AccessTokenTracker accessTokenTracker2 = this.accessTokenTracker;
                if (accessTokenTracker2 != null) {
                    if (accessTokenTracker2.isTracking()) {
                        accessTokenTracker2.startTracking();
                        setButtonText();
                    }
                }
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                super.onDetachedFromWindow();
                c<Collection<String>> cVar = this.androidXLoginCaller;
                if (cVar != null) {
                    cVar.d();
                }
                AccessTokenTracker accessTokenTracker2 = this.accessTokenTracker;
                if (accessTokenTracker2 != null) {
                    accessTokenTracker2.stopTracking();
                }
                dismissToolTip();
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                m.f(canvas, "canvas");
                super.onDraw(canvas);
                if (!this.toolTipChecked && !isInEditMode()) {
                    this.toolTipChecked = true;
                    checkToolTipSettings();
                }
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                super.onLayout(z10, i10, i11, i12, i13);
                setButtonText();
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                Paint.FontMetrics fontMetrics = getPaint().getFontMetrics();
                int compoundPaddingTop = getCompoundPaddingTop() + ((int) Math.ceil((double) (Math.abs(fontMetrics.top) + Math.abs(fontMetrics.bottom)))) + getCompoundPaddingBottom();
                Resources resources = getResources();
                int loginButtonWidth = getLoginButtonWidth(i10);
                String str = this.logoutText;
                if (str == null) {
                    str = resources.getString(R.string.com_facebook_loginview_log_out_button);
                    m.e(str, "resources.getString(R.string.com_facebook_loginview_log_out_button)");
                }
                setMeasuredDimension(Button.resolveSize(Math.max(loginButtonWidth, measureButtonWidth(str)), i10), compoundPaddingTop);
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onVisibilityChanged(View view, int i10) {
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                m.f(view, "changedView");
                super.onVisibilityChanged(view, i10);
                if (i10 != 0) {
                    dismissToolTip();
                }
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void parseLoginButtonAttributes(Context context, AttributeSet attributeSet, int i10, int i11) {
        TypedArray obtainStyledAttributes;
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                m.f(context, "context");
                ToolTipMode.Companion companion = ToolTipMode.Companion;
                this.toolTipMode = companion.getDEFAULT();
                obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.com_facebook_login_view, i10, i11);
                m.e(obtainStyledAttributes, "context\n            .theme\n            .obtainStyledAttributes(\n                attrs, R.styleable.com_facebook_login_view, defStyleAttr, defStyleRes)");
                this.confirmLogout = obtainStyledAttributes.getBoolean(R.styleable.com_facebook_login_view_com_facebook_confirm_logout, true);
                setLoginText(obtainStyledAttributes.getString(R.styleable.com_facebook_login_view_com_facebook_login_text));
                setLogoutText(obtainStyledAttributes.getString(R.styleable.com_facebook_login_view_com_facebook_logout_text));
                ToolTipMode fromInt = companion.fromInt(obtainStyledAttributes.getInt(R.styleable.com_facebook_login_view_com_facebook_tooltip_mode, companion.getDEFAULT().getIntValue()));
                if (fromInt == null) {
                    fromInt = companion.getDEFAULT();
                }
                this.toolTipMode = fromInt;
                int i12 = R.styleable.com_facebook_login_view_com_facebook_login_button_radius;
                if (obtainStyledAttributes.hasValue(i12)) {
                    this.customButtonRadius = Float.valueOf(obtainStyledAttributes.getDimension(i12, 0.0f));
                }
                int integer = obtainStyledAttributes.getInteger(R.styleable.com_facebook_login_view_com_facebook_login_button_transparency, MAX_BUTTON_TRANSPARENCY);
                this.customButtonTransparency = integer;
                int max = Math.max(0, integer);
                this.customButtonTransparency = max;
                this.customButtonTransparency = Math.min(MAX_BUTTON_TRANSPARENCY, max);
                obtainStyledAttributes.recycle();
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    public final void registerCallback(CallbackManager callbackManager2, FacebookCallback<LoginResult> facebookCallback) {
        m.f(callbackManager2, "callbackManager");
        m.f(facebookCallback, "callback");
        ((LoginManager) this.loginManagerLazy.getValue()).registerCallback(callbackManager2, facebookCallback);
        if (this.callbackManager == null) {
            this.callbackManager = callbackManager2;
        }
    }

    public final void setAuthType(String str) {
        m.f(str, "value");
        this.properties.setAuthType(str);
    }

    /* access modifiers changed from: protected */
    public final void setButtonIcon() {
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                setCompoundDrawablesWithIntrinsicBounds(a.d(getContext(), com.facebook.common.R.drawable.com_facebook_button_icon), (Drawable) null, (Drawable) null, (Drawable) null);
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    /* access modifiers changed from: protected */
    @TargetApi(29)
    public final void setButtonRadius() {
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                Float f10 = this.customButtonRadius;
                if (f10 != null) {
                    float floatValue = f10.floatValue();
                    Drawable background = getBackground();
                    if (Build.VERSION.SDK_INT >= 29 && (background instanceof StateListDrawable)) {
                        int i10 = 0;
                        int stateCount = ((StateListDrawable) background).getStateCount();
                        if (stateCount > 0) {
                            while (true) {
                                int i11 = i10 + 1;
                                Drawable stateDrawable = ((StateListDrawable) background).getStateDrawable(i10);
                                GradientDrawable gradientDrawable = stateDrawable instanceof GradientDrawable ? (GradientDrawable) stateDrawable : null;
                                if (gradientDrawable != null) {
                                    gradientDrawable.setCornerRadius(floatValue);
                                }
                                if (i11 >= stateCount) {
                                    break;
                                }
                                i10 = i11;
                            }
                        }
                    }
                    if (background instanceof GradientDrawable) {
                        ((GradientDrawable) background).setCornerRadius(floatValue);
                    }
                }
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void setButtonText() {
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                Resources resources = getResources();
                if (isInEditMode() || !AccessToken.Companion.isCurrentAccessTokenActive()) {
                    String str = this.loginText;
                    if (str != null) {
                        setText(str);
                        return;
                    }
                    String string = resources.getString(getLoginButtonContinueLabel());
                    m.e(string, "resources.getString(loginButtonContinueLabel)");
                    int width = getWidth();
                    if (width != 0 && measureButtonWidth(string) > width) {
                        string = resources.getString(R.string.com_facebook_loginview_log_in_button);
                        m.e(string, "resources.getString(R.string.com_facebook_loginview_log_in_button)");
                    }
                    setText(string);
                    return;
                }
                String str2 = this.logoutText;
                if (str2 == null) {
                    str2 = resources.getString(R.string.com_facebook_loginview_log_out_button);
                }
                setText(str2);
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void setButtonTransparency() {
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                getBackground().setAlpha(this.customButtonTransparency);
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    public final void setDefaultAudience(DefaultAudience defaultAudience) {
        m.f(defaultAudience, "value");
        this.properties.setDefaultAudience(defaultAudience);
    }

    public final void setLoginBehavior(LoginBehavior loginBehavior) {
        m.f(loginBehavior, "value");
        this.properties.setLoginBehavior(loginBehavior);
    }

    /* access modifiers changed from: protected */
    public final void setLoginManagerLazy(o8.g<? extends LoginManager> gVar) {
        m.f(gVar, "<set-?>");
        this.loginManagerLazy = gVar;
    }

    public final void setLoginTargetApp(LoginTargetApp loginTargetApp) {
        m.f(loginTargetApp, "value");
        this.properties.setLoginTargetApp(loginTargetApp);
    }

    public final void setLoginText(String str) {
        this.loginText = str;
        setButtonText();
    }

    public final void setLogoutText(String str) {
        this.logoutText = str;
        setButtonText();
    }

    public final void setMessengerPageId(String str) {
        this.properties.setMessengerPageId(str);
    }

    public final void setPermissions(String... strArr) {
        m.f(strArr, "permissions");
        this.properties.setPermissions(p.h(Arrays.copyOf(strArr, strArr.length)));
    }

    public final void setPublishPermissions(List<String> list) {
        m.f(list, "permissions");
        this.properties.setPermissions(list);
    }

    public final void setReadPermissions(List<String> list) {
        m.f(list, "permissions");
        this.properties.setPermissions(list);
    }

    public final void setResetMessengerState(boolean z10) {
        this.properties.setResetMessengerState(z10);
    }

    public final void setToolTipDisplayTime(long j10) {
        this.toolTipDisplayTime = j10;
    }

    public final void setToolTipMode(ToolTipMode toolTipMode2) {
        m.f(toolTipMode2, "<set-?>");
        this.toolTipMode = toolTipMode2;
    }

    public final void setToolTipStyle(ToolTipPopup.Style style) {
        m.f(style, "<set-?>");
        this.toolTipStyle = style;
    }

    public final void unregisterCallback(CallbackManager callbackManager2) {
        m.f(callbackManager2, "callbackManager");
        ((LoginManager) this.loginManagerLazy.getValue()).unregisterCallback(callbackManager2);
    }

    public final void setPermissions(List<String> list) {
        m.f(list, "value");
        this.properties.setPermissions(list);
    }

    public final void setPublishPermissions(String... strArr) {
        m.f(strArr, "permissions");
        this.properties.setPermissions(p.h(Arrays.copyOf(strArr, strArr.length)));
    }

    public final void setReadPermissions(String... strArr) {
        m.f(strArr, "permissions");
        this.properties.setPermissions(p.h(Arrays.copyOf(strArr, strArr.length)));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public LoginButton(Context context) {
        this(context, (AttributeSet) null, 0, 0, AnalyticsEvents.EVENT_LOGIN_BUTTON_CREATE, AnalyticsEvents.EVENT_LOGIN_BUTTON_DID_TAP);
        m.f(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public LoginButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, AnalyticsEvents.EVENT_LOGIN_BUTTON_CREATE, AnalyticsEvents.EVENT_LOGIN_BUTTON_DID_TAP);
        m.f(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public LoginButton(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0, AnalyticsEvents.EVENT_LOGIN_BUTTON_CREATE, AnalyticsEvents.EVENT_LOGIN_BUTTON_DID_TAP);
        m.f(context, "context");
    }
}
