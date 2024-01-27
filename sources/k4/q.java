package k4;

import a6.x;
import a6.y;
import c5.h;
import com.google.android.exoplayer2.ParserException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import k4.s;
import l6.e;

/* compiled from: FlacMetadataReader */
public final class q {

    /* compiled from: FlacMetadataReader */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public s f9601a;

        public a(s sVar) {
            this.f9601a = sVar;
        }
    }

    public static boolean a(j jVar) {
        y yVar = new y(4);
        jVar.o(yVar.d(), 0, 4);
        if (yVar.E() == 1716281667) {
            return true;
        }
        return false;
    }

    public static int b(j jVar) {
        jVar.k();
        y yVar = new y(2);
        jVar.o(yVar.d(), 0, 2);
        int I = yVar.I();
        if ((I >> 2) == 16382) {
            jVar.k();
            return I;
        }
        jVar.k();
        throw ParserException.a("First frame does not start with sync code.", (Throwable) null);
    }

    public static x4.a c(j jVar, boolean z10) {
        x4.a a10 = new v().a(jVar, z10 ? null : h.f5249b);
        if (a10 == null || a10.e() == 0) {
            return null;
        }
        return a10;
    }

    public static x4.a d(j jVar, boolean z10) {
        jVar.k();
        long e10 = jVar.e();
        x4.a c10 = c(jVar, z10);
        jVar.l((int) (jVar.e() - e10));
        return c10;
    }

    public static boolean e(j jVar, a aVar) {
        jVar.k();
        x xVar = new x(new byte[4]);
        jVar.o(xVar.f274a, 0, 4);
        boolean g10 = xVar.g();
        int h10 = xVar.h(7);
        int h11 = xVar.h(24) + 4;
        if (h10 == 0) {
            aVar.f9601a = i(jVar);
        } else {
            s sVar = aVar.f9601a;
            if (sVar == null) {
                throw new IllegalArgumentException();
            } else if (h10 == 3) {
                aVar.f9601a = sVar.c(h(jVar, h11));
            } else if (h10 == 4) {
                aVar.f9601a = sVar.d(k(jVar, h11));
            } else if (h10 == 6) {
                aVar.f9601a = sVar.b(Collections.singletonList(f(jVar, h11)));
            } else {
                jVar.l(h11);
            }
        }
        return g10;
    }

    private static a5.a f(j jVar, int i10) {
        y yVar = new y(i10);
        jVar.readFully(yVar.d(), 0, i10);
        yVar.P(4);
        int m10 = yVar.m();
        String A = yVar.A(yVar.m(), e.f15602a);
        String z10 = yVar.z(yVar.m());
        int m11 = yVar.m();
        int m12 = yVar.m();
        int m13 = yVar.m();
        int m14 = yVar.m();
        int m15 = yVar.m();
        byte[] bArr = new byte[m15];
        yVar.j(bArr, 0, m15);
        return new a5.a(m10, A, z10, m11, m12, m13, m14, bArr);
    }

    public static s.a g(y yVar) {
        yVar.P(1);
        int F = yVar.F();
        long e10 = ((long) yVar.e()) + ((long) F);
        int i10 = F / 18;
        long[] jArr = new long[i10];
        long[] jArr2 = new long[i10];
        int i11 = 0;
        while (true) {
            if (i11 >= i10) {
                break;
            }
            long v10 = yVar.v();
            if (v10 == -1) {
                jArr = Arrays.copyOf(jArr, i11);
                jArr2 = Arrays.copyOf(jArr2, i11);
                break;
            }
            jArr[i11] = v10;
            jArr2[i11] = yVar.v();
            yVar.P(2);
            i11++;
        }
        yVar.P((int) (e10 - ((long) yVar.e())));
        return new s.a(jArr, jArr2);
    }

    private static s.a h(j jVar, int i10) {
        y yVar = new y(i10);
        jVar.readFully(yVar.d(), 0, i10);
        return g(yVar);
    }

    private static s i(j jVar) {
        byte[] bArr = new byte[38];
        jVar.readFully(bArr, 0, 38);
        return new s(bArr, 4);
    }

    public static void j(j jVar) {
        y yVar = new y(4);
        jVar.readFully(yVar.d(), 0, 4);
        if (yVar.E() != 1716281667) {
            throw ParserException.a("Failed to read FLAC stream marker.", (Throwable) null);
        }
    }

    private static List<String> k(j jVar, int i10) {
        y yVar = new y(i10);
        jVar.readFully(yVar.d(), 0, i10);
        yVar.P(4);
        return Arrays.asList(d0.i(yVar, false, false).f9555b);
    }
}
