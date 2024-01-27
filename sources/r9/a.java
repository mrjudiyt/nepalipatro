package r9;

import o8.q;
import r8.d;

/* compiled from: Mutex.kt */
public interface a {

    /* renamed from: r9.a$a  reason: collision with other inner class name */
    /* compiled from: Mutex.kt */
    public static final class C0277a {
        public static /* synthetic */ void a(a aVar, Object obj, int i10, Object obj2) {
            if (obj2 == null) {
                if ((i10 & 1) != 0) {
                    obj = null;
                }
                aVar.c(obj);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: unlock");
        }
    }

    boolean a();

    Object b(Object obj, d<? super q> dVar);

    void c(Object obj);
}
