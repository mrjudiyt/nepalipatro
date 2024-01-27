package com.facebook;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.bolts.AppLinks;
import com.facebook.internal.NativeProtocol;
import kotlin.jvm.internal.m;

/* compiled from: FacebookBroadcastReceiver.kt */
public class FacebookBroadcastReceiver extends BroadcastReceiver {
    /* access modifiers changed from: protected */
    public void onFailedAppCall(String str, String str2, Bundle bundle) {
        m.f(str, "appCallId");
        m.f(str2, NativeProtocol.WEB_DIALOG_ACTION);
        m.f(bundle, AppLinks.KEY_NAME_EXTRAS);
    }

    public void onReceive(Context context, Intent intent) {
        m.f(context, "context");
        m.f(intent, "intent");
        String stringExtra = intent.getStringExtra(NativeProtocol.EXTRA_PROTOCOL_CALL_ID);
        String stringExtra2 = intent.getStringExtra(NativeProtocol.EXTRA_PROTOCOL_ACTION);
        Bundle extras = intent.getExtras();
        if (stringExtra != null && stringExtra2 != null && extras != null) {
            NativeProtocol nativeProtocol = NativeProtocol.INSTANCE;
            if (NativeProtocol.isErrorResult(intent)) {
                onFailedAppCall(stringExtra, stringExtra2, extras);
            } else {
                onSuccessfulAppCall(stringExtra, stringExtra2, extras);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onSuccessfulAppCall(String str, String str2, Bundle bundle) {
        m.f(str, "appCallId");
        m.f(str2, NativeProtocol.WEB_DIALOG_ACTION);
        m.f(bundle, AppLinks.KEY_NAME_EXTRAS);
    }
}
