package i9;

import n9.k;
import r8.d;

/* compiled from: CancellableContinuation.kt */
public final class o {
    public static final void a(l<?> lVar, b1 b1Var) {
        lVar.k(new c1(b1Var));
    }

    public static final <T> m<T> b(d<? super T> dVar) {
        if (!(dVar instanceof k)) {
            return new m<>(dVar, 1);
        }
        m<T> j10 = ((k) dVar).j();
        if (j10 != null) {
            if (!j10.J()) {
                j10 = null;
            }
            if (j10 != null) {
                return j10;
            }
        }
        return new m<>(dVar, 2);
    }
}
