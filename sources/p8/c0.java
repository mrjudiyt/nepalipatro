package p8;

import java.util.Iterator;
import z8.a;

/* compiled from: PrimitiveIterators.kt */
public abstract class c0 implements Iterator<Integer>, a {
    public abstract int b();

    public /* bridge */ /* synthetic */ Object next() {
        return Integer.valueOf(b());
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
