package com.facebook.login;

import com.facebook.AccessToken;
import com.facebook.FacebookSdk;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;

/* compiled from: LoginTargetApp.kt */
public enum LoginTargetApp {
    FACEBOOK(AccessToken.DEFAULT_GRAPH_DOMAIN),
    INSTAGRAM(FacebookSdk.INSTAGRAM);
    
    public static final Companion Companion = null;
    private final String targetApp;

    /* compiled from: LoginTargetApp.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public final LoginTargetApp fromString(String str) {
            LoginTargetApp[] values = LoginTargetApp.values();
            int length = values.length;
            int i10 = 0;
            while (i10 < length) {
                LoginTargetApp loginTargetApp = values[i10];
                i10++;
                if (m.a(loginTargetApp.toString(), str)) {
                    return loginTargetApp;
                }
            }
            return LoginTargetApp.FACEBOOK;
        }
    }

    static {
        Companion = new Companion((g) null);
    }

    private LoginTargetApp(String str) {
        this.targetApp = str;
    }

    public static final LoginTargetApp fromString(String str) {
        return Companion.fromString(str);
    }

    public String toString() {
        return this.targetApp;
    }
}
