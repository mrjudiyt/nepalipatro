package com.google.common.collect;

import com.google.common.collect.v;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;
import l6.p;

/* compiled from: ImmutableSet */
public abstract class b0<E> extends v<E> implements Set<E> {

    /* renamed from: i  reason: collision with root package name */
    private transient x<E> f13512i;

    /* compiled from: ImmutableSet */
    public static class a<E> extends v.a<E> {

        /* renamed from: d  reason: collision with root package name */
        Object[] f13513d;

        /* renamed from: e  reason: collision with root package name */
        private int f13514e;

        public a() {
            super(4);
        }

        private void h(E e10) {
            Objects.requireNonNull(this.f13513d);
            int length = this.f13513d.length - 1;
            int hashCode = e10.hashCode();
            int b10 = u.b(hashCode);
            while (true) {
                int i10 = b10 & length;
                Object[] objArr = this.f13513d;
                Object obj = objArr[i10];
                if (obj == null) {
                    objArr[i10] = e10;
                    this.f13514e += hashCode;
                    super.b(e10);
                    return;
                } else if (!obj.equals(e10)) {
                    b10 = i10 + 1;
                } else {
                    return;
                }
            }
        }

        public a<E> f(E e10) {
            p.j(e10);
            if (this.f13513d == null || b0.l(this.f13695b) > this.f13513d.length) {
                this.f13513d = null;
                super.b(e10);
                return this;
            }
            h(e10);
            return this;
        }

        public a<E> g(E... eArr) {
            if (this.f13513d != null) {
                for (E f10 : eArr) {
                    f(f10);
                }
            } else {
                super.c(eArr);
            }
            return this;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: com.google.common.collect.z0} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: com.google.common.collect.b0} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v16, resolved type: com.google.common.collect.z0} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: com.google.common.collect.z0} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.google.common.collect.b0<E> i() {
            /*
                r8 = this;
                int r0 = r8.f13695b
                if (r0 == 0) goto L_0x005c
                r1 = 1
                if (r0 == r1) goto L_0x004f
                java.lang.Object[] r2 = r8.f13513d
                if (r2 == 0) goto L_0x003b
                int r0 = com.google.common.collect.b0.l(r0)
                java.lang.Object[] r2 = r8.f13513d
                int r2 = r2.length
                if (r0 != r2) goto L_0x003b
                int r0 = r8.f13695b
                java.lang.Object[] r2 = r8.f13694a
                int r2 = r2.length
                boolean r0 = com.google.common.collect.b0.y(r0, r2)
                if (r0 == 0) goto L_0x0028
                java.lang.Object[] r0 = r8.f13694a
                int r2 = r8.f13695b
                java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r2)
                goto L_0x002a
            L_0x0028:
                java.lang.Object[] r0 = r8.f13694a
            L_0x002a:
                r3 = r0
                com.google.common.collect.z0 r0 = new com.google.common.collect.z0
                int r4 = r8.f13514e
                java.lang.Object[] r5 = r8.f13513d
                int r2 = r5.length
                int r6 = r2 + -1
                int r7 = r8.f13695b
                r2 = r0
                r2.<init>(r3, r4, r5, r6, r7)
                goto L_0x0049
            L_0x003b:
                int r0 = r8.f13695b
                java.lang.Object[] r2 = r8.f13694a
                com.google.common.collect.b0 r0 = com.google.common.collect.b0.m(r0, r2)
                int r2 = r0.size()
                r8.f13695b = r2
            L_0x0049:
                r8.f13696c = r1
                r1 = 0
                r8.f13513d = r1
                return r0
            L_0x004f:
                java.lang.Object[] r0 = r8.f13694a
                r1 = 0
                r0 = r0[r1]
                java.util.Objects.requireNonNull(r0)
                com.google.common.collect.b0 r0 = com.google.common.collect.b0.t(r0)
                return r0
            L_0x005c:
                com.google.common.collect.b0 r0 = com.google.common.collect.b0.s()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.b0.a.i():com.google.common.collect.b0");
        }
    }

    /* compiled from: ImmutableSet */
    private static class b implements Serializable {

        /* renamed from: h  reason: collision with root package name */
        final Object[] f13515h;

        b(Object[] objArr) {
            this.f13515h = objArr;
        }

        /* access modifiers changed from: package-private */
        public Object readResolve() {
            return b0.o(this.f13515h);
        }
    }

    b0() {
    }

    static int l(int i10) {
        int max = Math.max(i10, 2);
        boolean z10 = true;
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1) << 1;
            while (((double) highestOneBit) * 0.7d < ((double) max)) {
                highestOneBit <<= 1;
            }
            return highestOneBit;
        }
        if (max >= 1073741824) {
            z10 = false;
        }
        p.e(z10, "collection too large");
        return 1073741824;
    }

    /* access modifiers changed from: private */
    public static <E> b0<E> m(int i10, Object... objArr) {
        if (i10 == 0) {
            return s();
        }
        if (i10 != 1) {
            int l10 = l(i10);
            Object[] objArr2 = new Object[l10];
            int i11 = l10 - 1;
            int i12 = 0;
            int i13 = 0;
            for (int i14 = 0; i14 < i10; i14++) {
                Object a10 = u0.a(objArr[i14], i14);
                int hashCode = a10.hashCode();
                int b10 = u.b(hashCode);
                while (true) {
                    int i15 = b10 & i11;
                    Object obj = objArr2[i15];
                    if (obj == null) {
                        objArr[i13] = a10;
                        objArr2[i15] = a10;
                        i12 += hashCode;
                        i13++;
                        break;
                    } else if (obj.equals(a10)) {
                        break;
                    } else {
                        b10++;
                    }
                }
            }
            Arrays.fill(objArr, i13, i10, (Object) null);
            if (i13 == 1) {
                Object obj2 = objArr[0];
                Objects.requireNonNull(obj2);
                return new g1(obj2);
            } else if (l(i13) < l10 / 2) {
                return m(i13, objArr);
            } else {
                if (y(i13, objArr.length)) {
                    objArr = Arrays.copyOf(objArr, i13);
                }
                return new z0(objArr, i12, objArr2, i11, i13);
            }
        } else {
            Object obj3 = objArr[0];
            Objects.requireNonNull(obj3);
            return t(obj3);
        }
    }

    public static <E> b0<E> n(Collection<? extends E> collection) {
        if ((collection instanceof b0) && !(collection instanceof SortedSet)) {
            b0<E> b0Var = (b0) collection;
            if (!b0Var.f()) {
                return b0Var;
            }
        }
        Object[] array = collection.toArray();
        return m(array.length, array);
    }

    public static <E> b0<E> o(E[] eArr) {
        int length = eArr.length;
        if (length == 0) {
            return s();
        }
        if (length != 1) {
            return m(eArr.length, (Object[]) eArr.clone());
        }
        return t(eArr[0]);
    }

    public static <E> b0<E> s() {
        return z0.f13738p;
    }

    public static <E> b0<E> t(E e10) {
        return new g1(e10);
    }

    public static <E> b0<E> u(E e10, E e11) {
        return m(2, e10, e11);
    }

    public static <E> b0<E> v(E e10, E e11, E e12) {
        return m(3, e10, e11, e12);
    }

    @SafeVarargs
    public static <E> b0<E> x(E e10, E e11, E e12, E e13, E e14, E e15, E... eArr) {
        p.e(eArr.length <= 2147483641, "the total number of elements must fit in an int");
        int length = eArr.length + 6;
        Object[] objArr = new Object[length];
        objArr[0] = e10;
        objArr[1] = e11;
        objArr[2] = e12;
        objArr[3] = e13;
        objArr[4] = e14;
        objArr[5] = e15;
        System.arraycopy(eArr, 0, objArr, 6, eArr.length);
        return m(length, objArr);
    }

    /* access modifiers changed from: private */
    public static boolean y(int i10, int i11) {
        return i10 < (i11 >> 1) + (i11 >> 2);
    }

    public x<E> a() {
        x<E> xVar = this.f13512i;
        if (xVar != null) {
            return xVar;
        }
        x<E> p10 = p();
        this.f13512i = p10;
        return p10;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b0) || !r() || !((b0) obj).r() || hashCode() == obj.hashCode()) {
            return f1.a(this, obj);
        }
        return false;
    }

    /* renamed from: g */
    public abstract k1<E> iterator();

    public int hashCode() {
        return f1.b(this);
    }

    /* access modifiers changed from: package-private */
    public x<E> p() {
        return x.i(toArray());
    }

    /* access modifiers changed from: package-private */
    public boolean r() {
        return false;
    }

    /* access modifiers changed from: package-private */
    public Object writeReplace() {
        return new b(toArray());
    }
}
