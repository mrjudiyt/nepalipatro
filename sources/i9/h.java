package i9;

import r8.d;
import r8.e;
import r8.g;
import y8.p;

/* compiled from: Builders.kt */
final /* synthetic */ class h {
    public static final <T> T a(g gVar, p<? super l0, ? super d<? super T>, ? extends Object> pVar) {
        g gVar2;
        e1 e1Var;
        Thread currentThread = Thread.currentThread();
        e eVar = (e) gVar.h(e.f16407g);
        if (eVar == null) {
            e1Var = o2.f14972a.b();
            gVar2 = f0.d(n1.f14970h, gVar.Y(e1Var));
        } else {
            e1 e1Var2 = null;
            e1 e1Var3 = eVar instanceof e1 ? (e1) eVar : null;
            if (e1Var3 != null) {
                if (e1Var3.Y0()) {
                    e1Var2 = e1Var3;
                }
                if (e1Var2 != null) {
                    e1Var = e1Var2;
                    gVar2 = f0.d(n1.f14970h, gVar);
                }
            }
            e1Var = o2.f14972a.a();
            gVar2 = f0.d(n1.f14970h, gVar);
        }
        e eVar2 = new e(gVar2, currentThread, e1Var);
        eVar2.S0(n0.DEFAULT, eVar2, pVar);
        return eVar2.T0();
    }

    public static /* synthetic */ Object b(g gVar, p pVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            gVar = r8.h.f16410h;
        }
        return g.e(gVar, pVar);
    }
}
