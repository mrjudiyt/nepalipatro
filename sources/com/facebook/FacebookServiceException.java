package com.facebook;

import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;

/* compiled from: FacebookServiceException.kt */
public final class FacebookServiceException extends FacebookException {
    public static final Companion Companion = new Companion((g) null);
    private static final long serialVersionUID = 1;
    private final FacebookRequestError requestError;

    /* compiled from: FacebookServiceException.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FacebookServiceException(FacebookRequestError facebookRequestError, String str) {
        super(str);
        m.f(facebookRequestError, "requestError");
        this.requestError = facebookRequestError;
    }

    public final FacebookRequestError getRequestError() {
        return this.requestError;
    }

    public String toString() {
        String str = "{FacebookServiceException: " + "httpResponseCode: " + this.requestError.getRequestStatusCode() + ", facebookErrorCode: " + this.requestError.getErrorCode() + ", facebookErrorType: " + this.requestError.getErrorType() + ", message: " + this.requestError.getErrorMessage() + "}";
        m.e(str, "StringBuilder()\n        .append(\"{FacebookServiceException: \")\n        .append(\"httpResponseCode: \")\n        .append(requestError.requestStatusCode)\n        .append(\", facebookErrorCode: \")\n        .append(requestError.errorCode)\n        .append(\", facebookErrorType: \")\n        .append(requestError.errorType)\n        .append(\", message: \")\n        .append(requestError.errorMessage)\n        .append(\"}\")\n        .toString()");
        return str;
    }
}
