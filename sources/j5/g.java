package j5;

import k4.d;
import k5.i;

/* compiled from: DashWrappingSegmentIndex */
public final class g implements e {

    /* renamed from: a  reason: collision with root package name */
    private final d f9443a;

    /* renamed from: b  reason: collision with root package name */
    private final long f9444b;

    public g(d dVar, long j10) {
        this.f9443a = dVar;
        this.f9444b = j10;
    }

    public long a(long j10) {
        return this.f9443a.f9547e[(int) j10] - this.f9444b;
    }

    public long b(long j10, long j11) {
        return this.f9443a.f9546d[(int) j10];
    }

    public long c(long j10, long j11) {
        return 0;
    }

    public long d(long j10, long j11) {
        return -9223372036854775807L;
    }

    public i e(long j10) {
        d dVar = this.f9443a;
        int i10 = (int) j10;
        return new i((String) null, dVar.f9545c[i10], (long) dVar.f9544b[i10]);
    }

    public long f(long j10, long j11) {
        return (long) this.f9443a.b(j10 + this.f9444b);
    }

    public boolean g() {
        return true;
    }

    public long h() {
        return 0;
    }

    public long i(long j10) {
        return (long) this.f9443a.f9543a;
    }

    public long j(long j10, long j11) {
        return (long) this.f9443a.f9543a;
    }
}
