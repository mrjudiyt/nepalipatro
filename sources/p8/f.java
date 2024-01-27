package p8;

import com.google.android.gms.common.api.Api;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;

/* compiled from: ArrayDeque.kt */
public final class f<E> extends d<E> {

    /* renamed from: k  reason: collision with root package name */
    public static final a f16204k = new a((g) null);

    /* renamed from: l  reason: collision with root package name */
    private static final Object[] f16205l = new Object[0];

    /* renamed from: h  reason: collision with root package name */
    private int f16206h;

    /* renamed from: i  reason: collision with root package name */
    private Object[] f16207i = f16205l;

    /* renamed from: j  reason: collision with root package name */
    private int f16208j;

    /* compiled from: ArrayDeque.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        public final int a(int i10, int i11) {
            int i12 = i10 + (i10 >> 1);
            if (i12 - i11 < 0) {
                i12 = i11;
            }
            if (i12 - 2147483639 <= 0) {
                return i12;
            }
            if (i11 > 2147483639) {
                return Api.BaseClientBuilder.API_PRIORITY_OTHER;
            }
            return 2147483639;
        }
    }

    private final void e(int i10, Collection<? extends E> collection) {
        Iterator<? extends E> it = collection.iterator();
        int length = this.f16207i.length;
        while (i10 < length && it.hasNext()) {
            this.f16207i[i10] = it.next();
            i10++;
        }
        int i11 = this.f16206h;
        for (int i12 = 0; i12 < i11 && it.hasNext(); i12++) {
            this.f16207i[i12] = it.next();
        }
        this.f16208j = size() + collection.size();
    }

    private final void f(int i10) {
        Object[] objArr = new Object[i10];
        Object[] objArr2 = this.f16207i;
        j.e(objArr2, objArr, 0, this.f16206h, objArr2.length);
        Object[] objArr3 = this.f16207i;
        int length = objArr3.length;
        int i11 = this.f16206h;
        j.e(objArr3, objArr, length - i11, 0, i11);
        this.f16206h = 0;
        this.f16207i = objArr;
    }

    private final int g(int i10) {
        return i10 == 0 ? k.r(this.f16207i) : i10 - 1;
    }

    private final void i(int i10) {
        if (i10 >= 0) {
            Object[] objArr = this.f16207i;
            if (i10 > objArr.length) {
                if (objArr == f16205l) {
                    this.f16207i = new Object[l.a(i10, 10)];
                } else {
                    f(f16204k.a(objArr.length, i10));
                }
            }
        } else {
            throw new IllegalStateException("Deque is too big.");
        }
    }

    private final int k(int i10) {
        if (i10 == k.r(this.f16207i)) {
            return 0;
        }
        return i10 + 1;
    }

    private final int l(int i10) {
        return i10 < 0 ? i10 + this.f16207i.length : i10;
    }

    private final int m(int i10) {
        Object[] objArr = this.f16207i;
        return i10 >= objArr.length ? i10 - objArr.length : i10;
    }

    public int a() {
        return this.f16208j;
    }

    public boolean add(E e10) {
        d(e10);
        return true;
    }

    public boolean addAll(Collection<? extends E> collection) {
        m.f(collection, "elements");
        if (collection.isEmpty()) {
            return false;
        }
        i(size() + collection.size());
        e(m(this.f16206h + size()), collection);
        return true;
    }

    public E b(int i10) {
        c.f16201h.a(i10, size());
        if (i10 == p.f(this)) {
            return p();
        }
        if (i10 == 0) {
            return n();
        }
        int m10 = m(this.f16206h + i10);
        E e10 = this.f16207i[m10];
        if (i10 < (size() >> 1)) {
            int i11 = this.f16206h;
            if (m10 >= i11) {
                Object[] objArr = this.f16207i;
                j.e(objArr, objArr, i11 + 1, i11, m10);
            } else {
                Object[] objArr2 = this.f16207i;
                j.e(objArr2, objArr2, 1, 0, m10);
                Object[] objArr3 = this.f16207i;
                objArr3[0] = objArr3[objArr3.length - 1];
                int i12 = this.f16206h;
                j.e(objArr3, objArr3, i12 + 1, i12, objArr3.length - 1);
            }
            Object[] objArr4 = this.f16207i;
            int i13 = this.f16206h;
            objArr4[i13] = null;
            this.f16206h = k(i13);
        } else {
            int m11 = m(this.f16206h + p.f(this));
            if (m10 <= m11) {
                Object[] objArr5 = this.f16207i;
                j.e(objArr5, objArr5, m10, m10 + 1, m11 + 1);
            } else {
                Object[] objArr6 = this.f16207i;
                j.e(objArr6, objArr6, m10, m10 + 1, objArr6.length);
                Object[] objArr7 = this.f16207i;
                objArr7[objArr7.length - 1] = objArr7[0];
                j.e(objArr7, objArr7, 0, 1, m11 + 1);
            }
            this.f16207i[m11] = null;
        }
        this.f16208j = size() - 1;
        return e10;
    }

    public final void c(E e10) {
        i(size() + 1);
        int g10 = g(this.f16206h);
        this.f16206h = g10;
        this.f16207i[g10] = e10;
        this.f16208j = size() + 1;
    }

    public void clear() {
        int m10 = m(this.f16206h + size());
        int i10 = this.f16206h;
        if (i10 < m10) {
            j.i(this.f16207i, null, i10, m10);
        } else if (!isEmpty()) {
            Object[] objArr = this.f16207i;
            j.i(objArr, null, this.f16206h, objArr.length);
            j.i(this.f16207i, null, 0, m10);
        }
        this.f16206h = 0;
        this.f16208j = 0;
    }

    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(E e10) {
        i(size() + 1);
        this.f16207i[m(this.f16206h + size())] = e10;
        this.f16208j = size() + 1;
    }

    public E get(int i10) {
        c.f16201h.a(i10, size());
        return this.f16207i[m(this.f16206h + i10)];
    }

    public int indexOf(Object obj) {
        int i10;
        int m10 = m(this.f16206h + size());
        int i11 = this.f16206h;
        if (i11 < m10) {
            while (i11 < m10) {
                if (m.a(obj, this.f16207i[i11])) {
                    i10 = this.f16206h;
                } else {
                    i11++;
                }
            }
            return -1;
        } else if (i11 < m10) {
            return -1;
        } else {
            int length = this.f16207i.length;
            while (true) {
                if (i11 >= length) {
                    int i12 = 0;
                    while (i12 < m10) {
                        if (m.a(obj, this.f16207i[i12])) {
                            i11 = i12 + this.f16207i.length;
                            i10 = this.f16206h;
                        } else {
                            i12++;
                        }
                    }
                    return -1;
                } else if (m.a(obj, this.f16207i[i11])) {
                    i10 = this.f16206h;
                    break;
                } else {
                    i11++;
                }
            }
        }
        return i11 - i10;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public int lastIndexOf(Object obj) {
        int i10;
        int i11;
        int m10 = m(this.f16206h + size());
        int i12 = this.f16206h;
        if (i12 < m10) {
            i10 = m10 - 1;
            if (i12 <= i10) {
                while (!m.a(obj, this.f16207i[i10])) {
                    if (i10 != i12) {
                        i10--;
                    }
                }
                i11 = this.f16206h;
            }
            return -1;
        }
        if (i12 > m10) {
            int i13 = m10 - 1;
            while (true) {
                if (-1 >= i13) {
                    int r10 = k.r(this.f16207i);
                    int i14 = this.f16206h;
                    if (i14 <= r10) {
                        while (!m.a(obj, this.f16207i[i10])) {
                            if (i10 != i14) {
                                r10 = i10 - 1;
                            }
                        }
                        i11 = this.f16206h;
                    }
                } else if (m.a(obj, this.f16207i[i13])) {
                    i10 = i13 + this.f16207i.length;
                    i11 = this.f16206h;
                    break;
                } else {
                    i13--;
                }
            }
        }
        return -1;
        return i10 - i11;
    }

    public final E n() {
        if (!isEmpty()) {
            E[] eArr = this.f16207i;
            int i10 = this.f16206h;
            E e10 = eArr[i10];
            eArr[i10] = null;
            this.f16206h = k(i10);
            this.f16208j = size() - 1;
            return e10;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    public final E o() {
        if (isEmpty()) {
            return null;
        }
        return n();
    }

    public final E p() {
        if (!isEmpty()) {
            int m10 = m(this.f16206h + p.f(this));
            E[] eArr = this.f16207i;
            E e10 = eArr[m10];
            eArr[m10] = null;
            this.f16208j = size() - 1;
            return e10;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v2 */
    /* JADX WARNING: type inference failed for: r1v3, types: [int] */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: type inference failed for: r1v9 */
    /* JADX WARNING: type inference failed for: r1v10 */
    /* JADX WARNING: type inference failed for: r1v12 */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean removeAll(java.util.Collection<? extends java.lang.Object> r12) {
        /*
            r11 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.m.f(r12, r0)
            boolean r0 = r11.isEmpty()
            r1 = 0
            if (r0 != 0) goto L_0x0096
            java.lang.Object[] r0 = r11.f16207i
            int r0 = r0.length
            r2 = 1
            if (r0 != 0) goto L_0x0014
            r0 = 1
            goto L_0x0015
        L_0x0014:
            r0 = 0
        L_0x0015:
            if (r0 == 0) goto L_0x0019
            goto L_0x0096
        L_0x0019:
            int r0 = r11.f16206h
            int r3 = r11.size()
            int r0 = r0 + r3
            int r0 = r11.m(r0)
            int r3 = r11.f16206h
            r4 = 0
            if (r3 >= r0) goto L_0x0049
            r5 = r3
        L_0x002a:
            if (r3 >= r0) goto L_0x0043
            java.lang.Object[] r6 = r11.f16207i
            r6 = r6[r3]
            boolean r7 = r12.contains(r6)
            r7 = r7 ^ r2
            if (r7 == 0) goto L_0x003f
            java.lang.Object[] r7 = r11.f16207i
            int r8 = r5 + 1
            r7[r5] = r6
            r5 = r8
            goto L_0x0040
        L_0x003f:
            r1 = 1
        L_0x0040:
            int r3 = r3 + 1
            goto L_0x002a
        L_0x0043:
            java.lang.Object[] r12 = r11.f16207i
            p8.j.i(r12, r4, r5, r0)
            goto L_0x008b
        L_0x0049:
            java.lang.Object[] r5 = r11.f16207i
            int r5 = r5.length
            r6 = r3
            r7 = 0
        L_0x004e:
            if (r3 >= r5) goto L_0x0069
            java.lang.Object[] r8 = r11.f16207i
            r9 = r8[r3]
            r8[r3] = r4
            boolean r8 = r12.contains(r9)
            r8 = r8 ^ r2
            if (r8 == 0) goto L_0x0065
            java.lang.Object[] r8 = r11.f16207i
            int r10 = r6 + 1
            r8[r6] = r9
            r6 = r10
            goto L_0x0066
        L_0x0065:
            r7 = 1
        L_0x0066:
            int r3 = r3 + 1
            goto L_0x004e
        L_0x0069:
            int r3 = r11.m(r6)
            r5 = r3
        L_0x006e:
            if (r1 >= r0) goto L_0x008a
            java.lang.Object[] r3 = r11.f16207i
            r6 = r3[r1]
            r3[r1] = r4
            boolean r3 = r12.contains(r6)
            r3 = r3 ^ r2
            if (r3 == 0) goto L_0x0086
            java.lang.Object[] r3 = r11.f16207i
            r3[r5] = r6
            int r5 = r11.k(r5)
            goto L_0x0087
        L_0x0086:
            r7 = 1
        L_0x0087:
            int r1 = r1 + 1
            goto L_0x006e
        L_0x008a:
            r1 = r7
        L_0x008b:
            if (r1 == 0) goto L_0x0096
            int r12 = r11.f16206h
            int r5 = r5 - r12
            int r12 = r11.l(r5)
            r11.f16208j = r12
        L_0x0096:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p8.f.removeAll(java.util.Collection):boolean");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v2 */
    /* JADX WARNING: type inference failed for: r1v3, types: [int] */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: type inference failed for: r1v9 */
    /* JADX WARNING: type inference failed for: r1v10 */
    /* JADX WARNING: type inference failed for: r1v12 */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean retainAll(java.util.Collection<? extends java.lang.Object> r12) {
        /*
            r11 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.m.f(r12, r0)
            boolean r0 = r11.isEmpty()
            r1 = 0
            if (r0 != 0) goto L_0x0093
            java.lang.Object[] r0 = r11.f16207i
            int r0 = r0.length
            r2 = 1
            if (r0 != 0) goto L_0x0014
            r0 = 1
            goto L_0x0015
        L_0x0014:
            r0 = 0
        L_0x0015:
            if (r0 == 0) goto L_0x0019
            goto L_0x0093
        L_0x0019:
            int r0 = r11.f16206h
            int r3 = r11.size()
            int r0 = r0 + r3
            int r0 = r11.m(r0)
            int r3 = r11.f16206h
            r4 = 0
            if (r3 >= r0) goto L_0x0048
            r5 = r3
        L_0x002a:
            if (r3 >= r0) goto L_0x0042
            java.lang.Object[] r6 = r11.f16207i
            r6 = r6[r3]
            boolean r7 = r12.contains(r6)
            if (r7 == 0) goto L_0x003e
            java.lang.Object[] r7 = r11.f16207i
            int r8 = r5 + 1
            r7[r5] = r6
            r5 = r8
            goto L_0x003f
        L_0x003e:
            r1 = 1
        L_0x003f:
            int r3 = r3 + 1
            goto L_0x002a
        L_0x0042:
            java.lang.Object[] r12 = r11.f16207i
            p8.j.i(r12, r4, r5, r0)
            goto L_0x0088
        L_0x0048:
            java.lang.Object[] r5 = r11.f16207i
            int r5 = r5.length
            r6 = r3
            r7 = 0
        L_0x004d:
            if (r3 >= r5) goto L_0x0067
            java.lang.Object[] r8 = r11.f16207i
            r9 = r8[r3]
            r8[r3] = r4
            boolean r8 = r12.contains(r9)
            if (r8 == 0) goto L_0x0063
            java.lang.Object[] r8 = r11.f16207i
            int r10 = r6 + 1
            r8[r6] = r9
            r6 = r10
            goto L_0x0064
        L_0x0063:
            r7 = 1
        L_0x0064:
            int r3 = r3 + 1
            goto L_0x004d
        L_0x0067:
            int r3 = r11.m(r6)
            r5 = r3
        L_0x006c:
            if (r1 >= r0) goto L_0x0087
            java.lang.Object[] r3 = r11.f16207i
            r6 = r3[r1]
            r3[r1] = r4
            boolean r3 = r12.contains(r6)
            if (r3 == 0) goto L_0x0083
            java.lang.Object[] r3 = r11.f16207i
            r3[r5] = r6
            int r5 = r11.k(r5)
            goto L_0x0084
        L_0x0083:
            r7 = 1
        L_0x0084:
            int r1 = r1 + 1
            goto L_0x006c
        L_0x0087:
            r1 = r7
        L_0x0088:
            if (r1 == 0) goto L_0x0093
            int r12 = r11.f16206h
            int r5 = r5 - r12
            int r12 = r11.l(r5)
            r11.f16208j = r12
        L_0x0093:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p8.f.retainAll(java.util.Collection):boolean");
    }

    public E set(int i10, E e10) {
        c.f16201h.a(i10, size());
        int m10 = m(this.f16206h + i10);
        E[] eArr = this.f16207i;
        E e11 = eArr[m10];
        eArr[m10] = e10;
        return e11;
    }

    public <T> T[] toArray(T[] tArr) {
        m.f(tArr, "array");
        if (tArr.length < size()) {
            tArr = h.a(tArr, size());
        }
        int m10 = m(this.f16206h + size());
        int i10 = this.f16206h;
        if (i10 < m10) {
            j.g(this.f16207i, tArr, 0, i10, m10, 2, (Object) null);
        } else if (!isEmpty()) {
            Object[] objArr = this.f16207i;
            j.e(objArr, tArr, 0, this.f16206h, objArr.length);
            Object[] objArr2 = this.f16207i;
            j.e(objArr2, tArr, objArr2.length - this.f16206h, 0, m10);
        }
        if (tArr.length > size()) {
            tArr[size()] = null;
        }
        return tArr;
    }

    public void add(int i10, E e10) {
        c.f16201h.b(i10, size());
        if (i10 == size()) {
            d(e10);
        } else if (i10 == 0) {
            c(e10);
        } else {
            i(size() + 1);
            int m10 = m(this.f16206h + i10);
            if (i10 < ((size() + 1) >> 1)) {
                int g10 = g(m10);
                int g11 = g(this.f16206h);
                int i11 = this.f16206h;
                if (g10 >= i11) {
                    Object[] objArr = this.f16207i;
                    objArr[g11] = objArr[i11];
                    j.e(objArr, objArr, i11, i11 + 1, g10 + 1);
                } else {
                    Object[] objArr2 = this.f16207i;
                    j.e(objArr2, objArr2, i11 - 1, i11, objArr2.length);
                    Object[] objArr3 = this.f16207i;
                    objArr3[objArr3.length - 1] = objArr3[0];
                    j.e(objArr3, objArr3, 0, 1, g10 + 1);
                }
                this.f16207i[g10] = e10;
                this.f16206h = g11;
            } else {
                int m11 = m(this.f16206h + size());
                if (m10 < m11) {
                    Object[] objArr4 = this.f16207i;
                    j.e(objArr4, objArr4, m10 + 1, m10, m11);
                } else {
                    Object[] objArr5 = this.f16207i;
                    j.e(objArr5, objArr5, 1, 0, m11);
                    Object[] objArr6 = this.f16207i;
                    objArr6[0] = objArr6[objArr6.length - 1];
                    j.e(objArr6, objArr6, m10 + 1, m10, objArr6.length - 1);
                }
                this.f16207i[m10] = e10;
            }
            this.f16208j = size() + 1;
        }
    }

    public boolean addAll(int i10, Collection<? extends E> collection) {
        m.f(collection, "elements");
        c.f16201h.b(i10, size());
        if (collection.isEmpty()) {
            return false;
        }
        if (i10 == size()) {
            return addAll(collection);
        }
        i(size() + collection.size());
        int m10 = m(this.f16206h + size());
        int m11 = m(this.f16206h + i10);
        int size = collection.size();
        if (i10 < ((size() + 1) >> 1)) {
            int i11 = this.f16206h;
            int i12 = i11 - size;
            if (m11 < i11) {
                Object[] objArr = this.f16207i;
                j.e(objArr, objArr, i12, i11, objArr.length);
                if (size >= m11) {
                    Object[] objArr2 = this.f16207i;
                    j.e(objArr2, objArr2, objArr2.length - size, 0, m11);
                } else {
                    Object[] objArr3 = this.f16207i;
                    j.e(objArr3, objArr3, objArr3.length - size, 0, size);
                    Object[] objArr4 = this.f16207i;
                    j.e(objArr4, objArr4, 0, size, m11);
                }
            } else if (i12 >= 0) {
                Object[] objArr5 = this.f16207i;
                j.e(objArr5, objArr5, i12, i11, m11);
            } else {
                Object[] objArr6 = this.f16207i;
                i12 += objArr6.length;
                int i13 = m11 - i11;
                int length = objArr6.length - i12;
                if (length >= i13) {
                    j.e(objArr6, objArr6, i12, i11, m11);
                } else {
                    j.e(objArr6, objArr6, i12, i11, i11 + length);
                    Object[] objArr7 = this.f16207i;
                    j.e(objArr7, objArr7, 0, this.f16206h + length, m11);
                }
            }
            this.f16206h = i12;
            e(l(m11 - size), collection);
        } else {
            int i14 = m11 + size;
            if (m11 < m10) {
                int i15 = size + m10;
                Object[] objArr8 = this.f16207i;
                if (i15 <= objArr8.length) {
                    j.e(objArr8, objArr8, i14, m11, m10);
                } else if (i14 >= objArr8.length) {
                    j.e(objArr8, objArr8, i14 - objArr8.length, m11, m10);
                } else {
                    int length2 = m10 - (i15 - objArr8.length);
                    j.e(objArr8, objArr8, 0, length2, m10);
                    Object[] objArr9 = this.f16207i;
                    j.e(objArr9, objArr9, i14, m11, length2);
                }
            } else {
                Object[] objArr10 = this.f16207i;
                j.e(objArr10, objArr10, size, 0, m10);
                Object[] objArr11 = this.f16207i;
                if (i14 >= objArr11.length) {
                    j.e(objArr11, objArr11, i14 - objArr11.length, m11, objArr11.length);
                } else {
                    j.e(objArr11, objArr11, 0, objArr11.length - size, objArr11.length);
                    Object[] objArr12 = this.f16207i;
                    j.e(objArr12, objArr12, i14, m11, objArr12.length - size);
                }
            }
            e(m11, collection);
        }
        return true;
    }

    public Object[] toArray() {
        return toArray(new Object[size()]);
    }
}
