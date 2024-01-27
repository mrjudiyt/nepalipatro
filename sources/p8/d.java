package p8;

import java.util.AbstractList;
import z8.b;

/* compiled from: AbstractMutableList.kt */
public abstract class d<E> extends AbstractList<E> implements b {
    protected d() {
    }

    public abstract int a();

    public abstract E b(int i10);

    public final /* bridge */ E remove(int i10) {
        return b(i10);
    }

    public final /* bridge */ int size() {
        return a();
    }
}
