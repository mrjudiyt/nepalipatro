package t6;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

/* compiled from: LinkedTreeMap */
public final class h<K, V> extends AbstractMap<K, V> implements Serializable {

    /* renamed from: o  reason: collision with root package name */
    private static final Comparator<Comparable> f16524o = new a();

    /* renamed from: h  reason: collision with root package name */
    Comparator<? super K> f16525h;

    /* renamed from: i  reason: collision with root package name */
    e<K, V> f16526i;

    /* renamed from: j  reason: collision with root package name */
    int f16527j;

    /* renamed from: k  reason: collision with root package name */
    int f16528k;

    /* renamed from: l  reason: collision with root package name */
    final e<K, V> f16529l;

    /* renamed from: m  reason: collision with root package name */
    private h<K, V>.b f16530m;

    /* renamed from: n  reason: collision with root package name */
    private h<K, V>.c f16531n;

    /* compiled from: LinkedTreeMap */
    static class a implements Comparator<Comparable> {
        a() {
        }

        /* renamed from: a */
        public int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    }

    /* compiled from: LinkedTreeMap */
    class b extends AbstractSet<Map.Entry<K, V>> {

        /* compiled from: LinkedTreeMap */
        class a extends h<K, V>.d<Map.Entry<K, V>> {
            a() {
                super();
            }

            /* renamed from: c */
            public Map.Entry<K, V> next() {
                return b();
            }
        }

        b() {
        }

        public void clear() {
            h.this.clear();
        }

        public boolean contains(Object obj) {
            return (obj instanceof Map.Entry) && h.this.c((Map.Entry) obj) != null;
        }

        public Iterator<Map.Entry<K, V>> iterator() {
            return new a();
        }

        public boolean remove(Object obj) {
            e c10;
            if (!(obj instanceof Map.Entry) || (c10 = h.this.c((Map.Entry) obj)) == null) {
                return false;
            }
            h.this.f(c10, true);
            return true;
        }

        public int size() {
            return h.this.f16527j;
        }
    }

    /* compiled from: LinkedTreeMap */
    final class c extends AbstractSet<K> {

        /* compiled from: LinkedTreeMap */
        class a extends h<K, V>.d<K> {
            a() {
                super();
            }

            public K next() {
                return b().f16545m;
            }
        }

        c() {
        }

        public void clear() {
            h.this.clear();
        }

        public boolean contains(Object obj) {
            return h.this.containsKey(obj);
        }

        public Iterator<K> iterator() {
            return new a();
        }

        public boolean remove(Object obj) {
            return h.this.g(obj) != null;
        }

        public int size() {
            return h.this.f16527j;
        }
    }

    /* compiled from: LinkedTreeMap */
    private abstract class d<T> implements Iterator<T> {

        /* renamed from: h  reason: collision with root package name */
        e<K, V> f16536h;

        /* renamed from: i  reason: collision with root package name */
        e<K, V> f16537i = null;

        /* renamed from: j  reason: collision with root package name */
        int f16538j;

        d() {
            this.f16536h = h.this.f16529l.f16543k;
            this.f16538j = h.this.f16528k;
        }

        /* access modifiers changed from: package-private */
        public final e<K, V> b() {
            e<K, V> eVar = this.f16536h;
            h hVar = h.this;
            if (eVar == hVar.f16529l) {
                throw new NoSuchElementException();
            } else if (hVar.f16528k == this.f16538j) {
                this.f16536h = eVar.f16543k;
                this.f16537i = eVar;
                return eVar;
            } else {
                throw new ConcurrentModificationException();
            }
        }

        public final boolean hasNext() {
            return this.f16536h != h.this.f16529l;
        }

        public final void remove() {
            e<K, V> eVar = this.f16537i;
            if (eVar != null) {
                h.this.f(eVar, true);
                this.f16537i = null;
                this.f16538j = h.this.f16528k;
                return;
            }
            throw new IllegalStateException();
        }
    }

    static {
        Class<h> cls = h.class;
    }

    public h() {
        this(f16524o);
    }

    private boolean a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    private void e(e<K, V> eVar, boolean z10) {
        while (eVar != null) {
            e<K, V> eVar2 = eVar.f16541i;
            e<K, V> eVar3 = eVar.f16542j;
            int i10 = 0;
            int i11 = eVar2 != null ? eVar2.f16547o : 0;
            int i12 = eVar3 != null ? eVar3.f16547o : 0;
            int i13 = i11 - i12;
            if (i13 == -2) {
                e<K, V> eVar4 = eVar3.f16541i;
                e<K, V> eVar5 = eVar3.f16542j;
                int i14 = eVar5 != null ? eVar5.f16547o : 0;
                if (eVar4 != null) {
                    i10 = eVar4.f16547o;
                }
                int i15 = i10 - i14;
                if (i15 == -1 || (i15 == 0 && !z10)) {
                    i(eVar);
                } else {
                    j(eVar3);
                    i(eVar);
                }
                if (z10) {
                    return;
                }
            } else if (i13 == 2) {
                e<K, V> eVar6 = eVar2.f16541i;
                e<K, V> eVar7 = eVar2.f16542j;
                int i16 = eVar7 != null ? eVar7.f16547o : 0;
                if (eVar6 != null) {
                    i10 = eVar6.f16547o;
                }
                int i17 = i10 - i16;
                if (i17 == 1 || (i17 == 0 && !z10)) {
                    j(eVar);
                } else {
                    i(eVar2);
                    j(eVar);
                }
                if (z10) {
                    return;
                }
            } else if (i13 == 0) {
                eVar.f16547o = i11 + 1;
                if (z10) {
                    return;
                }
            } else {
                eVar.f16547o = Math.max(i11, i12) + 1;
                if (!z10) {
                    return;
                }
            }
            eVar = eVar.f16540h;
        }
    }

    private void h(e<K, V> eVar, e<K, V> eVar2) {
        e<K, V> eVar3 = eVar.f16540h;
        eVar.f16540h = null;
        if (eVar2 != null) {
            eVar2.f16540h = eVar3;
        }
        if (eVar3 == null) {
            this.f16526i = eVar2;
        } else if (eVar3.f16541i == eVar) {
            eVar3.f16541i = eVar2;
        } else {
            eVar3.f16542j = eVar2;
        }
    }

    private void i(e<K, V> eVar) {
        e<K, V> eVar2 = eVar.f16541i;
        e<K, V> eVar3 = eVar.f16542j;
        e<K, V> eVar4 = eVar3.f16541i;
        e<K, V> eVar5 = eVar3.f16542j;
        eVar.f16542j = eVar4;
        if (eVar4 != null) {
            eVar4.f16540h = eVar;
        }
        h(eVar, eVar3);
        eVar3.f16541i = eVar;
        eVar.f16540h = eVar3;
        int i10 = 0;
        int max = Math.max(eVar2 != null ? eVar2.f16547o : 0, eVar4 != null ? eVar4.f16547o : 0) + 1;
        eVar.f16547o = max;
        if (eVar5 != null) {
            i10 = eVar5.f16547o;
        }
        eVar3.f16547o = Math.max(max, i10) + 1;
    }

    private void j(e<K, V> eVar) {
        e<K, V> eVar2 = eVar.f16541i;
        e<K, V> eVar3 = eVar.f16542j;
        e<K, V> eVar4 = eVar2.f16541i;
        e<K, V> eVar5 = eVar2.f16542j;
        eVar.f16541i = eVar5;
        if (eVar5 != null) {
            eVar5.f16540h = eVar;
        }
        h(eVar, eVar2);
        eVar2.f16542j = eVar;
        eVar.f16540h = eVar2;
        int i10 = 0;
        int max = Math.max(eVar3 != null ? eVar3.f16547o : 0, eVar5 != null ? eVar5.f16547o : 0) + 1;
        eVar.f16547o = max;
        if (eVar4 != null) {
            i10 = eVar4.f16547o;
        }
        eVar2.f16547o = Math.max(max, i10) + 1;
    }

    private Object writeReplace() {
        return new LinkedHashMap(this);
    }

    /* access modifiers changed from: package-private */
    public e<K, V> b(K k10, boolean z10) {
        int i10;
        e<K, V> eVar;
        Comparator<? super K> comparator = this.f16525h;
        e<K, V> eVar2 = this.f16526i;
        if (eVar2 != null) {
            Comparable comparable = comparator == f16524o ? (Comparable) k10 : null;
            while (true) {
                if (comparable != null) {
                    i10 = comparable.compareTo(eVar2.f16545m);
                } else {
                    i10 = comparator.compare(k10, eVar2.f16545m);
                }
                if (i10 == 0) {
                    return eVar2;
                }
                e<K, V> eVar3 = i10 < 0 ? eVar2.f16541i : eVar2.f16542j;
                if (eVar3 == null) {
                    break;
                }
                eVar2 = eVar3;
            }
        } else {
            i10 = 0;
        }
        if (!z10) {
            return null;
        }
        e<K, V> eVar4 = this.f16529l;
        if (eVar2 != null) {
            eVar = new e<>(eVar2, k10, eVar4, eVar4.f16544l);
            if (i10 < 0) {
                eVar2.f16541i = eVar;
            } else {
                eVar2.f16542j = eVar;
            }
            e(eVar2, true);
        } else if (comparator != f16524o || (k10 instanceof Comparable)) {
            eVar = new e<>(eVar2, k10, eVar4, eVar4.f16544l);
            this.f16526i = eVar;
        } else {
            throw new ClassCastException(k10.getClass().getName() + " is not Comparable");
        }
        this.f16527j++;
        this.f16528k++;
        return eVar;
    }

    /* access modifiers changed from: package-private */
    public e<K, V> c(Map.Entry<?, ?> entry) {
        e<K, V> d10 = d(entry.getKey());
        if (d10 != null && a(d10.f16546n, entry.getValue())) {
            return d10;
        }
        return null;
    }

    public void clear() {
        this.f16526i = null;
        this.f16527j = 0;
        this.f16528k++;
        e<K, V> eVar = this.f16529l;
        eVar.f16544l = eVar;
        eVar.f16543k = eVar;
    }

    public boolean containsKey(Object obj) {
        return d(obj) != null;
    }

    /* access modifiers changed from: package-private */
    public e<K, V> d(Object obj) {
        if (obj == null) {
            return null;
        }
        try {
            return b(obj, false);
        } catch (ClassCastException unused) {
            return null;
        }
    }

    public Set<Map.Entry<K, V>> entrySet() {
        h<K, V>.b bVar = this.f16530m;
        if (bVar != null) {
            return bVar;
        }
        h<K, V>.b bVar2 = new b();
        this.f16530m = bVar2;
        return bVar2;
    }

    /* access modifiers changed from: package-private */
    public void f(e<K, V> eVar, boolean z10) {
        int i10;
        if (z10) {
            e<K, V> eVar2 = eVar.f16544l;
            eVar2.f16543k = eVar.f16543k;
            eVar.f16543k.f16544l = eVar2;
        }
        e<K, V> eVar3 = eVar.f16541i;
        e<K, V> eVar4 = eVar.f16542j;
        e<K, V> eVar5 = eVar.f16540h;
        int i11 = 0;
        if (eVar3 == null || eVar4 == null) {
            if (eVar3 != null) {
                h(eVar, eVar3);
                eVar.f16541i = null;
            } else if (eVar4 != null) {
                h(eVar, eVar4);
                eVar.f16542j = null;
            } else {
                h(eVar, (e<K, V>) null);
            }
            e(eVar5, false);
            this.f16527j--;
            this.f16528k++;
            return;
        }
        e<K, V> b10 = eVar3.f16547o > eVar4.f16547o ? eVar3.b() : eVar4.a();
        f(b10, false);
        e<K, V> eVar6 = eVar.f16541i;
        if (eVar6 != null) {
            i10 = eVar6.f16547o;
            b10.f16541i = eVar6;
            eVar6.f16540h = b10;
            eVar.f16541i = null;
        } else {
            i10 = 0;
        }
        e<K, V> eVar7 = eVar.f16542j;
        if (eVar7 != null) {
            i11 = eVar7.f16547o;
            b10.f16542j = eVar7;
            eVar7.f16540h = b10;
            eVar.f16542j = null;
        }
        b10.f16547o = Math.max(i10, i11) + 1;
        h(eVar, b10);
    }

    /* access modifiers changed from: package-private */
    public e<K, V> g(Object obj) {
        e<K, V> d10 = d(obj);
        if (d10 != null) {
            f(d10, true);
        }
        return d10;
    }

    public V get(Object obj) {
        e d10 = d(obj);
        if (d10 != null) {
            return d10.f16546n;
        }
        return null;
    }

    public Set<K> keySet() {
        h<K, V>.c cVar = this.f16531n;
        if (cVar != null) {
            return cVar;
        }
        h<K, V>.c cVar2 = new c();
        this.f16531n = cVar2;
        return cVar2;
    }

    public V put(K k10, V v10) {
        Objects.requireNonNull(k10, "key == null");
        e b10 = b(k10, true);
        V v11 = b10.f16546n;
        b10.f16546n = v10;
        return v11;
    }

    public V remove(Object obj) {
        e g10 = g(obj);
        if (g10 != null) {
            return g10.f16546n;
        }
        return null;
    }

    public int size() {
        return this.f16527j;
    }

    public h(Comparator<? super K> comparator) {
        this.f16527j = 0;
        this.f16528k = 0;
        this.f16529l = new e<>();
        this.f16525h = comparator == null ? f16524o : comparator;
    }

    /* compiled from: LinkedTreeMap */
    static final class e<K, V> implements Map.Entry<K, V> {

        /* renamed from: h  reason: collision with root package name */
        e<K, V> f16540h;

        /* renamed from: i  reason: collision with root package name */
        e<K, V> f16541i;

        /* renamed from: j  reason: collision with root package name */
        e<K, V> f16542j;

        /* renamed from: k  reason: collision with root package name */
        e<K, V> f16543k;

        /* renamed from: l  reason: collision with root package name */
        e<K, V> f16544l;

        /* renamed from: m  reason: collision with root package name */
        final K f16545m;

        /* renamed from: n  reason: collision with root package name */
        V f16546n;

        /* renamed from: o  reason: collision with root package name */
        int f16547o;

        e() {
            this.f16545m = null;
            this.f16544l = this;
            this.f16543k = this;
        }

        public e<K, V> a() {
            e<K, V> eVar = this;
            for (e<K, V> eVar2 = this.f16541i; eVar2 != null; eVar2 = eVar2.f16541i) {
                eVar = eVar2;
            }
            return eVar;
        }

        public e<K, V> b() {
            e<K, V> eVar = this;
            for (e<K, V> eVar2 = this.f16542j; eVar2 != null; eVar2 = eVar2.f16542j) {
                eVar = eVar2;
            }
            return eVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0031 A[ORIG_RETURN, RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r4) {
            /*
                r3 = this;
                boolean r0 = r4 instanceof java.util.Map.Entry
                r1 = 0
                if (r0 == 0) goto L_0x0032
                java.util.Map$Entry r4 = (java.util.Map.Entry) r4
                K r0 = r3.f16545m
                if (r0 != 0) goto L_0x0012
                java.lang.Object r0 = r4.getKey()
                if (r0 != 0) goto L_0x0032
                goto L_0x001c
            L_0x0012:
                java.lang.Object r2 = r4.getKey()
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x0032
            L_0x001c:
                V r0 = r3.f16546n
                if (r0 != 0) goto L_0x0027
                java.lang.Object r4 = r4.getValue()
                if (r4 != 0) goto L_0x0032
                goto L_0x0031
            L_0x0027:
                java.lang.Object r4 = r4.getValue()
                boolean r4 = r0.equals(r4)
                if (r4 == 0) goto L_0x0032
            L_0x0031:
                r1 = 1
            L_0x0032:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: t6.h.e.equals(java.lang.Object):boolean");
        }

        public K getKey() {
            return this.f16545m;
        }

        public V getValue() {
            return this.f16546n;
        }

        public int hashCode() {
            K k10 = this.f16545m;
            int i10 = 0;
            int hashCode = k10 == null ? 0 : k10.hashCode();
            V v10 = this.f16546n;
            if (v10 != null) {
                i10 = v10.hashCode();
            }
            return hashCode ^ i10;
        }

        public V setValue(V v10) {
            V v11 = this.f16546n;
            this.f16546n = v10;
            return v11;
        }

        public String toString() {
            return this.f16545m + "=" + this.f16546n;
        }

        e(e<K, V> eVar, K k10, e<K, V> eVar2, e<K, V> eVar3) {
            this.f16540h = eVar;
            this.f16545m = k10;
            this.f16547o = 1;
            this.f16543k = eVar2;
            this.f16544l = eVar3;
            eVar3.f16543k = this;
            eVar2.f16544l = this;
        }
    }
}
