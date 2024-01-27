package com.facebook;

import kotlin.jvm.internal.g;

/* compiled from: FacebookAuthorizationException.kt */
public final class FacebookAuthorizationException extends FacebookException {
    public static final Companion Companion = new Companion((g) null);
    public static final long serialVersionUID = 1;

    /* compiled from: FacebookAuthorizationException.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }
    }

    public FacebookAuthorizationException() {
    }

    public FacebookAuthorizationException(String str) {
        super(str);
    }

    public FacebookAuthorizationException(String str, Throwable th) {
        super(str, th);
    }

    public FacebookAuthorizationException(Throwable th) {
        super(th);
    }
}
