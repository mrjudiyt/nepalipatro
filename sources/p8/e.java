package p8;

import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.b;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import z8.a;

/* compiled from: Collections.kt */
final class e<T> implements Collection<T>, a {

    /* renamed from: h  reason: collision with root package name */
    private final T[] f16202h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f16203i;

    public e(T[] tArr, boolean z10) {
        m.f(tArr, "values");
        this.f16202h = tArr;
        this.f16203i = z10;
    }

    public int a() {
        return this.f16202h.length;
    }

    public boolean add(T t10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean contains(Object obj) {
        return k.l(this.f16202h, obj);
    }

    public boolean containsAll(Collection<? extends Object> collection) {
        m.f(collection, "elements");
        if (collection.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public boolean isEmpty() {
        return this.f16202h.length == 0;
    }

    public Iterator<T> iterator() {
        return b.a(this.f16202h);
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return a();
    }

    public final Object[] toArray() {
        return o.a(this.f16202h, this.f16203i);
    }

    public <T> T[] toArray(T[] tArr) {
        m.f(tArr, "array");
        return f.b(this, tArr);
    }
}
