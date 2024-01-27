package u4;

import a6.i0;
import a6.m0;
import a6.y;
import k4.a;
import k4.j;

/* compiled from: TsBinarySearchSeeker */
final class e0 extends k4.a {

    /* compiled from: TsBinarySearchSeeker */
    private static final class a implements a.f {

        /* renamed from: a  reason: collision with root package name */
        private final i0 f11781a;

        /* renamed from: b  reason: collision with root package name */
        private final y f11782b = new y();

        /* renamed from: c  reason: collision with root package name */
        private final int f11783c;

        /* renamed from: d  reason: collision with root package name */
        private final int f11784d;

        public a(int i10, i0 i0Var, int i11) {
            this.f11783c = i10;
            this.f11781a = i0Var;
            this.f11784d = i11;
        }

        private a.e c(y yVar, long j10, long j11) {
            int a10;
            int i10;
            y yVar2 = yVar;
            long j12 = j11;
            int f10 = yVar.f();
            long j13 = -1;
            long j14 = -1;
            long j15 = -9223372036854775807L;
            while (yVar.a() >= 188 && (i10 = a10 + 188) <= f10) {
                long c10 = j0.c(yVar2, (a10 = j0.a(yVar.d(), yVar.e(), f10)), this.f11783c);
                if (c10 != -9223372036854775807L) {
                    long b10 = this.f11781a.b(c10);
                    if (b10 > j10) {
                        if (j15 == -9223372036854775807L) {
                            return a.e.d(b10, j12);
                        }
                        return a.e.e(j12 + j14);
                    } else if (100000 + b10 > j10) {
                        return a.e.e(j12 + ((long) a10));
                    } else {
                        j14 = (long) a10;
                        j15 = b10;
                    }
                }
                yVar2.O(i10);
                j13 = (long) i10;
            }
            if (j15 != -9223372036854775807L) {
                return a.e.f(j15, j12 + j13);
            }
            return a.e.f9531d;
        }

        public a.e a(j jVar, long j10) {
            long position = jVar.getPosition();
            int min = (int) Math.min((long) this.f11784d, jVar.a() - position);
            this.f11782b.K(min);
            jVar.o(this.f11782b.d(), 0, min);
            return c(this.f11782b, j10, position);
        }

        public void b() {
            this.f11782b.L(m0.f210f);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public e0(a6.i0 r17, long r18, long r20, int r22, int r23) {
        /*
            r16 = this;
            k4.a$b r1 = new k4.a$b
            r1.<init>()
            u4.e0$a r2 = new u4.e0$a
            r0 = r17
            r3 = r22
            r4 = r23
            r2.<init>(r3, r0, r4)
            r3 = 1
            long r7 = r18 + r3
            r5 = 0
            r9 = 0
            r13 = 188(0xbc, double:9.3E-322)
            r15 = 940(0x3ac, float:1.317E-42)
            r0 = r16
            r3 = r18
            r11 = r20
            r0.<init>(r1, r2, r3, r5, r7, r9, r11, r13, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: u4.e0.<init>(a6.i0, long, long, int, int):void");
    }
}
