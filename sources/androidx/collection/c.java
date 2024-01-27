package androidx.collection;

/* compiled from: CircularIntArray */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private int[] f1430a;

    /* renamed from: b  reason: collision with root package name */
    private int f1431b;

    /* renamed from: c  reason: collision with root package name */
    private int f1432c;

    /* renamed from: d  reason: collision with root package name */
    private int f1433d;

    public c() {
        this(8);
    }

    private void c() {
        int[] iArr = this.f1430a;
        int length = iArr.length;
        int i10 = this.f1431b;
        int i11 = length - i10;
        int i12 = length << 1;
        if (i12 >= 0) {
            int[] iArr2 = new int[i12];
            System.arraycopy(iArr, i10, iArr2, 0, i11);
            System.arraycopy(this.f1430a, 0, iArr2, i11, this.f1431b);
            this.f1430a = iArr2;
            this.f1431b = 0;
            this.f1432c = length;
            this.f1433d = i12 - 1;
            return;
        }
        throw new RuntimeException("Max array capacity exceeded");
    }

    public void a(int i10) {
        int[] iArr = this.f1430a;
        int i11 = this.f1432c;
        iArr[i11] = i10;
        int i12 = this.f1433d & (i11 + 1);
        this.f1432c = i12;
        if (i12 == this.f1431b) {
            c();
        }
    }

    public void b() {
        this.f1432c = this.f1431b;
    }

    public boolean d() {
        return this.f1431b == this.f1432c;
    }

    public int e() {
        int i10 = this.f1431b;
        if (i10 != this.f1432c) {
            int i11 = this.f1430a[i10];
            this.f1431b = (i10 + 1) & this.f1433d;
            return i11;
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public c(int i10) {
        if (i10 < 1) {
            throw new IllegalArgumentException("capacity must be >= 1");
        } else if (i10 <= 1073741824) {
            i10 = Integer.bitCount(i10) != 1 ? Integer.highestOneBit(i10 - 1) << 1 : i10;
            this.f1433d = i10 - 1;
            this.f1430a = new int[i10];
        } else {
            throw new IllegalArgumentException("capacity must be <= 2^30");
        }
    }
}
