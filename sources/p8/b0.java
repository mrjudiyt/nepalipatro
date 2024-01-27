package p8;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import z8.a;

/* compiled from: Sets.kt */
public final class b0 implements Set, Serializable, a {

    /* renamed from: h  reason: collision with root package name */
    public static final b0 f16200h = new b0();

    private b0() {
    }

    private final Object readResolve() {
        return f16200h;
    }

    public boolean a(Void voidR) {
        m.f(voidR, "element");
        return false;
    }

    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public int b() {
        return 0;
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof Void)) {
            return false;
        }
        return a((Void) obj);
    }

    public boolean containsAll(Collection collection) {
        m.f(collection, "elements");
        return collection.isEmpty();
    }

    public boolean equals(Object obj) {
        return (obj instanceof Set) && ((Set) obj).isEmpty();
    }

    public int hashCode() {
        return 0;
    }

    public boolean isEmpty() {
        return true;
    }

    public Iterator iterator() {
        return y.f16216h;
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return b();
    }

    public Object[] toArray() {
        return f.a(this);
    }

    public <T> T[] toArray(T[] tArr) {
        m.f(tArr, "array");
        return f.b(this, tArr);
    }

    public String toString() {
        return "[]";
    }
}
