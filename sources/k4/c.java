package k4;

import a6.p;
import a6.y;
import k4.b0;

/* compiled from: CeaUtil */
public final class c {
    public static void a(long j10, y yVar, b0[] b0VarArr) {
        while (true) {
            boolean z10 = true;
            if (yVar.a() > 1) {
                int c10 = c(yVar);
                int c11 = c(yVar);
                int e10 = yVar.e() + c11;
                if (c11 == -1 || c11 > yVar.a()) {
                    p.h("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                    e10 = yVar.f();
                } else if (c10 == 4 && c11 >= 8) {
                    int C = yVar.C();
                    int I = yVar.I();
                    int m10 = I == 49 ? yVar.m() : 0;
                    int C2 = yVar.C();
                    if (I == 47) {
                        yVar.P(1);
                    }
                    boolean z11 = C == 181 && (I == 49 || I == 47) && C2 == 3;
                    if (I == 49) {
                        if (m10 != 1195456820) {
                            z10 = false;
                        }
                        z11 &= z10;
                    }
                    if (z11) {
                        b(j10, yVar, b0VarArr);
                    }
                }
                yVar.O(e10);
            } else {
                return;
            }
        }
    }

    public static void b(long j10, y yVar, b0[] b0VarArr) {
        int C = yVar.C();
        if ((C & 64) != 0) {
            yVar.P(1);
            int i10 = (C & 31) * 3;
            int e10 = yVar.e();
            for (b0 b0Var : b0VarArr) {
                yVar.O(e10);
                b0Var.a(yVar, i10);
                b0Var.e(j10, 1, i10, 0, (b0.a) null);
            }
        }
    }

    private static int c(y yVar) {
        int i10 = 0;
        while (yVar.a() != 0) {
            int C = yVar.C();
            i10 += C;
            if (C != 255) {
                return i10;
            }
        }
        return -1;
    }
}
