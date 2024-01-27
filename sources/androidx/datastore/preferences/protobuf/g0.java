package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.z;
import com.google.android.gms.common.api.Api;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: LongArrayList */
final class g0 extends c<Long> implements z.h, RandomAccess, y0 {

    /* renamed from: k  reason: collision with root package name */
    private static final g0 f2747k;

    /* renamed from: i  reason: collision with root package name */
    private long[] f2748i;

    /* renamed from: j  reason: collision with root package name */
    private int f2749j;

    static {
        g0 g0Var = new g0(new long[0], 0);
        f2747k = g0Var;
        g0Var.h();
    }

    g0() {
        this(new long[10], 0);
    }

    private void d(int i10, long j10) {
        int i11;
        a();
        if (i10 < 0 || i10 > (i11 = this.f2749j)) {
            throw new IndexOutOfBoundsException(k(i10));
        }
        long[] jArr = this.f2748i;
        if (i11 < jArr.length) {
            System.arraycopy(jArr, i10, jArr, i10 + 1, i11 - i10);
        } else {
            long[] jArr2 = new long[(((i11 * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i10);
            System.arraycopy(this.f2748i, i10, jArr2, i10 + 1, this.f2749j - i10);
            this.f2748i = jArr2;
        }
        this.f2748i[i10] = j10;
        this.f2749j++;
        this.modCount++;
    }

    private void f(int i10) {
        if (i10 < 0 || i10 >= this.f2749j) {
            throw new IndexOutOfBoundsException(k(i10));
        }
    }

    private String k(int i10) {
        return "Index:" + i10 + ", Size:" + this.f2749j;
    }

    public boolean addAll(Collection<? extends Long> collection) {
        a();
        z.a(collection);
        if (!(collection instanceof g0)) {
            return super.addAll(collection);
        }
        g0 g0Var = (g0) collection;
        int i10 = g0Var.f2749j;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f2749j;
        if (Api.BaseClientBuilder.API_PRIORITY_OTHER - i11 >= i10) {
            int i12 = i11 + i10;
            long[] jArr = this.f2748i;
            if (i12 > jArr.length) {
                this.f2748i = Arrays.copyOf(jArr, i12);
            }
            System.arraycopy(g0Var.f2748i, 0, this.f2748i, this.f2749j, g0Var.f2749j);
            this.f2749j = i12;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: b */
    public void add(int i10, Long l10) {
        d(i10, l10.longValue());
    }

    /* renamed from: c */
    public boolean add(Long l10) {
        e(l10.longValue());
        return true;
    }

    public void e(long j10) {
        a();
        int i10 = this.f2749j;
        long[] jArr = this.f2748i;
        if (i10 == jArr.length) {
            long[] jArr2 = new long[(((i10 * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i10);
            this.f2748i = jArr2;
        }
        long[] jArr3 = this.f2748i;
        int i11 = this.f2749j;
        this.f2749j = i11 + 1;
        jArr3[i11] = j10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return super.equals(obj);
        }
        g0 g0Var = (g0) obj;
        if (this.f2749j != g0Var.f2749j) {
            return false;
        }
        long[] jArr = g0Var.f2748i;
        for (int i10 = 0; i10 < this.f2749j; i10++) {
            if (this.f2748i[i10] != jArr[i10]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: g */
    public Long get(int i10) {
        return Long.valueOf(i(i10));
    }

    public int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f2749j; i11++) {
            i10 = (i10 * 31) + z.f(this.f2748i[i11]);
        }
        return i10;
    }

    public long i(int i10) {
        f(i10);
        return this.f2748i[i10];
    }

    /* renamed from: l */
    public z.h q(int i10) {
        if (i10 >= this.f2749j) {
            return new g0(Arrays.copyOf(this.f2748i, i10), this.f2749j);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: m */
    public Long remove(int i10) {
        a();
        f(i10);
        long[] jArr = this.f2748i;
        long j10 = jArr[i10];
        int i11 = this.f2749j;
        if (i10 < i11 - 1) {
            System.arraycopy(jArr, i10 + 1, jArr, i10, (i11 - i10) - 1);
        }
        this.f2749j--;
        this.modCount++;
        return Long.valueOf(j10);
    }

    /* renamed from: n */
    public Long set(int i10, Long l10) {
        return Long.valueOf(o(i10, l10.longValue()));
    }

    public long o(int i10, long j10) {
        a();
        f(i10);
        long[] jArr = this.f2748i;
        long j11 = jArr[i10];
        jArr[i10] = j10;
        return j11;
    }

    /* access modifiers changed from: protected */
    public void removeRange(int i10, int i11) {
        a();
        if (i11 >= i10) {
            long[] jArr = this.f2748i;
            System.arraycopy(jArr, i11, jArr, i10, this.f2749j - i11);
            this.f2749j -= i11 - i10;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public int size() {
        return this.f2749j;
    }

    private g0(long[] jArr, int i10) {
        this.f2748i = jArr;
        this.f2749j = i10;
    }

    public boolean remove(Object obj) {
        a();
        for (int i10 = 0; i10 < this.f2749j; i10++) {
            if (obj.equals(Long.valueOf(this.f2748i[i10]))) {
                long[] jArr = this.f2748i;
                System.arraycopy(jArr, i10 + 1, jArr, i10, (this.f2749j - i10) - 1);
                this.f2749j--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }
}
