package i9;

import kotlin.jvm.internal.m;
import n9.f0;
import n9.n0;
import o8.q;
import o9.a;
import o9.b;
import r8.d;
import r8.e;
import r8.g;
import r8.h;
import y8.l;
import y8.p;

/* compiled from: Builders.common.kt */
final /* synthetic */ class i {
    public static final <T> t0<T> a(l0 l0Var, g gVar, n0 n0Var, p<? super l0, ? super d<? super T>, ? extends Object> pVar) {
        u0 u0Var;
        g d10 = f0.d(l0Var, gVar);
        if (n0Var.e()) {
            u0Var = new c2(d10, pVar);
        } else {
            u0Var = new u0(d10, true);
        }
        u0Var.S0(n0Var, u0Var, pVar);
        return u0Var;
    }

    public static /* synthetic */ t0 b(l0 l0Var, g gVar, n0 n0Var, p pVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            gVar = h.f16410h;
        }
        if ((i10 & 2) != 0) {
            n0Var = n0.DEFAULT;
        }
        return g.a(l0Var, gVar, n0Var, pVar);
    }

    public static final u1 c(l0 l0Var, g gVar, n0 n0Var, p<? super l0, ? super d<? super q>, ? extends Object> pVar) {
        a aVar;
        g d10 = f0.d(l0Var, gVar);
        if (n0Var.e()) {
            aVar = new d2(d10, pVar);
        } else {
            aVar = new k2(d10, true);
        }
        aVar.S0(n0Var, aVar, pVar);
        return aVar;
    }

    public static /* synthetic */ u1 d(l0 l0Var, g gVar, n0 n0Var, p pVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            gVar = h.f16410h;
        }
        if ((i10 & 2) != 0) {
            n0Var = n0.DEFAULT;
        }
        return g.c(l0Var, gVar, n0Var, pVar);
    }

    /* JADX INFO: finally extract failed */
    public static final <T> Object e(g gVar, p<? super l0, ? super d<? super T>, ? extends Object> pVar, d<? super T> dVar) {
        Object obj;
        g context = dVar.getContext();
        g e10 = f0.e(context, gVar);
        x1.f(e10);
        if (e10 == context) {
            f0 f0Var = new f0(e10, dVar);
            obj = b.b(f0Var, f0Var, pVar);
        } else {
            e.b bVar = e.f16407g;
            if (m.a(e10.h(bVar), context.h(bVar))) {
                q2 q2Var = new q2(e10, dVar);
                g context2 = q2Var.getContext();
                Object c10 = n0.c(context2, (Object) null);
                try {
                    Object b10 = b.b(q2Var, q2Var, pVar);
                    n0.a(context2, c10);
                    obj = b10;
                } catch (Throwable th) {
                    n0.a(context2, c10);
                    throw th;
                }
            } else {
                w0 w0Var = new w0(e10, dVar);
                a.d(pVar, w0Var, w0Var, (l) null, 4, (Object) null);
                obj = w0Var.T0();
            }
        }
        if (obj == d.c()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return obj;
    }
}
