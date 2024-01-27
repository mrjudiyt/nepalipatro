package com.google.common.collect;

import l6.p;

/* compiled from: SingletonImmutableSet */
final class g1<E> extends b0<E> {

    /* renamed from: j  reason: collision with root package name */
    final transient E f13573j;

    g1(E e10) {
        this.f13573j = p.j(e10);
    }

    public x<E> a() {
        return x.t(this.f13573j);
    }

    /* access modifiers changed from: package-private */
    public int b(Object[] objArr, int i10) {
        objArr[i10] = this.f13573j;
        return i10 + 1;
    }

    public boolean contains(Object obj) {
        return this.f13573j.equals(obj);
    }

    /* access modifiers changed from: package-private */
    public boolean f() {
        return false;
    }

    /* renamed from: g */
    public k1<E> iterator() {
        return g0.l(this.f13573j);
    }

    public final int hashCode() {
        return this.f13573j.hashCode();
    }

    public int size() {
        return 1;
    }

    public String toString() {
        String obj = this.f13573j.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 2);
        sb.append('[');
        sb.append(obj);
        sb.append(']');
        return sb.toString();
    }
}
