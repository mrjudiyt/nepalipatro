package com.facebook;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.internal.CustomTab;
import com.facebook.internal.InstagramCustomTab;
import com.facebook.internal.NativeProtocol;
import com.facebook.internal.Utility;
import com.facebook.login.LoginTargetApp;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;
import q0.a;

/* compiled from: CustomTabMainActivity.kt */
public final class CustomTabMainActivity extends Activity {
    public static final Companion Companion = new Companion((g) null);
    public static final String EXTRA_ACTION;
    public static final String EXTRA_CHROME_PACKAGE;
    public static final String EXTRA_PARAMS;
    public static final String EXTRA_TARGET_APP;
    public static final String EXTRA_URL;
    public static final String NO_ACTIVITY_EXCEPTION;
    public static final String REFRESH_ACTION;
    private BroadcastReceiver redirectReceiver;
    private boolean shouldCloseCustomTab = true;

    /* compiled from: CustomTabMainActivity.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        /* access modifiers changed from: private */
        public final Bundle parseResponseUri(String str) {
            Uri parse = Uri.parse(str);
            Utility utility = Utility.INSTANCE;
            Bundle parseUrlQueryString = Utility.parseUrlQueryString(parse.getQuery());
            parseUrlQueryString.putAll(Utility.parseUrlQueryString(parse.getFragment()));
            return parseUrlQueryString;
        }
    }

    /* compiled from: CustomTabMainActivity.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LoginTargetApp.values().length];
            iArr[LoginTargetApp.INSTAGRAM.ordinal()] = 1;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        Class<CustomTabMainActivity> cls = CustomTabMainActivity.class;
        EXTRA_ACTION = m.o(cls.getSimpleName(), ".extra_action");
        EXTRA_PARAMS = m.o(cls.getSimpleName(), ".extra_params");
        EXTRA_CHROME_PACKAGE = m.o(cls.getSimpleName(), ".extra_chromePackage");
        EXTRA_URL = m.o(cls.getSimpleName(), ".extra_url");
        EXTRA_TARGET_APP = m.o(cls.getSimpleName(), ".extra_targetApp");
        REFRESH_ACTION = m.o(cls.getSimpleName(), ".action_refresh");
        NO_ACTIVITY_EXCEPTION = m.o(cls.getSimpleName(), ".no_activity_exception");
    }

    private final void sendResult(int i10, Intent intent) {
        BroadcastReceiver broadcastReceiver = this.redirectReceiver;
        if (broadcastReceiver != null) {
            a.b(this).e(broadcastReceiver);
        }
        if (intent != null) {
            String stringExtra = intent.getStringExtra(EXTRA_URL);
            Bundle access$parseResponseUri = stringExtra != null ? Companion.parseResponseUri(stringExtra) : new Bundle();
            NativeProtocol nativeProtocol = NativeProtocol.INSTANCE;
            Intent intent2 = getIntent();
            m.e(intent2, "intent");
            Intent createProtocolResultIntent = NativeProtocol.createProtocolResultIntent(intent2, access$parseResponseUri, (FacebookException) null);
            if (createProtocolResultIntent != null) {
                intent = createProtocolResultIntent;
            }
            setResult(i10, intent);
        } else {
            NativeProtocol nativeProtocol2 = NativeProtocol.INSTANCE;
            Intent intent3 = getIntent();
            m.e(intent3, "intent");
            setResult(i10, NativeProtocol.createProtocolResultIntent(intent3, (Bundle) null, (FacebookException) null));
        }
        finish();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        String stringExtra;
        CustomTab customTab;
        super.onCreate(bundle);
        String str = CustomTabActivity.CUSTOM_TAB_REDIRECT_ACTION;
        if (m.a(str, getIntent().getAction())) {
            setResult(0);
            finish();
        } else if (bundle == null && (stringExtra = getIntent().getStringExtra(EXTRA_ACTION)) != null) {
            Bundle bundleExtra = getIntent().getBundleExtra(EXTRA_PARAMS);
            String stringExtra2 = getIntent().getStringExtra(EXTRA_CHROME_PACKAGE);
            if (WhenMappings.$EnumSwitchMapping$0[LoginTargetApp.Companion.fromString(getIntent().getStringExtra(EXTRA_TARGET_APP)).ordinal()] == 1) {
                customTab = new InstagramCustomTab(stringExtra, bundleExtra);
            } else {
                customTab = new CustomTab(stringExtra, bundleExtra);
            }
            boolean openCustomTab = customTab.openCustomTab(this, stringExtra2);
            this.shouldCloseCustomTab = false;
            if (!openCustomTab) {
                setResult(0, getIntent().putExtra(NO_ACTIVITY_EXCEPTION, true));
                finish();
                return;
            }
            CustomTabMainActivity$onCreate$redirectReceiver$1 customTabMainActivity$onCreate$redirectReceiver$1 = new CustomTabMainActivity$onCreate$redirectReceiver$1(this);
            this.redirectReceiver = customTabMainActivity$onCreate$redirectReceiver$1;
            a.b(this).c(customTabMainActivity$onCreate$redirectReceiver$1, new IntentFilter(str));
        }
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        m.f(intent, "intent");
        super.onNewIntent(intent);
        if (m.a(REFRESH_ACTION, intent.getAction())) {
            a.b(this).d(new Intent(CustomTabActivity.DESTROY_ACTION));
            sendResult(-1, intent);
        } else if (m.a(CustomTabActivity.CUSTOM_TAB_REDIRECT_ACTION, intent.getAction())) {
            sendResult(-1, intent);
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        if (this.shouldCloseCustomTab) {
            sendResult(0, (Intent) null);
        }
        this.shouldCloseCustomTab = true;
    }
}
