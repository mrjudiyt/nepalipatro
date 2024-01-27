package r4;

import a6.a;
import a6.m0;

/* compiled from: TrackSampleTable */
final class r {

    /* renamed from: a  reason: collision with root package name */
    public final o f11175a;

    /* renamed from: b  reason: collision with root package name */
    public final int f11176b;

    /* renamed from: c  reason: collision with root package name */
    public final long[] f11177c;

    /* renamed from: d  reason: collision with root package name */
    public final int[] f11178d;

    /* renamed from: e  reason: collision with root package name */
    public final int f11179e;

    /* renamed from: f  reason: collision with root package name */
    public final long[] f11180f;

    /* renamed from: g  reason: collision with root package name */
    public final int[] f11181g;

    /* renamed from: h  reason: collision with root package name */
    public final long f11182h;

    public r(o oVar, long[] jArr, int[] iArr, int i10, long[] jArr2, int[] iArr2, long j10) {
        boolean z10 = false;
        a.a(iArr.length == jArr2.length);
        a.a(jArr.length == jArr2.length);
        a.a(iArr2.length == jArr2.length ? true : z10);
        this.f11175a = oVar;
        this.f11177c = jArr;
        this.f11178d = iArr;
        this.f11179e = i10;
        this.f11180f = jArr2;
        this.f11181g = iArr2;
        this.f11182h = j10;
        this.f11176b = jArr.length;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }

    public int a(long j10) {
        for (int i10 = m0.i(this.f11180f, j10, true, false); i10 >= 0; i10--) {
            if ((this.f11181g[i10] & 1) != 0) {
                return i10;
            }
        }
        return -1;
    }

    public int b(long j10) {
        for (int e10 = m0.e(this.f11180f, j10, true, false); e10 < this.f11180f.length; e10++) {
            if ((this.f11181g[e10] & 1) != 0) {
                return e10;
            }
        }
        return -1;
    }
}
