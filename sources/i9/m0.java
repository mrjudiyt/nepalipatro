package i9;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.h;
import n9.f0;
import o9.b;
import r8.d;
import r8.g;
import y8.p;

/* compiled from: CoroutineScope.kt */
public final class m0 {
    public static final l0 a(g gVar) {
        if (gVar.h(u1.f14995d) == null) {
            gVar = gVar.Y(y1.b((u1) null, 1, (Object) null));
        }
        return new n9.g(gVar);
    }

    public static final void b(l0 l0Var, String str, Throwable th) {
        c(l0Var, j1.a(str, th));
    }

    public static final void c(l0 l0Var, CancellationException cancellationException) {
        u1 u1Var = (u1) l0Var.i().h(u1.f14995d);
        if (u1Var != null) {
            u1Var.j(cancellationException);
            return;
        }
        throw new IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + l0Var).toString());
    }

    public static final <R> Object d(p<? super l0, ? super d<? super R>, ? extends Object> pVar, d<? super R> dVar) {
        f0 f0Var = new f0(dVar.getContext(), dVar);
        Object b10 = b.b(f0Var, f0Var, pVar);
        if (b10 == d.c()) {
            h.c(dVar);
        }
        return b10;
    }

    public static final void e(l0 l0Var) {
        x1.f(l0Var.i());
    }
}
