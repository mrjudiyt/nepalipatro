package com.google.common.collect;

import java.util.Comparator;
import java.util.Map;
import l6.h;

/* compiled from: Ordering */
public abstract class v0<T> implements Comparator<T> {
    protected v0() {
    }

    public static <T> v0<T> a(Comparator<T> comparator) {
        if (comparator instanceof v0) {
            return (v0) comparator;
        }
        return new n(comparator);
    }

    public static <C extends Comparable> v0<C> c() {
        return s0.f13692h;
    }

    public <E extends T> x<E> b(Iterable<E> iterable) {
        return x.B(this, iterable);
    }

    public abstract int compare(T t10, T t11);

    /* access modifiers changed from: package-private */
    public <T2 extends T> v0<Map.Entry<T2, ?>> d() {
        return e(m0.d());
    }

    public <F> v0<F> e(h<F, ? extends T> hVar) {
        return new h(hVar, this);
    }

    public <S extends T> v0<S> f() {
        return new c1(this);
    }
}
