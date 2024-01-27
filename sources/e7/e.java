package e7;

import java.util.Arrays;

/* compiled from: DefaultPlacement */
public class e {

    /* renamed from: a  reason: collision with root package name */
    private final CharSequence f14293a;

    /* renamed from: b  reason: collision with root package name */
    private final int f14294b;

    /* renamed from: c  reason: collision with root package name */
    private final int f14295c;

    /* renamed from: d  reason: collision with root package name */
    private final byte[] f14296d;

    public e(CharSequence charSequence, int i10, int i11) {
        this.f14293a = charSequence;
        this.f14295c = i10;
        this.f14294b = i11;
        byte[] bArr = new byte[(i10 * i11)];
        this.f14296d = bArr;
        Arrays.fill(bArr, (byte) -1);
    }

    private void a(int i10) {
        g(this.f14294b - 1, 0, i10, 1);
        g(this.f14294b - 1, 1, i10, 2);
        g(this.f14294b - 1, 2, i10, 3);
        g(0, this.f14295c - 2, i10, 4);
        g(0, this.f14295c - 1, i10, 5);
        g(1, this.f14295c - 1, i10, 6);
        g(2, this.f14295c - 1, i10, 7);
        g(3, this.f14295c - 1, i10, 8);
    }

    private void b(int i10) {
        g(this.f14294b - 3, 0, i10, 1);
        g(this.f14294b - 2, 0, i10, 2);
        g(this.f14294b - 1, 0, i10, 3);
        g(0, this.f14295c - 4, i10, 4);
        g(0, this.f14295c - 3, i10, 5);
        g(0, this.f14295c - 2, i10, 6);
        g(0, this.f14295c - 1, i10, 7);
        g(1, this.f14295c - 1, i10, 8);
    }

    private void c(int i10) {
        g(this.f14294b - 3, 0, i10, 1);
        g(this.f14294b - 2, 0, i10, 2);
        g(this.f14294b - 1, 0, i10, 3);
        g(0, this.f14295c - 2, i10, 4);
        g(0, this.f14295c - 1, i10, 5);
        g(1, this.f14295c - 1, i10, 6);
        g(2, this.f14295c - 1, i10, 7);
        g(3, this.f14295c - 1, i10, 8);
    }

    private void d(int i10) {
        g(this.f14294b - 1, 0, i10, 1);
        g(this.f14294b - 1, this.f14295c - 1, i10, 2);
        g(0, this.f14295c - 3, i10, 3);
        g(0, this.f14295c - 2, i10, 4);
        g(0, this.f14295c - 1, i10, 5);
        g(1, this.f14295c - 3, i10, 6);
        g(1, this.f14295c - 2, i10, 7);
        g(1, this.f14295c - 1, i10, 8);
    }

    private boolean f(int i10, int i11) {
        return this.f14296d[(i11 * this.f14295c) + i10] >= 0;
    }

    private void g(int i10, int i11, int i12, int i13) {
        if (i10 < 0) {
            int i14 = this.f14294b;
            i10 += i14;
            i11 += 4 - ((i14 + 4) % 8);
        }
        if (i11 < 0) {
            int i15 = this.f14295c;
            i11 += i15;
            i10 += 4 - ((i15 + 4) % 8);
        }
        boolean z10 = true;
        if ((this.f14293a.charAt(i12) & (1 << (8 - i13))) == 0) {
            z10 = false;
        }
        i(i11, i10, z10);
    }

    private void i(int i10, int i11, boolean z10) {
        this.f14296d[(i11 * this.f14295c) + i10] = z10 ? (byte) 1 : 0;
    }

    private void j(int i10, int i11, int i12) {
        int i13 = i10 - 2;
        int i14 = i11 - 2;
        g(i13, i14, i12, 1);
        int i15 = i11 - 1;
        g(i13, i15, i12, 2);
        int i16 = i10 - 1;
        g(i16, i14, i12, 3);
        g(i16, i15, i12, 4);
        g(i16, i11, i12, 5);
        g(i10, i14, i12, 6);
        g(i10, i15, i12, 7);
        g(i10, i11, i12, 8);
    }

    public final boolean e(int i10, int i11) {
        return this.f14296d[(i11 * this.f14295c) + i10] == 1;
    }

    public final void h() {
        int i10;
        int i11;
        int i12 = 0;
        int i13 = 0;
        int i14 = 4;
        while (true) {
            if (i14 == this.f14294b && i12 == 0) {
                a(i13);
                i13++;
            }
            if (i14 == this.f14294b - 2 && i12 == 0 && this.f14295c % 4 != 0) {
                b(i13);
                i13++;
            }
            if (i14 == this.f14294b - 2 && i12 == 0 && this.f14295c % 8 == 4) {
                c(i13);
                i13++;
            }
            if (i14 == this.f14294b + 4 && i12 == 2 && this.f14295c % 8 == 0) {
                d(i13);
                i13++;
            }
            do {
                if (i14 < this.f14294b && i12 >= 0 && !f(i12, i14)) {
                    j(i14, i12, i13);
                    i13++;
                }
                i14 -= 2;
                i12 += 2;
                if (i14 < 0 || i12 >= this.f14295c) {
                    int i15 = i14 + 1;
                    int i16 = i12 + 3;
                }
                j(i14, i12, i13);
                i13++;
                i14 -= 2;
                i12 += 2;
                break;
            } while (i12 >= this.f14295c);
            int i152 = i14 + 1;
            int i162 = i12 + 3;
            do {
                if (i152 >= 0 && i162 < this.f14295c && !f(i162, i152)) {
                    j(i152, i162, i13);
                    i13++;
                }
                i152 += 2;
                i162 -= 2;
                i10 = this.f14294b;
                if (i152 >= i10) {
                    break;
                }
            } while (i162 >= 0);
            i14 = i152 + 3;
            i12 = i162 + 1;
            if (i14 >= i10 && i12 >= (i11 = this.f14295c)) {
                break;
            }
        }
        if (!f(i11 - 1, i10 - 1)) {
            i(this.f14295c - 1, this.f14294b - 1, true);
            i(this.f14295c - 2, this.f14294b - 2, true);
        }
    }
}
