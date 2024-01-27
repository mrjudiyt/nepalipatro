package p8;

import java.util.Iterator;
import z8.a;

/* compiled from: PrimitiveIterators.kt */
public abstract class m implements Iterator<Character>, a {
    public abstract char b();

    public /* bridge */ /* synthetic */ Object next() {
        return Character.valueOf(b());
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
