package androidx.datastore.preferences.protobuf;

import java.util.Arrays;
import java.util.RandomAccess;

/* compiled from: ProtobufArrayList */
final class b1<E> extends c<E> implements RandomAccess {

    /* renamed from: k  reason: collision with root package name */
    private static final b1<Object> f2715k;

    /* renamed from: i  reason: collision with root package name */
    private E[] f2716i;

    /* renamed from: j  reason: collision with root package name */
    private int f2717j;

    static {
        b1<Object> b1Var = new b1<>(new Object[0], 0);
        f2715k = b1Var;
        b1Var.h();
    }

    private b1(E[] eArr, int i10) {
        this.f2716i = eArr;
        this.f2717j = i10;
    }

    private static <E> E[] b(int i10) {
        return new Object[i10];
    }

    public static <E> b1<E> c() {
        return f2715k;
    }

    private void d(int i10) {
        if (i10 < 0 || i10 >= this.f2717j) {
            throw new IndexOutOfBoundsException(e(i10));
        }
    }

    private String e(int i10) {
        return "Index:" + i10 + ", Size:" + this.f2717j;
    }

    public boolean add(E e10) {
        a();
        int i10 = this.f2717j;
        E[] eArr = this.f2716i;
        if (i10 == eArr.length) {
            this.f2716i = Arrays.copyOf(eArr, ((i10 * 3) / 2) + 1);
        }
        E[] eArr2 = this.f2716i;
        int i11 = this.f2717j;
        this.f2717j = i11 + 1;
        eArr2[i11] = e10;
        this.modCount++;
        return true;
    }

    /* renamed from: f */
    public b1<E> q(int i10) {
        if (i10 >= this.f2717j) {
            return new b1<>(Arrays.copyOf(this.f2716i, i10), this.f2717j);
        }
        throw new IllegalArgumentException();
    }

    public E get(int i10) {
        d(i10);
        return this.f2716i[i10];
    }

    public E remove(int i10) {
        a();
        d(i10);
        E[] eArr = this.f2716i;
        E e10 = eArr[i10];
        int i11 = this.f2717j;
        if (i10 < i11 - 1) {
            System.arraycopy(eArr, i10 + 1, eArr, i10, (i11 - i10) - 1);
        }
        this.f2717j--;
        this.modCount++;
        return e10;
    }

    public E set(int i10, E e10) {
        a();
        d(i10);
        E[] eArr = this.f2716i;
        E e11 = eArr[i10];
        eArr[i10] = e10;
        this.modCount++;
        return e11;
    }

    public int size() {
        return this.f2717j;
    }

    public void add(int i10, E e10) {
        int i11;
        a();
        if (i10 < 0 || i10 > (i11 = this.f2717j)) {
            throw new IndexOutOfBoundsException(e(i10));
        }
        E[] eArr = this.f2716i;
        if (i11 < eArr.length) {
            System.arraycopy(eArr, i10, eArr, i10 + 1, i11 - i10);
        } else {
            E[] b10 = b(((i11 * 3) / 2) + 1);
            System.arraycopy(this.f2716i, 0, b10, 0, i10);
            System.arraycopy(this.f2716i, i10, b10, i10 + 1, this.f2717j - i10);
            this.f2716i = b10;
        }
        this.f2716i[i10] = e10;
        this.f2717j++;
        this.modCount++;
    }
}
