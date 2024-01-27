package u4;

import a6.i0;
import a6.m0;
import k4.j;
import k4.x;

/* compiled from: PsDurationReader */
final class y {

    /* renamed from: a  reason: collision with root package name */
    private final i0 f12087a = new i0(0);

    /* renamed from: b  reason: collision with root package name */
    private final a6.y f12088b = new a6.y();

    /* renamed from: c  reason: collision with root package name */
    private boolean f12089c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f12090d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f12091e;

    /* renamed from: f  reason: collision with root package name */
    private long f12092f = -9223372036854775807L;

    /* renamed from: g  reason: collision with root package name */
    private long f12093g = -9223372036854775807L;

    /* renamed from: h  reason: collision with root package name */
    private long f12094h = -9223372036854775807L;

    y() {
    }

    private static boolean a(byte[] bArr) {
        if ((bArr[0] & 196) == 68 && (bArr[2] & 4) == 4 && (bArr[4] & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3) {
            return true;
        }
        return false;
    }

    private int b(j jVar) {
        this.f12088b.L(m0.f210f);
        this.f12089c = true;
        jVar.k();
        return 0;
    }

    private int f(byte[] bArr, int i10) {
        return (bArr[i10 + 3] & 255) | ((bArr[i10] & 255) << 24) | ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10 + 2] & 255) << 8);
    }

    private int h(j jVar, x xVar) {
        int min = (int) Math.min(20000, jVar.a());
        long j10 = (long) 0;
        if (jVar.getPosition() != j10) {
            xVar.f9627a = j10;
            return 1;
        }
        this.f12088b.K(min);
        jVar.k();
        jVar.o(this.f12088b.d(), 0, min);
        this.f12092f = i(this.f12088b);
        this.f12090d = true;
        return 0;
    }

    private long i(a6.y yVar) {
        int f10 = yVar.f();
        for (int e10 = yVar.e(); e10 < f10 - 3; e10++) {
            if (f(yVar.d(), e10) == 442) {
                yVar.O(e10 + 4);
                long l10 = l(yVar);
                if (l10 != -9223372036854775807L) {
                    return l10;
                }
            }
        }
        return -9223372036854775807L;
    }

    private int j(j jVar, x xVar) {
        long a10 = jVar.a();
        int min = (int) Math.min(20000, a10);
        long j10 = a10 - ((long) min);
        if (jVar.getPosition() != j10) {
            xVar.f9627a = j10;
            return 1;
        }
        this.f12088b.K(min);
        jVar.k();
        jVar.o(this.f12088b.d(), 0, min);
        this.f12093g = k(this.f12088b);
        this.f12091e = true;
        return 0;
    }

    private long k(a6.y yVar) {
        int e10 = yVar.e();
        for (int f10 = yVar.f() - 4; f10 >= e10; f10--) {
            if (f(yVar.d(), f10) == 442) {
                yVar.O(f10 + 4);
                long l10 = l(yVar);
                if (l10 != -9223372036854775807L) {
                    return l10;
                }
            }
        }
        return -9223372036854775807L;
    }

    public static long l(a6.y yVar) {
        int e10 = yVar.e();
        if (yVar.a() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        yVar.j(bArr, 0, 9);
        yVar.O(e10);
        if (!a(bArr)) {
            return -9223372036854775807L;
        }
        return m(bArr);
    }

    private static long m(byte[] bArr) {
        return (((((long) bArr[0]) & 56) >> 3) << 30) | ((((long) bArr[0]) & 3) << 28) | ((((long) bArr[1]) & 255) << 20) | (((((long) bArr[2]) & 248) >> 3) << 15) | ((((long) bArr[2]) & 3) << 13) | ((((long) bArr[3]) & 255) << 5) | ((((long) bArr[4]) & 248) >> 3);
    }

    public long c() {
        return this.f12094h;
    }

    public i0 d() {
        return this.f12087a;
    }

    public boolean e() {
        return this.f12089c;
    }

    public int g(j jVar, x xVar) {
        if (!this.f12091e) {
            return j(jVar, xVar);
        }
        if (this.f12093g == -9223372036854775807L) {
            return b(jVar);
        }
        if (!this.f12090d) {
            return h(jVar, xVar);
        }
        long j10 = this.f12092f;
        if (j10 == -9223372036854775807L) {
            return b(jVar);
        }
        this.f12094h = this.f12087a.b(this.f12093g) - this.f12087a.b(j10);
        return b(jVar);
    }
}
