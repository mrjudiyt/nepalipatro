package com.facebook.bolts;

import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.m;

/* compiled from: CancellationToken.kt */
public final class CancellationToken {
    private final CancellationTokenSource tokenSource;

    public CancellationToken(CancellationTokenSource cancellationTokenSource) {
        m.f(cancellationTokenSource, "tokenSource");
        this.tokenSource = cancellationTokenSource;
    }

    public final boolean isCancellationRequested() {
        return this.tokenSource.isCancellationRequested();
    }

    public final CancellationTokenRegistration register(Runnable runnable) {
        return this.tokenSource.register$facebook_bolts_release(runnable);
    }

    public final void throwIfCancellationRequested() {
        this.tokenSource.throwIfCancellationRequested$facebook_bolts_release();
    }

    public String toString() {
        b0 b0Var = b0.f15559a;
        String format = String.format(Locale.US, "%s@%s[cancellationRequested=%s]", Arrays.copyOf(new Object[]{CancellationToken.class.getName(), Integer.toHexString(hashCode()), Boolean.toString(this.tokenSource.isCancellationRequested())}, 3));
        m.e(format, "java.lang.String.format(locale, format, *args)");
        return format;
    }
}
