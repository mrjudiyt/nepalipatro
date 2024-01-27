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

/* compiled from: AuthenticationTokenTracker.kt */
public abstract class AuthenticationTokenTracker {
    public static final Companion Companion = new Companion((g) null);
    /* access modifiers changed from: private */
    public static final String TAG = AuthenticationTokenTracker.class.getSimpleName();
    private final a broadcastManager;
    private boolean isTracking;
    private final BroadcastReceiver receiver = new CurrentAuthenticationTokenBroadcastReceiver(this);

    /* compiled from: AuthenticationTokenTracker.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }
    }

    /* compiled from: AuthenticationTokenTracker.kt */
    private final class CurrentAuthenticationTokenBroadcastReceiver extends BroadcastReceiver {
        final /* synthetic */ AuthenticationTokenTracker this$0;

        public CurrentAuthenticationTokenBroadcastReceiver(AuthenticationTokenTracker authenticationTokenTracker) {
            m.f(authenticationTokenTracker, "this$0");
            this.this$0 = authenticationTokenTracker;
        }

        public void onReceive(Context context, Intent intent) {
            m.f(context, "context");
            m.f(intent, "intent");
            if (m.a(AuthenticationTokenManager.ACTION_CURRENT_AUTHENTICATION_TOKEN_CHANGED, intent.getAction())) {
                Utility utility = Utility.INSTANCE;
                Utility.logd(AuthenticationTokenTracker.TAG, "AuthenticationTokenChanged");
                this.this$0.onCurrentAuthenticationTokenChanged((AuthenticationToken) intent.getParcelableExtra(AuthenticationTokenManager.EXTRA_OLD_AUTHENTICATION_TOKEN), (AuthenticationToken) intent.getParcelableExtra(AuthenticationTokenManager.EXTRA_NEW_AUTHENTICATION_TOKEN));
            }
        }
    }

    public AuthenticationTokenTracker() {
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
        intentFilter.addAction(AuthenticationTokenManager.ACTION_CURRENT_AUTHENTICATION_TOKEN_CHANGED);
        this.broadcastManager.c(this.receiver, intentFilter);
    }

    public final boolean isTracking() {
        return this.isTracking;
    }

    /* access modifiers changed from: protected */
    public abstract void onCurrentAuthenticationTokenChanged(AuthenticationToken authenticationToken, AuthenticationToken authenticationToken2);

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
