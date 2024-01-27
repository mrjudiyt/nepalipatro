package com.facebook;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import com.facebook.common.R;
import com.facebook.internal.NativeProtocol;
import com.facebook.internal.Utility;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import com.facebook.internal.logging.dumpsys.EndToEndDumper;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;

/* compiled from: FacebookActivity.kt */
public class FacebookActivity extends e {
    public static final Companion Companion = new Companion((g) null);
    private static final String FRAGMENT_TAG = "SingleFragment";
    public static final String PASS_THROUGH_CANCEL_ACTION = "PassThrough";
    private static final String TAG = FacebookActivity.class.getName();
    private Fragment currentFragment;

    /* compiled from: FacebookActivity.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }
    }

    private final void handlePassThroughError() {
        Intent intent = getIntent();
        NativeProtocol nativeProtocol = NativeProtocol.INSTANCE;
        m.e(intent, "requestIntent");
        FacebookException exceptionFromErrorData = NativeProtocol.getExceptionFromErrorData(NativeProtocol.getMethodArgumentsFromIntent(intent));
        Intent intent2 = getIntent();
        m.e(intent2, "intent");
        setResult(0, NativeProtocol.createProtocolResultIntent(intent2, (Bundle) null, exceptionFromErrorData));
        finish();
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                m.f(str, "prefix");
                m.f(printWriter, "writer");
                EndToEndDumper instance = EndToEndDumper.Companion.getInstance();
                if (!m.a(instance == null ? null : Boolean.valueOf(instance.maybeDump(str, printWriter, strArr)), Boolean.TRUE)) {
                    super.dump(str, fileDescriptor, printWriter, strArr);
                }
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    public final Fragment getCurrentFragment() {
        return this.currentFragment;
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [androidx.fragment.app.d, com.facebook.internal.FacebookDialogFragment, androidx.fragment.app.Fragment] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public androidx.fragment.app.Fragment getFragment() {
        /*
            r4 = this;
            android.content.Intent r0 = r4.getIntent()
            androidx.fragment.app.n r1 = r4.getSupportFragmentManager()
            java.lang.String r2 = "supportFragmentManager"
            kotlin.jvm.internal.m.e(r1, r2)
            java.lang.String r2 = "SingleFragment"
            androidx.fragment.app.Fragment r3 = r1.i0(r2)
            if (r3 != 0) goto L_0x0044
            java.lang.String r0 = r0.getAction()
            java.lang.String r3 = "FacebookDialogFragment"
            boolean r0 = kotlin.jvm.internal.m.a(r3, r0)
            r3 = 1
            if (r0 == 0) goto L_0x002e
            com.facebook.internal.FacebookDialogFragment r0 = new com.facebook.internal.FacebookDialogFragment
            r0.<init>()
            r0.setRetainInstance(r3)
            r0.show((androidx.fragment.app.n) r1, (java.lang.String) r2)
            goto L_0x0043
        L_0x002e:
            com.facebook.login.LoginFragment r0 = new com.facebook.login.LoginFragment
            r0.<init>()
            r0.setRetainInstance(r3)
            androidx.fragment.app.w r1 = r1.m()
            int r3 = com.facebook.common.R.id.com_facebook_fragment_container
            androidx.fragment.app.w r1 = r1.b(r3, r0, r2)
            r1.f()
        L_0x0043:
            r3 = r0
        L_0x0044:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.FacebookActivity.getFragment():androidx.fragment.app.Fragment");
    }

    public void onConfigurationChanged(Configuration configuration) {
        m.f(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        Fragment fragment = this.currentFragment;
        if (fragment != null) {
            fragment.onConfigurationChanged(configuration);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
        if (!FacebookSdk.isInitialized()) {
            Utility utility = Utility.INSTANCE;
            Utility.logd(TAG, "Facebook SDK not initialized. Make sure you call sdkInitialize inside your Application's onCreate method.");
            Context applicationContext = getApplicationContext();
            m.e(applicationContext, "applicationContext");
            FacebookSdk.sdkInitialize(applicationContext);
        }
        setContentView(R.layout.com_facebook_activity_layout);
        if (m.a(PASS_THROUGH_CANCEL_ACTION, intent.getAction())) {
            handlePassThroughError();
        } else {
            this.currentFragment = getFragment();
        }
    }
}
