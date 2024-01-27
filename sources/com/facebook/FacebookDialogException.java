package com.facebook;

import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;

/* compiled from: FacebookDialogException.kt */
public final class FacebookDialogException extends FacebookException {
    public static final Companion Companion = new Companion((g) null);
    public static final long serialVersionUID = 1;
    private final int errorCode;
    private final String failingUrl;

    /* compiled from: FacebookDialogException.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }
    }

    public FacebookDialogException(String str, int i10, String str2) {
        super(str);
        this.errorCode = i10;
        this.failingUrl = str2;
    }

    public final int getErrorCode() {
        return this.errorCode;
    }

    public final String getFailingUrl() {
        return this.failingUrl;
    }

    public String toString() {
        String str = "{FacebookDialogException: " + "errorCode: " + this.errorCode + ", message: " + getMessage() + ", url: " + this.failingUrl + "}";
        m.e(str, "StringBuilder()\n        .append(\"{FacebookDialogException: \")\n        .append(\"errorCode: \")\n        .append(errorCode)\n        .append(\", message: \")\n        .append(message)\n        .append(\", url: \")\n        .append(failingUrl)\n        .append(\"}\")\n        .toString()");
        return str;
    }
}
