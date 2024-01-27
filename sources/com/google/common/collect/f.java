package com.google.common.collect;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: AbstractMultimap */
abstract class f<K, V> implements n0<K, V> {

    /* renamed from: h  reason: collision with root package name */
    private transient Set<K> f13558h;

    /* renamed from: i  reason: collision with root package name */
    private transient Collection<V> f13559i;

    /* renamed from: j  reason: collision with root package name */
    private transient Map<K, Collection<V>> f13560j;

    /* compiled from: AbstractMultimap */
    class a extends AbstractCollection<V> {
        a() {
        }

        public void clear() {
            f.this.clear();
        }

        public boolean contains(Object obj) {
            return f.this.b(obj);
        }

        public Iterator<V> iterator() {
            return f.this.g();
        }

        public int size() {
            return f.this.size();
        }
    }

    f() {
    }

    public Map<K, Collection<V>> a() {
        Map<K, Collection<V>> map = this.f13560j;
        if (map != null) {
            return map;
        }
        Map<K, Collection<V>> c10 = c();
        this.f13560j = c10;
        return c10;
    }

    public boolean b(Object obj) {
        for (Collection contains : a().values()) {
            if (contains.contains(obj)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public abstract Map<K, Collection<V>> c();

    /* access modifiers changed from: package-private */
    public abstract Set<K> d();

    /* access modifiers changed from: package-private */
    public abstract Collection<V> e();

    public boolean equals(Object obj) {
        return q0.a(this, obj);
    }

    public Set<K> f() {
        Set<K> set = this.f13558h;
        if (set != null) {
            return set;
        }
        Set<K> d10 = d();
        this.f13558h = d10;
        return d10;
    }

    /* access modifiers changed from: package-private */
    public abstract Iterator<V> g();

    public int hashCode() {
        return a().hashCode();
    }

    public String toString() {
        return a().toString();
    }

    public Collection<V> values() {
        Collection<V> collection = this.f13559i;
        if (collection != null) {
            return collection;
        }
        Collection<V> e10 = e();
        this.f13559i = e10;
        return e10;
    }
}
