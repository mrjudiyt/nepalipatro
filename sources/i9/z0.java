package i9;

import java.util.concurrent.Executor;
import r8.h;

/* compiled from: Executors.kt */
final class z0 implements Executor {

    /* renamed from: h  reason: collision with root package name */
    public final g0 f15007h;

    public void execute(Runnable runnable) {
        g0 g0Var = this.f15007h;
        h hVar = h.f16410h;
        if (g0Var.L0(hVar)) {
            this.f15007h.K0(hVar, runnable);
        } else {
            runnable.run();
        }
    }

    public String toString() {
        return this.f15007h.toString();
    }
}
