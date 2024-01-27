package i9;

import o8.l;

/* compiled from: CompletableDeferred.kt */
public final class w {
    public static final <T> u<T> a(u1 u1Var) {
        return new v(u1Var);
    }

    public static /* synthetic */ u b(u1 u1Var, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            u1Var = null;
        }
        return a(u1Var);
    }

    public static final <T> boolean c(u<T> uVar, Object obj) {
        Throwable b10 = l.b(obj);
        return b10 == null ? uVar.l0(obj) : uVar.k0(b10);
    }
}
