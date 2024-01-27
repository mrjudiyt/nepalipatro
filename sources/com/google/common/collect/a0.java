package com.google.common.collect;

import com.google.common.collect.d1;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: ImmutableMultimap */
public abstract class a0<K, V> extends g<K, V> implements Serializable {

    /* renamed from: k  reason: collision with root package name */
    final transient z<K, ? extends v<V>> f13491k;

    /* renamed from: l  reason: collision with root package name */
    final transient int f13492l;

    /* compiled from: ImmutableMultimap */
    class a extends k1<V> {

        /* renamed from: h  reason: collision with root package name */
        Iterator<? extends v<V>> f13493h;

        /* renamed from: i  reason: collision with root package name */
        Iterator<V> f13494i = g0.d();

        a() {
            this.f13493h = a0.this.f13491k.values().iterator();
        }

        public boolean hasNext() {
            return this.f13494i.hasNext() || this.f13493h.hasNext();
        }

        public V next() {
            if (!this.f13494i.hasNext()) {
                this.f13494i = ((v) this.f13493h.next()).iterator();
            }
            return this.f13494i.next();
        }
    }

    /* compiled from: ImmutableMultimap */
    public static class b<K, V> {

        /* renamed from: a  reason: collision with root package name */
        final Map<K, Collection<V>> f13496a = w0.d();

        /* renamed from: b  reason: collision with root package name */
        Comparator<? super K> f13497b;

        /* renamed from: c  reason: collision with root package name */
        Comparator<? super V> f13498c;

        public a0<K, V> a() {
            Collection entrySet = this.f13496a.entrySet();
            Comparator comparator = this.f13497b;
            if (comparator != null) {
                entrySet = v0.a(comparator).d().b(entrySet);
            }
            return y.m(entrySet, this.f13498c);
        }

        /* access modifiers changed from: package-private */
        public Collection<V> b() {
            return new ArrayList();
        }

        public b<K, V> c(K k10, Iterable<? extends V> iterable) {
            if (k10 == null) {
                String valueOf = String.valueOf(f0.g(iterable));
                throw new NullPointerException(valueOf.length() != 0 ? "null key in entry: null=".concat(valueOf) : new String("null key in entry: null="));
            }
            Collection collection = this.f13496a.get(k10);
            if (collection != null) {
                for (Object next : iterable) {
                    i.a(k10, next);
                    collection.add(next);
                }
                return this;
            }
            Iterator<? extends V> it = iterable.iterator();
            if (!it.hasNext()) {
                return this;
            }
            Collection b10 = b();
            while (it.hasNext()) {
                Object next2 = it.next();
                i.a(k10, next2);
                b10.add(next2);
            }
            this.f13496a.put(k10, b10);
            return this;
        }

        public b<K, V> d(K k10, V... vArr) {
            return c(k10, Arrays.asList(vArr));
        }
    }

    /* compiled from: ImmutableMultimap */
    static class c {

        /* renamed from: a  reason: collision with root package name */
        static final d1.b<a0> f13499a = d1.a(a0.class, "map");

        /* renamed from: b  reason: collision with root package name */
        static final d1.b<a0> f13500b = d1.a(a0.class, "size");
    }

    /* compiled from: ImmutableMultimap */
    private static final class d<K, V> extends v<V> {

        /* renamed from: i  reason: collision with root package name */
        private final transient a0<K, V> f13501i;

        d(a0<K, V> a0Var) {
            this.f13501i = a0Var;
        }

        /* access modifiers changed from: package-private */
        public int b(Object[] objArr, int i10) {
            k1<? extends v<V>> g10 = this.f13501i.f13491k.values().iterator();
            while (g10.hasNext()) {
                i10 = ((v) g10.next()).b(objArr, i10);
            }
            return i10;
        }

        public boolean contains(Object obj) {
            return this.f13501i.b(obj);
        }

        /* renamed from: g */
        public k1<V> iterator() {
            return this.f13501i.g();
        }

        public int size() {
            return this.f13501i.size();
        }
    }

    a0(z<K, ? extends v<V>> zVar, int i10) {
        this.f13491k = zVar;
        this.f13492l = i10;
    }

    public boolean b(Object obj) {
        return obj != null && super.b(obj);
    }

    /* access modifiers changed from: package-private */
    public Map<K, Collection<V>> c() {
        throw new AssertionError("should never be called");
    }

    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    public Set<K> d() {
        throw new AssertionError("unreachable");
    }

    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    /* renamed from: h */
    public z<K, Collection<V>> a() {
        return this.f13491k;
    }

    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public v<V> e() {
        return new d(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public k1<V> g() {
        return new a();
    }

    /* renamed from: k */
    public v<V> values() {
        return (v) super.values();
    }

    @Deprecated
    public final boolean put(K k10, V v10) {
        throw new UnsupportedOperationException();
    }

    public int size() {
        return this.f13492l;
    }

    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }
}
