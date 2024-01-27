package n9;

import i9.p0;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: Atomic.kt */
public abstract class b<T> extends c0 {

    /* renamed from: a  reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f15789a = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_consensus");
    private volatile Object _consensus = a.f15786a;

    private final Object c(Object obj) {
        if (p0.a()) {
            if (!(obj != a.f15786a)) {
                throw new AssertionError();
            }
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15789a;
        Object obj2 = atomicReferenceFieldUpdater.get(this);
        Object obj3 = a.f15786a;
        if (obj2 != obj3) {
            return obj2;
        }
        if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, obj3, obj)) {
            return obj;
        }
        return atomicReferenceFieldUpdater.get(this);
    }

    public final Object a(Object obj) {
        Object obj2 = f15789a.get(this);
        if (obj2 == a.f15786a) {
            obj2 = c(d(obj));
        }
        b(obj, obj2);
        return obj2;
    }

    public abstract void b(T t10, Object obj);

    public abstract Object d(T t10);
}
