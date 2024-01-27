package com.google.common.collect;

import java.util.Iterator;
import l6.p;

/* compiled from: TransformedIterator */
abstract class j1<F, T> implements Iterator<T> {

    /* renamed from: h  reason: collision with root package name */
    final Iterator<? extends F> f13582h;

    j1(Iterator<? extends F> it) {
        this.f13582h = (Iterator) p.j(it);
    }

    /* access modifiers changed from: package-private */
    public abstract T b(F f10);

    public final boolean hasNext() {
        return this.f13582h.hasNext();
    }

    public final T next() {
        return b(this.f13582h.next());
    }

    public final void remove() {
        this.f13582h.remove();
    }
}
