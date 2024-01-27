package a7;

import b7.a;
import b7.b;

/* compiled from: Encoder */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private static final int[] f13272a = {4, 6, 6, 8, 8, 8, 8, 8, 8, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12};

    private static int[] a(a aVar, int i10, int i11) {
        int[] iArr = new int[i11];
        int g10 = aVar.g() / i10;
        for (int i12 = 0; i12 < g10; i12++) {
            int i13 = 0;
            for (int i14 = 0; i14 < i10; i14++) {
                i13 |= aVar.f((i12 * i10) + i14) ? 1 << ((i10 - i14) - 1) : 0;
            }
            iArr[i12] = i13;
        }
        return iArr;
    }

    private static void b(b bVar, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12 += 2) {
            int i13 = i10 - i12;
            int i14 = i13;
            while (true) {
                int i15 = i10 + i12;
                if (i14 > i15) {
                    break;
                }
                bVar.g(i14, i13);
                bVar.g(i14, i15);
                bVar.g(i13, i14);
                bVar.g(i15, i14);
                i14++;
            }
        }
        int i16 = i10 - i11;
        bVar.g(i16, i16);
        int i17 = i16 + 1;
        bVar.g(i17, i16);
        bVar.g(i16, i17);
        int i18 = i10 + i11;
        bVar.g(i18, i16);
        bVar.g(i18, i17);
        bVar.g(i18, i18 - 1);
    }

    private static void c(b bVar, boolean z10, int i10, a aVar) {
        int i11 = i10 / 2;
        int i12 = 0;
        if (z10) {
            while (i12 < 7) {
                int i13 = (i11 - 3) + i12;
                if (aVar.f(i12)) {
                    bVar.g(i13, i11 - 5);
                }
                if (aVar.f(i12 + 7)) {
                    bVar.g(i11 + 5, i13);
                }
                if (aVar.f(20 - i12)) {
                    bVar.g(i13, i11 + 5);
                }
                if (aVar.f(27 - i12)) {
                    bVar.g(i11 - 5, i13);
                }
                i12++;
            }
            return;
        }
        while (i12 < 10) {
            int i14 = (i11 - 5) + i12 + (i12 / 5);
            if (aVar.f(i12)) {
                bVar.g(i14, i11 - 7);
            }
            if (aVar.f(i12 + 10)) {
                bVar.g(i11 + 7, i14);
            }
            if (aVar.f(29 - i12)) {
                bVar.g(i14, i11 + 7);
            }
            if (aVar.f(39 - i12)) {
                bVar.g(i11 - 7, i14);
            }
            i12++;
        }
    }

    public static a d(byte[] bArr, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        boolean z10;
        a aVar;
        int i15;
        a a10 = new d(bArr).a();
        int i16 = 11;
        int g10 = ((a10.g() * i10) / 100) + 11;
        int g11 = a10.g() + g10;
        int i17 = 32;
        int i18 = 0;
        int i19 = 1;
        if (i11 != 0) {
            z10 = i11 < 0;
            i13 = Math.abs(i11);
            if (z10) {
                i17 = 4;
            }
            if (i13 <= i17) {
                i14 = i(i13, z10);
                i12 = f13272a[i13];
                int i20 = i14 - (i14 % i12);
                aVar = h(a10, i12);
                if (aVar.g() + g10 > i20) {
                    throw new IllegalArgumentException("Data to large for user specified layer");
                } else if (z10 && aVar.g() > (i12 << 6)) {
                    throw new IllegalArgumentException("Data to large for user specified layer");
                }
            } else {
                throw new IllegalArgumentException(String.format("Illegal value %s for layers", new Object[]{Integer.valueOf(i11)}));
            }
        } else {
            a aVar2 = null;
            int i21 = 0;
            int i22 = 0;
            while (i21 <= 32) {
                boolean z11 = i21 <= 3;
                int i23 = z11 ? i21 + 1 : i21;
                int i24 = i(i23, z11);
                if (g11 <= i24) {
                    if (aVar2 == null || i22 != f13272a[i23]) {
                        int i25 = f13272a[i23];
                        i22 = i25;
                        aVar2 = h(a10, i25);
                    }
                    int i26 = i24 - (i24 % i22);
                    if ((!z11 || aVar2.g() <= (i22 << 6)) && aVar2.g() + g10 <= i26) {
                        aVar = aVar2;
                        i12 = i22;
                        z10 = z11;
                        i13 = i23;
                        i14 = i24;
                    }
                }
                i21++;
                i18 = 0;
                i19 = 1;
            }
            throw new IllegalArgumentException("Data too large for an Aztec code");
        }
        a e10 = e(aVar, i14, i12);
        int g12 = aVar.g() / i12;
        a f10 = f(z10, i13, g12);
        if (!z10) {
            i16 = 14;
        }
        int i27 = i16 + (i13 << 2);
        int[] iArr = new int[i27];
        int i28 = 2;
        if (z10) {
            for (int i29 = 0; i29 < i27; i29++) {
                iArr[i29] = i29;
            }
            i15 = i27;
        } else {
            int i30 = i27 / 2;
            i15 = i27 + 1 + (((i30 - 1) / 15) * 2);
            int i31 = i15 / 2;
            for (int i32 = 0; i32 < i30; i32++) {
                int i33 = (i32 / 15) + i32;
                iArr[(i30 - i32) - i19] = (i31 - i33) - 1;
                iArr[i30 + i32] = i33 + i31 + i19;
            }
        }
        b bVar = new b(i15);
        int i34 = 0;
        int i35 = 0;
        while (i34 < i13) {
            int i36 = ((i13 - i34) << i28) + (z10 ? 9 : 12);
            int i37 = 0;
            while (i37 < i36) {
                int i38 = i37 << 1;
                while (i18 < i28) {
                    if (e10.f(i35 + i38 + i18)) {
                        int i39 = i34 << 1;
                        bVar.g(iArr[i39 + i18], iArr[i39 + i37]);
                    }
                    if (e10.f((i36 << 1) + i35 + i38 + i18)) {
                        int i40 = i34 << 1;
                        bVar.g(iArr[i40 + i37], iArr[((i27 - 1) - i40) - i18]);
                    }
                    if (e10.f((i36 << 2) + i35 + i38 + i18)) {
                        int i41 = (i27 - 1) - (i34 << 1);
                        bVar.g(iArr[i41 - i18], iArr[i41 - i37]);
                    }
                    if (e10.f((i36 * 6) + i35 + i38 + i18)) {
                        int i42 = i34 << 1;
                        bVar.g(iArr[((i27 - 1) - i42) - i37], iArr[i42 + i18]);
                    }
                    i18++;
                    i28 = 2;
                }
                i37++;
                i18 = 0;
                i28 = 2;
            }
            i35 += i36 << 3;
            i34++;
            i18 = 0;
            i28 = 2;
        }
        c(bVar, z10, i15, f10);
        if (z10) {
            b(bVar, i15 / 2, 5);
        } else {
            int i43 = i15 / 2;
            b(bVar, i43, 7);
            int i44 = 0;
            int i45 = 0;
            while (i45 < (i27 / 2) - 1) {
                for (int i46 = i43 & 1; i46 < i15; i46 += 2) {
                    int i47 = i43 - i44;
                    bVar.g(i47, i46);
                    int i48 = i43 + i44;
                    bVar.g(i48, i46);
                    bVar.g(i46, i47);
                    bVar.g(i46, i48);
                }
                i45 += 15;
                i44 += 16;
            }
        }
        a aVar3 = new a();
        aVar3.c(z10);
        aVar3.f(i15);
        aVar3.d(i13);
        aVar3.b(g12);
        aVar3.e(bVar);
        return aVar3;
    }

    private static a e(a aVar, int i10, int i11) {
        c7.c cVar = new c7.c(g(i11));
        int i12 = i10 / i11;
        int[] a10 = a(aVar, i11, i12);
        cVar.b(a10, i12 - (aVar.g() / i11));
        a aVar2 = new a();
        aVar2.c(0, i10 % i11);
        for (int c10 : a10) {
            aVar2.c(c10, i11);
        }
        return aVar2;
    }

    static a f(boolean z10, int i10, int i11) {
        a aVar = new a();
        if (z10) {
            aVar.c(i10 - 1, 2);
            aVar.c(i11 - 1, 6);
            return e(aVar, 28, 4);
        }
        aVar.c(i10 - 1, 5);
        aVar.c(i11 - 1, 11);
        return e(aVar, 40, 4);
    }

    private static c7.a g(int i10) {
        if (i10 == 4) {
            return c7.a.f13351k;
        }
        if (i10 == 6) {
            return c7.a.f13350j;
        }
        if (i10 == 8) {
            return c7.a.f13354n;
        }
        if (i10 == 10) {
            return c7.a.f13349i;
        }
        if (i10 == 12) {
            return c7.a.f13348h;
        }
        throw new IllegalArgumentException("Unsupported word size ".concat(String.valueOf(i10)));
    }

    static a h(a aVar, int i10) {
        a aVar2 = new a();
        int g10 = aVar.g();
        int i11 = (1 << i10) - 2;
        int i12 = 0;
        while (i12 < g10) {
            int i13 = 0;
            for (int i14 = 0; i14 < i10; i14++) {
                int i15 = i12 + i14;
                if (i15 >= g10 || aVar.f(i15)) {
                    i13 |= 1 << ((i10 - 1) - i14);
                }
            }
            int i16 = i13 & i11;
            if (i16 == i11) {
                aVar2.c(i16, i10);
            } else if (i16 == 0) {
                aVar2.c(i13 | 1, i10);
            } else {
                aVar2.c(i13, i10);
                i12 += i10;
            }
            i12--;
            i12 += i10;
        }
        return aVar2;
    }

    private static int i(int i10, boolean z10) {
        return ((z10 ? 88 : 112) + (i10 << 4)) * i10;
    }
}
