package com.google.common.collect;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import l6.p;

/* compiled from: Sets */
public final class f1 {

    /* compiled from: Sets */
    class a extends c<E> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ Set f13562h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ Set f13563i;

        /* renamed from: com.google.common.collect.f1$a$a  reason: collision with other inner class name */
        /* compiled from: Sets */
        class C0235a extends b<E> {

            /* renamed from: j  reason: collision with root package name */
            final Iterator<E> f13564j;

            C0235a() {
                this.f13564j = a.this.f13562h.iterator();
            }

            /* access modifiers changed from: protected */
            public E b() {
                while (this.f13564j.hasNext()) {
                    E next = this.f13564j.next();
                    if (a.this.f13563i.contains(next)) {
                        return next;
                    }
                }
                return c();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(Set set, Set set2) {
            super((e1) null);
            this.f13562h = set;
            this.f13563i = set2;
        }

        /* renamed from: a */
        public k1<E> iterator() {
            return new C0235a();
        }

        public boolean contains(Object obj) {
            return this.f13562h.contains(obj) && this.f13563i.contains(obj);
        }

        public boolean containsAll(Collection<?> collection) {
            return this.f13562h.containsAll(collection) && this.f13563i.containsAll(collection);
        }

        public boolean isEmpty() {
            return Collections.disjoint(this.f13563i, this.f13562h);
        }

        public int size() {
            int i10 = 0;
            for (Object contains : this.f13562h) {
                if (this.f13563i.contains(contains)) {
                    i10++;
                }
            }
            return i10;
        }
    }

    /* compiled from: Sets */
    static abstract class b<E> extends AbstractSet<E> {
        b() {
        }

        public boolean removeAll(Collection<?> collection) {
            return f1.g(this, collection);
        }

        public boolean retainAll(Collection<?> collection) {
            return super.retainAll((Collection) p.j(collection));
        }
    }

    /* compiled from: Sets */
    public static abstract class c<E> extends AbstractSet<E> {
        /* synthetic */ c(e1 e1Var) {
            this();
        }

        @Deprecated
        public final boolean add(E e10) {
            throw new UnsupportedOperationException();
        }

        @Deprecated
        public final boolean addAll(Collection<? extends E> collection) {
            throw new UnsupportedOperationException();
        }

        @Deprecated
        public final void clear() {
            throw new UnsupportedOperationException();
        }

        @Deprecated
        public final boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Deprecated
        public final boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Deprecated
        public final boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        private c() {
        }
    }

    static boolean a(Set<?> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() != set2.size() || !set.containsAll(set2)) {
                    return false;
                }
                return true;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    static int b(Set<?> set) {
        Iterator<?> it = set.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i10 = ~(~(i10 + (next != null ? next.hashCode() : 0)));
        }
        return i10;
    }

    public static <E> c<E> c(Set<E> set, Set<?> set2) {
        p.k(set, "set1");
        p.k(set2, "set2");
        return new a(set, set2);
    }

    public static <E> HashSet<E> d() {
        return new HashSet<>();
    }

    public static <E> HashSet<E> e(int i10) {
        return new HashSet<>(m0.a(i10));
    }

    public static <E> Set<E> f() {
        return Collections.newSetFromMap(m0.e());
    }

    static boolean g(Set<?> set, Collection<?> collection) {
        p.j(collection);
        if (collection instanceof r0) {
            collection = ((r0) collection).j();
        }
        if (!(collection instanceof Set) || collection.size() <= set.size()) {
            return h(set, collection.iterator());
        }
        return g0.k(set.iterator(), collection);
    }

    static boolean h(Set<?> set, Iterator<?> it) {
        boolean z10 = false;
        while (it.hasNext()) {
            z10 |= set.remove(it.next());
        }
        return z10;
    }
}
