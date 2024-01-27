package com.facebook;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.facebook.internal.Utility;
import com.facebook.internal.Validate;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;
import q0.a;

/* compiled from: AccessTokenTracker.kt */
public abstract class AccessTokenTracker {
    public static final Companion Companion = new Companion((g) null);
    /* access modifiers changed from: private */
    public static final String TAG = AccessTokenTracker.class.getSimpleName();
    private final a broadcastManager;
    private boolean isTracking;
    private final BroadcastReceiver receiver = new CurrentAccessTokenBroadcastReceiver(this);

    /* compiled from: AccessTokenTracker.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }
    }

    /* compiled from: AccessTokenTracker.kt */
    private final class CurrentAccessTokenBroadcastReceiver extends BroadcastReceiver {
        final /* synthetic */ AccessTokenTracker this$0;

        public CurrentAccessTokenBroadcastReceiver(AccessTokenTracker accessTokenTracker) {
            m.f(accessTokenTracker, "this$0");
            this.this$0 = accessTokenTracker;
        }

        public void onReceive(Context context, Intent intent) {
            m.f(context, "context");
            m.f(intent, "intent");
            if (m.a(AccessTokenManager.ACTION_CURRENT_ACCESS_TOKEN_CHANGED, intent.getAction())) {
                Utility utility = Utility.INSTANCE;
                Utility.logd(AccessTokenTracker.TAG, "AccessTokenChanged");
                this.this$0.onCurrentAccessTokenChanged((AccessToken) intent.getParcelableExtra(AccessTokenManager.EXTRA_OLD_ACCESS_TOKEN), (AccessToken) intent.getParcelableExtra(AccessTokenManager.EXTRA_NEW_ACCESS_TOKEN));
            }
        }
    }

    public AccessTokenTracker() {
        Validate validate = Validate.INSTANCE;
        Validate.sdkInitialized();
        FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
        a b10 = a.b(FacebookSdk.getApplicationContext());
        m.e(b10, "getInstance(FacebookSdk.getApplicationContext())");
        this.broadcastManager = b10;
        startTracking();
    }

    private final void addBroadcastReceiver() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(AccessTokenManager.ACTION_CURRENT_ACCESS_TOKEN_CHANGED);
        this.broadcastManager.c(this.receiver, intentFilter);
    }

    public final boolean isTracking() {
        return this.isTracking;
    }

    /* access modifiers changed from: protected */
    public abstract void onCurrentAccessTokenChanged(AccessToken accessToken, AccessToken accessToken2);

    public final void startTracking() {
        if (!this.isTracking) {
            addBroadcastReceiver();
            this.isTracking = true;
        }
    }

    public final void stopTracking() {
        if (this.isTracking) {
            this.broadcastManager.e(this.receiver);
            this.isTracking = false;
        }
    }
}
