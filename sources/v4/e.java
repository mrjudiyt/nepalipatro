package v4;

import a6.m0;
import k4.y;
import k4.z;

/* compiled from: WavSeekMap */
final class e implements y {

    /* renamed from: a  reason: collision with root package name */
    private final c f12404a;

    /* renamed from: b  reason: collision with root package name */
    private final int f12405b;

    /* renamed from: c  reason: collision with root package name */
    private final long f12406c;

    /* renamed from: d  reason: collision with root package name */
    private final long f12407d;

    /* renamed from: e  reason: collision with root package name */
    private final long f12408e;

    public e(c cVar, int i10, long j10, long j11) {
        this.f12404a = cVar;
        this.f12405b = i10;
        this.f12406c = j10;
        long j12 = (j11 - j10) / ((long) cVar.f12399e);
        this.f12407d = j12;
        this.f12408e = b(j12);
    }

    private long b(long j10) {
        return m0.C0(j10 * ((long) this.f12405b), 1000000, (long) this.f12404a.f12397c);
    }

    public boolean f() {
        return true;
    }

    public y.a h(long j10) {
        long s10 = m0.s((((long) this.f12404a.f12397c) * j10) / (((long) this.f12405b) * 1000000), 0, this.f12407d - 1);
        long j11 = this.f12406c + (((long) this.f12404a.f12399e) * s10);
        long b10 = b(s10);
        z zVar = new z(b10, j11);
        if (b10 >= j10 || s10 == this.f12407d - 1) {
            return new y.a(zVar);
        }
        long j12 = s10 + 1;
        return new y.a(zVar, new z(b(j12), this.f12406c + (((long) this.f12404a.f12399e) * j12)));
    }

    public long i() {
        return this.f12408e;
    }
}
