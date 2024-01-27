package i9;

import java.util.concurrent.Executor;

/* compiled from: Executors.kt */
public final class m1 {
    public static final g0 a(Executor executor) {
        g0 g0Var;
        z0 z0Var = executor instanceof z0 ? (z0) executor : null;
        return (z0Var == null || (g0Var = z0Var.f15007h) == null) ? new l1(executor) : g0Var;
    }
}
