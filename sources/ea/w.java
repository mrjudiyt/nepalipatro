package ea;

import fa.c;
import kotlin.TypeCastException;
import kotlin.jvm.internal.m;

/* compiled from: SegmentedByteString.kt */
public final class w extends h {

    /* renamed from: m  reason: collision with root package name */
    private final transient byte[][] f14405m;

    /* renamed from: n  reason: collision with root package name */
    private final transient int[] f14406n;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public w(byte[][] bArr, int[] iArr) {
        super(h.f14363k.g());
        m.g(bArr, "segments");
        m.g(iArr, "directory");
        this.f14405m = bArr;
        this.f14406n = iArr;
    }

    private final h C() {
        return new h(w());
    }

    private final Object writeReplace() {
        h C = C();
        if (C != null) {
            return C;
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.Object");
    }

    public final byte[][] A() {
        return this.f14405m;
    }

    public boolean B(int i10, h hVar, int i11, int i12) {
        int i13;
        m.g(hVar, "other");
        if (i10 < 0 || i10 > u() - i12) {
            return false;
        }
        int i14 = i12 + i10;
        int b10 = c.b(this, i10);
        while (i10 < i14) {
            if (b10 == 0) {
                i13 = 0;
            } else {
                i13 = z()[b10 - 1];
            }
            int i15 = z()[A().length + b10];
            int min = Math.min(i14, (z()[b10] - i13) + i13) - i10;
            if (!hVar.r(i11, A()[b10], i15 + (i10 - i13), min)) {
                return false;
            }
            i11 += min;
            i10 += min;
            b10++;
        }
        return true;
    }

    public String a() {
        return C().a();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            return hVar.u() == u() && B(0, hVar, 0, u());
        }
    }

    public int hashCode() {
        int k10 = k();
        if (k10 != 0) {
            return k10;
        }
        int length = A().length;
        int i10 = 0;
        int i11 = 1;
        int i12 = 0;
        while (i10 < length) {
            int i13 = z()[length + i10];
            int i14 = z()[i10];
            byte[] bArr = A()[i10];
            int i15 = (i14 - i12) + i13;
            while (i13 < i15) {
                i11 = (i11 * 31) + bArr[i13];
                i13++;
            }
            i10++;
            i12 = i14;
        }
        s(i11);
        return i11;
    }

    public int l() {
        return z()[A().length - 1];
    }

    public String n() {
        return C().n();
    }

    public byte[] o() {
        return w();
    }

    public byte p(int i10) {
        int i11;
        c.b((long) z()[A().length - 1], (long) i10, 1);
        int b10 = c.b(this, i10);
        if (b10 == 0) {
            i11 = 0;
        } else {
            i11 = z()[b10 - 1];
        }
        return A()[b10][(i10 - i11) + z()[A().length + b10]];
    }

    public boolean r(int i10, byte[] bArr, int i11, int i12) {
        int i13;
        m.g(bArr, "other");
        if (i10 < 0 || i10 > u() - i12 || i11 < 0 || i11 > bArr.length - i12) {
            return false;
        }
        int i14 = i12 + i10;
        int b10 = c.b(this, i10);
        while (i10 < i14) {
            if (b10 == 0) {
                i13 = 0;
            } else {
                i13 = z()[b10 - 1];
            }
            int i15 = z()[A().length + b10];
            int min = Math.min(i14, (z()[b10] - i13) + i13) - i10;
            if (!c.a(A()[b10], i15 + (i10 - i13), bArr, i11, min)) {
                return false;
            }
            i11 += min;
            i10 += min;
            b10++;
        }
        return true;
    }

    public String toString() {
        return C().toString();
    }

    public h v() {
        return C().v();
    }

    public byte[] w() {
        byte[] bArr = new byte[u()];
        int length = A().length;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i10 < length) {
            int i13 = z()[length + i10];
            int i14 = z()[i10];
            int i15 = i14 - i11;
            byte[] unused = j.d(A()[i10], bArr, i12, i13, i13 + i15);
            i12 += i15;
            i10++;
            i11 = i14;
        }
        return bArr;
    }

    public void y(e eVar, int i10, int i11) {
        int i12;
        m.g(eVar, "buffer");
        int i13 = i11 + i10;
        int b10 = c.b(this, i10);
        while (i10 < i13) {
            if (b10 == 0) {
                i12 = 0;
            } else {
                i12 = z()[b10 - 1];
            }
            int i14 = z()[A().length + b10];
            int min = Math.min(i13, (z()[b10] - i12) + i12) - i10;
            int i15 = i14 + (i10 - i12);
            u uVar = new u(A()[b10], i15, i15 + min, true, false);
            u uVar2 = eVar.f14361h;
            if (uVar2 == null) {
                uVar.f14399g = uVar;
                uVar.f14398f = uVar;
                eVar.f14361h = uVar;
            } else {
                if (uVar2 == null) {
                    m.r();
                }
                u uVar3 = uVar2.f14399g;
                if (uVar3 == null) {
                    m.r();
                }
                uVar3.c(uVar);
            }
            i10 += min;
            b10++;
        }
        eVar.v0(eVar.w0() + ((long) u()));
    }

    public final int[] z() {
        return this.f14406n;
    }
}
