package i9;

import r8.g;

/* compiled from: Unconfined.kt */
public final class p2 extends g0 {

    /* renamed from: j  reason: collision with root package name */
    public static final p2 f14979j = new p2();

    private p2() {
    }

    public void K0(g gVar, Runnable runnable) {
        t2 t2Var = (t2) gVar.h(t2.f14993j);
        if (t2Var != null) {
            t2Var.f14994i = true;
            return;
        }
        throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
    }

    public boolean L0(g gVar) {
        return false;
    }

    public String toString() {
        return "Dispatchers.Unconfined";
    }
}
