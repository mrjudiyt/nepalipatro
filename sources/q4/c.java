package q4;

import a6.m0;
import android.util.Pair;
import c5.k;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import k4.y;
import k4.z;

/* compiled from: MlltSeeker */
final class c implements g {

    /* renamed from: a  reason: collision with root package name */
    private final long[] f10688a;

    /* renamed from: b  reason: collision with root package name */
    private final long[] f10689b;

    /* renamed from: c  reason: collision with root package name */
    private final long f10690c;

    private c(long[] jArr, long[] jArr2, long j10) {
        this.f10688a = jArr;
        this.f10689b = jArr2;
        this.f10690c = j10 == -9223372036854775807L ? e4.c.d(jArr2[jArr2.length - 1]) : j10;
    }

    public static c b(long j10, k kVar, long j11) {
        int length = kVar.f5261l.length;
        int i10 = length + 1;
        long[] jArr = new long[i10];
        long[] jArr2 = new long[i10];
        jArr[0] = j10;
        long j12 = 0;
        jArr2[0] = 0;
        for (int i11 = 1; i11 <= length; i11++) {
            int i12 = i11 - 1;
            j10 += (long) (kVar.f5259j + kVar.f5261l[i12]);
            j12 += (long) (kVar.f5260k + kVar.f5262m[i12]);
            jArr[i11] = j10;
            jArr2[i11] = j12;
        }
        return new c(jArr, jArr2, j11);
    }

    private static Pair<Long, Long> c(long j10, long[] jArr, long[] jArr2) {
        int i10 = m0.i(jArr, j10, true, true);
        long j11 = jArr[i10];
        long j12 = jArr2[i10];
        int i11 = i10 + 1;
        if (i11 == jArr.length) {
            return Pair.create(Long.valueOf(j11), Long.valueOf(j12));
        }
        long j13 = jArr[i11];
        return Pair.create(Long.valueOf(j10), Long.valueOf(((long) ((j13 == j11 ? FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE : (((double) j10) - ((double) j11)) / ((double) (j13 - j11))) * ((double) (jArr2[i11] - j12)))) + j12));
    }

    public long a(long j10) {
        return e4.c.d(((Long) c(j10, this.f10688a, this.f10689b).second).longValue());
    }

    public long e() {
        return -1;
    }

    public boolean f() {
        return true;
    }

    public y.a h(long j10) {
        Pair<Long, Long> c10 = c(e4.c.e(m0.s(j10, 0, this.f10690c)), this.f10689b, this.f10688a);
        return new y.a(new z(e4.c.d(((Long) c10.first).longValue()), ((Long) c10.second).longValue()));
    }

    public long i() {
        return this.f10690c;
    }
}
