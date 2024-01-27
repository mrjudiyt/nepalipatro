package k7;

import b7.a;
import com.google.zxing.WriterException;
import j7.c;

/* compiled from: MatrixUtil */
final class e {

    /* renamed from: a  reason: collision with root package name */
    private static final int[][] f15457a = {new int[]{1, 1, 1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1, 1, 1}};

    /* renamed from: b  reason: collision with root package name */
    private static final int[][] f15458b = {new int[]{1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 0, 1, 0, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1}};

    /* renamed from: c  reason: collision with root package name */
    private static final int[][] f15459c = {new int[]{-1, -1, -1, -1, -1, -1, -1}, new int[]{6, 18, -1, -1, -1, -1, -1}, new int[]{6, 22, -1, -1, -1, -1, -1}, new int[]{6, 26, -1, -1, -1, -1, -1}, new int[]{6, 30, -1, -1, -1, -1, -1}, new int[]{6, 34, -1, -1, -1, -1, -1}, new int[]{6, 22, 38, -1, -1, -1, -1}, new int[]{6, 24, 42, -1, -1, -1, -1}, new int[]{6, 26, 46, -1, -1, -1, -1}, new int[]{6, 28, 50, -1, -1, -1, -1}, new int[]{6, 30, 54, -1, -1, -1, -1}, new int[]{6, 32, 58, -1, -1, -1, -1}, new int[]{6, 34, 62, -1, -1, -1, -1}, new int[]{6, 26, 46, 66, -1, -1, -1}, new int[]{6, 26, 48, 70, -1, -1, -1}, new int[]{6, 26, 50, 74, -1, -1, -1}, new int[]{6, 30, 54, 78, -1, -1, -1}, new int[]{6, 30, 56, 82, -1, -1, -1}, new int[]{6, 30, 58, 86, -1, -1, -1}, new int[]{6, 34, 62, 90, -1, -1, -1}, new int[]{6, 28, 50, 72, 94, -1, -1}, new int[]{6, 26, 50, 74, 98, -1, -1}, new int[]{6, 30, 54, 78, 102, -1, -1}, new int[]{6, 28, 54, 80, 106, -1, -1}, new int[]{6, 32, 58, 84, 110, -1, -1}, new int[]{6, 30, 58, 86, 114, -1, -1}, new int[]{6, 34, 62, 90, 118, -1, -1}, new int[]{6, 26, 50, 74, 98, 122, -1}, new int[]{6, 30, 54, 78, 102, 126, -1}, new int[]{6, 26, 52, 78, 104, 130, -1}, new int[]{6, 30, 56, 82, 108, 134, -1}, new int[]{6, 34, 60, 86, 112, 138, -1}, new int[]{6, 30, 58, 86, 114, 142, -1}, new int[]{6, 34, 62, 90, 118, 146, -1}, new int[]{6, 30, 54, 78, 102, 126, 150}, new int[]{6, 24, 50, 76, 102, 128, 154}, new int[]{6, 28, 54, 80, 106, 132, 158}, new int[]{6, 32, 58, 84, 110, 136, 162}, new int[]{6, 26, 54, 82, 110, 138, 166}, new int[]{6, 30, 58, 86, 114, 142, 170}};

    /* renamed from: d  reason: collision with root package name */
    private static final int[][] f15460d = {new int[]{8, 0}, new int[]{8, 1}, new int[]{8, 2}, new int[]{8, 3}, new int[]{8, 4}, new int[]{8, 5}, new int[]{8, 7}, new int[]{8, 8}, new int[]{7, 8}, new int[]{5, 8}, new int[]{4, 8}, new int[]{3, 8}, new int[]{2, 8}, new int[]{1, 8}, new int[]{0, 8}};

    static void a(a aVar, j7.a aVar2, c cVar, int i10, b bVar) {
        c(bVar);
        d(cVar, bVar);
        l(aVar2, i10, bVar);
        s(cVar, bVar);
        f(aVar, i10, bVar);
    }

    static int b(int i10, int i11) {
        if (i11 != 0) {
            int n10 = n(i11);
            int i12 = i10 << (n10 - 1);
            while (n(i12) >= n10) {
                i12 ^= i11 << (n(i12) - n10);
            }
            return i12;
        }
        throw new IllegalArgumentException("0 polynomial");
    }

    static void c(b bVar) {
        bVar.a((byte) -1);
    }

    static void d(c cVar, b bVar) {
        j(bVar);
        e(bVar);
        r(cVar, bVar);
        k(bVar);
    }

    private static void e(b bVar) {
        if (bVar.b(8, bVar.d() - 8) != 0) {
            bVar.f(8, bVar.d() - 8, 1);
            return;
        }
        throw new WriterException();
    }

    static void f(a aVar, int i10, b bVar) {
        boolean z10;
        int e10 = bVar.e() - 1;
        int d10 = bVar.d() - 1;
        int i11 = 0;
        int i12 = -1;
        while (e10 > 0) {
            if (e10 == 6) {
                e10--;
            }
            while (d10 >= 0 && d10 < bVar.d()) {
                for (int i13 = 0; i13 < 2; i13++) {
                    int i14 = e10 - i13;
                    if (o(bVar.b(i14, d10))) {
                        if (i11 < aVar.g()) {
                            z10 = aVar.f(i11);
                            i11++;
                        } else {
                            z10 = false;
                        }
                        if (i10 != -1 && d.f(i10, i14, d10)) {
                            z10 = !z10;
                        }
                        bVar.g(i14, d10, z10);
                    }
                }
                d10 += i12;
            }
            i12 = -i12;
            d10 += i12;
            e10 -= 2;
        }
        if (i11 != aVar.g()) {
            throw new WriterException("Not all bits consumed: " + i11 + '/' + aVar.g());
        }
    }

    private static void g(int i10, int i11, b bVar) {
        int i12 = 0;
        while (i12 < 8) {
            int i13 = i10 + i12;
            if (o(bVar.b(i13, i11))) {
                bVar.f(i13, i11, 0);
                i12++;
            } else {
                throw new WriterException();
            }
        }
    }

    private static void h(int i10, int i11, b bVar) {
        for (int i12 = 0; i12 < 5; i12++) {
            int[] iArr = f15458b[i12];
            for (int i13 = 0; i13 < 5; i13++) {
                bVar.f(i10 + i13, i11 + i12, iArr[i13]);
            }
        }
    }

    private static void i(int i10, int i11, b bVar) {
        for (int i12 = 0; i12 < 7; i12++) {
            int[] iArr = f15457a[i12];
            for (int i13 = 0; i13 < 7; i13++) {
                bVar.f(i10 + i13, i11 + i12, iArr[i13]);
            }
        }
    }

    private static void j(b bVar) {
        int length = f15457a[0].length;
        i(0, 0, bVar);
        i(bVar.e() - length, 0, bVar);
        i(0, bVar.e() - length, bVar);
        g(0, 7, bVar);
        g(bVar.e() - 8, 7, bVar);
        g(0, bVar.e() - 8, bVar);
        m(7, 0, bVar);
        m((bVar.d() - 7) - 1, 0, bVar);
        m(7, bVar.d() - 7, bVar);
    }

    private static void k(b bVar) {
        int i10 = 8;
        while (i10 < bVar.e() - 8) {
            int i11 = i10 + 1;
            int i12 = i11 % 2;
            if (o(bVar.b(i10, 6))) {
                bVar.f(i10, 6, i12);
            }
            if (o(bVar.b(6, i10))) {
                bVar.f(6, i10, i12);
            }
            i10 = i11;
        }
    }

    static void l(j7.a aVar, int i10, b bVar) {
        a aVar2 = new a();
        p(aVar, i10, aVar2);
        for (int i11 = 0; i11 < aVar2.g(); i11++) {
            boolean f10 = aVar2.f((aVar2.g() - 1) - i11);
            int[] iArr = f15460d[i11];
            bVar.g(iArr[0], iArr[1], f10);
            if (i11 < 8) {
                bVar.g((bVar.e() - i11) - 1, 8, f10);
            } else {
                bVar.g(8, (bVar.d() - 7) + (i11 - 8), f10);
            }
        }
    }

    private static void m(int i10, int i11, b bVar) {
        int i12 = 0;
        while (i12 < 7) {
            int i13 = i11 + i12;
            if (o(bVar.b(i10, i13))) {
                bVar.f(i10, i13, 0);
                i12++;
            } else {
                throw new WriterException();
            }
        }
    }

    static int n(int i10) {
        return 32 - Integer.numberOfLeadingZeros(i10);
    }

    private static boolean o(int i10) {
        return i10 == -1;
    }

    static void p(j7.a aVar, int i10, a aVar2) {
        if (f.b(i10)) {
            int a10 = (aVar.a() << 3) | i10;
            aVar2.c(a10, 5);
            aVar2.c(b(a10, 1335), 10);
            a aVar3 = new a();
            aVar3.c(21522, 15);
            aVar2.m(aVar3);
            if (aVar2.g() != 15) {
                throw new WriterException("should not happen but we got: " + aVar2.g());
            }
            return;
        }
        throw new WriterException("Invalid mask pattern");
    }

    static void q(c cVar, a aVar) {
        aVar.c(cVar.f(), 6);
        aVar.c(b(cVar.f(), 7973), 12);
        if (aVar.g() != 18) {
            throw new WriterException("should not happen but we got: " + aVar.g());
        }
    }

    private static void r(c cVar, b bVar) {
        if (cVar.f() >= 2) {
            int[] iArr = f15459c[cVar.f() - 1];
            for (int i10 : iArr) {
                if (i10 >= 0) {
                    for (int i11 : iArr) {
                        if (i11 >= 0 && o(bVar.b(i11, i10))) {
                            h(i11 - 2, i10 - 2, bVar);
                        }
                    }
                }
            }
        }
    }

    static void s(c cVar, b bVar) {
        if (cVar.f() >= 7) {
            a aVar = new a();
            q(cVar, aVar);
            int i10 = 17;
            for (int i11 = 0; i11 < 6; i11++) {
                for (int i12 = 0; i12 < 3; i12++) {
                    boolean f10 = aVar.f(i10);
                    i10--;
                    bVar.g(i11, (bVar.d() - 11) + i12, f10);
                    bVar.g((bVar.d() - 11) + i12, i11, f10);
                }
            }
        }
    }
}
