package com.google.common.collect;

import java.io.Serializable;
import l6.p;

/* compiled from: ReverseOrdering */
final class c1<T> extends v0<T> implements Serializable {

    /* renamed from: h  reason: collision with root package name */
    final v0<? super T> f13519h;

    c1(v0<? super T> v0Var) {
        this.f13519h = (v0) p.j(v0Var);
    }

    public int compare(T t10, T t11) {
        return this.f13519h.compare(t11, t10);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c1) {
            return this.f13519h.equals(((c1) obj).f13519h);
        }
        return false;
    }

    public <S extends T> v0<S> f() {
        return this.f13519h;
    }

    public int hashCode() {
        return -this.f13519h.hashCode();
    }

    public String toString() {
        String valueOf = String.valueOf(this.f13519h);
        StringBuilder sb = new StringBuilder(valueOf.length() + 10);
        sb.append(valueOf);
        sb.append(".reverse()");
        return sb.toString();
    }
}
