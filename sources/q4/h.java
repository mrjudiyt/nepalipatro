package q4;

import a6.m0;
import a6.p;
import a6.y;
import g4.u;
import k4.y;
import k4.z;

/* compiled from: VbriSeeker */
final class h implements g {

    /* renamed from: a  reason: collision with root package name */
    private final long[] f10713a;

    /* renamed from: b  reason: collision with root package name */
    private final long[] f10714b;

    /* renamed from: c  reason: collision with root package name */
    private final long f10715c;

    /* renamed from: d  reason: collision with root package name */
    private final long f10716d;

    private h(long[] jArr, long[] jArr2, long j10, long j11) {
        this.f10713a = jArr;
        this.f10714b = jArr2;
        this.f10715c = j10;
        this.f10716d = j11;
    }

    public static h b(long j10, long j11, u.a aVar, y yVar) {
        int i10;
        long j12 = j10;
        u.a aVar2 = aVar;
        y yVar2 = yVar;
        yVar2.P(10);
        int m10 = yVar.m();
        if (m10 <= 0) {
            return null;
        }
        int i11 = aVar2.f8877d;
        long C0 = m0.C0((long) m10, 1000000 * ((long) (i11 >= 32000 ? 1152 : 576)), (long) i11);
        int I = yVar.I();
        int I2 = yVar.I();
        int I3 = yVar.I();
        yVar2.P(2);
        long j13 = j11 + ((long) aVar2.f8876c);
        long[] jArr = new long[I];
        long[] jArr2 = new long[I];
        int i12 = 0;
        long j14 = j11;
        while (i12 < I) {
            int i13 = I2;
            jArr[i12] = (((long) i12) * C0) / ((long) I);
            long j15 = j13;
            jArr2[i12] = Math.max(j14, j15);
            if (I3 == 1) {
                i10 = yVar.C();
            } else if (I3 == 2) {
                i10 = yVar.I();
            } else if (I3 == 3) {
                i10 = yVar.F();
            } else if (I3 != 4) {
                return null;
            } else {
                i10 = yVar.G();
            }
            j14 += (long) (i10 * i13);
            i12++;
            j13 = j15;
            I2 = i13;
        }
        if (!(j12 == -1 || j12 == j14)) {
            StringBuilder sb = new StringBuilder(67);
            sb.append("VBRI data size mismatch: ");
            sb.append(j12);
            sb.append(", ");
            sb.append(j14);
            p.h("VbriSeeker", sb.toString());
        }
        return new h(jArr, jArr2, C0, j14);
    }

    public long a(long j10) {
        return this.f10713a[m0.i(this.f10714b, j10, true, true)];
    }

    public long e() {
        return this.f10716d;
    }

    public boolean f() {
        return true;
    }

    public y.a h(long j10) {
        int i10 = m0.i(this.f10713a, j10, true, true);
        z zVar = new z(this.f10713a[i10], this.f10714b[i10]);
        if (zVar.f9633a >= j10 || i10 == this.f10713a.length - 1) {
            return new y.a(zVar);
        }
        int i11 = i10 + 1;
        return new y.a(zVar, new z(this.f10713a[i11], this.f10714b[i11]));
    }

    public long i() {
        return this.f10715c;
    }
}
