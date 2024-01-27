package p8;

import java.util.Iterator;
import z8.a;

/* compiled from: PrimitiveIterators.kt */
public abstract class d0 implements Iterator<Long>, a {
    public abstract long b();

    public /* bridge */ /* synthetic */ Object next() {
        return Long.valueOf(b());
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
