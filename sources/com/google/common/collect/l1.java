package com.google.common.collect;

import java.util.ListIterator;

/* compiled from: UnmodifiableListIterator */
public abstract class l1<E> extends k1<E> implements ListIterator<E> {
    protected l1() {
    }

    @Deprecated
    public final void add(E e10) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void set(E e10) {
        throw new UnsupportedOperationException();
    }
}
