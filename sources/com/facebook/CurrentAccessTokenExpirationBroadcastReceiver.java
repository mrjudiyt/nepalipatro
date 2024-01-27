package com.facebook;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import kotlin.jvm.internal.m;

/* compiled from: CurrentAccessTokenExpirationBroadcastReceiver.kt */
public final class CurrentAccessTokenExpirationBroadcastReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        m.f(context, "context");
        m.f(intent, "intent");
        if (m.a(AccessTokenManager.ACTION_CURRENT_ACCESS_TOKEN_CHANGED, intent.getAction())) {
            FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
            if (FacebookSdk.isInitialized()) {
                AccessTokenManager.Companion.getInstance().currentAccessTokenChanged();
            }
        }
    }
}
