package i9;

import kotlin.jvm.internal.g;
import r8.d;

/* compiled from: CompletableDeferred.kt */
final class v<T> extends a2 implements u<T> {
    public v(u1 u1Var) {
        super(true);
        b0(u1Var);
    }

    public boolean T() {
        return true;
    }

    public boolean k0(Throwable th) {
        return i0(new z(th, false, 2, (g) null));
    }

    public boolean l0(T t10) {
        return i0(t10);
    }

    public T q() {
        return P();
    }

    public Object v0(d<? super T> dVar) {
        Object y10 = y(dVar);
        Object unused = d.c();
        return y10;
    }
}
