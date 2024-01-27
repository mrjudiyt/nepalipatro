package com.facebook.login;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.a;
import androidx.activity.result.c;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import androidx.lifecycle.f;
import com.facebook.common.R;
import com.facebook.login.LoginClient;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;
import o8.q;
import y8.l;

/* compiled from: LoginFragment.kt */
public class LoginFragment extends Fragment {
    public static final Companion Companion = new Companion((g) null);
    public static final String EXTRA_REQUEST = "request";
    private static final String NULL_CALLING_PKG_ERROR_MSG = "Cannot call LoginFragment with a null calling package. This can occur if the launchMode of the caller is singleInstance.";
    public static final String REQUEST_KEY = "com.facebook.LoginFragment:Request";
    public static final String RESULT_KEY = "com.facebook.LoginFragment:Result";
    private static final String SAVED_LOGIN_CLIENT = "loginClient";
    private static final String TAG = "LoginFragment";
    private String callingPackage;
    private c<Intent> launcher;
    private LoginClient loginClient;
    private View progressBar;
    private LoginClient.Request request;

    /* compiled from: LoginFragment.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }
    }

    private final l<a, q> getLoginMethodHandlerCallback(e eVar) {
        return new LoginFragment$getLoginMethodHandlerCallback$1(this, eVar);
    }

    /* access modifiers changed from: private */
    public final void hideSpinner() {
        View view = this.progressBar;
        if (view != null) {
            view.setVisibility(8);
            onSpinnerHidden();
            return;
        }
        m.x("progressBar");
        throw null;
    }

    private final void initializeCallingPackage(Activity activity) {
        ComponentName callingActivity = activity.getCallingActivity();
        if (callingActivity != null) {
            this.callingPackage = callingActivity.getPackageName();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: onCreate$lambda-0  reason: not valid java name */
    public static final void m138onCreate$lambda0(LoginFragment loginFragment, LoginClient.Result result) {
        m.f(loginFragment, "this$0");
        m.f(result, "outcome");
        loginFragment.onLoginClientCompleted(result);
    }

    /* access modifiers changed from: private */
    /* renamed from: onCreate$lambda-1  reason: not valid java name */
    public static final void m139onCreate$lambda1(l lVar, a aVar) {
        m.f(lVar, "$tmp0");
        lVar.invoke(aVar);
    }

    private final void onLoginClientCompleted(LoginClient.Result result) {
        this.request = null;
        int i10 = result.code == LoginClient.Result.Code.CANCEL ? 0 : -1;
        Bundle bundle = new Bundle();
        bundle.putParcelable(RESULT_KEY, result);
        Intent intent = new Intent();
        intent.putExtras(bundle);
        e activity = getActivity();
        if (isAdded() && activity != null) {
            activity.setResult(i10, intent);
            activity.finish();
        }
    }

    /* access modifiers changed from: private */
    public final void showSpinner() {
        View view = this.progressBar;
        if (view != null) {
            view.setVisibility(0);
            onSpinnerShown();
            return;
        }
        m.x("progressBar");
        throw null;
    }

    /* access modifiers changed from: protected */
    public LoginClient createLoginClient() {
        return new LoginClient((Fragment) this);
    }

    public /* bridge */ /* synthetic */ p0.a getDefaultViewModelCreationExtras() {
        return f.a(this);
    }

    public final c<Intent> getLauncher() {
        c<Intent> cVar = this.launcher;
        if (cVar != null) {
            return cVar;
        }
        m.x("launcher");
        throw null;
    }

    /* access modifiers changed from: protected */
    public int getLayoutResId() {
        return R.layout.com_facebook_login_fragment;
    }

    public final LoginClient getLoginClient() {
        LoginClient loginClient2 = this.loginClient;
        if (loginClient2 != null) {
            return loginClient2;
        }
        m.x(SAVED_LOGIN_CLIENT);
        throw null;
    }

    public void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        getLoginClient().onActivityResult(i10, i11, intent);
    }

    public void onCreate(Bundle bundle) {
        LoginClient loginClient2;
        Bundle bundleExtra;
        super.onCreate(bundle);
        if (bundle == null) {
            loginClient2 = null;
        } else {
            loginClient2 = (LoginClient) bundle.getParcelable(SAVED_LOGIN_CLIENT);
        }
        if (loginClient2 != null) {
            loginClient2.setFragment(this);
        } else {
            loginClient2 = createLoginClient();
        }
        this.loginClient = loginClient2;
        getLoginClient().setOnCompletedListener(new k(this));
        e activity = getActivity();
        if (activity != null) {
            initializeCallingPackage(activity);
            Intent intent = activity.getIntent();
            if (!(intent == null || (bundleExtra = intent.getBundleExtra(REQUEST_KEY)) == null)) {
                this.request = (LoginClient.Request) bundleExtra.getParcelable("request");
            }
            c<Intent> registerForActivityResult = registerForActivityResult(new e.c(), new j(getLoginMethodHandlerCallback(activity)));
            m.e(registerForActivityResult, "registerForActivityResult(\n            ActivityResultContracts.StartActivityForResult(),\n            getLoginMethodHandlerCallback(activity))");
            this.launcher = registerForActivityResult;
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        m.f(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(getLayoutResId(), viewGroup, false);
        View findViewById = inflate.findViewById(R.id.com_facebook_login_fragment_progress_bar);
        m.e(findViewById, "view.findViewById<View>(R.id.com_facebook_login_fragment_progress_bar)");
        this.progressBar = findViewById;
        getLoginClient().setBackgroundProcessingListener(new LoginFragment$onCreateView$1(this));
        return inflate;
    }

    public void onDestroy() {
        getLoginClient().cancelCurrentHandler();
        super.onDestroy();
    }

    public void onPause() {
        super.onPause();
        View view = getView();
        View findViewById = view == null ? null : view.findViewById(R.id.com_facebook_login_fragment_progress_bar);
        if (findViewById != null) {
            findViewById.setVisibility(8);
        }
    }

    public void onResume() {
        super.onResume();
        if (this.callingPackage == null) {
            e activity = getActivity();
            if (activity != null) {
                activity.finish();
                return;
            }
            return;
        }
        getLoginClient().startOrContinueAuth(this.request);
    }

    public void onSaveInstanceState(Bundle bundle) {
        m.f(bundle, "outState");
        super.onSaveInstanceState(bundle);
        bundle.putParcelable(SAVED_LOGIN_CLIENT, getLoginClient());
    }

    /* access modifiers changed from: protected */
    public void onSpinnerHidden() {
    }

    /* access modifiers changed from: protected */
    public void onSpinnerShown() {
    }
}
