package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.z;
import com.google.android.gms.common.api.Api;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: BooleanArrayList */
final class f extends c<Boolean> implements z.a, RandomAccess, y0 {

    /* renamed from: k  reason: collision with root package name */
    private static final f f2741k;

    /* renamed from: i  reason: collision with root package name */
    private boolean[] f2742i;

    /* renamed from: j  reason: collision with root package name */
    private int f2743j;

    static {
        f fVar = new f(new boolean[0], 0);
        f2741k = fVar;
        fVar.h();
    }

    f() {
        this(new boolean[10], 0);
    }

    private void d(int i10, boolean z10) {
        int i11;
        a();
        if (i10 < 0 || i10 > (i11 = this.f2743j)) {
            throw new IndexOutOfBoundsException(k(i10));
        }
        boolean[] zArr = this.f2742i;
        if (i11 < zArr.length) {
            System.arraycopy(zArr, i10, zArr, i10 + 1, i11 - i10);
        } else {
            boolean[] zArr2 = new boolean[(((i11 * 3) / 2) + 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i10);
            System.arraycopy(this.f2742i, i10, zArr2, i10 + 1, this.f2743j - i10);
            this.f2742i = zArr2;
        }
        this.f2742i[i10] = z10;
        this.f2743j++;
        this.modCount++;
    }

    private void f(int i10) {
        if (i10 < 0 || i10 >= this.f2743j) {
            throw new IndexOutOfBoundsException(k(i10));
        }
    }

    private String k(int i10) {
        return "Index:" + i10 + ", Size:" + this.f2743j;
    }

    public boolean addAll(Collection<? extends Boolean> collection) {
        a();
        z.a(collection);
        if (!(collection instanceof f)) {
            return super.addAll(collection);
        }
        f fVar = (f) collection;
        int i10 = fVar.f2743j;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f2743j;
        if (Api.BaseClientBuilder.API_PRIORITY_OTHER - i11 >= i10) {
            int i12 = i11 + i10;
            boolean[] zArr = this.f2742i;
            if (i12 > zArr.length) {
                this.f2742i = Arrays.copyOf(zArr, i12);
            }
            System.arraycopy(fVar.f2742i, 0, this.f2742i, this.f2743j, fVar.f2743j);
            this.f2743j = i12;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: b */
    public void add(int i10, Boolean bool) {
        d(i10, bool.booleanValue());
    }

    /* renamed from: c */
    public boolean add(Boolean bool) {
        e(bool.booleanValue());
        return true;
    }

    public void e(boolean z10) {
        a();
        int i10 = this.f2743j;
        boolean[] zArr = this.f2742i;
        if (i10 == zArr.length) {
            boolean[] zArr2 = new boolean[(((i10 * 3) / 2) + 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i10);
            this.f2742i = zArr2;
        }
        boolean[] zArr3 = this.f2742i;
        int i11 = this.f2743j;
        this.f2743j = i11 + 1;
        zArr3[i11] = z10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return super.equals(obj);
        }
        f fVar = (f) obj;
        if (this.f2743j != fVar.f2743j) {
            return false;
        }
        boolean[] zArr = fVar.f2742i;
        for (int i10 = 0; i10 < this.f2743j; i10++) {
            if (this.f2742i[i10] != zArr[i10]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: g */
    public Boolean get(int i10) {
        return Boolean.valueOf(i(i10));
    }

    public int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f2743j; i11++) {
            i10 = (i10 * 31) + z.c(this.f2742i[i11]);
        }
        return i10;
    }

    public boolean i(int i10) {
        f(i10);
        return this.f2742i[i10];
    }

    /* renamed from: l */
    public z.a q(int i10) {
        if (i10 >= this.f2743j) {
            return new f(Arrays.copyOf(this.f2742i, i10), this.f2743j);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: m */
    public Boolean remove(int i10) {
        a();
        f(i10);
        boolean[] zArr = this.f2742i;
        boolean z10 = zArr[i10];
        int i11 = this.f2743j;
        if (i10 < i11 - 1) {
            System.arraycopy(zArr, i10 + 1, zArr, i10, (i11 - i10) - 1);
        }
        this.f2743j--;
        this.modCount++;
        return Boolean.valueOf(z10);
    }

    /* renamed from: n */
    public Boolean set(int i10, Boolean bool) {
        return Boolean.valueOf(o(i10, bool.booleanValue()));
    }

    public boolean o(int i10, boolean z10) {
        a();
        f(i10);
        boolean[] zArr = this.f2742i;
        boolean z11 = zArr[i10];
        zArr[i10] = z10;
        return z11;
    }

    /* access modifiers changed from: protected */
    public void removeRange(int i10, int i11) {
        a();
        if (i11 >= i10) {
            boolean[] zArr = this.f2742i;
            System.arraycopy(zArr, i11, zArr, i10, this.f2743j - i11);
            this.f2743j -= i11 - i10;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public int size() {
        return this.f2743j;
    }

    private f(boolean[] zArr, int i10) {
        this.f2742i = zArr;
        this.f2743j = i10;
    }

    public boolean remove(Object obj) {
        a();
        for (int i10 = 0; i10 < this.f2743j; i10++) {
            if (obj.equals(Boolean.valueOf(this.f2742i[i10]))) {
                boolean[] zArr = this.f2742i;
                System.arraycopy(zArr, i10 + 1, zArr, i10, (this.f2743j - i10) - 1);
                this.f2743j--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }
}
