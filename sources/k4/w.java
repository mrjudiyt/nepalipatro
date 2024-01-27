package k4;

import a6.a;
import a6.m0;
import k4.y;

/* compiled from: IndexSeekMap */
public final class w implements y {

    /* renamed from: a  reason: collision with root package name */
    private final long[] f9623a;

    /* renamed from: b  reason: collision with root package name */
    private final long[] f9624b;

    /* renamed from: c  reason: collision with root package name */
    private final long f9625c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f9626d;

    public w(long[] jArr, long[] jArr2, long j10) {
        a.a(jArr.length == jArr2.length);
        int length = jArr2.length;
        boolean z10 = length > 0;
        this.f9626d = z10;
        if (!z10 || jArr2[0] <= 0) {
            this.f9623a = jArr;
            this.f9624b = jArr2;
        } else {
            int i10 = length + 1;
            long[] jArr3 = new long[i10];
            this.f9623a = jArr3;
            long[] jArr4 = new long[i10];
            this.f9624b = jArr4;
            System.arraycopy(jArr, 0, jArr3, 1, length);
            System.arraycopy(jArr2, 0, jArr4, 1, length);
        }
        this.f9625c = j10;
    }

    public boolean f() {
        return this.f9626d;
    }

    public y.a h(long j10) {
        if (!this.f9626d) {
            return new y.a(z.f9632c);
        }
        int i10 = m0.i(this.f9624b, j10, true, true);
        z zVar = new z(this.f9624b[i10], this.f9623a[i10]);
        if (zVar.f9633a == j10 || i10 == this.f9624b.length - 1) {
            return new y.a(zVar);
        }
        int i11 = i10 + 1;
        return new y.a(zVar, new z(this.f9624b[i11], this.f9623a[i11]));
    }

    public long i() {
        return this.f9625c;
    }
}
