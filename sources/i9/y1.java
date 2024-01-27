package i9;

import java.util.concurrent.CancellationException;
import r8.g;

/* compiled from: Job.kt */
final /* synthetic */ class y1 {
    public static final x a(u1 u1Var) {
        return new w1(u1Var);
    }

    public static /* synthetic */ x b(u1 u1Var, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            u1Var = null;
        }
        return x1.a(u1Var);
    }

    public static final void c(g gVar, CancellationException cancellationException) {
        u1 u1Var = (u1) gVar.h(u1.f14995d);
        if (u1Var != null) {
            u1Var.j(cancellationException);
        }
    }

    public static /* synthetic */ void d(g gVar, CancellationException cancellationException, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            cancellationException = null;
        }
        x1.c(gVar, cancellationException);
    }

    public static final void e(u1 u1Var) {
        if (!u1Var.a()) {
            throw u1Var.L();
        }
    }

    public static final void f(g gVar) {
        u1 u1Var = (u1) gVar.h(u1.f14995d);
        if (u1Var != null) {
            x1.e(u1Var);
        }
    }
}
