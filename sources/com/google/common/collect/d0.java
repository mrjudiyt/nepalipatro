package com.google.common.collect;

import com.google.common.collect.b0;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.NavigableSet;
import l6.p;

/* compiled from: ImmutableSortedSet */
public abstract class d0<E> extends e0<E> implements NavigableSet<E>, h1<E> {

    /* renamed from: j  reason: collision with root package name */
    final transient Comparator<? super E> f13552j;

    /* renamed from: k  reason: collision with root package name */
    transient d0<E> f13553k;

    /* compiled from: ImmutableSortedSet */
    public static final class a<E> extends b0.a<E> {

        /* renamed from: f  reason: collision with root package name */
        private final Comparator<? super E> f13554f;

        public a(Comparator<? super E> comparator) {
            this.f13554f = (Comparator) p.j(comparator);
        }

        /* renamed from: j */
        public a<E> f(E e10) {
            super.f(e10);
            return this;
        }

        public a<E> k(E... eArr) {
            super.g(eArr);
            return this;
        }

        /* renamed from: l */
        public d0<E> i() {
            d0<E> z10 = d0.z(this.f13554f, this.f13695b, this.f13694a);
            this.f13695b = z10.size();
            this.f13696c = true;
            return z10;
        }
    }

    /* compiled from: ImmutableSortedSet */
    private static class b<E> implements Serializable {

        /* renamed from: h  reason: collision with root package name */
        final Comparator<? super E> f13555h;

        /* renamed from: i  reason: collision with root package name */
        final Object[] f13556i;

        public b(Comparator<? super E> comparator, Object[] objArr) {
            this.f13555h = comparator;
            this.f13556i = objArr;
        }

        /* access modifiers changed from: package-private */
        public Object readResolve() {
            return new a(this.f13555h).k(this.f13556i).i();
        }
    }

    d0(Comparator<? super E> comparator) {
        this.f13552j = comparator;
    }

    public static <E> d0<E> A(Comparator<? super E> comparator, Iterable<? extends E> iterable) {
        p.j(comparator);
        if (i1.b(comparator, iterable) && (iterable instanceof d0)) {
            d0<E> d0Var = (d0) iterable;
            if (!d0Var.f()) {
                return d0Var;
            }
        }
        Object[] f10 = f0.f(iterable);
        return z(comparator, f10.length, f10);
    }

    public static <E> d0<E> B(Comparator<? super E> comparator, Collection<? extends E> collection) {
        return A(comparator, collection);
    }

    static <E> a1<E> G(Comparator<? super E> comparator) {
        if (v0.c().equals(comparator)) {
            return a1.f13502m;
        }
        return new a1<>(x.s(), comparator);
    }

    static int T(Comparator<?> comparator, Object obj, Object obj2) {
        return comparator.compare(obj, obj2);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    static <E> d0<E> z(Comparator<? super E> comparator, int i10, E... eArr) {
        if (i10 == 0) {
            return G(comparator);
        }
        u0.c(eArr, i10);
        Arrays.sort(eArr, 0, i10, comparator);
        int i11 = 1;
        for (int i12 = 1; i12 < i10; i12++) {
            E e10 = eArr[i12];
            if (comparator.compare(e10, eArr[i11 - 1]) != 0) {
                eArr[i11] = e10;
                i11++;
            }
        }
        Arrays.fill(eArr, i11, i10, (Object) null);
        if (i11 < eArr.length / 2) {
            eArr = Arrays.copyOf(eArr, i11);
        }
        return new a1(x.k(eArr, i11), comparator);
    }

    /* access modifiers changed from: package-private */
    public abstract d0<E> C();

    /* renamed from: D */
    public abstract k1<E> descendingIterator();

    /* renamed from: F */
    public d0<E> descendingSet() {
        d0<E> d0Var = this.f13553k;
        if (d0Var != null) {
            return d0Var;
        }
        d0<E> C = C();
        this.f13553k = C;
        C.f13553k = this;
        return C;
    }

    /* renamed from: H */
    public d0<E> headSet(E e10) {
        return headSet(e10, false);
    }

    /* renamed from: I */
    public d0<E> headSet(E e10, boolean z10) {
        return K(p.j(e10), z10);
    }

    /* access modifiers changed from: package-private */
    public abstract d0<E> K(E e10, boolean z10);

    /* renamed from: M */
    public d0<E> subSet(E e10, E e11) {
        return subSet(e10, true, e11, false);
    }

    /* renamed from: N */
    public d0<E> subSet(E e10, boolean z10, E e11, boolean z11) {
        p.j(e10);
        p.j(e11);
        p.d(this.f13552j.compare(e10, e11) <= 0);
        return O(e10, z10, e11, z11);
    }

    /* access modifiers changed from: package-private */
    public abstract d0<E> O(E e10, boolean z10, E e11, boolean z11);

    /* renamed from: P */
    public d0<E> tailSet(E e10) {
        return tailSet(e10, true);
    }

    /* renamed from: Q */
    public d0<E> tailSet(E e10, boolean z10) {
        return R(p.j(e10), z10);
    }

    /* access modifiers changed from: package-private */
    public abstract d0<E> R(E e10, boolean z10);

    /* access modifiers changed from: package-private */
    public int S(Object obj, Object obj2) {
        return T(this.f13552j, obj, obj2);
    }

    public E ceiling(E e10) {
        return f0.b(tailSet(e10, true), null);
    }

    public Comparator<? super E> comparator() {
        return this.f13552j;
    }

    public E first() {
        return iterator().next();
    }

    public E floor(E e10) {
        return g0.i(headSet(e10, true).descendingIterator(), null);
    }

    /* renamed from: g */
    public abstract k1<E> iterator();

    public E higher(E e10) {
        return f0.b(tailSet(e10, false), null);
    }

    public E last() {
        return descendingIterator().next();
    }

    public E lower(E e10) {
        return g0.i(headSet(e10, false).descendingIterator(), null);
    }

    @Deprecated
    public final E pollFirst() {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final E pollLast() {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    public Object writeReplace() {
        return new b(this.f13552j, toArray());
    }
}
