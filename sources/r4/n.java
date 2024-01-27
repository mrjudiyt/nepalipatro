package r4;

import a6.y;
import k4.j;

/* compiled from: Sniffer */
final class n {

    /* renamed from: a  reason: collision with root package name */
    private static final int[] f11139a = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    private static boolean a(int i10, boolean z10) {
        if ((i10 >>> 8) == 3368816) {
            return true;
        }
        if (i10 == 1751476579 && z10) {
            return true;
        }
        for (int i11 : f11139a) {
            if (i11 == i10) {
                return true;
            }
        }
        return false;
    }

    public static boolean b(j jVar) {
        return c(jVar, true, false);
    }

    private static boolean c(j jVar, boolean z10, boolean z11) {
        boolean z12;
        j jVar2 = jVar;
        long a10 = jVar.a();
        long j10 = 4096;
        long j11 = -1;
        int i10 = (a10 > -1 ? 1 : (a10 == -1 ? 0 : -1));
        if (i10 != 0 && a10 <= 4096) {
            j10 = a10;
        }
        int i11 = (int) j10;
        y yVar = new y(64);
        boolean z13 = false;
        int i12 = 0;
        boolean z14 = false;
        while (true) {
            if (i12 >= i11) {
                break;
            }
            yVar.K(8);
            if (!jVar2.d(yVar.d(), z13 ? 1 : 0, 8, true)) {
                break;
            }
            long E = yVar.E();
            int m10 = yVar.m();
            int i13 = 16;
            if (E == 1) {
                jVar2.o(yVar.d(), 8, 8);
                yVar.N(16);
                E = yVar.v();
            } else {
                if (E == 0) {
                    long a11 = jVar.a();
                    if (a11 != j11) {
                        E = (a11 - jVar.e()) + ((long) 8);
                    }
                }
                i13 = 8;
            }
            long j12 = (long) i13;
            if (E < j12) {
                return z13;
            }
            i12 += i13;
            if (m10 == 1836019574) {
                i11 += (int) E;
                if (i10 != 0 && ((long) i11) > a10) {
                    i11 = (int) a10;
                }
                j11 = -1;
            } else if (m10 == 1836019558 || m10 == 1836475768) {
                z12 = true;
            } else {
                long j13 = a10;
                int i14 = i12;
                if ((((long) i12) + E) - j12 >= ((long) i11)) {
                    break;
                }
                int i15 = (int) (E - j12);
                i12 = i14 + i15;
                if (m10 != 1718909296) {
                    boolean z15 = z11;
                    if (i15 != 0) {
                        jVar2.f(i15);
                    }
                } else if (i15 < 8) {
                    return false;
                } else {
                    yVar.K(i15);
                    jVar2.o(yVar.d(), 0, i15);
                    int i16 = i15 / 4;
                    int i17 = 0;
                    while (true) {
                        if (i17 >= i16) {
                            boolean z16 = z11;
                            break;
                        }
                        if (i17 == 1) {
                            yVar.P(4);
                            boolean z17 = z11;
                        } else if (a(yVar.m(), z11)) {
                            z14 = true;
                            break;
                        }
                        i17++;
                    }
                    if (!z14) {
                        return false;
                    }
                }
                a10 = j13;
                j11 = -1;
                z13 = false;
            }
        }
        z12 = false;
        return z14 && z10 == z12;
    }

    public static boolean d(j jVar, boolean z10) {
        return c(jVar, false, z10);
    }
}
