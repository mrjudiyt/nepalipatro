package com.google.common.collect;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import l6.p;

/* compiled from: RegularImmutableSortedSet */
final class a1<E> extends d0<E> {

    /* renamed from: m  reason: collision with root package name */
    static final a1<Comparable> f13502m = new a1<>(x.s(), v0.c());

    /* renamed from: l  reason: collision with root package name */
    final transient x<E> f13503l;

    a1(x<E> xVar, Comparator<? super E> comparator) {
        super(comparator);
        this.f13503l = xVar;
    }

    private int X(Object obj) {
        return Collections.binarySearch(this.f13503l, obj, Z());
    }

    /* access modifiers changed from: package-private */
    public d0<E> C() {
        Comparator<? super E> reverseOrder = Collections.reverseOrder(this.f13552j);
        if (isEmpty()) {
            return d0.G(reverseOrder);
        }
        return new a1(this.f13503l.A(), reverseOrder);
    }

    /* renamed from: D */
    public k1<E> descendingIterator() {
        return this.f13503l.A().iterator();
    }

    /* access modifiers changed from: package-private */
    public d0<E> K(E e10, boolean z10) {
        return U(0, V(e10, z10));
    }

    /* access modifiers changed from: package-private */
    public d0<E> O(E e10, boolean z10, E e11, boolean z11) {
        return R(e10, z10).K(e11, z11);
    }

    /* access modifiers changed from: package-private */
    public d0<E> R(E e10, boolean z10) {
        return U(W(e10, z10), size());
    }

    /* access modifiers changed from: package-private */
    public a1<E> U(int i10, int i11) {
        if (i10 == 0 && i11 == size()) {
            return this;
        }
        if (i10 < i11) {
            return new a1<>(this.f13503l.subList(i10, i11), this.f13552j);
        }
        return d0.G(this.f13552j);
    }

    /* access modifiers changed from: package-private */
    public int V(E e10, boolean z10) {
        int binarySearch = Collections.binarySearch(this.f13503l, p.j(e10), comparator());
        if (binarySearch >= 0) {
            return z10 ? binarySearch + 1 : binarySearch;
        }
        return ~binarySearch;
    }

    /* access modifiers changed from: package-private */
    public int W(E e10, boolean z10) {
        int binarySearch = Collections.binarySearch(this.f13503l, p.j(e10), comparator());
        if (binarySearch >= 0) {
            return z10 ? binarySearch : binarySearch + 1;
        }
        return ~binarySearch;
    }

    /* access modifiers changed from: package-private */
    public Comparator<Object> Z() {
        return this.f13552j;
    }

    public x<E> a() {
        return this.f13503l;
    }

    /* access modifiers changed from: package-private */
    public int b(Object[] objArr, int i10) {
        return this.f13503l.b(objArr, i10);
    }

    /* access modifiers changed from: package-private */
    public Object[] c() {
        return this.f13503l.c();
    }

    public E ceiling(E e10) {
        int W = W(e10, true);
        if (W == size()) {
            return null;
        }
        return this.f13503l.get(W);
    }

    public boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return X(obj) >= 0;
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public boolean containsAll(Collection<?> collection) {
        if (collection instanceof r0) {
            collection = ((r0) collection).j();
        }
        if (!i1.b(comparator(), collection) || collection.size() <= 1) {
            return super.containsAll(collection);
        }
        k1 g10 = iterator();
        Iterator<?> it = collection.iterator();
        if (!g10.hasNext()) {
            return false;
        }
        Object next = it.next();
        Object next2 = g10.next();
        while (true) {
            try {
                int S = S(next2, next);
                if (S < 0) {
                    if (!g10.hasNext()) {
                        return false;
                    }
                    next2 = g10.next();
                } else if (S == 0) {
                    if (!it.hasNext()) {
                        return true;
                    }
                    next = it.next();
                } else if (S > 0) {
                    break;
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public int d() {
        return this.f13503l.d();
    }

    /* access modifiers changed from: package-private */
    public int e() {
        return this.f13503l.e();
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0034 A[Catch:{ ClassCastException | NoSuchElementException -> 0x0046 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r0 = 1
            if (r6 != r5) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r6 instanceof java.util.Set
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            java.util.Set r6 = (java.util.Set) r6
            int r1 = r5.size()
            int r3 = r6.size()
            if (r1 == r3) goto L_0x0017
            return r2
        L_0x0017:
            boolean r1 = r5.isEmpty()
            if (r1 == 0) goto L_0x001e
            return r0
        L_0x001e:
            java.util.Comparator<? super E> r1 = r5.f13552j
            boolean r1 = com.google.common.collect.i1.b(r1, r6)
            if (r1 == 0) goto L_0x0047
            java.util.Iterator r6 = r6.iterator()
            com.google.common.collect.k1 r1 = r5.iterator()     // Catch:{ ClassCastException | NoSuchElementException -> 0x0046 }
        L_0x002e:
            boolean r3 = r1.hasNext()     // Catch:{ ClassCastException | NoSuchElementException -> 0x0046 }
            if (r3 == 0) goto L_0x0045
            java.lang.Object r3 = r1.next()     // Catch:{ ClassCastException | NoSuchElementException -> 0x0046 }
            java.lang.Object r4 = r6.next()     // Catch:{ ClassCastException | NoSuchElementException -> 0x0046 }
            if (r4 == 0) goto L_0x0044
            int r3 = r5.S(r3, r4)     // Catch:{ ClassCastException | NoSuchElementException -> 0x0046 }
            if (r3 == 0) goto L_0x002e
        L_0x0044:
            return r2
        L_0x0045:
            return r0
        L_0x0046:
            return r2
        L_0x0047:
            boolean r6 = r5.containsAll(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.a1.equals(java.lang.Object):boolean");
    }

    /* access modifiers changed from: package-private */
    public boolean f() {
        return this.f13503l.f();
    }

    public E first() {
        if (!isEmpty()) {
            return this.f13503l.get(0);
        }
        throw new NoSuchElementException();
    }

    public E floor(E e10) {
        int V = V(e10, true) - 1;
        if (V == -1) {
            return null;
        }
        return this.f13503l.get(V);
    }

    /* renamed from: g */
    public k1<E> iterator() {
        return this.f13503l.iterator();
    }

    public E higher(E e10) {
        int W = W(e10, false);
        if (W == size()) {
            return null;
        }
        return this.f13503l.get(W);
    }

    public E last() {
        if (!isEmpty()) {
            return this.f13503l.get(size() - 1);
        }
        throw new NoSuchElementException();
    }

    public E lower(E e10) {
        int V = V(e10, false) - 1;
        if (V == -1) {
            return null;
        }
        return this.f13503l.get(V);
    }

    public int size() {
        return this.f13503l.size();
    }
}
