package com.google.common.collect;

import com.google.common.collect.f;
import com.google.common.collect.m0;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import l6.p;

/* compiled from: AbstractMapBasedMultimap */
abstract class d<K, V> extends f<K, V> implements Serializable {
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public transient Map<K, Collection<V>> f13520k;

    /* renamed from: l  reason: collision with root package name */
    private transient int f13521l;

    /* compiled from: AbstractMapBasedMultimap */
    class a extends d<K, V>.c<V> {
        a(d dVar) {
            super();
        }

        /* access modifiers changed from: package-private */
        public V b(K k10, V v10) {
            return v10;
        }
    }

    /* compiled from: AbstractMapBasedMultimap */
    private class b extends m0.f<K, Collection<V>> {

        /* renamed from: j  reason: collision with root package name */
        final transient Map<K, Collection<V>> f13522j;

        /* compiled from: AbstractMapBasedMultimap */
        class a extends m0.c<K, Collection<V>> {
            a() {
            }

            /* access modifiers changed from: package-private */
            public Map<K, Collection<V>> a() {
                return b.this;
            }

            public boolean contains(Object obj) {
                return j.b(b.this.f13522j.entrySet(), obj);
            }

            public Iterator<Map.Entry<K, Collection<V>>> iterator() {
                return new C0233b();
            }

            public boolean remove(Object obj) {
                if (!contains(obj)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Objects.requireNonNull(entry);
                d.this.u(entry.getKey());
                return true;
            }
        }

        /* renamed from: com.google.common.collect.d$b$b  reason: collision with other inner class name */
        /* compiled from: AbstractMapBasedMultimap */
        class C0233b implements Iterator<Map.Entry<K, Collection<V>>> {

            /* renamed from: h  reason: collision with root package name */
            final Iterator<Map.Entry<K, Collection<V>>> f13525h;

            /* renamed from: i  reason: collision with root package name */
            Collection<V> f13526i;

            C0233b() {
                this.f13525h = b.this.f13522j.entrySet().iterator();
            }

            /* renamed from: b */
            public Map.Entry<K, Collection<V>> next() {
                Map.Entry next = this.f13525h.next();
                this.f13526i = (Collection) next.getValue();
                return b.this.e(next);
            }

            public boolean hasNext() {
                return this.f13525h.hasNext();
            }

            public void remove() {
                p.p(this.f13526i != null, "no calls to next() since the last call to remove()");
                this.f13525h.remove();
                d.m(d.this, this.f13526i.size());
                this.f13526i.clear();
                this.f13526i = null;
            }
        }

        b(Map<K, Collection<V>> map) {
            this.f13522j = map;
        }

        /* access modifiers changed from: protected */
        public Set<Map.Entry<K, Collection<V>>> a() {
            return new a();
        }

        /* renamed from: c */
        public Collection<V> get(Object obj) {
            Collection collection = (Collection) m0.g(this.f13522j, obj);
            if (collection == null) {
                return null;
            }
            return d.this.x(obj, collection);
        }

        public void clear() {
            if (this.f13522j == d.this.f13520k) {
                d.this.clear();
            } else {
                g0.b(new C0233b());
            }
        }

        public boolean containsKey(Object obj) {
            return m0.f(this.f13522j, obj);
        }

        /* renamed from: d */
        public Collection<V> remove(Object obj) {
            Collection remove = this.f13522j.remove(obj);
            if (remove == null) {
                return null;
            }
            Collection<V> p10 = d.this.p();
            p10.addAll(remove);
            d.m(d.this, remove.size());
            remove.clear();
            return p10;
        }

        /* access modifiers changed from: package-private */
        public Map.Entry<K, Collection<V>> e(Map.Entry<K, Collection<V>> entry) {
            K key = entry.getKey();
            return m0.c(key, d.this.x(key, entry.getValue()));
        }

        public boolean equals(Object obj) {
            return this == obj || this.f13522j.equals(obj);
        }

        public int hashCode() {
            return this.f13522j.hashCode();
        }

        public Set<K> keySet() {
            return d.this.f();
        }

        public int size() {
            return this.f13522j.size();
        }

        public String toString() {
            return this.f13522j.toString();
        }
    }

    /* compiled from: AbstractMapBasedMultimap */
    private abstract class c<T> implements Iterator<T> {

        /* renamed from: h  reason: collision with root package name */
        final Iterator<Map.Entry<K, Collection<V>>> f13528h;

        /* renamed from: i  reason: collision with root package name */
        K f13529i = null;

        /* renamed from: j  reason: collision with root package name */
        Collection<V> f13530j = null;

        /* renamed from: k  reason: collision with root package name */
        Iterator<V> f13531k = g0.f();

        c() {
            this.f13528h = d.this.f13520k.entrySet().iterator();
        }

        /* access modifiers changed from: package-private */
        public abstract T b(K k10, V v10);

        public boolean hasNext() {
            return this.f13528h.hasNext() || this.f13531k.hasNext();
        }

        public T next() {
            if (!this.f13531k.hasNext()) {
                Map.Entry next = this.f13528h.next();
                this.f13529i = next.getKey();
                Collection<V> collection = (Collection) next.getValue();
                this.f13530j = collection;
                this.f13531k = collection.iterator();
            }
            return b(t0.a(this.f13529i), this.f13531k.next());
        }

        public void remove() {
            this.f13531k.remove();
            Collection<V> collection = this.f13530j;
            Objects.requireNonNull(collection);
            if (collection.isEmpty()) {
                this.f13528h.remove();
            }
            d.k(d.this);
        }
    }

    /* renamed from: com.google.common.collect.d$d  reason: collision with other inner class name */
    /* compiled from: AbstractMapBasedMultimap */
    private class C0234d extends m0.d<K, Collection<V>> {

        /* renamed from: com.google.common.collect.d$d$a */
        /* compiled from: AbstractMapBasedMultimap */
        class a implements Iterator<K> {

            /* renamed from: h  reason: collision with root package name */
            Map.Entry<K, Collection<V>> f13534h;

            /* renamed from: i  reason: collision with root package name */
            final /* synthetic */ Iterator f13535i;

            a(Iterator it) {
                this.f13535i = it;
            }

            public boolean hasNext() {
                return this.f13535i.hasNext();
            }

            public K next() {
                Map.Entry<K, Collection<V>> entry = (Map.Entry) this.f13535i.next();
                this.f13534h = entry;
                return entry.getKey();
            }

            public void remove() {
                p.p(this.f13534h != null, "no calls to next() since the last call to remove()");
                Collection value = this.f13534h.getValue();
                this.f13535i.remove();
                d.m(d.this, value.size());
                value.clear();
                this.f13534h = null;
            }
        }

        C0234d(Map<K, Collection<V>> map) {
            super(map);
        }

        public void clear() {
            g0.b(iterator());
        }

        public boolean containsAll(Collection<?> collection) {
            return a().keySet().containsAll(collection);
        }

        public boolean equals(Object obj) {
            return this == obj || a().keySet().equals(obj);
        }

        public int hashCode() {
            return a().keySet().hashCode();
        }

        public Iterator<K> iterator() {
            return new a(a().entrySet().iterator());
        }

        public boolean remove(Object obj) {
            int i10;
            Collection collection = (Collection) a().remove(obj);
            if (collection != null) {
                i10 = collection.size();
                collection.clear();
                d.m(d.this, i10);
            } else {
                i10 = 0;
            }
            if (i10 > 0) {
                return true;
            }
            return false;
        }
    }

    /* compiled from: AbstractMapBasedMultimap */
    class e extends d<K, V>.h implements NavigableMap<K, Collection<V>> {
        e(NavigableMap<K, Collection<V>> navigableMap) {
            super(navigableMap);
        }

        public Map.Entry<K, Collection<V>> ceilingEntry(K k10) {
            Map.Entry ceilingEntry = h().ceilingEntry(k10);
            if (ceilingEntry == null) {
                return null;
            }
            return e(ceilingEntry);
        }

        public K ceilingKey(K k10) {
            return h().ceilingKey(k10);
        }

        public NavigableSet<K> descendingKeySet() {
            return descendingMap().navigableKeySet();
        }

        public NavigableMap<K, Collection<V>> descendingMap() {
            return new e(h().descendingMap());
        }

        public Map.Entry<K, Collection<V>> firstEntry() {
            Map.Entry firstEntry = h().firstEntry();
            if (firstEntry == null) {
                return null;
            }
            return e(firstEntry);
        }

        public Map.Entry<K, Collection<V>> floorEntry(K k10) {
            Map.Entry floorEntry = h().floorEntry(k10);
            if (floorEntry == null) {
                return null;
            }
            return e(floorEntry);
        }

        public K floorKey(K k10) {
            return h().floorKey(k10);
        }

        public Map.Entry<K, Collection<V>> higherEntry(K k10) {
            Map.Entry higherEntry = h().higherEntry(k10);
            if (higherEntry == null) {
                return null;
            }
            return e(higherEntry);
        }

        public K higherKey(K k10) {
            return h().higherKey(k10);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public NavigableSet<K> f() {
            return new f(h());
        }

        /* renamed from: j */
        public NavigableMap<K, Collection<V>> headMap(K k10) {
            return headMap(k10, false);
        }

        /* renamed from: k */
        public NavigableSet<K> keySet() {
            return (NavigableSet) super.keySet();
        }

        /* access modifiers changed from: package-private */
        public Map.Entry<K, Collection<V>> l(Iterator<Map.Entry<K, Collection<V>>> it) {
            if (!it.hasNext()) {
                return null;
            }
            Map.Entry next = it.next();
            Collection p10 = d.this.p();
            p10.addAll((Collection) next.getValue());
            it.remove();
            return m0.c(next.getKey(), d.this.w(p10));
        }

        public Map.Entry<K, Collection<V>> lastEntry() {
            Map.Entry lastEntry = h().lastEntry();
            if (lastEntry == null) {
                return null;
            }
            return e(lastEntry);
        }

        public Map.Entry<K, Collection<V>> lowerEntry(K k10) {
            Map.Entry lowerEntry = h().lowerEntry(k10);
            if (lowerEntry == null) {
                return null;
            }
            return e(lowerEntry);
        }

        public K lowerKey(K k10) {
            return h().lowerKey(k10);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: m */
        public NavigableMap<K, Collection<V>> h() {
            return (NavigableMap) super.h();
        }

        /* renamed from: n */
        public NavigableMap<K, Collection<V>> subMap(K k10, K k11) {
            return subMap(k10, true, k11, false);
        }

        public NavigableSet<K> navigableKeySet() {
            return keySet();
        }

        /* renamed from: o */
        public NavigableMap<K, Collection<V>> tailMap(K k10) {
            return tailMap(k10, true);
        }

        public Map.Entry<K, Collection<V>> pollFirstEntry() {
            return l(entrySet().iterator());
        }

        public Map.Entry<K, Collection<V>> pollLastEntry() {
            return l(descendingMap().entrySet().iterator());
        }

        public NavigableMap<K, Collection<V>> headMap(K k10, boolean z10) {
            return new e(h().headMap(k10, z10));
        }

        public NavigableMap<K, Collection<V>> subMap(K k10, boolean z10, K k11, boolean z11) {
            return new e(h().subMap(k10, z10, k11, z11));
        }

        public NavigableMap<K, Collection<V>> tailMap(K k10, boolean z10) {
            return new e(h().tailMap(k10, z10));
        }
    }

    /* compiled from: AbstractMapBasedMultimap */
    class f extends d<K, V>.i implements NavigableSet<K> {
        f(NavigableMap<K, Collection<V>> navigableMap) {
            super(navigableMap);
        }

        /* renamed from: c */
        public NavigableSet<K> headSet(K k10) {
            return headSet(k10, false);
        }

        public K ceiling(K k10) {
            return b().ceilingKey(k10);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public NavigableMap<K, Collection<V>> b() {
            return (NavigableMap) super.b();
        }

        public Iterator<K> descendingIterator() {
            return descendingSet().iterator();
        }

        public NavigableSet<K> descendingSet() {
            return new f(b().descendingMap());
        }

        /* renamed from: e */
        public NavigableSet<K> subSet(K k10, K k11) {
            return subSet(k10, true, k11, false);
        }

        /* renamed from: f */
        public NavigableSet<K> tailSet(K k10) {
            return tailSet(k10, true);
        }

        public K floor(K k10) {
            return b().floorKey(k10);
        }

        public K higher(K k10) {
            return b().higherKey(k10);
        }

        public K lower(K k10) {
            return b().lowerKey(k10);
        }

        public K pollFirst() {
            return g0.j(iterator());
        }

        public K pollLast() {
            return g0.j(descendingIterator());
        }

        public NavigableSet<K> headSet(K k10, boolean z10) {
            return new f(b().headMap(k10, z10));
        }

        public NavigableSet<K> subSet(K k10, boolean z10, K k11, boolean z11) {
            return new f(b().subMap(k10, z10, k11, z11));
        }

        public NavigableSet<K> tailSet(K k10, boolean z10) {
            return new f(b().tailMap(k10, z10));
        }
    }

    /* compiled from: AbstractMapBasedMultimap */
    private class g extends d<K, V>.k implements RandomAccess {
        g(d dVar, K k10, List<V> list, d<K, V>.j jVar) {
            super(k10, list, jVar);
        }
    }

    /* compiled from: AbstractMapBasedMultimap */
    private class h extends d<K, V>.b implements SortedMap<K, Collection<V>> {

        /* renamed from: l  reason: collision with root package name */
        SortedSet<K> f13539l;

        h(SortedMap<K, Collection<V>> sortedMap) {
            super(sortedMap);
        }

        public Comparator<? super K> comparator() {
            return h().comparator();
        }

        /* access modifiers changed from: package-private */
        public SortedSet<K> f() {
            return new i(h());
        }

        public K firstKey() {
            return h().firstKey();
        }

        /* renamed from: g */
        public SortedSet<K> keySet() {
            SortedSet<K> sortedSet = this.f13539l;
            if (sortedSet != null) {
                return sortedSet;
            }
            SortedSet<K> f10 = f();
            this.f13539l = f10;
            return f10;
        }

        /* access modifiers changed from: package-private */
        public SortedMap<K, Collection<V>> h() {
            return (SortedMap) this.f13522j;
        }

        public SortedMap<K, Collection<V>> headMap(K k10) {
            return new h(h().headMap(k10));
        }

        public K lastKey() {
            return h().lastKey();
        }

        public SortedMap<K, Collection<V>> subMap(K k10, K k11) {
            return new h(h().subMap(k10, k11));
        }

        public SortedMap<K, Collection<V>> tailMap(K k10) {
            return new h(h().tailMap(k10));
        }
    }

    /* compiled from: AbstractMapBasedMultimap */
    private class i extends d<K, V>.d implements SortedSet<K> {
        i(SortedMap<K, Collection<V>> sortedMap) {
            super(sortedMap);
        }

        /* access modifiers changed from: package-private */
        public SortedMap<K, Collection<V>> b() {
            return (SortedMap) super.a();
        }

        public Comparator<? super K> comparator() {
            return b().comparator();
        }

        public K first() {
            return b().firstKey();
        }

        public SortedSet<K> headSet(K k10) {
            return new i(b().headMap(k10));
        }

        public K last() {
            return b().lastKey();
        }

        public SortedSet<K> subSet(K k10, K k11) {
            return new i(b().subMap(k10, k11));
        }

        public SortedSet<K> tailSet(K k10) {
            return new i(b().tailMap(k10));
        }
    }

    protected d(Map<K, Collection<V>> map) {
        p.d(map.isEmpty());
        this.f13520k = map;
    }

    static /* synthetic */ int j(d dVar) {
        int i10 = dVar.f13521l;
        dVar.f13521l = i10 + 1;
        return i10;
    }

    static /* synthetic */ int k(d dVar) {
        int i10 = dVar.f13521l;
        dVar.f13521l = i10 - 1;
        return i10;
    }

    static /* synthetic */ int l(d dVar, int i10) {
        int i11 = dVar.f13521l + i10;
        dVar.f13521l = i11;
        return i11;
    }

    static /* synthetic */ int m(d dVar, int i10) {
        int i11 = dVar.f13521l - i10;
        dVar.f13521l = i11;
        return i11;
    }

    /* access modifiers changed from: private */
    public static <E> Iterator<E> t(Collection<E> collection) {
        if (collection instanceof List) {
            return ((List) collection).listIterator();
        }
        return collection.iterator();
    }

    /* access modifiers changed from: private */
    public void u(Object obj) {
        Collection collection = (Collection) m0.h(this.f13520k, obj);
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            this.f13521l -= size;
        }
    }

    public void clear() {
        for (Collection<V> clear : this.f13520k.values()) {
            clear.clear();
        }
        this.f13520k.clear();
        this.f13521l = 0;
    }

    /* access modifiers changed from: package-private */
    public Collection<V> e() {
        return new f.a();
    }

    /* access modifiers changed from: package-private */
    public Iterator<V> g() {
        return new a(this);
    }

    /* access modifiers changed from: package-private */
    public Map<K, Collection<V>> o() {
        return this.f13520k;
    }

    /* access modifiers changed from: package-private */
    public abstract Collection<V> p();

    public boolean put(K k10, V v10) {
        Collection collection = this.f13520k.get(k10);
        if (collection == null) {
            Collection q10 = q(k10);
            if (q10.add(v10)) {
                this.f13521l++;
                this.f13520k.put(k10, q10);
                return true;
            }
            throw new AssertionError("New Collection violated the Collection spec");
        } else if (!collection.add(v10)) {
            return false;
        } else {
            this.f13521l++;
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    public Collection<V> q(K k10) {
        return p();
    }

    /* access modifiers changed from: package-private */
    public final Map<K, Collection<V>> r() {
        Map<K, Collection<V>> map = this.f13520k;
        if (map instanceof NavigableMap) {
            return new e((NavigableMap) this.f13520k);
        }
        if (map instanceof SortedMap) {
            return new h((SortedMap) this.f13520k);
        }
        return new b(this.f13520k);
    }

    /* access modifiers changed from: package-private */
    public final Set<K> s() {
        Map<K, Collection<V>> map = this.f13520k;
        if (map instanceof NavigableMap) {
            return new f((NavigableMap) this.f13520k);
        }
        if (map instanceof SortedMap) {
            return new i((SortedMap) this.f13520k);
        }
        return new C0234d(this.f13520k);
    }

    public int size() {
        return this.f13521l;
    }

    /* access modifiers changed from: package-private */
    public final void v(Map<K, Collection<V>> map) {
        this.f13520k = map;
        this.f13521l = 0;
        for (Collection next : map.values()) {
            p.d(!next.isEmpty());
            this.f13521l += next.size();
        }
    }

    public Collection<V> values() {
        return super.values();
    }

    /* access modifiers changed from: package-private */
    public abstract <E> Collection<E> w(Collection<E> collection);

    /* access modifiers changed from: package-private */
    public abstract Collection<V> x(K k10, Collection<V> collection);

    /* access modifiers changed from: package-private */
    public final List<V> y(K k10, List<V> list, d<K, V>.j jVar) {
        if (list instanceof RandomAccess) {
            return new g(this, k10, list, jVar);
        }
        return new k(k10, list, jVar);
    }

    /* compiled from: AbstractMapBasedMultimap */
    class j extends AbstractCollection<V> {

        /* renamed from: h  reason: collision with root package name */
        final K f13542h;

        /* renamed from: i  reason: collision with root package name */
        Collection<V> f13543i;

        /* renamed from: j  reason: collision with root package name */
        final d<K, V>.j f13544j;

        /* renamed from: k  reason: collision with root package name */
        final Collection<V> f13545k;

        j(K k10, Collection<V> collection, d<K, V>.j jVar) {
            Collection<V> collection2;
            this.f13542h = k10;
            this.f13543i = collection;
            this.f13544j = jVar;
            if (jVar == null) {
                collection2 = null;
            } else {
                collection2 = jVar.c();
            }
            this.f13545k = collection2;
        }

        /* access modifiers changed from: package-private */
        public void a() {
            d<K, V>.j jVar = this.f13544j;
            if (jVar != null) {
                jVar.a();
            } else {
                d.this.f13520k.put(this.f13542h, this.f13543i);
            }
        }

        public boolean add(V v10) {
            e();
            boolean isEmpty = this.f13543i.isEmpty();
            boolean add = this.f13543i.add(v10);
            if (add) {
                d.j(d.this);
                if (isEmpty) {
                    a();
                }
            }
            return add;
        }

        public boolean addAll(Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean addAll = this.f13543i.addAll(collection);
            if (addAll) {
                d.l(d.this, this.f13543i.size() - size);
                if (size == 0) {
                    a();
                }
            }
            return addAll;
        }

        /* access modifiers changed from: package-private */
        public d<K, V>.j b() {
            return this.f13544j;
        }

        /* access modifiers changed from: package-private */
        public Collection<V> c() {
            return this.f13543i;
        }

        public void clear() {
            int size = size();
            if (size != 0) {
                this.f13543i.clear();
                d.m(d.this, size);
                f();
            }
        }

        public boolean contains(Object obj) {
            e();
            return this.f13543i.contains(obj);
        }

        public boolean containsAll(Collection<?> collection) {
            e();
            return this.f13543i.containsAll(collection);
        }

        /* access modifiers changed from: package-private */
        public K d() {
            return this.f13542h;
        }

        /* access modifiers changed from: package-private */
        public void e() {
            Collection<V> collection;
            d<K, V>.j jVar = this.f13544j;
            if (jVar != null) {
                jVar.e();
                if (this.f13544j.c() != this.f13545k) {
                    throw new ConcurrentModificationException();
                }
            } else if (this.f13543i.isEmpty() && (collection = (Collection) d.this.f13520k.get(this.f13542h)) != null) {
                this.f13543i = collection;
            }
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            e();
            return this.f13543i.equals(obj);
        }

        /* access modifiers changed from: package-private */
        public void f() {
            d<K, V>.j jVar = this.f13544j;
            if (jVar != null) {
                jVar.f();
            } else if (this.f13543i.isEmpty()) {
                d.this.f13520k.remove(this.f13542h);
            }
        }

        public int hashCode() {
            e();
            return this.f13543i.hashCode();
        }

        public Iterator<V> iterator() {
            e();
            return new a();
        }

        public boolean remove(Object obj) {
            e();
            boolean remove = this.f13543i.remove(obj);
            if (remove) {
                d.k(d.this);
                f();
            }
            return remove;
        }

        public boolean removeAll(Collection<?> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean removeAll = this.f13543i.removeAll(collection);
            if (removeAll) {
                d.l(d.this, this.f13543i.size() - size);
                f();
            }
            return removeAll;
        }

        public boolean retainAll(Collection<?> collection) {
            p.j(collection);
            int size = size();
            boolean retainAll = this.f13543i.retainAll(collection);
            if (retainAll) {
                d.l(d.this, this.f13543i.size() - size);
                f();
            }
            return retainAll;
        }

        public int size() {
            e();
            return this.f13543i.size();
        }

        public String toString() {
            e();
            return this.f13543i.toString();
        }

        /* compiled from: AbstractMapBasedMultimap */
        class a implements Iterator<V> {

            /* renamed from: h  reason: collision with root package name */
            final Iterator<V> f13547h;

            /* renamed from: i  reason: collision with root package name */
            final Collection<V> f13548i;

            a() {
                Collection<V> collection = j.this.f13543i;
                this.f13548i = collection;
                this.f13547h = d.t(collection);
            }

            /* access modifiers changed from: package-private */
            public Iterator<V> b() {
                c();
                return this.f13547h;
            }

            /* access modifiers changed from: package-private */
            public void c() {
                j.this.e();
                if (j.this.f13543i != this.f13548i) {
                    throw new ConcurrentModificationException();
                }
            }

            public boolean hasNext() {
                c();
                return this.f13547h.hasNext();
            }

            public V next() {
                c();
                return this.f13547h.next();
            }

            public void remove() {
                this.f13547h.remove();
                d.k(d.this);
                j.this.f();
            }

            a(Iterator<V> it) {
                this.f13548i = j.this.f13543i;
                this.f13547h = it;
            }
        }
    }

    /* compiled from: AbstractMapBasedMultimap */
    class k extends d<K, V>.j implements List<V> {

        /* compiled from: AbstractMapBasedMultimap */
        private class a extends d<K, V>.j.a implements ListIterator<V> {
            a() {
                super();
            }

            /* JADX WARNING: type inference failed for: r1v0, types: [com.google.common.collect.d$j$a, com.google.common.collect.d$k$a] */
            private ListIterator<V> d() {
                return (ListIterator) b();
            }

            public void add(V v10) {
                boolean isEmpty = k.this.isEmpty();
                d().add(v10);
                d.j(d.this);
                if (isEmpty) {
                    k.this.a();
                }
            }

            public boolean hasPrevious() {
                return d().hasPrevious();
            }

            public int nextIndex() {
                return d().nextIndex();
            }

            public V previous() {
                return d().previous();
            }

            public int previousIndex() {
                return d().previousIndex();
            }

            public void set(V v10) {
                d().set(v10);
            }

            public a(int i10) {
                super(k.this.g().listIterator(i10));
            }
        }

        k(K k10, List<V> list, d<K, V>.j jVar) {
            super(k10, list, jVar);
        }

        public void add(int i10, V v10) {
            e();
            boolean isEmpty = c().isEmpty();
            g().add(i10, v10);
            d.j(d.this);
            if (isEmpty) {
                a();
            }
        }

        public boolean addAll(int i10, Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean addAll = g().addAll(i10, collection);
            if (addAll) {
                d.l(d.this, c().size() - size);
                if (size == 0) {
                    a();
                }
            }
            return addAll;
        }

        /* access modifiers changed from: package-private */
        public List<V> g() {
            return (List) c();
        }

        public V get(int i10) {
            e();
            return g().get(i10);
        }

        public int indexOf(Object obj) {
            e();
            return g().indexOf(obj);
        }

        public int lastIndexOf(Object obj) {
            e();
            return g().lastIndexOf(obj);
        }

        public ListIterator<V> listIterator() {
            e();
            return new a();
        }

        public V remove(int i10) {
            e();
            V remove = g().remove(i10);
            d.k(d.this);
            f();
            return remove;
        }

        public V set(int i10, V v10) {
            e();
            return g().set(i10, v10);
        }

        public List<V> subList(int i10, int i11) {
            e();
            return d.this.y(d(), g().subList(i10, i11), b() == null ? this : b());
        }

        public ListIterator<V> listIterator(int i10) {
            e();
            return new a(i10);
        }
    }
}
