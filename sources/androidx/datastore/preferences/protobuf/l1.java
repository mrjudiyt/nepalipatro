package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.r1;
import java.util.Arrays;

/* compiled from: UnknownFieldSetLite */
public final class l1 {

    /* renamed from: f  reason: collision with root package name */
    private static final l1 f2838f = new l1(0, new int[0], new Object[0], false);

    /* renamed from: a  reason: collision with root package name */
    private int f2839a;

    /* renamed from: b  reason: collision with root package name */
    private int[] f2840b;

    /* renamed from: c  reason: collision with root package name */
    private Object[] f2841c;

    /* renamed from: d  reason: collision with root package name */
    private int f2842d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f2843e;

    private l1() {
        this(0, new int[8], new Object[8], true);
    }

    private void b() {
        int i10 = this.f2839a;
        int[] iArr = this.f2840b;
        if (i10 == iArr.length) {
            int i11 = i10 + (i10 < 4 ? 8 : i10 >> 1);
            this.f2840b = Arrays.copyOf(iArr, i11);
            this.f2841c = Arrays.copyOf(this.f2841c, i11);
        }
    }

    private static boolean c(int[] iArr, int[] iArr2, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (iArr[i11] != iArr2[i11]) {
                return false;
            }
        }
        return true;
    }

    private static boolean d(Object[] objArr, Object[] objArr2, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (!objArr[i11].equals(objArr2[i11])) {
                return false;
            }
        }
        return true;
    }

    public static l1 e() {
        return f2838f;
    }

    private static int h(int[] iArr, int i10) {
        int i11 = 17;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 = (i11 * 31) + iArr[i12];
        }
        return i11;
    }

    private static int i(Object[] objArr, int i10) {
        int i11 = 17;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 = (i11 * 31) + objArr[i12].hashCode();
        }
        return i11;
    }

    static l1 k(l1 l1Var, l1 l1Var2) {
        int i10 = l1Var.f2839a + l1Var2.f2839a;
        int[] copyOf = Arrays.copyOf(l1Var.f2840b, i10);
        System.arraycopy(l1Var2.f2840b, 0, copyOf, l1Var.f2839a, l1Var2.f2839a);
        Object[] copyOf2 = Arrays.copyOf(l1Var.f2841c, i10);
        System.arraycopy(l1Var2.f2841c, 0, copyOf2, l1Var.f2839a, l1Var2.f2839a);
        return new l1(i10, copyOf, copyOf2, true);
    }

    static l1 l() {
        return new l1();
    }

    private static void p(int i10, Object obj, r1 r1Var) {
        int a10 = q1.a(i10);
        int b10 = q1.b(i10);
        if (b10 == 0) {
            r1Var.p(a10, ((Long) obj).longValue());
        } else if (b10 == 1) {
            r1Var.h(a10, ((Long) obj).longValue());
        } else if (b10 == 2) {
            r1Var.w(a10, (h) obj);
        } else if (b10 != 3) {
            if (b10 == 5) {
                r1Var.d(a10, ((Integer) obj).intValue());
                return;
            }
            throw new RuntimeException(InvalidProtocolBufferException.d());
        } else if (r1Var.i() == r1.a.ASCENDING) {
            r1Var.s(a10);
            ((l1) obj).q(r1Var);
            r1Var.F(a10);
        } else {
            r1Var.F(a10);
            ((l1) obj).q(r1Var);
            r1Var.s(a10);
        }
    }

    /* access modifiers changed from: package-private */
    public void a() {
        if (!this.f2843e) {
            throw new UnsupportedOperationException();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof l1)) {
            return false;
        }
        l1 l1Var = (l1) obj;
        int i10 = this.f2839a;
        return i10 == l1Var.f2839a && c(this.f2840b, l1Var.f2840b, i10) && d(this.f2841c, l1Var.f2841c, this.f2839a);
    }

    public int f() {
        int i10;
        int i11 = this.f2842d;
        if (i11 != -1) {
            return i11;
        }
        int i12 = 0;
        for (int i13 = 0; i13 < this.f2839a; i13++) {
            int i14 = this.f2840b[i13];
            int a10 = q1.a(i14);
            int b10 = q1.b(i14);
            if (b10 == 0) {
                i10 = CodedOutputStream.Y(a10, ((Long) this.f2841c[i13]).longValue());
            } else if (b10 == 1) {
                i10 = CodedOutputStream.o(a10, ((Long) this.f2841c[i13]).longValue());
            } else if (b10 == 2) {
                i10 = CodedOutputStream.g(a10, (h) this.f2841c[i13]);
            } else if (b10 == 3) {
                i10 = (CodedOutputStream.V(a10) * 2) + ((l1) this.f2841c[i13]).f();
            } else if (b10 == 5) {
                i10 = CodedOutputStream.m(a10, ((Integer) this.f2841c[i13]).intValue());
            } else {
                throw new IllegalStateException(InvalidProtocolBufferException.d());
            }
            i12 += i10;
        }
        this.f2842d = i12;
        return i12;
    }

    public int g() {
        int i10 = this.f2842d;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f2839a; i12++) {
            i11 += CodedOutputStream.J(q1.a(this.f2840b[i12]), (h) this.f2841c[i12]);
        }
        this.f2842d = i11;
        return i11;
    }

    public int hashCode() {
        int i10 = this.f2839a;
        return ((((527 + i10) * 31) + h(this.f2840b, i10)) * 31) + i(this.f2841c, this.f2839a);
    }

    public void j() {
        this.f2843e = false;
    }

    /* access modifiers changed from: package-private */
    public final void m(StringBuilder sb, int i10) {
        for (int i11 = 0; i11 < this.f2839a; i11++) {
            r0.c(sb, i10, String.valueOf(q1.a(this.f2840b[i11])), this.f2841c[i11]);
        }
    }

    /* access modifiers changed from: package-private */
    public void n(int i10, Object obj) {
        a();
        b();
        int[] iArr = this.f2840b;
        int i11 = this.f2839a;
        iArr[i11] = i10;
        this.f2841c[i11] = obj;
        this.f2839a = i11 + 1;
    }

    /* access modifiers changed from: package-private */
    public void o(r1 r1Var) {
        if (r1Var.i() == r1.a.DESCENDING) {
            for (int i10 = this.f2839a - 1; i10 >= 0; i10--) {
                r1Var.c(q1.a(this.f2840b[i10]), this.f2841c[i10]);
            }
            return;
        }
        for (int i11 = 0; i11 < this.f2839a; i11++) {
            r1Var.c(q1.a(this.f2840b[i11]), this.f2841c[i11]);
        }
    }

    public void q(r1 r1Var) {
        if (this.f2839a != 0) {
            if (r1Var.i() == r1.a.ASCENDING) {
                for (int i10 = 0; i10 < this.f2839a; i10++) {
                    p(this.f2840b[i10], this.f2841c[i10], r1Var);
                }
                return;
            }
            for (int i11 = this.f2839a - 1; i11 >= 0; i11--) {
                p(this.f2840b[i11], this.f2841c[i11], r1Var);
            }
        }
    }

    private l1(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.f2842d = -1;
        this.f2839a = i10;
        this.f2840b = iArr;
        this.f2841c = objArr;
        this.f2843e = z10;
    }
}
