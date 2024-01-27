package androidx.collection;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* compiled from: MapCollections */
abstract class g<K, V> {

    /* renamed from: a  reason: collision with root package name */
    g<K, V>.b f1442a;

    /* renamed from: b  reason: collision with root package name */
    g<K, V>.c f1443b;

    /* renamed from: c  reason: collision with root package name */
    g<K, V>.e f1444c;

    /* compiled from: MapCollections */
    final class a<T> implements Iterator<T> {

        /* renamed from: h  reason: collision with root package name */
        final int f1445h;

        /* renamed from: i  reason: collision with root package name */
        int f1446i;

        /* renamed from: j  reason: collision with root package name */
        int f1447j;

        /* renamed from: k  reason: collision with root package name */
        boolean f1448k = false;

        a(int i10) {
            this.f1445h = i10;
            this.f1446i = g.this.d();
        }

        public boolean hasNext() {
            return this.f1447j < this.f1446i;
        }

        public T next() {
            if (hasNext()) {
                T b10 = g.this.b(this.f1447j, this.f1445h);
                this.f1447j++;
                this.f1448k = true;
                return b10;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            if (this.f1448k) {
                int i10 = this.f1447j - 1;
                this.f1447j = i10;
                this.f1446i--;
                this.f1448k = false;
                g.this.h(i10);
                return;
            }
            throw new IllegalStateException();
        }
    }

    /* compiled from: MapCollections */
    final class b implements Set<Map.Entry<K, V>> {
        b() {
        }

        /* renamed from: a */
        public boolean add(Map.Entry<K, V> entry) {
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
            int d10 = g.this.d();
            for (Map.Entry entry : collection) {
                g.this.g(entry.getKey(), entry.getValue());
            }
            return d10 != g.this.d();
        }

        public void clear() {
            g.this.a();
        }

        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int e10 = g.this.e(entry.getKey());
            if (e10 < 0) {
                return false;
            }
            return d.c(g.this.b(e10, 1), entry.getValue());
        }

        public boolean containsAll(Collection<?> collection) {
            for (Object contains : collection) {
                if (!contains(contains)) {
                    return false;
                }
            }
            return true;
        }

        public boolean equals(Object obj) {
            return g.k(this, obj);
        }

        public int hashCode() {
            int i10;
            int i11;
            int i12 = 0;
            for (int d10 = g.this.d() - 1; d10 >= 0; d10--) {
                Object b10 = g.this.b(d10, 0);
                Object b11 = g.this.b(d10, 1);
                if (b10 == null) {
                    i10 = 0;
                } else {
                    i10 = b10.hashCode();
                }
                if (b11 == null) {
                    i11 = 0;
                } else {
                    i11 = b11.hashCode();
                }
                i12 += i10 ^ i11;
            }
            return i12;
        }

        public boolean isEmpty() {
            return g.this.d() == 0;
        }

        public Iterator<Map.Entry<K, V>> iterator() {
            return new d();
        }

        public boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        public boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        public boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        public int size() {
            return g.this.d();
        }

        public Object[] toArray() {
            throw new UnsupportedOperationException();
        }

        public <T> T[] toArray(T[] tArr) {
            throw new UnsupportedOperationException();
        }
    }

    /* compiled from: MapCollections */
    final class c implements Set<K> {
        c() {
        }

        public boolean add(K k10) {
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        public void clear() {
            g.this.a();
        }

        public boolean contains(Object obj) {
            return g.this.e(obj) >= 0;
        }

        public boolean containsAll(Collection<?> collection) {
            return g.j(g.this.c(), collection);
        }

        public boolean equals(Object obj) {
            return g.k(this, obj);
        }

        public int hashCode() {
            int i10;
            int i11 = 0;
            for (int d10 = g.this.d() - 1; d10 >= 0; d10--) {
                Object b10 = g.this.b(d10, 0);
                if (b10 == null) {
                    i10 = 0;
                } else {
                    i10 = b10.hashCode();
                }
                i11 += i10;
            }
            return i11;
        }

        public boolean isEmpty() {
            return g.this.d() == 0;
        }

        public Iterator<K> iterator() {
            return new a(0);
        }

        public boolean remove(Object obj) {
            int e10 = g.this.e(obj);
            if (e10 < 0) {
                return false;
            }
            g.this.h(e10);
            return true;
        }

        public boolean removeAll(Collection<?> collection) {
            return g.o(g.this.c(), collection);
        }

        public boolean retainAll(Collection<?> collection) {
            return g.p(g.this.c(), collection);
        }

        public int size() {
            return g.this.d();
        }

        public Object[] toArray() {
            return g.this.q(0);
        }

        public <T> T[] toArray(T[] tArr) {
            return g.this.r(tArr, 0);
        }
    }

    /* compiled from: MapCollections */
    final class d implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {

        /* renamed from: h  reason: collision with root package name */
        int f1452h;

        /* renamed from: i  reason: collision with root package name */
        int f1453i;

        /* renamed from: j  reason: collision with root package name */
        boolean f1454j = false;

        d() {
            this.f1452h = g.this.d() - 1;
            this.f1453i = -1;
        }

        /* renamed from: b */
        public Map.Entry<K, V> next() {
            if (hasNext()) {
                this.f1453i++;
                this.f1454j = true;
                return this;
            }
            throw new NoSuchElementException();
        }

        public boolean equals(Object obj) {
            if (!this.f1454j) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            } else if (!(obj instanceof Map.Entry)) {
                return false;
            } else {
                Map.Entry entry = (Map.Entry) obj;
                if (!d.c(entry.getKey(), g.this.b(this.f1453i, 0)) || !d.c(entry.getValue(), g.this.b(this.f1453i, 1))) {
                    return false;
                }
                return true;
            }
        }

        public K getKey() {
            if (this.f1454j) {
                return g.this.b(this.f1453i, 0);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public V getValue() {
            if (this.f1454j) {
                return g.this.b(this.f1453i, 1);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public boolean hasNext() {
            return this.f1453i < this.f1452h;
        }

        public int hashCode() {
            int i10;
            if (this.f1454j) {
                int i11 = 0;
                Object b10 = g.this.b(this.f1453i, 0);
                Object b11 = g.this.b(this.f1453i, 1);
                if (b10 == null) {
                    i10 = 0;
                } else {
                    i10 = b10.hashCode();
                }
                if (b11 != null) {
                    i11 = b11.hashCode();
                }
                return i10 ^ i11;
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public void remove() {
            if (this.f1454j) {
                g.this.h(this.f1453i);
                this.f1453i--;
                this.f1452h--;
                this.f1454j = false;
                return;
            }
            throw new IllegalStateException();
        }

        public V setValue(V v10) {
            if (this.f1454j) {
                return g.this.i(this.f1453i, v10);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public String toString() {
            return getKey() + "=" + getValue();
        }
    }

    /* compiled from: MapCollections */
    final class e implements Collection<V> {
        e() {
        }

        public boolean add(V v10) {
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        public void clear() {
            g.this.a();
        }

        public boolean contains(Object obj) {
            return g.this.f(obj) >= 0;
        }

        public boolean containsAll(Collection<?> collection) {
            for (Object contains : collection) {
                if (!contains(contains)) {
                    return false;
                }
            }
            return true;
        }

        public boolean isEmpty() {
            return g.this.d() == 0;
        }

        public Iterator<V> iterator() {
            return new a(1);
        }

        public boolean remove(Object obj) {
            int f10 = g.this.f(obj);
            if (f10 < 0) {
                return false;
            }
            g.this.h(f10);
            return true;
        }

        public boolean removeAll(Collection<?> collection) {
            int d10 = g.this.d();
            int i10 = 0;
            boolean z10 = false;
            while (i10 < d10) {
                if (collection.contains(g.this.b(i10, 1))) {
                    g.this.h(i10);
                    i10--;
                    d10--;
                    z10 = true;
                }
                i10++;
            }
            return z10;
        }

        public boolean retainAll(Collection<?> collection) {
            int d10 = g.this.d();
            int i10 = 0;
            boolean z10 = false;
            while (i10 < d10) {
                if (!collection.contains(g.this.b(i10, 1))) {
                    g.this.h(i10);
                    i10--;
                    d10--;
                    z10 = true;
                }
                i10++;
            }
            return z10;
        }

        public int size() {
            return g.this.d();
        }

        public Object[] toArray() {
            return g.this.q(1);
        }

        public <T> T[] toArray(T[] tArr) {
            return g.this.r(tArr, 1);
        }
    }

    g() {
    }

    public static <K, V> boolean j(Map<K, V> map, Collection<?> collection) {
        for (Object containsKey : collection) {
            if (!map.containsKey(containsKey)) {
                return false;
            }
        }
        return true;
    }

    public static <T> boolean k(Set<T> set, Object obj) {
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

    public static <K, V> boolean o(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        for (Object remove : collection) {
            map.remove(remove);
        }
        return size != map.size();
    }

    public static <K, V> boolean p(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<K> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    /* access modifiers changed from: protected */
    public abstract void a();

    /* access modifiers changed from: protected */
    public abstract Object b(int i10, int i11);

    /* access modifiers changed from: protected */
    public abstract Map<K, V> c();

    /* access modifiers changed from: protected */
    public abstract int d();

    /* access modifiers changed from: protected */
    public abstract int e(Object obj);

    /* access modifiers changed from: protected */
    public abstract int f(Object obj);

    /* access modifiers changed from: protected */
    public abstract void g(K k10, V v10);

    /* access modifiers changed from: protected */
    public abstract void h(int i10);

    /* access modifiers changed from: protected */
    public abstract V i(int i10, V v10);

    public Set<Map.Entry<K, V>> l() {
        if (this.f1442a == null) {
            this.f1442a = new b();
        }
        return this.f1442a;
    }

    public Set<K> m() {
        if (this.f1443b == null) {
            this.f1443b = new c();
        }
        return this.f1443b;
    }

    public Collection<V> n() {
        if (this.f1444c == null) {
            this.f1444c = new e();
        }
        return this.f1444c;
    }

    public Object[] q(int i10) {
        int d10 = d();
        Object[] objArr = new Object[d10];
        for (int i11 = 0; i11 < d10; i11++) {
            objArr[i11] = b(i11, i10);
        }
        return objArr;
    }

    public <T> T[] r(T[] tArr, int i10) {
        int d10 = d();
        if (tArr.length < d10) {
            tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), d10);
        }
        for (int i11 = 0; i11 < d10; i11++) {
            tArr[i11] = b(i11, i10);
        }
        if (tArr.length > d10) {
            tArr[d10] = null;
        }
        return tArr;
    }
}
