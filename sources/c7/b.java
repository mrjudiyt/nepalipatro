package c7;

/* compiled from: GenericGFPoly */
final class b {

    /* renamed from: a  reason: collision with root package name */
    private final a f13363a;

    /* renamed from: b  reason: collision with root package name */
    private final int[] f13364b;

    b(a aVar, int[] iArr) {
        if (iArr.length != 0) {
            this.f13363a = aVar;
            int length = iArr.length;
            if (length <= 1 || iArr[0] != 0) {
                this.f13364b = iArr;
                return;
            }
            int i10 = 1;
            while (i10 < length && iArr[i10] == 0) {
                i10++;
            }
            if (i10 == length) {
                this.f13364b = new int[]{0};
                return;
            }
            int[] iArr2 = new int[(length - i10)];
            this.f13364b = iArr2;
            System.arraycopy(iArr, i10, iArr2, 0, iArr2.length);
            return;
        }
        throw new IllegalArgumentException();
    }

    /* access modifiers changed from: package-private */
    public b a(b bVar) {
        if (!this.f13363a.equals(bVar.f13363a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        } else if (f()) {
            return bVar;
        } else {
            if (bVar.f()) {
                return this;
            }
            int[] iArr = this.f13364b;
            int[] iArr2 = bVar.f13364b;
            if (iArr.length <= iArr2.length) {
                int[] iArr3 = iArr;
                iArr = iArr2;
                iArr2 = iArr3;
            }
            int[] iArr4 = new int[iArr.length];
            int length = iArr.length - iArr2.length;
            System.arraycopy(iArr, 0, iArr4, 0, length);
            for (int i10 = length; i10 < iArr.length; i10++) {
                iArr4[i10] = a.a(iArr2[i10 - length], iArr[i10]);
            }
            return new b(this.f13363a, iArr4);
        }
    }

    /* access modifiers changed from: package-private */
    public b[] b(b bVar) {
        if (!this.f13363a.equals(bVar.f13363a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        } else if (!bVar.f()) {
            b e10 = this.f13363a.e();
            int f10 = this.f13363a.f(bVar.c(bVar.e()));
            b bVar2 = this;
            while (bVar2.e() >= bVar.e() && !bVar2.f()) {
                int e11 = bVar2.e() - bVar.e();
                int h10 = this.f13363a.h(bVar2.c(bVar2.e()), f10);
                b h11 = bVar.h(e11, h10);
                e10 = e10.a(this.f13363a.b(e11, h10));
                bVar2 = bVar2.a(h11);
            }
            return new b[]{e10, bVar2};
        } else {
            throw new IllegalArgumentException("Divide by 0");
        }
    }

    /* access modifiers changed from: package-private */
    public int c(int i10) {
        int[] iArr = this.f13364b;
        return iArr[(iArr.length - 1) - i10];
    }

    /* access modifiers changed from: package-private */
    public int[] d() {
        return this.f13364b;
    }

    /* access modifiers changed from: package-private */
    public int e() {
        return this.f13364b.length - 1;
    }

    /* access modifiers changed from: package-private */
    public boolean f() {
        return this.f13364b[0] == 0;
    }

    /* access modifiers changed from: package-private */
    public b g(b bVar) {
        if (!this.f13363a.equals(bVar.f13363a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        } else if (f() || bVar.f()) {
            return this.f13363a.e();
        } else {
            int[] iArr = this.f13364b;
            int length = iArr.length;
            int[] iArr2 = bVar.f13364b;
            int length2 = iArr2.length;
            int[] iArr3 = new int[((length + length2) - 1)];
            for (int i10 = 0; i10 < length; i10++) {
                int i11 = iArr[i10];
                for (int i12 = 0; i12 < length2; i12++) {
                    int i13 = i10 + i12;
                    iArr3[i13] = a.a(iArr3[i13], this.f13363a.h(i11, iArr2[i12]));
                }
            }
            return new b(this.f13363a, iArr3);
        }
    }

    /* access modifiers changed from: package-private */
    public b h(int i10, int i11) {
        if (i10 < 0) {
            throw new IllegalArgumentException();
        } else if (i11 == 0) {
            return this.f13363a.e();
        } else {
            int length = this.f13364b.length;
            int[] iArr = new int[(i10 + length)];
            for (int i12 = 0; i12 < length; i12++) {
                iArr[i12] = this.f13363a.h(this.f13364b[i12], i11);
            }
            return new b(this.f13363a, iArr);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(e() * 8);
        for (int e10 = e(); e10 >= 0; e10--) {
            int c10 = c(e10);
            if (c10 != 0) {
                if (c10 < 0) {
                    sb.append(" - ");
                    c10 = -c10;
                } else if (sb.length() > 0) {
                    sb.append(" + ");
                }
                if (e10 == 0 || c10 != 1) {
                    int g10 = this.f13363a.g(c10);
                    if (g10 == 0) {
                        sb.append('1');
                    } else if (g10 == 1) {
                        sb.append('a');
                    } else {
                        sb.append("a^");
                        sb.append(g10);
                    }
                }
                if (e10 != 0) {
                    if (e10 == 1) {
                        sb.append('x');
                    } else {
                        sb.append("x^");
                        sb.append(e10);
                    }
                }
            }
        }
        return sb.toString();
    }
}
