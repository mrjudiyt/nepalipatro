package u4;

import a6.i0;
import a6.m0;
import a6.y;
import k4.a;
import k4.j;

/* compiled from: PsBinarySearchSeeker */
final class x extends k4.a {

    /* compiled from: PsBinarySearchSeeker */
    private static final class b implements a.f {

        /* renamed from: a  reason: collision with root package name */
        private final i0 f12085a;

        /* renamed from: b  reason: collision with root package name */
        private final y f12086b;

        private a.e c(y yVar, long j10, long j11) {
            int i10 = -1;
            long j12 = -9223372036854775807L;
            int i11 = -1;
            while (yVar.a() >= 4) {
                if (x.k(yVar.d(), yVar.e()) != 442) {
                    yVar.P(1);
                } else {
                    yVar.P(4);
                    long l10 = y.l(yVar);
                    if (l10 != -9223372036854775807L) {
                        long b10 = this.f12085a.b(l10);
                        if (b10 > j10) {
                            if (j12 == -9223372036854775807L) {
                                return a.e.d(b10, j11);
                            }
                            return a.e.e(j11 + ((long) i11));
                        } else if (100000 + b10 > j10) {
                            return a.e.e(j11 + ((long) yVar.e()));
                        } else {
                            i11 = yVar.e();
                            j12 = b10;
                        }
                    }
                    d(yVar);
                    i10 = yVar.e();
                }
            }
            if (j12 != -9223372036854775807L) {
                return a.e.f(j12, j11 + ((long) i10));
            }
            return a.e.f9531d;
        }

        private static void d(y yVar) {
            int f10 = yVar.f();
            if (yVar.a() < 10) {
                yVar.O(f10);
                return;
            }
            yVar.P(9);
            int C = yVar.C() & 7;
            if (yVar.a() < C) {
                yVar.O(f10);
                return;
            }
            yVar.P(C);
            if (yVar.a() < 4) {
                yVar.O(f10);
                return;
            }
            if (x.k(yVar.d(), yVar.e()) == 443) {
                yVar.P(4);
                int I = yVar.I();
                if (yVar.a() < I) {
                    yVar.O(f10);
                    return;
                }
                yVar.P(I);
            }
            while (yVar.a() >= 4 && (r1 = x.k(yVar.d(), yVar.e())) != 442 && r1 != 441 && (r1 >>> 8) == 1) {
                yVar.P(4);
                if (yVar.a() < 2) {
                    yVar.O(f10);
                    return;
                } else {
                    yVar.O(Math.min(yVar.f(), yVar.e() + yVar.I()));
                }
            }
        }

        public a.e a(j jVar, long j10) {
            long position = jVar.getPosition();
            int min = (int) Math.min(20000, jVar.a() - position);
            this.f12086b.K(min);
            jVar.o(this.f12086b.d(), 0, min);
            return c(this.f12086b, j10, position);
        }

        public void b() {
            this.f12086b.L(m0.f210f);
        }

        private b(i0 i0Var) {
            this.f12085a = i0Var;
            this.f12086b = new y();
        }
    }

    public x(i0 i0Var, long j10, long j11) {
        super(new a.b(), new b(i0Var), j10, 0, j10 + 1, 0, j11, 188, 1000);
    }

    /* access modifiers changed from: private */
    public static int k(byte[] bArr, int i10) {
        return (bArr[i10 + 3] & 255) | ((bArr[i10] & 255) << 24) | ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10 + 2] & 255) << 8);
    }
}
