package com.google.common.collect;

import com.google.android.gms.common.api.Api;
import com.google.common.collect.f1;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import l6.h;
import l6.l;
import l6.p;

/* compiled from: Maps */
public final class m0 {

    /* compiled from: Maps */
    class a extends j1<Map.Entry<K, V>, V> {
        a(Iterator it) {
            super(it);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public V b(Map.Entry<K, V> entry) {
            return entry.getValue();
        }
    }

    /* compiled from: Maps */
    private enum b implements h<Map.Entry<?, ?>, Object> {
        KEY {
            /* renamed from: d */
            public Object apply(Map.Entry<?, ?> entry) {
                return entry.getKey();
            }
        },
        VALUE {
            /* renamed from: d */
            public Object apply(Map.Entry<?, ?> entry) {
                return entry.getValue();
            }
        };
    }

    /* compiled from: Maps */
    static abstract class c<K, V> extends f1.b<Map.Entry<K, V>> {
        c() {
        }

        /* access modifiers changed from: package-private */
        public abstract Map<K, V> a();

        public void clear() {
            a().clear();
        }

        public abstract boolean contains(Object obj);

        public boolean isEmpty() {
            return a().isEmpty();
        }

        public boolean removeAll(Collection<?> collection) {
            try {
                return super.removeAll((Collection) p.j(collection));
            } catch (UnsupportedOperationException unused) {
                return f1.h(this, collection.iterator());
            }
        }

        public boolean retainAll(Collection<?> collection) {
            try {
                return super.retainAll((Collection) p.j(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet e10 = f1.e(collection.size());
                for (Object next : collection) {
                    if (contains(next) && (next instanceof Map.Entry)) {
                        e10.add(((Map.Entry) next).getKey());
                    }
                }
                return a().keySet().retainAll(e10);
            }
        }

        public int size() {
            return a().size();
        }
    }

    /* compiled from: Maps */
    static class d<K, V> extends f1.b<K> {

        /* renamed from: h  reason: collision with root package name */
        final Map<K, V> f13676h;

        d(Map<K, V> map) {
            this.f13676h = (Map) p.j(map);
        }

        /* access modifiers changed from: package-private */
        public Map<K, V> a() {
            return this.f13676h;
        }

        public boolean contains(Object obj) {
            return a().containsKey(obj);
        }

        public boolean isEmpty() {
            return a().isEmpty();
        }

        public int size() {
            return a().size();
        }
    }

    /* compiled from: Maps */
    static class e<K, V> extends AbstractCollection<V> {

        /* renamed from: h  reason: collision with root package name */
        final Map<K, V> f13677h;

        e(Map<K, V> map) {
            this.f13677h = (Map) p.j(map);
        }

        /* access modifiers changed from: package-private */
        public final Map<K, V> a() {
            return this.f13677h;
        }

        public void clear() {
            a().clear();
        }

        public boolean contains(Object obj) {
            return a().containsValue(obj);
        }

        public boolean isEmpty() {
            return a().isEmpty();
        }

        public Iterator<V> iterator() {
            return m0.k(a().entrySet().iterator());
        }

        public boolean remove(Object obj) {
            try {
                return super.remove(obj);
            } catch (UnsupportedOperationException unused) {
                for (Map.Entry entry : a().entrySet()) {
                    if (l.a(obj, entry.getValue())) {
                        a().remove(entry.getKey());
                        return true;
                    }
                }
                return false;
            }
        }

        public boolean removeAll(Collection<?> collection) {
            try {
                return super.removeAll((Collection) p.j(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet d10 = f1.d();
                for (Map.Entry entry : a().entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        d10.add(entry.getKey());
                    }
                }
                return a().keySet().removeAll(d10);
            }
        }

        public boolean retainAll(Collection<?> collection) {
            try {
                return super.retainAll((Collection) p.j(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet d10 = f1.d();
                for (Map.Entry entry : a().entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        d10.add(entry.getKey());
                    }
                }
                return a().keySet().retainAll(d10);
            }
        }

        public int size() {
            return a().size();
        }
    }

    /* compiled from: Maps */
    static abstract class f<K, V> extends AbstractMap<K, V> {

        /* renamed from: h  reason: collision with root package name */
        private transient Set<Map.Entry<K, V>> f13678h;

        /* renamed from: i  reason: collision with root package name */
        private transient Collection<V> f13679i;

        f() {
        }

        /* access modifiers changed from: package-private */
        public abstract Set<Map.Entry<K, V>> a();

        /* access modifiers changed from: package-private */
        public Collection<V> b() {
            return new e(this);
        }

        public Set<Map.Entry<K, V>> entrySet() {
            Set<Map.Entry<K, V>> set = this.f13678h;
            if (set != null) {
                return set;
            }
            Set<Map.Entry<K, V>> a10 = a();
            this.f13678h = a10;
            return a10;
        }

        public Collection<V> values() {
            Collection<V> collection = this.f13679i;
            if (collection != null) {
                return collection;
            }
            Collection<V> b10 = b();
            this.f13679i = b10;
            return b10;
        }
    }

    static int a(int i10) {
        if (i10 >= 3) {
            return i10 < 1073741824 ? (int) ((((float) i10) / 0.75f) + 1.0f) : Api.BaseClientBuilder.API_PRIORITY_OTHER;
        }
        i.b(i10, "expectedSize");
        return i10 + 1;
    }

    static boolean b(Map<?, ?> map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    public static <K, V> Map.Entry<K, V> c(K k10, V v10) {
        return new w(k10, v10);
    }

    static <K> h<Map.Entry<K, ?>, K> d() {
        return b.KEY;
    }

    public static <K, V> IdentityHashMap<K, V> e() {
        return new IdentityHashMap<>();
    }

    static boolean f(Map<?, ?> map, Object obj) {
        p.j(map);
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    static <V> V g(Map<?, V> map, Object obj) {
        p.j(map);
        try {
            return map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    static <V> V h(Map<?, V> map, Object obj) {
        p.j(map);
        try {
            return map.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    static String i(Map<?, ?> map) {
        StringBuilder a10 = j.a(map.size());
        a10.append('{');
        boolean z10 = true;
        for (Map.Entry next : map.entrySet()) {
            if (!z10) {
                a10.append(", ");
            }
            z10 = false;
            a10.append(next.getKey());
            a10.append('=');
            a10.append(next.getValue());
        }
        a10.append('}');
        return a10.toString();
    }

    static <V> h<Map.Entry<?, V>, V> j() {
        return b.VALUE;
    }

    static <K, V> Iterator<V> k(Iterator<Map.Entry<K, V>> it) {
        return new a(it);
    }
}
