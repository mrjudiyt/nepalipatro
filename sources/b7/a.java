package b7;

import java.util.Arrays;

/* compiled from: BitArray */
public final class a implements Cloneable {

    /* renamed from: h  reason: collision with root package name */
    private int[] f13301h;

    /* renamed from: i  reason: collision with root package name */
    private int f13302i;

    public a() {
        this.f13302i = 0;
        this.f13301h = new int[1];
    }

    private void e(int i10) {
        if (i10 > (this.f13301h.length << 5)) {
            int[] k10 = k(i10);
            int[] iArr = this.f13301h;
            System.arraycopy(iArr, 0, k10, 0, iArr.length);
            this.f13301h = k10;
        }
    }

    private static int[] k(int i10) {
        return new int[((i10 + 31) / 32)];
    }

    public void a(boolean z10) {
        e(this.f13302i + 1);
        if (z10) {
            int[] iArr = this.f13301h;
            int i10 = this.f13302i;
            int i11 = i10 / 32;
            iArr[i11] = (1 << (i10 & 31)) | iArr[i11];
        }
        this.f13302i++;
    }

    public void b(a aVar) {
        int i10 = aVar.f13302i;
        e(this.f13302i + i10);
        for (int i11 = 0; i11 < i10; i11++) {
            a(aVar.f(i11));
        }
    }

    public void c(int i10, int i11) {
        if (i11 < 0 || i11 > 32) {
            throw new IllegalArgumentException("Num bits must be between 0 and 32");
        }
        e(this.f13302i + i11);
        while (i11 > 0) {
            boolean z10 = true;
            if (((i10 >> (i11 - 1)) & 1) != 1) {
                z10 = false;
            }
            a(z10);
            i11--;
        }
    }

    /* renamed from: d */
    public a clone() {
        return new a((int[]) this.f13301h.clone(), this.f13302i);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f13302i != aVar.f13302i || !Arrays.equals(this.f13301h, aVar.f13301h)) {
            return false;
        }
        return true;
    }

    public boolean f(int i10) {
        return ((1 << (i10 & 31)) & this.f13301h[i10 / 32]) != 0;
    }

    public int g() {
        return this.f13302i;
    }

    public int hashCode() {
        return (this.f13302i * 31) + Arrays.hashCode(this.f13301h);
    }

    public int i() {
        return (this.f13302i + 7) / 8;
    }

    public void l(int i10, byte[] bArr, int i11, int i12) {
        for (int i13 = 0; i13 < i12; i13++) {
            int i14 = 0;
            for (int i15 = 0; i15 < 8; i15++) {
                if (f(i10)) {
                    i14 |= 1 << (7 - i15);
                }
                i10++;
            }
            bArr[i11 + i13] = (byte) i14;
        }
    }

    public void m(a aVar) {
        if (this.f13302i == aVar.f13302i) {
            int i10 = 0;
            while (true) {
                int[] iArr = this.f13301h;
                if (i10 < iArr.length) {
                    iArr[i10] = iArr[i10] ^ aVar.f13301h[i10];
                    i10++;
                } else {
                    return;
                }
            }
        } else {
            throw new IllegalArgumentException("Sizes don't match");
        }
    }

    public String toString() {
        int i10 = this.f13302i;
        StringBuilder sb = new StringBuilder(i10 + (i10 / 8) + 1);
        for (int i11 = 0; i11 < this.f13302i; i11++) {
            if ((i11 & 7) == 0) {
                sb.append(' ');
            }
            sb.append(f(i11) ? 'X' : '.');
        }
        return sb.toString();
    }

    a(int[] iArr, int i10) {
        this.f13301h = iArr;
        this.f13302i = i10;
    }
}
