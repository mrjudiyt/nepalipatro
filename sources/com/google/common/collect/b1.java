package com.google.common.collect;

import java.io.Serializable;
import l6.p;

/* compiled from: ReverseNaturalOrdering */
final class b1 extends v0<Comparable<?>> implements Serializable {

    /* renamed from: h  reason: collision with root package name */
    static final b1 f13516h = new b1();

    private b1() {
    }

    private Object readResolve() {
        return f13516h;
    }

    public <S extends Comparable<?>> v0<S> f() {
        return v0.c();
    }

    /* renamed from: g */
    public int compare(Comparable<?> comparable, Comparable<?> comparable2) {
        p.j(comparable);
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    public String toString() {
        return "Ordering.natural().reverse()";
    }
}
