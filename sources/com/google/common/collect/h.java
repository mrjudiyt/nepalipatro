package com.google.common.collect;

import java.io.Serializable;
import l6.l;
import l6.p;

/* compiled from: ByFunctionOrdering */
final class h<F, T> extends v0<F> implements Serializable {

    /* renamed from: h  reason: collision with root package name */
    final l6.h<F, ? extends T> f13574h;

    /* renamed from: i  reason: collision with root package name */
    final v0<T> f13575i;

    h(l6.h<F, ? extends T> hVar, v0<T> v0Var) {
        this.f13574h = (l6.h) p.j(hVar);
        this.f13575i = (v0) p.j(v0Var);
    }

    public int compare(F f10, F f11) {
        return this.f13575i.compare(this.f13574h.apply(f10), this.f13574h.apply(f11));
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (!this.f13574h.equals(hVar.f13574h) || !this.f13575i.equals(hVar.f13575i)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return l.b(this.f13574h, this.f13575i);
    }

    public String toString() {
        String valueOf = String.valueOf(this.f13575i);
        String valueOf2 = String.valueOf(this.f13574h);
        StringBuilder sb = new StringBuilder(valueOf.length() + 13 + valueOf2.length());
        sb.append(valueOf);
        sb.append(".onResultOf(");
        sb.append(valueOf2);
        sb.append(")");
        return sb.toString();
    }
}
