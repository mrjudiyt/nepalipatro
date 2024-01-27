package k4;

import a6.m0;
import a6.y;
import com.google.android.exoplayer2.ParserException;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;

/* compiled from: FlacFrameReader */
public final class p {

    /* compiled from: FlacFrameReader */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public long f9600a;
    }

    private static boolean a(y yVar, s sVar, int i10) {
        int j10 = j(yVar, i10);
        return j10 != -1 && j10 <= sVar.f9605b;
    }

    private static boolean b(y yVar, int i10) {
        return yVar.C() == m0.v(yVar.d(), i10, yVar.e() - 1, 0);
    }

    private static boolean c(y yVar, s sVar, boolean z10, a aVar) {
        try {
            long J = yVar.J();
            if (!z10) {
                J *= (long) sVar.f9605b;
            }
            aVar.f9600a = J;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public static boolean d(y yVar, s sVar, int i10, a aVar) {
        y yVar2 = yVar;
        s sVar2 = sVar;
        int e10 = yVar.e();
        long E = yVar.E();
        long j10 = E >>> 16;
        if (j10 != ((long) i10)) {
            return false;
        }
        boolean z10 = (j10 & 1) == 1;
        int i11 = (int) ((E >> 12) & 15);
        int i12 = (int) ((E >> 8) & 15);
        int i13 = (int) (15 & (E >> 4));
        int i14 = (int) ((E >> 1) & 7);
        boolean z11 = (E & 1) == 1;
        if (!g(i13, sVar2) || !f(i14, sVar2) || z11 || !c(yVar2, sVar2, z10, aVar) || !a(yVar2, sVar2, i11) || !e(yVar2, sVar2, i12) || !b(yVar2, e10)) {
            return false;
        }
        return true;
    }

    private static boolean e(y yVar, s sVar, int i10) {
        int i11 = sVar.f9608e;
        if (i10 == 0) {
            return true;
        }
        if (i10 <= 11) {
            if (i10 == sVar.f9609f) {
                return true;
            }
            return false;
        } else if (i10 == 12) {
            if (yVar.C() * 1000 == i11) {
                return true;
            }
            return false;
        } else if (i10 > 14) {
            return false;
        } else {
            int I = yVar.I();
            if (i10 == 14) {
                I *= 10;
            }
            if (I == i11) {
                return true;
            }
            return false;
        }
    }

    private static boolean f(int i10, s sVar) {
        return i10 == 0 || i10 == sVar.f9612i;
    }

    private static boolean g(int i10, s sVar) {
        if (i10 <= 7) {
            return i10 == sVar.f9610g - 1;
        }
        if (i10 > 10 || sVar.f9610g != 2) {
            return false;
        }
        return true;
    }

    public static boolean h(j jVar, s sVar, int i10, a aVar) {
        long e10 = jVar.e();
        byte[] bArr = new byte[2];
        jVar.o(bArr, 0, 2);
        if ((((bArr[0] & 255) << 8) | (bArr[1] & 255)) != i10) {
            jVar.k();
            jVar.f((int) (e10 - jVar.getPosition()));
            return false;
        }
        y yVar = new y(16);
        System.arraycopy(bArr, 0, yVar.d(), 0, 2);
        yVar.N(l.c(jVar, yVar.d(), 2, 14));
        jVar.k();
        jVar.f((int) (e10 - jVar.getPosition()));
        return d(yVar, sVar, i10, aVar);
    }

    public static long i(j jVar, s sVar) {
        jVar.k();
        boolean z10 = true;
        jVar.f(1);
        byte[] bArr = new byte[1];
        jVar.o(bArr, 0, 1);
        if ((bArr[0] & 1) != 1) {
            z10 = false;
        }
        jVar.f(2);
        int i10 = z10 ? 7 : 6;
        y yVar = new y(i10);
        yVar.N(l.c(jVar, yVar.d(), 0, i10));
        jVar.k();
        a aVar = new a();
        if (c(yVar, sVar, z10, aVar)) {
            return aVar.f9600a;
        }
        throw ParserException.a((String) null, (Throwable) null);
    }

    public static int j(y yVar, int i10) {
        switch (i10) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i10 - 2);
            case 6:
                return yVar.C() + 1;
            case 7:
                return yVar.I() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return UserVerificationMethods.USER_VERIFY_HANDPRINT << (i10 - 8);
            default:
                return -1;
        }
    }
}
