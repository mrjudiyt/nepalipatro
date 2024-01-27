package k4;

import a6.a;
import a6.m0;
import k4.s;
import k4.y;

/* compiled from: FlacSeekTableSeekMap */
public final class r implements y {

    /* renamed from: a  reason: collision with root package name */
    private final s f9602a;

    /* renamed from: b  reason: collision with root package name */
    private final long f9603b;

    public r(s sVar, long j10) {
        this.f9602a = sVar;
        this.f9603b = j10;
    }

    private z b(long j10, long j11) {
        return new z((j10 * 1000000) / ((long) this.f9602a.f9608e), this.f9603b + j11);
    }

    public boolean f() {
        return true;
    }

    public y.a h(long j10) {
        long j11;
        a.h(this.f9602a.f9614k);
        s sVar = this.f9602a;
        s.a aVar = sVar.f9614k;
        long[] jArr = aVar.f9616a;
        long[] jArr2 = aVar.f9617b;
        int i10 = m0.i(jArr, sVar.j(j10), true, false);
        long j12 = 0;
        if (i10 == -1) {
            j11 = 0;
        } else {
            j11 = jArr[i10];
        }
        if (i10 != -1) {
            j12 = jArr2[i10];
        }
        z b10 = b(j11, j12);
        if (b10.f9633a == j10 || i10 == jArr.length - 1) {
            return new y.a(b10);
        }
        int i11 = i10 + 1;
        return new y.a(b10, b(jArr[i11], jArr2[i11]));
    }

    public long i() {
        return this.f9602a.g();
    }
}
