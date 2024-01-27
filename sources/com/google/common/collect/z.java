package com.google.common.collect;

import com.google.common.collect.v;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.SortedMap;

/* compiled from: ImmutableMap */
public abstract class z<K, V> implements Map<K, V>, Serializable {

    /* renamed from: k  reason: collision with root package name */
    static final Map.Entry<?, ?>[] f13723k = new Map.Entry[0];

    /* renamed from: h  reason: collision with root package name */
    private transient b0<Map.Entry<K, V>> f13724h;

    /* renamed from: i  reason: collision with root package name */
    private transient b0<K> f13725i;

    /* renamed from: j  reason: collision with root package name */
    private transient v<V> f13726j;

    /* compiled from: ImmutableMap */
    public static class a<K, V> {

        /* renamed from: a  reason: collision with root package name */
        Comparator<? super V> f13727a;

        /* renamed from: b  reason: collision with root package name */
        Object[] f13728b;

        /* renamed from: c  reason: collision with root package name */
        int f13729c;

        /* renamed from: d  reason: collision with root package name */
        boolean f13730d;

        /* renamed from: e  reason: collision with root package name */
        C0238a f13731e;

        /* renamed from: com.google.common.collect.z$a$a  reason: collision with other inner class name */
        /* compiled from: ImmutableMap */
        static final class C0238a {

            /* renamed from: a  reason: collision with root package name */
            private final Object f13732a;

            /* renamed from: b  reason: collision with root package name */
            private final Object f13733b;

            /* renamed from: c  reason: collision with root package name */
            private final Object f13734c;

            C0238a(Object obj, Object obj2, Object obj3) {
                this.f13732a = obj;
                this.f13733b = obj2;
                this.f13734c = obj3;
            }

            /* access modifiers changed from: package-private */
            public IllegalArgumentException a() {
                String valueOf = String.valueOf(this.f13732a);
                String valueOf2 = String.valueOf(this.f13733b);
                String valueOf3 = String.valueOf(this.f13732a);
                String valueOf4 = String.valueOf(this.f13734c);
                StringBuilder sb = new StringBuilder(valueOf.length() + 39 + valueOf2.length() + valueOf3.length() + valueOf4.length());
                sb.append("Multiple entries with same key: ");
                sb.append(valueOf);
                sb.append("=");
                sb.append(valueOf2);
                sb.append(" and ");
                sb.append(valueOf3);
                sb.append("=");
                sb.append(valueOf4);
                return new IllegalArgumentException(sb.toString());
            }
        }

        public a() {
            this(4);
        }

        private z<K, V> b(boolean z10) {
            Object[] objArr;
            C0238a aVar;
            C0238a aVar2;
            if (!z10 || (aVar2 = this.f13731e) == null) {
                int i10 = this.f13729c;
                if (this.f13727a == null) {
                    objArr = this.f13728b;
                } else {
                    if (this.f13730d) {
                        this.f13728b = Arrays.copyOf(this.f13728b, i10 * 2);
                    }
                    objArr = this.f13728b;
                    if (!z10) {
                        objArr = e(objArr, this.f13729c);
                        if (objArr.length < this.f13728b.length) {
                            i10 = objArr.length >>> 1;
                        }
                    }
                    i(objArr, i10, this.f13727a);
                }
                this.f13730d = true;
                y0 l10 = y0.l(i10, objArr, this);
                if (!z10 || (aVar = this.f13731e) == null) {
                    return l10;
                }
                throw aVar.a();
            }
            throw aVar2.a();
        }

        private void d(int i10) {
            int i11 = i10 * 2;
            Object[] objArr = this.f13728b;
            if (i11 > objArr.length) {
                this.f13728b = Arrays.copyOf(objArr, v.b.a(objArr.length, i11));
                this.f13730d = false;
            }
        }

        private Object[] e(Object[] objArr, int i10) {
            HashSet hashSet = new HashSet();
            BitSet bitSet = new BitSet();
            for (int i11 = i10 - 1; i11 >= 0; i11--) {
                Object obj = objArr[i11 * 2];
                Objects.requireNonNull(obj);
                if (!hashSet.add(obj)) {
                    bitSet.set(i11);
                }
            }
            if (bitSet.isEmpty()) {
                return objArr;
            }
            Object[] objArr2 = new Object[((i10 - bitSet.cardinality()) * 2)];
            int i12 = 0;
            int i13 = 0;
            while (i12 < i10 * 2) {
                if (bitSet.get(i12 >>> 1)) {
                    i12 += 2;
                } else {
                    int i14 = i13 + 1;
                    int i15 = i12 + 1;
                    Object obj2 = objArr[i12];
                    Objects.requireNonNull(obj2);
                    objArr2[i13] = obj2;
                    i13 = i14 + 1;
                    i12 = i15 + 1;
                    Object obj3 = objArr[i15];
                    Objects.requireNonNull(obj3);
                    objArr2[i14] = obj3;
                }
            }
            return objArr2;
        }

        static <V> void i(Object[] objArr, int i10, Comparator<? super V> comparator) {
            Map.Entry[] entryArr = new Map.Entry[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                int i12 = i11 * 2;
                Object obj = objArr[i12];
                Objects.requireNonNull(obj);
                Object obj2 = objArr[i12 + 1];
                Objects.requireNonNull(obj2);
                entryArr[i11] = new AbstractMap.SimpleImmutableEntry(obj, obj2);
            }
            Arrays.sort(entryArr, 0, i10, v0.a(comparator).e(m0.j()));
            for (int i13 = 0; i13 < i10; i13++) {
                int i14 = i13 * 2;
                objArr[i14] = entryArr[i13].getKey();
                objArr[i14 + 1] = entryArr[i13].getValue();
            }
        }

        public z<K, V> a() {
            return c();
        }

        public z<K, V> c() {
            return b(true);
        }

        public a<K, V> f(K k10, V v10) {
            d(this.f13729c + 1);
            i.a(k10, v10);
            Object[] objArr = this.f13728b;
            int i10 = this.f13729c;
            objArr[i10 * 2] = k10;
            objArr[(i10 * 2) + 1] = v10;
            this.f13729c = i10 + 1;
            return this;
        }

        public a<K, V> g(Map.Entry<? extends K, ? extends V> entry) {
            return f(entry.getKey(), entry.getValue());
        }

        public a<K, V> h(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
            if (iterable instanceof Collection) {
                d(this.f13729c + ((Collection) iterable).size());
            }
            for (Map.Entry g10 : iterable) {
                g(g10);
            }
            return this;
        }

        a(int i10) {
            this.f13728b = new Object[(i10 * 2)];
            this.f13729c = 0;
            this.f13730d = false;
        }
    }

    /* compiled from: ImmutableMap */
    static class b<K, V> implements Serializable {

        /* renamed from: h  reason: collision with root package name */
        private final Object f13735h;

        /* renamed from: i  reason: collision with root package name */
        private final Object f13736i;

        b(z<K, V> zVar) {
            Object[] objArr = new Object[zVar.size()];
            Object[] objArr2 = new Object[zVar.size()];
            k1<Map.Entry<K, V>> g10 = zVar.entrySet().iterator();
            int i10 = 0;
            while (g10.hasNext()) {
                Map.Entry next = g10.next();
                objArr[i10] = next.getKey();
                objArr2[i10] = next.getValue();
                i10++;
            }
            this.f13735h = objArr;
            this.f13736i = objArr2;
        }

        /* access modifiers changed from: package-private */
        public final Object a() {
            Object[] objArr = (Object[]) this.f13735h;
            Object[] objArr2 = (Object[]) this.f13736i;
            a b10 = b(objArr.length);
            for (int i10 = 0; i10 < objArr.length; i10++) {
                b10.f(objArr[i10], objArr2[i10]);
            }
            return b10.c();
        }

        /* access modifiers changed from: package-private */
        public a<K, V> b(int i10) {
            return new a<>(i10);
        }

        /* access modifiers changed from: package-private */
        public final Object readResolve() {
            Object obj = this.f13735h;
            if (!(obj instanceof b0)) {
                return a();
            }
            b0 b0Var = (b0) obj;
            a b10 = b(b0Var.size());
            k1 g10 = b0Var.iterator();
            k1 g11 = ((v) this.f13736i).iterator();
            while (g10.hasNext()) {
                b10.f(g10.next(), g11.next());
            }
            return b10.c();
        }
    }

    z() {
    }

    public static <K, V> a<K, V> a() {
        return new a<>();
    }

    public static <K, V> z<K, V> b(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        a aVar = new a(iterable instanceof Collection ? ((Collection) iterable).size() : 4);
        aVar.h(iterable);
        return aVar.a();
    }

    public static <K, V> z<K, V> c(Map<? extends K, ? extends V> map) {
        if ((map instanceof z) && !(map instanceof SortedMap)) {
            z<K, V> zVar = (z) map;
            if (!zVar.h()) {
                return zVar;
            }
        }
        return b(map.entrySet());
    }

    public static <K, V> z<K, V> j() {
        return y0.f13709o;
    }

    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    public boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    /* access modifiers changed from: package-private */
    public abstract b0<Map.Entry<K, V>> d();

    /* access modifiers changed from: package-private */
    public abstract b0<K> e();

    public boolean equals(Object obj) {
        return m0.b(this, obj);
    }

    /* access modifiers changed from: package-private */
    public abstract v<V> f();

    /* renamed from: g */
    public b0<Map.Entry<K, V>> entrySet() {
        b0<Map.Entry<K, V>> b0Var = this.f13724h;
        if (b0Var != null) {
            return b0Var;
        }
        b0<Map.Entry<K, V>> d10 = d();
        this.f13724h = d10;
        return d10;
    }

    public abstract V get(Object obj);

    public final V getOrDefault(Object obj, V v10) {
        V v11 = get(obj);
        return v11 != null ? v11 : v10;
    }

    /* access modifiers changed from: package-private */
    public abstract boolean h();

    public int hashCode() {
        return f1.b(entrySet());
    }

    /* renamed from: i */
    public b0<K> keySet() {
        b0<K> b0Var = this.f13725i;
        if (b0Var != null) {
            return b0Var;
        }
        b0<K> e10 = e();
        this.f13725i = e10;
        return e10;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    /* renamed from: k */
    public v<V> values() {
        v<V> vVar = this.f13726j;
        if (vVar != null) {
            return vVar;
        }
        v<V> f10 = f();
        this.f13726j = f10;
        return f10;
    }

    @Deprecated
    public final V put(K k10, V v10) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final V remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        return m0.i(this);
    }

    /* access modifiers changed from: package-private */
    public Object writeReplace() {
        return new b(this);
    }
}
