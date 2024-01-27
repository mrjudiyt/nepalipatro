package com.google.common.collect;

import java.io.Serializable;
import l6.p;

/* compiled from: NaturalOrdering */
final class s0 extends v0<Comparable<?>> implements Serializable {

    /* renamed from: h  reason: collision with root package name */
    static final s0 f13692h = new s0();

    private s0() {
    }

    private Object readResolve() {
        return f13692h;
    }

    public <S extends Comparable<?>> v0<S> f() {
        return b1.f13516h;
    }

    /* renamed from: g */
    public int compare(Comparable<?> comparable, Comparable<?> comparable2) {
        p.j(comparable);
        p.j(comparable2);
        return comparable.compareTo(comparable2);
    }

    public String toString() {
        return "Ordering.natural()";
    }
}
