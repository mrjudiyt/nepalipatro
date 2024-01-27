package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.z;
import com.google.android.gms.common.api.Api;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: DoubleArrayList */
final class l extends c<Double> implements z.b, RandomAccess, y0 {

    /* renamed from: k  reason: collision with root package name */
    private static final l f2835k;

    /* renamed from: i  reason: collision with root package name */
    private double[] f2836i;

    /* renamed from: j  reason: collision with root package name */
    private int f2837j;

    static {
        l lVar = new l(new double[0], 0);
        f2835k = lVar;
        lVar.h();
    }

    l() {
        this(new double[10], 0);
    }

    private void e(int i10, double d10) {
        int i11;
        a();
        if (i10 < 0 || i10 > (i11 = this.f2837j)) {
            throw new IndexOutOfBoundsException(k(i10));
        }
        double[] dArr = this.f2836i;
        if (i11 < dArr.length) {
            System.arraycopy(dArr, i10, dArr, i10 + 1, i11 - i10);
        } else {
            double[] dArr2 = new double[(((i11 * 3) / 2) + 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i10);
            System.arraycopy(this.f2836i, i10, dArr2, i10 + 1, this.f2837j - i10);
            this.f2836i = dArr2;
        }
        this.f2836i[i10] = d10;
        this.f2837j++;
        this.modCount++;
    }

    private void f(int i10) {
        if (i10 < 0 || i10 >= this.f2837j) {
            throw new IndexOutOfBoundsException(k(i10));
        }
    }

    private String k(int i10) {
        return "Index:" + i10 + ", Size:" + this.f2837j;
    }

    public boolean addAll(Collection<? extends Double> collection) {
        a();
        z.a(collection);
        if (!(collection instanceof l)) {
            return super.addAll(collection);
        }
        l lVar = (l) collection;
        int i10 = lVar.f2837j;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f2837j;
        if (Api.BaseClientBuilder.API_PRIORITY_OTHER - i11 >= i10) {
            int i12 = i11 + i10;
            double[] dArr = this.f2836i;
            if (i12 > dArr.length) {
                this.f2836i = Arrays.copyOf(dArr, i12);
            }
            System.arraycopy(lVar.f2836i, 0, this.f2836i, this.f2837j, lVar.f2837j);
            this.f2837j = i12;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: b */
    public void add(int i10, Double d10) {
        e(i10, d10.doubleValue());
    }

    /* renamed from: c */
    public boolean add(Double d10) {
        d(d10.doubleValue());
        return true;
    }

    public void d(double d10) {
        a();
        int i10 = this.f2837j;
        double[] dArr = this.f2836i;
        if (i10 == dArr.length) {
            double[] dArr2 = new double[(((i10 * 3) / 2) + 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i10);
            this.f2836i = dArr2;
        }
        double[] dArr3 = this.f2836i;
        int i11 = this.f2837j;
        this.f2837j = i11 + 1;
        dArr3[i11] = d10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return super.equals(obj);
        }
        l lVar = (l) obj;
        if (this.f2837j != lVar.f2837j) {
            return false;
        }
        double[] dArr = lVar.f2836i;
        for (int i10 = 0; i10 < this.f2837j; i10++) {
            if (Double.doubleToLongBits(this.f2836i[i10]) != Double.doubleToLongBits(dArr[i10])) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: g */
    public Double get(int i10) {
        return Double.valueOf(i(i10));
    }

    public int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f2837j; i11++) {
            i10 = (i10 * 31) + z.f(Double.doubleToLongBits(this.f2836i[i11]));
        }
        return i10;
    }

    public double i(int i10) {
        f(i10);
        return this.f2836i[i10];
    }

    /* renamed from: l */
    public z.b q(int i10) {
        if (i10 >= this.f2837j) {
            return new l(Arrays.copyOf(this.f2836i, i10), this.f2837j);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: m */
    public Double remove(int i10) {
        a();
        f(i10);
        double[] dArr = this.f2836i;
        double d10 = dArr[i10];
        int i11 = this.f2837j;
        if (i10 < i11 - 1) {
            System.arraycopy(dArr, i10 + 1, dArr, i10, (i11 - i10) - 1);
        }
        this.f2837j--;
        this.modCount++;
        return Double.valueOf(d10);
    }

    /* renamed from: n */
    public Double set(int i10, Double d10) {
        return Double.valueOf(o(i10, d10.doubleValue()));
    }

    public double o(int i10, double d10) {
        a();
        f(i10);
        double[] dArr = this.f2836i;
        double d11 = dArr[i10];
        dArr[i10] = d10;
        return d11;
    }

    /* access modifiers changed from: protected */
    public void removeRange(int i10, int i11) {
        a();
        if (i11 >= i10) {
            double[] dArr = this.f2836i;
            System.arraycopy(dArr, i11, dArr, i10, this.f2837j - i11);
            this.f2837j -= i11 - i10;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public int size() {
        return this.f2837j;
    }

    private l(double[] dArr, int i10) {
        this.f2836i = dArr;
        this.f2837j = i10;
    }

    public boolean remove(Object obj) {
        a();
        for (int i10 = 0; i10 < this.f2837j; i10++) {
            if (obj.equals(Double.valueOf(this.f2836i[i10]))) {
                double[] dArr = this.f2836i;
                System.arraycopy(dArr, i10 + 1, dArr, i10, (this.f2837j - i10) - 1);
                this.f2837j--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }
}
