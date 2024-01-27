package com.google.common.collect;

import java.io.Serializable;
import java.util.Comparator;
import l6.p;

/* compiled from: ComparatorOrdering */
final class n<T> extends v0<T> implements Serializable {

    /* renamed from: h  reason: collision with root package name */
    final Comparator<T> f13680h;

    n(Comparator<T> comparator) {
        this.f13680h = (Comparator) p.j(comparator);
    }

    public int compare(T t10, T t11) {
        return this.f13680h.compare(t10, t11);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof n) {
            return this.f13680h.equals(((n) obj).f13680h);
        }
        return false;
    }

    public int hashCode() {
        return this.f13680h.hashCode();
    }

    public String toString() {
        return this.f13680h.toString();
    }
}
