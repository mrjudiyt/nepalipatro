package i9;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import n9.d;
import r8.g;

/* compiled from: Executors.kt */
public final class l1 extends k1 implements v0 {

    /* renamed from: k  reason: collision with root package name */
    private final Executor f14957k;

    public l1(Executor executor) {
        this.f14957k = executor;
        d.a(O0());
    }

    private final void N0(g gVar, RejectedExecutionException rejectedExecutionException) {
        x1.c(gVar, j1.a("The task was rejected", rejectedExecutionException));
    }

    public void K0(g gVar, Runnable runnable) {
        try {
            Executor O0 = O0();
            c.a();
            O0.execute(runnable);
        } catch (RejectedExecutionException e10) {
            c.a();
            N0(gVar, e10);
            a1.b().K0(gVar, runnable);
        }
    }

    public Executor O0() {
        return this.f14957k;
    }

    public void close() {
        Executor O0 = O0();
        ExecutorService executorService = O0 instanceof ExecutorService ? (ExecutorService) O0 : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof l1) && ((l1) obj).O0() == O0();
    }

    public int hashCode() {
        return System.identityHashCode(O0());
    }

    public String toString() {
        return O0().toString();
    }
}
