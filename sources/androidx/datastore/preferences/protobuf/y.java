package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.z;
import com.google.android.gms.common.api.Api;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: IntArrayList */
final class y extends c<Integer> implements z.g, RandomAccess, y0 {

    /* renamed from: k  reason: collision with root package name */
    private static final y f3021k;

    /* renamed from: i  reason: collision with root package name */
    private int[] f3022i;

    /* renamed from: j  reason: collision with root package name */
    private int f3023j;

    static {
        y yVar = new y(new int[0], 0);
        f3021k = yVar;
        yVar.h();
    }

    y() {
        this(new int[10], 0);
    }

    private void e(int i10, int i11) {
        int i12;
        a();
        if (i10 < 0 || i10 > (i12 = this.f3023j)) {
            throw new IndexOutOfBoundsException(k(i10));
        }
        int[] iArr = this.f3022i;
        if (i12 < iArr.length) {
            System.arraycopy(iArr, i10, iArr, i10 + 1, i12 - i10);
        } else {
            int[] iArr2 = new int[(((i12 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i10);
            System.arraycopy(this.f3022i, i10, iArr2, i10 + 1, this.f3023j - i10);
            this.f3022i = iArr2;
        }
        this.f3022i[i10] = i11;
        this.f3023j++;
        this.modCount++;
    }

    private void f(int i10) {
        if (i10 < 0 || i10 >= this.f3023j) {
            throw new IndexOutOfBoundsException(k(i10));
        }
    }

    private String k(int i10) {
        return "Index:" + i10 + ", Size:" + this.f3023j;
    }

    public boolean addAll(Collection<? extends Integer> collection) {
        a();
        z.a(collection);
        if (!(collection instanceof y)) {
            return super.addAll(collection);
        }
        y yVar = (y) collection;
        int i10 = yVar.f3023j;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f3023j;
        if (Api.BaseClientBuilder.API_PRIORITY_OTHER - i11 >= i10) {
            int i12 = i11 + i10;
            int[] iArr = this.f3022i;
            if (i12 > iArr.length) {
                this.f3022i = Arrays.copyOf(iArr, i12);
            }
            System.arraycopy(yVar.f3022i, 0, this.f3022i, this.f3023j, yVar.f3023j);
            this.f3023j = i12;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: b */
    public void add(int i10, Integer num) {
        e(i10, num.intValue());
    }

    /* renamed from: c */
    public boolean add(Integer num) {
        d(num.intValue());
        return true;
    }

    public void d(int i10) {
        a();
        int i11 = this.f3023j;
        int[] iArr = this.f3022i;
        if (i11 == iArr.length) {
            int[] iArr2 = new int[(((i11 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i11);
            this.f3022i = iArr2;
        }
        int[] iArr3 = this.f3022i;
        int i12 = this.f3023j;
        this.f3023j = i12 + 1;
        iArr3[i12] = i10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return super.equals(obj);
        }
        y yVar = (y) obj;
        if (this.f3023j != yVar.f3023j) {
            return false;
        }
        int[] iArr = yVar.f3022i;
        for (int i10 = 0; i10 < this.f3023j; i10++) {
            if (this.f3022i[i10] != iArr[i10]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: g */
    public Integer get(int i10) {
        return Integer.valueOf(i(i10));
    }

    public int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f3023j; i11++) {
            i10 = (i10 * 31) + this.f3022i[i11];
        }
        return i10;
    }

    public int i(int i10) {
        f(i10);
        return this.f3022i[i10];
    }

    /* renamed from: l */
    public z.g q(int i10) {
        if (i10 >= this.f3023j) {
            return new y(Arrays.copyOf(this.f3022i, i10), this.f3023j);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: m */
    public Integer remove(int i10) {
        a();
        f(i10);
        int[] iArr = this.f3022i;
        int i11 = iArr[i10];
        int i12 = this.f3023j;
        if (i10 < i12 - 1) {
            System.arraycopy(iArr, i10 + 1, iArr, i10, (i12 - i10) - 1);
        }
        this.f3023j--;
        this.modCount++;
        return Integer.valueOf(i11);
    }

    /* renamed from: n */
    public Integer set(int i10, Integer num) {
        return Integer.valueOf(o(i10, num.intValue()));
    }

    public int o(int i10, int i11) {
        a();
        f(i10);
        int[] iArr = this.f3022i;
        int i12 = iArr[i10];
        iArr[i10] = i11;
        return i12;
    }

    /* access modifiers changed from: protected */
    public void removeRange(int i10, int i11) {
        a();
        if (i11 >= i10) {
            int[] iArr = this.f3022i;
            System.arraycopy(iArr, i11, iArr, i10, this.f3023j - i11);
            this.f3023j -= i11 - i10;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public int size() {
        return this.f3023j;
    }

    private y(int[] iArr, int i10) {
        this.f3022i = iArr;
        this.f3023j = i10;
    }

    public boolean remove(Object obj) {
        a();
        for (int i10 = 0; i10 < this.f3023j; i10++) {
            if (obj.equals(Integer.valueOf(this.f3022i[i10]))) {
                int[] iArr = this.f3022i;
                System.arraycopy(iArr, i10 + 1, iArr, i10, (this.f3023j - i10) - 1);
                this.f3023j--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }
}
