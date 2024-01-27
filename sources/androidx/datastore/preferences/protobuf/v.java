package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.z;
import com.google.android.gms.common.api.Api;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: FloatArrayList */
final class v extends c<Float> implements z.f, RandomAccess, y0 {

    /* renamed from: k  reason: collision with root package name */
    private static final v f2996k;

    /* renamed from: i  reason: collision with root package name */
    private float[] f2997i;

    /* renamed from: j  reason: collision with root package name */
    private int f2998j;

    static {
        v vVar = new v(new float[0], 0);
        f2996k = vVar;
        vVar.h();
    }

    v() {
        this(new float[10], 0);
    }

    private void e(int i10, float f10) {
        int i11;
        a();
        if (i10 < 0 || i10 > (i11 = this.f2998j)) {
            throw new IndexOutOfBoundsException(k(i10));
        }
        float[] fArr = this.f2997i;
        if (i11 < fArr.length) {
            System.arraycopy(fArr, i10, fArr, i10 + 1, i11 - i10);
        } else {
            float[] fArr2 = new float[(((i11 * 3) / 2) + 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i10);
            System.arraycopy(this.f2997i, i10, fArr2, i10 + 1, this.f2998j - i10);
            this.f2997i = fArr2;
        }
        this.f2997i[i10] = f10;
        this.f2998j++;
        this.modCount++;
    }

    private void f(int i10) {
        if (i10 < 0 || i10 >= this.f2998j) {
            throw new IndexOutOfBoundsException(k(i10));
        }
    }

    private String k(int i10) {
        return "Index:" + i10 + ", Size:" + this.f2998j;
    }

    public boolean addAll(Collection<? extends Float> collection) {
        a();
        z.a(collection);
        if (!(collection instanceof v)) {
            return super.addAll(collection);
        }
        v vVar = (v) collection;
        int i10 = vVar.f2998j;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f2998j;
        if (Api.BaseClientBuilder.API_PRIORITY_OTHER - i11 >= i10) {
            int i12 = i11 + i10;
            float[] fArr = this.f2997i;
            if (i12 > fArr.length) {
                this.f2997i = Arrays.copyOf(fArr, i12);
            }
            System.arraycopy(vVar.f2997i, 0, this.f2997i, this.f2998j, vVar.f2998j);
            this.f2998j = i12;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: b */
    public void add(int i10, Float f10) {
        e(i10, f10.floatValue());
    }

    /* renamed from: c */
    public boolean add(Float f10) {
        d(f10.floatValue());
        return true;
    }

    public void d(float f10) {
        a();
        int i10 = this.f2998j;
        float[] fArr = this.f2997i;
        if (i10 == fArr.length) {
            float[] fArr2 = new float[(((i10 * 3) / 2) + 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i10);
            this.f2997i = fArr2;
        }
        float[] fArr3 = this.f2997i;
        int i11 = this.f2998j;
        this.f2998j = i11 + 1;
        fArr3[i11] = f10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return super.equals(obj);
        }
        v vVar = (v) obj;
        if (this.f2998j != vVar.f2998j) {
            return false;
        }
        float[] fArr = vVar.f2997i;
        for (int i10 = 0; i10 < this.f2998j; i10++) {
            if (Float.floatToIntBits(this.f2997i[i10]) != Float.floatToIntBits(fArr[i10])) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: g */
    public Float get(int i10) {
        return Float.valueOf(i(i10));
    }

    public int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f2998j; i11++) {
            i10 = (i10 * 31) + Float.floatToIntBits(this.f2997i[i11]);
        }
        return i10;
    }

    public float i(int i10) {
        f(i10);
        return this.f2997i[i10];
    }

    /* renamed from: l */
    public z.f q(int i10) {
        if (i10 >= this.f2998j) {
            return new v(Arrays.copyOf(this.f2997i, i10), this.f2998j);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: m */
    public Float remove(int i10) {
        a();
        f(i10);
        float[] fArr = this.f2997i;
        float f10 = fArr[i10];
        int i11 = this.f2998j;
        if (i10 < i11 - 1) {
            System.arraycopy(fArr, i10 + 1, fArr, i10, (i11 - i10) - 1);
        }
        this.f2998j--;
        this.modCount++;
        return Float.valueOf(f10);
    }

    /* renamed from: n */
    public Float set(int i10, Float f10) {
        return Float.valueOf(o(i10, f10.floatValue()));
    }

    public float o(int i10, float f10) {
        a();
        f(i10);
        float[] fArr = this.f2997i;
        float f11 = fArr[i10];
        fArr[i10] = f10;
        return f11;
    }

    /* access modifiers changed from: protected */
    public void removeRange(int i10, int i11) {
        a();
        if (i11 >= i10) {
            float[] fArr = this.f2997i;
            System.arraycopy(fArr, i11, fArr, i10, this.f2998j - i11);
            this.f2998j -= i11 - i10;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public int size() {
        return this.f2998j;
    }

    private v(float[] fArr, int i10) {
        this.f2997i = fArr;
        this.f2998j = i10;
    }

    public boolean remove(Object obj) {
        a();
        for (int i10 = 0; i10 < this.f2998j; i10++) {
            if (obj.equals(Float.valueOf(this.f2997i[i10]))) {
                float[] fArr = this.f2997i;
                System.arraycopy(fArr, i10 + 1, fArr, i10, (this.f2998j - i10) - 1);
                this.f2998j--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }
}
