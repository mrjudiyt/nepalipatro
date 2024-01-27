package com.google.common.collect;

/* compiled from: RegularImmutableSet */
final class z0<E> extends b0<E> {

    /* renamed from: o  reason: collision with root package name */
    private static final Object[] f13737o;

    /* renamed from: p  reason: collision with root package name */
    static final z0<Object> f13738p;

    /* renamed from: j  reason: collision with root package name */
    final transient Object[] f13739j;

    /* renamed from: k  reason: collision with root package name */
    private final transient int f13740k;

    /* renamed from: l  reason: collision with root package name */
    final transient Object[] f13741l;

    /* renamed from: m  reason: collision with root package name */
    private final transient int f13742m;

    /* renamed from: n  reason: collision with root package name */
    private final transient int f13743n;

    static {
        Object[] objArr = new Object[0];
        f13737o = objArr;
        f13738p = new z0(objArr, 0, objArr, 0, 0);
    }

    z0(Object[] objArr, int i10, Object[] objArr2, int i11, int i12) {
        this.f13739j = objArr;
        this.f13740k = i10;
        this.f13741l = objArr2;
        this.f13742m = i11;
        this.f13743n = i12;
    }

    /* access modifiers changed from: package-private */
    public int b(Object[] objArr, int i10) {
        System.arraycopy(this.f13739j, 0, objArr, i10, this.f13743n);
        return i10 + this.f13743n;
    }

    /* access modifiers changed from: package-private */
    public Object[] c() {
        return this.f13739j;
    }

    public boolean contains(Object obj) {
        Object[] objArr = this.f13741l;
        if (obj == null || objArr.length == 0) {
            return false;
        }
        int c10 = u.c(obj);
        while (true) {
            int i10 = c10 & this.f13742m;
            Object obj2 = objArr[i10];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            c10 = i10 + 1;
        }
    }

    /* access modifiers changed from: package-private */
    public int d() {
        return this.f13743n;
    }

    /* access modifiers changed from: package-private */
    public int e() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    public boolean f() {
        return false;
    }

    /* renamed from: g */
    public k1<E> iterator() {
        return a().iterator();
    }

    public int hashCode() {
        return this.f13740k;
    }

    /* access modifiers changed from: package-private */
    public x<E> p() {
        return x.k(this.f13739j, this.f13743n);
    }

    /* access modifiers changed from: package-private */
    public boolean r() {
        return true;
    }

    public int size() {
        return this.f13743n;
    }
}
