package i9;

import i9.f1;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import kotlin.jvm.internal.m;

/* compiled from: DefaultExecutor.kt */
public final class r0 extends f1 implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* renamed from: p  reason: collision with root package name */
    public static final r0 f14983p;

    /* renamed from: q  reason: collision with root package name */
    private static final long f14984q;

    static {
        Long l10;
        r0 r0Var = new r0();
        f14983p = r0Var;
        e1.T0(r0Var, false, 1, (Object) null);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l10 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000);
        } catch (SecurityException unused) {
            l10 = 1000L;
        }
        f14984q = timeUnit.toNanos(l10.longValue());
    }

    private r0() {
    }

    private final synchronized void p1() {
        if (s1()) {
            debugStatus = 3;
            k1();
            m.d(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
        }
    }

    private final synchronized Thread q1() {
        Thread thread;
        thread = _thread;
        if (thread == null) {
            thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
            _thread = thread;
            thread.setDaemon(true);
            thread.start();
        }
        return thread;
    }

    private final boolean r1() {
        return debugStatus == 4;
    }

    private final boolean s1() {
        int i10 = debugStatus;
        return i10 == 2 || i10 == 3;
    }

    private final synchronized boolean t1() {
        if (s1()) {
            return false;
        }
        debugStatus = 1;
        m.d(this, "null cannot be cast to non-null type java.lang.Object");
        notifyAll();
        return true;
    }

    private final void u1() {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    /* access modifiers changed from: protected */
    public Thread Z0() {
        Thread thread = _thread;
        return thread == null ? q1() : thread;
    }

    /* access modifiers changed from: protected */
    public void a1(long j10, f1.a aVar) {
        u1();
    }

    public void f1(Runnable runnable) {
        if (r1()) {
            u1();
        }
        super.f1(runnable);
    }

    public void run() {
        o2.f14972a.d(this);
        c.a();
        try {
            if (t1()) {
                long j10 = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long W0 = W0();
                    if (W0 == Long.MAX_VALUE) {
                        c.a();
                        long nanoTime = System.nanoTime();
                        if (j10 == Long.MAX_VALUE) {
                            j10 = f14984q + nanoTime;
                        }
                        long j11 = j10 - nanoTime;
                        if (j11 <= 0) {
                            _thread = null;
                            p1();
                            c.a();
                            if (!i1()) {
                                Z0();
                                return;
                            }
                            return;
                        }
                        W0 = l.d(W0, j11);
                    } else {
                        j10 = Long.MAX_VALUE;
                    }
                    if (W0 > 0) {
                        if (s1()) {
                            _thread = null;
                            p1();
                            c.a();
                            if (!i1()) {
                                Z0();
                                return;
                            }
                            return;
                        }
                        c.a();
                        LockSupport.parkNanos(this, W0);
                    }
                }
            }
        } finally {
            _thread = null;
            p1();
            c.a();
            if (!i1()) {
                Z0();
            }
        }
    }

    public void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }
}
