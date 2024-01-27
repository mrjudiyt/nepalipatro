package x7;

import java.util.Arrays;

/* compiled from: Settings */
public final class n {

    /* renamed from: a  reason: collision with root package name */
    private int f17271a;

    /* renamed from: b  reason: collision with root package name */
    private int f17272b;

    /* renamed from: c  reason: collision with root package name */
    private int f17273c;

    /* renamed from: d  reason: collision with root package name */
    private final int[] f17274d = new int[10];

    /* access modifiers changed from: package-private */
    public void a() {
        this.f17273c = 0;
        this.f17272b = 0;
        this.f17271a = 0;
        Arrays.fill(this.f17274d, 0);
    }

    /* access modifiers changed from: package-private */
    public int b(int i10) {
        int i11 = h(i10) ? 2 : 0;
        return k(i10) ? i11 | 1 : i11;
    }

    /* access modifiers changed from: package-private */
    public int c(int i10) {
        return this.f17274d[i10];
    }

    /* access modifiers changed from: package-private */
    public int d() {
        if ((this.f17271a & 2) != 0) {
            return this.f17274d[1];
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    public int e(int i10) {
        return (this.f17271a & 128) != 0 ? this.f17274d[7] : i10;
    }

    /* access modifiers changed from: package-private */
    public int f(int i10) {
        return (this.f17271a & 16) != 0 ? this.f17274d[4] : i10;
    }

    /* access modifiers changed from: package-private */
    public int g(int i10) {
        return (this.f17271a & 32) != 0 ? this.f17274d[5] : i10;
    }

    /* access modifiers changed from: package-private */
    public boolean h(int i10) {
        return ((1 << i10) & this.f17273c) != 0;
    }

    /* access modifiers changed from: package-private */
    public boolean i(int i10) {
        return ((1 << i10) & this.f17271a) != 0;
    }

    /* access modifiers changed from: package-private */
    public void j(n nVar) {
        for (int i10 = 0; i10 < 10; i10++) {
            if (nVar.i(i10)) {
                l(i10, nVar.b(i10), nVar.c(i10));
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean k(int i10) {
        return ((1 << i10) & this.f17272b) != 0;
    }

    /* access modifiers changed from: package-private */
    public n l(int i10, int i11, int i12) {
        int[] iArr = this.f17274d;
        if (i10 >= iArr.length) {
            return this;
        }
        int i13 = 1 << i10;
        this.f17271a |= i13;
        if ((i11 & 1) != 0) {
            this.f17272b |= i13;
        } else {
            this.f17272b &= ~i13;
        }
        if ((i11 & 2) != 0) {
            this.f17273c |= i13;
        } else {
            this.f17273c &= ~i13;
        }
        iArr[i10] = i12;
        return this;
    }

    /* access modifiers changed from: package-private */
    public int m() {
        return Integer.bitCount(this.f17271a);
    }
}
