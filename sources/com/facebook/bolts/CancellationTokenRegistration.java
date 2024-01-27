package com.facebook.bolts;

import java.io.Closeable;
import kotlin.jvm.internal.m;
import o8.q;

/* compiled from: CancellationTokenRegistration.kt */
public final class CancellationTokenRegistration implements Closeable {
    private Runnable action;
    private boolean closed;
    private CancellationTokenSource tokenSource;

    public CancellationTokenRegistration(CancellationTokenSource cancellationTokenSource, Runnable runnable) {
        m.f(cancellationTokenSource, "tokenSource");
        this.action = runnable;
        this.tokenSource = cancellationTokenSource;
    }

    private final void throwIfClosed() {
        if (!(!this.closed)) {
            throw new IllegalStateException("Object already closed".toString());
        }
    }

    public void close() {
        synchronized (this) {
            if (!this.closed) {
                this.closed = true;
                CancellationTokenSource cancellationTokenSource = this.tokenSource;
                if (cancellationTokenSource != null) {
                    cancellationTokenSource.unregister$facebook_bolts_release(this);
                }
                this.tokenSource = null;
                this.action = null;
                q qVar = q.f16189a;
            }
        }
    }

    public final void runAction$facebook_bolts_release() {
        synchronized (this) {
            throwIfClosed();
            Runnable runnable = this.action;
            if (runnable != null) {
                runnable.run();
            }
            close();
            q qVar = q.f16189a;
        }
    }
}
