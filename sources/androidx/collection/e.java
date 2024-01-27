package androidx.collection;

/* compiled from: LongSparseArray */
public class e<E> implements Cloneable {

    /* renamed from: l  reason: collision with root package name */
    private static final Object f1437l = new Object();

    /* renamed from: h  reason: collision with root package name */
    private boolean f1438h;

    /* renamed from: i  reason: collision with root package name */
    private long[] f1439i;

    /* renamed from: j  reason: collision with root package name */
    private Object[] f1440j;

    /* renamed from: k  reason: collision with root package name */
    private int f1441k;

    public e() {
        this(10);
    }

    private void d() {
        int i10 = this.f1441k;
        long[] jArr = this.f1439i;
        Object[] objArr = this.f1440j;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            Object obj = objArr[i12];
            if (obj != f1437l) {
                if (i12 != i11) {
                    jArr[i11] = jArr[i12];
                    objArr[i11] = obj;
                    objArr[i12] = null;
                }
                i11++;
            }
        }
        this.f1438h = false;
        this.f1441k = i11;
    }

    public void a(long j10, E e10) {
        int i10 = this.f1441k;
        if (i10 == 0 || j10 > this.f1439i[i10 - 1]) {
            if (this.f1438h && i10 >= this.f1439i.length) {
                d();
            }
            int i11 = this.f1441k;
            if (i11 >= this.f1439i.length) {
                int f10 = d.f(i11 + 1);
                long[] jArr = new long[f10];
                Object[] objArr = new Object[f10];
                long[] jArr2 = this.f1439i;
                System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
                Object[] objArr2 = this.f1440j;
                System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
                this.f1439i = jArr;
                this.f1440j = objArr;
            }
            this.f1439i[i11] = j10;
            this.f1440j[i11] = e10;
            this.f1441k = i11 + 1;
            return;
        }
        k(j10, e10);
    }

    public void b() {
        int i10 = this.f1441k;
        Object[] objArr = this.f1440j;
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = null;
        }
        this.f1441k = 0;
        this.f1438h = false;
    }

    /* renamed from: c */
    public e<E> clone() {
        try {
            e<E> eVar = (e) super.clone();
            eVar.f1439i = (long[]) this.f1439i.clone();
            eVar.f1440j = (Object[]) this.f1440j.clone();
            return eVar;
        } catch (CloneNotSupportedException e10) {
            throw new AssertionError(e10);
        }
    }

    public E e(long j10) {
        return f(j10, (Object) null);
    }

    public E f(long j10, E e10) {
        int b10 = d.b(this.f1439i, this.f1441k, j10);
        if (b10 >= 0) {
            E[] eArr = this.f1440j;
            if (eArr[b10] != f1437l) {
                return eArr[b10];
            }
        }
        return e10;
    }

    public int g(long j10) {
        if (this.f1438h) {
            d();
        }
        return d.b(this.f1439i, this.f1441k, j10);
    }

    public long i(int i10) {
        if (this.f1438h) {
            d();
        }
        return this.f1439i[i10];
    }

    public void k(long j10, E e10) {
        int b10 = d.b(this.f1439i, this.f1441k, j10);
        if (b10 >= 0) {
            this.f1440j[b10] = e10;
            return;
        }
        int i10 = ~b10;
        int i11 = this.f1441k;
        if (i10 < i11) {
            Object[] objArr = this.f1440j;
            if (objArr[i10] == f1437l) {
                this.f1439i[i10] = j10;
                objArr[i10] = e10;
                return;
            }
        }
        if (this.f1438h && i11 >= this.f1439i.length) {
            d();
            i10 = ~d.b(this.f1439i, this.f1441k, j10);
        }
        int i12 = this.f1441k;
        if (i12 >= this.f1439i.length) {
            int f10 = d.f(i12 + 1);
            long[] jArr = new long[f10];
            Object[] objArr2 = new Object[f10];
            long[] jArr2 = this.f1439i;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f1440j;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f1439i = jArr;
            this.f1440j = objArr2;
        }
        int i13 = this.f1441k;
        if (i13 - i10 != 0) {
            long[] jArr3 = this.f1439i;
            int i14 = i10 + 1;
            System.arraycopy(jArr3, i10, jArr3, i14, i13 - i10);
            Object[] objArr4 = this.f1440j;
            System.arraycopy(objArr4, i10, objArr4, i14, this.f1441k - i10);
        }
        this.f1439i[i10] = j10;
        this.f1440j[i10] = e10;
        this.f1441k++;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r4 = r2.f1440j;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void l(long r3) {
        /*
            r2 = this;
            long[] r0 = r2.f1439i
            int r1 = r2.f1441k
            int r3 = androidx.collection.d.b(r0, r1, r3)
            if (r3 < 0) goto L_0x0017
            java.lang.Object[] r4 = r2.f1440j
            r0 = r4[r3]
            java.lang.Object r1 = f1437l
            if (r0 == r1) goto L_0x0017
            r4[r3] = r1
            r3 = 1
            r2.f1438h = r3
        L_0x0017:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.e.l(long):void");
    }

    public void m(int i10) {
        Object[] objArr = this.f1440j;
        Object obj = objArr[i10];
        Object obj2 = f1437l;
        if (obj != obj2) {
            objArr[i10] = obj2;
            this.f1438h = true;
        }
    }

    public int n() {
        if (this.f1438h) {
            d();
        }
        return this.f1441k;
    }

    public E o(int i10) {
        if (this.f1438h) {
            d();
        }
        return this.f1440j[i10];
    }

    public String toString() {
        if (n() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f1441k * 28);
        sb.append('{');
        for (int i10 = 0; i10 < this.f1441k; i10++) {
            if (i10 > 0) {
                sb.append(", ");
            }
            sb.append(i(i10));
            sb.append('=');
            Object o10 = o(i10);
            if (o10 != this) {
                sb.append(o10);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public e(int i10) {
        this.f1438h = false;
        if (i10 == 0) {
            this.f1439i = d.f1435b;
            this.f1440j = d.f1436c;
            return;
        }
        int f10 = d.f(i10);
        this.f1439i = new long[f10];
        this.f1440j = new Object[f10];
    }
}
