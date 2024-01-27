package p8;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import z8.a;

/* compiled from: Collections.kt */
public final class z implements List, Serializable, RandomAccess, a {

    /* renamed from: h  reason: collision with root package name */
    public static final z f16217h = new z();

    private z() {
    }

    private final Object readResolve() {
        return f16217h;
    }

    public boolean a(Void voidR) {
        m.f(voidR, "element");
        return false;
    }

    public /* bridge */ /* synthetic */ void add(int i10, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(int i10, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: b */
    public Void get(int i10) {
        throw new IndexOutOfBoundsException("Empty list doesn't contain element at index " + i10 + '.');
    }

    public int c() {
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

    public int d(Void voidR) {
        m.f(voidR, "element");
        return -1;
    }

    public int e(Void voidR) {
        m.f(voidR, "element");
        return -1;
    }

    public boolean equals(Object obj) {
        return (obj instanceof List) && ((List) obj).isEmpty();
    }

    public int hashCode() {
        return 1;
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof Void)) {
            return -1;
        }
        return d((Void) obj);
    }

    public boolean isEmpty() {
        return true;
    }

    public Iterator iterator() {
        return y.f16216h;
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof Void)) {
            return -1;
        }
        return e((Void) obj);
    }

    public ListIterator listIterator() {
        return y.f16216h;
    }

    public /* bridge */ /* synthetic */ Object remove(int i10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
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

    public /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return c();
    }

    public List subList(int i10, int i11) {
        if (i10 == 0 && i11 == 0) {
            return this;
        }
        throw new IndexOutOfBoundsException("fromIndex: " + i10 + ", toIndex: " + i11);
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

    public ListIterator listIterator(int i10) {
        if (i10 == 0) {
            return y.f16216h;
        }
        throw new IndexOutOfBoundsException("Index: " + i10);
    }
}
