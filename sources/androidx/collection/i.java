package androidx.collection;

/* compiled from: SparseArrayCompat */
public class i<E> implements Cloneable {

    /* renamed from: l  reason: collision with root package name */
    private static final Object f1464l = new Object();

    /* renamed from: h  reason: collision with root package name */
    private boolean f1465h;

    /* renamed from: i  reason: collision with root package name */
    private int[] f1466i;

    /* renamed from: j  reason: collision with root package name */
    private Object[] f1467j;

    /* renamed from: k  reason: collision with root package name */
    private int f1468k;

    public i() {
        this(10);
    }

    private void d() {
        int i10 = this.f1468k;
        int[] iArr = this.f1466i;
        Object[] objArr = this.f1467j;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            Object obj = objArr[i12];
            if (obj != f1464l) {
                if (i12 != i11) {
                    iArr[i11] = iArr[i12];
                    objArr[i11] = obj;
                    objArr[i12] = null;
                }
                i11++;
            }
        }
        this.f1465h = false;
        this.f1468k = i11;
    }

    public void a(int i10, E e10) {
        int i11 = this.f1468k;
        if (i11 == 0 || i10 > this.f1466i[i11 - 1]) {
            if (this.f1465h && i11 >= this.f1466i.length) {
                d();
            }
            int i12 = this.f1468k;
            if (i12 >= this.f1466i.length) {
                int e11 = d.e(i12 + 1);
                int[] iArr = new int[e11];
                Object[] objArr = new Object[e11];
                int[] iArr2 = this.f1466i;
                System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
                Object[] objArr2 = this.f1467j;
                System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
                this.f1466i = iArr;
                this.f1467j = objArr;
            }
            this.f1466i[i12] = i10;
            this.f1467j[i12] = e10;
            this.f1468k = i12 + 1;
            return;
        }
        i(i10, e10);
    }

    public void b() {
        int i10 = this.f1468k;
        Object[] objArr = this.f1467j;
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = null;
        }
        this.f1468k = 0;
        this.f1465h = false;
    }

    /* renamed from: c */
    public i<E> clone() {
        try {
            i<E> iVar = (i) super.clone();
            iVar.f1466i = (int[]) this.f1466i.clone();
            iVar.f1467j = (Object[]) this.f1467j.clone();
            return iVar;
        } catch (CloneNotSupportedException e10) {
            throw new AssertionError(e10);
        }
    }

    public E e(int i10) {
        return f(i10, (Object) null);
    }

    public E f(int i10, E e10) {
        int a10 = d.a(this.f1466i, this.f1468k, i10);
        if (a10 >= 0) {
            E[] eArr = this.f1467j;
            if (eArr[a10] != f1464l) {
                return eArr[a10];
            }
        }
        return e10;
    }

    public int g(int i10) {
        if (this.f1465h) {
            d();
        }
        return this.f1466i[i10];
    }

    public void i(int i10, E e10) {
        int a10 = d.a(this.f1466i, this.f1468k, i10);
        if (a10 >= 0) {
            this.f1467j[a10] = e10;
            return;
        }
        int i11 = ~a10;
        int i12 = this.f1468k;
        if (i11 < i12) {
            Object[] objArr = this.f1467j;
            if (objArr[i11] == f1464l) {
                this.f1466i[i11] = i10;
                objArr[i11] = e10;
                return;
            }
        }
        if (this.f1465h && i12 >= this.f1466i.length) {
            d();
            i11 = ~d.a(this.f1466i, this.f1468k, i10);
        }
        int i13 = this.f1468k;
        if (i13 >= this.f1466i.length) {
            int e11 = d.e(i13 + 1);
            int[] iArr = new int[e11];
            Object[] objArr2 = new Object[e11];
            int[] iArr2 = this.f1466i;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f1467j;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f1466i = iArr;
            this.f1467j = objArr2;
        }
        int i14 = this.f1468k;
        if (i14 - i11 != 0) {
            int[] iArr3 = this.f1466i;
            int i15 = i11 + 1;
            System.arraycopy(iArr3, i11, iArr3, i15, i14 - i11);
            Object[] objArr4 = this.f1467j;
            System.arraycopy(objArr4, i11, objArr4, i15, this.f1468k - i11);
        }
        this.f1466i[i11] = i10;
        this.f1467j[i11] = e10;
        this.f1468k++;
    }

    public int k() {
        if (this.f1465h) {
            d();
        }
        return this.f1468k;
    }

    public E l(int i10) {
        if (this.f1465h) {
            d();
        }
        return this.f1467j[i10];
    }

    public String toString() {
        if (k() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f1468k * 28);
        sb.append('{');
        for (int i10 = 0; i10 < this.f1468k; i10++) {
            if (i10 > 0) {
                sb.append(", ");
            }
            sb.append(g(i10));
            sb.append('=');
            Object l10 = l(i10);
            if (l10 != this) {
                sb.append(l10);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public i(int i10) {
        this.f1465h = false;
        if (i10 == 0) {
            this.f1466i = d.f1434a;
            this.f1467j = d.f1436c;
            return;
        }
        int e10 = d.e(i10);
        this.f1466i = new int[e10];
        this.f1467j = new Object[e10];
    }
}
