package com.google.common.collect;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import l6.l;
import l6.p;

/* compiled from: CompactHashMap */
class k<K, V> extends AbstractMap<K, V> implements Serializable {
    /* access modifiers changed from: private */

    /* renamed from: q  reason: collision with root package name */
    public static final Object f13583q = new Object();

    /* renamed from: h  reason: collision with root package name */
    private transient Object f13584h;

    /* renamed from: i  reason: collision with root package name */
    transient int[] f13585i;

    /* renamed from: j  reason: collision with root package name */
    transient Object[] f13586j;

    /* renamed from: k  reason: collision with root package name */
    transient Object[] f13587k;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public transient int f13588l;

    /* renamed from: m  reason: collision with root package name */
    private transient int f13589m;

    /* renamed from: n  reason: collision with root package name */
    private transient Set<K> f13590n;

    /* renamed from: o  reason: collision with root package name */
    private transient Set<Map.Entry<K, V>> f13591o;

    /* renamed from: p  reason: collision with root package name */
    private transient Collection<V> f13592p;

    /* compiled from: CompactHashMap */
    class a extends k<K, V>.e<K> {
        a() {
            super(k.this, (a) null);
        }

        /* access modifiers changed from: package-private */
        public K c(int i10) {
            return k.this.G(i10);
        }
    }

    /* compiled from: CompactHashMap */
    class b extends k<K, V>.e<Map.Entry<K, V>> {
        b() {
            super(k.this, (a) null);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public Map.Entry<K, V> c(int i10) {
            return new g(i10);
        }
    }

    /* compiled from: CompactHashMap */
    class c extends k<K, V>.e<V> {
        c() {
            super(k.this, (a) null);
        }

        /* access modifiers changed from: package-private */
        public V c(int i10) {
            return k.this.W(i10);
        }
    }

    /* compiled from: CompactHashMap */
    class d extends AbstractSet<Map.Entry<K, V>> {
        d() {
        }

        public void clear() {
            k.this.clear();
        }

        public boolean contains(Object obj) {
            Map w10 = k.this.w();
            if (w10 != null) {
                return w10.entrySet().contains(obj);
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int i10 = k.this.D(entry.getKey());
            if (i10 == -1 || !l.a(k.this.W(i10), entry.getValue())) {
                return false;
            }
            return true;
        }

        public Iterator<Map.Entry<K, V>> iterator() {
            return k.this.y();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0021, code lost:
            r0 = com.google.common.collect.k.k(r9.f13596h);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean remove(java.lang.Object r10) {
            /*
                r9 = this;
                com.google.common.collect.k r0 = com.google.common.collect.k.this
                java.util.Map r0 = r0.w()
                if (r0 == 0) goto L_0x0011
                java.util.Set r0 = r0.entrySet()
                boolean r10 = r0.remove(r10)
                return r10
            L_0x0011:
                boolean r0 = r10 instanceof java.util.Map.Entry
                r1 = 0
                if (r0 == 0) goto L_0x0061
                java.util.Map$Entry r10 = (java.util.Map.Entry) r10
                com.google.common.collect.k r0 = com.google.common.collect.k.this
                boolean r0 = r0.J()
                if (r0 == 0) goto L_0x0021
                return r1
            L_0x0021:
                com.google.common.collect.k r0 = com.google.common.collect.k.this
                int r0 = r0.B()
                java.lang.Object r2 = r10.getKey()
                java.lang.Object r3 = r10.getValue()
                com.google.common.collect.k r10 = com.google.common.collect.k.this
                java.lang.Object r5 = r10.N()
                com.google.common.collect.k r10 = com.google.common.collect.k.this
                int[] r6 = r10.L()
                com.google.common.collect.k r10 = com.google.common.collect.k.this
                java.lang.Object[] r7 = r10.M()
                com.google.common.collect.k r10 = com.google.common.collect.k.this
                java.lang.Object[] r8 = r10.O()
                r4 = r0
                int r10 = com.google.common.collect.m.f(r2, r3, r4, r5, r6, r7, r8)
                r2 = -1
                if (r10 != r2) goto L_0x0050
                return r1
            L_0x0050:
                com.google.common.collect.k r1 = com.google.common.collect.k.this
                r1.I(r10, r0)
                com.google.common.collect.k r10 = com.google.common.collect.k.this
                com.google.common.collect.k.e(r10)
                com.google.common.collect.k r10 = com.google.common.collect.k.this
                r10.C()
                r10 = 1
                return r10
            L_0x0061:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.k.d.remove(java.lang.Object):boolean");
        }

        public int size() {
            return k.this.size();
        }
    }

    /* compiled from: CompactHashMap */
    class f extends AbstractSet<K> {
        f() {
        }

        public void clear() {
            k.this.clear();
        }

        public boolean contains(Object obj) {
            return k.this.containsKey(obj);
        }

        public Iterator<K> iterator() {
            return k.this.H();
        }

        public boolean remove(Object obj) {
            Map w10 = k.this.w();
            if (w10 != null) {
                return w10.keySet().remove(obj);
            }
            return k.this.K(obj) != k.f13583q;
        }

        public int size() {
            return k.this.size();
        }
    }

    /* compiled from: CompactHashMap */
    final class g extends e<K, V> {

        /* renamed from: h  reason: collision with root package name */
        private final K f13602h;

        /* renamed from: i  reason: collision with root package name */
        private int f13603i;

        g(int i10) {
            this.f13602h = k.this.G(i10);
            this.f13603i = i10;
        }

        private void a() {
            int i10 = this.f13603i;
            if (i10 == -1 || i10 >= k.this.size() || !l.a(this.f13602h, k.this.G(this.f13603i))) {
                this.f13603i = k.this.D(this.f13602h);
            }
        }

        public K getKey() {
            return this.f13602h;
        }

        public V getValue() {
            Map w10 = k.this.w();
            if (w10 != null) {
                return t0.a(w10.get(this.f13602h));
            }
            a();
            int i10 = this.f13603i;
            return i10 == -1 ? t0.b() : k.this.W(i10);
        }

        public V setValue(V v10) {
            Map w10 = k.this.w();
            if (w10 != null) {
                return t0.a(w10.put(this.f13602h, v10));
            }
            a();
            int i10 = this.f13603i;
            if (i10 == -1) {
                k.this.put(this.f13602h, v10);
                return t0.b();
            }
            V j10 = k.this.W(i10);
            k.this.V(this.f13603i, v10);
            return j10;
        }
    }

    /* compiled from: CompactHashMap */
    class h extends AbstractCollection<V> {
        h() {
        }

        public void clear() {
            k.this.clear();
        }

        public Iterator<V> iterator() {
            return k.this.X();
        }

        public int size() {
            return k.this.size();
        }
    }

    k() {
        E(3);
    }

    /* access modifiers changed from: private */
    public int B() {
        return (1 << (this.f13588l & 31)) - 1;
    }

    /* access modifiers changed from: private */
    public int D(Object obj) {
        if (J()) {
            return -1;
        }
        int c10 = u.c(obj);
        int B = B();
        int h10 = m.h(N(), c10 & B);
        if (h10 == 0) {
            return -1;
        }
        int b10 = m.b(c10, B);
        do {
            int i10 = h10 - 1;
            int x10 = x(i10);
            if (m.b(x10, B) == b10 && l.a(obj, G(i10))) {
                return i10;
            }
            h10 = m.c(x10, B);
        } while (h10 != 0);
        return -1;
    }

    /* access modifiers changed from: private */
    public K G(int i10) {
        return M()[i10];
    }

    /* access modifiers changed from: private */
    public Object K(Object obj) {
        if (J()) {
            return f13583q;
        }
        int B = B();
        int f10 = m.f(obj, (Object) null, B, N(), L(), M(), (Object[]) null);
        if (f10 == -1) {
            return f13583q;
        }
        Object W = W(f10);
        I(f10, B);
        this.f13589m--;
        C();
        return W;
    }

    /* access modifiers changed from: private */
    public int[] L() {
        int[] iArr = this.f13585i;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    /* access modifiers changed from: private */
    public Object[] M() {
        Object[] objArr = this.f13586j;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    /* access modifiers changed from: private */
    public Object N() {
        Object obj = this.f13584h;
        Objects.requireNonNull(obj);
        return obj;
    }

    /* access modifiers changed from: private */
    public Object[] O() {
        Object[] objArr = this.f13587k;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    private void Q(int i10) {
        int min;
        int length = L().length;
        if (i10 > length && (min = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) != length) {
            P(min);
        }
    }

    private int R(int i10, int i11, int i12, int i13) {
        Object a10 = m.a(i11);
        int i14 = i11 - 1;
        if (i13 != 0) {
            m.i(a10, i12 & i14, i13 + 1);
        }
        Object N = N();
        int[] L = L();
        for (int i15 = 0; i15 <= i10; i15++) {
            int h10 = m.h(N, i15);
            while (h10 != 0) {
                int i16 = h10 - 1;
                int i17 = L[i16];
                int b10 = m.b(i17, i10) | i15;
                int i18 = b10 & i14;
                int h11 = m.h(a10, i18);
                m.i(a10, i18, h10);
                L[i16] = m.d(b10, h11, i14);
                h10 = m.c(i17, i10);
            }
        }
        this.f13584h = a10;
        T(i14);
        return i14;
    }

    private void S(int i10, int i11) {
        L()[i10] = i11;
    }

    private void T(int i10) {
        this.f13588l = m.d(this.f13588l, 32 - Integer.numberOfLeadingZeros(i10), 31);
    }

    private void U(int i10, K k10) {
        M()[i10] = k10;
    }

    /* access modifiers changed from: private */
    public void V(int i10, V v10) {
        O()[i10] = v10;
    }

    /* access modifiers changed from: private */
    public V W(int i10) {
        return O()[i10];
    }

    static /* synthetic */ int e(k kVar) {
        int i10 = kVar.f13589m;
        kVar.f13589m = i10 - 1;
        return i10;
    }

    public static <K, V> k<K, V> r() {
        return new k<>();
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        if (readInt >= 0) {
            E(readInt);
            for (int i10 = 0; i10 < readInt; i10++) {
                put(objectInputStream.readObject(), objectInputStream.readObject());
            }
            return;
        }
        StringBuilder sb = new StringBuilder(25);
        sb.append("Invalid size: ");
        sb.append(readInt);
        throw new InvalidObjectException(sb.toString());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        Iterator y10 = y();
        while (y10.hasNext()) {
            Map.Entry entry = (Map.Entry) y10.next();
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
    }

    private int x(int i10) {
        return L()[i10];
    }

    /* access modifiers changed from: package-private */
    public int A(int i10) {
        int i11 = i10 + 1;
        if (i11 < this.f13589m) {
            return i11;
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    public void C() {
        this.f13588l += 32;
    }

    /* access modifiers changed from: package-private */
    public void E(int i10) {
        p.e(i10 >= 0, "Expected size must be >= 0");
        this.f13588l = n6.d.e(i10, 1, 1073741823);
    }

    /* access modifiers changed from: package-private */
    public void F(int i10, K k10, V v10, int i11, int i12) {
        S(i10, m.d(i11, 0, i12));
        U(i10, k10);
        V(i10, v10);
    }

    /* access modifiers changed from: package-private */
    public Iterator<K> H() {
        Map w10 = w();
        if (w10 != null) {
            return w10.keySet().iterator();
        }
        return new a();
    }

    /* access modifiers changed from: package-private */
    public void I(int i10, int i11) {
        Object N = N();
        int[] L = L();
        Object[] M = M();
        Object[] O = O();
        int size = size() - 1;
        if (i10 < size) {
            Object obj = M[size];
            M[i10] = obj;
            O[i10] = O[size];
            M[size] = null;
            O[size] = null;
            L[i10] = L[size];
            L[size] = 0;
            int c10 = u.c(obj) & i11;
            int h10 = m.h(N, c10);
            int i12 = size + 1;
            if (h10 == i12) {
                m.i(N, c10, i10 + 1);
                return;
            }
            while (true) {
                int i13 = h10 - 1;
                int i14 = L[i13];
                int c11 = m.c(i14, i11);
                if (c11 == i12) {
                    L[i13] = m.d(i14, i10 + 1, i11);
                    return;
                }
                h10 = c11;
            }
        } else {
            M[i10] = null;
            O[i10] = null;
            L[i10] = 0;
        }
    }

    /* access modifiers changed from: package-private */
    public boolean J() {
        return this.f13584h == null;
    }

    /* access modifiers changed from: package-private */
    public void P(int i10) {
        this.f13585i = Arrays.copyOf(L(), i10);
        this.f13586j = Arrays.copyOf(M(), i10);
        this.f13587k = Arrays.copyOf(O(), i10);
    }

    /* access modifiers changed from: package-private */
    public Iterator<V> X() {
        Map w10 = w();
        if (w10 != null) {
            return w10.values().iterator();
        }
        return new c();
    }

    public void clear() {
        if (!J()) {
            C();
            Map w10 = w();
            if (w10 != null) {
                this.f13588l = n6.d.e(size(), 3, 1073741823);
                w10.clear();
                this.f13584h = null;
                this.f13589m = 0;
                return;
            }
            Arrays.fill(M(), 0, this.f13589m, (Object) null);
            Arrays.fill(O(), 0, this.f13589m, (Object) null);
            m.g(N());
            Arrays.fill(L(), 0, this.f13589m, 0);
            this.f13589m = 0;
        }
    }

    public boolean containsKey(Object obj) {
        Map w10 = w();
        if (w10 != null) {
            return w10.containsKey(obj);
        }
        return D(obj) != -1;
    }

    public boolean containsValue(Object obj) {
        Map w10 = w();
        if (w10 != null) {
            return w10.containsValue(obj);
        }
        for (int i10 = 0; i10 < this.f13589m; i10++) {
            if (l.a(obj, W(i10))) {
                return true;
            }
        }
        return false;
    }

    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.f13591o;
        if (set != null) {
            return set;
        }
        Set<Map.Entry<K, V>> s10 = s();
        this.f13591o = s10;
        return s10;
    }

    public V get(Object obj) {
        Map w10 = w();
        if (w10 != null) {
            return w10.get(obj);
        }
        int D = D(obj);
        if (D == -1) {
            return null;
        }
        n(D);
        return W(D);
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public Set<K> keySet() {
        Set<K> set = this.f13590n;
        if (set != null) {
            return set;
        }
        Set<K> u10 = u();
        this.f13590n = u10;
        return u10;
    }

    /* access modifiers changed from: package-private */
    public void n(int i10) {
    }

    /* access modifiers changed from: package-private */
    public int o(int i10, int i11) {
        return i10 - 1;
    }

    /* access modifiers changed from: package-private */
    public int p() {
        p.p(J(), "Arrays already allocated");
        int i10 = this.f13588l;
        int j10 = m.j(i10);
        this.f13584h = m.a(j10);
        T(j10 - 1);
        this.f13585i = new int[i10];
        this.f13586j = new Object[i10];
        this.f13587k = new Object[i10];
        return i10;
    }

    public V put(K k10, V v10) {
        int i10;
        int R;
        if (J()) {
            p();
        }
        Map w10 = w();
        if (w10 != null) {
            return w10.put(k10, v10);
        }
        int[] L = L();
        Object[] M = M();
        V[] O = O();
        int i11 = this.f13589m;
        int i12 = i11 + 1;
        int c10 = u.c(k10);
        int B = B();
        int i13 = c10 & B;
        int h10 = m.h(N(), i13);
        if (h10 != 0) {
            int b10 = m.b(c10, B);
            int i14 = 0;
            while (true) {
                int i15 = h10 - 1;
                int i16 = L[i15];
                if (m.b(i16, B) != b10 || !l.a(k10, M[i15])) {
                    int c11 = m.c(i16, B);
                    i14++;
                    if (c11 != 0) {
                        h10 = c11;
                    } else if (i14 >= 9) {
                        return q().put(k10, v10);
                    } else {
                        if (i12 > B) {
                            R = R(B, m.e(B), c10, i11);
                        } else {
                            L[i15] = m.d(i16, i12, B);
                        }
                    }
                } else {
                    V v11 = O[i15];
                    O[i15] = v10;
                    n(i15);
                    return v11;
                }
            }
            i10 = B;
            Q(i12);
            F(i11, k10, v10, c10, i10);
            this.f13589m = i12;
            C();
            return null;
        } else if (i12 > B) {
            R = R(B, m.e(B), c10, i11);
        } else {
            m.i(N(), i13, i12);
            i10 = B;
            Q(i12);
            F(i11, k10, v10, c10, i10);
            this.f13589m = i12;
            C();
            return null;
        }
        i10 = R;
        Q(i12);
        F(i11, k10, v10, c10, i10);
        this.f13589m = i12;
        C();
        return null;
    }

    /* access modifiers changed from: package-private */
    public Map<K, V> q() {
        Map<K, V> t10 = t(B() + 1);
        int z10 = z();
        while (z10 >= 0) {
            t10.put(G(z10), W(z10));
            z10 = A(z10);
        }
        this.f13584h = t10;
        this.f13585i = null;
        this.f13586j = null;
        this.f13587k = null;
        C();
        return t10;
    }

    public V remove(Object obj) {
        Map w10 = w();
        if (w10 != null) {
            return w10.remove(obj);
        }
        V K = K(obj);
        if (K == f13583q) {
            return null;
        }
        return K;
    }

    /* access modifiers changed from: package-private */
    public Set<Map.Entry<K, V>> s() {
        return new d();
    }

    public int size() {
        Map w10 = w();
        return w10 != null ? w10.size() : this.f13589m;
    }

    /* access modifiers changed from: package-private */
    public Map<K, V> t(int i10) {
        return new LinkedHashMap(i10, 1.0f);
    }

    /* access modifiers changed from: package-private */
    public Set<K> u() {
        return new f();
    }

    /* access modifiers changed from: package-private */
    public Collection<V> v() {
        return new h();
    }

    public Collection<V> values() {
        Collection<V> collection = this.f13592p;
        if (collection != null) {
            return collection;
        }
        Collection<V> v10 = v();
        this.f13592p = v10;
        return v10;
    }

    /* access modifiers changed from: package-private */
    public Map<K, V> w() {
        Object obj = this.f13584h;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public Iterator<Map.Entry<K, V>> y() {
        Map w10 = w();
        if (w10 != null) {
            return w10.entrySet().iterator();
        }
        return new b();
    }

    /* access modifiers changed from: package-private */
    public int z() {
        return isEmpty() ? -1 : 0;
    }

    /* compiled from: CompactHashMap */
    private abstract class e<T> implements Iterator<T> {

        /* renamed from: h  reason: collision with root package name */
        int f13597h;

        /* renamed from: i  reason: collision with root package name */
        int f13598i;

        /* renamed from: j  reason: collision with root package name */
        int f13599j;

        private e() {
            this.f13597h = k.this.f13588l;
            this.f13598i = k.this.z();
            this.f13599j = -1;
        }

        private void b() {
            if (k.this.f13588l != this.f13597h) {
                throw new ConcurrentModificationException();
            }
        }

        /* access modifiers changed from: package-private */
        public abstract T c(int i10);

        /* access modifiers changed from: package-private */
        public void d() {
            this.f13597h += 32;
        }

        public boolean hasNext() {
            return this.f13598i >= 0;
        }

        public T next() {
            b();
            if (hasNext()) {
                int i10 = this.f13598i;
                this.f13599j = i10;
                T c10 = c(i10);
                this.f13598i = k.this.A(this.f13598i);
                return c10;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            b();
            i.c(this.f13599j >= 0);
            d();
            k kVar = k.this;
            kVar.remove(kVar.G(this.f13599j));
            this.f13598i = k.this.o(this.f13598i, this.f13599j);
            this.f13599j = -1;
        }

        /* synthetic */ e(k kVar, a aVar) {
            this();
        }
    }
}
