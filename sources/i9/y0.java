package i9;

import n9.k;
import n9.n0;
import o8.l;
import o8.m;
import o8.q;
import r8.d;
import r8.g;

/* compiled from: DispatchedTask.kt */
public final class y0 {
    public static final <T> void a(x0<? super T> x0Var, int i10) {
        boolean z10 = true;
        if (p0.a()) {
            if (!(i10 != -1)) {
                throw new AssertionError();
            }
        }
        d<? super T> c10 = x0Var.c();
        if (i10 != 4) {
            z10 = false;
        }
        if (z10 || !(c10 instanceof k) || b(i10) != b(x0Var.f14999j)) {
            d(x0Var, c10, z10);
            return;
        }
        g0 g0Var = ((k) c10).f15810k;
        g context = c10.getContext();
        if (g0Var.L0(context)) {
            g0Var.K0(context, x0Var);
        } else {
            e(x0Var);
        }
    }

    public static final boolean b(int i10) {
        return i10 == 1 || i10 == 2;
    }

    public static final boolean c(int i10) {
        return i10 == 2;
    }

    public static final <T> void d(x0<? super T> x0Var, d<? super T> dVar, boolean z10) {
        Object obj;
        Object h10 = x0Var.h();
        Throwable e10 = x0Var.e(h10);
        if (e10 != null) {
            l.a aVar = l.f16183h;
            obj = m.a(e10);
        } else {
            l.a aVar2 = l.f16183h;
            obj = x0Var.f(h10);
        }
        Object a10 = l.a(obj);
        if (z10) {
            kotlin.jvm.internal.m.d(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
            k kVar = (k) dVar;
            d<T> dVar2 = kVar.f15811l;
            Object obj2 = kVar.f15813n;
            g context = dVar2.getContext();
            Object c10 = n0.c(context, obj2);
            q2<?> g10 = c10 != n0.f15826a ? f0.g(dVar2, context, c10) : null;
            try {
                kVar.f15811l.resumeWith(a10);
                q qVar = q.f16189a;
            } finally {
                if (g10 == null || g10.T0()) {
                    n0.a(context, c10);
                }
            }
        } else {
            dVar.resumeWith(a10);
        }
    }

    private static final void e(x0<?> x0Var) {
        e1 b10 = o2.f14972a.b();
        if (b10.U0()) {
            b10.Q0(x0Var);
            return;
        }
        b10.S0(true);
        try {
            d(x0Var, x0Var.c(), true);
            do {
            } while (b10.X0());
        } catch (Throwable th) {
            b10.N0(true);
            throw th;
        }
        b10.N0(true);
    }
}
