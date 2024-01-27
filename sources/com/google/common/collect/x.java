package com.google.common.collect;

import com.google.common.collect.v;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import l6.p;

/* compiled from: ImmutableList */
public abstract class x<E> extends v<E> implements List<E>, RandomAccess {

    /* renamed from: i  reason: collision with root package name */
    private static final l1<Object> f13699i = new b(x0.f13706l, 0);

    /* compiled from: ImmutableList */
    public static final class a<E> extends v.a<E> {
        public a() {
            this(4);
        }

        public a<E> f(E e10) {
            super.b(e10);
            return this;
        }

        public a<E> g(E... eArr) {
            super.c(eArr);
            return this;
        }

        public x<E> h() {
            this.f13696c = true;
            return x.k(this.f13694a, this.f13695b);
        }

        a(int i10) {
            super(i10);
        }
    }

    /* compiled from: ImmutableList */
    static class b<E> extends a<E> {

        /* renamed from: j  reason: collision with root package name */
        private final x<E> f13700j;

        b(x<E> xVar, int i10) {
            super(xVar.size(), i10);
            this.f13700j = xVar;
        }

        /* access modifiers changed from: protected */
        public E b(int i10) {
            return this.f13700j.get(i10);
        }
    }

    /* compiled from: ImmutableList */
    private static class c<E> extends x<E> {

        /* renamed from: j  reason: collision with root package name */
        private final transient x<E> f13701j;

        c(x<E> xVar) {
            this.f13701j = xVar;
        }

        private int F(int i10) {
            return (size() - 1) - i10;
        }

        private int G(int i10) {
            return size() - i10;
        }

        public x<E> A() {
            return this.f13701j;
        }

        /* renamed from: C */
        public x<E> subList(int i10, int i11) {
            p.n(i10, i11, size());
            return this.f13701j.subList(G(i11), G(i10)).A();
        }

        public boolean contains(Object obj) {
            return this.f13701j.contains(obj);
        }

        /* access modifiers changed from: package-private */
        public boolean f() {
            return this.f13701j.f();
        }

        public E get(int i10) {
            p.h(i10, size());
            return this.f13701j.get(F(i10));
        }

        public int indexOf(Object obj) {
            int lastIndexOf = this.f13701j.lastIndexOf(obj);
            if (lastIndexOf >= 0) {
                return F(lastIndexOf);
            }
            return -1;
        }

        public /* bridge */ /* synthetic */ Iterator iterator() {
            return x.super.iterator();
        }

        public int lastIndexOf(Object obj) {
            int indexOf = this.f13701j.indexOf(obj);
            if (indexOf >= 0) {
                return F(indexOf);
            }
            return -1;
        }

        public /* bridge */ /* synthetic */ ListIterator listIterator() {
            return x.super.listIterator();
        }

        public int size() {
            return this.f13701j.size();
        }

        public /* bridge */ /* synthetic */ ListIterator listIterator(int i10) {
            return x.super.listIterator(i10);
        }
    }

    /* compiled from: ImmutableList */
    static class d implements Serializable {

        /* renamed from: h  reason: collision with root package name */
        final Object[] f13702h;

        d(Object[] objArr) {
            this.f13702h = objArr;
        }

        /* access modifiers changed from: package-private */
        public Object readResolve() {
            return x.o(this.f13702h);
        }
    }

    /* compiled from: ImmutableList */
    class e extends x<E> {

        /* renamed from: j  reason: collision with root package name */
        final transient int f13703j;

        /* renamed from: k  reason: collision with root package name */
        final transient int f13704k;

        e(int i10, int i11) {
            this.f13703j = i10;
            this.f13704k = i11;
        }

        /* renamed from: C */
        public x<E> subList(int i10, int i11) {
            p.n(i10, i11, this.f13704k);
            x xVar = x.this;
            int i12 = this.f13703j;
            return xVar.subList(i10 + i12, i11 + i12);
        }

        /* access modifiers changed from: package-private */
        public Object[] c() {
            return x.this.c();
        }

        /* access modifiers changed from: package-private */
        public int d() {
            return x.this.e() + this.f13703j + this.f13704k;
        }

        /* access modifiers changed from: package-private */
        public int e() {
            return x.this.e() + this.f13703j;
        }

        /* access modifiers changed from: package-private */
        public boolean f() {
            return true;
        }

        public E get(int i10) {
            p.h(i10, this.f13704k);
            return x.this.get(i10 + this.f13703j);
        }

        public /* bridge */ /* synthetic */ Iterator iterator() {
            return x.super.iterator();
        }

        public /* bridge */ /* synthetic */ ListIterator listIterator() {
            return x.super.listIterator();
        }

        public int size() {
            return this.f13704k;
        }

        public /* bridge */ /* synthetic */ ListIterator listIterator(int i10) {
            return x.super.listIterator(i10);
        }
    }

    x() {
    }

    public static <E> x<E> B(Comparator<? super E> comparator, Iterable<? extends E> iterable) {
        p.j(comparator);
        Object[] f10 = f0.f(iterable);
        u0.b(f10);
        Arrays.sort(f10, comparator);
        return i(f10);
    }

    static <E> x<E> i(Object[] objArr) {
        return k(objArr, objArr.length);
    }

    static <E> x<E> k(Object[] objArr, int i10) {
        if (i10 == 0) {
            return s();
        }
        return new x0(objArr, i10);
    }

    public static <E> a<E> l() {
        return new a<>();
    }

    private static <E> x<E> m(Object... objArr) {
        return i(u0.b(objArr));
    }

    public static <E> x<E> n(Collection<? extends E> collection) {
        if (!(collection instanceof v)) {
            return m(collection.toArray());
        }
        x<E> a10 = ((v) collection).a();
        return a10.f() ? i(a10.toArray()) : a10;
    }

    public static <E> x<E> o(E[] eArr) {
        if (eArr.length == 0) {
            return s();
        }
        return m((Object[]) eArr.clone());
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public static <E> x<E> s() {
        return x0.f13706l;
    }

    public static <E> x<E> t(E e10) {
        return m(e10);
    }

    public static <E> x<E> u(E e10, E e11) {
        return m(e10, e11);
    }

    public static <E> x<E> v(E e10, E e11, E e12) {
        return m(e10, e11, e12);
    }

    public static <E> x<E> x(E e10, E e11, E e12, E e13, E e14) {
        return m(e10, e11, e12, e13, e14);
    }

    public static <E> x<E> y(E e10, E e11, E e12, E e13, E e14, E e15) {
        return m(e10, e11, e12, e13, e14, e15);
    }

    public static <E> x<E> z(E e10, E e11, E e12, E e13, E e14, E e15, E e16) {
        return m(e10, e11, e12, e13, e14, e15, e16);
    }

    public x<E> A() {
        return size() <= 1 ? this : new c(this);
    }

    /* renamed from: C */
    public x<E> subList(int i10, int i11) {
        p.n(i10, i11, size());
        int i12 = i11 - i10;
        if (i12 == size()) {
            return this;
        }
        if (i12 == 0) {
            return s();
        }
        return D(i10, i11);
    }

    /* access modifiers changed from: package-private */
    public x<E> D(int i10, int i11) {
        return new e(i10, i11 - i10);
    }

    @Deprecated
    public final x<E> a() {
        return this;
    }

    @Deprecated
    public final void add(int i10, E e10) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean addAll(int i10, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    public int b(Object[] objArr, int i10) {
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            objArr[i10 + i11] = get(i11);
        }
        return i10 + size;
    }

    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    public boolean equals(Object obj) {
        return i0.c(this, obj);
    }

    /* renamed from: g */
    public k1<E> iterator() {
        return listIterator();
    }

    public int hashCode() {
        int size = size();
        int i10 = 1;
        for (int i11 = 0; i11 < size; i11++) {
            i10 = ~(~((i10 * 31) + get(i11).hashCode()));
        }
        return i10;
    }

    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return i0.d(this, obj);
    }

    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return i0.f(this, obj);
    }

    /* renamed from: p */
    public l1<E> listIterator() {
        return listIterator(0);
    }

    /* renamed from: r */
    public l1<E> listIterator(int i10) {
        p.l(i10, size());
        if (isEmpty()) {
            return f13699i;
        }
        return new b(this, i10);
    }

    @Deprecated
    public final E remove(int i10) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final E set(int i10, E e10) {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    public Object writeReplace() {
        return new d(toArray());
    }
}
