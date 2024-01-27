package com.google.android.gms.internal.ads;

import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzgao extends TimeoutException {
    /* synthetic */ zzgao(String str, zzgan zzgan) {
        super(str);
    }

    public final synchronized Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
