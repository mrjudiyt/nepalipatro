package a6;

import java.util.NoSuchElementException;

/* compiled from: IntArrayQueue */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    private int f198a = 0;

    /* renamed from: b  reason: collision with root package name */
    private int f199b = -1;

    /* renamed from: c  reason: collision with root package name */
    private int f200c = 0;

    /* renamed from: d  reason: collision with root package name */
    private int[] f201d;

    /* renamed from: e  reason: collision with root package name */
    private int f202e;

    public l() {
        int[] iArr = new int[16];
        this.f201d = iArr;
        this.f202e = iArr.length - 1;
    }

    private void c() {
        int[] iArr = this.f201d;
        int length = iArr.length << 1;
        if (length >= 0) {
            int[] iArr2 = new int[length];
            int length2 = iArr.length;
            int i10 = this.f198a;
            int i11 = length2 - i10;
            System.arraycopy(iArr, i10, iArr2, 0, i11);
            System.arraycopy(this.f201d, 0, iArr2, i11, i10);
            this.f198a = 0;
            this.f199b = this.f200c - 1;
            this.f201d = iArr2;
            this.f202e = iArr2.length - 1;
            return;
        }
        throw new IllegalStateException();
    }

    public void a(int i10) {
        if (this.f200c == this.f201d.length) {
            c();
        }
        int i11 = (this.f199b + 1) & this.f202e;
        this.f199b = i11;
        this.f201d[i11] = i10;
        this.f200c++;
    }

    public void b() {
        this.f198a = 0;
        this.f199b = -1;
        this.f200c = 0;
    }

    public boolean d() {
        return this.f200c == 0;
    }

    public int e() {
        int i10 = this.f200c;
        if (i10 != 0) {
            int[] iArr = this.f201d;
            int i11 = this.f198a;
            int i12 = iArr[i11];
            this.f198a = (i11 + 1) & this.f202e;
            this.f200c = i10 - 1;
            return i12;
        }
        throw new NoSuchElementException();
    }
}
