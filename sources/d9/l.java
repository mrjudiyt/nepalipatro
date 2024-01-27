package d9;

import b9.c;
import b9.d;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.m;

/* compiled from: _Ranges.kt */
class l extends k {
    public static int a(int i10, int i11) {
        return i10 < i11 ? i11 : i10;
    }

    public static long b(long j10, long j11) {
        return j10 < j11 ? j11 : j10;
    }

    public static int c(int i10, int i11) {
        return i10 > i11 ? i11 : i10;
    }

    public static long d(long j10, long j11) {
        return j10 > j11 ? j11 : j10;
    }

    public static int e(int i10, int i11, int i12) {
        if (i11 > i12) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i12 + " is less than minimum " + i11 + '.');
        } else if (i10 < i11) {
            return i11;
        } else {
            return i10 > i12 ? i12 : i10;
        }
    }

    public static long f(long j10, long j11, long j12) {
        if (j11 > j12) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + j12 + " is less than minimum " + j11 + '.');
        } else if (j10 < j11) {
            return j11;
        } else {
            return j10 > j12 ? j12 : j10;
        }
    }

    public static d g(int i10, int i11) {
        return d.f14171k.a(i10, i11, -1);
    }

    public static int h(f fVar, c cVar) {
        m.f(fVar, "<this>");
        m.f(cVar, "random");
        try {
            return d.e(cVar, fVar);
        } catch (IllegalArgumentException e10) {
            throw new NoSuchElementException(e10.getMessage());
        }
    }

    public static f i(int i10, int i11) {
        if (i11 <= Integer.MIN_VALUE) {
            return f.f14179l.a();
        }
        return new f(i10, i11 - 1);
    }
}
