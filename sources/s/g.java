package s;

/* compiled from: Pools */
class g<T> implements f<T> {

    /* renamed from: a  reason: collision with root package name */
    private final Object[] f11246a;

    /* renamed from: b  reason: collision with root package name */
    private int f11247b;

    g(int i10) {
        if (i10 > 0) {
            this.f11246a = new Object[i10];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }

    public boolean a(T t10) {
        int i10 = this.f11247b;
        Object[] objArr = this.f11246a;
        if (i10 >= objArr.length) {
            return false;
        }
        objArr[i10] = t10;
        this.f11247b = i10 + 1;
        return true;
    }

    public T b() {
        int i10 = this.f11247b;
        if (i10 <= 0) {
            return null;
        }
        int i11 = i10 - 1;
        T[] tArr = this.f11246a;
        T t10 = tArr[i11];
        tArr[i11] = null;
        this.f11247b = i10 - 1;
        return t10;
    }

    public void c(T[] tArr, int i10) {
        if (i10 > tArr.length) {
            i10 = tArr.length;
        }
        for (int i11 = 0; i11 < i10; i11++) {
            T t10 = tArr[i11];
            int i12 = this.f11247b;
            Object[] objArr = this.f11246a;
            if (i12 < objArr.length) {
                objArr[i12] = t10;
                this.f11247b = i12 + 1;
            }
        }
    }
}
