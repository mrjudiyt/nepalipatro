package i9;

import o8.q;
import r8.d;

/* compiled from: CancellableContinuation.kt */
public interface l<T> extends d<T> {

    /* compiled from: CancellableContinuation.kt */
    public static final class a {
        public static /* synthetic */ boolean a(l lVar, Throwable th, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 1) != 0) {
                    th = null;
                }
                return lVar.l(th);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
        }
    }

    void d(T t10, y8.l<? super Throwable, q> lVar);

    void k(y8.l<? super Throwable, q> lVar);

    boolean l(Throwable th);

    Object m(T t10, Object obj, y8.l<? super Throwable, q> lVar);

    void p(Object obj);
}
