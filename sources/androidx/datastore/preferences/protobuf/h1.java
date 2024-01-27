package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.t;
import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* compiled from: SmallSortedMap */
class h1<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: h  reason: collision with root package name */
    private final int f2769h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public List<h1<K, V>.e> f2770i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public Map<K, V> f2771j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f2772k;

    /* renamed from: l  reason: collision with root package name */
    private volatile h1<K, V>.g f2773l;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public Map<K, V> f2774m;

    /* renamed from: n  reason: collision with root package name */
    private volatile h1<K, V>.c f2775n;

    /* compiled from: SmallSortedMap */
    static class a extends h1<FieldDescriptorType, Object> {
        a(int i10) {
            super(i10, (a) null);
        }

        public void p() {
            if (!o()) {
                for (int i10 = 0; i10 < k(); i10++) {
                    Map.Entry j10 = j(i10);
                    if (((t.b) j10.getKey()).b()) {
                        j10.setValue(Collections.unmodifiableList((List) j10.getValue()));
                    }
                }
                for (Map.Entry entry : m()) {
                    if (((t.b) entry.getKey()).b()) {
                        entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                    }
                }
            }
            h1.super.p();
        }

        public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
            return h1.super.put((t.b) obj, obj2);
        }
    }

    /* compiled from: SmallSortedMap */
    private class c extends h1<K, V>.g {
        private c() {
            super(h1.this, (a) null);
        }

        public Iterator<Map.Entry<K, V>> iterator() {
            return new b(h1.this, (a) null);
        }

        /* synthetic */ c(h1 h1Var, a aVar) {
            this();
        }
    }

    /* compiled from: SmallSortedMap */
    private static class d {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public static final Iterator<Object> f2780a = new a();

        /* renamed from: b  reason: collision with root package name */
        private static final Iterable<Object> f2781b = new b();

        /* compiled from: SmallSortedMap */
        static class a implements Iterator<Object> {
            a() {
            }

            public boolean hasNext() {
                return false;
            }

            public Object next() {
                throw new NoSuchElementException();
            }

            public void remove() {
                throw new UnsupportedOperationException();
            }
        }

        /* compiled from: SmallSortedMap */
        static class b implements Iterable<Object> {
            b() {
            }

            public Iterator<Object> iterator() {
                return d.f2780a;
            }
        }

        static <T> Iterable<T> b() {
            return f2781b;
        }
    }

    /* compiled from: SmallSortedMap */
    private class e implements Map.Entry<K, V>, Comparable<h1<K, V>.e> {

        /* renamed from: h  reason: collision with root package name */
        private final K f2782h;

        /* renamed from: i  reason: collision with root package name */
        private V f2783i;

        e(h1 h1Var, Map.Entry<K, V> entry) {
            this((Comparable) entry.getKey(), entry.getValue());
        }

        private boolean d(Object obj, Object obj2) {
            if (obj == null) {
                return obj2 == null;
            }
            return obj.equals(obj2);
        }

        /* renamed from: a */
        public int compareTo(h1<K, V>.e eVar) {
            return getKey().compareTo(eVar.getKey());
        }

        /* renamed from: e */
        public K getKey() {
            return this.f2782h;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            if (!d(this.f2782h, entry.getKey()) || !d(this.f2783i, entry.getValue())) {
                return false;
            }
            return true;
        }

        public V getValue() {
            return this.f2783i;
        }

        public int hashCode() {
            K k10 = this.f2782h;
            int i10 = 0;
            int hashCode = k10 == null ? 0 : k10.hashCode();
            V v10 = this.f2783i;
            if (v10 != null) {
                i10 = v10.hashCode();
            }
            return hashCode ^ i10;
        }

        public V setValue(V v10) {
            h1.this.g();
            V v11 = this.f2783i;
            this.f2783i = v10;
            return v11;
        }

        public String toString() {
            return this.f2782h + "=" + this.f2783i;
        }

        e(K k10, V v10) {
            this.f2782h = k10;
            this.f2783i = v10;
        }
    }

    /* compiled from: SmallSortedMap */
    private class g extends AbstractSet<Map.Entry<K, V>> {
        private g() {
        }

        /* renamed from: a */
        public boolean add(Map.Entry<K, V> entry) {
            if (contains(entry)) {
                return false;
            }
            h1.this.put((Comparable) entry.getKey(), entry.getValue());
            return true;
        }

        public void clear() {
            h1.this.clear();
        }

        public boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = h1.this.get(entry.getKey());
            Object value = entry.getValue();
            return obj2 == value || (obj2 != null && obj2.equals(value));
        }

        public Iterator<Map.Entry<K, V>> iterator() {
            return new f(h1.this, (a) null);
        }

        public boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            h1.this.remove(entry.getKey());
            return true;
        }

        public int size() {
            return h1.this.size();
        }

        /* synthetic */ g(h1 h1Var, a aVar) {
            this();
        }
    }

    /* synthetic */ h1(int i10, a aVar) {
        this(i10);
    }

    private int f(K k10) {
        int size = this.f2770i.size() - 1;
        if (size >= 0) {
            int compareTo = k10.compareTo(this.f2770i.get(size).getKey());
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        int i10 = 0;
        while (i10 <= size) {
            int i11 = (i10 + size) / 2;
            int compareTo2 = k10.compareTo(this.f2770i.get(i11).getKey());
            if (compareTo2 < 0) {
                size = i11 - 1;
            } else if (compareTo2 <= 0) {
                return i11;
            } else {
                i10 = i11 + 1;
            }
        }
        return -(i10 + 1);
    }

    /* access modifiers changed from: private */
    public void g() {
        if (this.f2772k) {
            throw new UnsupportedOperationException();
        }
    }

    private void i() {
        g();
        if (this.f2770i.isEmpty() && !(this.f2770i instanceof ArrayList)) {
            this.f2770i = new ArrayList(this.f2769h);
        }
    }

    private SortedMap<K, V> n() {
        g();
        if (this.f2771j.isEmpty() && !(this.f2771j instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f2771j = treeMap;
            TreeMap treeMap2 = treeMap;
            this.f2774m = treeMap.descendingMap();
        }
        return (SortedMap) this.f2771j;
    }

    static <FieldDescriptorType extends t.b<FieldDescriptorType>> h1<FieldDescriptorType, Object> q(int i10) {
        return new a(i10);
    }

    /* access modifiers changed from: private */
    public V s(int i10) {
        g();
        V value = this.f2770i.remove(i10).getValue();
        if (!this.f2771j.isEmpty()) {
            Iterator it = n().entrySet().iterator();
            this.f2770i.add(new e(this, (Map.Entry) it.next()));
            it.remove();
        }
        return value;
    }

    public void clear() {
        g();
        if (!this.f2770i.isEmpty()) {
            this.f2770i.clear();
        }
        if (!this.f2771j.isEmpty()) {
            this.f2771j.clear();
        }
    }

    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return f(comparable) >= 0 || this.f2771j.containsKey(comparable);
    }

    public Set<Map.Entry<K, V>> entrySet() {
        if (this.f2773l == null) {
            this.f2773l = new g(this, (a) null);
        }
        return this.f2773l;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h1)) {
            return super.equals(obj);
        }
        h1 h1Var = (h1) obj;
        int size = size();
        if (size != h1Var.size()) {
            return false;
        }
        int k10 = k();
        if (k10 != h1Var.k()) {
            return entrySet().equals(h1Var.entrySet());
        }
        for (int i10 = 0; i10 < k10; i10++) {
            if (!j(i10).equals(h1Var.j(i10))) {
                return false;
            }
        }
        if (k10 != size) {
            return this.f2771j.equals(h1Var.f2771j);
        }
        return true;
    }

    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int f10 = f(comparable);
        if (f10 >= 0) {
            return this.f2770i.get(f10).getValue();
        }
        return this.f2771j.get(comparable);
    }

    /* access modifiers changed from: package-private */
    public Set<Map.Entry<K, V>> h() {
        if (this.f2775n == null) {
            this.f2775n = new c(this, (a) null);
        }
        return this.f2775n;
    }

    public int hashCode() {
        int k10 = k();
        int i10 = 0;
        for (int i11 = 0; i11 < k10; i11++) {
            i10 += this.f2770i.get(i11).hashCode();
        }
        return l() > 0 ? i10 + this.f2771j.hashCode() : i10;
    }

    public Map.Entry<K, V> j(int i10) {
        return this.f2770i.get(i10);
    }

    public int k() {
        return this.f2770i.size();
    }

    public int l() {
        return this.f2771j.size();
    }

    public Iterable<Map.Entry<K, V>> m() {
        if (this.f2771j.isEmpty()) {
            return d.b();
        }
        return this.f2771j.entrySet();
    }

    public boolean o() {
        return this.f2772k;
    }

    public void p() {
        Map<K, V> map;
        Map<K, V> map2;
        if (!this.f2772k) {
            if (this.f2771j.isEmpty()) {
                map = Collections.emptyMap();
            } else {
                map = Collections.unmodifiableMap(this.f2771j);
            }
            this.f2771j = map;
            if (this.f2774m.isEmpty()) {
                map2 = Collections.emptyMap();
            } else {
                map2 = Collections.unmodifiableMap(this.f2774m);
            }
            this.f2774m = map2;
            this.f2772k = true;
        }
    }

    /* renamed from: r */
    public V put(K k10, V v10) {
        g();
        int f10 = f(k10);
        if (f10 >= 0) {
            return this.f2770i.get(f10).setValue(v10);
        }
        i();
        int i10 = -(f10 + 1);
        if (i10 >= this.f2769h) {
            return n().put(k10, v10);
        }
        int size = this.f2770i.size();
        int i11 = this.f2769h;
        if (size == i11) {
            e remove = this.f2770i.remove(i11 - 1);
            n().put(remove.getKey(), remove.getValue());
        }
        this.f2770i.add(i10, new e(k10, v10));
        return null;
    }

    public V remove(Object obj) {
        g();
        Comparable comparable = (Comparable) obj;
        int f10 = f(comparable);
        if (f10 >= 0) {
            return s(f10);
        }
        if (this.f2771j.isEmpty()) {
            return null;
        }
        return this.f2771j.remove(comparable);
    }

    public int size() {
        return this.f2770i.size() + this.f2771j.size();
    }

    /* compiled from: SmallSortedMap */
    private class b implements Iterator<Map.Entry<K, V>> {

        /* renamed from: h  reason: collision with root package name */
        private int f2776h;

        /* renamed from: i  reason: collision with root package name */
        private Iterator<Map.Entry<K, V>> f2777i;

        private b() {
            this.f2776h = h1.this.f2770i.size();
        }

        private Iterator<Map.Entry<K, V>> b() {
            if (this.f2777i == null) {
                this.f2777i = h1.this.f2774m.entrySet().iterator();
            }
            return this.f2777i;
        }

        /* renamed from: c */
        public Map.Entry<K, V> next() {
            if (b().hasNext()) {
                return (Map.Entry) b().next();
            }
            List b10 = h1.this.f2770i;
            int i10 = this.f2776h - 1;
            this.f2776h = i10;
            return (Map.Entry) b10.get(i10);
        }

        public boolean hasNext() {
            int i10 = this.f2776h;
            return (i10 > 0 && i10 <= h1.this.f2770i.size()) || b().hasNext();
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }

        /* synthetic */ b(h1 h1Var, a aVar) {
            this();
        }
    }

    /* compiled from: SmallSortedMap */
    private class f implements Iterator<Map.Entry<K, V>> {

        /* renamed from: h  reason: collision with root package name */
        private int f2785h;

        /* renamed from: i  reason: collision with root package name */
        private boolean f2786i;

        /* renamed from: j  reason: collision with root package name */
        private Iterator<Map.Entry<K, V>> f2787j;

        private f() {
            this.f2785h = -1;
        }

        private Iterator<Map.Entry<K, V>> b() {
            if (this.f2787j == null) {
                this.f2787j = h1.this.f2771j.entrySet().iterator();
            }
            return this.f2787j;
        }

        /* renamed from: c */
        public Map.Entry<K, V> next() {
            this.f2786i = true;
            int i10 = this.f2785h + 1;
            this.f2785h = i10;
            if (i10 < h1.this.f2770i.size()) {
                return (Map.Entry) h1.this.f2770i.get(this.f2785h);
            }
            return (Map.Entry) b().next();
        }

        public boolean hasNext() {
            if (this.f2785h + 1 < h1.this.f2770i.size()) {
                return true;
            }
            if (h1.this.f2771j.isEmpty() || !b().hasNext()) {
                return false;
            }
            return true;
        }

        public void remove() {
            if (this.f2786i) {
                this.f2786i = false;
                h1.this.g();
                if (this.f2785h < h1.this.f2770i.size()) {
                    h1 h1Var = h1.this;
                    int i10 = this.f2785h;
                    this.f2785h = i10 - 1;
                    Object unused = h1Var.s(i10);
                    return;
                }
                b().remove();
                return;
            }
            throw new IllegalStateException("remove() was called before next()");
        }

        /* synthetic */ f(h1 h1Var, a aVar) {
            this();
        }
    }

    private h1(int i10) {
        this.f2769h = i10;
        this.f2770i = Collections.emptyList();
        this.f2771j = Collections.emptyMap();
        this.f2774m = Collections.emptyMap();
    }
}
