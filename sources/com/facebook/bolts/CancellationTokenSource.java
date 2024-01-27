package com.facebook.bolts;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.m;
import o8.q;

/* compiled from: CancellationTokenSource.kt */
public final class CancellationTokenSource implements Closeable {
    private boolean cancellationRequested;
    private boolean closed;
    private final ScheduledExecutorService executor = BoltsExecutors.Companion.scheduled$facebook_bolts_release();
    private final Object lock = new Object();
    private final List<CancellationTokenRegistration> registrations = new ArrayList();
    private ScheduledFuture<?> scheduledCancellation;

    /* access modifiers changed from: private */
    /* renamed from: cancelAfter$lambda-6$lambda-5  reason: not valid java name */
    public static final void m75cancelAfter$lambda6$lambda5(CancellationTokenSource cancellationTokenSource) {
        m.f(cancellationTokenSource, "this$0");
        synchronized (cancellationTokenSource.lock) {
            cancellationTokenSource.scheduledCancellation = null;
            q qVar = q.f16189a;
        }
        cancellationTokenSource.cancel();
    }

    private final void cancelScheduledCancellation() {
        ScheduledFuture<?> scheduledFuture = this.scheduledCancellation;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.scheduledCancellation = null;
        }
    }

    private final void notifyListeners(List<CancellationTokenRegistration> list) {
        for (CancellationTokenRegistration runAction$facebook_bolts_release : list) {
            runAction$facebook_bolts_release.runAction$facebook_bolts_release();
        }
    }

    private final void throwIfClosed() {
        if (!(!this.closed)) {
            throw new IllegalStateException("Object already closed".toString());
        }
    }

    public final void cancel() {
        synchronized (this.lock) {
            throwIfClosed();
            if (!this.cancellationRequested) {
                cancelScheduledCancellation();
                this.cancellationRequested = true;
                ArrayList arrayList = new ArrayList(this.registrations);
                q qVar = q.f16189a;
                notifyListeners(arrayList);
            }
        }
    }

    public final void cancelAfter(long j10) {
        cancelAfter(j10, TimeUnit.MILLISECONDS);
    }

    public void close() {
        synchronized (this.lock) {
            if (!this.closed) {
                cancelScheduledCancellation();
                for (CancellationTokenRegistration close : this.registrations) {
                    close.close();
                }
                this.registrations.clear();
                this.closed = true;
                q qVar = q.f16189a;
            }
        }
    }

    public final CancellationToken getToken() {
        CancellationToken cancellationToken;
        synchronized (this.lock) {
            throwIfClosed();
            cancellationToken = new CancellationToken(this);
        }
        return cancellationToken;
    }

    public final boolean isCancellationRequested() {
        boolean z10;
        synchronized (this.lock) {
            throwIfClosed();
            z10 = this.cancellationRequested;
        }
        return z10;
    }

    public final CancellationTokenRegistration register$facebook_bolts_release(Runnable runnable) {
        CancellationTokenRegistration cancellationTokenRegistration;
        synchronized (this.lock) {
            throwIfClosed();
            cancellationTokenRegistration = new CancellationTokenRegistration(this, runnable);
            if (this.cancellationRequested) {
                cancellationTokenRegistration.runAction$facebook_bolts_release();
                q qVar = q.f16189a;
            } else {
                this.registrations.add(cancellationTokenRegistration);
            }
        }
        return cancellationTokenRegistration;
    }

    public final void throwIfCancellationRequested$facebook_bolts_release() {
        synchronized (this.lock) {
            throwIfClosed();
            if (!this.cancellationRequested) {
                q qVar = q.f16189a;
            } else {
                throw new CancellationException();
            }
        }
    }

    public String toString() {
        b0 b0Var = b0.f15559a;
        String format = String.format(Locale.US, "%s@%s[cancellationRequested=%s]", Arrays.copyOf(new Object[]{CancellationTokenSource.class.getName(), Integer.toHexString(hashCode()), Boolean.toString(isCancellationRequested())}, 3));
        m.e(format, "java.lang.String.format(locale, format, *args)");
        return format;
    }

    public final void unregister$facebook_bolts_release(CancellationTokenRegistration cancellationTokenRegistration) {
        m.f(cancellationTokenRegistration, "registration");
        synchronized (this.lock) {
            throwIfClosed();
            this.registrations.remove(cancellationTokenRegistration);
        }
    }

    private final void cancelAfter(long j10, TimeUnit timeUnit) {
        int i10 = (j10 > -1 ? 1 : (j10 == -1 ? 0 : -1));
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException("Delay must be >= -1".toString());
        } else if (j10 == 0) {
            cancel();
        } else {
            synchronized (this.lock) {
                if (!this.cancellationRequested) {
                    cancelScheduledCancellation();
                    if (i10 != 0) {
                        this.scheduledCancellation = this.executor.schedule(new a(this), j10, timeUnit);
                    }
                    q qVar = q.f16189a;
                }
            }
        }
    }
}
