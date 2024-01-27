package q4;

import a6.a;
import a6.m0;
import a6.p;
import a6.y;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import g4.u;
import k4.y;
import k4.z;

/* compiled from: XingSeeker */
final class i implements g {

    /* renamed from: a  reason: collision with root package name */
    private final long f10717a;

    /* renamed from: b  reason: collision with root package name */
    private final int f10718b;

    /* renamed from: c  reason: collision with root package name */
    private final long f10719c;

    /* renamed from: d  reason: collision with root package name */
    private final long f10720d;

    /* renamed from: e  reason: collision with root package name */
    private final long f10721e;

    /* renamed from: f  reason: collision with root package name */
    private final long[] f10722f;

    private i(long j10, int i10, long j11) {
        this(j10, i10, j11, -1, (long[]) null);
    }

    public static i b(long j10, long j11, u.a aVar, y yVar) {
        int G;
        long j12 = j10;
        u.a aVar2 = aVar;
        int i10 = aVar2.f8880g;
        int i11 = aVar2.f8877d;
        int m10 = yVar.m();
        if ((m10 & 1) != 1 || (G = yVar.G()) == 0) {
            return null;
        }
        long C0 = m0.C0((long) G, ((long) i10) * 1000000, (long) i11);
        if ((m10 & 6) != 6) {
            return new i(j11, aVar2.f8876c, C0);
        }
        long E = yVar.E();
        long[] jArr = new long[100];
        for (int i12 = 0; i12 < 100; i12++) {
            jArr[i12] = (long) yVar.C();
        }
        if (j12 != -1) {
            long j13 = j11 + E;
            if (j12 != j13) {
                StringBuilder sb = new StringBuilder(67);
                sb.append("XING data size mismatch: ");
                sb.append(j12);
                sb.append(", ");
                sb.append(j13);
                p.h("XingSeeker", sb.toString());
            }
        }
        return new i(j11, aVar2.f8876c, C0, E, jArr);
    }

    private long c(int i10) {
        return (this.f10719c * ((long) i10)) / 100;
    }

    public long a(long j10) {
        long j11;
        long j12 = j10 - this.f10717a;
        if (!f() || j12 <= ((long) this.f10718b)) {
            return 0;
        }
        long[] jArr = (long[]) a.h(this.f10722f);
        double d10 = (((double) j12) * 256.0d) / ((double) this.f10720d);
        int i10 = m0.i(jArr, (long) d10, true, true);
        long c10 = c(i10);
        long j13 = jArr[i10];
        int i11 = i10 + 1;
        long c11 = c(i11);
        if (i10 == 99) {
            j11 = 256;
        } else {
            j11 = jArr[i11];
        }
        return c10 + Math.round((j13 == j11 ? FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE : (d10 - ((double) j13)) / ((double) (j11 - j13))) * ((double) (c11 - c10)));
    }

    public long e() {
        return this.f10721e;
    }

    public boolean f() {
        return this.f10722f != null;
    }

    public y.a h(long j10) {
        double d10;
        if (!f()) {
            return new y.a(new z(0, this.f10717a + ((long) this.f10718b)));
        }
        long s10 = m0.s(j10, 0, this.f10719c);
        double d11 = (((double) s10) * 100.0d) / ((double) this.f10719c);
        double d12 = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        if (d11 > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            if (d11 >= 100.0d) {
                d12 = 256.0d;
            } else {
                int i10 = (int) d11;
                long[] jArr = (long[]) a.h(this.f10722f);
                double d13 = (double) jArr[i10];
                if (i10 == 99) {
                    d10 = 256.0d;
                } else {
                    d10 = (double) jArr[i10 + 1];
                }
                d12 = d13 + ((d11 - ((double) i10)) * (d10 - d13));
            }
        }
        return new y.a(new z(s10, this.f10717a + m0.s(Math.round((d12 / 256.0d) * ((double) this.f10720d)), (long) this.f10718b, this.f10720d - 1)));
    }

    public long i() {
        return this.f10719c;
    }

    private i(long j10, int i10, long j11, long j12, long[] jArr) {
        this.f10717a = j10;
        this.f10718b = i10;
        this.f10719c = j11;
        this.f10722f = jArr;
        this.f10720d = j12;
        this.f10721e = j12 != -1 ? j10 + j12 : -1;
    }
}
