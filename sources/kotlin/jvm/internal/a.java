package kotlin.jvm.internal;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: ArrayIterator.kt */
final class a<T> implements Iterator<T>, z8.a {

    /* renamed from: h  reason: collision with root package name */
    private final T[] f15557h;

    /* renamed from: i  reason: collision with root package name */
    private int f15558i;

    public a(T[] tArr) {
        m.f(tArr, "array");
        this.f15557h = tArr;
    }

    public boolean hasNext() {
        return this.f15558i < this.f15557h.length;
    }

    public T next() {
        try {
            T[] tArr = this.f15557h;
            int i10 = this.f15558i;
            this.f15558i = i10 + 1;
            return tArr[i10];
        } catch (ArrayIndexOutOfBoundsException e10) {
            this.f15558i--;
            throw new NoSuchElementException(e10.getMessage());
        }
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
