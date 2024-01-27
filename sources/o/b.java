package o;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: SafeIterableMap */
public class b<K, V> implements Iterable<Map.Entry<K, V>> {

    /* renamed from: h  reason: collision with root package name */
    c<K, V> f10274h;

    /* renamed from: i  reason: collision with root package name */
    private c<K, V> f10275i;

    /* renamed from: j  reason: collision with root package name */
    private final WeakHashMap<f<K, V>, Boolean> f10276j = new WeakHashMap<>();

    /* renamed from: k  reason: collision with root package name */
    private int f10277k = 0;

    /* compiled from: SafeIterableMap */
    static class a<K, V> extends e<K, V> {
        a(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        /* access modifiers changed from: package-private */
        public c<K, V> c(c<K, V> cVar) {
            return cVar.f10281k;
        }

        /* access modifiers changed from: package-private */
        public c<K, V> d(c<K, V> cVar) {
            return cVar.f10280j;
        }
    }

    /* renamed from: o.b$b  reason: collision with other inner class name */
    /* compiled from: SafeIterableMap */
    private static class C0174b<K, V> extends e<K, V> {
        C0174b(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        /* access modifiers changed from: package-private */
        public c<K, V> c(c<K, V> cVar) {
            return cVar.f10280j;
        }

        /* access modifiers changed from: package-private */
        public c<K, V> d(c<K, V> cVar) {
            return cVar.f10281k;
        }
    }

    /* compiled from: SafeIterableMap */
    static class c<K, V> implements Map.Entry<K, V> {

        /* renamed from: h  reason: collision with root package name */
        final K f10278h;

        /* renamed from: i  reason: collision with root package name */
        final V f10279i;

        /* renamed from: j  reason: collision with root package name */
        c<K, V> f10280j;

        /* renamed from: k  reason: collision with root package name */
        c<K, V> f10281k;

        c(K k10, V v10) {
            this.f10278h = k10;
            this.f10279i = v10;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (!this.f10278h.equals(cVar.f10278h) || !this.f10279i.equals(cVar.f10279i)) {
                return false;
            }
            return true;
        }

        public K getKey() {
            return this.f10278h;
        }

        public V getValue() {
            return this.f10279i;
        }

        public int hashCode() {
            return this.f10278h.hashCode() ^ this.f10279i.hashCode();
        }

        public V setValue(V v10) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.f10278h + "=" + this.f10279i;
        }
    }

    /* compiled from: SafeIterableMap */
    public class d extends f<K, V> implements Iterator<Map.Entry<K, V>> {

        /* renamed from: h  reason: collision with root package name */
        private c<K, V> f10282h;

        /* renamed from: i  reason: collision with root package name */
        private boolean f10283i = true;

        d() {
        }

        /* access modifiers changed from: package-private */
        public void b(c<K, V> cVar) {
            c<K, V> cVar2 = this.f10282h;
            if (cVar == cVar2) {
                c<K, V> cVar3 = cVar2.f10281k;
                this.f10282h = cVar3;
                this.f10283i = cVar3 == null;
            }
        }

        /* renamed from: c */
        public Map.Entry<K, V> next() {
            if (this.f10283i) {
                this.f10283i = false;
                this.f10282h = b.this.f10274h;
            } else {
                c<K, V> cVar = this.f10282h;
                this.f10282h = cVar != null ? cVar.f10280j : null;
            }
            return this.f10282h;
        }

        public boolean hasNext() {
            if (!this.f10283i) {
                c<K, V> cVar = this.f10282h;
                if (cVar == null || cVar.f10280j == null) {
                    return false;
                }
                return true;
            } else if (b.this.f10274h != null) {
                return true;
            } else {
                return false;
            }
        }
    }

    /* compiled from: SafeIterableMap */
    private static abstract class e<K, V> extends f<K, V> implements Iterator<Map.Entry<K, V>> {

        /* renamed from: h  reason: collision with root package name */
        c<K, V> f10285h;

        /* renamed from: i  reason: collision with root package name */
        c<K, V> f10286i;

        e(c<K, V> cVar, c<K, V> cVar2) {
            this.f10285h = cVar2;
            this.f10286i = cVar;
        }

        private c<K, V> f() {
            c<K, V> cVar = this.f10286i;
            c<K, V> cVar2 = this.f10285h;
            if (cVar == cVar2 || cVar2 == null) {
                return null;
            }
            return d(cVar);
        }

        public void b(c<K, V> cVar) {
            if (this.f10285h == cVar && cVar == this.f10286i) {
                this.f10286i = null;
                this.f10285h = null;
            }
            c<K, V> cVar2 = this.f10285h;
            if (cVar2 == cVar) {
                this.f10285h = c(cVar2);
            }
            if (this.f10286i == cVar) {
                this.f10286i = f();
            }
        }

        /* access modifiers changed from: package-private */
        public abstract c<K, V> c(c<K, V> cVar);

        /* access modifiers changed from: package-private */
        public abstract c<K, V> d(c<K, V> cVar);

        /* renamed from: e */
        public Map.Entry<K, V> next() {
            c<K, V> cVar = this.f10286i;
            this.f10286i = f();
            return cVar;
        }

        public boolean hasNext() {
            return this.f10286i != null;
        }
    }

    /* compiled from: SafeIterableMap */
    public static abstract class f<K, V> {
        /* access modifiers changed from: package-private */
        public abstract void b(c<K, V> cVar);
    }

    public Map.Entry<K, V> a() {
        return this.f10274h;
    }

    /* access modifiers changed from: protected */
    public c<K, V> b(K k10) {
        c<K, V> cVar = this.f10274h;
        while (cVar != null && !cVar.f10278h.equals(k10)) {
            cVar = cVar.f10280j;
        }
        return cVar;
    }

    public b<K, V>.d c() {
        b<K, V>.d dVar = new d();
        this.f10276j.put(dVar, Boolean.FALSE);
        return dVar;
    }

    public Map.Entry<K, V> d() {
        return this.f10275i;
    }

    public Iterator<Map.Entry<K, V>> descendingIterator() {
        C0174b bVar = new C0174b(this.f10275i, this.f10274h);
        this.f10276j.put(bVar, Boolean.FALSE);
        return bVar;
    }

    /* access modifiers changed from: package-private */
    public c<K, V> e(K k10, V v10) {
        c<K, V> cVar = new c<>(k10, v10);
        this.f10277k++;
        c<K, V> cVar2 = this.f10275i;
        if (cVar2 == null) {
            this.f10274h = cVar;
            this.f10275i = cVar;
            return cVar;
        }
        cVar2.f10280j = cVar;
        cVar.f10281k = cVar2;
        this.f10275i = cVar;
        return cVar;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (size() != bVar.size()) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = bVar.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object next = it2.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                return false;
            }
        }
        if (it.hasNext() || it2.hasNext()) {
            return false;
        }
        return true;
    }

    public V f(K k10, V v10) {
        c b10 = b(k10);
        if (b10 != null) {
            return b10.f10279i;
        }
        e(k10, v10);
        return null;
    }

    public V g(K k10) {
        c b10 = b(k10);
        if (b10 == null) {
            return null;
        }
        this.f10277k--;
        if (!this.f10276j.isEmpty()) {
            for (f<K, V> b11 : this.f10276j.keySet()) {
                b11.b(b10);
            }
        }
        c<K, V> cVar = b10.f10281k;
        if (cVar != null) {
            cVar.f10280j = b10.f10280j;
        } else {
            this.f10274h = b10.f10280j;
        }
        c<K, V> cVar2 = b10.f10280j;
        if (cVar2 != null) {
            cVar2.f10281k = cVar;
        } else {
            this.f10275i = cVar;
        }
        b10.f10280j = null;
        b10.f10281k = null;
        return b10.f10279i;
    }

    public int hashCode() {
        Iterator it = iterator();
        int i10 = 0;
        while (it.hasNext()) {
            i10 += ((Map.Entry) it.next()).hashCode();
        }
        return i10;
    }

    public Iterator<Map.Entry<K, V>> iterator() {
        a aVar = new a(this.f10274h, this.f10275i);
        this.f10276j.put(aVar, Boolean.FALSE);
        return aVar;
    }

    public int size() {
        return this.f10277k;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Iterator it = iterator();
        while (it.hasNext()) {
            sb.append(((Map.Entry) it.next()).toString());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
