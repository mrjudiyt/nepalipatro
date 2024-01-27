package androidx.core.util;

/* compiled from: Pools */
public class f<T> implements e<T> {

    /* renamed from: a  reason: collision with root package name */
    private final Object[] f2456a;

    /* renamed from: b  reason: collision with root package name */
    private int f2457b;

    public f(int i10) {
        if (i10 > 0) {
            this.f2456a = new Object[i10];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }

    private boolean c(T t10) {
        for (int i10 = 0; i10 < this.f2457b; i10++) {
            if (this.f2456a[i10] == t10) {
                return true;
            }
        }
        return false;
    }

    public boolean a(T t10) {
        if (!c(t10)) {
            int i10 = this.f2457b;
            Object[] objArr = this.f2456a;
            if (i10 >= objArr.length) {
                return false;
            }
            objArr[i10] = t10;
            this.f2457b = i10 + 1;
            return true;
        }
        throw new IllegalStateException("Already in the pool!");
    }

    public T b() {
        int i10 = this.f2457b;
        if (i10 <= 0) {
            return null;
        }
        int i11 = i10 - 1;
        T[] tArr = this.f2456a;
        T t10 = tArr[i11];
        tArr[i11] = null;
        this.f2457b = i10 - 1;
        return t10;
    }
}
