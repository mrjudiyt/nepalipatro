package k9;

import o8.q;
import r8.d;
import y8.l;

/* compiled from: Channel.kt */
public interface s<E> {

    /* compiled from: Channel.kt */
    public static final class a {
        public static /* synthetic */ boolean a(s sVar, Throwable th, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 1) != 0) {
                    th = null;
                }
                return sVar.g(th);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: close");
        }
    }

    Object c(E e10, d<? super q> dVar);

    void f(l<? super Throwable, q> lVar);

    boolean g(Throwable th);

    Object n(E e10);

    boolean o();
}
