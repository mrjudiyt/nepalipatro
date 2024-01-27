package androidx.collection;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: ArrayMap */
public class a<K, V> extends h<K, V> implements Map<K, V> {

    /* renamed from: o  reason: collision with root package name */
    g<K, V> f1417o;

    /* renamed from: androidx.collection.a$a  reason: collision with other inner class name */
    /* compiled from: ArrayMap */
    class C0016a extends g<K, V> {
        C0016a() {
        }

        /* access modifiers changed from: protected */
        public void a() {
            a.this.clear();
        }

        /* access modifiers changed from: protected */
        public Object b(int i10, int i11) {
            return a.this.f1462i[(i10 << 1) + i11];
        }

        /* access modifiers changed from: protected */
        public Map<K, V> c() {
            return a.this;
        }

        /* access modifiers changed from: protected */
        public int d() {
            return a.this.f1463j;
        }

        /* access modifiers changed from: protected */
        public int e(Object obj) {
            return a.this.f(obj);
        }

        /* access modifiers changed from: protected */
        public int f(Object obj) {
            return a.this.h(obj);
        }

        /* access modifiers changed from: protected */
        public void g(K k10, V v10) {
            a.this.put(k10, v10);
        }

        /* access modifiers changed from: protected */
        public void h(int i10) {
            a.this.k(i10);
        }

        /* access modifiers changed from: protected */
        public V i(int i10, V v10) {
            return a.this.l(i10, v10);
        }
    }

    public a() {
    }

    private g<K, V> n() {
        if (this.f1417o == null) {
            this.f1417o = new C0016a();
        }
        return this.f1417o;
    }

    public Set<Map.Entry<K, V>> entrySet() {
        return n().l();
    }

    public Set<K> keySet() {
        return n().m();
    }

    public boolean o(Collection<?> collection) {
        return g.p(this, collection);
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        c(this.f1463j + map.size());
        for (Map.Entry next : map.entrySet()) {
            put(next.getKey(), next.getValue());
        }
    }

    public Collection<V> values() {
        return n().n();
    }

    public a(int i10) {
        super(i10);
    }

    public a(h hVar) {
        super(hVar);
    }
}
