package com.google.common.collect;

import java.util.Iterator;

/* compiled from: UnmodifiableIterator */
public abstract class k1<E> implements Iterator<E> {
    protected k1() {
    }

    @Deprecated
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
