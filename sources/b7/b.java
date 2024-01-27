package b7;

import java.util.Arrays;

/* compiled from: BitMatrix */
public final class b implements Cloneable {

    /* renamed from: h  reason: collision with root package name */
    private final int f13303h;

    /* renamed from: i  reason: collision with root package name */
    private final int f13304i;

    /* renamed from: j  reason: collision with root package name */
    private final int f13305j;

    /* renamed from: k  reason: collision with root package name */
    private final int[] f13306k;

    public b(int i10) {
        this(i10, i10);
    }

    private String a(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(this.f13304i * (this.f13303h + 1));
        for (int i10 = 0; i10 < this.f13304i; i10++) {
            for (int i11 = 0; i11 < this.f13303h; i11++) {
                sb.append(d(i11, i10) ? str : str2);
            }
            sb.append(str3);
        }
        return sb.toString();
    }

    public void b() {
        int length = this.f13306k.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.f13306k[i10] = 0;
        }
    }

    /* renamed from: c */
    public b clone() {
        return new b(this.f13303h, this.f13304i, this.f13305j, (int[]) this.f13306k.clone());
    }

    public boolean d(int i10, int i11) {
        return ((this.f13306k[(i11 * this.f13305j) + (i10 / 32)] >>> (i10 & 31)) & 1) != 0;
    }

    public int e() {
        return this.f13304i;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f13303h == bVar.f13303h && this.f13304i == bVar.f13304i && this.f13305j == bVar.f13305j && Arrays.equals(this.f13306k, bVar.f13306k)) {
            return true;
        }
        return false;
    }

    public int f() {
        return this.f13303h;
    }

    public void g(int i10, int i11) {
        int i12 = (i11 * this.f13305j) + (i10 / 32);
        int[] iArr = this.f13306k;
        iArr[i12] = (1 << (i10 & 31)) | iArr[i12];
    }

    public int hashCode() {
        int i10 = this.f13303h;
        return (((((((i10 * 31) + i10) * 31) + this.f13304i) * 31) + this.f13305j) * 31) + Arrays.hashCode(this.f13306k);
    }

    public void i(int i10, int i11, int i12, int i13) {
        if (i11 < 0 || i10 < 0) {
            throw new IllegalArgumentException("Left and top must be nonnegative");
        } else if (i13 <= 0 || i12 <= 0) {
            throw new IllegalArgumentException("Height and width must be at least 1");
        } else {
            int i14 = i12 + i10;
            int i15 = i13 + i11;
            if (i15 > this.f13304i || i14 > this.f13303h) {
                throw new IllegalArgumentException("The region must fit inside the matrix");
            }
            while (i11 < i15) {
                int i16 = this.f13305j * i11;
                for (int i17 = i10; i17 < i14; i17++) {
                    int[] iArr = this.f13306k;
                    int i18 = (i17 / 32) + i16;
                    iArr[i18] = iArr[i18] | (1 << (i17 & 31));
                }
                i11++;
            }
        }
    }

    public String k(String str, String str2) {
        return a(str, str2, "\n");
    }

    public String toString() {
        return k("X ", "  ");
    }

    public b(int i10, int i11) {
        if (i10 <= 0 || i11 <= 0) {
            throw new IllegalArgumentException("Both dimensions must be greater than 0");
        }
        this.f13303h = i10;
        this.f13304i = i11;
        int i12 = (i10 + 31) / 32;
        this.f13305j = i12;
        this.f13306k = new int[(i12 * i11)];
    }

    private b(int i10, int i11, int i12, int[] iArr) {
        this.f13303h = i10;
        this.f13304i = i11;
        this.f13305j = i12;
        this.f13306k = iArr;
    }
}
