package androidx.collection;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* compiled from: SimpleArrayMap */
public class h<K, V> {

    /* renamed from: k  reason: collision with root package name */
    static Object[] f1457k;

    /* renamed from: l  reason: collision with root package name */
    static int f1458l;

    /* renamed from: m  reason: collision with root package name */
    static Object[] f1459m;

    /* renamed from: n  reason: collision with root package name */
    static int f1460n;

    /* renamed from: h  reason: collision with root package name */
    int[] f1461h;

    /* renamed from: i  reason: collision with root package name */
    Object[] f1462i;

    /* renamed from: j  reason: collision with root package name */
    int f1463j;

    public h() {
        this.f1461h = d.f1434a;
        this.f1462i = d.f1436c;
        this.f1463j = 0;
    }

    private void a(int i10) {
        Class<h> cls = h.class;
        if (i10 == 8) {
            synchronized (cls) {
                Object[] objArr = f1459m;
                if (objArr != null) {
                    this.f1462i = objArr;
                    f1459m = (Object[]) objArr[0];
                    this.f1461h = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f1460n--;
                    return;
                }
            }
        } else if (i10 == 4) {
            synchronized (cls) {
                Object[] objArr2 = f1457k;
                if (objArr2 != null) {
                    this.f1462i = objArr2;
                    f1457k = (Object[]) objArr2[0];
                    this.f1461h = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f1458l--;
                    return;
                }
            }
        }
        this.f1461h = new int[i10];
        this.f1462i = new Object[(i10 << 1)];
    }

    private static int b(int[] iArr, int i10, int i11) {
        try {
            return d.a(iArr, i10, i11);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    private static void d(int[] iArr, Object[] objArr, int i10) {
        Class<h> cls = h.class;
        if (iArr.length == 8) {
            synchronized (cls) {
                if (f1460n < 10) {
                    objArr[0] = f1459m;
                    objArr[1] = iArr;
                    for (int i11 = (i10 << 1) - 1; i11 >= 2; i11--) {
                        objArr[i11] = null;
                    }
                    f1459m = objArr;
                    f1460n++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (cls) {
                if (f1458l < 10) {
                    objArr[0] = f1457k;
                    objArr[1] = iArr;
                    for (int i12 = (i10 << 1) - 1; i12 >= 2; i12--) {
                        objArr[i12] = null;
                    }
                    f1457k = objArr;
                    f1458l++;
                }
            }
        }
    }

    public void c(int i10) {
        int i11 = this.f1463j;
        int[] iArr = this.f1461h;
        if (iArr.length < i10) {
            Object[] objArr = this.f1462i;
            a(i10);
            if (this.f1463j > 0) {
                System.arraycopy(iArr, 0, this.f1461h, 0, i11);
                System.arraycopy(objArr, 0, this.f1462i, 0, i11 << 1);
            }
            d(iArr, objArr, i11);
        }
        if (this.f1463j != i11) {
            throw new ConcurrentModificationException();
        }
    }

    public void clear() {
        int i10 = this.f1463j;
        if (i10 > 0) {
            int[] iArr = this.f1461h;
            Object[] objArr = this.f1462i;
            this.f1461h = d.f1434a;
            this.f1462i = d.f1436c;
            this.f1463j = 0;
            d(iArr, objArr, i10);
        }
        if (this.f1463j > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return f(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return h(obj) >= 0;
    }

    /* access modifiers changed from: package-private */
    public int e(Object obj, int i10) {
        int i11 = this.f1463j;
        if (i11 == 0) {
            return -1;
        }
        int b10 = b(this.f1461h, i11, i10);
        if (b10 < 0 || obj.equals(this.f1462i[b10 << 1])) {
            return b10;
        }
        int i12 = b10 + 1;
        while (i12 < i11 && this.f1461h[i12] == i10) {
            if (obj.equals(this.f1462i[i12 << 1])) {
                return i12;
            }
            i12++;
        }
        int i13 = b10 - 1;
        while (i13 >= 0 && this.f1461h[i13] == i10) {
            if (obj.equals(this.f1462i[i13 << 1])) {
                return i13;
            }
            i13--;
        }
        return ~i12;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (size() != hVar.size()) {
                return false;
            }
            int i10 = 0;
            while (i10 < this.f1463j) {
                try {
                    Object i11 = i(i10);
                    Object m10 = m(i10);
                    Object obj2 = hVar.get(i11);
                    if (m10 == null) {
                        if (obj2 != null || !hVar.containsKey(i11)) {
                            return false;
                        }
                    } else if (!m10.equals(obj2)) {
                        return false;
                    }
                    i10++;
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (size() != map.size()) {
                return false;
            }
            int i12 = 0;
            while (i12 < this.f1463j) {
                try {
                    Object i13 = i(i12);
                    Object m11 = m(i12);
                    Object obj3 = map.get(i13);
                    if (m11 == null) {
                        if (obj3 != null || !map.containsKey(i13)) {
                            return false;
                        }
                    } else if (!m11.equals(obj3)) {
                        return false;
                    }
                    i12++;
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    public int f(Object obj) {
        return obj == null ? g() : e(obj, obj.hashCode());
    }

    /* access modifiers changed from: package-private */
    public int g() {
        int i10 = this.f1463j;
        if (i10 == 0) {
            return -1;
        }
        int b10 = b(this.f1461h, i10, 0);
        if (b10 < 0 || this.f1462i[b10 << 1] == null) {
            return b10;
        }
        int i11 = b10 + 1;
        while (i11 < i10 && this.f1461h[i11] == 0) {
            if (this.f1462i[i11 << 1] == null) {
                return i11;
            }
            i11++;
        }
        int i12 = b10 - 1;
        while (i12 >= 0 && this.f1461h[i12] == 0) {
            if (this.f1462i[i12 << 1] == null) {
                return i12;
            }
            i12--;
        }
        return ~i11;
    }

    public V get(Object obj) {
        return getOrDefault(obj, (Object) null);
    }

    public V getOrDefault(Object obj, V v10) {
        int f10 = f(obj);
        return f10 >= 0 ? this.f1462i[(f10 << 1) + 1] : v10;
    }

    /* access modifiers changed from: package-private */
    public int h(Object obj) {
        int i10 = this.f1463j * 2;
        Object[] objArr = this.f1462i;
        if (obj == null) {
            for (int i11 = 1; i11 < i10; i11 += 2) {
                if (objArr[i11] == null) {
                    return i11 >> 1;
                }
            }
            return -1;
        }
        for (int i12 = 1; i12 < i10; i12 += 2) {
            if (obj.equals(objArr[i12])) {
                return i12 >> 1;
            }
        }
        return -1;
    }

    public int hashCode() {
        int[] iArr = this.f1461h;
        Object[] objArr = this.f1462i;
        int i10 = this.f1463j;
        int i11 = 1;
        int i12 = 0;
        int i13 = 0;
        while (i12 < i10) {
            Object obj = objArr[i11];
            i13 += (obj == null ? 0 : obj.hashCode()) ^ iArr[i12];
            i12++;
            i11 += 2;
        }
        return i13;
    }

    public K i(int i10) {
        return this.f1462i[i10 << 1];
    }

    public boolean isEmpty() {
        return this.f1463j <= 0;
    }

    public void j(h<? extends K, ? extends V> hVar) {
        int i10 = hVar.f1463j;
        c(this.f1463j + i10);
        if (this.f1463j != 0) {
            for (int i11 = 0; i11 < i10; i11++) {
                put(hVar.i(i11), hVar.m(i11));
            }
        } else if (i10 > 0) {
            System.arraycopy(hVar.f1461h, 0, this.f1461h, 0, i10);
            System.arraycopy(hVar.f1462i, 0, this.f1462i, 0, i10 << 1);
            this.f1463j = i10;
        }
    }

    public V k(int i10) {
        V[] vArr = this.f1462i;
        int i11 = i10 << 1;
        V v10 = vArr[i11 + 1];
        int i12 = this.f1463j;
        int i13 = 0;
        if (i12 <= 1) {
            d(this.f1461h, vArr, i12);
            this.f1461h = d.f1434a;
            this.f1462i = d.f1436c;
        } else {
            int i14 = i12 - 1;
            int[] iArr = this.f1461h;
            int i15 = 8;
            if (iArr.length <= 8 || i12 >= iArr.length / 3) {
                if (i10 < i14) {
                    int i16 = i10 + 1;
                    int i17 = i14 - i10;
                    System.arraycopy(iArr, i16, iArr, i10, i17);
                    Object[] objArr = this.f1462i;
                    System.arraycopy(objArr, i16 << 1, objArr, i11, i17 << 1);
                }
                Object[] objArr2 = this.f1462i;
                int i18 = i14 << 1;
                objArr2[i18] = null;
                objArr2[i18 + 1] = null;
            } else {
                if (i12 > 8) {
                    i15 = i12 + (i12 >> 1);
                }
                a(i15);
                if (i12 == this.f1463j) {
                    if (i10 > 0) {
                        System.arraycopy(iArr, 0, this.f1461h, 0, i10);
                        System.arraycopy(vArr, 0, this.f1462i, 0, i11);
                    }
                    if (i10 < i14) {
                        int i19 = i10 + 1;
                        int i20 = i14 - i10;
                        System.arraycopy(iArr, i19, this.f1461h, i10, i20);
                        System.arraycopy(vArr, i19 << 1, this.f1462i, i11, i20 << 1);
                    }
                } else {
                    throw new ConcurrentModificationException();
                }
            }
            i13 = i14;
        }
        if (i12 == this.f1463j) {
            this.f1463j = i13;
            return v10;
        }
        throw new ConcurrentModificationException();
    }

    public V l(int i10, V v10) {
        int i11 = (i10 << 1) + 1;
        V[] vArr = this.f1462i;
        V v11 = vArr[i11];
        vArr[i11] = v10;
        return v11;
    }

    public V m(int i10) {
        return this.f1462i[(i10 << 1) + 1];
    }

    public V put(K k10, V v10) {
        int i10;
        int i11;
        int i12 = this.f1463j;
        if (k10 == null) {
            i11 = g();
            i10 = 0;
        } else {
            int hashCode = k10.hashCode();
            i10 = hashCode;
            i11 = e(k10, hashCode);
        }
        if (i11 >= 0) {
            int i13 = (i11 << 1) + 1;
            V[] vArr = this.f1462i;
            V v11 = vArr[i13];
            vArr[i13] = v10;
            return v11;
        }
        int i14 = ~i11;
        int[] iArr = this.f1461h;
        if (i12 >= iArr.length) {
            int i15 = 4;
            if (i12 >= 8) {
                i15 = (i12 >> 1) + i12;
            } else if (i12 >= 4) {
                i15 = 8;
            }
            Object[] objArr = this.f1462i;
            a(i15);
            if (i12 == this.f1463j) {
                int[] iArr2 = this.f1461h;
                if (iArr2.length > 0) {
                    System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                    System.arraycopy(objArr, 0, this.f1462i, 0, objArr.length);
                }
                d(iArr, objArr, i12);
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (i14 < i12) {
            int[] iArr3 = this.f1461h;
            int i16 = i14 + 1;
            System.arraycopy(iArr3, i14, iArr3, i16, i12 - i14);
            Object[] objArr2 = this.f1462i;
            System.arraycopy(objArr2, i14 << 1, objArr2, i16 << 1, (this.f1463j - i14) << 1);
        }
        int i17 = this.f1463j;
        if (i12 == i17) {
            int[] iArr4 = this.f1461h;
            if (i14 < iArr4.length) {
                iArr4[i14] = i10;
                Object[] objArr3 = this.f1462i;
                int i18 = i14 << 1;
                objArr3[i18] = k10;
                objArr3[i18 + 1] = v10;
                this.f1463j = i17 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public V putIfAbsent(K k10, V v10) {
        V v11 = get(k10);
        return v11 == null ? put(k10, v10) : v11;
    }

    public V remove(Object obj) {
        int f10 = f(obj);
        if (f10 >= 0) {
            return k(f10);
        }
        return null;
    }

    public V replace(K k10, V v10) {
        int f10 = f(k10);
        if (f10 >= 0) {
            return l(f10, v10);
        }
        return null;
    }

    public int size() {
        return this.f1463j;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f1463j * 28);
        sb.append('{');
        for (int i10 = 0; i10 < this.f1463j; i10++) {
            if (i10 > 0) {
                sb.append(", ");
            }
            Object i11 = i(i10);
            if (i11 != this) {
                sb.append(i11);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object m10 = m(i10);
            if (m10 != this) {
                sb.append(m10);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public boolean remove(Object obj, Object obj2) {
        int f10 = f(obj);
        if (f10 < 0) {
            return false;
        }
        Object m10 = m(f10);
        if (obj2 != m10 && (obj2 == null || !obj2.equals(m10))) {
            return false;
        }
        k(f10);
        return true;
    }

    public boolean replace(K k10, V v10, V v11) {
        int f10 = f(k10);
        if (f10 < 0) {
            return false;
        }
        V m10 = m(f10);
        if (m10 != v10 && (v10 == null || !v10.equals(m10))) {
            return false;
        }
        l(f10, v11);
        return true;
    }

    public h(int i10) {
        if (i10 == 0) {
            this.f1461h = d.f1434a;
            this.f1462i = d.f1436c;
        } else {
            a(i10);
        }
        this.f1463j = 0;
    }

    public h(h<K, V> hVar) {
        this();
        if (hVar != null) {
            j(hVar);
        }
    }
}
