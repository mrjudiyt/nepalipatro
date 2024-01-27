package com.google.common.collect;

import java.util.Objects;
import l6.p;

/* compiled from: RegularImmutableList */
class x0<E> extends x<E> {

    /* renamed from: l  reason: collision with root package name */
    static final x<Object> f13706l = new x0(new Object[0], 0);

    /* renamed from: j  reason: collision with root package name */
    final transient Object[] f13707j;

    /* renamed from: k  reason: collision with root package name */
    private final transient int f13708k;

    x0(Object[] objArr, int i10) {
        this.f13707j = objArr;
        this.f13708k = i10;
    }

    /* access modifiers changed from: package-private */
    public int b(Object[] objArr, int i10) {
        System.arraycopy(this.f13707j, 0, objArr, i10, this.f13708k);
        return i10 + this.f13708k;
    }

    /* access modifiers changed from: package-private */
    public Object[] c() {
        return this.f13707j;
    }

    /* access modifiers changed from: package-private */
    public int d() {
        return this.f13708k;
    }

    /* access modifiers changed from: package-private */
    public int e() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    public boolean f() {
        return false;
    }

    public E get(int i10) {
        p.h(i10, this.f13708k);
        E e10 = this.f13707j[i10];
        Objects.requireNonNull(e10);
        return e10;
    }

    public int size() {
        return this.f13708k;
    }
}
