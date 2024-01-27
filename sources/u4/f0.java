package u4;

import a6.i0;
import a6.m0;
import a6.y;
import k4.j;
import k4.x;

/* compiled from: TsDurationReader */
final class f0 {

    /* renamed from: a  reason: collision with root package name */
    private final int f11798a;

    /* renamed from: b  reason: collision with root package name */
    private final i0 f11799b = new i0(0);

    /* renamed from: c  reason: collision with root package name */
    private final y f11800c = new y();

    /* renamed from: d  reason: collision with root package name */
    private boolean f11801d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f11802e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f11803f;

    /* renamed from: g  reason: collision with root package name */
    private long f11804g = -9223372036854775807L;

    /* renamed from: h  reason: collision with root package name */
    private long f11805h = -9223372036854775807L;

    /* renamed from: i  reason: collision with root package name */
    private long f11806i = -9223372036854775807L;

    f0(int i10) {
        this.f11798a = i10;
    }

    private int a(j jVar) {
        this.f11800c.L(m0.f210f);
        this.f11801d = true;
        jVar.k();
        return 0;
    }

    private int f(j jVar, x xVar, int i10) {
        int min = (int) Math.min((long) this.f11798a, jVar.a());
        long j10 = (long) 0;
        if (jVar.getPosition() != j10) {
            xVar.f9627a = j10;
            return 1;
        }
        this.f11800c.K(min);
        jVar.k();
        jVar.o(this.f11800c.d(), 0, min);
        this.f11804g = g(this.f11800c, i10);
        this.f11802e = true;
        return 0;
    }

    private long g(y yVar, int i10) {
        int f10 = yVar.f();
        for (int e10 = yVar.e(); e10 < f10; e10++) {
            if (yVar.d()[e10] == 71) {
                long c10 = j0.c(yVar, e10, i10);
                if (c10 != -9223372036854775807L) {
                    return c10;
                }
            }
        }
        return -9223372036854775807L;
    }

    private int h(j jVar, x xVar, int i10) {
        long a10 = jVar.a();
        int min = (int) Math.min((long) this.f11798a, a10);
        long j10 = a10 - ((long) min);
        if (jVar.getPosition() != j10) {
            xVar.f9627a = j10;
            return 1;
        }
        this.f11800c.K(min);
        jVar.k();
        jVar.o(this.f11800c.d(), 0, min);
        this.f11805h = i(this.f11800c, i10);
        this.f11803f = true;
        return 0;
    }

    private long i(y yVar, int i10) {
        int e10 = yVar.e();
        int f10 = yVar.f();
        for (int i11 = f10 - 188; i11 >= e10; i11--) {
            if (j0.b(yVar.d(), e10, f10, i11)) {
                long c10 = j0.c(yVar, i11, i10);
                if (c10 != -9223372036854775807L) {
                    return c10;
                }
            }
        }
        return -9223372036854775807L;
    }

    public long b() {
        return this.f11806i;
    }

    public i0 c() {
        return this.f11799b;
    }

    public boolean d() {
        return this.f11801d;
    }

    public int e(j jVar, x xVar, int i10) {
        if (i10 <= 0) {
            return a(jVar);
        }
        if (!this.f11803f) {
            return h(jVar, xVar, i10);
        }
        if (this.f11805h == -9223372036854775807L) {
            return a(jVar);
        }
        if (!this.f11802e) {
            return f(jVar, xVar, i10);
        }
        long j10 = this.f11804g;
        if (j10 == -9223372036854775807L) {
            return a(jVar);
        }
        this.f11806i = this.f11799b.b(this.f11805h) - this.f11799b.b(j10);
        return a(jVar);
    }
}
