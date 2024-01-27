package n9;

import i9.e2;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;

/* compiled from: MainDispatchers.kt */
public final class y {

    /* renamed from: a  reason: collision with root package name */
    public static final y f15867a;

    /* renamed from: b  reason: collision with root package name */
    private static final boolean f15868b = k0.f("kotlinx.coroutines.fast.service.loader", true);

    /* renamed from: c  reason: collision with root package name */
    public static final e2 f15869c;

    static {
        y yVar = new y();
        f15867a = yVar;
        f15869c = yVar.a();
    }

    private y() {
    }

    private final e2 a() {
        List<x> list;
        T t10;
        e2 e10;
        Class<x> cls = x.class;
        try {
            if (f15868b) {
                list = n.f15825a.c();
            } else {
                list = i.g(g.a(ServiceLoader.load(cls, cls.getClassLoader()).iterator()));
            }
            Iterator<T> it = list.iterator();
            if (!it.hasNext()) {
                t10 = null;
            } else {
                t10 = it.next();
                if (it.hasNext()) {
                    int c10 = ((x) t10).c();
                    do {
                        T next = it.next();
                        int c11 = ((x) next).c();
                        if (c10 < c11) {
                            t10 = next;
                            c10 = c11;
                        }
                    } while (it.hasNext());
                }
            }
            x xVar = (x) t10;
            if (xVar == null || (e10 = z.e(xVar, list)) == null) {
                return z.b((Throwable) null, (String) null, 3, (Object) null);
            }
            return e10;
        } catch (Throwable th) {
            return z.b(th, (String) null, 2, (Object) null);
        }
    }
}
