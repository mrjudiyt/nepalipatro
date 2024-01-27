package a6;

/* compiled from: ParsableNalUnitBitArray */
public final class z {

    /* renamed from: a  reason: collision with root package name */
    private byte[] f281a;

    /* renamed from: b  reason: collision with root package name */
    private int f282b;

    /* renamed from: c  reason: collision with root package name */
    private int f283c;

    /* renamed from: d  reason: collision with root package name */
    private int f284d;

    public z(byte[] bArr, int i10, int i11) {
        i(bArr, i10, i11);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r1 = r2.f282b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a() {
        /*
            r2 = this;
            int r0 = r2.f283c
            if (r0 < 0) goto L_0x0010
            int r1 = r2.f282b
            if (r0 < r1) goto L_0x000e
            if (r0 != r1) goto L_0x0010
            int r0 = r2.f284d
            if (r0 != 0) goto L_0x0010
        L_0x000e:
            r0 = 1
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            a6.a.f(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a6.z.a():void");
    }

    private int f() {
        int i10 = 0;
        int i11 = 0;
        while (!d()) {
            i11++;
        }
        int i12 = (1 << i11) - 1;
        if (i11 > 0) {
            i10 = e(i11);
        }
        return i12 + i10;
    }

    private boolean j(int i10) {
        if (2 <= i10 && i10 < this.f282b) {
            byte[] bArr = this.f281a;
            return bArr[i10] == 3 && bArr[i10 + -2] == 0 && bArr[i10 - 1] == 0;
        }
    }

    public boolean b(int i10) {
        int i11 = this.f283c;
        int i12 = i10 / 8;
        int i13 = i11 + i12;
        int i14 = (this.f284d + i10) - (i12 * 8);
        if (i14 > 7) {
            i13++;
            i14 -= 8;
        }
        while (true) {
            i11++;
            if (i11 > i13 || i13 >= this.f282b) {
                int i15 = this.f282b;
            } else if (j(i11)) {
                i13++;
                i11 += 2;
            }
        }
        int i152 = this.f282b;
        if (i13 < i152) {
            return true;
        }
        if (i13 == i152 && i14 == 0) {
            return true;
        }
        return false;
    }

    public boolean c() {
        int i10 = this.f283c;
        int i11 = this.f284d;
        int i12 = 0;
        while (this.f283c < this.f282b && !d()) {
            i12++;
        }
        boolean z10 = this.f283c == this.f282b;
        this.f283c = i10;
        this.f284d = i11;
        if (z10 || !b((i12 * 2) + 1)) {
            return false;
        }
        return true;
    }

    public boolean d() {
        boolean z10 = (this.f281a[this.f283c] & (128 >> this.f284d)) != 0;
        k();
        return z10;
    }

    public int e(int i10) {
        int i11;
        int i12;
        this.f284d += i10;
        int i13 = 0;
        while (true) {
            i11 = this.f284d;
            i12 = 2;
            if (i11 <= 8) {
                break;
            }
            int i14 = i11 - 8;
            this.f284d = i14;
            byte[] bArr = this.f281a;
            int i15 = this.f283c;
            i13 |= (bArr[i15] & 255) << i14;
            if (!j(i15 + 1)) {
                i12 = 1;
            }
            this.f283c = i15 + i12;
        }
        byte[] bArr2 = this.f281a;
        int i16 = this.f283c;
        int i17 = (-1 >>> (32 - i10)) & (i13 | ((bArr2[i16] & 255) >> (8 - i11)));
        if (i11 == 8) {
            this.f284d = 0;
            if (!j(i16 + 1)) {
                i12 = 1;
            }
            this.f283c = i16 + i12;
        }
        a();
        return i17;
    }

    public int g() {
        int f10 = f();
        return (f10 % 2 == 0 ? -1 : 1) * ((f10 + 1) / 2);
    }

    public int h() {
        return f();
    }

    public void i(byte[] bArr, int i10, int i11) {
        this.f281a = bArr;
        this.f283c = i10;
        this.f282b = i11;
        this.f284d = 0;
        a();
    }

    public void k() {
        int i10 = 1;
        int i11 = this.f284d + 1;
        this.f284d = i11;
        if (i11 == 8) {
            this.f284d = 0;
            int i12 = this.f283c;
            if (j(i12 + 1)) {
                i10 = 2;
            }
            this.f283c = i12 + i10;
        }
        a();
    }

    public void l(int i10) {
        int i11 = this.f283c;
        int i12 = i10 / 8;
        int i13 = i11 + i12;
        this.f283c = i13;
        int i14 = this.f284d + (i10 - (i12 * 8));
        this.f284d = i14;
        if (i14 > 7) {
            this.f283c = i13 + 1;
            this.f284d = i14 - 8;
        }
        while (true) {
            i11++;
            if (i11 > this.f283c) {
                a();
                return;
            } else if (j(i11)) {
                this.f283c++;
                i11 += 2;
            }
        }
    }
}
