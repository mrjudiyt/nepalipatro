package com.facebook;

import kotlin.jvm.internal.g;

/* compiled from: FacebookOperationCanceledException.kt */
public final class FacebookOperationCanceledException extends FacebookException {
    public static final Companion Companion = new Companion((g) null);
    public static final long serialVersionUID = 1;

    /* compiled from: FacebookOperationCanceledException.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }
    }

    public FacebookOperationCanceledException() {
    }

    public FacebookOperationCanceledException(String str) {
        super(str);
    }

    public FacebookOperationCanceledException(String str, Throwable th) {
        super(str, th);
    }

    public FacebookOperationCanceledException(Throwable th) {
        super(th);
    }
}
