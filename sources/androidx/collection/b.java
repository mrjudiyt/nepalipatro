package androidx.collection;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: ArraySet */
public final class b<E> implements Collection<E>, Set<E> {

    /* renamed from: l  reason: collision with root package name */
    private static final int[] f1419l = new int[0];

    /* renamed from: m  reason: collision with root package name */
    private static final Object[] f1420m = new Object[0];

    /* renamed from: n  reason: collision with root package name */
    private static Object[] f1421n;

    /* renamed from: o  reason: collision with root package name */
    private static int f1422o;

    /* renamed from: p  reason: collision with root package name */
    private static Object[] f1423p;

    /* renamed from: q  reason: collision with root package name */
    private static int f1424q;

    /* renamed from: h  reason: collision with root package name */
    private int[] f1425h;

    /* renamed from: i  reason: collision with root package name */
    Object[] f1426i;

    /* renamed from: j  reason: collision with root package name */
    int f1427j;

    /* renamed from: k  reason: collision with root package name */
    private g<E, E> f1428k;

    /* compiled from: ArraySet */
    class a extends g<E, E> {
        a() {
        }

        /* access modifiers changed from: protected */
        public void a() {
            b.this.clear();
        }

        /* access modifiers changed from: protected */
        public Object b(int i10, int i11) {
            return b.this.f1426i[i10];
        }

        /* access modifiers changed from: protected */
        public Map<E, E> c() {
            throw new UnsupportedOperationException("not a map");
        }

        /* access modifiers changed from: protected */
        public int d() {
            return b.this.f1427j;
        }

        /* access modifiers changed from: protected */
        public int e(Object obj) {
            return b.this.indexOf(obj);
        }

        /* access modifiers changed from: protected */
        public int f(Object obj) {
            return b.this.indexOf(obj);
        }

        /* access modifiers changed from: protected */
        public void g(E e10, E e11) {
            b.this.add(e10);
        }

        /* access modifiers changed from: protected */
        public void h(int i10) {
            b.this.g(i10);
        }

        /* access modifiers changed from: protected */
        public E i(int i10, E e10) {
            throw new UnsupportedOperationException("not a map");
        }
    }

    public b() {
        this(0);
    }

    private void a(int i10) {
        if (i10 == 8) {
            synchronized (b.class) {
                Object[] objArr = f1423p;
                if (objArr != null) {
                    this.f1426i = objArr;
                    f1423p = (Object[]) objArr[0];
                    this.f1425h = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f1424q--;
                    return;
                }
            }
        } else if (i10 == 4) {
            synchronized (b.class) {
                Object[] objArr2 = f1421n;
                if (objArr2 != null) {
                    this.f1426i = objArr2;
                    f1421n = (Object[]) objArr2[0];
                    this.f1425h = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f1422o--;
                    return;
                }
            }
        }
        this.f1425h = new int[i10];
        this.f1426i = new Object[i10];
    }

    private static void c(int[] iArr, Object[] objArr, int i10) {
        if (iArr.length == 8) {
            synchronized (b.class) {
                if (f1424q < 10) {
                    objArr[0] = f1423p;
                    objArr[1] = iArr;
                    for (int i11 = i10 - 1; i11 >= 2; i11--) {
                        objArr[i11] = null;
                    }
                    f1423p = objArr;
                    f1424q++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (b.class) {
                if (f1422o < 10) {
                    objArr[0] = f1421n;
                    objArr[1] = iArr;
                    for (int i12 = i10 - 1; i12 >= 2; i12--) {
                        objArr[i12] = null;
                    }
                    f1421n = objArr;
                    f1422o++;
                }
            }
        }
    }

    private g<E, E> d() {
        if (this.f1428k == null) {
            this.f1428k = new a();
        }
        return this.f1428k;
    }

    private int e(Object obj, int i10) {
        int i11 = this.f1427j;
        if (i11 == 0) {
            return -1;
        }
        int a10 = d.a(this.f1425h, i11, i10);
        if (a10 < 0 || obj.equals(this.f1426i[a10])) {
            return a10;
        }
        int i12 = a10 + 1;
        while (i12 < i11 && this.f1425h[i12] == i10) {
            if (obj.equals(this.f1426i[i12])) {
                return i12;
            }
            i12++;
        }
        int i13 = a10 - 1;
        while (i13 >= 0 && this.f1425h[i13] == i10) {
            if (obj.equals(this.f1426i[i13])) {
                return i13;
            }
            i13--;
        }
        return ~i12;
    }

    private int f() {
        int i10 = this.f1427j;
        if (i10 == 0) {
            return -1;
        }
        int a10 = d.a(this.f1425h, i10, 0);
        if (a10 < 0 || this.f1426i[a10] == null) {
            return a10;
        }
        int i11 = a10 + 1;
        while (i11 < i10 && this.f1425h[i11] == 0) {
            if (this.f1426i[i11] == null) {
                return i11;
            }
            i11++;
        }
        int i12 = a10 - 1;
        while (i12 >= 0 && this.f1425h[i12] == 0) {
            if (this.f1426i[i12] == null) {
                return i12;
            }
            i12--;
        }
        return ~i11;
    }

    public boolean add(E e10) {
        int i10;
        int i11;
        if (e10 == null) {
            i11 = f();
            i10 = 0;
        } else {
            int hashCode = e10.hashCode();
            i10 = hashCode;
            i11 = e(e10, hashCode);
        }
        if (i11 >= 0) {
            return false;
        }
        int i12 = ~i11;
        int i13 = this.f1427j;
        int[] iArr = this.f1425h;
        if (i13 >= iArr.length) {
            int i14 = 4;
            if (i13 >= 8) {
                i14 = (i13 >> 1) + i13;
            } else if (i13 >= 4) {
                i14 = 8;
            }
            Object[] objArr = this.f1426i;
            a(i14);
            int[] iArr2 = this.f1425h;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f1426i, 0, objArr.length);
            }
            c(iArr, objArr, this.f1427j);
        }
        int i15 = this.f1427j;
        if (i12 < i15) {
            int[] iArr3 = this.f1425h;
            int i16 = i12 + 1;
            System.arraycopy(iArr3, i12, iArr3, i16, i15 - i12);
            Object[] objArr2 = this.f1426i;
            System.arraycopy(objArr2, i12, objArr2, i16, this.f1427j - i12);
        }
        this.f1425h[i12] = i10;
        this.f1426i[i12] = e10;
        this.f1427j++;
        return true;
    }

    public boolean addAll(Collection<? extends E> collection) {
        b(this.f1427j + collection.size());
        boolean z10 = false;
        for (Object add : collection) {
            z10 |= add(add);
        }
        return z10;
    }

    public void b(int i10) {
        int[] iArr = this.f1425h;
        if (iArr.length < i10) {
            Object[] objArr = this.f1426i;
            a(i10);
            int i11 = this.f1427j;
            if (i11 > 0) {
                System.arraycopy(iArr, 0, this.f1425h, 0, i11);
                System.arraycopy(objArr, 0, this.f1426i, 0, this.f1427j);
            }
            c(iArr, objArr, this.f1427j);
        }
    }

    public void clear() {
        int i10 = this.f1427j;
        if (i10 != 0) {
            c(this.f1425h, this.f1426i, i10);
            this.f1425h = f1419l;
            this.f1426i = f1420m;
            this.f1427j = 0;
        }
    }

    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
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
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (size() != set.size()) {
                return false;
            }
            int i10 = 0;
            while (i10 < this.f1427j) {
                try {
                    if (!set.contains(i(i10))) {
                        return false;
                    }
                    i10++;
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    public E g(int i10) {
        E[] eArr = this.f1426i;
        E e10 = eArr[i10];
        int i11 = this.f1427j;
        if (i11 <= 1) {
            c(this.f1425h, eArr, i11);
            this.f1425h = f1419l;
            this.f1426i = f1420m;
            this.f1427j = 0;
        } else {
            int[] iArr = this.f1425h;
            int i12 = 8;
            if (iArr.length <= 8 || i11 >= iArr.length / 3) {
                int i13 = i11 - 1;
                this.f1427j = i13;
                if (i10 < i13) {
                    int i14 = i10 + 1;
                    System.arraycopy(iArr, i14, iArr, i10, i13 - i10);
                    Object[] objArr = this.f1426i;
                    System.arraycopy(objArr, i14, objArr, i10, this.f1427j - i10);
                }
                this.f1426i[this.f1427j] = null;
            } else {
                if (i11 > 8) {
                    i12 = i11 + (i11 >> 1);
                }
                a(i12);
                this.f1427j--;
                if (i10 > 0) {
                    System.arraycopy(iArr, 0, this.f1425h, 0, i10);
                    System.arraycopy(eArr, 0, this.f1426i, 0, i10);
                }
                int i15 = this.f1427j;
                if (i10 < i15) {
                    int i16 = i10 + 1;
                    System.arraycopy(iArr, i16, this.f1425h, i10, i15 - i10);
                    System.arraycopy(eArr, i16, this.f1426i, i10, this.f1427j - i10);
                }
            }
        }
        return e10;
    }

    public int hashCode() {
        int[] iArr = this.f1425h;
        int i10 = this.f1427j;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 += iArr[i12];
        }
        return i11;
    }

    public E i(int i10) {
        return this.f1426i[i10];
    }

    public int indexOf(Object obj) {
        return obj == null ? f() : e(obj, obj.hashCode());
    }

    public boolean isEmpty() {
        return this.f1427j <= 0;
    }

    public Iterator<E> iterator() {
        return d().m().iterator();
    }

    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        g(indexOf);
        return true;
    }

    public boolean removeAll(Collection<?> collection) {
        boolean z10 = false;
        for (Object remove : collection) {
            z10 |= remove(remove);
        }
        return z10;
    }

    public boolean retainAll(Collection<?> collection) {
        boolean z10 = false;
        for (int i10 = this.f1427j - 1; i10 >= 0; i10--) {
            if (!collection.contains(this.f1426i[i10])) {
                g(i10);
                z10 = true;
            }
        }
        return z10;
    }

    public int size() {
        return this.f1427j;
    }

    public Object[] toArray() {
        int i10 = this.f1427j;
        Object[] objArr = new Object[i10];
        System.arraycopy(this.f1426i, 0, objArr, 0, i10);
        return objArr;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f1427j * 14);
        sb.append('{');
        for (int i10 = 0; i10 < this.f1427j; i10++) {
            if (i10 > 0) {
                sb.append(", ");
            }
            Object i11 = i(i10);
            if (i11 != this) {
                sb.append(i11);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public b(int i10) {
        if (i10 == 0) {
            this.f1425h = f1419l;
            this.f1426i = f1420m;
        } else {
            a(i10);
        }
        this.f1427j = 0;
    }

    public <T> T[] toArray(T[] tArr) {
        if (tArr.length < this.f1427j) {
            tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.f1427j);
        }
        System.arraycopy(this.f1426i, 0, tArr, 0, this.f1427j);
        int length = tArr.length;
        int i10 = this.f1427j;
        if (length > i10) {
            tArr[i10] = null;
        }
        return tArr;
    }
}
