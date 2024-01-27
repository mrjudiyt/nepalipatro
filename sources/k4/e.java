package k4;

import a6.m0;
import k4.y;

/* compiled from: ConstantBitrateSeekMap */
public class e implements y {

    /* renamed from: a  reason: collision with root package name */
    private final long f9571a;

    /* renamed from: b  reason: collision with root package name */
    private final long f9572b;

    /* renamed from: c  reason: collision with root package name */
    private final int f9573c;

    /* renamed from: d  reason: collision with root package name */
    private final long f9574d;

    /* renamed from: e  reason: collision with root package name */
    private final int f9575e;

    /* renamed from: f  reason: collision with root package name */
    private final long f9576f;

    public e(long j10, long j11, int i10, int i11) {
        this.f9571a = j10;
        this.f9572b = j11;
        this.f9573c = i11 == -1 ? 1 : i11;
        this.f9575e = i10;
        if (j10 == -1) {
            this.f9574d = -1;
            this.f9576f = -9223372036854775807L;
            return;
        }
        this.f9574d = j10 - j11;
        this.f9576f = d(j10, j11, i10);
    }

    private long b(long j10) {
        int i10 = this.f9573c;
        return this.f9572b + m0.s((((j10 * ((long) this.f9575e)) / 8000000) / ((long) i10)) * ((long) i10), 0, this.f9574d - ((long) i10));
    }

    private static long d(long j10, long j11, int i10) {
        return ((Math.max(0, j10 - j11) * 8) * 1000000) / ((long) i10);
    }

    public long c(long j10) {
        return d(j10, this.f9572b, this.f9575e);
    }

    public boolean f() {
        return this.f9574d != -1;
    }

    public y.a h(long j10) {
        if (this.f9574d == -1) {
            return new y.a(new z(0, this.f9572b));
        }
        long b10 = b(j10);
        long c10 = c(b10);
        z zVar = new z(c10, b10);
        if (c10 < j10) {
            int i10 = this.f9573c;
            if (((long) i10) + b10 < this.f9571a) {
                long j11 = b10 + ((long) i10);
                return new y.a(zVar, new z(c(j11), j11));
            }
        }
        return new y.a(zVar);
    }

    public long i() {
        return this.f9576f;
    }
}
