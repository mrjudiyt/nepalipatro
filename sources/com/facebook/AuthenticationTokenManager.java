package com.facebook;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.facebook.internal.Utility;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;
import q0.a;

/* compiled from: AuthenticationTokenManager.kt */
public final class AuthenticationTokenManager {
    public static final String ACTION_CURRENT_AUTHENTICATION_TOKEN_CHANGED = "com.facebook.sdk.ACTION_CURRENT_AUTHENTICATION_TOKEN_CHANGED";
    public static final Companion Companion = new Companion((g) null);
    public static final String EXTRA_NEW_AUTHENTICATION_TOKEN = "com.facebook.sdk.EXTRA_NEW_AUTHENTICATION_TOKEN";
    public static final String EXTRA_OLD_AUTHENTICATION_TOKEN = "com.facebook.sdk.EXTRA_OLD_AUTHENTICATION_TOKEN";
    public static final String SHARED_PREFERENCES_NAME = "com.facebook.AuthenticationTokenManager.SharedPreferences";
    public static final String TAG = "AuthenticationTokenManager";
    /* access modifiers changed from: private */
    public static AuthenticationTokenManager instanceField;
    private final AuthenticationTokenCache authenticationTokenCache;
    private AuthenticationToken currentAuthenticationTokenField;
    private final a localBroadcastManager;

    /* compiled from: AuthenticationTokenManager.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public final AuthenticationTokenManager getInstance() {
            AuthenticationTokenManager access$getInstanceField$cp;
            AuthenticationTokenManager access$getInstanceField$cp2 = AuthenticationTokenManager.instanceField;
            if (access$getInstanceField$cp2 != null) {
                return access$getInstanceField$cp2;
            }
            synchronized (this) {
                access$getInstanceField$cp = AuthenticationTokenManager.instanceField;
                if (access$getInstanceField$cp == null) {
                    FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
                    a b10 = a.b(FacebookSdk.getApplicationContext());
                    m.e(b10, "getInstance(applicationContext)");
                    AuthenticationTokenManager authenticationTokenManager = new AuthenticationTokenManager(b10, new AuthenticationTokenCache());
                    Companion companion = AuthenticationTokenManager.Companion;
                    AuthenticationTokenManager.instanceField = authenticationTokenManager;
                    access$getInstanceField$cp = authenticationTokenManager;
                }
            }
            return access$getInstanceField$cp;
        }
    }

    /* compiled from: AuthenticationTokenManager.kt */
    public static final class CurrentAuthenticationTokenChangedBroadcastReceiver extends BroadcastReceiver {
        public void onReceive(Context context, Intent intent) {
            m.f(context, "context");
            m.f(intent, "intent");
        }
    }

    public AuthenticationTokenManager(a aVar, AuthenticationTokenCache authenticationTokenCache2) {
        m.f(aVar, "localBroadcastManager");
        m.f(authenticationTokenCache2, "authenticationTokenCache");
        this.localBroadcastManager = aVar;
        this.authenticationTokenCache = authenticationTokenCache2;
    }

    public static final AuthenticationTokenManager getInstance() {
        return Companion.getInstance();
    }

    private final void sendCurrentAuthenticationTokenChangedBroadcastIntent(AuthenticationToken authenticationToken, AuthenticationToken authenticationToken2) {
        FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
        Intent intent = new Intent(FacebookSdk.getApplicationContext(), CurrentAuthenticationTokenChangedBroadcastReceiver.class);
        intent.setAction(ACTION_CURRENT_AUTHENTICATION_TOKEN_CHANGED);
        intent.putExtra(EXTRA_OLD_AUTHENTICATION_TOKEN, authenticationToken);
        intent.putExtra(EXTRA_NEW_AUTHENTICATION_TOKEN, authenticationToken2);
        this.localBroadcastManager.d(intent);
    }

    public final void currentAuthenticationTokenChanged() {
        sendCurrentAuthenticationTokenChangedBroadcastIntent(getCurrentAuthenticationToken(), getCurrentAuthenticationToken());
    }

    public final AuthenticationToken getCurrentAuthenticationToken() {
        return this.currentAuthenticationTokenField;
    }

    public final boolean loadCurrentAuthenticationToken() {
        AuthenticationToken load = this.authenticationTokenCache.load();
        if (load == null) {
            return false;
        }
        setCurrentAuthenticationToken(load, false);
        return true;
    }

    public final void setCurrentAuthenticationToken(AuthenticationToken authenticationToken) {
        setCurrentAuthenticationToken(authenticationToken, true);
    }

    private final void setCurrentAuthenticationToken(AuthenticationToken authenticationToken, boolean z10) {
        AuthenticationToken currentAuthenticationToken = getCurrentAuthenticationToken();
        this.currentAuthenticationTokenField = authenticationToken;
        if (z10) {
            if (authenticationToken != null) {
                this.authenticationTokenCache.save(authenticationToken);
            } else {
                this.authenticationTokenCache.clear();
                Utility utility = Utility.INSTANCE;
                FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
                Utility.clearFacebookCookies(FacebookSdk.getApplicationContext());
            }
        }
        Utility utility2 = Utility.INSTANCE;
        if (!Utility.areObjectsEqual(currentAuthenticationToken, authenticationToken)) {
            sendCurrentAuthenticationTokenChangedBroadcastIntent(currentAuthenticationToken, authenticationToken);
        }
    }
}
