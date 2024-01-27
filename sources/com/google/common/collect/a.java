package com.google.common.collect;

import java.util.NoSuchElementException;
import l6.p;

/* compiled from: AbstractIndexedListIterator */
abstract class a<E> extends l1<E> {

    /* renamed from: h  reason: collision with root package name */
    private final int f13489h;

    /* renamed from: i  reason: collision with root package name */
    private int f13490i;

    protected a(int i10, int i11) {
        p.l(i11, i10);
        this.f13489h = i10;
        this.f13490i = i11;
    }

    /* access modifiers changed from: protected */
    public abstract E b(int i10);

    public final boolean hasNext() {
        return this.f13490i < this.f13489h;
    }

    public final boolean hasPrevious() {
        return this.f13490i > 0;
    }

    public final E next() {
        if (hasNext()) {
            int i10 = this.f13490i;
            this.f13490i = i10 + 1;
            return b(i10);
        }
        throw new NoSuchElementException();
    }

    public final int nextIndex() {
        return this.f13490i;
    }

    public final E previous() {
        if (hasPrevious()) {
            int i10 = this.f13490i - 1;
            this.f13490i = i10;
            return b(i10);
        }
        throw new NoSuchElementException();
    }

    public final int previousIndex() {
        return this.f13490i - 1;
    }
}
